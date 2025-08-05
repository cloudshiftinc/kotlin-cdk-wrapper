@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.cloudassembly.schema

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmName

public interface MissingContext {
  public fun key(): String

  public fun props(): Any

  public fun provider(): ContextProvider

  @CdkDslMarker
  public interface Builder {
    public fun key(key: String)

    public fun props(props: AmiContextQuery)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("e9f8b3d899c475c0bb392580f6291c1c066e10177afe420e8e948ae93a3c01e9")
    public fun props(props: AmiContextQuery.Builder.() -> Unit)

    public fun props(props: AvailabilityZonesContextQuery)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("ba984ab3bd4b846764d704a615b057e505efc8f2dca2e73294e61b470371f143")
    public fun props(props: AvailabilityZonesContextQuery.Builder.() -> Unit)

    public fun props(props: HostedZoneContextQuery)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("f35eb1641577c54fc75172874c966e346effe20c11655f5a9410cffe70e4d05b")
    public fun props(props: HostedZoneContextQuery.Builder.() -> Unit)

    public fun props(props: SSMParameterContextQuery)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("fcee8db55454c5bc417f5e375ead71e3565eeff7df5fc5777bb105b88191a653")
    public fun props(props: SSMParameterContextQuery.Builder.() -> Unit)

    public fun props(props: VpcContextQuery)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("b9f2f0e0346c9bc8fa511fb6963add00d9d76e0d11c679f2cb8ad618b4e36e16")
    public fun props(props: VpcContextQuery.Builder.() -> Unit)

    public fun props(props: EndpointServiceAvailabilityZonesContextQuery)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("7471e9a800f8e2fae024f840cf075b65fa2284e34348669322dc276c855bc1b2")
    public fun props(props: EndpointServiceAvailabilityZonesContextQuery.Builder.() -> Unit)

    public fun props(props: LoadBalancerContextQuery)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("a1b7536058557f29d064b4014be9b3f5ef337b1b5a7480b16fc3ac33572cc0ef")
    public fun props(props: LoadBalancerContextQuery.Builder.() -> Unit)

    public fun props(props: LoadBalancerListenerContextQuery)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("fe110973725cb41b3d31910beb3fe1da88d59ce9b7f1dd89a297732491ad5896")
    public fun props(props: LoadBalancerListenerContextQuery.Builder.() -> Unit)

    public fun props(props: SecurityGroupContextQuery)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("11dc672e44129fba782aa2c20996cd62cd66c422a6537b9cde8431a95f8e5ffc")
    public fun props(props: SecurityGroupContextQuery.Builder.() -> Unit)

    public fun props(props: KeyContextQuery)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("7831cee57bf9fe073313dae582685932a01a35846484abcaaace6b15502d4fc4")
    public fun props(props: KeyContextQuery.Builder.() -> Unit)

    public fun props(props: CcApiContextQuery)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("62f80640dc2188021b22563fa7667a85e436fe826cb8bd78d45f278396b706eb")
    public fun props(props: CcApiContextQuery.Builder.() -> Unit)

    public fun props(props: PluginContextQuery)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("86bc6fa08f8cd1bfbdb4df757ffba40c111145bb3895924bd52a58d7b1c1fb7c")
    public fun props(props: PluginContextQuery.Builder.() -> Unit)

    public fun provider(provider: ContextProvider)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.cloudassembly.schema.MissingContext.Builder =
        software.amazon.awscdk.cloudassembly.schema.MissingContext.builder()

    override fun key(key: String) {
      cdkBuilder.key(key)
    }

