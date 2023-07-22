@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.apigateway

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.services.apigateway.QuotaSettings
import software.amazon.awscdk.services.apigateway.ThrottleSettings
import software.amazon.awscdk.services.apigateway.UsagePlanPerApiStage
import software.amazon.awscdk.services.apigateway.UsagePlanProps

@CdkDslMarker
public class UsagePlanPropsDsl {
  private val cdkBuilder: UsagePlanProps.Builder = UsagePlanProps.builder()

  private val _apiStages: MutableList<UsagePlanPerApiStage> = mutableListOf()

  /**
   * @param apiStages API Stages to be associated with the usage plan.
   */
  public fun apiStages(apiStages: UsagePlanPerApiStageDsl.() -> Unit) {
    _apiStages.add(UsagePlanPerApiStageDsl().apply(apiStages).build())
  }

  /**
   * @param apiStages API Stages to be associated with the usage plan.
   */
  public fun apiStages(apiStages: Collection<UsagePlanPerApiStage>) {
    _apiStages.addAll(apiStages)
  }

  /**
   * @param description Represents usage plan purpose.
   */
  public fun description(description: String) {
    cdkBuilder.description(description)
  }

  /**
   * @param name Name for this usage plan.
   */
  public fun name(name: String) {
    cdkBuilder.name(name)
  }

  /**
   * @param quota Number of requests clients can make in a given time period.
   */
  public fun quota(quota: QuotaSettingsDsl.() -> Unit = {}) {
    val builder = QuotaSettingsDsl()
    builder.apply(quota)
    cdkBuilder.quota(builder.build())
  }

  /**
   * @param quota Number of requests clients can make in a given time period.
   */
  public fun quota(quota: QuotaSettings) {
    cdkBuilder.quota(quota)
  }

  /**
   * @param throttle Overall throttle settings for the API.
   */
  public fun throttle(throttle: ThrottleSettingsDsl.() -> Unit = {}) {
    val builder = ThrottleSettingsDsl()
    builder.apply(throttle)
    cdkBuilder.throttle(builder.build())
  }

  /**
   * @param throttle Overall throttle settings for the API.
   */
  public fun throttle(throttle: ThrottleSettings) {
    cdkBuilder.throttle(throttle)
  }

  public fun build(): UsagePlanProps {
    if(_apiStages.isNotEmpty()) cdkBuilder.apiStages(_apiStages)
    return cdkBuilder.build()
  }
}
