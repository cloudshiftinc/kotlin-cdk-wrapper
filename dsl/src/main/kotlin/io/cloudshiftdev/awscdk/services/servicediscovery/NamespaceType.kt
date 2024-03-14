package io.cloudshiftdev.awscdk.services.servicediscovery

public enum class NamespaceType(
  private val cdkObject: software.amazon.awscdk.services.servicediscovery.NamespaceType,
) {
  HTTP(software.amazon.awscdk.services.servicediscovery.NamespaceType.HTTP),
  DNS_PRIVATE(software.amazon.awscdk.services.servicediscovery.NamespaceType.DNS_PRIVATE),
  DNS_PUBLIC(software.amazon.awscdk.services.servicediscovery.NamespaceType.DNS_PUBLIC),
  ;

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.servicediscovery.NamespaceType):
        NamespaceType = when (cdkObject) {
      software.amazon.awscdk.services.servicediscovery.NamespaceType.HTTP -> NamespaceType.HTTP
      software.amazon.awscdk.services.servicediscovery.NamespaceType.DNS_PRIVATE ->
          NamespaceType.DNS_PRIVATE
      software.amazon.awscdk.services.servicediscovery.NamespaceType.DNS_PUBLIC ->
          NamespaceType.DNS_PUBLIC
    }

    internal fun unwrap(wrapped: NamespaceType):
        software.amazon.awscdk.services.servicediscovery.NamespaceType = wrapped.cdkObject
  }
}
