package io.cloudshiftdev.awscdk.services.ses

import io.cloudshiftdev.awscdk.IResource
import io.cloudshiftdev.awscdk.RemovalPolicy
import io.cloudshiftdev.awscdk.ResourceEnvironment
import io.cloudshiftdev.awscdk.Stack
import io.cloudshiftdev.awscdk.services.iam.Grant
import io.cloudshiftdev.awscdk.services.iam.IGrantable
import io.cloudshiftdev.constructs.Node
import kotlin.String

public interface IEmailIdentity : IResource {
  public fun emailIdentityArn(): String

  public fun emailIdentityName(): String

  public fun grant(arg0: IGrantable, arg1: String): Grant

  public fun grantSendEmail(arg0: IGrantable): Grant

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.ses.IEmailIdentity,
  ) : IEmailIdentity {
    public override fun applyRemovalPolicy(arg0: RemovalPolicy) {
      unwrap(this).applyRemovalPolicy(arg0.let(RemovalPolicy::unwrap))
    }

    public override fun emailIdentityArn(): String = unwrap(this).getEmailIdentityArn()

    public override fun emailIdentityName(): String = unwrap(this).getEmailIdentityName()

    public override fun env(): ResourceEnvironment =
        unwrap(this).getEnv().let(ResourceEnvironment::wrap)

    public override fun grant(arg0: IGrantable, arg1: String): Grant =
        unwrap(this).grant(arg0.let(IGrantable::unwrap), arg1).let(Grant::wrap)

    public override fun grantSendEmail(arg0: IGrantable): Grant =
        unwrap(this).grantSendEmail(arg0.let(IGrantable::unwrap)).let(Grant::wrap)

    public override fun node(): Node = unwrap(this).getNode().let(Node::wrap)

    public override fun stack(): Stack = unwrap(this).getStack().let(Stack::wrap)
  }

  public companion object {
    init {

    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ses.IEmailIdentity): IEmailIdentity
        = Wrapper(cdkObject)

    internal fun unwrap(wrapped: IEmailIdentity): software.amazon.awscdk.services.ses.IEmailIdentity
        = (wrapped as Wrapper).cdkObject
  }
}
