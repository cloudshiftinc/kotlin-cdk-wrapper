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

package cloudshift.awscdk.dsl.services.elasticsearch

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Deprecated
import kotlin.String
import software.amazon.awscdk.services.elasticsearch.DomainAttributes

/**
 * (deprecated) Reference to an Elasticsearch domain.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.elasticsearch.*;
 * DomainAttributes domainAttributes = DomainAttributes.builder()
 * .domainArn("domainArn")
 * .domainEndpoint("domainEndpoint")
 * .build();
 * ```
 *
 * @deprecated use opensearchservice module instead
 */
@CdkDslMarker
@Deprecated(message = "deprecated in CDK")
public class DomainAttributesDsl {
    private val cdkBuilder: DomainAttributes.Builder = DomainAttributes.builder()

    /**
     * @param domainArn The ARN of the Elasticsearch domain.
     * @deprecated use opensearchservice module instead
     */
    @Deprecated(message = "deprecated in CDK")
    public fun domainArn(domainArn: String) {
        cdkBuilder.domainArn(domainArn)
    }

    /**
     * @param domainEndpoint The domain endpoint of the Elasticsearch domain.
     * @deprecated use opensearchservice module instead
     */
    @Deprecated(message = "deprecated in CDK")
    public fun domainEndpoint(domainEndpoint: String) {
        cdkBuilder.domainEndpoint(domainEndpoint)
    }

    public fun build(): DomainAttributes = cdkBuilder.build()
}
