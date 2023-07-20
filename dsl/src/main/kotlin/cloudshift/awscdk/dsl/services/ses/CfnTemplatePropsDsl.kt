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
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.ses.CfnTemplate
import software.amazon.awscdk.services.ses.CfnTemplateProps

@CdkDslMarker
public class CfnTemplatePropsDsl {
    private val cdkBuilder: CfnTemplateProps.Builder = CfnTemplateProps.builder()

    public fun template(template: IResolvable) {
        cdkBuilder.template(template)
    }

    public fun template(template: CfnTemplate.TemplateProperty) {
        cdkBuilder.template(template)
    }

    public fun build(): CfnTemplateProps = cdkBuilder.build()
}
