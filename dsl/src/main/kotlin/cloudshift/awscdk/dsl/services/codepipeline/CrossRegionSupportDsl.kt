@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.codepipeline

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.Stack
import software.amazon.awscdk.services.codepipeline.CrossRegionSupport
import software.amazon.awscdk.services.s3.IBucket

@CdkDslMarker
public class CrossRegionSupportDsl {
  private val cdkBuilder: CrossRegionSupport.Builder = CrossRegionSupport.builder()

  /**
   * @param replicationBucket The replication Bucket used by CodePipeline to operate in this region.
   * 
   * Belongs to `stack`.
   */
  public fun replicationBucket(replicationBucket: IBucket) {
    cdkBuilder.replicationBucket(replicationBucket)
  }

  /**
   * @param stack The Stack that has been created to house the replication Bucket required for this 
   * region. 
   */
  public fun stack(stack: Stack) {
    cdkBuilder.stack(stack)
  }

  public fun build(): CrossRegionSupport = cdkBuilder.build()
}
