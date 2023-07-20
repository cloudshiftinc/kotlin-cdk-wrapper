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

package cloudshift.awscdk.dsl.services.opensearchserverless

import software.amazon.awscdk.services.opensearchserverless.CfnSecurityConfig
import kotlin.Unit

public inline fun CfnSecurityConfig.setSamlOptions(
    block: CfnSecurityConfigSamlConfigOptionsPropertyDsl.() -> Unit =
        {},
) {
    val builder = CfnSecurityConfigSamlConfigOptionsPropertyDsl()
    builder.apply(block)
    return setSamlOptions(builder.build())
}
