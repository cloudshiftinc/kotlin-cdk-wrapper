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

public open class CfnGatewayRoute internal constructor(
  private val cdkObject: software.amazon.awscdk.services.appmesh.CfnGatewayRoute,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  public open fun attrArn(): String = unwrap(this).getAttrArn()

  public open fun attrGatewayRouteName(): String = unwrap(this).getAttrGatewayRouteName()

  public open fun attrId(): String = unwrap(this).getAttrId()

  public open fun attrMeshName(): String = unwrap(this).getAttrMeshName()

  public open fun attrMeshOwner(): String = unwrap(this).getAttrMeshOwner()

  public open fun attrResourceOwner(): String = unwrap(this).getAttrResourceOwner()

  public open fun attrUid(): String = unwrap(this).getAttrUid()

  public open fun attrVirtualGatewayName(): String = unwrap(this).getAttrVirtualGatewayName()

  public open fun gatewayRouteName(): String? = unwrap(this).getGatewayRouteName()

  public open fun gatewayRouteName(`value`: String) {
    unwrap(this).setGatewayRouteName(`value`)
  }

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

  public open fun spec(): Any = unwrap(this).getSpec()

  public open fun spec(`value`: IResolvable) {
    unwrap(this).setSpec(`value`.let(IResolvable::unwrap))
  }

  public open fun spec(`value`: GatewayRouteSpecProperty) {
    unwrap(this).setSpec(`value`.let(GatewayRouteSpecProperty::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("516e010fd40c06579324b12e9e9e7838e1d01e14e61919f1bca7346a90dd5ae0")
  public open fun spec(`value`: GatewayRouteSpecProperty.Builder.() -> Unit): Unit =
      spec(GatewayRouteSpecProperty(`value`))

  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  public open fun tagsRaw(): List<CfnTag> = unwrap(this).getTagsRaw()?.map(CfnTag::wrap) ?:
      emptyList()

  public open fun tagsRaw(`value`: List<CfnTag>) {
    unwrap(this).setTagsRaw(`value`.map(CfnTag::unwrap))
  }

  public open fun virtualGatewayName(): String = unwrap(this).getVirtualGatewayName()

  public open fun virtualGatewayName(`value`: String) {
    unwrap(this).setVirtualGatewayName(`value`)
  }

  public interface Builder {
    public fun gatewayRouteName(gatewayRouteName: String) {
    }

    public fun meshName(meshName: String) {
    }

    public fun meshOwner(meshOwner: String) {
    }

    public fun spec(spec: IResolvable) {
    }

    public fun spec(spec: GatewayRouteSpecProperty) {
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("024510c4be71df139eec20dff9e4b3f60e7c065e3d8c155a3e172c5501feadea")
    public fun spec(spec: GatewayRouteSpecProperty.Builder.() -> Unit) {
    }

    public fun tags(tags: List<CfnTag>) {
    }

    public fun virtualGatewayName(virtualGatewayName: String) {
    }
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.appmesh.CfnGatewayRoute.Builder =
        software.amazon.awscdk.services.appmesh.CfnGatewayRoute.Builder.create(scope, id)

    public override fun gatewayRouteName(gatewayRouteName: String) {
      cdkBuilder.gatewayRouteName(gatewayRouteName)
    }

    public override fun meshName(meshName: String) {
      cdkBuilder.meshName(meshName)
    }

    public override fun meshOwner(meshOwner: String) {
      cdkBuilder.meshOwner(meshOwner)
    }

    public override fun spec(spec: IResolvable) {
      cdkBuilder.spec(spec.let(IResolvable::unwrap))
    }

    public override fun spec(spec: GatewayRouteSpecProperty) {
      cdkBuilder.spec(spec.let(GatewayRouteSpecProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("024510c4be71df139eec20dff9e4b3f60e7c065e3d8c155a3e172c5501feadea")
    public override fun spec(spec: GatewayRouteSpecProperty.Builder.() -> Unit): Unit =
        spec(GatewayRouteSpecProperty(spec))

    public override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    public override fun virtualGatewayName(virtualGatewayName: String) {
      cdkBuilder.virtualGatewayName(virtualGatewayName)
    }

    public fun build(): software.amazon.awscdk.services.appmesh.CfnGatewayRoute = cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnGatewayRoute {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnGatewayRoute(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.appmesh.CfnGatewayRoute):
        CfnGatewayRoute = CfnGatewayRoute(cdkObject)

    internal fun unwrap(wrapped: CfnGatewayRoute):
        software.amazon.awscdk.services.appmesh.CfnGatewayRoute = wrapped.cdkObject
  }

  public interface HttpGatewayRouteMatchProperty {
    public fun headers(): Any? = unwrap(this).getHeaders()

    public fun hostname(): Any? = unwrap(this).getHostname()

    public fun method(): String? = unwrap(this).getMethod()

    public fun path(): Any? = unwrap(this).getPath()

    public fun port(): Number? = unwrap(this).getPort()

    public fun prefix(): String? = unwrap(this).getPrefix()

    public fun queryParameters(): Any? = unwrap(this).getQueryParameters()

    public interface Builder {
      public fun headers(headers: IResolvable) {
      }

      public fun headers(headers: List<Any>) {
      }

      public fun hostname(hostname: IResolvable) {
      }

      public fun hostname(hostname: GatewayRouteHostnameMatchProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("e1d71769d1f2cfb93e9238becb380bb908bc79654ee401d3fa39e74df4f9a916")
      public fun hostname(hostname: GatewayRouteHostnameMatchProperty.Builder.() -> Unit) {
      }

      public fun method(method: String) {
      }

      public fun path(path: IResolvable) {
      }

      public fun path(path: HttpPathMatchProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("02f3f43e18c1796a033693d51aa268f96f0b65b0366195aa72856dc5aad63ab1")
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
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.appmesh.CfnGatewayRoute.HttpGatewayRouteMatchProperty.Builder
          =
          software.amazon.awscdk.services.appmesh.CfnGatewayRoute.HttpGatewayRouteMatchProperty.builder()

      public override fun headers(headers: IResolvable) {
        cdkBuilder.headers(headers.let(IResolvable::unwrap))
      }

      public override fun headers(headers: List<Any>) {
        cdkBuilder.headers(headers)
      }

      public override fun hostname(hostname: IResolvable) {
        cdkBuilder.hostname(hostname.let(IResolvable::unwrap))
      }

      public override fun hostname(hostname: GatewayRouteHostnameMatchProperty) {
        cdkBuilder.hostname(hostname.let(GatewayRouteHostnameMatchProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("e1d71769d1f2cfb93e9238becb380bb908bc79654ee401d3fa39e74df4f9a916")
      public override fun hostname(hostname: GatewayRouteHostnameMatchProperty.Builder.() -> Unit):
          Unit = hostname(GatewayRouteHostnameMatchProperty(hostname))

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
      @JvmName("02f3f43e18c1796a033693d51aa268f96f0b65b0366195aa72856dc5aad63ab1")
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

      public fun build():
          software.amazon.awscdk.services.appmesh.CfnGatewayRoute.HttpGatewayRouteMatchProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.appmesh.CfnGatewayRoute.HttpGatewayRouteMatchProperty,
    ) : HttpGatewayRouteMatchProperty {
      public override fun headers(): Any? = unwrap(this).getHeaders()

      public override fun hostname(): Any? = unwrap(this).getHostname()

      public override fun method(): String? = unwrap(this).getMethod()

      public override fun path(): Any? = unwrap(this).getPath()

      public override fun port(): Number? = unwrap(this).getPort()

      public override fun prefix(): String? = unwrap(this).getPrefix()

      public override fun queryParameters(): Any? = unwrap(this).getQueryParameters()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): HttpGatewayRouteMatchProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.appmesh.CfnGatewayRoute.HttpGatewayRouteMatchProperty):
          HttpGatewayRouteMatchProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: HttpGatewayRouteMatchProperty):
          software.amazon.awscdk.services.appmesh.CfnGatewayRoute.HttpGatewayRouteMatchProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface HttpGatewayRoutePrefixRewriteProperty {
    public fun defaultPrefix(): String? = unwrap(this).getDefaultPrefix()

    public fun `value`(): String? = unwrap(this).getValue()

    public interface Builder {
      public fun defaultPrefix(defaultPrefix: String) {
      }

      public fun `value`(`value`: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.appmesh.CfnGatewayRoute.HttpGatewayRoutePrefixRewriteProperty.Builder
          =
          software.amazon.awscdk.services.appmesh.CfnGatewayRoute.HttpGatewayRoutePrefixRewriteProperty.builder()

      public override fun defaultPrefix(defaultPrefix: String) {
        cdkBuilder.defaultPrefix(defaultPrefix)
      }

      public override fun `value`(`value`: String) {
        cdkBuilder.`value`(`value`)
      }

      public fun build():
          software.amazon.awscdk.services.appmesh.CfnGatewayRoute.HttpGatewayRoutePrefixRewriteProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.appmesh.CfnGatewayRoute.HttpGatewayRoutePrefixRewriteProperty,
    ) : HttpGatewayRoutePrefixRewriteProperty {
      public override fun defaultPrefix(): String? = unwrap(this).getDefaultPrefix()

      public override fun `value`(): String? = unwrap(this).getValue()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}):
          HttpGatewayRoutePrefixRewriteProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.appmesh.CfnGatewayRoute.HttpGatewayRoutePrefixRewriteProperty):
          HttpGatewayRoutePrefixRewriteProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: HttpGatewayRoutePrefixRewriteProperty):
          software.amazon.awscdk.services.appmesh.CfnGatewayRoute.HttpGatewayRoutePrefixRewriteProperty
          = (wrapped as Wrapper).cdkObject
    }
  }

  public interface HttpGatewayRouteRewriteProperty {
    public fun hostname(): Any? = unwrap(this).getHostname()

    public fun path(): Any? = unwrap(this).getPath()

    public fun prefix(): Any? = unwrap(this).getPrefix()

    public interface Builder {
      public fun hostname(hostname: IResolvable) {
      }

      public fun hostname(hostname: GatewayRouteHostnameRewriteProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("d76c90549eeca1ed2bc5082c6fd8cc03eb27225c01398d5dd5a23dd6b814df04")
      public fun hostname(hostname: GatewayRouteHostnameRewriteProperty.Builder.() -> Unit) {
      }

      public fun path(path: IResolvable) {
      }

      public fun path(path: HttpGatewayRoutePathRewriteProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("0ae37aca4e33de72b612e3b5f3cc9dae707f7ae3ab727c8717a9d24acd1ffed5")
      public fun path(path: HttpGatewayRoutePathRewriteProperty.Builder.() -> Unit) {
      }

      public fun prefix(prefix: IResolvable) {
      }

      public fun prefix(prefix: HttpGatewayRoutePrefixRewriteProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("0cbb9831a01271d35491bb280f23420c2bdc24f62932d18cb8f49d4fa00fa774")
      public fun prefix(prefix: HttpGatewayRoutePrefixRewriteProperty.Builder.() -> Unit) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.appmesh.CfnGatewayRoute.HttpGatewayRouteRewriteProperty.Builder
          =
          software.amazon.awscdk.services.appmesh.CfnGatewayRoute.HttpGatewayRouteRewriteProperty.builder()

      public override fun hostname(hostname: IResolvable) {
        cdkBuilder.hostname(hostname.let(IResolvable::unwrap))
      }

      public override fun hostname(hostname: GatewayRouteHostnameRewriteProperty) {
        cdkBuilder.hostname(hostname.let(GatewayRouteHostnameRewriteProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("d76c90549eeca1ed2bc5082c6fd8cc03eb27225c01398d5dd5a23dd6b814df04")
      public override
          fun hostname(hostname: GatewayRouteHostnameRewriteProperty.Builder.() -> Unit): Unit =
          hostname(GatewayRouteHostnameRewriteProperty(hostname))

      public override fun path(path: IResolvable) {
        cdkBuilder.path(path.let(IResolvable::unwrap))
      }

      public override fun path(path: HttpGatewayRoutePathRewriteProperty) {
        cdkBuilder.path(path.let(HttpGatewayRoutePathRewriteProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("0ae37aca4e33de72b612e3b5f3cc9dae707f7ae3ab727c8717a9d24acd1ffed5")
      public override fun path(path: HttpGatewayRoutePathRewriteProperty.Builder.() -> Unit): Unit =
          path(HttpGatewayRoutePathRewriteProperty(path))

      public override fun prefix(prefix: IResolvable) {
        cdkBuilder.prefix(prefix.let(IResolvable::unwrap))
      }

      public override fun prefix(prefix: HttpGatewayRoutePrefixRewriteProperty) {
        cdkBuilder.prefix(prefix.let(HttpGatewayRoutePrefixRewriteProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("0cbb9831a01271d35491bb280f23420c2bdc24f62932d18cb8f49d4fa00fa774")
      public override fun prefix(prefix: HttpGatewayRoutePrefixRewriteProperty.Builder.() -> Unit):
          Unit = prefix(HttpGatewayRoutePrefixRewriteProperty(prefix))

      public fun build():
          software.amazon.awscdk.services.appmesh.CfnGatewayRoute.HttpGatewayRouteRewriteProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.appmesh.CfnGatewayRoute.HttpGatewayRouteRewriteProperty,
    ) : HttpGatewayRouteRewriteProperty {
      public override fun hostname(): Any? = unwrap(this).getHostname()

      public override fun path(): Any? = unwrap(this).getPath()

      public override fun prefix(): Any? = unwrap(this).getPrefix()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): HttpGatewayRouteRewriteProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.appmesh.CfnGatewayRoute.HttpGatewayRouteRewriteProperty):
          HttpGatewayRouteRewriteProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: HttpGatewayRouteRewriteProperty):
          software.amazon.awscdk.services.appmesh.CfnGatewayRoute.HttpGatewayRouteRewriteProperty =
          (wrapped as Wrapper).cdkObject
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
      @JvmName("027a218ab1a49211ec6dc4aa7e3504cef35d0e9e3d4a94c3f63c78e34d1d8127")
      public fun match(match: HttpQueryParameterMatchProperty.Builder.() -> Unit) {
      }

      public fun name(name: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.appmesh.CfnGatewayRoute.QueryParameterProperty.Builder =
          software.amazon.awscdk.services.appmesh.CfnGatewayRoute.QueryParameterProperty.builder()

      public override fun match(match: IResolvable) {
        cdkBuilder.match(match.let(IResolvable::unwrap))
      }

      public override fun match(match: HttpQueryParameterMatchProperty) {
        cdkBuilder.match(match.let(HttpQueryParameterMatchProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("027a218ab1a49211ec6dc4aa7e3504cef35d0e9e3d4a94c3f63c78e34d1d8127")
      public override fun match(match: HttpQueryParameterMatchProperty.Builder.() -> Unit): Unit =
          match(HttpQueryParameterMatchProperty(match))

      public override fun name(name: String) {
        cdkBuilder.name(name)
      }

      public fun build():
          software.amazon.awscdk.services.appmesh.CfnGatewayRoute.QueryParameterProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.appmesh.CfnGatewayRoute.QueryParameterProperty,
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
          fun wrap(cdkObject: software.amazon.awscdk.services.appmesh.CfnGatewayRoute.QueryParameterProperty):
          QueryParameterProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: QueryParameterProperty):
          software.amazon.awscdk.services.appmesh.CfnGatewayRoute.QueryParameterProperty = (wrapped
          as Wrapper).cdkObject
    }
  }

  public interface GatewayRouteTargetProperty {
    public fun port(): Number? = unwrap(this).getPort()

    public fun virtualService(): Any

    public interface Builder {
      public fun port(port: Number) {
      }

      public fun virtualService(virtualService: IResolvable) {
      }

      public fun virtualService(virtualService: GatewayRouteVirtualServiceProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("a414a9a466bb8280175f846eae283b057bba5f57e0e932f87dc27b241157e961")
      public
          fun virtualService(virtualService: GatewayRouteVirtualServiceProperty.Builder.() -> Unit) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.appmesh.CfnGatewayRoute.GatewayRouteTargetProperty.Builder
          =
          software.amazon.awscdk.services.appmesh.CfnGatewayRoute.GatewayRouteTargetProperty.builder()

      public override fun port(port: Number) {
        cdkBuilder.port(port)
      }

      public override fun virtualService(virtualService: IResolvable) {
        cdkBuilder.virtualService(virtualService.let(IResolvable::unwrap))
      }

      public override fun virtualService(virtualService: GatewayRouteVirtualServiceProperty) {
        cdkBuilder.virtualService(virtualService.let(GatewayRouteVirtualServiceProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("a414a9a466bb8280175f846eae283b057bba5f57e0e932f87dc27b241157e961")
      public override
          fun virtualService(virtualService: GatewayRouteVirtualServiceProperty.Builder.() -> Unit):
          Unit = virtualService(GatewayRouteVirtualServiceProperty(virtualService))

      public fun build():
          software.amazon.awscdk.services.appmesh.CfnGatewayRoute.GatewayRouteTargetProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.appmesh.CfnGatewayRoute.GatewayRouteTargetProperty,
    ) : GatewayRouteTargetProperty {
      public override fun port(): Number? = unwrap(this).getPort()

      public override fun virtualService(): Any = unwrap(this).getVirtualService()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): GatewayRouteTargetProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.appmesh.CfnGatewayRoute.GatewayRouteTargetProperty):
          GatewayRouteTargetProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: GatewayRouteTargetProperty):
          software.amazon.awscdk.services.appmesh.CfnGatewayRoute.GatewayRouteTargetProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface GatewayRouteRangeMatchProperty {
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
          software.amazon.awscdk.services.appmesh.CfnGatewayRoute.GatewayRouteRangeMatchProperty.Builder
          =
          software.amazon.awscdk.services.appmesh.CfnGatewayRoute.GatewayRouteRangeMatchProperty.builder()

      public override fun end(end: Number) {
        cdkBuilder.end(end)
      }

      public override fun start(start: Number) {
        cdkBuilder.start(start)
      }

      public fun build():
          software.amazon.awscdk.services.appmesh.CfnGatewayRoute.GatewayRouteRangeMatchProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.appmesh.CfnGatewayRoute.GatewayRouteRangeMatchProperty,
    ) : GatewayRouteRangeMatchProperty {
      public override fun end(): Number = unwrap(this).getEnd()

      public override fun start(): Number = unwrap(this).getStart()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): GatewayRouteRangeMatchProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.appmesh.CfnGatewayRoute.GatewayRouteRangeMatchProperty):
          GatewayRouteRangeMatchProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: GatewayRouteRangeMatchProperty):
          software.amazon.awscdk.services.appmesh.CfnGatewayRoute.GatewayRouteRangeMatchProperty =
          (wrapped as Wrapper).cdkObject
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
          software.amazon.awscdk.services.appmesh.CfnGatewayRoute.HttpQueryParameterMatchProperty.Builder
          =
          software.amazon.awscdk.services.appmesh.CfnGatewayRoute.HttpQueryParameterMatchProperty.builder()

      public override fun exact(exact: String) {
        cdkBuilder.exact(exact)
      }

      public fun build():
          software.amazon.awscdk.services.appmesh.CfnGatewayRoute.HttpQueryParameterMatchProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.appmesh.CfnGatewayRoute.HttpQueryParameterMatchProperty,
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
          fun wrap(cdkObject: software.amazon.awscdk.services.appmesh.CfnGatewayRoute.HttpQueryParameterMatchProperty):
          HttpQueryParameterMatchProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: HttpQueryParameterMatchProperty):
          software.amazon.awscdk.services.appmesh.CfnGatewayRoute.HttpQueryParameterMatchProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface HttpGatewayRouteActionProperty {
    public fun rewrite(): Any? = unwrap(this).getRewrite()

    public fun target(): Any

    public interface Builder {
      public fun rewrite(rewrite: IResolvable) {
      }

      public fun rewrite(rewrite: HttpGatewayRouteRewriteProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("4595161aa5ed2932acf97580609a37d906040913f24392f5f3463c3c48136a0c")
      public fun rewrite(rewrite: HttpGatewayRouteRewriteProperty.Builder.() -> Unit) {
      }

      public fun target(target: IResolvable) {
      }

      public fun target(target: GatewayRouteTargetProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("7511ba72bcdf2c64bce395e562862dc1ab3c620a99fb298efa904ff630ee8fe5")
      public fun target(target: GatewayRouteTargetProperty.Builder.() -> Unit) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.appmesh.CfnGatewayRoute.HttpGatewayRouteActionProperty.Builder
          =
          software.amazon.awscdk.services.appmesh.CfnGatewayRoute.HttpGatewayRouteActionProperty.builder()

      public override fun rewrite(rewrite: IResolvable) {
        cdkBuilder.rewrite(rewrite.let(IResolvable::unwrap))
      }

      public override fun rewrite(rewrite: HttpGatewayRouteRewriteProperty) {
        cdkBuilder.rewrite(rewrite.let(HttpGatewayRouteRewriteProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("4595161aa5ed2932acf97580609a37d906040913f24392f5f3463c3c48136a0c")
      public override fun rewrite(rewrite: HttpGatewayRouteRewriteProperty.Builder.() -> Unit): Unit
          = rewrite(HttpGatewayRouteRewriteProperty(rewrite))

      public override fun target(target: IResolvable) {
        cdkBuilder.target(target.let(IResolvable::unwrap))
      }

      public override fun target(target: GatewayRouteTargetProperty) {
        cdkBuilder.target(target.let(GatewayRouteTargetProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("7511ba72bcdf2c64bce395e562862dc1ab3c620a99fb298efa904ff630ee8fe5")
      public override fun target(target: GatewayRouteTargetProperty.Builder.() -> Unit): Unit =
          target(GatewayRouteTargetProperty(target))

      public fun build():
          software.amazon.awscdk.services.appmesh.CfnGatewayRoute.HttpGatewayRouteActionProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.appmesh.CfnGatewayRoute.HttpGatewayRouteActionProperty,
    ) : HttpGatewayRouteActionProperty {
      public override fun rewrite(): Any? = unwrap(this).getRewrite()

      public override fun target(): Any = unwrap(this).getTarget()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): HttpGatewayRouteActionProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.appmesh.CfnGatewayRoute.HttpGatewayRouteActionProperty):
          HttpGatewayRouteActionProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: HttpGatewayRouteActionProperty):
          software.amazon.awscdk.services.appmesh.CfnGatewayRoute.HttpGatewayRouteActionProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface GatewayRouteHostnameRewriteProperty {
    public fun defaultTargetHostname(): String? = unwrap(this).getDefaultTargetHostname()

    public interface Builder {
      public fun defaultTargetHostname(defaultTargetHostname: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.appmesh.CfnGatewayRoute.GatewayRouteHostnameRewriteProperty.Builder
          =
          software.amazon.awscdk.services.appmesh.CfnGatewayRoute.GatewayRouteHostnameRewriteProperty.builder()

      public override fun defaultTargetHostname(defaultTargetHostname: String) {
        cdkBuilder.defaultTargetHostname(defaultTargetHostname)
      }

      public fun build():
          software.amazon.awscdk.services.appmesh.CfnGatewayRoute.GatewayRouteHostnameRewriteProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.appmesh.CfnGatewayRoute.GatewayRouteHostnameRewriteProperty,
    ) : GatewayRouteHostnameRewriteProperty {
      public override fun defaultTargetHostname(): String? = unwrap(this).getDefaultTargetHostname()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}):
          GatewayRouteHostnameRewriteProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.appmesh.CfnGatewayRoute.GatewayRouteHostnameRewriteProperty):
          GatewayRouteHostnameRewriteProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: GatewayRouteHostnameRewriteProperty):
          software.amazon.awscdk.services.appmesh.CfnGatewayRoute.GatewayRouteHostnameRewriteProperty
          = (wrapped as Wrapper).cdkObject
    }
  }

  public interface GrpcGatewayRouteRewriteProperty {
    public fun hostname(): Any? = unwrap(this).getHostname()

    public interface Builder {
      public fun hostname(hostname: IResolvable) {
      }

      public fun hostname(hostname: GatewayRouteHostnameRewriteProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("ea962b36ff67d8164bfe9d56a4b92240e6d215288e85d90e16288cad289586bb")
      public fun hostname(hostname: GatewayRouteHostnameRewriteProperty.Builder.() -> Unit) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.appmesh.CfnGatewayRoute.GrpcGatewayRouteRewriteProperty.Builder
          =
          software.amazon.awscdk.services.appmesh.CfnGatewayRoute.GrpcGatewayRouteRewriteProperty.builder()

      public override fun hostname(hostname: IResolvable) {
        cdkBuilder.hostname(hostname.let(IResolvable::unwrap))
      }

      public override fun hostname(hostname: GatewayRouteHostnameRewriteProperty) {
        cdkBuilder.hostname(hostname.let(GatewayRouteHostnameRewriteProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("ea962b36ff67d8164bfe9d56a4b92240e6d215288e85d90e16288cad289586bb")
      public override
          fun hostname(hostname: GatewayRouteHostnameRewriteProperty.Builder.() -> Unit): Unit =
          hostname(GatewayRouteHostnameRewriteProperty(hostname))

      public fun build():
          software.amazon.awscdk.services.appmesh.CfnGatewayRoute.GrpcGatewayRouteRewriteProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.appmesh.CfnGatewayRoute.GrpcGatewayRouteRewriteProperty,
    ) : GrpcGatewayRouteRewriteProperty {
      public override fun hostname(): Any? = unwrap(this).getHostname()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): GrpcGatewayRouteRewriteProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.appmesh.CfnGatewayRoute.GrpcGatewayRouteRewriteProperty):
          GrpcGatewayRouteRewriteProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: GrpcGatewayRouteRewriteProperty):
          software.amazon.awscdk.services.appmesh.CfnGatewayRoute.GrpcGatewayRouteRewriteProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface GrpcGatewayRouteMatchProperty {
    public fun hostname(): Any? = unwrap(this).getHostname()

    public fun metadata(): Any? = unwrap(this).getMetadata()

    public fun port(): Number? = unwrap(this).getPort()

    public fun serviceName(): String? = unwrap(this).getServiceName()

    public interface Builder {
      public fun hostname(hostname: IResolvable) {
      }

      public fun hostname(hostname: GatewayRouteHostnameMatchProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("986e86ae6e3366131d92920eb5f68e6aac18c5daf1b054d7fa33667e46d9275b")
      public fun hostname(hostname: GatewayRouteHostnameMatchProperty.Builder.() -> Unit) {
      }

      public fun metadata(metadata: IResolvable) {
      }

      public fun metadata(metadata: List<Any>) {
      }

      public fun port(port: Number) {
      }

      public fun serviceName(serviceName: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.appmesh.CfnGatewayRoute.GrpcGatewayRouteMatchProperty.Builder
          =
          software.amazon.awscdk.services.appmesh.CfnGatewayRoute.GrpcGatewayRouteMatchProperty.builder()

      public override fun hostname(hostname: IResolvable) {
        cdkBuilder.hostname(hostname.let(IResolvable::unwrap))
      }

      public override fun hostname(hostname: GatewayRouteHostnameMatchProperty) {
        cdkBuilder.hostname(hostname.let(GatewayRouteHostnameMatchProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("986e86ae6e3366131d92920eb5f68e6aac18c5daf1b054d7fa33667e46d9275b")
      public override fun hostname(hostname: GatewayRouteHostnameMatchProperty.Builder.() -> Unit):
          Unit = hostname(GatewayRouteHostnameMatchProperty(hostname))

      public override fun metadata(metadata: IResolvable) {
        cdkBuilder.metadata(metadata.let(IResolvable::unwrap))
      }

      public override fun metadata(metadata: List<Any>) {
        cdkBuilder.metadata(metadata)
      }

      public override fun port(port: Number) {
        cdkBuilder.port(port)
      }

      public override fun serviceName(serviceName: String) {
        cdkBuilder.serviceName(serviceName)
      }

      public fun build():
          software.amazon.awscdk.services.appmesh.CfnGatewayRoute.GrpcGatewayRouteMatchProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.appmesh.CfnGatewayRoute.GrpcGatewayRouteMatchProperty,
    ) : GrpcGatewayRouteMatchProperty {
      public override fun hostname(): Any? = unwrap(this).getHostname()

      public override fun metadata(): Any? = unwrap(this).getMetadata()

      public override fun port(): Number? = unwrap(this).getPort()

      public override fun serviceName(): String? = unwrap(this).getServiceName()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): GrpcGatewayRouteMatchProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.appmesh.CfnGatewayRoute.GrpcGatewayRouteMatchProperty):
          GrpcGatewayRouteMatchProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: GrpcGatewayRouteMatchProperty):
          software.amazon.awscdk.services.appmesh.CfnGatewayRoute.GrpcGatewayRouteMatchProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface HttpGatewayRoutePathRewriteProperty {
    public fun exact(): String? = unwrap(this).getExact()

    public interface Builder {
      public fun exact(exact: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.appmesh.CfnGatewayRoute.HttpGatewayRoutePathRewriteProperty.Builder
          =
          software.amazon.awscdk.services.appmesh.CfnGatewayRoute.HttpGatewayRoutePathRewriteProperty.builder()

      public override fun exact(exact: String) {
        cdkBuilder.exact(exact)
      }

      public fun build():
          software.amazon.awscdk.services.appmesh.CfnGatewayRoute.HttpGatewayRoutePathRewriteProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.appmesh.CfnGatewayRoute.HttpGatewayRoutePathRewriteProperty,
    ) : HttpGatewayRoutePathRewriteProperty {
      public override fun exact(): String? = unwrap(this).getExact()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}):
          HttpGatewayRoutePathRewriteProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.appmesh.CfnGatewayRoute.HttpGatewayRoutePathRewriteProperty):
          HttpGatewayRoutePathRewriteProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: HttpGatewayRoutePathRewriteProperty):
          software.amazon.awscdk.services.appmesh.CfnGatewayRoute.HttpGatewayRoutePathRewriteProperty
          = (wrapped as Wrapper).cdkObject
    }
  }

  public interface GatewayRouteHostnameMatchProperty {
    public fun exact(): String? = unwrap(this).getExact()

    public fun suffix(): String? = unwrap(this).getSuffix()

    public interface Builder {
      public fun exact(exact: String) {
      }

      public fun suffix(suffix: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.appmesh.CfnGatewayRoute.GatewayRouteHostnameMatchProperty.Builder
          =
          software.amazon.awscdk.services.appmesh.CfnGatewayRoute.GatewayRouteHostnameMatchProperty.builder()

      public override fun exact(exact: String) {
        cdkBuilder.exact(exact)
      }

      public override fun suffix(suffix: String) {
        cdkBuilder.suffix(suffix)
      }

      public fun build():
          software.amazon.awscdk.services.appmesh.CfnGatewayRoute.GatewayRouteHostnameMatchProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.appmesh.CfnGatewayRoute.GatewayRouteHostnameMatchProperty,
    ) : GatewayRouteHostnameMatchProperty {
      public override fun exact(): String? = unwrap(this).getExact()

      public override fun suffix(): String? = unwrap(this).getSuffix()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}):
          GatewayRouteHostnameMatchProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.appmesh.CfnGatewayRoute.GatewayRouteHostnameMatchProperty):
          GatewayRouteHostnameMatchProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: GatewayRouteHostnameMatchProperty):
          software.amazon.awscdk.services.appmesh.CfnGatewayRoute.GatewayRouteHostnameMatchProperty
          = (wrapped as Wrapper).cdkObject
    }
  }

  public interface GatewayRouteMetadataMatchProperty {
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

      public fun range(range: GatewayRouteRangeMatchProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("59c69f20ba599e306047d9e19bef62df93a64f848ac3b020c38b157baad87553")
      public fun range(range: GatewayRouteRangeMatchProperty.Builder.() -> Unit) {
      }

      public fun regex(regex: String) {
      }

      public fun suffix(suffix: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.appmesh.CfnGatewayRoute.GatewayRouteMetadataMatchProperty.Builder
          =
          software.amazon.awscdk.services.appmesh.CfnGatewayRoute.GatewayRouteMetadataMatchProperty.builder()

      public override fun exact(exact: String) {
        cdkBuilder.exact(exact)
      }

      public override fun prefix(prefix: String) {
        cdkBuilder.prefix(prefix)
      }

      public override fun range(range: IResolvable) {
        cdkBuilder.range(range.let(IResolvable::unwrap))
      }

      public override fun range(range: GatewayRouteRangeMatchProperty) {
        cdkBuilder.range(range.let(GatewayRouteRangeMatchProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("59c69f20ba599e306047d9e19bef62df93a64f848ac3b020c38b157baad87553")
      public override fun range(range: GatewayRouteRangeMatchProperty.Builder.() -> Unit): Unit =
          range(GatewayRouteRangeMatchProperty(range))

      public override fun regex(regex: String) {
        cdkBuilder.regex(regex)
      }

      public override fun suffix(suffix: String) {
        cdkBuilder.suffix(suffix)
      }

      public fun build():
          software.amazon.awscdk.services.appmesh.CfnGatewayRoute.GatewayRouteMetadataMatchProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.appmesh.CfnGatewayRoute.GatewayRouteMetadataMatchProperty,
    ) : GatewayRouteMetadataMatchProperty {
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
          GatewayRouteMetadataMatchProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.appmesh.CfnGatewayRoute.GatewayRouteMetadataMatchProperty):
          GatewayRouteMetadataMatchProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: GatewayRouteMetadataMatchProperty):
          software.amazon.awscdk.services.appmesh.CfnGatewayRoute.GatewayRouteMetadataMatchProperty
          = (wrapped as Wrapper).cdkObject
    }
  }

  public interface HttpGatewayRouteProperty {
    public fun action(): Any

    public fun match(): Any

    public interface Builder {
      public fun action(action: IResolvable) {
      }

      public fun action(action: HttpGatewayRouteActionProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("c449bf2166af344ba40a1cfbb889aa9887952fdd65805838aed84488bc18bcfb")
      public fun action(action: HttpGatewayRouteActionProperty.Builder.() -> Unit) {
      }

      public fun match(match: IResolvable) {
      }

      public fun match(match: HttpGatewayRouteMatchProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("3f677423fa328fcffdd3d500ea46fe09b203dfd3382263c21f89337452fc707e")
      public fun match(match: HttpGatewayRouteMatchProperty.Builder.() -> Unit) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.appmesh.CfnGatewayRoute.HttpGatewayRouteProperty.Builder =
          software.amazon.awscdk.services.appmesh.CfnGatewayRoute.HttpGatewayRouteProperty.builder()

      public override fun action(action: IResolvable) {
        cdkBuilder.action(action.let(IResolvable::unwrap))
      }

      public override fun action(action: HttpGatewayRouteActionProperty) {
        cdkBuilder.action(action.let(HttpGatewayRouteActionProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("c449bf2166af344ba40a1cfbb889aa9887952fdd65805838aed84488bc18bcfb")
      public override fun action(action: HttpGatewayRouteActionProperty.Builder.() -> Unit): Unit =
          action(HttpGatewayRouteActionProperty(action))

      public override fun match(match: IResolvable) {
        cdkBuilder.match(match.let(IResolvable::unwrap))
      }

      public override fun match(match: HttpGatewayRouteMatchProperty) {
        cdkBuilder.match(match.let(HttpGatewayRouteMatchProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("3f677423fa328fcffdd3d500ea46fe09b203dfd3382263c21f89337452fc707e")
      public override fun match(match: HttpGatewayRouteMatchProperty.Builder.() -> Unit): Unit =
          match(HttpGatewayRouteMatchProperty(match))

      public fun build():
          software.amazon.awscdk.services.appmesh.CfnGatewayRoute.HttpGatewayRouteProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.appmesh.CfnGatewayRoute.HttpGatewayRouteProperty,
    ) : HttpGatewayRouteProperty {
      public override fun action(): Any = unwrap(this).getAction()

      public override fun match(): Any = unwrap(this).getMatch()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): HttpGatewayRouteProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.appmesh.CfnGatewayRoute.HttpGatewayRouteProperty):
          HttpGatewayRouteProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: HttpGatewayRouteProperty):
          software.amazon.awscdk.services.appmesh.CfnGatewayRoute.HttpGatewayRouteProperty =
          (wrapped as Wrapper).cdkObject
    }
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
          software.amazon.awscdk.services.appmesh.CfnGatewayRoute.HttpPathMatchProperty.Builder =
          software.amazon.awscdk.services.appmesh.CfnGatewayRoute.HttpPathMatchProperty.builder()

      public override fun exact(exact: String) {
        cdkBuilder.exact(exact)
      }

      public override fun regex(regex: String) {
        cdkBuilder.regex(regex)
      }

      public fun build():
          software.amazon.awscdk.services.appmesh.CfnGatewayRoute.HttpPathMatchProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.appmesh.CfnGatewayRoute.HttpPathMatchProperty,
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
          fun wrap(cdkObject: software.amazon.awscdk.services.appmesh.CfnGatewayRoute.HttpPathMatchProperty):
          HttpPathMatchProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: HttpPathMatchProperty):
          software.amazon.awscdk.services.appmesh.CfnGatewayRoute.HttpPathMatchProperty = (wrapped
          as Wrapper).cdkObject
    }
  }

  public interface GatewayRouteSpecProperty {
    public fun grpcRoute(): Any? = unwrap(this).getGrpcRoute()

    public fun http2Route(): Any? = unwrap(this).getHttp2Route()

    public fun httpRoute(): Any? = unwrap(this).getHttpRoute()

    public fun priority(): Number? = unwrap(this).getPriority()

    public interface Builder {
      public fun grpcRoute(grpcRoute: IResolvable) {
      }

      public fun grpcRoute(grpcRoute: GrpcGatewayRouteProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("9ba955b20867711f21ad2ca280f987a3d3b5131f6e389e6f2902756e108eb927")
      public fun grpcRoute(grpcRoute: GrpcGatewayRouteProperty.Builder.() -> Unit) {
      }

      public fun http2Route(http2Route: IResolvable) {
      }

      public fun http2Route(http2Route: HttpGatewayRouteProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("bced87db47d043ffd51ea911ee6b5b75d6b030fe59cd5fcd70b8fd10ac690829")
      public fun http2Route(http2Route: HttpGatewayRouteProperty.Builder.() -> Unit) {
      }

      public fun httpRoute(httpRoute: IResolvable) {
      }

      public fun httpRoute(httpRoute: HttpGatewayRouteProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("2326c5433d615a4ae58ec1f536430545a2588ae70575b4f2dd4a5707b57695e6")
      public fun httpRoute(httpRoute: HttpGatewayRouteProperty.Builder.() -> Unit) {
      }

      public fun priority(priority: Number) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.appmesh.CfnGatewayRoute.GatewayRouteSpecProperty.Builder =
          software.amazon.awscdk.services.appmesh.CfnGatewayRoute.GatewayRouteSpecProperty.builder()

      public override fun grpcRoute(grpcRoute: IResolvable) {
        cdkBuilder.grpcRoute(grpcRoute.let(IResolvable::unwrap))
      }

      public override fun grpcRoute(grpcRoute: GrpcGatewayRouteProperty) {
        cdkBuilder.grpcRoute(grpcRoute.let(GrpcGatewayRouteProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("9ba955b20867711f21ad2ca280f987a3d3b5131f6e389e6f2902756e108eb927")
      public override fun grpcRoute(grpcRoute: GrpcGatewayRouteProperty.Builder.() -> Unit): Unit =
          grpcRoute(GrpcGatewayRouteProperty(grpcRoute))

      public override fun http2Route(http2Route: IResolvable) {
        cdkBuilder.http2Route(http2Route.let(IResolvable::unwrap))
      }

      public override fun http2Route(http2Route: HttpGatewayRouteProperty) {
        cdkBuilder.http2Route(http2Route.let(HttpGatewayRouteProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("bced87db47d043ffd51ea911ee6b5b75d6b030fe59cd5fcd70b8fd10ac690829")
      public override fun http2Route(http2Route: HttpGatewayRouteProperty.Builder.() -> Unit): Unit
          = http2Route(HttpGatewayRouteProperty(http2Route))

      public override fun httpRoute(httpRoute: IResolvable) {
        cdkBuilder.httpRoute(httpRoute.let(IResolvable::unwrap))
      }

      public override fun httpRoute(httpRoute: HttpGatewayRouteProperty) {
        cdkBuilder.httpRoute(httpRoute.let(HttpGatewayRouteProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("2326c5433d615a4ae58ec1f536430545a2588ae70575b4f2dd4a5707b57695e6")
      public override fun httpRoute(httpRoute: HttpGatewayRouteProperty.Builder.() -> Unit): Unit =
          httpRoute(HttpGatewayRouteProperty(httpRoute))

      public override fun priority(priority: Number) {
        cdkBuilder.priority(priority)
      }

      public fun build():
          software.amazon.awscdk.services.appmesh.CfnGatewayRoute.GatewayRouteSpecProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.appmesh.CfnGatewayRoute.GatewayRouteSpecProperty,
    ) : GatewayRouteSpecProperty {
      public override fun grpcRoute(): Any? = unwrap(this).getGrpcRoute()

      public override fun http2Route(): Any? = unwrap(this).getHttp2Route()

      public override fun httpRoute(): Any? = unwrap(this).getHttpRoute()

      public override fun priority(): Number? = unwrap(this).getPriority()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): GatewayRouteSpecProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.appmesh.CfnGatewayRoute.GatewayRouteSpecProperty):
          GatewayRouteSpecProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: GatewayRouteSpecProperty):
          software.amazon.awscdk.services.appmesh.CfnGatewayRoute.GatewayRouteSpecProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface HttpGatewayRouteHeaderProperty {
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

      public fun match(match: HttpGatewayRouteHeaderMatchProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("0dfbf8b5058ffc7d2fed5abeefc1451a07414615f5375f1e140ad6ab77474b84")
      public fun match(match: HttpGatewayRouteHeaderMatchProperty.Builder.() -> Unit) {
      }

      public fun name(name: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.appmesh.CfnGatewayRoute.HttpGatewayRouteHeaderProperty.Builder
          =
          software.amazon.awscdk.services.appmesh.CfnGatewayRoute.HttpGatewayRouteHeaderProperty.builder()

      public override fun invert(invert: Boolean) {
        cdkBuilder.invert(invert)
      }

      public override fun invert(invert: IResolvable) {
        cdkBuilder.invert(invert.let(IResolvable::unwrap))
      }

      public override fun match(match: IResolvable) {
        cdkBuilder.match(match.let(IResolvable::unwrap))
      }

      public override fun match(match: HttpGatewayRouteHeaderMatchProperty) {
        cdkBuilder.match(match.let(HttpGatewayRouteHeaderMatchProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("0dfbf8b5058ffc7d2fed5abeefc1451a07414615f5375f1e140ad6ab77474b84")
      public override fun match(match: HttpGatewayRouteHeaderMatchProperty.Builder.() -> Unit): Unit
          = match(HttpGatewayRouteHeaderMatchProperty(match))

      public override fun name(name: String) {
        cdkBuilder.name(name)
      }

      public fun build():
          software.amazon.awscdk.services.appmesh.CfnGatewayRoute.HttpGatewayRouteHeaderProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.appmesh.CfnGatewayRoute.HttpGatewayRouteHeaderProperty,
    ) : HttpGatewayRouteHeaderProperty {
      public override fun invert(): Any? = unwrap(this).getInvert()

      public override fun match(): Any? = unwrap(this).getMatch()

      public override fun name(): String = unwrap(this).getName()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): HttpGatewayRouteHeaderProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.appmesh.CfnGatewayRoute.HttpGatewayRouteHeaderProperty):
          HttpGatewayRouteHeaderProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: HttpGatewayRouteHeaderProperty):
          software.amazon.awscdk.services.appmesh.CfnGatewayRoute.HttpGatewayRouteHeaderProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface GrpcGatewayRouteActionProperty {
    public fun rewrite(): Any? = unwrap(this).getRewrite()

    public fun target(): Any

    public interface Builder {
      public fun rewrite(rewrite: IResolvable) {
      }

      public fun rewrite(rewrite: GrpcGatewayRouteRewriteProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("5945a157de2f1f923ea34ca95471cf4dbdba908f2b97297eae085b7406dc0921")
      public fun rewrite(rewrite: GrpcGatewayRouteRewriteProperty.Builder.() -> Unit) {
      }

      public fun target(target: IResolvable) {
      }

      public fun target(target: GatewayRouteTargetProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("4a0812448e5aad1c8c7d0bc2131687925875fd12f5fd359b6ee7786c6dfddb91")
      public fun target(target: GatewayRouteTargetProperty.Builder.() -> Unit) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.appmesh.CfnGatewayRoute.GrpcGatewayRouteActionProperty.Builder
          =
          software.amazon.awscdk.services.appmesh.CfnGatewayRoute.GrpcGatewayRouteActionProperty.builder()

      public override fun rewrite(rewrite: IResolvable) {
        cdkBuilder.rewrite(rewrite.let(IResolvable::unwrap))
      }

      public override fun rewrite(rewrite: GrpcGatewayRouteRewriteProperty) {
        cdkBuilder.rewrite(rewrite.let(GrpcGatewayRouteRewriteProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("5945a157de2f1f923ea34ca95471cf4dbdba908f2b97297eae085b7406dc0921")
      public override fun rewrite(rewrite: GrpcGatewayRouteRewriteProperty.Builder.() -> Unit): Unit
          = rewrite(GrpcGatewayRouteRewriteProperty(rewrite))

      public override fun target(target: IResolvable) {
        cdkBuilder.target(target.let(IResolvable::unwrap))
      }

      public override fun target(target: GatewayRouteTargetProperty) {
        cdkBuilder.target(target.let(GatewayRouteTargetProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("4a0812448e5aad1c8c7d0bc2131687925875fd12f5fd359b6ee7786c6dfddb91")
      public override fun target(target: GatewayRouteTargetProperty.Builder.() -> Unit): Unit =
          target(GatewayRouteTargetProperty(target))

      public fun build():
          software.amazon.awscdk.services.appmesh.CfnGatewayRoute.GrpcGatewayRouteActionProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.appmesh.CfnGatewayRoute.GrpcGatewayRouteActionProperty,
    ) : GrpcGatewayRouteActionProperty {
      public override fun rewrite(): Any? = unwrap(this).getRewrite()

      public override fun target(): Any = unwrap(this).getTarget()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): GrpcGatewayRouteActionProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.appmesh.CfnGatewayRoute.GrpcGatewayRouteActionProperty):
          GrpcGatewayRouteActionProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: GrpcGatewayRouteActionProperty):
          software.amazon.awscdk.services.appmesh.CfnGatewayRoute.GrpcGatewayRouteActionProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface GatewayRouteVirtualServiceProperty {
    public fun virtualServiceName(): String

    public interface Builder {
      public fun virtualServiceName(virtualServiceName: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.appmesh.CfnGatewayRoute.GatewayRouteVirtualServiceProperty.Builder
          =
          software.amazon.awscdk.services.appmesh.CfnGatewayRoute.GatewayRouteVirtualServiceProperty.builder()

      public override fun virtualServiceName(virtualServiceName: String) {
        cdkBuilder.virtualServiceName(virtualServiceName)
      }

      public fun build():
          software.amazon.awscdk.services.appmesh.CfnGatewayRoute.GatewayRouteVirtualServiceProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.appmesh.CfnGatewayRoute.GatewayRouteVirtualServiceProperty,
    ) : GatewayRouteVirtualServiceProperty {
      public override fun virtualServiceName(): String = unwrap(this).getVirtualServiceName()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}):
          GatewayRouteVirtualServiceProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.appmesh.CfnGatewayRoute.GatewayRouteVirtualServiceProperty):
          GatewayRouteVirtualServiceProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: GatewayRouteVirtualServiceProperty):
          software.amazon.awscdk.services.appmesh.CfnGatewayRoute.GatewayRouteVirtualServiceProperty
          = (wrapped as Wrapper).cdkObject
    }
  }

  public interface GrpcGatewayRouteProperty {
    public fun action(): Any

    public fun match(): Any

    public interface Builder {
      public fun action(action: IResolvable) {
      }

      public fun action(action: GrpcGatewayRouteActionProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("d799c5cc1629cd2c3aa08a919954cb15221596855193923dd8db4a92b52d8c49")
      public fun action(action: GrpcGatewayRouteActionProperty.Builder.() -> Unit) {
      }

      public fun match(match: IResolvable) {
      }

      public fun match(match: GrpcGatewayRouteMatchProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("5562889ffa0f866f2b2b44904b1ad3ccfeeb885c7f120e484411dbb71f1b253d")
      public fun match(match: GrpcGatewayRouteMatchProperty.Builder.() -> Unit) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.appmesh.CfnGatewayRoute.GrpcGatewayRouteProperty.Builder =
          software.amazon.awscdk.services.appmesh.CfnGatewayRoute.GrpcGatewayRouteProperty.builder()

      public override fun action(action: IResolvable) {
        cdkBuilder.action(action.let(IResolvable::unwrap))
      }

      public override fun action(action: GrpcGatewayRouteActionProperty) {
        cdkBuilder.action(action.let(GrpcGatewayRouteActionProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("d799c5cc1629cd2c3aa08a919954cb15221596855193923dd8db4a92b52d8c49")
      public override fun action(action: GrpcGatewayRouteActionProperty.Builder.() -> Unit): Unit =
          action(GrpcGatewayRouteActionProperty(action))

      public override fun match(match: IResolvable) {
        cdkBuilder.match(match.let(IResolvable::unwrap))
      }

      public override fun match(match: GrpcGatewayRouteMatchProperty) {
        cdkBuilder.match(match.let(GrpcGatewayRouteMatchProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("5562889ffa0f866f2b2b44904b1ad3ccfeeb885c7f120e484411dbb71f1b253d")
      public override fun match(match: GrpcGatewayRouteMatchProperty.Builder.() -> Unit): Unit =
          match(GrpcGatewayRouteMatchProperty(match))

      public fun build():
          software.amazon.awscdk.services.appmesh.CfnGatewayRoute.GrpcGatewayRouteProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.appmesh.CfnGatewayRoute.GrpcGatewayRouteProperty,
    ) : GrpcGatewayRouteProperty {
      public override fun action(): Any = unwrap(this).getAction()

      public override fun match(): Any = unwrap(this).getMatch()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): GrpcGatewayRouteProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.appmesh.CfnGatewayRoute.GrpcGatewayRouteProperty):
          GrpcGatewayRouteProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: GrpcGatewayRouteProperty):
          software.amazon.awscdk.services.appmesh.CfnGatewayRoute.GrpcGatewayRouteProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface GrpcGatewayRouteMetadataProperty {
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

      public fun match(match: GatewayRouteMetadataMatchProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("23f4becdd8860f5679dbd1ee5baedea108c816767defd9d65496e9e32e99d6e2")
      public fun match(match: GatewayRouteMetadataMatchProperty.Builder.() -> Unit) {
      }

      public fun name(name: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.appmesh.CfnGatewayRoute.GrpcGatewayRouteMetadataProperty.Builder
          =
          software.amazon.awscdk.services.appmesh.CfnGatewayRoute.GrpcGatewayRouteMetadataProperty.builder()

      public override fun invert(invert: Boolean) {
        cdkBuilder.invert(invert)
      }

      public override fun invert(invert: IResolvable) {
        cdkBuilder.invert(invert.let(IResolvable::unwrap))
      }

      public override fun match(match: IResolvable) {
        cdkBuilder.match(match.let(IResolvable::unwrap))
      }

      public override fun match(match: GatewayRouteMetadataMatchProperty) {
        cdkBuilder.match(match.let(GatewayRouteMetadataMatchProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("23f4becdd8860f5679dbd1ee5baedea108c816767defd9d65496e9e32e99d6e2")
      public override fun match(match: GatewayRouteMetadataMatchProperty.Builder.() -> Unit): Unit =
          match(GatewayRouteMetadataMatchProperty(match))

      public override fun name(name: String) {
        cdkBuilder.name(name)
      }

      public fun build():
          software.amazon.awscdk.services.appmesh.CfnGatewayRoute.GrpcGatewayRouteMetadataProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.appmesh.CfnGatewayRoute.GrpcGatewayRouteMetadataProperty,
    ) : GrpcGatewayRouteMetadataProperty {
      public override fun invert(): Any? = unwrap(this).getInvert()

      public override fun match(): Any? = unwrap(this).getMatch()

      public override fun name(): String = unwrap(this).getName()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): GrpcGatewayRouteMetadataProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.appmesh.CfnGatewayRoute.GrpcGatewayRouteMetadataProperty):
          GrpcGatewayRouteMetadataProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: GrpcGatewayRouteMetadataProperty):
          software.amazon.awscdk.services.appmesh.CfnGatewayRoute.GrpcGatewayRouteMetadataProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface HttpGatewayRouteHeaderMatchProperty {
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

      public fun range(range: GatewayRouteRangeMatchProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("6960f9384dbb08a16d8003ef5cffeab85b10084f63688a9fd9b28fb14d3df3d2")
      public fun range(range: GatewayRouteRangeMatchProperty.Builder.() -> Unit) {
      }

      public fun regex(regex: String) {
      }

      public fun suffix(suffix: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.appmesh.CfnGatewayRoute.HttpGatewayRouteHeaderMatchProperty.Builder
          =
          software.amazon.awscdk.services.appmesh.CfnGatewayRoute.HttpGatewayRouteHeaderMatchProperty.builder()

      public override fun exact(exact: String) {
        cdkBuilder.exact(exact)
      }

      public override fun prefix(prefix: String) {
        cdkBuilder.prefix(prefix)
      }

      public override fun range(range: IResolvable) {
        cdkBuilder.range(range.let(IResolvable::unwrap))
      }

      public override fun range(range: GatewayRouteRangeMatchProperty) {
        cdkBuilder.range(range.let(GatewayRouteRangeMatchProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("6960f9384dbb08a16d8003ef5cffeab85b10084f63688a9fd9b28fb14d3df3d2")
      public override fun range(range: GatewayRouteRangeMatchProperty.Builder.() -> Unit): Unit =
          range(GatewayRouteRangeMatchProperty(range))

      public override fun regex(regex: String) {
        cdkBuilder.regex(regex)
      }

      public override fun suffix(suffix: String) {
        cdkBuilder.suffix(suffix)
      }

      public fun build():
          software.amazon.awscdk.services.appmesh.CfnGatewayRoute.HttpGatewayRouteHeaderMatchProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.appmesh.CfnGatewayRoute.HttpGatewayRouteHeaderMatchProperty,
    ) : HttpGatewayRouteHeaderMatchProperty {
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
          HttpGatewayRouteHeaderMatchProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.appmesh.CfnGatewayRoute.HttpGatewayRouteHeaderMatchProperty):
          HttpGatewayRouteHeaderMatchProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: HttpGatewayRouteHeaderMatchProperty):
          software.amazon.awscdk.services.appmesh.CfnGatewayRoute.HttpGatewayRouteHeaderMatchProperty
          = (wrapped as Wrapper).cdkObject
    }
  }
}
