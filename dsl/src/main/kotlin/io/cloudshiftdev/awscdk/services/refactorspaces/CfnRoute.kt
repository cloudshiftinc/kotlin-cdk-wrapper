package io.cloudshiftdev.awscdk.services.refactorspaces

import io.cloudshiftdev.awscdk.CdkObject
import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.ITaggable
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnRoute internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.refactorspaces.CfnRoute,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  /**
   * The unique identifier of the application.
   */
  public open fun applicationIdentifier(): String = unwrap(this).getApplicationIdentifier()

  /**
   * The unique identifier of the application.
   */
  public open fun applicationIdentifier(`value`: String) {
    unwrap(this).setApplicationIdentifier(`value`)
  }

  /**
   * The Amazon Resource Name (ARN) of the route.
   */
  public open fun attrArn(): String = unwrap(this).getAttrArn()

  /**
   * A mapping of Amazon API Gateway path resources to resource IDs.
   */
  public open fun attrPathResourceToId(): String = unwrap(this).getAttrPathResourceToId()

  /**
   * The unique identifier of the route.
   */
  public open fun attrRouteIdentifier(): String = unwrap(this).getAttrRouteIdentifier()

  /**
   * Configuration for the default route type.
   */
  public open fun defaultRoute(): Any? = unwrap(this).getDefaultRoute()

  /**
   * Configuration for the default route type.
   */
  public open fun defaultRoute(`value`: IResolvable) {
    unwrap(this).setDefaultRoute(`value`.let(IResolvable::unwrap))
  }

  /**
   * Configuration for the default route type.
   */
  public open fun defaultRoute(`value`: DefaultRouteInputProperty) {
    unwrap(this).setDefaultRoute(`value`.let(DefaultRouteInputProperty::unwrap))
  }

  /**
   * Configuration for the default route type.
   */
  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("4197c863f7a2f56e32f37a0dd6127e97f60763dd8e1089e604841544336b2d04")
  public open fun defaultRoute(`value`: DefaultRouteInputProperty.Builder.() -> Unit): Unit =
      defaultRoute(DefaultRouteInputProperty(`value`))

  /**
   * The unique identifier of the environment.
   */
  public open fun environmentIdentifier(): String = unwrap(this).getEnvironmentIdentifier()

  /**
   * The unique identifier of the environment.
   */
  public open fun environmentIdentifier(`value`: String) {
    unwrap(this).setEnvironmentIdentifier(`value`)
  }

  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  /**
   * The route type of the route.
   */
  public open fun routeType(): String = unwrap(this).getRouteType()

  /**
   * The route type of the route.
   */
  public open fun routeType(`value`: String) {
    unwrap(this).setRouteType(`value`)
  }

  /**
   * The unique identifier of the service.
   */
  public open fun serviceIdentifier(): String = unwrap(this).getServiceIdentifier()

  /**
   * The unique identifier of the service.
   */
  public open fun serviceIdentifier(`value`: String) {
    unwrap(this).setServiceIdentifier(`value`)
  }

  /**
   * Tag Manager which manages the tags for this resource.
   */
  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  /**
   * The tags assigned to the route.
   */
  public open fun tagsRaw(): List<CfnTag> = unwrap(this).getTagsRaw()?.map(CfnTag::wrap) ?:
      emptyList()

  /**
   * The tags assigned to the route.
   */
  public open fun tagsRaw(`value`: List<CfnTag>) {
    unwrap(this).setTagsRaw(`value`.map(CfnTag::unwrap))
  }

  /**
   * The tags assigned to the route.
   */
  public open fun tagsRaw(vararg `value`: CfnTag): Unit = tagsRaw(`value`.toList())

  /**
   * The configuration for the URI path route type.
   */
  public open fun uriPathRoute(): Any? = unwrap(this).getUriPathRoute()

  /**
   * The configuration for the URI path route type.
   */
  public open fun uriPathRoute(`value`: IResolvable) {
    unwrap(this).setUriPathRoute(`value`.let(IResolvable::unwrap))
  }

  /**
   * The configuration for the URI path route type.
   */
  public open fun uriPathRoute(`value`: UriPathRouteInputProperty) {
    unwrap(this).setUriPathRoute(`value`.let(UriPathRouteInputProperty::unwrap))
  }

  /**
   * The configuration for the URI path route type.
   */
  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("65ef4fde4a173945029ad19dcb3fe21e2d913ffe95c955d5a14422e3bd53f66c")
  public open fun uriPathRoute(`value`: UriPathRouteInputProperty.Builder.() -> Unit): Unit =
      uriPathRoute(UriPathRouteInputProperty(`value`))

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.refactorspaces.CfnRoute].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The unique identifier of the application.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-refactorspaces-route.html#cfn-refactorspaces-route-applicationidentifier)
     * @param applicationIdentifier The unique identifier of the application. 
     */
    public fun applicationIdentifier(applicationIdentifier: String)

    /**
     * Configuration for the default route type.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-refactorspaces-route.html#cfn-refactorspaces-route-defaultroute)
     * @param defaultRoute Configuration for the default route type. 
     */
    public fun defaultRoute(defaultRoute: IResolvable)

    /**
     * Configuration for the default route type.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-refactorspaces-route.html#cfn-refactorspaces-route-defaultroute)
     * @param defaultRoute Configuration for the default route type. 
     */
    public fun defaultRoute(defaultRoute: DefaultRouteInputProperty)

    /**
     * Configuration for the default route type.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-refactorspaces-route.html#cfn-refactorspaces-route-defaultroute)
     * @param defaultRoute Configuration for the default route type. 
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("ca106e9831e28b258c6a2cd5396f4b7d9726213f7a085efab4a2304461b4084a")
    public fun defaultRoute(defaultRoute: DefaultRouteInputProperty.Builder.() -> Unit)

    /**
     * The unique identifier of the environment.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-refactorspaces-route.html#cfn-refactorspaces-route-environmentidentifier)
     * @param environmentIdentifier The unique identifier of the environment. 
     */
    public fun environmentIdentifier(environmentIdentifier: String)

    /**
     * The route type of the route.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-refactorspaces-route.html#cfn-refactorspaces-route-routetype)
     * @param routeType The route type of the route. 
     */
    public fun routeType(routeType: String)

    /**
     * The unique identifier of the service.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-refactorspaces-route.html#cfn-refactorspaces-route-serviceidentifier)
     * @param serviceIdentifier The unique identifier of the service. 
     */
    public fun serviceIdentifier(serviceIdentifier: String)

    /**
     * The tags assigned to the route.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-refactorspaces-route.html#cfn-refactorspaces-route-tags)
     * @param tags The tags assigned to the route. 
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * The tags assigned to the route.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-refactorspaces-route.html#cfn-refactorspaces-route-tags)
     * @param tags The tags assigned to the route. 
     */
    public fun tags(vararg tags: CfnTag)

    /**
     * The configuration for the URI path route type.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-refactorspaces-route.html#cfn-refactorspaces-route-uripathroute)
     * @param uriPathRoute The configuration for the URI path route type. 
     */
    public fun uriPathRoute(uriPathRoute: IResolvable)

    /**
     * The configuration for the URI path route type.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-refactorspaces-route.html#cfn-refactorspaces-route-uripathroute)
     * @param uriPathRoute The configuration for the URI path route type. 
     */
    public fun uriPathRoute(uriPathRoute: UriPathRouteInputProperty)

    /**
     * The configuration for the URI path route type.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-refactorspaces-route.html#cfn-refactorspaces-route-uripathroute)
     * @param uriPathRoute The configuration for the URI path route type. 
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("7b80c88766ed37adf2d5d8261d64bab5cfc07f8aee3d6690638691521de18a34")
    public fun uriPathRoute(uriPathRoute: UriPathRouteInputProperty.Builder.() -> Unit)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.refactorspaces.CfnRoute.Builder =
        software.amazon.awscdk.services.refactorspaces.CfnRoute.Builder.create(scope, id)

    /**
     * The unique identifier of the application.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-refactorspaces-route.html#cfn-refactorspaces-route-applicationidentifier)
     * @param applicationIdentifier The unique identifier of the application. 
     */
    override fun applicationIdentifier(applicationIdentifier: String) {
      cdkBuilder.applicationIdentifier(applicationIdentifier)
    }

    /**
     * Configuration for the default route type.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-refactorspaces-route.html#cfn-refactorspaces-route-defaultroute)
     * @param defaultRoute Configuration for the default route type. 
     */
    override fun defaultRoute(defaultRoute: IResolvable) {
      cdkBuilder.defaultRoute(defaultRoute.let(IResolvable::unwrap))
    }

    /**
     * Configuration for the default route type.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-refactorspaces-route.html#cfn-refactorspaces-route-defaultroute)
     * @param defaultRoute Configuration for the default route type. 
     */
    override fun defaultRoute(defaultRoute: DefaultRouteInputProperty) {
      cdkBuilder.defaultRoute(defaultRoute.let(DefaultRouteInputProperty::unwrap))
    }

    /**
     * Configuration for the default route type.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-refactorspaces-route.html#cfn-refactorspaces-route-defaultroute)
     * @param defaultRoute Configuration for the default route type. 
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("ca106e9831e28b258c6a2cd5396f4b7d9726213f7a085efab4a2304461b4084a")
    override fun defaultRoute(defaultRoute: DefaultRouteInputProperty.Builder.() -> Unit): Unit =
        defaultRoute(DefaultRouteInputProperty(defaultRoute))

    /**
     * The unique identifier of the environment.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-refactorspaces-route.html#cfn-refactorspaces-route-environmentidentifier)
     * @param environmentIdentifier The unique identifier of the environment. 
     */
    override fun environmentIdentifier(environmentIdentifier: String) {
      cdkBuilder.environmentIdentifier(environmentIdentifier)
    }

    /**
     * The route type of the route.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-refactorspaces-route.html#cfn-refactorspaces-route-routetype)
     * @param routeType The route type of the route. 
     */
    override fun routeType(routeType: String) {
      cdkBuilder.routeType(routeType)
    }

    /**
     * The unique identifier of the service.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-refactorspaces-route.html#cfn-refactorspaces-route-serviceidentifier)
     * @param serviceIdentifier The unique identifier of the service. 
     */
    override fun serviceIdentifier(serviceIdentifier: String) {
      cdkBuilder.serviceIdentifier(serviceIdentifier)
    }

    /**
     * The tags assigned to the route.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-refactorspaces-route.html#cfn-refactorspaces-route-tags)
     * @param tags The tags assigned to the route. 
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    /**
     * The tags assigned to the route.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-refactorspaces-route.html#cfn-refactorspaces-route-tags)
     * @param tags The tags assigned to the route. 
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    /**
     * The configuration for the URI path route type.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-refactorspaces-route.html#cfn-refactorspaces-route-uripathroute)
     * @param uriPathRoute The configuration for the URI path route type. 
     */
    override fun uriPathRoute(uriPathRoute: IResolvable) {
      cdkBuilder.uriPathRoute(uriPathRoute.let(IResolvable::unwrap))
    }

    /**
     * The configuration for the URI path route type.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-refactorspaces-route.html#cfn-refactorspaces-route-uripathroute)
     * @param uriPathRoute The configuration for the URI path route type. 
     */
    override fun uriPathRoute(uriPathRoute: UriPathRouteInputProperty) {
      cdkBuilder.uriPathRoute(uriPathRoute.let(UriPathRouteInputProperty::unwrap))
    }

    /**
     * The configuration for the URI path route type.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-refactorspaces-route.html#cfn-refactorspaces-route-uripathroute)
     * @param uriPathRoute The configuration for the URI path route type. 
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("7b80c88766ed37adf2d5d8261d64bab5cfc07f8aee3d6690638691521de18a34")
    override fun uriPathRoute(uriPathRoute: UriPathRouteInputProperty.Builder.() -> Unit): Unit =
        uriPathRoute(UriPathRouteInputProperty(uriPathRoute))

    public fun build(): software.amazon.awscdk.services.refactorspaces.CfnRoute = cdkBuilder.build()
  }

  public companion object {
    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnRoute {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnRoute(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.refactorspaces.CfnRoute): CfnRoute
        = CfnRoute(cdkObject)

    internal fun unwrap(wrapped: CfnRoute): software.amazon.awscdk.services.refactorspaces.CfnRoute
        = wrapped.cdkObject
  }

  public interface UriPathRouteInputProperty {
    /**
     * If set to `ACTIVE` , traffic is forwarded to this route’s service after the route is created.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-refactorspaces-route-uripathrouteinput.html#cfn-refactorspaces-route-uripathrouteinput-activationstate)
     */
    public fun activationState(): String

    /**
     * If set to `true` , this option appends the source path to the service URL endpoint.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-refactorspaces-route-uripathrouteinput.html#cfn-refactorspaces-route-uripathrouteinput-appendsourcepath)
     */
    public fun appendSourcePath(): Any? = unwrap(this).getAppendSourcePath()

    /**
     * Indicates whether to match all subpaths of the given source path.
     *
     * If this value is `false` , requests must match the source path exactly before they are
     * forwarded to this route's service.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-refactorspaces-route-uripathrouteinput.html#cfn-refactorspaces-route-uripathrouteinput-includechildpaths)
     */
    public fun includeChildPaths(): Any? = unwrap(this).getIncludeChildPaths()

    /**
     * A list of HTTP methods to match.
     *
     * An empty list matches all values. If a method is present, only HTTP requests using that
     * method are forwarded to this route’s service.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-refactorspaces-route-uripathrouteinput.html#cfn-refactorspaces-route-uripathrouteinput-methods)
     */
    public fun methods(): List<String> = unwrap(this).getMethods() ?: emptyList()

    /**
     * This is the path that Refactor Spaces uses to match traffic.
     *
     * Paths must start with `/` and are relative to the base of the application. To use path
     * parameters in the source path, add a variable in curly braces. For example, the resource path
     * {user} represents a path parameter called 'user'.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-refactorspaces-route-uripathrouteinput.html#cfn-refactorspaces-route-uripathrouteinput-sourcepath)
     */
    public fun sourcePath(): String? = unwrap(this).getSourcePath()

    /**
     * A builder for [UriPathRouteInputProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param activationState If set to `ACTIVE` , traffic is forwarded to this route’s service
       * after the route is created. 
       */
      public fun activationState(activationState: String)

      /**
       * @param appendSourcePath If set to `true` , this option appends the source path to the
       * service URL endpoint.
       */
      public fun appendSourcePath(appendSourcePath: Boolean)

      /**
       * @param appendSourcePath If set to `true` , this option appends the source path to the
       * service URL endpoint.
       */
      public fun appendSourcePath(appendSourcePath: IResolvable)

      /**
       * @param includeChildPaths Indicates whether to match all subpaths of the given source path.
       * If this value is `false` , requests must match the source path exactly before they are
       * forwarded to this route's service.
       */
      public fun includeChildPaths(includeChildPaths: Boolean)

      /**
       * @param includeChildPaths Indicates whether to match all subpaths of the given source path.
       * If this value is `false` , requests must match the source path exactly before they are
       * forwarded to this route's service.
       */
      public fun includeChildPaths(includeChildPaths: IResolvable)

      /**
       * @param methods A list of HTTP methods to match.
       * An empty list matches all values. If a method is present, only HTTP requests using that
       * method are forwarded to this route’s service.
       */
      public fun methods(methods: List<String>)

      /**
       * @param methods A list of HTTP methods to match.
       * An empty list matches all values. If a method is present, only HTTP requests using that
       * method are forwarded to this route’s service.
       */
      public fun methods(vararg methods: String)

      /**
       * @param sourcePath This is the path that Refactor Spaces uses to match traffic.
       * Paths must start with `/` and are relative to the base of the application. To use path
       * parameters in the source path, add a variable in curly braces. For example, the resource path
       * {user} represents a path parameter called 'user'.
       */
      public fun sourcePath(sourcePath: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.refactorspaces.CfnRoute.UriPathRouteInputProperty.Builder
          =
          software.amazon.awscdk.services.refactorspaces.CfnRoute.UriPathRouteInputProperty.builder()

      /**
       * @param activationState If set to `ACTIVE` , traffic is forwarded to this route’s service
       * after the route is created. 
       */
      override fun activationState(activationState: String) {
        cdkBuilder.activationState(activationState)
      }

      /**
       * @param appendSourcePath If set to `true` , this option appends the source path to the
       * service URL endpoint.
       */
      override fun appendSourcePath(appendSourcePath: Boolean) {
        cdkBuilder.appendSourcePath(appendSourcePath)
      }

      /**
       * @param appendSourcePath If set to `true` , this option appends the source path to the
       * service URL endpoint.
       */
      override fun appendSourcePath(appendSourcePath: IResolvable) {
        cdkBuilder.appendSourcePath(appendSourcePath.let(IResolvable::unwrap))
      }

      /**
       * @param includeChildPaths Indicates whether to match all subpaths of the given source path.
       * If this value is `false` , requests must match the source path exactly before they are
       * forwarded to this route's service.
       */
      override fun includeChildPaths(includeChildPaths: Boolean) {
        cdkBuilder.includeChildPaths(includeChildPaths)
      }

      /**
       * @param includeChildPaths Indicates whether to match all subpaths of the given source path.
       * If this value is `false` , requests must match the source path exactly before they are
       * forwarded to this route's service.
       */
      override fun includeChildPaths(includeChildPaths: IResolvable) {
        cdkBuilder.includeChildPaths(includeChildPaths.let(IResolvable::unwrap))
      }

      /**
       * @param methods A list of HTTP methods to match.
       * An empty list matches all values. If a method is present, only HTTP requests using that
       * method are forwarded to this route’s service.
       */
      override fun methods(methods: List<String>) {
        cdkBuilder.methods(methods)
      }

      /**
       * @param methods A list of HTTP methods to match.
       * An empty list matches all values. If a method is present, only HTTP requests using that
       * method are forwarded to this route’s service.
       */
      override fun methods(vararg methods: String): Unit = methods(methods.toList())

      /**
       * @param sourcePath This is the path that Refactor Spaces uses to match traffic.
       * Paths must start with `/` and are relative to the base of the application. To use path
       * parameters in the source path, add a variable in curly braces. For example, the resource path
       * {user} represents a path parameter called 'user'.
       */
      override fun sourcePath(sourcePath: String) {
        cdkBuilder.sourcePath(sourcePath)
      }

      public fun build():
          software.amazon.awscdk.services.refactorspaces.CfnRoute.UriPathRouteInputProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.refactorspaces.CfnRoute.UriPathRouteInputProperty,
    ) : CdkObject(cdkObject), UriPathRouteInputProperty {
      /**
       * If set to `ACTIVE` , traffic is forwarded to this route’s service after the route is
       * created.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-refactorspaces-route-uripathrouteinput.html#cfn-refactorspaces-route-uripathrouteinput-activationstate)
       */
      override fun activationState(): String = unwrap(this).getActivationState()

      /**
       * If set to `true` , this option appends the source path to the service URL endpoint.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-refactorspaces-route-uripathrouteinput.html#cfn-refactorspaces-route-uripathrouteinput-appendsourcepath)
       */
      override fun appendSourcePath(): Any? = unwrap(this).getAppendSourcePath()

      /**
       * Indicates whether to match all subpaths of the given source path.
       *
       * If this value is `false` , requests must match the source path exactly before they are
       * forwarded to this route's service.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-refactorspaces-route-uripathrouteinput.html#cfn-refactorspaces-route-uripathrouteinput-includechildpaths)
       */
      override fun includeChildPaths(): Any? = unwrap(this).getIncludeChildPaths()

      /**
       * A list of HTTP methods to match.
       *
       * An empty list matches all values. If a method is present, only HTTP requests using that
       * method are forwarded to this route’s service.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-refactorspaces-route-uripathrouteinput.html#cfn-refactorspaces-route-uripathrouteinput-methods)
       */
      override fun methods(): List<String> = unwrap(this).getMethods() ?: emptyList()

      /**
       * This is the path that Refactor Spaces uses to match traffic.
       *
       * Paths must start with `/` and are relative to the base of the application. To use path
       * parameters in the source path, add a variable in curly braces. For example, the resource path
       * {user} represents a path parameter called 'user'.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-refactorspaces-route-uripathrouteinput.html#cfn-refactorspaces-route-uripathrouteinput-sourcepath)
       */
      override fun sourcePath(): String? = unwrap(this).getSourcePath()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): UriPathRouteInputProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.refactorspaces.CfnRoute.UriPathRouteInputProperty):
          UriPathRouteInputProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: UriPathRouteInputProperty):
          software.amazon.awscdk.services.refactorspaces.CfnRoute.UriPathRouteInputProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.refactorspaces.CfnRoute.UriPathRouteInputProperty
    }
  }

  public interface DefaultRouteInputProperty {
    /**
     * If set to `ACTIVE` , traffic is forwarded to this route’s service after the route is created.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-refactorspaces-route-defaultrouteinput.html#cfn-refactorspaces-route-defaultrouteinput-activationstate)
     */
    public fun activationState(): String

    /**
     * A builder for [DefaultRouteInputProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param activationState If set to `ACTIVE` , traffic is forwarded to this route’s service
       * after the route is created. 
       */
      public fun activationState(activationState: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.refactorspaces.CfnRoute.DefaultRouteInputProperty.Builder
          =
          software.amazon.awscdk.services.refactorspaces.CfnRoute.DefaultRouteInputProperty.builder()

      /**
       * @param activationState If set to `ACTIVE` , traffic is forwarded to this route’s service
       * after the route is created. 
       */
      override fun activationState(activationState: String) {
        cdkBuilder.activationState(activationState)
      }

      public fun build():
          software.amazon.awscdk.services.refactorspaces.CfnRoute.DefaultRouteInputProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.refactorspaces.CfnRoute.DefaultRouteInputProperty,
    ) : CdkObject(cdkObject), DefaultRouteInputProperty {
      /**
       * If set to `ACTIVE` , traffic is forwarded to this route’s service after the route is
       * created.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-refactorspaces-route-defaultrouteinput.html#cfn-refactorspaces-route-defaultrouteinput-activationstate)
       */
      override fun activationState(): String = unwrap(this).getActivationState()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): DefaultRouteInputProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.refactorspaces.CfnRoute.DefaultRouteInputProperty):
          DefaultRouteInputProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: DefaultRouteInputProperty):
          software.amazon.awscdk.services.refactorspaces.CfnRoute.DefaultRouteInputProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.refactorspaces.CfnRoute.DefaultRouteInputProperty
    }
  }
}
