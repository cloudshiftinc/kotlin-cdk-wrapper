package io.cloudshiftdev.awscdk.services.apigateway

import io.cloudshiftdev.awscdk.IResource
import io.cloudshiftdev.awscdk.RemovalPolicy
import io.cloudshiftdev.awscdk.ResourceEnvironment
import io.cloudshiftdev.awscdk.Stack
import io.cloudshiftdev.constructs.Node
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName

public interface IUsagePlan : IResource {
  public fun addApiKey(arg0: IApiKey)

  public fun addApiKey(arg0: IApiKey, arg1: AddApiKeyOptions)

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("4f5ef86a87be3209ae0cbdb48ee812520d7927d679407f259483e5c3856b59ac")
  public fun addApiKey(arg0: IApiKey, arg1: AddApiKeyOptions.Builder.() -> Unit)

  public fun usagePlanId(): String

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.apigateway.IUsagePlan,
  ) : IUsagePlan {
    override fun addApiKey(arg0: IApiKey) {
      unwrap(this).addApiKey(arg0.let(IApiKey::unwrap))
    }

    override fun addApiKey(arg0: IApiKey, arg1: AddApiKeyOptions) {
      unwrap(this).addApiKey(arg0.let(IApiKey::unwrap), arg1.let(AddApiKeyOptions::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("4f5ef86a87be3209ae0cbdb48ee812520d7927d679407f259483e5c3856b59ac")
    override fun addApiKey(arg0: IApiKey, arg1: AddApiKeyOptions.Builder.() -> Unit): Unit =
        addApiKey(arg0, AddApiKeyOptions(arg1))

    override fun applyRemovalPolicy(arg0: RemovalPolicy) {
      unwrap(this).applyRemovalPolicy(arg0.let(RemovalPolicy::unwrap))
    }

    override fun env(): ResourceEnvironment = unwrap(this).getEnv().let(ResourceEnvironment::wrap)

    override fun node(): Node = unwrap(this).getNode().let(Node::wrap)

    override fun stack(): Stack = unwrap(this).getStack().let(Stack::wrap)

    override fun usagePlanId(): String = unwrap(this).getUsagePlanId()
  }

  public companion object {
    init {

    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.apigateway.IUsagePlan): IUsagePlan
        = Wrapper(cdkObject)

    internal fun unwrap(wrapped: IUsagePlan): software.amazon.awscdk.services.apigateway.IUsagePlan
        = (wrapped as Wrapper).cdkObject
  }
}
