@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.kinesisanalyticsv2

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.kinesisanalyticsv2.CfnApplication

@CdkDslMarker
public class CfnApplicationMappingParametersPropertyDsl {
  private val cdkBuilder: CfnApplication.MappingParametersProperty.Builder =
      CfnApplication.MappingParametersProperty.builder()

  public fun csvMappingParameters(csvMappingParameters: IResolvable) {
    cdkBuilder.csvMappingParameters(csvMappingParameters)
  }

  public
      fun csvMappingParameters(csvMappingParameters: CfnApplication.CSVMappingParametersProperty) {
    cdkBuilder.csvMappingParameters(csvMappingParameters)
  }

  public fun jsonMappingParameters(jsonMappingParameters: IResolvable) {
    cdkBuilder.jsonMappingParameters(jsonMappingParameters)
  }

  public
      fun jsonMappingParameters(jsonMappingParameters: CfnApplication.JSONMappingParametersProperty) {
    cdkBuilder.jsonMappingParameters(jsonMappingParameters)
  }

  public fun build(): CfnApplication.MappingParametersProperty = cdkBuilder.build()
}
