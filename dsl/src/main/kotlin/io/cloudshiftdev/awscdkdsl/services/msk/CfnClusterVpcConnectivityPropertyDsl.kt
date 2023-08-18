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
 * VPC connection control settings for brokers.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.msk.*;
 * VpcConnectivityProperty vpcConnectivityProperty = VpcConnectivityProperty.builder()
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
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-msk-cluster-vpcconnectivity.html)
 */
@CdkDslMarker
public class CfnClusterVpcConnectivityPropertyDsl {
    private val cdkBuilder: CfnCluster.VpcConnectivityProperty.Builder =
        CfnCluster.VpcConnectivityProperty.builder()

    /** @param clientAuthentication VPC connection control settings for brokers. */
    public fun clientAuthentication(clientAuthentication: IResolvable) {
        cdkBuilder.clientAuthentication(clientAuthentication)
    }

    /** @param clientAuthentication VPC connection control settings for brokers. */
    public fun clientAuthentication(
        clientAuthentication: CfnCluster.VpcConnectivityClientAuthenticationProperty
    ) {
        cdkBuilder.clientAuthentication(clientAuthentication)
    }

    public fun build(): CfnCluster.VpcConnectivityProperty = cdkBuilder.build()
}
