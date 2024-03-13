package io.cloudshiftdev.awscdk.cloudassembly.schema

import kotlin.Any
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName

public interface MissingContext {
  public fun key(): String

  public fun props(): Any

  public fun provider(): ContextProvider

  public interface Builder {
    public fun key(key: String) {
    }

    public fun props(props: AmiContextQuery) {
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("e9f8b3d899c475c0bb392580f6291c1c066e10177afe420e8e948ae93a3c01e9")
    public fun props(props: AmiContextQuery.Builder.() -> Unit) {
    }

    public fun props(props: AvailabilityZonesContextQuery) {
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("ba984ab3bd4b846764d704a615b057e505efc8f2dca2e73294e61b470371f143")
    public fun props(props: AvailabilityZonesContextQuery.Builder.() -> Unit) {
    }

    public fun props(props: HostedZoneContextQuery) {
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("f35eb1641577c54fc75172874c966e346effe20c11655f5a9410cffe70e4d05b")
    public fun props(props: HostedZoneContextQuery.Builder.() -> Unit) {
    }

    public fun props(props: SSMParameterContextQuery) {
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("fcee8db55454c5bc417f5e375ead71e3565eeff7df5fc5777bb105b88191a653")
    public fun props(props: SSMParameterContextQuery.Builder.() -> Unit) {
    }

    public fun props(props: VpcContextQuery) {
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("b9f2f0e0346c9bc8fa511fb6963add00d9d76e0d11c679f2cb8ad618b4e36e16")
    public fun props(props: VpcContextQuery.Builder.() -> Unit) {
    }

    public fun props(props: EndpointServiceAvailabilityZonesContextQuery) {
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("7471e9a800f8e2fae024f840cf075b65fa2284e34348669322dc276c855bc1b2")
    public fun props(props: EndpointServiceAvailabilityZonesContextQuery.Builder.() -> Unit) {
    }

    public fun props(props: LoadBalancerContextQuery) {
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("a1b7536058557f29d064b4014be9b3f5ef337b1b5a7480b16fc3ac33572cc0ef")
    public fun props(props: LoadBalancerContextQuery.Builder.() -> Unit) {
    }

    public fun props(props: LoadBalancerListenerContextQuery) {
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("fe110973725cb41b3d31910beb3fe1da88d59ce9b7f1dd89a297732491ad5896")
    public fun props(props: LoadBalancerListenerContextQuery.Builder.() -> Unit) {
    }

    public fun props(props: SecurityGroupContextQuery) {
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("11dc672e44129fba782aa2c20996cd62cd66c422a6537b9cde8431a95f8e5ffc")
    public fun props(props: SecurityGroupContextQuery.Builder.() -> Unit) {
    }

    public fun props(props: KeyContextQuery) {
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("7831cee57bf9fe073313dae582685932a01a35846484abcaaace6b15502d4fc4")
    public fun props(props: KeyContextQuery.Builder.() -> Unit) {
    }

    public fun props(props: PluginContextQuery) {
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("86bc6fa08f8cd1bfbdb4df757ffba40c111145bb3895924bd52a58d7b1c1fb7c")
    public fun props(props: PluginContextQuery.Builder.() -> Unit) {
    }

    public fun provider(provider: ContextProvider) {
    }
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.cloudassembly.schema.MissingContext.Builder =
        software.amazon.awscdk.cloudassembly.schema.MissingContext.builder()

    public override fun key(key: String) {
      cdkBuilder.key(key)
    }

    public override fun props(props: AmiContextQuery) {
      cdkBuilder.props(props.let(AmiContextQuery::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("e9f8b3d899c475c0bb392580f6291c1c066e10177afe420e8e948ae93a3c01e9")
    public override fun props(props: AmiContextQuery.Builder.() -> Unit): Unit =
        props(AmiContextQuery(props))

    public override fun props(props: AvailabilityZonesContextQuery) {
      cdkBuilder.props(props.let(AvailabilityZonesContextQuery::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("ba984ab3bd4b846764d704a615b057e505efc8f2dca2e73294e61b470371f143")
    public override fun props(props: AvailabilityZonesContextQuery.Builder.() -> Unit): Unit =
        props(AvailabilityZonesContextQuery(props))

    public override fun props(props: HostedZoneContextQuery) {
      cdkBuilder.props(props.let(HostedZoneContextQuery::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("f35eb1641577c54fc75172874c966e346effe20c11655f5a9410cffe70e4d05b")
    public override fun props(props: HostedZoneContextQuery.Builder.() -> Unit): Unit =
        props(HostedZoneContextQuery(props))

    public override fun props(props: SSMParameterContextQuery) {
      cdkBuilder.props(props.let(SSMParameterContextQuery::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("fcee8db55454c5bc417f5e375ead71e3565eeff7df5fc5777bb105b88191a653")
    public override fun props(props: SSMParameterContextQuery.Builder.() -> Unit): Unit =
        props(SSMParameterContextQuery(props))

    public override fun props(props: VpcContextQuery) {
      cdkBuilder.props(props.let(VpcContextQuery::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("b9f2f0e0346c9bc8fa511fb6963add00d9d76e0d11c679f2cb8ad618b4e36e16")
    public override fun props(props: VpcContextQuery.Builder.() -> Unit): Unit =
        props(VpcContextQuery(props))

    public override fun props(props: EndpointServiceAvailabilityZonesContextQuery) {
      cdkBuilder.props(props.let(EndpointServiceAvailabilityZonesContextQuery::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("7471e9a800f8e2fae024f840cf075b65fa2284e34348669322dc276c855bc1b2")
    public override
        fun props(props: EndpointServiceAvailabilityZonesContextQuery.Builder.() -> Unit): Unit =
        props(EndpointServiceAvailabilityZonesContextQuery(props))

    public override fun props(props: LoadBalancerContextQuery) {
      cdkBuilder.props(props.let(LoadBalancerContextQuery::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("a1b7536058557f29d064b4014be9b3f5ef337b1b5a7480b16fc3ac33572cc0ef")
    public override fun props(props: LoadBalancerContextQuery.Builder.() -> Unit): Unit =
        props(LoadBalancerContextQuery(props))

    public override fun props(props: LoadBalancerListenerContextQuery) {
      cdkBuilder.props(props.let(LoadBalancerListenerContextQuery::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("fe110973725cb41b3d31910beb3fe1da88d59ce9b7f1dd89a297732491ad5896")
    public override fun props(props: LoadBalancerListenerContextQuery.Builder.() -> Unit): Unit =
        props(LoadBalancerListenerContextQuery(props))

    public override fun props(props: SecurityGroupContextQuery) {
      cdkBuilder.props(props.let(SecurityGroupContextQuery::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("11dc672e44129fba782aa2c20996cd62cd66c422a6537b9cde8431a95f8e5ffc")
    public override fun props(props: SecurityGroupContextQuery.Builder.() -> Unit): Unit =
        props(SecurityGroupContextQuery(props))

    public override fun props(props: KeyContextQuery) {
      cdkBuilder.props(props.let(KeyContextQuery::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("7831cee57bf9fe073313dae582685932a01a35846484abcaaace6b15502d4fc4")
    public override fun props(props: KeyContextQuery.Builder.() -> Unit): Unit =
        props(KeyContextQuery(props))

    public override fun props(props: PluginContextQuery) {
      cdkBuilder.props(props.let(PluginContextQuery::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("86bc6fa08f8cd1bfbdb4df757ffba40c111145bb3895924bd52a58d7b1c1fb7c")
    public override fun props(props: PluginContextQuery.Builder.() -> Unit): Unit =
        props(PluginContextQuery(props))

    public override fun provider(provider: ContextProvider) {
      cdkBuilder.provider(provider.let(ContextProvider::unwrap))
    }

    public fun build(): software.amazon.awscdk.cloudassembly.schema.MissingContext =
        cdkBuilder.build()
  }

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.cloudassembly.schema.MissingContext,
  ) : MissingContext {
    public override fun key(): String = unwrap(this).getKey()

    public override fun props(): Any = unwrap(this).getProps()

    public override fun provider(): ContextProvider =
        unwrap(this).getProvider().let(ContextProvider::wrap)
  }

  public companion object {
    init {

    }

    public operator fun invoke(block: Builder.() -> Unit = {}): MissingContext {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.cloudassembly.schema.MissingContext):
        MissingContext = Wrapper(cdkObject)

    internal fun unwrap(wrapped: MissingContext):
        software.amazon.awscdk.cloudassembly.schema.MissingContext = (wrapped as Wrapper).cdkObject
  }
}
