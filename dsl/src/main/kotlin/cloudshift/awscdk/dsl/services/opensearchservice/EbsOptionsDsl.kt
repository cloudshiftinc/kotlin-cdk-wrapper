@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.opensearchservice

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.Number
import software.amazon.awscdk.services.ec2.EbsDeviceVolumeType
import software.amazon.awscdk.services.opensearchservice.EbsOptions

@CdkDslMarker
public class EbsOptionsDsl {
  private val cdkBuilder: EbsOptions.Builder = EbsOptions.builder()

  /**
   * @param enabled Specifies whether Amazon EBS volumes are attached to data nodes in the Amazon
   * OpenSearch Service domain.
   */
  public fun enabled(enabled: Boolean) {
    cdkBuilder.enabled(enabled)
  }

  /**
   * @param iops The number of I/O operations per second (IOPS) that the volume supports.
   * This property applies only to the Provisioned IOPS (SSD) EBS
   * volume type.
   */
  public fun iops(iops: Number) {
    cdkBuilder.iops(iops)
  }

  /**
   * @param volumeSize The size (in GiB) of the EBS volume for each data node.
   * The minimum and
   * maximum size of an EBS volume depends on the EBS volume type and the
   * instance type to which it is attached.  For  valid values, see
   * [EBS volume size limits]
   * (https://docs.aws.amazon.com/opensearch-service/latest/developerguide/limits.html#ebsresource)
   * in the Amazon OpenSearch Service Developer Guide.
   */
  public fun volumeSize(volumeSize: Number) {
    cdkBuilder.volumeSize(volumeSize)
  }

  /**
   * @param volumeType The EBS volume type to use with the Amazon OpenSearch Service domain, such as
   * standard, gp2, io1.
   */
  public fun volumeType(volumeType: EbsDeviceVolumeType) {
    cdkBuilder.volumeType(volumeType)
  }

  public fun build(): EbsOptions = cdkBuilder.build()
}
