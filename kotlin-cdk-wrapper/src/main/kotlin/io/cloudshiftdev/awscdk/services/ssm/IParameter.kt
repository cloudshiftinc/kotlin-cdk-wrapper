@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ssm

import io.cloudshiftdev.awscdk.IResource
import io.cloudshiftdev.awscdk.RemovalPolicy
import io.cloudshiftdev.awscdk.ResourceEnvironment
import io.cloudshiftdev.awscdk.Stack
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.services.iam.Grant
import io.cloudshiftdev.awscdk.services.iam.IGrantable
import io.cloudshiftdev.constructs.Node
import kotlin.String

public interface IParameter : IResource {
  public fun grantRead(arg0: IGrantable): Grant

  public fun grantWrite(arg0: IGrantable): Grant

  public fun parameterArn(): String

  public fun parameterName(): String

  public fun parameterType(): String

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.ssm.IParameter,
  ) : CdkObject(cdkObject), IParameter {
    override fun applyRemovalPolicy(arg0: RemovalPolicy) {
      unwrap(this).applyRemovalPolicy(arg0.let(RemovalPolicy::unwrap))
    }

    override fun env(): ResourceEnvironment = unwrap(this).getEnv().let(ResourceEnvironment::wrap)

    override fun grantRead(arg0: IGrantable): Grant =
        unwrap(this).grantRead(arg0.let(IGrantable::unwrap)).let(Grant::wrap)

    override fun grantWrite(arg0: IGrantable): Grant =
        unwrap(this).grantWrite(arg0.let(IGrantable::unwrap)).let(Grant::wrap)

    override fun node(): Node = unwrap(this).getNode().let(Node::wrap)

    override fun parameterArn(): String = unwrap(this).getParameterArn()

    override fun parameterName(): String = unwrap(this).getParameterName()

    override fun parameterType(): String = unwrap(this).getParameterType()

    override fun stack(): Stack = unwrap(this).getStack().let(Stack::wrap)
  }

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.ssm.IParameter): IParameter =
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: IParameter): software.amazon.awscdk.services.ssm.IParameter =
        (wrapped as CdkObject).cdkObject as software.amazon.awscdk.services.ssm.IParameter
  }
}
