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

  public fun mappingParameters(mappingParameters: IResolvable) {
    cdkBuilder.mappingParameters(mappingParameters)
  }

  public fun mappingParameters(mappingParameters: CfnApplicationV2.MappingParametersProperty) {
    cdkBuilder.mappingParameters(mappingParameters)
  }

  public fun recordFormatType(recordFormatType: String) {
    cdkBuilder.recordFormatType(recordFormatType)
  }

  public fun build(): CfnApplicationV2.RecordFormatProperty = cdkBuilder.build()
}
