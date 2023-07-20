@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.networkfirewall

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.common.MapBuilder
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.Map
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.networkfirewall.CfnRuleGroup

@CdkDslMarker
public class CfnRuleGroupReferenceSetsPropertyDsl {
  private val cdkBuilder: CfnRuleGroup.ReferenceSetsProperty.Builder =
      CfnRuleGroup.ReferenceSetsProperty.builder()

  public fun ipSetReferences(block: MapBuilder.() -> Unit = {}) {
    val builder = MapBuilder()
    builder.apply(block)
    cdkBuilder.ipSetReferences(builder.map)
  }

  public fun ipSetReferences(ipSetReferences: Map<String, Any>) {
    cdkBuilder.ipSetReferences(ipSetReferences)
  }

  public fun ipSetReferences(ipSetReferences: IResolvable) {
    cdkBuilder.ipSetReferences(ipSetReferences)
  }

  public fun build(): CfnRuleGroup.ReferenceSetsProperty = cdkBuilder.build()
}
