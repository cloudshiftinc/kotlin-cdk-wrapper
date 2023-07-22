@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.iotfleetwise

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.dsl.CfnTagDsl
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.services.iotfleetwise.CfnModelManifestProps

/**
 * Properties for defining a `CfnModelManifest`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.iotfleetwise.*;
 * CfnModelManifestProps cfnModelManifestProps = CfnModelManifestProps.builder()
 * .name("name")
 * .signalCatalogArn("signalCatalogArn")
 * // the properties below are optional
 * .description("description")
 * .nodes(List.of("nodes"))
 * .status("status")
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotfleetwise-modelmanifest.html)
 */
@CdkDslMarker
public class CfnModelManifestPropsDsl {
  private val cdkBuilder: CfnModelManifestProps.Builder = CfnModelManifestProps.builder()

  private val _nodes: MutableList<String> = mutableListOf()

  private val _tags: MutableList<CfnTag> = mutableListOf()

  /**
   * @param description (Optional) A brief description of the vehicle model.
   */
  public fun description(description: String) {
    cdkBuilder.description(description)
  }

  /**
   * @param name The name of the vehicle model. 
   */
  public fun name(name: String) {
    cdkBuilder.name(name)
  }

  /**
   * @param nodes (Optional) A list of nodes, which are a general abstraction of signals.
   */
  public fun nodes(vararg nodes: String) {
    _nodes.addAll(listOf(*nodes))
  }

  /**
   * @param nodes (Optional) A list of nodes, which are a general abstraction of signals.
   */
  public fun nodes(nodes: Collection<String>) {
    _nodes.addAll(nodes)
  }

  /**
   * @param signalCatalogArn The Amazon Resource Name (ARN) of the signal catalog associated with
   * the vehicle model. 
   */
  public fun signalCatalogArn(signalCatalogArn: String) {
    cdkBuilder.signalCatalogArn(signalCatalogArn)
  }

  /**
   * @param status (Optional) The state of the vehicle model.
   * If the status is `ACTIVE` , the vehicle model can't be edited. If the status is `DRAFT` , you
   * can edit the vehicle model.
   */
  public fun status(status: String) {
    cdkBuilder.status(status)
  }

  /**
   * @param tags (Optional) Metadata that can be used to manage the vehicle model.
   */
  public fun tags(tags: CfnTagDsl.() -> Unit) {
    _tags.add(CfnTagDsl().apply(tags).build())
  }

  /**
   * @param tags (Optional) Metadata that can be used to manage the vehicle model.
   */
  public fun tags(tags: Collection<CfnTag>) {
    _tags.addAll(tags)
  }

  public fun build(): CfnModelManifestProps {
    if(_nodes.isNotEmpty()) cdkBuilder.nodes(_nodes)
    if(_tags.isNotEmpty()) cdkBuilder.tags(_tags)
    return cdkBuilder.build()
  }
}
