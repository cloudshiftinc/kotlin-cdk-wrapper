@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ec2

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.String
import kotlin.Unit

public interface CfnSnapshotBlockPublicAccessProps {
  public fun state(): String

  @CdkDslMarker
  public interface Builder {
    public fun state(state: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.ec2.CfnSnapshotBlockPublicAccessProps.Builder =
        software.amazon.awscdk.services.ec2.CfnSnapshotBlockPublicAccessProps.builder()

    override fun state(state: String) {
      cdkBuilder.state(state)
    }

    public fun build(): software.amazon.awscdk.services.ec2.CfnSnapshotBlockPublicAccessProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.ec2.CfnSnapshotBlockPublicAccessProps,
  ) : CdkObject(cdkObject), CfnSnapshotBlockPublicAccessProps {
    override fun state(): String = unwrap(this).getState()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnSnapshotBlockPublicAccessProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.ec2.CfnSnapshotBlockPublicAccessProps):
        CfnSnapshotBlockPublicAccessProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnSnapshotBlockPublicAccessProps):
        software.amazon.awscdk.services.ec2.CfnSnapshotBlockPublicAccessProps = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.ec2.CfnSnapshotBlockPublicAccessProps
  }
}
