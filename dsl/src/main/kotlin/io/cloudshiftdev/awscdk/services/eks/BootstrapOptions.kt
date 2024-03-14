package io.cloudshiftdev.awscdk.services.eks

import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Unit

public interface BootstrapOptions {
  public fun additionalArgs(): String? = unwrap(this).getAdditionalArgs()

  public fun awsApiRetryAttempts(): Number? = unwrap(this).getAwsApiRetryAttempts()

  public fun dnsClusterIp(): String? = unwrap(this).getDnsClusterIp()

  public fun dockerConfigJson(): String? = unwrap(this).getDockerConfigJson()

  public fun enableDockerBridge(): Boolean? = unwrap(this).getEnableDockerBridge()

  public fun kubeletExtraArgs(): String? = unwrap(this).getKubeletExtraArgs()

  public fun useMaxPods(): Boolean? = unwrap(this).getUseMaxPods()

  public interface Builder {
    public fun additionalArgs(additionalArgs: String) {
    }

    public fun awsApiRetryAttempts(awsApiRetryAttempts: Number) {
    }

    public fun dnsClusterIp(dnsClusterIp: String) {
    }

    public fun dockerConfigJson(dockerConfigJson: String) {
    }

    public fun enableDockerBridge(enableDockerBridge: Boolean) {
    }

    public fun kubeletExtraArgs(kubeletExtraArgs: String) {
    }

    public fun useMaxPods(useMaxPods: Boolean) {
    }
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.eks.BootstrapOptions.Builder =
        software.amazon.awscdk.services.eks.BootstrapOptions.builder()

    public override fun additionalArgs(additionalArgs: String) {
      cdkBuilder.additionalArgs(additionalArgs)
    }

    public override fun awsApiRetryAttempts(awsApiRetryAttempts: Number) {
      cdkBuilder.awsApiRetryAttempts(awsApiRetryAttempts)
    }

    public override fun dnsClusterIp(dnsClusterIp: String) {
      cdkBuilder.dnsClusterIp(dnsClusterIp)
    }

    public override fun dockerConfigJson(dockerConfigJson: String) {
      cdkBuilder.dockerConfigJson(dockerConfigJson)
    }

    public override fun enableDockerBridge(enableDockerBridge: Boolean) {
      cdkBuilder.enableDockerBridge(enableDockerBridge)
    }

    public override fun kubeletExtraArgs(kubeletExtraArgs: String) {
      cdkBuilder.kubeletExtraArgs(kubeletExtraArgs)
    }

    public override fun useMaxPods(useMaxPods: Boolean) {
      cdkBuilder.useMaxPods(useMaxPods)
    }

    public fun build(): software.amazon.awscdk.services.eks.BootstrapOptions = cdkBuilder.build()
  }

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.eks.BootstrapOptions,
  ) : BootstrapOptions {
    public override fun additionalArgs(): String? = unwrap(this).getAdditionalArgs()

    public override fun awsApiRetryAttempts(): Number? = unwrap(this).getAwsApiRetryAttempts()

    public override fun dnsClusterIp(): String? = unwrap(this).getDnsClusterIp()

    public override fun dockerConfigJson(): String? = unwrap(this).getDockerConfigJson()

    public override fun enableDockerBridge(): Boolean? = unwrap(this).getEnableDockerBridge()

    public override fun kubeletExtraArgs(): String? = unwrap(this).getKubeletExtraArgs()

    public override fun useMaxPods(): Boolean? = unwrap(this).getUseMaxPods()
  }

  public companion object {
    init {

    }

    public operator fun invoke(block: Builder.() -> Unit = {}): BootstrapOptions {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.eks.BootstrapOptions):
        BootstrapOptions = Wrapper(cdkObject)

    internal fun unwrap(wrapped: BootstrapOptions):
        software.amazon.awscdk.services.eks.BootstrapOptions = (wrapped as Wrapper).cdkObject
  }
}
