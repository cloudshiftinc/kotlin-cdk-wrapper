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

package io.cloudshiftdev.awscdkdsl.services.route53

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.route53.HostedZoneAttributes

/**
 * Reference to a hosted zone.
 *
 * Example:
 * ```
 * App app;
 * Stack stack = Stack.Builder.create(app, "Stack")
 * .crossRegionReferences(true)
 * .env(Environment.builder()
 * .region("us-east-2")
 * .build())
 * .build();
 * HttpsRedirect.Builder.create(this, "Redirect")
 * .recordNames(List.of("foo.example.com"))
 * .targetDomain("bar.example.com")
 * .zone(HostedZone.fromHostedZoneAttributes(this, "HostedZone", HostedZoneAttributes.builder()
 * .hostedZoneId("ID")
 * .zoneName("example.com")
 * .build()))
 * .build();
 * ```
 */
@CdkDslMarker
public class HostedZoneAttributesDsl {
    private val cdkBuilder: HostedZoneAttributes.Builder = HostedZoneAttributes.builder()

    /** @param hostedZoneId Identifier of the hosted zone. */
    public fun hostedZoneId(hostedZoneId: String) {
        cdkBuilder.hostedZoneId(hostedZoneId)
    }

    /** @param zoneName Name of the hosted zone. */
    public fun zoneName(zoneName: String) {
        cdkBuilder.zoneName(zoneName)
    }

    public fun build(): HostedZoneAttributes = cdkBuilder.build()
}
