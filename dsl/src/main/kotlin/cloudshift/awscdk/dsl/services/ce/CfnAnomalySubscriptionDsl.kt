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

package cloudshift.awscdk.dsl.services.ce

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.ce.CfnAnomalySubscription
import software.constructs.Construct
import kotlin.Any
import kotlin.Number
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList

@CdkDslMarker
public class CfnAnomalySubscriptionDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnAnomalySubscription.Builder =
        CfnAnomalySubscription.Builder.create(scope, id)

    private val _monitorArnList: MutableList<String> = mutableListOf()

    private val _resourceTags: MutableList<Any> = mutableListOf()

    private val _subscribers: MutableList<Any> = mutableListOf()

    public fun frequency(frequency: String) {
        cdkBuilder.frequency(frequency)
    }

    public fun monitorArnList(vararg monitorArnList: String) {
        _monitorArnList.addAll(listOf(*monitorArnList))
    }

    public fun monitorArnList(monitorArnList: Collection<String>) {
        _monitorArnList.addAll(monitorArnList)
    }

    public fun resourceTags(vararg resourceTags: Any) {
        _resourceTags.addAll(listOf(*resourceTags))
    }

    public fun resourceTags(resourceTags: Collection<Any>) {
        _resourceTags.addAll(resourceTags)
    }

    public fun resourceTags(resourceTags: IResolvable) {
        cdkBuilder.resourceTags(resourceTags)
    }

    public fun subscribers(vararg subscribers: Any) {
        _subscribers.addAll(listOf(*subscribers))
    }

    public fun subscribers(subscribers: Collection<Any>) {
        _subscribers.addAll(subscribers)
    }

    public fun subscribers(subscribers: IResolvable) {
        cdkBuilder.subscribers(subscribers)
    }

    public fun subscriptionName(subscriptionName: String) {
        cdkBuilder.subscriptionName(subscriptionName)
    }

    public fun threshold(threshold: Number) {
        cdkBuilder.threshold(threshold)
    }

    public fun thresholdExpression(thresholdExpression: String) {
        cdkBuilder.thresholdExpression(thresholdExpression)
    }

    public fun build(): CfnAnomalySubscription {
        if (_monitorArnList.isNotEmpty()) cdkBuilder.monitorArnList(_monitorArnList)
        if (_resourceTags.isNotEmpty()) cdkBuilder.resourceTags(_resourceTags)
        if (_subscribers.isNotEmpty()) cdkBuilder.subscribers(_subscribers)
        return cdkBuilder.build()
    }
}
