@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.iotfleetwise

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.dsl.CfnTagDsl
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.iotfleetwise.CfnSignalCatalog
import software.constructs.Construct

/**
 * Creates a collection of standardized signals that can be reused to create vehicle models.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.iotfleetwise.*;
 * CfnSignalCatalog cfnSignalCatalog = CfnSignalCatalog.Builder.create(this, "MyCfnSignalCatalog")
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
@CdkDslMarker
public class CfnSignalCatalogDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: CfnSignalCatalog.Builder = CfnSignalCatalog.Builder.create(scope, id)

  private val _nodes: MutableList<Any> = mutableListOf()

  private val _tags: MutableList<CfnTag> = mutableListOf()

  /**
   * (Optional) A brief description of the signal catalog.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotfleetwise-signalcatalog.html#cfn-iotfleetwise-signalcatalog-description)
   * @param description (Optional) A brief description of the signal catalog. 
   */
  public fun description(description: String) {
    cdkBuilder.description(description)
  }

  /**
   * (Optional) The name of the signal catalog.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotfleetwise-signalcatalog.html#cfn-iotfleetwise-signalcatalog-name)
   * @param name (Optional) The name of the signal catalog. 
   */
  public fun name(name: String) {
    cdkBuilder.name(name)
  }

  /**
   * (Optional) Information about the number of nodes and node types in a vehicle network.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotfleetwise-signalcatalog.html#cfn-iotfleetwise-signalcatalog-nodecounts)
   * @param nodeCounts (Optional) Information about the number of nodes and node types in a vehicle
   * network. 
   */
  public fun nodeCounts(nodeCounts: IResolvable) {
    cdkBuilder.nodeCounts(nodeCounts)
  }

  /**
   * (Optional) Information about the number of nodes and node types in a vehicle network.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotfleetwise-signalcatalog.html#cfn-iotfleetwise-signalcatalog-nodecounts)
   * @param nodeCounts (Optional) Information about the number of nodes and node types in a vehicle
   * network. 
   */
  public fun nodeCounts(nodeCounts: CfnSignalCatalog.NodeCountsProperty) {
    cdkBuilder.nodeCounts(nodeCounts)
  }

  /**
   * (Optional) A list of information about nodes, which are a general abstraction of signals.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotfleetwise-signalcatalog.html#cfn-iotfleetwise-signalcatalog-nodes)
   * @param nodes (Optional) A list of information about nodes, which are a general abstraction of
   * signals. 
   */
  public fun nodes(vararg nodes: Any) {
    _nodes.addAll(listOf(*nodes))
  }

  /**
   * (Optional) A list of information about nodes, which are a general abstraction of signals.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotfleetwise-signalcatalog.html#cfn-iotfleetwise-signalcatalog-nodes)
   * @param nodes (Optional) A list of information about nodes, which are a general abstraction of
   * signals. 
   */
  public fun nodes(nodes: Collection<Any>) {
    _nodes.addAll(nodes)
  }

  /**
   * (Optional) A list of information about nodes, which are a general abstraction of signals.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotfleetwise-signalcatalog.html#cfn-iotfleetwise-signalcatalog-nodes)
   * @param nodes (Optional) A list of information about nodes, which are a general abstraction of
   * signals. 
   */
  public fun nodes(nodes: IResolvable) {
    cdkBuilder.nodes(nodes)
  }

  /**
   * (Optional) Metadata that can be used to manage the signal catalog.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotfleetwise-signalcatalog.html#cfn-iotfleetwise-signalcatalog-tags)
   * @param tags (Optional) Metadata that can be used to manage the signal catalog. 
   */
  public fun tags(tags: CfnTagDsl.() -> Unit) {
    _tags.add(CfnTagDsl().apply(tags).build())
  }

  /**
   * (Optional) Metadata that can be used to manage the signal catalog.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotfleetwise-signalcatalog.html#cfn-iotfleetwise-signalcatalog-tags)
   * @param tags (Optional) Metadata that can be used to manage the signal catalog. 
   */
  public fun tags(tags: Collection<CfnTag>) {
    _tags.addAll(tags)
  }

  public fun build(): CfnSignalCatalog {
    if(_nodes.isNotEmpty()) cdkBuilder.nodes(_nodes)
    if(_tags.isNotEmpty()) cdkBuilder.tags(_tags)
    return cdkBuilder.build()
  }
}
