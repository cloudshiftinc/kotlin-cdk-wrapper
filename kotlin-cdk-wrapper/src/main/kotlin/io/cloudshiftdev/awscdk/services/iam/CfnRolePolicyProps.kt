@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.iam

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.String
import kotlin.Unit

public interface CfnRolePolicyProps {
  public fun policyDocument(): Any? = unwrap(this).getPolicyDocument()

  public fun policyName(): String

  public fun roleName(): String

  @CdkDslMarker
  public interface Builder {
    public fun policyDocument(policyDocument: Any)

    public fun policyName(policyName: String)

    public fun roleName(roleName: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.iam.CfnRolePolicyProps.Builder =
        software.amazon.awscdk.services.iam.CfnRolePolicyProps.builder()

    override fun policyDocument(policyDocument: Any) {
      cdkBuilder.policyDocument(policyDocument)
    }

    override fun policyName(policyName: String) {
      cdkBuilder.policyName(policyName)
    }

    override fun roleName(roleName: String) {
      cdkBuilder.roleName(roleName)
    }

    public fun build(): software.amazon.awscdk.services.iam.CfnRolePolicyProps = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.iam.CfnRolePolicyProps,
  ) : CdkObject(cdkObject), CfnRolePolicyProps {
    override fun policyDocument(): Any? = unwrap(this).getPolicyDocument()

    override fun policyName(): String = unwrap(this).getPolicyName()

    override fun roleName(): String = unwrap(this).getRoleName()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnRolePolicyProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.iam.CfnRolePolicyProps):
        CfnRolePolicyProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnRolePolicyProps):
        software.amazon.awscdk.services.iam.CfnRolePolicyProps = (wrapped as CdkObject).cdkObject as
        software.amazon.awscdk.services.iam.CfnRolePolicyProps
  }
}
