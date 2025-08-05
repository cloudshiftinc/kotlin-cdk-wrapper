@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.appsync

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmName

/**
 * the base properties for a channel namespace.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.appsync.*;
 * AppSyncBackedDataSource appSyncBackedDataSource;
 * Code code;
 * BaseChannelNamespaceProps baseChannelNamespaceProps = BaseChannelNamespaceProps.builder()
 * .authorizationConfig(NamespaceAuthConfig.builder()
 * .publishAuthModeTypes(List.of(AppSyncAuthorizationType.API_KEY))
 * .subscribeAuthModeTypes(List.of(AppSyncAuthorizationType.API_KEY))
 * .build())
 * .channelNamespaceName("channelNamespaceName")
 * .code(code)
 * .publishHandlerConfig(HandlerConfig.builder()
 * .dataSource(appSyncBackedDataSource)
 * .direct(false)
 * .lambdaInvokeType(LambdaInvokeType.EVENT)
 * .build())
 * .subscribeHandlerConfig(HandlerConfig.builder()
 * .dataSource(appSyncBackedDataSource)
 * .direct(false)
 * .lambdaInvokeType(LambdaInvokeType.EVENT)
 * .build())
 * .build();
 * ```
 */
public interface BaseChannelNamespaceProps {
  /**
   * Authorization config for channel namespace.
   *
   * Default: - defaults to Event API default auth config
   */
  public fun authorizationConfig(): NamespaceAuthConfig? =
      unwrap(this).getAuthorizationConfig()?.let(NamespaceAuthConfig::wrap)

  /**
   * the name of the channel namespace.
   *
   * Default: - the construct's id will be used
   */
  public fun channelNamespaceName(): String? = unwrap(this).getChannelNamespaceName()

  /**
   * The Event Handler code.
   *
   * Default: - no code is used
   */
  public fun code(): Code? = unwrap(this).getCode()?.let(Code::wrap)

  /**
   * onPublish handler config.
   *
   * Default: - no handler config
   */
  public fun publishHandlerConfig(): HandlerConfig? =
      unwrap(this).getPublishHandlerConfig()?.let(HandlerConfig::wrap)

  /**
   * onSubscribe handler config.
   *
   * Default: - no handler config
   */
  public fun subscribeHandlerConfig(): HandlerConfig? =
      unwrap(this).getSubscribeHandlerConfig()?.let(HandlerConfig::wrap)

  /**
   * A builder for [BaseChannelNamespaceProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param authorizationConfig Authorization config for channel namespace.
     */
    public fun authorizationConfig(authorizationConfig: NamespaceAuthConfig)

    /**
     * @param authorizationConfig Authorization config for channel namespace.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("36d4bd242ebff64d71bdc9518c1ed1890274fc752d5858b18bfa952525e46ca2")
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
    @JvmName("d3ccfaddbb5485ed284fd4e508f352d56ab6d28388bc6c070b978d30fbe9bdb9")
    public fun publishHandlerConfig(publishHandlerConfig: HandlerConfig.Builder.() -> Unit)

    /**
     * @param subscribeHandlerConfig onSubscribe handler config.
     */
    public fun subscribeHandlerConfig(subscribeHandlerConfig: HandlerConfig)

    /**
     * @param subscribeHandlerConfig onSubscribe handler config.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("ca3457fad58b329b32c06e4d7e05c17e09934d2d8f3391fca8eb04f130650555")
    public fun subscribeHandlerConfig(subscribeHandlerConfig: HandlerConfig.Builder.() -> Unit)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.appsync.BaseChannelNamespaceProps.Builder =
        software.amazon.awscdk.services.appsync.BaseChannelNamespaceProps.builder()

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
    @JvmName("36d4bd242ebff64d71bdc9518c1ed1890274fc752d5858b18bfa952525e46ca2")
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
    @JvmName("d3ccfaddbb5485ed284fd4e508f352d56ab6d28388bc6c070b978d30fbe9bdb9")
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
    @JvmName("ca3457fad58b329b32c06e4d7e05c17e09934d2d8f3391fca8eb04f130650555")
    override fun subscribeHandlerConfig(subscribeHandlerConfig: HandlerConfig.Builder.() -> Unit):
        Unit = subscribeHandlerConfig(HandlerConfig(subscribeHandlerConfig))

    public fun build(): software.amazon.awscdk.services.appsync.BaseChannelNamespaceProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.appsync.BaseChannelNamespaceProps,
  ) : CdkObject(cdkObject),
      BaseChannelNamespaceProps {
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
    public operator fun invoke(block: Builder.() -> Unit = {}): BaseChannelNamespaceProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.appsync.BaseChannelNamespaceProps):
        BaseChannelNamespaceProps = CdkObjectWrappers.wrap(cdkObject) as? BaseChannelNamespaceProps
        ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: BaseChannelNamespaceProps):
        software.amazon.awscdk.services.appsync.BaseChannelNamespaceProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.appsync.BaseChannelNamespaceProps
  }
}
