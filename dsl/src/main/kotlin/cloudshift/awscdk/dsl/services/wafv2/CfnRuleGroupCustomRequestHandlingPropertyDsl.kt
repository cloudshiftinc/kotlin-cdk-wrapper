@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.wafv2

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.wafv2.CfnRuleGroup

@CdkDslMarker
public class CfnRuleGroupCustomRequestHandlingPropertyDsl {
  private val cdkBuilder: CfnRuleGroup.CustomRequestHandlingProperty.Builder =
      CfnRuleGroup.CustomRequestHandlingProperty.builder()

  private val _insertHeaders: MutableList<Any> = mutableListOf()

  public fun insertHeaders(vararg insertHeaders: Any) {
    _insertHeaders.addAll(listOf(*insertHeaders))
  }

  public fun insertHeaders(insertHeaders: Collection<Any>) {
    _insertHeaders.addAll(insertHeaders)
  }

  public fun insertHeaders(insertHeaders: IResolvable) {
    cdkBuilder.insertHeaders(insertHeaders)
  }

  public fun build(): CfnRuleGroup.CustomRequestHandlingProperty {
    if(_insertHeaders.isNotEmpty()) cdkBuilder.insertHeaders(_insertHeaders)
    return cdkBuilder.build()
  }
}
