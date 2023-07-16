@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.ecs

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Unit
import software.amazon.awscdk.services.ecs.ExecuteCommandConfiguration
import software.amazon.awscdk.services.ecs.ExecuteCommandLogConfiguration
import software.amazon.awscdk.services.ecs.ExecuteCommandLogging
import software.amazon.awscdk.services.kms.IKey

@CdkDslMarker
public class ExecuteCommandConfigurationDsl {
  private val cdkBuilder: ExecuteCommandConfiguration.Builder =
      ExecuteCommandConfiguration.builder()

  public fun kmsKey(kmsKey: IKey) {
    cdkBuilder.kmsKey(kmsKey)
  }

  public fun logConfiguration(block: ExecuteCommandLogConfigurationDsl.() -> Unit = {}) {
    val builder = ExecuteCommandLogConfigurationDsl()
    builder.apply(block)
    cdkBuilder.logConfiguration(builder.build())
  }

  public fun logConfiguration(logConfiguration: ExecuteCommandLogConfiguration) {
    cdkBuilder.logConfiguration(logConfiguration)
  }

  public fun logging(logging: ExecuteCommandLogging) {
    cdkBuilder.logging(logging)
  }

  public fun build(): ExecuteCommandConfiguration = cdkBuilder.build()
}
