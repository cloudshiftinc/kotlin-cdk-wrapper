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
 * A collection of options that configure how each panel displays in a small multiples chart.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.quicksight.*;
 * PanelConfigurationProperty panelConfigurationProperty = PanelConfigurationProperty.builder()
 * .backgroundColor("backgroundColor")
 * .backgroundVisibility("backgroundVisibility")
 * .borderColor("borderColor")
 * .borderStyle("borderStyle")
 * .borderThickness("borderThickness")
 * .borderVisibility("borderVisibility")
 * .gutterSpacing("gutterSpacing")
 * .gutterVisibility("gutterVisibility")
 * .title(PanelTitleOptionsProperty.builder()
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
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-analysis-panelconfiguration.html)
 */
@CdkDslMarker
public class CfnAnalysisPanelConfigurationPropertyDsl {
    private val cdkBuilder: CfnAnalysis.PanelConfigurationProperty.Builder =
        CfnAnalysis.PanelConfigurationProperty.builder()

    /** @param backgroundColor Sets the background color for each panel. */
    public fun backgroundColor(backgroundColor: String) {
        cdkBuilder.backgroundColor(backgroundColor)
    }

    /**
     * @param backgroundVisibility Determines whether or not a background for each small multiples
     *   panel is rendered.
     */
    public fun backgroundVisibility(backgroundVisibility: String) {
        cdkBuilder.backgroundVisibility(backgroundVisibility)
    }

    /** @param borderColor Sets the line color of panel borders. */
    public fun borderColor(borderColor: String) {
        cdkBuilder.borderColor(borderColor)
    }

    /** @param borderStyle Sets the line style of panel borders. */
    public fun borderStyle(borderStyle: String) {
        cdkBuilder.borderStyle(borderStyle)
    }

    /** @param borderThickness Sets the line thickness of panel borders. */
    public fun borderThickness(borderThickness: String) {
        cdkBuilder.borderThickness(borderThickness)
    }

    /** @param borderVisibility Determines whether or not each panel displays a border. */
    public fun borderVisibility(borderVisibility: String) {
        cdkBuilder.borderVisibility(borderVisibility)
    }

    /**
     * @param gutterSpacing Sets the total amount of negative space to display between sibling
     *   panels.
     */
    public fun gutterSpacing(gutterSpacing: String) {
        cdkBuilder.gutterSpacing(gutterSpacing)
    }

    /**
     * @param gutterVisibility Determines whether or not negative space between sibling panels is
     *   rendered.
     */
    public fun gutterVisibility(gutterVisibility: String) {
        cdkBuilder.gutterVisibility(gutterVisibility)
    }

    /** @param title Configures the title display within each small multiples panel. */
    public fun title(title: IResolvable) {
        cdkBuilder.title(title)
    }

    /** @param title Configures the title display within each small multiples panel. */
    public fun title(title: CfnAnalysis.PanelTitleOptionsProperty) {
        cdkBuilder.title(title)
    }

    public fun build(): CfnAnalysis.PanelConfigurationProperty = cdkBuilder.build()
}
