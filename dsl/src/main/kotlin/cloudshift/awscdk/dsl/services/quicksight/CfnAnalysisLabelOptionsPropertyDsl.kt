@file:Suppress("RedundantVisibilityModifier", "RedundantUnitReturnType", "RemoveRedundantQualifierName", "unused", "UnusedImport", "ClassName", "REDUNDANT_PROJECTION", "DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnAnalysis
import kotlin.String

/**
 * The share label options for the labels.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.quicksight.*;
 * LabelOptionsProperty labelOptionsProperty = LabelOptionsProperty.builder()
 * .customLabel("customLabel")
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
 * .visibility("visibility")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-analysis-labeloptions.html)
 */
@CdkDslMarker
public class CfnAnalysisLabelOptionsPropertyDsl {
    private val cdkBuilder: CfnAnalysis.LabelOptionsProperty.Builder =
        CfnAnalysis.LabelOptionsProperty.builder()

    /**
     * @param customLabel The text for the label.
     */
    public fun customLabel(customLabel: String) {
        cdkBuilder.customLabel(customLabel)
    }

    /**
     * @param fontConfiguration The font configuration of the label.
     */
    public fun fontConfiguration(fontConfiguration: IResolvable) {
        cdkBuilder.fontConfiguration(fontConfiguration)
    }

    /**
     * @param fontConfiguration The font configuration of the label.
     */
    public fun fontConfiguration(fontConfiguration: CfnAnalysis.FontConfigurationProperty) {
        cdkBuilder.fontConfiguration(fontConfiguration)
    }

    /**
     * @param visibility Determines whether or not the label is visible.
     */
    public fun visibility(visibility: String) {
        cdkBuilder.visibility(visibility)
    }

    public fun build(): CfnAnalysis.LabelOptionsProperty = cdkBuilder.build()
}
