@file:Suppress(
    "RedundantVisibilityModifier",
    "RedundantUnitReturnType",
    "RemoveRedundantQualifierName",
    "unused",
    "UnusedImport",
    "ClassName",
    "REDUNDANT_PROJECTION",
    "DEPRECATION",
)

package cloudshift.awscdk.dsl.services.waf.regional

import software.amazon.awscdk.services.waf.regional.CfnWebACL
import kotlin.Unit

public inline fun CfnWebACL.setDefaultAction(block: CfnWebACLActionPropertyDsl.() -> Unit = {}) {
    val builder = CfnWebACLActionPropertyDsl()
    builder.apply(block)
    return setDefaultAction(builder.build())
}
