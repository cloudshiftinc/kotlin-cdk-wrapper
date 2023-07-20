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

package cloudshift.awscdk.dsl.services.gamelift

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.dsl.CfnTagDsl
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.gamelift.CfnGameSessionQueue
import software.constructs.Construct
import kotlin.Any
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList

@CdkDslMarker
public class CfnGameSessionQueueDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnGameSessionQueue.Builder = CfnGameSessionQueue.Builder.create(
        scope,
        id,
    )

    private val _destinations: MutableList<Any> = mutableListOf()

    private val _playerLatencyPolicies: MutableList<Any> = mutableListOf()

    private val _tags: MutableList<CfnTag> = mutableListOf()

    public fun customEventData(customEventData: String) {
        cdkBuilder.customEventData(customEventData)
    }

    public fun destinations(vararg destinations: Any) {
        _destinations.addAll(listOf(*destinations))
    }

    public fun destinations(destinations: Collection<Any>) {
        _destinations.addAll(destinations)
    }

    public fun destinations(destinations: IResolvable) {
        cdkBuilder.destinations(destinations)
    }

    public fun filterConfiguration(filterConfiguration: IResolvable) {
        cdkBuilder.filterConfiguration(filterConfiguration)
    }

    public fun filterConfiguration(filterConfiguration: CfnGameSessionQueue.FilterConfigurationProperty) {
        cdkBuilder.filterConfiguration(filterConfiguration)
    }

    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    public fun notificationTarget(notificationTarget: String) {
        cdkBuilder.notificationTarget(notificationTarget)
    }

    public fun playerLatencyPolicies(vararg playerLatencyPolicies: Any) {
        _playerLatencyPolicies.addAll(listOf(*playerLatencyPolicies))
    }

    public fun playerLatencyPolicies(playerLatencyPolicies: Collection<Any>) {
        _playerLatencyPolicies.addAll(playerLatencyPolicies)
    }

    public fun playerLatencyPolicies(playerLatencyPolicies: IResolvable) {
        cdkBuilder.playerLatencyPolicies(playerLatencyPolicies)
    }

    public fun priorityConfiguration(priorityConfiguration: IResolvable) {
        cdkBuilder.priorityConfiguration(priorityConfiguration)
    }

    public fun priorityConfiguration(priorityConfiguration: CfnGameSessionQueue.PriorityConfigurationProperty) {
        cdkBuilder.priorityConfiguration(priorityConfiguration)
    }

    public fun tags(tags: CfnTagDsl.() -> Unit) {
        _tags.add(CfnTagDsl().apply(tags).build())
    }

    public fun tags(tags: Collection<CfnTag>) {
        _tags.addAll(tags)
    }

    public fun timeoutInSeconds(timeoutInSeconds: Number) {
        cdkBuilder.timeoutInSeconds(timeoutInSeconds)
    }

    public fun build(): CfnGameSessionQueue {
        if (_destinations.isNotEmpty()) cdkBuilder.destinations(_destinations)
        if (_playerLatencyPolicies.isNotEmpty()) cdkBuilder.playerLatencyPolicies(_playerLatencyPolicies)
        if (_tags.isNotEmpty()) cdkBuilder.tags(_tags)
        return cdkBuilder.build()
    }
}
