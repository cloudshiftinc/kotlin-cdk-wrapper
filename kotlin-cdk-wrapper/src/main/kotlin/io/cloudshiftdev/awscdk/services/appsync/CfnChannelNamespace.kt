@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.appsync

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.ITaggableV2
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * The `AWS::AppSync::ChannelNamespace` resource creates a channel namespace associated with an
 * `Api` .
 *
 * The `ChannelNamespace` contains the definitions for code handlers for the `Api` .
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.appsync.*;
 * CfnChannelNamespace cfnChannelNamespace = CfnChannelNamespace.Builder.create(this,
 * "MyCfnChannelNamespace")
 * .apiId("apiId")
 * .name("name")
 * // the properties below are optional
 * .codeHandlers("codeHandlers")
 * .codeS3Location("codeS3Location")
 * .handlerConfigs(HandlerConfigsProperty.builder()
 * .onPublish(HandlerConfigProperty.builder()
 * .behavior("behavior")
 * .integration(IntegrationProperty.builder()
 * .dataSourceName("dataSourceName")
 * // the properties below are optional
 * .lambdaConfig(LambdaConfigProperty.builder()
 * .invokeType("invokeType")
 * .build())
 * .build())
 * .build())
 * .onSubscribe(HandlerConfigProperty.builder()
 * .behavior("behavior")
 * .integration(IntegrationProperty.builder()
 * .dataSourceName("dataSourceName")
 * // the properties below are optional
 * .lambdaConfig(LambdaConfigProperty.builder()
 * .invokeType("invokeType")
 * .build())
 * .build())
 * .build())
 * .build())
 * .publishAuthModes(List.of(AuthModeProperty.builder()
 * .authType("authType")
 * .build()))
 * .subscribeAuthModes(List.of(AuthModeProperty.builder()
 * .authType("authType")
 * .build()))
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appsync-channelnamespace.html)
 */
