@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.appmesh

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
 * import io.cloudshiftdev.awscdk.services.appmesh.*;
 * CfnRouteProps cfnRouteProps = CfnRouteProps.builder()
 * .meshName("meshName")
 * .spec(RouteSpecProperty.builder()
 * .grpcRoute(GrpcRouteProperty.builder()
 * .action(GrpcRouteActionProperty.builder()
 * .weightedTargets(List.of(WeightedTargetProperty.builder()
 * .virtualNode("virtualNode")
 * .weight(123)
 * // the properties below are optional
 * .port(123)
 * .build()))
 * .build())
 * .match(GrpcRouteMatchProperty.builder()
 * .metadata(List.of(GrpcRouteMetadataProperty.builder()
 * .name("name")
 * // the properties below are optional
 * .invert(false)
 * .match(GrpcRouteMetadataMatchMethodProperty.builder()
 * .exact("exact")
 * .prefix("prefix")
 * .range(MatchRangeProperty.builder()
 * .end(123)
 * .start(123)
 * .build())
 * .regex("regex")
 * .suffix("suffix")
 * .build())
 * .build()))
 * .methodName("methodName")
 * .port(123)
 * .serviceName("serviceName")
 * .build())
 * // the properties below are optional
 * .retryPolicy(GrpcRetryPolicyProperty.builder()
 * .maxRetries(123)
 * .perRetryTimeout(DurationProperty.builder()
 * .unit("unit")
 * .value(123)
 * .build())
 * // the properties below are optional
 * .grpcRetryEvents(List.of("grpcRetryEvents"))
 * .httpRetryEvents(List.of("httpRetryEvents"))
 * .tcpRetryEvents(List.of("tcpRetryEvents"))
 * .build())
 * .timeout(GrpcTimeoutProperty.builder()
 * .idle(DurationProperty.builder()
 * .unit("unit")
 * .value(123)
 * .build())
 * .perRequest(DurationProperty.builder()
 * .unit("unit")
 * .value(123)
 * .build())
 * .build())
 * .build())
 * .http2Route(HttpRouteProperty.builder()
 * .action(HttpRouteActionProperty.builder()
 * .weightedTargets(List.of(WeightedTargetProperty.builder()
 * .virtualNode("virtualNode")
 * .weight(123)
 * // the properties below are optional
 * .port(123)
 * .build()))
 * .build())
 * .match(HttpRouteMatchProperty.builder()
 * .headers(List.of(HttpRouteHeaderProperty.builder()
 * .name("name")
 * // the properties below are optional
 * .invert(false)
 * .match(HeaderMatchMethodProperty.builder()
 * .exact("exact")
 * .prefix("prefix")
 * .range(MatchRangeProperty.builder()
 * .end(123)
 * .start(123)
 * .build())
 * .regex("regex")
 * .suffix("suffix")
 * .build())
 * .build()))
 * .method("method")
 * .path(HttpPathMatchProperty.builder()
 * .exact("exact")
 * .regex("regex")
 * .build())
 * .port(123)
 * .prefix("prefix")
 * .queryParameters(List.of(QueryParameterProperty.builder()
 * .name("name")
 * // the properties below are optional
 * .match(HttpQueryParameterMatchProperty.builder()
 * .exact("exact")
 * .build())
 * .build()))
 * .scheme("scheme")
 * .build())
 * // the properties below are optional
 * .retryPolicy(HttpRetryPolicyProperty.builder()
 * .maxRetries(123)
 * .perRetryTimeout(DurationProperty.builder()
 * .unit("unit")
 * .value(123)
 * .build())
 * // the properties below are optional
 * .httpRetryEvents(List.of("httpRetryEvents"))
 * .tcpRetryEvents(List.of("tcpRetryEvents"))
 * .build())
 * .timeout(HttpTimeoutProperty.builder()
 * .idle(DurationProperty.builder()
 * .unit("unit")
 * .value(123)
 * .build())
 * .perRequest(DurationProperty.builder()
 * .unit("unit")
 * .value(123)
 * .build())
 * .build())
 * .build())
 * .httpRoute(HttpRouteProperty.builder()
 * .action(HttpRouteActionProperty.builder()
 * .weightedTargets(List.of(WeightedTargetProperty.builder()
 * .virtualNode("virtualNode")
 * .weight(123)
 * // the properties below are optional
 * .port(123)
 * .build()))
 * .build())
 * .match(HttpRouteMatchProperty.builder()
 * .headers(List.of(HttpRouteHeaderProperty.builder()
 * .name("name")
 * // the properties below are optional
 * .invert(false)
 * .match(HeaderMatchMethodProperty.builder()
 * .exact("exact")
 * .prefix("prefix")
 * .range(MatchRangeProperty.builder()
 * .end(123)
 * .start(123)
 * .build())
 * .regex("regex")
 * .suffix("suffix")
 * .build())
 * .build()))
 * .method("method")
 * .path(HttpPathMatchProperty.builder()
 * .exact("exact")
 * .regex("regex")
 * .build())
 * .port(123)
 * .prefix("prefix")
 * .queryParameters(List.of(QueryParameterProperty.builder()
 * .name("name")
 * // the properties below are optional
 * .match(HttpQueryParameterMatchProperty.builder()
 * .exact("exact")
 * .build())
 * .build()))
 * .scheme("scheme")
 * .build())
 * // the properties below are optional
 * .retryPolicy(HttpRetryPolicyProperty.builder()
 * .maxRetries(123)
 * .perRetryTimeout(DurationProperty.builder()
 * .unit("unit")
 * .value(123)
 * .build())
 * // the properties below are optional
 * .httpRetryEvents(List.of("httpRetryEvents"))
 * .tcpRetryEvents(List.of("tcpRetryEvents"))
 * .build())
 * .timeout(HttpTimeoutProperty.builder()
 * .idle(DurationProperty.builder()
 * .unit("unit")
 * .value(123)
 * .build())
 * .perRequest(DurationProperty.builder()
 * .unit("unit")
 * .value(123)
 * .build())
 * .build())
 * .build())
 * .priority(123)
 * .tcpRoute(TcpRouteProperty.builder()
 * .action(TcpRouteActionProperty.builder()
 * .weightedTargets(List.of(WeightedTargetProperty.builder()
 * .virtualNode("virtualNode")
 * .weight(123)
 * // the properties below are optional
 * .port(123)
 * .build()))
 * .build())
 * // the properties below are optional
 * .match(TcpRouteMatchProperty.builder()
 * .port(123)
 * .build())
 * .timeout(TcpTimeoutProperty.builder()
 * .idle(DurationProperty.builder()
 * .unit("unit")
 * .value(123)
 * .build())
 * .build())
 * .build())
 * .build())
 * .virtualRouterName("virtualRouterName")
 * // the properties below are optional
 * .meshOwner("meshOwner")
 * .routeName("routeName")
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appmesh-route.html)
 */
