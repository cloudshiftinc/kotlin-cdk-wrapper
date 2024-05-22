@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.refactorspaces

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

/**
 * Properties for defining a `CfnRoute`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.refactorspaces.*;
 * CfnRouteProps cfnRouteProps = CfnRouteProps.builder()
 * .applicationIdentifier("applicationIdentifier")
 * .environmentIdentifier("environmentIdentifier")
 * .routeType("routeType")
 * .serviceIdentifier("serviceIdentifier")
 * // the properties below are optional
 * .defaultRoute(DefaultRouteInputProperty.builder()
 * .activationState("activationState")
 * .build())
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .uriPathRoute(UriPathRouteInputProperty.builder()
 * .activationState("activationState")
 * // the properties below are optional
 * .appendSourcePath(false)
 * .includeChildPaths(false)
 * .methods(List.of("methods"))
 * .sourcePath("sourcePath")
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-refactorspaces-route.html)
 */
public interface CfnRouteProps {
  /**
   * The unique identifier of the application.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-refactorspaces-route.html#cfn-refactorspaces-route-applicationidentifier)
   */
  public fun applicationIdentifier(): String

  /**
   * Configuration for the default route type.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-refactorspaces-route.html#cfn-refactorspaces-route-defaultroute)
   */
  public fun defaultRoute(): Any? = unwrap(this).getDefaultRoute()

  /**
   * The unique identifier of the environment.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-refactorspaces-route.html#cfn-refactorspaces-route-environmentidentifier)
   */
  public fun environmentIdentifier(): String

  /**
   * The route type of the route.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-refactorspaces-route.html#cfn-refactorspaces-route-routetype)
   */
  public fun routeType(): String

  /**
   * The unique identifier of the service.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-refactorspaces-route.html#cfn-refactorspaces-route-serviceidentifier)
   */
  public fun serviceIdentifier(): String

  /**
   * The tags assigned to the route.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-refactorspaces-route.html#cfn-refactorspaces-route-tags)
   */
  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * The configuration for the URI path route type.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-refactorspaces-route.html#cfn-refactorspaces-route-uripathroute)
   */
  public fun uriPathRoute(): Any? = unwrap(this).getUriPathRoute()

  /**
   * A builder for [CfnRouteProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param applicationIdentifier The unique identifier of the application. 
     */
    public fun applicationIdentifier(applicationIdentifier: String)

    /**
     * @param defaultRoute Configuration for the default route type.
     */
    public fun defaultRoute(defaultRoute: IResolvable)

    /**
     * @param defaultRoute Configuration for the default route type.
     */
    public fun defaultRoute(defaultRoute: CfnRoute.DefaultRouteInputProperty)

    /**
     * @param defaultRoute Configuration for the default route type.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("54702f7ec04a350ed931a06f9b7f6464c891e49a0b887cd8e90e3c6608449d07")
    public fun defaultRoute(defaultRoute: CfnRoute.DefaultRouteInputProperty.Builder.() -> Unit)

    /**
     * @param environmentIdentifier The unique identifier of the environment. 
     */
    public fun environmentIdentifier(environmentIdentifier: String)

    /**
     * @param routeType The route type of the route. 
     */
    public fun routeType(routeType: String)

    /**
     * @param serviceIdentifier The unique identifier of the service. 
     */
    public fun serviceIdentifier(serviceIdentifier: String)

    /**
     * @param tags The tags assigned to the route.
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * @param tags The tags assigned to the route.
     */
    public fun tags(vararg tags: CfnTag)

    /**
     * @param uriPathRoute The configuration for the URI path route type.
     */
    public fun uriPathRoute(uriPathRoute: IResolvable)

    /**
     * @param uriPathRoute The configuration for the URI path route type.
     */
    public fun uriPathRoute(uriPathRoute: CfnRoute.UriPathRouteInputProperty)

    /**
     * @param uriPathRoute The configuration for the URI path route type.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("a52770a22ca684da7a882406692829b5ddb2f0d20c4f8d52895f78f618600ca4")
    public fun uriPathRoute(uriPathRoute: CfnRoute.UriPathRouteInputProperty.Builder.() -> Unit)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.refactorspaces.CfnRouteProps.Builder =
        software.amazon.awscdk.services.refactorspaces.CfnRouteProps.builder()

    /**
     * @param applicationIdentifier The unique identifier of the application. 
     */
    override fun applicationIdentifier(applicationIdentifier: String) {
      cdkBuilder.applicationIdentifier(applicationIdentifier)
    }

