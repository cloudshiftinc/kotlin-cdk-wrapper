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

@CdkDslMarker
public class CfnAnalysisColumnHierarchyPropertyDsl {
    private val cdkBuilder: CfnAnalysis.ColumnHierarchyProperty.Builder =
        CfnAnalysis.ColumnHierarchyProperty.builder()

    public fun dateTimeHierarchy(dateTimeHierarchy: IResolvable) {
        cdkBuilder.dateTimeHierarchy(dateTimeHierarchy)
    }

    public fun dateTimeHierarchy(dateTimeHierarchy: CfnAnalysis.DateTimeHierarchyProperty) {
        cdkBuilder.dateTimeHierarchy(dateTimeHierarchy)
    }

    public fun explicitHierarchy(explicitHierarchy: IResolvable) {
        cdkBuilder.explicitHierarchy(explicitHierarchy)
    }

    public fun explicitHierarchy(explicitHierarchy: CfnAnalysis.ExplicitHierarchyProperty) {
        cdkBuilder.explicitHierarchy(explicitHierarchy)
    }

    public fun predefinedHierarchy(predefinedHierarchy: IResolvable) {
        cdkBuilder.predefinedHierarchy(predefinedHierarchy)
    }

    public fun predefinedHierarchy(predefinedHierarchy: CfnAnalysis.PredefinedHierarchyProperty) {
        cdkBuilder.predefinedHierarchy(predefinedHierarchy)
    }

    public fun build(): CfnAnalysis.ColumnHierarchyProperty = cdkBuilder.build()
}
