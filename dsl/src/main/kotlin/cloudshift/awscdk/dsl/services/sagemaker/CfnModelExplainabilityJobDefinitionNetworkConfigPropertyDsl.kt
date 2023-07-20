@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.sagemaker

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.sagemaker.CfnModelExplainabilityJobDefinition

@CdkDslMarker
public class CfnModelExplainabilityJobDefinitionNetworkConfigPropertyDsl {
  private val cdkBuilder: CfnModelExplainabilityJobDefinition.NetworkConfigProperty.Builder =
      CfnModelExplainabilityJobDefinition.NetworkConfigProperty.builder()

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

  public fun vpcConfig(vpcConfig: CfnModelExplainabilityJobDefinition.VpcConfigProperty) {
    cdkBuilder.vpcConfig(vpcConfig)
  }

  public fun build(): CfnModelExplainabilityJobDefinition.NetworkConfigProperty = cdkBuilder.build()
}
