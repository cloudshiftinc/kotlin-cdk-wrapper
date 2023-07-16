@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.securityhub

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.common.MapBuilder
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.securityhub.CfnHub
import software.constructs.Construct

@CdkDslMarker
public class CfnHubDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: CfnHub.Builder = CfnHub.Builder.create(scope, id)

  public fun autoEnableControls(autoEnableControls: Boolean) {
    cdkBuilder.autoEnableControls(autoEnableControls)
  }

  public fun autoEnableControls(autoEnableControls: IResolvable) {
    cdkBuilder.autoEnableControls(autoEnableControls)
  }

  public fun controlFindingGenerator(controlFindingGenerator: String) {
    cdkBuilder.controlFindingGenerator(controlFindingGenerator)
  }

  public fun enableDefaultStandards(enableDefaultStandards: Boolean) {
    cdkBuilder.enableDefaultStandards(enableDefaultStandards)
  }

  public fun enableDefaultStandards(enableDefaultStandards: IResolvable) {
    cdkBuilder.enableDefaultStandards(enableDefaultStandards)
  }

  public fun tags(block: MapBuilder.() -> Unit = {}) {
    val builder = MapBuilder()
    builder.apply(block)
    cdkBuilder.tags(builder.map)
  }

  public fun tags(tags: Any) {
    cdkBuilder.tags(tags)
  }

  public fun build(): CfnHub = cdkBuilder.build()
}
