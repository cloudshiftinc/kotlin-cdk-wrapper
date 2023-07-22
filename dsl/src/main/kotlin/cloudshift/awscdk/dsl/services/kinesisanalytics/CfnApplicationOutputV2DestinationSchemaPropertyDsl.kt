@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.kinesisanalytics

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.kinesisanalytics.CfnApplicationOutputV2

@CdkDslMarker
public class CfnApplicationOutputV2DestinationSchemaPropertyDsl {
  private val cdkBuilder: CfnApplicationOutputV2.DestinationSchemaProperty.Builder =
      CfnApplicationOutputV2.DestinationSchemaProperty.builder()

  /**
   * @param recordFormatType Specifies the format of the records on the output stream.
   */
  public fun recordFormatType(recordFormatType: String) {
    cdkBuilder.recordFormatType(recordFormatType)
  }

  public fun build(): CfnApplicationOutputV2.DestinationSchemaProperty = cdkBuilder.build()
}
