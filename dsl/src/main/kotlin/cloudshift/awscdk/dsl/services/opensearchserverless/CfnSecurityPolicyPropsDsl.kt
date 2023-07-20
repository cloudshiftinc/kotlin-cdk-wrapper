@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.opensearchserverless

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.opensearchserverless.CfnSecurityPolicyProps

@CdkDslMarker
public class CfnSecurityPolicyPropsDsl {
  private val cdkBuilder: CfnSecurityPolicyProps.Builder = CfnSecurityPolicyProps.builder()

  public fun description(description: String) {
    cdkBuilder.description(description)
  }

  public fun name(name: String) {
    cdkBuilder.name(name)
  }

  public fun policy(policy: String) {
    cdkBuilder.policy(policy)
  }

  public fun type(type: String) {
    cdkBuilder.type(type)
  }

  public fun build(): CfnSecurityPolicyProps = cdkBuilder.build()
}
