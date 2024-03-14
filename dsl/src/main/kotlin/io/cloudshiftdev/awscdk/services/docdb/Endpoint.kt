package io.cloudshiftdev.awscdk.services.docdb

import kotlin.Number
import kotlin.String

public open class Endpoint
internal constructor(
    private val cdkObject: software.amazon.awscdk.services.docdb.Endpoint,
) {
    /** The hostname of the endpoint. */
    public open fun hostname(): String = unwrap(this).getHostname()

    /**
     * The port number of the endpoint.
     *
     * This can potentially be a CDK token. If you need to embed the port in a string (e.g. instance
     * user data script), use `Endpoint.portAsString`.
     */
    public open fun port(): Number = unwrap(this).getPort()

    /**
     * Returns the port number as a string representation that can be used for embedding within
     * other strings.
     *
     * This is intended to deal with CDK's token system. Numeric CDK tokens are not expanded when
     * their string representation is embedded in a string. This function returns the port either as
     * an unresolved string token or as a resolved string representation of the port value.
     *
     * @return An (un)resolved string representation of the endpoint's port number
     */
    public open fun portAsString(): String = unwrap(this).portAsString()

    /** The combination of `HOSTNAME:PORT` for this endpoint. */
    public open fun socketAddress(): String = unwrap(this).getSocketAddress()

    public companion object {
        init {}

        internal fun wrap(cdkObject: software.amazon.awscdk.services.docdb.Endpoint): Endpoint =
            Endpoint(cdkObject)

        internal fun unwrap(wrapped: Endpoint): software.amazon.awscdk.services.docdb.Endpoint =
            wrapped.cdkObject
    }
}
