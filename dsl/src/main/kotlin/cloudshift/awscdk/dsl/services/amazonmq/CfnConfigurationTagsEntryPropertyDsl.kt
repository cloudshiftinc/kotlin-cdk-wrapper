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

package cloudshift.awscdk.dsl.services.amazonmq

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.amazonmq.CfnConfiguration
import kotlin.String

@CdkDslMarker
public class CfnConfigurationTagsEntryPropertyDsl {
    private val cdkBuilder: CfnConfiguration.TagsEntryProperty.Builder =
        CfnConfiguration.TagsEntryProperty.builder()

    public fun key(key: String) {
        cdkBuilder.key(key)
    }

    public fun `value`(`value`: String) {
        cdkBuilder.`value`(`value`)
    }

    public fun build(): CfnConfiguration.TagsEntryProperty = cdkBuilder.build()
}
