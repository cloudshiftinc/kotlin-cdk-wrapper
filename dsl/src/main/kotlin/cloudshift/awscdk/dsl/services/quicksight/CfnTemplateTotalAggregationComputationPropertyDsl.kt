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

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnTemplate
import kotlin.String

@CdkDslMarker
public class CfnTemplateTotalAggregationComputationPropertyDsl {
    private val cdkBuilder: CfnTemplate.TotalAggregationComputationProperty.Builder =
        CfnTemplate.TotalAggregationComputationProperty.builder()

    public fun computationId(computationId: String) {
        cdkBuilder.computationId(computationId)
    }

    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    public fun `value`(`value`: IResolvable) {
        cdkBuilder.`value`(`value`)
    }

    public fun `value`(`value`: CfnTemplate.MeasureFieldProperty) {
        cdkBuilder.`value`(`value`)
    }

    public fun build(): CfnTemplate.TotalAggregationComputationProperty = cdkBuilder.build()
}
