@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.triggers

import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.triggers.Trigger
import software.amazon.awscdk.triggers.TriggerFunction
import software.amazon.awscdk.triggers.TriggerFunctionProps
import software.amazon.awscdk.triggers.TriggerOptions
import software.amazon.awscdk.triggers.TriggerProps
import software.constructs.Construct

public object triggers {
  public inline fun trigger(
    scope: Construct,
    id: String,
    block: TriggerDsl.() -> Unit = {},
  ): Trigger {
    val builder = TriggerDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  public inline fun triggerFunction(
    scope: Construct,
    id: String,
    block: TriggerFunctionDsl.() -> Unit = {},
  ): TriggerFunction {
    val builder = TriggerFunctionDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  public inline fun triggerFunctionProps(block: TriggerFunctionPropsDsl.() -> Unit = {}):
      TriggerFunctionProps {
    val builder = TriggerFunctionPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun triggerOptions(block: TriggerOptionsDsl.() -> Unit = {}): TriggerOptions {
    val builder = TriggerOptionsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun triggerProps(block: TriggerPropsDsl.() -> Unit = {}): TriggerProps {
    val builder = TriggerPropsDsl()
    builder.apply(block)
    return builder.build()
  }
}
