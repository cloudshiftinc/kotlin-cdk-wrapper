@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.appsync

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.appsync.CfnDataSource

@CdkDslMarker
public class CfnDataSourceAwsIamConfigPropertyDsl {
  private val cdkBuilder: CfnDataSource.AwsIamConfigProperty.Builder =
      CfnDataSource.AwsIamConfigProperty.builder()

  /**
   * @param signingRegion The signing Region for AWS Identity and Access Management authorization.
   */
  public fun signingRegion(signingRegion: String) {
    cdkBuilder.signingRegion(signingRegion)
  }

  /**
   * @param signingServiceName The signing service name for AWS Identity and Access Management
   * authorization.
   */
  public fun signingServiceName(signingServiceName: String) {
    cdkBuilder.signingServiceName(signingServiceName)
  }

  public fun build(): CfnDataSource.AwsIamConfigProperty = cdkBuilder.build()
}
