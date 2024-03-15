@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.msk

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.String
import kotlin.Unit

public interface CfnClusterPolicyProps {
  public fun clusterArn(): String

  public fun policy(): Any

  @CdkDslMarker
  public interface Builder {
    public fun clusterArn(clusterArn: String)

    public fun policy(policy: Any)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.msk.CfnClusterPolicyProps.Builder =
        software.amazon.awscdk.services.msk.CfnClusterPolicyProps.builder()

    override fun clusterArn(clusterArn: String) {
      cdkBuilder.clusterArn(clusterArn)
    }

    override fun policy(policy: Any) {
      cdkBuilder.policy(policy)
    }

    public fun build(): software.amazon.awscdk.services.msk.CfnClusterPolicyProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.msk.CfnClusterPolicyProps,
  ) : CdkObject(cdkObject), CfnClusterPolicyProps {
    override fun clusterArn(): String = unwrap(this).getClusterArn()

    override fun policy(): Any = unwrap(this).getPolicy()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnClusterPolicyProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.msk.CfnClusterPolicyProps):
        CfnClusterPolicyProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnClusterPolicyProps):
        software.amazon.awscdk.services.msk.CfnClusterPolicyProps = (wrapped as CdkObject).cdkObject
        as software.amazon.awscdk.services.msk.CfnClusterPolicyProps
  }
}
