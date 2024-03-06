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

package io.cloudshiftdev.awscdkdsl.services.msk

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.Boolean
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.msk.CfnReplicator

/**
 * Configuration relating to consumer group replication.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.msk.*;
 * ConsumerGroupReplicationProperty consumerGroupReplicationProperty =
 * ConsumerGroupReplicationProperty.builder()
 * .consumerGroupsToReplicate(List.of("consumerGroupsToReplicate"))
 * // the properties below are optional
 * .consumerGroupsToExclude(List.of("consumerGroupsToExclude"))
 * .detectAndCopyNewConsumerGroups(false)
 * .synchroniseConsumerGroupOffsets(false)
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-msk-replicator-consumergroupreplication.html)
 */
@CdkDslMarker
public class CfnReplicatorConsumerGroupReplicationPropertyDsl {
    private val cdkBuilder: CfnReplicator.ConsumerGroupReplicationProperty.Builder =
        CfnReplicator.ConsumerGroupReplicationProperty.builder()

    private val _consumerGroupsToExclude: MutableList<String> = mutableListOf()

    private val _consumerGroupsToReplicate: MutableList<String> = mutableListOf()

    /**
     * @param consumerGroupsToExclude List of regular expression patterns indicating the consumer
     *   groups that should not be replicated.
     */
    public fun consumerGroupsToExclude(vararg consumerGroupsToExclude: String) {
        _consumerGroupsToExclude.addAll(listOf(*consumerGroupsToExclude))
    }

    /**
     * @param consumerGroupsToExclude List of regular expression patterns indicating the consumer
     *   groups that should not be replicated.
     */
    public fun consumerGroupsToExclude(consumerGroupsToExclude: Collection<String>) {
        _consumerGroupsToExclude.addAll(consumerGroupsToExclude)
    }

    /**
     * @param consumerGroupsToReplicate List of regular expression patterns indicating the consumer
     *   groups to copy.
     */
    public fun consumerGroupsToReplicate(vararg consumerGroupsToReplicate: String) {
        _consumerGroupsToReplicate.addAll(listOf(*consumerGroupsToReplicate))
    }

    /**
     * @param consumerGroupsToReplicate List of regular expression patterns indicating the consumer
     *   groups to copy.
     */
    public fun consumerGroupsToReplicate(consumerGroupsToReplicate: Collection<String>) {
        _consumerGroupsToReplicate.addAll(consumerGroupsToReplicate)
    }

    /**
     * @param detectAndCopyNewConsumerGroups Whether to periodically check for new consumer groups.
     */
    public fun detectAndCopyNewConsumerGroups(detectAndCopyNewConsumerGroups: Boolean) {
        cdkBuilder.detectAndCopyNewConsumerGroups(detectAndCopyNewConsumerGroups)
    }

    /**
     * @param detectAndCopyNewConsumerGroups Whether to periodically check for new consumer groups.
     */
    public fun detectAndCopyNewConsumerGroups(detectAndCopyNewConsumerGroups: IResolvable) {
        cdkBuilder.detectAndCopyNewConsumerGroups(detectAndCopyNewConsumerGroups)
    }

    /**
     * @param synchroniseConsumerGroupOffsets Whether to periodically write the translated offsets
     *   to __consumer_offsets topic in target cluster.
     */
    public fun synchroniseConsumerGroupOffsets(synchroniseConsumerGroupOffsets: Boolean) {
        cdkBuilder.synchroniseConsumerGroupOffsets(synchroniseConsumerGroupOffsets)
    }

    /**
     * @param synchroniseConsumerGroupOffsets Whether to periodically write the translated offsets
     *   to __consumer_offsets topic in target cluster.
     */
    public fun synchroniseConsumerGroupOffsets(synchroniseConsumerGroupOffsets: IResolvable) {
        cdkBuilder.synchroniseConsumerGroupOffsets(synchroniseConsumerGroupOffsets)
    }

    public fun build(): CfnReplicator.ConsumerGroupReplicationProperty {
        if (_consumerGroupsToExclude.isNotEmpty())
            cdkBuilder.consumerGroupsToExclude(_consumerGroupsToExclude)
        if (_consumerGroupsToReplicate.isNotEmpty())
            cdkBuilder.consumerGroupsToReplicate(_consumerGroupsToReplicate)
        return cdkBuilder.build()
    }
}
