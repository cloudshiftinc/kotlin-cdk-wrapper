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

package cloudshift.awscdk.dsl.services.connect

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.connect.CfnUser
import kotlin.Boolean
import kotlin.Number
import kotlin.String

@CdkDslMarker
public class CfnUserUserPhoneConfigPropertyDsl {
    private val cdkBuilder: CfnUser.UserPhoneConfigProperty.Builder =
        CfnUser.UserPhoneConfigProperty.builder()

    public fun afterContactWorkTimeLimit(afterContactWorkTimeLimit: Number) {
        cdkBuilder.afterContactWorkTimeLimit(afterContactWorkTimeLimit)
    }

    public fun autoAccept(autoAccept: Boolean) {
        cdkBuilder.autoAccept(autoAccept)
    }

    public fun autoAccept(autoAccept: IResolvable) {
        cdkBuilder.autoAccept(autoAccept)
    }

    public fun deskPhoneNumber(deskPhoneNumber: String) {
        cdkBuilder.deskPhoneNumber(deskPhoneNumber)
    }

    public fun phoneType(phoneType: String) {
        cdkBuilder.phoneType(phoneType)
    }

    public fun build(): CfnUser.UserPhoneConfigProperty = cdkBuilder.build()
}
