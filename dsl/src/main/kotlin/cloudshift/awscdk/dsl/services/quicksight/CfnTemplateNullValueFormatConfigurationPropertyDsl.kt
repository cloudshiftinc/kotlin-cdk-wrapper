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
import software.amazon.awscdk.services.quicksight.CfnTemplate

/**
 * The options that determine the null value format configuration.
 *
 * Example:
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
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-template-nullvalueformatconfiguration.html)
 */
@CdkDslMarker
public class CfnTemplateNullValueFormatConfigurationPropertyDsl {
    private val cdkBuilder: CfnTemplate.NullValueFormatConfigurationProperty.Builder =
        CfnTemplate.NullValueFormatConfigurationProperty.builder()

    /** @param nullString Determines the null string of null values. */
    public fun nullString(nullString: String) {
        cdkBuilder.nullString(nullString)
    }

    public fun build(): CfnTemplate.NullValueFormatConfigurationProperty = cdkBuilder.build()
}
