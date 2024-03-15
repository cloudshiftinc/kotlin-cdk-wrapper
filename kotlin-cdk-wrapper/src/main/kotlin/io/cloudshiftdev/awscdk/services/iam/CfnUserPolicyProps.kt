@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.iam

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.String
import kotlin.Unit

public interface CfnUserPolicyProps {
  public fun policyDocument(): Any? = unwrap(this).getPolicyDocument()

  public fun policyName(): String

  public fun userName(): String

  @CdkDslMarker
  public interface Builder {
    public fun policyDocument(policyDocument: Any)

    public fun policyName(policyName: String)

    public fun userName(userName: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.iam.CfnUserPolicyProps.Builder =
        software.amazon.awscdk.services.iam.CfnUserPolicyProps.builder()

    override fun policyDocument(policyDocument: Any) {
      cdkBuilder.policyDocument(policyDocument)
    }

    override fun policyName(policyName: String) {
      cdkBuilder.policyName(policyName)
    }

    override fun userName(userName: String) {
      cdkBuilder.userName(userName)
    }

    public fun build(): software.amazon.awscdk.services.iam.CfnUserPolicyProps = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.iam.CfnUserPolicyProps,
  ) : CdkObject(cdkObject), CfnUserPolicyProps {
    override fun policyDocument(): Any? = unwrap(this).getPolicyDocument()

    override fun policyName(): String = unwrap(this).getPolicyName()

    override fun userName(): String = unwrap(this).getUserName()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnUserPolicyProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.iam.CfnUserPolicyProps):
        CfnUserPolicyProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnUserPolicyProps):
        software.amazon.awscdk.services.iam.CfnUserPolicyProps = (wrapped as CdkObject).cdkObject as
        software.amazon.awscdk.services.iam.CfnUserPolicyProps
  }
}
