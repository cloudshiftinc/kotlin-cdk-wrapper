package io.cloudshiftdev.awscdk.services.ivschat

import io.cloudshiftdev.awscdk.CdkObject
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.Number
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

public interface CfnRoomProps {
  /**
   * List of logging-configuration identifiers attached to the room.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ivschat-room.html#cfn-ivschat-room-loggingconfigurationidentifiers)
   */
  public fun loggingConfigurationIdentifiers(): List<String> =
      unwrap(this).getLoggingConfigurationIdentifiers() ?: emptyList()

  /**
   * Maximum number of characters in a single message.
   *
   * Messages are expected to be UTF-8 encoded and this limit applies specifically to
   * rune/code-point count, not number of bytes.
   *
   * Default: - 500
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ivschat-room.html#cfn-ivschat-room-maximummessagelength)
   */
  public fun maximumMessageLength(): Number? = unwrap(this).getMaximumMessageLength()

  /**
   * Maximum number of messages per second that can be sent to the room (by all clients).
   *
   * Default: - 10
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ivschat-room.html#cfn-ivschat-room-maximummessageratepersecond)
   */
  public fun maximumMessageRatePerSecond(): Number? = unwrap(this).getMaximumMessageRatePerSecond()

  /**
   * Configuration information for optional review of messages.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ivschat-room.html#cfn-ivschat-room-messagereviewhandler)
   */
  public fun messageReviewHandler(): Any? = unwrap(this).getMessageReviewHandler()

  /**
   * Room name.
   *
   * The value does not need to be unique.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ivschat-room.html#cfn-ivschat-room-name)
   */
  public fun name(): String? = unwrap(this).getName()

