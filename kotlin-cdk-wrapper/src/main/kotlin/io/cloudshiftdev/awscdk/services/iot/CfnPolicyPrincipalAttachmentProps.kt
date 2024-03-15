@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.iot

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.String
import kotlin.Unit

public interface CfnPolicyPrincipalAttachmentProps {
  public fun policyName(): String

  public fun principal(): String

  @CdkDslMarker
  public interface Builder {
    public fun policyName(policyName: String)

    public fun principal(principal: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.iot.CfnPolicyPrincipalAttachmentProps.Builder =
        software.amazon.awscdk.services.iot.CfnPolicyPrincipalAttachmentProps.builder()

    override fun policyName(policyName: String) {
      cdkBuilder.policyName(policyName)
    }

    override fun principal(principal: String) {
      cdkBuilder.principal(principal)
    }

    public fun build(): software.amazon.awscdk.services.iot.CfnPolicyPrincipalAttachmentProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.iot.CfnPolicyPrincipalAttachmentProps,
  ) : CdkObject(cdkObject), CfnPolicyPrincipalAttachmentProps {
    override fun policyName(): String = unwrap(this).getPolicyName()

    override fun principal(): String = unwrap(this).getPrincipal()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnPolicyPrincipalAttachmentProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.iot.CfnPolicyPrincipalAttachmentProps):
        CfnPolicyPrincipalAttachmentProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnPolicyPrincipalAttachmentProps):
        software.amazon.awscdk.services.iot.CfnPolicyPrincipalAttachmentProps = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.iot.CfnPolicyPrincipalAttachmentProps
  }
}
