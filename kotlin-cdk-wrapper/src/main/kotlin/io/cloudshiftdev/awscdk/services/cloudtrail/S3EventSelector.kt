@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.cloudtrail

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.services.s3.IBucket
import kotlin.String
import kotlin.Unit

public interface S3EventSelector {
  public fun bucket(): IBucket

  public fun objectPrefix(): String? = unwrap(this).getObjectPrefix()

  @CdkDslMarker
  public interface Builder {
    public fun bucket(bucket: IBucket)

    public fun objectPrefix(objectPrefix: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.cloudtrail.S3EventSelector.Builder =
        software.amazon.awscdk.services.cloudtrail.S3EventSelector.builder()

    override fun bucket(bucket: IBucket) {
      cdkBuilder.bucket(bucket.let(IBucket::unwrap))
    }

    override fun objectPrefix(objectPrefix: String) {
      cdkBuilder.objectPrefix(objectPrefix)
    }

    public fun build(): software.amazon.awscdk.services.cloudtrail.S3EventSelector =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.cloudtrail.S3EventSelector,
  ) : CdkObject(cdkObject), S3EventSelector {
    override fun bucket(): IBucket = unwrap(this).getBucket().let(IBucket::wrap)

    override fun objectPrefix(): String? = unwrap(this).getObjectPrefix()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): S3EventSelector {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.cloudtrail.S3EventSelector):
        S3EventSelector = Wrapper(cdkObject)

    internal fun unwrap(wrapped: S3EventSelector):
        software.amazon.awscdk.services.cloudtrail.S3EventSelector = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.cloudtrail.S3EventSelector
  }
}
