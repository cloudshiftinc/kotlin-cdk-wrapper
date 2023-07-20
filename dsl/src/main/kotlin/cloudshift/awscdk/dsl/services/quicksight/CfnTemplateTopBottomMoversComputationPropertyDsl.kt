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
import kotlin.Number
import kotlin.String

@CdkDslMarker
public class CfnTemplateTopBottomMoversComputationPropertyDsl {
    private val cdkBuilder: CfnTemplate.TopBottomMoversComputationProperty.Builder =
        CfnTemplate.TopBottomMoversComputationProperty.builder()

    public fun category(category: IResolvable) {
        cdkBuilder.category(category)
    }

    public fun category(category: CfnTemplate.DimensionFieldProperty) {
        cdkBuilder.category(category)
    }

    public fun computationId(computationId: String) {
        cdkBuilder.computationId(computationId)
    }

    public fun moverSize(moverSize: Number) {
        cdkBuilder.moverSize(moverSize)
    }

    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    public fun sortOrder(sortOrder: String) {
        cdkBuilder.sortOrder(sortOrder)
    }

    public fun time(time: IResolvable) {
        cdkBuilder.time(time)
    }

    public fun time(time: CfnTemplate.DimensionFieldProperty) {
        cdkBuilder.time(time)
    }

    public fun type(type: String) {
        cdkBuilder.type(type)
    }

    public fun `value`(`value`: IResolvable) {
        cdkBuilder.`value`(`value`)
    }

    public fun `value`(`value`: CfnTemplate.MeasureFieldProperty) {
        cdkBuilder.`value`(`value`)
    }

    public fun build(): CfnTemplate.TopBottomMoversComputationProperty = cdkBuilder.build()
}
