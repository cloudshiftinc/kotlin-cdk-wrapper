@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.secretsmanager

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.secretsmanager.ISecret
import software.amazon.awscdk.services.secretsmanager.ResourcePolicyProps

@CdkDslMarker
public class ResourcePolicyPropsDsl {
  private val cdkBuilder: ResourcePolicyProps.Builder = ResourcePolicyProps.builder()

  /**
   * @param secret The secret to attach a resource-based permissions policy. 
   */
  public fun secret(secret: ISecret) {
    cdkBuilder.secret(secret)
  }

  public fun build(): ResourcePolicyProps = cdkBuilder.build()
}
