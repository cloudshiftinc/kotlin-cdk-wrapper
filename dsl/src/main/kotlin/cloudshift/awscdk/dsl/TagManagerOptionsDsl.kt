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
import software.amazon.awscdk.TagManagerOptions
import kotlin.String

@CdkDslMarker
public class TagManagerOptionsDsl {
    private val cdkBuilder: TagManagerOptions.Builder = TagManagerOptions.builder()

    public fun tagPropertyName(tagPropertyName: String) {
        cdkBuilder.tagPropertyName(tagPropertyName)
    }

    public fun build(): TagManagerOptions = cdkBuilder.build()
}
