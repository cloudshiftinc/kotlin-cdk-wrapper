@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.iam

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.String
import kotlin.Unit

public interface CfnGroupPolicyProps {
  public fun groupName(): String

  public fun policyDocument(): Any? = unwrap(this).getPolicyDocument()

  public fun policyName(): String

  @CdkDslMarker
  public interface Builder {
    public fun groupName(groupName: String)

    public fun policyDocument(policyDocument: Any)

    public fun policyName(policyName: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.iam.CfnGroupPolicyProps.Builder =
        software.amazon.awscdk.services.iam.CfnGroupPolicyProps.builder()

    override fun groupName(groupName: String) {
      cdkBuilder.groupName(groupName)
    }

    override fun policyDocument(policyDocument: Any) {
      cdkBuilder.policyDocument(policyDocument)
    }

    override fun policyName(policyName: String) {
      cdkBuilder.policyName(policyName)
    }

    public fun build(): software.amazon.awscdk.services.iam.CfnGroupPolicyProps = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.iam.CfnGroupPolicyProps,
  ) : CdkObject(cdkObject), CfnGroupPolicyProps {
    override fun groupName(): String = unwrap(this).getGroupName()

    override fun policyDocument(): Any? = unwrap(this).getPolicyDocument()

    override fun policyName(): String = unwrap(this).getPolicyName()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnGroupPolicyProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.iam.CfnGroupPolicyProps):
        CfnGroupPolicyProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnGroupPolicyProps):
        software.amazon.awscdk.services.iam.CfnGroupPolicyProps = (wrapped as CdkObject).cdkObject
        as software.amazon.awscdk.services.iam.CfnGroupPolicyProps
  }
}
