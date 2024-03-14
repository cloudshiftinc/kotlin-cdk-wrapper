package io.cloudshiftdev.awscdk.cloudassembly.schema

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName

public interface MissingContext {
  /**
   * The missing context key.
   */
  public fun key(): String

  /**
   * A set of provider-specific options.
   */
  public fun props(): Any

  /**
   * The provider from which we expect this context key to be obtained.
   */
  public fun provider(): ContextProvider

  /**
   * A builder for [MissingContext]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param key The missing context key. 
     */
    public fun key(key: String)

    /**
     * @param props A set of provider-specific options. 
     */
    public fun props(props: AmiContextQuery)

    /**
     * @param props A set of provider-specific options. 
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("e9f8b3d899c475c0bb392580f6291c1c066e10177afe420e8e948ae93a3c01e9")
    public fun props(props: AmiContextQuery.Builder.() -> Unit)

    /**
     * @param props A set of provider-specific options. 
     */
    public fun props(props: AvailabilityZonesContextQuery)

    /**
     * @param props A set of provider-specific options. 
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("ba984ab3bd4b846764d704a615b057e505efc8f2dca2e73294e61b470371f143")
    public fun props(props: AvailabilityZonesContextQuery.Builder.() -> Unit)

    /**
     * @param props A set of provider-specific options. 
     */
    public fun props(props: HostedZoneContextQuery)

    /**
     * @param props A set of provider-specific options. 
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("f35eb1641577c54fc75172874c966e346effe20c11655f5a9410cffe70e4d05b")
    public fun props(props: HostedZoneContextQuery.Builder.() -> Unit)

    /**
     * @param props A set of provider-specific options. 
     */
    public fun props(props: SSMParameterContextQuery)

    /**
     * @param props A set of provider-specific options. 
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("fcee8db55454c5bc417f5e375ead71e3565eeff7df5fc5777bb105b88191a653")
    public fun props(props: SSMParameterContextQuery.Builder.() -> Unit)

    /**
     * @param props A set of provider-specific options. 
     */
    public fun props(props: VpcContextQuery)

    /**
     * @param props A set of provider-specific options. 
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("b9f2f0e0346c9bc8fa511fb6963add00d9d76e0d11c679f2cb8ad618b4e36e16")
    public fun props(props: VpcContextQuery.Builder.() -> Unit)

    /**
     * @param props A set of provider-specific options. 
     */
    public fun props(props: EndpointServiceAvailabilityZonesContextQuery)

    /**
     * @param props A set of provider-specific options. 
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("7471e9a800f8e2fae024f840cf075b65fa2284e34348669322dc276c855bc1b2")
    public fun props(props: EndpointServiceAvailabilityZonesContextQuery.Builder.() -> Unit)

    /**
     * @param props A set of provider-specific options. 
     */
    public fun props(props: LoadBalancerContextQuery)

    /**
     * @param props A set of provider-specific options. 
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("a1b7536058557f29d064b4014be9b3f5ef337b1b5a7480b16fc3ac33572cc0ef")
    public fun props(props: LoadBalancerContextQuery.Builder.() -> Unit)

    /**
     * @param props A set of provider-specific options. 
     */
    public fun props(props: LoadBalancerListenerContextQuery)

    /**
     * @param props A set of provider-specific options. 
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("fe110973725cb41b3d31910beb3fe1da88d59ce9b7f1dd89a297732491ad5896")
    public fun props(props: LoadBalancerListenerContextQuery.Builder.() -> Unit)

    /**
     * @param props A set of provider-specific options. 
     */
    public fun props(props: SecurityGroupContextQuery)

    /**
     * @param props A set of provider-specific options. 
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("11dc672e44129fba782aa2c20996cd62cd66c422a6537b9cde8431a95f8e5ffc")
    public fun props(props: SecurityGroupContextQuery.Builder.() -> Unit)

    /**
     * @param props A set of provider-specific options. 
     */
    public fun props(props: KeyContextQuery)

    /**
     * @param props A set of provider-specific options. 
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("7831cee57bf9fe073313dae582685932a01a35846484abcaaace6b15502d4fc4")
    public fun props(props: KeyContextQuery.Builder.() -> Unit)

    /**
     * @param props A set of provider-specific options. 
     */
    public fun props(props: PluginContextQuery)

    /**
     * @param props A set of provider-specific options. 
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("86bc6fa08f8cd1bfbdb4df757ffba40c111145bb3895924bd52a58d7b1c1fb7c")
    public fun props(props: PluginContextQuery.Builder.() -> Unit)

    /**
     * @param provider The provider from which we expect this context key to be obtained. 
     */
    public fun provider(provider: ContextProvider)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.cloudassembly.schema.MissingContext.Builder =
        software.amazon.awscdk.cloudassembly.schema.MissingContext.builder()

    /**
     * @param key The missing context key. 
     */
    override fun key(key: String) {
      cdkBuilder.key(key)
    }

    /**
     * @param props A set of provider-specific options. 
     */
    override fun props(props: AmiContextQuery) {
      cdkBuilder.props(props.let(AmiContextQuery::unwrap))
    }

    /**
     * @param props A set of provider-specific options. 
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("e9f8b3d899c475c0bb392580f6291c1c066e10177afe420e8e948ae93a3c01e9")
    override fun props(props: AmiContextQuery.Builder.() -> Unit): Unit =
        props(AmiContextQuery(props))

    /**
     * @param props A set of provider-specific options. 
     */
    override fun props(props: AvailabilityZonesContextQuery) {
      cdkBuilder.props(props.let(AvailabilityZonesContextQuery::unwrap))
    }

