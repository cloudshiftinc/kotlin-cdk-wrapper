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
import software.amazon.awscdk.services.pinpointemail.CfnConfigurationSet
import kotlin.String

@CdkDslMarker
public class CfnConfigurationSetTagsPropertyDsl {
    private val cdkBuilder: CfnConfigurationSet.TagsProperty.Builder =
        CfnConfigurationSet.TagsProperty.builder()

    public fun key(key: String) {
        cdkBuilder.key(key)
    }

    public fun `value`(`value`: String) {
        cdkBuilder.`value`(`value`)
    }

    public fun build(): CfnConfigurationSet.TagsProperty = cdkBuilder.build()
}
