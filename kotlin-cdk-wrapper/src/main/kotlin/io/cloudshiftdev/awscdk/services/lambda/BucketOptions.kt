@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.lambda

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import io.cloudshiftdev.awscdk.services.kms.IKey
import kotlin.String
import kotlin.Unit

/**
 * Optional parameters for creating code using bucket.
 *
 * Example:
 *
 * ```
 * import io.cloudshiftdev.awscdk.services.kms.Key;
 * import io.cloudshiftdev.awscdk.services.s3.*;
 * Key key;
 * Bucket bucket = new Bucket(this, "Bucket");
 * Map&lt;String, Key&gt; options = Map.of(
 * "sourceKMSKey", key);
 * Function fnBucket = Function.Builder.create(this, "myFunction2")
 * .runtime(Runtime.NODEJS_LATEST)
 * .handler("index.handler")
 * .code(Code.fromBucketV2(bucket, "python-lambda-handler.zip", options))
 * .build();
 * ```
 */
public interface BucketOptions {
  /**
   * Optional S3 object version.
   */
  public fun objectVersion(): String? = unwrap(this).getObjectVersion()

  /**
   * The ARN of the KMS key used to encrypt the handler code.
   *
   * Default: - the default server-side encryption with Amazon S3 managed keys(SSE-S3) key will be
   * used.
   */
  public fun sourceKMSKey(): IKey? = unwrap(this).getSourceKMSKey()?.let(IKey::wrap)

  /**
   * A builder for [BucketOptions]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param objectVersion Optional S3 object version.
     */
    public fun objectVersion(objectVersion: String)

    /**
     * @param sourceKmsKey The ARN of the KMS key used to encrypt the handler code.
     */
    public fun sourceKmsKey(sourceKmsKey: IKey)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.lambda.BucketOptions.Builder =
        software.amazon.awscdk.services.lambda.BucketOptions.builder()

    /**
     * @param objectVersion Optional S3 object version.
     */
    override fun objectVersion(objectVersion: String) {
      cdkBuilder.objectVersion(objectVersion)
    }

    /**
     * @param sourceKmsKey The ARN of the KMS key used to encrypt the handler code.
     */
    override fun sourceKmsKey(sourceKmsKey: IKey) {
      cdkBuilder.sourceKmsKey(sourceKmsKey.let(IKey.Companion::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.lambda.BucketOptions = cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.lambda.BucketOptions,
  ) : CdkObject(cdkObject),
      BucketOptions {
    /**
     * Optional S3 object version.
     */
    override fun objectVersion(): String? = unwrap(this).getObjectVersion()

    /**
     * The ARN of the KMS key used to encrypt the handler code.
     *
     * Default: - the default server-side encryption with Amazon S3 managed keys(SSE-S3) key will be
     * used.
     */
    override fun sourceKMSKey(): IKey? = unwrap(this).getSourceKMSKey()?.let(IKey::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): BucketOptions {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.lambda.BucketOptions):
        BucketOptions = CdkObjectWrappers.wrap(cdkObject) as? BucketOptions ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: BucketOptions):
        software.amazon.awscdk.services.lambda.BucketOptions = (wrapped as CdkObject).cdkObject as
        software.amazon.awscdk.services.lambda.BucketOptions
  }
}
