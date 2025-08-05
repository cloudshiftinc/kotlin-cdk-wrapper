@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.logs

public enum class TypeConverterType(
  private val cdkObject: software.amazon.awscdk.services.logs.TypeConverterType,
) {
  BOOLEAN(software.amazon.awscdk.services.logs.TypeConverterType.BOOLEAN),
  INTEGER(software.amazon.awscdk.services.logs.TypeConverterType.INTEGER),
  DOUBLE(software.amazon.awscdk.services.logs.TypeConverterType.DOUBLE),
  STRING(software.amazon.awscdk.services.logs.TypeConverterType.STRING),
  ;

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.logs.TypeConverterType):
        TypeConverterType = when (cdkObject) {
      software.amazon.awscdk.services.logs.TypeConverterType.BOOLEAN -> TypeConverterType.BOOLEAN
      software.amazon.awscdk.services.logs.TypeConverterType.INTEGER -> TypeConverterType.INTEGER
      software.amazon.awscdk.services.logs.TypeConverterType.DOUBLE -> TypeConverterType.DOUBLE
      software.amazon.awscdk.services.logs.TypeConverterType.STRING -> TypeConverterType.STRING
    }

    internal fun unwrap(wrapped: TypeConverterType):
        software.amazon.awscdk.services.logs.TypeConverterType = wrapped.cdkObject
  }
}
