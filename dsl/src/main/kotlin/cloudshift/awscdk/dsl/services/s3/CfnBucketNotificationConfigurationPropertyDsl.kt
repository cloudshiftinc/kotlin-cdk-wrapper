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

package cloudshift.awscdk.dsl.services.s3

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.s3.CfnBucket
import kotlin.Any
import kotlin.collections.Collection
import kotlin.collections.MutableList

@CdkDslMarker
public class CfnBucketNotificationConfigurationPropertyDsl {
    private val cdkBuilder: CfnBucket.NotificationConfigurationProperty.Builder =
        CfnBucket.NotificationConfigurationProperty.builder()

    private val _lambdaConfigurations: MutableList<Any> = mutableListOf()

    private val _queueConfigurations: MutableList<Any> = mutableListOf()

    private val _topicConfigurations: MutableList<Any> = mutableListOf()

    public fun eventBridgeConfiguration(eventBridgeConfiguration: IResolvable) {
        cdkBuilder.eventBridgeConfiguration(eventBridgeConfiguration)
    }

    public fun eventBridgeConfiguration(eventBridgeConfiguration: CfnBucket.EventBridgeConfigurationProperty) {
        cdkBuilder.eventBridgeConfiguration(eventBridgeConfiguration)
    }

    public fun lambdaConfigurations(vararg lambdaConfigurations: Any) {
        _lambdaConfigurations.addAll(listOf(*lambdaConfigurations))
    }

    public fun lambdaConfigurations(lambdaConfigurations: Collection<Any>) {
        _lambdaConfigurations.addAll(lambdaConfigurations)
    }

    public fun lambdaConfigurations(lambdaConfigurations: IResolvable) {
        cdkBuilder.lambdaConfigurations(lambdaConfigurations)
    }

    public fun queueConfigurations(vararg queueConfigurations: Any) {
        _queueConfigurations.addAll(listOf(*queueConfigurations))
    }

    public fun queueConfigurations(queueConfigurations: Collection<Any>) {
        _queueConfigurations.addAll(queueConfigurations)
    }

    public fun queueConfigurations(queueConfigurations: IResolvable) {
        cdkBuilder.queueConfigurations(queueConfigurations)
    }

    public fun topicConfigurations(vararg topicConfigurations: Any) {
        _topicConfigurations.addAll(listOf(*topicConfigurations))
    }

    public fun topicConfigurations(topicConfigurations: Collection<Any>) {
        _topicConfigurations.addAll(topicConfigurations)
    }

    public fun topicConfigurations(topicConfigurations: IResolvable) {
        cdkBuilder.topicConfigurations(topicConfigurations)
    }

    public fun build(): CfnBucket.NotificationConfigurationProperty {
        if (_lambdaConfigurations.isNotEmpty()) cdkBuilder.lambdaConfigurations(_lambdaConfigurations)
        if (_queueConfigurations.isNotEmpty()) cdkBuilder.queueConfigurations(_queueConfigurations)
        if (_topicConfigurations.isNotEmpty()) cdkBuilder.topicConfigurations(_topicConfigurations)
        return cdkBuilder.build()
    }
}
