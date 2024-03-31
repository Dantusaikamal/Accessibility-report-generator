import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class AccessibilityReport {

    private static final String HTML_REPORT_TEMPLATE = 
            "<html>" +
                "<head>" +
                    "<title>Accessibility Report</title>" +
                    // Include some styles or links to stylesheets here
                "</head>" +
                "<body>" +
                    "<h1>Accessibility Violations</h1>" +
                    "<div>%s</div>" + // Placeholder for violations
                "</body>" +
            "</html>";

    public void generateHtmlReport(List<String> violations) throws IOException {
        StringBuilder violationsBuilder = new StringBuilder("<ul>");

        for (String violation : violations) {
            violationsBuilder.append("<li>").append(violation).append("</li>");
        }
        violationsBuilder.append("</ul>");

        String reportContent = String.format(HTML_REPORT_TEMPLATE, violationsBuilder.toString());

        // Now write the content to an HTML file
        String outputFilePath = "C:\\Users\\dantu\\OneDrive\\Desktop\\report-generator"; 
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(outputFilePath))) {
            writer.write(reportContent);
        }
    }
}
