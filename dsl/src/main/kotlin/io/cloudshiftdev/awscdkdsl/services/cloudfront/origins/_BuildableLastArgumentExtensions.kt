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

package io.cloudshiftdev.awscdkdsl.services.cloudfront.origins

import io.cloudshiftdev.awscdkdsl.services.cloudfront.OriginBindOptionsDsl
import kotlin.Unit
import software.amazon.awscdk.services.cloudfront.OriginBindConfig
import software.amazon.awscdk.services.cloudfront.origins.OriginGroup
import software.amazon.awscdk.services.cloudfront.origins.S3Origin
import software.constructs.Construct

/**
 * The method called when a given Origin is added (for the first time) to a Distribution.
 *
 * @param scope
 * @param options
 */
public inline fun OriginGroup.bind(
    scope: Construct,
    block: OriginBindOptionsDsl.() -> Unit = {}
): OriginBindConfig {
    val builder = OriginBindOptionsDsl()
    builder.apply(block)
    return bind(scope, builder.build())
}

/**
 * The method called when a given Origin is added (for the first time) to a Distribution.
 *
 * @param scope
 * @param options
 */
public inline fun S3Origin.bind(
    scope: Construct,
    block: OriginBindOptionsDsl.() -> Unit = {}
): OriginBindConfig {
    val builder = OriginBindOptionsDsl()
    builder.apply(block)
    return bind(scope, builder.build())
}
