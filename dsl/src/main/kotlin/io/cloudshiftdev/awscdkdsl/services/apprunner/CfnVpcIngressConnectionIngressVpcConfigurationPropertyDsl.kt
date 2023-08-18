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

package io.cloudshiftdev.awscdkdsl.services.apprunner

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.apprunner.CfnVpcIngressConnection

/**
 * Specifications for the customer’s VPC and related PrivateLink VPC endpoint that are used to
 * associate with the VPC Ingress Connection resource.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.apprunner.*;
 * IngressVpcConfigurationProperty ingressVpcConfigurationProperty =
 * IngressVpcConfigurationProperty.builder()
 * .vpcEndpointId("vpcEndpointId")
 * .vpcId("vpcId")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apprunner-vpcingressconnection-ingressvpcconfiguration.html)
 */
@CdkDslMarker
public class CfnVpcIngressConnectionIngressVpcConfigurationPropertyDsl {
    private val cdkBuilder: CfnVpcIngressConnection.IngressVpcConfigurationProperty.Builder =
        CfnVpcIngressConnection.IngressVpcConfigurationProperty.builder()

    /** @param vpcEndpointId The ID of the VPC endpoint that your App Runner service connects to. */
    public fun vpcEndpointId(vpcEndpointId: String) {
        cdkBuilder.vpcEndpointId(vpcEndpointId)
    }

    /** @param vpcId The ID of the VPC that is used for the VPC endpoint. */
    public fun vpcId(vpcId: String) {
        cdkBuilder.vpcId(vpcId)
    }

    public fun build(): CfnVpcIngressConnection.IngressVpcConfigurationProperty = cdkBuilder.build()
}
