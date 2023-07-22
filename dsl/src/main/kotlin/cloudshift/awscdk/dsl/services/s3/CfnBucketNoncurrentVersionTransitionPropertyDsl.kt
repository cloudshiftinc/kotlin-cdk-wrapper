@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.s3

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import software.amazon.awscdk.services.s3.CfnBucket

@CdkDslMarker
public class CfnBucketNoncurrentVersionTransitionPropertyDsl {
  private val cdkBuilder: CfnBucket.NoncurrentVersionTransitionProperty.Builder =
      CfnBucket.NoncurrentVersionTransitionProperty.builder()

  /**
   * @param newerNoncurrentVersions Specifies how many noncurrent versions Amazon S3 will retain.
   * If there are this many more recent noncurrent versions, Amazon S3 will take the associated
   * action. For more information about noncurrent versions, see [Lifecycle configuration
   * elements](https://docs.aws.amazon.com/AmazonS3/latest/userguide/intro-lifecycle-rules.html) in the
   * *Amazon S3 User Guide* .
   */
  public fun newerNoncurrentVersions(newerNoncurrentVersions: Number) {
    cdkBuilder.newerNoncurrentVersions(newerNoncurrentVersions)
  }

  /**
   * @param storageClass The class of storage used to store the object. 
   */
  public fun storageClass(storageClass: String) {
    cdkBuilder.storageClass(storageClass)
  }

  /**
   * @param transitionInDays Specifies the number of days an object is noncurrent before Amazon S3
   * can perform the associated action. 
   * For information about the noncurrent days calculations, see [How Amazon S3 Calculates How Long
   * an Object Has Been
   * Noncurrent](https://docs.aws.amazon.com/AmazonS3/latest/dev/intro-lifecycle-rules.html#non-current-days-calculations)
   * in the *Amazon S3 User Guide* .
   */
  public fun transitionInDays(transitionInDays: Number) {
    cdkBuilder.transitionInDays(transitionInDays)
  }

  public fun build(): CfnBucket.NoncurrentVersionTransitionProperty = cdkBuilder.build()
}
