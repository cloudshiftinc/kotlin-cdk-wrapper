package io.cloudshiftdev.awscdk.services.apigateway

import io.cloudshiftdev.awscdk.RemovalPolicy
import io.cloudshiftdev.awscdk.ResourceEnvironment
import io.cloudshiftdev.awscdk.Stack
import io.cloudshiftdev.constructs.Node
import kotlin.String

public interface IRestApi : io.cloudshiftdev.awscdk.IResource {
  public fun arnForExecuteApi(): String

  public fun arnForExecuteApi(arg0: String): String

  public fun arnForExecuteApi(arg0: String, arg1: String): String

  public fun arnForExecuteApi(
    arg0: String,
    arg1: String,
    arg2: String,
  ): String

  public fun deploymentStage(): Stage

  public fun deploymentStage(arg0: Stage)

  public fun latestDeployment(): Deployment? =
      unwrap(this).getLatestDeployment()?.let(Deployment::wrap)

  public fun restApiId(): String

  public fun restApiName(): String

  public fun restApiRootResourceId(): String

  public fun root(): IResource

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.apigateway.IRestApi,
  ) : IRestApi {
    override fun applyRemovalPolicy(arg0: RemovalPolicy) {
      unwrap(this).applyRemovalPolicy(arg0.let(RemovalPolicy::unwrap))
    }

    override fun arnForExecuteApi(): String = unwrap(this).arnForExecuteApi()

    override fun arnForExecuteApi(arg0: String): String = unwrap(this).arnForExecuteApi(arg0)

    override fun arnForExecuteApi(arg0: String, arg1: String): String =
        unwrap(this).arnForExecuteApi(arg0, arg1)

    override fun arnForExecuteApi(
      arg0: String,
      arg1: String,
      arg2: String,
    ): String = unwrap(this).arnForExecuteApi(arg0, arg1, arg2)

    override fun deploymentStage(): Stage = unwrap(this).getDeploymentStage().let(Stage::wrap)

    override fun deploymentStage(arg0: Stage) {
      unwrap(this).setDeploymentStage(arg0.let(Stage::unwrap))
    }

    override fun env(): ResourceEnvironment = unwrap(this).getEnv().let(ResourceEnvironment::wrap)

    override fun latestDeployment(): Deployment? =
        unwrap(this).getLatestDeployment()?.let(Deployment::wrap)

    override fun node(): Node = unwrap(this).getNode().let(Node::wrap)

    override fun restApiId(): String = unwrap(this).getRestApiId()

    override fun restApiName(): String = unwrap(this).getRestApiName()

    override fun restApiRootResourceId(): String = unwrap(this).getRestApiRootResourceId()

    override fun root(): IResource = unwrap(this).getRoot().let(IResource::wrap)

    override fun stack(): Stack = unwrap(this).getStack().let(Stack::wrap)
  }

  public companion object {
    init {

    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.apigateway.IRestApi): IRestApi =
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: IRestApi): software.amazon.awscdk.services.apigateway.IRestApi =
        (wrapped as Wrapper).cdkObject
  }
}
