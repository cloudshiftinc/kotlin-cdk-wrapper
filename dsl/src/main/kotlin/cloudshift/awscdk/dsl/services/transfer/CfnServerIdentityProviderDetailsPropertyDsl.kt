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

package cloudshift.awscdk.dsl.services.transfer

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.transfer.CfnServer
import kotlin.String

@CdkDslMarker
public class CfnServerIdentityProviderDetailsPropertyDsl {
    private val cdkBuilder: CfnServer.IdentityProviderDetailsProperty.Builder =
        CfnServer.IdentityProviderDetailsProperty.builder()

    public fun directoryId(directoryId: String) {
        cdkBuilder.directoryId(directoryId)
    }

    public fun function(function: String) {
        cdkBuilder.function(function)
    }

    public fun invocationRole(invocationRole: String) {
        cdkBuilder.invocationRole(invocationRole)
    }

    public fun sftpAuthenticationMethods(sftpAuthenticationMethods: String) {
        cdkBuilder.sftpAuthenticationMethods(sftpAuthenticationMethods)
    }

    public fun url(url: String) {
        cdkBuilder.url(url)
    }

    public fun build(): CfnServer.IdentityProviderDetailsProperty = cdkBuilder.build()
}
