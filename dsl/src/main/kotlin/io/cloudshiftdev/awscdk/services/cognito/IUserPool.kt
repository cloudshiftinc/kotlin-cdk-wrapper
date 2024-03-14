package io.cloudshiftdev.awscdk.services.cognito

import io.cloudshiftdev.awscdk.IResource
import io.cloudshiftdev.awscdk.RemovalPolicy
import io.cloudshiftdev.awscdk.ResourceEnvironment
import io.cloudshiftdev.awscdk.Stack
import io.cloudshiftdev.awscdk.services.iam.Grant
import io.cloudshiftdev.awscdk.services.iam.IGrantable
import io.cloudshiftdev.constructs.Node
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

public interface IUserPool : IResource {
  public fun addClient(arg0: String): UserPoolClient

  public fun addClient(arg0: String, arg1: UserPoolClientOptions): UserPoolClient

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("42297806aa541d85041ea1bc4cf76108cb351b2d246367abc20a34d17396503d")
  public fun addClient(arg0: String, arg1: UserPoolClientOptions.Builder.() -> Unit): UserPoolClient

  public fun addDomain(arg0: String, arg1: UserPoolDomainOptions): UserPoolDomain

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("8ec5f0dfd81190c1f527b75d6573c8eecb7722a4724cfee3c560b8e67d4e8e51")
  public fun addDomain(arg0: String, arg1: UserPoolDomainOptions.Builder.() -> Unit): UserPoolDomain

  public fun addResourceServer(arg0: String, arg1: UserPoolResourceServerOptions):
      UserPoolResourceServer

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("c0131bb696cddea8896fb678ee26b29332262cbb25eaa0573fe05069a3b0d28d")
  public fun addResourceServer(arg0: String,
      arg1: UserPoolResourceServerOptions.Builder.() -> Unit): UserPoolResourceServer

  public fun grant(arg0: IGrantable, arg1: String): Grant

  public fun identityProviders(): List<IUserPoolIdentityProvider>

  public fun registerIdentityProvider(arg0: IUserPoolIdentityProvider)

  public fun userPoolArn(): String

  public fun userPoolId(): String

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.cognito.IUserPool,
  ) : IUserPool {
    public override fun addClient(arg0: String): UserPoolClient =
        unwrap(this).addClient(arg0).let(UserPoolClient::wrap)

    public override fun addClient(arg0: String, arg1: UserPoolClientOptions): UserPoolClient =
        unwrap(this).addClient(arg0,
        arg1.let(UserPoolClientOptions::unwrap)).let(UserPoolClient::wrap)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("42297806aa541d85041ea1bc4cf76108cb351b2d246367abc20a34d17396503d")
    public override fun addClient(arg0: String, arg1: UserPoolClientOptions.Builder.() -> Unit):
        UserPoolClient = addClient(arg0, UserPoolClientOptions(arg1))

    public override fun addDomain(arg0: String, arg1: UserPoolDomainOptions): UserPoolDomain =
        unwrap(this).addDomain(arg0,
        arg1.let(UserPoolDomainOptions::unwrap)).let(UserPoolDomain::wrap)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("8ec5f0dfd81190c1f527b75d6573c8eecb7722a4724cfee3c560b8e67d4e8e51")
    public override fun addDomain(arg0: String, arg1: UserPoolDomainOptions.Builder.() -> Unit):
        UserPoolDomain = addDomain(arg0, UserPoolDomainOptions(arg1))

    public override fun addResourceServer(arg0: String, arg1: UserPoolResourceServerOptions):
        UserPoolResourceServer = unwrap(this).addResourceServer(arg0,
        arg1.let(UserPoolResourceServerOptions::unwrap)).let(UserPoolResourceServer::wrap)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("c0131bb696cddea8896fb678ee26b29332262cbb25eaa0573fe05069a3b0d28d")
    public override fun addResourceServer(arg0: String,
        arg1: UserPoolResourceServerOptions.Builder.() -> Unit): UserPoolResourceServer =
        addResourceServer(arg0, UserPoolResourceServerOptions(arg1))

    public override fun applyRemovalPolicy(arg0: RemovalPolicy) {
      unwrap(this).applyRemovalPolicy(arg0.let(RemovalPolicy::unwrap))
    }

    public override fun env(): ResourceEnvironment =
        unwrap(this).getEnv().let(ResourceEnvironment::wrap)

    public override fun grant(arg0: IGrantable, arg1: String): Grant =
        unwrap(this).grant(arg0.let(IGrantable::unwrap), arg1).let(Grant::wrap)

    public override fun identityProviders(): List<IUserPoolIdentityProvider> =
        unwrap(this).getIdentityProviders().map(IUserPoolIdentityProvider::wrap)

    public override fun node(): Node = unwrap(this).getNode().let(Node::wrap)

    public override fun registerIdentityProvider(arg0: IUserPoolIdentityProvider) {
      unwrap(this).registerIdentityProvider(arg0.let(IUserPoolIdentityProvider::unwrap))
    }

    public override fun stack(): Stack = unwrap(this).getStack().let(Stack::wrap)

    public override fun userPoolArn(): String = unwrap(this).getUserPoolArn()

    public override fun userPoolId(): String = unwrap(this).getUserPoolId()
  }

  public companion object {
    init {

    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.cognito.IUserPool): IUserPool =
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: IUserPool): software.amazon.awscdk.services.cognito.IUserPool =
        (wrapped as Wrapper).cdkObject
  }
}
