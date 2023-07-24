@file:Suppress("RedundantVisibilityModifier", "RedundantUnitReturnType", "RemoveRedundantQualifierName", "unused", "UnusedImport", "ClassName", "REDUNDANT_PROJECTION", "DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.quicksight.CfnAnalysis
import kotlin.String

/**
 * The option that determines the text display weight, or boldness.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.quicksight.*;
 * FontWeightProperty fontWeightProperty = FontWeightProperty.builder()
 * .name("name")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-analysis-fontweight.html)
 */
@CdkDslMarker
public class CfnAnalysisFontWeightPropertyDsl {
    private val cdkBuilder: CfnAnalysis.FontWeightProperty.Builder =
        CfnAnalysis.FontWeightProperty.builder()

    /**
     * @param name The lexical name for the level of boldness of the text display.
     */
    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    public fun build(): CfnAnalysis.FontWeightProperty = cdkBuilder.build()
}
