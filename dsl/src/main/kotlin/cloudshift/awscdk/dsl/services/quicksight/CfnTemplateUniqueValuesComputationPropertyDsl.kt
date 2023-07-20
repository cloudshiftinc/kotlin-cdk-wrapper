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
public class CfnTemplateUniqueValuesComputationPropertyDsl {
    private val cdkBuilder: CfnTemplate.UniqueValuesComputationProperty.Builder =
        CfnTemplate.UniqueValuesComputationProperty.builder()

    public fun category(category: IResolvable) {
        cdkBuilder.category(category)
    }

    public fun category(category: CfnTemplate.DimensionFieldProperty) {
        cdkBuilder.category(category)
    }

    public fun computationId(computationId: String) {
        cdkBuilder.computationId(computationId)
    }

    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    public fun build(): CfnTemplate.UniqueValuesComputationProperty = cdkBuilder.build()
}
