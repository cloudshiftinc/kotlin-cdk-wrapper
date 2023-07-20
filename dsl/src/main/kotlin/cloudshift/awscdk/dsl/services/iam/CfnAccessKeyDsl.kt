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
import software.amazon.awscdk.services.iam.CfnAccessKey
import software.constructs.Construct
import kotlin.Number
import kotlin.String

@CdkDslMarker
public class CfnAccessKeyDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnAccessKey.Builder = CfnAccessKey.Builder.create(scope, id)

    public fun serial(serial: Number) {
        cdkBuilder.serial(serial)
    }

    public fun status(status: String) {
        cdkBuilder.status(status)
    }

    public fun userName(userName: String) {
        cdkBuilder.userName(userName)
    }

    public fun build(): CfnAccessKey = cdkBuilder.build()
}
