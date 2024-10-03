@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.elasticsearch

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import io.cloudshiftdev.awscdk.services.ec2.EbsDeviceVolumeType
import kotlin.Boolean
import kotlin.Deprecated
import kotlin.Number
import kotlin.Unit

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
public interface EbsOptions {
  /**
   * (deprecated) Specifies whether Amazon EBS volumes are attached to data nodes in the Amazon ES
   * domain.
   *
   * Default: - true
   *
   * @deprecated use opensearchservice module instead
   */
  @Deprecated(message = "deprecated in CDK")
  public fun enabled(): Boolean? = unwrap(this).getEnabled()

  /**
   * (deprecated) The number of I/O operations per second (IOPS) that the volume supports.
   *
   * This property applies only to the Provisioned IOPS (SSD) EBS
   * volume type.
   *
   * Default: - iops are not set.
   *
   * @deprecated use opensearchservice module instead
   */
  @Deprecated(message = "deprecated in CDK")
  public fun iops(): Number? = unwrap(this).getIops()

  /**
   * (deprecated) The size (in GiB) of the EBS volume for each data node.
   *
   * The minimum and
   * maximum size of an EBS volume depends on the EBS volume type and the
   * instance type to which it is attached.  For more information, see
   * [Configuring EBS-based Storage]
   * (https://docs.aws.amazon.com/elasticsearch-service/latest/developerguide/es-createupdatedomains.html#es-createdomain-configure-ebs)
   * in the Amazon Elasticsearch Service Developer Guide.
   *
   * Default: 10
   *
   * @deprecated use opensearchservice module instead
   */
  @Deprecated(message = "deprecated in CDK")
  public fun volumeSize(): Number? = unwrap(this).getVolumeSize()

  /**
   * (deprecated) The EBS volume type to use with the Amazon ES domain, such as standard, gp2, io1.
   *
   * For more information, see[Configuring EBS-based Storage]
   * (https://docs.aws.amazon.com/elasticsearch-service/latest/developerguide/es-createupdatedomains.html#es-createdomain-configure-ebs)
   * in the Amazon Elasticsearch Service Developer Guide.
   *
   * Default: gp2
   *
   * @deprecated use opensearchservice module instead
   */
  @Deprecated(message = "deprecated in CDK")
  public fun volumeType(): EbsDeviceVolumeType? =
      unwrap(this).getVolumeType()?.let(EbsDeviceVolumeType::wrap)

  /**
   * A builder for [EbsOptions]
   */
  @CdkDslMarker
  @Deprecated(message = "deprecated in CDK")
  public interface Builder {
    /**
     * @param enabled Specifies whether Amazon EBS volumes are attached to data nodes in the Amazon
     * ES domain.
     * @deprecated use opensearchservice module instead
     */
    @Deprecated(message = "deprecated in CDK")
    public fun enabled(enabled: Boolean)

    /**
     * @param iops The number of I/O operations per second (IOPS) that the volume supports.
     * This property applies only to the Provisioned IOPS (SSD) EBS
     * volume type.
     * @deprecated use opensearchservice module instead
     */
    @Deprecated(message = "deprecated in CDK")
    public fun iops(iops: Number)

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
    public fun volumeSize(volumeSize: Number)

    /**
     * @param volumeType The EBS volume type to use with the Amazon ES domain, such as standard,
     * gp2, io1.
     * For more information, see[Configuring EBS-based Storage]
     * (https://docs.aws.amazon.com/elasticsearch-service/latest/developerguide/es-createupdatedomains.html#es-createdomain-configure-ebs)
     * in the Amazon Elasticsearch Service Developer Guide.
     * @deprecated use opensearchservice module instead
     */
    @Deprecated(message = "deprecated in CDK")
    public fun volumeType(volumeType: EbsDeviceVolumeType)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.elasticsearch.EbsOptions.Builder =
        software.amazon.awscdk.services.elasticsearch.EbsOptions.builder()

