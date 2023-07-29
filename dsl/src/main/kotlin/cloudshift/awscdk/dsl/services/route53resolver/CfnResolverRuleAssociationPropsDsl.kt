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
import software.amazon.awscdk.services.route53resolver.CfnResolverRuleAssociationProps

/**
 * Properties for defining a `CfnResolverRuleAssociation`.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.route53resolver.*;
 * CfnResolverRuleAssociationProps cfnResolverRuleAssociationProps =
 * CfnResolverRuleAssociationProps.builder()
 * .resolverRuleId("resolverRuleId")
 * .vpcId("vpcId")
 * // the properties below are optional
 * .name("name")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-route53resolver-resolverruleassociation.html)
 */
@CdkDslMarker
public class CfnResolverRuleAssociationPropsDsl {
    private val cdkBuilder: CfnResolverRuleAssociationProps.Builder =
        CfnResolverRuleAssociationProps.builder()

    /** @param name The name of an association between a Resolver rule and a VPC. */
    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    /**
     * @param resolverRuleId The ID of the Resolver rule that you associated with the VPC that is
     *   specified by `VPCId` .
     */
    public fun resolverRuleId(resolverRuleId: String) {
        cdkBuilder.resolverRuleId(resolverRuleId)
    }

    /** @param vpcId The ID of the VPC that you associated the Resolver rule with. */
    public fun vpcId(vpcId: String) {
        cdkBuilder.vpcId(vpcId)
    }

    public fun build(): CfnResolverRuleAssociationProps = cdkBuilder.build()
}
