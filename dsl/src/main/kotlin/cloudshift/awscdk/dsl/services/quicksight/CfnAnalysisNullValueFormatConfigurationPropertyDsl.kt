@file:Suppress("RedundantVisibilityModifier", "RedundantUnitReturnType", "RemoveRedundantQualifierName", "unused", "UnusedImport", "ClassName", "REDUNDANT_PROJECTION", "DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.quicksight.CfnAnalysis
import kotlin.String

/**
 * The options that determine the null value format configuration.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.quicksight.*;
 * NullValueFormatConfigurationProperty nullValueFormatConfigurationProperty =
 * NullValueFormatConfigurationProperty.builder()
 * .nullString("nullString")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-analysis-nullvalueformatconfiguration.html)
 */
@CdkDslMarker
public class CfnAnalysisNullValueFormatConfigurationPropertyDsl {
    private val cdkBuilder: CfnAnalysis.NullValueFormatConfigurationProperty.Builder =
        CfnAnalysis.NullValueFormatConfigurationProperty.builder()

    /**
     * @param nullString Determines the null string of null values.
     */
    public fun nullString(nullString: String) {
        cdkBuilder.nullString(nullString)
    }

    public fun build(): CfnAnalysis.NullValueFormatConfigurationProperty = cdkBuilder.build()
}
