@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.wafv2

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.wafv2.CfnWebACL

@CdkDslMarker
public class CfnWebACLNotStatementPropertyDsl {
  private val cdkBuilder: CfnWebACL.NotStatementProperty.Builder =
      CfnWebACL.NotStatementProperty.builder()

  /**
   * @param statement The statement to negate. 
   * You can use any statement that can be nested.
   */
  public fun statement(statement: IResolvable) {
    cdkBuilder.statement(statement)
  }

  /**
   * @param statement The statement to negate. 
   * You can use any statement that can be nested.
   */
  public fun statement(statement: CfnWebACL.StatementProperty) {
    cdkBuilder.statement(statement)
  }

  public fun build(): CfnWebACL.NotStatementProperty = cdkBuilder.build()
}
