@file:Suppress(
    "RedundantVisibilityModifier",
    "RedundantUnitReturnType",
    "RemoveRedundantQualifierName",
    "unused",
    "UnusedImport",
    "ClassName",
    "REDUNDANT_PROJECTION",
    "DEPRECATION"
)

package cloudshift.awscdk.dsl.services.msk

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.msk.CfnCluster

/**
 * Details for SASL/SCRAM client authentication for vpcConnectivity.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.msk.*;
 * VpcConnectivityScramProperty vpcConnectivityScramProperty =
 * VpcConnectivityScramProperty.builder()
 * .enabled(false)
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-msk-cluster-vpcconnectivityscram.html)
 */
@CdkDslMarker
public class CfnClusterVpcConnectivityScramPropertyDsl {
    private val cdkBuilder: CfnCluster.VpcConnectivityScramProperty.Builder =
        CfnCluster.VpcConnectivityScramProperty.builder()

    /** @param enabled SASL/SCRAM authentication is enabled or not. */
    public fun enabled(enabled: Boolean) {
        cdkBuilder.enabled(enabled)
    }

    /** @param enabled SASL/SCRAM authentication is enabled or not. */
    public fun enabled(enabled: IResolvable) {
        cdkBuilder.enabled(enabled)
    }

    public fun build(): CfnCluster.VpcConnectivityScramProperty = cdkBuilder.build()
}
