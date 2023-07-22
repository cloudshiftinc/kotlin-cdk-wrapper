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

  /**
   * @param insertHeaders The HTTP headers to insert into the request. Duplicate header names are
   * not allowed. 
   * For information about the limits on count and size for custom request and response settings,
   * see [AWS WAF quotas](https://docs.aws.amazon.com/waf/latest/developerguide/limits.html) in the
   * *AWS WAF Developer Guide* .
   */
  public fun insertHeaders(vararg insertHeaders: Any) {
    _insertHeaders.addAll(listOf(*insertHeaders))
  }

  /**
   * @param insertHeaders The HTTP headers to insert into the request. Duplicate header names are
   * not allowed. 
   * For information about the limits on count and size for custom request and response settings,
   * see [AWS WAF quotas](https://docs.aws.amazon.com/waf/latest/developerguide/limits.html) in the
   * *AWS WAF Developer Guide* .
   */
  public fun insertHeaders(insertHeaders: Collection<Any>) {
    _insertHeaders.addAll(insertHeaders)
  }

  /**
   * @param insertHeaders The HTTP headers to insert into the request. Duplicate header names are
   * not allowed. 
   * For information about the limits on count and size for custom request and response settings,
   * see [AWS WAF quotas](https://docs.aws.amazon.com/waf/latest/developerguide/limits.html) in the
   * *AWS WAF Developer Guide* .
   */
  public fun insertHeaders(insertHeaders: IResolvable) {
    cdkBuilder.insertHeaders(insertHeaders)
  }

  public fun build(): CfnRuleGroup.CustomRequestHandlingProperty {
    if(_insertHeaders.isNotEmpty()) cdkBuilder.insertHeaders(_insertHeaders)
    return cdkBuilder.build()
  }
}
