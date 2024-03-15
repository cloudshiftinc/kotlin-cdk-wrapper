@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.apigateway

import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmName

public abstract class ResourceBase internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.apigateway.ResourceBase,
) : io.cloudshiftdev.awscdk.Resource(cdkObject), IResource {
  public override fun addCorsPreflight(options: CorsOptions): Method =
      unwrap(this).addCorsPreflight(options.let(CorsOptions::unwrap)).let(Method::wrap)

  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("c9e16d54d77b097f76148268956eb3dad5caf87139623f2131b4e7bdec2a2b0b")
  public override fun addCorsPreflight(options: CorsOptions.Builder.() -> Unit): Method =
      addCorsPreflight(CorsOptions(options))

  public override fun addMethod(httpMethod: String): Method =
      unwrap(this).addMethod(httpMethod).let(Method::wrap)

  public override fun addMethod(httpMethod: String, integration: Integration): Method =
      unwrap(this).addMethod(httpMethod, integration.let(Integration::unwrap)).let(Method::wrap)

  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("8787b99e9c374ffaac05faacd3953f7d78c9a3fe47bc6f0e47650d9cfcd0b026")
  public override fun addMethod(httpMethod: String, integration: Integration.Builder.() -> Unit):
      Method = addMethod(httpMethod, Integration(integration))

  public override fun addMethod(
    httpMethod: String,
    integration: Integration,
    options: MethodOptions,
  ): Method = unwrap(this).addMethod(httpMethod, integration.let(Integration::unwrap),
      options.let(MethodOptions::unwrap)).let(Method::wrap)

  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("678224fda3a86593b90e20fc667cc6cc789d55db060db427dc585e28cd34194f")
  public override fun addMethod(
    httpMethod: String,
    integration: Integration,
    options: MethodOptions.Builder.() -> Unit,
  ): Method = addMethod(httpMethod, integration, MethodOptions(options))

  public override fun addProxy(): ProxyResource = unwrap(this).addProxy().let(ProxyResource::wrap)

  public override fun addProxy(options: ProxyResourceOptions): ProxyResource =
      unwrap(this).addProxy(options.let(ProxyResourceOptions::unwrap)).let(ProxyResource::wrap)

  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("e84ad41e5cb5588993b50d4f00b7ff5abf72997c3b967125daa364452463d902")
  public override fun addProxy(options: ProxyResourceOptions.Builder.() -> Unit): ProxyResource =
      addProxy(ProxyResourceOptions(options))

  public override fun addResource(pathPart: String): Resource =
      unwrap(this).addResource(pathPart).let(Resource::wrap)

  public override fun addResource(pathPart: String, options: ResourceOptions): Resource =
      unwrap(this).addResource(pathPart, options.let(ResourceOptions::unwrap)).let(Resource::wrap)

  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("eb83d81205a9facdb81a248cc63a5f2cfa36f56638d8e79cd6decf73a0c14b00")
  public override fun addResource(pathPart: String, options: ResourceOptions.Builder.() -> Unit):
      Resource = addResource(pathPart, ResourceOptions(options))

  public override fun api(): IRestApi = unwrap(this).getApi().let(IRestApi::wrap)

  public override fun defaultCorsPreflightOptions(): CorsOptions? =
      unwrap(this).getDefaultCorsPreflightOptions()?.let(CorsOptions::wrap)

  public override fun defaultIntegration(): Integration? =
      unwrap(this).getDefaultIntegration()?.let(Integration::wrap)

  public override fun defaultMethodOptions(): MethodOptions? =
      unwrap(this).getDefaultMethodOptions()?.let(MethodOptions::wrap)

  public override fun parentResource(): IResource? =
      unwrap(this).getParentResource()?.let(IResource::wrap)

  public override fun path(): String = unwrap(this).getPath()

  public override fun resource(pathPart: String): IResource? =
      unwrap(this).getResource(pathPart)?.let(IResource::wrap)

  public override fun resourceForPath(path: String): Resource =
      unwrap(this).resourceForPath(path).let(Resource::wrap)

  public override fun resourceId(): String = unwrap(this).getResourceId()

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.apigateway.ResourceBase,
  ) : ResourceBase(cdkObject)

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.apigateway.ResourceBase):
        ResourceBase = Wrapper(cdkObject)

    internal fun unwrap(wrapped: ResourceBase):
        software.amazon.awscdk.services.apigateway.ResourceBase = (wrapped as CdkObject).cdkObject
        as software.amazon.awscdk.services.apigateway.ResourceBase
  }
}
