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
public class CfnAnalysisHeaderFooterSectionConfigurationPropertyDsl {
    private val cdkBuilder: CfnAnalysis.HeaderFooterSectionConfigurationProperty.Builder =
        CfnAnalysis.HeaderFooterSectionConfigurationProperty.builder()

    public fun layout(layout: IResolvable) {
        cdkBuilder.layout(layout)
    }

    public fun layout(layout: CfnAnalysis.SectionLayoutConfigurationProperty) {
        cdkBuilder.layout(layout)
    }

    public fun sectionId(sectionId: String) {
        cdkBuilder.sectionId(sectionId)
    }

    public fun style(style: IResolvable) {
        cdkBuilder.style(style)
    }

    public fun style(style: CfnAnalysis.SectionStyleProperty) {
        cdkBuilder.style(style)
    }

    public fun build(): CfnAnalysis.HeaderFooterSectionConfigurationProperty = cdkBuilder.build()
}
