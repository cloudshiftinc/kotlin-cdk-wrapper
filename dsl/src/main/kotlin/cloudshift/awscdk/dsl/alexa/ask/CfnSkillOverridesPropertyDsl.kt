@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.alexa.ask

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.common.MapBuilder
import kotlin.Any
import kotlin.Unit
import software.amazon.awscdk.alexa.ask.CfnSkill

@CdkDslMarker
public class CfnSkillOverridesPropertyDsl {
  private val cdkBuilder: CfnSkill.OverridesProperty.Builder = CfnSkill.OverridesProperty.builder()

  public fun manifest(block: MapBuilder.() -> Unit = {}) {
    val builder = MapBuilder()
    builder.apply(block)
    cdkBuilder.manifest(builder.map)
  }

  public fun manifest(manifest: Any) {
    cdkBuilder.manifest(manifest)
  }

  public fun build(): CfnSkill.OverridesProperty = cdkBuilder.build()
}
