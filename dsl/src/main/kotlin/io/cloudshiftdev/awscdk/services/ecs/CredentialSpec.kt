package io.cloudshiftdev.awscdk.services.ecs

import kotlin.String

public open class CredentialSpec
internal constructor(
    private val cdkObject: software.amazon.awscdk.services.ecs.CredentialSpec,
) {
    /** Called when the container is initialized to allow this object to bind to the stack. */
    public open fun bind(): CredentialSpecConfig =
        unwrap(this).bind().let(CredentialSpecConfig::wrap)

    /** Location or ARN from where to retrieve the CredSpec file. */
    public open fun fileLocation(): String = unwrap(this).getFileLocation()

    /** Prefix string based on the type of CredSpec. */
    public open fun prefixId(): String = unwrap(this).getPrefixId()

    public companion object {
        init {}

        internal fun wrap(
            cdkObject: software.amazon.awscdk.services.ecs.CredentialSpec
        ): CredentialSpec = CredentialSpec(cdkObject)

        internal fun unwrap(
            wrapped: CredentialSpec
        ): software.amazon.awscdk.services.ecs.CredentialSpec = wrapped.cdkObject
    }
}
