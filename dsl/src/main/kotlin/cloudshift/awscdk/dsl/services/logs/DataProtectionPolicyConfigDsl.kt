@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.logs

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.common.MapBuilder
import kotlin.Any
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.logs.DataProtectionPolicyConfig

@CdkDslMarker
public class DataProtectionPolicyConfigDsl {
  private val cdkBuilder: DataProtectionPolicyConfig.Builder = DataProtectionPolicyConfig.builder()

  public fun description(description: String) {
    cdkBuilder.description(description)
  }

  public fun name(name: String) {
    cdkBuilder.name(name)
  }

  public fun statement(block: MapBuilder.() -> Unit = {}) {
    val builder = MapBuilder()
    builder.apply(block)
    cdkBuilder.statement(builder.map)
  }

  public fun statement(statement: Any) {
    cdkBuilder.statement(statement)
  }

  public fun version(version: String) {
    cdkBuilder.version(version)
  }

  public fun build(): DataProtectionPolicyConfig = cdkBuilder.build()
}
