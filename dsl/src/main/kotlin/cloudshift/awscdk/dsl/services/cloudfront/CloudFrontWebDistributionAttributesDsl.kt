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

package cloudshift.awscdk.dsl.services.cloudfront

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.cloudfront.CloudFrontWebDistributionAttributes
import kotlin.String

@CdkDslMarker
public class CloudFrontWebDistributionAttributesDsl {
    private val cdkBuilder: CloudFrontWebDistributionAttributes.Builder =
        CloudFrontWebDistributionAttributes.builder()

    public fun distributionId(distributionId: String) {
        cdkBuilder.distributionId(distributionId)
    }

    public fun domainName(domainName: String) {
        cdkBuilder.domainName(domainName)
    }

    public fun build(): CloudFrontWebDistributionAttributes = cdkBuilder.build()
}
