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

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.opensearchserverless.CfnSecurityConfig
import kotlin.Number
import kotlin.String

@CdkDslMarker
public class CfnSecurityConfigSamlConfigOptionsPropertyDsl {
    private val cdkBuilder: CfnSecurityConfig.SamlConfigOptionsProperty.Builder =
        CfnSecurityConfig.SamlConfigOptionsProperty.builder()

    public fun groupAttribute(groupAttribute: String) {
        cdkBuilder.groupAttribute(groupAttribute)
    }

    public fun metadata(metadata: String) {
        cdkBuilder.metadata(metadata)
    }

    public fun sessionTimeout(sessionTimeout: Number) {
        cdkBuilder.sessionTimeout(sessionTimeout)
    }

    public fun userAttribute(userAttribute: String) {
        cdkBuilder.userAttribute(userAttribute)
    }

    public fun build(): CfnSecurityConfig.SamlConfigOptionsProperty = cdkBuilder.build()
}