public open class CfnChannelNamespace(
  cdkObject: software.amazon.awscdk.services.appsync.CfnChannelNamespace,
) : CfnResource(cdkObject),
    IInspectable,
    ITaggableV2 {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnChannelNamespaceProps,
  ) :
      this(software.amazon.awscdk.services.appsync.CfnChannelNamespace(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id, props.let(CfnChannelNamespaceProps.Companion::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnChannelNamespaceProps.Builder.() -> Unit,
  ) : this(scope, id, CfnChannelNamespaceProps(props)
  )

  /**
   * The `Api` ID.
   */
  public open fun apiId(): String = unwrap(this).getApiId()

  /**
   * The `Api` ID.
   */
  public open fun apiId(`value`: String) {
    unwrap(this).setApiId(`value`)
  }

  /**
   * The Amazon Resource Name (ARN) of the channel namespace.
   */
  public open fun attrChannelNamespaceArn(): String = unwrap(this).getAttrChannelNamespaceArn()

  /**
   * Tag Manager which manages the tags for this resource.
   */
  public override fun cdkTagManager(): TagManager =
      unwrap(this).getCdkTagManager().let(TagManager::wrap)

  /**
   * The event handler functions that run custom business logic to process published events and
   * subscribe requests.
   */
  public open fun codeHandlers(): String? = unwrap(this).getCodeHandlers()

  /**
   * The event handler functions that run custom business logic to process published events and
   * subscribe requests.
   */
  public open fun codeHandlers(`value`: String) {
    unwrap(this).setCodeHandlers(`value`)
  }

  /**
   * The Amazon S3 endpoint where the code is located.
   */
  public open fun codeS3Location(): String? = unwrap(this).getCodeS3Location()

  /**
   * The Amazon S3 endpoint where the code is located.
   */
  public open fun codeS3Location(`value`: String) {
    unwrap(this).setCodeS3Location(`value`)
  }

  /**
   * The configuration for the `OnPublish` and `OnSubscribe` handlers.
   */
  public open fun handlerConfigs(): Any? = unwrap(this).getHandlerConfigs()

  /**
   * The configuration for the `OnPublish` and `OnSubscribe` handlers.
   */
  public open fun handlerConfigs(`value`: IResolvable) {
    unwrap(this).setHandlerConfigs(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   * The configuration for the `OnPublish` and `OnSubscribe` handlers.
   */
  public open fun handlerConfigs(`value`: HandlerConfigsProperty) {
    unwrap(this).setHandlerConfigs(`value`.let(HandlerConfigsProperty.Companion::unwrap))
  }

  /**
   * The configuration for the `OnPublish` and `OnSubscribe` handlers.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("e369a40ec720aa0da3f9d466186d4e0184b3ae21949d76da63a0ab82700d3a7d")
  public open fun handlerConfigs(`value`: HandlerConfigsProperty.Builder.() -> Unit): Unit =
      handlerConfigs(HandlerConfigsProperty(`value`))

  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector.Companion::unwrap))
  }

  /**
   * The name of the channel namespace.
   */
  public open fun name(): String = unwrap(this).getName()

  /**
   * The name of the channel namespace.
   */
  public open fun name(`value`: String) {
    unwrap(this).setName(`value`)
  }

  /**
   * The authorization mode to use for publishing messages on the channel namespace.
   */
  public open fun publishAuthModes(): Any? = unwrap(this).getPublishAuthModes()

  /**
   * The authorization mode to use for publishing messages on the channel namespace.
   */
  public open fun publishAuthModes(`value`: IResolvable) {
    unwrap(this).setPublishAuthModes(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   * The authorization mode to use for publishing messages on the channel namespace.
   */
  public open fun publishAuthModes(`value`: List<Any>) {
    unwrap(this).setPublishAuthModes(`value`.map{CdkObjectWrappers.unwrap(it)})
  }

  /**
   * The authorization mode to use for publishing messages on the channel namespace.
   */
  public open fun publishAuthModes(vararg `value`: Any): Unit = publishAuthModes(`value`.toList())

  /**
   * The authorization mode to use for subscribing to messages on the channel namespace.
   */
  public open fun subscribeAuthModes(): Any? = unwrap(this).getSubscribeAuthModes()

  /**
   * The authorization mode to use for subscribing to messages on the channel namespace.
   */
  public open fun subscribeAuthModes(`value`: IResolvable) {
    unwrap(this).setSubscribeAuthModes(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   * The authorization mode to use for subscribing to messages on the channel namespace.
   */
  public open fun subscribeAuthModes(`value`: List<Any>) {
    unwrap(this).setSubscribeAuthModes(`value`.map{CdkObjectWrappers.unwrap(it)})
  }

  /**
   * The authorization mode to use for subscribing to messages on the channel namespace.
   */
  public open fun subscribeAuthModes(vararg `value`: Any): Unit =
      subscribeAuthModes(`value`.toList())

  /**
   * A set of tags (key-value pairs) for this channel namespace.
   */
  public open fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * A set of tags (key-value pairs) for this channel namespace.
   */
  public open fun tags(`value`: List<CfnTag>) {
    unwrap(this).setTags(`value`.map(CfnTag.Companion::unwrap))
  }

  /**
   * A set of tags (key-value pairs) for this channel namespace.
   */
  public open fun tags(vararg `value`: CfnTag): Unit = tags(`value`.toList())

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.appsync.CfnChannelNamespace].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The `Api` ID.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appsync-channelnamespace.html#cfn-appsync-channelnamespace-apiid)
     * @param apiId The `Api` ID. 
     */
    public fun apiId(apiId: String)

    /**
     * The event handler functions that run custom business logic to process published events and
     * subscribe requests.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appsync-channelnamespace.html#cfn-appsync-channelnamespace-codehandlers)
     * @param codeHandlers The event handler functions that run custom business logic to process
     * published events and subscribe requests. 
     */
    public fun codeHandlers(codeHandlers: String)

    /**
     * The Amazon S3 endpoint where the code is located.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appsync-channelnamespace.html#cfn-appsync-channelnamespace-codes3location)
     * @param codeS3Location The Amazon S3 endpoint where the code is located. 
     */
    public fun codeS3Location(codeS3Location: String)

    /**
     * The configuration for the `OnPublish` and `OnSubscribe` handlers.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appsync-channelnamespace.html#cfn-appsync-channelnamespace-handlerconfigs)
     * @param handlerConfigs The configuration for the `OnPublish` and `OnSubscribe` handlers. 
     */
    public fun handlerConfigs(handlerConfigs: IResolvable)

    /**
     * The configuration for the `OnPublish` and `OnSubscribe` handlers.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appsync-channelnamespace.html#cfn-appsync-channelnamespace-handlerconfigs)
     * @param handlerConfigs The configuration for the `OnPublish` and `OnSubscribe` handlers. 
     */
    public fun handlerConfigs(handlerConfigs: HandlerConfigsProperty)

    /**
     * The configuration for the `OnPublish` and `OnSubscribe` handlers.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appsync-channelnamespace.html#cfn-appsync-channelnamespace-handlerconfigs)
     * @param handlerConfigs The configuration for the `OnPublish` and `OnSubscribe` handlers. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("d7a7d2d75ecd71604085b7a10c07525779f461fafdd70a605b1a7fe866911032")
    public fun handlerConfigs(handlerConfigs: HandlerConfigsProperty.Builder.() -> Unit)

    /**
     * The name of the channel namespace.
     *
     * This name must be unique within the `Api` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appsync-channelnamespace.html#cfn-appsync-channelnamespace-name)
     * @param name The name of the channel namespace. 
     */
    public fun name(name: String)

    /**
     * The authorization mode to use for publishing messages on the channel namespace.
     *
     * This configuration overrides the default `Api` authorization configuration.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appsync-channelnamespace.html#cfn-appsync-channelnamespace-publishauthmodes)
     * @param publishAuthModes The authorization mode to use for publishing messages on the channel
     * namespace. 
     */
    public fun publishAuthModes(publishAuthModes: IResolvable)

    /**
     * The authorization mode to use for publishing messages on the channel namespace.
     *
     * This configuration overrides the default `Api` authorization configuration.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appsync-channelnamespace.html#cfn-appsync-channelnamespace-publishauthmodes)
     * @param publishAuthModes The authorization mode to use for publishing messages on the channel
     * namespace. 
     */
    public fun publishAuthModes(publishAuthModes: List<Any>)

    /**
     * The authorization mode to use for publishing messages on the channel namespace.
     *
     * This configuration overrides the default `Api` authorization configuration.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appsync-channelnamespace.html#cfn-appsync-channelnamespace-publishauthmodes)
     * @param publishAuthModes The authorization mode to use for publishing messages on the channel
     * namespace. 
     */
    public fun publishAuthModes(vararg publishAuthModes: Any)

    /**
     * The authorization mode to use for subscribing to messages on the channel namespace.
     *
     * This configuration overrides the default `Api` authorization configuration.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appsync-channelnamespace.html#cfn-appsync-channelnamespace-subscribeauthmodes)
     * @param subscribeAuthModes The authorization mode to use for subscribing to messages on the
     * channel namespace. 
     */
    public fun subscribeAuthModes(subscribeAuthModes: IResolvable)

    /**
     * The authorization mode to use for subscribing to messages on the channel namespace.
     *
     * This configuration overrides the default `Api` authorization configuration.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appsync-channelnamespace.html#cfn-appsync-channelnamespace-subscribeauthmodes)
     * @param subscribeAuthModes The authorization mode to use for subscribing to messages on the
     * channel namespace. 
     */
    public fun subscribeAuthModes(subscribeAuthModes: List<Any>)

    /**
     * The authorization mode to use for subscribing to messages on the channel namespace.
     *
     * This configuration overrides the default `Api` authorization configuration.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appsync-channelnamespace.html#cfn-appsync-channelnamespace-subscribeauthmodes)
     * @param subscribeAuthModes The authorization mode to use for subscribing to messages on the
     * channel namespace. 
     */
    public fun subscribeAuthModes(vararg subscribeAuthModes: Any)

    /**
     * A set of tags (key-value pairs) for this channel namespace.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appsync-channelnamespace.html#cfn-appsync-channelnamespace-tags)
     * @param tags A set of tags (key-value pairs) for this channel namespace. 
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * A set of tags (key-value pairs) for this channel namespace.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appsync-channelnamespace.html#cfn-appsync-channelnamespace-tags)
     * @param tags A set of tags (key-value pairs) for this channel namespace. 
     */
    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.appsync.CfnChannelNamespace.Builder =
        software.amazon.awscdk.services.appsync.CfnChannelNamespace.Builder.create(scope, id)

    /**
     * The `Api` ID.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appsync-channelnamespace.html#cfn-appsync-channelnamespace-apiid)
     * @param apiId The `Api` ID. 
     */
    override fun apiId(apiId: String) {
      cdkBuilder.apiId(apiId)
    }

    /**
     * The event handler functions that run custom business logic to process published events and
     * subscribe requests.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appsync-channelnamespace.html#cfn-appsync-channelnamespace-codehandlers)
     * @param codeHandlers The event handler functions that run custom business logic to process
     * published events and subscribe requests. 
     */
    override fun codeHandlers(codeHandlers: String) {
      cdkBuilder.codeHandlers(codeHandlers)
    }

    /**
     * The Amazon S3 endpoint where the code is located.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appsync-channelnamespace.html#cfn-appsync-channelnamespace-codes3location)
     * @param codeS3Location The Amazon S3 endpoint where the code is located. 
     */
    override fun codeS3Location(codeS3Location: String) {
      cdkBuilder.codeS3Location(codeS3Location)
    }

    /**
     * The configuration for the `OnPublish` and `OnSubscribe` handlers.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appsync-channelnamespace.html#cfn-appsync-channelnamespace-handlerconfigs)
     * @param handlerConfigs The configuration for the `OnPublish` and `OnSubscribe` handlers. 
     */
    override fun handlerConfigs(handlerConfigs: IResolvable) {
      cdkBuilder.handlerConfigs(handlerConfigs.let(IResolvable.Companion::unwrap))
    }

    /**
     * The configuration for the `OnPublish` and `OnSubscribe` handlers.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appsync-channelnamespace.html#cfn-appsync-channelnamespace-handlerconfigs)
     * @param handlerConfigs The configuration for the `OnPublish` and `OnSubscribe` handlers. 
     */
    override fun handlerConfigs(handlerConfigs: HandlerConfigsProperty) {
      cdkBuilder.handlerConfigs(handlerConfigs.let(HandlerConfigsProperty.Companion::unwrap))
    }

    /**
     * The configuration for the `OnPublish` and `OnSubscribe` handlers.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appsync-channelnamespace.html#cfn-appsync-channelnamespace-handlerconfigs)
     * @param handlerConfigs The configuration for the `OnPublish` and `OnSubscribe` handlers. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("d7a7d2d75ecd71604085b7a10c07525779f461fafdd70a605b1a7fe866911032")
    override fun handlerConfigs(handlerConfigs: HandlerConfigsProperty.Builder.() -> Unit): Unit =
        handlerConfigs(HandlerConfigsProperty(handlerConfigs))

    /**
     * The name of the channel namespace.
     *
     * This name must be unique within the `Api` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appsync-channelnamespace.html#cfn-appsync-channelnamespace-name)
     * @param name The name of the channel namespace. 
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    /**
     * The authorization mode to use for publishing messages on the channel namespace.
     *
     * This configuration overrides the default `Api` authorization configuration.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appsync-channelnamespace.html#cfn-appsync-channelnamespace-publishauthmodes)
     * @param publishAuthModes The authorization mode to use for publishing messages on the channel
     * namespace. 
     */
    override fun publishAuthModes(publishAuthModes: IResolvable) {
      cdkBuilder.publishAuthModes(publishAuthModes.let(IResolvable.Companion::unwrap))
    }

    /**
     * The authorization mode to use for publishing messages on the channel namespace.
     *
     * This configuration overrides the default `Api` authorization configuration.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appsync-channelnamespace.html#cfn-appsync-channelnamespace-publishauthmodes)
     * @param publishAuthModes The authorization mode to use for publishing messages on the channel
     * namespace. 
     */
    override fun publishAuthModes(publishAuthModes: List<Any>) {
      cdkBuilder.publishAuthModes(publishAuthModes.map{CdkObjectWrappers.unwrap(it)})
    }

    /**
     * The authorization mode to use for publishing messages on the channel namespace.
     *
     * This configuration overrides the default `Api` authorization configuration.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appsync-channelnamespace.html#cfn-appsync-channelnamespace-publishauthmodes)
     * @param publishAuthModes The authorization mode to use for publishing messages on the channel
     * namespace. 
     */
    override fun publishAuthModes(vararg publishAuthModes: Any): Unit =
        publishAuthModes(publishAuthModes.toList())

    /**
     * The authorization mode to use for subscribing to messages on the channel namespace.
     *
     * This configuration overrides the default `Api` authorization configuration.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appsync-channelnamespace.html#cfn-appsync-channelnamespace-subscribeauthmodes)
     * @param subscribeAuthModes The authorization mode to use for subscribing to messages on the
     * channel namespace. 
     */
    override fun subscribeAuthModes(subscribeAuthModes: IResolvable) {
      cdkBuilder.subscribeAuthModes(subscribeAuthModes.let(IResolvable.Companion::unwrap))
    }

    /**
     * The authorization mode to use for subscribing to messages on the channel namespace.
     *
     * This configuration overrides the default `Api` authorization configuration.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appsync-channelnamespace.html#cfn-appsync-channelnamespace-subscribeauthmodes)
     * @param subscribeAuthModes The authorization mode to use for subscribing to messages on the
     * channel namespace. 
     */
    override fun subscribeAuthModes(subscribeAuthModes: List<Any>) {
      cdkBuilder.subscribeAuthModes(subscribeAuthModes.map{CdkObjectWrappers.unwrap(it)})
    }

    /**
     * The authorization mode to use for subscribing to messages on the channel namespace.
     *
     * This configuration overrides the default `Api` authorization configuration.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appsync-channelnamespace.html#cfn-appsync-channelnamespace-subscribeauthmodes)
     * @param subscribeAuthModes The authorization mode to use for subscribing to messages on the
     * channel namespace. 
     */
    override fun subscribeAuthModes(vararg subscribeAuthModes: Any): Unit =
        subscribeAuthModes(subscribeAuthModes.toList())

    /**
     * A set of tags (key-value pairs) for this channel namespace.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appsync-channelnamespace.html#cfn-appsync-channelnamespace-tags)
     * @param tags A set of tags (key-value pairs) for this channel namespace. 
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag.Companion::unwrap))
    }

    /**
     * A set of tags (key-value pairs) for this channel namespace.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appsync-channelnamespace.html#cfn-appsync-channelnamespace-tags)
     * @param tags A set of tags (key-value pairs) for this channel namespace. 
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.appsync.CfnChannelNamespace =
        cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.appsync.CfnChannelNamespace.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnChannelNamespace {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnChannelNamespace(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.appsync.CfnChannelNamespace):
        CfnChannelNamespace = CfnChannelNamespace(cdkObject)

    internal fun unwrap(wrapped: CfnChannelNamespace):
        software.amazon.awscdk.services.appsync.CfnChannelNamespace = wrapped.cdkObject as
        software.amazon.awscdk.services.appsync.CfnChannelNamespace
  }

  /**
   * Describes an authorization configuration.
   *
   * Use `AuthMode` to specify the publishing and subscription authorization configuration for an
   * Event API.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.appsync.*;
   * AuthModeProperty authModeProperty = AuthModeProperty.builder()
   * .authType("authType")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appsync-channelnamespace-authmode.html)
   */
  public interface AuthModeProperty {
    /**
     * The authorization type.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appsync-channelnamespace-authmode.html#cfn-appsync-channelnamespace-authmode-authtype)
     */
    public fun authType(): String? = unwrap(this).getAuthType()

    /**
     * A builder for [AuthModeProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param authType The authorization type.
       */
      public fun authType(authType: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.appsync.CfnChannelNamespace.AuthModeProperty.Builder =
          software.amazon.awscdk.services.appsync.CfnChannelNamespace.AuthModeProperty.builder()

      /**
       * @param authType The authorization type.
       */
      override fun authType(authType: String) {
        cdkBuilder.authType(authType)
      }

      public fun build():
          software.amazon.awscdk.services.appsync.CfnChannelNamespace.AuthModeProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.appsync.CfnChannelNamespace.AuthModeProperty,
    ) : CdkObject(cdkObject),
        AuthModeProperty {
      /**
       * The authorization type.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appsync-channelnamespace-authmode.html#cfn-appsync-channelnamespace-authmode-authtype)
       */
      override fun authType(): String? = unwrap(this).getAuthType()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): AuthModeProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.appsync.CfnChannelNamespace.AuthModeProperty):
          AuthModeProperty = CdkObjectWrappers.wrap(cdkObject) as? AuthModeProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: AuthModeProperty):
          software.amazon.awscdk.services.appsync.CfnChannelNamespace.AuthModeProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.appsync.CfnChannelNamespace.AuthModeProperty
    }
  }

  /**
   * The `HandlerConfig` property type specifies the configuration for the handler.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.appsync.*;
   * HandlerConfigProperty handlerConfigProperty = HandlerConfigProperty.builder()
   * .behavior("behavior")
   * .integration(IntegrationProperty.builder()
   * .dataSourceName("dataSourceName")
   * // the properties below are optional
   * .lambdaConfig(LambdaConfigProperty.builder()
   * .invokeType("invokeType")
   * .build())
   * .build())
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appsync-channelnamespace-handlerconfig.html)
   */
  public interface HandlerConfigProperty {
    /**
     * The behavior for the handler.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appsync-channelnamespace-handlerconfig.html#cfn-appsync-channelnamespace-handlerconfig-behavior)
     */
    public fun behavior(): String

    /**
     * The integration data source configuration for the handler.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appsync-channelnamespace-handlerconfig.html#cfn-appsync-channelnamespace-handlerconfig-integration)
     */
    public fun integration(): Any

    /**
     * A builder for [HandlerConfigProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param behavior The behavior for the handler. 
       */
      public fun behavior(behavior: String)

      /**
       * @param integration The integration data source configuration for the handler. 
       */
      public fun integration(integration: IResolvable)

      /**
       * @param integration The integration data source configuration for the handler. 
       */
      public fun integration(integration: IntegrationProperty)

      /**
       * @param integration The integration data source configuration for the handler. 
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("3e7a2a5433b50a3f04b429ba18c97bd39b241e8370e6a13152ca4fabbd1a1c3b")
      public fun integration(integration: IntegrationProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.appsync.CfnChannelNamespace.HandlerConfigProperty.Builder
          =
          software.amazon.awscdk.services.appsync.CfnChannelNamespace.HandlerConfigProperty.builder()

      /**
       * @param behavior The behavior for the handler. 
       */
      override fun behavior(behavior: String) {
        cdkBuilder.behavior(behavior)
      }

      /**
       * @param integration The integration data source configuration for the handler. 
       */
      override fun integration(integration: IResolvable) {
        cdkBuilder.integration(integration.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param integration The integration data source configuration for the handler. 
       */
      override fun integration(integration: IntegrationProperty) {
        cdkBuilder.integration(integration.let(IntegrationProperty.Companion::unwrap))
      }

      /**
       * @param integration The integration data source configuration for the handler. 
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("3e7a2a5433b50a3f04b429ba18c97bd39b241e8370e6a13152ca4fabbd1a1c3b")
      override fun integration(integration: IntegrationProperty.Builder.() -> Unit): Unit =
          integration(IntegrationProperty(integration))

      public fun build():
          software.amazon.awscdk.services.appsync.CfnChannelNamespace.HandlerConfigProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.appsync.CfnChannelNamespace.HandlerConfigProperty,
    ) : CdkObject(cdkObject),
        HandlerConfigProperty {
      /**
       * The behavior for the handler.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appsync-channelnamespace-handlerconfig.html#cfn-appsync-channelnamespace-handlerconfig-behavior)
       */
      override fun behavior(): String = unwrap(this).getBehavior()

      /**
       * The integration data source configuration for the handler.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appsync-channelnamespace-handlerconfig.html#cfn-appsync-channelnamespace-handlerconfig-integration)
       */
      override fun integration(): Any = unwrap(this).getIntegration()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): HandlerConfigProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.appsync.CfnChannelNamespace.HandlerConfigProperty):
          HandlerConfigProperty = CdkObjectWrappers.wrap(cdkObject) as? HandlerConfigProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: HandlerConfigProperty):
          software.amazon.awscdk.services.appsync.CfnChannelNamespace.HandlerConfigProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.appsync.CfnChannelNamespace.HandlerConfigProperty
    }
  }

  /**
   * The `HandlerConfigs` property type specifies the configuration for the `OnPublish` and
   * `OnSubscribe` handlers.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.appsync.*;
   * HandlerConfigsProperty handlerConfigsProperty = HandlerConfigsProperty.builder()
   * .onPublish(HandlerConfigProperty.builder()
   * .behavior("behavior")
   * .integration(IntegrationProperty.builder()
   * .dataSourceName("dataSourceName")
   * // the properties below are optional
   * .lambdaConfig(LambdaConfigProperty.builder()
   * .invokeType("invokeType")
   * .build())
   * .build())
   * .build())
   * .onSubscribe(HandlerConfigProperty.builder()
   * .behavior("behavior")
   * .integration(IntegrationProperty.builder()
   * .dataSourceName("dataSourceName")
   * // the properties below are optional
   * .lambdaConfig(LambdaConfigProperty.builder()
   * .invokeType("invokeType")
   * .build())
   * .build())
   * .build())
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appsync-channelnamespace-handlerconfigs.html)
   */
  public interface HandlerConfigsProperty {
    /**
     * The configuration for the `OnPublish` handler.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appsync-channelnamespace-handlerconfigs.html#cfn-appsync-channelnamespace-handlerconfigs-onpublish)
     */
    public fun onPublish(): Any? = unwrap(this).getOnPublish()

    /**
     * The configuration for the `OnSubscribe` handler.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appsync-channelnamespace-handlerconfigs.html#cfn-appsync-channelnamespace-handlerconfigs-onsubscribe)
     */
    public fun onSubscribe(): Any? = unwrap(this).getOnSubscribe()

    /**
     * A builder for [HandlerConfigsProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param onPublish The configuration for the `OnPublish` handler.
       */
      public fun onPublish(onPublish: IResolvable)

      /**
       * @param onPublish The configuration for the `OnPublish` handler.
       */
      public fun onPublish(onPublish: HandlerConfigProperty)

      /**
       * @param onPublish The configuration for the `OnPublish` handler.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("a26270b45cb4d532b676b262d9054a98b5c664b9f94a97d853475102b2e3646c")
      public fun onPublish(onPublish: HandlerConfigProperty.Builder.() -> Unit)

      /**
       * @param onSubscribe The configuration for the `OnSubscribe` handler.
       */
      public fun onSubscribe(onSubscribe: IResolvable)

      /**
       * @param onSubscribe The configuration for the `OnSubscribe` handler.
       */
      public fun onSubscribe(onSubscribe: HandlerConfigProperty)

      /**
       * @param onSubscribe The configuration for the `OnSubscribe` handler.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("424289d922950171397d2ffa222c1b535f77c475083906fb9208a3d8b256532b")
      public fun onSubscribe(onSubscribe: HandlerConfigProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.appsync.CfnChannelNamespace.HandlerConfigsProperty.Builder
          =
          software.amazon.awscdk.services.appsync.CfnChannelNamespace.HandlerConfigsProperty.builder()

      /**
       * @param onPublish The configuration for the `OnPublish` handler.
       */
      override fun onPublish(onPublish: IResolvable) {
        cdkBuilder.onPublish(onPublish.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param onPublish The configuration for the `OnPublish` handler.
       */
      override fun onPublish(onPublish: HandlerConfigProperty) {
        cdkBuilder.onPublish(onPublish.let(HandlerConfigProperty.Companion::unwrap))
      }

      /**
       * @param onPublish The configuration for the `OnPublish` handler.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("a26270b45cb4d532b676b262d9054a98b5c664b9f94a97d853475102b2e3646c")
      override fun onPublish(onPublish: HandlerConfigProperty.Builder.() -> Unit): Unit =
          onPublish(HandlerConfigProperty(onPublish))

      /**
       * @param onSubscribe The configuration for the `OnSubscribe` handler.
       */
      override fun onSubscribe(onSubscribe: IResolvable) {
        cdkBuilder.onSubscribe(onSubscribe.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param onSubscribe The configuration for the `OnSubscribe` handler.
       */
      override fun onSubscribe(onSubscribe: HandlerConfigProperty) {
        cdkBuilder.onSubscribe(onSubscribe.let(HandlerConfigProperty.Companion::unwrap))
      }

      /**
       * @param onSubscribe The configuration for the `OnSubscribe` handler.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("424289d922950171397d2ffa222c1b535f77c475083906fb9208a3d8b256532b")
      override fun onSubscribe(onSubscribe: HandlerConfigProperty.Builder.() -> Unit): Unit =
          onSubscribe(HandlerConfigProperty(onSubscribe))

      public fun build():
          software.amazon.awscdk.services.appsync.CfnChannelNamespace.HandlerConfigsProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.appsync.CfnChannelNamespace.HandlerConfigsProperty,
    ) : CdkObject(cdkObject),
        HandlerConfigsProperty {
      /**
       * The configuration for the `OnPublish` handler.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appsync-channelnamespace-handlerconfigs.html#cfn-appsync-channelnamespace-handlerconfigs-onpublish)
       */
      override fun onPublish(): Any? = unwrap(this).getOnPublish()

      /**
       * The configuration for the `OnSubscribe` handler.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appsync-channelnamespace-handlerconfigs.html#cfn-appsync-channelnamespace-handlerconfigs-onsubscribe)
       */
      override fun onSubscribe(): Any? = unwrap(this).getOnSubscribe()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): HandlerConfigsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.appsync.CfnChannelNamespace.HandlerConfigsProperty):
          HandlerConfigsProperty = CdkObjectWrappers.wrap(cdkObject) as? HandlerConfigsProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: HandlerConfigsProperty):
          software.amazon.awscdk.services.appsync.CfnChannelNamespace.HandlerConfigsProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.appsync.CfnChannelNamespace.HandlerConfigsProperty
    }
  }

  /**
   * The `Integration` property type specifies the integration data source configuration for the
   * handler.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.appsync.*;
   * IntegrationProperty integrationProperty = IntegrationProperty.builder()
   * .dataSourceName("dataSourceName")
   * // the properties below are optional
   * .lambdaConfig(LambdaConfigProperty.builder()
   * .invokeType("invokeType")
   * .build())
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appsync-channelnamespace-integration.html)
   */
  public interface IntegrationProperty {
    /**
     * The unique name of the data source that has been configured on the API.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appsync-channelnamespace-integration.html#cfn-appsync-channelnamespace-integration-datasourcename)
     */
    public fun dataSourceName(): String

    /**
     * The configuration for a Lambda data source.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appsync-channelnamespace-integration.html#cfn-appsync-channelnamespace-integration-lambdaconfig)
     */
    public fun lambdaConfig(): Any? = unwrap(this).getLambdaConfig()

    /**
     * A builder for [IntegrationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param dataSourceName The unique name of the data source that has been configured on the
       * API. 
       */
      public fun dataSourceName(dataSourceName: String)

      /**
       * @param lambdaConfig The configuration for a Lambda data source.
       */
      public fun lambdaConfig(lambdaConfig: IResolvable)

      /**
       * @param lambdaConfig The configuration for a Lambda data source.
       */
      public fun lambdaConfig(lambdaConfig: LambdaConfigProperty)

      /**
       * @param lambdaConfig The configuration for a Lambda data source.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("dad947fb7691d22e720e5f857a68a3c7c206032c3d2506bbffc8f4a649109532")
      public fun lambdaConfig(lambdaConfig: LambdaConfigProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.appsync.CfnChannelNamespace.IntegrationProperty.Builder =
          software.amazon.awscdk.services.appsync.CfnChannelNamespace.IntegrationProperty.builder()

      /**
       * @param dataSourceName The unique name of the data source that has been configured on the
       * API. 
       */
      override fun dataSourceName(dataSourceName: String) {
        cdkBuilder.dataSourceName(dataSourceName)
      }

      /**
       * @param lambdaConfig The configuration for a Lambda data source.
       */
      override fun lambdaConfig(lambdaConfig: IResolvable) {
        cdkBuilder.lambdaConfig(lambdaConfig.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param lambdaConfig The configuration for a Lambda data source.
       */
      override fun lambdaConfig(lambdaConfig: LambdaConfigProperty) {
        cdkBuilder.lambdaConfig(lambdaConfig.let(LambdaConfigProperty.Companion::unwrap))
      }

      /**
       * @param lambdaConfig The configuration for a Lambda data source.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("dad947fb7691d22e720e5f857a68a3c7c206032c3d2506bbffc8f4a649109532")
      override fun lambdaConfig(lambdaConfig: LambdaConfigProperty.Builder.() -> Unit): Unit =
          lambdaConfig(LambdaConfigProperty(lambdaConfig))

      public fun build():
          software.amazon.awscdk.services.appsync.CfnChannelNamespace.IntegrationProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.appsync.CfnChannelNamespace.IntegrationProperty,
    ) : CdkObject(cdkObject),
        IntegrationProperty {
      /**
       * The unique name of the data source that has been configured on the API.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appsync-channelnamespace-integration.html#cfn-appsync-channelnamespace-integration-datasourcename)
       */
      override fun dataSourceName(): String = unwrap(this).getDataSourceName()

      /**
       * The configuration for a Lambda data source.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appsync-channelnamespace-integration.html#cfn-appsync-channelnamespace-integration-lambdaconfig)
       */
      override fun lambdaConfig(): Any? = unwrap(this).getLambdaConfig()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): IntegrationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.appsync.CfnChannelNamespace.IntegrationProperty):
          IntegrationProperty = CdkObjectWrappers.wrap(cdkObject) as? IntegrationProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: IntegrationProperty):
          software.amazon.awscdk.services.appsync.CfnChannelNamespace.IntegrationProperty = (wrapped
          as CdkObject).cdkObject as
          software.amazon.awscdk.services.appsync.CfnChannelNamespace.IntegrationProperty
    }
  }

  /**
   * The `LambdaConfig` property type specifies the integration configuration for a Lambda data
   * source.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.appsync.*;
   * LambdaConfigProperty lambdaConfigProperty = LambdaConfigProperty.builder()
   * .invokeType("invokeType")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appsync-channelnamespace-lambdaconfig.html)
   */
  public interface LambdaConfigProperty {
    /**
     * The invocation type for a Lambda data source.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appsync-channelnamespace-lambdaconfig.html#cfn-appsync-channelnamespace-lambdaconfig-invoketype)
     */
    public fun invokeType(): String

    /**
     * A builder for [LambdaConfigProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param invokeType The invocation type for a Lambda data source. 
       */
      public fun invokeType(invokeType: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.appsync.CfnChannelNamespace.LambdaConfigProperty.Builder =
          software.amazon.awscdk.services.appsync.CfnChannelNamespace.LambdaConfigProperty.builder()

      /**
       * @param invokeType The invocation type for a Lambda data source. 
       */
      override fun invokeType(invokeType: String) {
        cdkBuilder.invokeType(invokeType)
      }

      public fun build():
          software.amazon.awscdk.services.appsync.CfnChannelNamespace.LambdaConfigProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.appsync.CfnChannelNamespace.LambdaConfigProperty,
    ) : CdkObject(cdkObject),
        LambdaConfigProperty {
      /**
       * The invocation type for a Lambda data source.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appsync-channelnamespace-lambdaconfig.html#cfn-appsync-channelnamespace-lambdaconfig-invoketype)
       */
      override fun invokeType(): String = unwrap(this).getInvokeType()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): LambdaConfigProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.appsync.CfnChannelNamespace.LambdaConfigProperty):
          LambdaConfigProperty = CdkObjectWrappers.wrap(cdkObject) as? LambdaConfigProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: LambdaConfigProperty):
          software.amazon.awscdk.services.appsync.CfnChannelNamespace.LambdaConfigProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.appsync.CfnChannelNamespace.LambdaConfigProperty
    }
  }
}
