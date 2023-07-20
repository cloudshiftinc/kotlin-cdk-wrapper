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

package cloudshift.awscdk.dsl.services.dlm

import software.amazon.awscdk.services.dlm.CfnLifecyclePolicy
import kotlin.Unit

public inline fun CfnLifecyclePolicy.setPolicyDetails(
    block: CfnLifecyclePolicyPolicyDetailsPropertyDsl.() -> Unit =
        {},
) {
    val builder = CfnLifecyclePolicyPolicyDetailsPropertyDsl()
    builder.apply(block)
    return setPolicyDetails(builder.build())
}
