@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.lex

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.lex.CfnBotAlias

@CdkDslMarker
public class CfnBotAliasS3BucketLogDestinationPropertyDsl {
  private val cdkBuilder: CfnBotAlias.S3BucketLogDestinationProperty.Builder =
      CfnBotAlias.S3BucketLogDestinationProperty.builder()

  /**
   * @param kmsKeyArn The Amazon Resource Name (ARN) of an AWS Key Management Service (KMS) key for
   * encrypting audio log files stored in an Amazon S3 bucket.
   */
  public fun kmsKeyArn(kmsKeyArn: String) {
    cdkBuilder.kmsKeyArn(kmsKeyArn)
  }

  /**
   * @param logPrefix The S3 prefix to assign to audio log files. 
   */
  public fun logPrefix(logPrefix: String) {
    cdkBuilder.logPrefix(logPrefix)
  }

  /**
   * @param s3BucketArn The Amazon Resource Name (ARN) of an Amazon S3 bucket where audio log files
   * are stored. 
   */
  public fun s3BucketArn(s3BucketArn: String) {
    cdkBuilder.s3BucketArn(s3BucketArn)
  }

  public fun build(): CfnBotAlias.S3BucketLogDestinationProperty = cdkBuilder.build()
}
