@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.stepfunctions.tasks

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import software.amazon.awscdk.Size
import software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster

@CdkDslMarker
public class EmrCreateClusterVolumeSpecificationPropertyDsl {
  private val cdkBuilder: EmrCreateCluster.VolumeSpecificationProperty.Builder =
      EmrCreateCluster.VolumeSpecificationProperty.builder()

  /**
   * @param iops The number of I/O operations per second (IOPS) that the volume supports.
   */
  public fun iops(iops: Number) {
    cdkBuilder.iops(iops)
  }

  /**
   * @param volumeSize The volume size. 
   * If the volume type is EBS-optimized, the minimum value is 10GiB.
   * Maximum size is 1TiB
   */
  public fun volumeSize(volumeSize: Size) {
    cdkBuilder.volumeSize(volumeSize)
  }

  /**
   * @param volumeType The volume type. 
   * Volume types supported are gp2, io1, standard.
   */
  public fun volumeType(volumeType: EmrCreateCluster.EbsBlockDeviceVolumeType) {
    cdkBuilder.volumeType(volumeType)
  }

  public fun build(): EmrCreateCluster.VolumeSpecificationProperty = cdkBuilder.build()
}
