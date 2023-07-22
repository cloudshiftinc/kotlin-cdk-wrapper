@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.eks

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.eks.KubectlProviderAttributes
import software.amazon.awscdk.services.iam.IRole

@CdkDslMarker
public class KubectlProviderAttributesDsl {
  private val cdkBuilder: KubectlProviderAttributes.Builder = KubectlProviderAttributes.builder()

  /**
   * @param functionArn The custom resource provider's service token. 
   */
  public fun functionArn(functionArn: String) {
    cdkBuilder.functionArn(functionArn)
  }

  /**
   * @param handlerRole The IAM execution role of the handler. 
   * This role must be able to assume kubectlRoleArn
   */
  public fun handlerRole(handlerRole: IRole) {
    cdkBuilder.handlerRole(handlerRole)
  }

  /**
   * @param kubectlRoleArn The IAM role to assume in order to perform kubectl operations against
   * this cluster. 
   */
  public fun kubectlRoleArn(kubectlRoleArn: String) {
    cdkBuilder.kubectlRoleArn(kubectlRoleArn)
  }

  public fun build(): KubectlProviderAttributes = cdkBuilder.build()
}
