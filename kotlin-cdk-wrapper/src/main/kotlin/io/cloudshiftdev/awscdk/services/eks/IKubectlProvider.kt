@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.eks

import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.services.iam.IRole
import io.cloudshiftdev.constructs.IConstruct
import io.cloudshiftdev.constructs.Node
import kotlin.String

public interface IKubectlProvider : IConstruct {
  public fun handlerRole(): IRole

  public fun roleArn(): String

  public fun serviceToken(): String

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.eks.IKubectlProvider,
  ) : CdkObject(cdkObject), IKubectlProvider {
    override fun handlerRole(): IRole = unwrap(this).getHandlerRole().let(IRole::wrap)

    override fun node(): Node = unwrap(this).getNode().let(Node::wrap)

    override fun roleArn(): String = unwrap(this).getRoleArn()

    override fun serviceToken(): String = unwrap(this).getServiceToken()
  }

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.eks.IKubectlProvider):
        IKubectlProvider = Wrapper(cdkObject)

    internal fun unwrap(wrapped: IKubectlProvider):
        software.amazon.awscdk.services.eks.IKubectlProvider = (wrapped as CdkObject).cdkObject as
        software.amazon.awscdk.services.eks.IKubectlProvider
  }
}
