@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.kinesisanalyticsv2

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.kinesisanalyticsv2.CfnApplicationOutput

/**
 * Describes the data format when records are written to the destination in a SQL-based Kinesis Data
 * Analytics application.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.kinesisanalyticsv2.*;
 * DestinationSchemaProperty destinationSchemaProperty = DestinationSchemaProperty.builder()
 * .recordFormatType("recordFormatType")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-applicationoutput-destinationschema.html)
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
