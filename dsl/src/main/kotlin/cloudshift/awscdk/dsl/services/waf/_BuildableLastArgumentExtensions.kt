@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.waf

import kotlin.Unit
import software.amazon.awscdk.services.waf.CfnWebACL

public inline fun CfnWebACL.setDefaultAction(block: CfnWebACLWafActionPropertyDsl.() -> Unit = {}) {
  val builder = CfnWebACLWafActionPropertyDsl()
  builder.apply(block)
  return setDefaultAction(builder.build())
}
