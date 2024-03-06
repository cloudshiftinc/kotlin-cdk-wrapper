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

package io.cloudshiftdev.awscdkdsl.services.cleanrooms

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.cleanrooms.CfnAnalysisTemplate

/**
 * The structure that defines the body of the analysis template.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.cleanrooms.*;
 * AnalysisSourceProperty analysisSourceProperty = AnalysisSourceProperty.builder()
 * .text("text")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cleanrooms-analysistemplate-analysissource.html)
 */
@CdkDslMarker
public class CfnAnalysisTemplateAnalysisSourcePropertyDsl {
    private val cdkBuilder: CfnAnalysisTemplate.AnalysisSourceProperty.Builder =
        CfnAnalysisTemplate.AnalysisSourceProperty.builder()

    /** @param text The query text. */
    public fun text(text: String) {
        cdkBuilder.text(text)
    }

    public fun build(): CfnAnalysisTemplate.AnalysisSourceProperty = cdkBuilder.build()
}
