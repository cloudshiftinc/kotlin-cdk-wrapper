@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.apprunner

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.apprunner.CfnService

@CdkDslMarker
public class CfnServiceIngressConfigurationPropertyDsl {
  private val cdkBuilder: CfnService.IngressConfigurationProperty.Builder =
      CfnService.IngressConfigurationProperty.builder()

  /**
   * @param isPubliclyAccessible Specifies whether your App Runner service is publicly accessible. 
   * To make the service publicly accessible set it to `True` . To make the service privately
   * accessible, from only within an Amazon VPC set it to `False` .
   */
  public fun isPubliclyAccessible(isPubliclyAccessible: Boolean) {
    cdkBuilder.isPubliclyAccessible(isPubliclyAccessible)
  }

  /**
   * @param isPubliclyAccessible Specifies whether your App Runner service is publicly accessible. 
   * To make the service publicly accessible set it to `True` . To make the service privately
   * accessible, from only within an Amazon VPC set it to `False` .
   */
  public fun isPubliclyAccessible(isPubliclyAccessible: IResolvable) {
    cdkBuilder.isPubliclyAccessible(isPubliclyAccessible)
  }

  public fun build(): CfnService.IngressConfigurationProperty = cdkBuilder.build()
}
