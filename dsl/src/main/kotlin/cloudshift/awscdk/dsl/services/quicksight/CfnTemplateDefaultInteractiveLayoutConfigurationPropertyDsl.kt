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
public class CfnTemplateDefaultInteractiveLayoutConfigurationPropertyDsl {
    private val cdkBuilder: CfnTemplate.DefaultInteractiveLayoutConfigurationProperty.Builder =
        CfnTemplate.DefaultInteractiveLayoutConfigurationProperty.builder()

    public fun freeForm(freeForm: IResolvable) {
        cdkBuilder.freeForm(freeForm)
    }

    public fun freeForm(freeForm: CfnTemplate.DefaultFreeFormLayoutConfigurationProperty) {
        cdkBuilder.freeForm(freeForm)
    }

    public fun grid(grid: IResolvable) {
        cdkBuilder.grid(grid)
    }

    public fun grid(grid: CfnTemplate.DefaultGridLayoutConfigurationProperty) {
        cdkBuilder.grid(grid)
    }

    public fun build(): CfnTemplate.DefaultInteractiveLayoutConfigurationProperty = cdkBuilder.build()
}
