@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.acmpca

import io.cloudshiftdev.awscdk.IResource
import io.cloudshiftdev.awscdk.RemovalPolicy
import io.cloudshiftdev.awscdk.ResourceEnvironment
import io.cloudshiftdev.awscdk.Stack
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.constructs.Node
import kotlin.String

public interface ICertificateAuthority : IResource {
  public fun certificateAuthorityArn(): String

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.acmpca.ICertificateAuthority,
  ) : CdkObject(cdkObject), ICertificateAuthority {
    override fun applyRemovalPolicy(arg0: RemovalPolicy) {
      unwrap(this).applyRemovalPolicy(arg0.let(RemovalPolicy::unwrap))
    }

    override fun certificateAuthorityArn(): String = unwrap(this).getCertificateAuthorityArn()

    override fun env(): ResourceEnvironment = unwrap(this).getEnv().let(ResourceEnvironment::wrap)

    override fun node(): Node = unwrap(this).getNode().let(Node::wrap)

    override fun stack(): Stack = unwrap(this).getStack().let(Stack::wrap)
  }

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.acmpca.ICertificateAuthority):
        ICertificateAuthority = Wrapper(cdkObject)

    internal fun unwrap(wrapped: ICertificateAuthority):
        software.amazon.awscdk.services.acmpca.ICertificateAuthority = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.acmpca.ICertificateAuthority
  }
}
