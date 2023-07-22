@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.docdb

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.common.MapBuilder
import cloudshift.awscdk.dsl.CfnTagDsl
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.services.docdb.CfnDBClusterParameterGroupProps

@CdkDslMarker
public class CfnDBClusterParameterGroupPropsDsl {
  private val cdkBuilder: CfnDBClusterParameterGroupProps.Builder =
      CfnDBClusterParameterGroupProps.builder()

  private val _tags: MutableList<CfnTag> = mutableListOf()

  /**
   * @param description The description for the cluster parameter group. 
   */
  public fun description(description: String) {
    cdkBuilder.description(description)
  }

  /**
   * @param family The cluster parameter group family name. 
   */
  public fun family(family: String) {
    cdkBuilder.family(family)
  }

  /**
   * @param name The name of the DB cluster parameter group.
   * Constraints:
   *
   * * Must not match the name of an existing `DBClusterParameterGroup` .
   *
   *
   * This value is stored as a lowercase string.
   */
  public fun name(name: String) {
    cdkBuilder.name(name)
  }

  /**
   * @param parameters Provides a list of parameters for the cluster parameter group. 
   */
  public fun parameters(parameters: MapBuilder.() -> Unit = {}) {
    val builder = MapBuilder()
    builder.apply(parameters)
    cdkBuilder.parameters(builder.map)
  }

  /**
   * @param parameters Provides a list of parameters for the cluster parameter group. 
   */
  public fun parameters(parameters: Any) {
    cdkBuilder.parameters(parameters)
  }

  /**
   * @param tags The tags to be assigned to the cluster parameter group.
   */
  public fun tags(tags: CfnTagDsl.() -> Unit) {
    _tags.add(CfnTagDsl().apply(tags).build())
  }

  /**
   * @param tags The tags to be assigned to the cluster parameter group.
   */
  public fun tags(tags: Collection<CfnTag>) {
    _tags.addAll(tags)
  }

  public fun build(): CfnDBClusterParameterGroupProps {
    if(_tags.isNotEmpty()) cdkBuilder.tags(_tags)
    return cdkBuilder.build()
  }
}
