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

package io.cloudshiftdev.awscdkdsl.services.m2

import kotlin.Unit
import software.amazon.awscdk.services.m2.CfnApplication
import software.amazon.awscdk.services.m2.CfnEnvironment

/**
 * The application definition for a particular application.
 *
 * You can specify either inline JSON or an Amazon S3 bucket location.
 */
public inline fun CfnApplication.setDefinition(
    block: CfnApplicationDefinitionPropertyDsl.() -> Unit = {}
) {
    val builder = CfnApplicationDefinitionPropertyDsl()
    builder.apply(block)
    return setDefinition(builder.build())
}

/** Defines the details of a high availability configuration. */
public inline fun CfnEnvironment.setHighAvailabilityConfig(
    block: CfnEnvironmentHighAvailabilityConfigPropertyDsl.() -> Unit = {}
) {
    val builder = CfnEnvironmentHighAvailabilityConfigPropertyDsl()
    builder.apply(block)
    return setHighAvailabilityConfig(builder.build())
}
