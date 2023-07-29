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

package cloudshift.awscdk.dsl.services.finspace

import kotlin.Unit
import software.amazon.awscdk.services.finspace.CfnEnvironment

/** Configuration information when authentication mode is FEDERATED. */
public inline fun CfnEnvironment.setFederationParameters(
    block: CfnEnvironmentFederationParametersPropertyDsl.() -> Unit = {}
) {
    val builder = CfnEnvironmentFederationParametersPropertyDsl()
    builder.apply(block)
    return setFederationParameters(builder.build())
}

/** Configuration information for the superuser. */
public inline fun CfnEnvironment.setSuperuserParameters(
    block: CfnEnvironmentSuperuserParametersPropertyDsl.() -> Unit = {}
) {
    val builder = CfnEnvironmentSuperuserParametersPropertyDsl()
    builder.apply(block)
    return setSuperuserParameters(builder.build())
}
