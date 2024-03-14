package io.cloudshiftdev.awscdk.services.apigateway

import io.cloudshiftdev.awscdk.RemovalPolicy
import io.cloudshiftdev.awscdk.ResourceEnvironment
import io.cloudshiftdev.awscdk.Stack
import io.cloudshiftdev.constructs.Node
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName

public interface IResource : io.cloudshiftdev.awscdk.IResource {
  public fun addCorsPreflight(arg0: CorsOptions): Method

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("c9e16d54d77b097f76148268956eb3dad5caf87139623f2131b4e7bdec2a2b0b")
  public fun addCorsPreflight(arg0: CorsOptions.Builder.() -> Unit): Method

  public fun addMethod(arg0: String): Method

  public fun addMethod(arg0: String, arg1: Integration): Method

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("8787b99e9c374ffaac05faacd3953f7d78c9a3fe47bc6f0e47650d9cfcd0b026")
  public fun addMethod(arg0: String, arg1: Integration.Builder.() -> Unit): Method

  public fun addMethod(
    arg0: String,
    arg1: Integration,
    arg2: MethodOptions,
  ): Method

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("678224fda3a86593b90e20fc667cc6cc789d55db060db427dc585e28cd34194f")
  public fun addMethod(
    arg0: String,
    arg1: Integration,
    arg2: MethodOptions.Builder.() -> Unit,
  ): Method

  public fun addProxy(): ProxyResource

  public fun addProxy(arg0: ProxyResourceOptions): ProxyResource

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("e84ad41e5cb5588993b50d4f00b7ff5abf72997c3b967125daa364452463d902")
  public fun addProxy(arg0: ProxyResourceOptions.Builder.() -> Unit): ProxyResource

  public fun addResource(arg0: String): Resource

  public fun addResource(arg0: String, arg1: ResourceOptions): Resource

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("eb83d81205a9facdb81a248cc63a5f2cfa36f56638d8e79cd6decf73a0c14b00")
  public fun addResource(arg0: String, arg1: ResourceOptions.Builder.() -> Unit): Resource

  public fun api(): IRestApi

  public fun defaultCorsPreflightOptions(): CorsOptions? =
      unwrap(this).getDefaultCorsPreflightOptions()?.let(CorsOptions::wrap)

  public fun defaultIntegration(): Integration? =
      unwrap(this).getDefaultIntegration()?.let(Integration::wrap)

  public fun defaultMethodOptions(): MethodOptions? =
      unwrap(this).getDefaultMethodOptions()?.let(MethodOptions::wrap)

  public fun parentResource(): IResource? = unwrap(this).getParentResource()?.let(IResource::wrap)

  public fun path(): String

  public fun resource(arg0: String): IResource?

  public fun resourceForPath(arg0: String): Resource

  public fun resourceId(): String

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.apigateway.IResource,
  ) : IResource {
    override fun addCorsPreflight(arg0: CorsOptions): Method =
        unwrap(this).addCorsPreflight(arg0.let(CorsOptions::unwrap)).let(Method::wrap)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("c9e16d54d77b097f76148268956eb3dad5caf87139623f2131b4e7bdec2a2b0b")
    override fun addCorsPreflight(arg0: CorsOptions.Builder.() -> Unit): Method =
        addCorsPreflight(CorsOptions(arg0))

    override fun addMethod(arg0: String): Method = unwrap(this).addMethod(arg0).let(Method::wrap)

    override fun addMethod(arg0: String, arg1: Integration): Method = unwrap(this).addMethod(arg0,
        arg1.let(Integration::unwrap)).let(Method::wrap)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("8787b99e9c374ffaac05faacd3953f7d78c9a3fe47bc6f0e47650d9cfcd0b026")
    override fun addMethod(arg0: String, arg1: Integration.Builder.() -> Unit): Method =
        addMethod(arg0, Integration(arg1))

    override fun addMethod(
      arg0: String,
      arg1: Integration,
      arg2: MethodOptions,
    ): Method = unwrap(this).addMethod(arg0, arg1.let(Integration::unwrap),
        arg2.let(MethodOptions::unwrap)).let(Method::wrap)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("678224fda3a86593b90e20fc667cc6cc789d55db060db427dc585e28cd34194f")
    override fun addMethod(
      arg0: String,
      arg1: Integration,
      arg2: MethodOptions.Builder.() -> Unit,
    ): Method = addMethod(arg0, arg1, MethodOptions(arg2))

    override fun addProxy(): ProxyResource = unwrap(this).addProxy().let(ProxyResource::wrap)

    override fun addProxy(arg0: ProxyResourceOptions): ProxyResource =
        unwrap(this).addProxy(arg0.let(ProxyResourceOptions::unwrap)).let(ProxyResource::wrap)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("e84ad41e5cb5588993b50d4f00b7ff5abf72997c3b967125daa364452463d902")
    override fun addProxy(arg0: ProxyResourceOptions.Builder.() -> Unit): ProxyResource =
        addProxy(ProxyResourceOptions(arg0))

    override fun addResource(arg0: String): Resource =
        unwrap(this).addResource(arg0).let(Resource::wrap)

    override fun addResource(arg0: String, arg1: ResourceOptions): Resource =
        unwrap(this).addResource(arg0, arg1.let(ResourceOptions::unwrap)).let(Resource::wrap)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("eb83d81205a9facdb81a248cc63a5f2cfa36f56638d8e79cd6decf73a0c14b00")
    override fun addResource(arg0: String, arg1: ResourceOptions.Builder.() -> Unit): Resource =
        addResource(arg0, ResourceOptions(arg1))

    override fun api(): IRestApi = unwrap(this).getApi().let(IRestApi::wrap)

    override fun applyRemovalPolicy(arg0: RemovalPolicy) {
      unwrap(this).applyRemovalPolicy(arg0.let(RemovalPolicy::unwrap))
    }

    override fun defaultCorsPreflightOptions(): CorsOptions? =
        unwrap(this).getDefaultCorsPreflightOptions()?.let(CorsOptions::wrap)

    override fun defaultIntegration(): Integration? =
        unwrap(this).getDefaultIntegration()?.let(Integration::wrap)

    override fun defaultMethodOptions(): MethodOptions? =
        unwrap(this).getDefaultMethodOptions()?.let(MethodOptions::wrap)

    override fun env(): ResourceEnvironment = unwrap(this).getEnv().let(ResourceEnvironment::wrap)

    override fun node(): Node = unwrap(this).getNode().let(Node::wrap)

    override fun parentResource(): IResource? =
        unwrap(this).getParentResource()?.let(IResource::wrap)

    override fun path(): String = unwrap(this).getPath()

    override fun resource(arg0: String): IResource? =
        unwrap(this).getResource(arg0)?.let(IResource::wrap)

    override fun resourceForPath(arg0: String): Resource =
        unwrap(this).resourceForPath(arg0).let(Resource::wrap)

    override fun resourceId(): String = unwrap(this).getResourceId()

    override fun stack(): Stack = unwrap(this).getStack().let(Stack::wrap)
  }

  public companion object {
    init {

    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.apigateway.IResource): IResource =
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: IResource): software.amazon.awscdk.services.apigateway.IResource =
        (wrapped as Wrapper).cdkObject
  }
}
