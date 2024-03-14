package io.cloudshiftdev.awscdk.pipelines

public enum class DockerCredentialUsage(
    private val cdkObject: software.amazon.awscdk.pipelines.DockerCredentialUsage,
) {
    SYNTH(software.amazon.awscdk.pipelines.DockerCredentialUsage.SYNTH),
    SELF_UPDATE(software.amazon.awscdk.pipelines.DockerCredentialUsage.SELF_UPDATE),
    ASSET_PUBLISHING(software.amazon.awscdk.pipelines.DockerCredentialUsage.ASSET_PUBLISHING),
    ;

    public companion object {
        internal fun wrap(
            cdkObject: software.amazon.awscdk.pipelines.DockerCredentialUsage
        ): DockerCredentialUsage =
            when (cdkObject) {
                software.amazon.awscdk.pipelines.DockerCredentialUsage.SYNTH ->
                    DockerCredentialUsage.SYNTH
                software.amazon.awscdk.pipelines.DockerCredentialUsage.SELF_UPDATE ->
                    DockerCredentialUsage.SELF_UPDATE
                software.amazon.awscdk.pipelines.DockerCredentialUsage.ASSET_PUBLISHING ->
                    DockerCredentialUsage.ASSET_PUBLISHING
            }

        internal fun unwrap(
            wrapped: DockerCredentialUsage
        ): software.amazon.awscdk.pipelines.DockerCredentialUsage = wrapped.cdkObject
    }
}
