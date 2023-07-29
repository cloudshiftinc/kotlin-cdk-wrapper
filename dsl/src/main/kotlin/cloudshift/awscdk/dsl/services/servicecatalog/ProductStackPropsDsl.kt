@file:Suppress(
    "RedundantVisibilityModifier",
    "RedundantUnitReturnType",
    "RemoveRedundantQualifierName",
    "unused",
    "UnusedImport",
    "ClassName",
    "REDUNDANT_PROJECTION",
    "DEPRECATION"
)

package cloudshift.awscdk.dsl.services.servicecatalog

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.s3.IBucket
import software.amazon.awscdk.services.s3.deployment.ServerSideEncryption
import software.amazon.awscdk.services.servicecatalog.ProductStackProps

/**
 * Product stack props.
 *
 * Example:
 * ```
 * import software.amazon.awscdk.services.lambda.*;
 * import software.amazon.awscdk.*;
 * import software.amazon.awscdk.services.s3.Bucket;
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
 * .bucketName("user-defined-bucket-for-product-stack-assets")
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
@CdkDslMarker
public class ProductStackPropsDsl {
    private val cdkBuilder: ProductStackProps.Builder = ProductStackProps.builder()

    /**
     * @param assetBucket A Bucket can be passed to store assets, enabling ProductStack Asset
     *   support.
     */
    public fun assetBucket(assetBucket: IBucket) {
        cdkBuilder.assetBucket(assetBucket)
    }

    /**
     * @param serverSideEncryption A ServerSideEncryption can be enabled to encrypt assets that are
     *   put into assetBucket.
     */
    public fun serverSideEncryption(serverSideEncryption: ServerSideEncryption) {
        cdkBuilder.serverSideEncryption(serverSideEncryption)
    }

    /**
     * @param serverSideEncryptionAwsKmsKeyId For AWS_KMS ServerSideEncryption a KMS KeyId must be
     *   provided which will be used to encrypt assets.
     */
    public fun serverSideEncryptionAwsKmsKeyId(serverSideEncryptionAwsKmsKeyId: String) {
        cdkBuilder.serverSideEncryptionAwsKmsKeyId(serverSideEncryptionAwsKmsKeyId)
    }

    public fun build(): ProductStackProps = cdkBuilder.build()
}
