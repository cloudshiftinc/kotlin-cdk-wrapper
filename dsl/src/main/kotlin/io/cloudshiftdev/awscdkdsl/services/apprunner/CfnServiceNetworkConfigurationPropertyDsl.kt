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
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.apprunner.CfnService

/**
 * Describes configuration settings related to network traffic of an AWS App Runner service.
 *
 * Consists of embedded objects for each configurable network feature.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.apprunner.*;
 * NetworkConfigurationProperty networkConfigurationProperty =
 * NetworkConfigurationProperty.builder()
 * .egressConfiguration(EgressConfigurationProperty.builder()
 * .egressType("egressType")
 * // the properties below are optional
 * .vpcConnectorArn("vpcConnectorArn")
 * .build())
 * .ingressConfiguration(IngressConfigurationProperty.builder()
 * .isPubliclyAccessible(false)
 * .build())
 * .ipAddressType("ipAddressType")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apprunner-service-networkconfiguration.html)
 */
@CdkDslMarker
public class CfnServiceNetworkConfigurationPropertyDsl {
    private val cdkBuilder: CfnService.NetworkConfigurationProperty.Builder =
        CfnService.NetworkConfigurationProperty.builder()

    /** @param egressConfiguration Network configuration settings for outbound message traffic. */
    public fun egressConfiguration(egressConfiguration: IResolvable) {
        cdkBuilder.egressConfiguration(egressConfiguration)
    }

    /** @param egressConfiguration Network configuration settings for outbound message traffic. */
    public fun egressConfiguration(egressConfiguration: CfnService.EgressConfigurationProperty) {
        cdkBuilder.egressConfiguration(egressConfiguration)
    }

    /** @param ingressConfiguration Network configuration settings for inbound message traffic. */
    public fun ingressConfiguration(ingressConfiguration: IResolvable) {
        cdkBuilder.ingressConfiguration(ingressConfiguration)
    }

    /** @param ingressConfiguration Network configuration settings for inbound message traffic. */
    public fun ingressConfiguration(ingressConfiguration: CfnService.IngressConfigurationProperty) {
        cdkBuilder.ingressConfiguration(ingressConfiguration)
    }

    /**
     * @param ipAddressType App Runner provides you with the option to choose between *Internet
     *   Protocol version 4 (IPv4)* and *dual stack* (IPv4 and IPv6) for your incoming public
     *   network configuration. This is an optional parameter. If you do not specify an
     *   `IpAddressType` , it defaults to select IPv4.
     *
     * Currently, App Runner supports dual stack for only Public endpoint. Only IPv4 is supported
     * for Private endpoint. If you update a service that's using dual-stack Public endpoint to a
     * Private endpoint, your App Runner service will default to support only IPv4 for Private
     * endpoint and fail to receive traffic originating from IPv6 endpoint.
     */
    public fun ipAddressType(ipAddressType: String) {
        cdkBuilder.ipAddressType(ipAddressType)
    }

    public fun build(): CfnService.NetworkConfigurationProperty = cdkBuilder.build()
}
