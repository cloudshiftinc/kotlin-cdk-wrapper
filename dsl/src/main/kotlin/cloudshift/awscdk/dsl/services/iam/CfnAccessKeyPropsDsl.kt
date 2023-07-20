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

package cloudshift.awscdk.dsl.services.iam

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.iam.CfnAccessKeyProps
import kotlin.Number
import kotlin.String

@CdkDslMarker
public class CfnAccessKeyPropsDsl {
    private val cdkBuilder: CfnAccessKeyProps.Builder = CfnAccessKeyProps.builder()

    public fun serial(serial: Number) {
        cdkBuilder.serial(serial)
    }

    public fun status(status: String) {
        cdkBuilder.status(status)
    }

    public fun userName(userName: String) {
        cdkBuilder.userName(userName)
    }

    public fun build(): CfnAccessKeyProps = cdkBuilder.build()
}
