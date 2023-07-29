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
import software.amazon.awscdk.services.route53resolver.CfnResolverDNSSECConfig
import software.constructs.Construct

/**
 * The `AWS::Route53Resolver::ResolverDNSSECConfig` resource is a complex type that contains
 * information about a configuration for DNSSEC validation.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.route53resolver.*;
 * CfnResolverDNSSECConfig cfnResolverDNSSECConfig = CfnResolverDNSSECConfig.Builder.create(this,
 * "MyCfnResolverDNSSECConfig")
 * .resourceId("resourceId")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-route53resolver-resolverdnssecconfig.html)
 */
@CdkDslMarker
public class CfnResolverDNSSECConfigDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnResolverDNSSECConfig.Builder =
        CfnResolverDNSSECConfig.Builder.create(scope, id)

    /**
     * The ID of the virtual private cloud (VPC) that you're configuring the DNSSEC validation
     * status for.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-route53resolver-resolverdnssecconfig.html#cfn-route53resolver-resolverdnssecconfig-resourceid)
     *
     * @param resourceId The ID of the virtual private cloud (VPC) that you're configuring the
     *   DNSSEC validation status for.
     */
    public fun resourceId(resourceId: String) {
        cdkBuilder.resourceId(resourceId)
    }

    public fun build(): CfnResolverDNSSECConfig = cdkBuilder.build()
}
