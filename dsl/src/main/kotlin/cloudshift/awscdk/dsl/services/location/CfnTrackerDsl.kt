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
import software.amazon.awscdk.services.location.CfnTracker
import software.constructs.Construct
import kotlin.Deprecated
import kotlin.String

@CdkDslMarker
public class CfnTrackerDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnTracker.Builder = CfnTracker.Builder.create(scope, id)

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

    public fun build(): CfnTracker = cdkBuilder.build()
}
