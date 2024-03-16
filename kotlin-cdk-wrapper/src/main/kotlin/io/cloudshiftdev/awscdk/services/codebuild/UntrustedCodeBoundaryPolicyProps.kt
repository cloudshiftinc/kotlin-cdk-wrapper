@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.codebuild

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import io.cloudshiftdev.awscdk.services.iam.PolicyStatement
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

/**
 * Construction properties for UntrustedCodeBoundaryPolicy.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.codebuild.*;
 * import io.cloudshiftdev.awscdk.services.iam.*;
 * PolicyStatement policyStatement;
 * UntrustedCodeBoundaryPolicyProps untrustedCodeBoundaryPolicyProps =
 * UntrustedCodeBoundaryPolicyProps.builder()
 * .additionalStatements(List.of(policyStatement))
 * .managedPolicyName("managedPolicyName")
 * .build();
 * ```
 */
public interface UntrustedCodeBoundaryPolicyProps {
  /**
   * Additional statements to add to the default set of statements.
   *
   * Default: - No additional statements
   */
  public fun additionalStatements(): List<PolicyStatement> =
      unwrap(this).getAdditionalStatements()?.map(PolicyStatement::wrap) ?: emptyList()

  /**
   * The name of the managed policy.
   *
   * Default: - A name is automatically generated.
   */
  public fun managedPolicyName(): String? = unwrap(this).getManagedPolicyName()

  /**
   * A builder for [UntrustedCodeBoundaryPolicyProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param additionalStatements Additional statements to add to the default set of statements.
     */
    public fun additionalStatements(additionalStatements: List<PolicyStatement>)

    /**
     * @param additionalStatements Additional statements to add to the default set of statements.
     */
    public fun additionalStatements(vararg additionalStatements: PolicyStatement)

    /**
     * @param managedPolicyName The name of the managed policy.
     */
    public fun managedPolicyName(managedPolicyName: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.codebuild.UntrustedCodeBoundaryPolicyProps.Builder =
        software.amazon.awscdk.services.codebuild.UntrustedCodeBoundaryPolicyProps.builder()

    /**
     * @param additionalStatements Additional statements to add to the default set of statements.
     */
    override fun additionalStatements(additionalStatements: List<PolicyStatement>) {
      cdkBuilder.additionalStatements(additionalStatements.map(PolicyStatement::unwrap))
    }

    /**
     * @param additionalStatements Additional statements to add to the default set of statements.
     */
    override fun additionalStatements(vararg additionalStatements: PolicyStatement): Unit =
        additionalStatements(additionalStatements.toList())

    /**
     * @param managedPolicyName The name of the managed policy.
     */
    override fun managedPolicyName(managedPolicyName: String) {
      cdkBuilder.managedPolicyName(managedPolicyName)
    }

    public fun build(): software.amazon.awscdk.services.codebuild.UntrustedCodeBoundaryPolicyProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject:
        software.amazon.awscdk.services.codebuild.UntrustedCodeBoundaryPolicyProps,
  ) : CdkObject(cdkObject), UntrustedCodeBoundaryPolicyProps {
    /**
     * Additional statements to add to the default set of statements.
     *
     * Default: - No additional statements
     */
    override fun additionalStatements(): List<PolicyStatement> =
        unwrap(this).getAdditionalStatements()?.map(PolicyStatement::wrap) ?: emptyList()

    /**
     * The name of the managed policy.
     *
     * Default: - A name is automatically generated.
     */
    override fun managedPolicyName(): String? = unwrap(this).getManagedPolicyName()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): UntrustedCodeBoundaryPolicyProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.codebuild.UntrustedCodeBoundaryPolicyProps):
        UntrustedCodeBoundaryPolicyProps = CdkObjectWrappers.wrap(cdkObject) as
        UntrustedCodeBoundaryPolicyProps

    internal fun unwrap(wrapped: UntrustedCodeBoundaryPolicyProps):
        software.amazon.awscdk.services.codebuild.UntrustedCodeBoundaryPolicyProps = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.codebuild.UntrustedCodeBoundaryPolicyProps
  }
}
