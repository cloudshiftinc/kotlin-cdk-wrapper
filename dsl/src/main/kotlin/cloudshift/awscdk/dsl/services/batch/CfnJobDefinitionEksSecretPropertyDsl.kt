@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.batch

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.batch.CfnJobDefinition

@CdkDslMarker
public class CfnJobDefinitionEksSecretPropertyDsl {
  private val cdkBuilder: CfnJobDefinition.EksSecretProperty.Builder =
      CfnJobDefinition.EksSecretProperty.builder()

  /**
   * @param optional Specifies whether the secret or the secret's keys must be defined.
   */
  public fun optional(optional: Boolean) {
    cdkBuilder.optional(optional)
  }

  /**
   * @param optional Specifies whether the secret or the secret's keys must be defined.
   */
  public fun optional(optional: IResolvable) {
    cdkBuilder.optional(optional)
  }

  /**
   * @param secretName The name of the secret. 
   * The name must be allowed as a DNS subdomain name. For more information, see [DNS subdomain
   * names](https://docs.aws.amazon.com/https://kubernetes.io/docs/concepts/overview/working-with-objects/names/#dns-subdomain-names)
   * in the *Kubernetes documentation* .
   */
  public fun secretName(secretName: String) {
    cdkBuilder.secretName(secretName)
  }

  public fun build(): CfnJobDefinition.EksSecretProperty = cdkBuilder.build()
}
