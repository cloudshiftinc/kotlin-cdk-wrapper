@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.kinesisanalyticsv2

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.kinesisanalyticsv2.CfnApplicationOutput

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
