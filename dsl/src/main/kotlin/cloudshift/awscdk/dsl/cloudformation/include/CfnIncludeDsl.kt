@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.cloudformation.include

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.common.MapBuilder
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.Map
import software.amazon.awscdk.cloudformation.include.CfnInclude
import software.amazon.awscdk.cloudformation.include.CfnIncludeProps
import software.constructs.Construct

@CdkDslMarker
public class CfnIncludeDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: CfnInclude.Builder = CfnInclude.Builder.create(scope, id)

  public fun allowCyclicalReferences(allowCyclicalReferences: Boolean) {
    cdkBuilder.allowCyclicalReferences(allowCyclicalReferences)
  }

  public fun loadNestedStacks(loadNestedStacks: Map<String, out CfnIncludeProps>) {
    cdkBuilder.loadNestedStacks(loadNestedStacks)
  }

  public fun parameters(block: MapBuilder.() -> Unit = {}) {
    val builder = MapBuilder()
    builder.apply(block)
    cdkBuilder.parameters(builder.map)
  }

  public fun parameters(parameters: Map<String, *>) {
    cdkBuilder.parameters(parameters)
  }

  public fun preserveLogicalIds(preserveLogicalIds: Boolean) {
    cdkBuilder.preserveLogicalIds(preserveLogicalIds)
  }

  public fun templateFile(templateFile: String) {
    cdkBuilder.templateFile(templateFile)
  }

  public fun build(): CfnInclude = cdkBuilder.build()
}
