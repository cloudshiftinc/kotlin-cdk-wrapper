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
import software.amazon.awscdk.services.quicksight.CfnAnalysis
import kotlin.String

@CdkDslMarker
public class CfnAnalysisUniqueValuesComputationPropertyDsl {
    private val cdkBuilder: CfnAnalysis.UniqueValuesComputationProperty.Builder =
        CfnAnalysis.UniqueValuesComputationProperty.builder()

    public fun category(category: IResolvable) {
        cdkBuilder.category(category)
    }

    public fun category(category: CfnAnalysis.DimensionFieldProperty) {
        cdkBuilder.category(category)
    }

    public fun computationId(computationId: String) {
        cdkBuilder.computationId(computationId)
    }

    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    public fun build(): CfnAnalysis.UniqueValuesComputationProperty = cdkBuilder.build()
}
