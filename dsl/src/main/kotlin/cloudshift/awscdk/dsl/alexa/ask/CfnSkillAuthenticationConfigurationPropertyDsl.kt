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

package cloudshift.awscdk.dsl.alexa.ask

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.alexa.ask.CfnSkill
import kotlin.String

@CdkDslMarker
public class CfnSkillAuthenticationConfigurationPropertyDsl {
    private val cdkBuilder: CfnSkill.AuthenticationConfigurationProperty.Builder =
        CfnSkill.AuthenticationConfigurationProperty.builder()

    public fun clientId(clientId: String) {
        cdkBuilder.clientId(clientId)
    }

    public fun clientSecret(clientSecret: String) {
        cdkBuilder.clientSecret(clientSecret)
    }

    public fun refreshToken(refreshToken: String) {
        cdkBuilder.refreshToken(refreshToken)
    }

    public fun build(): CfnSkill.AuthenticationConfigurationProperty = cdkBuilder.build()
}
