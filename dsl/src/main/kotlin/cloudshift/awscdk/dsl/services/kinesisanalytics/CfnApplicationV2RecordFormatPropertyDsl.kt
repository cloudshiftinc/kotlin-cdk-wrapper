@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.kinesisanalytics

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2

@CdkDslMarker
public class CfnApplicationV2RecordFormatPropertyDsl {
  private val cdkBuilder: CfnApplicationV2.RecordFormatProperty.Builder =
      CfnApplicationV2.RecordFormatProperty.builder()

  /**
   * @param mappingParameters When you configure application input at the time of creating or
   * updating an application, provides additional mapping information specific to the record format
   * (such as JSON, CSV, or record fields delimited by some delimiter) on the streaming source.
   */
  public fun mappingParameters(mappingParameters: IResolvable) {
    cdkBuilder.mappingParameters(mappingParameters)
  }

  /**
   * @param mappingParameters When you configure application input at the time of creating or
   * updating an application, provides additional mapping information specific to the record format
   * (such as JSON, CSV, or record fields delimited by some delimiter) on the streaming source.
   */
  public fun mappingParameters(mappingParameters: CfnApplicationV2.MappingParametersProperty) {
    cdkBuilder.mappingParameters(mappingParameters)
  }

  /**
   * @param recordFormatType The type of record format. 
   */
  public fun recordFormatType(recordFormatType: String) {
    cdkBuilder.recordFormatType(recordFormatType)
  }

  public fun build(): CfnApplicationV2.RecordFormatProperty = cdkBuilder.build()
}