    /**
     * @param enabled Specifies whether Amazon EBS volumes are attached to data nodes in the Amazon
     * ES domain.
     * @deprecated use opensearchservice module instead
     */
    @Deprecated(message = "deprecated in CDK")
    override fun enabled(enabled: Boolean) {
      cdkBuilder.enabled(enabled)
    }

    /**
     * @param iops The number of I/O operations per second (IOPS) that the volume supports.
     * This property applies only to the Provisioned IOPS (SSD) EBS
     * volume type.
     * @deprecated use opensearchservice module instead
     */
    @Deprecated(message = "deprecated in CDK")
    override fun iops(iops: Number) {
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
    override fun volumeSize(volumeSize: Number) {
      cdkBuilder.volumeSize(volumeSize)
    }

    /**
     * @param volumeType The EBS volume type to use with the Amazon ES domain, such as standard,
     * gp2, io1.
     * For more information, see[Configuring EBS-based Storage]
     * (https://docs.aws.amazon.com/elasticsearch-service/latest/developerguide/es-createupdatedomains.html#es-createdomain-configure-ebs)
     * in the Amazon Elasticsearch Service Developer Guide.
     * @deprecated use opensearchservice module instead
     */
    @Deprecated(message = "deprecated in CDK")
    override fun volumeType(volumeType: EbsDeviceVolumeType) {
      cdkBuilder.volumeType(volumeType.let(EbsDeviceVolumeType.Companion::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.elasticsearch.EbsOptions =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.elasticsearch.EbsOptions,
  ) : CdkObject(cdkObject),
      EbsOptions {
    /**
     * (deprecated) Specifies whether Amazon EBS volumes are attached to data nodes in the Amazon ES
     * domain.
     *
     * Default: - true
     *
     * @deprecated use opensearchservice module instead
     */
    @Deprecated(message = "deprecated in CDK")
    override fun enabled(): Boolean? = unwrap(this).getEnabled()

    /**
     * (deprecated) The number of I/O operations per second (IOPS) that the volume supports.
     *
     * This property applies only to the Provisioned IOPS (SSD) EBS
     * volume type.
     *
     * Default: - iops are not set.
     *
     * @deprecated use opensearchservice module instead
     */
    @Deprecated(message = "deprecated in CDK")
    override fun iops(): Number? = unwrap(this).getIops()

    /**
     * (deprecated) The size (in GiB) of the EBS volume for each data node.
     *
     * The minimum and
     * maximum size of an EBS volume depends on the EBS volume type and the
     * instance type to which it is attached.  For more information, see
     * [Configuring EBS-based Storage]
     * (https://docs.aws.amazon.com/elasticsearch-service/latest/developerguide/es-createupdatedomains.html#es-createdomain-configure-ebs)
     * in the Amazon Elasticsearch Service Developer Guide.
     *
     * Default: 10
     *
     * @deprecated use opensearchservice module instead
     */
    @Deprecated(message = "deprecated in CDK")
    override fun volumeSize(): Number? = unwrap(this).getVolumeSize()

    /**
     * (deprecated) The EBS volume type to use with the Amazon ES domain, such as standard, gp2,
     * io1.
     *
     * For more information, see[Configuring EBS-based Storage]
     * (https://docs.aws.amazon.com/elasticsearch-service/latest/developerguide/es-createupdatedomains.html#es-createdomain-configure-ebs)
     * in the Amazon Elasticsearch Service Developer Guide.
     *
     * Default: gp2
     *
     * @deprecated use opensearchservice module instead
     */
    @Deprecated(message = "deprecated in CDK")
    override fun volumeType(): EbsDeviceVolumeType? =
        unwrap(this).getVolumeType()?.let(EbsDeviceVolumeType::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): EbsOptions {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.elasticsearch.EbsOptions):
        EbsOptions = CdkObjectWrappers.wrap(cdkObject) as? EbsOptions ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: EbsOptions):
        software.amazon.awscdk.services.elasticsearch.EbsOptions = (wrapped as CdkObject).cdkObject
        as software.amazon.awscdk.services.elasticsearch.EbsOptions
  }
}
