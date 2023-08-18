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

package io.cloudshiftdev.awscdkdsl.services.quicksight

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.quicksight.CfnTemplate

/**
 * The configuration that defines the default value of a `String` parameter when a value has not
 * been set.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.quicksight.*;
 * StringValueWhenUnsetConfigurationProperty stringValueWhenUnsetConfigurationProperty =
 * StringValueWhenUnsetConfigurationProperty.builder()
 * .customValue("customValue")
 * .valueWhenUnsetOption("valueWhenUnsetOption")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-template-stringvaluewhenunsetconfiguration.html)
 */
@CdkDslMarker
public class CfnTemplateStringValueWhenUnsetConfigurationPropertyDsl {
    private val cdkBuilder: CfnTemplate.StringValueWhenUnsetConfigurationProperty.Builder =
        CfnTemplate.StringValueWhenUnsetConfigurationProperty.builder()

    /** @param customValue A custom value that's used when the value of a parameter isn't set. */
    public fun customValue(customValue: String) {
        cdkBuilder.customValue(customValue)
    }

    /**
     * @param valueWhenUnsetOption The built-in options for default values. The value can be one of
     *   the following:.
     * * `RECOMMENDED` : The recommended value.
     * * `NULL` : The `NULL` value.
     */
    public fun valueWhenUnsetOption(valueWhenUnsetOption: String) {
        cdkBuilder.valueWhenUnsetOption(valueWhenUnsetOption)
    }

    public fun build(): CfnTemplate.StringValueWhenUnsetConfigurationProperty = cdkBuilder.build()
}
