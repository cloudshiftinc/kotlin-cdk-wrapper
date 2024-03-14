package io.cloudshiftdev.awscdk.services.dynamodb

public enum class StreamViewType(
  private val cdkObject: software.amazon.awscdk.services.dynamodb.StreamViewType,
) {
  NEW_IMAGE(software.amazon.awscdk.services.dynamodb.StreamViewType.NEW_IMAGE),
  OLD_IMAGE(software.amazon.awscdk.services.dynamodb.StreamViewType.OLD_IMAGE),
  NEW_AND_OLD_IMAGES(software.amazon.awscdk.services.dynamodb.StreamViewType.NEW_AND_OLD_IMAGES),
  KEYS_ONLY(software.amazon.awscdk.services.dynamodb.StreamViewType.KEYS_ONLY),
  ;

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.dynamodb.StreamViewType):
        StreamViewType = when (cdkObject) {
      software.amazon.awscdk.services.dynamodb.StreamViewType.NEW_IMAGE -> StreamViewType.NEW_IMAGE
      software.amazon.awscdk.services.dynamodb.StreamViewType.OLD_IMAGE -> StreamViewType.OLD_IMAGE
      software.amazon.awscdk.services.dynamodb.StreamViewType.NEW_AND_OLD_IMAGES ->
          StreamViewType.NEW_AND_OLD_IMAGES
      software.amazon.awscdk.services.dynamodb.StreamViewType.KEYS_ONLY -> StreamViewType.KEYS_ONLY
    }

    internal fun unwrap(wrapped: StreamViewType):
        software.amazon.awscdk.services.dynamodb.StreamViewType = wrapped.cdkObject
  }
}
