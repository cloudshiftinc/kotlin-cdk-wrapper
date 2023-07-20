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

package cloudshift.awscdk.dsl

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.RoleOptions
import kotlin.String

@CdkDslMarker
public class RoleOptionsDsl {
    private val cdkBuilder: RoleOptions.Builder = RoleOptions.builder()

    public fun assumeRoleArn(assumeRoleArn: String) {
        cdkBuilder.assumeRoleArn(assumeRoleArn)
    }

    public fun assumeRoleExternalId(assumeRoleExternalId: String) {
        cdkBuilder.assumeRoleExternalId(assumeRoleExternalId)
    }

    public fun build(): RoleOptions = cdkBuilder.build()
}
