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

package cloudshift.awscdk.dsl.services.cloudtrail

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.cloudtrail.CfnTrail
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList

@CdkDslMarker
public class CfnTrailEventSelectorPropertyDsl {
    private val cdkBuilder: CfnTrail.EventSelectorProperty.Builder =
        CfnTrail.EventSelectorProperty.builder()

    private val _dataResources: MutableList<Any> = mutableListOf()

    private val _excludeManagementEventSources: MutableList<String> = mutableListOf()

    public fun dataResources(vararg dataResources: Any) {
        _dataResources.addAll(listOf(*dataResources))
    }

    public fun dataResources(dataResources: Collection<Any>) {
        _dataResources.addAll(dataResources)
    }

    public fun dataResources(dataResources: IResolvable) {
        cdkBuilder.dataResources(dataResources)
    }

    public fun excludeManagementEventSources(vararg excludeManagementEventSources: String) {
        _excludeManagementEventSources.addAll(listOf(*excludeManagementEventSources))
    }

    public fun excludeManagementEventSources(excludeManagementEventSources: Collection<String>) {
        _excludeManagementEventSources.addAll(excludeManagementEventSources)
    }

    public fun includeManagementEvents(includeManagementEvents: Boolean) {
        cdkBuilder.includeManagementEvents(includeManagementEvents)
    }

    public fun includeManagementEvents(includeManagementEvents: IResolvable) {
        cdkBuilder.includeManagementEvents(includeManagementEvents)
    }

    public fun readWriteType(readWriteType: String) {
        cdkBuilder.readWriteType(readWriteType)
    }

    public fun build(): CfnTrail.EventSelectorProperty {
        if (_dataResources.isNotEmpty()) cdkBuilder.dataResources(_dataResources)
        if (_excludeManagementEventSources.isNotEmpty()) {
            cdkBuilder.excludeManagementEventSources(_excludeManagementEventSources)
        }
        return cdkBuilder.build()
    }
}
