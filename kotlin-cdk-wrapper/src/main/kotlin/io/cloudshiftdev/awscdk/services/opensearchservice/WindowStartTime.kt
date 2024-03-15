@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.opensearchservice

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Number
import kotlin.Unit

public interface WindowStartTime {
  public fun hours(): Number

  public fun minutes(): Number

  @CdkDslMarker
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

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.opensearchservice.WindowStartTime,
  ) : CdkObject(cdkObject), WindowStartTime {
    override fun hours(): Number = unwrap(this).getHours()

    override fun minutes(): Number = unwrap(this).getMinutes()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): WindowStartTime {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.opensearchservice.WindowStartTime):
        WindowStartTime = Wrapper(cdkObject)

    internal fun unwrap(wrapped: WindowStartTime):
        software.amazon.awscdk.services.opensearchservice.WindowStartTime = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.opensearchservice.WindowStartTime
  }
}
