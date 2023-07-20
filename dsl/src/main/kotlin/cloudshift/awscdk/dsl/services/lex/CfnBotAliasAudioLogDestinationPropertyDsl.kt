@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.lex

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.lex.CfnBotAlias

@CdkDslMarker
public class CfnBotAliasAudioLogDestinationPropertyDsl {
  private val cdkBuilder: CfnBotAlias.AudioLogDestinationProperty.Builder =
      CfnBotAlias.AudioLogDestinationProperty.builder()

  public fun s3Bucket(s3Bucket: IResolvable) {
    cdkBuilder.s3Bucket(s3Bucket)
  }

  public fun s3Bucket(s3Bucket: CfnBotAlias.S3BucketLogDestinationProperty) {
    cdkBuilder.s3Bucket(s3Bucket)
  }

  public fun build(): CfnBotAlias.AudioLogDestinationProperty = cdkBuilder.build()
}
