@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.apigateway

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class Resource internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.apigateway.Resource,
) : ResourceBase(cdkObject) {
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

  public override fun resourceId(): String = unwrap(this).getResourceId()

  @CdkDslMarker
  public interface Builder {
    public fun defaultCorsPreflightOptions(defaultCorsPreflightOptions: CorsOptions)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("d2236b4208fceda736b1bedffea6279dd798622412d44457398e6054538f2eae")
    public
        fun defaultCorsPreflightOptions(defaultCorsPreflightOptions: CorsOptions.Builder.() -> Unit)

    public fun defaultIntegration(defaultIntegration: Integration)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("904d07c2db4af04b79ae083fe47132f9a207260a7a1ca194d70a4e5e218000ee")
    public fun defaultIntegration(defaultIntegration: Integration.Builder.() -> Unit)

    public fun defaultMethodOptions(defaultMethodOptions: MethodOptions)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("f11cd7f099631d8488ca116f456cc9be8fcb574351f138b3a83632c08ca46237")
    public fun defaultMethodOptions(defaultMethodOptions: MethodOptions.Builder.() -> Unit)

    public fun parent(parent: IResource)

    public fun pathPart(pathPart: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.apigateway.Resource.Builder =
        software.amazon.awscdk.services.apigateway.Resource.Builder.create(scope, id)

    override fun defaultCorsPreflightOptions(defaultCorsPreflightOptions: CorsOptions) {
      cdkBuilder.defaultCorsPreflightOptions(defaultCorsPreflightOptions.let(CorsOptions::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("d2236b4208fceda736b1bedffea6279dd798622412d44457398e6054538f2eae")
    override
        fun defaultCorsPreflightOptions(defaultCorsPreflightOptions: CorsOptions.Builder.() -> Unit):
        Unit = defaultCorsPreflightOptions(CorsOptions(defaultCorsPreflightOptions))

    override fun defaultIntegration(defaultIntegration: Integration) {
      cdkBuilder.defaultIntegration(defaultIntegration.let(Integration::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("904d07c2db4af04b79ae083fe47132f9a207260a7a1ca194d70a4e5e218000ee")
    override fun defaultIntegration(defaultIntegration: Integration.Builder.() -> Unit): Unit =
        defaultIntegration(Integration(defaultIntegration))

    override fun defaultMethodOptions(defaultMethodOptions: MethodOptions) {
      cdkBuilder.defaultMethodOptions(defaultMethodOptions.let(MethodOptions::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("f11cd7f099631d8488ca116f456cc9be8fcb574351f138b3a83632c08ca46237")
    override fun defaultMethodOptions(defaultMethodOptions: MethodOptions.Builder.() -> Unit): Unit
        = defaultMethodOptions(MethodOptions(defaultMethodOptions))

    override fun parent(parent: IResource) {
      cdkBuilder.parent(parent.let(IResource::unwrap))
    }

    override fun pathPart(pathPart: String) {
      cdkBuilder.pathPart(pathPart)
    }

    public fun build(): software.amazon.awscdk.services.apigateway.Resource = cdkBuilder.build()
  }

  public companion object {
    public fun fromResourceAttributes(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      attrs: ResourceAttributes,
    ): IResource =
        software.amazon.awscdk.services.apigateway.Resource.fromResourceAttributes(scope.let(CloudshiftdevConstructsConstruct::unwrap),
        id, attrs.let(ResourceAttributes::unwrap)).let(IResource::wrap)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("dc2cd864e2b32bee5456bf8bcb5d9271b8ba7faa17a2e56e903d053de2ee6379")
    public fun fromResourceAttributes(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      attrs: ResourceAttributes.Builder.() -> Unit,
    ): IResource = fromResourceAttributes(scope, id, ResourceAttributes(attrs))

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): Resource {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return Resource(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.apigateway.Resource): Resource =
        Resource(cdkObject)

    internal fun unwrap(wrapped: Resource): software.amazon.awscdk.services.apigateway.Resource =
        wrapped.cdkObject
  }
}
