@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.sagemaker

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.sagemaker.CfnModelBiasJobDefinition

@CdkDslMarker
public class CfnModelBiasJobDefinitionMonitoringOutputPropertyDsl {
  private val cdkBuilder: CfnModelBiasJobDefinition.MonitoringOutputProperty.Builder =
      CfnModelBiasJobDefinition.MonitoringOutputProperty.builder()

  public fun s3Output(s3Output: IResolvable) {
    cdkBuilder.s3Output(s3Output)
  }

  public fun s3Output(s3Output: CfnModelBiasJobDefinition.S3OutputProperty) {
    cdkBuilder.s3Output(s3Output)
  }

  public fun build(): CfnModelBiasJobDefinition.MonitoringOutputProperty = cdkBuilder.build()
}
