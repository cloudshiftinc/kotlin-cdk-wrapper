@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk

import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Boolean
import kotlin.String

public open class ValidationResult internal constructor(
  internal override val cdkObject: software.amazon.awscdk.ValidationResult,
) : CdkObject(cdkObject) {
  public open fun assertSuccess() {
    unwrap(this).assertSuccess()
  }

  public open fun errorMessage(): String = unwrap(this).getErrorMessage()

  public open fun errorTree(): String = unwrap(this).errorTree()

  public open fun isSuccess(): Boolean = unwrap(this).getIsSuccess()

  public open fun prefix(message: String): ValidationResult =
      unwrap(this).prefix(message).let(ValidationResult::wrap)

  public open fun results(): ValidationResults =
      unwrap(this).getResults().let(ValidationResults::wrap)

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.ValidationResult): ValidationResult =
        ValidationResult(cdkObject)

    internal fun unwrap(wrapped: ValidationResult): software.amazon.awscdk.ValidationResult =
        wrapped.cdkObject
  }
}
