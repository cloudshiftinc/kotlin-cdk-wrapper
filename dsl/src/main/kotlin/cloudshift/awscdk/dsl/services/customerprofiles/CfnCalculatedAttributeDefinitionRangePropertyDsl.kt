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

package cloudshift.awscdk.dsl.services.customerprofiles

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.customerprofiles.CfnCalculatedAttributeDefinition
import kotlin.Number
import kotlin.String

@CdkDslMarker
public class CfnCalculatedAttributeDefinitionRangePropertyDsl {
    private val cdkBuilder: CfnCalculatedAttributeDefinition.RangeProperty.Builder =
        CfnCalculatedAttributeDefinition.RangeProperty.builder()

    public fun unit(unit: String) {
        cdkBuilder.unit(unit)
    }

    public fun `value`(`value`: Number) {
        cdkBuilder.`value`(`value`)
    }

    public fun build(): CfnCalculatedAttributeDefinition.RangeProperty = cdkBuilder.build()
}
