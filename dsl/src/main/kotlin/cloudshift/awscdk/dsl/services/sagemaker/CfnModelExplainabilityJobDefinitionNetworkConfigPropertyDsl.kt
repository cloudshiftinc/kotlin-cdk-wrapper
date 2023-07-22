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

  /**
   * @param enableInterContainerTrafficEncryption Whether to encrypt all communications between
   * distributed processing jobs.
   * Choose `True` to encrypt communications. Encryption provides greater security for distributed
   * processing jobs, but the processing might take longer.
   */
  public fun enableInterContainerTrafficEncryption(enableInterContainerTrafficEncryption: Boolean) {
    cdkBuilder.enableInterContainerTrafficEncryption(enableInterContainerTrafficEncryption)
  }

  /**
   * @param enableInterContainerTrafficEncryption Whether to encrypt all communications between
   * distributed processing jobs.
   * Choose `True` to encrypt communications. Encryption provides greater security for distributed
   * processing jobs, but the processing might take longer.
   */
  public
      fun enableInterContainerTrafficEncryption(enableInterContainerTrafficEncryption: IResolvable) {
    cdkBuilder.enableInterContainerTrafficEncryption(enableInterContainerTrafficEncryption)
  }

  /**
   * @param enableNetworkIsolation Whether to allow inbound and outbound network calls to and from
   * the containers used for the processing job.
   */
  public fun enableNetworkIsolation(enableNetworkIsolation: Boolean) {
    cdkBuilder.enableNetworkIsolation(enableNetworkIsolation)
  }

  /**
   * @param enableNetworkIsolation Whether to allow inbound and outbound network calls to and from
   * the containers used for the processing job.
   */
  public fun enableNetworkIsolation(enableNetworkIsolation: IResolvable) {
    cdkBuilder.enableNetworkIsolation(enableNetworkIsolation)
  }

  /**
   * @param vpcConfig Specifies a VPC that your training jobs and hosted models have access to.
   * Control access to and from your training and model containers by configuring the VPC.
   */
  public fun vpcConfig(vpcConfig: IResolvable) {
    cdkBuilder.vpcConfig(vpcConfig)
  }

  /**
   * @param vpcConfig Specifies a VPC that your training jobs and hosted models have access to.
   * Control access to and from your training and model containers by configuring the VPC.
   */
  public fun vpcConfig(vpcConfig: CfnModelExplainabilityJobDefinition.VpcConfigProperty) {
    cdkBuilder.vpcConfig(vpcConfig)
  }

  public fun build(): CfnModelExplainabilityJobDefinition.NetworkConfigProperty = cdkBuilder.build()
}
