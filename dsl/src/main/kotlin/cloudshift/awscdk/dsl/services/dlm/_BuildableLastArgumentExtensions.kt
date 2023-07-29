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

package cloudshift.awscdk.dsl.services.dlm

import kotlin.Unit
import software.amazon.awscdk.services.dlm.CfnLifecyclePolicy

/** The configuration details of the lifecycle policy. */
public inline fun CfnLifecyclePolicy.setPolicyDetails(
    block: CfnLifecyclePolicyPolicyDetailsPropertyDsl.() -> Unit = {}
) {
    val builder = CfnLifecyclePolicyPolicyDetailsPropertyDsl()
    builder.apply(block)
    return setPolicyDetails(builder.build())
}
