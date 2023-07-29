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

package cloudshift.awscdk.dsl.services.gamelift

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.services.gamelift.CfnGameSessionQueue

/**
 * A list of fleet locations where a game session queue can place new game sessions.
 *
 * You can use a filter to temporarily turn off placements for specific locations. For queues that
 * have multi-location fleets, you can use a filter configuration allow placement with some, but not
 * all of these locations.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.gamelift.*;
 * FilterConfigurationProperty filterConfigurationProperty = FilterConfigurationProperty.builder()
 * .allowedLocations(List.of("allowedLocations"))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-gamelift-gamesessionqueue-filterconfiguration.html)
 */
@CdkDslMarker
public class CfnGameSessionQueueFilterConfigurationPropertyDsl {
    private val cdkBuilder: CfnGameSessionQueue.FilterConfigurationProperty.Builder =
        CfnGameSessionQueue.FilterConfigurationProperty.builder()

    private val _allowedLocations: MutableList<String> = mutableListOf()

    /**
     * @param allowedLocations A list of locations to allow game session placement in, in the form
     *   of AWS Region codes such as `us-west-2` .
     */
    public fun allowedLocations(vararg allowedLocations: String) {
        _allowedLocations.addAll(listOf(*allowedLocations))
    }

    /**
     * @param allowedLocations A list of locations to allow game session placement in, in the form
     *   of AWS Region codes such as `us-west-2` .
     */
    public fun allowedLocations(allowedLocations: Collection<String>) {
        _allowedLocations.addAll(allowedLocations)
    }

    public fun build(): CfnGameSessionQueue.FilterConfigurationProperty {
        if (_allowedLocations.isNotEmpty()) cdkBuilder.allowedLocations(_allowedLocations)
        return cdkBuilder.build()
    }
}
