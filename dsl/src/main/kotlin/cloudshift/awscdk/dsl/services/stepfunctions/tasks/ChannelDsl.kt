@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.stepfunctions.tasks

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.stepfunctions.tasks.Channel
import software.amazon.awscdk.services.stepfunctions.tasks.CompressionType
import software.amazon.awscdk.services.stepfunctions.tasks.DataSource
import software.amazon.awscdk.services.stepfunctions.tasks.InputMode
import software.amazon.awscdk.services.stepfunctions.tasks.RecordWrapperType
import software.amazon.awscdk.services.stepfunctions.tasks.ShuffleConfig

@CdkDslMarker
public class ChannelDsl {
  private val cdkBuilder: Channel.Builder = Channel.builder()

  public fun channelName(channelName: String) {
    cdkBuilder.channelName(channelName)
  }

  public fun compressionType(compressionType: CompressionType) {
    cdkBuilder.compressionType(compressionType)
  }

  public fun contentType(contentType: String) {
    cdkBuilder.contentType(contentType)
  }

  public fun dataSource(block: DataSourceDsl.() -> Unit = {}) {
    val builder = DataSourceDsl()
    builder.apply(block)
    cdkBuilder.dataSource(builder.build())
  }

  public fun dataSource(dataSource: DataSource) {
    cdkBuilder.dataSource(dataSource)
  }

  public fun inputMode(inputMode: InputMode) {
    cdkBuilder.inputMode(inputMode)
  }

  public fun recordWrapperType(recordWrapperType: RecordWrapperType) {
    cdkBuilder.recordWrapperType(recordWrapperType)
  }

  public fun shuffleConfig(block: ShuffleConfigDsl.() -> Unit = {}) {
    val builder = ShuffleConfigDsl()
    builder.apply(block)
    cdkBuilder.shuffleConfig(builder.build())
  }

  public fun shuffleConfig(shuffleConfig: ShuffleConfig) {
    cdkBuilder.shuffleConfig(shuffleConfig)
  }

  public fun build(): Channel = cdkBuilder.build()
}