public interface CfnRouteProps {
  /**
   * The name of the service mesh to create the route in.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appmesh-route.html#cfn-appmesh-route-meshname)
   */
  public fun meshName(): String

  /**
   * The AWS IAM account ID of the service mesh owner.
   *
   * If the account ID is not your own, then the account that you specify must share the mesh with
   * your account before you can create the resource in the service mesh. For more information about
   * mesh sharing, see [Working with shared
   * meshes](https://docs.aws.amazon.com/app-mesh/latest/userguide/sharing.html) .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appmesh-route.html#cfn-appmesh-route-meshowner)
   */
  public fun meshOwner(): String? = unwrap(this).getMeshOwner()

  /**
   * The name to use for the route.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appmesh-route.html#cfn-appmesh-route-routename)
   */
  public fun routeName(): String? = unwrap(this).getRouteName()

  /**
   * The route specification to apply.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appmesh-route.html#cfn-appmesh-route-spec)
   */
  public fun spec(): Any

  /**
   * Optional metadata that you can apply to the route to assist with categorization and
   * organization.
   *
   * Each tag consists of a key and an optional value, both of which you define. Tag keys can have a
   * maximum character length of 128 characters, and tag values can have a maximum length of 256
   * characters.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appmesh-route.html#cfn-appmesh-route-tags)
   */
  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * The name of the virtual router in which to create the route.
   *
   * If the virtual router is in a shared mesh, then you must be the owner of the virtual router
   * resource.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appmesh-route.html#cfn-appmesh-route-virtualroutername)
   */
  public fun virtualRouterName(): String

  /**
   * A builder for [CfnRouteProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param meshName The name of the service mesh to create the route in. 
     */
    public fun meshName(meshName: String)

    /**
     * @param meshOwner The AWS IAM account ID of the service mesh owner.
     * If the account ID is not your own, then the account that you specify must share the mesh with
     * your account before you can create the resource in the service mesh. For more information about
     * mesh sharing, see [Working with shared
     * meshes](https://docs.aws.amazon.com/app-mesh/latest/userguide/sharing.html) .
     */
    public fun meshOwner(meshOwner: String)

    /**
     * @param routeName The name to use for the route.
     */
    public fun routeName(routeName: String)

    /**
     * @param spec The route specification to apply. 
     */
    public fun spec(spec: IResolvable)

    /**
     * @param spec The route specification to apply. 
     */
    public fun spec(spec: CfnRoute.RouteSpecProperty)

    /**
     * @param spec The route specification to apply. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("e1b12af40c8f1b8f945e68d5c27c5aaf074c96033f10b2bb9489f10c91674295")
    public fun spec(spec: CfnRoute.RouteSpecProperty.Builder.() -> Unit)

    /**
     * @param tags Optional metadata that you can apply to the route to assist with categorization
     * and organization.
     * Each tag consists of a key and an optional value, both of which you define. Tag keys can have
     * a maximum character length of 128 characters, and tag values can have a maximum length of 256
     * characters.
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * @param tags Optional metadata that you can apply to the route to assist with categorization
     * and organization.
     * Each tag consists of a key and an optional value, both of which you define. Tag keys can have
     * a maximum character length of 128 characters, and tag values can have a maximum length of 256
     * characters.
     */
    public fun tags(vararg tags: CfnTag)

