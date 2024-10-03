@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.elasticsearch

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Deprecated
import kotlin.Number
import kotlin.String
import kotlin.Unit

/**
 * (deprecated) Configures the capacity of the cluster such as the instance type and the number of
 * instances.
 *
 * Example:
 *
 * ```
 * Domain domain = Domain.Builder.create(this, "Domain")
 * .version(ElasticsearchVersion.V7_10)
 * .capacity(CapacityConfig.builder()
 * .masterNodes(2)
 * .warmNodes(2)
 * .warmInstanceType("ultrawarm1.medium.elasticsearch")
 * .build())
 * .build();
 * ```
 *
 * @deprecated use opensearchservice module instead
 */
public interface CapacityConfig {
  /**
   * (deprecated) The instance type for your data nodes, such as `m3.medium.elasticsearch`. For
   * valid values, see [Supported Instance
   * Types](https://docs.aws.amazon.com/elasticsearch-service/latest/developerguide/aes-supported-instance-types.html)
   * in the Amazon Elasticsearch Service Developer Guide.
   *
   * Default: - r5.large.elasticsearch
   *
   * @deprecated use opensearchservice module instead
   */
  @Deprecated(message = "deprecated in CDK")
  public fun dataNodeInstanceType(): String? = unwrap(this).getDataNodeInstanceType()

  /**
   * (deprecated) The number of data nodes (instances) to use in the Amazon ES domain.
   *
   * Default: - 1
   *
   * @deprecated use opensearchservice module instead
   */
  @Deprecated(message = "deprecated in CDK")
  public fun dataNodes(): Number? = unwrap(this).getDataNodes()

  /**
   * (deprecated) The hardware configuration of the computer that hosts the dedicated master node,
   * such as `m3.medium.elasticsearch`. For valid values, see [Supported Instance Types]
   * (https://docs.aws.amazon.com/elasticsearch-service/latest/developerguide/aes-supported-instance-types.html)
   * in the Amazon Elasticsearch Service Developer Guide.
   *
   * Default: - r5.large.elasticsearch
   *
   * @deprecated use opensearchservice module instead
   */
  @Deprecated(message = "deprecated in CDK")
  public fun masterNodeInstanceType(): String? = unwrap(this).getMasterNodeInstanceType()

  /**
   * (deprecated) The number of instances to use for the master node.
   *
   * Default: - no dedicated master nodes
   *
   * @deprecated use opensearchservice module instead
   */
  @Deprecated(message = "deprecated in CDK")
  public fun masterNodes(): Number? = unwrap(this).getMasterNodes()

  /**
   * (deprecated) The instance type for your UltraWarm node, such as
   * `ultrawarm1.medium.elasticsearch`. For valid values, see [UltraWarm Storage Limits]
   * (https://docs.aws.amazon.com/elasticsearch-service/latest/developerguide/aes-limits.html#limits-ultrawarm)
   * in the Amazon Elasticsearch Service Developer Guide.
   *
   * Default: - ultrawarm1.medium.elasticsearch
   *
   * @deprecated use opensearchservice module instead
   */
  @Deprecated(message = "deprecated in CDK")
  public fun warmInstanceType(): String? = unwrap(this).getWarmInstanceType()

  /**
   * (deprecated) The number of UltraWarm nodes (instances) to use in the Amazon ES domain.
   *
   * Default: - no UltraWarm nodes
   *
   * @deprecated use opensearchservice module instead
   */
  @Deprecated(message = "deprecated in CDK")
  public fun warmNodes(): Number? = unwrap(this).getWarmNodes()

  /**
   * A builder for [CapacityConfig]
   */
  @CdkDslMarker
  @Deprecated(message = "deprecated in CDK")
  public interface Builder {
    /**
     * @param dataNodeInstanceType The instance type for your data nodes, such as
     * `m3.medium.elasticsearch`. For valid values, see [Supported Instance
     * Types](https://docs.aws.amazon.com/elasticsearch-service/latest/developerguide/aes-supported-instance-types.html)
     * in the Amazon Elasticsearch Service Developer Guide.
     * @deprecated use opensearchservice module instead
     */
    @Deprecated(message = "deprecated in CDK")
    public fun dataNodeInstanceType(dataNodeInstanceType: String)

