@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.sagemaker

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.sagemaker.CfnApp

@CdkDslMarker
public class CfnAppResourceSpecPropertyDsl {
  private val cdkBuilder: CfnApp.ResourceSpecProperty.Builder =
      CfnApp.ResourceSpecProperty.builder()

  /**
   * @param instanceType The instance type that the image version runs on.
   *
   * *JupyterServer apps* only support the `system` value.
   *
   * For *KernelGateway apps* , the `system` value is translated to `ml.t3.medium` . KernelGateway
   * apps also support all other values for available instance types.
   */
  public fun instanceType(instanceType: String) {
    cdkBuilder.instanceType(instanceType)
  }

  /**
   * @param sageMakerImageArn The ARN of the SageMaker image that the image version belongs to.
   */
  public fun sageMakerImageArn(sageMakerImageArn: String) {
    cdkBuilder.sageMakerImageArn(sageMakerImageArn)
  }

  /**
   * @param sageMakerImageVersionArn The ARN of the image version created on the instance.
   */
  public fun sageMakerImageVersionArn(sageMakerImageVersionArn: String) {
    cdkBuilder.sageMakerImageVersionArn(sageMakerImageVersionArn)
  }

  public fun build(): CfnApp.ResourceSpecProperty = cdkBuilder.build()
}
