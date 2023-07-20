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

package cloudshift.awscdk.dsl.services.pinpointemail

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.pinpointemail.CfnConfigurationSetEventDestination
import kotlin.Boolean
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList

@CdkDslMarker
public class CfnConfigurationSetEventDestinationEventDestinationPropertyDsl {
    private val cdkBuilder: CfnConfigurationSetEventDestination.EventDestinationProperty.Builder =
        CfnConfigurationSetEventDestination.EventDestinationProperty.builder()

    private val _matchingEventTypes: MutableList<String> = mutableListOf()

    public fun cloudWatchDestination(cloudWatchDestination: IResolvable) {
        cdkBuilder.cloudWatchDestination(cloudWatchDestination)
    }

    public fun cloudWatchDestination(cloudWatchDestination: CfnConfigurationSetEventDestination.CloudWatchDestinationProperty) {
        cdkBuilder.cloudWatchDestination(cloudWatchDestination)
    }

    public fun enabled(enabled: Boolean) {
        cdkBuilder.enabled(enabled)
    }

    public fun enabled(enabled: IResolvable) {
        cdkBuilder.enabled(enabled)
    }

    public fun kinesisFirehoseDestination(kinesisFirehoseDestination: IResolvable) {
        cdkBuilder.kinesisFirehoseDestination(kinesisFirehoseDestination)
    }

    public fun kinesisFirehoseDestination(kinesisFirehoseDestination: CfnConfigurationSetEventDestination.KinesisFirehoseDestinationProperty) {
        cdkBuilder.kinesisFirehoseDestination(kinesisFirehoseDestination)
    }

    public fun matchingEventTypes(vararg matchingEventTypes: String) {
        _matchingEventTypes.addAll(listOf(*matchingEventTypes))
    }

    public fun matchingEventTypes(matchingEventTypes: Collection<String>) {
        _matchingEventTypes.addAll(matchingEventTypes)
    }

    public fun pinpointDestination(pinpointDestination: IResolvable) {
        cdkBuilder.pinpointDestination(pinpointDestination)
    }

    public fun pinpointDestination(pinpointDestination: CfnConfigurationSetEventDestination.PinpointDestinationProperty) {
        cdkBuilder.pinpointDestination(pinpointDestination)
    }

    public fun snsDestination(snsDestination: IResolvable) {
        cdkBuilder.snsDestination(snsDestination)
    }

    public fun snsDestination(snsDestination: CfnConfigurationSetEventDestination.SnsDestinationProperty) {
        cdkBuilder.snsDestination(snsDestination)
    }

    public fun build(): CfnConfigurationSetEventDestination.EventDestinationProperty {
        if (_matchingEventTypes.isNotEmpty()) cdkBuilder.matchingEventTypes(_matchingEventTypes)
        return cdkBuilder.build()
    }
}
