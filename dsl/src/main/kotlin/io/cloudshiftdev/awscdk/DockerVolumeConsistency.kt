package io.cloudshiftdev.awscdk

public enum class DockerVolumeConsistency(
    private val cdkObject: software.amazon.awscdk.DockerVolumeConsistency,
) {
    CONSISTENT(software.amazon.awscdk.DockerVolumeConsistency.CONSISTENT),
    DELEGATED(software.amazon.awscdk.DockerVolumeConsistency.DELEGATED),
    CACHED(software.amazon.awscdk.DockerVolumeConsistency.CACHED),
    ;

    public companion object {
        internal fun wrap(
            cdkObject: software.amazon.awscdk.DockerVolumeConsistency
        ): DockerVolumeConsistency =
            when (cdkObject) {
                software.amazon.awscdk.DockerVolumeConsistency.CONSISTENT ->
                    DockerVolumeConsistency.CONSISTENT
                software.amazon.awscdk.DockerVolumeConsistency.DELEGATED ->
                    DockerVolumeConsistency.DELEGATED
                software.amazon.awscdk.DockerVolumeConsistency.CACHED ->
                    DockerVolumeConsistency.CACHED
            }

        internal fun unwrap(
            wrapped: DockerVolumeConsistency
        ): software.amazon.awscdk.DockerVolumeConsistency = wrapped.cdkObject
    }
}
