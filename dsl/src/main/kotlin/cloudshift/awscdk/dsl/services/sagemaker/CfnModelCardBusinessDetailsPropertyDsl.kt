@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.sagemaker

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.sagemaker.CfnModelCard

@CdkDslMarker
public class CfnModelCardBusinessDetailsPropertyDsl {
  private val cdkBuilder: CfnModelCard.BusinessDetailsProperty.Builder =
      CfnModelCard.BusinessDetailsProperty.builder()

  public fun businessProblem(businessProblem: String) {
    cdkBuilder.businessProblem(businessProblem)
  }

  public fun businessStakeholders(businessStakeholders: String) {
    cdkBuilder.businessStakeholders(businessStakeholders)
  }

  public fun lineOfBusiness(lineOfBusiness: String) {
    cdkBuilder.lineOfBusiness(lineOfBusiness)
  }

  public fun build(): CfnModelCard.BusinessDetailsProperty = cdkBuilder.build()
}
