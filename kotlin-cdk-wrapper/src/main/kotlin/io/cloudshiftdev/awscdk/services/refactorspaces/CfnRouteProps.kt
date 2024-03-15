@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.refactorspaces

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

public interface CfnRouteProps {
  public fun applicationIdentifier(): String

  public fun defaultRoute(): Any? = unwrap(this).getDefaultRoute()

  public fun environmentIdentifier(): String

  public fun routeType(): String

  public fun serviceIdentifier(): String

  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  public fun uriPathRoute(): Any? = unwrap(this).getUriPathRoute()

  @CdkDslMarker
  public interface Builder {
    public fun applicationIdentifier(applicationIdentifier: String)

    public fun defaultRoute(defaultRoute: IResolvable)

    public fun defaultRoute(defaultRoute: CfnRoute.DefaultRouteInputProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("54702f7ec04a350ed931a06f9b7f6464c891e49a0b887cd8e90e3c6608449d07")
    public fun defaultRoute(defaultRoute: CfnRoute.DefaultRouteInputProperty.Builder.() -> Unit)

    public fun environmentIdentifier(environmentIdentifier: String)

    public fun routeType(routeType: String)

    public fun serviceIdentifier(serviceIdentifier: String)

    public fun tags(tags: List<CfnTag>)

    public fun tags(vararg tags: CfnTag)

    public fun uriPathRoute(uriPathRoute: IResolvable)

    public fun uriPathRoute(uriPathRoute: CfnRoute.UriPathRouteInputProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("a52770a22ca684da7a882406692829b5ddb2f0d20c4f8d52895f78f618600ca4")
    public fun uriPathRoute(uriPathRoute: CfnRoute.UriPathRouteInputProperty.Builder.() -> Unit)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.refactorspaces.CfnRouteProps.Builder =
        software.amazon.awscdk.services.refactorspaces.CfnRouteProps.builder()

    override fun applicationIdentifier(applicationIdentifier: String) {
      cdkBuilder.applicationIdentifier(applicationIdentifier)
    }

    override fun defaultRoute(defaultRoute: IResolvable) {
      cdkBuilder.defaultRoute(defaultRoute.let(IResolvable::unwrap))
    }

    override fun defaultRoute(defaultRoute: CfnRoute.DefaultRouteInputProperty) {
      cdkBuilder.defaultRoute(defaultRoute.let(CfnRoute.DefaultRouteInputProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("54702f7ec04a350ed931a06f9b7f6464c891e49a0b887cd8e90e3c6608449d07")
    override fun defaultRoute(defaultRoute: CfnRoute.DefaultRouteInputProperty.Builder.() -> Unit):
        Unit = defaultRoute(CfnRoute.DefaultRouteInputProperty(defaultRoute))

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

    override fun uriPathRoute(uriPathRoute: CfnRoute.UriPathRouteInputProperty) {
      cdkBuilder.uriPathRoute(uriPathRoute.let(CfnRoute.UriPathRouteInputProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("a52770a22ca684da7a882406692829b5ddb2f0d20c4f8d52895f78f618600ca4")
    override fun uriPathRoute(uriPathRoute: CfnRoute.UriPathRouteInputProperty.Builder.() -> Unit):
        Unit = uriPathRoute(CfnRoute.UriPathRouteInputProperty(uriPathRoute))

    public fun build(): software.amazon.awscdk.services.refactorspaces.CfnRouteProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.refactorspaces.CfnRouteProps,
  ) : CdkObject(cdkObject), CfnRouteProps {
    override fun applicationIdentifier(): String = unwrap(this).getApplicationIdentifier()

    override fun defaultRoute(): Any? = unwrap(this).getDefaultRoute()

    override fun environmentIdentifier(): String = unwrap(this).getEnvironmentIdentifier()

    override fun routeType(): String = unwrap(this).getRouteType()

    override fun serviceIdentifier(): String = unwrap(this).getServiceIdentifier()

    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

    override fun uriPathRoute(): Any? = unwrap(this).getUriPathRoute()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnRouteProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.refactorspaces.CfnRouteProps):
        CfnRouteProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnRouteProps):
        software.amazon.awscdk.services.refactorspaces.CfnRouteProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.refactorspaces.CfnRouteProps
  }
}
