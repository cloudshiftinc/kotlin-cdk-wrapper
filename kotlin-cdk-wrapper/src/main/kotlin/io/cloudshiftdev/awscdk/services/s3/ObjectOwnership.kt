@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.s3

public enum class ObjectOwnership(
  private val cdkObject: software.amazon.awscdk.services.s3.ObjectOwnership,
) {
  BUCKET_OWNER_ENFORCED(software.amazon.awscdk.services.s3.ObjectOwnership.BUCKET_OWNER_ENFORCED),
  BUCKET_OWNER_PREFERRED(software.amazon.awscdk.services.s3.ObjectOwnership.BUCKET_OWNER_PREFERRED),
  OBJECT_WRITER(software.amazon.awscdk.services.s3.ObjectOwnership.OBJECT_WRITER),
  ;

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.s3.ObjectOwnership):
        ObjectOwnership = when (cdkObject) {
      software.amazon.awscdk.services.s3.ObjectOwnership.BUCKET_OWNER_ENFORCED ->
          ObjectOwnership.BUCKET_OWNER_ENFORCED
      software.amazon.awscdk.services.s3.ObjectOwnership.BUCKET_OWNER_PREFERRED ->
          ObjectOwnership.BUCKET_OWNER_PREFERRED
      software.amazon.awscdk.services.s3.ObjectOwnership.OBJECT_WRITER ->
          ObjectOwnership.OBJECT_WRITER
    }

    internal fun unwrap(wrapped: ObjectOwnership):
        software.amazon.awscdk.services.s3.ObjectOwnership = wrapped.cdkObject
  }
}
