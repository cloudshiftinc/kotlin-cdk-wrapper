@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.s3

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import software.amazon.awscdk.services.s3.BlockPublicAccess

/**
 * Example:
 *
 * ```
 * Bucket bucket = Bucket.Builder.create(this, "MyBlockedBucket")
 * .blockPublicAccess(BlockPublicAccess.BLOCK_ALL)
 * .build();
 * ```
 */
@CdkDslMarker
public class BlockPublicAccessDsl {
  private val cdkBuilder: BlockPublicAccess.Builder = BlockPublicAccess.Builder.create()

  /**
   * Whether to block public ACLs.
   *
   * [Documentation](https://docs.aws.amazon.com/AmazonS3/latest/dev/access-control-block-public-access.html#access-control-block-public-access-options)
   * @param blockPublicAcls Whether to block public ACLs. 
   */
  public fun blockPublicAcls(blockPublicAcls: Boolean) {
    cdkBuilder.blockPublicAcls(blockPublicAcls)
  }

  /**
   * Whether to block public policy.
   *
   * [Documentation](https://docs.aws.amazon.com/AmazonS3/latest/dev/access-control-block-public-access.html#access-control-block-public-access-options)
   * @param blockPublicPolicy Whether to block public policy. 
   */
  public fun blockPublicPolicy(blockPublicPolicy: Boolean) {
    cdkBuilder.blockPublicPolicy(blockPublicPolicy)
  }

  /**
   * Whether to ignore public ACLs.
   *
   * [Documentation](https://docs.aws.amazon.com/AmazonS3/latest/dev/access-control-block-public-access.html#access-control-block-public-access-options)
   * @param ignorePublicAcls Whether to ignore public ACLs. 
   */
  public fun ignorePublicAcls(ignorePublicAcls: Boolean) {
    cdkBuilder.ignorePublicAcls(ignorePublicAcls)
  }

  /**
   * Whether to restrict public access.
   *
   * [Documentation](https://docs.aws.amazon.com/AmazonS3/latest/dev/access-control-block-public-access.html#access-control-block-public-access-options)
   * @param restrictPublicBuckets Whether to restrict public access. 
   */
  public fun restrictPublicBuckets(restrictPublicBuckets: Boolean) {
    cdkBuilder.restrictPublicBuckets(restrictPublicBuckets)
  }

  public fun build(): BlockPublicAccess = cdkBuilder.build()
}
