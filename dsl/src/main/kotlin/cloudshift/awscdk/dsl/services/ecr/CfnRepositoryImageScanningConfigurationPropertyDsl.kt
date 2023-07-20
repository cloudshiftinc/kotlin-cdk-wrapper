@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.ecr

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.ecr.CfnRepository

@CdkDslMarker
public class CfnRepositoryImageScanningConfigurationPropertyDsl {
  private val cdkBuilder: CfnRepository.ImageScanningConfigurationProperty.Builder =
      CfnRepository.ImageScanningConfigurationProperty.builder()

  public fun scanOnPush(scanOnPush: Boolean) {
    cdkBuilder.scanOnPush(scanOnPush)
  }

  public fun scanOnPush(scanOnPush: IResolvable) {
    cdkBuilder.scanOnPush(scanOnPush)
  }

  public fun build(): CfnRepository.ImageScanningConfigurationProperty = cdkBuilder.build()
}
