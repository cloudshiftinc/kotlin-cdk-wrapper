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
public class CfnDBClusterMasterUserSecretPropertyDsl {
    private val cdkBuilder: CfnDBCluster.MasterUserSecretProperty.Builder =
        CfnDBCluster.MasterUserSecretProperty.builder()

    public fun kmsKeyId(kmsKeyId: String) {
        cdkBuilder.kmsKeyId(kmsKeyId)
    }

    public fun secretArn(secretArn: String) {
        cdkBuilder.secretArn(secretArn)
    }

    public fun build(): CfnDBCluster.MasterUserSecretProperty = cdkBuilder.build()
}
