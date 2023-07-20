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

package cloudshift.awscdk.dsl.services.internetmonitor

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.dsl.CfnTagDsl
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.internetmonitor.CfnMonitor
import software.constructs.Construct
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList

@CdkDslMarker
public class CfnMonitorDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnMonitor.Builder = CfnMonitor.Builder.create(scope, id)

    private val _resources: MutableList<String> = mutableListOf()

    private val _resourcesToAdd: MutableList<String> = mutableListOf()

    private val _resourcesToRemove: MutableList<String> = mutableListOf()

    private val _tags: MutableList<CfnTag> = mutableListOf()

    public fun healthEventsConfig(healthEventsConfig: IResolvable) {
        cdkBuilder.healthEventsConfig(healthEventsConfig)
    }

    public fun healthEventsConfig(healthEventsConfig: CfnMonitor.HealthEventsConfigProperty) {
        cdkBuilder.healthEventsConfig(healthEventsConfig)
    }

    public fun internetMeasurementsLogDelivery(internetMeasurementsLogDelivery: IResolvable) {
        cdkBuilder.internetMeasurementsLogDelivery(internetMeasurementsLogDelivery)
    }

    public fun internetMeasurementsLogDelivery(internetMeasurementsLogDelivery: CfnMonitor.InternetMeasurementsLogDeliveryProperty) {
        cdkBuilder.internetMeasurementsLogDelivery(internetMeasurementsLogDelivery)
    }

    public fun maxCityNetworksToMonitor(maxCityNetworksToMonitor: Number) {
        cdkBuilder.maxCityNetworksToMonitor(maxCityNetworksToMonitor)
    }

    public fun monitorName(monitorName: String) {
        cdkBuilder.monitorName(monitorName)
    }

    public fun resources(vararg resources: String) {
        _resources.addAll(listOf(*resources))
    }

    public fun resources(resources: Collection<String>) {
        _resources.addAll(resources)
    }

    public fun resourcesToAdd(vararg resourcesToAdd: String) {
        _resourcesToAdd.addAll(listOf(*resourcesToAdd))
    }

    public fun resourcesToAdd(resourcesToAdd: Collection<String>) {
        _resourcesToAdd.addAll(resourcesToAdd)
    }

    public fun resourcesToRemove(vararg resourcesToRemove: String) {
        _resourcesToRemove.addAll(listOf(*resourcesToRemove))
    }

    public fun resourcesToRemove(resourcesToRemove: Collection<String>) {
        _resourcesToRemove.addAll(resourcesToRemove)
    }

    public fun status(status: String) {
        cdkBuilder.status(status)
    }

    public fun tags(tags: CfnTagDsl.() -> Unit) {
        _tags.add(CfnTagDsl().apply(tags).build())
    }

    public fun tags(tags: Collection<CfnTag>) {
        _tags.addAll(tags)
    }

    public fun trafficPercentageToMonitor(trafficPercentageToMonitor: Number) {
        cdkBuilder.trafficPercentageToMonitor(trafficPercentageToMonitor)
    }

    public fun build(): CfnMonitor {
        if (_resources.isNotEmpty()) cdkBuilder.resources(_resources)
        if (_resourcesToAdd.isNotEmpty()) cdkBuilder.resourcesToAdd(_resourcesToAdd)
        if (_resourcesToRemove.isNotEmpty()) cdkBuilder.resourcesToRemove(_resourcesToRemove)
        if (_tags.isNotEmpty()) cdkBuilder.tags(_tags)
        return cdkBuilder.build()
    }
}
