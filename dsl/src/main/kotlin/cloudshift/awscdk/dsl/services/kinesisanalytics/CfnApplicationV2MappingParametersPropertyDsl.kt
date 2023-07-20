@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.kinesisanalytics

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2

@CdkDslMarker
public class CfnApplicationV2MappingParametersPropertyDsl {
  private val cdkBuilder: CfnApplicationV2.MappingParametersProperty.Builder =
      CfnApplicationV2.MappingParametersProperty.builder()

  public fun csvMappingParameters(csvMappingParameters: IResolvable) {
    cdkBuilder.csvMappingParameters(csvMappingParameters)
  }

  public
      fun csvMappingParameters(csvMappingParameters: CfnApplicationV2.CSVMappingParametersProperty) {
    cdkBuilder.csvMappingParameters(csvMappingParameters)
  }

  public fun jsonMappingParameters(jsonMappingParameters: IResolvable) {
    cdkBuilder.jsonMappingParameters(jsonMappingParameters)
  }

  public
      fun jsonMappingParameters(jsonMappingParameters: CfnApplicationV2.JSONMappingParametersProperty) {
    cdkBuilder.jsonMappingParameters(jsonMappingParameters)
  }

  public fun build(): CfnApplicationV2.MappingParametersProperty = cdkBuilder.build()
}
