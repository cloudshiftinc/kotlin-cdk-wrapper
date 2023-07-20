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
import software.constructs.Construct
import kotlin.String

@CdkDslMarker
public class CfnTemplateDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnTemplate.Builder = CfnTemplate.Builder.create(scope, id)

    public fun template(template: IResolvable) {
        cdkBuilder.template(template)
    }

    public fun template(template: CfnTemplate.TemplateProperty) {
        cdkBuilder.template(template)
    }

    public fun build(): CfnTemplate = cdkBuilder.build()
}
