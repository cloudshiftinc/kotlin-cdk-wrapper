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
 * A text box.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.quicksight.*;
 * SheetTextBoxProperty sheetTextBoxProperty = SheetTextBoxProperty.builder()
 * .sheetTextBoxId("sheetTextBoxId")
 * // the properties below are optional
 * .content("content")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-analysis-sheettextbox.html)
 */
@CdkDslMarker
public class CfnAnalysisSheetTextBoxPropertyDsl {
    private val cdkBuilder: CfnAnalysis.SheetTextBoxProperty.Builder =
        CfnAnalysis.SheetTextBoxProperty.builder()

    /** @param content The content that is displayed in the text box. */
    public fun content(content: String) {
        cdkBuilder.content(content)
    }

    /**
     * @param sheetTextBoxId The unique identifier for a text box. This identifier must be unique
     *   within the context of a dashboard, template, or analysis. Two dashboards, analyses, or
     *   templates can have text boxes that share identifiers.
     */
    public fun sheetTextBoxId(sheetTextBoxId: String) {
        cdkBuilder.sheetTextBoxId(sheetTextBoxId)
    }

    public fun build(): CfnAnalysis.SheetTextBoxProperty = cdkBuilder.build()
}
