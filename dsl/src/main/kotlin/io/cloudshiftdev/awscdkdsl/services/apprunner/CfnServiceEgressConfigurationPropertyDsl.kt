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
import software.amazon.awscdk.services.apprunner.CfnService

/**
 * Describes configuration settings related to outbound network traffic of an AWS App Runner
 * service.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.apprunner.*;
 * EgressConfigurationProperty egressConfigurationProperty = EgressConfigurationProperty.builder()
 * .egressType("egressType")
 * // the properties below are optional
 * .vpcConnectorArn("vpcConnectorArn")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apprunner-service-egressconfiguration.html)
 */
@CdkDslMarker
public class CfnServiceEgressConfigurationPropertyDsl {
    private val cdkBuilder: CfnService.EgressConfigurationProperty.Builder =
        CfnService.EgressConfigurationProperty.builder()

    /**
     * @param egressType The type of egress configuration. Set to `DEFAULT` for access to resources
     *   hosted on public networks.
     *
     * Set to `VPC` to associate your service to a custom VPC specified by `VpcConnectorArn` .
     */
    public fun egressType(egressType: String) {
        cdkBuilder.egressType(egressType)
    }

    /**
     * @param vpcConnectorArn The Amazon Resource Name (ARN) of the App Runner VPC connector that
     *   you want to associate with your App Runner service. Only valid when `EgressType = VPC` .
     */
    public fun vpcConnectorArn(vpcConnectorArn: String) {
        cdkBuilder.vpcConnectorArn(vpcConnectorArn)
    }

    public fun build(): CfnService.EgressConfigurationProperty = cdkBuilder.build()
}
