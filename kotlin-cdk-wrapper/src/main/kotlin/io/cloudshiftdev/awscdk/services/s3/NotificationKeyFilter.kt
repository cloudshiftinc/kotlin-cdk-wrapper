@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.s3

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.String
import kotlin.Unit

public interface NotificationKeyFilter {
  public fun prefix(): String? = unwrap(this).getPrefix()

  public fun suffix(): String? = unwrap(this).getSuffix()

  @CdkDslMarker
  public interface Builder {
    public fun prefix(prefix: String)

    public fun suffix(suffix: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.s3.NotificationKeyFilter.Builder =
        software.amazon.awscdk.services.s3.NotificationKeyFilter.builder()

    override fun prefix(prefix: String) {
      cdkBuilder.prefix(prefix)
    }

    override fun suffix(suffix: String) {
      cdkBuilder.suffix(suffix)
    }

    public fun build(): software.amazon.awscdk.services.s3.NotificationKeyFilter =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.s3.NotificationKeyFilter,
  ) : CdkObject(cdkObject), NotificationKeyFilter {
    override fun prefix(): String? = unwrap(this).getPrefix()

    override fun suffix(): String? = unwrap(this).getSuffix()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): NotificationKeyFilter {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.s3.NotificationKeyFilter):
        NotificationKeyFilter = Wrapper(cdkObject)

    internal fun unwrap(wrapped: NotificationKeyFilter):
        software.amazon.awscdk.services.s3.NotificationKeyFilter = (wrapped as CdkObject).cdkObject
        as software.amazon.awscdk.services.s3.NotificationKeyFilter
  }
}
