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
import software.amazon.awscdk.services.iam.UserAttributes
import kotlin.String

@CdkDslMarker
public class UserAttributesDsl {
    private val cdkBuilder: UserAttributes.Builder = UserAttributes.builder()

    public fun userArn(userArn: String) {
        cdkBuilder.userArn(userArn)
    }

    public fun build(): UserAttributes = cdkBuilder.build()
}
