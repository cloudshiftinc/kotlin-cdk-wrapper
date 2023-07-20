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
import software.amazon.awscdk.services.codebuild.CfnSourceCredential
import software.constructs.Construct
import kotlin.String

@CdkDslMarker
public class CfnSourceCredentialDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnSourceCredential.Builder = CfnSourceCredential.Builder.create(
        scope,
        id,
    )

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

    public fun build(): CfnSourceCredential = cdkBuilder.build()
}
