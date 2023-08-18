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

import io.cloudshiftdev.awscdkdsl.CfnTagDsl
import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnTheme
import software.constructs.Construct

/**
 * Creates a theme.
 *
 * A *theme* is set of configuration options for color and layout. Themes apply to analyses and
 * dashboards. For more information, see
 * [Using Themes in Amazon QuickSight](https://docs.aws.amazon.com/quicksight/latest/user/themes-in-quicksight.html)
 * in the *Amazon QuickSight User Guide* .
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.quicksight.*;
 * CfnTheme cfnTheme = CfnTheme.Builder.create(this, "MyCfnTheme")
 * .awsAccountId("awsAccountId")
 * .baseThemeId("baseThemeId")
 * .configuration(ThemeConfigurationProperty.builder()
 * .dataColorPalette(DataColorPaletteProperty.builder()
 * .colors(List.of("colors"))
 * .emptyFillColor("emptyFillColor")
 * .minMaxGradient(List.of("minMaxGradient"))
 * .build())
 * .sheet(SheetStyleProperty.builder()
 * .tile(TileStyleProperty.builder()
 * .border(BorderStyleProperty.builder()
 * .show(false)
 * .build())
 * .build())
 * .tileLayout(TileLayoutStyleProperty.builder()
 * .gutter(GutterStyleProperty.builder()
 * .show(false)
 * .build())
 * .margin(MarginStyleProperty.builder()
 * .show(false)
 * .build())
 * .build())
 * .build())
 * .typography(TypographyProperty.builder()
 * .fontFamilies(List.of(FontProperty.builder()
 * .fontFamily("fontFamily")
 * .build()))
 * .build())
 * .uiColorPalette(UIColorPaletteProperty.builder()
 * .accent("accent")
 * .accentForeground("accentForeground")
 * .danger("danger")
 * .dangerForeground("dangerForeground")
 * .dimension("dimension")
 * .dimensionForeground("dimensionForeground")
 * .measure("measure")
 * .measureForeground("measureForeground")
 * .primaryBackground("primaryBackground")
 * .primaryForeground("primaryForeground")
 * .secondaryBackground("secondaryBackground")
 * .secondaryForeground("secondaryForeground")
 * .success("success")
 * .successForeground("successForeground")
 * .warning("warning")
 * .warningForeground("warningForeground")
 * .build())
 * .build())
 * .name("name")
 * .themeId("themeId")
 * // the properties below are optional
 * .permissions(List.of(ResourcePermissionProperty.builder()
 * .actions(List.of("actions"))
 * .principal("principal")
 * // the properties below are optional
 * .resource("resource")
 * .build()))
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .versionDescription("versionDescription")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-quicksight-theme.html)
 */
@CdkDslMarker
public class CfnThemeDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnTheme.Builder = CfnTheme.Builder.create(scope, id)

    private val _permissions: MutableList<Any> = mutableListOf()

    private val _tags: MutableList<CfnTag> = mutableListOf()

    /**
     * The ID of the AWS account where you want to store the new theme.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-quicksight-theme.html#cfn-quicksight-theme-awsaccountid)
     *
     * @param awsAccountId The ID of the AWS account where you want to store the new theme.
     */
    public fun awsAccountId(awsAccountId: String) {
        cdkBuilder.awsAccountId(awsAccountId)
    }

    /**
     * The ID of the theme that a custom theme will inherit from.
     *
     * All themes inherit from one of the starting themes defined by Amazon QuickSight. For a list
     * of the starting themes, use `ListThemes` or choose *Themes* from within an analysis.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-quicksight-theme.html#cfn-quicksight-theme-basethemeid)
     *
     * @param baseThemeId The ID of the theme that a custom theme will inherit from.
     */
    public fun baseThemeId(baseThemeId: String) {
        cdkBuilder.baseThemeId(baseThemeId)
    }

    /**
     * The theme configuration, which contains the theme display properties.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-quicksight-theme.html#cfn-quicksight-theme-configuration)
     *
     * @param configuration The theme configuration, which contains the theme display properties.
     */
    public fun configuration(configuration: IResolvable) {
        cdkBuilder.configuration(configuration)
    }

    /**
     * The theme configuration, which contains the theme display properties.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-quicksight-theme.html#cfn-quicksight-theme-configuration)
     *
     * @param configuration The theme configuration, which contains the theme display properties.
     */
    public fun configuration(configuration: CfnTheme.ThemeConfigurationProperty) {
        cdkBuilder.configuration(configuration)
    }

    /**
     * A display name for the theme.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-quicksight-theme.html#cfn-quicksight-theme-name)
     *
     * @param name A display name for the theme.
     */
    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    /**
     * A valid grouping of resource permissions to apply to the new theme.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-quicksight-theme.html#cfn-quicksight-theme-permissions)
     *
     * @param permissions A valid grouping of resource permissions to apply to the new theme.
     */
    public fun permissions(vararg permissions: Any) {
        _permissions.addAll(listOf(*permissions))
    }

    /**
     * A valid grouping of resource permissions to apply to the new theme.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-quicksight-theme.html#cfn-quicksight-theme-permissions)
     *
     * @param permissions A valid grouping of resource permissions to apply to the new theme.
     */
    public fun permissions(permissions: Collection<Any>) {
        _permissions.addAll(permissions)
    }

    /**
     * A valid grouping of resource permissions to apply to the new theme.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-quicksight-theme.html#cfn-quicksight-theme-permissions)
     *
     * @param permissions A valid grouping of resource permissions to apply to the new theme.
     */
    public fun permissions(permissions: IResolvable) {
        cdkBuilder.permissions(permissions)
    }

    /**
     * A map of the key-value pairs for the resource tag or tags that you want to add to the
     * resource.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-quicksight-theme.html#cfn-quicksight-theme-tags)
     *
     * @param tags A map of the key-value pairs for the resource tag or tags that you want to add to
     *   the resource.
     */
    public fun tags(tags: CfnTagDsl.() -> Unit) {
        _tags.add(CfnTagDsl().apply(tags).build())
    }

    /**
     * A map of the key-value pairs for the resource tag or tags that you want to add to the
     * resource.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-quicksight-theme.html#cfn-quicksight-theme-tags)
     *
     * @param tags A map of the key-value pairs for the resource tag or tags that you want to add to
     *   the resource.
     */
    public fun tags(tags: Collection<CfnTag>) {
        _tags.addAll(tags)
    }

    /**
     * An ID for the theme that you want to create.
     *
     * The theme ID is unique per AWS Region in each AWS account.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-quicksight-theme.html#cfn-quicksight-theme-themeid)
     *
     * @param themeId An ID for the theme that you want to create.
     */
    public fun themeId(themeId: String) {
        cdkBuilder.themeId(themeId)
    }

    /**
     * A description of the first version of the theme that you're creating.
     *
     * Every time `UpdateTheme` is called, a new version is created. Each version of the theme has a
     * description of the version in the `VersionDescription` field.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-quicksight-theme.html#cfn-quicksight-theme-versiondescription)
     *
     * @param versionDescription A description of the first version of the theme that you're
     *   creating.
     */
    public fun versionDescription(versionDescription: String) {
        cdkBuilder.versionDescription(versionDescription)
    }

    public fun build(): CfnTheme {
        if (_permissions.isNotEmpty()) cdkBuilder.permissions(_permissions)
        if (_tags.isNotEmpty()) cdkBuilder.tags(_tags)
        return cdkBuilder.build()
    }
}
