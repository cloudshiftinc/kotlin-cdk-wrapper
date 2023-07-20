@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.wafv2

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.wafv2.CfnRuleGroup

@CdkDslMarker
public class CfnRuleGroupNotStatementPropertyDsl {
  private val cdkBuilder: CfnRuleGroup.NotStatementProperty.Builder =
      CfnRuleGroup.NotStatementProperty.builder()

  public fun statement(statement: IResolvable) {
    cdkBuilder.statement(statement)
  }

  public fun statement(statement: CfnRuleGroup.StatementProperty) {
    cdkBuilder.statement(statement)
  }

  public fun build(): CfnRuleGroup.NotStatementProperty = cdkBuilder.build()
}
