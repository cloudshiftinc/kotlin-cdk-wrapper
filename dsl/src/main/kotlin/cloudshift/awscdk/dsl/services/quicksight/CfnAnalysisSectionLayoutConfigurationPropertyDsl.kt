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
public class CfnAnalysisSectionLayoutConfigurationPropertyDsl {
    private val cdkBuilder: CfnAnalysis.SectionLayoutConfigurationProperty.Builder =
        CfnAnalysis.SectionLayoutConfigurationProperty.builder()

    public fun freeFormLayout(freeFormLayout: IResolvable) {
        cdkBuilder.freeFormLayout(freeFormLayout)
    }

    public fun freeFormLayout(freeFormLayout: CfnAnalysis.FreeFormSectionLayoutConfigurationProperty) {
        cdkBuilder.freeFormLayout(freeFormLayout)
    }

    public fun build(): CfnAnalysis.SectionLayoutConfigurationProperty = cdkBuilder.build()
}
