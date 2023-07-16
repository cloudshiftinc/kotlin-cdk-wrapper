@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnDashboard

@CdkDslMarker
public class CfnDashboardCustomActionNavigationOperationPropertyDsl {
  private val cdkBuilder: CfnDashboard.CustomActionNavigationOperationProperty.Builder =
      CfnDashboard.CustomActionNavigationOperationProperty.builder()

  public fun localNavigationConfiguration(localNavigationConfiguration: IResolvable) {
    cdkBuilder.localNavigationConfiguration(localNavigationConfiguration)
  }

  public
      fun localNavigationConfiguration(localNavigationConfiguration: CfnDashboard.LocalNavigationConfigurationProperty) {
    cdkBuilder.localNavigationConfiguration(localNavigationConfiguration)
  }

  public fun build(): CfnDashboard.CustomActionNavigationOperationProperty = cdkBuilder.build()
}
