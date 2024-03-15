@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.fsx

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Number
import kotlin.Unit

public interface LustreMaintenanceTimeProps {
  public fun day(): Weekday

  public fun hour(): Number

  public fun minute(): Number

  @CdkDslMarker
  public interface Builder {
    public fun day(day: Weekday)

    public fun hour(hour: Number)

    public fun minute(minute: Number)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.fsx.LustreMaintenanceTimeProps.Builder =
        software.amazon.awscdk.services.fsx.LustreMaintenanceTimeProps.builder()

    override fun day(day: Weekday) {
      cdkBuilder.day(day.let(Weekday::unwrap))
    }

    override fun hour(hour: Number) {
      cdkBuilder.hour(hour)
    }

    override fun minute(minute: Number) {
      cdkBuilder.minute(minute)
    }

    public fun build(): software.amazon.awscdk.services.fsx.LustreMaintenanceTimeProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.fsx.LustreMaintenanceTimeProps,
  ) : CdkObject(cdkObject), LustreMaintenanceTimeProps {
    override fun day(): Weekday = unwrap(this).getDay().let(Weekday::wrap)

    override fun hour(): Number = unwrap(this).getHour()

    override fun minute(): Number = unwrap(this).getMinute()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): LustreMaintenanceTimeProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.fsx.LustreMaintenanceTimeProps):
        LustreMaintenanceTimeProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: LustreMaintenanceTimeProps):
        software.amazon.awscdk.services.fsx.LustreMaintenanceTimeProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.fsx.LustreMaintenanceTimeProps
  }
}
