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
import software.amazon.awscdk.services.cloudtrail.AddEventSelectorOptions
import software.amazon.awscdk.services.cloudtrail.ManagementEventSources
import software.amazon.awscdk.services.cloudtrail.ReadWriteType
import kotlin.Boolean
import kotlin.collections.Collection
import kotlin.collections.MutableList

@CdkDslMarker
public class AddEventSelectorOptionsDsl {
    private val cdkBuilder: AddEventSelectorOptions.Builder = AddEventSelectorOptions.builder()

    private val _excludeManagementEventSources: MutableList<ManagementEventSources> = mutableListOf()

    public fun excludeManagementEventSources(
        vararg excludeManagementEventSources: ManagementEventSources,
    ) {
        _excludeManagementEventSources.addAll(listOf(*excludeManagementEventSources))
    }

    public fun excludeManagementEventSources(excludeManagementEventSources: Collection<ManagementEventSources>) {
        _excludeManagementEventSources.addAll(excludeManagementEventSources)
    }

    public fun includeManagementEvents(includeManagementEvents: Boolean) {
        cdkBuilder.includeManagementEvents(includeManagementEvents)
    }

    public fun readWriteType(readWriteType: ReadWriteType) {
        cdkBuilder.readWriteType(readWriteType)
    }

    public fun build(): AddEventSelectorOptions {
        if (_excludeManagementEventSources.isNotEmpty()) {
            cdkBuilder.excludeManagementEventSources(_excludeManagementEventSources)
        }
        return cdkBuilder.build()
    }
}
