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
  /**
   * Adds an OPTIONS method to this resource which responds to Cross-Origin Resource Sharing (CORS)
   * preflight requests.
   *
   * Cross-Origin Resource Sharing (CORS) is a mechanism that uses additional
   * HTTP headers to tell browsers to give a web application running at one
   * origin, access to selected resources from a different origin. A web
   * application executes a cross-origin HTTP request when it requests a
   * resource that has a different origin (domain, protocol, or port) from its
   * own.
   *
   * @return a `Method` object
   * [Documentation](https://developer.mozilla.org/en-US/docs/Web/HTTP/CORS)
   * @param options CORS options. 
   */
  public fun addCorsPreflight(options: CorsOptions): Method

  /**
   * Adds an OPTIONS method to this resource which responds to Cross-Origin Resource Sharing (CORS)
   * preflight requests.
   *
   * Cross-Origin Resource Sharing (CORS) is a mechanism that uses additional
   * HTTP headers to tell browsers to give a web application running at one
   * origin, access to selected resources from a different origin. A web
   * application executes a cross-origin HTTP request when it requests a
   * resource that has a different origin (domain, protocol, or port) from its
   * own.
   *
   * @return a `Method` object
   * [Documentation](https://developer.mozilla.org/en-US/docs/Web/HTTP/CORS)
   * @param options CORS options. 
   */
  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("c9e16d54d77b097f76148268956eb3dad5caf87139623f2131b4e7bdec2a2b0b")
  public fun addCorsPreflight(options: CorsOptions.Builder.() -> Unit): Method

  /**
   * Defines a new method for this resource.
   *
   * @return The newly created `Method` object.
   * @param httpMethod The HTTP method. 
   * @param target The target backend integration for this method.
   * @param options Method options, such as authentication.
   */
  public fun addMethod(httpMethod: String): Method

  /**
   * Defines a new method for this resource.
   *
   * @return The newly created `Method` object.
   * @param httpMethod The HTTP method. 
   * @param target The target backend integration for this method.
   * @param options Method options, such as authentication.
   */
  public fun addMethod(httpMethod: String, target: Integration): Method

  /**
   * Defines a new method for this resource.
   *
   * @return The newly created `Method` object.
   * @param httpMethod The HTTP method. 
   * @param target The target backend integration for this method.
   * @param options Method options, such as authentication.
   */
  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("8787b99e9c374ffaac05faacd3953f7d78c9a3fe47bc6f0e47650d9cfcd0b026")
  public fun addMethod(httpMethod: String, target: Integration.Builder.() -> Unit): Method

  /**
   * Defines a new method for this resource.
   *
   * @return The newly created `Method` object.
   * @param httpMethod The HTTP method. 
   * @param target The target backend integration for this method.
   * @param options Method options, such as authentication.
   */
  public fun addMethod(
    httpMethod: String,
    target: Integration,
    options: MethodOptions,
  ): Method

  /**
   * Defines a new method for this resource.
   *
   * @return The newly created `Method` object.
   * @param httpMethod The HTTP method. 
   * @param target The target backend integration for this method.
   * @param options Method options, such as authentication.
   */
  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("678224fda3a86593b90e20fc667cc6cc789d55db060db427dc585e28cd34194f")
  public fun addMethod(
    httpMethod: String,
    target: Integration,
    options: MethodOptions.Builder.() -> Unit,
  ): Method

  /**
   * Adds a greedy proxy resource ("{proxy+}") and an ANY method to this route.
   *
   * @param options Default integration and method options.
   */
  public fun addProxy(): ProxyResource

  /**
   * Adds a greedy proxy resource ("{proxy+}") and an ANY method to this route.
   *
   * @param options Default integration and method options.
   */
  public fun addProxy(options: ProxyResourceOptions): ProxyResource

  /**
   * Adds a greedy proxy resource ("{proxy+}") and an ANY method to this route.
   *
   * @param options Default integration and method options.
   */
  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("e84ad41e5cb5588993b50d4f00b7ff5abf72997c3b967125daa364452463d902")
  public fun addProxy(options: ProxyResourceOptions.Builder.() -> Unit): ProxyResource

  /**
   * Defines a new child resource where this resource is the parent.
   *
   * @return A Resource object
   * @param pathPart The path part for the child resource. 
   * @param options Resource options.
   */
  public fun addResource(pathPart: String): Resource

  /**
   * Defines a new child resource where this resource is the parent.
   *
   * @return A Resource object
   * @param pathPart The path part for the child resource. 
   * @param options Resource options.
   */
  public fun addResource(pathPart: String, options: ResourceOptions): Resource

  /**
   * Defines a new child resource where this resource is the parent.
   *
   * @return A Resource object
   * @param pathPart The path part for the child resource. 
   * @param options Resource options.
   */
  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("eb83d81205a9facdb81a248cc63a5f2cfa36f56638d8e79cd6decf73a0c14b00")
  public fun addResource(pathPart: String, options: ResourceOptions.Builder.() -> Unit): Resource

  /**
   * The rest API that this resource is part of.
   *
   * The reason we need the RestApi object itself and not just the ID is because the model
   * is being tracked by the top-level RestApi object for the purpose of calculating it's
   * hash to determine the ID of the deployment. This allows us to automatically update
   * the deployment when the model of the REST API changes.
   */
  public fun api(): IRestApi

  /**
   * Default options for CORS preflight OPTIONS method.
   */
  public fun defaultCorsPreflightOptions(): CorsOptions? =
      unwrap(this).getDefaultCorsPreflightOptions()?.let(CorsOptions::wrap)

  /**
   * An integration to use as a default for all methods created within this API unless an
   * integration is specified.
   */
  public fun defaultIntegration(): Integration? =
      unwrap(this).getDefaultIntegration()?.let(Integration::wrap)

  /**
   * Method options to use as a default for all methods created within this API unless custom
   * options are specified.
   */
  public fun defaultMethodOptions(): MethodOptions? =
      unwrap(this).getDefaultMethodOptions()?.let(MethodOptions::wrap)

  /**
   * The parent of this resource or undefined for the root resource.
   */
  public fun parentResource(): IResource? = unwrap(this).getParentResource()?.let(IResource::wrap)

  /**
   * The full path of this resource.
   */
  public fun path(): String

  /**
   * Retrieves a child resource by path part.
   *
   * @return the child resource or undefined if not found
   * @param pathPart The path part of the child resource. 
   */
  public fun resource(pathPart: String): IResource?

  /**
   * Gets or create all resources leading up to the specified path.
   *
   * * Path may only start with "/" if this method is called on the root resource.
   * * All resources are created using default options.
   *
   * @return a new or existing resource.
   * @param path The relative path. 
   */
  public fun resourceForPath(path: String): Resource

  /**
   * The ID of the resource.
   */
  public fun resourceId(): String

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.apigateway.IResource,
  ) : IResource {
    /**
     * Adds an OPTIONS method to this resource which responds to Cross-Origin Resource Sharing
     * (CORS) preflight requests.
     *
     * Cross-Origin Resource Sharing (CORS) is a mechanism that uses additional
     * HTTP headers to tell browsers to give a web application running at one
     * origin, access to selected resources from a different origin. A web
     * application executes a cross-origin HTTP request when it requests a
     * resource that has a different origin (domain, protocol, or port) from its
     * own.
     *
     * @return a `Method` object
     * [Documentation](https://developer.mozilla.org/en-US/docs/Web/HTTP/CORS)
     * @param options CORS options. 
     */
    override fun addCorsPreflight(options: CorsOptions): Method =
        unwrap(this).addCorsPreflight(options.let(CorsOptions::unwrap)).let(Method::wrap)

    /**
     * Adds an OPTIONS method to this resource which responds to Cross-Origin Resource Sharing
     * (CORS) preflight requests.
     *
     * Cross-Origin Resource Sharing (CORS) is a mechanism that uses additional
     * HTTP headers to tell browsers to give a web application running at one
     * origin, access to selected resources from a different origin. A web
     * application executes a cross-origin HTTP request when it requests a
     * resource that has a different origin (domain, protocol, or port) from its
     * own.
     *
     * @return a `Method` object
     * [Documentation](https://developer.mozilla.org/en-US/docs/Web/HTTP/CORS)
     * @param options CORS options. 
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("c9e16d54d77b097f76148268956eb3dad5caf87139623f2131b4e7bdec2a2b0b")
    override fun addCorsPreflight(options: CorsOptions.Builder.() -> Unit): Method =
        addCorsPreflight(CorsOptions(options))

    /**
     * Defines a new method for this resource.
     *
     * @return The newly created `Method` object.
     * @param httpMethod The HTTP method. 
     * @param target The target backend integration for this method.
     * @param options Method options, such as authentication.
     */
    override fun addMethod(httpMethod: String): Method =
        unwrap(this).addMethod(httpMethod).let(Method::wrap)

    /**
     * Defines a new method for this resource.
     *
     * @return The newly created `Method` object.
     * @param httpMethod The HTTP method. 
     * @param target The target backend integration for this method.
     * @param options Method options, such as authentication.
     */
    override fun addMethod(httpMethod: String, target: Integration): Method =
        unwrap(this).addMethod(httpMethod, target.let(Integration::unwrap)).let(Method::wrap)

    /**
     * Defines a new method for this resource.
     *
     * @return The newly created `Method` object.
     * @param httpMethod The HTTP method. 
     * @param target The target backend integration for this method.
     * @param options Method options, such as authentication.
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("8787b99e9c374ffaac05faacd3953f7d78c9a3fe47bc6f0e47650d9cfcd0b026")
    override fun addMethod(httpMethod: String, target: Integration.Builder.() -> Unit): Method =
        addMethod(httpMethod, Integration(target))

    /**
     * Defines a new method for this resource.
     *
     * @return The newly created `Method` object.
     * @param httpMethod The HTTP method. 
     * @param target The target backend integration for this method.
     * @param options Method options, such as authentication.
     */
    override fun addMethod(
      httpMethod: String,
      target: Integration,
      options: MethodOptions,
    ): Method = unwrap(this).addMethod(httpMethod, target.let(Integration::unwrap),
        options.let(MethodOptions::unwrap)).let(Method::wrap)

    /**
     * Defines a new method for this resource.
     *
     * @return The newly created `Method` object.
     * @param httpMethod The HTTP method. 
     * @param target The target backend integration for this method.
     * @param options Method options, such as authentication.
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("678224fda3a86593b90e20fc667cc6cc789d55db060db427dc585e28cd34194f")
    override fun addMethod(
      httpMethod: String,
      target: Integration,
      options: MethodOptions.Builder.() -> Unit,
    ): Method = addMethod(httpMethod, target, MethodOptions(options))

    /**
     * Adds a greedy proxy resource ("{proxy+}") and an ANY method to this route.
     *
     * @param options Default integration and method options.
     */
    override fun addProxy(): ProxyResource = unwrap(this).addProxy().let(ProxyResource::wrap)

    /**
     * Adds a greedy proxy resource ("{proxy+}") and an ANY method to this route.
     *
     * @param options Default integration and method options.
     */
    override fun addProxy(options: ProxyResourceOptions): ProxyResource =
        unwrap(this).addProxy(options.let(ProxyResourceOptions::unwrap)).let(ProxyResource::wrap)

    /**
     * Adds a greedy proxy resource ("{proxy+}") and an ANY method to this route.
     *
     * @param options Default integration and method options.
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("e84ad41e5cb5588993b50d4f00b7ff5abf72997c3b967125daa364452463d902")
    override fun addProxy(options: ProxyResourceOptions.Builder.() -> Unit): ProxyResource =
        addProxy(ProxyResourceOptions(options))

    /**
     * Defines a new child resource where this resource is the parent.
     *
     * @return A Resource object
     * @param pathPart The path part for the child resource. 
     * @param options Resource options.
     */
    override fun addResource(pathPart: String): Resource =
        unwrap(this).addResource(pathPart).let(Resource::wrap)

    /**
     * Defines a new child resource where this resource is the parent.
     *
     * @return A Resource object
     * @param pathPart The path part for the child resource. 
     * @param options Resource options.
     */
    override fun addResource(pathPart: String, options: ResourceOptions): Resource =
        unwrap(this).addResource(pathPart, options.let(ResourceOptions::unwrap)).let(Resource::wrap)

    /**
     * Defines a new child resource where this resource is the parent.
     *
     * @return A Resource object
     * @param pathPart The path part for the child resource. 
     * @param options Resource options.
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("eb83d81205a9facdb81a248cc63a5f2cfa36f56638d8e79cd6decf73a0c14b00")
    override fun addResource(pathPart: String, options: ResourceOptions.Builder.() -> Unit):
        Resource = addResource(pathPart, ResourceOptions(options))

    /**
     * The rest API that this resource is part of.
     *
     * The reason we need the RestApi object itself and not just the ID is because the model
     * is being tracked by the top-level RestApi object for the purpose of calculating it's
     * hash to determine the ID of the deployment. This allows us to automatically update
     * the deployment when the model of the REST API changes.
     */
    override fun api(): IRestApi = unwrap(this).getApi().let(IRestApi::wrap)

    /**
     * Apply the given removal policy to this resource.
     *
     * The Removal Policy controls what happens to this resource when it stops
     * being managed by CloudFormation, either because you've removed it from the
     * CDK application or because you've made a change that requires the resource
     * to be replaced.
     *
     * The resource can be deleted (`RemovalPolicy.DESTROY`), or left in your AWS
     * account for data recovery and cleanup later (`RemovalPolicy.RETAIN`).
     *
     * @param policy 
     */
    override fun applyRemovalPolicy(policy: RemovalPolicy) {
      unwrap(this).applyRemovalPolicy(policy.let(RemovalPolicy::unwrap))
    }

    /**
     * Default options for CORS preflight OPTIONS method.
     */
    override fun defaultCorsPreflightOptions(): CorsOptions? =
        unwrap(this).getDefaultCorsPreflightOptions()?.let(CorsOptions::wrap)

    /**
     * An integration to use as a default for all methods created within this API unless an
     * integration is specified.
     */
    override fun defaultIntegration(): Integration? =
        unwrap(this).getDefaultIntegration()?.let(Integration::wrap)

    /**
     * Method options to use as a default for all methods created within this API unless custom
     * options are specified.
     */
    override fun defaultMethodOptions(): MethodOptions? =
        unwrap(this).getDefaultMethodOptions()?.let(MethodOptions::wrap)

    /**
     * The environment this resource belongs to.
     *
     * For resources that are created and managed by the CDK
     * (generally, those created by creating new class instances like Role, Bucket, etc.),
     * this is always the same as the environment of the stack they belong to;
     * however, for imported resources
     * (those obtained from static methods like fromRoleArn, fromBucketName, etc.),
     * that might be different than the stack they were imported into.
     */
    override fun env(): ResourceEnvironment = unwrap(this).getEnv().let(ResourceEnvironment::wrap)

    override fun node(): Node = unwrap(this).getNode().let(Node::wrap)

    /**
     * The parent of this resource or undefined for the root resource.
     */
    override fun parentResource(): IResource? =
        unwrap(this).getParentResource()?.let(IResource::wrap)

    /**
     * The full path of this resource.
     */
    override fun path(): String = unwrap(this).getPath()

    /**
     * Retrieves a child resource by path part.
     *
     * @return the child resource or undefined if not found
     * @param pathPart The path part of the child resource. 
     */
    override fun resource(pathPart: String): IResource? =
        unwrap(this).getResource(pathPart)?.let(IResource::wrap)

    /**
     * Gets or create all resources leading up to the specified path.
     *
     * * Path may only start with "/" if this method is called on the root resource.
     * * All resources are created using default options.
     *
     * @return a new or existing resource.
     * @param path The relative path. 
     */
    override fun resourceForPath(path: String): Resource =
        unwrap(this).resourceForPath(path).let(Resource::wrap)

    /**
     * The ID of the resource.
     */
    override fun resourceId(): String = unwrap(this).getResourceId()

    /**
     * The stack in which this resource is defined.
     */
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
