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
 * Details for client authentication using TLS for vpcConnectivity.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.msk.*;
 * VpcConnectivityTlsProperty vpcConnectivityTlsProperty = VpcConnectivityTlsProperty.builder()
 * .enabled(false)
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-msk-cluster-vpcconnectivitytls.html)
 */
@CdkDslMarker
public class CfnClusterVpcConnectivityTlsPropertyDsl {
    private val cdkBuilder: CfnCluster.VpcConnectivityTlsProperty.Builder =
        CfnCluster.VpcConnectivityTlsProperty.builder()

    /** @param enabled TLS authentication is enabled or not. */
    public fun enabled(enabled: Boolean) {
        cdkBuilder.enabled(enabled)
    }

    /** @param enabled TLS authentication is enabled or not. */
    public fun enabled(enabled: IResolvable) {
        cdkBuilder.enabled(enabled)
    }

    public fun build(): CfnCluster.VpcConnectivityTlsProperty = cdkBuilder.build()
}
