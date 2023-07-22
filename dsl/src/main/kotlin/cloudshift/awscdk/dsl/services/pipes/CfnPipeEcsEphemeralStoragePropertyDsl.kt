@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.pipes

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import software.amazon.awscdk.services.pipes.CfnPipe

/**
 * The amount of ephemeral storage to allocate for the task.
 *
 * This parameter is used to expand the total amount of ephemeral storage available, beyond the
 * default amount, for tasks hosted on Fargate . For more information, see [Fargate task
 * storage](https://docs.aws.amazon.com/AmazonECS/latest/userguide/using_data_volumes.html) in the
 * *Amazon ECS User Guide for Fargate* .
 *
 *
 * This parameter is only supported for tasks hosted on Fargate using Linux platform version `1.4.0`
 * or later. This parameter is not supported for Windows containers on Fargate .
 *
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.pipes.*;
 * EcsEphemeralStorageProperty ecsEphemeralStorageProperty = EcsEphemeralStorageProperty.builder()
 * .sizeInGiB(123)
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pipes-pipe-ecsephemeralstorage.html)
 */
@CdkDslMarker
public class CfnPipeEcsEphemeralStoragePropertyDsl {
  private val cdkBuilder: CfnPipe.EcsEphemeralStorageProperty.Builder =
      CfnPipe.EcsEphemeralStorageProperty.builder()

  /**
   * @param sizeInGiB The total amount, in GiB, of ephemeral storage to set for the task. 
   * The minimum supported value is `21` GiB and the maximum supported value is `200` GiB.
   */
  public fun sizeInGiB(sizeInGiB: Number) {
    cdkBuilder.sizeInGiB(sizeInGiB)
  }

  public fun build(): CfnPipe.EcsEphemeralStorageProperty = cdkBuilder.build()
}
