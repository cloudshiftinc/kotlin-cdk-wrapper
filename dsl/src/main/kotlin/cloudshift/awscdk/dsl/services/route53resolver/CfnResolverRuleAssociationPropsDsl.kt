@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.route53resolver

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.route53resolver.CfnResolverRuleAssociationProps

@CdkDslMarker
public class CfnResolverRuleAssociationPropsDsl {
  private val cdkBuilder: CfnResolverRuleAssociationProps.Builder =
      CfnResolverRuleAssociationProps.builder()

  /**
   * @param name The name of an association between a Resolver rule and a VPC.
   */
  public fun name(name: String) {
    cdkBuilder.name(name)
  }

  /**
   * @param resolverRuleId The ID of the Resolver rule that you associated with the VPC that is
   * specified by `VPCId` . 
   */
  public fun resolverRuleId(resolverRuleId: String) {
    cdkBuilder.resolverRuleId(resolverRuleId)
  }

  /**
   * @param vpcId The ID of the VPC that you associated the Resolver rule with. 
   */
  public fun vpcId(vpcId: String) {
    cdkBuilder.vpcId(vpcId)
  }

  public fun build(): CfnResolverRuleAssociationProps = cdkBuilder.build()
}
