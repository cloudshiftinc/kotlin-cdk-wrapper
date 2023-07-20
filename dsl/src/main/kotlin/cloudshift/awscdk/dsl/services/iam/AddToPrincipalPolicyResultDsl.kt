@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.iam

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import software.amazon.awscdk.services.iam.AddToPrincipalPolicyResult
import software.constructs.IDependable

@CdkDslMarker
public class AddToPrincipalPolicyResultDsl {
  private val cdkBuilder: AddToPrincipalPolicyResult.Builder = AddToPrincipalPolicyResult.builder()

  public fun policyDependable(policyDependable: IDependable) {
    cdkBuilder.policyDependable(policyDependable)
  }

  public fun statementAdded(statementAdded: Boolean) {
    cdkBuilder.statementAdded(statementAdded)
  }

  public fun build(): AddToPrincipalPolicyResult = cdkBuilder.build()
}
