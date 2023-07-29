@file:Suppress(
    "RedundantVisibilityModifier",
    "RedundantUnitReturnType",
    "RemoveRedundantQualifierName",
    "unused",
    "UnusedImport",
    "ClassName",
    "REDUNDANT_PROJECTION",
    "DEPRECATION"
)

package cloudshift.awscdk.dsl.services.waf

import kotlin.Unit
import software.amazon.awscdk.services.waf.CfnWebACL

/** The action to perform if none of the `Rules` contained in the `WebACL` match. */
public inline fun CfnWebACL.setDefaultAction(block: CfnWebACLWafActionPropertyDsl.() -> Unit = {}) {
    val builder = CfnWebACLWafActionPropertyDsl()
    builder.apply(block)
    return setDefaultAction(builder.build())
}
