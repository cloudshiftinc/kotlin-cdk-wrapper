package io.cloudshiftdev.awscdk.services.ecr

public enum class TagStatus(
    private val cdkObject: software.amazon.awscdk.services.ecr.TagStatus,
) {
    ANY(software.amazon.awscdk.services.ecr.TagStatus.ANY),
    TAGGED(software.amazon.awscdk.services.ecr.TagStatus.TAGGED),
    UNTAGGED(software.amazon.awscdk.services.ecr.TagStatus.UNTAGGED),
    ;

    public companion object {
        internal fun wrap(cdkObject: software.amazon.awscdk.services.ecr.TagStatus): TagStatus =
            when (cdkObject) {
                software.amazon.awscdk.services.ecr.TagStatus.ANY -> TagStatus.ANY
                software.amazon.awscdk.services.ecr.TagStatus.TAGGED -> TagStatus.TAGGED
                software.amazon.awscdk.services.ecr.TagStatus.UNTAGGED -> TagStatus.UNTAGGED
            }

        internal fun unwrap(wrapped: TagStatus): software.amazon.awscdk.services.ecr.TagStatus =
            wrapped.cdkObject
    }
}
