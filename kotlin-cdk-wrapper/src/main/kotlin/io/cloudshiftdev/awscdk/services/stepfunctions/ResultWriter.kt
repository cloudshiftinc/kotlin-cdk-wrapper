@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.stepfunctions

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.services.iam.PolicyStatement
import io.cloudshiftdev.awscdk.services.s3.IBucket
import kotlin.Any
import kotlin.Deprecated
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

/**
 * (deprecated) Configuration for writing Distributed Map state results to S3.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.s3.*;
 * import io.cloudshiftdev.awscdk.services.stepfunctions.*;
 * Bucket bucket;
 * ResultWriter resultWriter = ResultWriter.Builder.create()
 * .bucket(bucket)
 * // the properties below are optional
 * .prefix("prefix")
 * .build();
 * ```
 *
 * @deprecated use [ResultWriterV2 ] instead
 */
public open class ResultWriter(
  cdkObject: software.amazon.awscdk.services.stepfunctions.ResultWriter,
) : CdkObject(cdkObject) {
  @Deprecated(message = "deprecated in CDK")
  public constructor(props: ResultWriterProps) :
      this(software.amazon.awscdk.services.stepfunctions.ResultWriter(props.let(ResultWriterProps.Companion::unwrap))
  )

  @Deprecated(message = "deprecated in CDK")
  public constructor(props: ResultWriterProps.Builder.() -> Unit) : this(ResultWriterProps(props)
  )

  /**
   * (deprecated) S3 Bucket in which to save Map Run results.
   */
  @Deprecated(message = "deprecated in CDK")
  public open fun bucket(): IBucket = unwrap(this).getBucket().let(IBucket::wrap)

  /**
   * (deprecated) S3 prefix in which to save Map Run results.
   *
   * Default: - No prefix
   */
  @Deprecated(message = "deprecated in CDK")
  public open fun prefix(): String? = unwrap(this).getPrefix()

  /**
   * (deprecated) Compile policy statements to provide relevent permissions to the state machine.
   */
  @Deprecated(message = "deprecated in CDK")
  public open fun providePolicyStatements(): List<PolicyStatement> =
      unwrap(this).providePolicyStatements().map(PolicyStatement::wrap)

  /**
   * (deprecated) Render ResultWriter in ASL JSON format.
   *
   * @param queryLanguage
   */
  @Deprecated(message = "deprecated in CDK")
  public open fun render(): Any = unwrap(this).render()

  /**
   * (deprecated) Render ResultWriter in ASL JSON format.
   *
   * @param queryLanguage
   */
  @Deprecated(message = "deprecated in CDK")
  public open fun render(queryLanguage: QueryLanguage): Any =
      unwrap(this).render(queryLanguage.let(QueryLanguage.Companion::unwrap))

  /**
   * (deprecated) A fluent builder for
   * [io.cloudshiftdev.awscdk.services.stepfunctions.ResultWriter].
   */
  @CdkDslMarker
  @Deprecated(message = "deprecated in CDK")
  public interface Builder {
    /**
     * (deprecated) S3 Bucket in which to save Map Run results.
     *
     * @param bucket S3 Bucket in which to save Map Run results. 
     */
    @Deprecated(message = "deprecated in CDK")
    public fun bucket(bucket: IBucket)

    /**
     * (deprecated) S3 prefix in which to save Map Run results.
     *
     * Default: - No prefix
     *
     * @param prefix S3 prefix in which to save Map Run results. 
     */
    @Deprecated(message = "deprecated in CDK")
    public fun prefix(prefix: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.stepfunctions.ResultWriter.Builder =
        software.amazon.awscdk.services.stepfunctions.ResultWriter.Builder.create()

    /**
     * (deprecated) S3 Bucket in which to save Map Run results.
     *
     * @param bucket S3 Bucket in which to save Map Run results. 
     */
    @Deprecated(message = "deprecated in CDK")
    override fun bucket(bucket: IBucket) {
      cdkBuilder.bucket(bucket.let(IBucket.Companion::unwrap))
    }

    /**
     * (deprecated) S3 prefix in which to save Map Run results.
     *
     * Default: - No prefix
     *
     * @param prefix S3 prefix in which to save Map Run results. 
     */
    @Deprecated(message = "deprecated in CDK")
    override fun prefix(prefix: String) {
      cdkBuilder.prefix(prefix)
    }

    public fun build(): software.amazon.awscdk.services.stepfunctions.ResultWriter =
        cdkBuilder.build()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): ResultWriter {
      val builderImpl = BuilderImpl()
      return ResultWriter(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.stepfunctions.ResultWriter):
        ResultWriter = ResultWriter(cdkObject)

    internal fun unwrap(wrapped: ResultWriter):
        software.amazon.awscdk.services.stepfunctions.ResultWriter = wrapped.cdkObject as
        software.amazon.awscdk.services.stepfunctions.ResultWriter
  }
}
