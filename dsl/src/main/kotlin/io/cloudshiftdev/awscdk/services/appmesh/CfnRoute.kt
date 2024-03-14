package io.cloudshiftdev.awscdk.services.appmesh

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.ITaggable
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import kotlin.Any
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnRoute internal constructor(
  private val cdkObject: software.amazon.awscdk.services.appmesh.CfnRoute,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  public open fun attrArn(): String = unwrap(this).getAttrArn()

  public open fun attrId(): String = unwrap(this).getAttrId()

  public open fun attrMeshName(): String = unwrap(this).getAttrMeshName()

  public open fun attrMeshOwner(): String = unwrap(this).getAttrMeshOwner()

  public open fun attrResourceOwner(): String = unwrap(this).getAttrResourceOwner()

  public open fun attrRouteName(): String = unwrap(this).getAttrRouteName()

  public open fun attrUid(): String = unwrap(this).getAttrUid()

  public open fun attrVirtualRouterName(): String = unwrap(this).getAttrVirtualRouterName()

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun meshName(): String = unwrap(this).getMeshName()

  public open fun meshName(`value`: String) {
    unwrap(this).setMeshName(`value`)
  }

  public open fun meshOwner(): String? = unwrap(this).getMeshOwner()

  public open fun meshOwner(`value`: String) {
    unwrap(this).setMeshOwner(`value`)
  }

  public open fun routeName(): String? = unwrap(this).getRouteName()

  public open fun routeName(`value`: String) {
    unwrap(this).setRouteName(`value`)
  }

  public open fun spec(): Any = unwrap(this).getSpec()

  public open fun spec(`value`: IResolvable) {
    unwrap(this).setSpec(`value`.let(IResolvable::unwrap))
  }

  public open fun spec(`value`: RouteSpecProperty) {
    unwrap(this).setSpec(`value`.let(RouteSpecProperty::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("37d15b17e758c33aa05b5db1d559f8b7497906b06f6973f34c47684ceed07b93")
  public open fun spec(`value`: RouteSpecProperty.Builder.() -> Unit): Unit =
      spec(RouteSpecProperty(`value`))

  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  public open fun tagsRaw(): List<CfnTag> = unwrap(this).getTagsRaw()?.map(CfnTag::wrap) ?:
      emptyList()

  public open fun tagsRaw(`value`: List<CfnTag>) {
    unwrap(this).setTagsRaw(`value`.map(CfnTag::unwrap))
  }

  public open fun virtualRouterName(): String = unwrap(this).getVirtualRouterName()

  public open fun virtualRouterName(`value`: String) {
    unwrap(this).setVirtualRouterName(`value`)
  }

  public interface Builder {
    public fun meshName(meshName: String) {
    }

    public fun meshOwner(meshOwner: String) {
    }

    public fun routeName(routeName: String) {
    }

    public fun spec(spec: IResolvable) {
    }

    public fun spec(spec: RouteSpecProperty) {
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("6bd3bb53228229fae0cceefb48e1b5851f9d5e3ca7080532dc3bf7a0b4e48d0c")
    public fun spec(spec: RouteSpecProperty.Builder.() -> Unit) {
    }

    public fun tags(tags: List<CfnTag>) {
    }

    public fun virtualRouterName(virtualRouterName: String) {
    }
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.appmesh.CfnRoute.Builder =
        software.amazon.awscdk.services.appmesh.CfnRoute.Builder.create(scope, id)

    public override fun meshName(meshName: String) {
      cdkBuilder.meshName(meshName)
    }

    public override fun meshOwner(meshOwner: String) {
      cdkBuilder.meshOwner(meshOwner)
    }

    public override fun routeName(routeName: String) {
      cdkBuilder.routeName(routeName)
    }

    public override fun spec(spec: IResolvable) {
      cdkBuilder.spec(spec.let(IResolvable::unwrap))
    }

    public override fun spec(spec: RouteSpecProperty) {
      cdkBuilder.spec(spec.let(RouteSpecProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("6bd3bb53228229fae0cceefb48e1b5851f9d5e3ca7080532dc3bf7a0b4e48d0c")
    public override fun spec(spec: RouteSpecProperty.Builder.() -> Unit): Unit =
        spec(RouteSpecProperty(spec))

    public override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    public override fun virtualRouterName(virtualRouterName: String) {
      cdkBuilder.virtualRouterName(virtualRouterName)
    }

    public fun build(): software.amazon.awscdk.services.appmesh.CfnRoute = cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnRoute {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnRoute(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.appmesh.CfnRoute): CfnRoute =
        CfnRoute(cdkObject)

    internal fun unwrap(wrapped: CfnRoute): software.amazon.awscdk.services.appmesh.CfnRoute =
        wrapped.cdkObject
  }

  public interface HttpPathMatchProperty {
    public fun exact(): String? = unwrap(this).getExact()

    public fun regex(): String? = unwrap(this).getRegex()

    public interface Builder {
      public fun exact(exact: String) {
      }

      public fun regex(regex: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.appmesh.CfnRoute.HttpPathMatchProperty.Builder =
          software.amazon.awscdk.services.appmesh.CfnRoute.HttpPathMatchProperty.builder()

      public override fun exact(exact: String) {
        cdkBuilder.exact(exact)
      }

      public override fun regex(regex: String) {
        cdkBuilder.regex(regex)
      }

      public fun build(): software.amazon.awscdk.services.appmesh.CfnRoute.HttpPathMatchProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.appmesh.CfnRoute.HttpPathMatchProperty,
    ) : HttpPathMatchProperty {
      public override fun exact(): String? = unwrap(this).getExact()

      public override fun regex(): String? = unwrap(this).getRegex()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): HttpPathMatchProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.appmesh.CfnRoute.HttpPathMatchProperty):
          HttpPathMatchProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: HttpPathMatchProperty):
          software.amazon.awscdk.services.appmesh.CfnRoute.HttpPathMatchProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface RouteSpecProperty {
    public fun grpcRoute(): Any? = unwrap(this).getGrpcRoute()

    public fun http2Route(): Any? = unwrap(this).getHttp2Route()

    public fun httpRoute(): Any? = unwrap(this).getHttpRoute()

    public fun priority(): Number? = unwrap(this).getPriority()

    public fun tcpRoute(): Any? = unwrap(this).getTcpRoute()

    public interface Builder {
      public fun grpcRoute(grpcRoute: IResolvable) {
      }

      public fun grpcRoute(grpcRoute: GrpcRouteProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("cbdadec527d34bd78b39af2dfdbbc42bb4df8c408da6f690eeb5fa7bb6ddcc74")
      public fun grpcRoute(grpcRoute: GrpcRouteProperty.Builder.() -> Unit) {
      }

      public fun http2Route(http2Route: IResolvable) {
      }

      public fun http2Route(http2Route: HttpRouteProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("26be42793e7e56ac8156a7a3284fd66a3d2eaf90bc800164b5789df69578b60f")
      public fun http2Route(http2Route: HttpRouteProperty.Builder.() -> Unit) {
      }

      public fun httpRoute(httpRoute: IResolvable) {
      }

      public fun httpRoute(httpRoute: HttpRouteProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("fbeb9b2b8b24dafc5b8f75a639849958e9396b9f9e5e302cea9154cb782f3573")
      public fun httpRoute(httpRoute: HttpRouteProperty.Builder.() -> Unit) {
      }

      public fun priority(priority: Number) {
      }

      public fun tcpRoute(tcpRoute: IResolvable) {
      }

      public fun tcpRoute(tcpRoute: TcpRouteProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("959cbe7f10e9b2da8b439898cdb3ad12ea06da8821e030a6c35a46c900dc6c49")
      public fun tcpRoute(tcpRoute: TcpRouteProperty.Builder.() -> Unit) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.appmesh.CfnRoute.RouteSpecProperty.Builder =
          software.amazon.awscdk.services.appmesh.CfnRoute.RouteSpecProperty.builder()

      public override fun grpcRoute(grpcRoute: IResolvable) {
        cdkBuilder.grpcRoute(grpcRoute.let(IResolvable::unwrap))
      }

      public override fun grpcRoute(grpcRoute: GrpcRouteProperty) {
        cdkBuilder.grpcRoute(grpcRoute.let(GrpcRouteProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("cbdadec527d34bd78b39af2dfdbbc42bb4df8c408da6f690eeb5fa7bb6ddcc74")
      public override fun grpcRoute(grpcRoute: GrpcRouteProperty.Builder.() -> Unit): Unit =
          grpcRoute(GrpcRouteProperty(grpcRoute))

      public override fun http2Route(http2Route: IResolvable) {
        cdkBuilder.http2Route(http2Route.let(IResolvable::unwrap))
      }

      public override fun http2Route(http2Route: HttpRouteProperty) {
        cdkBuilder.http2Route(http2Route.let(HttpRouteProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("26be42793e7e56ac8156a7a3284fd66a3d2eaf90bc800164b5789df69578b60f")
      public override fun http2Route(http2Route: HttpRouteProperty.Builder.() -> Unit): Unit =
          http2Route(HttpRouteProperty(http2Route))

      public override fun httpRoute(httpRoute: IResolvable) {
        cdkBuilder.httpRoute(httpRoute.let(IResolvable::unwrap))
      }

      public override fun httpRoute(httpRoute: HttpRouteProperty) {
        cdkBuilder.httpRoute(httpRoute.let(HttpRouteProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("fbeb9b2b8b24dafc5b8f75a639849958e9396b9f9e5e302cea9154cb782f3573")
      public override fun httpRoute(httpRoute: HttpRouteProperty.Builder.() -> Unit): Unit =
          httpRoute(HttpRouteProperty(httpRoute))

      public override fun priority(priority: Number) {
        cdkBuilder.priority(priority)
      }

      public override fun tcpRoute(tcpRoute: IResolvable) {
        cdkBuilder.tcpRoute(tcpRoute.let(IResolvable::unwrap))
      }

      public override fun tcpRoute(tcpRoute: TcpRouteProperty) {
        cdkBuilder.tcpRoute(tcpRoute.let(TcpRouteProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("959cbe7f10e9b2da8b439898cdb3ad12ea06da8821e030a6c35a46c900dc6c49")
      public override fun tcpRoute(tcpRoute: TcpRouteProperty.Builder.() -> Unit): Unit =
          tcpRoute(TcpRouteProperty(tcpRoute))

      public fun build(): software.amazon.awscdk.services.appmesh.CfnRoute.RouteSpecProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject: software.amazon.awscdk.services.appmesh.CfnRoute.RouteSpecProperty,
    ) : RouteSpecProperty {
      public override fun grpcRoute(): Any? = unwrap(this).getGrpcRoute()

      public override fun http2Route(): Any? = unwrap(this).getHttp2Route()

      public override fun httpRoute(): Any? = unwrap(this).getHttpRoute()

      public override fun priority(): Number? = unwrap(this).getPriority()

      public override fun tcpRoute(): Any? = unwrap(this).getTcpRoute()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): RouteSpecProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.appmesh.CfnRoute.RouteSpecProperty):
          RouteSpecProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: RouteSpecProperty):
          software.amazon.awscdk.services.appmesh.CfnRoute.RouteSpecProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface GrpcRetryPolicyProperty {
    public fun grpcRetryEvents(): List<String> = unwrap(this).getGrpcRetryEvents() ?: emptyList()

    public fun httpRetryEvents(): List<String> = unwrap(this).getHttpRetryEvents() ?: emptyList()

    public fun maxRetries(): Number

    public fun perRetryTimeout(): Any

    public fun tcpRetryEvents(): List<String> = unwrap(this).getTcpRetryEvents() ?: emptyList()

    public interface Builder {
      public fun grpcRetryEvents(grpcRetryEvents: List<String>) {
      }

      public fun httpRetryEvents(httpRetryEvents: List<String>) {
      }

      public fun maxRetries(maxRetries: Number) {
      }

      public fun perRetryTimeout(perRetryTimeout: IResolvable) {
      }

      public fun perRetryTimeout(perRetryTimeout: DurationProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("0f84d4790e12379b813a871dc18f0d69c391e54d630a717cf6e9948bd0f55ff5")
      public fun perRetryTimeout(perRetryTimeout: DurationProperty.Builder.() -> Unit) {
      }

      public fun tcpRetryEvents(tcpRetryEvents: List<String>) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.appmesh.CfnRoute.GrpcRetryPolicyProperty.Builder =
          software.amazon.awscdk.services.appmesh.CfnRoute.GrpcRetryPolicyProperty.builder()

      public override fun grpcRetryEvents(grpcRetryEvents: List<String>) {
        cdkBuilder.grpcRetryEvents(grpcRetryEvents)
      }

      public override fun httpRetryEvents(httpRetryEvents: List<String>) {
        cdkBuilder.httpRetryEvents(httpRetryEvents)
      }

      public override fun maxRetries(maxRetries: Number) {
        cdkBuilder.maxRetries(maxRetries)
      }

      public override fun perRetryTimeout(perRetryTimeout: IResolvable) {
        cdkBuilder.perRetryTimeout(perRetryTimeout.let(IResolvable::unwrap))
      }

      public override fun perRetryTimeout(perRetryTimeout: DurationProperty) {
        cdkBuilder.perRetryTimeout(perRetryTimeout.let(DurationProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("0f84d4790e12379b813a871dc18f0d69c391e54d630a717cf6e9948bd0f55ff5")
      public override fun perRetryTimeout(perRetryTimeout: DurationProperty.Builder.() -> Unit):
          Unit = perRetryTimeout(DurationProperty(perRetryTimeout))

      public override fun tcpRetryEvents(tcpRetryEvents: List<String>) {
        cdkBuilder.tcpRetryEvents(tcpRetryEvents)
      }

      public fun build(): software.amazon.awscdk.services.appmesh.CfnRoute.GrpcRetryPolicyProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.appmesh.CfnRoute.GrpcRetryPolicyProperty,
    ) : GrpcRetryPolicyProperty {
      public override fun grpcRetryEvents(): List<String> = unwrap(this).getGrpcRetryEvents() ?:
          emptyList()

      public override fun httpRetryEvents(): List<String> = unwrap(this).getHttpRetryEvents() ?:
          emptyList()

      public override fun maxRetries(): Number = unwrap(this).getMaxRetries()

      public override fun perRetryTimeout(): Any = unwrap(this).getPerRetryTimeout()

      public override fun tcpRetryEvents(): List<String> = unwrap(this).getTcpRetryEvents() ?:
          emptyList()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): GrpcRetryPolicyProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.appmesh.CfnRoute.GrpcRetryPolicyProperty):
          GrpcRetryPolicyProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: GrpcRetryPolicyProperty):
          software.amazon.awscdk.services.appmesh.CfnRoute.GrpcRetryPolicyProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface TcpRouteActionProperty {
    public fun weightedTargets(): Any

    public interface Builder {
      public fun weightedTargets(weightedTargets: IResolvable) {
      }

      public fun weightedTargets(weightedTargets: List<Any>) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.appmesh.CfnRoute.TcpRouteActionProperty.Builder =
          software.amazon.awscdk.services.appmesh.CfnRoute.TcpRouteActionProperty.builder()

      public override fun weightedTargets(weightedTargets: IResolvable) {
        cdkBuilder.weightedTargets(weightedTargets.let(IResolvable::unwrap))
      }

      public override fun weightedTargets(weightedTargets: List<Any>) {
        cdkBuilder.weightedTargets(weightedTargets)
      }

      public fun build(): software.amazon.awscdk.services.appmesh.CfnRoute.TcpRouteActionProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.appmesh.CfnRoute.TcpRouteActionProperty,
    ) : TcpRouteActionProperty {
      public override fun weightedTargets(): Any = unwrap(this).getWeightedTargets()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): TcpRouteActionProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.appmesh.CfnRoute.TcpRouteActionProperty):
          TcpRouteActionProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: TcpRouteActionProperty):
          software.amazon.awscdk.services.appmesh.CfnRoute.TcpRouteActionProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface HttpQueryParameterMatchProperty {
    public fun exact(): String? = unwrap(this).getExact()

    public interface Builder {
      public fun exact(exact: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.appmesh.CfnRoute.HttpQueryParameterMatchProperty.Builder =
          software.amazon.awscdk.services.appmesh.CfnRoute.HttpQueryParameterMatchProperty.builder()

      public override fun exact(exact: String) {
        cdkBuilder.exact(exact)
      }

      public fun build():
          software.amazon.awscdk.services.appmesh.CfnRoute.HttpQueryParameterMatchProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.appmesh.CfnRoute.HttpQueryParameterMatchProperty,
    ) : HttpQueryParameterMatchProperty {
      public override fun exact(): String? = unwrap(this).getExact()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): HttpQueryParameterMatchProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.appmesh.CfnRoute.HttpQueryParameterMatchProperty):
          HttpQueryParameterMatchProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: HttpQueryParameterMatchProperty):
          software.amazon.awscdk.services.appmesh.CfnRoute.HttpQueryParameterMatchProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface GrpcRouteActionProperty {
    public fun weightedTargets(): Any

    public interface Builder {
      public fun weightedTargets(weightedTargets: IResolvable) {
      }

      public fun weightedTargets(weightedTargets: List<Any>) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.appmesh.CfnRoute.GrpcRouteActionProperty.Builder =
          software.amazon.awscdk.services.appmesh.CfnRoute.GrpcRouteActionProperty.builder()

      public override fun weightedTargets(weightedTargets: IResolvable) {
        cdkBuilder.weightedTargets(weightedTargets.let(IResolvable::unwrap))
      }

      public override fun weightedTargets(weightedTargets: List<Any>) {
        cdkBuilder.weightedTargets(weightedTargets)
      }

      public fun build(): software.amazon.awscdk.services.appmesh.CfnRoute.GrpcRouteActionProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.appmesh.CfnRoute.GrpcRouteActionProperty,
    ) : GrpcRouteActionProperty {
      public override fun weightedTargets(): Any = unwrap(this).getWeightedTargets()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): GrpcRouteActionProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.appmesh.CfnRoute.GrpcRouteActionProperty):
          GrpcRouteActionProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: GrpcRouteActionProperty):
          software.amazon.awscdk.services.appmesh.CfnRoute.GrpcRouteActionProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface TcpRouteMatchProperty {
    public fun port(): Number? = unwrap(this).getPort()

    public interface Builder {
      public fun port(port: Number) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.appmesh.CfnRoute.TcpRouteMatchProperty.Builder =
          software.amazon.awscdk.services.appmesh.CfnRoute.TcpRouteMatchProperty.builder()

      public override fun port(port: Number) {
        cdkBuilder.port(port)
      }

      public fun build(): software.amazon.awscdk.services.appmesh.CfnRoute.TcpRouteMatchProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.appmesh.CfnRoute.TcpRouteMatchProperty,
    ) : TcpRouteMatchProperty {
      public override fun port(): Number? = unwrap(this).getPort()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): TcpRouteMatchProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.appmesh.CfnRoute.TcpRouteMatchProperty):
          TcpRouteMatchProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: TcpRouteMatchProperty):
          software.amazon.awscdk.services.appmesh.CfnRoute.TcpRouteMatchProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface HttpRouteMatchProperty {
    public fun headers(): Any? = unwrap(this).getHeaders()

    public fun method(): String? = unwrap(this).getMethod()

    public fun path(): Any? = unwrap(this).getPath()

    public fun port(): Number? = unwrap(this).getPort()

    public fun prefix(): String? = unwrap(this).getPrefix()

    public fun queryParameters(): Any? = unwrap(this).getQueryParameters()

    public fun scheme(): String? = unwrap(this).getScheme()

    public interface Builder {
      public fun headers(headers: IResolvable) {
      }

      public fun headers(headers: List<Any>) {
      }

      public fun method(method: String) {
      }

      public fun path(path: IResolvable) {
      }

      public fun path(path: HttpPathMatchProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("009420f2969a20c35f935fa5a7d88970b02cead52cdf6653a70335ca15e7b8cb")
      public fun path(path: HttpPathMatchProperty.Builder.() -> Unit) {
      }

      public fun port(port: Number) {
      }

      public fun prefix(prefix: String) {
      }

      public fun queryParameters(queryParameters: IResolvable) {
      }

      public fun queryParameters(queryParameters: List<Any>) {
      }

      public fun scheme(scheme: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.appmesh.CfnRoute.HttpRouteMatchProperty.Builder =
          software.amazon.awscdk.services.appmesh.CfnRoute.HttpRouteMatchProperty.builder()

      public override fun headers(headers: IResolvable) {
        cdkBuilder.headers(headers.let(IResolvable::unwrap))
      }

      public override fun headers(headers: List<Any>) {
        cdkBuilder.headers(headers)
      }

      public override fun method(method: String) {
        cdkBuilder.method(method)
      }

      public override fun path(path: IResolvable) {
        cdkBuilder.path(path.let(IResolvable::unwrap))
      }

      public override fun path(path: HttpPathMatchProperty) {
        cdkBuilder.path(path.let(HttpPathMatchProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("009420f2969a20c35f935fa5a7d88970b02cead52cdf6653a70335ca15e7b8cb")
      public override fun path(path: HttpPathMatchProperty.Builder.() -> Unit): Unit =
          path(HttpPathMatchProperty(path))

      public override fun port(port: Number) {
        cdkBuilder.port(port)
      }

      public override fun prefix(prefix: String) {
        cdkBuilder.prefix(prefix)
      }

      public override fun queryParameters(queryParameters: IResolvable) {
        cdkBuilder.queryParameters(queryParameters.let(IResolvable::unwrap))
      }

      public override fun queryParameters(queryParameters: List<Any>) {
        cdkBuilder.queryParameters(queryParameters)
      }

      public override fun scheme(scheme: String) {
        cdkBuilder.scheme(scheme)
      }

      public fun build(): software.amazon.awscdk.services.appmesh.CfnRoute.HttpRouteMatchProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.appmesh.CfnRoute.HttpRouteMatchProperty,
    ) : HttpRouteMatchProperty {
      public override fun headers(): Any? = unwrap(this).getHeaders()

      public override fun method(): String? = unwrap(this).getMethod()

      public override fun path(): Any? = unwrap(this).getPath()

      public override fun port(): Number? = unwrap(this).getPort()

      public override fun prefix(): String? = unwrap(this).getPrefix()

      public override fun queryParameters(): Any? = unwrap(this).getQueryParameters()

      public override fun scheme(): String? = unwrap(this).getScheme()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): HttpRouteMatchProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.appmesh.CfnRoute.HttpRouteMatchProperty):
          HttpRouteMatchProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: HttpRouteMatchProperty):
          software.amazon.awscdk.services.appmesh.CfnRoute.HttpRouteMatchProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface GrpcRouteProperty {
    public fun action(): Any

    public fun match(): Any

    public fun retryPolicy(): Any? = unwrap(this).getRetryPolicy()

    public fun timeout(): Any? = unwrap(this).getTimeout()

    public interface Builder {
      public fun action(action: IResolvable) {
      }

      public fun action(action: GrpcRouteActionProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("deb356349d43b14b819c27ec44bcfabbef82f200fa82ab4ce6c3de51f38ac167")
      public fun action(action: GrpcRouteActionProperty.Builder.() -> Unit) {
      }

      public fun match(match: IResolvable) {
      }

      public fun match(match: GrpcRouteMatchProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("009ee1182c5e9df562b3e667c43d88998718ea63df21ccdbb5c29ecaacdd6a4e")
      public fun match(match: GrpcRouteMatchProperty.Builder.() -> Unit) {
      }

      public fun retryPolicy(retryPolicy: IResolvable) {
      }

      public fun retryPolicy(retryPolicy: GrpcRetryPolicyProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("2d0404dbdc3e4067a9ee29cf3c155d2a25d2a1e53f23d6a731943ab905531f27")
      public fun retryPolicy(retryPolicy: GrpcRetryPolicyProperty.Builder.() -> Unit) {
      }

      public fun timeout(timeout: IResolvable) {
      }

      public fun timeout(timeout: GrpcTimeoutProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("1ab6b3ffbf90f3d4463628beddf62a71100df5d666e0c39dcc5df20e8cd51c80")
      public fun timeout(timeout: GrpcTimeoutProperty.Builder.() -> Unit) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.appmesh.CfnRoute.GrpcRouteProperty.Builder =
          software.amazon.awscdk.services.appmesh.CfnRoute.GrpcRouteProperty.builder()

      public override fun action(action: IResolvable) {
        cdkBuilder.action(action.let(IResolvable::unwrap))
      }

      public override fun action(action: GrpcRouteActionProperty) {
        cdkBuilder.action(action.let(GrpcRouteActionProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("deb356349d43b14b819c27ec44bcfabbef82f200fa82ab4ce6c3de51f38ac167")
      public override fun action(action: GrpcRouteActionProperty.Builder.() -> Unit): Unit =
          action(GrpcRouteActionProperty(action))

      public override fun match(match: IResolvable) {
        cdkBuilder.match(match.let(IResolvable::unwrap))
      }

      public override fun match(match: GrpcRouteMatchProperty) {
        cdkBuilder.match(match.let(GrpcRouteMatchProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("009ee1182c5e9df562b3e667c43d88998718ea63df21ccdbb5c29ecaacdd6a4e")
      public override fun match(match: GrpcRouteMatchProperty.Builder.() -> Unit): Unit =
          match(GrpcRouteMatchProperty(match))

      public override fun retryPolicy(retryPolicy: IResolvable) {
        cdkBuilder.retryPolicy(retryPolicy.let(IResolvable::unwrap))
      }

      public override fun retryPolicy(retryPolicy: GrpcRetryPolicyProperty) {
        cdkBuilder.retryPolicy(retryPolicy.let(GrpcRetryPolicyProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("2d0404dbdc3e4067a9ee29cf3c155d2a25d2a1e53f23d6a731943ab905531f27")
      public override fun retryPolicy(retryPolicy: GrpcRetryPolicyProperty.Builder.() -> Unit): Unit
          = retryPolicy(GrpcRetryPolicyProperty(retryPolicy))

      public override fun timeout(timeout: IResolvable) {
        cdkBuilder.timeout(timeout.let(IResolvable::unwrap))
      }

      public override fun timeout(timeout: GrpcTimeoutProperty) {
        cdkBuilder.timeout(timeout.let(GrpcTimeoutProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("1ab6b3ffbf90f3d4463628beddf62a71100df5d666e0c39dcc5df20e8cd51c80")
      public override fun timeout(timeout: GrpcTimeoutProperty.Builder.() -> Unit): Unit =
          timeout(GrpcTimeoutProperty(timeout))

      public fun build(): software.amazon.awscdk.services.appmesh.CfnRoute.GrpcRouteProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject: software.amazon.awscdk.services.appmesh.CfnRoute.GrpcRouteProperty,
    ) : GrpcRouteProperty {
      public override fun action(): Any = unwrap(this).getAction()

      public override fun match(): Any = unwrap(this).getMatch()

      public override fun retryPolicy(): Any? = unwrap(this).getRetryPolicy()

      public override fun timeout(): Any? = unwrap(this).getTimeout()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): GrpcRouteProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.appmesh.CfnRoute.GrpcRouteProperty):
          GrpcRouteProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: GrpcRouteProperty):
          software.amazon.awscdk.services.appmesh.CfnRoute.GrpcRouteProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface HttpRouteActionProperty {
    public fun weightedTargets(): Any

    public interface Builder {
      public fun weightedTargets(weightedTargets: IResolvable) {
      }

      public fun weightedTargets(weightedTargets: List<Any>) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.appmesh.CfnRoute.HttpRouteActionProperty.Builder =
          software.amazon.awscdk.services.appmesh.CfnRoute.HttpRouteActionProperty.builder()

      public override fun weightedTargets(weightedTargets: IResolvable) {
        cdkBuilder.weightedTargets(weightedTargets.let(IResolvable::unwrap))
      }

      public override fun weightedTargets(weightedTargets: List<Any>) {
        cdkBuilder.weightedTargets(weightedTargets)
      }

      public fun build(): software.amazon.awscdk.services.appmesh.CfnRoute.HttpRouteActionProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.appmesh.CfnRoute.HttpRouteActionProperty,
    ) : HttpRouteActionProperty {
      public override fun weightedTargets(): Any = unwrap(this).getWeightedTargets()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): HttpRouteActionProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.appmesh.CfnRoute.HttpRouteActionProperty):
          HttpRouteActionProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: HttpRouteActionProperty):
          software.amazon.awscdk.services.appmesh.CfnRoute.HttpRouteActionProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface MatchRangeProperty {
    public fun end(): Number

    public fun start(): Number

    public interface Builder {
      public fun end(end: Number) {
      }

      public fun start(start: Number) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.appmesh.CfnRoute.MatchRangeProperty.Builder =
          software.amazon.awscdk.services.appmesh.CfnRoute.MatchRangeProperty.builder()

      public override fun end(end: Number) {
        cdkBuilder.end(end)
      }

      public override fun start(start: Number) {
        cdkBuilder.start(start)
      }

      public fun build(): software.amazon.awscdk.services.appmesh.CfnRoute.MatchRangeProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject: software.amazon.awscdk.services.appmesh.CfnRoute.MatchRangeProperty,
    ) : MatchRangeProperty {
      public override fun end(): Number = unwrap(this).getEnd()

      public override fun start(): Number = unwrap(this).getStart()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): MatchRangeProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.appmesh.CfnRoute.MatchRangeProperty):
          MatchRangeProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: MatchRangeProperty):
          software.amazon.awscdk.services.appmesh.CfnRoute.MatchRangeProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface TcpRouteProperty {
    public fun action(): Any

    public fun match(): Any? = unwrap(this).getMatch()

    public fun timeout(): Any? = unwrap(this).getTimeout()

    public interface Builder {
      public fun action(action: IResolvable) {
      }

      public fun action(action: TcpRouteActionProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("62d055f4c1c68793ad51559c95d77ed9a50b791fecfd73686943286c1198917a")
      public fun action(action: TcpRouteActionProperty.Builder.() -> Unit) {
      }

      public fun match(match: IResolvable) {
      }

      public fun match(match: TcpRouteMatchProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("f42835d85357504b2baa3fad47e076d767de55be0a7faf135b1bc2002132c891")
      public fun match(match: TcpRouteMatchProperty.Builder.() -> Unit) {
      }

      public fun timeout(timeout: IResolvable) {
      }

      public fun timeout(timeout: TcpTimeoutProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("41979e326604c0b0b062081fded5dec4fd8a862e343227bcbed8b3baefb8de87")
      public fun timeout(timeout: TcpTimeoutProperty.Builder.() -> Unit) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.appmesh.CfnRoute.TcpRouteProperty.Builder =
          software.amazon.awscdk.services.appmesh.CfnRoute.TcpRouteProperty.builder()

      public override fun action(action: IResolvable) {
        cdkBuilder.action(action.let(IResolvable::unwrap))
      }

      public override fun action(action: TcpRouteActionProperty) {
        cdkBuilder.action(action.let(TcpRouteActionProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("62d055f4c1c68793ad51559c95d77ed9a50b791fecfd73686943286c1198917a")
      public override fun action(action: TcpRouteActionProperty.Builder.() -> Unit): Unit =
          action(TcpRouteActionProperty(action))

      public override fun match(match: IResolvable) {
        cdkBuilder.match(match.let(IResolvable::unwrap))
      }

      public override fun match(match: TcpRouteMatchProperty) {
        cdkBuilder.match(match.let(TcpRouteMatchProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("f42835d85357504b2baa3fad47e076d767de55be0a7faf135b1bc2002132c891")
      public override fun match(match: TcpRouteMatchProperty.Builder.() -> Unit): Unit =
          match(TcpRouteMatchProperty(match))

      public override fun timeout(timeout: IResolvable) {
        cdkBuilder.timeout(timeout.let(IResolvable::unwrap))
      }

      public override fun timeout(timeout: TcpTimeoutProperty) {
        cdkBuilder.timeout(timeout.let(TcpTimeoutProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("41979e326604c0b0b062081fded5dec4fd8a862e343227bcbed8b3baefb8de87")
      public override fun timeout(timeout: TcpTimeoutProperty.Builder.() -> Unit): Unit =
          timeout(TcpTimeoutProperty(timeout))

      public fun build(): software.amazon.awscdk.services.appmesh.CfnRoute.TcpRouteProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject: software.amazon.awscdk.services.appmesh.CfnRoute.TcpRouteProperty,
    ) : TcpRouteProperty {
      public override fun action(): Any = unwrap(this).getAction()

      public override fun match(): Any? = unwrap(this).getMatch()

      public override fun timeout(): Any? = unwrap(this).getTimeout()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): TcpRouteProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.appmesh.CfnRoute.TcpRouteProperty):
          TcpRouteProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: TcpRouteProperty):
          software.amazon.awscdk.services.appmesh.CfnRoute.TcpRouteProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface TcpTimeoutProperty {
    public fun idle(): Any? = unwrap(this).getIdle()

    public interface Builder {
      public fun idle(idle: IResolvable) {
      }

      public fun idle(idle: DurationProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("1c4160b98941c730a1e2015fb21c37469fa386be6106183c7f29c91982b2f7a7")
      public fun idle(idle: DurationProperty.Builder.() -> Unit) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.appmesh.CfnRoute.TcpTimeoutProperty.Builder =
          software.amazon.awscdk.services.appmesh.CfnRoute.TcpTimeoutProperty.builder()

      public override fun idle(idle: IResolvable) {
        cdkBuilder.idle(idle.let(IResolvable::unwrap))
      }

      public override fun idle(idle: DurationProperty) {
        cdkBuilder.idle(idle.let(DurationProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("1c4160b98941c730a1e2015fb21c37469fa386be6106183c7f29c91982b2f7a7")
      public override fun idle(idle: DurationProperty.Builder.() -> Unit): Unit =
          idle(DurationProperty(idle))

      public fun build(): software.amazon.awscdk.services.appmesh.CfnRoute.TcpTimeoutProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject: software.amazon.awscdk.services.appmesh.CfnRoute.TcpTimeoutProperty,
    ) : TcpTimeoutProperty {
      public override fun idle(): Any? = unwrap(this).getIdle()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): TcpTimeoutProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.appmesh.CfnRoute.TcpTimeoutProperty):
          TcpTimeoutProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: TcpTimeoutProperty):
          software.amazon.awscdk.services.appmesh.CfnRoute.TcpTimeoutProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface GrpcTimeoutProperty {
    public fun idle(): Any? = unwrap(this).getIdle()

    public fun perRequest(): Any? = unwrap(this).getPerRequest()

    public interface Builder {
      public fun idle(idle: IResolvable) {
      }

      public fun idle(idle: DurationProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("95c5794f36a0a9c9668fb52ca7fb2a4b5c359637bc1d4d2ed2cb6b36aef36fdf")
      public fun idle(idle: DurationProperty.Builder.() -> Unit) {
      }

      public fun perRequest(perRequest: IResolvable) {
      }

      public fun perRequest(perRequest: DurationProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("f5438550ba4fd648dc25d25dc5a576a858788355a6ecf2edae71d1633f3f004b")
      public fun perRequest(perRequest: DurationProperty.Builder.() -> Unit) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.appmesh.CfnRoute.GrpcTimeoutProperty.Builder =
          software.amazon.awscdk.services.appmesh.CfnRoute.GrpcTimeoutProperty.builder()

      public override fun idle(idle: IResolvable) {
        cdkBuilder.idle(idle.let(IResolvable::unwrap))
      }

      public override fun idle(idle: DurationProperty) {
        cdkBuilder.idle(idle.let(DurationProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("95c5794f36a0a9c9668fb52ca7fb2a4b5c359637bc1d4d2ed2cb6b36aef36fdf")
      public override fun idle(idle: DurationProperty.Builder.() -> Unit): Unit =
          idle(DurationProperty(idle))

      public override fun perRequest(perRequest: IResolvable) {
        cdkBuilder.perRequest(perRequest.let(IResolvable::unwrap))
      }

      public override fun perRequest(perRequest: DurationProperty) {
        cdkBuilder.perRequest(perRequest.let(DurationProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("f5438550ba4fd648dc25d25dc5a576a858788355a6ecf2edae71d1633f3f004b")
      public override fun perRequest(perRequest: DurationProperty.Builder.() -> Unit): Unit =
          perRequest(DurationProperty(perRequest))

      public fun build(): software.amazon.awscdk.services.appmesh.CfnRoute.GrpcTimeoutProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject: software.amazon.awscdk.services.appmesh.CfnRoute.GrpcTimeoutProperty,
    ) : GrpcTimeoutProperty {
      public override fun idle(): Any? = unwrap(this).getIdle()

      public override fun perRequest(): Any? = unwrap(this).getPerRequest()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): GrpcTimeoutProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.appmesh.CfnRoute.GrpcTimeoutProperty):
          GrpcTimeoutProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: GrpcTimeoutProperty):
          software.amazon.awscdk.services.appmesh.CfnRoute.GrpcTimeoutProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface HttpRouteHeaderProperty {
    public fun invert(): Any? = unwrap(this).getInvert()

    public fun match(): Any? = unwrap(this).getMatch()

    public fun name(): String

    public interface Builder {
      public fun invert(invert: Boolean) {
      }

      public fun invert(invert: IResolvable) {
      }

      public fun match(match: IResolvable) {
      }

      public fun match(match: HeaderMatchMethodProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("943aaa4aa398ae17e9d2d5e5753b2fe642ffc59b5354bfa49414263c1115cb7d")
      public fun match(match: HeaderMatchMethodProperty.Builder.() -> Unit) {
      }

      public fun name(name: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.appmesh.CfnRoute.HttpRouteHeaderProperty.Builder =
          software.amazon.awscdk.services.appmesh.CfnRoute.HttpRouteHeaderProperty.builder()

      public override fun invert(invert: Boolean) {
        cdkBuilder.invert(invert)
      }

      public override fun invert(invert: IResolvable) {
        cdkBuilder.invert(invert.let(IResolvable::unwrap))
      }

      public override fun match(match: IResolvable) {
        cdkBuilder.match(match.let(IResolvable::unwrap))
      }

      public override fun match(match: HeaderMatchMethodProperty) {
        cdkBuilder.match(match.let(HeaderMatchMethodProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("943aaa4aa398ae17e9d2d5e5753b2fe642ffc59b5354bfa49414263c1115cb7d")
      public override fun match(match: HeaderMatchMethodProperty.Builder.() -> Unit): Unit =
          match(HeaderMatchMethodProperty(match))

      public override fun name(name: String) {
        cdkBuilder.name(name)
      }

      public fun build(): software.amazon.awscdk.services.appmesh.CfnRoute.HttpRouteHeaderProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.appmesh.CfnRoute.HttpRouteHeaderProperty,
    ) : HttpRouteHeaderProperty {
      public override fun invert(): Any? = unwrap(this).getInvert()

      public override fun match(): Any? = unwrap(this).getMatch()

      public override fun name(): String = unwrap(this).getName()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): HttpRouteHeaderProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.appmesh.CfnRoute.HttpRouteHeaderProperty):
          HttpRouteHeaderProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: HttpRouteHeaderProperty):
          software.amazon.awscdk.services.appmesh.CfnRoute.HttpRouteHeaderProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface HeaderMatchMethodProperty {
    public fun exact(): String? = unwrap(this).getExact()

    public fun prefix(): String? = unwrap(this).getPrefix()

    public fun range(): Any? = unwrap(this).getRange()

    public fun regex(): String? = unwrap(this).getRegex()

    public fun suffix(): String? = unwrap(this).getSuffix()

    public interface Builder {
      public fun exact(exact: String) {
      }

      public fun prefix(prefix: String) {
      }

      public fun range(range: IResolvable) {
      }

      public fun range(range: MatchRangeProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("f1f7c2815286fff09a13306072604d8f0b4e9cefb087fb765e2f32673f2ebc31")
      public fun range(range: MatchRangeProperty.Builder.() -> Unit) {
      }

      public fun regex(regex: String) {
      }

      public fun suffix(suffix: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.appmesh.CfnRoute.HeaderMatchMethodProperty.Builder =
          software.amazon.awscdk.services.appmesh.CfnRoute.HeaderMatchMethodProperty.builder()

      public override fun exact(exact: String) {
        cdkBuilder.exact(exact)
      }

      public override fun prefix(prefix: String) {
        cdkBuilder.prefix(prefix)
      }

      public override fun range(range: IResolvable) {
        cdkBuilder.range(range.let(IResolvable::unwrap))
      }

      public override fun range(range: MatchRangeProperty) {
        cdkBuilder.range(range.let(MatchRangeProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("f1f7c2815286fff09a13306072604d8f0b4e9cefb087fb765e2f32673f2ebc31")
      public override fun range(range: MatchRangeProperty.Builder.() -> Unit): Unit =
          range(MatchRangeProperty(range))

      public override fun regex(regex: String) {
        cdkBuilder.regex(regex)
      }

      public override fun suffix(suffix: String) {
        cdkBuilder.suffix(suffix)
      }

      public fun build(): software.amazon.awscdk.services.appmesh.CfnRoute.HeaderMatchMethodProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.appmesh.CfnRoute.HeaderMatchMethodProperty,
    ) : HeaderMatchMethodProperty {
      public override fun exact(): String? = unwrap(this).getExact()

      public override fun prefix(): String? = unwrap(this).getPrefix()

      public override fun range(): Any? = unwrap(this).getRange()

      public override fun regex(): String? = unwrap(this).getRegex()

      public override fun suffix(): String? = unwrap(this).getSuffix()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): HeaderMatchMethodProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.appmesh.CfnRoute.HeaderMatchMethodProperty):
          HeaderMatchMethodProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: HeaderMatchMethodProperty):
          software.amazon.awscdk.services.appmesh.CfnRoute.HeaderMatchMethodProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface HttpRetryPolicyProperty {
    public fun httpRetryEvents(): List<String> = unwrap(this).getHttpRetryEvents() ?: emptyList()

    public fun maxRetries(): Number

    public fun perRetryTimeout(): Any

    public fun tcpRetryEvents(): List<String> = unwrap(this).getTcpRetryEvents() ?: emptyList()

    public interface Builder {
      public fun httpRetryEvents(httpRetryEvents: List<String>) {
      }

      public fun maxRetries(maxRetries: Number) {
      }

      public fun perRetryTimeout(perRetryTimeout: IResolvable) {
      }

      public fun perRetryTimeout(perRetryTimeout: DurationProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("784c51a336be1296c387c22042f53a53c7d5122591c957b70ed9fd13eb1ca12a")
      public fun perRetryTimeout(perRetryTimeout: DurationProperty.Builder.() -> Unit) {
      }

      public fun tcpRetryEvents(tcpRetryEvents: List<String>) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.appmesh.CfnRoute.HttpRetryPolicyProperty.Builder =
          software.amazon.awscdk.services.appmesh.CfnRoute.HttpRetryPolicyProperty.builder()

      public override fun httpRetryEvents(httpRetryEvents: List<String>) {
        cdkBuilder.httpRetryEvents(httpRetryEvents)
      }

      public override fun maxRetries(maxRetries: Number) {
        cdkBuilder.maxRetries(maxRetries)
      }

      public override fun perRetryTimeout(perRetryTimeout: IResolvable) {
        cdkBuilder.perRetryTimeout(perRetryTimeout.let(IResolvable::unwrap))
      }

      public override fun perRetryTimeout(perRetryTimeout: DurationProperty) {
        cdkBuilder.perRetryTimeout(perRetryTimeout.let(DurationProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("784c51a336be1296c387c22042f53a53c7d5122591c957b70ed9fd13eb1ca12a")
      public override fun perRetryTimeout(perRetryTimeout: DurationProperty.Builder.() -> Unit):
          Unit = perRetryTimeout(DurationProperty(perRetryTimeout))

      public override fun tcpRetryEvents(tcpRetryEvents: List<String>) {
        cdkBuilder.tcpRetryEvents(tcpRetryEvents)
      }

      public fun build(): software.amazon.awscdk.services.appmesh.CfnRoute.HttpRetryPolicyProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.appmesh.CfnRoute.HttpRetryPolicyProperty,
    ) : HttpRetryPolicyProperty {
      public override fun httpRetryEvents(): List<String> = unwrap(this).getHttpRetryEvents() ?:
          emptyList()

      public override fun maxRetries(): Number = unwrap(this).getMaxRetries()

      public override fun perRetryTimeout(): Any = unwrap(this).getPerRetryTimeout()

      public override fun tcpRetryEvents(): List<String> = unwrap(this).getTcpRetryEvents() ?:
          emptyList()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): HttpRetryPolicyProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.appmesh.CfnRoute.HttpRetryPolicyProperty):
          HttpRetryPolicyProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: HttpRetryPolicyProperty):
          software.amazon.awscdk.services.appmesh.CfnRoute.HttpRetryPolicyProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface GrpcRouteMetadataMatchMethodProperty {
    public fun exact(): String? = unwrap(this).getExact()

    public fun prefix(): String? = unwrap(this).getPrefix()

    public fun range(): Any? = unwrap(this).getRange()

    public fun regex(): String? = unwrap(this).getRegex()

    public fun suffix(): String? = unwrap(this).getSuffix()

    public interface Builder {
      public fun exact(exact: String) {
      }

      public fun prefix(prefix: String) {
      }

      public fun range(range: IResolvable) {
      }

      public fun range(range: MatchRangeProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("618ca50b7f60d9a6e27b7d7af0585371cbc8ac043e9f2cea2692993a2ab5c8b9")
      public fun range(range: MatchRangeProperty.Builder.() -> Unit) {
      }

      public fun regex(regex: String) {
      }

      public fun suffix(suffix: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.appmesh.CfnRoute.GrpcRouteMetadataMatchMethodProperty.Builder
          =
          software.amazon.awscdk.services.appmesh.CfnRoute.GrpcRouteMetadataMatchMethodProperty.builder()

      public override fun exact(exact: String) {
        cdkBuilder.exact(exact)
      }

      public override fun prefix(prefix: String) {
        cdkBuilder.prefix(prefix)
      }

      public override fun range(range: IResolvable) {
        cdkBuilder.range(range.let(IResolvable::unwrap))
      }

      public override fun range(range: MatchRangeProperty) {
        cdkBuilder.range(range.let(MatchRangeProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("618ca50b7f60d9a6e27b7d7af0585371cbc8ac043e9f2cea2692993a2ab5c8b9")
      public override fun range(range: MatchRangeProperty.Builder.() -> Unit): Unit =
          range(MatchRangeProperty(range))

      public override fun regex(regex: String) {
        cdkBuilder.regex(regex)
      }

      public override fun suffix(suffix: String) {
        cdkBuilder.suffix(suffix)
      }

      public fun build():
          software.amazon.awscdk.services.appmesh.CfnRoute.GrpcRouteMetadataMatchMethodProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.appmesh.CfnRoute.GrpcRouteMetadataMatchMethodProperty,
    ) : GrpcRouteMetadataMatchMethodProperty {
      public override fun exact(): String? = unwrap(this).getExact()

      public override fun prefix(): String? = unwrap(this).getPrefix()

      public override fun range(): Any? = unwrap(this).getRange()

      public override fun regex(): String? = unwrap(this).getRegex()

      public override fun suffix(): String? = unwrap(this).getSuffix()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}):
          GrpcRouteMetadataMatchMethodProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.appmesh.CfnRoute.GrpcRouteMetadataMatchMethodProperty):
          GrpcRouteMetadataMatchMethodProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: GrpcRouteMetadataMatchMethodProperty):
          software.amazon.awscdk.services.appmesh.CfnRoute.GrpcRouteMetadataMatchMethodProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface WeightedTargetProperty {
    public fun port(): Number? = unwrap(this).getPort()

    public fun virtualNode(): String

    public fun weight(): Number

    public interface Builder {
      public fun port(port: Number) {
      }

      public fun virtualNode(virtualNode: String) {
      }

      public fun weight(weight: Number) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.appmesh.CfnRoute.WeightedTargetProperty.Builder =
          software.amazon.awscdk.services.appmesh.CfnRoute.WeightedTargetProperty.builder()

      public override fun port(port: Number) {
        cdkBuilder.port(port)
      }

      public override fun virtualNode(virtualNode: String) {
        cdkBuilder.virtualNode(virtualNode)
      }

      public override fun weight(weight: Number) {
        cdkBuilder.weight(weight)
      }

      public fun build(): software.amazon.awscdk.services.appmesh.CfnRoute.WeightedTargetProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.appmesh.CfnRoute.WeightedTargetProperty,
    ) : WeightedTargetProperty {
      public override fun port(): Number? = unwrap(this).getPort()

      public override fun virtualNode(): String = unwrap(this).getVirtualNode()

      public override fun weight(): Number = unwrap(this).getWeight()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): WeightedTargetProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.appmesh.CfnRoute.WeightedTargetProperty):
          WeightedTargetProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: WeightedTargetProperty):
          software.amazon.awscdk.services.appmesh.CfnRoute.WeightedTargetProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface QueryParameterProperty {
    public fun match(): Any? = unwrap(this).getMatch()

    public fun name(): String

    public interface Builder {
      public fun match(match: IResolvable) {
      }

      public fun match(match: HttpQueryParameterMatchProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("54a474d5592f6d7ce5e6ea7ce9c611ebed2dd706b95c36442ae3dd2c5865ea5d")
      public fun match(match: HttpQueryParameterMatchProperty.Builder.() -> Unit) {
      }

      public fun name(name: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.appmesh.CfnRoute.QueryParameterProperty.Builder =
          software.amazon.awscdk.services.appmesh.CfnRoute.QueryParameterProperty.builder()

      public override fun match(match: IResolvable) {
        cdkBuilder.match(match.let(IResolvable::unwrap))
      }

      public override fun match(match: HttpQueryParameterMatchProperty) {
        cdkBuilder.match(match.let(HttpQueryParameterMatchProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("54a474d5592f6d7ce5e6ea7ce9c611ebed2dd706b95c36442ae3dd2c5865ea5d")
      public override fun match(match: HttpQueryParameterMatchProperty.Builder.() -> Unit): Unit =
          match(HttpQueryParameterMatchProperty(match))

      public override fun name(name: String) {
        cdkBuilder.name(name)
      }

      public fun build(): software.amazon.awscdk.services.appmesh.CfnRoute.QueryParameterProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.appmesh.CfnRoute.QueryParameterProperty,
    ) : QueryParameterProperty {
      public override fun match(): Any? = unwrap(this).getMatch()

      public override fun name(): String = unwrap(this).getName()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): QueryParameterProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.appmesh.CfnRoute.QueryParameterProperty):
          QueryParameterProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: QueryParameterProperty):
          software.amazon.awscdk.services.appmesh.CfnRoute.QueryParameterProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface HttpRouteProperty {
    public fun action(): Any

    public fun match(): Any

    public fun retryPolicy(): Any? = unwrap(this).getRetryPolicy()

    public fun timeout(): Any? = unwrap(this).getTimeout()

    public interface Builder {
      public fun action(action: IResolvable) {
      }

      public fun action(action: HttpRouteActionProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("8dfd294369a3aa58c38d45ef30d12b4e4343acb29bd29d257a3991b2f675feab")
      public fun action(action: HttpRouteActionProperty.Builder.() -> Unit) {
      }

      public fun match(match: IResolvable) {
      }

      public fun match(match: HttpRouteMatchProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("8af0e70e5cbd57e3fea91410cadfaf6f8d85e0f422b840d2a93900146a2b327a")
      public fun match(match: HttpRouteMatchProperty.Builder.() -> Unit) {
      }

      public fun retryPolicy(retryPolicy: IResolvable) {
      }

      public fun retryPolicy(retryPolicy: HttpRetryPolicyProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("2ccf4635c876a872e5a0297bfa9b4a5781a8a090451a691fe9d1bc3883b4f790")
      public fun retryPolicy(retryPolicy: HttpRetryPolicyProperty.Builder.() -> Unit) {
      }

      public fun timeout(timeout: IResolvable) {
      }

      public fun timeout(timeout: HttpTimeoutProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("6794853ce597e6d6113e7169abe7272f9423ca3b3d195a0d98848bf77a32fd9c")
      public fun timeout(timeout: HttpTimeoutProperty.Builder.() -> Unit) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.appmesh.CfnRoute.HttpRouteProperty.Builder =
          software.amazon.awscdk.services.appmesh.CfnRoute.HttpRouteProperty.builder()

      public override fun action(action: IResolvable) {
        cdkBuilder.action(action.let(IResolvable::unwrap))
      }

      public override fun action(action: HttpRouteActionProperty) {
        cdkBuilder.action(action.let(HttpRouteActionProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("8dfd294369a3aa58c38d45ef30d12b4e4343acb29bd29d257a3991b2f675feab")
      public override fun action(action: HttpRouteActionProperty.Builder.() -> Unit): Unit =
          action(HttpRouteActionProperty(action))

      public override fun match(match: IResolvable) {
        cdkBuilder.match(match.let(IResolvable::unwrap))
      }

      public override fun match(match: HttpRouteMatchProperty) {
        cdkBuilder.match(match.let(HttpRouteMatchProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("8af0e70e5cbd57e3fea91410cadfaf6f8d85e0f422b840d2a93900146a2b327a")
      public override fun match(match: HttpRouteMatchProperty.Builder.() -> Unit): Unit =
          match(HttpRouteMatchProperty(match))

      public override fun retryPolicy(retryPolicy: IResolvable) {
        cdkBuilder.retryPolicy(retryPolicy.let(IResolvable::unwrap))
      }

      public override fun retryPolicy(retryPolicy: HttpRetryPolicyProperty) {
        cdkBuilder.retryPolicy(retryPolicy.let(HttpRetryPolicyProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("2ccf4635c876a872e5a0297bfa9b4a5781a8a090451a691fe9d1bc3883b4f790")
      public override fun retryPolicy(retryPolicy: HttpRetryPolicyProperty.Builder.() -> Unit): Unit
          = retryPolicy(HttpRetryPolicyProperty(retryPolicy))

      public override fun timeout(timeout: IResolvable) {
        cdkBuilder.timeout(timeout.let(IResolvable::unwrap))
      }

      public override fun timeout(timeout: HttpTimeoutProperty) {
        cdkBuilder.timeout(timeout.let(HttpTimeoutProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("6794853ce597e6d6113e7169abe7272f9423ca3b3d195a0d98848bf77a32fd9c")
      public override fun timeout(timeout: HttpTimeoutProperty.Builder.() -> Unit): Unit =
          timeout(HttpTimeoutProperty(timeout))

      public fun build(): software.amazon.awscdk.services.appmesh.CfnRoute.HttpRouteProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject: software.amazon.awscdk.services.appmesh.CfnRoute.HttpRouteProperty,
    ) : HttpRouteProperty {
      public override fun action(): Any = unwrap(this).getAction()

      public override fun match(): Any = unwrap(this).getMatch()

      public override fun retryPolicy(): Any? = unwrap(this).getRetryPolicy()

      public override fun timeout(): Any? = unwrap(this).getTimeout()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): HttpRouteProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.appmesh.CfnRoute.HttpRouteProperty):
          HttpRouteProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: HttpRouteProperty):
          software.amazon.awscdk.services.appmesh.CfnRoute.HttpRouteProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface GrpcRouteMetadataProperty {
    public fun invert(): Any? = unwrap(this).getInvert()

    public fun match(): Any? = unwrap(this).getMatch()

    public fun name(): String

    public interface Builder {
      public fun invert(invert: Boolean) {
      }

      public fun invert(invert: IResolvable) {
      }

      public fun match(match: IResolvable) {
      }

      public fun match(match: GrpcRouteMetadataMatchMethodProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("d36445f7b17779f42c1279fbfb47636c8e19441c8a5da343ec1a77f719f5d7b6")
      public fun match(match: GrpcRouteMetadataMatchMethodProperty.Builder.() -> Unit) {
      }

      public fun name(name: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.appmesh.CfnRoute.GrpcRouteMetadataProperty.Builder =
          software.amazon.awscdk.services.appmesh.CfnRoute.GrpcRouteMetadataProperty.builder()

      public override fun invert(invert: Boolean) {
        cdkBuilder.invert(invert)
      }

      public override fun invert(invert: IResolvable) {
        cdkBuilder.invert(invert.let(IResolvable::unwrap))
      }

      public override fun match(match: IResolvable) {
        cdkBuilder.match(match.let(IResolvable::unwrap))
      }

      public override fun match(match: GrpcRouteMetadataMatchMethodProperty) {
        cdkBuilder.match(match.let(GrpcRouteMetadataMatchMethodProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("d36445f7b17779f42c1279fbfb47636c8e19441c8a5da343ec1a77f719f5d7b6")
      public override fun match(match: GrpcRouteMetadataMatchMethodProperty.Builder.() -> Unit):
          Unit = match(GrpcRouteMetadataMatchMethodProperty(match))

      public override fun name(name: String) {
        cdkBuilder.name(name)
      }

      public fun build(): software.amazon.awscdk.services.appmesh.CfnRoute.GrpcRouteMetadataProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.appmesh.CfnRoute.GrpcRouteMetadataProperty,
    ) : GrpcRouteMetadataProperty {
      public override fun invert(): Any? = unwrap(this).getInvert()

      public override fun match(): Any? = unwrap(this).getMatch()

      public override fun name(): String = unwrap(this).getName()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): GrpcRouteMetadataProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.appmesh.CfnRoute.GrpcRouteMetadataProperty):
          GrpcRouteMetadataProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: GrpcRouteMetadataProperty):
          software.amazon.awscdk.services.appmesh.CfnRoute.GrpcRouteMetadataProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface GrpcRouteMatchProperty {
    public fun metadata(): Any? = unwrap(this).getMetadata()

    public fun methodName(): String? = unwrap(this).getMethodName()

    public fun port(): Number? = unwrap(this).getPort()

    public fun serviceName(): String? = unwrap(this).getServiceName()

    public interface Builder {
      public fun metadata(metadata: IResolvable) {
      }

      public fun metadata(metadata: List<Any>) {
      }

      public fun methodName(methodName: String) {
      }

      public fun port(port: Number) {
      }

      public fun serviceName(serviceName: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.appmesh.CfnRoute.GrpcRouteMatchProperty.Builder =
          software.amazon.awscdk.services.appmesh.CfnRoute.GrpcRouteMatchProperty.builder()

      public override fun metadata(metadata: IResolvable) {
        cdkBuilder.metadata(metadata.let(IResolvable::unwrap))
      }

      public override fun metadata(metadata: List<Any>) {
        cdkBuilder.metadata(metadata)
      }

      public override fun methodName(methodName: String) {
        cdkBuilder.methodName(methodName)
      }

      public override fun port(port: Number) {
        cdkBuilder.port(port)
      }

      public override fun serviceName(serviceName: String) {
        cdkBuilder.serviceName(serviceName)
      }

      public fun build(): software.amazon.awscdk.services.appmesh.CfnRoute.GrpcRouteMatchProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.appmesh.CfnRoute.GrpcRouteMatchProperty,
    ) : GrpcRouteMatchProperty {
      public override fun metadata(): Any? = unwrap(this).getMetadata()

      public override fun methodName(): String? = unwrap(this).getMethodName()

      public override fun port(): Number? = unwrap(this).getPort()

      public override fun serviceName(): String? = unwrap(this).getServiceName()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): GrpcRouteMatchProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.appmesh.CfnRoute.GrpcRouteMatchProperty):
          GrpcRouteMatchProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: GrpcRouteMatchProperty):
          software.amazon.awscdk.services.appmesh.CfnRoute.GrpcRouteMatchProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface DurationProperty {
    public fun unit(): String

    public fun `value`(): Number

    public interface Builder {
      public fun unit(unit: String) {
      }

      public fun `value`(`value`: Number) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.appmesh.CfnRoute.DurationProperty.Builder =
          software.amazon.awscdk.services.appmesh.CfnRoute.DurationProperty.builder()

      public override fun unit(unit: String) {
        cdkBuilder.unit(unit)
      }

      public override fun `value`(`value`: Number) {
        cdkBuilder.`value`(`value`)
      }

      public fun build(): software.amazon.awscdk.services.appmesh.CfnRoute.DurationProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject: software.amazon.awscdk.services.appmesh.CfnRoute.DurationProperty,
    ) : DurationProperty {
      public override fun unit(): String = unwrap(this).getUnit()

      public override fun `value`(): Number = unwrap(this).getValue()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): DurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.appmesh.CfnRoute.DurationProperty):
          DurationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: DurationProperty):
          software.amazon.awscdk.services.appmesh.CfnRoute.DurationProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface HttpTimeoutProperty {
    public fun idle(): Any? = unwrap(this).getIdle()

    public fun perRequest(): Any? = unwrap(this).getPerRequest()

    public interface Builder {
      public fun idle(idle: IResolvable) {
      }

      public fun idle(idle: DurationProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("a80d6568c352c41a46becbc98cc29bd3837834a9c9855733dfd66bea9b834c26")
      public fun idle(idle: DurationProperty.Builder.() -> Unit) {
      }

      public fun perRequest(perRequest: IResolvable) {
      }

      public fun perRequest(perRequest: DurationProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("b83625a5d9cf26bfa8eece30847253209f9ca0475c29c3aa07ea94eab8463445")
      public fun perRequest(perRequest: DurationProperty.Builder.() -> Unit) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.appmesh.CfnRoute.HttpTimeoutProperty.Builder =
          software.amazon.awscdk.services.appmesh.CfnRoute.HttpTimeoutProperty.builder()

      public override fun idle(idle: IResolvable) {
        cdkBuilder.idle(idle.let(IResolvable::unwrap))
      }

      public override fun idle(idle: DurationProperty) {
        cdkBuilder.idle(idle.let(DurationProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("a80d6568c352c41a46becbc98cc29bd3837834a9c9855733dfd66bea9b834c26")
      public override fun idle(idle: DurationProperty.Builder.() -> Unit): Unit =
          idle(DurationProperty(idle))

      public override fun perRequest(perRequest: IResolvable) {
        cdkBuilder.perRequest(perRequest.let(IResolvable::unwrap))
      }

      public override fun perRequest(perRequest: DurationProperty) {
        cdkBuilder.perRequest(perRequest.let(DurationProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("b83625a5d9cf26bfa8eece30847253209f9ca0475c29c3aa07ea94eab8463445")
      public override fun perRequest(perRequest: DurationProperty.Builder.() -> Unit): Unit =
          perRequest(DurationProperty(perRequest))

      public fun build(): software.amazon.awscdk.services.appmesh.CfnRoute.HttpTimeoutProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject: software.amazon.awscdk.services.appmesh.CfnRoute.HttpTimeoutProperty,
    ) : HttpTimeoutProperty {
      public override fun idle(): Any? = unwrap(this).getIdle()

      public override fun perRequest(): Any? = unwrap(this).getPerRequest()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): HttpTimeoutProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.appmesh.CfnRoute.HttpTimeoutProperty):
          HttpTimeoutProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: HttpTimeoutProperty):
          software.amazon.awscdk.services.appmesh.CfnRoute.HttpTimeoutProperty = (wrapped as
          Wrapper).cdkObject
    }
  }
}
