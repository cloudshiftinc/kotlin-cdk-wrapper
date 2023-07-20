@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.appmesh

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Unit
import software.amazon.awscdk.services.appmesh.CfnVirtualNode
import software.amazon.awscdk.services.appmesh.LoggingFormatConfig

@CdkDslMarker
public class LoggingFormatConfigDsl {
  private val cdkBuilder: LoggingFormatConfig.Builder = LoggingFormatConfig.builder()

  public fun formatConfig(block: CfnVirtualNodeLoggingFormatPropertyDsl.() -> Unit = {}) {
    val builder = CfnVirtualNodeLoggingFormatPropertyDsl()
    builder.apply(block)
    cdkBuilder.formatConfig(builder.build())
  }

  public fun formatConfig(formatConfig: CfnVirtualNode.LoggingFormatProperty) {
    cdkBuilder.formatConfig(formatConfig)
  }

  public fun build(): LoggingFormatConfig = cdkBuilder.build()
}
