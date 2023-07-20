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

package cloudshift.awscdk.dsl.services.forecast

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.forecast.CfnDataset
import kotlin.String

@CdkDslMarker
public class CfnDatasetTagsItemsPropertyDsl {
    private val cdkBuilder: CfnDataset.TagsItemsProperty.Builder =
        CfnDataset.TagsItemsProperty.builder()

    public fun key(key: String) {
        cdkBuilder.key(key)
    }

    public fun `value`(`value`: String) {
        cdkBuilder.`value`(`value`)
    }

    public fun build(): CfnDataset.TagsItemsProperty = cdkBuilder.build()
}
