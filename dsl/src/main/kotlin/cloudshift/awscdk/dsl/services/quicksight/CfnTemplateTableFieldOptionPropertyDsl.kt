@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnTemplate

@CdkDslMarker
public class CfnTemplateTableFieldOptionPropertyDsl {
  private val cdkBuilder: CfnTemplate.TableFieldOptionProperty.Builder =
      CfnTemplate.TableFieldOptionProperty.builder()

  /**
   * @param customLabel The custom label for a table field.
   */
  public fun customLabel(customLabel: String) {
    cdkBuilder.customLabel(customLabel)
  }

  /**
   * @param fieldId The field ID for a table field. 
   */
  public fun fieldId(fieldId: String) {
    cdkBuilder.fieldId(fieldId)
  }

  /**
   * @param urlStyling The URL configuration for a table field.
   */
  public fun urlStyling(urlStyling: IResolvable) {
    cdkBuilder.urlStyling(urlStyling)
  }

  /**
   * @param urlStyling The URL configuration for a table field.
   */
  public fun urlStyling(urlStyling: CfnTemplate.TableFieldURLConfigurationProperty) {
    cdkBuilder.urlStyling(urlStyling)
  }

  /**
   * @param visibility The visibility of a table field.
   */
  public fun visibility(visibility: String) {
    cdkBuilder.visibility(visibility)
  }

  /**
   * @param width The width for a table field.
   */
  public fun width(width: String) {
    cdkBuilder.width(width)
  }

  public fun build(): CfnTemplate.TableFieldOptionProperty = cdkBuilder.build()
}
