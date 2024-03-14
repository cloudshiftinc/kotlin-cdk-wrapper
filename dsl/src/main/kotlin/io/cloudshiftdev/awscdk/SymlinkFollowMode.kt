package io.cloudshiftdev.awscdk

public enum class SymlinkFollowMode(
    private val cdkObject: software.amazon.awscdk.SymlinkFollowMode,
) {
    NEVER(software.amazon.awscdk.SymlinkFollowMode.NEVER),
    ALWAYS(software.amazon.awscdk.SymlinkFollowMode.ALWAYS),
    EXTERNAL(software.amazon.awscdk.SymlinkFollowMode.EXTERNAL),
    BLOCK_EXTERNAL(software.amazon.awscdk.SymlinkFollowMode.BLOCK_EXTERNAL),
    ;

    public companion object {
        internal fun wrap(cdkObject: software.amazon.awscdk.SymlinkFollowMode): SymlinkFollowMode =
            when (cdkObject) {
                software.amazon.awscdk.SymlinkFollowMode.NEVER -> SymlinkFollowMode.NEVER
                software.amazon.awscdk.SymlinkFollowMode.ALWAYS -> SymlinkFollowMode.ALWAYS
                software.amazon.awscdk.SymlinkFollowMode.EXTERNAL -> SymlinkFollowMode.EXTERNAL
                software.amazon.awscdk.SymlinkFollowMode.BLOCK_EXTERNAL ->
                    SymlinkFollowMode.BLOCK_EXTERNAL
            }

        internal fun unwrap(wrapped: SymlinkFollowMode): software.amazon.awscdk.SymlinkFollowMode =
            wrapped.cdkObject
    }
}
