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
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.msk.*;
 * TopicReplicationProperty topicReplicationProperty = TopicReplicationProperty.builder()
 * .topicsToReplicate(List.of("topicsToReplicate"))
 * // the properties below are optional
 * .copyAccessControlListsForTopics(false)
 * .copyTopicConfigurations(false)
 * .detectAndCopyNewTopics(false)
 * .topicsToExclude(List.of("topicsToExclude"))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-msk-replicator-topicreplication.html)
 */
@CdkDslMarker
public class CfnReplicatorTopicReplicationPropertyDsl {
    private val cdkBuilder: CfnReplicator.TopicReplicationProperty.Builder =
        CfnReplicator.TopicReplicationProperty.builder()

    private val _topicsToExclude: MutableList<String> = mutableListOf()

    private val _topicsToReplicate: MutableList<String> = mutableListOf()

    /**
     * @param copyAccessControlListsForTopics Whether to periodically configure remote topic ACLs to
     *   match their corresponding upstream topics.
     */
    public fun copyAccessControlListsForTopics(copyAccessControlListsForTopics: Boolean) {
        cdkBuilder.copyAccessControlListsForTopics(copyAccessControlListsForTopics)
    }

    /**
     * @param copyAccessControlListsForTopics Whether to periodically configure remote topic ACLs to
     *   match their corresponding upstream topics.
     */
    public fun copyAccessControlListsForTopics(copyAccessControlListsForTopics: IResolvable) {
        cdkBuilder.copyAccessControlListsForTopics(copyAccessControlListsForTopics)
    }

    /**
     * @param copyTopicConfigurations Whether to periodically configure remote topics to match their
     *   corresponding upstream topics.
     */
    public fun copyTopicConfigurations(copyTopicConfigurations: Boolean) {
        cdkBuilder.copyTopicConfigurations(copyTopicConfigurations)
    }

    /**
     * @param copyTopicConfigurations Whether to periodically configure remote topics to match their
     *   corresponding upstream topics.
     */
    public fun copyTopicConfigurations(copyTopicConfigurations: IResolvable) {
        cdkBuilder.copyTopicConfigurations(copyTopicConfigurations)
    }

    /**
     * @param detectAndCopyNewTopics Whether to periodically check for new topics and partitions.
     */
    public fun detectAndCopyNewTopics(detectAndCopyNewTopics: Boolean) {
        cdkBuilder.detectAndCopyNewTopics(detectAndCopyNewTopics)
    }

    /**
     * @param detectAndCopyNewTopics Whether to periodically check for new topics and partitions.
     */
    public fun detectAndCopyNewTopics(detectAndCopyNewTopics: IResolvable) {
        cdkBuilder.detectAndCopyNewTopics(detectAndCopyNewTopics)
    }

    /**
     * @param topicsToExclude List of regular expression patterns indicating the topics that should
     *   not be replicated.
     */
    public fun topicsToExclude(vararg topicsToExclude: String) {
        _topicsToExclude.addAll(listOf(*topicsToExclude))
    }

    /**
     * @param topicsToExclude List of regular expression patterns indicating the topics that should
     *   not be replicated.
     */
    public fun topicsToExclude(topicsToExclude: Collection<String>) {
        _topicsToExclude.addAll(topicsToExclude)
    }

    /**
     * @param topicsToReplicate List of regular expression patterns indicating the topics to copy.
     */
    public fun topicsToReplicate(vararg topicsToReplicate: String) {
        _topicsToReplicate.addAll(listOf(*topicsToReplicate))
    }

    /**
     * @param topicsToReplicate List of regular expression patterns indicating the topics to copy.
     */
    public fun topicsToReplicate(topicsToReplicate: Collection<String>) {
        _topicsToReplicate.addAll(topicsToReplicate)
    }

    public fun build(): CfnReplicator.TopicReplicationProperty {
        if (_topicsToExclude.isNotEmpty()) cdkBuilder.topicsToExclude(_topicsToExclude)
        if (_topicsToReplicate.isNotEmpty()) cdkBuilder.topicsToReplicate(_topicsToReplicate)
        return cdkBuilder.build()
    }
}
