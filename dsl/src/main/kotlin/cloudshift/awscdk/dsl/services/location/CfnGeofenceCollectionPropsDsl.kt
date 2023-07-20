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
import software.amazon.awscdk.services.location.CfnGeofenceCollectionProps
import kotlin.Deprecated
import kotlin.String

@CdkDslMarker
public class CfnGeofenceCollectionPropsDsl {
    private val cdkBuilder: CfnGeofenceCollectionProps.Builder = CfnGeofenceCollectionProps.builder()

    public fun collectionName(collectionName: String) {
        cdkBuilder.collectionName(collectionName)
    }

    public fun description(description: String) {
        cdkBuilder.description(description)
    }

    public fun kmsKeyId(kmsKeyId: String) {
        cdkBuilder.kmsKeyId(kmsKeyId)
    }

    @Deprecated(message = "deprecated in CDK")
    public fun pricingPlan(pricingPlan: String) {
        cdkBuilder.pricingPlan(pricingPlan)
    }

    @Deprecated(message = "deprecated in CDK")
    public fun pricingPlanDataSource(pricingPlanDataSource: String) {
        cdkBuilder.pricingPlanDataSource(pricingPlanDataSource)
    }

    public fun build(): CfnGeofenceCollectionProps = cdkBuilder.build()
}
