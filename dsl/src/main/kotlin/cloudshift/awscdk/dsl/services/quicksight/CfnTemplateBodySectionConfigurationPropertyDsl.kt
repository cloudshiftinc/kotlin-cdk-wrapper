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
public class CfnTemplateBodySectionConfigurationPropertyDsl {
    private val cdkBuilder: CfnTemplate.BodySectionConfigurationProperty.Builder =
        CfnTemplate.BodySectionConfigurationProperty.builder()

    public fun content(content: IResolvable) {
        cdkBuilder.content(content)
    }

    public fun content(content: CfnTemplate.BodySectionContentProperty) {
        cdkBuilder.content(content)
    }

    public fun pageBreakConfiguration(pageBreakConfiguration: IResolvable) {
        cdkBuilder.pageBreakConfiguration(pageBreakConfiguration)
    }

    public fun pageBreakConfiguration(pageBreakConfiguration: CfnTemplate.SectionPageBreakConfigurationProperty) {
        cdkBuilder.pageBreakConfiguration(pageBreakConfiguration)
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

    public fun build(): CfnTemplate.BodySectionConfigurationProperty = cdkBuilder.build()
}
