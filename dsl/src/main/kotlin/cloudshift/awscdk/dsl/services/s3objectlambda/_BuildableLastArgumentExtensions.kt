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

package cloudshift.awscdk.dsl.services.s3objectlambda

import software.amazon.awscdk.services.s3objectlambda.CfnAccessPoint
import kotlin.Unit

public inline fun CfnAccessPoint.setObjectLambdaConfiguration(
    block: CfnAccessPointObjectLambdaConfigurationPropertyDsl.() -> Unit =
        {},
) {
    val builder = CfnAccessPointObjectLambdaConfigurationPropertyDsl()
    builder.apply(block)
    return setObjectLambdaConfiguration(builder.build())
}
