package io.cloudshiftdev.awscdk.services.refactorspaces

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.ITaggable
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
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
  private val cdkObject: software.amazon.awscdk.services.refactorspaces.CfnRoute,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  public open fun applicationIdentifier(): String = unwrap(this).getApplicationIdentifier()

  public open fun applicationIdentifier(`value`: String) {
    unwrap(this).setApplicationIdentifier(`value`)
  }

  public open fun attrArn(): String = unwrap(this).getAttrArn()

  public open fun attrPathResourceToId(): String = unwrap(this).getAttrPathResourceToId()

  public open fun attrRouteIdentifier(): String = unwrap(this).getAttrRouteIdentifier()

  public open fun defaultRoute(): Any? = unwrap(this).getDefaultRoute()

  public open fun defaultRoute(`value`: IResolvable) {
    unwrap(this).setDefaultRoute(`value`.let(IResolvable::unwrap))
  }

  public open fun defaultRoute(`value`: DefaultRouteInputProperty) {
    unwrap(this).setDefaultRoute(`value`.let(DefaultRouteInputProperty::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("4197c863f7a2f56e32f37a0dd6127e97f60763dd8e1089e604841544336b2d04")
  public open fun defaultRoute(`value`: DefaultRouteInputProperty.Builder.() -> Unit): Unit =
      defaultRoute(DefaultRouteInputProperty(`value`))

  public open fun environmentIdentifier(): String = unwrap(this).getEnvironmentIdentifier()

  public open fun environmentIdentifier(`value`: String) {
    unwrap(this).setEnvironmentIdentifier(`value`)
  }

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun routeType(): String = unwrap(this).getRouteType()

  public open fun routeType(`value`: String) {
    unwrap(this).setRouteType(`value`)
  }

  public open fun serviceIdentifier(): String = unwrap(this).getServiceIdentifier()

  public open fun serviceIdentifier(`value`: String) {
    unwrap(this).setServiceIdentifier(`value`)
  }

  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  public open fun tagsRaw(): List<CfnTag> = unwrap(this).getTagsRaw()?.map(CfnTag::wrap) ?:
      emptyList()

  public open fun tagsRaw(`value`: List<CfnTag>) {
    unwrap(this).setTagsRaw(`value`.map(CfnTag::unwrap))
  }

  public open fun tagsRaw(vararg `value`: CfnTag): Unit = tagsRaw(`value`.toList())

  public open fun uriPathRoute(): Any? = unwrap(this).getUriPathRoute()

  public open fun uriPathRoute(`value`: IResolvable) {
    unwrap(this).setUriPathRoute(`value`.let(IResolvable::unwrap))
  }

  public open fun uriPathRoute(`value`: UriPathRouteInputProperty) {
    unwrap(this).setUriPathRoute(`value`.let(UriPathRouteInputProperty::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("65ef4fde4a173945029ad19dcb3fe21e2d913ffe95c955d5a14422e3bd53f66c")
  public open fun uriPathRoute(`value`: UriPathRouteInputProperty.Builder.() -> Unit): Unit =
      uriPathRoute(UriPathRouteInputProperty(`value`))

  public interface Builder {
    public fun applicationIdentifier(applicationIdentifier: String)

    public fun defaultRoute(defaultRoute: IResolvable)

    public fun defaultRoute(defaultRoute: DefaultRouteInputProperty)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("ca106e9831e28b258c6a2cd5396f4b7d9726213f7a085efab4a2304461b4084a")
    public fun defaultRoute(defaultRoute: DefaultRouteInputProperty.Builder.() -> Unit)

    public fun environmentIdentifier(environmentIdentifier: String)

    public fun routeType(routeType: String)

    public fun serviceIdentifier(serviceIdentifier: String)

    public fun tags(tags: List<CfnTag>)

    public fun tags(vararg tags: CfnTag)

    public fun uriPathRoute(uriPathRoute: IResolvable)

    public fun uriPathRoute(uriPathRoute: UriPathRouteInputProperty)

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

    override fun applicationIdentifier(applicationIdentifier: String) {
      cdkBuilder.applicationIdentifier(applicationIdentifier)
    }

    override fun defaultRoute(defaultRoute: IResolvable) {
      cdkBuilder.defaultRoute(defaultRoute.let(IResolvable::unwrap))
    }

    override fun defaultRoute(defaultRoute: DefaultRouteInputProperty) {
      cdkBuilder.defaultRoute(defaultRoute.let(DefaultRouteInputProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("ca106e9831e28b258c6a2cd5396f4b7d9726213f7a085efab4a2304461b4084a")
    override fun defaultRoute(defaultRoute: DefaultRouteInputProperty.Builder.() -> Unit): Unit =
        defaultRoute(DefaultRouteInputProperty(defaultRoute))

    override fun environmentIdentifier(environmentIdentifier: String) {
      cdkBuilder.environmentIdentifier(environmentIdentifier)
    }

    override fun routeType(routeType: String) {
      cdkBuilder.routeType(routeType)
    }

    override fun serviceIdentifier(serviceIdentifier: String) {
      cdkBuilder.serviceIdentifier(serviceIdentifier)
    }

    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    override fun uriPathRoute(uriPathRoute: IResolvable) {
      cdkBuilder.uriPathRoute(uriPathRoute.let(IResolvable::unwrap))
    }

    override fun uriPathRoute(uriPathRoute: UriPathRouteInputProperty) {
      cdkBuilder.uriPathRoute(uriPathRoute.let(UriPathRouteInputProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("7b80c88766ed37adf2d5d8261d64bab5cfc07f8aee3d6690638691521de18a34")
    override fun uriPathRoute(uriPathRoute: UriPathRouteInputProperty.Builder.() -> Unit): Unit =
        uriPathRoute(UriPathRouteInputProperty(uriPathRoute))

    public fun build(): software.amazon.awscdk.services.refactorspaces.CfnRoute = cdkBuilder.build()
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

    internal fun wrap(cdkObject: software.amazon.awscdk.services.refactorspaces.CfnRoute): CfnRoute
        = CfnRoute(cdkObject)

    internal fun unwrap(wrapped: CfnRoute): software.amazon.awscdk.services.refactorspaces.CfnRoute
        = wrapped.cdkObject
  }

  public interface UriPathRouteInputProperty {
    public fun activationState(): String

    public fun appendSourcePath(): Any? = unwrap(this).getAppendSourcePath()

    public fun includeChildPaths(): Any? = unwrap(this).getIncludeChildPaths()

    public fun methods(): List<String> = unwrap(this).getMethods() ?: emptyList()

    public fun sourcePath(): String? = unwrap(this).getSourcePath()

    public interface Builder {
      public fun activationState(activationState: String)

      public fun appendSourcePath(appendSourcePath: Boolean)

      public fun appendSourcePath(appendSourcePath: IResolvable)

      public fun includeChildPaths(includeChildPaths: Boolean)

      public fun includeChildPaths(includeChildPaths: IResolvable)

      public fun methods(methods: List<String>)

      public fun methods(vararg methods: String)

      public fun sourcePath(sourcePath: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.refactorspaces.CfnRoute.UriPathRouteInputProperty.Builder
          =
          software.amazon.awscdk.services.refactorspaces.CfnRoute.UriPathRouteInputProperty.builder()

      override fun activationState(activationState: String) {
        cdkBuilder.activationState(activationState)
      }

      override fun appendSourcePath(appendSourcePath: Boolean) {
        cdkBuilder.appendSourcePath(appendSourcePath)
      }

      override fun appendSourcePath(appendSourcePath: IResolvable) {
        cdkBuilder.appendSourcePath(appendSourcePath.let(IResolvable::unwrap))
      }

      override fun includeChildPaths(includeChildPaths: Boolean) {
        cdkBuilder.includeChildPaths(includeChildPaths)
      }

      override fun includeChildPaths(includeChildPaths: IResolvable) {
        cdkBuilder.includeChildPaths(includeChildPaths.let(IResolvable::unwrap))
      }

      override fun methods(methods: List<String>) {
        cdkBuilder.methods(methods)
      }

      override fun methods(vararg methods: String): Unit = methods(methods.toList())

      override fun sourcePath(sourcePath: String) {
        cdkBuilder.sourcePath(sourcePath)
      }

      public fun build():
          software.amazon.awscdk.services.refactorspaces.CfnRoute.UriPathRouteInputProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.refactorspaces.CfnRoute.UriPathRouteInputProperty,
    ) : UriPathRouteInputProperty {
      override fun activationState(): String = unwrap(this).getActivationState()

      override fun appendSourcePath(): Any? = unwrap(this).getAppendSourcePath()

      override fun includeChildPaths(): Any? = unwrap(this).getIncludeChildPaths()

      override fun methods(): List<String> = unwrap(this).getMethods() ?: emptyList()

      override fun sourcePath(): String? = unwrap(this).getSourcePath()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): UriPathRouteInputProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.refactorspaces.CfnRoute.UriPathRouteInputProperty):
          UriPathRouteInputProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: UriPathRouteInputProperty):
          software.amazon.awscdk.services.refactorspaces.CfnRoute.UriPathRouteInputProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface DefaultRouteInputProperty {
    public fun activationState(): String

    public interface Builder {
      public fun activationState(activationState: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.refactorspaces.CfnRoute.DefaultRouteInputProperty.Builder
          =
          software.amazon.awscdk.services.refactorspaces.CfnRoute.DefaultRouteInputProperty.builder()

      override fun activationState(activationState: String) {
        cdkBuilder.activationState(activationState)
      }

      public fun build():
          software.amazon.awscdk.services.refactorspaces.CfnRoute.DefaultRouteInputProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.refactorspaces.CfnRoute.DefaultRouteInputProperty,
    ) : DefaultRouteInputProperty {
      override fun activationState(): String = unwrap(this).getActivationState()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): DefaultRouteInputProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.refactorspaces.CfnRoute.DefaultRouteInputProperty):
          DefaultRouteInputProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: DefaultRouteInputProperty):
          software.amazon.awscdk.services.refactorspaces.CfnRoute.DefaultRouteInputProperty =
          (wrapped as Wrapper).cdkObject
    }
  }
}
