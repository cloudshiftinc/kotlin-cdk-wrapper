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
import kotlin.Any
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnTemplate

/**
 * The color configurations for a column.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.quicksight.*;
 * ColorsConfigurationProperty colorsConfigurationProperty = ColorsConfigurationProperty.builder()
 * .customColors(List.of(CustomColorProperty.builder()
 * .color("color")
 * // the properties below are optional
 * .fieldValue("fieldValue")
 * .specialValue("specialValue")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-template-colorsconfiguration.html)
 */
@CdkDslMarker
public class CfnTemplateColorsConfigurationPropertyDsl {
    private val cdkBuilder: CfnTemplate.ColorsConfigurationProperty.Builder =
        CfnTemplate.ColorsConfigurationProperty.builder()

    private val _customColors: MutableList<Any> = mutableListOf()

    /** @param customColors A list of up to 50 custom colors. */
    public fun customColors(vararg customColors: Any) {
        _customColors.addAll(listOf(*customColors))
    }

    /** @param customColors A list of up to 50 custom colors. */
    public fun customColors(customColors: Collection<Any>) {
        _customColors.addAll(customColors)
    }

    /** @param customColors A list of up to 50 custom colors. */
    public fun customColors(customColors: IResolvable) {
        cdkBuilder.customColors(customColors)
    }

    public fun build(): CfnTemplate.ColorsConfigurationProperty {
        if (_customColors.isNotEmpty()) cdkBuilder.customColors(_customColors)
        return cdkBuilder.build()
    }
}
