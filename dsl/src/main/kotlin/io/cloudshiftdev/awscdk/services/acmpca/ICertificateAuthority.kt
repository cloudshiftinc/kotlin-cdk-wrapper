package io.cloudshiftdev.awscdk.services.acmpca

import io.cloudshiftdev.awscdk.IResource
import io.cloudshiftdev.awscdk.RemovalPolicy
import io.cloudshiftdev.awscdk.ResourceEnvironment
import io.cloudshiftdev.awscdk.Stack
import io.cloudshiftdev.constructs.Node
import kotlin.String

public interface ICertificateAuthority : IResource {
  public fun certificateAuthorityArn(): String

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.acmpca.ICertificateAuthority,
  ) : ICertificateAuthority {
    public override fun applyRemovalPolicy(arg0: RemovalPolicy) {
      unwrap(this).applyRemovalPolicy(arg0.let(RemovalPolicy::unwrap))
    }

    public override fun certificateAuthorityArn(): String =
        unwrap(this).getCertificateAuthorityArn()

    public override fun env(): ResourceEnvironment =
        unwrap(this).getEnv().let(ResourceEnvironment::wrap)

    public override fun node(): Node = unwrap(this).getNode().let(Node::wrap)

    public override fun stack(): Stack = unwrap(this).getStack().let(Stack::wrap)
  }

  public companion object {
    init {

    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.acmpca.ICertificateAuthority):
        ICertificateAuthority = Wrapper(cdkObject)

    internal fun unwrap(wrapped: ICertificateAuthority):
        software.amazon.awscdk.services.acmpca.ICertificateAuthority = (wrapped as
        Wrapper).cdkObject
  }
}
