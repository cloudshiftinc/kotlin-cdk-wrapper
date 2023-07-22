@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.stepfunctions.tasks

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import kotlin.Unit
import software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster

@CdkDslMarker
public class EmrCreateClusterEbsBlockDeviceConfigPropertyDsl {
  private val cdkBuilder: EmrCreateCluster.EbsBlockDeviceConfigProperty.Builder =
      EmrCreateCluster.EbsBlockDeviceConfigProperty.builder()

  /**
   * @param volumeSpecification EBS volume specifications such as volume type, IOPS, and size (GiB)
   * that will be requested for the EBS volume attached to an EC2 instance in the cluster. 
   */
  public
      fun volumeSpecification(volumeSpecification: EmrCreateClusterVolumeSpecificationPropertyDsl.() -> Unit
      = {}) {
    val builder = EmrCreateClusterVolumeSpecificationPropertyDsl()
    builder.apply(volumeSpecification)
    cdkBuilder.volumeSpecification(builder.build())
  }

  /**
   * @param volumeSpecification EBS volume specifications such as volume type, IOPS, and size (GiB)
   * that will be requested for the EBS volume attached to an EC2 instance in the cluster. 
   */
  public
      fun volumeSpecification(volumeSpecification: EmrCreateCluster.VolumeSpecificationProperty) {
    cdkBuilder.volumeSpecification(volumeSpecification)
  }

  /**
   * @param volumesPerInstance Number of EBS volumes with a specific volume configuration that will
   * be associated with every instance in the instance group.
   */
  public fun volumesPerInstance(volumesPerInstance: Number) {
    cdkBuilder.volumesPerInstance(volumesPerInstance)
  }

  public fun build(): EmrCreateCluster.EbsBlockDeviceConfigProperty = cdkBuilder.build()
}
