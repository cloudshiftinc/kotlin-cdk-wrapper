@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.eks

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Unit

/**
 * EKS node bootstrapping options.
 *
 * Example:
 *
 * ```
 * Cluster cluster;
 * cluster.addAutoScalingGroupCapacity("spot", AutoScalingGroupCapacityOptions.builder()
 * .instanceType(new InstanceType("t3.large"))
 * .minCapacity(2)
 * .bootstrapOptions(BootstrapOptions.builder()
 * .kubeletExtraArgs("--node-labels foo=bar,goo=far")
 * .awsApiRetryAttempts(5)
 * .build())
 * .build());
 * ```
 */
public interface BootstrapOptions {
  /**
   * Additional command line arguments to pass to the `/etc/eks/bootstrap.sh` command.
   *
   * Default: - none
   *
   * [Documentation](https://github.com/awslabs/amazon-eks-ami/blob/master/files/bootstrap.sh)
   */
  public fun additionalArgs(): String? = unwrap(this).getAdditionalArgs()

  /**
   * Number of retry attempts for AWS API call (DescribeCluster).
   *
   * Default: 3
   */
  public fun awsApiRetryAttempts(): Number? = unwrap(this).getAwsApiRetryAttempts()

  /**
   * Overrides the IP address to use for DNS queries within the cluster.
   *
   * Default: - 10.100.0.10 or 172.20.0.10 based on the IP
   * address of the primary interface.
   */
  public fun dnsClusterIp(): String? = unwrap(this).getDnsClusterIp()

  /**
   * The contents of the `/etc/docker/daemon.json` file. Useful if you want a custom config
   * differing from the default one in the EKS AMI.
   *
   * Default: - none
   */
  public fun dockerConfigJson(): String? = unwrap(this).getDockerConfigJson()

  /**
   * Restores the docker default bridge network.
   *
   * Default: false
   */
  public fun enableDockerBridge(): Boolean? = unwrap(this).getEnableDockerBridge()

  /**
   * Extra arguments to add to the kubelet. Useful for adding labels or taints.
   *
   * For example, `--node-labels foo=bar,goo=far`.
   *
   * Default: - none
   */
  public fun kubeletExtraArgs(): String? = unwrap(this).getKubeletExtraArgs()

  /**
   * Sets `--max-pods` for the kubelet based on the capacity of the EC2 instance.
   *
   * Default: true
   */
  public fun useMaxPods(): Boolean? = unwrap(this).getUseMaxPods()

  /**
   * A builder for [BootstrapOptions]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param additionalArgs Additional command line arguments to pass to the
     * `/etc/eks/bootstrap.sh` command.
     */
    public fun additionalArgs(additionalArgs: String)

    /**
     * @param awsApiRetryAttempts Number of retry attempts for AWS API call (DescribeCluster).
     */
    public fun awsApiRetryAttempts(awsApiRetryAttempts: Number)

    /**
     * @param dnsClusterIp Overrides the IP address to use for DNS queries within the cluster.
     */
    public fun dnsClusterIp(dnsClusterIp: String)

    /**
     * @param dockerConfigJson The contents of the `/etc/docker/daemon.json` file. Useful if you
     * want a custom config differing from the default one in the EKS AMI.
     */
    public fun dockerConfigJson(dockerConfigJson: String)

    /**
     * @param enableDockerBridge Restores the docker default bridge network.
     */
    public fun enableDockerBridge(enableDockerBridge: Boolean)

    /**
     * @param kubeletExtraArgs Extra arguments to add to the kubelet. Useful for adding labels or
     * taints.
     * For example, `--node-labels foo=bar,goo=far`.
     */
    public fun kubeletExtraArgs(kubeletExtraArgs: String)

    /**
     * @param useMaxPods Sets `--max-pods` for the kubelet based on the capacity of the EC2
     * instance.
     */
    public fun useMaxPods(useMaxPods: Boolean)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.eks.BootstrapOptions.Builder =
        software.amazon.awscdk.services.eks.BootstrapOptions.builder()

    /**
     * @param additionalArgs Additional command line arguments to pass to the
     * `/etc/eks/bootstrap.sh` command.
     */
    override fun additionalArgs(additionalArgs: String) {
      cdkBuilder.additionalArgs(additionalArgs)
    }

