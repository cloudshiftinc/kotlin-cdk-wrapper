package io.cloudshiftdev.awscdk.services.opensearchservice

import kotlin.Number
import kotlin.Unit

public interface WindowStartTime {
  public fun hours(): Number

  public fun minutes(): Number

  public interface Builder {
    public fun hours(hours: Number)

    public fun minutes(minutes: Number)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.opensearchservice.WindowStartTime.Builder =
        software.amazon.awscdk.services.opensearchservice.WindowStartTime.builder()

    override fun hours(hours: Number) {
      cdkBuilder.hours(hours)
    }

    override fun minutes(minutes: Number) {
      cdkBuilder.minutes(minutes)
    }

    public fun build(): software.amazon.awscdk.services.opensearchservice.WindowStartTime =
        cdkBuilder.build()
  }

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.opensearchservice.WindowStartTime,
  ) : WindowStartTime {
    override fun hours(): Number = unwrap(this).getHours()

    override fun minutes(): Number = unwrap(this).getMinutes()
  }

  public companion object {
    init {

    }

    public operator fun invoke(block: Builder.() -> Unit = {}): WindowStartTime {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.opensearchservice.WindowStartTime):
        WindowStartTime = Wrapper(cdkObject)

    internal fun unwrap(wrapped: WindowStartTime):
        software.amazon.awscdk.services.opensearchservice.WindowStartTime = (wrapped as
        Wrapper).cdkObject
  }
}
