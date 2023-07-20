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

package cloudshift.awscdk.dsl.services.ses

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.ses.CfnTemplate
import kotlin.String

@CdkDslMarker
public class CfnTemplateTemplatePropertyDsl {
    private val cdkBuilder: CfnTemplate.TemplateProperty.Builder =
        CfnTemplate.TemplateProperty.builder()

    public fun htmlPart(htmlPart: String) {
        cdkBuilder.htmlPart(htmlPart)
    }

    public fun subjectPart(subjectPart: String) {
        cdkBuilder.subjectPart(subjectPart)
    }

    public fun templateName(templateName: String) {
        cdkBuilder.templateName(templateName)
    }

    public fun textPart(textPart: String) {
        cdkBuilder.textPart(textPart)
    }

    public fun build(): CfnTemplate.TemplateProperty = cdkBuilder.build()
}
