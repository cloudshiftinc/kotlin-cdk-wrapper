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
public class CfnTemplateSectionLayoutConfigurationPropertyDsl {
    private val cdkBuilder: CfnTemplate.SectionLayoutConfigurationProperty.Builder =
        CfnTemplate.SectionLayoutConfigurationProperty.builder()

    public fun freeFormLayout(freeFormLayout: IResolvable) {
        cdkBuilder.freeFormLayout(freeFormLayout)
    }

    public fun freeFormLayout(freeFormLayout: CfnTemplate.FreeFormSectionLayoutConfigurationProperty) {
        cdkBuilder.freeFormLayout(freeFormLayout)
    }

    public fun build(): CfnTemplate.SectionLayoutConfigurationProperty = cdkBuilder.build()
}
