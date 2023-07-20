@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.eks

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import software.amazon.awscdk.services.eks.BootstrapOptions

@CdkDslMarker
public class BootstrapOptionsDsl {
  private val cdkBuilder: BootstrapOptions.Builder = BootstrapOptions.builder()

  public fun additionalArgs(additionalArgs: String) {
    cdkBuilder.additionalArgs(additionalArgs)
  }

  public fun awsApiRetryAttempts(awsApiRetryAttempts: Number) {
    cdkBuilder.awsApiRetryAttempts(awsApiRetryAttempts)
  }

  public fun dnsClusterIp(dnsClusterIp: String) {
    cdkBuilder.dnsClusterIp(dnsClusterIp)
  }

  public fun dockerConfigJson(dockerConfigJson: String) {
    cdkBuilder.dockerConfigJson(dockerConfigJson)
  }

  public fun enableDockerBridge(enableDockerBridge: Boolean) {
    cdkBuilder.enableDockerBridge(enableDockerBridge)
  }

  public fun kubeletExtraArgs(kubeletExtraArgs: String) {
    cdkBuilder.kubeletExtraArgs(kubeletExtraArgs)
  }

  public fun useMaxPods(useMaxPods: Boolean) {
    cdkBuilder.useMaxPods(useMaxPods)
  }

  public fun build(): BootstrapOptions = cdkBuilder.build()
}
