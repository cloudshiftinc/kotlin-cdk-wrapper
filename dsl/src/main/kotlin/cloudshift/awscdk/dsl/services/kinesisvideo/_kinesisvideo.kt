@file:Suppress("RedundantVisibilityModifier", "RedundantUnitReturnType", "RemoveRedundantQualifierName", "unused", "UnusedImport", "ClassName", "REDUNDANT_PROJECTION", "DEPRECATION")

package cloudshift.awscdk.dsl.services.kinesisvideo

import software.amazon.awscdk.services.kinesisvideo.CfnSignalingChannel
import software.amazon.awscdk.services.kinesisvideo.CfnSignalingChannelProps
import software.amazon.awscdk.services.kinesisvideo.CfnStream
import software.amazon.awscdk.services.kinesisvideo.CfnStreamProps
import software.constructs.Construct
import kotlin.String
import kotlin.Unit

public object kinesisvideo {
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
    public inline fun cfnSignalingChannel(
        scope: Construct,
        id: String,
        block: CfnSignalingChannelDsl.() -> Unit = {}
    ): CfnSignalingChannel {
        val builder = CfnSignalingChannelDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnSignalingChannel`.
     *
     * Example:
     *
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.kinesisvideo.*;
     * CfnSignalingChannelProps cfnSignalingChannelProps = CfnSignalingChannelProps.builder()
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
    public inline fun cfnSignalingChannelProps(block: CfnSignalingChannelPropsDsl.() -> Unit = {}): CfnSignalingChannelProps {
        val builder = CfnSignalingChannelPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Specifies a new Kinesis video stream.
     *
     * When you create a new stream, Kinesis Video Streams assigns it a version number. When you
     * change the stream's metadata, Kinesis Video Streams updates the version.
     *
     * `CreateStream` is an asynchronous operation.
     *
     * For information about how the service works, see [How it
   * Works](https://docs.aws.amazon.com/kinesisvideostreams/latest/dg/how-it-works.html) .
     *
     * You must have permissions for the `KinesisVideo:CreateStream` action.
     *
     * Example:
     *
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.kinesisvideo.*;
     * CfnStream cfnStream = CfnStream.Builder.create(this, "MyCfnStream")
     * .dataRetentionInHours(123)
     * .deviceName("deviceName")
     * .kmsKeyId("kmsKeyId")
     * .mediaType("mediaType")
     * .name("name")
     * .tags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kinesisvideo-stream.html)
     */
    public inline fun cfnStream(
        scope: Construct,
        id: String,
        block: CfnStreamDsl.() -> Unit = {}
    ): CfnStream {
        val builder = CfnStreamDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnStream`.
     *
     * Example:
     *
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.kinesisvideo.*;
     * CfnStreamProps cfnStreamProps = CfnStreamProps.builder()
     * .dataRetentionInHours(123)
     * .deviceName("deviceName")
     * .kmsKeyId("kmsKeyId")
     * .mediaType("mediaType")
     * .name("name")
     * .tags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kinesisvideo-stream.html)
     */
    public inline fun cfnStreamProps(block: CfnStreamPropsDsl.() -> Unit = {}): CfnStreamProps {
        val builder = CfnStreamPropsDsl()
        builder.apply(block)
        return builder.build()
    }
}
