@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.quicksight.CfnDashboard

@CdkDslMarker
public class CfnDashboardTableFieldCustomIconContentPropertyDsl {
  private val cdkBuilder: CfnDashboard.TableFieldCustomIconContentProperty.Builder =
      CfnDashboard.TableFieldCustomIconContentProperty.builder()

  public fun icon(icon: String) {
    cdkBuilder.icon(icon)
  }

  public fun build(): CfnDashboard.TableFieldCustomIconContentProperty = cdkBuilder.build()
}
