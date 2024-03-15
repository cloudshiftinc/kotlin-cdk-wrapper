@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.apigateway

import io.cloudshiftdev.awscdk.IResource
import io.cloudshiftdev.awscdk.RemovalPolicy
import io.cloudshiftdev.awscdk.ResourceEnvironment
import io.cloudshiftdev.awscdk.Stack
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.constructs.Node
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmName

public interface IStage : IResource {
  public fun addApiKey(arg0: String): IApiKey

  public fun addApiKey(arg0: String, arg1: ApiKeyOptions): IApiKey

  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("2f7ef06bb21f3062b3d57e1e4464d4d9bce5c5321ad41fa8f19d3cd5e9443547")
  public fun addApiKey(arg0: String, arg1: ApiKeyOptions.Builder.() -> Unit): IApiKey

  public fun restApi(): IRestApi

  public fun stageName(): String

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.apigateway.IStage,
  ) : CdkObject(cdkObject), IStage {
    override fun addApiKey(arg0: String): IApiKey = unwrap(this).addApiKey(arg0).let(IApiKey::wrap)

    override fun addApiKey(arg0: String, arg1: ApiKeyOptions): IApiKey =
        unwrap(this).addApiKey(arg0, arg1.let(ApiKeyOptions::unwrap)).let(IApiKey::wrap)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("2f7ef06bb21f3062b3d57e1e4464d4d9bce5c5321ad41fa8f19d3cd5e9443547")
    override fun addApiKey(arg0: String, arg1: ApiKeyOptions.Builder.() -> Unit): IApiKey =
        addApiKey(arg0, ApiKeyOptions(arg1))

    override fun applyRemovalPolicy(arg0: RemovalPolicy) {
      unwrap(this).applyRemovalPolicy(arg0.let(RemovalPolicy::unwrap))
    }

    override fun env(): ResourceEnvironment = unwrap(this).getEnv().let(ResourceEnvironment::wrap)

    override fun node(): Node = unwrap(this).getNode().let(Node::wrap)

    override fun restApi(): IRestApi = unwrap(this).getRestApi().let(IRestApi::wrap)

    override fun stack(): Stack = unwrap(this).getStack().let(Stack::wrap)

    override fun stageName(): String = unwrap(this).getStageName()
  }

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.apigateway.IStage): IStage =
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: IStage): software.amazon.awscdk.services.apigateway.IStage =
        (wrapped as CdkObject).cdkObject as software.amazon.awscdk.services.apigateway.IStage
  }
}