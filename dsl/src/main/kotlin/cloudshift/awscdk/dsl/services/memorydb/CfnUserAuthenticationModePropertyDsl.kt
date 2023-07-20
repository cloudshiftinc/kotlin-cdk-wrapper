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

package cloudshift.awscdk.dsl.services.memorydb

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.memorydb.CfnUser
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList

@CdkDslMarker
public class CfnUserAuthenticationModePropertyDsl {
    private val cdkBuilder: CfnUser.AuthenticationModeProperty.Builder =
        CfnUser.AuthenticationModeProperty.builder()

    private val _passwords: MutableList<String> = mutableListOf()

    public fun passwords(vararg passwords: String) {
        _passwords.addAll(listOf(*passwords))
    }

    public fun passwords(passwords: Collection<String>) {
        _passwords.addAll(passwords)
    }

    public fun type(type: String) {
        cdkBuilder.type(type)
    }

    public fun build(): CfnUser.AuthenticationModeProperty {
        if (_passwords.isNotEmpty()) cdkBuilder.passwords(_passwords)
        return cdkBuilder.build()
    }
}
