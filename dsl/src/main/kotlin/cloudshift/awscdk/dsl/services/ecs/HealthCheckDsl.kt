@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.ecs

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.Duration
import software.amazon.awscdk.services.ecs.HealthCheck

@CdkDslMarker
public class HealthCheckDsl {
  private val cdkBuilder: HealthCheck.Builder = HealthCheck.builder()

  private val _command: MutableList<String> = mutableListOf()

  public fun command(vararg command: String) {
    _command.addAll(listOf(*command))
  }

  public fun command(command: Collection<String>) {
    _command.addAll(command)
  }

  public fun interval(interval: Duration) {
    cdkBuilder.interval(interval)
  }

  public fun retries(retries: Number) {
    cdkBuilder.retries(retries)
  }

  public fun startPeriod(startPeriod: Duration) {
    cdkBuilder.startPeriod(startPeriod)
  }

  public fun timeout(timeout: Duration) {
    cdkBuilder.timeout(timeout)
  }

  public fun build(): HealthCheck {
    if(_command.isNotEmpty()) cdkBuilder.command(_command)
    return cdkBuilder.build()
  }
}
