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
    public val DEEP_ARCHIVE: StorageClass =
        StorageClass.wrap(software.amazon.awscdk.services.s3.StorageClass.DEEP_ARCHIVE)

    public val GLACIER: StorageClass =
        StorageClass.wrap(software.amazon.awscdk.services.s3.StorageClass.GLACIER)

    public val GLACIER_INSTANT_RETRIEVAL: StorageClass =
        StorageClass.wrap(software.amazon.awscdk.services.s3.StorageClass.GLACIER_INSTANT_RETRIEVAL)

    public val INFREQUENT_ACCESS: StorageClass =
        StorageClass.wrap(software.amazon.awscdk.services.s3.StorageClass.INFREQUENT_ACCESS)

    public val INTELLIGENT_TIERING: StorageClass =
        StorageClass.wrap(software.amazon.awscdk.services.s3.StorageClass.INTELLIGENT_TIERING)

    public val ONE_ZONE_INFREQUENT_ACCESS: StorageClass =
        StorageClass.wrap(software.amazon.awscdk.services.s3.StorageClass.ONE_ZONE_INFREQUENT_ACCESS)

    internal fun wrap(cdkObject: software.amazon.awscdk.services.s3.StorageClass): StorageClass =
        StorageClass(cdkObject)

    internal fun unwrap(wrapped: StorageClass): software.amazon.awscdk.services.s3.StorageClass =
        wrapped.cdkObject
  }
}
