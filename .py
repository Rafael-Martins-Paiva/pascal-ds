# File: clean_java_files.py

import os
import re
import sys

def remove_java_comments(text):
    """Removes single-line and multi-line comments from Java code."""
    # Remove multi-line comments /* ... */ (non-greedy)
    text = re.sub(r'/\*.*?\*/', '', text, flags=re.DOTALL)
    # Remove single-line comments // ...
    text = re.sub(r'//.*?$', '', text, flags=re.MULTILINE)
    # Optional: Remove blank lines that might result from comment removal
    # This is basic; might remove intentional blank lines too.
    # text = re.sub(r'^\s*\n', '', text, flags=re.MULTILINE)
    return text.strip() # Remove leading/trailing whitespace from the whole file

def find_public_type_name(text):
    """Finds the name of the first public class or interface declaration."""
    # Regex to find "public class ClassName" or "public interface InterfaceName"
    # Accounts for potential modifiers like abstract, final before class/interface
    # Captures the class/interface name (must be a valid Java identifier)
    match = re.search(
        r'^\s*public\s+(?:final\s+|abstract\s+)?(?:class|interface)\s+([A-Za-z_][A-Za-z0-9_]*)',
        text,
        flags=re.MULTILINE
    )
    if match:
        return match.group(1) # Return the captured name
    return None

def process_java_file(filepath):
    """Cleans comments and renames a single Java file if necessary."""
    current_basename = os.path.basename(filepath)
    print(f"--- Processing: {current_basename} ---")

    try:
        # Read original content first to find the class name reliably
        with open(filepath, 'r', encoding='utf-8') as f:
            original_content = f.read()

        # Clean the comments
        cleaned_content = remove_java_comments(original_content)

        # Find the expected name based on the public type
        expected_name = find_public_type_name(original_content)

        if not expected_name:
            print(f"INFO: No public class/interface found in {current_basename}. Comments removed, but file not renamed.")
            # Overwrite the original file with cleaned content even if no rename
            with open(filepath, 'w', encoding='utf-8') as f:
                f.write(cleaned_content)
            return

        # Determine the correct filename
        correct_filename = expected_name + ".java"
        dir_path = os.path.dirname(filepath)
        correct_filepath = os.path.join(dir_path, correct_filename)

        # Write the cleaned content first
        # Decide whether to write to original or potentially new path
        write_path = filepath # Default: write to original path

        # Check if renaming is needed
        if current_basename != correct_filename:
            print(f"INFO: Mismatch found. Current: '{current_basename}', Expected: '{correct_filename}'")
            # Check if the target filename already exists (and isn't the current file)
            if os.path.exists(correct_filepath):
                 print(f"ERROR: Cannot rename to '{correct_filename}'. File already exists. Skipping rename for {current_basename}.")
                 # Still write cleaned content to the original file? Yes.
                 with open(filepath, 'w', encoding='utf-8') as f:
                     f.write(cleaned_content)
                     print(f"INFO: Comments removed in '{current_basename}' (rename skipped).")
                 return # Skip renaming attempt
            else:
                # It's safe to rename, we'll write and then rename
                pass
        else:
             print(f"INFO: Filename '{current_basename}' is correct. Only removing comments.")


        # Write the cleaned content to the original file path
        # (We'll rename the file afterwards if needed)
        with open(filepath, 'w', encoding='utf-8') as f:
            f.write(cleaned_content)
        print(f"INFO: Comments removed and content updated in '{current_basename}'.")


        # Perform rename if needed *after* writing content is successful
        if current_basename != correct_filename:
             try:
                 os.rename(filepath, correct_filepath)
                 print(f"SUCCESS: Renamed '{current_basename}' to '{correct_filename}'")
             except OSError as e:
                 print(f"ERROR: Failed to rename '{current_basename}' to '{correct_filename}': {e}")


    except FileNotFoundError:
        print(f"ERROR: File not found: {filepath}")
    except Exception as e:
        print(f"ERROR: Failed to process {current_basename}: {e}")
        import traceback
        traceback.print_exc() # Print detailed error traceback

# --- Main Execution ---
if __name__ == "__main__":
    if len(sys.argv) != 2:
        print("Usage: python clean_java_files.py <directory_path>")
        sys.exit(1)

    target_dir = sys.argv[1]

    if not os.path.isdir(target_dir):
        print(f"Error: Directory not found: {target_dir}")
        sys.exit(1)

    print(f"Starting Java file cleanup in directory: {target_dir}")

    file_count = 0
    for filename in os.listdir(target_dir):
        if filename.lower().endswith(".java"):
            file_path = os.path.join(target_dir, filename)
            if os.path.isfile(file_path):
                process_java_file(file_path)
                file_count += 1

    if file_count == 0:
        print("\nNo .java files found in the specified directory.")
    else:
        print(f"\nCleanup process finished. Processed {file_count} .java files.")
