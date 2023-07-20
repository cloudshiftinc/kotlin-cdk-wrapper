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

package cloudshift.awscdk.dsl.services.finspace

import software.amazon.awscdk.services.finspace.CfnEnvironment
import kotlin.Unit

public inline fun CfnEnvironment.setFederationParameters(
    block: CfnEnvironmentFederationParametersPropertyDsl.() -> Unit =
        {},
) {
    val builder = CfnEnvironmentFederationParametersPropertyDsl()
    builder.apply(block)
    return setFederationParameters(builder.build())
}

public inline fun CfnEnvironment.setSuperuserParameters(
    block: CfnEnvironmentSuperuserParametersPropertyDsl.() -> Unit =
        {},
) {
    val builder = CfnEnvironmentSuperuserParametersPropertyDsl()
    builder.apply(block)
    return setSuperuserParameters(builder.build())
}
