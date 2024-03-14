package io.cloudshiftdev.awscdk.services.appmesh

import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName

public interface HealthCheckConfig {
  public fun virtualGatewayHealthCheck(): CfnVirtualGateway.VirtualGatewayHealthCheckPolicyProperty?
      =
      unwrap(this).getVirtualGatewayHealthCheck()?.let(CfnVirtualGateway.VirtualGatewayHealthCheckPolicyProperty::wrap)

  public fun virtualNodeHealthCheck(): CfnVirtualNode.HealthCheckProperty? =
      unwrap(this).getVirtualNodeHealthCheck()?.let(CfnVirtualNode.HealthCheckProperty::wrap)

  public interface Builder {
    public
        fun virtualGatewayHealthCheck(virtualGatewayHealthCheck: CfnVirtualGateway.VirtualGatewayHealthCheckPolicyProperty) {
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("5d2727c4abc0be2ab3184c7ee43a68ed3225d92e3f65f508da11122da666ab26")
    public
        fun virtualGatewayHealthCheck(virtualGatewayHealthCheck: CfnVirtualGateway.VirtualGatewayHealthCheckPolicyProperty.Builder.() -> Unit) {
    }

    public fun virtualNodeHealthCheck(virtualNodeHealthCheck: CfnVirtualNode.HealthCheckProperty) {
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("7075c05c4b9b75632e54ea94d7244864fd3d2863b4f2a408cac19135fed1d971")
    public
        fun virtualNodeHealthCheck(virtualNodeHealthCheck: CfnVirtualNode.HealthCheckProperty.Builder.() -> Unit) {
    }
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.appmesh.HealthCheckConfig.Builder =
        software.amazon.awscdk.services.appmesh.HealthCheckConfig.builder()

    public override
        fun virtualGatewayHealthCheck(virtualGatewayHealthCheck: CfnVirtualGateway.VirtualGatewayHealthCheckPolicyProperty) {
      cdkBuilder.virtualGatewayHealthCheck(virtualGatewayHealthCheck.let(CfnVirtualGateway.VirtualGatewayHealthCheckPolicyProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("5d2727c4abc0be2ab3184c7ee43a68ed3225d92e3f65f508da11122da666ab26")
    public override
        fun virtualGatewayHealthCheck(virtualGatewayHealthCheck: CfnVirtualGateway.VirtualGatewayHealthCheckPolicyProperty.Builder.() -> Unit):
        Unit =
        virtualGatewayHealthCheck(CfnVirtualGateway.VirtualGatewayHealthCheckPolicyProperty(virtualGatewayHealthCheck))

    public override
        fun virtualNodeHealthCheck(virtualNodeHealthCheck: CfnVirtualNode.HealthCheckProperty) {
      cdkBuilder.virtualNodeHealthCheck(virtualNodeHealthCheck.let(CfnVirtualNode.HealthCheckProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("7075c05c4b9b75632e54ea94d7244864fd3d2863b4f2a408cac19135fed1d971")
    public override
        fun virtualNodeHealthCheck(virtualNodeHealthCheck: CfnVirtualNode.HealthCheckProperty.Builder.() -> Unit):
        Unit = virtualNodeHealthCheck(CfnVirtualNode.HealthCheckProperty(virtualNodeHealthCheck))

    public fun build(): software.amazon.awscdk.services.appmesh.HealthCheckConfig =
        cdkBuilder.build()
  }

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.appmesh.HealthCheckConfig,
  ) : HealthCheckConfig {
    public override fun virtualGatewayHealthCheck():
        CfnVirtualGateway.VirtualGatewayHealthCheckPolicyProperty? =
        unwrap(this).getVirtualGatewayHealthCheck()?.let(CfnVirtualGateway.VirtualGatewayHealthCheckPolicyProperty::wrap)

    public override fun virtualNodeHealthCheck(): CfnVirtualNode.HealthCheckProperty? =
        unwrap(this).getVirtualNodeHealthCheck()?.let(CfnVirtualNode.HealthCheckProperty::wrap)
  }

  public companion object {
    init {

    }

    public operator fun invoke(block: Builder.() -> Unit = {}): HealthCheckConfig {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.appmesh.HealthCheckConfig):
        HealthCheckConfig = Wrapper(cdkObject)

    internal fun unwrap(wrapped: HealthCheckConfig):
        software.amazon.awscdk.services.appmesh.HealthCheckConfig = (wrapped as Wrapper).cdkObject
  }
}
