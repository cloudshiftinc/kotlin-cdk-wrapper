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

package cloudshift.awscdk.dsl.services.msk

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.msk.CfnCluster

@CdkDslMarker
public class CfnClusterEncryptionInfoPropertyDsl {
    private val cdkBuilder: CfnCluster.EncryptionInfoProperty.Builder =
        CfnCluster.EncryptionInfoProperty.builder()

    public fun encryptionAtRest(encryptionAtRest: IResolvable) {
        cdkBuilder.encryptionAtRest(encryptionAtRest)
    }

    public fun encryptionAtRest(encryptionAtRest: CfnCluster.EncryptionAtRestProperty) {
        cdkBuilder.encryptionAtRest(encryptionAtRest)
    }

    public fun encryptionInTransit(encryptionInTransit: IResolvable) {
        cdkBuilder.encryptionInTransit(encryptionInTransit)
    }

    public fun encryptionInTransit(encryptionInTransit: CfnCluster.EncryptionInTransitProperty) {
        cdkBuilder.encryptionInTransit(encryptionInTransit)
    }

    public fun build(): CfnCluster.EncryptionInfoProperty = cdkBuilder.build()
}
