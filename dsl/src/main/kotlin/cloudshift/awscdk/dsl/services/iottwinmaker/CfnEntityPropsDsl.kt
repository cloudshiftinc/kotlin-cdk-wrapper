@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.iottwinmaker

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.common.MapBuilder
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.Map
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.iottwinmaker.CfnEntityProps

@CdkDslMarker
public class CfnEntityPropsDsl {
  private val cdkBuilder: CfnEntityProps.Builder = CfnEntityProps.builder()

  /**
   * @param components An object that maps strings to the components in the entity.
   * Each string in the mapping must be unique to this object.
   *
   * For information on the component object see the
   * [component](https://docs.aws.amazon.com//iot-twinmaker/latest/apireference/API_ComponentResponse.html)
   * API reference.
   */
  public fun components(components: MapBuilder.() -> Unit = {}) {
    val builder = MapBuilder()
    builder.apply(components)
    cdkBuilder.components(builder.map)
  }

  /**
   * @param components An object that maps strings to the components in the entity.
   * Each string in the mapping must be unique to this object.
   *
   * For information on the component object see the
   * [component](https://docs.aws.amazon.com//iot-twinmaker/latest/apireference/API_ComponentResponse.html)
   * API reference.
   */
  public fun components(components: Map<String, Any>) {
    cdkBuilder.components(components)
  }

  /**
   * @param components An object that maps strings to the components in the entity.
   * Each string in the mapping must be unique to this object.
   *
   * For information on the component object see the
   * [component](https://docs.aws.amazon.com//iot-twinmaker/latest/apireference/API_ComponentResponse.html)
   * API reference.
   */
  public fun components(components: IResolvable) {
    cdkBuilder.components(components)
  }

  /**
   * @param description The description of the entity.
   */
  public fun description(description: String) {
    cdkBuilder.description(description)
  }

  /**
   * @param entityId The entity ID.
   */
  public fun entityId(entityId: String) {
    cdkBuilder.entityId(entityId)
  }

  /**
   * @param entityName The entity name. 
   */
  public fun entityName(entityName: String) {
    cdkBuilder.entityName(entityName)
  }

  /**
   * @param parentEntityId The ID of the parent entity.
   */
  public fun parentEntityId(parentEntityId: String) {
    cdkBuilder.parentEntityId(parentEntityId)
  }

  /**
   * @param tags Metadata that you can use to manage the entity.
   */
  public fun tags(tags: Map<String, String>) {
    cdkBuilder.tags(tags)
  }

  /**
   * @param workspaceId The ID of the workspace. 
   */
  public fun workspaceId(workspaceId: String) {
    cdkBuilder.workspaceId(workspaceId)
  }

  public fun build(): CfnEntityProps = cdkBuilder.build()
}
