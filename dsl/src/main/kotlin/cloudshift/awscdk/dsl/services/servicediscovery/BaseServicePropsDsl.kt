@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.servicediscovery

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.servicediscovery.BaseServiceProps
import software.amazon.awscdk.services.servicediscovery.HealthCheckConfig
import software.amazon.awscdk.services.servicediscovery.HealthCheckCustomConfig

@CdkDslMarker
public class BaseServicePropsDsl {
  private val cdkBuilder: BaseServiceProps.Builder = BaseServiceProps.builder()

  public fun customHealthCheck(block: HealthCheckCustomConfigDsl.() -> Unit = {}) {
    val builder = HealthCheckCustomConfigDsl()
    builder.apply(block)
    cdkBuilder.customHealthCheck(builder.build())
  }

  public fun customHealthCheck(customHealthCheck: HealthCheckCustomConfig) {
    cdkBuilder.customHealthCheck(customHealthCheck)
  }

  public fun description(description: String) {
    cdkBuilder.description(description)
  }

  public fun healthCheck(block: HealthCheckConfigDsl.() -> Unit = {}) {
    val builder = HealthCheckConfigDsl()
    builder.apply(block)
    cdkBuilder.healthCheck(builder.build())
  }

  public fun healthCheck(healthCheck: HealthCheckConfig) {
    cdkBuilder.healthCheck(healthCheck)
  }

  public fun name(name: String) {
    cdkBuilder.name(name)
  }

  public fun build(): BaseServiceProps = cdkBuilder.build()
}
