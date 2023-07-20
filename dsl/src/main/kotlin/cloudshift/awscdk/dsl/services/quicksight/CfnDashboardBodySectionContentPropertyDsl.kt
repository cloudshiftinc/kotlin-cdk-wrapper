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

@CdkDslMarker
public class CfnDashboardBodySectionContentPropertyDsl {
    private val cdkBuilder: CfnDashboard.BodySectionContentProperty.Builder =
        CfnDashboard.BodySectionContentProperty.builder()

    public fun layout(layout: IResolvable) {
        cdkBuilder.layout(layout)
    }

    public fun layout(layout: CfnDashboard.SectionLayoutConfigurationProperty) {
        cdkBuilder.layout(layout)
    }

    public fun build(): CfnDashboard.BodySectionContentProperty = cdkBuilder.build()
}
