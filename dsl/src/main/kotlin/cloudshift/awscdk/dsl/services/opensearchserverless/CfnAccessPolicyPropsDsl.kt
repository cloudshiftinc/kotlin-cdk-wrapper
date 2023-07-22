@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.opensearchserverless

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.opensearchserverless.CfnAccessPolicyProps

@CdkDslMarker
public class CfnAccessPolicyPropsDsl {
  private val cdkBuilder: CfnAccessPolicyProps.Builder = CfnAccessPolicyProps.builder()

  /**
   * @param description The description of the policy.
   */
  public fun description(description: String) {
    cdkBuilder.description(description)
  }

  /**
   * @param name The name of the policy. 
   */
  public fun name(name: String) {
    cdkBuilder.name(name)
  }

  /**
   * @param policy The JSON policy document without any whitespaces. 
   */
  public fun policy(policy: String) {
    cdkBuilder.policy(policy)
  }

  /**
   * @param type The type of access policy. 
   * Currently the only option is `data` .
   */
  public fun type(type: String) {
    cdkBuilder.type(type)
  }

  public fun build(): CfnAccessPolicyProps = cdkBuilder.build()
}
