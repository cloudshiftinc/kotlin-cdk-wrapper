@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.sagemaker

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.sagemaker.CfnModelExplainabilityJobDefinition

@CdkDslMarker
public class CfnModelExplainabilityJobDefinitionMonitoringOutputPropertyDsl {
  private val cdkBuilder: CfnModelExplainabilityJobDefinition.MonitoringOutputProperty.Builder =
      CfnModelExplainabilityJobDefinition.MonitoringOutputProperty.builder()

  public fun s3Output(s3Output: IResolvable) {
    cdkBuilder.s3Output(s3Output)
  }

  public fun s3Output(s3Output: CfnModelExplainabilityJobDefinition.S3OutputProperty) {
    cdkBuilder.s3Output(s3Output)
  }

  public fun build(): CfnModelExplainabilityJobDefinition.MonitoringOutputProperty =
      cdkBuilder.build()
}
