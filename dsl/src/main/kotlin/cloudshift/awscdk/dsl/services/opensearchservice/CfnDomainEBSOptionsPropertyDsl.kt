@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.opensearchservice

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.opensearchservice.CfnDomain

/**
 * The configurations of Amazon Elastic Block Store (Amazon EBS) volumes that are attached to data
 * nodes in the OpenSearch Service domain.
 *
 * For more information, see [EBS volume size
 * limits](https://docs.aws.amazon.com/opensearch-service/latest/developerguide/limits.html#ebsresource)
 * in the *Amazon OpenSearch Service Developer Guide* .
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.opensearchservice.*;
 * EBSOptionsProperty eBSOptionsProperty = EBSOptionsProperty.builder()
 * .ebsEnabled(false)
 * .iops(123)
 * .throughput(123)
 * .volumeSize(123)
 * .volumeType("volumeType")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opensearchservice-domain-ebsoptions.html)
 */
@CdkDslMarker
public class CfnDomainEBSOptionsPropertyDsl {
  private val cdkBuilder: CfnDomain.EBSOptionsProperty.Builder =
      CfnDomain.EBSOptionsProperty.builder()

  /**
   * @param ebsEnabled Specifies whether Amazon EBS volumes are attached to data nodes in the
   * OpenSearch Service domain.
   */
  public fun ebsEnabled(ebsEnabled: Boolean) {
    cdkBuilder.ebsEnabled(ebsEnabled)
  }

  /**
   * @param ebsEnabled Specifies whether Amazon EBS volumes are attached to data nodes in the
   * OpenSearch Service domain.
   */
  public fun ebsEnabled(ebsEnabled: IResolvable) {
    cdkBuilder.ebsEnabled(ebsEnabled)
  }

  /**
   * @param iops The number of I/O operations per second (IOPS) that the volume supports.
   * This property applies only to the `gp3` and provisioned IOPS EBS volume types.
   */
  public fun iops(iops: Number) {
    cdkBuilder.iops(iops)
  }

  /**
   * @param throughput The throughput (in MiB/s) of the EBS volumes attached to data nodes.
   * Applies only to the `gp3` volume type.
   */
  public fun throughput(throughput: Number) {
    cdkBuilder.throughput(throughput)
  }

  /**
   * @param volumeSize The size (in GiB) of the EBS volume for each data node.
   * The minimum and maximum size of an EBS volume depends on the EBS volume type and the instance
   * type to which it is attached. For more information, see [EBS volume size
   * limits](https://docs.aws.amazon.com/opensearch-service/latest/developerguide/limits.html#ebsresource)
   * in the *Amazon OpenSearch Service Developer Guide* .
   */
  public fun volumeSize(volumeSize: Number) {
    cdkBuilder.volumeSize(volumeSize)
  }

  /**
   * @param volumeType The EBS volume type to use with the OpenSearch Service domain.
   * If you choose `gp3` , you must also specify values for `Iops` and `Throughput` . For more
   * information about each type, see [Amazon EBS volume
   * types](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/EBSVolumeTypes.html) in the *Amazon EC2
   * User Guide for Linux Instances* .
   */
  public fun volumeType(volumeType: String) {
    cdkBuilder.volumeType(volumeType)
  }

  public fun build(): CfnDomain.EBSOptionsProperty = cdkBuilder.build()
}
