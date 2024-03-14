package io.cloudshiftdev.awscdk.services.s3

import io.cloudshiftdev.awscdk.CdkObject
import kotlin.String

public open class StorageClass internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.s3.StorageClass,
) : CdkObject(cdkObject) {
  /**
   *
   */
  public open fun `value`(): String = unwrap(this).getValue()

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.s3.StorageClass): StorageClass =
        StorageClass(cdkObject)

    internal fun unwrap(wrapped: StorageClass): software.amazon.awscdk.services.s3.StorageClass =
        wrapped.cdkObject
  }
}
