package io.cloudshiftdev.awscdk.services.apigateway

import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName

public abstract class ResourceBase
internal constructor(
    private val cdkObject: software.amazon.awscdk.services.apigateway.ResourceBase,
) : io.cloudshiftdev.awscdk.Resource(cdkObject), IResource {
    /**
     * Adds an OPTIONS method to this resource which responds to Cross-Origin Resource Sharing
     * (CORS) preflight requests.
     *
     * Cross-Origin Resource Sharing (CORS) is a mechanism that uses additional HTTP headers to tell
     * browsers to give a web application running at one origin, access to selected resources from a
     * different origin. A web application executes a cross-origin HTTP request when it requests a
     * resource that has a different origin (domain, protocol, or port) from its own.
     *
     * @param options
     */
    public override fun addCorsPreflight(options: CorsOptions): Method =
        unwrap(this).addCorsPreflight(options.let(CorsOptions::unwrap)).let(Method::wrap)

    /**
     * Adds an OPTIONS method to this resource which responds to Cross-Origin Resource Sharing
     * (CORS) preflight requests.
     *
     * Cross-Origin Resource Sharing (CORS) is a mechanism that uses additional HTTP headers to tell
     * browsers to give a web application running at one origin, access to selected resources from a
     * different origin. A web application executes a cross-origin HTTP request when it requests a
     * resource that has a different origin (domain, protocol, or port) from its own.
     *
     * @param options
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("c9e16d54d77b097f76148268956eb3dad5caf87139623f2131b4e7bdec2a2b0b")
    public override fun addCorsPreflight(options: CorsOptions.Builder.() -> Unit): Method =
        addCorsPreflight(CorsOptions(options))

    /**
     * Defines a new method for this resource.
     *
     * @param httpMethod
     * @param integration
     * @param options
     */
    public override fun addMethod(httpMethod: String): Method =
        unwrap(this).addMethod(httpMethod).let(Method::wrap)

    /**
     * Defines a new method for this resource.
     *
     * @param httpMethod
     * @param integration
     * @param options
     */
    public override fun addMethod(httpMethod: String, integration: Integration): Method =
        unwrap(this).addMethod(httpMethod, integration.let(Integration::unwrap)).let(Method::wrap)

    /**
     * Defines a new method for this resource.
     *
     * @param httpMethod
     * @param integration
     * @param options
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("8787b99e9c374ffaac05faacd3953f7d78c9a3fe47bc6f0e47650d9cfcd0b026")
    public override fun addMethod(
        httpMethod: String,
        integration: Integration.Builder.() -> Unit
    ): Method = addMethod(httpMethod, Integration(integration))

    /**
     * Defines a new method for this resource.
     *
     * @param httpMethod
     * @param integration
     * @param options
     */
    public override fun addMethod(
        httpMethod: String,
        integration: Integration,
        options: MethodOptions,
    ): Method =
        unwrap(this)
            .addMethod(
                httpMethod,
                integration.let(Integration::unwrap),
                options.let(MethodOptions::unwrap)
            )
            .let(Method::wrap)

    /**
     * Defines a new method for this resource.
     *
     * @param httpMethod
     * @param integration
     * @param options
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("678224fda3a86593b90e20fc667cc6cc789d55db060db427dc585e28cd34194f")
    public override fun addMethod(
        httpMethod: String,
        integration: Integration,
        options: MethodOptions.Builder.() -> Unit,
    ): Method = addMethod(httpMethod, integration, MethodOptions(options))

    /**
     * Adds a greedy proxy resource ("{proxy+}") and an ANY method to this route.
     *
     * @param options
     */
    public override fun addProxy(): ProxyResource = unwrap(this).addProxy().let(ProxyResource::wrap)

    /**
     * Adds a greedy proxy resource ("{proxy+}") and an ANY method to this route.
     *
     * @param options
     */
    public override fun addProxy(options: ProxyResourceOptions): ProxyResource =
        unwrap(this).addProxy(options.let(ProxyResourceOptions::unwrap)).let(ProxyResource::wrap)

    /**
     * Adds a greedy proxy resource ("{proxy+}") and an ANY method to this route.
     *
     * @param options
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("e84ad41e5cb5588993b50d4f00b7ff5abf72997c3b967125daa364452463d902")
    public override fun addProxy(options: ProxyResourceOptions.Builder.() -> Unit): ProxyResource =
        addProxy(ProxyResourceOptions(options))

    /**
     * Defines a new child resource where this resource is the parent.
     *
     * @param pathPart
     * @param options
     */
    public override fun addResource(pathPart: String): Resource =
        unwrap(this).addResource(pathPart).let(Resource::wrap)

    /**
     * Defines a new child resource where this resource is the parent.
     *
     * @param pathPart
     * @param options
     */
    public override fun addResource(pathPart: String, options: ResourceOptions): Resource =
        unwrap(this).addResource(pathPart, options.let(ResourceOptions::unwrap)).let(Resource::wrap)

    /**
     * Defines a new child resource where this resource is the parent.
     *
     * @param pathPart
     * @param options
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("eb83d81205a9facdb81a248cc63a5f2cfa36f56638d8e79cd6decf73a0c14b00")
    public override fun addResource(
        pathPart: String,
        options: ResourceOptions.Builder.() -> Unit
    ): Resource = addResource(pathPart, ResourceOptions(options))

    /**
     * The rest API that this resource is part of.
     *
     * The reason we need the RestApi object itself and not just the ID is because the model is
     * being tracked by the top-level RestApi object for the purpose of calculating it's hash to
     * determine the ID of the deployment. This allows us to automatically update the deployment
     * when the model of the REST API changes.
     */
    public override fun api(): IRestApi = unwrap(this).getApi().let(IRestApi::wrap)

    /** Default options for CORS preflight OPTIONS method. */
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

    /** The parent of this resource or undefined for the root resource. */
    public override fun parentResource(): IResource? =
        unwrap(this).getParentResource()?.let(IResource::wrap)

    /** The full path of this resource. */
    public override fun path(): String = unwrap(this).getPath()

    /**
     * Retrieves a child resource by path part.
     *
     * @param pathPart
     */
    public override fun resource(pathPart: String): IResource? =
        unwrap(this).getResource(pathPart)?.let(IResource::wrap)

    /**
     * Gets or create all resources leading up to the specified path.
     * * Path may only start with "/" if this method is called on the root resource.
     * * All resources are created using default options.
     *
     * @param path
     */
    public override fun resourceForPath(path: String): Resource =
        unwrap(this).resourceForPath(path).let(Resource::wrap)

    /** The ID of the resource. */
    public override fun resourceId(): String = unwrap(this).getResourceId()

    private class Wrapper
    internal constructor(
        internal val cdkObject: software.amazon.awscdk.services.apigateway.ResourceBase,
    ) : ResourceBase(cdkObject)

    public companion object {
        init {}

        internal fun wrap(
            cdkObject: software.amazon.awscdk.services.apigateway.ResourceBase
        ): ResourceBase = Wrapper(cdkObject)

        internal fun unwrap(
            wrapped: ResourceBase
        ): software.amazon.awscdk.services.apigateway.ResourceBase = (wrapped as Wrapper).cdkObject
    }
}
