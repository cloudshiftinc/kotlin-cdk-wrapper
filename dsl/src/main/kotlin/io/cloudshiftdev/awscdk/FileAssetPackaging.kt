package io.cloudshiftdev.awscdk

public enum class FileAssetPackaging(
    private val cdkObject: software.amazon.awscdk.FileAssetPackaging,
) {
    ZIP_DIRECTORY(software.amazon.awscdk.FileAssetPackaging.ZIP_DIRECTORY),
    FILE(software.amazon.awscdk.FileAssetPackaging.FILE),
    ;

    public companion object {
        internal fun wrap(
            cdkObject: software.amazon.awscdk.FileAssetPackaging
        ): FileAssetPackaging =
            when (cdkObject) {
                software.amazon.awscdk.FileAssetPackaging.ZIP_DIRECTORY ->
                    FileAssetPackaging.ZIP_DIRECTORY
                software.amazon.awscdk.FileAssetPackaging.FILE -> FileAssetPackaging.FILE
            }

        internal fun unwrap(
            wrapped: FileAssetPackaging
        ): software.amazon.awscdk.FileAssetPackaging = wrapped.cdkObject
    }
}
