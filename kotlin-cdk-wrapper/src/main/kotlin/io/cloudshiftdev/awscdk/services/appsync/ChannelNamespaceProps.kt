@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.appsync

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmName

/**
 * Additional property for an AppSync channel namespace for an Event API reference.
 *
 * Example:
 *
 * ```
 * EventApi api;
 * ChannelNamespace.Builder.create(this, "Namespace")
 * .api(api)
 * .authorizationConfig(NamespaceAuthConfig.builder()
 * // Override publishing authorization to API Key
 * .publishAuthModeTypes(List.of(AppSyncAuthorizationType.API_KEY))
 * // Override subscribing authorization to Lambda
 * .subscribeAuthModeTypes(List.of(AppSyncAuthorizationType.LAMBDA))
 * .build())
 * .build();
 * ```
 */
public interface ChannelNamespaceProps : BaseChannelNamespaceProps {
  /**
   * The API this channel namespace is associated with.
   */
  public fun api(): IEventApi

  /**
   * A builder for [ChannelNamespaceProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param api The API this channel namespace is associated with. 
     */
    public fun api(api: IEventApi)

    /**
     * @param authorizationConfig Authorization config for channel namespace.
     */
    public fun authorizationConfig(authorizationConfig: NamespaceAuthConfig)

    /**
     * @param authorizationConfig Authorization config for channel namespace.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("f9ac54c6a7a2a9aa25e4738c9ee9c5128ed7efe7bddcbbbb2e768dcc7f135616")
    public fun authorizationConfig(authorizationConfig: NamespaceAuthConfig.Builder.() -> Unit)

    /**
     * @param channelNamespaceName the name of the channel namespace.
     */
    public fun channelNamespaceName(channelNamespaceName: String)

    /**
     * @param code The Event Handler code.
     */
    public fun code(code: Code)

    /**
     * @param publishHandlerConfig onPublish handler config.
     */
    public fun publishHandlerConfig(publishHandlerConfig: HandlerConfig)

    /**
     * @param publishHandlerConfig onPublish handler config.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("39dd45382a9319ffa9b7fac330cd9efadb8e04d77b6800adc2408f13ce23da4c")
    public fun publishHandlerConfig(publishHandlerConfig: HandlerConfig.Builder.() -> Unit)

    /**
     * @param subscribeHandlerConfig onSubscribe handler config.
     */
    public fun subscribeHandlerConfig(subscribeHandlerConfig: HandlerConfig)

    /**
     * @param subscribeHandlerConfig onSubscribe handler config.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("f4002c4d2b46d5f8c268d1e57b7766d1887152739c973372f8b9832ae5b019b6")
    public fun subscribeHandlerConfig(subscribeHandlerConfig: HandlerConfig.Builder.() -> Unit)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.appsync.ChannelNamespaceProps.Builder =
        software.amazon.awscdk.services.appsync.ChannelNamespaceProps.builder()

    /**
     * @param api The API this channel namespace is associated with. 
     */
    override fun api(api: IEventApi) {
      cdkBuilder.api(api.let(IEventApi.Companion::unwrap))
    }

    /**
     * @param authorizationConfig Authorization config for channel namespace.
     */
    override fun authorizationConfig(authorizationConfig: NamespaceAuthConfig) {
      cdkBuilder.authorizationConfig(authorizationConfig.let(NamespaceAuthConfig.Companion::unwrap))
    }

    /**
     * @param authorizationConfig Authorization config for channel namespace.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("f9ac54c6a7a2a9aa25e4738c9ee9c5128ed7efe7bddcbbbb2e768dcc7f135616")
    override fun authorizationConfig(authorizationConfig: NamespaceAuthConfig.Builder.() -> Unit):
        Unit = authorizationConfig(NamespaceAuthConfig(authorizationConfig))

    /**
     * @param channelNamespaceName the name of the channel namespace.
     */
    override fun channelNamespaceName(channelNamespaceName: String) {
      cdkBuilder.channelNamespaceName(channelNamespaceName)
    }

    /**
     * @param code The Event Handler code.
     */
    override fun code(code: Code) {
      cdkBuilder.code(code.let(Code.Companion::unwrap))
    }

    /**
     * @param publishHandlerConfig onPublish handler config.
     */
    override fun publishHandlerConfig(publishHandlerConfig: HandlerConfig) {
      cdkBuilder.publishHandlerConfig(publishHandlerConfig.let(HandlerConfig.Companion::unwrap))
    }

    /**
     * @param publishHandlerConfig onPublish handler config.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("39dd45382a9319ffa9b7fac330cd9efadb8e04d77b6800adc2408f13ce23da4c")
    override fun publishHandlerConfig(publishHandlerConfig: HandlerConfig.Builder.() -> Unit): Unit
        = publishHandlerConfig(HandlerConfig(publishHandlerConfig))

    /**
     * @param subscribeHandlerConfig onSubscribe handler config.
     */
    override fun subscribeHandlerConfig(subscribeHandlerConfig: HandlerConfig) {
      cdkBuilder.subscribeHandlerConfig(subscribeHandlerConfig.let(HandlerConfig.Companion::unwrap))
    }

    /**
     * @param subscribeHandlerConfig onSubscribe handler config.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("f4002c4d2b46d5f8c268d1e57b7766d1887152739c973372f8b9832ae5b019b6")
    override fun subscribeHandlerConfig(subscribeHandlerConfig: HandlerConfig.Builder.() -> Unit):
        Unit = subscribeHandlerConfig(HandlerConfig(subscribeHandlerConfig))

    public fun build(): software.amazon.awscdk.services.appsync.ChannelNamespaceProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.appsync.ChannelNamespaceProps,
  ) : CdkObject(cdkObject),
      ChannelNamespaceProps {
    /**
     * The API this channel namespace is associated with.
     */
    override fun api(): IEventApi = unwrap(this).getApi().let(IEventApi::wrap)

    /**
     * Authorization config for channel namespace.
     *
     * Default: - defaults to Event API default auth config
     */
    override fun authorizationConfig(): NamespaceAuthConfig? =
        unwrap(this).getAuthorizationConfig()?.let(NamespaceAuthConfig::wrap)

    /**
     * the name of the channel namespace.
     *
     * Default: - the construct's id will be used
     */
    override fun channelNamespaceName(): String? = unwrap(this).getChannelNamespaceName()

    /**
     * The Event Handler code.
     *
     * Default: - no code is used
     */
    override fun code(): Code? = unwrap(this).getCode()?.let(Code::wrap)

    /**
     * onPublish handler config.
     *
     * Default: - no handler config
     */
    override fun publishHandlerConfig(): HandlerConfig? =
        unwrap(this).getPublishHandlerConfig()?.let(HandlerConfig::wrap)

    /**
     * onSubscribe handler config.
     *
     * Default: - no handler config
     */
    override fun subscribeHandlerConfig(): HandlerConfig? =
        unwrap(this).getSubscribeHandlerConfig()?.let(HandlerConfig::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): ChannelNamespaceProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.appsync.ChannelNamespaceProps):
        ChannelNamespaceProps = CdkObjectWrappers.wrap(cdkObject) as? ChannelNamespaceProps ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: ChannelNamespaceProps):
        software.amazon.awscdk.services.appsync.ChannelNamespaceProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.appsync.ChannelNamespaceProps
  }
}
