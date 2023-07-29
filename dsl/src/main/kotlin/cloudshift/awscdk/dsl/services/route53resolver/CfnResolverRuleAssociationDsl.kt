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
import software.amazon.awscdk.services.route53resolver.CfnResolverRuleAssociation
import software.constructs.Construct

/**
 * In the response to an
 * [AssociateResolverRule](https://docs.aws.amazon.com/Route53/latest/APIReference/API_route53resolver_AssociateResolverRule.html)
 * ,
 * [DisassociateResolverRule](https://docs.aws.amazon.com/Route53/latest/APIReference/API_route53resolver_DisassociateResolverRule.html)
 * , or
 * [ListResolverRuleAssociations](https://docs.aws.amazon.com/Route53/latest/APIReference/API_route53resolver_ListResolverRuleAssociations.html)
 * request, provides information about an association between a resolver rule and a VPC. The
 * association determines which DNS queries that originate in the VPC are forwarded to your network.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.route53resolver.*;
 * CfnResolverRuleAssociation cfnResolverRuleAssociation =
 * CfnResolverRuleAssociation.Builder.create(this, "MyCfnResolverRuleAssociation")
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
public class CfnResolverRuleAssociationDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnResolverRuleAssociation.Builder =
        CfnResolverRuleAssociation.Builder.create(scope, id)

    /**
     * The name of an association between a Resolver rule and a VPC.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-route53resolver-resolverruleassociation.html#cfn-route53resolver-resolverruleassociation-name)
     *
     * @param name The name of an association between a Resolver rule and a VPC.
     */
    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    /**
     * The ID of the Resolver rule that you associated with the VPC that is specified by `VPCId` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-route53resolver-resolverruleassociation.html#cfn-route53resolver-resolverruleassociation-resolverruleid)
     *
     * @param resolverRuleId The ID of the Resolver rule that you associated with the VPC that is
     *   specified by `VPCId` .
     */
    public fun resolverRuleId(resolverRuleId: String) {
        cdkBuilder.resolverRuleId(resolverRuleId)
    }

    /**
     * The ID of the VPC that you associated the Resolver rule with.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-route53resolver-resolverruleassociation.html#cfn-route53resolver-resolverruleassociation-vpcid)
     *
     * @param vpcId The ID of the VPC that you associated the Resolver rule with.
     */
    public fun vpcId(vpcId: String) {
        cdkBuilder.vpcId(vpcId)
    }

    public fun build(): CfnResolverRuleAssociation = cdkBuilder.build()
}
