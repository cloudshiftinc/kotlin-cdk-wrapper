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

package io.cloudshiftdev.awscdkdsl.services.dlm

import kotlin.Unit
import software.amazon.awscdk.services.dlm.CfnLifecyclePolicy

/**
 * *[Default policies only]* Specifies exclusion parameters for volumes or instances for which you
 * do not want to create snapshots or AMIs.
 */
public inline fun CfnLifecyclePolicy.setExclusions(
    block: CfnLifecyclePolicyExclusionsPropertyDsl.() -> Unit = {}
) {
    val builder = CfnLifecyclePolicyExclusionsPropertyDsl()
    builder.apply(block)
    return setExclusions(builder.build())
}

/** The configuration details of the lifecycle policy. */
public inline fun CfnLifecyclePolicy.setPolicyDetails(
    block: CfnLifecyclePolicyPolicyDetailsPropertyDsl.() -> Unit = {}
) {
    val builder = CfnLifecyclePolicyPolicyDetailsPropertyDsl()
    builder.apply(block)
    return setPolicyDetails(builder.build())
}