    /**
     * @param virtualRouterName The name of the virtual router in which to create the route. 
     * If the virtual router is in a shared mesh, then you must be the owner of the virtual router
     * resource.
     */
    public fun virtualRouterName(virtualRouterName: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.appmesh.CfnRouteProps.Builder =
        software.amazon.awscdk.services.appmesh.CfnRouteProps.builder()

    /**
     * @param meshName The name of the service mesh to create the route in. 
     */
    override fun meshName(meshName: String) {
      cdkBuilder.meshName(meshName)
    }

    /**
     * @param meshOwner The AWS IAM account ID of the service mesh owner.
     * If the account ID is not your own, then the account that you specify must share the mesh with
     * your account before you can create the resource in the service mesh. For more information about
     * mesh sharing, see [Working with shared
     * meshes](https://docs.aws.amazon.com/app-mesh/latest/userguide/sharing.html) .
     */
    override fun meshOwner(meshOwner: String) {
      cdkBuilder.meshOwner(meshOwner)
    }

    /**
     * @param routeName The name to use for the route.
     */
    override fun routeName(routeName: String) {
      cdkBuilder.routeName(routeName)
    }

    /**
     * @param spec The route specification to apply. 
     */
    override fun spec(spec: IResolvable) {
      cdkBuilder.spec(spec.let(IResolvable::unwrap))
    }

    /**
     * @param spec The route specification to apply. 
     */
    override fun spec(spec: CfnRoute.RouteSpecProperty) {
      cdkBuilder.spec(spec.let(CfnRoute.RouteSpecProperty::unwrap))
    }

    /**
     * @param spec The route specification to apply. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("e1b12af40c8f1b8f945e68d5c27c5aaf074c96033f10b2bb9489f10c91674295")
    override fun spec(spec: CfnRoute.RouteSpecProperty.Builder.() -> Unit): Unit =
        spec(CfnRoute.RouteSpecProperty(spec))

    /**
     * @param tags Optional metadata that you can apply to the route to assist with categorization
     * and organization.
     * Each tag consists of a key and an optional value, both of which you define. Tag keys can have
     * a maximum character length of 128 characters, and tag values can have a maximum length of 256
     * characters.
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    /**
     * @param tags Optional metadata that you can apply to the route to assist with categorization
     * and organization.
     * Each tag consists of a key and an optional value, both of which you define. Tag keys can have
     * a maximum character length of 128 characters, and tag values can have a maximum length of 256
     * characters.
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    /**
     * @param virtualRouterName The name of the virtual router in which to create the route. 
     * If the virtual router is in a shared mesh, then you must be the owner of the virtual router
     * resource.
     */
    override fun virtualRouterName(virtualRouterName: String) {
      cdkBuilder.virtualRouterName(virtualRouterName)
    }

    public fun build(): software.amazon.awscdk.services.appmesh.CfnRouteProps = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.appmesh.CfnRouteProps,
  ) : CdkObject(cdkObject), CfnRouteProps {
    /**
     * The name of the service mesh to create the route in.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appmesh-route.html#cfn-appmesh-route-meshname)
     */
    override fun meshName(): String = unwrap(this).getMeshName()

    /**
     * The AWS IAM account ID of the service mesh owner.
     *
     * If the account ID is not your own, then the account that you specify must share the mesh with
     * your account before you can create the resource in the service mesh. For more information about
     * mesh sharing, see [Working with shared
     * meshes](https://docs.aws.amazon.com/app-mesh/latest/userguide/sharing.html) .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appmesh-route.html#cfn-appmesh-route-meshowner)
     */
    override fun meshOwner(): String? = unwrap(this).getMeshOwner()

    /**
     * The name to use for the route.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appmesh-route.html#cfn-appmesh-route-routename)
     */
    override fun routeName(): String? = unwrap(this).getRouteName()

    /**
     * The route specification to apply.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appmesh-route.html#cfn-appmesh-route-spec)
     */
    override fun spec(): Any = unwrap(this).getSpec()

    /**
     * Optional metadata that you can apply to the route to assist with categorization and
     * organization.
     *
     * Each tag consists of a key and an optional value, both of which you define. Tag keys can have
     * a maximum character length of 128 characters, and tag values can have a maximum length of 256
     * characters.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appmesh-route.html#cfn-appmesh-route-tags)
     */
    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

    /**
     * The name of the virtual router in which to create the route.
     *
     * If the virtual router is in a shared mesh, then you must be the owner of the virtual router
     * resource.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appmesh-route.html#cfn-appmesh-route-virtualroutername)
     */
    override fun virtualRouterName(): String = unwrap(this).getVirtualRouterName()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnRouteProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.appmesh.CfnRouteProps):
        CfnRouteProps = CdkObjectWrappers.wrap(cdkObject) as? CfnRouteProps ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnRouteProps):
        software.amazon.awscdk.services.appmesh.CfnRouteProps = (wrapped as CdkObject).cdkObject as
        software.amazon.awscdk.services.appmesh.CfnRouteProps
  }
}
