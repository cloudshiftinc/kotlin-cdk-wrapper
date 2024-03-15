@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.stepfunctions

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.services.s3.IBucket
import kotlin.Number
import kotlin.String
import kotlin.Unit

public interface S3FileItemReaderProps : ItemReaderProps {
  public fun key(): String

  @CdkDslMarker
  public interface Builder {
    public fun bucket(bucket: IBucket)

    public fun key(key: String)

    public fun maxItems(maxItems: Number)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.stepfunctions.S3FileItemReaderProps.Builder =
        software.amazon.awscdk.services.stepfunctions.S3FileItemReaderProps.builder()

    override fun bucket(bucket: IBucket) {
      cdkBuilder.bucket(bucket.let(IBucket::unwrap))
    }

    override fun key(key: String) {
      cdkBuilder.key(key)
    }

    override fun maxItems(maxItems: Number) {
      cdkBuilder.maxItems(maxItems)
    }

    public fun build(): software.amazon.awscdk.services.stepfunctions.S3FileItemReaderProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.stepfunctions.S3FileItemReaderProps,
  ) : CdkObject(cdkObject), S3FileItemReaderProps {
    override fun bucket(): IBucket = unwrap(this).getBucket().let(IBucket::wrap)

    override fun key(): String = unwrap(this).getKey()

    override fun maxItems(): Number? = unwrap(this).getMaxItems()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): S3FileItemReaderProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.stepfunctions.S3FileItemReaderProps):
        S3FileItemReaderProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: S3FileItemReaderProps):
        software.amazon.awscdk.services.stepfunctions.S3FileItemReaderProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.stepfunctions.S3FileItemReaderProps
  }
}
