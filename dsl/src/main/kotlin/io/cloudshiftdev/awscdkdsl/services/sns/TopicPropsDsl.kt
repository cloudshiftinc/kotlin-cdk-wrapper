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

package io.cloudshiftdev.awscdkdsl.services.sns

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.services.kms.IKey
import software.amazon.awscdk.services.sns.LoggingConfig
import software.amazon.awscdk.services.sns.TopicProps

/**
 * Properties for a new SNS topic.
 *
 * Example:
 * ```
 * Topic topic = Topic.Builder.create(this, "Topic")
 * .contentBasedDeduplication(true)
 * .displayName("Customer subscription topic")
 * .fifo(true)
 * .build();
 * ```
 */
@CdkDslMarker
public class TopicPropsDsl {
    private val cdkBuilder: TopicProps.Builder = TopicProps.builder()

    private val _loggingConfigs: MutableList<LoggingConfig> = mutableListOf()

    /** @param contentBasedDeduplication Enables content-based deduplication for FIFO topics. */
    public fun contentBasedDeduplication(contentBasedDeduplication: Boolean) {
        cdkBuilder.contentBasedDeduplication(contentBasedDeduplication)
    }

    /**
     * @param displayName A developer-defined string that can be used to identify this SNS topic.
     */
    public fun displayName(displayName: String) {
        cdkBuilder.displayName(displayName)
    }

    /**
     * @param enforceSsl Adds a statement to enforce encryption of data in transit when publishing
     *   to the topic. For more information, see
     *   https://docs.aws.amazon.com/sns/latest/dg/sns-security-best-practices.html#enforce-encryption-data-in-transit.
     */
    public fun enforceSsl(enforceSsl: Boolean) {
        cdkBuilder.enforceSsl(enforceSsl)
    }

    /** @param fifo Set to true to create a FIFO topic. */
    public fun fifo(fifo: Boolean) {
        cdkBuilder.fifo(fifo)
    }

    /**
     * @param loggingConfigs The list of delivery status logging configurations for the topic. For
     *   more information, see https://docs.aws.amazon.com/sns/latest/dg/sns-topic-attributes.html.
     */
    public fun loggingConfigs(loggingConfigs: LoggingConfigDsl.() -> Unit) {
        _loggingConfigs.add(LoggingConfigDsl().apply(loggingConfigs).build())
    }

    /**
     * @param loggingConfigs The list of delivery status logging configurations for the topic. For
     *   more information, see https://docs.aws.amazon.com/sns/latest/dg/sns-topic-attributes.html.
     */
    public fun loggingConfigs(loggingConfigs: Collection<LoggingConfig>) {
        _loggingConfigs.addAll(loggingConfigs)
    }

    /** @param masterKey A KMS Key, either managed by this CDK app, or imported. */
    public fun masterKey(masterKey: IKey) {
        cdkBuilder.masterKey(masterKey)
    }

    /**
     * @param messageRetentionPeriodInDays The number of days Amazon SNS retains messages. It can
     *   only be set for FIFO topics.
     */
    public fun messageRetentionPeriodInDays(messageRetentionPeriodInDays: Number) {
        cdkBuilder.messageRetentionPeriodInDays(messageRetentionPeriodInDays)
    }

    /**
     * @param topicName A name for the topic. If you don't specify a name, AWS CloudFormation
     *   generates a unique physical ID and uses that ID for the topic name. For more information,
     *   see Name Type.
     */
    public fun topicName(topicName: String) {
        cdkBuilder.topicName(topicName)
    }

    public fun build(): TopicProps {
        if (_loggingConfigs.isNotEmpty()) cdkBuilder.loggingConfigs(_loggingConfigs)
        return cdkBuilder.build()
    }
}
