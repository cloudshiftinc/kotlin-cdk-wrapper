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
public class CfnClusterVpcConnectivitySaslPropertyDsl {
    private val cdkBuilder: CfnCluster.VpcConnectivitySaslProperty.Builder =
        CfnCluster.VpcConnectivitySaslProperty.builder()

    public fun iam(iam: IResolvable) {
        cdkBuilder.iam(iam)
    }

    public fun iam(iam: CfnCluster.VpcConnectivityIamProperty) {
        cdkBuilder.iam(iam)
    }

    public fun scram(scram: IResolvable) {
        cdkBuilder.scram(scram)
    }

    public fun scram(scram: CfnCluster.VpcConnectivityScramProperty) {
        cdkBuilder.scram(scram)
    }

    public fun build(): CfnCluster.VpcConnectivitySaslProperty = cdkBuilder.build()
}
