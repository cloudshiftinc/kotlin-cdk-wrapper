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

package io.cloudshiftdev.awscdkdsl.services.rds

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.rds.CfnOptionGroup

/**
 * The `OptionSetting` property type specifies the value for an option within an `OptionSetting`
 * property.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.rds.*;
 * OptionSettingProperty optionSettingProperty = OptionSettingProperty.builder()
 * .name("name")
 * .value("value")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-optiongroup-optionsetting.html)
 */
@CdkDslMarker
public class CfnOptionGroupOptionSettingPropertyDsl {
    private val cdkBuilder: CfnOptionGroup.OptionSettingProperty.Builder =
        CfnOptionGroup.OptionSettingProperty.builder()

    /** @param name The name of the option that has settings that you can set. */
    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    /** @param value The current value of the option setting. */
    public fun `value`(`value`: String) {
        cdkBuilder.`value`(`value`)
    }

    public fun build(): CfnOptionGroup.OptionSettingProperty = cdkBuilder.build()
}
