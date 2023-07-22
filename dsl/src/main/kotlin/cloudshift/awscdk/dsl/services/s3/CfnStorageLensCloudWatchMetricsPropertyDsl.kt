@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.s3

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.s3.CfnStorageLens

@CdkDslMarker
public class CfnStorageLensCloudWatchMetricsPropertyDsl {
  private val cdkBuilder: CfnStorageLens.CloudWatchMetricsProperty.Builder =
      CfnStorageLens.CloudWatchMetricsProperty.builder()

  /**
   * @param isEnabled This property identifies whether the CloudWatch publishing option for S3
   * Storage Lens is enabled. 
   */
  public fun isEnabled(isEnabled: Boolean) {
    cdkBuilder.isEnabled(isEnabled)
  }

  /**
   * @param isEnabled This property identifies whether the CloudWatch publishing option for S3
   * Storage Lens is enabled. 
   */
  public fun isEnabled(isEnabled: IResolvable) {
    cdkBuilder.isEnabled(isEnabled)
  }

  public fun build(): CfnStorageLens.CloudWatchMetricsProperty = cdkBuilder.build()
}
