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

package cloudshift.awscdk.dsl.services.fms

import kotlin.Unit
import software.amazon.awscdk.services.fms.CfnPolicy

/**
 * Specifies the AWS account IDs and AWS Organizations organizational units (OUs) to exclude from
 * the policy.
 */
public inline fun CfnPolicy.setExcludeMap(block: CfnPolicyIEMapPropertyDsl.() -> Unit = {}) {
    val builder = CfnPolicyIEMapPropertyDsl()
    builder.apply(block)
    return setExcludeMap(builder.build())
}

/**
 * Specifies the AWS account IDs and AWS Organizations organizational units (OUs) to include in the
 * policy.
 */
public inline fun CfnPolicy.setIncludeMap(block: CfnPolicyIEMapPropertyDsl.() -> Unit = {}) {
    val builder = CfnPolicyIEMapPropertyDsl()
    builder.apply(block)
    return setIncludeMap(builder.build())
}

/** Details about the security service that is being used to protect the resources. */
public inline fun CfnPolicy.setSecurityServicePolicyData(
    block: CfnPolicySecurityServicePolicyDataPropertyDsl.() -> Unit = {}
) {
    val builder = CfnPolicySecurityServicePolicyDataPropertyDsl()
    builder.apply(block)
    return setSecurityServicePolicyData(builder.build())
}
