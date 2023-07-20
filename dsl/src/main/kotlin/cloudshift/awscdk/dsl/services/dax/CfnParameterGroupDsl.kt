@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.dax

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.common.MapBuilder
import kotlin.Any
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.dax.CfnParameterGroup
import software.constructs.Construct

@CdkDslMarker
public class CfnParameterGroupDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: CfnParameterGroup.Builder = CfnParameterGroup.Builder.create(scope, id)

  public fun description(description: String) {
    cdkBuilder.description(description)
  }

  public fun parameterGroupName(parameterGroupName: String) {
    cdkBuilder.parameterGroupName(parameterGroupName)
  }

  public fun parameterNameValues(block: MapBuilder.() -> Unit = {}) {
    val builder = MapBuilder()
    builder.apply(block)
    cdkBuilder.parameterNameValues(builder.map)
  }

  public fun parameterNameValues(parameterNameValues: Any) {
    cdkBuilder.parameterNameValues(parameterNameValues)
  }

  public fun build(): CfnParameterGroup = cdkBuilder.build()
}
