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
