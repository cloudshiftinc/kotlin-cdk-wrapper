@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.sns

public enum class BackoffFunction(
  private val cdkObject: software.amazon.awscdk.services.sns.BackoffFunction,
) {
  ARITHMETIC(software.amazon.awscdk.services.sns.BackoffFunction.ARITHMETIC),
  EXPONENTIAL(software.amazon.awscdk.services.sns.BackoffFunction.EXPONENTIAL),
  GEOMETRIC(software.amazon.awscdk.services.sns.BackoffFunction.GEOMETRIC),
  LINEAR(software.amazon.awscdk.services.sns.BackoffFunction.LINEAR),
  ;

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.sns.BackoffFunction):
        BackoffFunction = when (cdkObject) {
      software.amazon.awscdk.services.sns.BackoffFunction.ARITHMETIC -> BackoffFunction.ARITHMETIC
      software.amazon.awscdk.services.sns.BackoffFunction.EXPONENTIAL -> BackoffFunction.EXPONENTIAL
      software.amazon.awscdk.services.sns.BackoffFunction.GEOMETRIC -> BackoffFunction.GEOMETRIC
      software.amazon.awscdk.services.sns.BackoffFunction.LINEAR -> BackoffFunction.LINEAR
    }

    internal fun unwrap(wrapped: BackoffFunction):
        software.amazon.awscdk.services.sns.BackoffFunction = wrapped.cdkObject
  }
}
