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

package cloudshift.awscdk.dsl.services.opensearchserverless

import kotlin.Unit
import software.amazon.awscdk.services.opensearchserverless.CfnSecurityConfig

/** SAML options for the security configuration in the form of a key-value map. */
public inline fun CfnSecurityConfig.setSamlOptions(
    block: CfnSecurityConfigSamlConfigOptionsPropertyDsl.() -> Unit = {}
) {
    val builder = CfnSecurityConfigSamlConfigOptionsPropertyDsl()
    builder.apply(block)
    return setSamlOptions(builder.build())
}
