@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.appsync

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.appsync.AwsIamConfig

@CdkDslMarker
public class AwsIamConfigDsl {
  private val cdkBuilder: AwsIamConfig.Builder = AwsIamConfig.builder()

  /**
   * @param signingRegion The signing region for AWS IAM authorization. 
   */
  public fun signingRegion(signingRegion: String) {
    cdkBuilder.signingRegion(signingRegion)
  }

  /**
   * @param signingServiceName The signing service name for AWS IAM authorization. 
   */
  public fun signingServiceName(signingServiceName: String) {
    cdkBuilder.signingServiceName(signingServiceName)
  }

  public fun build(): AwsIamConfig = cdkBuilder.build()
}
