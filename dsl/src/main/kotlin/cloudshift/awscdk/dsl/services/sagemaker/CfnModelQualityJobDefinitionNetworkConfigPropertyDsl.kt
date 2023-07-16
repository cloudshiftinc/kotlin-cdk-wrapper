@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.sagemaker

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.sagemaker.CfnModelQualityJobDefinition

@CdkDslMarker
public class CfnModelQualityJobDefinitionNetworkConfigPropertyDsl {
  private val cdkBuilder: CfnModelQualityJobDefinition.NetworkConfigProperty.Builder =
      CfnModelQualityJobDefinition.NetworkConfigProperty.builder()

  public fun enableInterContainerTrafficEncryption(enableInterContainerTrafficEncryption: Boolean) {
    cdkBuilder.enableInterContainerTrafficEncryption(enableInterContainerTrafficEncryption)
  }

  public
      fun enableInterContainerTrafficEncryption(enableInterContainerTrafficEncryption: IResolvable) {
    cdkBuilder.enableInterContainerTrafficEncryption(enableInterContainerTrafficEncryption)
  }

  public fun enableNetworkIsolation(enableNetworkIsolation: Boolean) {
    cdkBuilder.enableNetworkIsolation(enableNetworkIsolation)
  }

  public fun enableNetworkIsolation(enableNetworkIsolation: IResolvable) {
    cdkBuilder.enableNetworkIsolation(enableNetworkIsolation)
  }

  public fun vpcConfig(vpcConfig: IResolvable) {
    cdkBuilder.vpcConfig(vpcConfig)
  }

  public fun vpcConfig(vpcConfig: CfnModelQualityJobDefinition.VpcConfigProperty) {
    cdkBuilder.vpcConfig(vpcConfig)
  }

  public fun build(): CfnModelQualityJobDefinition.NetworkConfigProperty = cdkBuilder.build()
}
