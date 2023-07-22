@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.s3

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.s3.CfnStorageLens

@CdkDslMarker
public class CfnStorageLensAwsOrgPropertyDsl {
  private val cdkBuilder: CfnStorageLens.AwsOrgProperty.Builder =
      CfnStorageLens.AwsOrgProperty.builder()

  /**
   * @param arn This resource contains the ARN of the AWS Organization. 
   */
  public fun arn(arn: String) {
    cdkBuilder.arn(arn)
  }

  public fun build(): CfnStorageLens.AwsOrgProperty = cdkBuilder.build()
}
