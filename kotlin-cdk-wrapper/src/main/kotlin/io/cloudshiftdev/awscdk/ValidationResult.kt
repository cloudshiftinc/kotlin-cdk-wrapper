@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk

import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Boolean
import kotlin.String

/**
 * Representation of validation results.
 *
 * Models a tree of validation errors so that we have as much information as possible
 * about the failure that occurred.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.*;
 * ValidationResults validationResults;
 * ValidationResult validationResult = new ValidationResult("errorMessage", validationResults);
 * ```
 */
public open class ValidationResult internal constructor(
  internal override val cdkObject: software.amazon.awscdk.ValidationResult,
) : CdkObject(cdkObject) {
  public constructor(errorMessage: String, results: ValidationResults) :
      this(software.amazon.awscdk.ValidationResult(errorMessage, ValidationResults.unwrap(results)))

  public constructor(errorMessage: String) :
      this(software.amazon.awscdk.ValidationResult(errorMessage))

  public constructor() : this(software.amazon.awscdk.ValidationResult())

  /**
   * Turn a failed validation into an exception.
   */
  public open fun assertSuccess() {
    unwrap(this).assertSuccess()
  }

  /**
   *
   */
  public open fun errorMessage(): String = unwrap(this).getErrorMessage()

  /**
   * Return a string rendering of the tree of validation failures.
   */
  public open fun errorTree(): String = unwrap(this).errorTree()

  /**
   *
   */
  public open fun isSuccess(): Boolean = unwrap(this).getIsSuccess()

  /**
   * Wrap this result with an error message, if it concerns an error.
   *
   * @param message 
   */
  public open fun prefix(message: String): ValidationResult =
      unwrap(this).prefix(message).let(ValidationResult::wrap)

  /**
   *
   */
  public open fun results(): ValidationResults =
      unwrap(this).getResults().let(ValidationResults::wrap)

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.ValidationResult): ValidationResult =
        ValidationResult(cdkObject)

    internal fun unwrap(wrapped: ValidationResult): software.amazon.awscdk.ValidationResult =
        wrapped.cdkObject
  }
}
