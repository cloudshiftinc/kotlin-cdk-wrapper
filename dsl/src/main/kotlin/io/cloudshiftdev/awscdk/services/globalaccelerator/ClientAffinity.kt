package io.cloudshiftdev.awscdk.services.globalaccelerator

public enum class ClientAffinity(
    private val cdkObject: software.amazon.awscdk.services.globalaccelerator.ClientAffinity,
) {
    NONE(software.amazon.awscdk.services.globalaccelerator.ClientAffinity.NONE),
    SOURCE_IP(software.amazon.awscdk.services.globalaccelerator.ClientAffinity.SOURCE_IP),
    ;

    public companion object {
        internal fun wrap(
            cdkObject: software.amazon.awscdk.services.globalaccelerator.ClientAffinity
        ): ClientAffinity =
            when (cdkObject) {
                software.amazon.awscdk.services.globalaccelerator.ClientAffinity.NONE ->
                    ClientAffinity.NONE
                software.amazon.awscdk.services.globalaccelerator.ClientAffinity.SOURCE_IP ->
                    ClientAffinity.SOURCE_IP
            }

        internal fun unwrap(
            wrapped: ClientAffinity
        ): software.amazon.awscdk.services.globalaccelerator.ClientAffinity = wrapped.cdkObject
    }
}
