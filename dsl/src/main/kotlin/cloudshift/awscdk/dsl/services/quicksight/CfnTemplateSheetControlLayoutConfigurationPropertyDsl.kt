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
public class CfnTemplateSheetControlLayoutConfigurationPropertyDsl {
    private val cdkBuilder: CfnTemplate.SheetControlLayoutConfigurationProperty.Builder =
        CfnTemplate.SheetControlLayoutConfigurationProperty.builder()

    public fun gridLayout(gridLayout: IResolvable) {
        cdkBuilder.gridLayout(gridLayout)
    }

    public fun gridLayout(gridLayout: CfnTemplate.GridLayoutConfigurationProperty) {
        cdkBuilder.gridLayout(gridLayout)
    }

    public fun build(): CfnTemplate.SheetControlLayoutConfigurationProperty = cdkBuilder.build()
}
