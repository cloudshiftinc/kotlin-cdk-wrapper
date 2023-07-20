@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.ssmincidents

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.ssmincidents.CfnResponsePlan

@CdkDslMarker
public class CfnResponsePlanDynamicSsmParameterPropertyDsl {
  private val cdkBuilder: CfnResponsePlan.DynamicSsmParameterProperty.Builder =
      CfnResponsePlan.DynamicSsmParameterProperty.builder()

  public fun key(key: String) {
    cdkBuilder.key(key)
  }

  public fun `value`(`value`: IResolvable) {
    cdkBuilder.`value`(`value`)
  }

  public fun `value`(`value`: CfnResponsePlan.DynamicSsmParameterValueProperty) {
    cdkBuilder.`value`(`value`)
  }

  public fun build(): CfnResponsePlan.DynamicSsmParameterProperty = cdkBuilder.build()
}
