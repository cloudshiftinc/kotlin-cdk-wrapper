@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnDashboard

@CdkDslMarker
public class CfnDashboardTableFieldOptionPropertyDsl {
  private val cdkBuilder: CfnDashboard.TableFieldOptionProperty.Builder =
      CfnDashboard.TableFieldOptionProperty.builder()

  public fun customLabel(customLabel: String) {
    cdkBuilder.customLabel(customLabel)
  }

  public fun fieldId(fieldId: String) {
    cdkBuilder.fieldId(fieldId)
  }

  public fun urlStyling(urlStyling: IResolvable) {
    cdkBuilder.urlStyling(urlStyling)
  }

  public fun urlStyling(urlStyling: CfnDashboard.TableFieldURLConfigurationProperty) {
    cdkBuilder.urlStyling(urlStyling)
  }

  public fun visibility(visibility: String) {
    cdkBuilder.visibility(visibility)
  }

  public fun width(width: String) {
    cdkBuilder.width(width)
  }

  public fun build(): CfnDashboard.TableFieldOptionProperty = cdkBuilder.build()
}
