@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.ssm

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.common.MapBuilder
import kotlin.Any
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.ssm.CfnParameter
import software.constructs.Construct

@CdkDslMarker
public class CfnParameterDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: CfnParameter.Builder = CfnParameter.Builder.create(scope, id)

  public fun allowedPattern(allowedPattern: String) {
    cdkBuilder.allowedPattern(allowedPattern)
  }

  public fun dataType(dataType: String) {
    cdkBuilder.dataType(dataType)
  }

  public fun description(description: String) {
    cdkBuilder.description(description)
  }

  public fun name(name: String) {
    cdkBuilder.name(name)
  }

  public fun policies(policies: String) {
    cdkBuilder.policies(policies)
  }

  public fun tags(block: MapBuilder.() -> Unit = {}) {
    val builder = MapBuilder()
    builder.apply(block)
    cdkBuilder.tags(builder.map)
  }

  public fun tags(tags: Any) {
    cdkBuilder.tags(tags)
  }

  public fun tier(tier: String) {
    cdkBuilder.tier(tier)
  }

  public fun type(type: String) {
    cdkBuilder.type(type)
  }

  public fun `value`(`value`: String) {
    cdkBuilder.`value`(`value`)
  }

  public fun build(): CfnParameter = cdkBuilder.build()
}
