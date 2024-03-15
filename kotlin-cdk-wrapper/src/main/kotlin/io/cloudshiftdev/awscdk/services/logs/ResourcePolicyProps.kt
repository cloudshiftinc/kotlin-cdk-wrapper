@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.logs

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.services.iam.PolicyStatement
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

public interface ResourcePolicyProps {
  public fun policyStatements(): List<PolicyStatement> =
      unwrap(this).getPolicyStatements()?.map(PolicyStatement::wrap) ?: emptyList()

  public fun resourcePolicyName(): String? = unwrap(this).getResourcePolicyName()

  @CdkDslMarker
  public interface Builder {
    public fun policyStatements(policyStatements: List<PolicyStatement>)

    public fun policyStatements(vararg policyStatements: PolicyStatement)

    public fun resourcePolicyName(resourcePolicyName: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.logs.ResourcePolicyProps.Builder =
        software.amazon.awscdk.services.logs.ResourcePolicyProps.builder()

    override fun policyStatements(policyStatements: List<PolicyStatement>) {
      cdkBuilder.policyStatements(policyStatements.map(PolicyStatement::unwrap))
    }

    override fun policyStatements(vararg policyStatements: PolicyStatement): Unit =
        policyStatements(policyStatements.toList())

    override fun resourcePolicyName(resourcePolicyName: String) {
      cdkBuilder.resourcePolicyName(resourcePolicyName)
    }

    public fun build(): software.amazon.awscdk.services.logs.ResourcePolicyProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.logs.ResourcePolicyProps,
  ) : CdkObject(cdkObject), ResourcePolicyProps {
    override fun policyStatements(): List<PolicyStatement> =
        unwrap(this).getPolicyStatements()?.map(PolicyStatement::wrap) ?: emptyList()

    override fun resourcePolicyName(): String? = unwrap(this).getResourcePolicyName()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): ResourcePolicyProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.logs.ResourcePolicyProps):
        ResourcePolicyProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: ResourcePolicyProps):
        software.amazon.awscdk.services.logs.ResourcePolicyProps = (wrapped as CdkObject).cdkObject
        as software.amazon.awscdk.services.logs.ResourcePolicyProps
  }
}
