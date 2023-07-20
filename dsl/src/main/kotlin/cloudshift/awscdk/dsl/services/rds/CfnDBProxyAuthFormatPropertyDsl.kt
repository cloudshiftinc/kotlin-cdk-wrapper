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

package cloudshift.awscdk.dsl.services.rds

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.rds.CfnDBProxy
import kotlin.String

@CdkDslMarker
public class CfnDBProxyAuthFormatPropertyDsl {
    private val cdkBuilder: CfnDBProxy.AuthFormatProperty.Builder =
        CfnDBProxy.AuthFormatProperty.builder()

    public fun authScheme(authScheme: String) {
        cdkBuilder.authScheme(authScheme)
    }

    public fun clientPasswordAuthType(clientPasswordAuthType: String) {
        cdkBuilder.clientPasswordAuthType(clientPasswordAuthType)
    }

    public fun description(description: String) {
        cdkBuilder.description(description)
    }

    public fun iamAuth(iamAuth: String) {
        cdkBuilder.iamAuth(iamAuth)
    }

    public fun secretArn(secretArn: String) {
        cdkBuilder.secretArn(secretArn)
    }

    public fun build(): CfnDBProxy.AuthFormatProperty = cdkBuilder.build()
}
