@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.quicksight

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.ITaggable
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * Creates a theme.
 *
 * A *theme* is set of configuration options for color and layout. Themes apply to analyses and
 * dashboards. For more information, see [Using Themes in Amazon
 * QuickSight](https://docs.aws.amazon.com/quicksight/latest/user/themes-in-quicksight.html) in the
 * *Amazon QuickSight User Guide* .
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.quicksight.*;
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
public open class CfnTheme(
  cdkObject: software.amazon.awscdk.services.quicksight.CfnTheme,
) : CfnResource(cdkObject),
    IInspectable,
    ITaggable {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnThemeProps,
  ) :
      this(software.amazon.awscdk.services.quicksight.CfnTheme(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id, props.let(CfnThemeProps.Companion::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnThemeProps.Builder.() -> Unit,
  ) : this(scope, id, CfnThemeProps(props)
  )

  /**
   * The Amazon Resource Name (ARN) of the theme.
   */
  public open fun attrArn(): String = unwrap(this).getAttrArn()

  /**
   * The time the theme was created.
   */
  public open fun attrCreatedTime(): String = unwrap(this).getAttrCreatedTime()

  /**
   * The time the theme was last updated.
   */
  public open fun attrLastUpdatedTime(): String = unwrap(this).getAttrLastUpdatedTime()

  /**
   * Theme type.
   */
  public open fun attrType(): String = unwrap(this).getAttrType()

  /**
   * A version of a theme.</p>.
   */
  public open fun attrVersion(): IResolvable = unwrap(this).getAttrVersion().let(IResolvable::wrap)

  /**
   *
   */
  public open fun attrVersionArn(): String = unwrap(this).getAttrVersionArn()

  /**
   *
   */
  public open fun attrVersionBaseThemeId(): String = unwrap(this).getAttrVersionBaseThemeId()

  /**
   *
   */
  public open fun attrVersionConfiguration(): IResolvable =
      unwrap(this).getAttrVersionConfiguration().let(IResolvable::wrap)

  /**
   *
   */
  public open fun attrVersionConfigurationDataColorPalette(): IResolvable =
      unwrap(this).getAttrVersionConfigurationDataColorPalette().let(IResolvable::wrap)

  /**
   *
   */
  public open fun attrVersionConfigurationSheet(): IResolvable =
      unwrap(this).getAttrVersionConfigurationSheet().let(IResolvable::wrap)

  /**
   *
   */
  public open fun attrVersionConfigurationTypography(): IResolvable =
      unwrap(this).getAttrVersionConfigurationTypography().let(IResolvable::wrap)

  /**
   *
   */
  public open fun attrVersionConfigurationUiColorPalette(): IResolvable =
      unwrap(this).getAttrVersionConfigurationUiColorPalette().let(IResolvable::wrap)

  /**
   *
   */
  public open fun attrVersionCreatedTime(): String = unwrap(this).getAttrVersionCreatedTime()

  /**
   *
   */
  public open fun attrVersionDescription(): String = unwrap(this).getAttrVersionDescription()

  /**
   *
   */
  public open fun attrVersionErrors(): IResolvable =
      unwrap(this).getAttrVersionErrors().let(IResolvable::wrap)

  /**
   *
   */
  public open fun attrVersionStatus(): String = unwrap(this).getAttrVersionStatus()

  /**
   *
   */
  public open fun attrVersionVersionNumber(): IResolvable =
      unwrap(this).getAttrVersionVersionNumber().let(IResolvable::wrap)

  /**
   * The ID of the AWS account where you want to store the new theme.
   */
  public open fun awsAccountId(): String = unwrap(this).getAwsAccountId()

  /**
   * The ID of the AWS account where you want to store the new theme.
   */
  public open fun awsAccountId(`value`: String) {
    unwrap(this).setAwsAccountId(`value`)
  }

  /**
   * The ID of the theme that a custom theme will inherit from.
   */
  public open fun baseThemeId(): String = unwrap(this).getBaseThemeId()

  /**
   * The ID of the theme that a custom theme will inherit from.
   */
  public open fun baseThemeId(`value`: String) {
    unwrap(this).setBaseThemeId(`value`)
  }

  /**
   * The theme configuration, which contains the theme display properties.
   */
  public open fun configuration(): Any = unwrap(this).getConfiguration()

  /**
   * The theme configuration, which contains the theme display properties.
   */
  public open fun configuration(`value`: IResolvable) {
    unwrap(this).setConfiguration(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   * The theme configuration, which contains the theme display properties.
   */
  public open fun configuration(`value`: ThemeConfigurationProperty) {
    unwrap(this).setConfiguration(`value`.let(ThemeConfigurationProperty.Companion::unwrap))
  }

  /**
   * The theme configuration, which contains the theme display properties.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("b295d489234fd2a3453e33223b7a1195bf8cd068ffaed1d714eeb0fd237dbdcd")
  public open fun configuration(`value`: ThemeConfigurationProperty.Builder.() -> Unit): Unit =
      configuration(ThemeConfigurationProperty(`value`))

  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector.Companion::unwrap))
  }

  /**
   * A display name for the theme.
   */
  public open fun name(): String = unwrap(this).getName()

  /**
   * A display name for the theme.
   */
  public open fun name(`value`: String) {
    unwrap(this).setName(`value`)
  }

  /**
   * A valid grouping of resource permissions to apply to the new theme.
   */
  public open fun permissions(): Any? = unwrap(this).getPermissions()

  /**
   * A valid grouping of resource permissions to apply to the new theme.
   */
  public open fun permissions(`value`: IResolvable) {
    unwrap(this).setPermissions(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   * A valid grouping of resource permissions to apply to the new theme.
   */
  public open fun permissions(`value`: List<Any>) {
    unwrap(this).setPermissions(`value`.map{CdkObjectWrappers.unwrap(it)})
  }

  /**
   * A valid grouping of resource permissions to apply to the new theme.
   */
  public open fun permissions(vararg `value`: Any): Unit = permissions(`value`.toList())

  /**
   * Tag Manager which manages the tags for this resource.
   */
  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  /**
   * A map of the key-value pairs for the resource tag or tags that you want to add to the resource.
   */
  public open fun tagsRaw(): List<CfnTag> = unwrap(this).getTagsRaw()?.map(CfnTag::wrap) ?:
      emptyList()

  /**
   * A map of the key-value pairs for the resource tag or tags that you want to add to the resource.
   */
  public open fun tagsRaw(`value`: List<CfnTag>) {
    unwrap(this).setTagsRaw(`value`.map(CfnTag.Companion::unwrap))
  }

  /**
   * A map of the key-value pairs for the resource tag or tags that you want to add to the resource.
   */
  public open fun tagsRaw(vararg `value`: CfnTag): Unit = tagsRaw(`value`.toList())

  /**
   * An ID for the theme that you want to create.
   */
  public open fun themeId(): String = unwrap(this).getThemeId()

  /**
   * An ID for the theme that you want to create.
   */
  public open fun themeId(`value`: String) {
    unwrap(this).setThemeId(`value`)
  }

  /**
   * A description of the first version of the theme that you're creating.
   */
  public open fun versionDescription(): String? = unwrap(this).getVersionDescription()

  /**
   * A description of the first version of the theme that you're creating.
   */
  public open fun versionDescription(`value`: String) {
    unwrap(this).setVersionDescription(`value`)
  }

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.quicksight.CfnTheme].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The ID of the AWS account where you want to store the new theme.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-quicksight-theme.html#cfn-quicksight-theme-awsaccountid)
     * @param awsAccountId The ID of the AWS account where you want to store the new theme. 
     */
    public fun awsAccountId(awsAccountId: String)

    /**
     * The ID of the theme that a custom theme will inherit from.
     *
     * All themes inherit from one of the starting themes defined by Amazon QuickSight. For a list
     * of the starting themes, use `ListThemes` or choose *Themes* from within an analysis.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-quicksight-theme.html#cfn-quicksight-theme-basethemeid)
     * @param baseThemeId The ID of the theme that a custom theme will inherit from. 
     */
    public fun baseThemeId(baseThemeId: String)

    /**
     * The theme configuration, which contains the theme display properties.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-quicksight-theme.html#cfn-quicksight-theme-configuration)
     * @param configuration The theme configuration, which contains the theme display properties. 
     */
    public fun configuration(configuration: IResolvable)

    /**
     * The theme configuration, which contains the theme display properties.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-quicksight-theme.html#cfn-quicksight-theme-configuration)
     * @param configuration The theme configuration, which contains the theme display properties. 
     */
    public fun configuration(configuration: ThemeConfigurationProperty)

    /**
     * The theme configuration, which contains the theme display properties.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-quicksight-theme.html#cfn-quicksight-theme-configuration)
     * @param configuration The theme configuration, which contains the theme display properties. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("53c0bc5706b85e02b209e15b4d625be3e2390a0c0e11e333d74887b55fa469ba")
    public fun configuration(configuration: ThemeConfigurationProperty.Builder.() -> Unit)

    /**
     * A display name for the theme.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-quicksight-theme.html#cfn-quicksight-theme-name)
     * @param name A display name for the theme. 
     */
    public fun name(name: String)

    /**
     * A valid grouping of resource permissions to apply to the new theme.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-quicksight-theme.html#cfn-quicksight-theme-permissions)
     * @param permissions A valid grouping of resource permissions to apply to the new theme. 
     */
    public fun permissions(permissions: IResolvable)

    /**
     * A valid grouping of resource permissions to apply to the new theme.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-quicksight-theme.html#cfn-quicksight-theme-permissions)
     * @param permissions A valid grouping of resource permissions to apply to the new theme. 
     */
    public fun permissions(permissions: List<Any>)

    /**
     * A valid grouping of resource permissions to apply to the new theme.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-quicksight-theme.html#cfn-quicksight-theme-permissions)
     * @param permissions A valid grouping of resource permissions to apply to the new theme. 
     */
    public fun permissions(vararg permissions: Any)

    /**
     * A map of the key-value pairs for the resource tag or tags that you want to add to the
     * resource.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-quicksight-theme.html#cfn-quicksight-theme-tags)
     * @param tags A map of the key-value pairs for the resource tag or tags that you want to add to
     * the resource. 
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * A map of the key-value pairs for the resource tag or tags that you want to add to the
     * resource.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-quicksight-theme.html#cfn-quicksight-theme-tags)
     * @param tags A map of the key-value pairs for the resource tag or tags that you want to add to
     * the resource. 
     */
    public fun tags(vararg tags: CfnTag)

    /**
     * An ID for the theme that you want to create.
     *
     * The theme ID is unique per AWS Region in each AWS account.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-quicksight-theme.html#cfn-quicksight-theme-themeid)
     * @param themeId An ID for the theme that you want to create. 
     */
    public fun themeId(themeId: String)

    /**
     * A description of the first version of the theme that you're creating.
     *
     * Every time `UpdateTheme` is called, a new version is created. Each version of the theme has a
     * description of the version in the `VersionDescription` field.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-quicksight-theme.html#cfn-quicksight-theme-versiondescription)
     * @param versionDescription A description of the first version of the theme that you're
     * creating. 
     */
    public fun versionDescription(versionDescription: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.quicksight.CfnTheme.Builder =
        software.amazon.awscdk.services.quicksight.CfnTheme.Builder.create(scope, id)

    /**
     * The ID of the AWS account where you want to store the new theme.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-quicksight-theme.html#cfn-quicksight-theme-awsaccountid)
     * @param awsAccountId The ID of the AWS account where you want to store the new theme. 
     */
    override fun awsAccountId(awsAccountId: String) {
      cdkBuilder.awsAccountId(awsAccountId)
    }

    /**
     * The ID of the theme that a custom theme will inherit from.
     *
     * All themes inherit from one of the starting themes defined by Amazon QuickSight. For a list
     * of the starting themes, use `ListThemes` or choose *Themes* from within an analysis.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-quicksight-theme.html#cfn-quicksight-theme-basethemeid)
     * @param baseThemeId The ID of the theme that a custom theme will inherit from. 
     */
    override fun baseThemeId(baseThemeId: String) {
      cdkBuilder.baseThemeId(baseThemeId)
    }

    /**
     * The theme configuration, which contains the theme display properties.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-quicksight-theme.html#cfn-quicksight-theme-configuration)
     * @param configuration The theme configuration, which contains the theme display properties. 
     */
    override fun configuration(configuration: IResolvable) {
      cdkBuilder.configuration(configuration.let(IResolvable.Companion::unwrap))
    }

    /**
     * The theme configuration, which contains the theme display properties.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-quicksight-theme.html#cfn-quicksight-theme-configuration)
     * @param configuration The theme configuration, which contains the theme display properties. 
     */
    override fun configuration(configuration: ThemeConfigurationProperty) {
      cdkBuilder.configuration(configuration.let(ThemeConfigurationProperty.Companion::unwrap))
    }

    /**
     * The theme configuration, which contains the theme display properties.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-quicksight-theme.html#cfn-quicksight-theme-configuration)
     * @param configuration The theme configuration, which contains the theme display properties. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("53c0bc5706b85e02b209e15b4d625be3e2390a0c0e11e333d74887b55fa469ba")
    override fun configuration(configuration: ThemeConfigurationProperty.Builder.() -> Unit): Unit =
        configuration(ThemeConfigurationProperty(configuration))

    /**
     * A display name for the theme.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-quicksight-theme.html#cfn-quicksight-theme-name)
     * @param name A display name for the theme. 
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    /**
     * A valid grouping of resource permissions to apply to the new theme.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-quicksight-theme.html#cfn-quicksight-theme-permissions)
     * @param permissions A valid grouping of resource permissions to apply to the new theme. 
     */
    override fun permissions(permissions: IResolvable) {
      cdkBuilder.permissions(permissions.let(IResolvable.Companion::unwrap))
    }

    /**
     * A valid grouping of resource permissions to apply to the new theme.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-quicksight-theme.html#cfn-quicksight-theme-permissions)
     * @param permissions A valid grouping of resource permissions to apply to the new theme. 
     */
    override fun permissions(permissions: List<Any>) {
      cdkBuilder.permissions(permissions.map{CdkObjectWrappers.unwrap(it)})
    }

    /**
     * A valid grouping of resource permissions to apply to the new theme.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-quicksight-theme.html#cfn-quicksight-theme-permissions)
     * @param permissions A valid grouping of resource permissions to apply to the new theme. 
     */
    override fun permissions(vararg permissions: Any): Unit = permissions(permissions.toList())

    /**
     * A map of the key-value pairs for the resource tag or tags that you want to add to the
     * resource.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-quicksight-theme.html#cfn-quicksight-theme-tags)
     * @param tags A map of the key-value pairs for the resource tag or tags that you want to add to
     * the resource. 
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag.Companion::unwrap))
    }

    /**
     * A map of the key-value pairs for the resource tag or tags that you want to add to the
     * resource.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-quicksight-theme.html#cfn-quicksight-theme-tags)
     * @param tags A map of the key-value pairs for the resource tag or tags that you want to add to
     * the resource. 
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    /**
     * An ID for the theme that you want to create.
     *
     * The theme ID is unique per AWS Region in each AWS account.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-quicksight-theme.html#cfn-quicksight-theme-themeid)
     * @param themeId An ID for the theme that you want to create. 
     */
    override fun themeId(themeId: String) {
      cdkBuilder.themeId(themeId)
    }

    /**
     * A description of the first version of the theme that you're creating.
     *
     * Every time `UpdateTheme` is called, a new version is created. Each version of the theme has a
     * description of the version in the `VersionDescription` field.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-quicksight-theme.html#cfn-quicksight-theme-versiondescription)
     * @param versionDescription A description of the first version of the theme that you're
     * creating. 
     */
    override fun versionDescription(versionDescription: String) {
      cdkBuilder.versionDescription(versionDescription)
    }

    public fun build(): software.amazon.awscdk.services.quicksight.CfnTheme = cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.quicksight.CfnTheme.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnTheme {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnTheme(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.quicksight.CfnTheme): CfnTheme =
        CfnTheme(cdkObject)

    internal fun unwrap(wrapped: CfnTheme): software.amazon.awscdk.services.quicksight.CfnTheme =
        wrapped.cdkObject as software.amazon.awscdk.services.quicksight.CfnTheme
  }

  /**
   * The display options for tile borders for visuals.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.quicksight.*;
   * BorderStyleProperty borderStyleProperty = BorderStyleProperty.builder()
   * .show(false)
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-theme-borderstyle.html)
   */
  public interface BorderStyleProperty {
    /**
     * The option to enable display of borders for visuals.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-theme-borderstyle.html#cfn-quicksight-theme-borderstyle-show)
     */
    public fun show(): Any? = unwrap(this).getShow()

    /**
     * A builder for [BorderStyleProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param show The option to enable display of borders for visuals.
       */
      public fun show(show: Boolean)

      /**
       * @param show The option to enable display of borders for visuals.
       */
      public fun show(show: IResolvable)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.quicksight.CfnTheme.BorderStyleProperty.Builder =
          software.amazon.awscdk.services.quicksight.CfnTheme.BorderStyleProperty.builder()

      /**
       * @param show The option to enable display of borders for visuals.
       */
      override fun show(show: Boolean) {
        cdkBuilder.show(show)
      }

      /**
       * @param show The option to enable display of borders for visuals.
       */
      override fun show(show: IResolvable) {
        cdkBuilder.show(show.let(IResolvable.Companion::unwrap))
      }

      public fun build(): software.amazon.awscdk.services.quicksight.CfnTheme.BorderStyleProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.quicksight.CfnTheme.BorderStyleProperty,
    ) : CdkObject(cdkObject),
        BorderStyleProperty {
      /**
       * The option to enable display of borders for visuals.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-theme-borderstyle.html#cfn-quicksight-theme-borderstyle-show)
       */
      override fun show(): Any? = unwrap(this).getShow()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): BorderStyleProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.quicksight.CfnTheme.BorderStyleProperty):
          BorderStyleProperty = CdkObjectWrappers.wrap(cdkObject) as? BorderStyleProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: BorderStyleProperty):
          software.amazon.awscdk.services.quicksight.CfnTheme.BorderStyleProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.quicksight.CfnTheme.BorderStyleProperty
    }
  }

  /**
   * The theme colors that are used for data colors in charts.
   *
   * The colors description is a hexadecimal color code that consists of six alphanumerical
   * characters, prefixed with `#` , for example #37BFF5.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.quicksight.*;
   * DataColorPaletteProperty dataColorPaletteProperty = DataColorPaletteProperty.builder()
   * .colors(List.of("colors"))
   * .emptyFillColor("emptyFillColor")
   * .minMaxGradient(List.of("minMaxGradient"))
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-theme-datacolorpalette.html)
   */
  public interface DataColorPaletteProperty {
    /**
     * The hexadecimal codes for the colors.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-theme-datacolorpalette.html#cfn-quicksight-theme-datacolorpalette-colors)
     */
    public fun colors(): List<String> = unwrap(this).getColors() ?: emptyList()

    /**
     * The hexadecimal code of a color that applies to charts where a lack of data is highlighted.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-theme-datacolorpalette.html#cfn-quicksight-theme-datacolorpalette-emptyfillcolor)
     */
    public fun emptyFillColor(): String? = unwrap(this).getEmptyFillColor()

    /**
     * The minimum and maximum hexadecimal codes that describe a color gradient.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-theme-datacolorpalette.html#cfn-quicksight-theme-datacolorpalette-minmaxgradient)
     */
    public fun minMaxGradient(): List<String> = unwrap(this).getMinMaxGradient() ?: emptyList()

    /**
     * A builder for [DataColorPaletteProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param colors The hexadecimal codes for the colors.
       */
      public fun colors(colors: List<String>)

      /**
       * @param colors The hexadecimal codes for the colors.
       */
      public fun colors(vararg colors: String)

      /**
       * @param emptyFillColor The hexadecimal code of a color that applies to charts where a lack
       * of data is highlighted.
       */
      public fun emptyFillColor(emptyFillColor: String)

      /**
       * @param minMaxGradient The minimum and maximum hexadecimal codes that describe a color
       * gradient.
       */
      public fun minMaxGradient(minMaxGradient: List<String>)

      /**
       * @param minMaxGradient The minimum and maximum hexadecimal codes that describe a color
       * gradient.
       */
      public fun minMaxGradient(vararg minMaxGradient: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.quicksight.CfnTheme.DataColorPaletteProperty.Builder =
          software.amazon.awscdk.services.quicksight.CfnTheme.DataColorPaletteProperty.builder()

      /**
       * @param colors The hexadecimal codes for the colors.
       */
      override fun colors(colors: List<String>) {
        cdkBuilder.colors(colors)
      }

      /**
       * @param colors The hexadecimal codes for the colors.
       */
      override fun colors(vararg colors: String): Unit = colors(colors.toList())

      /**
       * @param emptyFillColor The hexadecimal code of a color that applies to charts where a lack
       * of data is highlighted.
       */
      override fun emptyFillColor(emptyFillColor: String) {
        cdkBuilder.emptyFillColor(emptyFillColor)
      }

      /**
       * @param minMaxGradient The minimum and maximum hexadecimal codes that describe a color
       * gradient.
       */
      override fun minMaxGradient(minMaxGradient: List<String>) {
        cdkBuilder.minMaxGradient(minMaxGradient)
      }

      /**
       * @param minMaxGradient The minimum and maximum hexadecimal codes that describe a color
       * gradient.
       */
      override fun minMaxGradient(vararg minMaxGradient: String): Unit =
          minMaxGradient(minMaxGradient.toList())

      public fun build():
          software.amazon.awscdk.services.quicksight.CfnTheme.DataColorPaletteProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.quicksight.CfnTheme.DataColorPaletteProperty,
    ) : CdkObject(cdkObject),
        DataColorPaletteProperty {
      /**
       * The hexadecimal codes for the colors.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-theme-datacolorpalette.html#cfn-quicksight-theme-datacolorpalette-colors)
       */
      override fun colors(): List<String> = unwrap(this).getColors() ?: emptyList()

      /**
       * The hexadecimal code of a color that applies to charts where a lack of data is highlighted.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-theme-datacolorpalette.html#cfn-quicksight-theme-datacolorpalette-emptyfillcolor)
       */
      override fun emptyFillColor(): String? = unwrap(this).getEmptyFillColor()

      /**
       * The minimum and maximum hexadecimal codes that describe a color gradient.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-theme-datacolorpalette.html#cfn-quicksight-theme-datacolorpalette-minmaxgradient)
       */
      override fun minMaxGradient(): List<String> = unwrap(this).getMinMaxGradient() ?: emptyList()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): DataColorPaletteProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.quicksight.CfnTheme.DataColorPaletteProperty):
          DataColorPaletteProperty = CdkObjectWrappers.wrap(cdkObject) as? DataColorPaletteProperty
          ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: DataColorPaletteProperty):
          software.amazon.awscdk.services.quicksight.CfnTheme.DataColorPaletteProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.quicksight.CfnTheme.DataColorPaletteProperty
    }
  }

  /**
   * Determines the font settings.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.quicksight.*;
   * FontProperty fontProperty = FontProperty.builder()
   * .fontFamily("fontFamily")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-theme-font.html)
   */
  public interface FontProperty {
    /**
     * Determines the font family settings.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-theme-font.html#cfn-quicksight-theme-font-fontfamily)
     */
    public fun fontFamily(): String? = unwrap(this).getFontFamily()

    /**
     * A builder for [FontProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param fontFamily Determines the font family settings.
       */
      public fun fontFamily(fontFamily: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.quicksight.CfnTheme.FontProperty.Builder =
          software.amazon.awscdk.services.quicksight.CfnTheme.FontProperty.builder()

      /**
       * @param fontFamily Determines the font family settings.
       */
      override fun fontFamily(fontFamily: String) {
        cdkBuilder.fontFamily(fontFamily)
      }

      public fun build(): software.amazon.awscdk.services.quicksight.CfnTheme.FontProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.quicksight.CfnTheme.FontProperty,
    ) : CdkObject(cdkObject),
        FontProperty {
      /**
       * Determines the font family settings.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-theme-font.html#cfn-quicksight-theme-font-fontfamily)
       */
      override fun fontFamily(): String? = unwrap(this).getFontFamily()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): FontProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.quicksight.CfnTheme.FontProperty):
          FontProperty = CdkObjectWrappers.wrap(cdkObject) as? FontProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: FontProperty):
          software.amazon.awscdk.services.quicksight.CfnTheme.FontProperty = (wrapped as
          CdkObject).cdkObject as software.amazon.awscdk.services.quicksight.CfnTheme.FontProperty
    }
  }

  /**
   * The display options for gutter spacing between tiles on a sheet.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.quicksight.*;
   * GutterStyleProperty gutterStyleProperty = GutterStyleProperty.builder()
   * .show(false)
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-theme-gutterstyle.html)
   */
  public interface GutterStyleProperty {
    /**
     * This Boolean value controls whether to display a gutter space between sheet tiles.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-theme-gutterstyle.html#cfn-quicksight-theme-gutterstyle-show)
     */
    public fun show(): Any? = unwrap(this).getShow()

    /**
     * A builder for [GutterStyleProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param show This Boolean value controls whether to display a gutter space between sheet
       * tiles.
       */
      public fun show(show: Boolean)

      /**
       * @param show This Boolean value controls whether to display a gutter space between sheet
       * tiles.
       */
      public fun show(show: IResolvable)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.quicksight.CfnTheme.GutterStyleProperty.Builder =
          software.amazon.awscdk.services.quicksight.CfnTheme.GutterStyleProperty.builder()

      /**
       * @param show This Boolean value controls whether to display a gutter space between sheet
       * tiles.
       */
      override fun show(show: Boolean) {
        cdkBuilder.show(show)
      }

      /**
       * @param show This Boolean value controls whether to display a gutter space between sheet
       * tiles.
       */
      override fun show(show: IResolvable) {
        cdkBuilder.show(show.let(IResolvable.Companion::unwrap))
      }

      public fun build(): software.amazon.awscdk.services.quicksight.CfnTheme.GutterStyleProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.quicksight.CfnTheme.GutterStyleProperty,
    ) : CdkObject(cdkObject),
        GutterStyleProperty {
      /**
       * This Boolean value controls whether to display a gutter space between sheet tiles.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-theme-gutterstyle.html#cfn-quicksight-theme-gutterstyle-show)
       */
      override fun show(): Any? = unwrap(this).getShow()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): GutterStyleProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.quicksight.CfnTheme.GutterStyleProperty):
          GutterStyleProperty = CdkObjectWrappers.wrap(cdkObject) as? GutterStyleProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: GutterStyleProperty):
          software.amazon.awscdk.services.quicksight.CfnTheme.GutterStyleProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.quicksight.CfnTheme.GutterStyleProperty
    }
  }

  /**
   * The display options for margins around the outside edge of sheets.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.quicksight.*;
   * MarginStyleProperty marginStyleProperty = MarginStyleProperty.builder()
   * .show(false)
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-theme-marginstyle.html)
   */
  public interface MarginStyleProperty {
    /**
     * This Boolean value controls whether to display sheet margins.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-theme-marginstyle.html#cfn-quicksight-theme-marginstyle-show)
     */
    public fun show(): Any? = unwrap(this).getShow()

    /**
     * A builder for [MarginStyleProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param show This Boolean value controls whether to display sheet margins.
       */
      public fun show(show: Boolean)

      /**
       * @param show This Boolean value controls whether to display sheet margins.
       */
      public fun show(show: IResolvable)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.quicksight.CfnTheme.MarginStyleProperty.Builder =
          software.amazon.awscdk.services.quicksight.CfnTheme.MarginStyleProperty.builder()

      /**
       * @param show This Boolean value controls whether to display sheet margins.
       */
      override fun show(show: Boolean) {
        cdkBuilder.show(show)
      }

      /**
       * @param show This Boolean value controls whether to display sheet margins.
       */
      override fun show(show: IResolvable) {
        cdkBuilder.show(show.let(IResolvable.Companion::unwrap))
      }

      public fun build(): software.amazon.awscdk.services.quicksight.CfnTheme.MarginStyleProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.quicksight.CfnTheme.MarginStyleProperty,
    ) : CdkObject(cdkObject),
        MarginStyleProperty {
      /**
       * This Boolean value controls whether to display sheet margins.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-theme-marginstyle.html#cfn-quicksight-theme-marginstyle-show)
       */
      override fun show(): Any? = unwrap(this).getShow()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): MarginStyleProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.quicksight.CfnTheme.MarginStyleProperty):
          MarginStyleProperty = CdkObjectWrappers.wrap(cdkObject) as? MarginStyleProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: MarginStyleProperty):
          software.amazon.awscdk.services.quicksight.CfnTheme.MarginStyleProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.quicksight.CfnTheme.MarginStyleProperty
    }
  }

  /**
   * Permission for the resource.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.quicksight.*;
   * ResourcePermissionProperty resourcePermissionProperty = ResourcePermissionProperty.builder()
   * .actions(List.of("actions"))
   * .principal("principal")
   * // the properties below are optional
   * .resource("resource")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-theme-resourcepermission.html)
   */
  public interface ResourcePermissionProperty {
    /**
     * The IAM action to grant or revoke permissions on.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-theme-resourcepermission.html#cfn-quicksight-theme-resourcepermission-actions)
     */
    public fun actions(): List<String>

    /**
     * The Amazon Resource Name (ARN) of the principal. This can be one of the following:.
     *
     * * The ARN of an Amazon QuickSight user or group associated with a data source or dataset.
     * (This is common.)
     * * The ARN of an Amazon QuickSight user, group, or namespace associated with an analysis,
     * dashboard, template, or theme. (This is common.)
     * * The ARN of an AWS account root: This is an IAM ARN rather than a Amazon QuickSight ARN. Use
     * this option only to share resources (templates) across AWS accounts . (This is less common.)
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-theme-resourcepermission.html#cfn-quicksight-theme-resourcepermission-principal)
     */
    public fun principal(): String

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-theme-resourcepermission.html#cfn-quicksight-theme-resourcepermission-resource)
     */
    public fun resource(): String? = unwrap(this).getResource()

    /**
     * A builder for [ResourcePermissionProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param actions The IAM action to grant or revoke permissions on. 
       */
      public fun actions(actions: List<String>)

      /**
       * @param actions The IAM action to grant or revoke permissions on. 
       */
      public fun actions(vararg actions: String)

      /**
       * @param principal The Amazon Resource Name (ARN) of the principal. This can be one of the
       * following:. 
       * * The ARN of an Amazon QuickSight user or group associated with a data source or dataset.
       * (This is common.)
       * * The ARN of an Amazon QuickSight user, group, or namespace associated with an analysis,
       * dashboard, template, or theme. (This is common.)
       * * The ARN of an AWS account root: This is an IAM ARN rather than a Amazon QuickSight ARN.
       * Use this option only to share resources (templates) across AWS accounts . (This is less
       * common.)
       */
      public fun principal(principal: String)

      /**
       * @param resource the value to be set.
       */
      public fun resource(resource: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.quicksight.CfnTheme.ResourcePermissionProperty.Builder =
          software.amazon.awscdk.services.quicksight.CfnTheme.ResourcePermissionProperty.builder()

      /**
       * @param actions The IAM action to grant or revoke permissions on. 
       */
      override fun actions(actions: List<String>) {
        cdkBuilder.actions(actions)
      }

      /**
       * @param actions The IAM action to grant or revoke permissions on. 
       */
      override fun actions(vararg actions: String): Unit = actions(actions.toList())

      /**
       * @param principal The Amazon Resource Name (ARN) of the principal. This can be one of the
       * following:. 
       * * The ARN of an Amazon QuickSight user or group associated with a data source or dataset.
       * (This is common.)
       * * The ARN of an Amazon QuickSight user, group, or namespace associated with an analysis,
       * dashboard, template, or theme. (This is common.)
       * * The ARN of an AWS account root: This is an IAM ARN rather than a Amazon QuickSight ARN.
       * Use this option only to share resources (templates) across AWS accounts . (This is less
       * common.)
       */
      override fun principal(principal: String) {
        cdkBuilder.principal(principal)
      }

      /**
       * @param resource the value to be set.
       */
      override fun resource(resource: String) {
        cdkBuilder.resource(resource)
      }

      public fun build():
          software.amazon.awscdk.services.quicksight.CfnTheme.ResourcePermissionProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.quicksight.CfnTheme.ResourcePermissionProperty,
    ) : CdkObject(cdkObject),
        ResourcePermissionProperty {
      /**
       * The IAM action to grant or revoke permissions on.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-theme-resourcepermission.html#cfn-quicksight-theme-resourcepermission-actions)
       */
      override fun actions(): List<String> = unwrap(this).getActions()

      /**
       * The Amazon Resource Name (ARN) of the principal. This can be one of the following:.
       *
       * * The ARN of an Amazon QuickSight user or group associated with a data source or dataset.
       * (This is common.)
       * * The ARN of an Amazon QuickSight user, group, or namespace associated with an analysis,
       * dashboard, template, or theme. (This is common.)
       * * The ARN of an AWS account root: This is an IAM ARN rather than a Amazon QuickSight ARN.
       * Use this option only to share resources (templates) across AWS accounts . (This is less
       * common.)
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-theme-resourcepermission.html#cfn-quicksight-theme-resourcepermission-principal)
       */
      override fun principal(): String = unwrap(this).getPrincipal()

      /**
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-theme-resourcepermission.html#cfn-quicksight-theme-resourcepermission-resource)
       */
      override fun resource(): String? = unwrap(this).getResource()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): ResourcePermissionProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.quicksight.CfnTheme.ResourcePermissionProperty):
          ResourcePermissionProperty = CdkObjectWrappers.wrap(cdkObject) as?
          ResourcePermissionProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: ResourcePermissionProperty):
          software.amazon.awscdk.services.quicksight.CfnTheme.ResourcePermissionProperty = (wrapped
          as CdkObject).cdkObject as
          software.amazon.awscdk.services.quicksight.CfnTheme.ResourcePermissionProperty
    }
  }

  /**
   * The theme display options for sheets.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.quicksight.*;
   * SheetStyleProperty sheetStyleProperty = SheetStyleProperty.builder()
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
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-theme-sheetstyle.html)
   */
  public interface SheetStyleProperty {
    /**
     * The display options for tiles.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-theme-sheetstyle.html#cfn-quicksight-theme-sheetstyle-tile)
     */
    public fun tile(): Any? = unwrap(this).getTile()

    /**
     * The layout options for tiles.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-theme-sheetstyle.html#cfn-quicksight-theme-sheetstyle-tilelayout)
     */
    public fun tileLayout(): Any? = unwrap(this).getTileLayout()

    /**
     * A builder for [SheetStyleProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param tile The display options for tiles.
       */
      public fun tile(tile: IResolvable)

      /**
       * @param tile The display options for tiles.
       */
      public fun tile(tile: TileStyleProperty)

      /**
       * @param tile The display options for tiles.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("a4d426add8180655d26cfbcd494288c4bc2d1c2ec4a5a21d91f12ac41e65e236")
      public fun tile(tile: TileStyleProperty.Builder.() -> Unit)

      /**
       * @param tileLayout The layout options for tiles.
       */
      public fun tileLayout(tileLayout: IResolvable)

      /**
       * @param tileLayout The layout options for tiles.
       */
      public fun tileLayout(tileLayout: TileLayoutStyleProperty)

      /**
       * @param tileLayout The layout options for tiles.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("24ca86d677971db4f367b6c3b5da1bee1c9f5b15d0292fd98646eac9f0d53604")
      public fun tileLayout(tileLayout: TileLayoutStyleProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.quicksight.CfnTheme.SheetStyleProperty.Builder =
          software.amazon.awscdk.services.quicksight.CfnTheme.SheetStyleProperty.builder()

      /**
       * @param tile The display options for tiles.
       */
      override fun tile(tile: IResolvable) {
        cdkBuilder.tile(tile.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param tile The display options for tiles.
       */
      override fun tile(tile: TileStyleProperty) {
        cdkBuilder.tile(tile.let(TileStyleProperty.Companion::unwrap))
      }

      /**
       * @param tile The display options for tiles.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("a4d426add8180655d26cfbcd494288c4bc2d1c2ec4a5a21d91f12ac41e65e236")
      override fun tile(tile: TileStyleProperty.Builder.() -> Unit): Unit =
          tile(TileStyleProperty(tile))

      /**
       * @param tileLayout The layout options for tiles.
       */
      override fun tileLayout(tileLayout: IResolvable) {
        cdkBuilder.tileLayout(tileLayout.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param tileLayout The layout options for tiles.
       */
      override fun tileLayout(tileLayout: TileLayoutStyleProperty) {
        cdkBuilder.tileLayout(tileLayout.let(TileLayoutStyleProperty.Companion::unwrap))
      }

      /**
       * @param tileLayout The layout options for tiles.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("24ca86d677971db4f367b6c3b5da1bee1c9f5b15d0292fd98646eac9f0d53604")
      override fun tileLayout(tileLayout: TileLayoutStyleProperty.Builder.() -> Unit): Unit =
          tileLayout(TileLayoutStyleProperty(tileLayout))

      public fun build(): software.amazon.awscdk.services.quicksight.CfnTheme.SheetStyleProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.quicksight.CfnTheme.SheetStyleProperty,
    ) : CdkObject(cdkObject),
        SheetStyleProperty {
      /**
       * The display options for tiles.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-theme-sheetstyle.html#cfn-quicksight-theme-sheetstyle-tile)
       */
      override fun tile(): Any? = unwrap(this).getTile()

      /**
       * The layout options for tiles.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-theme-sheetstyle.html#cfn-quicksight-theme-sheetstyle-tilelayout)
       */
      override fun tileLayout(): Any? = unwrap(this).getTileLayout()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): SheetStyleProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.quicksight.CfnTheme.SheetStyleProperty):
          SheetStyleProperty = CdkObjectWrappers.wrap(cdkObject) as? SheetStyleProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: SheetStyleProperty):
          software.amazon.awscdk.services.quicksight.CfnTheme.SheetStyleProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.quicksight.CfnTheme.SheetStyleProperty
    }
  }

  /**
   * The theme configuration.
   *
   * This configuration contains all of the display properties for a theme.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.quicksight.*;
   * ThemeConfigurationProperty themeConfigurationProperty = ThemeConfigurationProperty.builder()
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
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-theme-themeconfiguration.html)
   */
  public interface ThemeConfigurationProperty {
    /**
     * Color properties that apply to chart data colors.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-theme-themeconfiguration.html#cfn-quicksight-theme-themeconfiguration-datacolorpalette)
     */
    public fun dataColorPalette(): Any? = unwrap(this).getDataColorPalette()

    /**
     * Display options related to sheets.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-theme-themeconfiguration.html#cfn-quicksight-theme-themeconfiguration-sheet)
     */
    public fun sheet(): Any? = unwrap(this).getSheet()

    /**
     * Determines the typography options.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-theme-themeconfiguration.html#cfn-quicksight-theme-themeconfiguration-typography)
     */
    public fun typography(): Any? = unwrap(this).getTypography()

    /**
     * Color properties that apply to the UI and to charts, excluding the colors that apply to data.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-theme-themeconfiguration.html#cfn-quicksight-theme-themeconfiguration-uicolorpalette)
     */
    public fun uiColorPalette(): Any? = unwrap(this).getUiColorPalette()

    /**
     * A builder for [ThemeConfigurationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param dataColorPalette Color properties that apply to chart data colors.
       */
      public fun dataColorPalette(dataColorPalette: IResolvable)

      /**
       * @param dataColorPalette Color properties that apply to chart data colors.
       */
      public fun dataColorPalette(dataColorPalette: DataColorPaletteProperty)

      /**
       * @param dataColorPalette Color properties that apply to chart data colors.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("a03c2e6b283ebceb911757e6e3791760b572f7a26486a08eab311844b39884ff")
      public fun dataColorPalette(dataColorPalette: DataColorPaletteProperty.Builder.() -> Unit)

      /**
       * @param sheet Display options related to sheets.
       */
      public fun sheet(sheet: IResolvable)

      /**
       * @param sheet Display options related to sheets.
       */
      public fun sheet(sheet: SheetStyleProperty)

      /**
       * @param sheet Display options related to sheets.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("e24b9dbc0782235525b77a7c2c5435e8d0caf9e67687dbf50babeab803ea9422")
      public fun sheet(sheet: SheetStyleProperty.Builder.() -> Unit)

      /**
       * @param typography Determines the typography options.
       */
      public fun typography(typography: IResolvable)

      /**
       * @param typography Determines the typography options.
       */
      public fun typography(typography: TypographyProperty)

      /**
       * @param typography Determines the typography options.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("2d3fa9b0d5a5a433eb0dd0028cb9f5669c133201c3eb4ef5fcd2d22d9446447d")
      public fun typography(typography: TypographyProperty.Builder.() -> Unit)

      /**
       * @param uiColorPalette Color properties that apply to the UI and to charts, excluding the
       * colors that apply to data.
       */
      public fun uiColorPalette(uiColorPalette: IResolvable)

      /**
       * @param uiColorPalette Color properties that apply to the UI and to charts, excluding the
       * colors that apply to data.
       */
      public fun uiColorPalette(uiColorPalette: UIColorPaletteProperty)

      /**
       * @param uiColorPalette Color properties that apply to the UI and to charts, excluding the
       * colors that apply to data.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("68d5d9bafc6026bd91fb21857236d4b5790fcb02ce11a16be45b02cb65e9c18a")
      public fun uiColorPalette(uiColorPalette: UIColorPaletteProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.quicksight.CfnTheme.ThemeConfigurationProperty.Builder =
          software.amazon.awscdk.services.quicksight.CfnTheme.ThemeConfigurationProperty.builder()

      /**
       * @param dataColorPalette Color properties that apply to chart data colors.
       */
      override fun dataColorPalette(dataColorPalette: IResolvable) {
        cdkBuilder.dataColorPalette(dataColorPalette.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param dataColorPalette Color properties that apply to chart data colors.
       */
      override fun dataColorPalette(dataColorPalette: DataColorPaletteProperty) {
        cdkBuilder.dataColorPalette(dataColorPalette.let(DataColorPaletteProperty.Companion::unwrap))
      }

      /**
       * @param dataColorPalette Color properties that apply to chart data colors.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("a03c2e6b283ebceb911757e6e3791760b572f7a26486a08eab311844b39884ff")
      override fun dataColorPalette(dataColorPalette: DataColorPaletteProperty.Builder.() -> Unit):
          Unit = dataColorPalette(DataColorPaletteProperty(dataColorPalette))

      /**
       * @param sheet Display options related to sheets.
       */
      override fun sheet(sheet: IResolvable) {
        cdkBuilder.sheet(sheet.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param sheet Display options related to sheets.
       */
      override fun sheet(sheet: SheetStyleProperty) {
        cdkBuilder.sheet(sheet.let(SheetStyleProperty.Companion::unwrap))
      }

      /**
       * @param sheet Display options related to sheets.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("e24b9dbc0782235525b77a7c2c5435e8d0caf9e67687dbf50babeab803ea9422")
      override fun sheet(sheet: SheetStyleProperty.Builder.() -> Unit): Unit =
          sheet(SheetStyleProperty(sheet))

      /**
       * @param typography Determines the typography options.
       */
      override fun typography(typography: IResolvable) {
        cdkBuilder.typography(typography.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param typography Determines the typography options.
       */
      override fun typography(typography: TypographyProperty) {
        cdkBuilder.typography(typography.let(TypographyProperty.Companion::unwrap))
      }

      /**
       * @param typography Determines the typography options.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("2d3fa9b0d5a5a433eb0dd0028cb9f5669c133201c3eb4ef5fcd2d22d9446447d")
      override fun typography(typography: TypographyProperty.Builder.() -> Unit): Unit =
          typography(TypographyProperty(typography))

      /**
       * @param uiColorPalette Color properties that apply to the UI and to charts, excluding the
       * colors that apply to data.
       */
      override fun uiColorPalette(uiColorPalette: IResolvable) {
        cdkBuilder.uiColorPalette(uiColorPalette.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param uiColorPalette Color properties that apply to the UI and to charts, excluding the
       * colors that apply to data.
       */
      override fun uiColorPalette(uiColorPalette: UIColorPaletteProperty) {
        cdkBuilder.uiColorPalette(uiColorPalette.let(UIColorPaletteProperty.Companion::unwrap))
      }

      /**
       * @param uiColorPalette Color properties that apply to the UI and to charts, excluding the
       * colors that apply to data.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("68d5d9bafc6026bd91fb21857236d4b5790fcb02ce11a16be45b02cb65e9c18a")
      override fun uiColorPalette(uiColorPalette: UIColorPaletteProperty.Builder.() -> Unit): Unit =
          uiColorPalette(UIColorPaletteProperty(uiColorPalette))

      public fun build():
          software.amazon.awscdk.services.quicksight.CfnTheme.ThemeConfigurationProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.quicksight.CfnTheme.ThemeConfigurationProperty,
    ) : CdkObject(cdkObject),
        ThemeConfigurationProperty {
      /**
       * Color properties that apply to chart data colors.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-theme-themeconfiguration.html#cfn-quicksight-theme-themeconfiguration-datacolorpalette)
       */
      override fun dataColorPalette(): Any? = unwrap(this).getDataColorPalette()

      /**
       * Display options related to sheets.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-theme-themeconfiguration.html#cfn-quicksight-theme-themeconfiguration-sheet)
       */
      override fun sheet(): Any? = unwrap(this).getSheet()

      /**
       * Determines the typography options.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-theme-themeconfiguration.html#cfn-quicksight-theme-themeconfiguration-typography)
       */
      override fun typography(): Any? = unwrap(this).getTypography()

      /**
       * Color properties that apply to the UI and to charts, excluding the colors that apply to
       * data.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-theme-themeconfiguration.html#cfn-quicksight-theme-themeconfiguration-uicolorpalette)
       */
      override fun uiColorPalette(): Any? = unwrap(this).getUiColorPalette()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): ThemeConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.quicksight.CfnTheme.ThemeConfigurationProperty):
          ThemeConfigurationProperty = CdkObjectWrappers.wrap(cdkObject) as?
          ThemeConfigurationProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: ThemeConfigurationProperty):
          software.amazon.awscdk.services.quicksight.CfnTheme.ThemeConfigurationProperty = (wrapped
          as CdkObject).cdkObject as
          software.amazon.awscdk.services.quicksight.CfnTheme.ThemeConfigurationProperty
    }
  }

  /**
   * Theme error.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.quicksight.*;
   * ThemeErrorProperty themeErrorProperty = ThemeErrorProperty.builder()
   * .message("message")
   * .type("type")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-theme-themeerror.html)
   */
  public interface ThemeErrorProperty {
    /**
     * The error message.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-theme-themeerror.html#cfn-quicksight-theme-themeerror-message)
     */
    public fun message(): String? = unwrap(this).getMessage()

    /**
     * The type of error.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-theme-themeerror.html#cfn-quicksight-theme-themeerror-type)
     */
    public fun type(): String? = unwrap(this).getType()

    /**
     * A builder for [ThemeErrorProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param message The error message.
       */
      public fun message(message: String)

      /**
       * @param type The type of error.
       */
      public fun type(type: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.quicksight.CfnTheme.ThemeErrorProperty.Builder =
          software.amazon.awscdk.services.quicksight.CfnTheme.ThemeErrorProperty.builder()

      /**
       * @param message The error message.
       */
      override fun message(message: String) {
        cdkBuilder.message(message)
      }

      /**
       * @param type The type of error.
       */
      override fun type(type: String) {
        cdkBuilder.type(type)
      }

      public fun build(): software.amazon.awscdk.services.quicksight.CfnTheme.ThemeErrorProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.quicksight.CfnTheme.ThemeErrorProperty,
    ) : CdkObject(cdkObject),
        ThemeErrorProperty {
      /**
       * The error message.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-theme-themeerror.html#cfn-quicksight-theme-themeerror-message)
       */
      override fun message(): String? = unwrap(this).getMessage()

      /**
       * The type of error.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-theme-themeerror.html#cfn-quicksight-theme-themeerror-type)
       */
      override fun type(): String? = unwrap(this).getType()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): ThemeErrorProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.quicksight.CfnTheme.ThemeErrorProperty):
          ThemeErrorProperty = CdkObjectWrappers.wrap(cdkObject) as? ThemeErrorProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: ThemeErrorProperty):
          software.amazon.awscdk.services.quicksight.CfnTheme.ThemeErrorProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.quicksight.CfnTheme.ThemeErrorProperty
    }
  }

  /**
   * A version of a theme.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.quicksight.*;
   * ThemeVersionProperty themeVersionProperty = ThemeVersionProperty.builder()
   * .arn("arn")
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
   * .createdTime("createdTime")
   * .description("description")
   * .errors(List.of(ThemeErrorProperty.builder()
   * .message("message")
   * .type("type")
   * .build()))
   * .status("status")
   * .versionNumber(123)
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-theme-themeversion.html)
   */
  public interface ThemeVersionProperty {
    /**
     * The Amazon Resource Name (ARN) of the resource.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-theme-themeversion.html#cfn-quicksight-theme-themeversion-arn)
     */
    public fun arn(): String? = unwrap(this).getArn()

    /**
     * The Amazon QuickSight-defined ID of the theme that a custom theme inherits from.
     *
     * All themes initially inherit from a default Amazon QuickSight theme.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-theme-themeversion.html#cfn-quicksight-theme-themeversion-basethemeid)
     */
    public fun baseThemeId(): String? = unwrap(this).getBaseThemeId()

    /**
     * The theme configuration, which contains all the theme display properties.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-theme-themeversion.html#cfn-quicksight-theme-themeversion-configuration)
     */
    public fun configuration(): Any? = unwrap(this).getConfiguration()

    /**
     * The date and time that this theme version was created.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-theme-themeversion.html#cfn-quicksight-theme-themeversion-createdtime)
     */
    public fun createdTime(): String? = unwrap(this).getCreatedTime()

    /**
     * The description of the theme.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-theme-themeversion.html#cfn-quicksight-theme-themeversion-description)
     */
    public fun description(): String? = unwrap(this).getDescription()

    /**
     * Errors associated with the theme.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-theme-themeversion.html#cfn-quicksight-theme-themeversion-errors)
     */
    public fun errors(): Any? = unwrap(this).getErrors()

    /**
     * The status of the theme version.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-theme-themeversion.html#cfn-quicksight-theme-themeversion-status)
     */
    public fun status(): String? = unwrap(this).getStatus()

    /**
     * The version number of the theme.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-theme-themeversion.html#cfn-quicksight-theme-themeversion-versionnumber)
     */
    public fun versionNumber(): Number? = unwrap(this).getVersionNumber()

    /**
     * A builder for [ThemeVersionProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param arn The Amazon Resource Name (ARN) of the resource.
       */
      public fun arn(arn: String)

      /**
       * @param baseThemeId The Amazon QuickSight-defined ID of the theme that a custom theme
       * inherits from.
       * All themes initially inherit from a default Amazon QuickSight theme.
       */
      public fun baseThemeId(baseThemeId: String)

      /**
       * @param configuration The theme configuration, which contains all the theme display
       * properties.
       */
      public fun configuration(configuration: IResolvable)

      /**
       * @param configuration The theme configuration, which contains all the theme display
       * properties.
       */
      public fun configuration(configuration: ThemeConfigurationProperty)

      /**
       * @param configuration The theme configuration, which contains all the theme display
       * properties.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("7ee58bf2057c056e3da9d8a081b123d3a55e63e9a0aa8d4f23066d4967006d8c")
      public fun configuration(configuration: ThemeConfigurationProperty.Builder.() -> Unit)

      /**
       * @param createdTime The date and time that this theme version was created.
       */
      public fun createdTime(createdTime: String)

      /**
       * @param description The description of the theme.
       */
      public fun description(description: String)

      /**
       * @param errors Errors associated with the theme.
       */
      public fun errors(errors: IResolvable)

      /**
       * @param errors Errors associated with the theme.
       */
      public fun errors(errors: List<Any>)

      /**
       * @param errors Errors associated with the theme.
       */
      public fun errors(vararg errors: Any)

      /**
       * @param status The status of the theme version.
       */
      public fun status(status: String)

      /**
       * @param versionNumber The version number of the theme.
       */
      public fun versionNumber(versionNumber: Number)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.quicksight.CfnTheme.ThemeVersionProperty.Builder =
          software.amazon.awscdk.services.quicksight.CfnTheme.ThemeVersionProperty.builder()

      /**
       * @param arn The Amazon Resource Name (ARN) of the resource.
       */
      override fun arn(arn: String) {
        cdkBuilder.arn(arn)
      }

      /**
       * @param baseThemeId The Amazon QuickSight-defined ID of the theme that a custom theme
       * inherits from.
       * All themes initially inherit from a default Amazon QuickSight theme.
       */
      override fun baseThemeId(baseThemeId: String) {
        cdkBuilder.baseThemeId(baseThemeId)
      }

      /**
       * @param configuration The theme configuration, which contains all the theme display
       * properties.
       */
      override fun configuration(configuration: IResolvable) {
        cdkBuilder.configuration(configuration.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param configuration The theme configuration, which contains all the theme display
       * properties.
       */
      override fun configuration(configuration: ThemeConfigurationProperty) {
        cdkBuilder.configuration(configuration.let(ThemeConfigurationProperty.Companion::unwrap))
      }

      /**
       * @param configuration The theme configuration, which contains all the theme display
       * properties.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("7ee58bf2057c056e3da9d8a081b123d3a55e63e9a0aa8d4f23066d4967006d8c")
      override fun configuration(configuration: ThemeConfigurationProperty.Builder.() -> Unit): Unit
          = configuration(ThemeConfigurationProperty(configuration))

      /**
       * @param createdTime The date and time that this theme version was created.
       */
      override fun createdTime(createdTime: String) {
        cdkBuilder.createdTime(createdTime)
      }

      /**
       * @param description The description of the theme.
       */
      override fun description(description: String) {
        cdkBuilder.description(description)
      }

      /**
       * @param errors Errors associated with the theme.
       */
      override fun errors(errors: IResolvable) {
        cdkBuilder.errors(errors.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param errors Errors associated with the theme.
       */
      override fun errors(errors: List<Any>) {
        cdkBuilder.errors(errors.map{CdkObjectWrappers.unwrap(it)})
      }

      /**
       * @param errors Errors associated with the theme.
       */
      override fun errors(vararg errors: Any): Unit = errors(errors.toList())

      /**
       * @param status The status of the theme version.
       */
      override fun status(status: String) {
        cdkBuilder.status(status)
      }

      /**
       * @param versionNumber The version number of the theme.
       */
      override fun versionNumber(versionNumber: Number) {
        cdkBuilder.versionNumber(versionNumber)
      }

      public fun build(): software.amazon.awscdk.services.quicksight.CfnTheme.ThemeVersionProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.quicksight.CfnTheme.ThemeVersionProperty,
    ) : CdkObject(cdkObject),
        ThemeVersionProperty {
      /**
       * The Amazon Resource Name (ARN) of the resource.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-theme-themeversion.html#cfn-quicksight-theme-themeversion-arn)
       */
      override fun arn(): String? = unwrap(this).getArn()

      /**
       * The Amazon QuickSight-defined ID of the theme that a custom theme inherits from.
       *
       * All themes initially inherit from a default Amazon QuickSight theme.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-theme-themeversion.html#cfn-quicksight-theme-themeversion-basethemeid)
       */
      override fun baseThemeId(): String? = unwrap(this).getBaseThemeId()

      /**
       * The theme configuration, which contains all the theme display properties.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-theme-themeversion.html#cfn-quicksight-theme-themeversion-configuration)
       */
      override fun configuration(): Any? = unwrap(this).getConfiguration()

      /**
       * The date and time that this theme version was created.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-theme-themeversion.html#cfn-quicksight-theme-themeversion-createdtime)
       */
      override fun createdTime(): String? = unwrap(this).getCreatedTime()

      /**
       * The description of the theme.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-theme-themeversion.html#cfn-quicksight-theme-themeversion-description)
       */
      override fun description(): String? = unwrap(this).getDescription()

      /**
       * Errors associated with the theme.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-theme-themeversion.html#cfn-quicksight-theme-themeversion-errors)
       */
      override fun errors(): Any? = unwrap(this).getErrors()

      /**
       * The status of the theme version.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-theme-themeversion.html#cfn-quicksight-theme-themeversion-status)
       */
      override fun status(): String? = unwrap(this).getStatus()

      /**
       * The version number of the theme.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-theme-themeversion.html#cfn-quicksight-theme-themeversion-versionnumber)
       */
      override fun versionNumber(): Number? = unwrap(this).getVersionNumber()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): ThemeVersionProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.quicksight.CfnTheme.ThemeVersionProperty):
          ThemeVersionProperty = CdkObjectWrappers.wrap(cdkObject) as? ThemeVersionProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: ThemeVersionProperty):
          software.amazon.awscdk.services.quicksight.CfnTheme.ThemeVersionProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.quicksight.CfnTheme.ThemeVersionProperty
    }
  }

  /**
   * The display options for the layout of tiles on a sheet.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.quicksight.*;
   * TileLayoutStyleProperty tileLayoutStyleProperty = TileLayoutStyleProperty.builder()
   * .gutter(GutterStyleProperty.builder()
   * .show(false)
   * .build())
   * .margin(MarginStyleProperty.builder()
   * .show(false)
   * .build())
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-theme-tilelayoutstyle.html)
   */
  public interface TileLayoutStyleProperty {
    /**
     * The gutter settings that apply between tiles.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-theme-tilelayoutstyle.html#cfn-quicksight-theme-tilelayoutstyle-gutter)
     */
    public fun gutter(): Any? = unwrap(this).getGutter()

    /**
     * The margin settings that apply around the outside edge of sheets.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-theme-tilelayoutstyle.html#cfn-quicksight-theme-tilelayoutstyle-margin)
     */
    public fun margin(): Any? = unwrap(this).getMargin()

    /**
     * A builder for [TileLayoutStyleProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param gutter The gutter settings that apply between tiles.
       */
      public fun gutter(gutter: IResolvable)

      /**
       * @param gutter The gutter settings that apply between tiles.
       */
      public fun gutter(gutter: GutterStyleProperty)

      /**
       * @param gutter The gutter settings that apply between tiles.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("f6592f5ee4f7c7ed756ac83167bb44beca704ac45b89e5413fd57df4199b1ec6")
      public fun gutter(gutter: GutterStyleProperty.Builder.() -> Unit)

      /**
       * @param margin The margin settings that apply around the outside edge of sheets.
       */
      public fun margin(margin: IResolvable)

      /**
       * @param margin The margin settings that apply around the outside edge of sheets.
       */
      public fun margin(margin: MarginStyleProperty)

      /**
       * @param margin The margin settings that apply around the outside edge of sheets.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("bdb29804e6c9f2143eb8265f0912a5e52a49924606de54d00308c204e983fd3a")
      public fun margin(margin: MarginStyleProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.quicksight.CfnTheme.TileLayoutStyleProperty.Builder =
          software.amazon.awscdk.services.quicksight.CfnTheme.TileLayoutStyleProperty.builder()

      /**
       * @param gutter The gutter settings that apply between tiles.
       */
      override fun gutter(gutter: IResolvable) {
        cdkBuilder.gutter(gutter.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param gutter The gutter settings that apply between tiles.
       */
      override fun gutter(gutter: GutterStyleProperty) {
        cdkBuilder.gutter(gutter.let(GutterStyleProperty.Companion::unwrap))
      }

      /**
       * @param gutter The gutter settings that apply between tiles.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("f6592f5ee4f7c7ed756ac83167bb44beca704ac45b89e5413fd57df4199b1ec6")
      override fun gutter(gutter: GutterStyleProperty.Builder.() -> Unit): Unit =
          gutter(GutterStyleProperty(gutter))

      /**
       * @param margin The margin settings that apply around the outside edge of sheets.
       */
      override fun margin(margin: IResolvable) {
        cdkBuilder.margin(margin.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param margin The margin settings that apply around the outside edge of sheets.
       */
      override fun margin(margin: MarginStyleProperty) {
        cdkBuilder.margin(margin.let(MarginStyleProperty.Companion::unwrap))
      }

      /**
       * @param margin The margin settings that apply around the outside edge of sheets.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("bdb29804e6c9f2143eb8265f0912a5e52a49924606de54d00308c204e983fd3a")
      override fun margin(margin: MarginStyleProperty.Builder.() -> Unit): Unit =
          margin(MarginStyleProperty(margin))

      public fun build():
          software.amazon.awscdk.services.quicksight.CfnTheme.TileLayoutStyleProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.quicksight.CfnTheme.TileLayoutStyleProperty,
    ) : CdkObject(cdkObject),
        TileLayoutStyleProperty {
      /**
       * The gutter settings that apply between tiles.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-theme-tilelayoutstyle.html#cfn-quicksight-theme-tilelayoutstyle-gutter)
       */
      override fun gutter(): Any? = unwrap(this).getGutter()

      /**
       * The margin settings that apply around the outside edge of sheets.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-theme-tilelayoutstyle.html#cfn-quicksight-theme-tilelayoutstyle-margin)
       */
      override fun margin(): Any? = unwrap(this).getMargin()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): TileLayoutStyleProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.quicksight.CfnTheme.TileLayoutStyleProperty):
          TileLayoutStyleProperty = CdkObjectWrappers.wrap(cdkObject) as? TileLayoutStyleProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: TileLayoutStyleProperty):
          software.amazon.awscdk.services.quicksight.CfnTheme.TileLayoutStyleProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.quicksight.CfnTheme.TileLayoutStyleProperty
    }
  }

  /**
   * Display options related to tiles on a sheet.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.quicksight.*;
   * TileStyleProperty tileStyleProperty = TileStyleProperty.builder()
   * .border(BorderStyleProperty.builder()
   * .show(false)
   * .build())
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-theme-tilestyle.html)
   */
  public interface TileStyleProperty {
    /**
     * The border around a tile.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-theme-tilestyle.html#cfn-quicksight-theme-tilestyle-border)
     */
    public fun border(): Any? = unwrap(this).getBorder()

    /**
     * A builder for [TileStyleProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param border The border around a tile.
       */
      public fun border(border: IResolvable)

      /**
       * @param border The border around a tile.
       */
      public fun border(border: BorderStyleProperty)

      /**
       * @param border The border around a tile.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("a1722673fbc17d8b0361c6e0058383943839530f777e7832a416e7f1ae1175bb")
      public fun border(border: BorderStyleProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.quicksight.CfnTheme.TileStyleProperty.Builder =
          software.amazon.awscdk.services.quicksight.CfnTheme.TileStyleProperty.builder()

      /**
       * @param border The border around a tile.
       */
      override fun border(border: IResolvable) {
        cdkBuilder.border(border.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param border The border around a tile.
       */
      override fun border(border: BorderStyleProperty) {
        cdkBuilder.border(border.let(BorderStyleProperty.Companion::unwrap))
      }

      /**
       * @param border The border around a tile.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("a1722673fbc17d8b0361c6e0058383943839530f777e7832a416e7f1ae1175bb")
      override fun border(border: BorderStyleProperty.Builder.() -> Unit): Unit =
          border(BorderStyleProperty(border))

      public fun build(): software.amazon.awscdk.services.quicksight.CfnTheme.TileStyleProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.quicksight.CfnTheme.TileStyleProperty,
    ) : CdkObject(cdkObject),
        TileStyleProperty {
      /**
       * The border around a tile.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-theme-tilestyle.html#cfn-quicksight-theme-tilestyle-border)
       */
      override fun border(): Any? = unwrap(this).getBorder()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): TileStyleProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.quicksight.CfnTheme.TileStyleProperty):
          TileStyleProperty = CdkObjectWrappers.wrap(cdkObject) as? TileStyleProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: TileStyleProperty):
          software.amazon.awscdk.services.quicksight.CfnTheme.TileStyleProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.quicksight.CfnTheme.TileStyleProperty
    }
  }

  /**
   * Determines the typography options.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.quicksight.*;
   * TypographyProperty typographyProperty = TypographyProperty.builder()
   * .fontFamilies(List.of(FontProperty.builder()
   * .fontFamily("fontFamily")
   * .build()))
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-theme-typography.html)
   */
  public interface TypographyProperty {
    /**
     * Determines the list of font families.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-theme-typography.html#cfn-quicksight-theme-typography-fontfamilies)
     */
    public fun fontFamilies(): Any? = unwrap(this).getFontFamilies()

    /**
     * A builder for [TypographyProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param fontFamilies Determines the list of font families.
       */
      public fun fontFamilies(fontFamilies: IResolvable)

      /**
       * @param fontFamilies Determines the list of font families.
       */
      public fun fontFamilies(fontFamilies: List<Any>)

      /**
       * @param fontFamilies Determines the list of font families.
       */
      public fun fontFamilies(vararg fontFamilies: Any)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.quicksight.CfnTheme.TypographyProperty.Builder =
          software.amazon.awscdk.services.quicksight.CfnTheme.TypographyProperty.builder()

      /**
       * @param fontFamilies Determines the list of font families.
       */
      override fun fontFamilies(fontFamilies: IResolvable) {
        cdkBuilder.fontFamilies(fontFamilies.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param fontFamilies Determines the list of font families.
       */
      override fun fontFamilies(fontFamilies: List<Any>) {
        cdkBuilder.fontFamilies(fontFamilies.map{CdkObjectWrappers.unwrap(it)})
      }

      /**
       * @param fontFamilies Determines the list of font families.
       */
      override fun fontFamilies(vararg fontFamilies: Any): Unit =
          fontFamilies(fontFamilies.toList())

      public fun build(): software.amazon.awscdk.services.quicksight.CfnTheme.TypographyProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.quicksight.CfnTheme.TypographyProperty,
    ) : CdkObject(cdkObject),
        TypographyProperty {
      /**
       * Determines the list of font families.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-theme-typography.html#cfn-quicksight-theme-typography-fontfamilies)
       */
      override fun fontFamilies(): Any? = unwrap(this).getFontFamilies()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): TypographyProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.quicksight.CfnTheme.TypographyProperty):
          TypographyProperty = CdkObjectWrappers.wrap(cdkObject) as? TypographyProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: TypographyProperty):
          software.amazon.awscdk.services.quicksight.CfnTheme.TypographyProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.quicksight.CfnTheme.TypographyProperty
    }
  }

  /**
   * The theme colors that apply to UI and to charts, excluding data colors.
   *
   * The colors description is a hexadecimal color code that consists of six alphanumerical
   * characters, prefixed with `#` , for example #37BFF5. For more information, see [Using Themes in
   * Amazon QuickSight](https://docs.aws.amazon.com/quicksight/latest/user/themes-in-quicksight.html)
   * in the *Amazon QuickSight User Guide.*
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.quicksight.*;
   * UIColorPaletteProperty uIColorPaletteProperty = UIColorPaletteProperty.builder()
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
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-theme-uicolorpalette.html)
   */
  public interface UIColorPaletteProperty {
    /**
     * This color is that applies to selected states and buttons.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-theme-uicolorpalette.html#cfn-quicksight-theme-uicolorpalette-accent)
     */
    public fun accent(): String? = unwrap(this).getAccent()

    /**
     * The foreground color that applies to any text or other elements that appear over the accent
     * color.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-theme-uicolorpalette.html#cfn-quicksight-theme-uicolorpalette-accentforeground)
     */
    public fun accentForeground(): String? = unwrap(this).getAccentForeground()

    /**
     * The color that applies to error messages.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-theme-uicolorpalette.html#cfn-quicksight-theme-uicolorpalette-danger)
     */
    public fun danger(): String? = unwrap(this).getDanger()

    /**
     * The foreground color that applies to any text or other elements that appear over the error
     * color.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-theme-uicolorpalette.html#cfn-quicksight-theme-uicolorpalette-dangerforeground)
     */
    public fun dangerForeground(): String? = unwrap(this).getDangerForeground()

    /**
     * The color that applies to the names of fields that are identified as dimensions.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-theme-uicolorpalette.html#cfn-quicksight-theme-uicolorpalette-dimension)
     */
    public fun dimension(): String? = unwrap(this).getDimension()

    /**
     * The foreground color that applies to any text or other elements that appear over the
     * dimension color.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-theme-uicolorpalette.html#cfn-quicksight-theme-uicolorpalette-dimensionforeground)
     */
    public fun dimensionForeground(): String? = unwrap(this).getDimensionForeground()

    /**
     * The color that applies to the names of fields that are identified as measures.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-theme-uicolorpalette.html#cfn-quicksight-theme-uicolorpalette-measure)
     */
    public fun measure(): String? = unwrap(this).getMeasure()

    /**
     * The foreground color that applies to any text or other elements that appear over the measure
     * color.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-theme-uicolorpalette.html#cfn-quicksight-theme-uicolorpalette-measureforeground)
     */
    public fun measureForeground(): String? = unwrap(this).getMeasureForeground()

    /**
     * The background color that applies to visuals and other high emphasis UI.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-theme-uicolorpalette.html#cfn-quicksight-theme-uicolorpalette-primarybackground)
     */
    public fun primaryBackground(): String? = unwrap(this).getPrimaryBackground()

    /**
     * The color of text and other foreground elements that appear over the primary background
     * regions, such as grid lines, borders, table banding, icons, and so on.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-theme-uicolorpalette.html#cfn-quicksight-theme-uicolorpalette-primaryforeground)
     */
    public fun primaryForeground(): String? = unwrap(this).getPrimaryForeground()

    /**
     * The background color that applies to the sheet background and sheet controls.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-theme-uicolorpalette.html#cfn-quicksight-theme-uicolorpalette-secondarybackground)
     */
    public fun secondaryBackground(): String? = unwrap(this).getSecondaryBackground()

    /**
     * The foreground color that applies to any sheet title, sheet control text, or UI that appears
     * over the secondary background.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-theme-uicolorpalette.html#cfn-quicksight-theme-uicolorpalette-secondaryforeground)
     */
    public fun secondaryForeground(): String? = unwrap(this).getSecondaryForeground()

    /**
     * The color that applies to success messages, for example the check mark for a successful
     * download.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-theme-uicolorpalette.html#cfn-quicksight-theme-uicolorpalette-success)
     */
    public fun success(): String? = unwrap(this).getSuccess()

    /**
     * The foreground color that applies to any text or other elements that appear over the success
     * color.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-theme-uicolorpalette.html#cfn-quicksight-theme-uicolorpalette-successforeground)
     */
    public fun successForeground(): String? = unwrap(this).getSuccessForeground()

    /**
     * This color that applies to warning and informational messages.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-theme-uicolorpalette.html#cfn-quicksight-theme-uicolorpalette-warning)
     */
    public fun warning(): String? = unwrap(this).getWarning()

    /**
     * The foreground color that applies to any text or other elements that appear over the warning
     * color.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-theme-uicolorpalette.html#cfn-quicksight-theme-uicolorpalette-warningforeground)
     */
    public fun warningForeground(): String? = unwrap(this).getWarningForeground()

    /**
     * A builder for [UIColorPaletteProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param accent This color is that applies to selected states and buttons.
       */
      public fun accent(accent: String)

      /**
       * @param accentForeground The foreground color that applies to any text or other elements
       * that appear over the accent color.
       */
      public fun accentForeground(accentForeground: String)

      /**
       * @param danger The color that applies to error messages.
       */
      public fun danger(danger: String)

      /**
       * @param dangerForeground The foreground color that applies to any text or other elements
       * that appear over the error color.
       */
      public fun dangerForeground(dangerForeground: String)

      /**
       * @param dimension The color that applies to the names of fields that are identified as
       * dimensions.
       */
      public fun dimension(dimension: String)

      /**
       * @param dimensionForeground The foreground color that applies to any text or other elements
       * that appear over the dimension color.
       */
      public fun dimensionForeground(dimensionForeground: String)

      /**
       * @param measure The color that applies to the names of fields that are identified as
       * measures.
       */
      public fun measure(measure: String)

      /**
       * @param measureForeground The foreground color that applies to any text or other elements
       * that appear over the measure color.
       */
      public fun measureForeground(measureForeground: String)

      /**
       * @param primaryBackground The background color that applies to visuals and other high
       * emphasis UI.
       */
      public fun primaryBackground(primaryBackground: String)

      /**
       * @param primaryForeground The color of text and other foreground elements that appear over
       * the primary background regions, such as grid lines, borders, table banding, icons, and so on.
       */
      public fun primaryForeground(primaryForeground: String)

      /**
       * @param secondaryBackground The background color that applies to the sheet background and
       * sheet controls.
       */
      public fun secondaryBackground(secondaryBackground: String)

      /**
       * @param secondaryForeground The foreground color that applies to any sheet title, sheet
       * control text, or UI that appears over the secondary background.
       */
      public fun secondaryForeground(secondaryForeground: String)

      /**
       * @param success The color that applies to success messages, for example the check mark for a
       * successful download.
       */
      public fun success(success: String)

      /**
       * @param successForeground The foreground color that applies to any text or other elements
       * that appear over the success color.
       */
      public fun successForeground(successForeground: String)

      /**
       * @param warning This color that applies to warning and informational messages.
       */
      public fun warning(warning: String)

      /**
       * @param warningForeground The foreground color that applies to any text or other elements
       * that appear over the warning color.
       */
      public fun warningForeground(warningForeground: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.quicksight.CfnTheme.UIColorPaletteProperty.Builder =
          software.amazon.awscdk.services.quicksight.CfnTheme.UIColorPaletteProperty.builder()

      /**
       * @param accent This color is that applies to selected states and buttons.
       */
      override fun accent(accent: String) {
        cdkBuilder.accent(accent)
      }

      /**
       * @param accentForeground The foreground color that applies to any text or other elements
       * that appear over the accent color.
       */
      override fun accentForeground(accentForeground: String) {
        cdkBuilder.accentForeground(accentForeground)
      }

      /**
       * @param danger The color that applies to error messages.
       */
      override fun danger(danger: String) {
        cdkBuilder.danger(danger)
      }

      /**
       * @param dangerForeground The foreground color that applies to any text or other elements
       * that appear over the error color.
       */
      override fun dangerForeground(dangerForeground: String) {
        cdkBuilder.dangerForeground(dangerForeground)
      }

      /**
       * @param dimension The color that applies to the names of fields that are identified as
       * dimensions.
       */
      override fun dimension(dimension: String) {
        cdkBuilder.dimension(dimension)
      }

      /**
       * @param dimensionForeground The foreground color that applies to any text or other elements
       * that appear over the dimension color.
       */
      override fun dimensionForeground(dimensionForeground: String) {
        cdkBuilder.dimensionForeground(dimensionForeground)
      }

      /**
       * @param measure The color that applies to the names of fields that are identified as
       * measures.
       */
      override fun measure(measure: String) {
        cdkBuilder.measure(measure)
      }

      /**
       * @param measureForeground The foreground color that applies to any text or other elements
       * that appear over the measure color.
       */
      override fun measureForeground(measureForeground: String) {
        cdkBuilder.measureForeground(measureForeground)
      }

      /**
       * @param primaryBackground The background color that applies to visuals and other high
       * emphasis UI.
       */
      override fun primaryBackground(primaryBackground: String) {
        cdkBuilder.primaryBackground(primaryBackground)
      }

      /**
       * @param primaryForeground The color of text and other foreground elements that appear over
       * the primary background regions, such as grid lines, borders, table banding, icons, and so on.
       */
      override fun primaryForeground(primaryForeground: String) {
        cdkBuilder.primaryForeground(primaryForeground)
      }

      /**
       * @param secondaryBackground The background color that applies to the sheet background and
       * sheet controls.
       */
      override fun secondaryBackground(secondaryBackground: String) {
        cdkBuilder.secondaryBackground(secondaryBackground)
      }

      /**
       * @param secondaryForeground The foreground color that applies to any sheet title, sheet
       * control text, or UI that appears over the secondary background.
       */
      override fun secondaryForeground(secondaryForeground: String) {
        cdkBuilder.secondaryForeground(secondaryForeground)
      }

      /**
       * @param success The color that applies to success messages, for example the check mark for a
       * successful download.
       */
      override fun success(success: String) {
        cdkBuilder.success(success)
      }

      /**
       * @param successForeground The foreground color that applies to any text or other elements
       * that appear over the success color.
       */
      override fun successForeground(successForeground: String) {
        cdkBuilder.successForeground(successForeground)
      }

      /**
       * @param warning This color that applies to warning and informational messages.
       */
      override fun warning(warning: String) {
        cdkBuilder.warning(warning)
      }

      /**
       * @param warningForeground The foreground color that applies to any text or other elements
       * that appear over the warning color.
       */
      override fun warningForeground(warningForeground: String) {
        cdkBuilder.warningForeground(warningForeground)
      }

      public fun build(): software.amazon.awscdk.services.quicksight.CfnTheme.UIColorPaletteProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.quicksight.CfnTheme.UIColorPaletteProperty,
    ) : CdkObject(cdkObject),
        UIColorPaletteProperty {
      /**
       * This color is that applies to selected states and buttons.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-theme-uicolorpalette.html#cfn-quicksight-theme-uicolorpalette-accent)
       */
      override fun accent(): String? = unwrap(this).getAccent()

      /**
       * The foreground color that applies to any text or other elements that appear over the accent
       * color.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-theme-uicolorpalette.html#cfn-quicksight-theme-uicolorpalette-accentforeground)
       */
      override fun accentForeground(): String? = unwrap(this).getAccentForeground()

      /**
       * The color that applies to error messages.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-theme-uicolorpalette.html#cfn-quicksight-theme-uicolorpalette-danger)
       */
      override fun danger(): String? = unwrap(this).getDanger()

      /**
       * The foreground color that applies to any text or other elements that appear over the error
       * color.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-theme-uicolorpalette.html#cfn-quicksight-theme-uicolorpalette-dangerforeground)
       */
      override fun dangerForeground(): String? = unwrap(this).getDangerForeground()

      /**
       * The color that applies to the names of fields that are identified as dimensions.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-theme-uicolorpalette.html#cfn-quicksight-theme-uicolorpalette-dimension)
       */
      override fun dimension(): String? = unwrap(this).getDimension()

      /**
       * The foreground color that applies to any text or other elements that appear over the
       * dimension color.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-theme-uicolorpalette.html#cfn-quicksight-theme-uicolorpalette-dimensionforeground)
       */
      override fun dimensionForeground(): String? = unwrap(this).getDimensionForeground()

      /**
       * The color that applies to the names of fields that are identified as measures.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-theme-uicolorpalette.html#cfn-quicksight-theme-uicolorpalette-measure)
       */
      override fun measure(): String? = unwrap(this).getMeasure()

      /**
       * The foreground color that applies to any text or other elements that appear over the
       * measure color.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-theme-uicolorpalette.html#cfn-quicksight-theme-uicolorpalette-measureforeground)
       */
      override fun measureForeground(): String? = unwrap(this).getMeasureForeground()

      /**
       * The background color that applies to visuals and other high emphasis UI.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-theme-uicolorpalette.html#cfn-quicksight-theme-uicolorpalette-primarybackground)
       */
      override fun primaryBackground(): String? = unwrap(this).getPrimaryBackground()

      /**
       * The color of text and other foreground elements that appear over the primary background
       * regions, such as grid lines, borders, table banding, icons, and so on.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-theme-uicolorpalette.html#cfn-quicksight-theme-uicolorpalette-primaryforeground)
       */
      override fun primaryForeground(): String? = unwrap(this).getPrimaryForeground()

      /**
       * The background color that applies to the sheet background and sheet controls.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-theme-uicolorpalette.html#cfn-quicksight-theme-uicolorpalette-secondarybackground)
       */
      override fun secondaryBackground(): String? = unwrap(this).getSecondaryBackground()

      /**
       * The foreground color that applies to any sheet title, sheet control text, or UI that
       * appears over the secondary background.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-theme-uicolorpalette.html#cfn-quicksight-theme-uicolorpalette-secondaryforeground)
       */
      override fun secondaryForeground(): String? = unwrap(this).getSecondaryForeground()

      /**
       * The color that applies to success messages, for example the check mark for a successful
       * download.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-theme-uicolorpalette.html#cfn-quicksight-theme-uicolorpalette-success)
       */
      override fun success(): String? = unwrap(this).getSuccess()

      /**
       * The foreground color that applies to any text or other elements that appear over the
       * success color.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-theme-uicolorpalette.html#cfn-quicksight-theme-uicolorpalette-successforeground)
       */
      override fun successForeground(): String? = unwrap(this).getSuccessForeground()

      /**
       * This color that applies to warning and informational messages.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-theme-uicolorpalette.html#cfn-quicksight-theme-uicolorpalette-warning)
       */
      override fun warning(): String? = unwrap(this).getWarning()

      /**
       * The foreground color that applies to any text or other elements that appear over the
       * warning color.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-theme-uicolorpalette.html#cfn-quicksight-theme-uicolorpalette-warningforeground)
       */
      override fun warningForeground(): String? = unwrap(this).getWarningForeground()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): UIColorPaletteProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.quicksight.CfnTheme.UIColorPaletteProperty):
          UIColorPaletteProperty = CdkObjectWrappers.wrap(cdkObject) as? UIColorPaletteProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: UIColorPaletteProperty):
          software.amazon.awscdk.services.quicksight.CfnTheme.UIColorPaletteProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.quicksight.CfnTheme.UIColorPaletteProperty
    }
  }
}
