public class PatternName {
    public static void main(String[] args) {
        String name = "ANIRUDH SINGH";
        int rows = 7; // Height of the letters
        int cols = name.length() * 8; // Width for each character plus one gap

        char[][] pattern = new char[rows][cols];

        // Initialize the pattern with spaces
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                pattern[i][j] = ' ';
            }
        }

        // Function to place a letter pattern in the 2D array
        int offsetX = 0;
        for (char ch : name.toCharArray()) {
            placeLetterPattern(pattern, ch, offsetX);
            offsetX += 8; // Assuming each character takes 7 columns width plus 1 column gap
        }

        // Print the pattern
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(pattern[i][j]);
            }
            System.out.println();
        }
    }

    // Function to place individual letter patterns
    private static void placeLetterPattern(char[][] pattern, char ch, int offsetX) {
        switch (ch) {
            case 'A':
                pattern[0][offsetX + 2] = '*'; pattern[0][offsetX + 3] = '*';
                pattern[1][offsetX + 1] = '*'; pattern[1][offsetX + 4] = '*';
                pattern[2][offsetX] = '*'; pattern[2][offsetX + 5] = '*';
                pattern[3][offsetX] = '*'; pattern[3][offsetX + 6] = '*';
                pattern[4][offsetX] = '*'; pattern[4][offsetX + 6] = '*';
                pattern[5][offsetX] = '*'; pattern[5][offsetX + 6] = '*';
                pattern[6][offsetX] = '*'; pattern[6][offsetX + 3] = '*'; pattern[6][offsetX + 6] = '*';
                break;
            case 'N':
                for (int i = 0; i < 7; i++) {
                    pattern[i][offsetX] = '*';
                    pattern[i][offsetX + 6] = '*';
                }
                for (int i = 0; i < 7; i++) {
                    pattern[i][offsetX + i] = '*';
                }
                break;
            case 'I':
                for (int i = 0; i < 7; i++) {
                    pattern[i][offsetX + 3] = '*';
                }
                break;
            case 'R':
                for (int i = 0; i < 7; i++) {
                    pattern[i][offsetX] = '*';
                }
                pattern[0][offsetX + 1] = '*'; pattern[0][offsetX + 2] = '*';
                pattern[0][offsetX + 3] = '*'; pattern[0][offsetX + 4] = '*';
                pattern[1][offsetX + 5] = '*';
                pattern[2][offsetX + 5] = '*';
                pattern[3][offsetX + 4] = '*'; pattern[3][offsetX + 3] = '*';
                pattern[4][offsetX + 2] = '*';
                pattern[5][offsetX + 3] = '*';
                pattern[6][offsetX + 4] = '*';
                break;
            case 'U':
                for (int i = 0; i < 6; i++) {
                    pattern[i][offsetX] = '*';
                    pattern[i][offsetX + 6] = '*';
                }
                pattern[6][offsetX + 1] = '*'; pattern[6][offsetX + 2] = '*';
                pattern[6][offsetX + 3] = '*'; pattern[6][offsetX + 4] = '*';
                pattern[6][offsetX + 5] = '*';
                break;
            case 'D':
                for (int i = 0; i < 7; i++) {
                    pattern[i][offsetX] = '*';
                }
                pattern[0][offsetX + 1] = '*'; pattern[0][offsetX + 2] = '*';
                pattern[0][offsetX + 3] = '*'; pattern[0][offsetX + 4] = '*';
                pattern[1][offsetX + 5] = '*';
                pattern[2][offsetX + 5] = '*';
                pattern[3][offsetX + 5] = '*';
                pattern[4][offsetX + 5] = '*';
                pattern[5][offsetX + 4] = '*';
                pattern[6][offsetX + 1] = '*'; pattern[6][offsetX + 2] = '*';
                pattern[6][offsetX + 3] = '*';
                break;
            case 'H':
                for (int i = 0; i < 7; i++) {
                    pattern[i][offsetX] = '*';
                    pattern[i][offsetX + 6] = '*';
                }
                for (int i = 0; i < 7; i++) {
                    pattern[3][offsetX + i] = '*';
                }
                break;
            case 'S':
                for (int i = 0; i < 7; i++) {
                    if (i == 0 || i == 3 || i == 6) {
                        for (int j = 0; j < 7; j++) {
                            pattern[i][offsetX + j] = '*';
                        }
                    } else if (i < 3) {
                        pattern[i][offsetX] = '*';
                    } else {
                        pattern[i][offsetX + 6] = '*';
                    }
                }
                break;
            case 'G':
                for (int i = 0; i < 7; i++) {
                    if (i == 0 || i == 6) {
                        for (int j = 1; j < 7; j++) {
                            pattern[i][offsetX + j] = '*';
                        }
                    } else if (i == 3) {
                        for (int j = 2; j < 7; j++) {
                            pattern[i][offsetX + j] = '*';
                        }
                    } else if (i > 3) {
                        pattern[i][offsetX + 6] = '*';
                    } else {
                        pattern[i][offsetX] = '*';
                    }
                }
                pattern[5][offsetX + 5] = '*';
                break;
            case ' ':
                break; // Handle space character
        }
    }
}