    /**
     * @param defaultRoute Configuration for the default route type.
     */
    override fun defaultRoute(defaultRoute: IResolvable) {
      cdkBuilder.defaultRoute(defaultRoute.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param defaultRoute Configuration for the default route type.
     */
    override fun defaultRoute(defaultRoute: CfnRoute.DefaultRouteInputProperty) {
      cdkBuilder.defaultRoute(defaultRoute.let(CfnRoute.DefaultRouteInputProperty.Companion::unwrap))
    }

    /**
     * @param defaultRoute Configuration for the default route type.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("54702f7ec04a350ed931a06f9b7f6464c891e49a0b887cd8e90e3c6608449d07")
    override fun defaultRoute(defaultRoute: CfnRoute.DefaultRouteInputProperty.Builder.() -> Unit):
        Unit = defaultRoute(CfnRoute.DefaultRouteInputProperty(defaultRoute))

    /**
     * @param environmentIdentifier The unique identifier of the environment. 
     */
    override fun environmentIdentifier(environmentIdentifier: String) {
      cdkBuilder.environmentIdentifier(environmentIdentifier)
    }

    /**
     * @param routeType The route type of the route. 
     */
    override fun routeType(routeType: String) {
      cdkBuilder.routeType(routeType)
    }

    /**
     * @param serviceIdentifier The unique identifier of the service. 
     */
    override fun serviceIdentifier(serviceIdentifier: String) {
      cdkBuilder.serviceIdentifier(serviceIdentifier)
    }

    /**
     * @param tags The tags assigned to the route.
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag.Companion::unwrap))
    }

    /**
     * @param tags The tags assigned to the route.
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    /**
     * @param uriPathRoute The configuration for the URI path route type.
     */
    override fun uriPathRoute(uriPathRoute: IResolvable) {
      cdkBuilder.uriPathRoute(uriPathRoute.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param uriPathRoute The configuration for the URI path route type.
     */
    override fun uriPathRoute(uriPathRoute: CfnRoute.UriPathRouteInputProperty) {
      cdkBuilder.uriPathRoute(uriPathRoute.let(CfnRoute.UriPathRouteInputProperty.Companion::unwrap))
    }

    /**
     * @param uriPathRoute The configuration for the URI path route type.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("a52770a22ca684da7a882406692829b5ddb2f0d20c4f8d52895f78f618600ca4")
    override fun uriPathRoute(uriPathRoute: CfnRoute.UriPathRouteInputProperty.Builder.() -> Unit):
        Unit = uriPathRoute(CfnRoute.UriPathRouteInputProperty(uriPathRoute))

    public fun build(): software.amazon.awscdk.services.refactorspaces.CfnRouteProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.refactorspaces.CfnRouteProps,
  ) : CdkObject(cdkObject), CfnRouteProps {
    /**
     * The unique identifier of the application.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-refactorspaces-route.html#cfn-refactorspaces-route-applicationidentifier)
     */
    override fun applicationIdentifier(): String = unwrap(this).getApplicationIdentifier()

    /**
     * Configuration for the default route type.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-refactorspaces-route.html#cfn-refactorspaces-route-defaultroute)
     */
    override fun defaultRoute(): Any? = unwrap(this).getDefaultRoute()

    /**
     * The unique identifier of the environment.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-refactorspaces-route.html#cfn-refactorspaces-route-environmentidentifier)
     */
    override fun environmentIdentifier(): String = unwrap(this).getEnvironmentIdentifier()

    /**
     * The route type of the route.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-refactorspaces-route.html#cfn-refactorspaces-route-routetype)
     */
    override fun routeType(): String = unwrap(this).getRouteType()

    /**
     * The unique identifier of the service.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-refactorspaces-route.html#cfn-refactorspaces-route-serviceidentifier)
     */
    override fun serviceIdentifier(): String = unwrap(this).getServiceIdentifier()

    /**
     * The tags assigned to the route.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-refactorspaces-route.html#cfn-refactorspaces-route-tags)
     */
    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

    /**
     * The configuration for the URI path route type.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-refactorspaces-route.html#cfn-refactorspaces-route-uripathroute)
     */
    override fun uriPathRoute(): Any? = unwrap(this).getUriPathRoute()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnRouteProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.refactorspaces.CfnRouteProps):
        CfnRouteProps = CdkObjectWrappers.wrap(cdkObject) as? CfnRouteProps ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnRouteProps):
        software.amazon.awscdk.services.refactorspaces.CfnRouteProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.refactorspaces.CfnRouteProps
  }
}
