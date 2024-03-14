package io.cloudshiftdev.awscdk.services.fsx

import kotlin.Number
import kotlin.String
import kotlin.Unit

public open class LustreMaintenanceTime internal constructor(
  private val cdkObject: software.amazon.awscdk.services.fsx.LustreMaintenanceTime,
) {
  public open fun toTimestamp(): String = unwrap(this).toTimestamp()

  public interface Builder {
    public fun day(day: Weekday) {
    }

    public fun hour(hour: Number) {
    }

    public fun minute(minute: Number) {
    }
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.fsx.LustreMaintenanceTime.Builder =
        software.amazon.awscdk.services.fsx.LustreMaintenanceTime.Builder.create()

    public override fun day(day: Weekday) {
      cdkBuilder.day(day.let(Weekday::unwrap))
    }

    public override fun hour(hour: Number) {
      cdkBuilder.hour(hour)
    }

    public override fun minute(minute: Number) {
      cdkBuilder.minute(minute)
    }

    public fun build(): software.amazon.awscdk.services.fsx.LustreMaintenanceTime =
        cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(block: Builder.() -> Unit = {}): LustreMaintenanceTime {
      val builderImpl = BuilderImpl()
      return LustreMaintenanceTime(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.fsx.LustreMaintenanceTime):
        LustreMaintenanceTime = LustreMaintenanceTime(cdkObject)

    internal fun unwrap(wrapped: LustreMaintenanceTime):
        software.amazon.awscdk.services.fsx.LustreMaintenanceTime = wrapped.cdkObject
  }
}
