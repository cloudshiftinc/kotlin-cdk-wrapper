@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.opensearchservice

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.services.ec2.EbsDeviceVolumeType
import kotlin.Boolean
import kotlin.Number
import kotlin.Unit

/**
 * The configurations of Amazon Elastic Block Store (Amazon EBS) volumes that are attached to data
 * nodes in the Amazon OpenSearch Service domain.
 *
 * For more information, see
 * [Amazon EBS]
 * (https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/AmazonEBS.html)
 * in the Amazon Elastic Compute Cloud Developer Guide.
 *
 * Example:
 *
 * ```
 * Domain domain = Domain.Builder.create(this, "Domain")
 * .version(EngineVersion.OPENSEARCH_1_0)
 * .ebs(EbsOptions.builder()
 * .volumeSize(100)
 * .volumeType(EbsDeviceVolumeType.GENERAL_PURPOSE_SSD)
 * .build())
 * .nodeToNodeEncryption(true)
 * .encryptionAtRest(EncryptionAtRestOptions.builder()
 * .enabled(true)
 * .build())
 * .build();
 * ```
 */
public interface EbsOptions {
  /**
   * Specifies whether Amazon EBS volumes are attached to data nodes in the Amazon OpenSearch
   * Service domain.
   *
   * Default: - true
   */
  public fun enabled(): Boolean? = unwrap(this).getEnabled()

  /**
   * The number of I/O operations per second (IOPS) that the volume supports.
   *
   * This property applies only to the gp3 and Provisioned IOPS (SSD) EBS
   * volume type.
   *
   * Default: - iops are not set.
   */
  public fun iops(): Number? = unwrap(this).getIops()

  /**
   * The throughput (in MiB/s) of the EBS volumes attached to data nodes.
   *
   * This property applies only to the gp3 volume type.
   *
   * Default: - throughput is not set.
   */
  public fun throughput(): Number? = unwrap(this).getThroughput()

  /**
   * The size (in GiB) of the EBS volume for each data node.
   *
   * The minimum and
   * maximum size of an EBS volume depends on the EBS volume type and the
   * instance type to which it is attached.  For  valid values, see
   * [EBS volume size limits]
   * (https://docs.aws.amazon.com/opensearch-service/latest/developerguide/limits.html#ebsresource)
   * in the Amazon OpenSearch Service Developer Guide.
   *
   * Default: 10
   */
  public fun volumeSize(): Number? = unwrap(this).getVolumeSize()

  /**
   * The EBS volume type to use with the Amazon OpenSearch Service domain, such as standard, gp2,
   * io1.
   *
   * Default: gp2
   */
  public fun volumeType(): EbsDeviceVolumeType? =
      unwrap(this).getVolumeType()?.let(EbsDeviceVolumeType::wrap)

  /**
   * A builder for [EbsOptions]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param enabled Specifies whether Amazon EBS volumes are attached to data nodes in the Amazon
     * OpenSearch Service domain.
     */
    public fun enabled(enabled: Boolean)

    /**
     * @param iops The number of I/O operations per second (IOPS) that the volume supports.
     * This property applies only to the gp3 and Provisioned IOPS (SSD) EBS
     * volume type.
     */
    public fun iops(iops: Number)

    /**
     * @param throughput The throughput (in MiB/s) of the EBS volumes attached to data nodes.
     * This property applies only to the gp3 volume type.
     */
    public fun throughput(throughput: Number)

    /**
     * @param volumeSize The size (in GiB) of the EBS volume for each data node.
     * The minimum and
     * maximum size of an EBS volume depends on the EBS volume type and the
     * instance type to which it is attached.  For  valid values, see
     * [EBS volume size limits]
     * (https://docs.aws.amazon.com/opensearch-service/latest/developerguide/limits.html#ebsresource)
     * in the Amazon OpenSearch Service Developer Guide.
     */
    public fun volumeSize(volumeSize: Number)

    /**
     * @param volumeType The EBS volume type to use with the Amazon OpenSearch Service domain, such
     * as standard, gp2, io1.
     */
    public fun volumeType(volumeType: EbsDeviceVolumeType)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.opensearchservice.EbsOptions.Builder =
        software.amazon.awscdk.services.opensearchservice.EbsOptions.builder()

    /**
     * @param enabled Specifies whether Amazon EBS volumes are attached to data nodes in the Amazon
     * OpenSearch Service domain.
     */
    override fun enabled(enabled: Boolean) {
      cdkBuilder.enabled(enabled)
    }

    /**
     * @param iops The number of I/O operations per second (IOPS) that the volume supports.
     * This property applies only to the gp3 and Provisioned IOPS (SSD) EBS
     * volume type.
     */
    override fun iops(iops: Number) {
      cdkBuilder.iops(iops)
    }

    /**
     * @param throughput The throughput (in MiB/s) of the EBS volumes attached to data nodes.
     * This property applies only to the gp3 volume type.
     */
    override fun throughput(throughput: Number) {
      cdkBuilder.throughput(throughput)
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
    override fun volumeSize(volumeSize: Number) {
      cdkBuilder.volumeSize(volumeSize)
    }

    /**
     * @param volumeType The EBS volume type to use with the Amazon OpenSearch Service domain, such
     * as standard, gp2, io1.
     */
    override fun volumeType(volumeType: EbsDeviceVolumeType) {
      cdkBuilder.volumeType(volumeType.let(EbsDeviceVolumeType::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.opensearchservice.EbsOptions =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.opensearchservice.EbsOptions,
  ) : CdkObject(cdkObject), EbsOptions {
    /**
     * Specifies whether Amazon EBS volumes are attached to data nodes in the Amazon OpenSearch
     * Service domain.
     *
     * Default: - true
     */
    override fun enabled(): Boolean? = unwrap(this).getEnabled()

    /**
     * The number of I/O operations per second (IOPS) that the volume supports.
     *
     * This property applies only to the gp3 and Provisioned IOPS (SSD) EBS
     * volume type.
     *
     * Default: - iops are not set.
     */
    override fun iops(): Number? = unwrap(this).getIops()

    /**
     * The throughput (in MiB/s) of the EBS volumes attached to data nodes.
     *
     * This property applies only to the gp3 volume type.
     *
     * Default: - throughput is not set.
     */
    override fun throughput(): Number? = unwrap(this).getThroughput()

    /**
     * The size (in GiB) of the EBS volume for each data node.
     *
     * The minimum and
     * maximum size of an EBS volume depends on the EBS volume type and the
     * instance type to which it is attached.  For  valid values, see
     * [EBS volume size limits]
     * (https://docs.aws.amazon.com/opensearch-service/latest/developerguide/limits.html#ebsresource)
     * in the Amazon OpenSearch Service Developer Guide.
     *
     * Default: 10
     */
    override fun volumeSize(): Number? = unwrap(this).getVolumeSize()

    /**
     * The EBS volume type to use with the Amazon OpenSearch Service domain, such as standard, gp2,
     * io1.
     *
     * Default: gp2
     */
    override fun volumeType(): EbsDeviceVolumeType? =
        unwrap(this).getVolumeType()?.let(EbsDeviceVolumeType::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): EbsOptions {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.opensearchservice.EbsOptions):
        EbsOptions = Wrapper(cdkObject)

    internal fun unwrap(wrapped: EbsOptions):
        software.amazon.awscdk.services.opensearchservice.EbsOptions = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.opensearchservice.EbsOptions
  }
}
