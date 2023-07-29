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

package cloudshift.awscdk.dsl.services.route53resolver

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.route53resolver.CfnResolverDNSSECConfigProps

/**
 * Properties for defining a `CfnResolverDNSSECConfig`.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.route53resolver.*;
 * CfnResolverDNSSECConfigProps cfnResolverDNSSECConfigProps =
 * CfnResolverDNSSECConfigProps.builder()
 * .resourceId("resourceId")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-route53resolver-resolverdnssecconfig.html)
 */
@CdkDslMarker
public class CfnResolverDNSSECConfigPropsDsl {
    private val cdkBuilder: CfnResolverDNSSECConfigProps.Builder =
        CfnResolverDNSSECConfigProps.builder()

    /**
     * @param resourceId The ID of the virtual private cloud (VPC) that you're configuring the
     *   DNSSEC validation status for.
     */
    public fun resourceId(resourceId: String) {
        cdkBuilder.resourceId(resourceId)
    }

    public fun build(): CfnResolverDNSSECConfigProps = cdkBuilder.build()
}
