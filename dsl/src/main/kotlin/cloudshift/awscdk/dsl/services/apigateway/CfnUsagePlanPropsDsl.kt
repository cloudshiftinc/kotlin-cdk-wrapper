@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.apigateway

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.dsl.CfnTagDsl
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.apigateway.CfnUsagePlan
import software.amazon.awscdk.services.apigateway.CfnUsagePlanProps

@CdkDslMarker
public class CfnUsagePlanPropsDsl {
  private val cdkBuilder: CfnUsagePlanProps.Builder = CfnUsagePlanProps.builder()

  private val _apiStages: MutableList<Any> = mutableListOf()

  private val _tags: MutableList<CfnTag> = mutableListOf()

  /**
   * @param apiStages The associated API stages of a usage plan.
   */
  public fun apiStages(vararg apiStages: Any) {
    _apiStages.addAll(listOf(*apiStages))
  }

  /**
   * @param apiStages The associated API stages of a usage plan.
   */
  public fun apiStages(apiStages: Collection<Any>) {
    _apiStages.addAll(apiStages)
  }

  /**
   * @param apiStages The associated API stages of a usage plan.
   */
  public fun apiStages(apiStages: IResolvable) {
    cdkBuilder.apiStages(apiStages)
  }

  /**
   * @param description The description of a usage plan.
   */
  public fun description(description: String) {
    cdkBuilder.description(description)
  }

  /**
   * @param quota The target maximum number of permitted requests per a given unit time interval.
   */
  public fun quota(quota: IResolvable) {
    cdkBuilder.quota(quota)
  }

  /**
   * @param quota The target maximum number of permitted requests per a given unit time interval.
   */
  public fun quota(quota: CfnUsagePlan.QuotaSettingsProperty) {
    cdkBuilder.quota(quota)
  }

  /**
   * @param tags The collection of tags.
   * Each tag element is associated with a given resource.
   */
  public fun tags(tags: CfnTagDsl.() -> Unit) {
    _tags.add(CfnTagDsl().apply(tags).build())
  }

  /**
   * @param tags The collection of tags.
   * Each tag element is associated with a given resource.
   */
  public fun tags(tags: Collection<CfnTag>) {
    _tags.addAll(tags)
  }

  /**
   * @param throttle A map containing method level throttling information for API stage in a usage
   * plan.
   */
  public fun throttle(throttle: IResolvable) {
    cdkBuilder.throttle(throttle)
  }

  /**
   * @param throttle A map containing method level throttling information for API stage in a usage
   * plan.
   */
  public fun throttle(throttle: CfnUsagePlan.ThrottleSettingsProperty) {
    cdkBuilder.throttle(throttle)
  }

  /**
   * @param usagePlanName The name of a usage plan.
   */
  public fun usagePlanName(usagePlanName: String) {
    cdkBuilder.usagePlanName(usagePlanName)
  }

  public fun build(): CfnUsagePlanProps {
    if(_apiStages.isNotEmpty()) cdkBuilder.apiStages(_apiStages)
    if(_tags.isNotEmpty()) cdkBuilder.tags(_tags)
    return cdkBuilder.build()
  }
}
