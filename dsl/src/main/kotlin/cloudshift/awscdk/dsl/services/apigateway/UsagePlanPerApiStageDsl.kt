@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.apigateway

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.services.apigateway.IRestApi
import software.amazon.awscdk.services.apigateway.Stage
import software.amazon.awscdk.services.apigateway.ThrottlingPerMethod
import software.amazon.awscdk.services.apigateway.UsagePlanPerApiStage

/**
 * Represents the API stages that a usage plan applies to.
 *
 * Example:
 *
 * ```
 * UsagePlan plan;
 * RestApi api;
 * Method echoMethod;
 * plan.addApiStage(UsagePlanPerApiStage.builder()
 * .stage(api.getDeploymentStage())
 * .throttle(List.of(ThrottlingPerMethod.builder()
 * .method(echoMethod)
 * .throttle(ThrottleSettings.builder()
 * .rateLimit(10)
 * .burstLimit(2)
 * .build())
 * .build()))
 * .build());
 * ```
 */
@CdkDslMarker
public class UsagePlanPerApiStageDsl {
  private val cdkBuilder: UsagePlanPerApiStage.Builder = UsagePlanPerApiStage.builder()

  private val _throttle: MutableList<ThrottlingPerMethod> = mutableListOf()

  /**
   * @param api the value to be set.
   */
  public fun api(api: IRestApi) {
    cdkBuilder.api(api)
  }

  /**
   * @param stage [disable-awslint:ref-via-interface].
   */
  public fun stage(stage: Stage) {
    cdkBuilder.stage(stage)
  }

  /**
   * @param throttle the value to be set.
   */
  public fun throttle(throttle: ThrottlingPerMethodDsl.() -> Unit) {
    _throttle.add(ThrottlingPerMethodDsl().apply(throttle).build())
  }

  /**
   * @param throttle the value to be set.
   */
  public fun throttle(throttle: Collection<ThrottlingPerMethod>) {
    _throttle.addAll(throttle)
  }

  public fun build(): UsagePlanPerApiStage {
    if(_throttle.isNotEmpty()) cdkBuilder.throttle(_throttle)
    return cdkBuilder.build()
  }
}
