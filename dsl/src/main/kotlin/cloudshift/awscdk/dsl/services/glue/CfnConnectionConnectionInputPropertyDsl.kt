@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.glue

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.common.MapBuilder
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.glue.CfnConnection

@CdkDslMarker
public class CfnConnectionConnectionInputPropertyDsl {
  private val cdkBuilder: CfnConnection.ConnectionInputProperty.Builder =
      CfnConnection.ConnectionInputProperty.builder()

  private val _matchCriteria: MutableList<String> = mutableListOf()

  public fun connectionProperties(block: MapBuilder.() -> Unit = {}) {
    val builder = MapBuilder()
    builder.apply(block)
    cdkBuilder.connectionProperties(builder.map)
  }

  public fun connectionProperties(connectionProperties: Any) {
    cdkBuilder.connectionProperties(connectionProperties)
  }

  public fun connectionType(connectionType: String) {
    cdkBuilder.connectionType(connectionType)
  }

  public fun description(description: String) {
    cdkBuilder.description(description)
  }

  public fun matchCriteria(vararg matchCriteria: String) {
    _matchCriteria.addAll(listOf(*matchCriteria))
  }

  public fun matchCriteria(matchCriteria: Collection<String>) {
    _matchCriteria.addAll(matchCriteria)
  }

  public fun name(name: String) {
    cdkBuilder.name(name)
  }

  public fun physicalConnectionRequirements(physicalConnectionRequirements: IResolvable) {
    cdkBuilder.physicalConnectionRequirements(physicalConnectionRequirements)
  }

  public
      fun physicalConnectionRequirements(physicalConnectionRequirements: CfnConnection.PhysicalConnectionRequirementsProperty) {
    cdkBuilder.physicalConnectionRequirements(physicalConnectionRequirements)
  }

  public fun build(): CfnConnection.ConnectionInputProperty {
    if(_matchCriteria.isNotEmpty()) cdkBuilder.matchCriteria(_matchCriteria)
    return cdkBuilder.build()
  }
}
