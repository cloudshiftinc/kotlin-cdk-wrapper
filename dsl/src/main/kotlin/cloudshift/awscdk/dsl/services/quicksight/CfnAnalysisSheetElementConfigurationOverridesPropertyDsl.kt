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
 * The override configuration of the rendering rules of a sheet.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.quicksight.*;
 * SheetElementConfigurationOverridesProperty sheetElementConfigurationOverridesProperty =
 * SheetElementConfigurationOverridesProperty.builder()
 * .visibility("visibility")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-analysis-sheetelementconfigurationoverrides.html)
 */
@CdkDslMarker
public class CfnAnalysisSheetElementConfigurationOverridesPropertyDsl {
    private val cdkBuilder: CfnAnalysis.SheetElementConfigurationOverridesProperty.Builder =
        CfnAnalysis.SheetElementConfigurationOverridesProperty.builder()

    /**
     * @param visibility Determines whether or not the overrides are visible. Choose one of the
     *   following options:.
     * * `VISIBLE`
     * * `HIDDEN`
     */
    public fun visibility(visibility: String) {
        cdkBuilder.visibility(visibility)
    }

    public fun build(): CfnAnalysis.SheetElementConfigurationOverridesProperty = cdkBuilder.build()
}
