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

package cloudshift.awscdk.dsl.services.rds

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.Duration
import software.amazon.awscdk.RemovalPolicy
import software.amazon.awscdk.services.iam.IRole
import software.amazon.awscdk.services.rds.ClusterInstanceBindOptions
import software.amazon.awscdk.services.rds.ISubnetGroup
import kotlin.Number

@CdkDslMarker
public class ClusterInstanceBindOptionsDsl {
    private val cdkBuilder: ClusterInstanceBindOptions.Builder = ClusterInstanceBindOptions.builder()

    public fun monitoringInterval(monitoringInterval: Duration) {
        cdkBuilder.monitoringInterval(monitoringInterval)
    }

    public fun monitoringRole(monitoringRole: IRole) {
        cdkBuilder.monitoringRole(monitoringRole)
    }

    public fun promotionTier(promotionTier: Number) {
        cdkBuilder.promotionTier(promotionTier)
    }

    public fun removalPolicy(removalPolicy: RemovalPolicy) {
        cdkBuilder.removalPolicy(removalPolicy)
    }

    public fun subnetGroup(subnetGroup: ISubnetGroup) {
        cdkBuilder.subnetGroup(subnetGroup)
    }

    public fun build(): ClusterInstanceBindOptions = cdkBuilder.build()
}
