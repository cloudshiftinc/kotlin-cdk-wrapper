@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.opensearchservice

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Unit
import kotlin.jvm.JvmName

/**
 * Configuration for node options in OpenSearch domain.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.opensearchservice.*;
 * NodeOptions nodeOptions = NodeOptions.builder()
 * .nodeConfig(NodeConfig.builder()
 * .count(123)
 * .enabled(false)
 * .type("type")
 * .build())
 * .nodeType(NodeType.COORDINATOR)
 * .build();
 * ```
 */
public interface NodeOptions {
  /**
   * Configuration for the node type.
   */
  public fun nodeConfig(): NodeConfig

  /**
   * The type of node.
   *
   * Currently only 'coordinator' is supported.
   */
  public fun nodeType(): NodeType

  /**
   * A builder for [NodeOptions]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param nodeConfig Configuration for the node type. 
     */
    public fun nodeConfig(nodeConfig: NodeConfig)

    /**
     * @param nodeConfig Configuration for the node type. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("cedd96f14ad3753c8b4585df680945e87fc11c096a7982ecded1096760733f29")
    public fun nodeConfig(nodeConfig: NodeConfig.Builder.() -> Unit)

    /**
     * @param nodeType The type of node. 
     * Currently only 'coordinator' is supported.
     */
    public fun nodeType(nodeType: NodeType)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.opensearchservice.NodeOptions.Builder =
        software.amazon.awscdk.services.opensearchservice.NodeOptions.builder()

    /**
     * @param nodeConfig Configuration for the node type. 
     */
    override fun nodeConfig(nodeConfig: NodeConfig) {
      cdkBuilder.nodeConfig(nodeConfig.let(NodeConfig.Companion::unwrap))
    }

    /**
     * @param nodeConfig Configuration for the node type. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("cedd96f14ad3753c8b4585df680945e87fc11c096a7982ecded1096760733f29")
    override fun nodeConfig(nodeConfig: NodeConfig.Builder.() -> Unit): Unit =
        nodeConfig(NodeConfig(nodeConfig))

    /**
     * @param nodeType The type of node. 
     * Currently only 'coordinator' is supported.
     */
    override fun nodeType(nodeType: NodeType) {
      cdkBuilder.nodeType(nodeType.let(NodeType.Companion::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.opensearchservice.NodeOptions =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.opensearchservice.NodeOptions,
  ) : CdkObject(cdkObject),
      NodeOptions {
    /**
     * Configuration for the node type.
     */
    override fun nodeConfig(): NodeConfig = unwrap(this).getNodeConfig().let(NodeConfig::wrap)

    /**
     * The type of node.
     *
     * Currently only 'coordinator' is supported.
     */
    override fun nodeType(): NodeType = unwrap(this).getNodeType().let(NodeType::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): NodeOptions {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.opensearchservice.NodeOptions):
        NodeOptions = CdkObjectWrappers.wrap(cdkObject) as? NodeOptions ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: NodeOptions):
        software.amazon.awscdk.services.opensearchservice.NodeOptions = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.opensearchservice.NodeOptions
  }
}
