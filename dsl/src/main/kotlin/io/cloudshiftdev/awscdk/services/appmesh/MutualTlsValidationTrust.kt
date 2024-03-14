package io.cloudshiftdev.awscdk.services.appmesh

public abstract class MutualTlsValidationTrust internal constructor(
  private val cdkObject: software.amazon.awscdk.services.appmesh.MutualTlsValidationTrust,
) : TlsValidationTrust(cdkObject) {
  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.appmesh.MutualTlsValidationTrust,
  ) : MutualTlsValidationTrust(cdkObject)

  public companion object {
    init {

    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.appmesh.MutualTlsValidationTrust):
        MutualTlsValidationTrust = Wrapper(cdkObject)

    internal fun unwrap(wrapped: MutualTlsValidationTrust):
        software.amazon.awscdk.services.appmesh.MutualTlsValidationTrust = (wrapped as
        Wrapper).cdkObject
  }
}
