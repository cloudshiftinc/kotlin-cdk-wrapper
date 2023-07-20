@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.route53

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.route53.CfnHealthCheck
import software.amazon.awscdk.services.route53.CfnHealthCheckProps

@CdkDslMarker
public class CfnHealthCheckPropsDsl {
  private val cdkBuilder: CfnHealthCheckProps.Builder = CfnHealthCheckProps.builder()

  private val _healthCheckTags: MutableList<Any> = mutableListOf()

  public fun healthCheckConfig(healthCheckConfig: IResolvable) {
    cdkBuilder.healthCheckConfig(healthCheckConfig)
  }

  public fun healthCheckConfig(healthCheckConfig: CfnHealthCheck.HealthCheckConfigProperty) {
    cdkBuilder.healthCheckConfig(healthCheckConfig)
  }

  public fun healthCheckTags(vararg healthCheckTags: Any) {
    _healthCheckTags.addAll(listOf(*healthCheckTags))
  }

  public fun healthCheckTags(healthCheckTags: Collection<Any>) {
    _healthCheckTags.addAll(healthCheckTags)
  }

  public fun healthCheckTags(healthCheckTags: IResolvable) {
    cdkBuilder.healthCheckTags(healthCheckTags)
  }

  public fun build(): CfnHealthCheckProps {
    if(_healthCheckTags.isNotEmpty()) cdkBuilder.healthCheckTags(_healthCheckTags)
    return cdkBuilder.build()
  }
}
