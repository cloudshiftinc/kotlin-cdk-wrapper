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
import software.amazon.awscdk.services.location.CfnGeofenceCollection
import software.constructs.Construct
import kotlin.Deprecated
import kotlin.String

@CdkDslMarker
public class CfnGeofenceCollectionDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnGeofenceCollection.Builder =
        CfnGeofenceCollection.Builder.create(scope, id)

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

    public fun build(): CfnGeofenceCollection = cdkBuilder.build()
}
