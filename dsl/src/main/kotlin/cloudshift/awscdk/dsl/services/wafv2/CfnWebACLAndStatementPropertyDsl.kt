@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.wafv2

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.wafv2.CfnWebACL

@CdkDslMarker
public class CfnWebACLAndStatementPropertyDsl {
  private val cdkBuilder: CfnWebACL.AndStatementProperty.Builder =
      CfnWebACL.AndStatementProperty.builder()

  private val _statements: MutableList<Any> = mutableListOf()

  public fun statements(vararg statements: Any) {
    _statements.addAll(listOf(*statements))
  }

  public fun statements(statements: Collection<Any>) {
    _statements.addAll(statements)
  }

  public fun statements(statements: IResolvable) {
    cdkBuilder.statements(statements)
  }

  public fun build(): CfnWebACL.AndStatementProperty {
    if(_statements.isNotEmpty()) cdkBuilder.statements(_statements)
    return cdkBuilder.build()
  }
}
