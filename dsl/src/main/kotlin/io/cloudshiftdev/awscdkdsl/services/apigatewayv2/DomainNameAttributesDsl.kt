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

package io.cloudshiftdev.awscdkdsl.services.apigatewayv2

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.apigatewayv2.DomainNameAttributes

/**
 * custom domain name attributes.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.apigatewayv2.*;
 * DomainNameAttributes domainNameAttributes = DomainNameAttributes.builder()
 * .name("name")
 * .regionalDomainName("regionalDomainName")
 * .regionalHostedZoneId("regionalHostedZoneId")
 * .build();
 * ```
 */
@CdkDslMarker
public class DomainNameAttributesDsl {
    private val cdkBuilder: DomainNameAttributes.Builder = DomainNameAttributes.builder()

    /** @param name domain name string. */
    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    /**
     * @param regionalDomainName The domain name associated with the regional endpoint for this
     *   custom domain name.
     */
    public fun regionalDomainName(regionalDomainName: String) {
        cdkBuilder.regionalDomainName(regionalDomainName)
    }

    /**
     * @param regionalHostedZoneId The region-specific Amazon Route 53 Hosted Zone ID of the
     *   regional endpoint.
     */
    public fun regionalHostedZoneId(regionalHostedZoneId: String) {
        cdkBuilder.regionalHostedZoneId(regionalHostedZoneId)
    }

    public fun build(): DomainNameAttributes = cdkBuilder.build()
}
