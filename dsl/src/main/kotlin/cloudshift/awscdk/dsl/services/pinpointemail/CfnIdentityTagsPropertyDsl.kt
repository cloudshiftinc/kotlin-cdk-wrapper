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

package cloudshift.awscdk.dsl.services.pinpointemail

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.pinpointemail.CfnIdentity
import kotlin.String

@CdkDslMarker
public class CfnIdentityTagsPropertyDsl {
    private val cdkBuilder: CfnIdentity.TagsProperty.Builder = CfnIdentity.TagsProperty.builder()

    public fun key(key: String) {
        cdkBuilder.key(key)
    }

    public fun `value`(`value`: String) {
        cdkBuilder.`value`(`value`)
    }

    public fun build(): CfnIdentity.TagsProperty = cdkBuilder.build()
}
