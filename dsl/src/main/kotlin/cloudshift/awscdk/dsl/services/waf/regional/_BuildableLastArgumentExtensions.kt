@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.waf.regional

import kotlin.Unit
import software.amazon.awscdk.services.waf.regional.CfnWebACL

/**
 * The action to perform if none of the `Rules` contained in the `WebACL` match.
 */
public inline fun CfnWebACL.setDefaultAction(block: CfnWebACLActionPropertyDsl.() -> Unit = {}) {
  val builder = CfnWebACLActionPropertyDsl()
  builder.apply(block)
  return setDefaultAction(builder.build())
}
