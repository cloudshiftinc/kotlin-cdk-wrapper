package io.cloudshiftdev.awscdk.services.elasticsearch

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Deprecated
import kotlin.Number
import kotlin.String
import kotlin.Unit

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

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.elasticsearch.CapacityConfig,
  ) : CapacityConfig {
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
    init {

    }

    public operator fun invoke(block: Builder.() -> Unit = {}): CapacityConfig {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.elasticsearch.CapacityConfig):
        CapacityConfig = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CapacityConfig):
        software.amazon.awscdk.services.elasticsearch.CapacityConfig = (wrapped as
        Wrapper).cdkObject
  }
}
