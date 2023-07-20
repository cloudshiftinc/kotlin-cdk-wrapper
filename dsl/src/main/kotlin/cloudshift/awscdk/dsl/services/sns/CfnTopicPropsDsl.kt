@file:Suppress(
    "RedundantVisibilityModifier",
    "RedundantUnitReturnType",
    "RemoveRedundantQualifierName",
    "unused",
    "UnusedImport",
    "ClassName",
    "REDUNDANT_PROJECTION",
    "DEPRECATION",
)

package cloudshift.awscdk.dsl.services.sns

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.common.MapBuilder
import cloudshift.awscdk.dsl.CfnTagDsl
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.sns.CfnTopicProps
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList

@CdkDslMarker
public class CfnTopicPropsDsl {
    private val cdkBuilder: CfnTopicProps.Builder = CfnTopicProps.builder()

    private val _subscription: MutableList<Any> = mutableListOf()

    private val _tags: MutableList<CfnTag> = mutableListOf()

    public fun contentBasedDeduplication(contentBasedDeduplication: Boolean) {
        cdkBuilder.contentBasedDeduplication(contentBasedDeduplication)
    }

    public fun contentBasedDeduplication(contentBasedDeduplication: IResolvable) {
        cdkBuilder.contentBasedDeduplication(contentBasedDeduplication)
    }

    public fun dataProtectionPolicy(block: MapBuilder.() -> Unit = {}) {
        val builder = MapBuilder()
        builder.apply(block)
        cdkBuilder.dataProtectionPolicy(builder.map)
    }

    public fun dataProtectionPolicy(dataProtectionPolicy: Any) {
        cdkBuilder.dataProtectionPolicy(dataProtectionPolicy)
    }

    public fun displayName(displayName: String) {
        cdkBuilder.displayName(displayName)
    }

    public fun fifoTopic(fifoTopic: Boolean) {
        cdkBuilder.fifoTopic(fifoTopic)
    }

    public fun fifoTopic(fifoTopic: IResolvable) {
        cdkBuilder.fifoTopic(fifoTopic)
    }

    public fun kmsMasterKeyId(kmsMasterKeyId: String) {
        cdkBuilder.kmsMasterKeyId(kmsMasterKeyId)
    }

    public fun signatureVersion(signatureVersion: String) {
        cdkBuilder.signatureVersion(signatureVersion)
    }

    public fun subscription(vararg subscription: Any) {
        _subscription.addAll(listOf(*subscription))
    }

    public fun subscription(subscription: Collection<Any>) {
        _subscription.addAll(subscription)
    }

    public fun subscription(subscription: IResolvable) {
        cdkBuilder.subscription(subscription)
    }

    public fun tags(tags: CfnTagDsl.() -> Unit) {
        _tags.add(CfnTagDsl().apply(tags).build())
    }

    public fun tags(tags: Collection<CfnTag>) {
        _tags.addAll(tags)
    }

    public fun topicName(topicName: String) {
        cdkBuilder.topicName(topicName)
    }

    public fun tracingConfig(tracingConfig: String) {
        cdkBuilder.tracingConfig(tracingConfig)
    }

    public fun build(): CfnTopicProps {
        if (_subscription.isNotEmpty()) cdkBuilder.subscription(_subscription)
        if (_tags.isNotEmpty()) cdkBuilder.tags(_tags)
        return cdkBuilder.build()
    }
}
