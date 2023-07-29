@file:Suppress(
    "RedundantVisibilityModifier",
    "RedundantUnitReturnType",
    "RemoveRedundantQualifierName",
    "unused",
    "UnusedImport",
    "ClassName",
    "REDUNDANT_PROJECTION",
    "DEPRECATION"
)

package cloudshift.awscdk.dsl.services.ivschat

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.dsl.CfnTagDsl
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.ivschat.CfnRoom
import software.constructs.Construct

/**
 * The `AWS::IVSChat::Room` resource specifies an room that allows clients to connect and pass
 * messages.
 *
 * For more information, see
 * [CreateRoom](https://docs.aws.amazon.com/ivs/latest/ChatAPIReference/API_CreateRoom.html) in the
 * *Amazon Interactive Video Service Chat API Reference* .
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.ivschat.*;
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
@CdkDslMarker
public class CfnRoomDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnRoom.Builder = CfnRoom.Builder.create(scope, id)

    private val _loggingConfigurationIdentifiers: MutableList<String> = mutableListOf()

    private val _tags: MutableList<CfnTag> = mutableListOf()

    /**
     * List of logging-configuration identifiers attached to the room.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ivschat-room.html#cfn-ivschat-room-loggingconfigurationidentifiers)
     *
     * @param loggingConfigurationIdentifiers List of logging-configuration identifiers attached to
     *   the room.
     */
    public fun loggingConfigurationIdentifiers(vararg loggingConfigurationIdentifiers: String) {
        _loggingConfigurationIdentifiers.addAll(listOf(*loggingConfigurationIdentifiers))
    }

    /**
     * List of logging-configuration identifiers attached to the room.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ivschat-room.html#cfn-ivschat-room-loggingconfigurationidentifiers)
     *
     * @param loggingConfigurationIdentifiers List of logging-configuration identifiers attached to
     *   the room.
     */
    public fun loggingConfigurationIdentifiers(
        loggingConfigurationIdentifiers: Collection<String>
    ) {
        _loggingConfigurationIdentifiers.addAll(loggingConfigurationIdentifiers)
    }

    /**
     * Maximum number of characters in a single message.
     *
     * Messages are expected to be UTF-8 encoded and this limit applies specifically to
     * rune/code-point count, not number of bytes.
     *
     * Default: - 500
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ivschat-room.html#cfn-ivschat-room-maximummessagelength)
     *
     * @param maximumMessageLength Maximum number of characters in a single message.
     */
    public fun maximumMessageLength(maximumMessageLength: Number) {
        cdkBuilder.maximumMessageLength(maximumMessageLength)
    }

    /**
     * Maximum number of messages per second that can be sent to the room (by all clients).
     *
     * Default: - 10
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ivschat-room.html#cfn-ivschat-room-maximummessageratepersecond)
     *
     * @param maximumMessageRatePerSecond Maximum number of messages per second that can be sent to
     *   the room (by all clients).
     */
    public fun maximumMessageRatePerSecond(maximumMessageRatePerSecond: Number) {
        cdkBuilder.maximumMessageRatePerSecond(maximumMessageRatePerSecond)
    }

    /**
     * Configuration information for optional review of messages.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ivschat-room.html#cfn-ivschat-room-messagereviewhandler)
     *
     * @param messageReviewHandler Configuration information for optional review of messages.
     */
    public fun messageReviewHandler(messageReviewHandler: IResolvable) {
        cdkBuilder.messageReviewHandler(messageReviewHandler)
    }

    /**
     * Configuration information for optional review of messages.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ivschat-room.html#cfn-ivschat-room-messagereviewhandler)
     *
     * @param messageReviewHandler Configuration information for optional review of messages.
     */
    public fun messageReviewHandler(messageReviewHandler: CfnRoom.MessageReviewHandlerProperty) {
        cdkBuilder.messageReviewHandler(messageReviewHandler)
    }

    /**
     * Room name.
     *
     * The value does not need to be unique.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ivschat-room.html#cfn-ivschat-room-name)
     *
     * @param name Room name.
     */
    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    /**
     * An array of key-value pairs to apply to this resource.
     *
     * For more information, see
     * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ivschat-room.html#cfn-ivschat-room-tags)
     *
     * @param tags An array of key-value pairs to apply to this resource.
     */
    public fun tags(tags: CfnTagDsl.() -> Unit) {
        _tags.add(CfnTagDsl().apply(tags).build())
    }

    /**
     * An array of key-value pairs to apply to this resource.
     *
     * For more information, see
     * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ivschat-room.html#cfn-ivschat-room-tags)
     *
     * @param tags An array of key-value pairs to apply to this resource.
     */
    public fun tags(tags: Collection<CfnTag>) {
        _tags.addAll(tags)
    }

    public fun build(): CfnRoom {
        if (_loggingConfigurationIdentifiers.isNotEmpty())
            cdkBuilder.loggingConfigurationIdentifiers(_loggingConfigurationIdentifiers)
        if (_tags.isNotEmpty()) cdkBuilder.tags(_tags)
        return cdkBuilder.build()
    }
}
