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

package io.cloudshiftdev.awscdkdsl.services.amplifyuibuilder

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.Any
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.amplifyuibuilder.CfnTheme

/**
 * The `ThemeValue` property specifies the configuration of a theme's properties.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.amplifyuibuilder.*;
 * ThemeValueProperty themeValueProperty_;
 * ThemeValueProperty themeValueProperty = ThemeValueProperty.builder()
 * .children(List.of(ThemeValuesProperty.builder()
 * .key("key")
 * .value(themeValueProperty_)
 * .build()))
 * .value("value")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-amplifyuibuilder-theme-themevalue.html)
 */
@CdkDslMarker
public class CfnThemeThemeValuePropertyDsl {
    private val cdkBuilder: CfnTheme.ThemeValueProperty.Builder =
        CfnTheme.ThemeValueProperty.builder()

    private val _children: MutableList<Any> = mutableListOf()

    /** @param children A list of key-value pairs that define the theme's properties. */
    public fun children(vararg children: Any) {
        _children.addAll(listOf(*children))
    }

    /** @param children A list of key-value pairs that define the theme's properties. */
    public fun children(children: Collection<Any>) {
        _children.addAll(children)
    }

    /** @param children A list of key-value pairs that define the theme's properties. */
    public fun children(children: IResolvable) {
        cdkBuilder.children(children)
    }

    /** @param value The value of a theme property. */
    public fun `value`(`value`: String) {
        cdkBuilder.`value`(`value`)
    }

    public fun build(): CfnTheme.ThemeValueProperty {
        if (_children.isNotEmpty()) cdkBuilder.children(_children)
        return cdkBuilder.build()
    }
}
