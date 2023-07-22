@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.route53resolver

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.route53resolver.CfnResolverRuleAssociation
import software.constructs.Construct

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
   * @param name The name of an association between a Resolver rule and a VPC. 
   */
  public fun name(name: String) {
    cdkBuilder.name(name)
  }

  /**
   * The ID of the Resolver rule that you associated with the VPC that is specified by `VPCId` .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-route53resolver-resolverruleassociation.html#cfn-route53resolver-resolverruleassociation-resolverruleid)
   * @param resolverRuleId The ID of the Resolver rule that you associated with the VPC that is
   * specified by `VPCId` . 
   */
  public fun resolverRuleId(resolverRuleId: String) {
    cdkBuilder.resolverRuleId(resolverRuleId)
  }

  /**
   * The ID of the VPC that you associated the Resolver rule with.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-route53resolver-resolverruleassociation.html#cfn-route53resolver-resolverruleassociation-vpcid)
   * @param vpcId The ID of the VPC that you associated the Resolver rule with. 
   */
  public fun vpcId(vpcId: String) {
    cdkBuilder.vpcId(vpcId)
  }

  public fun build(): CfnResolverRuleAssociation = cdkBuilder.build()
}
