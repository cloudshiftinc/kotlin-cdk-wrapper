package io.cloudshiftdev.awscdk.services.appconfig

import io.cloudshiftdev.awscdk.services.iam.PolicyDocument
import kotlin.String

public interface IEventDestination {
    /** The URI of the extension event destination. */
    public fun extensionUri(): String

    /** The IAM policy document to invoke the event destination. */
    public fun policyDocument(): PolicyDocument? =
        unwrap(this).getPolicyDocument()?.let(PolicyDocument::wrap)

    /** The type of the extension event destination. */
    public fun type(): SourceType

    private class Wrapper
    internal constructor(
        internal val cdkObject: software.amazon.awscdk.services.appconfig.IEventDestination,
    ) : IEventDestination {
        /** The URI of the extension event destination. */
        override fun extensionUri(): String = unwrap(this).getExtensionUri()

        /** The IAM policy document to invoke the event destination. */
        override fun policyDocument(): PolicyDocument? =
            unwrap(this).getPolicyDocument()?.let(PolicyDocument::wrap)

        /** The type of the extension event destination. */
        override fun type(): SourceType = unwrap(this).getType().let(SourceType::wrap)
    }

    public companion object {
        init {}

        internal fun wrap(
            cdkObject: software.amazon.awscdk.services.appconfig.IEventDestination
        ): IEventDestination = Wrapper(cdkObject)

        internal fun unwrap(
            wrapped: IEventDestination
        ): software.amazon.awscdk.services.appconfig.IEventDestination =
            (wrapped as Wrapper).cdkObject
    }
}
