@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.opensearchservice

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Unit

/**
 * Configuration for a specific node type in OpenSearch domain.
 *
 * Example:
 *
 * ```
 * import io.cloudshiftdev.awscdk.services.opensearchservice.*;
 * Domain domain = Domain.Builder.create(this, "Domain")
 * .version(EngineVersion.OPENSEARCH_1_3)
 * .capacity(CapacityConfig.builder()
 * .nodeOptions(List.of(NodeOptions.builder()
 * .nodeType(NodeType.COORDINATOR)
 * .nodeConfig(NodeConfig.builder()
 * .enabled(true)
 * .count(2)
 * .type("m5.large.search")
 * .build())
 * .build()))
 * .build())
 * .build();
 * ```
 */
public interface NodeConfig {
  /**
   * The number of nodes of this type.
   *
   * Default: - 1
   */
  public fun count(): Number? = unwrap(this).getCount()

  /**
   * Whether this node type is enabled.
   *
   * Default: - false
   */
  public fun enabled(): Boolean? = unwrap(this).getEnabled()

  /**
   * The instance type for the nodes.
   *
   * Default: - m5.large.search
   */
  public fun type(): String? = unwrap(this).getType()

  /**
   * A builder for [NodeConfig]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param count The number of nodes of this type.
     */
    public fun count(count: Number)

    /**
     * @param enabled Whether this node type is enabled.
     */
    public fun enabled(enabled: Boolean)

    /**
     * @param type The instance type for the nodes.
     */
    public fun type(type: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.opensearchservice.NodeConfig.Builder =
        software.amazon.awscdk.services.opensearchservice.NodeConfig.builder()

    /**
     * @param count The number of nodes of this type.
     */
    override fun count(count: Number) {
      cdkBuilder.count(count)
    }

    /**
     * @param enabled Whether this node type is enabled.
     */
    override fun enabled(enabled: Boolean) {
      cdkBuilder.enabled(enabled)
    }

    /**
     * @param type The instance type for the nodes.
     */
    override fun type(type: String) {
      cdkBuilder.type(type)
    }

    public fun build(): software.amazon.awscdk.services.opensearchservice.NodeConfig =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.opensearchservice.NodeConfig,
  ) : CdkObject(cdkObject),
      NodeConfig {
    /**
     * The number of nodes of this type.
     *
     * Default: - 1
     */
    override fun count(): Number? = unwrap(this).getCount()

    /**
     * Whether this node type is enabled.
     *
     * Default: - false
     */
    override fun enabled(): Boolean? = unwrap(this).getEnabled()

    /**
     * The instance type for the nodes.
     *
     * Default: - m5.large.search
     */
    override fun type(): String? = unwrap(this).getType()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): NodeConfig {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.opensearchservice.NodeConfig):
        NodeConfig = CdkObjectWrappers.wrap(cdkObject) as? NodeConfig ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: NodeConfig):
        software.amazon.awscdk.services.opensearchservice.NodeConfig = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.opensearchservice.NodeConfig
  }
}
