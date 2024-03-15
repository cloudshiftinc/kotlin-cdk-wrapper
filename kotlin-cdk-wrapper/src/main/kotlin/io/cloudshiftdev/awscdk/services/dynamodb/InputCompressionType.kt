@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.dynamodb

public enum class InputCompressionType(
  private val cdkObject: software.amazon.awscdk.services.dynamodb.InputCompressionType,
) {
  GZIP(software.amazon.awscdk.services.dynamodb.InputCompressionType.GZIP),
  ZSTD(software.amazon.awscdk.services.dynamodb.InputCompressionType.ZSTD),
  NONE(software.amazon.awscdk.services.dynamodb.InputCompressionType.NONE),
  ;

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.dynamodb.InputCompressionType):
        InputCompressionType = when (cdkObject) {
      software.amazon.awscdk.services.dynamodb.InputCompressionType.GZIP ->
          InputCompressionType.GZIP
      software.amazon.awscdk.services.dynamodb.InputCompressionType.ZSTD ->
          InputCompressionType.ZSTD
      software.amazon.awscdk.services.dynamodb.InputCompressionType.NONE ->
          InputCompressionType.NONE
    }

    internal fun unwrap(wrapped: InputCompressionType):
        software.amazon.awscdk.services.dynamodb.InputCompressionType = wrapped.cdkObject
  }
}
