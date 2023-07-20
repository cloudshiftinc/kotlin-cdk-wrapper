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

package cloudshift.awscdk.dsl.services.secretsmanager

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.secretsmanager.CfnSecret
import kotlin.String

@CdkDslMarker
public class CfnSecretReplicaRegionPropertyDsl {
    private val cdkBuilder: CfnSecret.ReplicaRegionProperty.Builder =
        CfnSecret.ReplicaRegionProperty.builder()

    public fun kmsKeyId(kmsKeyId: String) {
        cdkBuilder.kmsKeyId(kmsKeyId)
    }

    public fun region(region: String) {
        cdkBuilder.region(region)
    }

    public fun build(): CfnSecret.ReplicaRegionProperty = cdkBuilder.build()
}
