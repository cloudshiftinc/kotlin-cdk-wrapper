@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.cloudformation.include

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.common.MapBuilder
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.Map
import software.amazon.awscdk.cloudformation.include.CfnIncludeProps

@CdkDslMarker
public class CfnIncludePropsDsl {
  private val cdkBuilder: CfnIncludeProps.Builder = CfnIncludeProps.builder()

  public fun allowCyclicalReferences(allowCyclicalReferences: Boolean) {
    cdkBuilder.allowCyclicalReferences(allowCyclicalReferences)
  }

  public fun loadNestedStacks(loadNestedStacks: Map<String, CfnIncludeProps>) {
    cdkBuilder.loadNestedStacks(loadNestedStacks)
  }

  public fun parameters(block: MapBuilder.() -> Unit = {}) {
    val builder = MapBuilder()
    builder.apply(block)
    cdkBuilder.parameters(builder.map)
  }

  public fun parameters(parameters: Map<String, Any>) {
    cdkBuilder.parameters(parameters)
  }

  public fun preserveLogicalIds(preserveLogicalIds: Boolean) {
    cdkBuilder.preserveLogicalIds(preserveLogicalIds)
  }

  public fun templateFile(templateFile: String) {
    cdkBuilder.templateFile(templateFile)
  }

  public fun build(): CfnIncludeProps = cdkBuilder.build()
}
