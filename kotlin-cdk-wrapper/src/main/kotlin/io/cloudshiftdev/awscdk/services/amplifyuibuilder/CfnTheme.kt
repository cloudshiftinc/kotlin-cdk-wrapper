@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.amplifyuibuilder

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.ITaggable
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.collections.Map
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * The AWS::AmplifyUIBuilder::Theme resource specifies a theme within an Amplify app.
 *
 * A theme is a collection of style settings that apply globally to the components associated with
 * the app.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.amplifyuibuilder.*;
 * ThemeValuesProperty themeValuesProperty_;
 * CfnTheme cfnTheme = CfnTheme.Builder.create(this, "MyCfnTheme")
 * .appId("appId")
 * .environmentName("environmentName")
 * .name("name")
 * .overrides(List.of(ThemeValuesProperty.builder()
 * .key("key")
 * .value(ThemeValueProperty.builder()
 * .children(List.of(themeValuesProperty_))
 * .value("value")
 * .build())
 * .build()))
 * .tags(Map.of(
 * "tagsKey", "tags"))
 * .values(List.of(ThemeValuesProperty.builder()
 * .key("key")
 * .value(ThemeValueProperty.builder()
 * .children(List.of(themeValuesProperty_))
 * .value("value")
 * .build())
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amplifyuibuilder-theme.html)
 */
public open class CfnTheme internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.amplifyuibuilder.CfnTheme,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  /**
   * The unique ID for the Amplify app associated with the theme.
   */
  public open fun appId(): String? = unwrap(this).getAppId()

  /**
   * The unique ID for the Amplify app associated with the theme.
   */
  public open fun appId(`value`: String) {
    unwrap(this).setAppId(`value`)
  }

  /**
   * The time that the theme was created.
   */
  public open fun attrCreatedAt(): String = unwrap(this).getAttrCreatedAt()

  /**
   * The ID for the theme.
   */
  public open fun attrId(): String = unwrap(this).getAttrId()

  /**
   * The time that the theme was modified.
   */
  public open fun attrModifiedAt(): String = unwrap(this).getAttrModifiedAt()

  /**
   * The name of the backend environment that is a part of the Amplify app.
   */
  public open fun environmentName(): String? = unwrap(this).getEnvironmentName()

  /**
   * The name of the backend environment that is a part of the Amplify app.
   */
  public open fun environmentName(`value`: String) {
    unwrap(this).setEnvironmentName(`value`)
  }

  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  /**
   * The name of the theme.
   */
  public open fun name(): String? = unwrap(this).getName()

  /**
   * The name of the theme.
   */
  public open fun name(`value`: String) {
    unwrap(this).setName(`value`)
  }

  /**
   * Describes the properties that can be overriden to customize a theme.
   */
  public open fun overrides(): Any? = unwrap(this).getOverrides()

  /**
   * Describes the properties that can be overriden to customize a theme.
   */
  public open fun overrides(`value`: IResolvable) {
    unwrap(this).setOverrides(`value`.let(IResolvable::unwrap))
  }

  /**
   * Describes the properties that can be overriden to customize a theme.
   */
  public open fun overrides(`value`: List<Any>) {
    unwrap(this).setOverrides(`value`)
  }

  /**
   * Describes the properties that can be overriden to customize a theme.
   */
  public open fun overrides(vararg `value`: Any): Unit = overrides(`value`.toList())

  /**
   * Tag Manager which manages the tags for this resource.
   */
  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  /**
   * One or more key-value pairs to use when tagging the theme.
   */
  public open fun tagsRaw(): Map<String, String> = unwrap(this).getTagsRaw() ?: emptyMap()

  /**
   * One or more key-value pairs to use when tagging the theme.
   */
  public open fun tagsRaw(`value`: Map<String, String>) {
    unwrap(this).setTagsRaw(`value`)
  }

  /**
   * A list of key-value pairs that defines the properties of the theme.
   */
  public open fun values(): Any? = unwrap(this).getValues()

  /**
   * A list of key-value pairs that defines the properties of the theme.
   */
  public open fun values(`value`: IResolvable) {
    unwrap(this).setValues(`value`.let(IResolvable::unwrap))
  }

  /**
   * A list of key-value pairs that defines the properties of the theme.
   */
  public open fun values(`value`: List<Any>) {
    unwrap(this).setValues(`value`)
  }

  /**
   * A list of key-value pairs that defines the properties of the theme.
   */
  public open fun values(vararg `value`: Any): Unit = values(`value`.toList())

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.amplifyuibuilder.CfnTheme].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The unique ID for the Amplify app associated with the theme.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amplifyuibuilder-theme.html#cfn-amplifyuibuilder-theme-appid)
     * @param appId The unique ID for the Amplify app associated with the theme. 
     */
    public fun appId(appId: String)

    /**
     * The name of the backend environment that is a part of the Amplify app.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amplifyuibuilder-theme.html#cfn-amplifyuibuilder-theme-environmentname)
     * @param environmentName The name of the backend environment that is a part of the Amplify app.
     * 
     */
    public fun environmentName(environmentName: String)

    /**
     * The name of the theme.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amplifyuibuilder-theme.html#cfn-amplifyuibuilder-theme-name)
     * @param name The name of the theme. 
     */
    public fun name(name: String)

    /**
     * Describes the properties that can be overriden to customize a theme.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amplifyuibuilder-theme.html#cfn-amplifyuibuilder-theme-overrides)
     * @param overrides Describes the properties that can be overriden to customize a theme. 
     */
    public fun overrides(overrides: IResolvable)

    /**
     * Describes the properties that can be overriden to customize a theme.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amplifyuibuilder-theme.html#cfn-amplifyuibuilder-theme-overrides)
     * @param overrides Describes the properties that can be overriden to customize a theme. 
     */
    public fun overrides(overrides: List<Any>)

    /**
     * Describes the properties that can be overriden to customize a theme.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amplifyuibuilder-theme.html#cfn-amplifyuibuilder-theme-overrides)
     * @param overrides Describes the properties that can be overriden to customize a theme. 
     */
    public fun overrides(vararg overrides: Any)

    /**
     * One or more key-value pairs to use when tagging the theme.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amplifyuibuilder-theme.html#cfn-amplifyuibuilder-theme-tags)
     * @param tags One or more key-value pairs to use when tagging the theme. 
     */
    public fun tags(tags: Map<String, String>)

    /**
     * A list of key-value pairs that defines the properties of the theme.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amplifyuibuilder-theme.html#cfn-amplifyuibuilder-theme-values)
     * @param values A list of key-value pairs that defines the properties of the theme. 
     */
    public fun values(values: IResolvable)

    /**
     * A list of key-value pairs that defines the properties of the theme.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amplifyuibuilder-theme.html#cfn-amplifyuibuilder-theme-values)
     * @param values A list of key-value pairs that defines the properties of the theme. 
     */
    public fun values(values: List<Any>)

    /**
     * A list of key-value pairs that defines the properties of the theme.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amplifyuibuilder-theme.html#cfn-amplifyuibuilder-theme-values)
     * @param values A list of key-value pairs that defines the properties of the theme. 
     */
    public fun values(vararg values: Any)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.amplifyuibuilder.CfnTheme.Builder =
        software.amazon.awscdk.services.amplifyuibuilder.CfnTheme.Builder.create(scope, id)

    /**
     * The unique ID for the Amplify app associated with the theme.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amplifyuibuilder-theme.html#cfn-amplifyuibuilder-theme-appid)
     * @param appId The unique ID for the Amplify app associated with the theme. 
     */
    override fun appId(appId: String) {
      cdkBuilder.appId(appId)
    }

    /**
     * The name of the backend environment that is a part of the Amplify app.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amplifyuibuilder-theme.html#cfn-amplifyuibuilder-theme-environmentname)
     * @param environmentName The name of the backend environment that is a part of the Amplify app.
     * 
     */
    override fun environmentName(environmentName: String) {
      cdkBuilder.environmentName(environmentName)
    }

    /**
     * The name of the theme.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amplifyuibuilder-theme.html#cfn-amplifyuibuilder-theme-name)
     * @param name The name of the theme. 
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    /**
     * Describes the properties that can be overriden to customize a theme.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amplifyuibuilder-theme.html#cfn-amplifyuibuilder-theme-overrides)
     * @param overrides Describes the properties that can be overriden to customize a theme. 
     */
    override fun overrides(overrides: IResolvable) {
      cdkBuilder.overrides(overrides.let(IResolvable::unwrap))
    }

    /**
     * Describes the properties that can be overriden to customize a theme.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amplifyuibuilder-theme.html#cfn-amplifyuibuilder-theme-overrides)
     * @param overrides Describes the properties that can be overriden to customize a theme. 
     */
    override fun overrides(overrides: List<Any>) {
      cdkBuilder.overrides(overrides)
    }

    /**
     * Describes the properties that can be overriden to customize a theme.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amplifyuibuilder-theme.html#cfn-amplifyuibuilder-theme-overrides)
     * @param overrides Describes the properties that can be overriden to customize a theme. 
     */
    override fun overrides(vararg overrides: Any): Unit = overrides(overrides.toList())

    /**
     * One or more key-value pairs to use when tagging the theme.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amplifyuibuilder-theme.html#cfn-amplifyuibuilder-theme-tags)
     * @param tags One or more key-value pairs to use when tagging the theme. 
     */
    override fun tags(tags: Map<String, String>) {
      cdkBuilder.tags(tags)
    }

    /**
     * A list of key-value pairs that defines the properties of the theme.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amplifyuibuilder-theme.html#cfn-amplifyuibuilder-theme-values)
     * @param values A list of key-value pairs that defines the properties of the theme. 
     */
    override fun values(values: IResolvable) {
      cdkBuilder.values(values.let(IResolvable::unwrap))
    }

    /**
     * A list of key-value pairs that defines the properties of the theme.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amplifyuibuilder-theme.html#cfn-amplifyuibuilder-theme-values)
     * @param values A list of key-value pairs that defines the properties of the theme. 
     */
    override fun values(values: List<Any>) {
      cdkBuilder.values(values)
    }

    /**
     * A list of key-value pairs that defines the properties of the theme.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amplifyuibuilder-theme.html#cfn-amplifyuibuilder-theme-values)
     * @param values A list of key-value pairs that defines the properties of the theme. 
     */
    override fun values(vararg values: Any): Unit = values(values.toList())

    public fun build(): software.amazon.awscdk.services.amplifyuibuilder.CfnTheme =
        cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.amplifyuibuilder.CfnTheme.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnTheme {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnTheme(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.amplifyuibuilder.CfnTheme):
        CfnTheme = CfnTheme(cdkObject)

    internal fun unwrap(wrapped: CfnTheme):
        software.amazon.awscdk.services.amplifyuibuilder.CfnTheme = wrapped.cdkObject
  }

  /**
   * The `ThemeValues` property specifies key-value pair that defines a property of a theme.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.amplifyuibuilder.*;
   * ThemeValuesProperty themeValuesProperty_;
   * ThemeValuesProperty themeValuesProperty = ThemeValuesProperty.builder()
   * .key("key")
   * .value(ThemeValueProperty.builder()
   * .children(List.of(themeValuesProperty_))
   * .value("value")
   * .build())
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-amplifyuibuilder-theme-themevalues.html)
   */
  public interface ThemeValuesProperty {
    /**
     * The name of the property.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-amplifyuibuilder-theme-themevalues.html#cfn-amplifyuibuilder-theme-themevalues-key)
     */
    public fun key(): String? = unwrap(this).getKey()

    /**
     * The value of the property.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-amplifyuibuilder-theme-themevalues.html#cfn-amplifyuibuilder-theme-themevalues-value)
     */
    public fun `value`(): Any? = unwrap(this).getValue()

    /**
     * A builder for [ThemeValuesProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param key The name of the property.
       */
      public fun key(key: String)

      /**
       * @param value The value of the property.
       */
      public fun `value`(`value`: IResolvable)

      /**
       * @param value The value of the property.
       */
      public fun `value`(`value`: ThemeValueProperty)

      /**
       * @param value The value of the property.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("35433fbe0a3c1523107c7f69fb9c117e2d4e7d21eb2de9e2f329067b72cd4cfe")
      public fun `value`(`value`: ThemeValueProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.amplifyuibuilder.CfnTheme.ThemeValuesProperty.Builder =
          software.amazon.awscdk.services.amplifyuibuilder.CfnTheme.ThemeValuesProperty.builder()

      /**
       * @param key The name of the property.
       */
      override fun key(key: String) {
        cdkBuilder.key(key)
      }

      /**
       * @param value The value of the property.
       */
      override fun `value`(`value`: IResolvable) {
        cdkBuilder.`value`(`value`.let(IResolvable::unwrap))
      }

      /**
       * @param value The value of the property.
       */
      override fun `value`(`value`: ThemeValueProperty) {
        cdkBuilder.`value`(`value`.let(ThemeValueProperty::unwrap))
      }

      /**
       * @param value The value of the property.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("35433fbe0a3c1523107c7f69fb9c117e2d4e7d21eb2de9e2f329067b72cd4cfe")
      override fun `value`(`value`: ThemeValueProperty.Builder.() -> Unit): Unit =
          `value`(ThemeValueProperty(`value`))

      public fun build():
          software.amazon.awscdk.services.amplifyuibuilder.CfnTheme.ThemeValuesProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.amplifyuibuilder.CfnTheme.ThemeValuesProperty,
    ) : CdkObject(cdkObject), ThemeValuesProperty {
      /**
       * The name of the property.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-amplifyuibuilder-theme-themevalues.html#cfn-amplifyuibuilder-theme-themevalues-key)
       */
      override fun key(): String? = unwrap(this).getKey()

      /**
       * The value of the property.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-amplifyuibuilder-theme-themevalues.html#cfn-amplifyuibuilder-theme-themevalues-value)
       */
      override fun `value`(): Any? = unwrap(this).getValue()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): ThemeValuesProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.amplifyuibuilder.CfnTheme.ThemeValuesProperty):
          ThemeValuesProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ThemeValuesProperty):
          software.amazon.awscdk.services.amplifyuibuilder.CfnTheme.ThemeValuesProperty = (wrapped
          as CdkObject).cdkObject as
          software.amazon.awscdk.services.amplifyuibuilder.CfnTheme.ThemeValuesProperty
    }
  }

  /**
   * The `ThemeValue` property specifies the configuration of a theme's properties.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.amplifyuibuilder.*;
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
  public interface ThemeValueProperty {
    /**
     * A list of key-value pairs that define the theme's properties.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-amplifyuibuilder-theme-themevalue.html#cfn-amplifyuibuilder-theme-themevalue-children)
     */
    public fun children(): Any? = unwrap(this).getChildren()

    /**
     * The value of a theme property.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-amplifyuibuilder-theme-themevalue.html#cfn-amplifyuibuilder-theme-themevalue-value)
     */
    public fun `value`(): String? = unwrap(this).getValue()

    /**
     * A builder for [ThemeValueProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param children A list of key-value pairs that define the theme's properties.
       */
      public fun children(children: IResolvable)

      /**
       * @param children A list of key-value pairs that define the theme's properties.
       */
      public fun children(children: List<Any>)

      /**
       * @param children A list of key-value pairs that define the theme's properties.
       */
      public fun children(vararg children: Any)

      /**
       * @param value The value of a theme property.
       */
      public fun `value`(`value`: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.amplifyuibuilder.CfnTheme.ThemeValueProperty.Builder =
          software.amazon.awscdk.services.amplifyuibuilder.CfnTheme.ThemeValueProperty.builder()

      /**
       * @param children A list of key-value pairs that define the theme's properties.
       */
      override fun children(children: IResolvable) {
        cdkBuilder.children(children.let(IResolvable::unwrap))
      }

      /**
       * @param children A list of key-value pairs that define the theme's properties.
       */
      override fun children(children: List<Any>) {
        cdkBuilder.children(children)
      }

      /**
       * @param children A list of key-value pairs that define the theme's properties.
       */
      override fun children(vararg children: Any): Unit = children(children.toList())

      /**
       * @param value The value of a theme property.
       */
      override fun `value`(`value`: String) {
        cdkBuilder.`value`(`value`)
      }

      public fun build():
          software.amazon.awscdk.services.amplifyuibuilder.CfnTheme.ThemeValueProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.amplifyuibuilder.CfnTheme.ThemeValueProperty,
    ) : CdkObject(cdkObject), ThemeValueProperty {
      /**
       * A list of key-value pairs that define the theme's properties.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-amplifyuibuilder-theme-themevalue.html#cfn-amplifyuibuilder-theme-themevalue-children)
       */
      override fun children(): Any? = unwrap(this).getChildren()

      /**
       * The value of a theme property.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-amplifyuibuilder-theme-themevalue.html#cfn-amplifyuibuilder-theme-themevalue-value)
       */
      override fun `value`(): String? = unwrap(this).getValue()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): ThemeValueProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.amplifyuibuilder.CfnTheme.ThemeValueProperty):
          ThemeValueProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ThemeValueProperty):
          software.amazon.awscdk.services.amplifyuibuilder.CfnTheme.ThemeValueProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.amplifyuibuilder.CfnTheme.ThemeValueProperty
    }
  }
}
