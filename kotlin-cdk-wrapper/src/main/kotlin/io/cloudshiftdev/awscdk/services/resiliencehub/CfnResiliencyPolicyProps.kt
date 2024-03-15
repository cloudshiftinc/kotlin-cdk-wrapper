@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.resiliencehub

import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.Map

public interface CfnResiliencyPolicyProps {
  public fun dataLocationConstraint(): String? = unwrap(this).getDataLocationConstraint()

  public fun policy(): Any

  public fun policyDescription(): String? = unwrap(this).getPolicyDescription()

  public fun policyName(): String

  public fun tags(): Map<String, String> = unwrap(this).getTags() ?: emptyMap()

  public fun tier(): String

  @CdkDslMarker
  public interface Builder {
    public fun dataLocationConstraint(dataLocationConstraint: String)

    public fun policy(policy: IResolvable)

    public fun policy(policy: Map<String, Any>)

    public fun policyDescription(policyDescription: String)

    public fun policyName(policyName: String)

    public fun tags(tags: Map<String, String>)

    public fun tier(tier: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.resiliencehub.CfnResiliencyPolicyProps.Builder =
        software.amazon.awscdk.services.resiliencehub.CfnResiliencyPolicyProps.builder()

    override fun dataLocationConstraint(dataLocationConstraint: String) {
      cdkBuilder.dataLocationConstraint(dataLocationConstraint)
    }

    override fun policy(policy: IResolvable) {
      cdkBuilder.policy(policy.let(IResolvable::unwrap))
    }

    override fun policy(policy: Map<String, Any>) {
      cdkBuilder.policy(policy)
    }

    override fun policyDescription(policyDescription: String) {
      cdkBuilder.policyDescription(policyDescription)
    }

    override fun policyName(policyName: String) {
      cdkBuilder.policyName(policyName)
    }

    override fun tags(tags: Map<String, String>) {
      cdkBuilder.tags(tags)
    }

    override fun tier(tier: String) {
      cdkBuilder.tier(tier)
    }

    public fun build(): software.amazon.awscdk.services.resiliencehub.CfnResiliencyPolicyProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.resiliencehub.CfnResiliencyPolicyProps,
  ) : CdkObject(cdkObject), CfnResiliencyPolicyProps {
    override fun dataLocationConstraint(): String? = unwrap(this).getDataLocationConstraint()

    override fun policy(): Any = unwrap(this).getPolicy()

    override fun policyDescription(): String? = unwrap(this).getPolicyDescription()

    override fun policyName(): String = unwrap(this).getPolicyName()

    override fun tags(): Map<String, String> = unwrap(this).getTags() ?: emptyMap()

    override fun tier(): String = unwrap(this).getTier()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnResiliencyPolicyProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.resiliencehub.CfnResiliencyPolicyProps):
        CfnResiliencyPolicyProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnResiliencyPolicyProps):
        software.amazon.awscdk.services.resiliencehub.CfnResiliencyPolicyProps = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.resiliencehub.CfnResiliencyPolicyProps
  }
}
