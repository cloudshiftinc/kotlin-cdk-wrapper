@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.iotfleetwise

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

/**
 * Properties for defining a `CfnSignalCatalog`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.iotfleetwise.*;
 * CfnSignalCatalogProps cfnSignalCatalogProps = CfnSignalCatalogProps.builder()
 * .description("description")
 * .name("name")
 * .nodeCounts(NodeCountsProperty.builder()
 * .totalActuators(123)
 * .totalAttributes(123)
 * .totalBranches(123)
 * .totalNodes(123)
 * .totalSensors(123)
 * .build())
 * .nodes(List.of(NodeProperty.builder()
 * .actuator(ActuatorProperty.builder()
 * .dataType("dataType")
 * .fullyQualifiedName("fullyQualifiedName")
 * // the properties below are optional
 * .allowedValues(List.of("allowedValues"))
 * .assignedValue("assignedValue")
 * .description("description")
 * .max(123)
 * .min(123)
 * .unit("unit")
 * .build())
 * .attribute(AttributeProperty.builder()
 * .dataType("dataType")
 * .fullyQualifiedName("fullyQualifiedName")
 * // the properties below are optional
 * .allowedValues(List.of("allowedValues"))
 * .assignedValue("assignedValue")
 * .defaultValue("defaultValue")
 * .description("description")
 * .max(123)
 * .min(123)
 * .unit("unit")
 * .build())
 * .branch(BranchProperty.builder()
 * .fullyQualifiedName("fullyQualifiedName")
 * // the properties below are optional
 * .description("description")
 * .build())
 * .sensor(SensorProperty.builder()
 * .dataType("dataType")
 * .fullyQualifiedName("fullyQualifiedName")
 * // the properties below are optional
 * .allowedValues(List.of("allowedValues"))
 * .description("description")
 * .max(123)
 * .min(123)
 * .unit("unit")
 * .build())
 * .build()))
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotfleetwise-signalcatalog.html)
 */
public interface CfnSignalCatalogProps {
  /**
   * (Optional) A brief description of the signal catalog.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotfleetwise-signalcatalog.html#cfn-iotfleetwise-signalcatalog-description)
   */
  public fun description(): String? = unwrap(this).getDescription()

  /**
   * (Optional) The name of the signal catalog.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotfleetwise-signalcatalog.html#cfn-iotfleetwise-signalcatalog-name)
   */
  public fun name(): String? = unwrap(this).getName()

  /**
   * (Optional) Information about the number of nodes and node types in a vehicle network.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotfleetwise-signalcatalog.html#cfn-iotfleetwise-signalcatalog-nodecounts)
   */
  public fun nodeCounts(): Any? = unwrap(this).getNodeCounts()

  /**
   * (Optional) A list of information about nodes, which are a general abstraction of signals.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotfleetwise-signalcatalog.html#cfn-iotfleetwise-signalcatalog-nodes)
   */
  public fun nodes(): Any? = unwrap(this).getNodes()

