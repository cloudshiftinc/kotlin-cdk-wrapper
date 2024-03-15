@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.connect

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.String
import kotlin.Unit

public interface CfnApprovedOriginProps {
  public fun instanceId(): String

  public fun origin(): String

  @CdkDslMarker
  public interface Builder {
    public fun instanceId(instanceId: String)

    public fun origin(origin: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.connect.CfnApprovedOriginProps.Builder =
        software.amazon.awscdk.services.connect.CfnApprovedOriginProps.builder()

    override fun instanceId(instanceId: String) {
      cdkBuilder.instanceId(instanceId)
    }

    override fun origin(origin: String) {
      cdkBuilder.origin(origin)
    }

    public fun build(): software.amazon.awscdk.services.connect.CfnApprovedOriginProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.connect.CfnApprovedOriginProps,
  ) : CdkObject(cdkObject), CfnApprovedOriginProps {
    override fun instanceId(): String = unwrap(this).getInstanceId()

    override fun origin(): String = unwrap(this).getOrigin()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnApprovedOriginProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.connect.CfnApprovedOriginProps):
        CfnApprovedOriginProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnApprovedOriginProps):
        software.amazon.awscdk.services.connect.CfnApprovedOriginProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.connect.CfnApprovedOriginProps
  }
}
