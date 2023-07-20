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

package cloudshift.awscdk.dsl.services.route53

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.route53.PublicHostedZoneAttributes
import kotlin.String

@CdkDslMarker
public class PublicHostedZoneAttributesDsl {
    private val cdkBuilder: PublicHostedZoneAttributes.Builder = PublicHostedZoneAttributes.builder()

    public fun hostedZoneId(hostedZoneId: String) {
        cdkBuilder.hostedZoneId(hostedZoneId)
    }

    public fun zoneName(zoneName: String) {
        cdkBuilder.zoneName(zoneName)
    }

    public fun build(): PublicHostedZoneAttributes = cdkBuilder.build()
}
