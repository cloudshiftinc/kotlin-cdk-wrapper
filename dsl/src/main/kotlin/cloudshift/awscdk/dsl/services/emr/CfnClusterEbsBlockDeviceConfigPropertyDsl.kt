@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.emr

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.emr.CfnCluster

@CdkDslMarker
public class CfnClusterEbsBlockDeviceConfigPropertyDsl {
  private val cdkBuilder: CfnCluster.EbsBlockDeviceConfigProperty.Builder =
      CfnCluster.EbsBlockDeviceConfigProperty.builder()

  /**
   * @param volumeSpecification EBS volume specifications such as volume type, IOPS, size (GiB) and
   * throughput (MiB/s) that are requested for the EBS volume attached to an Amazon EC2 instance in the
   * cluster. 
   */
  public fun volumeSpecification(volumeSpecification: IResolvable) {
    cdkBuilder.volumeSpecification(volumeSpecification)
  }

  /**
   * @param volumeSpecification EBS volume specifications such as volume type, IOPS, size (GiB) and
   * throughput (MiB/s) that are requested for the EBS volume attached to an Amazon EC2 instance in the
   * cluster. 
   */
  public fun volumeSpecification(volumeSpecification: CfnCluster.VolumeSpecificationProperty) {
    cdkBuilder.volumeSpecification(volumeSpecification)
  }

  /**
   * @param volumesPerInstance Number of EBS volumes with a specific volume configuration that are
   * associated with every instance in the instance group.
   */
  public fun volumesPerInstance(volumesPerInstance: Number) {
    cdkBuilder.volumesPerInstance(volumesPerInstance)
  }

  public fun build(): CfnCluster.EbsBlockDeviceConfigProperty = cdkBuilder.build()
}