    /**
     * @param props A set of provider-specific options. 
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("ba984ab3bd4b846764d704a615b057e505efc8f2dca2e73294e61b470371f143")
    override fun props(props: AvailabilityZonesContextQuery.Builder.() -> Unit): Unit =
        props(AvailabilityZonesContextQuery(props))

    /**
     * @param props A set of provider-specific options. 
     */
    override fun props(props: HostedZoneContextQuery) {
      cdkBuilder.props(props.let(HostedZoneContextQuery::unwrap))
    }

    /**
     * @param props A set of provider-specific options. 
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("f35eb1641577c54fc75172874c966e346effe20c11655f5a9410cffe70e4d05b")
    override fun props(props: HostedZoneContextQuery.Builder.() -> Unit): Unit =
        props(HostedZoneContextQuery(props))

    /**
     * @param props A set of provider-specific options. 
     */
    override fun props(props: SSMParameterContextQuery) {
      cdkBuilder.props(props.let(SSMParameterContextQuery::unwrap))
    }

    /**
     * @param props A set of provider-specific options. 
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("fcee8db55454c5bc417f5e375ead71e3565eeff7df5fc5777bb105b88191a653")
    override fun props(props: SSMParameterContextQuery.Builder.() -> Unit): Unit =
        props(SSMParameterContextQuery(props))

    /**
     * @param props A set of provider-specific options. 
     */
    override fun props(props: VpcContextQuery) {
      cdkBuilder.props(props.let(VpcContextQuery::unwrap))
    }

    /**
     * @param props A set of provider-specific options. 
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("b9f2f0e0346c9bc8fa511fb6963add00d9d76e0d11c679f2cb8ad618b4e36e16")
    override fun props(props: VpcContextQuery.Builder.() -> Unit): Unit =
        props(VpcContextQuery(props))

    /**
     * @param props A set of provider-specific options. 
     */
    override fun props(props: EndpointServiceAvailabilityZonesContextQuery) {
      cdkBuilder.props(props.let(EndpointServiceAvailabilityZonesContextQuery::unwrap))
    }

    /**
     * @param props A set of provider-specific options. 
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("7471e9a800f8e2fae024f840cf075b65fa2284e34348669322dc276c855bc1b2")
    override fun props(props: EndpointServiceAvailabilityZonesContextQuery.Builder.() -> Unit): Unit
        = props(EndpointServiceAvailabilityZonesContextQuery(props))

    /**
     * @param props A set of provider-specific options. 
     */
    override fun props(props: LoadBalancerContextQuery) {
      cdkBuilder.props(props.let(LoadBalancerContextQuery::unwrap))
    }

    /**
     * @param props A set of provider-specific options. 
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("a1b7536058557f29d064b4014be9b3f5ef337b1b5a7480b16fc3ac33572cc0ef")
    override fun props(props: LoadBalancerContextQuery.Builder.() -> Unit): Unit =
        props(LoadBalancerContextQuery(props))

    /**
     * @param props A set of provider-specific options. 
     */
    override fun props(props: LoadBalancerListenerContextQuery) {
      cdkBuilder.props(props.let(LoadBalancerListenerContextQuery::unwrap))
    }

    /**
     * @param props A set of provider-specific options. 
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("fe110973725cb41b3d31910beb3fe1da88d59ce9b7f1dd89a297732491ad5896")
    override fun props(props: LoadBalancerListenerContextQuery.Builder.() -> Unit): Unit =
        props(LoadBalancerListenerContextQuery(props))

    /**
     * @param props A set of provider-specific options. 
     */
    override fun props(props: SecurityGroupContextQuery) {
      cdkBuilder.props(props.let(SecurityGroupContextQuery::unwrap))
    }

    /**
     * @param props A set of provider-specific options. 
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("11dc672e44129fba782aa2c20996cd62cd66c422a6537b9cde8431a95f8e5ffc")
    override fun props(props: SecurityGroupContextQuery.Builder.() -> Unit): Unit =
        props(SecurityGroupContextQuery(props))

    /**
     * @param props A set of provider-specific options. 
     */
    override fun props(props: KeyContextQuery) {
      cdkBuilder.props(props.let(KeyContextQuery::unwrap))
    }

    /**
     * @param props A set of provider-specific options. 
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("7831cee57bf9fe073313dae582685932a01a35846484abcaaace6b15502d4fc4")
    override fun props(props: KeyContextQuery.Builder.() -> Unit): Unit =
        props(KeyContextQuery(props))

    /**
     * @param props A set of provider-specific options. 
     */
    override fun props(props: PluginContextQuery) {
      cdkBuilder.props(props.let(PluginContextQuery::unwrap))
    }

    /**
     * @param props A set of provider-specific options. 
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("86bc6fa08f8cd1bfbdb4df757ffba40c111145bb3895924bd52a58d7b1c1fb7c")
    override fun props(props: PluginContextQuery.Builder.() -> Unit): Unit =
        props(PluginContextQuery(props))

    /**
     * @param provider The provider from which we expect this context key to be obtained. 
     */
    override fun provider(provider: ContextProvider) {
      cdkBuilder.provider(provider.let(ContextProvider::unwrap))
    }

    public fun build(): software.amazon.awscdk.cloudassembly.schema.MissingContext =
        cdkBuilder.build()
  }

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.cloudassembly.schema.MissingContext,
  ) : MissingContext {
    /**
     * The missing context key.
     */
    override fun key(): String = unwrap(this).getKey()

    /**
     * A set of provider-specific options.
     */
    override fun props(): Any = unwrap(this).getProps()

    /**
     * The provider from which we expect this context key to be obtained.
     */
    override fun provider(): ContextProvider = unwrap(this).getProvider().let(ContextProvider::wrap)
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
