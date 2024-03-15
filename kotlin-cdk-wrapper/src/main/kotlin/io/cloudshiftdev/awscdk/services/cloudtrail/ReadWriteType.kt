@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.cloudtrail

public enum class ReadWriteType(
  private val cdkObject: software.amazon.awscdk.services.cloudtrail.ReadWriteType,
) {
  READ_ONLY(software.amazon.awscdk.services.cloudtrail.ReadWriteType.READ_ONLY),
  WRITE_ONLY(software.amazon.awscdk.services.cloudtrail.ReadWriteType.WRITE_ONLY),
  ALL(software.amazon.awscdk.services.cloudtrail.ReadWriteType.ALL),
  NONE(software.amazon.awscdk.services.cloudtrail.ReadWriteType.NONE),
  ;

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.cloudtrail.ReadWriteType):
        ReadWriteType = when (cdkObject) {
      software.amazon.awscdk.services.cloudtrail.ReadWriteType.READ_ONLY -> ReadWriteType.READ_ONLY
      software.amazon.awscdk.services.cloudtrail.ReadWriteType.WRITE_ONLY ->
          ReadWriteType.WRITE_ONLY
      software.amazon.awscdk.services.cloudtrail.ReadWriteType.ALL -> ReadWriteType.ALL
      software.amazon.awscdk.services.cloudtrail.ReadWriteType.NONE -> ReadWriteType.NONE
    }

    internal fun unwrap(wrapped: ReadWriteType):
        software.amazon.awscdk.services.cloudtrail.ReadWriteType = wrapped.cdkObject
  }
}
