@file:Suppress("RedundantVisibilityModifier", "RedundantUnitReturnType", "RemoveRedundantQualifierName", "unused", "UnusedImport", "ClassName", "REDUNDANT_PROJECTION", "DEPRECATION")

package cloudshift.awscdk.dsl.services.servicecatalog

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.s3.IBucket
import software.amazon.awscdk.services.s3.deployment.ServerSideEncryption
import software.amazon.awscdk.services.servicecatalog.ProductStack
import software.constructs.Construct
import kotlin.String

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
@CdkDslMarker
public class ProductStackDsl(
    scope: Construct,
    id: String
) {
    private val cdkBuilder: ProductStack.Builder = ProductStack.Builder.create(scope, id)

    /**
     * A Bucket can be passed to store assets, enabling ProductStack Asset support.
     *
     * Default: - No Bucket provided and Assets will not be supported.
     *
     * @param assetBucket A Bucket can be passed to store assets, enabling ProductStack Asset support.
     *
     */
    public fun assetBucket(assetBucket: IBucket) {
        cdkBuilder.assetBucket(assetBucket)
    }

    /**
     * A ServerSideEncryption can be enabled to encrypt assets that are put into assetBucket.
     *
     * Default: - No encryption is used
     *
     * @param serverSideEncryption A ServerSideEncryption can be enabled to encrypt assets that are
     * put into assetBucket.
     */
    public fun serverSideEncryption(serverSideEncryption: ServerSideEncryption) {
        cdkBuilder.serverSideEncryption(serverSideEncryption)
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
    public fun serverSideEncryptionAwsKmsKeyId(serverSideEncryptionAwsKmsKeyId: String) {
        cdkBuilder.serverSideEncryptionAwsKmsKeyId(serverSideEncryptionAwsKmsKeyId)
    }

    public fun build(): ProductStack = cdkBuilder.build()
}
