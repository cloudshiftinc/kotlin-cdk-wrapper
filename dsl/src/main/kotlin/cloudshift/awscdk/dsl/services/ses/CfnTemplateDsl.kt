@file:Suppress(
    "RedundantVisibilityModifier",
    "RedundantUnitReturnType",
    "RemoveRedundantQualifierName",
    "unused",
    "UnusedImport",
    "ClassName",
    "REDUNDANT_PROJECTION",
    "DEPRECATION"
)

package cloudshift.awscdk.dsl.services.ses

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.ses.CfnTemplate
import software.constructs.Construct

/**
 * Specifies an email template.
 *
 * Email templates enable you to send personalized email to one or more destinations in a single API
 * operation.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.ses.*;
 * CfnTemplate cfnTemplate = CfnTemplate.Builder.create(this, "MyCfnTemplate")
 * .template(TemplateProperty.builder()
 * .subjectPart("subjectPart")
 * // the properties below are optional
 * .htmlPart("htmlPart")
 * .templateName("templateName")
 * .textPart("textPart")
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ses-template.html)
 */
@CdkDslMarker
public class CfnTemplateDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnTemplate.Builder = CfnTemplate.Builder.create(scope, id)

    /**
     * The content of the email, composed of a subject line and either an HTML part or a text-only
     * part.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ses-template.html#cfn-ses-template-template)
     *
     * @param template The content of the email, composed of a subject line and either an HTML part
     *   or a text-only part.
     */
    public fun template(template: IResolvable) {
        cdkBuilder.template(template)
    }

    /**
     * The content of the email, composed of a subject line and either an HTML part or a text-only
     * part.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ses-template.html#cfn-ses-template-template)
     *
     * @param template The content of the email, composed of a subject line and either an HTML part
     *   or a text-only part.
     */
    public fun template(template: CfnTemplate.TemplateProperty) {
        cdkBuilder.template(template)
    }

    public fun build(): CfnTemplate = cdkBuilder.build()
}
