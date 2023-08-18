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
import software.amazon.awscdk.services.quicksight.CfnAnalysis

/**
 * The source entity of an analysis.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.quicksight.*;
 * AnalysisSourceEntityProperty analysisSourceEntityProperty =
 * AnalysisSourceEntityProperty.builder()
 * .sourceTemplate(AnalysisSourceTemplateProperty.builder()
 * .arn("arn")
 * .dataSetReferences(List.of(DataSetReferenceProperty.builder()
 * .dataSetArn("dataSetArn")
 * .dataSetPlaceholder("dataSetPlaceholder")
 * .build()))
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-analysis-analysissourceentity.html)
 */
@CdkDslMarker
public class CfnAnalysisAnalysisSourceEntityPropertyDsl {
    private val cdkBuilder: CfnAnalysis.AnalysisSourceEntityProperty.Builder =
        CfnAnalysis.AnalysisSourceEntityProperty.builder()

    /** @param sourceTemplate The source template for the source entity of the analysis. */
    public fun sourceTemplate(sourceTemplate: IResolvable) {
        cdkBuilder.sourceTemplate(sourceTemplate)
    }

    /** @param sourceTemplate The source template for the source entity of the analysis. */
    public fun sourceTemplate(sourceTemplate: CfnAnalysis.AnalysisSourceTemplateProperty) {
        cdkBuilder.sourceTemplate(sourceTemplate)
    }

    public fun build(): CfnAnalysis.AnalysisSourceEntityProperty = cdkBuilder.build()
}
