@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.cloud_assembly_schema

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmName

/**
 * Represents a missing piece of context.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.cloud_assembly_schema.*;
 * Object assumeRoleAdditionalOptions;
 * MissingContext missingContext = MissingContext.builder()
 * .key("key")
 * .props(AmiContextQuery.builder()
 * .account("account")
 * .filters(Map.of(
 * "filtersKey", List.of("filters")))
 * .region("region")
 * // the properties below are optional
 * .assumeRoleAdditionalOptions(Map.of(
 * "assumeRoleAdditionalOptionsKey", assumeRoleAdditionalOptions))
 * .lookupRoleArn("lookupRoleArn")
 * .lookupRoleExternalId("lookupRoleExternalId")
 * .owners(List.of("owners"))
 * .build())
 * .provider(ContextProvider.AMI_PROVIDER)
 * .build();
 * ```
 */
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
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("ef0a83c7eed847f10cee8a1f1c7d6af1c27a79846385632e9cc5b7802e04119c")
    public fun props(props: AmiContextQuery.Builder.() -> Unit)

    /**
     * @param props A set of provider-specific options. 
     */
    public fun props(props: AvailabilityZonesContextQuery)

    /**
     * @param props A set of provider-specific options. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("6e2159ffb9e7188b6acb651d835c103c06fd3aeb33439affa4bc7db0df969421")
    public fun props(props: AvailabilityZonesContextQuery.Builder.() -> Unit)

    /**
     * @param props A set of provider-specific options. 
     */
    public fun props(props: HostedZoneContextQuery)

    /**
     * @param props A set of provider-specific options. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("c019cde4f67d672783b9bff0b2602944a718f1460fe76d7e7dc9853d691604d5")
    public fun props(props: HostedZoneContextQuery.Builder.() -> Unit)

    /**
     * @param props A set of provider-specific options. 
     */
    public fun props(props: SSMParameterContextQuery)

    /**
     * @param props A set of provider-specific options. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("e81820fa050aed06ea53c34e3a9d5cf0a2d442ac7c6b438199d044e9998eb1cd")
    public fun props(props: SSMParameterContextQuery.Builder.() -> Unit)

    /**
     * @param props A set of provider-specific options. 
     */
    public fun props(props: VpcContextQuery)

    /**
     * @param props A set of provider-specific options. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("ca4ded334c5c170b3465854e19d8f8704c72b23725344b9b10c4f9314e9f447d")
    public fun props(props: VpcContextQuery.Builder.() -> Unit)

    /**
     * @param props A set of provider-specific options. 
     */
    public fun props(props: EndpointServiceAvailabilityZonesContextQuery)

    /**
     * @param props A set of provider-specific options. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("3f24b01731ed95002aa7bd835e5c44867cbb3c3e1904d19de54260c99b00dfb8")
    public fun props(props: EndpointServiceAvailabilityZonesContextQuery.Builder.() -> Unit)

    /**
     * @param props A set of provider-specific options. 
     */
    public fun props(props: LoadBalancerContextQuery)

    /**
     * @param props A set of provider-specific options. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("d6d1013d8b92e975f7783ad580d575ea15255739c6ce95da4060964d0ab50a82")
    public fun props(props: LoadBalancerContextQuery.Builder.() -> Unit)

    /**
     * @param props A set of provider-specific options. 
     */
    public fun props(props: LoadBalancerListenerContextQuery)

    /**
     * @param props A set of provider-specific options. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("213f7a900934aa378f1c5aedf140b6101b514fd766a649b82a28f5c72f7618c1")
    public fun props(props: LoadBalancerListenerContextQuery.Builder.() -> Unit)

    /**
     * @param props A set of provider-specific options. 
     */
    public fun props(props: SecurityGroupContextQuery)

    /**
     * @param props A set of provider-specific options. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("201becd931643596563f256180bcbe2cd7492e2723513cb7213fbdc616dda127")
    public fun props(props: SecurityGroupContextQuery.Builder.() -> Unit)

    /**
     * @param props A set of provider-specific options. 
     */
    public fun props(props: KeyContextQuery)

    /**
     * @param props A set of provider-specific options. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("d95473f43c50367d266fb9490a73e778b09df9a3be0848c5ecd7808d0de2c0ef")
    public fun props(props: KeyContextQuery.Builder.() -> Unit)

    /**
     * @param props A set of provider-specific options. 
     */
    public fun props(props: PluginContextQuery)

    /**
     * @param props A set of provider-specific options. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("6ac22198a863419c7a49965ff9cd2ea224d48950b80429e5c569a08673381100")
    public fun props(props: PluginContextQuery.Builder.() -> Unit)

    /**
     * @param provider The provider from which we expect this context key to be obtained. 
     */
    public fun provider(provider: ContextProvider)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.cloud_assembly_schema.MissingContext.Builder =
        software.amazon.awscdk.cloud_assembly_schema.MissingContext.builder()

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
      cdkBuilder.props(props.let(AmiContextQuery.Companion::unwrap))
    }

    /**
     * @param props A set of provider-specific options. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("ef0a83c7eed847f10cee8a1f1c7d6af1c27a79846385632e9cc5b7802e04119c")
    override fun props(props: AmiContextQuery.Builder.() -> Unit): Unit =
        props(AmiContextQuery(props))

    /**
     * @param props A set of provider-specific options. 
     */
    override fun props(props: AvailabilityZonesContextQuery) {
      cdkBuilder.props(props.let(AvailabilityZonesContextQuery.Companion::unwrap))
    }

    /**
     * @param props A set of provider-specific options. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("6e2159ffb9e7188b6acb651d835c103c06fd3aeb33439affa4bc7db0df969421")
    override fun props(props: AvailabilityZonesContextQuery.Builder.() -> Unit): Unit =
        props(AvailabilityZonesContextQuery(props))

    /**
     * @param props A set of provider-specific options. 
     */
    override fun props(props: HostedZoneContextQuery) {
      cdkBuilder.props(props.let(HostedZoneContextQuery.Companion::unwrap))
    }

    /**
     * @param props A set of provider-specific options. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("c019cde4f67d672783b9bff0b2602944a718f1460fe76d7e7dc9853d691604d5")
    override fun props(props: HostedZoneContextQuery.Builder.() -> Unit): Unit =
        props(HostedZoneContextQuery(props))

    /**
     * @param props A set of provider-specific options. 
     */
    override fun props(props: SSMParameterContextQuery) {
      cdkBuilder.props(props.let(SSMParameterContextQuery.Companion::unwrap))
    }

    /**
     * @param props A set of provider-specific options. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("e81820fa050aed06ea53c34e3a9d5cf0a2d442ac7c6b438199d044e9998eb1cd")
    override fun props(props: SSMParameterContextQuery.Builder.() -> Unit): Unit =
        props(SSMParameterContextQuery(props))

    /**
     * @param props A set of provider-specific options. 
     */
    override fun props(props: VpcContextQuery) {
      cdkBuilder.props(props.let(VpcContextQuery.Companion::unwrap))
    }

    /**
     * @param props A set of provider-specific options. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("ca4ded334c5c170b3465854e19d8f8704c72b23725344b9b10c4f9314e9f447d")
    override fun props(props: VpcContextQuery.Builder.() -> Unit): Unit =
        props(VpcContextQuery(props))

    /**
     * @param props A set of provider-specific options. 
     */
    override fun props(props: EndpointServiceAvailabilityZonesContextQuery) {
      cdkBuilder.props(props.let(EndpointServiceAvailabilityZonesContextQuery.Companion::unwrap))
    }

    /**
     * @param props A set of provider-specific options. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("3f24b01731ed95002aa7bd835e5c44867cbb3c3e1904d19de54260c99b00dfb8")
    override fun props(props: EndpointServiceAvailabilityZonesContextQuery.Builder.() -> Unit): Unit
        = props(EndpointServiceAvailabilityZonesContextQuery(props))

    /**
     * @param props A set of provider-specific options. 
     */
    override fun props(props: LoadBalancerContextQuery) {
      cdkBuilder.props(props.let(LoadBalancerContextQuery.Companion::unwrap))
    }

    /**
     * @param props A set of provider-specific options. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("d6d1013d8b92e975f7783ad580d575ea15255739c6ce95da4060964d0ab50a82")
    override fun props(props: LoadBalancerContextQuery.Builder.() -> Unit): Unit =
        props(LoadBalancerContextQuery(props))

    /**
     * @param props A set of provider-specific options. 
     */
    override fun props(props: LoadBalancerListenerContextQuery) {
      cdkBuilder.props(props.let(LoadBalancerListenerContextQuery.Companion::unwrap))
    }

    /**
     * @param props A set of provider-specific options. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("213f7a900934aa378f1c5aedf140b6101b514fd766a649b82a28f5c72f7618c1")
    override fun props(props: LoadBalancerListenerContextQuery.Builder.() -> Unit): Unit =
        props(LoadBalancerListenerContextQuery(props))

    /**
     * @param props A set of provider-specific options. 
     */
    override fun props(props: SecurityGroupContextQuery) {
      cdkBuilder.props(props.let(SecurityGroupContextQuery.Companion::unwrap))
    }

    /**
     * @param props A set of provider-specific options. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("201becd931643596563f256180bcbe2cd7492e2723513cb7213fbdc616dda127")
    override fun props(props: SecurityGroupContextQuery.Builder.() -> Unit): Unit =
        props(SecurityGroupContextQuery(props))

    /**
     * @param props A set of provider-specific options. 
     */
    override fun props(props: KeyContextQuery) {
      cdkBuilder.props(props.let(KeyContextQuery.Companion::unwrap))
    }

    /**
     * @param props A set of provider-specific options. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("d95473f43c50367d266fb9490a73e778b09df9a3be0848c5ecd7808d0de2c0ef")
    override fun props(props: KeyContextQuery.Builder.() -> Unit): Unit =
        props(KeyContextQuery(props))

    /**
     * @param props A set of provider-specific options. 
     */
    override fun props(props: PluginContextQuery) {
      cdkBuilder.props(props.let(PluginContextQuery.Companion::unwrap))
    }

    /**
     * @param props A set of provider-specific options. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("6ac22198a863419c7a49965ff9cd2ea224d48950b80429e5c569a08673381100")
    override fun props(props: PluginContextQuery.Builder.() -> Unit): Unit =
        props(PluginContextQuery(props))

    /**
     * @param provider The provider from which we expect this context key to be obtained. 
     */
    override fun provider(provider: ContextProvider) {
      cdkBuilder.provider(provider.let(ContextProvider.Companion::unwrap))
    }

    public fun build(): software.amazon.awscdk.cloud_assembly_schema.MissingContext =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.cloud_assembly_schema.MissingContext,
  ) : CdkObject(cdkObject),
      MissingContext {
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
    public operator fun invoke(block: Builder.() -> Unit = {}): MissingContext {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.cloud_assembly_schema.MissingContext):
        MissingContext = CdkObjectWrappers.wrap(cdkObject) as? MissingContext ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: MissingContext):
        software.amazon.awscdk.cloud_assembly_schema.MissingContext = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.cloud_assembly_schema.MissingContext
  }
}
