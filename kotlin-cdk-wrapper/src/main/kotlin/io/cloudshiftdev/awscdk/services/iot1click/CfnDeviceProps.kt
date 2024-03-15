@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.iot1click

import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.Unit

public interface CfnDeviceProps {
  public fun deviceId(): String

  public fun enabled(): Any

  @CdkDslMarker
  public interface Builder {
    public fun deviceId(deviceId: String)

    public fun enabled(enabled: Boolean)

    public fun enabled(enabled: IResolvable)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.iot1click.CfnDeviceProps.Builder =
        software.amazon.awscdk.services.iot1click.CfnDeviceProps.builder()

    override fun deviceId(deviceId: String) {
      cdkBuilder.deviceId(deviceId)
    }

    override fun enabled(enabled: Boolean) {
      cdkBuilder.enabled(enabled)
    }

    override fun enabled(enabled: IResolvable) {
      cdkBuilder.enabled(enabled.let(IResolvable::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.iot1click.CfnDeviceProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.iot1click.CfnDeviceProps,
  ) : CdkObject(cdkObject), CfnDeviceProps {
    override fun deviceId(): String = unwrap(this).getDeviceId()

    override fun enabled(): Any = unwrap(this).getEnabled()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnDeviceProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.iot1click.CfnDeviceProps):
        CfnDeviceProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnDeviceProps):
        software.amazon.awscdk.services.iot1click.CfnDeviceProps = (wrapped as CdkObject).cdkObject
        as software.amazon.awscdk.services.iot1click.CfnDeviceProps
  }
}
