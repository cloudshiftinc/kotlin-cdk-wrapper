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

package io.cloudshiftdev.awscdkdsl.services.kinesis

import io.cloudshiftdev.awscdkdsl.CfnTagDsl
import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.kinesis.CfnStream
import software.constructs.Construct

/**
 * Creates a Kinesis stream that captures and transports data records that are emitted from data
 * sources.
 *
 * For information about creating streams, see
 * [CreateStream](https://docs.aws.amazon.com/kinesis/latest/APIReference/API_CreateStream.html) in
 * the Amazon Kinesis API Reference.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.kinesis.*;
 * CfnStream cfnStream = CfnStream.Builder.create(this, "MyCfnStream")
 * .name("name")
 * .retentionPeriodHours(123)
 * .shardCount(123)
 * .streamEncryption(StreamEncryptionProperty.builder()
 * .encryptionType("encryptionType")
 * .keyId("keyId")
 * .build())
 * .streamModeDetails(StreamModeDetailsProperty.builder()
 * .streamMode("streamMode")
 * .build())
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kinesis-stream.html)
 */
@CdkDslMarker
public class CfnStreamDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnStream.Builder = CfnStream.Builder.create(scope, id)

    private val _tags: MutableList<CfnTag> = mutableListOf()

    /**
     * The name of the Kinesis stream.
     *
     * If you don't specify a name, AWS CloudFormation generates a unique physical ID and uses that
     * ID for the stream name. For more information, see
     * [Name Type](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-name.html)
     * .
     *
     * If you specify a name, you cannot perform updates that require replacement of this resource.
     * You can perform updates that require no or some interruption. If you must replace the
     * resource, specify a new name.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kinesis-stream.html#cfn-kinesis-stream-name)
     *
     * @param name The name of the Kinesis stream.
     */
    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    /**
     * The number of hours for the data records that are stored in shards to remain accessible.
     *
     * The default value is 24. For more information about the stream retention period, see
     * [Changing the Data Retention Period](https://docs.aws.amazon.com/streams/latest/dev/kinesis-extended-retention.html)
     * in the Amazon Kinesis Developer Guide.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kinesis-stream.html#cfn-kinesis-stream-retentionperiodhours)
     *
     * @param retentionPeriodHours The number of hours for the data records that are stored in
     *   shards to remain accessible.
     */
    public fun retentionPeriodHours(retentionPeriodHours: Number) {
        cdkBuilder.retentionPeriodHours(retentionPeriodHours)
    }

    /**
     * The number of shards that the stream uses.
     *
     * For greater provisioned throughput, increase the number of shards.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kinesis-stream.html#cfn-kinesis-stream-shardcount)
     *
     * @param shardCount The number of shards that the stream uses.
     */
    public fun shardCount(shardCount: Number) {
        cdkBuilder.shardCount(shardCount)
    }

    /**
     * When specified, enables or updates server-side encryption using an AWS KMS key for a
     * specified stream.
     *
     * Removing this property from your stack template and updating your stack disables encryption.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kinesis-stream.html#cfn-kinesis-stream-streamencryption)
     *
     * @param streamEncryption When specified, enables or updates server-side encryption using an
     *   AWS KMS key for a specified stream.
     */
    public fun streamEncryption(streamEncryption: IResolvable) {
        cdkBuilder.streamEncryption(streamEncryption)
    }

    /**
     * When specified, enables or updates server-side encryption using an AWS KMS key for a
     * specified stream.
     *
     * Removing this property from your stack template and updating your stack disables encryption.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kinesis-stream.html#cfn-kinesis-stream-streamencryption)
     *
     * @param streamEncryption When specified, enables or updates server-side encryption using an
     *   AWS KMS key for a specified stream.
     */
    public fun streamEncryption(streamEncryption: CfnStream.StreamEncryptionProperty) {
        cdkBuilder.streamEncryption(streamEncryption)
    }

    /**
     * Specifies the capacity mode to which you want to set your data stream.
     *
     * Currently, in Kinesis Data Streams, you can choose between an *on-demand* capacity mode and a
     * *provisioned* capacity mode for your data streams.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kinesis-stream.html#cfn-kinesis-stream-streammodedetails)
     *
     * @param streamModeDetails Specifies the capacity mode to which you want to set your data
     *   stream.
     */
    public fun streamModeDetails(streamModeDetails: IResolvable) {
        cdkBuilder.streamModeDetails(streamModeDetails)
    }

    /**
     * Specifies the capacity mode to which you want to set your data stream.
     *
     * Currently, in Kinesis Data Streams, you can choose between an *on-demand* capacity mode and a
     * *provisioned* capacity mode for your data streams.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kinesis-stream.html#cfn-kinesis-stream-streammodedetails)
     *
     * @param streamModeDetails Specifies the capacity mode to which you want to set your data
     *   stream.
     */
    public fun streamModeDetails(streamModeDetails: CfnStream.StreamModeDetailsProperty) {
        cdkBuilder.streamModeDetails(streamModeDetails)
    }

    /**
     * An arbitrary set of tags (key–value pairs) to associate with the Kinesis stream.
     *
     * For information about constraints for this property, see
     * [Tag Restrictions](https://docs.aws.amazon.com/streams/latest/dev/tagging.html#tagging-restrictions)
     * in the *Amazon Kinesis Developer Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kinesis-stream.html#cfn-kinesis-stream-tags)
     *
     * @param tags An arbitrary set of tags (key–value pairs) to associate with the Kinesis stream.
     */
    public fun tags(tags: CfnTagDsl.() -> Unit) {
        _tags.add(CfnTagDsl().apply(tags).build())
    }

    /**
     * An arbitrary set of tags (key–value pairs) to associate with the Kinesis stream.
     *
     * For information about constraints for this property, see
     * [Tag Restrictions](https://docs.aws.amazon.com/streams/latest/dev/tagging.html#tagging-restrictions)
     * in the *Amazon Kinesis Developer Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kinesis-stream.html#cfn-kinesis-stream-tags)
     *
     * @param tags An arbitrary set of tags (key–value pairs) to associate with the Kinesis stream.
     */
    public fun tags(tags: Collection<CfnTag>) {
        _tags.addAll(tags)
    }

    public fun build(): CfnStream {
        if (_tags.isNotEmpty()) cdkBuilder.tags(_tags)
        return cdkBuilder.build()
    }
}
