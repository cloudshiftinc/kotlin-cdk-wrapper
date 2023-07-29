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

package cloudshift.awscdk.dsl.services.qldb

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.dsl.CfnTagDsl
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.qldb.CfnStream
import software.amazon.awscdk.services.qldb.CfnStreamProps

/**
 * Properties for defining a `CfnStream`.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.qldb.*;
 * CfnStreamProps cfnStreamProps = CfnStreamProps.builder()
 * .inclusiveStartTime("inclusiveStartTime")
 * .kinesisConfiguration(KinesisConfigurationProperty.builder()
 * .aggregationEnabled(false)
 * .streamArn("streamArn")
 * .build())
 * .ledgerName("ledgerName")
 * .roleArn("roleArn")
 * .streamName("streamName")
 * // the properties below are optional
 * .exclusiveEndTime("exclusiveEndTime")
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-qldb-stream.html)
 */
@CdkDslMarker
public class CfnStreamPropsDsl {
    private val cdkBuilder: CfnStreamProps.Builder = CfnStreamProps.builder()

    private val _tags: MutableList<CfnTag> = mutableListOf()

    /**
     * @param exclusiveEndTime The exclusive date and time that specifies when the stream ends. If
     *   you don't define this parameter, the stream runs indefinitely until you cancel it.
     *
     * The `ExclusiveEndTime` must be in `ISO 8601` date and time format and in Universal
     * Coordinated Time (UTC). For example: `2019-06-13T21:36:34Z` .
     */
    public fun exclusiveEndTime(exclusiveEndTime: String) {
        cdkBuilder.exclusiveEndTime(exclusiveEndTime)
    }

    /**
     * @param inclusiveStartTime The inclusive start date and time from which to start streaming
     *   journal data. This parameter must be in `ISO 8601` date and time format and in Universal
     *   Coordinated Time (UTC). For example: `2019-06-13T21:36:34Z` .
     *
     * The `InclusiveStartTime` cannot be in the future and must be before `ExclusiveEndTime` .
     *
     * If you provide an `InclusiveStartTime` that is before the ledger's `CreationDateTime` , QLDB
     * effectively defaults it to the ledger's `CreationDateTime` .
     */
    public fun inclusiveStartTime(inclusiveStartTime: String) {
        cdkBuilder.inclusiveStartTime(inclusiveStartTime)
    }

    /**
     * @param kinesisConfiguration The configuration settings of the Kinesis Data Streams
     *   destination for your stream request.
     */
    public fun kinesisConfiguration(kinesisConfiguration: IResolvable) {
        cdkBuilder.kinesisConfiguration(kinesisConfiguration)
    }

    /**
     * @param kinesisConfiguration The configuration settings of the Kinesis Data Streams
     *   destination for your stream request.
     */
    public fun kinesisConfiguration(kinesisConfiguration: CfnStream.KinesisConfigurationProperty) {
        cdkBuilder.kinesisConfiguration(kinesisConfiguration)
    }

    /** @param ledgerName The name of the ledger. */
    public fun ledgerName(ledgerName: String) {
        cdkBuilder.ledgerName(ledgerName)
    }

    /**
     * @param roleArn The Amazon Resource Name (ARN) of the IAM role that grants QLDB permissions
     *   for a journal stream to write data records to a Kinesis Data Streams resource. To pass a
     *   role to QLDB when requesting a journal stream, you must have permissions to perform the
     *   `iam:PassRole` action on the IAM role resource. This is required for all journal stream
     *   requests.
     */
    public fun roleArn(roleArn: String) {
        cdkBuilder.roleArn(roleArn)
    }

    /**
     * @param streamName The name that you want to assign to the QLDB journal stream. User-defined
     *   names can help identify and indicate the purpose of a stream.
     *
     * Your stream name must be unique among other *active* streams for a given ledger. Stream names
     * have the same naming constraints as ledger names, as defined in
     * [Quotas in Amazon QLDB](https://docs.aws.amazon.com/qldb/latest/developerguide/limits.html#limits.naming)
     * in the *Amazon QLDB Developer Guide* .
     */
    public fun streamName(streamName: String) {
        cdkBuilder.streamName(streamName)
    }

    /**
     * @param tags An array of key-value pairs to apply to this resource. For more information, see
     *   [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     *   .
     */
    public fun tags(tags: CfnTagDsl.() -> Unit) {
        _tags.add(CfnTagDsl().apply(tags).build())
    }

    /**
     * @param tags An array of key-value pairs to apply to this resource. For more information, see
     *   [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     *   .
     */
    public fun tags(tags: Collection<CfnTag>) {
        _tags.addAll(tags)
    }

    public fun build(): CfnStreamProps {
        if (_tags.isNotEmpty()) cdkBuilder.tags(_tags)
        return cdkBuilder.build()
    }
}
