@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.elasticsearch

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.Deprecated
import kotlin.Number
import software.amazon.awscdk.services.ec2.EbsDeviceVolumeType
import software.amazon.awscdk.services.elasticsearch.EbsOptions

/**
 * (deprecated) The configurations of Amazon Elastic Block Store (Amazon EBS) volumes that are
 * attached to data nodes in the Amazon ES domain.
 *
 * For more information, see
 * [Configuring EBS-based Storage]
 * (https://docs.aws.amazon.com/elasticsearch-service/latest/developerguide/es-createupdatedomains.html#es-createdomain-configure-ebs)
 * in the Amazon Elasticsearch Service Developer Guide.
 *
 * Example:
 *
 * ```
 * Domain prodDomain = Domain.Builder.create(this, "Domain")
 * .version(ElasticsearchVersion.V7_1)
 * .capacity(CapacityConfig.builder()
 * .masterNodes(5)
 * .dataNodes(20)
 * .build())
 * .ebs(EbsOptions.builder()
 * .volumeSize(20)
 * .build())
 * .zoneAwareness(ZoneAwarenessConfig.builder()
 * .availabilityZoneCount(3)
 * .build())
 * .logging(LoggingOptions.builder()
 * .slowSearchLogEnabled(true)
 * .appLogEnabled(true)
 * .slowIndexLogEnabled(true)
 * .build())
 * .build();
 * ```
 *
 * @deprecated use opensearchservice module instead
 */
@CdkDslMarker
@Deprecated(message = "deprecated in CDK")
public class EbsOptionsDsl {
  private val cdkBuilder: EbsOptions.Builder = EbsOptions.builder()

  /**
   * @param enabled Specifies whether Amazon EBS volumes are attached to data nodes in the Amazon ES
   * domain.
   * @deprecated use opensearchservice module instead
   */
  @Deprecated(message = "deprecated in CDK")
  public fun enabled(enabled: Boolean) {
    cdkBuilder.enabled(enabled)
  }

  /**
   * @param iops The number of I/O operations per second (IOPS) that the volume supports.
   * This property applies only to the Provisioned IOPS (SSD) EBS
   * volume type.
   * @deprecated use opensearchservice module instead
   */
  @Deprecated(message = "deprecated in CDK")
  public fun iops(iops: Number) {
    cdkBuilder.iops(iops)
  }

  /**
   * @param volumeSize The size (in GiB) of the EBS volume for each data node.
   * The minimum and
   * maximum size of an EBS volume depends on the EBS volume type and the
   * instance type to which it is attached.  For more information, see
   * [Configuring EBS-based Storage]
   * (https://docs.aws.amazon.com/elasticsearch-service/latest/developerguide/es-createupdatedomains.html#es-createdomain-configure-ebs)
   * in the Amazon Elasticsearch Service Developer Guide.
   * @deprecated use opensearchservice module instead
   */
  @Deprecated(message = "deprecated in CDK")
  public fun volumeSize(volumeSize: Number) {
    cdkBuilder.volumeSize(volumeSize)
  }

  /**
   * @param volumeType The EBS volume type to use with the Amazon ES domain, such as standard, gp2,
   * io1.
   * For more information, see[Configuring EBS-based Storage]
   * (https://docs.aws.amazon.com/elasticsearch-service/latest/developerguide/es-createupdatedomains.html#es-createdomain-configure-ebs)
   * in the Amazon Elasticsearch Service Developer Guide.
   * @deprecated use opensearchservice module instead
   */
  @Deprecated(message = "deprecated in CDK")
  public fun volumeType(volumeType: EbsDeviceVolumeType) {
    cdkBuilder.volumeType(volumeType)
  }

  public fun build(): EbsOptions = cdkBuilder.build()
}
