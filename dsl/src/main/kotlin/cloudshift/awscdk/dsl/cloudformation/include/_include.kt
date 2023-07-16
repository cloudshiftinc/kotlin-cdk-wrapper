@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.cloudformation.include

import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.cloudformation.include.CfnInclude
import software.amazon.awscdk.cloudformation.include.CfnIncludeProps
import software.amazon.awscdk.cloudformation.include.IncludedNestedStack
import software.constructs.Construct

public object include {
  public inline fun cfnInclude(
    scope: Construct,
    id: String,
    block: CfnIncludeDsl.() -> Unit = {},
  ): CfnInclude {
    val builder = CfnIncludeDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnIncludeProps(block: CfnIncludePropsDsl.() -> Unit = {}): CfnIncludeProps {
    val builder = CfnIncludePropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun includedNestedStack(block: IncludedNestedStackDsl.() -> Unit = {}):
      IncludedNestedStack {
    val builder = IncludedNestedStackDsl()
    builder.apply(block)
    return builder.build()
  }
}
