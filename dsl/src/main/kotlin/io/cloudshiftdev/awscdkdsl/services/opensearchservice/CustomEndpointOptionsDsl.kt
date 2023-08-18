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

package io.cloudshiftdev.awscdkdsl.services.opensearchservice

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.certificatemanager.ICertificate
import software.amazon.awscdk.services.opensearchservice.CustomEndpointOptions
import software.amazon.awscdk.services.route53.IHostedZone

/**
 * Configures a custom domain endpoint for the Amazon OpenSearch Service domain.
 *
 * Example:
 * ```
 * Domain.Builder.create(this, "Domain")
 * .version(EngineVersion.OPENSEARCH_1_0)
 * .customEndpoint(CustomEndpointOptions.builder()
 * .domainName("search.example.com")
 * .build())
 * .build();
 * ```
 */
@CdkDslMarker
public class CustomEndpointOptionsDsl {
    private val cdkBuilder: CustomEndpointOptions.Builder = CustomEndpointOptions.builder()

    /** @param certificate The certificate to use. */
    public fun certificate(certificate: ICertificate) {
        cdkBuilder.certificate(certificate)
    }

    /** @param domainName The custom domain name to assign. */
    public fun domainName(domainName: String) {
        cdkBuilder.domainName(domainName)
    }

    /** @param hostedZone The hosted zone in Route53 to create the CNAME record in. */
    public fun hostedZone(hostedZone: IHostedZone) {
        cdkBuilder.hostedZone(hostedZone)
    }

    public fun build(): CustomEndpointOptions = cdkBuilder.build()
}
