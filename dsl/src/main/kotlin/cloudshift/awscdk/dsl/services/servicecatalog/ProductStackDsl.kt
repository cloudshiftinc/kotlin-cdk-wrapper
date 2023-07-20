@file:Suppress(
    "RedundantVisibilityModifier",
    "RedundantUnitReturnType",
    "RemoveRedundantQualifierName",
    "unused",
    "UnusedImport",
    "ClassName",
    "REDUNDANT_PROJECTION",
    "DEPRECATION",
)

package cloudshift.awscdk.dsl.services.servicecatalog

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.s3.IBucket
import software.amazon.awscdk.services.s3.deployment.ServerSideEncryption
import software.amazon.awscdk.services.servicecatalog.ProductStack
import software.constructs.Construct
import kotlin.String

@CdkDslMarker
public class ProductStackDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: ProductStack.Builder = ProductStack.Builder.create(scope, id)

    public fun assetBucket(assetBucket: IBucket) {
        cdkBuilder.assetBucket(assetBucket)
    }

    public fun serverSideEncryption(serverSideEncryption: ServerSideEncryption) {
        cdkBuilder.serverSideEncryption(serverSideEncryption)
    }

    public fun serverSideEncryptionAwsKmsKeyId(serverSideEncryptionAwsKmsKeyId: String) {
        cdkBuilder.serverSideEncryptionAwsKmsKeyId(serverSideEncryptionAwsKmsKeyId)
    }

    public fun build(): ProductStack = cdkBuilder.build()
}
