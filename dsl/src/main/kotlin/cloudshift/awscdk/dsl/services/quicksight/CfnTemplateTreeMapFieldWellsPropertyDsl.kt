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

@CdkDslMarker
public class CfnTemplateTreeMapFieldWellsPropertyDsl {
    private val cdkBuilder: CfnTemplate.TreeMapFieldWellsProperty.Builder =
        CfnTemplate.TreeMapFieldWellsProperty.builder()

    public fun treeMapAggregatedFieldWells(treeMapAggregatedFieldWells: IResolvable) {
        cdkBuilder.treeMapAggregatedFieldWells(treeMapAggregatedFieldWells)
    }

    public fun treeMapAggregatedFieldWells(treeMapAggregatedFieldWells: CfnTemplate.TreeMapAggregatedFieldWellsProperty) {
        cdkBuilder.treeMapAggregatedFieldWells(treeMapAggregatedFieldWells)
    }

    public fun build(): CfnTemplate.TreeMapFieldWellsProperty = cdkBuilder.build()
}
