@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ivschat

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.ITaggable
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * The `AWS::IVSChat::Room` resource specifies an  room that allows clients to connect and pass
 * messages.
 *
 * For more information, see
 * [CreateRoom](https://docs.aws.amazon.com/ivs/latest/ChatAPIReference/API_CreateRoom.html) in the
 * *Amazon Interactive Video Service Chat API Reference* .
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.ivschat.*;
 * CfnRoom cfnRoom = CfnRoom.Builder.create(this, "MyCfnRoom")
 * .loggingConfigurationIdentifiers(List.of("loggingConfigurationIdentifiers"))
 * .maximumMessageLength(123)
 * .maximumMessageRatePerSecond(123)
 * .messageReviewHandler(MessageReviewHandlerProperty.builder()
 * .fallbackResult("fallbackResult")
 * .uri("uri")
 * .build())
 * .name("name")
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ivschat-room.html)
 */
public open class CfnRoom internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.ivschat.CfnRoom,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  public constructor(scope: CloudshiftdevConstructsConstruct, id: String) :
      this(software.amazon.awscdk.services.ivschat.CfnRoom(scope.let(CloudshiftdevConstructsConstruct::unwrap),
      id)
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnRoomProps,
  ) :
      this(software.amazon.awscdk.services.ivschat.CfnRoom(scope.let(CloudshiftdevConstructsConstruct::unwrap),
      id, props.let(CfnRoomProps::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnRoomProps.Builder.() -> Unit,
  ) : this(scope, id, CfnRoomProps(props)
  )

  /**
   * The room ARN.
   *
   * For example: `arn:aws:ivschat:us-west-2:123456789012:room/abcdABCDefgh`
   */
  public open fun attrArn(): String = unwrap(this).getAttrArn()

  /**
   * The room ID.
   *
   * For example: `abcdABCDefgh`
   */
  public open fun attrId(): String = unwrap(this).getAttrId()

  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  /**
   * List of logging-configuration identifiers attached to the room.
   */
  public open fun loggingConfigurationIdentifiers(): List<String> =
      unwrap(this).getLoggingConfigurationIdentifiers() ?: emptyList()

  /**
   * List of logging-configuration identifiers attached to the room.
   */
  public open fun loggingConfigurationIdentifiers(`value`: List<String>) {
    unwrap(this).setLoggingConfigurationIdentifiers(`value`)
  }

  /**
   * List of logging-configuration identifiers attached to the room.
   */
  public open fun loggingConfigurationIdentifiers(vararg `value`: String): Unit =
      loggingConfigurationIdentifiers(`value`.toList())

  /**
   * Maximum number of characters in a single message.
   */
  public open fun maximumMessageLength(): Number? = unwrap(this).getMaximumMessageLength()

  /**
   * Maximum number of characters in a single message.
   */
  public open fun maximumMessageLength(`value`: Number) {
    unwrap(this).setMaximumMessageLength(`value`)
  }

  /**
   * Maximum number of messages per second that can be sent to the room (by all clients).
   */
  public open fun maximumMessageRatePerSecond(): Number? =
      unwrap(this).getMaximumMessageRatePerSecond()

  /**
   * Maximum number of messages per second that can be sent to the room (by all clients).
   */
  public open fun maximumMessageRatePerSecond(`value`: Number) {
    unwrap(this).setMaximumMessageRatePerSecond(`value`)
  }

  /**
   * Configuration information for optional review of messages.
   */
  public open fun messageReviewHandler(): Any? = unwrap(this).getMessageReviewHandler()

  /**
   * Configuration information for optional review of messages.
   */
  public open fun messageReviewHandler(`value`: IResolvable) {
    unwrap(this).setMessageReviewHandler(`value`.let(IResolvable::unwrap))
  }

  /**
   * Configuration information for optional review of messages.
   */
  public open fun messageReviewHandler(`value`: MessageReviewHandlerProperty) {
    unwrap(this).setMessageReviewHandler(`value`.let(MessageReviewHandlerProperty::unwrap))
  }

  /**
   * Configuration information for optional review of messages.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("0e29e2644e41e61c4918568854141c919460123dfe0df4cbd64ae77718ca4c93")
  public open fun messageReviewHandler(`value`: MessageReviewHandlerProperty.Builder.() -> Unit):
      Unit = messageReviewHandler(MessageReviewHandlerProperty(`value`))

  /**
   * Room name.
   */
  public open fun name(): String? = unwrap(this).getName()

  /**
   * Room name.
   */
  public open fun name(`value`: String) {
    unwrap(this).setName(`value`)
  }

  /**
   * Tag Manager which manages the tags for this resource.
   */
  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  /**
   * An array of key-value pairs to apply to this resource.
   */
  public open fun tagsRaw(): List<CfnTag> = unwrap(this).getTagsRaw()?.map(CfnTag::wrap) ?:
      emptyList()

  /**
   * An array of key-value pairs to apply to this resource.
   */
  public open fun tagsRaw(`value`: List<CfnTag>) {
    unwrap(this).setTagsRaw(`value`.map(CfnTag::unwrap))
  }

  /**
   * An array of key-value pairs to apply to this resource.
   */
  public open fun tagsRaw(vararg `value`: CfnTag): Unit = tagsRaw(`value`.toList())

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.ivschat.CfnRoom].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * List of logging-configuration identifiers attached to the room.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ivschat-room.html#cfn-ivschat-room-loggingconfigurationidentifiers)
     * @param loggingConfigurationIdentifiers List of logging-configuration identifiers attached to
     * the room. 
     */
    public fun loggingConfigurationIdentifiers(loggingConfigurationIdentifiers: List<String>)

    /**
     * List of logging-configuration identifiers attached to the room.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ivschat-room.html#cfn-ivschat-room-loggingconfigurationidentifiers)
     * @param loggingConfigurationIdentifiers List of logging-configuration identifiers attached to
     * the room. 
     */
    public fun loggingConfigurationIdentifiers(vararg loggingConfigurationIdentifiers: String)

    /**
     * Maximum number of characters in a single message.
     *
     * Messages are expected to be UTF-8 encoded and this limit applies specifically to
     * rune/code-point count, not number of bytes.
     *
     * Default: - 500
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ivschat-room.html#cfn-ivschat-room-maximummessagelength)
     * @param maximumMessageLength Maximum number of characters in a single message. 
     */
    public fun maximumMessageLength(maximumMessageLength: Number)

    /**
     * Maximum number of messages per second that can be sent to the room (by all clients).
     *
     * Default: - 10
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ivschat-room.html#cfn-ivschat-room-maximummessageratepersecond)
     * @param maximumMessageRatePerSecond Maximum number of messages per second that can be sent to
     * the room (by all clients). 
     */
    public fun maximumMessageRatePerSecond(maximumMessageRatePerSecond: Number)

    /**
     * Configuration information for optional review of messages.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ivschat-room.html#cfn-ivschat-room-messagereviewhandler)
     * @param messageReviewHandler Configuration information for optional review of messages. 
     */
    public fun messageReviewHandler(messageReviewHandler: IResolvable)

    /**
     * Configuration information for optional review of messages.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ivschat-room.html#cfn-ivschat-room-messagereviewhandler)
     * @param messageReviewHandler Configuration information for optional review of messages. 
     */
    public fun messageReviewHandler(messageReviewHandler: MessageReviewHandlerProperty)

    /**
     * Configuration information for optional review of messages.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ivschat-room.html#cfn-ivschat-room-messagereviewhandler)
     * @param messageReviewHandler Configuration information for optional review of messages. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("3e81b16974c7ad0a6acdf5a37615c7459552040bc7b0daa1c70fc56505d6925b")
    public
        fun messageReviewHandler(messageReviewHandler: MessageReviewHandlerProperty.Builder.() -> Unit)

    /**
     * Room name.
     *
     * The value does not need to be unique.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ivschat-room.html#cfn-ivschat-room-name)
     * @param name Room name. 
     */
    public fun name(name: String)

    /**
     * An array of key-value pairs to apply to this resource.
     *
     * For more information, see
     * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ivschat-room-tag.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ivschat-room.html#cfn-ivschat-room-tags)
     * @param tags An array of key-value pairs to apply to this resource. 
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * An array of key-value pairs to apply to this resource.
     *
     * For more information, see
     * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ivschat-room-tag.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ivschat-room.html#cfn-ivschat-room-tags)
     * @param tags An array of key-value pairs to apply to this resource. 
     */
    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ivschat.CfnRoom.Builder =
        software.amazon.awscdk.services.ivschat.CfnRoom.Builder.create(scope, id)

    /**
     * List of logging-configuration identifiers attached to the room.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ivschat-room.html#cfn-ivschat-room-loggingconfigurationidentifiers)
     * @param loggingConfigurationIdentifiers List of logging-configuration identifiers attached to
     * the room. 
     */
    override fun loggingConfigurationIdentifiers(loggingConfigurationIdentifiers: List<String>) {
      cdkBuilder.loggingConfigurationIdentifiers(loggingConfigurationIdentifiers)
    }

    /**
     * List of logging-configuration identifiers attached to the room.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ivschat-room.html#cfn-ivschat-room-loggingconfigurationidentifiers)
     * @param loggingConfigurationIdentifiers List of logging-configuration identifiers attached to
     * the room. 
     */
    override fun loggingConfigurationIdentifiers(vararg loggingConfigurationIdentifiers: String):
        Unit = loggingConfigurationIdentifiers(loggingConfigurationIdentifiers.toList())

    /**
     * Maximum number of characters in a single message.
     *
     * Messages are expected to be UTF-8 encoded and this limit applies specifically to
     * rune/code-point count, not number of bytes.
     *
     * Default: - 500
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ivschat-room.html#cfn-ivschat-room-maximummessagelength)
     * @param maximumMessageLength Maximum number of characters in a single message. 
     */
    override fun maximumMessageLength(maximumMessageLength: Number) {
      cdkBuilder.maximumMessageLength(maximumMessageLength)
    }

    /**
     * Maximum number of messages per second that can be sent to the room (by all clients).
     *
     * Default: - 10
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ivschat-room.html#cfn-ivschat-room-maximummessageratepersecond)
     * @param maximumMessageRatePerSecond Maximum number of messages per second that can be sent to
     * the room (by all clients). 
     */
    override fun maximumMessageRatePerSecond(maximumMessageRatePerSecond: Number) {
      cdkBuilder.maximumMessageRatePerSecond(maximumMessageRatePerSecond)
    }

    /**
     * Configuration information for optional review of messages.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ivschat-room.html#cfn-ivschat-room-messagereviewhandler)
     * @param messageReviewHandler Configuration information for optional review of messages. 
     */
    override fun messageReviewHandler(messageReviewHandler: IResolvable) {
      cdkBuilder.messageReviewHandler(messageReviewHandler.let(IResolvable::unwrap))
    }

    /**
     * Configuration information for optional review of messages.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ivschat-room.html#cfn-ivschat-room-messagereviewhandler)
     * @param messageReviewHandler Configuration information for optional review of messages. 
     */
    override fun messageReviewHandler(messageReviewHandler: MessageReviewHandlerProperty) {
      cdkBuilder.messageReviewHandler(messageReviewHandler.let(MessageReviewHandlerProperty::unwrap))
    }

    /**
     * Configuration information for optional review of messages.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ivschat-room.html#cfn-ivschat-room-messagereviewhandler)
     * @param messageReviewHandler Configuration information for optional review of messages. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("3e81b16974c7ad0a6acdf5a37615c7459552040bc7b0daa1c70fc56505d6925b")
    override
        fun messageReviewHandler(messageReviewHandler: MessageReviewHandlerProperty.Builder.() -> Unit):
        Unit = messageReviewHandler(MessageReviewHandlerProperty(messageReviewHandler))

    /**
     * Room name.
     *
     * The value does not need to be unique.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ivschat-room.html#cfn-ivschat-room-name)
     * @param name Room name. 
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    /**
     * An array of key-value pairs to apply to this resource.
     *
     * For more information, see
     * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ivschat-room-tag.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ivschat-room.html#cfn-ivschat-room-tags)
     * @param tags An array of key-value pairs to apply to this resource. 
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    /**
     * An array of key-value pairs to apply to this resource.
     *
     * For more information, see
     * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ivschat-room-tag.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ivschat-room.html#cfn-ivschat-room-tags)
     * @param tags An array of key-value pairs to apply to this resource. 
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.ivschat.CfnRoom = cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.ivschat.CfnRoom.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnRoom {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnRoom(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ivschat.CfnRoom): CfnRoom =
        CfnRoom(cdkObject)

    internal fun unwrap(wrapped: CfnRoom): software.amazon.awscdk.services.ivschat.CfnRoom =
        wrapped.cdkObject
  }

  /**
   * The MessageReviewHandler property type specifies configuration information for optional message
   * review.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.ivschat.*;
   * MessageReviewHandlerProperty messageReviewHandlerProperty =
   * MessageReviewHandlerProperty.builder()
   * .fallbackResult("fallbackResult")
   * .uri("uri")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ivschat-room-messagereviewhandler.html)
   */
  public interface MessageReviewHandlerProperty {
    /**
     * Specifies the fallback behavior (whether the message is allowed or denied) if the handler
     * does not return a valid response, encounters an error, or times out.
     *
     * (For the timeout period, see [Service
     * Quotas](https://docs.aws.amazon.com/ivs/latest/userguide/service-quotas.html) .) If allowed, the
     * message is delivered with returned content to all users connected to the room. If denied, the
     * message is not delivered to any user.
     *
     * *Default* : `ALLOW`
     *
     * Default: - "ALLOW"
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ivschat-room-messagereviewhandler.html#cfn-ivschat-room-messagereviewhandler-fallbackresult)
     */
    public fun fallbackResult(): String? = unwrap(this).getFallbackResult()

    /**
     * Identifier of the message review handler.
     *
     * Currently this must be an ARN of a lambda function.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ivschat-room-messagereviewhandler.html#cfn-ivschat-room-messagereviewhandler-uri)
     */
    public fun uri(): String? = unwrap(this).getUri()

    /**
     * A builder for [MessageReviewHandlerProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param fallbackResult Specifies the fallback behavior (whether the message is allowed or
       * denied) if the handler does not return a valid response, encounters an error, or times out.
       * (For the timeout period, see [Service
       * Quotas](https://docs.aws.amazon.com/ivs/latest/userguide/service-quotas.html) .) If allowed,
       * the message is delivered with returned content to all users connected to the room. If denied,
       * the message is not delivered to any user.
       *
       * *Default* : `ALLOW`
       */
      public fun fallbackResult(fallbackResult: String)

      /**
       * @param uri Identifier of the message review handler.
       * Currently this must be an ARN of a lambda function.
       */
      public fun uri(uri: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.ivschat.CfnRoom.MessageReviewHandlerProperty.Builder =
          software.amazon.awscdk.services.ivschat.CfnRoom.MessageReviewHandlerProperty.builder()

      /**
       * @param fallbackResult Specifies the fallback behavior (whether the message is allowed or
       * denied) if the handler does not return a valid response, encounters an error, or times out.
       * (For the timeout period, see [Service
       * Quotas](https://docs.aws.amazon.com/ivs/latest/userguide/service-quotas.html) .) If allowed,
       * the message is delivered with returned content to all users connected to the room. If denied,
       * the message is not delivered to any user.
       *
       * *Default* : `ALLOW`
       */
      override fun fallbackResult(fallbackResult: String) {
        cdkBuilder.fallbackResult(fallbackResult)
      }

      /**
       * @param uri Identifier of the message review handler.
       * Currently this must be an ARN of a lambda function.
       */
      override fun uri(uri: String) {
        cdkBuilder.uri(uri)
      }

      public fun build():
          software.amazon.awscdk.services.ivschat.CfnRoom.MessageReviewHandlerProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.ivschat.CfnRoom.MessageReviewHandlerProperty,
    ) : CdkObject(cdkObject), MessageReviewHandlerProperty {
      /**
       * Specifies the fallback behavior (whether the message is allowed or denied) if the handler
       * does not return a valid response, encounters an error, or times out.
       *
       * (For the timeout period, see [Service
       * Quotas](https://docs.aws.amazon.com/ivs/latest/userguide/service-quotas.html) .) If allowed,
       * the message is delivered with returned content to all users connected to the room. If denied,
       * the message is not delivered to any user.
       *
       * *Default* : `ALLOW`
       *
       * Default: - "ALLOW"
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ivschat-room-messagereviewhandler.html#cfn-ivschat-room-messagereviewhandler-fallbackresult)
       */
      override fun fallbackResult(): String? = unwrap(this).getFallbackResult()

      /**
       * Identifier of the message review handler.
       *
       * Currently this must be an ARN of a lambda function.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ivschat-room-messagereviewhandler.html#cfn-ivschat-room-messagereviewhandler-uri)
       */
      override fun uri(): String? = unwrap(this).getUri()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): MessageReviewHandlerProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.ivschat.CfnRoom.MessageReviewHandlerProperty):
          MessageReviewHandlerProperty = CdkObjectWrappers.wrap(cdkObject) as?
          MessageReviewHandlerProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: MessageReviewHandlerProperty):
          software.amazon.awscdk.services.ivschat.CfnRoom.MessageReviewHandlerProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.ivschat.CfnRoom.MessageReviewHandlerProperty
    }
  }
}
