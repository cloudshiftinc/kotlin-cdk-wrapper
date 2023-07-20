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

package cloudshift.awscdk.dsl.services.appsync

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.appsync.AuthorizationConfig
import software.amazon.awscdk.services.appsync.AuthorizationMode
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList

@CdkDslMarker
public class AuthorizationConfigDsl {
    private val cdkBuilder: AuthorizationConfig.Builder = AuthorizationConfig.builder()

    private val _additionalAuthorizationModes: MutableList<AuthorizationMode> = mutableListOf()

    public fun additionalAuthorizationModes(additionalAuthorizationModes: AuthorizationModeDsl.() -> Unit) {
        _additionalAuthorizationModes.add(AuthorizationModeDsl().apply(additionalAuthorizationModes).build())
    }

    public fun additionalAuthorizationModes(additionalAuthorizationModes: Collection<AuthorizationMode>) {
        _additionalAuthorizationModes.addAll(additionalAuthorizationModes)
    }

    public fun defaultAuthorization(block: AuthorizationModeDsl.() -> Unit = {}) {
        val builder = AuthorizationModeDsl()
        builder.apply(block)
        cdkBuilder.defaultAuthorization(builder.build())
    }

    public fun defaultAuthorization(defaultAuthorization: AuthorizationMode) {
        cdkBuilder.defaultAuthorization(defaultAuthorization)
    }

    public fun build(): AuthorizationConfig {
        if (_additionalAuthorizationModes.isNotEmpty()) {
            cdkBuilder.additionalAuthorizationModes(_additionalAuthorizationModes)
        }
        return cdkBuilder.build()
    }
}
