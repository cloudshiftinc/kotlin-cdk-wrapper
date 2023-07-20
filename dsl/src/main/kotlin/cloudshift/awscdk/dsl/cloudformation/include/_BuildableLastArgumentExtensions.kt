@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.cloudformation.include

import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.cloudformation.include.CfnInclude
import software.amazon.awscdk.cloudformation.include.IncludedNestedStack

public inline fun CfnInclude.loadNestedStack(logicalId: String, block: CfnIncludePropsDsl.() -> Unit
    = {}): IncludedNestedStack {
  val builder = CfnIncludePropsDsl()
  builder.apply(block)
  return loadNestedStack(logicalId, builder.build())
}