    override fun props(props: AmiContextQuery) {
      cdkBuilder.props(props.let(AmiContextQuery.Companion::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("e9f8b3d899c475c0bb392580f6291c1c066e10177afe420e8e948ae93a3c01e9")
    override fun props(props: AmiContextQuery.Builder.() -> Unit): Unit =
        props(AmiContextQuery(props))

    override fun props(props: AvailabilityZonesContextQuery) {
      cdkBuilder.props(props.let(AvailabilityZonesContextQuery.Companion::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("ba984ab3bd4b846764d704a615b057e505efc8f2dca2e73294e61b470371f143")
    override fun props(props: AvailabilityZonesContextQuery.Builder.() -> Unit): Unit =
        props(AvailabilityZonesContextQuery(props))

    override fun props(props: HostedZoneContextQuery) {
      cdkBuilder.props(props.let(HostedZoneContextQuery.Companion::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("f35eb1641577c54fc75172874c966e346effe20c11655f5a9410cffe70e4d05b")
    override fun props(props: HostedZoneContextQuery.Builder.() -> Unit): Unit =
        props(HostedZoneContextQuery(props))

    override fun props(props: SSMParameterContextQuery) {
      cdkBuilder.props(props.let(SSMParameterContextQuery.Companion::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("fcee8db55454c5bc417f5e375ead71e3565eeff7df5fc5777bb105b88191a653")
    override fun props(props: SSMParameterContextQuery.Builder.() -> Unit): Unit =
        props(SSMParameterContextQuery(props))

    override fun props(props: VpcContextQuery) {
      cdkBuilder.props(props.let(VpcContextQuery.Companion::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("b9f2f0e0346c9bc8fa511fb6963add00d9d76e0d11c679f2cb8ad618b4e36e16")
    override fun props(props: VpcContextQuery.Builder.() -> Unit): Unit =
        props(VpcContextQuery(props))

    override fun props(props: EndpointServiceAvailabilityZonesContextQuery) {
      cdkBuilder.props(props.let(EndpointServiceAvailabilityZonesContextQuery.Companion::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("7471e9a800f8e2fae024f840cf075b65fa2284e34348669322dc276c855bc1b2")
    override fun props(props: EndpointServiceAvailabilityZonesContextQuery.Builder.() -> Unit): Unit
        = props(EndpointServiceAvailabilityZonesContextQuery(props))

    override fun props(props: LoadBalancerContextQuery) {
      cdkBuilder.props(props.let(LoadBalancerContextQuery.Companion::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("a1b7536058557f29d064b4014be9b3f5ef337b1b5a7480b16fc3ac33572cc0ef")
    override fun props(props: LoadBalancerContextQuery.Builder.() -> Unit): Unit =
        props(LoadBalancerContextQuery(props))

    override fun props(props: LoadBalancerListenerContextQuery) {
      cdkBuilder.props(props.let(LoadBalancerListenerContextQuery.Companion::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("fe110973725cb41b3d31910beb3fe1da88d59ce9b7f1dd89a297732491ad5896")
    override fun props(props: LoadBalancerListenerContextQuery.Builder.() -> Unit): Unit =
        props(LoadBalancerListenerContextQuery(props))

    override fun props(props: SecurityGroupContextQuery) {
      cdkBuilder.props(props.let(SecurityGroupContextQuery.Companion::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("11dc672e44129fba782aa2c20996cd62cd66c422a6537b9cde8431a95f8e5ffc")
    override fun props(props: SecurityGroupContextQuery.Builder.() -> Unit): Unit =
        props(SecurityGroupContextQuery(props))

    override fun props(props: KeyContextQuery) {
      cdkBuilder.props(props.let(KeyContextQuery.Companion::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("7831cee57bf9fe073313dae582685932a01a35846484abcaaace6b15502d4fc4")
    override fun props(props: KeyContextQuery.Builder.() -> Unit): Unit =
        props(KeyContextQuery(props))

    override fun props(props: CcApiContextQuery) {
      cdkBuilder.props(props.let(CcApiContextQuery.Companion::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("62f80640dc2188021b22563fa7667a85e436fe826cb8bd78d45f278396b706eb")
    override fun props(props: CcApiContextQuery.Builder.() -> Unit): Unit =
        props(CcApiContextQuery(props))

    override fun props(props: PluginContextQuery) {
      cdkBuilder.props(props.let(PluginContextQuery.Companion::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("86bc6fa08f8cd1bfbdb4df757ffba40c111145bb3895924bd52a58d7b1c1fb7c")
    override fun props(props: PluginContextQuery.Builder.() -> Unit): Unit =
        props(PluginContextQuery(props))

    override fun provider(provider: ContextProvider) {
      cdkBuilder.provider(provider.let(ContextProvider.Companion::unwrap))
    }

    public fun build(): software.amazon.awscdk.cloudassembly.schema.MissingContext =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.cloudassembly.schema.MissingContext,
  ) : CdkObject(cdkObject),
      MissingContext {
    override fun key(): String = unwrap(this).getKey()

    override fun props(): Any = unwrap(this).getProps()

    override fun provider(): ContextProvider = unwrap(this).getProvider().let(ContextProvider::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): MissingContext {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.cloudassembly.schema.MissingContext):
        MissingContext = CdkObjectWrappers.wrap(cdkObject) as? MissingContext ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: MissingContext):
        software.amazon.awscdk.cloudassembly.schema.MissingContext = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.cloudassembly.schema.MissingContext
  }
}
