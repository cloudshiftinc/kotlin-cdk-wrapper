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
public class CfnDatasetAttributesItemsPropertyDsl {
    private val cdkBuilder: CfnDataset.AttributesItemsProperty.Builder =
        CfnDataset.AttributesItemsProperty.builder()

    public fun attributeName(attributeName: String) {
        cdkBuilder.attributeName(attributeName)
    }

    public fun attributeType(attributeType: String) {
        cdkBuilder.attributeType(attributeType)
    }

    public fun build(): CfnDataset.AttributesItemsProperty = cdkBuilder.build()
}
