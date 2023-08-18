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

package io.cloudshiftdev.awscdkdsl.services.cloudformation

import kotlin.Unit
import software.amazon.awscdk.services.cloudformation.CfnHookVersion
import software.amazon.awscdk.services.cloudformation.CfnResourceVersion
import software.amazon.awscdk.services.cloudformation.CfnStackSet
import software.amazon.awscdk.services.cloudformation.CfnTypeActivation

/** Contains logging configuration information for an extension. */
public inline fun CfnHookVersion.setLoggingConfig(
    block: CfnHookVersionLoggingConfigPropertyDsl.() -> Unit = {}
) {
    val builder = CfnHookVersionLoggingConfigPropertyDsl()
    builder.apply(block)
    return setLoggingConfig(builder.build())
}

/** Logging configuration information for a resource. */
public inline fun CfnResourceVersion.setLoggingConfig(
    block: CfnResourceVersionLoggingConfigPropertyDsl.() -> Unit = {}
) {
    val builder = CfnResourceVersionLoggingConfigPropertyDsl()
    builder.apply(block)
    return setLoggingConfig(builder.build())
}

/**
 * [ `Service-managed` permissions] Describes whether StackSets automatically deploys to AWS
 * Organizations accounts that are added to a target organization or organizational unit (OU).
 */
public inline fun CfnStackSet.setAutoDeployment(
    block: CfnStackSetAutoDeploymentPropertyDsl.() -> Unit = {}
) {
    val builder = CfnStackSetAutoDeploymentPropertyDsl()
    builder.apply(block)
    return setAutoDeployment(builder.build())
}

/** The user-specified preferences for how AWS CloudFormation performs a stack set operation. */
public inline fun CfnStackSet.setOperationPreferences(
    block: CfnStackSetOperationPreferencesPropertyDsl.() -> Unit = {}
) {
    val builder = CfnStackSetOperationPreferencesPropertyDsl()
    builder.apply(block)
    return setOperationPreferences(builder.build())
}

/** Specifies logging configuration information for an extension. */
public inline fun CfnTypeActivation.setLoggingConfig(
    block: CfnTypeActivationLoggingConfigPropertyDsl.() -> Unit = {}
) {
    val builder = CfnTypeActivationLoggingConfigPropertyDsl()
    builder.apply(block)
    return setLoggingConfig(builder.build())
}
