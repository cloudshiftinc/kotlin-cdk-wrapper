@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.connect

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.connect.CfnInstanceStorageConfig

@CdkDslMarker
public class CfnInstanceStorageConfigKinesisFirehoseConfigPropertyDsl {
  private val cdkBuilder: CfnInstanceStorageConfig.KinesisFirehoseConfigProperty.Builder =
      CfnInstanceStorageConfig.KinesisFirehoseConfigProperty.builder()

  /**
   * @param firehoseArn The Amazon Resource Name (ARN) of the delivery stream. 
   */
  public fun firehoseArn(firehoseArn: String) {
    cdkBuilder.firehoseArn(firehoseArn)
  }

  public fun build(): CfnInstanceStorageConfig.KinesisFirehoseConfigProperty = cdkBuilder.build()
}
