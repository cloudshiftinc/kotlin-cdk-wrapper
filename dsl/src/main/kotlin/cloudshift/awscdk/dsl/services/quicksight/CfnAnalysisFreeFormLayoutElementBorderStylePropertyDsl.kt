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

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.quicksight.CfnAnalysis

/**
 * The background style configuration of a free-form layout element.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.quicksight.*;
 * FreeFormLayoutElementBorderStyleProperty freeFormLayoutElementBorderStyleProperty =
 * FreeFormLayoutElementBorderStyleProperty.builder()
 * .color("color")
 * .visibility("visibility")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-analysis-freeformlayoutelementborderstyle.html)
 */
@CdkDslMarker
public class CfnAnalysisFreeFormLayoutElementBorderStylePropertyDsl {
    private val cdkBuilder: CfnAnalysis.FreeFormLayoutElementBorderStyleProperty.Builder =
        CfnAnalysis.FreeFormLayoutElementBorderStyleProperty.builder()

    /** @param color The border color of a free-form layout element. */
    public fun color(color: String) {
        cdkBuilder.color(color)
    }

    /** @param visibility The border visibility of a free-form layout element. */
    public fun visibility(visibility: String) {
        cdkBuilder.visibility(visibility)
    }

    public fun build(): CfnAnalysis.FreeFormLayoutElementBorderStyleProperty = cdkBuilder.build()
}
