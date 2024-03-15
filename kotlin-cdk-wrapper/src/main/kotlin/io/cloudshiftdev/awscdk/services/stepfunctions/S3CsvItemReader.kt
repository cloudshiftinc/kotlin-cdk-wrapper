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

public open class S3CsvItemReader internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.stepfunctions.S3CsvItemReader,
) : CdkObject(cdkObject), IItemReader {
  public override fun bucket(): IBucket = unwrap(this).getBucket().let(IBucket::wrap)

  public open fun csvHeaders(): CsvHeaders = unwrap(this).getCsvHeaders().let(CsvHeaders::wrap)

  public open fun key(): String = unwrap(this).getKey()

  public override fun maxItems(): Number? = unwrap(this).getMaxItems()

  public override fun providePolicyStatements(): List<PolicyStatement> =
      unwrap(this).providePolicyStatements().map(PolicyStatement::wrap)

  public override fun render(): Any = unwrap(this).render()

  public override fun resource(): String = unwrap(this).getResource()

  @CdkDslMarker
  public interface Builder {
    public fun bucket(bucket: IBucket)

    public fun csvHeaders(csvHeaders: CsvHeaders)

    public fun key(key: String)

    public fun maxItems(maxItems: Number)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.stepfunctions.S3CsvItemReader.Builder =
        software.amazon.awscdk.services.stepfunctions.S3CsvItemReader.Builder.create()

    override fun bucket(bucket: IBucket) {
      cdkBuilder.bucket(bucket.let(IBucket::unwrap))
    }

    override fun csvHeaders(csvHeaders: CsvHeaders) {
      cdkBuilder.csvHeaders(csvHeaders.let(CsvHeaders::unwrap))
    }

    override fun key(key: String) {
      cdkBuilder.key(key)
    }

    override fun maxItems(maxItems: Number) {
      cdkBuilder.maxItems(maxItems)
    }

    public fun build(): software.amazon.awscdk.services.stepfunctions.S3CsvItemReader =
        cdkBuilder.build()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): S3CsvItemReader {
      val builderImpl = BuilderImpl()
      return S3CsvItemReader(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.stepfunctions.S3CsvItemReader):
        S3CsvItemReader = S3CsvItemReader(cdkObject)

    internal fun unwrap(wrapped: S3CsvItemReader):
        software.amazon.awscdk.services.stepfunctions.S3CsvItemReader = wrapped.cdkObject
  }
}
