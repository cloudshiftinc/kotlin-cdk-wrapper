@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.lambda

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.services.kms.IKey
import io.cloudshiftdev.constructs.Construct
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import io.cloudshiftdev.awscdk.services.s3.IBucket as CloudshiftdevAwscdkServicesS3IBucket
import software.amazon.awscdk.services.s3.IBucket as AmazonAwscdkServicesS3IBucket

/**
 * Lambda code from an S3 archive.
 *
 * With option to set KMSKey for encryption.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.kms.*;
 * import io.cloudshiftdev.awscdk.services.lambda.*;
 * import io.cloudshiftdev.awscdk.services.s3.*;
 * Bucket bucket;
 * Key key;
 * S3CodeV2 s3CodeV2 = S3CodeV2.Builder.create(bucket, "key")
 * .objectVersion("objectVersion")
 * .sourceKMSKey(key)
 * .build();
 * ```
 */
public open class S3CodeV2(
  cdkObject: software.amazon.awscdk.services.lambda.S3CodeV2,
) : Code(cdkObject) {
  public constructor(bucket: CloudshiftdevAwscdkServicesS3IBucket, key: String) :
      this(software.amazon.awscdk.services.lambda.S3CodeV2(bucket.let(CloudshiftdevAwscdkServicesS3IBucket.Companion::unwrap),
      key)
  )

  public constructor(
    bucket: CloudshiftdevAwscdkServicesS3IBucket,
    key: String,
    options: BucketOptions,
  ) :
      this(software.amazon.awscdk.services.lambda.S3CodeV2(bucket.let(CloudshiftdevAwscdkServicesS3IBucket.Companion::unwrap),
      key, options.let(BucketOptions.Companion::unwrap))
  )

  public constructor(
    bucket: CloudshiftdevAwscdkServicesS3IBucket,
    key: String,
    options: BucketOptions.Builder.() -> Unit,
  ) : this(bucket, key, BucketOptions(options)
  )

  /**
   * Called when the lambda or layer is initialized to allow this object to bind to the stack, add
   * resources and have fun.
   *
   * @param _scope 
   */
  public override fun bind(scope: Construct): CodeConfig =
      unwrap(this).bind(scope.let(Construct.Companion::unwrap)).let(CodeConfig::wrap)

  /**
   * Determines whether this Code is inline code or not.
   */
  public open fun isInline(): Boolean = unwrap(this).getIsInline()

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.lambda.S3CodeV2].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * Optional S3 object version.
     *
     * @param objectVersion Optional S3 object version. 
     */
    public fun objectVersion(objectVersion: String)

    /**
     * The ARN of the KMS key used to encrypt the handler code.
     *
     * Default: - the default server-side encryption with Amazon S3 managed keys(SSE-S3) key will be
     * used.
     *
     * @param sourceKmsKey The ARN of the KMS key used to encrypt the handler code. 
     */
    public fun sourceKmsKey(sourceKmsKey: IKey)
  }

  private class BuilderImpl(
    bucket: AmazonAwscdkServicesS3IBucket,
    key: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.lambda.S3CodeV2.Builder =
        software.amazon.awscdk.services.lambda.S3CodeV2.Builder.create(bucket, key)

    /**
     * Optional S3 object version.
     *
     * @param objectVersion Optional S3 object version. 
     */
    override fun objectVersion(objectVersion: String) {
      cdkBuilder.objectVersion(objectVersion)
    }

    /**
     * The ARN of the KMS key used to encrypt the handler code.
     *
     * Default: - the default server-side encryption with Amazon S3 managed keys(SSE-S3) key will be
     * used.
     *
     * @param sourceKmsKey The ARN of the KMS key used to encrypt the handler code. 
     */
    override fun sourceKmsKey(sourceKmsKey: IKey) {
      cdkBuilder.sourceKmsKey(sourceKmsKey.let(IKey.Companion::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.lambda.S3CodeV2 = cdkBuilder.build()
  }

  public companion object {
    public operator fun invoke(
      bucket: CloudshiftdevAwscdkServicesS3IBucket,
      key: String,
      block: Builder.() -> Unit = {},
    ): S3CodeV2 {
      val builderImpl = BuilderImpl(CloudshiftdevAwscdkServicesS3IBucket.unwrap(bucket), key)
      return S3CodeV2(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.lambda.S3CodeV2): S3CodeV2 =
        S3CodeV2(cdkObject)

    internal fun unwrap(wrapped: S3CodeV2): software.amazon.awscdk.services.lambda.S3CodeV2 =
        wrapped.cdkObject as software.amazon.awscdk.services.lambda.S3CodeV2
  }
}
