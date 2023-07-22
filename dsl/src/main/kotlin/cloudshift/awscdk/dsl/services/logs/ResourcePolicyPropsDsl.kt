@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.logs

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.dsl.services.iam.PolicyStatementDsl
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.services.iam.PolicyStatement
import software.amazon.awscdk.services.logs.ResourcePolicyProps

@CdkDslMarker
public class ResourcePolicyPropsDsl {
  private val cdkBuilder: ResourcePolicyProps.Builder = ResourcePolicyProps.builder()

  private val _policyStatements: MutableList<PolicyStatement> = mutableListOf()

  /**
   * @param policyStatements Initial statements to add to the resource policy.
   */
  public fun policyStatements(policyStatements: PolicyStatementDsl.() -> Unit) {
    _policyStatements.add(PolicyStatementDsl().apply(policyStatements).build())
  }

  /**
   * @param policyStatements Initial statements to add to the resource policy.
   */
  public fun policyStatements(policyStatements: Collection<PolicyStatement>) {
    _policyStatements.addAll(policyStatements)
  }

  /**
   * @param resourcePolicyName Name of the log group resource policy.
   */
  public fun resourcePolicyName(resourcePolicyName: String) {
    cdkBuilder.resourcePolicyName(resourcePolicyName)
  }

  public fun build(): ResourcePolicyProps {
    if(_policyStatements.isNotEmpty()) cdkBuilder.policyStatements(_policyStatements)
    return cdkBuilder.build()
  }
}
