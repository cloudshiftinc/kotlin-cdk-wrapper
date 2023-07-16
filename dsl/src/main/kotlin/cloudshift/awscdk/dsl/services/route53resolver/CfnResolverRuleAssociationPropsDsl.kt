@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.route53resolver

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.route53resolver.CfnResolverRuleAssociationProps

@CdkDslMarker
public class CfnResolverRuleAssociationPropsDsl {
  private val cdkBuilder: CfnResolverRuleAssociationProps.Builder =
      CfnResolverRuleAssociationProps.builder()

  public fun name(name: String) {
    cdkBuilder.name(name)
  }

  public fun resolverRuleId(resolverRuleId: String) {
    cdkBuilder.resolverRuleId(resolverRuleId)
  }

  public fun vpcId(vpcId: String) {
    cdkBuilder.vpcId(vpcId)
  }

  public fun build(): CfnResolverRuleAssociationProps = cdkBuilder.build()
}
