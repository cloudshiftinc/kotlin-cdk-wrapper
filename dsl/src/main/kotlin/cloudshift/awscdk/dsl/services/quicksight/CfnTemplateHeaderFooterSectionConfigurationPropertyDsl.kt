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
import kotlin.String

@CdkDslMarker
public class CfnTemplateHeaderFooterSectionConfigurationPropertyDsl {
    private val cdkBuilder: CfnTemplate.HeaderFooterSectionConfigurationProperty.Builder =
        CfnTemplate.HeaderFooterSectionConfigurationProperty.builder()

    public fun layout(layout: IResolvable) {
        cdkBuilder.layout(layout)
    }

    public fun layout(layout: CfnTemplate.SectionLayoutConfigurationProperty) {
        cdkBuilder.layout(layout)
    }

    public fun sectionId(sectionId: String) {
        cdkBuilder.sectionId(sectionId)
    }

    public fun style(style: IResolvable) {
        cdkBuilder.style(style)
    }

    public fun style(style: CfnTemplate.SectionStyleProperty) {
        cdkBuilder.style(style)
    }

    public fun build(): CfnTemplate.HeaderFooterSectionConfigurationProperty = cdkBuilder.build()
}
