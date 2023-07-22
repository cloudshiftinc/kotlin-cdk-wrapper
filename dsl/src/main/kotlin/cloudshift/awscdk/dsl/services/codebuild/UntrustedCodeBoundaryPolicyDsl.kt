@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.codebuild

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.dsl.services.iam.PolicyStatementDsl
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.services.codebuild.UntrustedCodeBoundaryPolicy
import software.amazon.awscdk.services.iam.PolicyStatement
import software.constructs.Construct

@CdkDslMarker
public class UntrustedCodeBoundaryPolicyDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: UntrustedCodeBoundaryPolicy.Builder =
      UntrustedCodeBoundaryPolicy.Builder.create(scope, id)

  private val _additionalStatements: MutableList<PolicyStatement> = mutableListOf()

  /**
   * Additional statements to add to the default set of statements.
   *
   * Default: - No additional statements
   *
   * @param additionalStatements Additional statements to add to the default set of statements. 
   */
  public fun additionalStatements(additionalStatements: PolicyStatementDsl.() -> Unit) {
    _additionalStatements.add(PolicyStatementDsl().apply(additionalStatements).build())
  }

  /**
   * Additional statements to add to the default set of statements.
   *
   * Default: - No additional statements
   *
   * @param additionalStatements Additional statements to add to the default set of statements. 
   */
  public fun additionalStatements(additionalStatements: Collection<PolicyStatement>) {
    _additionalStatements.addAll(additionalStatements)
  }

  /**
   * The name of the managed policy.
   *
   * Default: - A name is automatically generated.
   *
   * @param managedPolicyName The name of the managed policy. 
   */
  public fun managedPolicyName(managedPolicyName: String) {
    cdkBuilder.managedPolicyName(managedPolicyName)
  }

  public fun build(): UntrustedCodeBoundaryPolicy {
    if(_additionalStatements.isNotEmpty()) cdkBuilder.additionalStatements(_additionalStatements)
    return cdkBuilder.build()
  }
}
