@file:Suppress("RedundantVisibilityModifier", "RedundantUnitReturnType", "RemoveRedundantQualifierName", "unused", "UnusedImport", "ClassName", "REDUNDANT_PROJECTION", "DEPRECATION")

package cloudshift.awscdk.dsl.services.kinesis

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.dsl.CfnTagDsl
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.kinesis.CfnStream
import software.amazon.awscdk.services.kinesis.CfnStreamProps
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList

/**
 * Properties for defining a `CfnStream`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.kinesis.*;
 * CfnStreamProps cfnStreamProps = CfnStreamProps.builder()
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
public class CfnStreamPropsDsl {
    private val cdkBuilder: CfnStreamProps.Builder = CfnStreamProps.builder()

    private val _tags: MutableList<CfnTag> = mutableListOf()

    /**
     * @param name The name of the Kinesis stream.
     * If you don't specify a name, AWS CloudFormation generates a unique physical ID and uses that ID
     * for the stream name. For more information, see [Name
   * Type](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-name.html) .
     *
     * If you specify a name, you cannot perform updates that require replacement of this resource.
     * You can perform updates that require no or some interruption. If you must replace the resource,
     * specify a new name.
     */
    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    /**
     * @param retentionPeriodHours The number of hours for the data records that are stored in shards
     * to remain accessible.
     * The default value is 24. For more information about the stream retention period, see [Changing
   * the Data Retention
   * Period](https://docs.aws.amazon.com/streams/latest/dev/kinesis-extended-retention.html) in the
     * Amazon Kinesis Developer Guide.
     */
    public fun retentionPeriodHours(retentionPeriodHours: Number) {
        cdkBuilder.retentionPeriodHours(retentionPeriodHours)
    }

    /**
     * @param shardCount The number of shards that the stream uses.
     * For greater provisioned throughput, increase the number of shards.
     */
    public fun shardCount(shardCount: Number) {
        cdkBuilder.shardCount(shardCount)
    }

    /**
     * @param streamEncryption When specified, enables or updates server-side encryption using an AWS
     * KMS key for a specified stream.
     * Removing this property from your stack template and updating your stack disables encryption.
     */
    public fun streamEncryption(streamEncryption: IResolvable) {
        cdkBuilder.streamEncryption(streamEncryption)
    }

    /**
     * @param streamEncryption When specified, enables or updates server-side encryption using an AWS
     * KMS key for a specified stream.
     * Removing this property from your stack template and updating your stack disables encryption.
     */
    public fun streamEncryption(streamEncryption: CfnStream.StreamEncryptionProperty) {
        cdkBuilder.streamEncryption(streamEncryption)
    }

    /**
     * @param streamModeDetails Specifies the capacity mode to which you want to set your data stream.
     * Currently, in Kinesis Data Streams, you can choose between an *on-demand* capacity mode and a
     * *provisioned* capacity mode for your data streams.
     */
    public fun streamModeDetails(streamModeDetails: IResolvable) {
        cdkBuilder.streamModeDetails(streamModeDetails)
    }

    /**
     * @param streamModeDetails Specifies the capacity mode to which you want to set your data stream.
     * Currently, in Kinesis Data Streams, you can choose between an *on-demand* capacity mode and a
     * *provisioned* capacity mode for your data streams.
     */
    public fun streamModeDetails(streamModeDetails: CfnStream.StreamModeDetailsProperty) {
        cdkBuilder.streamModeDetails(streamModeDetails)
    }

    /**
     * @param tags An arbitrary set of tags (key–value pairs) to associate with the Kinesis stream.
     * For information about constraints for this property, see [Tag
   * Restrictions](https://docs.aws.amazon.com/streams/latest/dev/tagging.html#tagging-restrictions) in
     * the *Amazon Kinesis Developer Guide* .
     */
    public fun tags(tags: CfnTagDsl.() -> Unit) {
        _tags.add(CfnTagDsl().apply(tags).build())
    }

    /**
     * @param tags An arbitrary set of tags (key–value pairs) to associate with the Kinesis stream.
     * For information about constraints for this property, see [Tag
   * Restrictions](https://docs.aws.amazon.com/streams/latest/dev/tagging.html#tagging-restrictions) in
     * the *Amazon Kinesis Developer Guide* .
     */
    public fun tags(tags: Collection<CfnTag>) {
        _tags.addAll(tags)
    }

    public fun build(): CfnStreamProps {
        if (_tags.isNotEmpty()) cdkBuilder.tags(_tags)
        return cdkBuilder.build()
    }
}
