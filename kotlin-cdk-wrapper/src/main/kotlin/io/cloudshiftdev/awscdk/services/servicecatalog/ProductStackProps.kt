@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.servicecatalog

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import io.cloudshiftdev.awscdk.services.s3.IBucket
import io.cloudshiftdev.awscdk.services.s3.deployment.ServerSideEncryption
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Unit

/**
 * Product stack props.
 *
 * Example:
 *
 * ```
 * import io.cloudshiftdev.awscdk.services.lambda.*;
 * import io.cloudshiftdev.awscdk.*;
 * import io.cloudshiftdev.awscdk.services.s3.Bucket;
 * public class LambdaProduct extends ProductStack {
 * public LambdaProduct(Construct scope, String id, ProductStackProps props) {
 * super(scope, id, props);
 * Function.Builder.create(this, "LambdaProduct")
 * .runtime(Runtime.PYTHON_3_9)
 * .code(Code.fromAsset("./assets"))
 * .handler("index.handler")
 * .build();
 * }
 * }
 * Bucket userDefinedBucket = Bucket.Builder.create(this, "UserDefinedBucket")
 * .bucketName("amzn-s3-demo-bucket")
 * .build();
 * CloudFormationProduct product = CloudFormationProduct.Builder.create(this, "Product")
 * .productName("My Product")
 * .owner("Product Owner")
 * .productVersions(List.of(CloudFormationProductVersion.builder()
 * .productVersionName("v1")
 * .cloudFormationTemplate(CloudFormationTemplate.fromProductStack(LambdaProduct.Builder.create(this,
 * "LambdaFunctionProduct")
 * .assetBucket(userDefinedBucket)
 * .build()))
 * .build()))
 * .build();
 * ```
 */
public interface ProductStackProps {
  /**
   * Include runtime versioning information in this Stack.
   *
   * Default: - `analyticsReporting` setting of containing `App`, or value of
   * 'aws:cdk:version-reporting' context key
   */
  public fun analyticsReporting(): Boolean? = unwrap(this).getAnalyticsReporting()

  /**
   * A Bucket can be passed to store assets, enabling ProductStack Asset support.
   *
   * Default: - No Bucket provided and Assets will not be supported.
   */
  public fun assetBucket(): IBucket? = unwrap(this).getAssetBucket()?.let(IBucket::wrap)

  /**
   * A description of the stack.
   *
   * Default: - No description.
   */
  public fun description(): String? = unwrap(this).getDescription()

  /**
   * The amount of memory (in MiB) to allocate to the AWS Lambda function which replicates the files
   * from the CDK bucket to the destination bucket.
   *
   * If you are deploying large files, you will need to increase this number
   * accordingly.
   *
   * Default: 128
   */
  public fun memoryLimit(): Number? = unwrap(this).getMemoryLimit()

  /**
   * A ServerSideEncryption can be enabled to encrypt assets that are put into assetBucket.
   *
   * Default: - No encryption is used
   */
  public fun serverSideEncryption(): ServerSideEncryption? =
      unwrap(this).getServerSideEncryption()?.let(ServerSideEncryption::wrap)

  /**
   * For AWS_KMS ServerSideEncryption a KMS KeyId must be provided which will be used to encrypt
   * assets.
   *
   * Default: - No KMS KeyId and SSE_KMS encryption cannot be used
   */
  public fun serverSideEncryptionAwsKmsKeyId(): String? =
      unwrap(this).getServerSideEncryptionAwsKmsKeyId()

  /**
   * A builder for [ProductStackProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param analyticsReporting Include runtime versioning information in this Stack.
     */
    public fun analyticsReporting(analyticsReporting: Boolean)

    /**
     * @param assetBucket A Bucket can be passed to store assets, enabling ProductStack Asset
     * support.
     */
    public fun assetBucket(assetBucket: IBucket)

    /**
     * @param description A description of the stack.
     */
    public fun description(description: String)

    /**
     * @param memoryLimit The amount of memory (in MiB) to allocate to the AWS Lambda function which
     * replicates the files from the CDK bucket to the destination bucket.
     * If you are deploying large files, you will need to increase this number
     * accordingly.
     */
    public fun memoryLimit(memoryLimit: Number)

    /**
     * @param serverSideEncryption A ServerSideEncryption can be enabled to encrypt assets that are
     * put into assetBucket.
     */
    public fun serverSideEncryption(serverSideEncryption: ServerSideEncryption)

