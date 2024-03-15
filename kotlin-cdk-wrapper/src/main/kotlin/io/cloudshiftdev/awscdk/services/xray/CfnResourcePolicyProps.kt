@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.xray

import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.Unit

public interface CfnResourcePolicyProps {
  public fun bypassPolicyLockoutCheck(): Any? = unwrap(this).getBypassPolicyLockoutCheck()

  public fun policyDocument(): String

  public fun policyName(): String

  @CdkDslMarker
  public interface Builder {
    public fun bypassPolicyLockoutCheck(bypassPolicyLockoutCheck: Boolean)

    public fun bypassPolicyLockoutCheck(bypassPolicyLockoutCheck: IResolvable)

    public fun policyDocument(policyDocument: String)

    public fun policyName(policyName: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.xray.CfnResourcePolicyProps.Builder =
        software.amazon.awscdk.services.xray.CfnResourcePolicyProps.builder()

    override fun bypassPolicyLockoutCheck(bypassPolicyLockoutCheck: Boolean) {
      cdkBuilder.bypassPolicyLockoutCheck(bypassPolicyLockoutCheck)
    }

    override fun bypassPolicyLockoutCheck(bypassPolicyLockoutCheck: IResolvable) {
      cdkBuilder.bypassPolicyLockoutCheck(bypassPolicyLockoutCheck.let(IResolvable::unwrap))
    }

    override fun policyDocument(policyDocument: String) {
      cdkBuilder.policyDocument(policyDocument)
    }

    override fun policyName(policyName: String) {
      cdkBuilder.policyName(policyName)
    }

    public fun build(): software.amazon.awscdk.services.xray.CfnResourcePolicyProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.xray.CfnResourcePolicyProps,
  ) : CdkObject(cdkObject), CfnResourcePolicyProps {
    override fun bypassPolicyLockoutCheck(): Any? = unwrap(this).getBypassPolicyLockoutCheck()

    override fun policyDocument(): String = unwrap(this).getPolicyDocument()

    override fun policyName(): String = unwrap(this).getPolicyName()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnResourcePolicyProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.xray.CfnResourcePolicyProps):
        CfnResourcePolicyProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnResourcePolicyProps):
        software.amazon.awscdk.services.xray.CfnResourcePolicyProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.xray.CfnResourcePolicyProps
  }
}
