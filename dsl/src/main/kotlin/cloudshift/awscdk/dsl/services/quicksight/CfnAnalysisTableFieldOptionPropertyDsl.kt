@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnAnalysis

@CdkDslMarker
public class CfnAnalysisTableFieldOptionPropertyDsl {
  private val cdkBuilder: CfnAnalysis.TableFieldOptionProperty.Builder =
      CfnAnalysis.TableFieldOptionProperty.builder()

  public fun customLabel(customLabel: String) {
    cdkBuilder.customLabel(customLabel)
  }

  public fun fieldId(fieldId: String) {
    cdkBuilder.fieldId(fieldId)
  }

  public fun urlStyling(urlStyling: IResolvable) {
    cdkBuilder.urlStyling(urlStyling)
  }

  public fun urlStyling(urlStyling: CfnAnalysis.TableFieldURLConfigurationProperty) {
    cdkBuilder.urlStyling(urlStyling)
  }

  public fun visibility(visibility: String) {
    cdkBuilder.visibility(visibility)
  }

  public fun width(width: String) {
    cdkBuilder.width(width)
  }

  public fun build(): CfnAnalysis.TableFieldOptionProperty = cdkBuilder.build()
}
