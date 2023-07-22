@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.amplifyuibuilder

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.Map
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.amplifyuibuilder.CfnTheme
import software.constructs.Construct

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
 * import software.amazon.awscdk.services.amplifyuibuilder.*;
 * ThemeValuesProperty themeValuesProperty_;
 * CfnTheme cfnTheme = CfnTheme.Builder.create(this, "MyCfnTheme")
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
public class CfnThemeDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: CfnTheme.Builder = CfnTheme.Builder.create(scope, id)

  private val _overrides: MutableList<Any> = mutableListOf()

  private val _values: MutableList<Any> = mutableListOf()

  /**
   * The unique ID for the Amplify app associated with the theme.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amplifyuibuilder-theme.html#cfn-amplifyuibuilder-theme-appid)
   * @param appId The unique ID for the Amplify app associated with the theme. 
   */
  public fun appId(appId: String) {
    cdkBuilder.appId(appId)
  }

  /**
   * The name of the backend environment that is a part of the Amplify app.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amplifyuibuilder-theme.html#cfn-amplifyuibuilder-theme-environmentname)
   * @param environmentName The name of the backend environment that is a part of the Amplify app. 
   */
  public fun environmentName(environmentName: String) {
    cdkBuilder.environmentName(environmentName)
  }

  /**
   * The name of the theme.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amplifyuibuilder-theme.html#cfn-amplifyuibuilder-theme-name)
   * @param name The name of the theme. 
   */
  public fun name(name: String) {
    cdkBuilder.name(name)
  }

  /**
   * Describes the properties that can be overriden to customize a theme.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amplifyuibuilder-theme.html#cfn-amplifyuibuilder-theme-overrides)
   * @param overrides Describes the properties that can be overriden to customize a theme. 
   */
  public fun overrides(vararg overrides: Any) {
    _overrides.addAll(listOf(*overrides))
  }

  /**
   * Describes the properties that can be overriden to customize a theme.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amplifyuibuilder-theme.html#cfn-amplifyuibuilder-theme-overrides)
   * @param overrides Describes the properties that can be overriden to customize a theme. 
   */
  public fun overrides(overrides: Collection<Any>) {
    _overrides.addAll(overrides)
  }

  /**
   * Describes the properties that can be overriden to customize a theme.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amplifyuibuilder-theme.html#cfn-amplifyuibuilder-theme-overrides)
   * @param overrides Describes the properties that can be overriden to customize a theme. 
   */
  public fun overrides(overrides: IResolvable) {
    cdkBuilder.overrides(overrides)
  }

  /**
   * One or more key-value pairs to use when tagging the theme.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amplifyuibuilder-theme.html#cfn-amplifyuibuilder-theme-tags)
   * @param tags One or more key-value pairs to use when tagging the theme. 
   */
  public fun tags(tags: Map<String, String>) {
    cdkBuilder.tags(tags)
  }

  /**
   * A list of key-value pairs that defines the properties of the theme.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amplifyuibuilder-theme.html#cfn-amplifyuibuilder-theme-values)
   * @param values A list of key-value pairs that defines the properties of the theme. 
   */
  public fun values(vararg values: Any) {
    _values.addAll(listOf(*values))
  }

  /**
   * A list of key-value pairs that defines the properties of the theme.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amplifyuibuilder-theme.html#cfn-amplifyuibuilder-theme-values)
   * @param values A list of key-value pairs that defines the properties of the theme. 
   */
  public fun values(values: Collection<Any>) {
    _values.addAll(values)
  }

  /**
   * A list of key-value pairs that defines the properties of the theme.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amplifyuibuilder-theme.html#cfn-amplifyuibuilder-theme-values)
   * @param values A list of key-value pairs that defines the properties of the theme. 
   */
  public fun values(values: IResolvable) {
    cdkBuilder.values(values)
  }

  public fun build(): CfnTheme {
    if(_overrides.isNotEmpty()) cdkBuilder.overrides(_overrides)
    if(_values.isNotEmpty()) cdkBuilder.values(_values)
    return cdkBuilder.build()
  }
}
