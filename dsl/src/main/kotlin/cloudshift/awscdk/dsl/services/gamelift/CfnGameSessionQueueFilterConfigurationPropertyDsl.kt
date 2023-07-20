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
import software.amazon.awscdk.services.gamelift.CfnGameSessionQueue
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList

@CdkDslMarker
public class CfnGameSessionQueueFilterConfigurationPropertyDsl {
    private val cdkBuilder: CfnGameSessionQueue.FilterConfigurationProperty.Builder =
        CfnGameSessionQueue.FilterConfigurationProperty.builder()

    private val _allowedLocations: MutableList<String> = mutableListOf()

    public fun allowedLocations(vararg allowedLocations: String) {
        _allowedLocations.addAll(listOf(*allowedLocations))
    }

    public fun allowedLocations(allowedLocations: Collection<String>) {
        _allowedLocations.addAll(allowedLocations)
    }

    public fun build(): CfnGameSessionQueue.FilterConfigurationProperty {
        if (_allowedLocations.isNotEmpty()) cdkBuilder.allowedLocations(_allowedLocations)
        return cdkBuilder.build()
    }
}
