@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.lex

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.lex.CfnBot

@CdkDslMarker
public class CfnBotAudioLogDestinationPropertyDsl {
  private val cdkBuilder: CfnBot.AudioLogDestinationProperty.Builder =
      CfnBot.AudioLogDestinationProperty.builder()

  public fun s3Bucket(s3Bucket: IResolvable) {
    cdkBuilder.s3Bucket(s3Bucket)
  }

  public fun s3Bucket(s3Bucket: CfnBot.S3BucketLogDestinationProperty) {
    cdkBuilder.s3Bucket(s3Bucket)
  }

  public fun build(): CfnBot.AudioLogDestinationProperty = cdkBuilder.build()
}
