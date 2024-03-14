package io.cloudshiftdev.awscdk.services.apigatewayv2

import io.cloudshiftdev.awscdk.RemovalPolicy
import io.cloudshiftdev.awscdk.ResourceEnvironment
import io.cloudshiftdev.awscdk.Stack
import io.cloudshiftdev.awscdk.services.iam.Grant
import io.cloudshiftdev.awscdk.services.iam.IGrantable
import io.cloudshiftdev.constructs.Node
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName

public interface IHttpRoute : IRoute {
  public fun grantInvoke(arg0: IGrantable): Grant

  public fun grantInvoke(arg0: IGrantable, arg1: GrantInvokeOptions): Grant

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("412779fe515aba89b3c88de8dca006d0a8d413686405d41ff168250ac6c8b73c")
  public fun grantInvoke(arg0: IGrantable, arg1: GrantInvokeOptions.Builder.() -> Unit): Grant

  public fun httpApi(): IHttpApi

  public fun path(): String? = unwrap(this).getPath()

  public fun routeArn(): String

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.apigatewayv2.IHttpRoute,
  ) : IHttpRoute {
    override fun applyRemovalPolicy(arg0: RemovalPolicy) {
      unwrap(this).applyRemovalPolicy(arg0.let(RemovalPolicy::unwrap))
    }

    override fun env(): ResourceEnvironment = unwrap(this).getEnv().let(ResourceEnvironment::wrap)

    override fun grantInvoke(arg0: IGrantable): Grant =
        unwrap(this).grantInvoke(arg0.let(IGrantable::unwrap)).let(Grant::wrap)

    override fun grantInvoke(arg0: IGrantable, arg1: GrantInvokeOptions): Grant =
        unwrap(this).grantInvoke(arg0.let(IGrantable::unwrap),
        arg1.let(GrantInvokeOptions::unwrap)).let(Grant::wrap)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("412779fe515aba89b3c88de8dca006d0a8d413686405d41ff168250ac6c8b73c")
    override fun grantInvoke(arg0: IGrantable, arg1: GrantInvokeOptions.Builder.() -> Unit): Grant =
        grantInvoke(arg0, GrantInvokeOptions(arg1))

    override fun httpApi(): IHttpApi = unwrap(this).getHttpApi().let(IHttpApi::wrap)

    override fun node(): Node = unwrap(this).getNode().let(Node::wrap)

    override fun path(): String? = unwrap(this).getPath()

    override fun routeArn(): String = unwrap(this).getRouteArn()

    override fun routeId(): String = unwrap(this).getRouteId()

    override fun stack(): Stack = unwrap(this).getStack().let(Stack::wrap)
  }

  public companion object {
    init {

    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.apigatewayv2.IHttpRoute):
        IHttpRoute = Wrapper(cdkObject)

    internal fun unwrap(wrapped: IHttpRoute):
        software.amazon.awscdk.services.apigatewayv2.IHttpRoute = (wrapped as Wrapper).cdkObject
  }
}
