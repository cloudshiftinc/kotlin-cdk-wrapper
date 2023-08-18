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

package io.cloudshiftdev.awscdkdsl.services.vpclattice

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.vpclattice.CfnServiceNetworkServiceAssociation

/**
 * DNS information about the service.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.vpclattice.*;
 * DnsEntryProperty dnsEntryProperty = DnsEntryProperty.builder()
 * .domainName("domainName")
 * .hostedZoneId("hostedZoneId")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-vpclattice-servicenetworkserviceassociation-dnsentry.html)
 */
@CdkDslMarker
public class CfnServiceNetworkServiceAssociationDnsEntryPropertyDsl {
    private val cdkBuilder: CfnServiceNetworkServiceAssociation.DnsEntryProperty.Builder =
        CfnServiceNetworkServiceAssociation.DnsEntryProperty.builder()

    /** @param domainName The domain name of the service. */
    public fun domainName(domainName: String) {
        cdkBuilder.domainName(domainName)
    }

    /** @param hostedZoneId The ID of the hosted zone. */
    public fun hostedZoneId(hostedZoneId: String) {
        cdkBuilder.hostedZoneId(hostedZoneId)
    }

    public fun build(): CfnServiceNetworkServiceAssociation.DnsEntryProperty = cdkBuilder.build()
}
