@file:Suppress("RedundantVisibilityModifier", "RedundantUnitReturnType", "RemoveRedundantQualifierName", "unused", "UnusedImport", "ClassName", "REDUNDANT_PROJECTION", "DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnAnalysis
import kotlin.String

/**
 * Configures the display properties of the given text.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.quicksight.*;
 * FontConfigurationProperty fontConfigurationProperty = FontConfigurationProperty.builder()
 * .fontColor("fontColor")
 * .fontDecoration("fontDecoration")
 * .fontSize(FontSizeProperty.builder()
 * .relative("relative")
 * .build())
 * .fontStyle("fontStyle")
 * .fontWeight(FontWeightProperty.builder()
 * .name("name")
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-analysis-fontconfiguration.html)
 */
@CdkDslMarker
public class CfnAnalysisFontConfigurationPropertyDsl {
    private val cdkBuilder: CfnAnalysis.FontConfigurationProperty.Builder =
        CfnAnalysis.FontConfigurationProperty.builder()

    /**
     * @param fontColor Determines the color of the text.
     */
    public fun fontColor(fontColor: String) {
        cdkBuilder.fontColor(fontColor)
    }

    /**
     * @param fontDecoration Determines the appearance of decorative lines on the text.
     */
    public fun fontDecoration(fontDecoration: String) {
        cdkBuilder.fontDecoration(fontDecoration)
    }

    /**
     * @param fontSize The option that determines the text display size.
     */
    public fun fontSize(fontSize: IResolvable) {
        cdkBuilder.fontSize(fontSize)
    }

    /**
     * @param fontSize The option that determines the text display size.
     */
    public fun fontSize(fontSize: CfnAnalysis.FontSizeProperty) {
        cdkBuilder.fontSize(fontSize)
    }

    /**
     * @param fontStyle Determines the text display face that is inherited by the given font family.
     */
    public fun fontStyle(fontStyle: String) {
        cdkBuilder.fontStyle(fontStyle)
    }

    /**
     * @param fontWeight The option that determines the text display weight, or boldness.
     */
    public fun fontWeight(fontWeight: IResolvable) {
        cdkBuilder.fontWeight(fontWeight)
    }

    /**
     * @param fontWeight The option that determines the text display weight, or boldness.
     */
    public fun fontWeight(fontWeight: CfnAnalysis.FontWeightProperty) {
        cdkBuilder.fontWeight(fontWeight)
    }

    public fun build(): CfnAnalysis.FontConfigurationProperty = cdkBuilder.build()
}
