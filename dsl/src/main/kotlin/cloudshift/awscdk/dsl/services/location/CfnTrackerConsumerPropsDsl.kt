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

package cloudshift.awscdk.dsl.services.location

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.location.CfnTrackerConsumerProps
import kotlin.String

@CdkDslMarker
public class CfnTrackerConsumerPropsDsl {
    private val cdkBuilder: CfnTrackerConsumerProps.Builder = CfnTrackerConsumerProps.builder()

    public fun consumerArn(consumerArn: String) {
        cdkBuilder.consumerArn(consumerArn)
    }

    public fun trackerName(trackerName: String) {
        cdkBuilder.trackerName(trackerName)
    }

    public fun build(): CfnTrackerConsumerProps = cdkBuilder.build()
}
