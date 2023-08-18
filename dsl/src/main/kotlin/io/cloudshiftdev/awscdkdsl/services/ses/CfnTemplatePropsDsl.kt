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

package io.cloudshiftdev.awscdkdsl.services.ses

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.ses.CfnTemplate
import software.amazon.awscdk.services.ses.CfnTemplateProps

/**
 * Properties for defining a `CfnTemplate`.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.ses.*;
 * CfnTemplateProps cfnTemplateProps = CfnTemplateProps.builder()
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
public class CfnTemplatePropsDsl {
    private val cdkBuilder: CfnTemplateProps.Builder = CfnTemplateProps.builder()

    /**
     * @param template The content of the email, composed of a subject line and either an HTML part
     *   or a text-only part.
     */
    public fun template(template: IResolvable) {
        cdkBuilder.template(template)
    }

    /**
     * @param template The content of the email, composed of a subject line and either an HTML part
     *   or a text-only part.
     */
    public fun template(template: CfnTemplate.TemplateProperty) {
        cdkBuilder.template(template)
    }

    public fun build(): CfnTemplateProps = cdkBuilder.build()
}
