@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.ssm

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.ssm.CfnMaintenanceWindowTask

@CdkDslMarker
public class CfnMaintenanceWindowTaskLoggingInfoPropertyDsl {
  private val cdkBuilder: CfnMaintenanceWindowTask.LoggingInfoProperty.Builder =
      CfnMaintenanceWindowTask.LoggingInfoProperty.builder()

  public fun region(region: String) {
    cdkBuilder.region(region)
  }

  public fun s3Bucket(s3Bucket: String) {
    cdkBuilder.s3Bucket(s3Bucket)
  }

  public fun s3Prefix(s3Prefix: String) {
    cdkBuilder.s3Prefix(s3Prefix)
  }

  public fun build(): CfnMaintenanceWindowTask.LoggingInfoProperty = cdkBuilder.build()
}