    /**
     * @param serverSideEncryptionAwsKmsKeyId For AWS_KMS ServerSideEncryption a KMS KeyId must be
     * provided which will be used to encrypt assets.
     */
    public fun serverSideEncryptionAwsKmsKeyId(serverSideEncryptionAwsKmsKeyId: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.servicecatalog.ProductStackProps.Builder
        = software.amazon.awscdk.services.servicecatalog.ProductStackProps.builder()

    /**
     * @param analyticsReporting Include runtime versioning information in this Stack.
     */
    override fun analyticsReporting(analyticsReporting: Boolean) {
      cdkBuilder.analyticsReporting(analyticsReporting)
    }

    /**
     * @param assetBucket A Bucket can be passed to store assets, enabling ProductStack Asset
     * support.
     */
    override fun assetBucket(assetBucket: IBucket) {
      cdkBuilder.assetBucket(assetBucket.let(IBucket.Companion::unwrap))
    }

    /**
     * @param description A description of the stack.
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * @param memoryLimit The amount of memory (in MiB) to allocate to the AWS Lambda function which
     * replicates the files from the CDK bucket to the destination bucket.
     * If you are deploying large files, you will need to increase this number
     * accordingly.
     */
    override fun memoryLimit(memoryLimit: Number) {
      cdkBuilder.memoryLimit(memoryLimit)
    }

    /**
     * @param serverSideEncryption A ServerSideEncryption can be enabled to encrypt assets that are
     * put into assetBucket.
     */
    override fun serverSideEncryption(serverSideEncryption: ServerSideEncryption) {
      cdkBuilder.serverSideEncryption(serverSideEncryption.let(ServerSideEncryption.Companion::unwrap))
    }

    /**
     * @param serverSideEncryptionAwsKmsKeyId For AWS_KMS ServerSideEncryption a KMS KeyId must be
     * provided which will be used to encrypt assets.
     */
    override fun serverSideEncryptionAwsKmsKeyId(serverSideEncryptionAwsKmsKeyId: String) {
      cdkBuilder.serverSideEncryptionAwsKmsKeyId(serverSideEncryptionAwsKmsKeyId)
    }

    public fun build(): software.amazon.awscdk.services.servicecatalog.ProductStackProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.servicecatalog.ProductStackProps,
  ) : CdkObject(cdkObject),
      ProductStackProps {
    /**
     * Include runtime versioning information in this Stack.
     *
     * Default: - `analyticsReporting` setting of containing `App`, or value of
     * 'aws:cdk:version-reporting' context key
     */
    override fun analyticsReporting(): Boolean? = unwrap(this).getAnalyticsReporting()

    /**
     * A Bucket can be passed to store assets, enabling ProductStack Asset support.
     *
     * Default: - No Bucket provided and Assets will not be supported.
     */
    override fun assetBucket(): IBucket? = unwrap(this).getAssetBucket()?.let(IBucket::wrap)

    /**
     * A description of the stack.
     *
     * Default: - No description.
     */
    override fun description(): String? = unwrap(this).getDescription()

    /**
     * The amount of memory (in MiB) to allocate to the AWS Lambda function which replicates the
     * files from the CDK bucket to the destination bucket.
     *
     * If you are deploying large files, you will need to increase this number
     * accordingly.
     *
     * Default: 128
     */
    override fun memoryLimit(): Number? = unwrap(this).getMemoryLimit()

    /**
     * A ServerSideEncryption can be enabled to encrypt assets that are put into assetBucket.
     *
     * Default: - No encryption is used
     */
    override fun serverSideEncryption(): ServerSideEncryption? =
        unwrap(this).getServerSideEncryption()?.let(ServerSideEncryption::wrap)

    /**
     * For AWS_KMS ServerSideEncryption a KMS KeyId must be provided which will be used to encrypt
     * assets.
     *
     * Default: - No KMS KeyId and SSE_KMS encryption cannot be used
     */
    override fun serverSideEncryptionAwsKmsKeyId(): String? =
        unwrap(this).getServerSideEncryptionAwsKmsKeyId()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): ProductStackProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.servicecatalog.ProductStackProps):
        ProductStackProps = CdkObjectWrappers.wrap(cdkObject) as? ProductStackProps ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: ProductStackProps):
        software.amazon.awscdk.services.servicecatalog.ProductStackProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.servicecatalog.ProductStackProps
  }
}
