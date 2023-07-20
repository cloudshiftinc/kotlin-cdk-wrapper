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

package cloudshift.awscdk.dsl.services.rolesanywhere

import software.amazon.awscdk.services.rolesanywhere.CfnTrustAnchor
import kotlin.Unit

public inline fun CfnTrustAnchor.setSource(block: CfnTrustAnchorSourcePropertyDsl.() -> Unit = {}) {
    val builder = CfnTrustAnchorSourcePropertyDsl()
    builder.apply(block)
    return setSource(builder.build())
}
