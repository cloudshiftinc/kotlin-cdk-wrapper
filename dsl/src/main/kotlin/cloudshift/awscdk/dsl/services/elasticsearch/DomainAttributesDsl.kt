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

package cloudshift.awscdk.dsl.services.elasticsearch

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.elasticsearch.DomainAttributes
import kotlin.Deprecated
import kotlin.String

@CdkDslMarker
@Deprecated(message = "deprecated in CDK")
public class DomainAttributesDsl {
    private val cdkBuilder: DomainAttributes.Builder = DomainAttributes.builder()

    @Deprecated(message = "deprecated in CDK")
    public fun domainArn(domainArn: String) {
        cdkBuilder.domainArn(domainArn)
    }

    @Deprecated(message = "deprecated in CDK")
    public fun domainEndpoint(domainEndpoint: String) {
        cdkBuilder.domainEndpoint(domainEndpoint)
    }

    public fun build(): DomainAttributes = cdkBuilder.build()
}
