@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.codebuild

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.dsl.services.iam.PolicyStatementDsl
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.services.codebuild.UntrustedCodeBoundaryPolicyProps
import software.amazon.awscdk.services.iam.PolicyStatement

@CdkDslMarker
public class UntrustedCodeBoundaryPolicyPropsDsl {
  private val cdkBuilder: UntrustedCodeBoundaryPolicyProps.Builder =
      UntrustedCodeBoundaryPolicyProps.builder()

  private val _additionalStatements: MutableList<PolicyStatement> = mutableListOf()

  public fun additionalStatements(additionalStatements: PolicyStatementDsl.() -> Unit) {
    _additionalStatements.add(PolicyStatementDsl().apply(additionalStatements).build())
  }

  public fun additionalStatements(additionalStatements: Collection<PolicyStatement>) {
    _additionalStatements.addAll(additionalStatements)
  }

  public fun managedPolicyName(managedPolicyName: String) {
    cdkBuilder.managedPolicyName(managedPolicyName)
  }

  public fun build(): UntrustedCodeBoundaryPolicyProps {
    if(_additionalStatements.isNotEmpty()) cdkBuilder.additionalStatements(_additionalStatements)
    return cdkBuilder.build()
  }
}
