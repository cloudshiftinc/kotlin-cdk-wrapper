@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.kinesisanalytics

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.kinesisanalytics.CfnApplicationOutput

/**
 * Describes the data format when records are written to the destination.
 *
 * For more information, see [Configuring Application
 * Output](https://docs.aws.amazon.com/kinesisanalytics/latest/dev/how-it-works-output.html) .
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.kinesisanalytics.*;
 * DestinationSchemaProperty destinationSchemaProperty = DestinationSchemaProperty.builder()
 * .recordFormatType("recordFormatType")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalytics-applicationoutput-destinationschema.html)
 */
@CdkDslMarker
public class CfnApplicationOutputDestinationSchemaPropertyDsl {
  private val cdkBuilder: CfnApplicationOutput.DestinationSchemaProperty.Builder =
      CfnApplicationOutput.DestinationSchemaProperty.builder()

  /**
   * @param recordFormatType Specifies the format of the records on the output stream.
   */
  public fun recordFormatType(recordFormatType: String) {
    cdkBuilder.recordFormatType(recordFormatType)
  }

  public fun build(): CfnApplicationOutput.DestinationSchemaProperty = cdkBuilder.build()
}
