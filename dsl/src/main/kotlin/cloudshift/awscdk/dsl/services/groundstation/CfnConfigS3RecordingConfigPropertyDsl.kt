@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.groundstation

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.groundstation.CfnConfig

@CdkDslMarker
public class CfnConfigS3RecordingConfigPropertyDsl {
  private val cdkBuilder: CfnConfig.S3RecordingConfigProperty.Builder =
      CfnConfig.S3RecordingConfigProperty.builder()

  /**
   * @param bucketArn S3 Bucket where the data is written.
   * The name of the S3 Bucket provided must begin with `aws-groundstation` .
   */
  public fun bucketArn(bucketArn: String) {
    cdkBuilder.bucketArn(bucketArn)
  }

  /**
   * @param prefix The prefix of the S3 data object.
   * If you choose to use any optional keys for substitution, these values will be replaced with the
   * corresponding information from your contact details. For example, a prefix of
   * `{satellite_id}/{year}/{month}/{day}/` will replaced with `fake_satellite_id/2021/01/10/`
   *
   * *Optional keys for substitution* : `{satellite_id}` | `{config-name}` | `{config-id}` |
   * `{year}` | `{month}` | `{day}`
   */
  public fun prefix(prefix: String) {
    cdkBuilder.prefix(prefix)
  }

  /**
   * @param roleArn Defines the ARN of the role assumed for putting archives to S3.
   */
  public fun roleArn(roleArn: String) {
    cdkBuilder.roleArn(roleArn)
  }

  public fun build(): CfnConfig.S3RecordingConfigProperty = cdkBuilder.build()
}
