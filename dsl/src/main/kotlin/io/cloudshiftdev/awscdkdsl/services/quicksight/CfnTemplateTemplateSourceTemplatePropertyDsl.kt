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

package io.cloudshiftdev.awscdkdsl.services.quicksight

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.quicksight.CfnTemplate

/**
 * The source template of the template.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.quicksight.*;
 * TemplateSourceTemplateProperty templateSourceTemplateProperty =
 * TemplateSourceTemplateProperty.builder()
 * .arn("arn")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-template-templatesourcetemplate.html)
 */
@CdkDslMarker
public class CfnTemplateTemplateSourceTemplatePropertyDsl {
    private val cdkBuilder: CfnTemplate.TemplateSourceTemplateProperty.Builder =
        CfnTemplate.TemplateSourceTemplateProperty.builder()

    /** @param arn The Amazon Resource Name (ARN) of the resource. */
    public fun arn(arn: String) {
        cdkBuilder.arn(arn)
    }

    public fun build(): CfnTemplate.TemplateSourceTemplateProperty = cdkBuilder.build()
}
