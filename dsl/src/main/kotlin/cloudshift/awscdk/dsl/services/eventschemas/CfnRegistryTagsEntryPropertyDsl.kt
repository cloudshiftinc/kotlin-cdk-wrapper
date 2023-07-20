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

package cloudshift.awscdk.dsl.services.eventschemas

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.eventschemas.CfnRegistry
import kotlin.String

@CdkDslMarker
public class CfnRegistryTagsEntryPropertyDsl {
    private val cdkBuilder: CfnRegistry.TagsEntryProperty.Builder =
        CfnRegistry.TagsEntryProperty.builder()

    public fun key(key: String) {
        cdkBuilder.key(key)
    }

    public fun `value`(`value`: String) {
        cdkBuilder.`value`(`value`)
    }

    public fun build(): CfnRegistry.TagsEntryProperty = cdkBuilder.build()
}
