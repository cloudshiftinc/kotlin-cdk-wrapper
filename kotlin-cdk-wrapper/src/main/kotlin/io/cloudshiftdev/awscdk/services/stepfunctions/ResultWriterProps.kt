@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.stepfunctions

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.services.s3.IBucket
import kotlin.String
import kotlin.Unit

public interface ResultWriterProps {
  public fun bucket(): IBucket

  public fun prefix(): String? = unwrap(this).getPrefix()

  @CdkDslMarker
  public interface Builder {
    public fun bucket(bucket: IBucket)

    public fun prefix(prefix: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.stepfunctions.ResultWriterProps.Builder
        = software.amazon.awscdk.services.stepfunctions.ResultWriterProps.builder()

    override fun bucket(bucket: IBucket) {
      cdkBuilder.bucket(bucket.let(IBucket::unwrap))
    }

    override fun prefix(prefix: String) {
      cdkBuilder.prefix(prefix)
    }

    public fun build(): software.amazon.awscdk.services.stepfunctions.ResultWriterProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.stepfunctions.ResultWriterProps,
  ) : CdkObject(cdkObject), ResultWriterProps {
    override fun bucket(): IBucket = unwrap(this).getBucket().let(IBucket::wrap)

    override fun prefix(): String? = unwrap(this).getPrefix()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): ResultWriterProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.stepfunctions.ResultWriterProps):
        ResultWriterProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: ResultWriterProps):
        software.amazon.awscdk.services.stepfunctions.ResultWriterProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.stepfunctions.ResultWriterProps
  }
}
