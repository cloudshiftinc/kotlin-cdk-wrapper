@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.s3

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.String
import kotlin.Unit

public interface CfnMultiRegionAccessPointPolicyProps {
  public fun mrapName(): String

  public fun policy(): Any

  @CdkDslMarker
  public interface Builder {
    public fun mrapName(mrapName: String)

    public fun policy(policy: Any)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.s3.CfnMultiRegionAccessPointPolicyProps.Builder =
        software.amazon.awscdk.services.s3.CfnMultiRegionAccessPointPolicyProps.builder()

    override fun mrapName(mrapName: String) {
      cdkBuilder.mrapName(mrapName)
    }

    override fun policy(policy: Any) {
      cdkBuilder.policy(policy)
    }

    public fun build(): software.amazon.awscdk.services.s3.CfnMultiRegionAccessPointPolicyProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.s3.CfnMultiRegionAccessPointPolicyProps,
  ) : CdkObject(cdkObject), CfnMultiRegionAccessPointPolicyProps {
    override fun mrapName(): String = unwrap(this).getMrapName()

    override fun policy(): Any = unwrap(this).getPolicy()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}):
        CfnMultiRegionAccessPointPolicyProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.s3.CfnMultiRegionAccessPointPolicyProps):
        CfnMultiRegionAccessPointPolicyProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnMultiRegionAccessPointPolicyProps):
        software.amazon.awscdk.services.s3.CfnMultiRegionAccessPointPolicyProps = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.s3.CfnMultiRegionAccessPointPolicyProps
  }
}
