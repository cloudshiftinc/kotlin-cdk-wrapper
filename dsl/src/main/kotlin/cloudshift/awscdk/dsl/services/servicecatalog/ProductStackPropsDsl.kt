@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.servicecatalog

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.s3.IBucket
import software.amazon.awscdk.services.s3.deployment.ServerSideEncryption
import software.amazon.awscdk.services.servicecatalog.ProductStackProps

@CdkDslMarker
public class ProductStackPropsDsl {
  private val cdkBuilder: ProductStackProps.Builder = ProductStackProps.builder()

  /**
   * @param assetBucket A Bucket can be passed to store assets, enabling ProductStack Asset support.
   */
  public fun assetBucket(assetBucket: IBucket) {
    cdkBuilder.assetBucket(assetBucket)
  }

  /**
   * @param serverSideEncryption A ServerSideEncryption can be enabled to encrypt assets that are
   * put into assetBucket.
   */
  public fun serverSideEncryption(serverSideEncryption: ServerSideEncryption) {
    cdkBuilder.serverSideEncryption(serverSideEncryption)
  }

  /**
   * @param serverSideEncryptionAwsKmsKeyId For AWS_KMS ServerSideEncryption a KMS KeyId must be
   * provided which will be used to encrypt assets.
   */
  public fun serverSideEncryptionAwsKmsKeyId(serverSideEncryptionAwsKmsKeyId: String) {
    cdkBuilder.serverSideEncryptionAwsKmsKeyId(serverSideEncryptionAwsKmsKeyId)
  }

  public fun build(): ProductStackProps = cdkBuilder.build()
}
