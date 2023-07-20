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
import software.amazon.awscdk.services.location.CfnTrackerConsumer
import software.constructs.Construct
import kotlin.String

@CdkDslMarker
public class CfnTrackerConsumerDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnTrackerConsumer.Builder = CfnTrackerConsumer.Builder.create(scope, id)

    public fun consumerArn(consumerArn: String) {
        cdkBuilder.consumerArn(consumerArn)
    }

    public fun trackerName(trackerName: String) {
        cdkBuilder.trackerName(trackerName)
    }

    public fun build(): CfnTrackerConsumer = cdkBuilder.build()
}
