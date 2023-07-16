@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnDashboard

@CdkDslMarker
public class CfnDashboardReferenceLinePropertyDsl {
  private val cdkBuilder: CfnDashboard.ReferenceLineProperty.Builder =
      CfnDashboard.ReferenceLineProperty.builder()

  public fun dataConfiguration(dataConfiguration: IResolvable) {
    cdkBuilder.dataConfiguration(dataConfiguration)
  }

  public
      fun dataConfiguration(dataConfiguration: CfnDashboard.ReferenceLineDataConfigurationProperty) {
    cdkBuilder.dataConfiguration(dataConfiguration)
  }

  public fun labelConfiguration(labelConfiguration: IResolvable) {
    cdkBuilder.labelConfiguration(labelConfiguration)
  }

  public
      fun labelConfiguration(labelConfiguration: CfnDashboard.ReferenceLineLabelConfigurationProperty) {
    cdkBuilder.labelConfiguration(labelConfiguration)
  }

  public fun status(status: String) {
    cdkBuilder.status(status)
  }

  public fun styleConfiguration(styleConfiguration: IResolvable) {
    cdkBuilder.styleConfiguration(styleConfiguration)
  }

  public
      fun styleConfiguration(styleConfiguration: CfnDashboard.ReferenceLineStyleConfigurationProperty) {
    cdkBuilder.styleConfiguration(styleConfiguration)
  }

  public fun build(): CfnDashboard.ReferenceLineProperty = cdkBuilder.build()
}
