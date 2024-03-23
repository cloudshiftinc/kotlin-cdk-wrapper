@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.apigateway

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * Example:
 *
 * ```
 * LambdaIntegration booksBackend;
 * RestApi api = RestApi.Builder.create(this, "books")
 * .defaultIntegration(booksBackend)
 * .build();
 * Resource books = api.root.addResource("books");
 * books.addMethod("GET"); // integrated with `booksBackend`
 * books.addMethod("POST"); // integrated with `booksBackend`
 * Resource book = books.addResource("{book_id}");
 * book.addMethod("GET");
 * ```
 */
public open class Resource(
  cdkObject: software.amazon.awscdk.services.apigateway.Resource,
) : ResourceBase(cdkObject) {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: ResourceProps,
  ) :
      this(software.amazon.awscdk.services.apigateway.Resource(scope.let(CloudshiftdevConstructsConstruct::unwrap),
      id, props.let(ResourceProps::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: ResourceProps.Builder.() -> Unit,
  ) : this(scope, id, ResourceProps(props)
  )

  /**
   * The rest API that this resource is part of.
   *
   * The reason we need the RestApi object itself and not just the ID is because the model
   * is being tracked by the top-level RestApi object for the purpose of calculating it's
   * hash to determine the ID of the deployment. This allows us to automatically update
   * the deployment when the model of the REST API changes.
   */
  public override fun api(): IRestApi = unwrap(this).getApi().let(IRestApi::wrap)

  /**
   * Default options for CORS preflight OPTIONS method.
   */
  public override fun defaultCorsPreflightOptions(): CorsOptions? =
      unwrap(this).getDefaultCorsPreflightOptions()?.let(CorsOptions::wrap)

  /**
   * An integration to use as a default for all methods created within this API unless an
   * integration is specified.
   */
  public override fun defaultIntegration(): Integration? =
      unwrap(this).getDefaultIntegration()?.let(Integration::wrap)

  /**
   * Method options to use as a default for all methods created within this API unless custom
   * options are specified.
   */
  public override fun defaultMethodOptions(): MethodOptions? =
      unwrap(this).getDefaultMethodOptions()?.let(MethodOptions::wrap)

  /**
   * The parent of this resource or undefined for the root resource.
   */
  public override fun parentResource(): IResource? =
      unwrap(this).getParentResource()?.let(IResource::wrap)

  /**
   * The full path of this resource.
   */
  public override fun path(): String = unwrap(this).getPath()

  /**
   * The ID of the resource.
   */
  public override fun resourceId(): String = unwrap(this).getResourceId()

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.apigateway.Resource].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * Adds a CORS preflight OPTIONS method to this resource and all child resources.
     *
     * You can add CORS at the resource-level using `addCorsPreflight`.
     *
     * Default: - CORS is disabled
     *
     * @param defaultCorsPreflightOptions Adds a CORS preflight OPTIONS method to this resource and
     * all child resources. 
     */
    public fun defaultCorsPreflightOptions(defaultCorsPreflightOptions: CorsOptions)

    /**
     * Adds a CORS preflight OPTIONS method to this resource and all child resources.
     *
     * You can add CORS at the resource-level using `addCorsPreflight`.
     *
     * Default: - CORS is disabled
     *
     * @param defaultCorsPreflightOptions Adds a CORS preflight OPTIONS method to this resource and
     * all child resources. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("d2236b4208fceda736b1bedffea6279dd798622412d44457398e6054538f2eae")
    public
        fun defaultCorsPreflightOptions(defaultCorsPreflightOptions: CorsOptions.Builder.() -> Unit)

    /**
     * An integration to use as a default for all methods created within this API unless an
     * integration is specified.
     *
     * Default: - Inherited from parent.
     *
     * @param defaultIntegration An integration to use as a default for all methods created within
     * this API unless an integration is specified. 
     */
    public fun defaultIntegration(defaultIntegration: Integration)

    /**
     * An integration to use as a default for all methods created within this API unless an
     * integration is specified.
     *
     * Default: - Inherited from parent.
     *
     * @param defaultIntegration An integration to use as a default for all methods created within
     * this API unless an integration is specified. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("904d07c2db4af04b79ae083fe47132f9a207260a7a1ca194d70a4e5e218000ee")
    public fun defaultIntegration(defaultIntegration: Integration.Builder.() -> Unit)

    /**
     * Method options to use as a default for all methods created within this API unless custom
     * options are specified.
     *
     * Default: - Inherited from parent.
     *
     * @param defaultMethodOptions Method options to use as a default for all methods created within
     * this API unless custom options are specified. 
     */
    public fun defaultMethodOptions(defaultMethodOptions: MethodOptions)

    /**
     * Method options to use as a default for all methods created within this API unless custom
     * options are specified.
     *
     * Default: - Inherited from parent.
     *
     * @param defaultMethodOptions Method options to use as a default for all methods created within
     * this API unless custom options are specified. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("f11cd7f099631d8488ca116f456cc9be8fcb574351f138b3a83632c08ca46237")
    public fun defaultMethodOptions(defaultMethodOptions: MethodOptions.Builder.() -> Unit)

    /**
     * The parent resource of this resource.
     *
     * You can either pass another
     * `Resource` object or a `RestApi` object here.
     *
     * @param parent The parent resource of this resource. 
     */
    public fun parent(parent: IResource)

    /**
     * A path name for the resource.
     *
     * @param pathPart A path name for the resource. 
     */
    public fun pathPart(pathPart: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.apigateway.Resource.Builder =
        software.amazon.awscdk.services.apigateway.Resource.Builder.create(scope, id)

    /**
     * Adds a CORS preflight OPTIONS method to this resource and all child resources.
     *
     * You can add CORS at the resource-level using `addCorsPreflight`.
     *
     * Default: - CORS is disabled
     *
     * @param defaultCorsPreflightOptions Adds a CORS preflight OPTIONS method to this resource and
     * all child resources. 
     */
    override fun defaultCorsPreflightOptions(defaultCorsPreflightOptions: CorsOptions) {
      cdkBuilder.defaultCorsPreflightOptions(defaultCorsPreflightOptions.let(CorsOptions::unwrap))
    }

    /**
     * Adds a CORS preflight OPTIONS method to this resource and all child resources.
     *
     * You can add CORS at the resource-level using `addCorsPreflight`.
     *
     * Default: - CORS is disabled
     *
     * @param defaultCorsPreflightOptions Adds a CORS preflight OPTIONS method to this resource and
     * all child resources. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("d2236b4208fceda736b1bedffea6279dd798622412d44457398e6054538f2eae")
    override
        fun defaultCorsPreflightOptions(defaultCorsPreflightOptions: CorsOptions.Builder.() -> Unit):
        Unit = defaultCorsPreflightOptions(CorsOptions(defaultCorsPreflightOptions))

    /**
     * An integration to use as a default for all methods created within this API unless an
     * integration is specified.
     *
     * Default: - Inherited from parent.
     *
     * @param defaultIntegration An integration to use as a default for all methods created within
     * this API unless an integration is specified. 
     */
    override fun defaultIntegration(defaultIntegration: Integration) {
      cdkBuilder.defaultIntegration(defaultIntegration.let(Integration::unwrap))
    }

    /**
     * An integration to use as a default for all methods created within this API unless an
     * integration is specified.
     *
     * Default: - Inherited from parent.
     *
     * @param defaultIntegration An integration to use as a default for all methods created within
     * this API unless an integration is specified. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("904d07c2db4af04b79ae083fe47132f9a207260a7a1ca194d70a4e5e218000ee")
    override fun defaultIntegration(defaultIntegration: Integration.Builder.() -> Unit): Unit =
        defaultIntegration(Integration(defaultIntegration))

    /**
     * Method options to use as a default for all methods created within this API unless custom
     * options are specified.
     *
     * Default: - Inherited from parent.
     *
     * @param defaultMethodOptions Method options to use as a default for all methods created within
     * this API unless custom options are specified. 
     */
    override fun defaultMethodOptions(defaultMethodOptions: MethodOptions) {
      cdkBuilder.defaultMethodOptions(defaultMethodOptions.let(MethodOptions::unwrap))
    }

    /**
     * Method options to use as a default for all methods created within this API unless custom
     * options are specified.
     *
     * Default: - Inherited from parent.
     *
     * @param defaultMethodOptions Method options to use as a default for all methods created within
     * this API unless custom options are specified. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("f11cd7f099631d8488ca116f456cc9be8fcb574351f138b3a83632c08ca46237")
    override fun defaultMethodOptions(defaultMethodOptions: MethodOptions.Builder.() -> Unit): Unit
        = defaultMethodOptions(MethodOptions(defaultMethodOptions))

    /**
     * The parent resource of this resource.
     *
     * You can either pass another
     * `Resource` object or a `RestApi` object here.
     *
     * @param parent The parent resource of this resource. 
     */
    override fun parent(parent: IResource) {
      cdkBuilder.parent(parent.let(IResource::unwrap))
    }

    /**
     * A path name for the resource.
     *
     * @param pathPart A path name for the resource. 
     */
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
        wrapped.cdkObject as software.amazon.awscdk.services.apigateway.Resource
  }
}