    /**
     * @param dataNodes The number of data nodes (instances) to use in the Amazon ES domain.
     * @deprecated use opensearchservice module instead
     */
    @Deprecated(message = "deprecated in CDK")
    public fun dataNodes(dataNodes: Number)

    /**
     * @param masterNodeInstanceType The hardware configuration of the computer that hosts the
     * dedicated master node, such as `m3.medium.elasticsearch`. For valid values, see [Supported
     * Instance Types]
     * (https://docs.aws.amazon.com/elasticsearch-service/latest/developerguide/aes-supported-instance-types.html)
     * in the Amazon Elasticsearch Service Developer Guide.
     * @deprecated use opensearchservice module instead
     */
    @Deprecated(message = "deprecated in CDK")
    public fun masterNodeInstanceType(masterNodeInstanceType: String)

    /**
     * @param masterNodes The number of instances to use for the master node.
     * @deprecated use opensearchservice module instead
     */
    @Deprecated(message = "deprecated in CDK")
    public fun masterNodes(masterNodes: Number)

    /**
     * @param warmInstanceType The instance type for your UltraWarm node, such as
     * `ultrawarm1.medium.elasticsearch`. For valid values, see [UltraWarm Storage Limits]
     * (https://docs.aws.amazon.com/elasticsearch-service/latest/developerguide/aes-limits.html#limits-ultrawarm)
     * in the Amazon Elasticsearch Service Developer Guide.
     * @deprecated use opensearchservice module instead
     */
    @Deprecated(message = "deprecated in CDK")
    public fun warmInstanceType(warmInstanceType: String)

    /**
     * @param warmNodes The number of UltraWarm nodes (instances) to use in the Amazon ES domain.
     * @deprecated use opensearchservice module instead
     */
    @Deprecated(message = "deprecated in CDK")
    public fun warmNodes(warmNodes: Number)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.elasticsearch.CapacityConfig.Builder =
        software.amazon.awscdk.services.elasticsearch.CapacityConfig.builder()

    /**
     * @param dataNodeInstanceType The instance type for your data nodes, such as
     * `m3.medium.elasticsearch`. For valid values, see [Supported Instance
     * Types](https://docs.aws.amazon.com/elasticsearch-service/latest/developerguide/aes-supported-instance-types.html)
     * in the Amazon Elasticsearch Service Developer Guide.
     * @deprecated use opensearchservice module instead
     */
    @Deprecated(message = "deprecated in CDK")
    override fun dataNodeInstanceType(dataNodeInstanceType: String) {
      cdkBuilder.dataNodeInstanceType(dataNodeInstanceType)
    }

    /**
     * @param dataNodes The number of data nodes (instances) to use in the Amazon ES domain.
     * @deprecated use opensearchservice module instead
     */
    @Deprecated(message = "deprecated in CDK")
    override fun dataNodes(dataNodes: Number) {
      cdkBuilder.dataNodes(dataNodes)
    }

    /**
     * @param masterNodeInstanceType The hardware configuration of the computer that hosts the
     * dedicated master node, such as `m3.medium.elasticsearch`. For valid values, see [Supported
     * Instance Types]
     * (https://docs.aws.amazon.com/elasticsearch-service/latest/developerguide/aes-supported-instance-types.html)
     * in the Amazon Elasticsearch Service Developer Guide.
     * @deprecated use opensearchservice module instead
     */
    @Deprecated(message = "deprecated in CDK")
    override fun masterNodeInstanceType(masterNodeInstanceType: String) {
      cdkBuilder.masterNodeInstanceType(masterNodeInstanceType)
    }

    /**
     * @param masterNodes The number of instances to use for the master node.
     * @deprecated use opensearchservice module instead
     */
    @Deprecated(message = "deprecated in CDK")
    override fun masterNodes(masterNodes: Number) {
      cdkBuilder.masterNodes(masterNodes)
    }

