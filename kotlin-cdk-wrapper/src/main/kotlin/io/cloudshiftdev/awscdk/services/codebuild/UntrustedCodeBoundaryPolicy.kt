@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.codebuild

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.services.iam.ManagedPolicy
import io.cloudshiftdev.awscdk.services.iam.PolicyStatement
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

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
public open class UntrustedCodeBoundaryPolicy internal constructor(
  internal override val cdkObject:
      software.amazon.awscdk.services.codebuild.UntrustedCodeBoundaryPolicy,
) : ManagedPolicy(cdkObject) {
  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.codebuild.UntrustedCodeBoundaryPolicy].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * Additional statements to add to the default set of statements.
     *
     * Default: - No additional statements
     *
     * @param additionalStatements Additional statements to add to the default set of statements. 
     */
    public fun additionalStatements(additionalStatements: List<PolicyStatement>)

    /**
     * Additional statements to add to the default set of statements.
     *
     * Default: - No additional statements
     *
     * @param additionalStatements Additional statements to add to the default set of statements. 
     */
    public fun additionalStatements(vararg additionalStatements: PolicyStatement)

    /**
     * The name of the managed policy.
     *
     * Default: - A name is automatically generated.
     *
     * @param managedPolicyName The name of the managed policy. 
     */
    public fun managedPolicyName(managedPolicyName: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.codebuild.UntrustedCodeBoundaryPolicy.Builder =
        software.amazon.awscdk.services.codebuild.UntrustedCodeBoundaryPolicy.Builder.create(scope,
        id)

    /**
     * Additional statements to add to the default set of statements.
     *
     * Default: - No additional statements
     *
     * @param additionalStatements Additional statements to add to the default set of statements. 
     */
    override fun additionalStatements(additionalStatements: List<PolicyStatement>) {
      cdkBuilder.additionalStatements(additionalStatements.map(PolicyStatement::unwrap))
    }

    /**
     * Additional statements to add to the default set of statements.
     *
     * Default: - No additional statements
     *
     * @param additionalStatements Additional statements to add to the default set of statements. 
     */
    override fun additionalStatements(vararg additionalStatements: PolicyStatement): Unit =
        additionalStatements(additionalStatements.toList())

    /**
     * The name of the managed policy.
     *
     * Default: - A name is automatically generated.
     *
     * @param managedPolicyName The name of the managed policy. 
     */
    override fun managedPolicyName(managedPolicyName: String) {
      cdkBuilder.managedPolicyName(managedPolicyName)
    }

    public fun build(): software.amazon.awscdk.services.codebuild.UntrustedCodeBoundaryPolicy =
        cdkBuilder.build()
  }

  public companion object {
    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): UntrustedCodeBoundaryPolicy {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return UntrustedCodeBoundaryPolicy(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.codebuild.UntrustedCodeBoundaryPolicy):
        UntrustedCodeBoundaryPolicy = UntrustedCodeBoundaryPolicy(cdkObject)

    internal fun unwrap(wrapped: UntrustedCodeBoundaryPolicy):
        software.amazon.awscdk.services.codebuild.UntrustedCodeBoundaryPolicy = wrapped.cdkObject
  }
}
