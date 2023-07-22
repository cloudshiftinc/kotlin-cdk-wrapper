@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.ecs

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.services.ecs.CfnTaskDefinition

@CdkDslMarker
public class CfnTaskDefinitionHealthCheckPropertyDsl {
  private val cdkBuilder: CfnTaskDefinition.HealthCheckProperty.Builder =
      CfnTaskDefinition.HealthCheckProperty.builder()

  private val _command: MutableList<String> = mutableListOf()

  /**
   * @param command A string array representing the command that the container runs to determine if
   * it is healthy.
   * The string array must start with `CMD` to run the command arguments directly, or `CMD-SHELL` to
   * run the command with the container's default shell.
   *
   * When you use the AWS Management Console JSON panel, the AWS Command Line Interface , or the
   * APIs, enclose the list of commands in double quotes and brackets.
   *
   * `[ "CMD-SHELL", "curl -f http://localhost/ || exit 1" ]`
   *
   * You don't include the double quotes and brackets when you use the AWS Management Console.
   *
   * `CMD-SHELL, curl -f http://localhost/ || exit 1`
   *
   * An exit code of 0 indicates success, and non-zero exit code indicates failure. For more
   * information, see `HealthCheck` in the [Create a
   * container](https://docs.aws.amazon.com/https://docs.docker.com/engine/api/v1.35/#operation/ContainerCreate)
   * section of the [Docker Remote
   * API](https://docs.aws.amazon.com/https://docs.docker.com/engine/api/v1.35/) .
   */
  public fun command(vararg command: String) {
    _command.addAll(listOf(*command))
  }

  /**
   * @param command A string array representing the command that the container runs to determine if
   * it is healthy.
   * The string array must start with `CMD` to run the command arguments directly, or `CMD-SHELL` to
   * run the command with the container's default shell.
   *
   * When you use the AWS Management Console JSON panel, the AWS Command Line Interface , or the
   * APIs, enclose the list of commands in double quotes and brackets.
   *
   * `[ "CMD-SHELL", "curl -f http://localhost/ || exit 1" ]`
   *
   * You don't include the double quotes and brackets when you use the AWS Management Console.
   *
   * `CMD-SHELL, curl -f http://localhost/ || exit 1`
   *
   * An exit code of 0 indicates success, and non-zero exit code indicates failure. For more
   * information, see `HealthCheck` in the [Create a
   * container](https://docs.aws.amazon.com/https://docs.docker.com/engine/api/v1.35/#operation/ContainerCreate)
   * section of the [Docker Remote
   * API](https://docs.aws.amazon.com/https://docs.docker.com/engine/api/v1.35/) .
   */
  public fun command(command: Collection<String>) {
    _command.addAll(command)
  }

  /**
   * @param interval The time period in seconds between each health check execution.
   * You may specify between 5 and 300 seconds. The default value is 30 seconds.
   */
  public fun interval(interval: Number) {
    cdkBuilder.interval(interval)
  }

  /**
   * @param retries The number of times to retry a failed health check before the container is
   * considered unhealthy.
   * You may specify between 1 and 10 retries. The default value is 3.
   */
  public fun retries(retries: Number) {
    cdkBuilder.retries(retries)
  }

  /**
   * @param startPeriod The optional grace period to provide containers time to bootstrap before
   * failed health checks count towards the maximum number of retries.
   * You can specify between 0 and 300 seconds. By default, the `startPeriod` is off.
   *
   *
   * If a health check succeeds within the `startPeriod` , then the container is considered healthy
   * and any subsequent failures count toward the maximum number of retries.
   */
  public fun startPeriod(startPeriod: Number) {
    cdkBuilder.startPeriod(startPeriod)
  }

  /**
   * @param timeout The time period in seconds to wait for a health check to succeed before it is
   * considered a failure.
   * You may specify between 2 and 60 seconds. The default value is 5.
   */
  public fun timeout(timeout: Number) {
    cdkBuilder.timeout(timeout)
  }

  public fun build(): CfnTaskDefinition.HealthCheckProperty {
    if(_command.isNotEmpty()) cdkBuilder.command(_command)
    return cdkBuilder.build()
  }
}
