@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.cognito

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.cognito.CfnUserPoolDomain

@CdkDslMarker
public class CfnUserPoolDomainCustomDomainConfigTypePropertyDsl {
  private val cdkBuilder: CfnUserPoolDomain.CustomDomainConfigTypeProperty.Builder =
      CfnUserPoolDomain.CustomDomainConfigTypeProperty.builder()

  public fun certificateArn(certificateArn: String) {
    cdkBuilder.certificateArn(certificateArn)
  }

  public fun build(): CfnUserPoolDomain.CustomDomainConfigTypeProperty = cdkBuilder.build()
}
