@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.logs

public enum class StringMutatorType(
  private val cdkObject: software.amazon.awscdk.services.logs.StringMutatorType,
) {
  LOWER_CASE(software.amazon.awscdk.services.logs.StringMutatorType.LOWER_CASE),
  UPPER_CASE(software.amazon.awscdk.services.logs.StringMutatorType.UPPER_CASE),
  TRIM(software.amazon.awscdk.services.logs.StringMutatorType.TRIM),
  SPLIT(software.amazon.awscdk.services.logs.StringMutatorType.SPLIT),
  SUBSTITUTE(software.amazon.awscdk.services.logs.StringMutatorType.SUBSTITUTE),
  ;

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.logs.StringMutatorType):
        StringMutatorType = when (cdkObject) {
      software.amazon.awscdk.services.logs.StringMutatorType.LOWER_CASE ->
          StringMutatorType.LOWER_CASE
      software.amazon.awscdk.services.logs.StringMutatorType.UPPER_CASE ->
          StringMutatorType.UPPER_CASE
      software.amazon.awscdk.services.logs.StringMutatorType.TRIM -> StringMutatorType.TRIM
      software.amazon.awscdk.services.logs.StringMutatorType.SPLIT -> StringMutatorType.SPLIT
      software.amazon.awscdk.services.logs.StringMutatorType.SUBSTITUTE ->
          StringMutatorType.SUBSTITUTE
    }

    internal fun unwrap(wrapped: StringMutatorType):
        software.amazon.awscdk.services.logs.StringMutatorType = wrapped.cdkObject
  }
}
