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

package cloudshift.awscdk.dsl.services.codebuild

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.codebuild.CfnSourceCredentialProps
import kotlin.String

@CdkDslMarker
public class CfnSourceCredentialPropsDsl {
    private val cdkBuilder: CfnSourceCredentialProps.Builder = CfnSourceCredentialProps.builder()

    public fun authType(authType: String) {
        cdkBuilder.authType(authType)
    }

    public fun serverType(serverType: String) {
        cdkBuilder.serverType(serverType)
    }

    public fun token(token: String) {
        cdkBuilder.token(token)
    }

    public fun username(username: String) {
        cdkBuilder.username(username)
    }

    public fun build(): CfnSourceCredentialProps = cdkBuilder.build()
}
