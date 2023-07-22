@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.connect

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.connect.CfnInstanceStorageConfig

@CdkDslMarker
public class CfnInstanceStorageConfigKinesisStreamConfigPropertyDsl {
  private val cdkBuilder: CfnInstanceStorageConfig.KinesisStreamConfigProperty.Builder =
      CfnInstanceStorageConfig.KinesisStreamConfigProperty.builder()

  /**
   * @param streamArn The Amazon Resource Name (ARN) of the data stream. 
   */
  public fun streamArn(streamArn: String) {
    cdkBuilder.streamArn(streamArn)
  }

  public fun build(): CfnInstanceStorageConfig.KinesisStreamConfigProperty = cdkBuilder.build()
}
