package io.cloudshiftdev.awscdk

public enum class ArnFormat(
    private val cdkObject: software.amazon.awscdk.ArnFormat,
) {
    NO_RESOURCE_NAME(software.amazon.awscdk.ArnFormat.NO_RESOURCE_NAME),
    COLON_RESOURCE_NAME(software.amazon.awscdk.ArnFormat.COLON_RESOURCE_NAME),
    SLASH_RESOURCE_NAME(software.amazon.awscdk.ArnFormat.SLASH_RESOURCE_NAME),
    SLASH_RESOURCE_SLASH_RESOURCE_NAME(
        software.amazon.awscdk.ArnFormat.SLASH_RESOURCE_SLASH_RESOURCE_NAME
    ),
    ;

    public companion object {
        internal fun wrap(cdkObject: software.amazon.awscdk.ArnFormat): ArnFormat =
            when (cdkObject) {
                software.amazon.awscdk.ArnFormat.NO_RESOURCE_NAME -> ArnFormat.NO_RESOURCE_NAME
                software.amazon.awscdk.ArnFormat.COLON_RESOURCE_NAME ->
                    ArnFormat.COLON_RESOURCE_NAME
                software.amazon.awscdk.ArnFormat.SLASH_RESOURCE_NAME ->
                    ArnFormat.SLASH_RESOURCE_NAME
                software.amazon.awscdk.ArnFormat.SLASH_RESOURCE_SLASH_RESOURCE_NAME ->
                    ArnFormat.SLASH_RESOURCE_SLASH_RESOURCE_NAME
            }

        internal fun unwrap(wrapped: ArnFormat): software.amazon.awscdk.ArnFormat =
            wrapped.cdkObject
    }
}
