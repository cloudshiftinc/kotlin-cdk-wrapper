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
import software.amazon.awscdk.services.location.CfnTrackerProps
import kotlin.Deprecated
import kotlin.String

@CdkDslMarker
public class CfnTrackerPropsDsl {
    private val cdkBuilder: CfnTrackerProps.Builder = CfnTrackerProps.builder()

    public fun description(description: String) {
        cdkBuilder.description(description)
    }

    public fun kmsKeyId(kmsKeyId: String) {
        cdkBuilder.kmsKeyId(kmsKeyId)
    }

    public fun positionFiltering(positionFiltering: String) {
        cdkBuilder.positionFiltering(positionFiltering)
    }

    @Deprecated(message = "deprecated in CDK")
    public fun pricingPlan(pricingPlan: String) {
        cdkBuilder.pricingPlan(pricingPlan)
    }

    @Deprecated(message = "deprecated in CDK")
    public fun pricingPlanDataSource(pricingPlanDataSource: String) {
        cdkBuilder.pricingPlanDataSource(pricingPlanDataSource)
    }

    public fun trackerName(trackerName: String) {
        cdkBuilder.trackerName(trackerName)
    }

    public fun build(): CfnTrackerProps = cdkBuilder.build()
}
