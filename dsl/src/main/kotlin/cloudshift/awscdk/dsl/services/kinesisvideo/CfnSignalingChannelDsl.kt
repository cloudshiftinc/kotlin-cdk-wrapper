@file:Suppress("RedundantVisibilityModifier", "RedundantUnitReturnType", "RemoveRedundantQualifierName", "unused", "UnusedImport", "ClassName", "REDUNDANT_PROJECTION", "DEPRECATION")

package cloudshift.awscdk.dsl.services.kinesisvideo

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.dsl.CfnTagDsl
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.services.kinesisvideo.CfnSignalingChannel
import software.constructs.Construct
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList

/**
 * Specifies a signaling channel.
 *
 * `CreateSignalingChannel` is an asynchronous operation.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.kinesisvideo.*;
 * CfnSignalingChannel cfnSignalingChannel = CfnSignalingChannel.Builder.create(this,
 * "MyCfnSignalingChannel")
 * .messageTtlSeconds(123)
 * .name("name")
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .type("type")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kinesisvideo-signalingchannel.html)
 */
@CdkDslMarker
public class CfnSignalingChannelDsl(
    scope: Construct,
    id: String
) {
    private val cdkBuilder: CfnSignalingChannel.Builder = CfnSignalingChannel.Builder.create(
        scope,
        id
    )

    private val _tags: MutableList<CfnTag> = mutableListOf()

    /**
     * The period of time a signaling channel retains undelivered messages before they are discarded.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kinesisvideo-signalingchannel.html#cfn-kinesisvideo-signalingchannel-messagettlseconds)
     * @param messageTtlSeconds The period of time a signaling channel retains undelivered messages
     * before they are discarded.
     */
    public fun messageTtlSeconds(messageTtlSeconds: Number) {
        cdkBuilder.messageTtlSeconds(messageTtlSeconds)
    }

    /**
     * A name for the signaling channel that you are creating.
     *
     * It must be unique for each AWS account and AWS Region .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kinesisvideo-signalingchannel.html#cfn-kinesisvideo-signalingchannel-name)
     * @param name A name for the signaling channel that you are creating.
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
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kinesisvideo-signalingchannel.html#cfn-kinesisvideo-signalingchannel-tags)
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
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kinesisvideo-signalingchannel.html#cfn-kinesisvideo-signalingchannel-tags)
     * @param tags An array of key-value pairs to apply to this resource.
     */
    public fun tags(tags: Collection<CfnTag>) {
        _tags.addAll(tags)
    }

    /**
     * A type of the signaling channel that you are creating.
     *
     * Currently, `SINGLE_MASTER` is the only supported channel type.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kinesisvideo-signalingchannel.html#cfn-kinesisvideo-signalingchannel-type)
     * @param type A type of the signaling channel that you are creating.
     */
    public fun type(type: String) {
        cdkBuilder.type(type)
    }

    public fun build(): CfnSignalingChannel {
        if (_tags.isNotEmpty()) cdkBuilder.tags(_tags)
        return cdkBuilder.build()
    }
}
