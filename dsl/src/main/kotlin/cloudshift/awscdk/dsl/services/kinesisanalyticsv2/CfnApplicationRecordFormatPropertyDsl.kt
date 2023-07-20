@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.kinesisanalyticsv2

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.kinesisanalyticsv2.CfnApplication

@CdkDslMarker
public class CfnApplicationRecordFormatPropertyDsl {
  private val cdkBuilder: CfnApplication.RecordFormatProperty.Builder =
      CfnApplication.RecordFormatProperty.builder()

  public fun mappingParameters(mappingParameters: IResolvable) {
    cdkBuilder.mappingParameters(mappingParameters)
  }

  public fun mappingParameters(mappingParameters: CfnApplication.MappingParametersProperty) {
    cdkBuilder.mappingParameters(mappingParameters)
  }

  public fun recordFormatType(recordFormatType: String) {
    cdkBuilder.recordFormatType(recordFormatType)
  }

  public fun build(): CfnApplication.RecordFormatProperty = cdkBuilder.build()
}
