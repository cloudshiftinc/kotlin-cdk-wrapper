@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.guardduty

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.guardduty.CfnDetector

@CdkDslMarker
public class CfnDetectorCFNS3LogsConfigurationPropertyDsl {
  private val cdkBuilder: CfnDetector.CFNS3LogsConfigurationProperty.Builder =
      CfnDetector.CFNS3LogsConfigurationProperty.builder()

  /**
   * @param enable The status of S3 data event logs as a data source.
   */
  public fun enable(enable: Boolean) {
    cdkBuilder.enable(enable)
  }

  /**
   * @param enable The status of S3 data event logs as a data source.
   */
  public fun enable(enable: IResolvable) {
    cdkBuilder.enable(enable)
  }

  public fun build(): CfnDetector.CFNS3LogsConfigurationProperty = cdkBuilder.build()
}
