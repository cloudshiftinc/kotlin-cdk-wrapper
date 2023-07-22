@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.connect

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.connect.CfnInstanceStorageConfig

@CdkDslMarker
public class CfnInstanceStorageConfigKinesisVideoStreamConfigPropertyDsl {
  private val cdkBuilder: CfnInstanceStorageConfig.KinesisVideoStreamConfigProperty.Builder =
      CfnInstanceStorageConfig.KinesisVideoStreamConfigProperty.builder()

  /**
   * @param encryptionConfig The encryption configuration.
   */
  public fun encryptionConfig(encryptionConfig: IResolvable) {
    cdkBuilder.encryptionConfig(encryptionConfig)
  }

  /**
   * @param encryptionConfig The encryption configuration.
   */
  public fun encryptionConfig(encryptionConfig: CfnInstanceStorageConfig.EncryptionConfigProperty) {
    cdkBuilder.encryptionConfig(encryptionConfig)
  }

  /**
   * @param prefix The prefix of the video stream. 
   */
  public fun prefix(prefix: String) {
    cdkBuilder.prefix(prefix)
  }

  /**
   * @param retentionPeriodHours The number of hours data is retained in the stream. 
   * Kinesis Video Streams retains the data in a data store that is associated with the stream.
   *
   * The default value is 0, indicating that the stream does not persist data.
   */
  public fun retentionPeriodHours(retentionPeriodHours: Number) {
    cdkBuilder.retentionPeriodHours(retentionPeriodHours)
  }

  public fun build(): CfnInstanceStorageConfig.KinesisVideoStreamConfigProperty = cdkBuilder.build()
}
