package io.cloudshiftdev.awscdk.services.ec2

import io.cloudshiftdev.awscdk.CdkObject
import io.cloudshiftdev.awscdk.services.iam.ISamlProvider
import kotlin.Any
import kotlin.String

public abstract class ClientVpnUserBasedAuthentication internal constructor(
  internal override val cdkObject:
      software.amazon.awscdk.services.ec2.ClientVpnUserBasedAuthentication,
) : CdkObject(cdkObject) {
  /**
   * Renders the user based authentication.
   */
  public open fun render(): Any = unwrap(this).render()

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.ec2.ClientVpnUserBasedAuthentication,
  ) : ClientVpnUserBasedAuthentication(cdkObject)

  public companion object {
    public fun activeDirectory(directoryId: String): ClientVpnUserBasedAuthentication =
        software.amazon.awscdk.services.ec2.ClientVpnUserBasedAuthentication.activeDirectory(directoryId).let(ClientVpnUserBasedAuthentication::wrap)

    public fun federated(samlProvider: ISamlProvider): ClientVpnUserBasedAuthentication =
        software.amazon.awscdk.services.ec2.ClientVpnUserBasedAuthentication.federated(samlProvider.let(ISamlProvider::unwrap)).let(ClientVpnUserBasedAuthentication::wrap)

    public fun federated(samlProvider: ISamlProvider, selfServiceSamlProvider: ISamlProvider):
        ClientVpnUserBasedAuthentication =
        software.amazon.awscdk.services.ec2.ClientVpnUserBasedAuthentication.federated(samlProvider.let(ISamlProvider::unwrap),
        selfServiceSamlProvider.let(ISamlProvider::unwrap)).let(ClientVpnUserBasedAuthentication::wrap)

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.ec2.ClientVpnUserBasedAuthentication):
        ClientVpnUserBasedAuthentication = Wrapper(cdkObject)

    internal fun unwrap(wrapped: ClientVpnUserBasedAuthentication):
        software.amazon.awscdk.services.ec2.ClientVpnUserBasedAuthentication = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.ec2.ClientVpnUserBasedAuthentication
  }
}