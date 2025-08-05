@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.logs

public enum class DataConverterType(
  private val cdkObject: software.amazon.awscdk.services.logs.DataConverterType,
) {
  TYPE_CONVERTER(software.amazon.awscdk.services.logs.DataConverterType.TYPE_CONVERTER),
  DATETIME_CONVERTER(software.amazon.awscdk.services.logs.DataConverterType.DATETIME_CONVERTER),
  ;

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.logs.DataConverterType):
        DataConverterType = when (cdkObject) {
      software.amazon.awscdk.services.logs.DataConverterType.TYPE_CONVERTER ->
          DataConverterType.TYPE_CONVERTER
      software.amazon.awscdk.services.logs.DataConverterType.DATETIME_CONVERTER ->
          DataConverterType.DATETIME_CONVERTER
    }

    internal fun unwrap(wrapped: DataConverterType):
        software.amazon.awscdk.services.logs.DataConverterType = wrapped.cdkObject
  }
}
