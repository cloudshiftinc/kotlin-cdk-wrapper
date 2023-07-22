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

  /**
   * @param additionalArgs Additional command line arguments to pass to the `/etc/eks/bootstrap.sh`
   * command.
   */
  public fun additionalArgs(additionalArgs: String) {
    cdkBuilder.additionalArgs(additionalArgs)
  }

  /**
   * @param awsApiRetryAttempts Number of retry attempts for AWS API call (DescribeCluster).
   */
  public fun awsApiRetryAttempts(awsApiRetryAttempts: Number) {
    cdkBuilder.awsApiRetryAttempts(awsApiRetryAttempts)
  }

  /**
   * @param dnsClusterIp Overrides the IP address to use for DNS queries within the cluster.
   */
  public fun dnsClusterIp(dnsClusterIp: String) {
    cdkBuilder.dnsClusterIp(dnsClusterIp)
  }

  /**
   * @param dockerConfigJson The contents of the `/etc/docker/daemon.json` file. Useful if you want
   * a custom config differing from the default one in the EKS AMI.
   */
  public fun dockerConfigJson(dockerConfigJson: String) {
    cdkBuilder.dockerConfigJson(dockerConfigJson)
  }

  /**
   * @param enableDockerBridge Restores the docker default bridge network.
   */
  public fun enableDockerBridge(enableDockerBridge: Boolean) {
    cdkBuilder.enableDockerBridge(enableDockerBridge)
  }

  /**
   * @param kubeletExtraArgs Extra arguments to add to the kubelet. Useful for adding labels or
   * taints.
   * For example, `--node-labels foo=bar,goo=far`.
   */
  public fun kubeletExtraArgs(kubeletExtraArgs: String) {
    cdkBuilder.kubeletExtraArgs(kubeletExtraArgs)
  }

  /**
   * @param useMaxPods Sets `--max-pods` for the kubelet based on the capacity of the EC2 instance.
   */
  public fun useMaxPods(useMaxPods: Boolean) {
    cdkBuilder.useMaxPods(useMaxPods)
  }

  public fun build(): BootstrapOptions = cdkBuilder.build()
}
