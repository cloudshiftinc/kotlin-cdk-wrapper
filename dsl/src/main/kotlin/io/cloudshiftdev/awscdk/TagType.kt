package io.cloudshiftdev.awscdk

public enum class TagType(
  private val cdkObject: software.amazon.awscdk.TagType,
) {
  STANDARD(software.amazon.awscdk.TagType.STANDARD),
  AUTOSCALING_GROUP(software.amazon.awscdk.TagType.AUTOSCALING_GROUP),
  MAP(software.amazon.awscdk.TagType.MAP),
  KEY_VALUE(software.amazon.awscdk.TagType.KEY_VALUE),
  NOT_TAGGABLE(software.amazon.awscdk.TagType.NOT_TAGGABLE),
  ;

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.TagType): TagType = when (cdkObject) {
      software.amazon.awscdk.TagType.STANDARD -> TagType.STANDARD
      software.amazon.awscdk.TagType.AUTOSCALING_GROUP -> TagType.AUTOSCALING_GROUP
      software.amazon.awscdk.TagType.MAP -> TagType.MAP
      software.amazon.awscdk.TagType.KEY_VALUE -> TagType.KEY_VALUE
      software.amazon.awscdk.TagType.NOT_TAGGABLE -> TagType.NOT_TAGGABLE
    }

    internal fun unwrap(wrapped: TagType): software.amazon.awscdk.TagType = wrapped.cdkObject
  }
}
