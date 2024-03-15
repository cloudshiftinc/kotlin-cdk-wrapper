@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.codebuild

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.services.iam.PolicyStatement
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

public interface UntrustedCodeBoundaryPolicyProps {
  public fun additionalStatements(): List<PolicyStatement> =
      unwrap(this).getAdditionalStatements()?.map(PolicyStatement::wrap) ?: emptyList()

  public fun managedPolicyName(): String? = unwrap(this).getManagedPolicyName()

  @CdkDslMarker
  public interface Builder {
    public fun additionalStatements(additionalStatements: List<PolicyStatement>)

    public fun additionalStatements(vararg additionalStatements: PolicyStatement)

    public fun managedPolicyName(managedPolicyName: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.codebuild.UntrustedCodeBoundaryPolicyProps.Builder =
        software.amazon.awscdk.services.codebuild.UntrustedCodeBoundaryPolicyProps.builder()

    override fun additionalStatements(additionalStatements: List<PolicyStatement>) {
      cdkBuilder.additionalStatements(additionalStatements.map(PolicyStatement::unwrap))
    }

    override fun additionalStatements(vararg additionalStatements: PolicyStatement): Unit =
        additionalStatements(additionalStatements.toList())

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
    override fun additionalStatements(): List<PolicyStatement> =
        unwrap(this).getAdditionalStatements()?.map(PolicyStatement::wrap) ?: emptyList()

    override fun managedPolicyName(): String? = unwrap(this).getManagedPolicyName()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): UntrustedCodeBoundaryPolicyProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.codebuild.UntrustedCodeBoundaryPolicyProps):
        UntrustedCodeBoundaryPolicyProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: UntrustedCodeBoundaryPolicyProps):
        software.amazon.awscdk.services.codebuild.UntrustedCodeBoundaryPolicyProps = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.codebuild.UntrustedCodeBoundaryPolicyProps
  }
}
