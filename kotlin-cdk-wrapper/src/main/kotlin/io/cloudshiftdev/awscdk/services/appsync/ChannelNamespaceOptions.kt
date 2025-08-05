@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.appsync

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmName

/**
 * Option configuration for channel namespace.
 *
 * Example:
 *
 * ```
 * EventApi api;
 * AppSyncDynamoDbDataSource ddbDataSource;
 * AppSyncEventBridgeDataSource ebDataSource;
 * // DynamoDB data source for publish handler
 * api.addChannelNamespace("ddb-eb-ns", ChannelNamespaceOptions.builder()
 * .code(Code.fromInline("/ * event handler code here.*&#47;"))
 * .publishHandlerConfig(HandlerConfig.builder()
 * .dataSource(ddbDataSource)
 * .build())
 * .subscribeHandlerConfig(HandlerConfig.builder()
 * .dataSource(ebDataSource)
 * .build())
 * .build());
 * ```
 */
public interface ChannelNamespaceOptions {
  /**
   * Authorization config for channel namespace.
   *
   * Default: - defaults to Event API default auth config
   */
  public fun authorizationConfig(): NamespaceAuthConfig? =
      unwrap(this).getAuthorizationConfig()?.let(NamespaceAuthConfig::wrap)

  /**
   * The Channel Namespace name.
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
   * A builder for [ChannelNamespaceOptions]
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
    @JvmName("ce7a48366a419bda97751c1245de51e66ddab4ed8a29d78a414df3bde4bb81c6")
    public fun authorizationConfig(authorizationConfig: NamespaceAuthConfig.Builder.() -> Unit)

    /**
     * @param channelNamespaceName The Channel Namespace name.
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
    @JvmName("69a926f66925c7bbabf9587f808dc32256d1a9c35178bf69fb70a39ec1731274")
    public fun publishHandlerConfig(publishHandlerConfig: HandlerConfig.Builder.() -> Unit)

    /**
     * @param subscribeHandlerConfig onSubscribe handler config.
     */
    public fun subscribeHandlerConfig(subscribeHandlerConfig: HandlerConfig)

    /**
     * @param subscribeHandlerConfig onSubscribe handler config.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("fb899f988c048bb6cfd4067f92645b6da5844312fbaf4b633af37a9cfd5205e3")
    public fun subscribeHandlerConfig(subscribeHandlerConfig: HandlerConfig.Builder.() -> Unit)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.appsync.ChannelNamespaceOptions.Builder
        = software.amazon.awscdk.services.appsync.ChannelNamespaceOptions.builder()

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
    @JvmName("ce7a48366a419bda97751c1245de51e66ddab4ed8a29d78a414df3bde4bb81c6")
    override fun authorizationConfig(authorizationConfig: NamespaceAuthConfig.Builder.() -> Unit):
        Unit = authorizationConfig(NamespaceAuthConfig(authorizationConfig))

    /**
     * @param channelNamespaceName The Channel Namespace name.
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
    @JvmName("69a926f66925c7bbabf9587f808dc32256d1a9c35178bf69fb70a39ec1731274")
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
    @JvmName("fb899f988c048bb6cfd4067f92645b6da5844312fbaf4b633af37a9cfd5205e3")
    override fun subscribeHandlerConfig(subscribeHandlerConfig: HandlerConfig.Builder.() -> Unit):
        Unit = subscribeHandlerConfig(HandlerConfig(subscribeHandlerConfig))

    public fun build(): software.amazon.awscdk.services.appsync.ChannelNamespaceOptions =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.appsync.ChannelNamespaceOptions,
  ) : CdkObject(cdkObject),
      ChannelNamespaceOptions {
    /**
     * Authorization config for channel namespace.
     *
     * Default: - defaults to Event API default auth config
     */
    override fun authorizationConfig(): NamespaceAuthConfig? =
        unwrap(this).getAuthorizationConfig()?.let(NamespaceAuthConfig::wrap)

    /**
     * The Channel Namespace name.
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
    public operator fun invoke(block: Builder.() -> Unit = {}): ChannelNamespaceOptions {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.appsync.ChannelNamespaceOptions):
        ChannelNamespaceOptions = CdkObjectWrappers.wrap(cdkObject) as? ChannelNamespaceOptions ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: ChannelNamespaceOptions):
        software.amazon.awscdk.services.appsync.ChannelNamespaceOptions = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.appsync.ChannelNamespaceOptions
  }
}
