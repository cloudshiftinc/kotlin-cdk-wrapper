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

  /**
   * @param dataConfiguration The data configuration of the reference line. 
   */
  public fun dataConfiguration(dataConfiguration: IResolvable) {
    cdkBuilder.dataConfiguration(dataConfiguration)
  }

  /**
   * @param dataConfiguration The data configuration of the reference line. 
   */
  public
      fun dataConfiguration(dataConfiguration: CfnDashboard.ReferenceLineDataConfigurationProperty) {
    cdkBuilder.dataConfiguration(dataConfiguration)
  }

  /**
   * @param labelConfiguration The label configuration of the reference line.
   */
  public fun labelConfiguration(labelConfiguration: IResolvable) {
    cdkBuilder.labelConfiguration(labelConfiguration)
  }

  /**
   * @param labelConfiguration The label configuration of the reference line.
   */
  public
      fun labelConfiguration(labelConfiguration: CfnDashboard.ReferenceLineLabelConfigurationProperty) {
    cdkBuilder.labelConfiguration(labelConfiguration)
  }

  /**
   * @param status The status of the reference line. Choose one of the following options:.
   * * `ENABLE`
   * * `DISABLE`
   */
  public fun status(status: String) {
    cdkBuilder.status(status)
  }

  /**
   * @param styleConfiguration The style configuration of the reference line.
   */
  public fun styleConfiguration(styleConfiguration: IResolvable) {
    cdkBuilder.styleConfiguration(styleConfiguration)
  }

  /**
   * @param styleConfiguration The style configuration of the reference line.
   */
  public
      fun styleConfiguration(styleConfiguration: CfnDashboard.ReferenceLineStyleConfigurationProperty) {
    cdkBuilder.styleConfiguration(styleConfiguration)
  }

  public fun build(): CfnDashboard.ReferenceLineProperty = cdkBuilder.build()
}
