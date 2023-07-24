@file:Suppress("RedundantVisibilityModifier", "RedundantUnitReturnType", "RemoveRedundantQualifierName", "unused", "UnusedImport", "ClassName", "REDUNDANT_PROJECTION", "DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.quicksight.CfnAnalysis
import kotlin.Number
import kotlin.String

/**
 * Determines the color that is applied to a particular data value.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.quicksight.*;
 * DataColorProperty dataColorProperty = DataColorProperty.builder()
 * .color("color")
 * .dataValue(123)
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-analysis-datacolor.html)
 */
@CdkDslMarker
public class CfnAnalysisDataColorPropertyDsl {
    private val cdkBuilder: CfnAnalysis.DataColorProperty.Builder =
        CfnAnalysis.DataColorProperty.builder()

    /**
     * @param color The color that is applied to the data value.
     */
    public fun color(color: String) {
        cdkBuilder.color(color)
    }

    /**
     * @param dataValue The data value that the color is applied to.
     */
    public fun dataValue(dataValue: Number) {
        cdkBuilder.dataValue(dataValue)
    }

    public fun build(): CfnAnalysis.DataColorProperty = cdkBuilder.build()
}
