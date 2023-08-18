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

package io.cloudshiftdev.awscdkdsl.services.s3objectlambda

import kotlin.Unit
import software.amazon.awscdk.services.s3objectlambda.CfnAccessPoint

/** A configuration used when creating an Object Lambda Access Point. */
public inline fun CfnAccessPoint.setObjectLambdaConfiguration(
    block: CfnAccessPointObjectLambdaConfigurationPropertyDsl.() -> Unit = {}
) {
    val builder = CfnAccessPointObjectLambdaConfigurationPropertyDsl()
    builder.apply(block)
    return setObjectLambdaConfiguration(builder.build())
}
