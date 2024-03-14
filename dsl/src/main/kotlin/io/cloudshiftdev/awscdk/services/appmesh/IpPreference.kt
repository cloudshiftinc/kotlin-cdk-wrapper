package io.cloudshiftdev.awscdk.services.appmesh

public enum class IpPreference(
  private val cdkObject: software.amazon.awscdk.services.appmesh.IpPreference,
) {
  IPV4_ONLY(software.amazon.awscdk.services.appmesh.IpPreference.IPV4_ONLY),
  IPV4_PREFERRED(software.amazon.awscdk.services.appmesh.IpPreference.IPV4_PREFERRED),
  IPV6_ONLY(software.amazon.awscdk.services.appmesh.IpPreference.IPV6_ONLY),
  IPV6_PREFERRED(software.amazon.awscdk.services.appmesh.IpPreference.IPV6_PREFERRED),
  ;

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.appmesh.IpPreference): IpPreference
        = when (cdkObject) {
      software.amazon.awscdk.services.appmesh.IpPreference.IPV4_ONLY -> IpPreference.IPV4_ONLY
      software.amazon.awscdk.services.appmesh.IpPreference.IPV4_PREFERRED ->
          IpPreference.IPV4_PREFERRED
      software.amazon.awscdk.services.appmesh.IpPreference.IPV6_ONLY -> IpPreference.IPV6_ONLY
      software.amazon.awscdk.services.appmesh.IpPreference.IPV6_PREFERRED ->
          IpPreference.IPV6_PREFERRED
    }

    internal fun unwrap(wrapped: IpPreference): software.amazon.awscdk.services.appmesh.IpPreference
        = wrapped.cdkObject
  }
}
