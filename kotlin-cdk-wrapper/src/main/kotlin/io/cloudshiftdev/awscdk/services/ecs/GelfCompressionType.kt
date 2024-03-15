@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ecs

public enum class GelfCompressionType(
  private val cdkObject: software.amazon.awscdk.services.ecs.GelfCompressionType,
) {
  GZIP(software.amazon.awscdk.services.ecs.GelfCompressionType.GZIP),
  ZLIB(software.amazon.awscdk.services.ecs.GelfCompressionType.ZLIB),
  NONE(software.amazon.awscdk.services.ecs.GelfCompressionType.NONE),
  ;

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.ecs.GelfCompressionType):
        GelfCompressionType = when (cdkObject) {
      software.amazon.awscdk.services.ecs.GelfCompressionType.GZIP -> GelfCompressionType.GZIP
      software.amazon.awscdk.services.ecs.GelfCompressionType.ZLIB -> GelfCompressionType.ZLIB
      software.amazon.awscdk.services.ecs.GelfCompressionType.NONE -> GelfCompressionType.NONE
    }

    internal fun unwrap(wrapped: GelfCompressionType):
        software.amazon.awscdk.services.ecs.GelfCompressionType = wrapped.cdkObject
  }
}
