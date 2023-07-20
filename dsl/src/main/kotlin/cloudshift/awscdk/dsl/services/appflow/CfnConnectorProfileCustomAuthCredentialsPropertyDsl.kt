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

package cloudshift.awscdk.dsl.services.appflow

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.appflow.CfnConnectorProfile
import kotlin.String
import kotlin.collections.Map

@CdkDslMarker
public class CfnConnectorProfileCustomAuthCredentialsPropertyDsl {
    private val cdkBuilder: CfnConnectorProfile.CustomAuthCredentialsProperty.Builder =
        CfnConnectorProfile.CustomAuthCredentialsProperty.builder()

    public fun credentialsMap(credentialsMap: Map<String, String>) {
        cdkBuilder.credentialsMap(credentialsMap)
    }

    public fun credentialsMap(credentialsMap: IResolvable) {
        cdkBuilder.credentialsMap(credentialsMap)
    }

    public fun customAuthenticationType(customAuthenticationType: String) {
        cdkBuilder.customAuthenticationType(customAuthenticationType)
    }

    public fun build(): CfnConnectorProfile.CustomAuthCredentialsProperty = cdkBuilder.build()
}
