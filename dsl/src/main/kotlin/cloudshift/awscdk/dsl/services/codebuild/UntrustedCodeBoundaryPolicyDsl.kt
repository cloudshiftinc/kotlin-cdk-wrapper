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

/**
 * Permissions Boundary for a CodeBuild Project running untrusted code.
 *
 * This class is a Policy, intended to be used as a Permissions Boundary
 * for a CodeBuild project. It allows most of the actions necessary to run
 * the CodeBuild project, but disallows reading from Parameter Store
 * and Secrets Manager.
 *
 * Use this when your CodeBuild project is running untrusted code (for
 * example, if you are using one to automatically build Pull Requests
 * that anyone can submit), and you want to prevent your future self
 * from accidentally exposing Secrets to this build.
 *
 * (The reason you might want to do this is because otherwise anyone
 * who can submit a Pull Request to your project can write a script
 * to email those secrets to themselves).
 *
 * Example:
 *
 * ```
 * Project project;
 * PermissionsBoundary.of(project).apply(new UntrustedCodeBoundaryPolicy(this, "Boundary"));
 * ```
 */
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
