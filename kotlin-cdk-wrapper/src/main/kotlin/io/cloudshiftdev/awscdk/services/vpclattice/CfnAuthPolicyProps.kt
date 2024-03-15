@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.vpclattice

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.String
import kotlin.Unit

public interface CfnAuthPolicyProps {
  public fun policy(): Any

  public fun resourceIdentifier(): String

  @CdkDslMarker
  public interface Builder {
    public fun policy(policy: Any)

    public fun resourceIdentifier(resourceIdentifier: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.vpclattice.CfnAuthPolicyProps.Builder =
        software.amazon.awscdk.services.vpclattice.CfnAuthPolicyProps.builder()

    override fun policy(policy: Any) {
      cdkBuilder.policy(policy)
    }

    override fun resourceIdentifier(resourceIdentifier: String) {
      cdkBuilder.resourceIdentifier(resourceIdentifier)
    }

    public fun build(): software.amazon.awscdk.services.vpclattice.CfnAuthPolicyProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.vpclattice.CfnAuthPolicyProps,
  ) : CdkObject(cdkObject), CfnAuthPolicyProps {
    override fun policy(): Any = unwrap(this).getPolicy()

    override fun resourceIdentifier(): String = unwrap(this).getResourceIdentifier()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnAuthPolicyProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.vpclattice.CfnAuthPolicyProps):
        CfnAuthPolicyProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnAuthPolicyProps):
        software.amazon.awscdk.services.vpclattice.CfnAuthPolicyProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.vpclattice.CfnAuthPolicyProps
  }
}