  /**
   * An array of key-value pairs to apply to this resource.
   *
   * For more information, see
   * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ivschat-room-tag.html)
   * .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ivschat-room.html#cfn-ivschat-room-tags)
   */
  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * A builder for [CfnRoomProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param loggingConfigurationIdentifiers List of logging-configuration identifiers attached to
     * the room.
     */
    public fun loggingConfigurationIdentifiers(loggingConfigurationIdentifiers: List<String>)

    /**
     * @param loggingConfigurationIdentifiers List of logging-configuration identifiers attached to
     * the room.
     */
    public fun loggingConfigurationIdentifiers(vararg loggingConfigurationIdentifiers: String)

    /**
     * @param maximumMessageLength Maximum number of characters in a single message.
     * Messages are expected to be UTF-8 encoded and this limit applies specifically to
     * rune/code-point count, not number of bytes.
     */
    public fun maximumMessageLength(maximumMessageLength: Number)

    /**
     * @param maximumMessageRatePerSecond Maximum number of messages per second that can be sent to
     * the room (by all clients).
     */
    public fun maximumMessageRatePerSecond(maximumMessageRatePerSecond: Number)

    /**
     * @param messageReviewHandler Configuration information for optional review of messages.
     */
    public fun messageReviewHandler(messageReviewHandler: IResolvable)

    /**
     * @param messageReviewHandler Configuration information for optional review of messages.
     */
    public fun messageReviewHandler(messageReviewHandler: CfnRoom.MessageReviewHandlerProperty)

    /**
     * @param messageReviewHandler Configuration information for optional review of messages.
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("714a5b381acd25976032e32895346cb9f72b174549e6f02a573beebdb7cce783")
    public
        fun messageReviewHandler(messageReviewHandler: CfnRoom.MessageReviewHandlerProperty.Builder.() -> Unit)

    /**
     * @param name Room name.
     * The value does not need to be unique.
     */
    public fun name(name: String)

    /**
     * @param tags An array of key-value pairs to apply to this resource.
     * For more information, see
     * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ivschat-room-tag.html)
     * .
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * @param tags An array of key-value pairs to apply to this resource.
     * For more information, see
     * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ivschat-room-tag.html)
     * .
     */
    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ivschat.CfnRoomProps.Builder =
        software.amazon.awscdk.services.ivschat.CfnRoomProps.builder()

    /**
     * @param loggingConfigurationIdentifiers List of logging-configuration identifiers attached to
     * the room.
     */
    override fun loggingConfigurationIdentifiers(loggingConfigurationIdentifiers: List<String>) {
      cdkBuilder.loggingConfigurationIdentifiers(loggingConfigurationIdentifiers)
    }

    /**
     * @param loggingConfigurationIdentifiers List of logging-configuration identifiers attached to
     * the room.
     */
    override fun loggingConfigurationIdentifiers(vararg loggingConfigurationIdentifiers: String):
        Unit = loggingConfigurationIdentifiers(loggingConfigurationIdentifiers.toList())

    /**
     * @param maximumMessageLength Maximum number of characters in a single message.
     * Messages are expected to be UTF-8 encoded and this limit applies specifically to
     * rune/code-point count, not number of bytes.
     */
    override fun maximumMessageLength(maximumMessageLength: Number) {
      cdkBuilder.maximumMessageLength(maximumMessageLength)
    }

    /**
     * @param maximumMessageRatePerSecond Maximum number of messages per second that can be sent to
     * the room (by all clients).
     */
    override fun maximumMessageRatePerSecond(maximumMessageRatePerSecond: Number) {
      cdkBuilder.maximumMessageRatePerSecond(maximumMessageRatePerSecond)
    }

    /**
     * @param messageReviewHandler Configuration information for optional review of messages.
     */
    override fun messageReviewHandler(messageReviewHandler: IResolvable) {
      cdkBuilder.messageReviewHandler(messageReviewHandler.let(IResolvable::unwrap))
    }

    /**
     * @param messageReviewHandler Configuration information for optional review of messages.
     */
    override fun messageReviewHandler(messageReviewHandler: CfnRoom.MessageReviewHandlerProperty) {
      cdkBuilder.messageReviewHandler(messageReviewHandler.let(CfnRoom.MessageReviewHandlerProperty::unwrap))
    }

    /**
     * @param messageReviewHandler Configuration information for optional review of messages.
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("714a5b381acd25976032e32895346cb9f72b174549e6f02a573beebdb7cce783")
    override
        fun messageReviewHandler(messageReviewHandler: CfnRoom.MessageReviewHandlerProperty.Builder.() -> Unit):
        Unit = messageReviewHandler(CfnRoom.MessageReviewHandlerProperty(messageReviewHandler))

    /**
     * @param name Room name.
     * The value does not need to be unique.
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    /**
     * @param tags An array of key-value pairs to apply to this resource.
     * For more information, see
     * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ivschat-room-tag.html)
     * .
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    /**
     * @param tags An array of key-value pairs to apply to this resource.
     * For more information, see
     * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ivschat-room-tag.html)
     * .
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.ivschat.CfnRoomProps = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.ivschat.CfnRoomProps,
  ) : CdkObject(cdkObject), CfnRoomProps {
    /**
     * List of logging-configuration identifiers attached to the room.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ivschat-room.html#cfn-ivschat-room-loggingconfigurationidentifiers)
     */
    override fun loggingConfigurationIdentifiers(): List<String> =
        unwrap(this).getLoggingConfigurationIdentifiers() ?: emptyList()

    /**
     * Maximum number of characters in a single message.
     *
     * Messages are expected to be UTF-8 encoded and this limit applies specifically to
     * rune/code-point count, not number of bytes.
     *
     * Default: - 500
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ivschat-room.html#cfn-ivschat-room-maximummessagelength)
     */
    override fun maximumMessageLength(): Number? = unwrap(this).getMaximumMessageLength()

    /**
     * Maximum number of messages per second that can be sent to the room (by all clients).
     *
     * Default: - 10
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ivschat-room.html#cfn-ivschat-room-maximummessageratepersecond)
     */
    override fun maximumMessageRatePerSecond(): Number? =
        unwrap(this).getMaximumMessageRatePerSecond()

    /**
     * Configuration information for optional review of messages.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ivschat-room.html#cfn-ivschat-room-messagereviewhandler)
     */
    override fun messageReviewHandler(): Any? = unwrap(this).getMessageReviewHandler()

    /**
     * Room name.
     *
     * The value does not need to be unique.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ivschat-room.html#cfn-ivschat-room-name)
     */
    override fun name(): String? = unwrap(this).getName()

    /**
     * An array of key-value pairs to apply to this resource.
     *
     * For more information, see
     * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ivschat-room-tag.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ivschat-room.html#cfn-ivschat-room-tags)
     */
    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnRoomProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ivschat.CfnRoomProps): CfnRoomProps
        = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnRoomProps): software.amazon.awscdk.services.ivschat.CfnRoomProps
        = (wrapped as CdkObject).cdkObject as software.amazon.awscdk.services.ivschat.CfnRoomProps
  }
}
