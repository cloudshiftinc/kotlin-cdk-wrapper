@file:Suppress(
    "RedundantVisibilityModifier",
    "RedundantUnitReturnType",
    "RemoveRedundantQualifierName",
    "unused",
    "UnusedImport",
    "ClassName",
    "REDUNDANT_PROJECTION",
    "DEPRECATION",
)

package cloudshift.awscdk.dsl.services.opensearchservice

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.opensearchservice.DomainAttributes
import kotlin.String

@CdkDslMarker
public class DomainAttributesDsl {
    private val cdkBuilder: DomainAttributes.Builder = DomainAttributes.builder()

    public fun domainArn(domainArn: String) {
        cdkBuilder.domainArn(domainArn)
    }

    public fun domainEndpoint(domainEndpoint: String) {
        cdkBuilder.domainEndpoint(domainEndpoint)
    }

    public fun build(): DomainAttributes = cdkBuilder.build()
}
