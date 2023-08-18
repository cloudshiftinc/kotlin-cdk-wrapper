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

package io.cloudshiftdev.awscdkdsl.services.msk

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.msk.CfnCluster

/**
 * Broker access controls.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.msk.*;
 * ConnectivityInfoProperty connectivityInfoProperty = ConnectivityInfoProperty.builder()
 * .publicAccess(PublicAccessProperty.builder()
 * .type("type")
 * .build())
 * .vpcConnectivity(VpcConnectivityProperty.builder()
 * .clientAuthentication(VpcConnectivityClientAuthenticationProperty.builder()
 * .sasl(VpcConnectivitySaslProperty.builder()
 * .iam(VpcConnectivityIamProperty.builder()
 * .enabled(false)
 * .build())
 * .scram(VpcConnectivityScramProperty.builder()
 * .enabled(false)
 * .build())
 * .build())
 * .tls(VpcConnectivityTlsProperty.builder()
 * .enabled(false)
 * .build())
 * .build())
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-msk-cluster-connectivityinfo.html)
 */
@CdkDslMarker
public class CfnClusterConnectivityInfoPropertyDsl {
    private val cdkBuilder: CfnCluster.ConnectivityInfoProperty.Builder =
        CfnCluster.ConnectivityInfoProperty.builder()

    /** @param publicAccess Access control settings for the cluster's brokers. */
    public fun publicAccess(publicAccess: IResolvable) {
        cdkBuilder.publicAccess(publicAccess)
    }

    /** @param publicAccess Access control settings for the cluster's brokers. */
    public fun publicAccess(publicAccess: CfnCluster.PublicAccessProperty) {
        cdkBuilder.publicAccess(publicAccess)
    }

    /** @param vpcConnectivity VPC connection control settings for brokers. */
    public fun vpcConnectivity(vpcConnectivity: IResolvable) {
        cdkBuilder.vpcConnectivity(vpcConnectivity)
    }

    /** @param vpcConnectivity VPC connection control settings for brokers. */
    public fun vpcConnectivity(vpcConnectivity: CfnCluster.VpcConnectivityProperty) {
        cdkBuilder.vpcConnectivity(vpcConnectivity)
    }

    public fun build(): CfnCluster.ConnectivityInfoProperty = cdkBuilder.build()
}
