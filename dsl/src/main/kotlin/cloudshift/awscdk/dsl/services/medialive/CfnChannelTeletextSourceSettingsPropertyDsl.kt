@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.medialive

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.medialive.CfnChannel

@CdkDslMarker
public class CfnChannelTeletextSourceSettingsPropertyDsl {
  private val cdkBuilder: CfnChannel.TeletextSourceSettingsProperty.Builder =
      CfnChannel.TeletextSourceSettingsProperty.builder()

  /**
   * @param outputRectangle Settings to configure the caption rectangle for an output captions that
   * will be created using this Teletext source captions.
   */
  public fun outputRectangle(outputRectangle: IResolvable) {
    cdkBuilder.outputRectangle(outputRectangle)
  }

  /**
   * @param outputRectangle Settings to configure the caption rectangle for an output captions that
   * will be created using this Teletext source captions.
   */
  public fun outputRectangle(outputRectangle: CfnChannel.CaptionRectangleProperty) {
    cdkBuilder.outputRectangle(outputRectangle)
  }

  /**
   * @param pageNumber Specifies the Teletext page number within the data stream from which to
   * extract captions.
   * The range is 0x100 (256) to 0x8FF (2303). This is unused for passthrough. It should be
   * specified as a hexadecimal string with no "0x" prefix.
   */
  public fun pageNumber(pageNumber: String) {
    cdkBuilder.pageNumber(pageNumber)
  }

  public fun build(): CfnChannel.TeletextSourceSettingsProperty = cdkBuilder.build()
}
