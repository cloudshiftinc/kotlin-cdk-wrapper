@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.appsync

import io.cloudshiftdev.awscdk.Resource
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.services.iam.Grant
import io.cloudshiftdev.awscdk.services.iam.IGrantable
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * A Channel Namespace.
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
public open class ChannelNamespace(
  cdkObject: software.amazon.awscdk.services.appsync.ChannelNamespace,
) : Resource(cdkObject),
    IChannelNamespace {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: ChannelNamespaceProps,
  ) :
      this(software.amazon.awscdk.services.appsync.ChannelNamespace(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id, props.let(ChannelNamespaceProps.Companion::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: ChannelNamespaceProps.Builder.() -> Unit,
  ) : this(scope, id, ChannelNamespaceProps(props)
  )

  /**
   * the ARN of the channel namespace.
   */
  public override fun channelNamespaceArn(): String = unwrap(this).getChannelNamespaceArn()

  /**
   * Adds an IAM policy statement for EventPublish access to this channel namespace to an IAM
   * principal's policy.
   *
   * @param grantee The principal. 
   */
  public open fun grantPublish(grantee: IGrantable): Grant =
      unwrap(this).grantPublish(grantee.let(IGrantable.Companion::unwrap)).let(Grant::wrap)

  /**
   * Adds an IAM policy statement for EventPublish and EventSubscribe access to this channel
   * namespace to an IAM principal's policy.
   *
   * @param grantee The principal. 
   */
  public open fun grantPublishAndSubscribe(grantee: IGrantable): Grant =
      unwrap(this).grantPublishAndSubscribe(grantee.let(IGrantable.Companion::unwrap)).let(Grant::wrap)

  /**
   * Adds an IAM policy statement for EventSubscribe access to this channel namespace to an IAM
   * principal's policy.
   *
   * @param grantee The principal. 
   */
  public open fun grantSubscribe(grantee: IGrantable): Grant =
      unwrap(this).grantSubscribe(grantee.let(IGrantable.Companion::unwrap)).let(Grant::wrap)

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.appsync.ChannelNamespace].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The API this channel namespace is associated with.
     *
     * @param api The API this channel namespace is associated with. 
     */
    public fun api(api: IEventApi)

    /**
     * Authorization config for channel namespace.
     *
     * Default: - defaults to Event API default auth config
     *
     * @param authorizationConfig Authorization config for channel namespace. 
     */
    public fun authorizationConfig(authorizationConfig: NamespaceAuthConfig)

    /**
     * Authorization config for channel namespace.
     *
     * Default: - defaults to Event API default auth config
     *
     * @param authorizationConfig Authorization config for channel namespace. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("f31513f45d02f90367f13fff231919dd0c371343b38f927b8a75deaea5cc7534")
    public fun authorizationConfig(authorizationConfig: NamespaceAuthConfig.Builder.() -> Unit)

    /**
     * the name of the channel namespace.
     *
     * Default: - the construct's id will be used
     *
     * @param channelNamespaceName the name of the channel namespace. 
     */
    public fun channelNamespaceName(channelNamespaceName: String)

    /**
     * The Event Handler code.
     *
     * Default: - no code is used
     *
     * @param code The Event Handler code. 
     */
    public fun code(code: Code)

    /**
     * onPublish handler config.
     *
     * Default: - no handler config
     *
     * @param publishHandlerConfig onPublish handler config. 
     */
    public fun publishHandlerConfig(publishHandlerConfig: HandlerConfig)

    /**
     * onPublish handler config.
     *
     * Default: - no handler config
     *
     * @param publishHandlerConfig onPublish handler config. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("71b732604a0cd1ba14d473213d80f0d3862bea06c8028d3d6e0abe8aa56c785e")
    public fun publishHandlerConfig(publishHandlerConfig: HandlerConfig.Builder.() -> Unit)

    /**
     * onSubscribe handler config.
     *
     * Default: - no handler config
     *
     * @param subscribeHandlerConfig onSubscribe handler config. 
     */
    public fun subscribeHandlerConfig(subscribeHandlerConfig: HandlerConfig)

    /**
     * onSubscribe handler config.
     *
     * Default: - no handler config
     *
     * @param subscribeHandlerConfig onSubscribe handler config. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("5e68bbefefeb0bb43b1389b0c9c5a4c00671e189aadceba731a59fcf055767b2")
    public fun subscribeHandlerConfig(subscribeHandlerConfig: HandlerConfig.Builder.() -> Unit)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.appsync.ChannelNamespace.Builder =
        software.amazon.awscdk.services.appsync.ChannelNamespace.Builder.create(scope, id)

    /**
     * The API this channel namespace is associated with.
     *
     * @param api The API this channel namespace is associated with. 
     */
    override fun api(api: IEventApi) {
      cdkBuilder.api(api.let(IEventApi.Companion::unwrap))
    }

    /**
     * Authorization config for channel namespace.
     *
     * Default: - defaults to Event API default auth config
     *
     * @param authorizationConfig Authorization config for channel namespace. 
     */
    override fun authorizationConfig(authorizationConfig: NamespaceAuthConfig) {
      cdkBuilder.authorizationConfig(authorizationConfig.let(NamespaceAuthConfig.Companion::unwrap))
    }

    /**
     * Authorization config for channel namespace.
     *
     * Default: - defaults to Event API default auth config
     *
     * @param authorizationConfig Authorization config for channel namespace. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("f31513f45d02f90367f13fff231919dd0c371343b38f927b8a75deaea5cc7534")
    override fun authorizationConfig(authorizationConfig: NamespaceAuthConfig.Builder.() -> Unit):
        Unit = authorizationConfig(NamespaceAuthConfig(authorizationConfig))

    /**
     * the name of the channel namespace.
     *
     * Default: - the construct's id will be used
     *
     * @param channelNamespaceName the name of the channel namespace. 
     */
    override fun channelNamespaceName(channelNamespaceName: String) {
      cdkBuilder.channelNamespaceName(channelNamespaceName)
    }

    /**
     * The Event Handler code.
     *
     * Default: - no code is used
     *
     * @param code The Event Handler code. 
     */
    override fun code(code: Code) {
      cdkBuilder.code(code.let(Code.Companion::unwrap))
    }

    /**
     * onPublish handler config.
     *
     * Default: - no handler config
     *
     * @param publishHandlerConfig onPublish handler config. 
     */
    override fun publishHandlerConfig(publishHandlerConfig: HandlerConfig) {
      cdkBuilder.publishHandlerConfig(publishHandlerConfig.let(HandlerConfig.Companion::unwrap))
    }

    /**
     * onPublish handler config.
     *
     * Default: - no handler config
     *
     * @param publishHandlerConfig onPublish handler config. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("71b732604a0cd1ba14d473213d80f0d3862bea06c8028d3d6e0abe8aa56c785e")
    override fun publishHandlerConfig(publishHandlerConfig: HandlerConfig.Builder.() -> Unit): Unit
        = publishHandlerConfig(HandlerConfig(publishHandlerConfig))

    /**
     * onSubscribe handler config.
     *
     * Default: - no handler config
     *
     * @param subscribeHandlerConfig onSubscribe handler config. 
     */
    override fun subscribeHandlerConfig(subscribeHandlerConfig: HandlerConfig) {
      cdkBuilder.subscribeHandlerConfig(subscribeHandlerConfig.let(HandlerConfig.Companion::unwrap))
    }

    /**
     * onSubscribe handler config.
     *
     * Default: - no handler config
     *
     * @param subscribeHandlerConfig onSubscribe handler config. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("5e68bbefefeb0bb43b1389b0c9c5a4c00671e189aadceba731a59fcf055767b2")
    override fun subscribeHandlerConfig(subscribeHandlerConfig: HandlerConfig.Builder.() -> Unit):
        Unit = subscribeHandlerConfig(HandlerConfig(subscribeHandlerConfig))

    public fun build(): software.amazon.awscdk.services.appsync.ChannelNamespace =
        cdkBuilder.build()
  }

  public companion object {
    public val PROPERTY_INJECTION_ID: String =
        software.amazon.awscdk.services.appsync.ChannelNamespace.PROPERTY_INJECTION_ID

    public fun fromChannelNamespaceArn(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      channelNamespaceArn: String,
    ): IChannelNamespace =
        software.amazon.awscdk.services.appsync.ChannelNamespace.fromChannelNamespaceArn(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
        id, channelNamespaceArn).let(IChannelNamespace::wrap)

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): ChannelNamespace {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return ChannelNamespace(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.appsync.ChannelNamespace):
        ChannelNamespace = ChannelNamespace(cdkObject)

    internal fun unwrap(wrapped: ChannelNamespace):
        software.amazon.awscdk.services.appsync.ChannelNamespace = wrapped.cdkObject as
        software.amazon.awscdk.services.appsync.ChannelNamespace
  }
}
