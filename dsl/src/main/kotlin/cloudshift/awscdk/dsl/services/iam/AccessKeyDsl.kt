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
import software.amazon.awscdk.services.iam.AccessKey
import software.amazon.awscdk.services.iam.AccessKeyStatus
import software.amazon.awscdk.services.iam.IUser
import software.constructs.Construct
import kotlin.Number
import kotlin.String

@CdkDslMarker
public class AccessKeyDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: AccessKey.Builder = AccessKey.Builder.create(scope, id)

    public fun serial(serial: Number) {
        cdkBuilder.serial(serial)
    }

    public fun status(status: AccessKeyStatus) {
        cdkBuilder.status(status)
    }

    public fun user(user: IUser) {
        cdkBuilder.user(user)
    }

    public fun build(): AccessKey = cdkBuilder.build()
}
