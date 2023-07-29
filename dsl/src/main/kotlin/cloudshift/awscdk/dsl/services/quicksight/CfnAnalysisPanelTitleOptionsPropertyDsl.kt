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
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnAnalysis

/**
 * The options that determine the title styles for each small multiples panel.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.quicksight.*;
 * PanelTitleOptionsProperty panelTitleOptionsProperty = PanelTitleOptionsProperty.builder()
 * .fontConfiguration(FontConfigurationProperty.builder()
 * .fontColor("fontColor")
 * .fontDecoration("fontDecoration")
 * .fontSize(FontSizeProperty.builder()
 * .relative("relative")
 * .build())
 * .fontStyle("fontStyle")
 * .fontWeight(FontWeightProperty.builder()
 * .name("name")
 * .build())
 * .build())
 * .horizontalTextAlignment("horizontalTextAlignment")
 * .visibility("visibility")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-analysis-paneltitleoptions.html)
 */
@CdkDslMarker
public class CfnAnalysisPanelTitleOptionsPropertyDsl {
    private val cdkBuilder: CfnAnalysis.PanelTitleOptionsProperty.Builder =
        CfnAnalysis.PanelTitleOptionsProperty.builder()

    /** @param fontConfiguration the value to be set. */
    public fun fontConfiguration(fontConfiguration: IResolvable) {
        cdkBuilder.fontConfiguration(fontConfiguration)
    }

    /** @param fontConfiguration the value to be set. */
    public fun fontConfiguration(fontConfiguration: CfnAnalysis.FontConfigurationProperty) {
        cdkBuilder.fontConfiguration(fontConfiguration)
    }

    /**
     * @param horizontalTextAlignment Sets the horizontal text alignment of the title within each
     *   panel.
     */
    public fun horizontalTextAlignment(horizontalTextAlignment: String) {
        cdkBuilder.horizontalTextAlignment(horizontalTextAlignment)
    }

    /** @param visibility Determines whether or not panel titles are displayed. */
    public fun visibility(visibility: String) {
        cdkBuilder.visibility(visibility)
    }

    public fun build(): CfnAnalysis.PanelTitleOptionsProperty = cdkBuilder.build()
}
