@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.ec2

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.ec2.ISecurityGroup
import software.amazon.awscdk.services.ec2.RuleScope

@CdkDslMarker
public class RuleScopeDsl {
  private val cdkBuilder: RuleScope.Builder = RuleScope.builder()

  /**
   * @param id The construct ID to use for the rule. 
   */
  public fun id(id: String) {
    cdkBuilder.id(id)
  }

  /**
   * @param scope The SecurityGroup in which a rule should be scoped. 
   */
  public fun scope(scope: ISecurityGroup) {
    cdkBuilder.scope(scope)
  }

  public fun build(): RuleScope = cdkBuilder.build()
}
