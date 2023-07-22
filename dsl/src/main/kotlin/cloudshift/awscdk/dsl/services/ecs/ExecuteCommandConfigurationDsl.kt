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

  /**
   * @param kmsKey The AWS Key Management Service key ID to encrypt the data between the local
   * client and the container.
   */
  public fun kmsKey(kmsKey: IKey) {
    cdkBuilder.kmsKey(kmsKey)
  }

  /**
   * @param logConfiguration The log configuration for the results of the execute command actions.
   * The logs can be sent to CloudWatch Logs or an Amazon S3 bucket.
   */
  public fun logConfiguration(logConfiguration: ExecuteCommandLogConfigurationDsl.() -> Unit = {}) {
    val builder = ExecuteCommandLogConfigurationDsl()
    builder.apply(logConfiguration)
    cdkBuilder.logConfiguration(builder.build())
  }

  /**
   * @param logConfiguration The log configuration for the results of the execute command actions.
   * The logs can be sent to CloudWatch Logs or an Amazon S3 bucket.
   */
  public fun logConfiguration(logConfiguration: ExecuteCommandLogConfiguration) {
    cdkBuilder.logConfiguration(logConfiguration)
  }

  /**
   * @param logging The log settings to use for logging the execute command session.
   */
  public fun logging(logging: ExecuteCommandLogging) {
    cdkBuilder.logging(logging)
  }

  public fun build(): ExecuteCommandConfiguration = cdkBuilder.build()
}
