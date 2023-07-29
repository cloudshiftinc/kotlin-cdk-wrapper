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
import software.amazon.awscdk.services.route53.CfnDNSSECProps

/**
 * Properties for defining a `CfnDNSSEC`.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.route53.*;
 * CfnDNSSECProps cfnDNSSECProps = CfnDNSSECProps.builder()
 * .hostedZoneId("hostedZoneId")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-route53-dnssec.html)
 */
@CdkDslMarker
public class CfnDNSSECPropsDsl {
    private val cdkBuilder: CfnDNSSECProps.Builder = CfnDNSSECProps.builder()

    /**
     * @param hostedZoneId A unique string (ID) that is used to identify a hosted zone. For example:
     *   `Z00001111A1ABCaaABC11` .
     */
    public fun hostedZoneId(hostedZoneId: String) {
        cdkBuilder.hostedZoneId(hostedZoneId)
    }

    public fun build(): CfnDNSSECProps = cdkBuilder.build()
}
