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
import software.amazon.awscdk.services.rds.CfnDBCluster
import kotlin.String

@CdkDslMarker
public class CfnDBClusterDBClusterRolePropertyDsl {
    private val cdkBuilder: CfnDBCluster.DBClusterRoleProperty.Builder =
        CfnDBCluster.DBClusterRoleProperty.builder()

    public fun featureName(featureName: String) {
        cdkBuilder.featureName(featureName)
    }

    public fun roleArn(roleArn: String) {
        cdkBuilder.roleArn(roleArn)
    }

    public fun build(): CfnDBCluster.DBClusterRoleProperty = cdkBuilder.build()
}
