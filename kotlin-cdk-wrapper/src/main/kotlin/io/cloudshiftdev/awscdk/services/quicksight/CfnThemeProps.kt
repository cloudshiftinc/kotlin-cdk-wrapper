@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.quicksight

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

/**
 * Properties for defining a `CfnTheme`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.quicksight.*;
 * CfnThemeProps cfnThemeProps = CfnThemeProps.builder()
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
public interface CfnThemeProps {
  /**
   * The ID of the AWS account where you want to store the new theme.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-quicksight-theme.html#cfn-quicksight-theme-awsaccountid)
   */
  public fun awsAccountId(): String

  /**
   * The ID of the theme that a custom theme will inherit from.
   *
   * All themes inherit from one of the starting themes defined by Amazon QuickSight. For a list of
   * the starting themes, use `ListThemes` or choose *Themes* from within an analysis.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-quicksight-theme.html#cfn-quicksight-theme-basethemeid)
   */
  public fun baseThemeId(): String

  /**
   * The theme configuration, which contains the theme display properties.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-quicksight-theme.html#cfn-quicksight-theme-configuration)
   */
  public fun configuration(): Any

  /**
   * A display name for the theme.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-quicksight-theme.html#cfn-quicksight-theme-name)
   */
  public fun name(): String

  /**
   * A valid grouping of resource permissions to apply to the new theme.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-quicksight-theme.html#cfn-quicksight-theme-permissions)
   */
  public fun permissions(): Any? = unwrap(this).getPermissions()

  /**
   * A map of the key-value pairs for the resource tag or tags that you want to add to the resource.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-quicksight-theme.html#cfn-quicksight-theme-tags)
   */
  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * An ID for the theme that you want to create.
   *
   * The theme ID is unique per AWS Region in each AWS account.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-quicksight-theme.html#cfn-quicksight-theme-themeid)
   */
  public fun themeId(): String

  /**
   * A description of the first version of the theme that you're creating.
   *
   * Every time `UpdateTheme` is called, a new version is created. Each version of the theme has a
   * description of the version in the `VersionDescription` field.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-quicksight-theme.html#cfn-quicksight-theme-versiondescription)
   */
  public fun versionDescription(): String? = unwrap(this).getVersionDescription()

  /**
   * A builder for [CfnThemeProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param awsAccountId The ID of the AWS account where you want to store the new theme. 
     */
    public fun awsAccountId(awsAccountId: String)

    /**
     * @param baseThemeId The ID of the theme that a custom theme will inherit from. 
     * All themes inherit from one of the starting themes defined by Amazon QuickSight. For a list
     * of the starting themes, use `ListThemes` or choose *Themes* from within an analysis.
     */
    public fun baseThemeId(baseThemeId: String)

    /**
     * @param configuration The theme configuration, which contains the theme display properties. 
     */
    public fun configuration(configuration: IResolvable)

    /**
     * @param configuration The theme configuration, which contains the theme display properties. 
     */
    public fun configuration(configuration: CfnTheme.ThemeConfigurationProperty)

    /**
     * @param configuration The theme configuration, which contains the theme display properties. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("28e946efa67b3c2de9714e9ff481bff3c072f73a5c865f8c2ed6e44691164ab6")
    public fun configuration(configuration: CfnTheme.ThemeConfigurationProperty.Builder.() -> Unit)

    /**
     * @param name A display name for the theme. 
     */
    public fun name(name: String)

    /**
     * @param permissions A valid grouping of resource permissions to apply to the new theme.
     */
    public fun permissions(permissions: IResolvable)

    /**
     * @param permissions A valid grouping of resource permissions to apply to the new theme.
     */
    public fun permissions(permissions: List<Any>)

    /**
     * @param permissions A valid grouping of resource permissions to apply to the new theme.
     */
    public fun permissions(vararg permissions: Any)

    /**
     * @param tags A map of the key-value pairs for the resource tag or tags that you want to add to
     * the resource.
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * @param tags A map of the key-value pairs for the resource tag or tags that you want to add to
     * the resource.
     */
    public fun tags(vararg tags: CfnTag)

    /**
     * @param themeId An ID for the theme that you want to create. 
     * The theme ID is unique per AWS Region in each AWS account.
     */
    public fun themeId(themeId: String)

    /**
     * @param versionDescription A description of the first version of the theme that you're
     * creating.
     * Every time `UpdateTheme` is called, a new version is created. Each version of the theme has a
     * description of the version in the `VersionDescription` field.
     */
    public fun versionDescription(versionDescription: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.quicksight.CfnThemeProps.Builder =
        software.amazon.awscdk.services.quicksight.CfnThemeProps.builder()

    /**
     * @param awsAccountId The ID of the AWS account where you want to store the new theme. 
     */
    override fun awsAccountId(awsAccountId: String) {
      cdkBuilder.awsAccountId(awsAccountId)
    }

    /**
     * @param baseThemeId The ID of the theme that a custom theme will inherit from. 
     * All themes inherit from one of the starting themes defined by Amazon QuickSight. For a list
     * of the starting themes, use `ListThemes` or choose *Themes* from within an analysis.
     */
    override fun baseThemeId(baseThemeId: String) {
      cdkBuilder.baseThemeId(baseThemeId)
    }

    /**
     * @param configuration The theme configuration, which contains the theme display properties. 
     */
    override fun configuration(configuration: IResolvable) {
      cdkBuilder.configuration(configuration.let(IResolvable::unwrap))
    }

    /**
     * @param configuration The theme configuration, which contains the theme display properties. 
     */
    override fun configuration(configuration: CfnTheme.ThemeConfigurationProperty) {
      cdkBuilder.configuration(configuration.let(CfnTheme.ThemeConfigurationProperty::unwrap))
    }

    /**
     * @param configuration The theme configuration, which contains the theme display properties. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("28e946efa67b3c2de9714e9ff481bff3c072f73a5c865f8c2ed6e44691164ab6")
    override
        fun configuration(configuration: CfnTheme.ThemeConfigurationProperty.Builder.() -> Unit):
        Unit = configuration(CfnTheme.ThemeConfigurationProperty(configuration))

    /**
     * @param name A display name for the theme. 
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    /**
     * @param permissions A valid grouping of resource permissions to apply to the new theme.
     */
    override fun permissions(permissions: IResolvable) {
      cdkBuilder.permissions(permissions.let(IResolvable::unwrap))
    }

    /**
     * @param permissions A valid grouping of resource permissions to apply to the new theme.
     */
    override fun permissions(permissions: List<Any>) {
      cdkBuilder.permissions(permissions.map{CdkObjectWrappers.unwrap(it)})
    }

    /**
     * @param permissions A valid grouping of resource permissions to apply to the new theme.
     */
    override fun permissions(vararg permissions: Any): Unit = permissions(permissions.toList())

    /**
     * @param tags A map of the key-value pairs for the resource tag or tags that you want to add to
     * the resource.
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    /**
     * @param tags A map of the key-value pairs for the resource tag or tags that you want to add to
     * the resource.
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    /**
     * @param themeId An ID for the theme that you want to create. 
     * The theme ID is unique per AWS Region in each AWS account.
     */
    override fun themeId(themeId: String) {
      cdkBuilder.themeId(themeId)
    }

    /**
     * @param versionDescription A description of the first version of the theme that you're
     * creating.
     * Every time `UpdateTheme` is called, a new version is created. Each version of the theme has a
     * description of the version in the `VersionDescription` field.
     */
    override fun versionDescription(versionDescription: String) {
      cdkBuilder.versionDescription(versionDescription)
    }

    public fun build(): software.amazon.awscdk.services.quicksight.CfnThemeProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.quicksight.CfnThemeProps,
  ) : CdkObject(cdkObject), CfnThemeProps {
    /**
     * The ID of the AWS account where you want to store the new theme.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-quicksight-theme.html#cfn-quicksight-theme-awsaccountid)
     */
    override fun awsAccountId(): String = unwrap(this).getAwsAccountId()

    /**
     * The ID of the theme that a custom theme will inherit from.
     *
     * All themes inherit from one of the starting themes defined by Amazon QuickSight. For a list
     * of the starting themes, use `ListThemes` or choose *Themes* from within an analysis.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-quicksight-theme.html#cfn-quicksight-theme-basethemeid)
     */
    override fun baseThemeId(): String = unwrap(this).getBaseThemeId()

    /**
     * The theme configuration, which contains the theme display properties.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-quicksight-theme.html#cfn-quicksight-theme-configuration)
     */
    override fun configuration(): Any = unwrap(this).getConfiguration()

    /**
     * A display name for the theme.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-quicksight-theme.html#cfn-quicksight-theme-name)
     */
    override fun name(): String = unwrap(this).getName()

    /**
     * A valid grouping of resource permissions to apply to the new theme.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-quicksight-theme.html#cfn-quicksight-theme-permissions)
     */
    override fun permissions(): Any? = unwrap(this).getPermissions()

    /**
     * A map of the key-value pairs for the resource tag or tags that you want to add to the
     * resource.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-quicksight-theme.html#cfn-quicksight-theme-tags)
     */
    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

    /**
     * An ID for the theme that you want to create.
     *
     * The theme ID is unique per AWS Region in each AWS account.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-quicksight-theme.html#cfn-quicksight-theme-themeid)
     */
    override fun themeId(): String = unwrap(this).getThemeId()

    /**
     * A description of the first version of the theme that you're creating.
     *
     * Every time `UpdateTheme` is called, a new version is created. Each version of the theme has a
     * description of the version in the `VersionDescription` field.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-quicksight-theme.html#cfn-quicksight-theme-versiondescription)
     */
    override fun versionDescription(): String? = unwrap(this).getVersionDescription()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnThemeProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.quicksight.CfnThemeProps):
        CfnThemeProps = CdkObjectWrappers.wrap(cdkObject) as? CfnThemeProps ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnThemeProps):
        software.amazon.awscdk.services.quicksight.CfnThemeProps = (wrapped as CdkObject).cdkObject
        as software.amazon.awscdk.services.quicksight.CfnThemeProps
  }
}
