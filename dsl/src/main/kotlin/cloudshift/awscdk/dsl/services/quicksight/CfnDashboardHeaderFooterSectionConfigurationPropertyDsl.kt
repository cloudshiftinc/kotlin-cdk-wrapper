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
import software.amazon.awscdk.services.quicksight.CfnDashboard
import kotlin.String

@CdkDslMarker
public class CfnDashboardHeaderFooterSectionConfigurationPropertyDsl {
    private val cdkBuilder: CfnDashboard.HeaderFooterSectionConfigurationProperty.Builder =
        CfnDashboard.HeaderFooterSectionConfigurationProperty.builder()

    public fun layout(layout: IResolvable) {
        cdkBuilder.layout(layout)
    }

    public fun layout(layout: CfnDashboard.SectionLayoutConfigurationProperty) {
        cdkBuilder.layout(layout)
    }

    public fun sectionId(sectionId: String) {
        cdkBuilder.sectionId(sectionId)
    }

    public fun style(style: IResolvable) {
        cdkBuilder.style(style)
    }

    public fun style(style: CfnDashboard.SectionStyleProperty) {
        cdkBuilder.style(style)
    }

    public fun build(): CfnDashboard.HeaderFooterSectionConfigurationProperty = cdkBuilder.build()
}
