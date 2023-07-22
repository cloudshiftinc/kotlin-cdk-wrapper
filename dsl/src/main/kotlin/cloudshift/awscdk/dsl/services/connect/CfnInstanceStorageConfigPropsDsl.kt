@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.connect

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.connect.CfnInstanceStorageConfig
import software.amazon.awscdk.services.connect.CfnInstanceStorageConfigProps

@CdkDslMarker
public class CfnInstanceStorageConfigPropsDsl {
  private val cdkBuilder: CfnInstanceStorageConfigProps.Builder =
      CfnInstanceStorageConfigProps.builder()

  /**
   * @param instanceArn The Amazon Resource Name (ARN) of the instance. 
   */
  public fun instanceArn(instanceArn: String) {
    cdkBuilder.instanceArn(instanceArn)
  }

  /**
   * @param kinesisFirehoseConfig The configuration of the Kinesis Firehose delivery stream.
   */
  public fun kinesisFirehoseConfig(kinesisFirehoseConfig: IResolvable) {
    cdkBuilder.kinesisFirehoseConfig(kinesisFirehoseConfig)
  }

  /**
   * @param kinesisFirehoseConfig The configuration of the Kinesis Firehose delivery stream.
   */
  public
      fun kinesisFirehoseConfig(kinesisFirehoseConfig: CfnInstanceStorageConfig.KinesisFirehoseConfigProperty) {
    cdkBuilder.kinesisFirehoseConfig(kinesisFirehoseConfig)
  }

  /**
   * @param kinesisStreamConfig The configuration of the Kinesis data stream.
   */
  public fun kinesisStreamConfig(kinesisStreamConfig: IResolvable) {
    cdkBuilder.kinesisStreamConfig(kinesisStreamConfig)
  }

  /**
   * @param kinesisStreamConfig The configuration of the Kinesis data stream.
   */
  public
      fun kinesisStreamConfig(kinesisStreamConfig: CfnInstanceStorageConfig.KinesisStreamConfigProperty) {
    cdkBuilder.kinesisStreamConfig(kinesisStreamConfig)
  }

  /**
   * @param kinesisVideoStreamConfig The configuration of the Kinesis video stream.
   */
  public fun kinesisVideoStreamConfig(kinesisVideoStreamConfig: IResolvable) {
    cdkBuilder.kinesisVideoStreamConfig(kinesisVideoStreamConfig)
  }

  /**
   * @param kinesisVideoStreamConfig The configuration of the Kinesis video stream.
   */
  public
      fun kinesisVideoStreamConfig(kinesisVideoStreamConfig: CfnInstanceStorageConfig.KinesisVideoStreamConfigProperty) {
    cdkBuilder.kinesisVideoStreamConfig(kinesisVideoStreamConfig)
  }

  /**
   * @param resourceType A valid resource type. 
   * Following are the valid resource types: `CHAT_TRANSCRIPTS` | `CALL_RECORDINGS` |
   * `SCHEDULED_REPORTS` | `MEDIA_STREAMS` | `CONTACT_TRACE_RECORDS` | `AGENT_EVENTS`
   */
  public fun resourceType(resourceType: String) {
    cdkBuilder.resourceType(resourceType)
  }

  /**
   * @param s3Config The S3 bucket configuration.
   */
  public fun s3Config(s3Config: IResolvable) {
    cdkBuilder.s3Config(s3Config)
  }

  /**
   * @param s3Config The S3 bucket configuration.
   */
  public fun s3Config(s3Config: CfnInstanceStorageConfig.S3ConfigProperty) {
    cdkBuilder.s3Config(s3Config)
  }

  /**
   * @param storageType A valid storage type. 
   */
  public fun storageType(storageType: String) {
    cdkBuilder.storageType(storageType)
  }

  public fun build(): CfnInstanceStorageConfigProps = cdkBuilder.build()
}
