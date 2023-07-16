@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.sagemaker

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import software.amazon.awscdk.services.sagemaker.CfnModelExplainabilityJobDefinition

@CdkDslMarker
public class CfnModelExplainabilityJobDefinitionClusterConfigPropertyDsl {
  private val cdkBuilder: CfnModelExplainabilityJobDefinition.ClusterConfigProperty.Builder =
      CfnModelExplainabilityJobDefinition.ClusterConfigProperty.builder()

  public fun instanceCount(instanceCount: Number) {
    cdkBuilder.instanceCount(instanceCount)
  }

  public fun instanceType(instanceType: String) {
    cdkBuilder.instanceType(instanceType)
  }

  public fun volumeKmsKeyId(volumeKmsKeyId: String) {
    cdkBuilder.volumeKmsKeyId(volumeKmsKeyId)
  }

  public fun volumeSizeInGb(volumeSizeInGb: Number) {
    cdkBuilder.volumeSizeInGb(volumeSizeInGb)
  }

  public fun build(): CfnModelExplainabilityJobDefinition.ClusterConfigProperty = cdkBuilder.build()
}