  /**
   * (Optional) Metadata that can be used to manage the signal catalog.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotfleetwise-signalcatalog.html#cfn-iotfleetwise-signalcatalog-tags)
   */
  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * A builder for [CfnSignalCatalogProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param description (Optional) A brief description of the signal catalog.
     */
    public fun description(description: String)

    /**
     * @param name (Optional) The name of the signal catalog.
     */
    public fun name(name: String)

    /**
     * @param nodeCounts (Optional) Information about the number of nodes and node types in a
     * vehicle network.
     */
    public fun nodeCounts(nodeCounts: IResolvable)

    /**
     * @param nodeCounts (Optional) Information about the number of nodes and node types in a
     * vehicle network.
     */
    public fun nodeCounts(nodeCounts: CfnSignalCatalog.NodeCountsProperty)

    /**
     * @param nodeCounts (Optional) Information about the number of nodes and node types in a
     * vehicle network.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("02f0808b2e70cce5f50eeeea5f16cf5de52ab90b5e6c4d843514fa5207446fbd")
    public fun nodeCounts(nodeCounts: CfnSignalCatalog.NodeCountsProperty.Builder.() -> Unit)

    /**
     * @param nodes (Optional) A list of information about nodes, which are a general abstraction of
     * signals.
     */
    public fun nodes(nodes: IResolvable)

    /**
     * @param nodes (Optional) A list of information about nodes, which are a general abstraction of
     * signals.
     */
    public fun nodes(nodes: List<Any>)

    /**
     * @param nodes (Optional) A list of information about nodes, which are a general abstraction of
     * signals.
     */
    public fun nodes(vararg nodes: Any)

    /**
     * @param tags (Optional) Metadata that can be used to manage the signal catalog.
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * @param tags (Optional) Metadata that can be used to manage the signal catalog.
     */
    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.iotfleetwise.CfnSignalCatalogProps.Builder =
        software.amazon.awscdk.services.iotfleetwise.CfnSignalCatalogProps.builder()

    /**
     * @param description (Optional) A brief description of the signal catalog.
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * @param name (Optional) The name of the signal catalog.
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    /**
     * @param nodeCounts (Optional) Information about the number of nodes and node types in a
     * vehicle network.
     */
    override fun nodeCounts(nodeCounts: IResolvable) {
      cdkBuilder.nodeCounts(nodeCounts.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param nodeCounts (Optional) Information about the number of nodes and node types in a
     * vehicle network.
     */
    override fun nodeCounts(nodeCounts: CfnSignalCatalog.NodeCountsProperty) {
      cdkBuilder.nodeCounts(nodeCounts.let(CfnSignalCatalog.NodeCountsProperty.Companion::unwrap))
    }

    /**
     * @param nodeCounts (Optional) Information about the number of nodes and node types in a
     * vehicle network.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("02f0808b2e70cce5f50eeeea5f16cf5de52ab90b5e6c4d843514fa5207446fbd")
    override fun nodeCounts(nodeCounts: CfnSignalCatalog.NodeCountsProperty.Builder.() -> Unit):
        Unit = nodeCounts(CfnSignalCatalog.NodeCountsProperty(nodeCounts))

    /**
     * @param nodes (Optional) A list of information about nodes, which are a general abstraction of
     * signals.
     */
    override fun nodes(nodes: IResolvable) {
      cdkBuilder.nodes(nodes.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param nodes (Optional) A list of information about nodes, which are a general abstraction of
     * signals.
     */
    override fun nodes(nodes: List<Any>) {
      cdkBuilder.nodes(nodes.map{CdkObjectWrappers.unwrap(it)})
    }

    /**
     * @param nodes (Optional) A list of information about nodes, which are a general abstraction of
     * signals.
     */
    override fun nodes(vararg nodes: Any): Unit = nodes(nodes.toList())

    /**
     * @param tags (Optional) Metadata that can be used to manage the signal catalog.
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag.Companion::unwrap))
    }

    /**
     * @param tags (Optional) Metadata that can be used to manage the signal catalog.
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.iotfleetwise.CfnSignalCatalogProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.iotfleetwise.CfnSignalCatalogProps,
  ) : CdkObject(cdkObject), CfnSignalCatalogProps {
    /**
     * (Optional) A brief description of the signal catalog.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotfleetwise-signalcatalog.html#cfn-iotfleetwise-signalcatalog-description)
     */
    override fun description(): String? = unwrap(this).getDescription()

    /**
     * (Optional) The name of the signal catalog.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotfleetwise-signalcatalog.html#cfn-iotfleetwise-signalcatalog-name)
     */
    override fun name(): String? = unwrap(this).getName()

    /**
     * (Optional) Information about the number of nodes and node types in a vehicle network.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotfleetwise-signalcatalog.html#cfn-iotfleetwise-signalcatalog-nodecounts)
     */
    override fun nodeCounts(): Any? = unwrap(this).getNodeCounts()

    /**
     * (Optional) A list of information about nodes, which are a general abstraction of signals.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotfleetwise-signalcatalog.html#cfn-iotfleetwise-signalcatalog-nodes)
     */
    override fun nodes(): Any? = unwrap(this).getNodes()

    /**
     * (Optional) Metadata that can be used to manage the signal catalog.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotfleetwise-signalcatalog.html#cfn-iotfleetwise-signalcatalog-tags)
     */
    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnSignalCatalogProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.iotfleetwise.CfnSignalCatalogProps):
        CfnSignalCatalogProps = CdkObjectWrappers.wrap(cdkObject) as? CfnSignalCatalogProps ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnSignalCatalogProps):
        software.amazon.awscdk.services.iotfleetwise.CfnSignalCatalogProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.iotfleetwise.CfnSignalCatalogProps
  }
}
