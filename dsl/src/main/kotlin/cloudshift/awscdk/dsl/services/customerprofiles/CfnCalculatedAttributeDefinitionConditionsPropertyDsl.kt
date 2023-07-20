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
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.customerprofiles.CfnCalculatedAttributeDefinition
import kotlin.Number

@CdkDslMarker
public class CfnCalculatedAttributeDefinitionConditionsPropertyDsl {
    private val cdkBuilder: CfnCalculatedAttributeDefinition.ConditionsProperty.Builder =
        CfnCalculatedAttributeDefinition.ConditionsProperty.builder()

    public fun objectCount(objectCount: Number) {
        cdkBuilder.objectCount(objectCount)
    }

    public fun range(range: IResolvable) {
        cdkBuilder.range(range)
    }

    public fun range(range: CfnCalculatedAttributeDefinition.RangeProperty) {
        cdkBuilder.range(range)
    }

    public fun threshold(threshold: IResolvable) {
        cdkBuilder.threshold(threshold)
    }

    public fun threshold(threshold: CfnCalculatedAttributeDefinition.ThresholdProperty) {
        cdkBuilder.threshold(threshold)
    }

    public fun build(): CfnCalculatedAttributeDefinition.ConditionsProperty = cdkBuilder.build()
}
