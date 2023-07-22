@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.Number
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnTheme

@CdkDslMarker
public class CfnThemeThemeVersionPropertyDsl {
  private val cdkBuilder: CfnTheme.ThemeVersionProperty.Builder =
      CfnTheme.ThemeVersionProperty.builder()

  private val _errors: MutableList<Any> = mutableListOf()

  /**
   * @param arn The Amazon Resource Name (ARN) of the resource.
   */
  public fun arn(arn: String) {
    cdkBuilder.arn(arn)
  }

  /**
   * @param baseThemeId The Amazon QuickSight-defined ID of the theme that a custom theme inherits
   * from.
   * All themes initially inherit from a default Amazon QuickSight theme.
   */
  public fun baseThemeId(baseThemeId: String) {
    cdkBuilder.baseThemeId(baseThemeId)
  }

  /**
   * @param configuration The theme configuration, which contains all the theme display properties.
   */
  public fun configuration(configuration: IResolvable) {
    cdkBuilder.configuration(configuration)
  }

  /**
   * @param configuration The theme configuration, which contains all the theme display properties.
   */
  public fun configuration(configuration: CfnTheme.ThemeConfigurationProperty) {
    cdkBuilder.configuration(configuration)
  }

  /**
   * @param createdTime The date and time that this theme version was created.
   */
  public fun createdTime(createdTime: String) {
    cdkBuilder.createdTime(createdTime)
  }

  /**
   * @param description The description of the theme.
   */
  public fun description(description: String) {
    cdkBuilder.description(description)
  }

  /**
   * @param errors Errors associated with the theme.
   */
  public fun errors(vararg errors: Any) {
    _errors.addAll(listOf(*errors))
  }

  /**
   * @param errors Errors associated with the theme.
   */
  public fun errors(errors: Collection<Any>) {
    _errors.addAll(errors)
  }

  /**
   * @param errors Errors associated with the theme.
   */
  public fun errors(errors: IResolvable) {
    cdkBuilder.errors(errors)
  }

  /**
   * @param status The status of the theme version.
   */
  public fun status(status: String) {
    cdkBuilder.status(status)
  }

  /**
   * @param versionNumber The version number of the theme.
   */
  public fun versionNumber(versionNumber: Number) {
    cdkBuilder.versionNumber(versionNumber)
  }

  public fun build(): CfnTheme.ThemeVersionProperty {
    if(_errors.isNotEmpty()) cdkBuilder.errors(_errors)
    return cdkBuilder.build()
  }
}
