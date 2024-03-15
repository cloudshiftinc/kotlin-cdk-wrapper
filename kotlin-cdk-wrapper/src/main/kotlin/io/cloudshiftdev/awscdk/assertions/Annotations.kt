@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.assertions

import io.cloudshiftdev.awscdk.Stack
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.cxapi.SynthesisMessage
import kotlin.Any
import kotlin.String
import kotlin.collections.List

/**
 * Suite of assertions that can be run on a CDK Stack.
 *
 * Focused on asserting annotations.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.*;
 * import io.cloudshiftdev.awscdk.assertions.*;
 * Stack stack;
 * Annotations annotations = Annotations.fromStack(stack);
 * ```
 */
public open class Annotations internal constructor(
  internal override val cdkObject: software.amazon.awscdk.assertions.Annotations,
) : CdkObject(cdkObject) {
  /**
   * Get the set of matching errors of a given construct path and message.
   *
   * @param constructPath the construct path to the error. 
   * @param message the error message as should be expected. 
   */
  public open fun findError(constructPath: String, message: Any): List<SynthesisMessage> =
      unwrap(this).findError(constructPath, message).map(SynthesisMessage::wrap)

  /**
   * Get the set of matching infos of a given construct path and message.
   *
   * @param constructPath the construct path to the info. 
   * @param message the info message as should be expected. 
   */
  public open fun findInfo(constructPath: String, message: Any): List<SynthesisMessage> =
      unwrap(this).findInfo(constructPath, message).map(SynthesisMessage::wrap)

  /**
   * Get the set of matching warning of a given construct path and message.
   *
   * @param constructPath the construct path to the warning. 
   * @param message the warning message as should be expected. 
   */
  public open fun findWarning(constructPath: String, message: Any): List<SynthesisMessage> =
      unwrap(this).findWarning(constructPath, message).map(SynthesisMessage::wrap)

  /**
   * Assert that an error with the given message exists in the synthesized CDK `Stack`.
   *
   * @param constructPath the construct path to the error. 
   * @param message the error message as should be expected. 
   */
  public open fun hasError(constructPath: String, message: Any) {
    unwrap(this).hasError(constructPath, message)
  }

  /**
   * Assert that an info with the given message exists in the synthesized CDK `Stack`.
   *
   * @param constructPath the construct path to the info. 
   * @param message the info message as should be expected. 
   */
  public open fun hasInfo(constructPath: String, message: Any) {
    unwrap(this).hasInfo(constructPath, message)
  }

  /**
   * Assert that an error with the given message does not exist in the synthesized CDK `Stack`.
   *
   * @param constructPath the construct path to the error. 
   * @param message the error message as should be expected. 
   */
  public open fun hasNoError(constructPath: String, message: Any) {
    unwrap(this).hasNoError(constructPath, message)
  }

  /**
   * Assert that an info with the given message does not exist in the synthesized CDK `Stack`.
   *
   * @param constructPath the construct path to the info. 
   * @param message the info message as should be expected. 
   */
  public open fun hasNoInfo(constructPath: String, message: Any) {
    unwrap(this).hasNoInfo(constructPath, message)
  }

  /**
   * Assert that an warning with the given message does not exist in the synthesized CDK `Stack`.
   *
   * @param constructPath the construct path to the warning. 
   * @param message the warning message as should be expected. 
   */
  public open fun hasNoWarning(constructPath: String, message: Any) {
    unwrap(this).hasNoWarning(constructPath, message)
  }

  /**
   * Assert that an warning with the given message exists in the synthesized CDK `Stack`.
   *
   * @param constructPath the construct path to the warning. 
   * @param message the warning message as should be expected. 
   */
  public open fun hasWarning(constructPath: String, message: Any) {
    unwrap(this).hasWarning(constructPath, message)
  }

  public companion object {
    public fun fromStack(stack: Stack): Annotations =
        software.amazon.awscdk.assertions.Annotations.fromStack(stack.let(Stack::unwrap)).let(Annotations::wrap)

    internal fun wrap(cdkObject: software.amazon.awscdk.assertions.Annotations): Annotations =
        Annotations(cdkObject)

    internal fun unwrap(wrapped: Annotations): software.amazon.awscdk.assertions.Annotations =
        wrapped.cdkObject
  }
}
