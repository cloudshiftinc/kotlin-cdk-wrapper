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

  public fun customLabel(customLabel: String) {
    cdkBuilder.customLabel(customLabel)
  }

  public fun fieldId(fieldId: String) {
    cdkBuilder.fieldId(fieldId)
  }

  public fun urlStyling(urlStyling: IResolvable) {
    cdkBuilder.urlStyling(urlStyling)
  }

  public fun urlStyling(urlStyling: CfnTemplate.TableFieldURLConfigurationProperty) {
    cdkBuilder.urlStyling(urlStyling)
  }

  public fun visibility(visibility: String) {
    cdkBuilder.visibility(visibility)
  }

  public fun width(width: String) {
    cdkBuilder.width(width)
  }

  public fun build(): CfnTemplate.TableFieldOptionProperty = cdkBuilder.build()
}
