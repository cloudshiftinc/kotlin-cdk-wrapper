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

package cloudshift.awscdk.dsl.services.cognito

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.cognito.KeepOriginalAttrs
import kotlin.Boolean

@CdkDslMarker
public class KeepOriginalAttrsDsl {
    private val cdkBuilder: KeepOriginalAttrs.Builder = KeepOriginalAttrs.builder()

    public fun email(email: Boolean) {
        cdkBuilder.email(email)
    }

    public fun phone(phone: Boolean) {
        cdkBuilder.phone(phone)
    }

    public fun build(): KeepOriginalAttrs = cdkBuilder.build()
}
