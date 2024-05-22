@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.servicecatalog

import io.cloudshiftdev.awscdk.Stack
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.services.s3.IBucket
import io.cloudshiftdev.awscdk.services.s3.deployment.ServerSideEncryption
import kotlin.Number
import kotlin.String
import kotlin.Unit
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * A Service Catalog product stack, which is similar in form to a Cloudformation nested stack.
 *
 * You can add the resources to this stack that you want to define for your service catalog product.
 *
 * This stack will not be treated as an independent deployment
 * artifact (won't be listed in "cdk list" or deployable through "cdk deploy"),
 * but rather only synthesized as a template and uploaded as an asset to S3.
 *
 * Example:
 *
 * ```
 * public class S3BucketProduct extends ProductStack {
 * public S3BucketProduct(Construct scope, String id) {
 * super(scope, id);
 * new Bucket(this, "BucketProductV2");
 * }
 * }
 * ProductStackHistory productStackHistory = ProductStackHistory.Builder.create(this,
 * "ProductStackHistory")
 * .productStack(new S3BucketProduct(this, "S3BucketProduct"))
 * .currentVersionName("v2")
 * .currentVersionLocked(true)
 * .build();
 * CloudFormationProduct product = CloudFormationProduct.Builder.create(this, "MyFirstProduct")
 * .productName("My Product")
 * .owner("Product Owner")
 * .productVersions(List.of(productStackHistory.currentVersion(),
 * productStackHistory.versionFromSnapshot("v1")))
 * .build();
 * ```
 */
public open class ProductStack(
  cdkObject: software.amazon.awscdk.services.servicecatalog.ProductStack,
) : Stack(cdkObject) {
  public constructor(scope: CloudshiftdevConstructsConstruct, id: String) :
      this(software.amazon.awscdk.services.servicecatalog.ProductStack(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id)
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: ProductStackProps,
  ) :
      this(software.amazon.awscdk.services.servicecatalog.ProductStack(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id, props.let(ProductStackProps.Companion::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: ProductStackProps.Builder.() -> Unit,
  ) : this(scope, id, ProductStackProps(props)
  )

  /**
   * The name of the CloudFormation template file emitted to the output directory during synthesis.
   *
   * Example value: `MyStack.template.json`
   */
  public override fun templateFile(): String = unwrap(this).getTemplateFile()

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.servicecatalog.ProductStack].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * A Bucket can be passed to store assets, enabling ProductStack Asset support.
     *
     * Default: - No Bucket provided and Assets will not be supported.
     *
     * @param assetBucket A Bucket can be passed to store assets, enabling ProductStack Asset
     * support. 
     */
    public fun assetBucket(assetBucket: IBucket)

    /**
     * The amount of memory (in MiB) to allocate to the AWS Lambda function which replicates the
     * files from the CDK bucket to the destination bucket.
     *
     * If you are deploying large files, you will need to increase this number
     * accordingly.
     *
     * Default: 128
     *
     * @param memoryLimit The amount of memory (in MiB) to allocate to the AWS Lambda function which
     * replicates the files from the CDK bucket to the destination bucket. 
     */
    public fun memoryLimit(memoryLimit: Number)

    /**
     * A ServerSideEncryption can be enabled to encrypt assets that are put into assetBucket.
     *
     * Default: - No encryption is used
     *
     * @param serverSideEncryption A ServerSideEncryption can be enabled to encrypt assets that are
     * put into assetBucket. 
     */
    public fun serverSideEncryption(serverSideEncryption: ServerSideEncryption)

    /**
     * For AWS_KMS ServerSideEncryption a KMS KeyId must be provided which will be used to encrypt
     * assets.
     *
     * Default: - No KMS KeyId and SSE_KMS encryption cannot be used
     *
     * @param serverSideEncryptionAwsKmsKeyId For AWS_KMS ServerSideEncryption a KMS KeyId must be
     * provided which will be used to encrypt assets. 
     */
    public fun serverSideEncryptionAwsKmsKeyId(serverSideEncryptionAwsKmsKeyId: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.servicecatalog.ProductStack.Builder =
        software.amazon.awscdk.services.servicecatalog.ProductStack.Builder.create(scope, id)

    /**
     * A Bucket can be passed to store assets, enabling ProductStack Asset support.
     *
     * Default: - No Bucket provided and Assets will not be supported.
     *
     * @param assetBucket A Bucket can be passed to store assets, enabling ProductStack Asset
     * support. 
     */
    override fun assetBucket(assetBucket: IBucket) {
      cdkBuilder.assetBucket(assetBucket.let(IBucket.Companion::unwrap))
    }

    /**
     * The amount of memory (in MiB) to allocate to the AWS Lambda function which replicates the
     * files from the CDK bucket to the destination bucket.
     *
     * If you are deploying large files, you will need to increase this number
     * accordingly.
     *
     * Default: 128
     *
     * @param memoryLimit The amount of memory (in MiB) to allocate to the AWS Lambda function which
     * replicates the files from the CDK bucket to the destination bucket. 
     */
    override fun memoryLimit(memoryLimit: Number) {
      cdkBuilder.memoryLimit(memoryLimit)
    }

    /**
     * A ServerSideEncryption can be enabled to encrypt assets that are put into assetBucket.
     *
     * Default: - No encryption is used
     *
     * @param serverSideEncryption A ServerSideEncryption can be enabled to encrypt assets that are
     * put into assetBucket. 
     */
    override fun serverSideEncryption(serverSideEncryption: ServerSideEncryption) {
      cdkBuilder.serverSideEncryption(serverSideEncryption.let(ServerSideEncryption.Companion::unwrap))
    }

    /**
     * For AWS_KMS ServerSideEncryption a KMS KeyId must be provided which will be used to encrypt
     * assets.
     *
     * Default: - No KMS KeyId and SSE_KMS encryption cannot be used
     *
     * @param serverSideEncryptionAwsKmsKeyId For AWS_KMS ServerSideEncryption a KMS KeyId must be
     * provided which will be used to encrypt assets. 
     */
    override fun serverSideEncryptionAwsKmsKeyId(serverSideEncryptionAwsKmsKeyId: String) {
      cdkBuilder.serverSideEncryptionAwsKmsKeyId(serverSideEncryptionAwsKmsKeyId)
    }

    public fun build(): software.amazon.awscdk.services.servicecatalog.ProductStack =
        cdkBuilder.build()
  }

  public companion object {
    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): ProductStack {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return ProductStack(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.servicecatalog.ProductStack):
        ProductStack = ProductStack(cdkObject)

    internal fun unwrap(wrapped: ProductStack):
        software.amazon.awscdk.services.servicecatalog.ProductStack = wrapped.cdkObject as
        software.amazon.awscdk.services.servicecatalog.ProductStack
  }
}
