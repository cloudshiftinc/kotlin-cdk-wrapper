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

package cloudshift.awscdk.dsl.services.route53

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.route53.AliasRecordTargetConfig

/**
 * Represents the properties of an alias target destination.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.route53.*;
 * AliasRecordTargetConfig aliasRecordTargetConfig = AliasRecordTargetConfig.builder()
 * .dnsName("dnsName")
 * .hostedZoneId("hostedZoneId")
 * .build();
 * ```
 */
@CdkDslMarker
public class AliasRecordTargetConfigDsl {
    private val cdkBuilder: AliasRecordTargetConfig.Builder = AliasRecordTargetConfig.builder()

    /** @param dnsName DNS name of the target. */
    public fun dnsName(dnsName: String) {
        cdkBuilder.dnsName(dnsName)
    }

    /** @param hostedZoneId Hosted zone ID of the target. */
    public fun hostedZoneId(hostedZoneId: String) {
        cdkBuilder.hostedZoneId(hostedZoneId)
    }

    public fun build(): AliasRecordTargetConfig = cdkBuilder.build()
}