    /**
     * @param warmInstanceType The instance type for your UltraWarm node, such as
     * `ultrawarm1.medium.elasticsearch`. For valid values, see [UltraWarm Storage Limits]
     * (https://docs.aws.amazon.com/elasticsearch-service/latest/developerguide/aes-limits.html#limits-ultrawarm)
     * in the Amazon Elasticsearch Service Developer Guide.
     * @deprecated use opensearchservice module instead
     */
    @Deprecated(message = "deprecated in CDK")
    override fun warmInstanceType(warmInstanceType: String) {
      cdkBuilder.warmInstanceType(warmInstanceType)
    }

    /**
     * @param warmNodes The number of UltraWarm nodes (instances) to use in the Amazon ES domain.
     * @deprecated use opensearchservice module instead
     */
    @Deprecated(message = "deprecated in CDK")
    override fun warmNodes(warmNodes: Number) {
      cdkBuilder.warmNodes(warmNodes)
    }

    public fun build(): software.amazon.awscdk.services.elasticsearch.CapacityConfig =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.elasticsearch.CapacityConfig,
  ) : CdkObject(cdkObject),
      CapacityConfig {
    /**
     * (deprecated) The instance type for your data nodes, such as `m3.medium.elasticsearch`. For
     * valid values, see [Supported Instance
     * Types](https://docs.aws.amazon.com/elasticsearch-service/latest/developerguide/aes-supported-instance-types.html)
     * in the Amazon Elasticsearch Service Developer Guide.
     *
     * Default: - r5.large.elasticsearch
     *
     * @deprecated use opensearchservice module instead
     */
    @Deprecated(message = "deprecated in CDK")
    override fun dataNodeInstanceType(): String? = unwrap(this).getDataNodeInstanceType()

    /**
     * (deprecated) The number of data nodes (instances) to use in the Amazon ES domain.
     *
     * Default: - 1
     *
     * @deprecated use opensearchservice module instead
     */
    @Deprecated(message = "deprecated in CDK")
    override fun dataNodes(): Number? = unwrap(this).getDataNodes()

    /**
     * (deprecated) The hardware configuration of the computer that hosts the dedicated master node,
     * such as `m3.medium.elasticsearch`. For valid values, see [Supported Instance Types]
     * (https://docs.aws.amazon.com/elasticsearch-service/latest/developerguide/aes-supported-instance-types.html)
     * in the Amazon Elasticsearch Service Developer Guide.
     *
     * Default: - r5.large.elasticsearch
     *
     * @deprecated use opensearchservice module instead
     */
    @Deprecated(message = "deprecated in CDK")
    override fun masterNodeInstanceType(): String? = unwrap(this).getMasterNodeInstanceType()

    /**
     * (deprecated) The number of instances to use for the master node.
     *
     * Default: - no dedicated master nodes
     *
     * @deprecated use opensearchservice module instead
     */
    @Deprecated(message = "deprecated in CDK")
    override fun masterNodes(): Number? = unwrap(this).getMasterNodes()

    /**
     * (deprecated) The instance type for your UltraWarm node, such as
     * `ultrawarm1.medium.elasticsearch`. For valid values, see [UltraWarm Storage Limits]
     * (https://docs.aws.amazon.com/elasticsearch-service/latest/developerguide/aes-limits.html#limits-ultrawarm)
     * in the Amazon Elasticsearch Service Developer Guide.
     *
     * Default: - ultrawarm1.medium.elasticsearch
     *
     * @deprecated use opensearchservice module instead
     */
    @Deprecated(message = "deprecated in CDK")
    override fun warmInstanceType(): String? = unwrap(this).getWarmInstanceType()

    /**
     * (deprecated) The number of UltraWarm nodes (instances) to use in the Amazon ES domain.
     *
     * Default: - no UltraWarm nodes
     *
     * @deprecated use opensearchservice module instead
     */
    @Deprecated(message = "deprecated in CDK")
    override fun warmNodes(): Number? = unwrap(this).getWarmNodes()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CapacityConfig {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.elasticsearch.CapacityConfig):
        CapacityConfig = CdkObjectWrappers.wrap(cdkObject) as? CapacityConfig ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: CapacityConfig):
        software.amazon.awscdk.services.elasticsearch.CapacityConfig = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.elasticsearch.CapacityConfig
  }
}
