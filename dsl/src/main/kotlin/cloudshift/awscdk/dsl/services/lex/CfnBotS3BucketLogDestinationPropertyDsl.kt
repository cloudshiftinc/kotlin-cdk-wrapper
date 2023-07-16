@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.lex

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.lex.CfnBot

@CdkDslMarker
public class CfnBotS3BucketLogDestinationPropertyDsl {
  private val cdkBuilder: CfnBot.S3BucketLogDestinationProperty.Builder =
      CfnBot.S3BucketLogDestinationProperty.builder()

  public fun kmsKeyArn(kmsKeyArn: String) {
    cdkBuilder.kmsKeyArn(kmsKeyArn)
  }

  public fun logPrefix(logPrefix: String) {
    cdkBuilder.logPrefix(logPrefix)
  }

  public fun s3BucketArn(s3BucketArn: String) {
    cdkBuilder.s3BucketArn(s3BucketArn)
  }

  public fun build(): CfnBot.S3BucketLogDestinationProperty = cdkBuilder.build()
}
