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
  /**
   * Triggers an AWS Lambda function during deployment.
   *
   * Example:
   *
   * ```
   * import software.amazon.awscdk.triggers.*;
   * Function func = Function.Builder.create(this, "MyFunction")
   * .handler("index.handler")
   * .runtime(Runtime.NODEJS_14_X)
   * .code(Code.fromInline("foo"))
   * .build();
   * Trigger.Builder.create(this, "MyTrigger")
   * .handler(func)
   * .timeout(Duration.minutes(10))
   * .invocationType(InvocationType.EVENT)
   * .build();
   * ```
   */
  public inline fun trigger(
    scope: Construct,
    id: String,
    block: TriggerDsl.() -> Unit = {},
  ): Trigger {
    val builder = TriggerDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  /**
   * Invokes an AWS Lambda function during deployment.
   *
   * Example:
   *
   * ```
   * import software.amazon.awscdk.triggers.*;
   * TriggerFunction.Builder.create(this, "MyTrigger")
   * .runtime(Runtime.NODEJS_14_X)
   * .handler("index.handler")
   * .code(Code.fromAsset(__dirname + "/my-trigger"))
   * .build();
   * ```
   */
  public inline fun triggerFunction(
    scope: Construct,
    id: String,
    block: TriggerFunctionDsl.() -> Unit = {},
  ): TriggerFunction {
    val builder = TriggerFunctionDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  /**
   * Props for `InvokeFunction`.
   *
   * Example:
   *
   * ```
   * import software.amazon.awscdk.triggers.*;
   * TriggerFunction.Builder.create(this, "MyTrigger")
   * .runtime(Runtime.NODEJS_14_X)
   * .handler("index.handler")
   * .code(Code.fromAsset(__dirname + "/my-trigger"))
   * .build();
   * ```
   */
  public inline fun triggerFunctionProps(block: TriggerFunctionPropsDsl.() -> Unit = {}):
      TriggerFunctionProps {
    val builder = TriggerFunctionPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * Options for `Trigger`.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.triggers.*;
   * import software.constructs.*;
   * Construct construct;
   * TriggerOptions triggerOptions = TriggerOptions.builder()
   * .executeAfter(List.of(construct))
   * .executeBefore(List.of(construct))
   * .executeOnHandlerChange(false)
   * .build();
   * ```
   */
  public inline fun triggerOptions(block: TriggerOptionsDsl.() -> Unit = {}): TriggerOptions {
    val builder = TriggerOptionsDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * Props for `Trigger`.
   *
   * Example:
   *
   * ```
   * import software.amazon.awscdk.triggers.*;
   * Function func = Function.Builder.create(this, "MyFunction")
   * .handler("index.handler")
   * .runtime(Runtime.NODEJS_14_X)
   * .code(Code.fromInline("foo"))
   * .build();
   * Trigger.Builder.create(this, "MyTrigger")
   * .handler(func)
   * .timeout(Duration.minutes(10))
   * .invocationType(InvocationType.EVENT)
   * .build();
   * ```
   */
  public inline fun triggerProps(block: TriggerPropsDsl.() -> Unit = {}): TriggerProps {
    val builder = TriggerPropsDsl()
    builder.apply(block)
    return builder.build()
  }
}
