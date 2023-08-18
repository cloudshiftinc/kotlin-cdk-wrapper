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
import kotlin.collections.Map
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.amplifyuibuilder.CfnThemeProps

/**
 * Properties for defining a `CfnTheme`.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.amplifyuibuilder.*;
 * ThemeValuesProperty themeValuesProperty_;
 * CfnThemeProps cfnThemeProps = CfnThemeProps.builder()
 * .name("name")
 * .values(List.of(ThemeValuesProperty.builder()
 * .key("key")
 * .value(ThemeValueProperty.builder()
 * .children(List.of(themeValuesProperty_))
 * .value("value")
 * .build())
 * .build()))
 * // the properties below are optional
 * .appId("appId")
 * .environmentName("environmentName")
 * .overrides(List.of(ThemeValuesProperty.builder()
 * .key("key")
 * .value(ThemeValueProperty.builder()
 * .children(List.of(themeValuesProperty_))
 * .value("value")
 * .build())
 * .build()))
 * .tags(Map.of(
 * "tagsKey", "tags"))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amplifyuibuilder-theme.html)
 */
@CdkDslMarker
public class CfnThemePropsDsl {
    private val cdkBuilder: CfnThemeProps.Builder = CfnThemeProps.builder()

    private val _overrides: MutableList<Any> = mutableListOf()

    private val _values: MutableList<Any> = mutableListOf()

    /** @param appId The unique ID for the Amplify app associated with the theme. */
    public fun appId(appId: String) {
        cdkBuilder.appId(appId)
    }

    /**
     * @param environmentName The name of the backend environment that is a part of the Amplify app.
     */
    public fun environmentName(environmentName: String) {
        cdkBuilder.environmentName(environmentName)
    }

    /** @param name The name of the theme. */
    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    /** @param overrides Describes the properties that can be overriden to customize a theme. */
    public fun overrides(vararg overrides: Any) {
        _overrides.addAll(listOf(*overrides))
    }

    /** @param overrides Describes the properties that can be overriden to customize a theme. */
    public fun overrides(overrides: Collection<Any>) {
        _overrides.addAll(overrides)
    }

    /** @param overrides Describes the properties that can be overriden to customize a theme. */
    public fun overrides(overrides: IResolvable) {
        cdkBuilder.overrides(overrides)
    }

    /** @param tags One or more key-value pairs to use when tagging the theme. */
    public fun tags(tags: Map<String, String>) {
        cdkBuilder.tags(tags)
    }

    /** @param values A list of key-value pairs that defines the properties of the theme. */
    public fun values(vararg values: Any) {
        _values.addAll(listOf(*values))
    }

    /** @param values A list of key-value pairs that defines the properties of the theme. */
    public fun values(values: Collection<Any>) {
        _values.addAll(values)
    }

    /** @param values A list of key-value pairs that defines the properties of the theme. */
    public fun values(values: IResolvable) {
        cdkBuilder.values(values)
    }

    public fun build(): CfnThemeProps {
        if (_overrides.isNotEmpty()) cdkBuilder.overrides(_overrides)
        if (_values.isNotEmpty()) cdkBuilder.values(_values)
        return cdkBuilder.build()
    }
}
