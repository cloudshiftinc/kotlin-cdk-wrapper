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
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnTemplate

/**
 * The source entity of the template.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.quicksight.*;
 * TemplateSourceEntityProperty templateSourceEntityProperty =
 * TemplateSourceEntityProperty.builder()
 * .sourceAnalysis(TemplateSourceAnalysisProperty.builder()
 * .arn("arn")
 * .dataSetReferences(List.of(DataSetReferenceProperty.builder()
 * .dataSetArn("dataSetArn")
 * .dataSetPlaceholder("dataSetPlaceholder")
 * .build()))
 * .build())
 * .sourceTemplate(TemplateSourceTemplateProperty.builder()
 * .arn("arn")
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-template-templatesourceentity.html)
 */
@CdkDslMarker
public class CfnTemplateTemplateSourceEntityPropertyDsl {
    private val cdkBuilder: CfnTemplate.TemplateSourceEntityProperty.Builder =
        CfnTemplate.TemplateSourceEntityProperty.builder()

    /** @param sourceAnalysis The source analysis, if it is based on an analysis. */
    public fun sourceAnalysis(sourceAnalysis: IResolvable) {
        cdkBuilder.sourceAnalysis(sourceAnalysis)
    }

    /** @param sourceAnalysis The source analysis, if it is based on an analysis. */
    public fun sourceAnalysis(sourceAnalysis: CfnTemplate.TemplateSourceAnalysisProperty) {
        cdkBuilder.sourceAnalysis(sourceAnalysis)
    }

    /** @param sourceTemplate The source template, if it is based on an template. */
    public fun sourceTemplate(sourceTemplate: IResolvable) {
        cdkBuilder.sourceTemplate(sourceTemplate)
    }

    /** @param sourceTemplate The source template, if it is based on an template. */
    public fun sourceTemplate(sourceTemplate: CfnTemplate.TemplateSourceTemplateProperty) {
        cdkBuilder.sourceTemplate(sourceTemplate)
    }

    public fun build(): CfnTemplate.TemplateSourceEntityProperty = cdkBuilder.build()
}
