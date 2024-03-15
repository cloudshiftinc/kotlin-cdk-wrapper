@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.stepfunctions

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.services.iam.PolicyStatement
import io.cloudshiftdev.awscdk.services.s3.IBucket
import kotlin.Any
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

public open class S3ObjectsItemReader internal constructor(
  internal override val cdkObject:
      software.amazon.awscdk.services.stepfunctions.S3ObjectsItemReader,
) : CdkObject(cdkObject), IItemReader {
  public override fun bucket(): IBucket = unwrap(this).getBucket().let(IBucket::wrap)

  public override fun maxItems(): Number? = unwrap(this).getMaxItems()

  public open fun prefix(): String? = unwrap(this).getPrefix()

  public override fun providePolicyStatements(): List<PolicyStatement> =
      unwrap(this).providePolicyStatements().map(PolicyStatement::wrap)

  public override fun render(): Any = unwrap(this).render()

  public override fun resource(): String = unwrap(this).getResource()

  @CdkDslMarker
  public interface Builder {
    public fun bucket(bucket: IBucket)

    public fun maxItems(maxItems: Number)

    public fun prefix(prefix: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.stepfunctions.S3ObjectsItemReader.Builder =
        software.amazon.awscdk.services.stepfunctions.S3ObjectsItemReader.Builder.create()

    override fun bucket(bucket: IBucket) {
      cdkBuilder.bucket(bucket.let(IBucket::unwrap))
    }

    override fun maxItems(maxItems: Number) {
      cdkBuilder.maxItems(maxItems)
    }

    override fun prefix(prefix: String) {
      cdkBuilder.prefix(prefix)
    }

    public fun build(): software.amazon.awscdk.services.stepfunctions.S3ObjectsItemReader =
        cdkBuilder.build()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): S3ObjectsItemReader {
      val builderImpl = BuilderImpl()
      return S3ObjectsItemReader(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.stepfunctions.S3ObjectsItemReader):
        S3ObjectsItemReader = S3ObjectsItemReader(cdkObject)

    internal fun unwrap(wrapped: S3ObjectsItemReader):
        software.amazon.awscdk.services.stepfunctions.S3ObjectsItemReader = wrapped.cdkObject
  }
}