    /**
     * @param awsApiRetryAttempts Number of retry attempts for AWS API call (DescribeCluster).
     */
    override fun awsApiRetryAttempts(awsApiRetryAttempts: Number) {
      cdkBuilder.awsApiRetryAttempts(awsApiRetryAttempts)
    }

    /**
     * @param dnsClusterIp Overrides the IP address to use for DNS queries within the cluster.
     */
    override fun dnsClusterIp(dnsClusterIp: String) {
      cdkBuilder.dnsClusterIp(dnsClusterIp)
    }

    /**
     * @param dockerConfigJson The contents of the `/etc/docker/daemon.json` file. Useful if you
     * want a custom config differing from the default one in the EKS AMI.
     */
    override fun dockerConfigJson(dockerConfigJson: String) {
      cdkBuilder.dockerConfigJson(dockerConfigJson)
    }

    /**
     * @param enableDockerBridge Restores the docker default bridge network.
     */
    override fun enableDockerBridge(enableDockerBridge: Boolean) {
      cdkBuilder.enableDockerBridge(enableDockerBridge)
    }

    /**
     * @param kubeletExtraArgs Extra arguments to add to the kubelet. Useful for adding labels or
     * taints.
     * For example, `--node-labels foo=bar,goo=far`.
     */
    override fun kubeletExtraArgs(kubeletExtraArgs: String) {
      cdkBuilder.kubeletExtraArgs(kubeletExtraArgs)
    }

    /**
     * @param useMaxPods Sets `--max-pods` for the kubelet based on the capacity of the EC2
     * instance.
     */
    override fun useMaxPods(useMaxPods: Boolean) {
      cdkBuilder.useMaxPods(useMaxPods)
    }

    public fun build(): software.amazon.awscdk.services.eks.BootstrapOptions = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.eks.BootstrapOptions,
  ) : CdkObject(cdkObject), BootstrapOptions {
    /**
     * Additional command line arguments to pass to the `/etc/eks/bootstrap.sh` command.
     *
     * Default: - none
     *
     * [Documentation](https://github.com/awslabs/amazon-eks-ami/blob/master/files/bootstrap.sh)
     */
    override fun additionalArgs(): String? = unwrap(this).getAdditionalArgs()

    /**
     * Number of retry attempts for AWS API call (DescribeCluster).
     *
     * Default: 3
     */
    override fun awsApiRetryAttempts(): Number? = unwrap(this).getAwsApiRetryAttempts()

    /**
     * Overrides the IP address to use for DNS queries within the cluster.
     *
     * Default: - 10.100.0.10 or 172.20.0.10 based on the IP
     * address of the primary interface.
     */
    override fun dnsClusterIp(): String? = unwrap(this).getDnsClusterIp()

    /**
     * The contents of the `/etc/docker/daemon.json` file. Useful if you want a custom config
     * differing from the default one in the EKS AMI.
     *
     * Default: - none
     */
    override fun dockerConfigJson(): String? = unwrap(this).getDockerConfigJson()

    /**
     * Restores the docker default bridge network.
     *
     * Default: false
     */
    override fun enableDockerBridge(): Boolean? = unwrap(this).getEnableDockerBridge()

    /**
     * Extra arguments to add to the kubelet. Useful for adding labels or taints.
     *
     * For example, `--node-labels foo=bar,goo=far`.
     *
     * Default: - none
     */
    override fun kubeletExtraArgs(): String? = unwrap(this).getKubeletExtraArgs()

    /**
     * Sets `--max-pods` for the kubelet based on the capacity of the EC2 instance.
     *
     * Default: true
     */
    override fun useMaxPods(): Boolean? = unwrap(this).getUseMaxPods()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): BootstrapOptions {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.eks.BootstrapOptions):
        BootstrapOptions = CdkObjectWrappers.wrap(cdkObject) as? BootstrapOptions ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: BootstrapOptions):
        software.amazon.awscdk.services.eks.BootstrapOptions = (wrapped as CdkObject).cdkObject as
        software.amazon.awscdk.services.eks.BootstrapOptions
  }
}
