import org.apache.batik.transcoder.TranscoderInput
import org.apache.batik.transcoder.TranscoderOutput
import org.apache.batik.transcoder.image.PNGTranscoder

import java.io.ByteArrayInputStream
import java.io.ByteArrayOutputStream
import java.io.FileOutputStream

object BMP extends App {

  // Text to be converted to an image
  val text = "text to be converted"

  // Create an SVG for monochrome image
  val svgContent = s"""<svg xmlns="http://www.w3.org/2000/svg" width="64" height="16">
                      |  <rect width="64" height="16" fill="white"/>
                      |  <text x="4" y="12" font-family="Arial" font-size="12" fill="black">$text</text>
                      |</svg>""".stripMargin

  // Convert SVG to BMP using PNGTranscoder
  val transcoder = new PNGTranscoder
  val input = new TranscoderInput(new ByteArrayInputStream(svgContent.getBytes))
  val outputStream = new ByteArrayOutputStream
  val output = new TranscoderOutput(outputStream)
  transcoder.transcode(input, output)
  outputStream.close()

  // Save the BMP image
  val bmpFile = new FileOutputStream("monochrome_image.bmp")
  bmpFile.write(outputStream.toByteArray)
  bmpFile.close()

}