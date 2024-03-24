@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.amplifyuibuilder

import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.collections.Map

/**
 * Properties for defining a `CfnTheme`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.amplifyuibuilder.*;
 * ThemeValuesProperty themeValuesProperty_;
 * CfnThemeProps cfnThemeProps = CfnThemeProps.builder()
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
public interface CfnThemeProps {
  /**
   * The unique ID for the Amplify app associated with the theme.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amplifyuibuilder-theme.html#cfn-amplifyuibuilder-theme-appid)
   */
  public fun appId(): String? = unwrap(this).getAppId()

  /**
   * The name of the backend environment that is a part of the Amplify app.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amplifyuibuilder-theme.html#cfn-amplifyuibuilder-theme-environmentname)
   */
  public fun environmentName(): String? = unwrap(this).getEnvironmentName()

  /**
   * The name of the theme.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amplifyuibuilder-theme.html#cfn-amplifyuibuilder-theme-name)
   */
  public fun name(): String? = unwrap(this).getName()

  /**
   * Describes the properties that can be overriden to customize a theme.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amplifyuibuilder-theme.html#cfn-amplifyuibuilder-theme-overrides)
   */
  public fun overrides(): Any? = unwrap(this).getOverrides()

  /**
   * One or more key-value pairs to use when tagging the theme.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amplifyuibuilder-theme.html#cfn-amplifyuibuilder-theme-tags)
   */
  public fun tags(): Map<String, String> = unwrap(this).getTags() ?: emptyMap()

  /**
   * A list of key-value pairs that defines the properties of the theme.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amplifyuibuilder-theme.html#cfn-amplifyuibuilder-theme-values)
   */
  public fun values(): Any? = unwrap(this).getValues()

  /**
   * A builder for [CfnThemeProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param appId The unique ID for the Amplify app associated with the theme.
     */
    public fun appId(appId: String)

    /**
     * @param environmentName The name of the backend environment that is a part of the Amplify app.
     */
    public fun environmentName(environmentName: String)

    /**
     * @param name The name of the theme.
     */
    public fun name(name: String)

    /**
     * @param overrides Describes the properties that can be overriden to customize a theme.
     */
    public fun overrides(overrides: IResolvable)

    /**
     * @param overrides Describes the properties that can be overriden to customize a theme.
     */
    public fun overrides(overrides: List<Any>)

    /**
     * @param overrides Describes the properties that can be overriden to customize a theme.
     */
    public fun overrides(vararg overrides: Any)

    /**
     * @param tags One or more key-value pairs to use when tagging the theme.
     */
    public fun tags(tags: Map<String, String>)

    /**
     * @param values A list of key-value pairs that defines the properties of the theme.
     */
    public fun values(values: IResolvable)

    /**
     * @param values A list of key-value pairs that defines the properties of the theme.
     */
    public fun values(values: List<Any>)

    /**
     * @param values A list of key-value pairs that defines the properties of the theme.
     */
    public fun values(vararg values: Any)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.amplifyuibuilder.CfnThemeProps.Builder =
        software.amazon.awscdk.services.amplifyuibuilder.CfnThemeProps.builder()

    /**
     * @param appId The unique ID for the Amplify app associated with the theme.
     */
    override fun appId(appId: String) {
      cdkBuilder.appId(appId)
    }

    /**
     * @param environmentName The name of the backend environment that is a part of the Amplify app.
     */
    override fun environmentName(environmentName: String) {
      cdkBuilder.environmentName(environmentName)
    }

    /**
     * @param name The name of the theme.
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    /**
     * @param overrides Describes the properties that can be overriden to customize a theme.
     */
    override fun overrides(overrides: IResolvable) {
      cdkBuilder.overrides(overrides.let(IResolvable::unwrap))
    }

    /**
     * @param overrides Describes the properties that can be overriden to customize a theme.
     */
    override fun overrides(overrides: List<Any>) {
      cdkBuilder.overrides(overrides.map{CdkObjectWrappers.unwrap(it)})
    }

    /**
     * @param overrides Describes the properties that can be overriden to customize a theme.
     */
    override fun overrides(vararg overrides: Any): Unit = overrides(overrides.toList())

    /**
     * @param tags One or more key-value pairs to use when tagging the theme.
     */
    override fun tags(tags: Map<String, String>) {
      cdkBuilder.tags(tags)
    }

    /**
     * @param values A list of key-value pairs that defines the properties of the theme.
     */
    override fun values(values: IResolvable) {
      cdkBuilder.values(values.let(IResolvable::unwrap))
    }

    /**
     * @param values A list of key-value pairs that defines the properties of the theme.
     */
    override fun values(values: List<Any>) {
      cdkBuilder.values(values.map{CdkObjectWrappers.unwrap(it)})
    }

    /**
     * @param values A list of key-value pairs that defines the properties of the theme.
     */
    override fun values(vararg values: Any): Unit = values(values.toList())

    public fun build(): software.amazon.awscdk.services.amplifyuibuilder.CfnThemeProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.amplifyuibuilder.CfnThemeProps,
  ) : CdkObject(cdkObject), CfnThemeProps {
    /**
     * The unique ID for the Amplify app associated with the theme.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amplifyuibuilder-theme.html#cfn-amplifyuibuilder-theme-appid)
     */
    override fun appId(): String? = unwrap(this).getAppId()

    /**
     * The name of the backend environment that is a part of the Amplify app.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amplifyuibuilder-theme.html#cfn-amplifyuibuilder-theme-environmentname)
     */
    override fun environmentName(): String? = unwrap(this).getEnvironmentName()

    /**
     * The name of the theme.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amplifyuibuilder-theme.html#cfn-amplifyuibuilder-theme-name)
     */
    override fun name(): String? = unwrap(this).getName()

    /**
     * Describes the properties that can be overriden to customize a theme.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amplifyuibuilder-theme.html#cfn-amplifyuibuilder-theme-overrides)
     */
    override fun overrides(): Any? = unwrap(this).getOverrides()

    /**
     * One or more key-value pairs to use when tagging the theme.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amplifyuibuilder-theme.html#cfn-amplifyuibuilder-theme-tags)
     */
    override fun tags(): Map<String, String> = unwrap(this).getTags() ?: emptyMap()

    /**
     * A list of key-value pairs that defines the properties of the theme.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amplifyuibuilder-theme.html#cfn-amplifyuibuilder-theme-values)
     */
    override fun values(): Any? = unwrap(this).getValues()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnThemeProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.amplifyuibuilder.CfnThemeProps):
        CfnThemeProps = CdkObjectWrappers.wrap(cdkObject) as? CfnThemeProps ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnThemeProps):
        software.amazon.awscdk.services.amplifyuibuilder.CfnThemeProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.amplifyuibuilder.CfnThemeProps
  }
}
