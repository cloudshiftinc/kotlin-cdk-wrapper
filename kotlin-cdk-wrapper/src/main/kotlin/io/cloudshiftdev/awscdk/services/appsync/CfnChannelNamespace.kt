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
}
