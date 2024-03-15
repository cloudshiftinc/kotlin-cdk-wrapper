@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ecr

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.Unit

public interface CfnRegistryPolicyProps {
  public fun policyText(): Any

  @CdkDslMarker
  public interface Builder {
    public fun policyText(policyText: Any)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ecr.CfnRegistryPolicyProps.Builder =
        software.amazon.awscdk.services.ecr.CfnRegistryPolicyProps.builder()

    override fun policyText(policyText: Any) {
      cdkBuilder.policyText(policyText)
    }

    public fun build(): software.amazon.awscdk.services.ecr.CfnRegistryPolicyProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.ecr.CfnRegistryPolicyProps,
  ) : CdkObject(cdkObject), CfnRegistryPolicyProps {
    override fun policyText(): Any = unwrap(this).getPolicyText()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnRegistryPolicyProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ecr.CfnRegistryPolicyProps):
        CfnRegistryPolicyProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnRegistryPolicyProps):
        software.amazon.awscdk.services.ecr.CfnRegistryPolicyProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.ecr.CfnRegistryPolicyProps
  }
}
