@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.apigateway

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.services.apigateway.QuotaSettings
import software.amazon.awscdk.services.apigateway.ThrottleSettings
import software.amazon.awscdk.services.apigateway.UsagePlan
import software.amazon.awscdk.services.apigateway.UsagePlanPerApiStage
import software.constructs.Construct

@CdkDslMarker
public class UsagePlanDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: UsagePlan.Builder = UsagePlan.Builder.create(scope, id)

  private val _apiStages: MutableList<UsagePlanPerApiStage> = mutableListOf()

  /**
   * API Stages to be associated with the usage plan.
   *
   * Default: none
   *
   * @param apiStages API Stages to be associated with the usage plan. 
   */
  public fun apiStages(apiStages: UsagePlanPerApiStageDsl.() -> Unit) {
    _apiStages.add(UsagePlanPerApiStageDsl().apply(apiStages).build())
  }

  /**
   * API Stages to be associated with the usage plan.
   *
   * Default: none
   *
   * @param apiStages API Stages to be associated with the usage plan. 
   */
  public fun apiStages(apiStages: Collection<UsagePlanPerApiStage>) {
    _apiStages.addAll(apiStages)
  }

  /**
   * Represents usage plan purpose.
   *
   * Default: none
   *
   * @param description Represents usage plan purpose. 
   */
  public fun description(description: String) {
    cdkBuilder.description(description)
  }

  /**
   * Name for this usage plan.
   *
   * Default: none
   *
   * @param name Name for this usage plan. 
   */
  public fun name(name: String) {
    cdkBuilder.name(name)
  }

  /**
   * Number of requests clients can make in a given time period.
   *
   * Default: none
   *
   * @param quota Number of requests clients can make in a given time period. 
   */
  public fun quota(quota: QuotaSettingsDsl.() -> Unit = {}) {
    val builder = QuotaSettingsDsl()
    builder.apply(quota)
    cdkBuilder.quota(builder.build())
  }

  /**
   * Number of requests clients can make in a given time period.
   *
   * Default: none
   *
   * @param quota Number of requests clients can make in a given time period. 
   */
  public fun quota(quota: QuotaSettings) {
    cdkBuilder.quota(quota)
  }

  /**
   * Overall throttle settings for the API.
   *
   * Default: none
   *
   * @param throttle Overall throttle settings for the API. 
   */
  public fun throttle(throttle: ThrottleSettingsDsl.() -> Unit = {}) {
    val builder = ThrottleSettingsDsl()
    builder.apply(throttle)
    cdkBuilder.throttle(builder.build())
  }

  /**
   * Overall throttle settings for the API.
   *
   * Default: none
   *
   * @param throttle Overall throttle settings for the API. 
   */
  public fun throttle(throttle: ThrottleSettings) {
    cdkBuilder.throttle(throttle)
  }

  public fun build(): UsagePlan {
    if(_apiStages.isNotEmpty()) cdkBuilder.apiStages(_apiStages)
    return cdkBuilder.build()
  }
}
