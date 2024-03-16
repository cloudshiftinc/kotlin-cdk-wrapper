@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.appmesh

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.ITaggable
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * Creates a route that is associated with a virtual router.
 *
 * You can route several different protocols and define a retry policy for a route. Traffic can be
 * routed to one or more virtual nodes.
 *
 * For more information about routes, see
 * [Routes](https://docs.aws.amazon.com/app-mesh/latest/userguide/routes.html) .
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.appmesh.*;
 * CfnRoute cfnRoute = CfnRoute.Builder.create(this, "MyCfnRoute")
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
public open class CfnRoute internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.appmesh.CfnRoute,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  /**
   * The full Amazon Resource Name (ARN) for the route.
   */
  public open fun attrArn(): String = unwrap(this).getAttrArn()

  /**
   *
   */
  public open fun attrId(): String = unwrap(this).getAttrId()

  /**
   * The name of the service mesh that the route resides in.
   */
  public open fun attrMeshName(): String = unwrap(this).getAttrMeshName()

  /**
   * The AWS IAM account ID of the service mesh owner.
   *
   * If the account ID is not your own, then it's the ID of the account that shared the mesh with
   * your account. For more information about mesh sharing, see [Working with Shared
   * Meshes](https://docs.aws.amazon.com/app-mesh/latest/userguide/sharing.html) .
   */
  public open fun attrMeshOwner(): String = unwrap(this).getAttrMeshOwner()

  /**
   * The AWS IAM account ID of the resource owner.
   *
   * If the account ID is not your own, then it's the ID of the mesh owner or of another account
   * that the mesh is shared with. For more information about mesh sharing, see [Working with Shared
   * Meshes](https://docs.aws.amazon.com/app-mesh/latest/userguide/sharing.html) .
   */
  public open fun attrResourceOwner(): String = unwrap(this).getAttrResourceOwner()

  /**
   * The name of the route.
   */
  public open fun attrRouteName(): String = unwrap(this).getAttrRouteName()

  /**
   * The unique identifier for the route.
   */
  public open fun attrUid(): String = unwrap(this).getAttrUid()

  /**
   * The name of the virtual router that the route is associated with.
   */
  public open fun attrVirtualRouterName(): String = unwrap(this).getAttrVirtualRouterName()

  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  /**
   * The name of the service mesh to create the route in.
   */
  public open fun meshName(): String = unwrap(this).getMeshName()

  /**
   * The name of the service mesh to create the route in.
   */
  public open fun meshName(`value`: String) {
    unwrap(this).setMeshName(`value`)
  }

  /**
   * The AWS IAM account ID of the service mesh owner.
   */
  public open fun meshOwner(): String? = unwrap(this).getMeshOwner()

  /**
   * The AWS IAM account ID of the service mesh owner.
   */
  public open fun meshOwner(`value`: String) {
    unwrap(this).setMeshOwner(`value`)
  }

  /**
   * The name to use for the route.
   */
  public open fun routeName(): String? = unwrap(this).getRouteName()

  /**
   * The name to use for the route.
   */
  public open fun routeName(`value`: String) {
    unwrap(this).setRouteName(`value`)
  }

  /**
   * The route specification to apply.
   */
  public open fun spec(): Any = unwrap(this).getSpec()

  /**
   * The route specification to apply.
   */
  public open fun spec(`value`: IResolvable) {
    unwrap(this).setSpec(`value`.let(IResolvable::unwrap))
  }

  /**
   * The route specification to apply.
   */
  public open fun spec(`value`: RouteSpecProperty) {
    unwrap(this).setSpec(`value`.let(RouteSpecProperty::unwrap))
  }

  /**
   * The route specification to apply.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("37d15b17e758c33aa05b5db1d559f8b7497906b06f6973f34c47684ceed07b93")
  public open fun spec(`value`: RouteSpecProperty.Builder.() -> Unit): Unit =
      spec(RouteSpecProperty(`value`))

  /**
   * Tag Manager which manages the tags for this resource.
   */
  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  /**
   * Optional metadata that you can apply to the route to assist with categorization and
   * organization.
   */
  public open fun tagsRaw(): List<CfnTag> = unwrap(this).getTagsRaw()?.map(CfnTag::wrap) ?:
      emptyList()

  /**
   * Optional metadata that you can apply to the route to assist with categorization and
   * organization.
   */
  public open fun tagsRaw(`value`: List<CfnTag>) {
    unwrap(this).setTagsRaw(`value`.map(CfnTag::unwrap))
  }

  /**
   * Optional metadata that you can apply to the route to assist with categorization and
   * organization.
   */
  public open fun tagsRaw(vararg `value`: CfnTag): Unit = tagsRaw(`value`.toList())

  /**
   * The name of the virtual router in which to create the route.
   */
  public open fun virtualRouterName(): String = unwrap(this).getVirtualRouterName()

  /**
   * The name of the virtual router in which to create the route.
   */
  public open fun virtualRouterName(`value`: String) {
    unwrap(this).setVirtualRouterName(`value`)
  }

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.appmesh.CfnRoute].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The name of the service mesh to create the route in.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appmesh-route.html#cfn-appmesh-route-meshname)
     * @param meshName The name of the service mesh to create the route in. 
     */
    public fun meshName(meshName: String)

    /**
     * The AWS IAM account ID of the service mesh owner.
     *
     * If the account ID is not your own, then the account that you specify must share the mesh with
     * your account before you can create the resource in the service mesh. For more information about
     * mesh sharing, see [Working with shared
     * meshes](https://docs.aws.amazon.com/app-mesh/latest/userguide/sharing.html) .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appmesh-route.html#cfn-appmesh-route-meshowner)
     * @param meshOwner The AWS IAM account ID of the service mesh owner. 
     */
    public fun meshOwner(meshOwner: String)

    /**
     * The name to use for the route.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appmesh-route.html#cfn-appmesh-route-routename)
     * @param routeName The name to use for the route. 
     */
    public fun routeName(routeName: String)

    /**
     * The route specification to apply.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appmesh-route.html#cfn-appmesh-route-spec)
     * @param spec The route specification to apply. 
     */
    public fun spec(spec: IResolvable)

    /**
     * The route specification to apply.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appmesh-route.html#cfn-appmesh-route-spec)
     * @param spec The route specification to apply. 
     */
    public fun spec(spec: RouteSpecProperty)

    /**
     * The route specification to apply.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appmesh-route.html#cfn-appmesh-route-spec)
     * @param spec The route specification to apply. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("6bd3bb53228229fae0cceefb48e1b5851f9d5e3ca7080532dc3bf7a0b4e48d0c")
    public fun spec(spec: RouteSpecProperty.Builder.() -> Unit)

    /**
     * Optional metadata that you can apply to the route to assist with categorization and
     * organization.
     *
     * Each tag consists of a key and an optional value, both of which you define. Tag keys can have
     * a maximum character length of 128 characters, and tag values can have a maximum length of 256
     * characters.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appmesh-route.html#cfn-appmesh-route-tags)
     * @param tags Optional metadata that you can apply to the route to assist with categorization
     * and organization. 
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * Optional metadata that you can apply to the route to assist with categorization and
     * organization.
     *
     * Each tag consists of a key and an optional value, both of which you define. Tag keys can have
     * a maximum character length of 128 characters, and tag values can have a maximum length of 256
     * characters.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appmesh-route.html#cfn-appmesh-route-tags)
     * @param tags Optional metadata that you can apply to the route to assist with categorization
     * and organization. 
     */
    public fun tags(vararg tags: CfnTag)

    /**
     * The name of the virtual router in which to create the route.
     *
     * If the virtual router is in a shared mesh, then you must be the owner of the virtual router
     * resource.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appmesh-route.html#cfn-appmesh-route-virtualroutername)
     * @param virtualRouterName The name of the virtual router in which to create the route. 
     */
    public fun virtualRouterName(virtualRouterName: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.appmesh.CfnRoute.Builder =
        software.amazon.awscdk.services.appmesh.CfnRoute.Builder.create(scope, id)

    /**
     * The name of the service mesh to create the route in.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appmesh-route.html#cfn-appmesh-route-meshname)
     * @param meshName The name of the service mesh to create the route in. 
     */
    override fun meshName(meshName: String) {
      cdkBuilder.meshName(meshName)
    }

    /**
     * The AWS IAM account ID of the service mesh owner.
     *
     * If the account ID is not your own, then the account that you specify must share the mesh with
     * your account before you can create the resource in the service mesh. For more information about
     * mesh sharing, see [Working with shared
     * meshes](https://docs.aws.amazon.com/app-mesh/latest/userguide/sharing.html) .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appmesh-route.html#cfn-appmesh-route-meshowner)
     * @param meshOwner The AWS IAM account ID of the service mesh owner. 
     */
    override fun meshOwner(meshOwner: String) {
      cdkBuilder.meshOwner(meshOwner)
    }

    /**
     * The name to use for the route.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appmesh-route.html#cfn-appmesh-route-routename)
     * @param routeName The name to use for the route. 
     */
    override fun routeName(routeName: String) {
      cdkBuilder.routeName(routeName)
    }

    /**
     * The route specification to apply.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appmesh-route.html#cfn-appmesh-route-spec)
     * @param spec The route specification to apply. 
     */
    override fun spec(spec: IResolvable) {
      cdkBuilder.spec(spec.let(IResolvable::unwrap))
    }

    /**
     * The route specification to apply.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appmesh-route.html#cfn-appmesh-route-spec)
     * @param spec The route specification to apply. 
     */
    override fun spec(spec: RouteSpecProperty) {
      cdkBuilder.spec(spec.let(RouteSpecProperty::unwrap))
    }

    /**
     * The route specification to apply.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appmesh-route.html#cfn-appmesh-route-spec)
     * @param spec The route specification to apply. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("6bd3bb53228229fae0cceefb48e1b5851f9d5e3ca7080532dc3bf7a0b4e48d0c")
    override fun spec(spec: RouteSpecProperty.Builder.() -> Unit): Unit =
        spec(RouteSpecProperty(spec))

    /**
     * Optional metadata that you can apply to the route to assist with categorization and
     * organization.
     *
     * Each tag consists of a key and an optional value, both of which you define. Tag keys can have
     * a maximum character length of 128 characters, and tag values can have a maximum length of 256
     * characters.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appmesh-route.html#cfn-appmesh-route-tags)
     * @param tags Optional metadata that you can apply to the route to assist with categorization
     * and organization. 
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    /**
     * Optional metadata that you can apply to the route to assist with categorization and
     * organization.
     *
     * Each tag consists of a key and an optional value, both of which you define. Tag keys can have
     * a maximum character length of 128 characters, and tag values can have a maximum length of 256
     * characters.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appmesh-route.html#cfn-appmesh-route-tags)
     * @param tags Optional metadata that you can apply to the route to assist with categorization
     * and organization. 
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    /**
     * The name of the virtual router in which to create the route.
     *
     * If the virtual router is in a shared mesh, then you must be the owner of the virtual router
     * resource.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appmesh-route.html#cfn-appmesh-route-virtualroutername)
     * @param virtualRouterName The name of the virtual router in which to create the route. 
     */
    override fun virtualRouterName(virtualRouterName: String) {
      cdkBuilder.virtualRouterName(virtualRouterName)
    }

    public fun build(): software.amazon.awscdk.services.appmesh.CfnRoute = cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.appmesh.CfnRoute.CFN_RESOURCE_TYPE_NAME

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

  /**
   * An object representing the path to match in the request.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.appmesh.*;
   * HttpPathMatchProperty httpPathMatchProperty = HttpPathMatchProperty.builder()
   * .exact("exact")
   * .regex("regex")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-route-httppathmatch.html)
   */
  public interface HttpPathMatchProperty {
    /**
     * The exact path to match on.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-route-httppathmatch.html#cfn-appmesh-route-httppathmatch-exact)
     */
    public fun exact(): String? = unwrap(this).getExact()

    /**
     * The regex used to match the path.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-route-httppathmatch.html#cfn-appmesh-route-httppathmatch-regex)
     */
    public fun regex(): String? = unwrap(this).getRegex()

    /**
     * A builder for [HttpPathMatchProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param exact The exact path to match on.
       */
      public fun exact(exact: String)

      /**
       * @param regex The regex used to match the path.
       */
      public fun regex(regex: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.appmesh.CfnRoute.HttpPathMatchProperty.Builder =
          software.amazon.awscdk.services.appmesh.CfnRoute.HttpPathMatchProperty.builder()

      /**
       * @param exact The exact path to match on.
       */
      override fun exact(exact: String) {
        cdkBuilder.exact(exact)
      }

      /**
       * @param regex The regex used to match the path.
       */
      override fun regex(regex: String) {
        cdkBuilder.regex(regex)
      }

      public fun build(): software.amazon.awscdk.services.appmesh.CfnRoute.HttpPathMatchProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.appmesh.CfnRoute.HttpPathMatchProperty,
    ) : CdkObject(cdkObject), HttpPathMatchProperty {
      /**
       * The exact path to match on.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-route-httppathmatch.html#cfn-appmesh-route-httppathmatch-exact)
       */
      override fun exact(): String? = unwrap(this).getExact()

      /**
       * The regex used to match the path.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-route-httppathmatch.html#cfn-appmesh-route-httppathmatch-regex)
       */
      override fun regex(): String? = unwrap(this).getRegex()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): HttpPathMatchProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.appmesh.CfnRoute.HttpPathMatchProperty):
          HttpPathMatchProperty = CdkObjectWrappers.wrap(cdkObject) as HttpPathMatchProperty

      internal fun unwrap(wrapped: HttpPathMatchProperty):
          software.amazon.awscdk.services.appmesh.CfnRoute.HttpPathMatchProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.appmesh.CfnRoute.HttpPathMatchProperty
    }
  }

  /**
   * An object that represents a route specification.
   *
   * Specify one route type.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.appmesh.*;
   * RouteSpecProperty routeSpecProperty = RouteSpecProperty.builder()
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
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-route-routespec.html)
   */
  public interface RouteSpecProperty {
    /**
     * An object that represents the specification of a gRPC route.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-route-routespec.html#cfn-appmesh-route-routespec-grpcroute)
     */
    public fun grpcRoute(): Any? = unwrap(this).getGrpcRoute()

    /**
     * An object that represents the specification of an HTTP/2 route.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-route-routespec.html#cfn-appmesh-route-routespec-http2route)
     */
    public fun http2Route(): Any? = unwrap(this).getHttp2Route()

    /**
     * An object that represents the specification of an HTTP route.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-route-routespec.html#cfn-appmesh-route-routespec-httproute)
     */
    public fun httpRoute(): Any? = unwrap(this).getHttpRoute()

    /**
     * The priority for the route.
     *
     * Routes are matched based on the specified value, where 0 is the highest priority.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-route-routespec.html#cfn-appmesh-route-routespec-priority)
     */
    public fun priority(): Number? = unwrap(this).getPriority()

    /**
     * An object that represents the specification of a TCP route.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-route-routespec.html#cfn-appmesh-route-routespec-tcproute)
     */
    public fun tcpRoute(): Any? = unwrap(this).getTcpRoute()

    /**
     * A builder for [RouteSpecProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param grpcRoute An object that represents the specification of a gRPC route.
       */
      public fun grpcRoute(grpcRoute: IResolvable)

      /**
       * @param grpcRoute An object that represents the specification of a gRPC route.
       */
      public fun grpcRoute(grpcRoute: GrpcRouteProperty)

      /**
       * @param grpcRoute An object that represents the specification of a gRPC route.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("cbdadec527d34bd78b39af2dfdbbc42bb4df8c408da6f690eeb5fa7bb6ddcc74")
      public fun grpcRoute(grpcRoute: GrpcRouteProperty.Builder.() -> Unit)

      /**
       * @param http2Route An object that represents the specification of an HTTP/2 route.
       */
      public fun http2Route(http2Route: IResolvable)

      /**
       * @param http2Route An object that represents the specification of an HTTP/2 route.
       */
      public fun http2Route(http2Route: HttpRouteProperty)

      /**
       * @param http2Route An object that represents the specification of an HTTP/2 route.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("26be42793e7e56ac8156a7a3284fd66a3d2eaf90bc800164b5789df69578b60f")
      public fun http2Route(http2Route: HttpRouteProperty.Builder.() -> Unit)

      /**
       * @param httpRoute An object that represents the specification of an HTTP route.
       */
      public fun httpRoute(httpRoute: IResolvable)

      /**
       * @param httpRoute An object that represents the specification of an HTTP route.
       */
      public fun httpRoute(httpRoute: HttpRouteProperty)

      /**
       * @param httpRoute An object that represents the specification of an HTTP route.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("fbeb9b2b8b24dafc5b8f75a639849958e9396b9f9e5e302cea9154cb782f3573")
      public fun httpRoute(httpRoute: HttpRouteProperty.Builder.() -> Unit)

      /**
       * @param priority The priority for the route.
       * Routes are matched based on the specified value, where 0 is the highest priority.
       */
      public fun priority(priority: Number)

      /**
       * @param tcpRoute An object that represents the specification of a TCP route.
       */
      public fun tcpRoute(tcpRoute: IResolvable)

      /**
       * @param tcpRoute An object that represents the specification of a TCP route.
       */
      public fun tcpRoute(tcpRoute: TcpRouteProperty)

      /**
       * @param tcpRoute An object that represents the specification of a TCP route.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("959cbe7f10e9b2da8b439898cdb3ad12ea06da8821e030a6c35a46c900dc6c49")
      public fun tcpRoute(tcpRoute: TcpRouteProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.appmesh.CfnRoute.RouteSpecProperty.Builder =
          software.amazon.awscdk.services.appmesh.CfnRoute.RouteSpecProperty.builder()

      /**
       * @param grpcRoute An object that represents the specification of a gRPC route.
       */
      override fun grpcRoute(grpcRoute: IResolvable) {
        cdkBuilder.grpcRoute(grpcRoute.let(IResolvable::unwrap))
      }

      /**
       * @param grpcRoute An object that represents the specification of a gRPC route.
       */
      override fun grpcRoute(grpcRoute: GrpcRouteProperty) {
        cdkBuilder.grpcRoute(grpcRoute.let(GrpcRouteProperty::unwrap))
      }

      /**
       * @param grpcRoute An object that represents the specification of a gRPC route.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("cbdadec527d34bd78b39af2dfdbbc42bb4df8c408da6f690eeb5fa7bb6ddcc74")
      override fun grpcRoute(grpcRoute: GrpcRouteProperty.Builder.() -> Unit): Unit =
          grpcRoute(GrpcRouteProperty(grpcRoute))

      /**
       * @param http2Route An object that represents the specification of an HTTP/2 route.
       */
      override fun http2Route(http2Route: IResolvable) {
        cdkBuilder.http2Route(http2Route.let(IResolvable::unwrap))
      }

      /**
       * @param http2Route An object that represents the specification of an HTTP/2 route.
       */
      override fun http2Route(http2Route: HttpRouteProperty) {
        cdkBuilder.http2Route(http2Route.let(HttpRouteProperty::unwrap))
      }

      /**
       * @param http2Route An object that represents the specification of an HTTP/2 route.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("26be42793e7e56ac8156a7a3284fd66a3d2eaf90bc800164b5789df69578b60f")
      override fun http2Route(http2Route: HttpRouteProperty.Builder.() -> Unit): Unit =
          http2Route(HttpRouteProperty(http2Route))

      /**
       * @param httpRoute An object that represents the specification of an HTTP route.
       */
      override fun httpRoute(httpRoute: IResolvable) {
        cdkBuilder.httpRoute(httpRoute.let(IResolvable::unwrap))
      }

      /**
       * @param httpRoute An object that represents the specification of an HTTP route.
       */
      override fun httpRoute(httpRoute: HttpRouteProperty) {
        cdkBuilder.httpRoute(httpRoute.let(HttpRouteProperty::unwrap))
      }

      /**
       * @param httpRoute An object that represents the specification of an HTTP route.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("fbeb9b2b8b24dafc5b8f75a639849958e9396b9f9e5e302cea9154cb782f3573")
      override fun httpRoute(httpRoute: HttpRouteProperty.Builder.() -> Unit): Unit =
          httpRoute(HttpRouteProperty(httpRoute))

      /**
       * @param priority The priority for the route.
       * Routes are matched based on the specified value, where 0 is the highest priority.
       */
      override fun priority(priority: Number) {
        cdkBuilder.priority(priority)
      }

      /**
       * @param tcpRoute An object that represents the specification of a TCP route.
       */
      override fun tcpRoute(tcpRoute: IResolvable) {
        cdkBuilder.tcpRoute(tcpRoute.let(IResolvable::unwrap))
      }

      /**
       * @param tcpRoute An object that represents the specification of a TCP route.
       */
      override fun tcpRoute(tcpRoute: TcpRouteProperty) {
        cdkBuilder.tcpRoute(tcpRoute.let(TcpRouteProperty::unwrap))
      }

      /**
       * @param tcpRoute An object that represents the specification of a TCP route.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("959cbe7f10e9b2da8b439898cdb3ad12ea06da8821e030a6c35a46c900dc6c49")
      override fun tcpRoute(tcpRoute: TcpRouteProperty.Builder.() -> Unit): Unit =
          tcpRoute(TcpRouteProperty(tcpRoute))

      public fun build(): software.amazon.awscdk.services.appmesh.CfnRoute.RouteSpecProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject: software.amazon.awscdk.services.appmesh.CfnRoute.RouteSpecProperty,
    ) : CdkObject(cdkObject), RouteSpecProperty {
      /**
       * An object that represents the specification of a gRPC route.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-route-routespec.html#cfn-appmesh-route-routespec-grpcroute)
       */
      override fun grpcRoute(): Any? = unwrap(this).getGrpcRoute()

      /**
       * An object that represents the specification of an HTTP/2 route.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-route-routespec.html#cfn-appmesh-route-routespec-http2route)
       */
      override fun http2Route(): Any? = unwrap(this).getHttp2Route()

      /**
       * An object that represents the specification of an HTTP route.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-route-routespec.html#cfn-appmesh-route-routespec-httproute)
       */
      override fun httpRoute(): Any? = unwrap(this).getHttpRoute()

      /**
       * The priority for the route.
       *
       * Routes are matched based on the specified value, where 0 is the highest priority.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-route-routespec.html#cfn-appmesh-route-routespec-priority)
       */
      override fun priority(): Number? = unwrap(this).getPriority()

      /**
       * An object that represents the specification of a TCP route.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-route-routespec.html#cfn-appmesh-route-routespec-tcproute)
       */
      override fun tcpRoute(): Any? = unwrap(this).getTcpRoute()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): RouteSpecProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.appmesh.CfnRoute.RouteSpecProperty):
          RouteSpecProperty = CdkObjectWrappers.wrap(cdkObject) as RouteSpecProperty

      internal fun unwrap(wrapped: RouteSpecProperty):
          software.amazon.awscdk.services.appmesh.CfnRoute.RouteSpecProperty = (wrapped as
          CdkObject).cdkObject as software.amazon.awscdk.services.appmesh.CfnRoute.RouteSpecProperty
    }
  }

  /**
   * An object that represents a retry policy.
   *
   * Specify at least one value for at least one of the types of `RetryEvents` , a value for
   * `maxRetries` , and a value for `perRetryTimeout` . Both `server-error` and `gateway-error` under
   * `httpRetryEvents` include the Envoy `reset` policy. For more information on the `reset` policy,
   * see the [Envoy
   * documentation](https://docs.aws.amazon.com/https://www.envoyproxy.io/docs/envoy/latest/configuration/http/http_filters/router_filter#x-envoy-retry-on)
   * .
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.appmesh.*;
   * GrpcRetryPolicyProperty grpcRetryPolicyProperty = GrpcRetryPolicyProperty.builder()
   * .maxRetries(123)
   * .perRetryTimeout(DurationProperty.builder()
   * .unit("unit")
   * .value(123)
   * .build())
   * // the properties below are optional
   * .grpcRetryEvents(List.of("grpcRetryEvents"))
   * .httpRetryEvents(List.of("httpRetryEvents"))
   * .tcpRetryEvents(List.of("tcpRetryEvents"))
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-route-grpcretrypolicy.html)
   */
  public interface GrpcRetryPolicyProperty {
    /**
     * Specify at least one of the valid values.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-route-grpcretrypolicy.html#cfn-appmesh-route-grpcretrypolicy-grpcretryevents)
     */
    public fun grpcRetryEvents(): List<String> = unwrap(this).getGrpcRetryEvents() ?: emptyList()

    /**
     * Specify at least one of the following values.
     *
     * * *server-error* – HTTP status codes 500, 501, 502, 503, 504, 505, 506, 507, 508, 510, and
     * 511
     * * *gateway-error* – HTTP status codes 502, 503, and 504
     * * *client-error* – HTTP status code 409
     * * *stream-error* – Retry on refused stream
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-route-grpcretrypolicy.html#cfn-appmesh-route-grpcretrypolicy-httpretryevents)
     */
    public fun httpRetryEvents(): List<String> = unwrap(this).getHttpRetryEvents() ?: emptyList()

    /**
     * The maximum number of retry attempts.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-route-grpcretrypolicy.html#cfn-appmesh-route-grpcretrypolicy-maxretries)
     */
    public fun maxRetries(): Number

    /**
     * The timeout for each retry attempt.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-route-grpcretrypolicy.html#cfn-appmesh-route-grpcretrypolicy-perretrytimeout)
     */
    public fun perRetryTimeout(): Any

    /**
     * Specify a valid value.
     *
     * The event occurs before any processing of a request has started and is encountered when the
     * upstream is temporarily or permanently unavailable.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-route-grpcretrypolicy.html#cfn-appmesh-route-grpcretrypolicy-tcpretryevents)
     */
    public fun tcpRetryEvents(): List<String> = unwrap(this).getTcpRetryEvents() ?: emptyList()

    /**
     * A builder for [GrpcRetryPolicyProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param grpcRetryEvents Specify at least one of the valid values.
       */
      public fun grpcRetryEvents(grpcRetryEvents: List<String>)

      /**
       * @param grpcRetryEvents Specify at least one of the valid values.
       */
      public fun grpcRetryEvents(vararg grpcRetryEvents: String)

      /**
       * @param httpRetryEvents Specify at least one of the following values.
       * * *server-error* – HTTP status codes 500, 501, 502, 503, 504, 505, 506, 507, 508, 510, and
       * 511
       * * *gateway-error* – HTTP status codes 502, 503, and 504
       * * *client-error* – HTTP status code 409
       * * *stream-error* – Retry on refused stream
       */
      public fun httpRetryEvents(httpRetryEvents: List<String>)

      /**
       * @param httpRetryEvents Specify at least one of the following values.
       * * *server-error* – HTTP status codes 500, 501, 502, 503, 504, 505, 506, 507, 508, 510, and
       * 511
       * * *gateway-error* – HTTP status codes 502, 503, and 504
       * * *client-error* – HTTP status code 409
       * * *stream-error* – Retry on refused stream
       */
      public fun httpRetryEvents(vararg httpRetryEvents: String)

      /**
       * @param maxRetries The maximum number of retry attempts. 
       */
      public fun maxRetries(maxRetries: Number)

      /**
       * @param perRetryTimeout The timeout for each retry attempt. 
       */
      public fun perRetryTimeout(perRetryTimeout: IResolvable)

      /**
       * @param perRetryTimeout The timeout for each retry attempt. 
       */
      public fun perRetryTimeout(perRetryTimeout: DurationProperty)

      /**
       * @param perRetryTimeout The timeout for each retry attempt. 
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("0f84d4790e12379b813a871dc18f0d69c391e54d630a717cf6e9948bd0f55ff5")
      public fun perRetryTimeout(perRetryTimeout: DurationProperty.Builder.() -> Unit)

      /**
       * @param tcpRetryEvents Specify a valid value.
       * The event occurs before any processing of a request has started and is encountered when the
       * upstream is temporarily or permanently unavailable.
       */
      public fun tcpRetryEvents(tcpRetryEvents: List<String>)

      /**
       * @param tcpRetryEvents Specify a valid value.
       * The event occurs before any processing of a request has started and is encountered when the
       * upstream is temporarily or permanently unavailable.
       */
      public fun tcpRetryEvents(vararg tcpRetryEvents: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.appmesh.CfnRoute.GrpcRetryPolicyProperty.Builder =
          software.amazon.awscdk.services.appmesh.CfnRoute.GrpcRetryPolicyProperty.builder()

      /**
       * @param grpcRetryEvents Specify at least one of the valid values.
       */
      override fun grpcRetryEvents(grpcRetryEvents: List<String>) {
        cdkBuilder.grpcRetryEvents(grpcRetryEvents)
      }

      /**
       * @param grpcRetryEvents Specify at least one of the valid values.
       */
      override fun grpcRetryEvents(vararg grpcRetryEvents: String): Unit =
          grpcRetryEvents(grpcRetryEvents.toList())

      /**
       * @param httpRetryEvents Specify at least one of the following values.
       * * *server-error* – HTTP status codes 500, 501, 502, 503, 504, 505, 506, 507, 508, 510, and
       * 511
       * * *gateway-error* – HTTP status codes 502, 503, and 504
       * * *client-error* – HTTP status code 409
       * * *stream-error* – Retry on refused stream
       */
      override fun httpRetryEvents(httpRetryEvents: List<String>) {
        cdkBuilder.httpRetryEvents(httpRetryEvents)
      }

      /**
       * @param httpRetryEvents Specify at least one of the following values.
       * * *server-error* – HTTP status codes 500, 501, 502, 503, 504, 505, 506, 507, 508, 510, and
       * 511
       * * *gateway-error* – HTTP status codes 502, 503, and 504
       * * *client-error* – HTTP status code 409
       * * *stream-error* – Retry on refused stream
       */
      override fun httpRetryEvents(vararg httpRetryEvents: String): Unit =
          httpRetryEvents(httpRetryEvents.toList())

      /**
       * @param maxRetries The maximum number of retry attempts. 
       */
      override fun maxRetries(maxRetries: Number) {
        cdkBuilder.maxRetries(maxRetries)
      }

      /**
       * @param perRetryTimeout The timeout for each retry attempt. 
       */
      override fun perRetryTimeout(perRetryTimeout: IResolvable) {
        cdkBuilder.perRetryTimeout(perRetryTimeout.let(IResolvable::unwrap))
      }

      /**
       * @param perRetryTimeout The timeout for each retry attempt. 
       */
      override fun perRetryTimeout(perRetryTimeout: DurationProperty) {
        cdkBuilder.perRetryTimeout(perRetryTimeout.let(DurationProperty::unwrap))
      }

      /**
       * @param perRetryTimeout The timeout for each retry attempt. 
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("0f84d4790e12379b813a871dc18f0d69c391e54d630a717cf6e9948bd0f55ff5")
      override fun perRetryTimeout(perRetryTimeout: DurationProperty.Builder.() -> Unit): Unit =
          perRetryTimeout(DurationProperty(perRetryTimeout))

      /**
       * @param tcpRetryEvents Specify a valid value.
       * The event occurs before any processing of a request has started and is encountered when the
       * upstream is temporarily or permanently unavailable.
       */
      override fun tcpRetryEvents(tcpRetryEvents: List<String>) {
        cdkBuilder.tcpRetryEvents(tcpRetryEvents)
      }

      /**
       * @param tcpRetryEvents Specify a valid value.
       * The event occurs before any processing of a request has started and is encountered when the
       * upstream is temporarily or permanently unavailable.
       */
      override fun tcpRetryEvents(vararg tcpRetryEvents: String): Unit =
          tcpRetryEvents(tcpRetryEvents.toList())

      public fun build(): software.amazon.awscdk.services.appmesh.CfnRoute.GrpcRetryPolicyProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.appmesh.CfnRoute.GrpcRetryPolicyProperty,
    ) : CdkObject(cdkObject), GrpcRetryPolicyProperty {
      /**
       * Specify at least one of the valid values.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-route-grpcretrypolicy.html#cfn-appmesh-route-grpcretrypolicy-grpcretryevents)
       */
      override fun grpcRetryEvents(): List<String> = unwrap(this).getGrpcRetryEvents() ?:
          emptyList()

      /**
       * Specify at least one of the following values.
       *
       * * *server-error* – HTTP status codes 500, 501, 502, 503, 504, 505, 506, 507, 508, 510, and
       * 511
       * * *gateway-error* – HTTP status codes 502, 503, and 504
       * * *client-error* – HTTP status code 409
       * * *stream-error* – Retry on refused stream
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-route-grpcretrypolicy.html#cfn-appmesh-route-grpcretrypolicy-httpretryevents)
       */
      override fun httpRetryEvents(): List<String> = unwrap(this).getHttpRetryEvents() ?:
          emptyList()

      /**
       * The maximum number of retry attempts.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-route-grpcretrypolicy.html#cfn-appmesh-route-grpcretrypolicy-maxretries)
       */
      override fun maxRetries(): Number = unwrap(this).getMaxRetries()

      /**
       * The timeout for each retry attempt.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-route-grpcretrypolicy.html#cfn-appmesh-route-grpcretrypolicy-perretrytimeout)
       */
      override fun perRetryTimeout(): Any = unwrap(this).getPerRetryTimeout()

      /**
       * Specify a valid value.
       *
       * The event occurs before any processing of a request has started and is encountered when the
       * upstream is temporarily or permanently unavailable.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-route-grpcretrypolicy.html#cfn-appmesh-route-grpcretrypolicy-tcpretryevents)
       */
      override fun tcpRetryEvents(): List<String> = unwrap(this).getTcpRetryEvents() ?: emptyList()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): GrpcRetryPolicyProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.appmesh.CfnRoute.GrpcRetryPolicyProperty):
          GrpcRetryPolicyProperty = CdkObjectWrappers.wrap(cdkObject) as GrpcRetryPolicyProperty

      internal fun unwrap(wrapped: GrpcRetryPolicyProperty):
          software.amazon.awscdk.services.appmesh.CfnRoute.GrpcRetryPolicyProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.appmesh.CfnRoute.GrpcRetryPolicyProperty
    }
  }

  /**
   * An object that represents the action to take if a match is determined.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.appmesh.*;
   * TcpRouteActionProperty tcpRouteActionProperty = TcpRouteActionProperty.builder()
   * .weightedTargets(List.of(WeightedTargetProperty.builder()
   * .virtualNode("virtualNode")
   * .weight(123)
   * // the properties below are optional
   * .port(123)
   * .build()))
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-route-tcprouteaction.html)
   */
  public interface TcpRouteActionProperty {
    /**
     * An object that represents the targets that traffic is routed to when a request matches the
     * route.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-route-tcprouteaction.html#cfn-appmesh-route-tcprouteaction-weightedtargets)
     */
    public fun weightedTargets(): Any

    /**
     * A builder for [TcpRouteActionProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param weightedTargets An object that represents the targets that traffic is routed to when
       * a request matches the route. 
       */
      public fun weightedTargets(weightedTargets: IResolvable)

      /**
       * @param weightedTargets An object that represents the targets that traffic is routed to when
       * a request matches the route. 
       */
      public fun weightedTargets(weightedTargets: List<Any>)

      /**
       * @param weightedTargets An object that represents the targets that traffic is routed to when
       * a request matches the route. 
       */
      public fun weightedTargets(vararg weightedTargets: Any)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.appmesh.CfnRoute.TcpRouteActionProperty.Builder =
          software.amazon.awscdk.services.appmesh.CfnRoute.TcpRouteActionProperty.builder()

      /**
       * @param weightedTargets An object that represents the targets that traffic is routed to when
       * a request matches the route. 
       */
      override fun weightedTargets(weightedTargets: IResolvable) {
        cdkBuilder.weightedTargets(weightedTargets.let(IResolvable::unwrap))
      }

      /**
       * @param weightedTargets An object that represents the targets that traffic is routed to when
       * a request matches the route. 
       */
      override fun weightedTargets(weightedTargets: List<Any>) {
        cdkBuilder.weightedTargets(weightedTargets)
      }

      /**
       * @param weightedTargets An object that represents the targets that traffic is routed to when
       * a request matches the route. 
       */
      override fun weightedTargets(vararg weightedTargets: Any): Unit =
          weightedTargets(weightedTargets.toList())

      public fun build(): software.amazon.awscdk.services.appmesh.CfnRoute.TcpRouteActionProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.appmesh.CfnRoute.TcpRouteActionProperty,
    ) : CdkObject(cdkObject), TcpRouteActionProperty {
      /**
       * An object that represents the targets that traffic is routed to when a request matches the
       * route.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-route-tcprouteaction.html#cfn-appmesh-route-tcprouteaction-weightedtargets)
       */
      override fun weightedTargets(): Any = unwrap(this).getWeightedTargets()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): TcpRouteActionProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.appmesh.CfnRoute.TcpRouteActionProperty):
          TcpRouteActionProperty = CdkObjectWrappers.wrap(cdkObject) as TcpRouteActionProperty

      internal fun unwrap(wrapped: TcpRouteActionProperty):
          software.amazon.awscdk.services.appmesh.CfnRoute.TcpRouteActionProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.appmesh.CfnRoute.TcpRouteActionProperty
    }
  }

  /**
   * An object representing the query parameter to match.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.appmesh.*;
   * HttpQueryParameterMatchProperty httpQueryParameterMatchProperty =
   * HttpQueryParameterMatchProperty.builder()
   * .exact("exact")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-route-httpqueryparametermatch.html)
   */
  public interface HttpQueryParameterMatchProperty {
    /**
     * The exact query parameter to match on.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-route-httpqueryparametermatch.html#cfn-appmesh-route-httpqueryparametermatch-exact)
     */
    public fun exact(): String? = unwrap(this).getExact()

    /**
     * A builder for [HttpQueryParameterMatchProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param exact The exact query parameter to match on.
       */
      public fun exact(exact: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.appmesh.CfnRoute.HttpQueryParameterMatchProperty.Builder =
          software.amazon.awscdk.services.appmesh.CfnRoute.HttpQueryParameterMatchProperty.builder()

      /**
       * @param exact The exact query parameter to match on.
       */
      override fun exact(exact: String) {
        cdkBuilder.exact(exact)
      }

      public fun build():
          software.amazon.awscdk.services.appmesh.CfnRoute.HttpQueryParameterMatchProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.appmesh.CfnRoute.HttpQueryParameterMatchProperty,
    ) : CdkObject(cdkObject), HttpQueryParameterMatchProperty {
      /**
       * The exact query parameter to match on.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-route-httpqueryparametermatch.html#cfn-appmesh-route-httpqueryparametermatch-exact)
       */
      override fun exact(): String? = unwrap(this).getExact()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): HttpQueryParameterMatchProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.appmesh.CfnRoute.HttpQueryParameterMatchProperty):
          HttpQueryParameterMatchProperty = CdkObjectWrappers.wrap(cdkObject) as
          HttpQueryParameterMatchProperty

      internal fun unwrap(wrapped: HttpQueryParameterMatchProperty):
          software.amazon.awscdk.services.appmesh.CfnRoute.HttpQueryParameterMatchProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.appmesh.CfnRoute.HttpQueryParameterMatchProperty
    }
  }

  /**
   * An object that represents the action to take if a match is determined.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.appmesh.*;
   * GrpcRouteActionProperty grpcRouteActionProperty = GrpcRouteActionProperty.builder()
   * .weightedTargets(List.of(WeightedTargetProperty.builder()
   * .virtualNode("virtualNode")
   * .weight(123)
   * // the properties below are optional
   * .port(123)
   * .build()))
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-route-grpcrouteaction.html)
   */
  public interface GrpcRouteActionProperty {
    /**
     * An object that represents the targets that traffic is routed to when a request matches the
     * route.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-route-grpcrouteaction.html#cfn-appmesh-route-grpcrouteaction-weightedtargets)
     */
    public fun weightedTargets(): Any

    /**
     * A builder for [GrpcRouteActionProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param weightedTargets An object that represents the targets that traffic is routed to when
       * a request matches the route. 
       */
      public fun weightedTargets(weightedTargets: IResolvable)

      /**
       * @param weightedTargets An object that represents the targets that traffic is routed to when
       * a request matches the route. 
       */
      public fun weightedTargets(weightedTargets: List<Any>)

      /**
       * @param weightedTargets An object that represents the targets that traffic is routed to when
       * a request matches the route. 
       */
      public fun weightedTargets(vararg weightedTargets: Any)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.appmesh.CfnRoute.GrpcRouteActionProperty.Builder =
          software.amazon.awscdk.services.appmesh.CfnRoute.GrpcRouteActionProperty.builder()

      /**
       * @param weightedTargets An object that represents the targets that traffic is routed to when
       * a request matches the route. 
       */
      override fun weightedTargets(weightedTargets: IResolvable) {
        cdkBuilder.weightedTargets(weightedTargets.let(IResolvable::unwrap))
      }

      /**
       * @param weightedTargets An object that represents the targets that traffic is routed to when
       * a request matches the route. 
       */
      override fun weightedTargets(weightedTargets: List<Any>) {
        cdkBuilder.weightedTargets(weightedTargets)
      }

      /**
       * @param weightedTargets An object that represents the targets that traffic is routed to when
       * a request matches the route. 
       */
      override fun weightedTargets(vararg weightedTargets: Any): Unit =
          weightedTargets(weightedTargets.toList())

      public fun build(): software.amazon.awscdk.services.appmesh.CfnRoute.GrpcRouteActionProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.appmesh.CfnRoute.GrpcRouteActionProperty,
    ) : CdkObject(cdkObject), GrpcRouteActionProperty {
      /**
       * An object that represents the targets that traffic is routed to when a request matches the
       * route.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-route-grpcrouteaction.html#cfn-appmesh-route-grpcrouteaction-weightedtargets)
       */
      override fun weightedTargets(): Any = unwrap(this).getWeightedTargets()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): GrpcRouteActionProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.appmesh.CfnRoute.GrpcRouteActionProperty):
          GrpcRouteActionProperty = CdkObjectWrappers.wrap(cdkObject) as GrpcRouteActionProperty

      internal fun unwrap(wrapped: GrpcRouteActionProperty):
          software.amazon.awscdk.services.appmesh.CfnRoute.GrpcRouteActionProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.appmesh.CfnRoute.GrpcRouteActionProperty
    }
  }

  /**
   * An object representing the TCP route to match.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.appmesh.*;
   * TcpRouteMatchProperty tcpRouteMatchProperty = TcpRouteMatchProperty.builder()
   * .port(123)
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-route-tcproutematch.html)
   */
  public interface TcpRouteMatchProperty {
    /**
     * The port number to match on.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-route-tcproutematch.html#cfn-appmesh-route-tcproutematch-port)
     */
    public fun port(): Number? = unwrap(this).getPort()

    /**
     * A builder for [TcpRouteMatchProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param port The port number to match on.
       */
      public fun port(port: Number)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.appmesh.CfnRoute.TcpRouteMatchProperty.Builder =
          software.amazon.awscdk.services.appmesh.CfnRoute.TcpRouteMatchProperty.builder()

      /**
       * @param port The port number to match on.
       */
      override fun port(port: Number) {
        cdkBuilder.port(port)
      }

      public fun build(): software.amazon.awscdk.services.appmesh.CfnRoute.TcpRouteMatchProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.appmesh.CfnRoute.TcpRouteMatchProperty,
    ) : CdkObject(cdkObject), TcpRouteMatchProperty {
      /**
       * The port number to match on.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-route-tcproutematch.html#cfn-appmesh-route-tcproutematch-port)
       */
      override fun port(): Number? = unwrap(this).getPort()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): TcpRouteMatchProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.appmesh.CfnRoute.TcpRouteMatchProperty):
          TcpRouteMatchProperty = CdkObjectWrappers.wrap(cdkObject) as TcpRouteMatchProperty

      internal fun unwrap(wrapped: TcpRouteMatchProperty):
          software.amazon.awscdk.services.appmesh.CfnRoute.TcpRouteMatchProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.appmesh.CfnRoute.TcpRouteMatchProperty
    }
  }

  /**
   * An object that represents the requirements for a route to match HTTP requests for a virtual
   * router.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.appmesh.*;
   * HttpRouteMatchProperty httpRouteMatchProperty = HttpRouteMatchProperty.builder()
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
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-route-httproutematch.html)
   */
  public interface HttpRouteMatchProperty {
    /**
     * The client request headers to match on.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-route-httproutematch.html#cfn-appmesh-route-httproutematch-headers)
     */
    public fun headers(): Any? = unwrap(this).getHeaders()

    /**
     * The client request method to match on.
     *
     * Specify only one.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-route-httproutematch.html#cfn-appmesh-route-httproutematch-method)
     */
    public fun method(): String? = unwrap(this).getMethod()

    /**
     * The client request path to match on.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-route-httproutematch.html#cfn-appmesh-route-httproutematch-path)
     */
    public fun path(): Any? = unwrap(this).getPath()

    /**
     * The port number to match on.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-route-httproutematch.html#cfn-appmesh-route-httproutematch-port)
     */
    public fun port(): Number? = unwrap(this).getPort()

    /**
     * Specifies the path to match requests with.
     *
     * This parameter must always start with `/` , which by itself matches all requests to the
     * virtual service name. You can also match for path-based routing of requests. For example, if
     * your virtual service name is `my-service.local` and you want the route to match requests to
     * `my-service.local/metrics` , your prefix should be `/metrics` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-route-httproutematch.html#cfn-appmesh-route-httproutematch-prefix)
     */
    public fun prefix(): String? = unwrap(this).getPrefix()

    /**
     * The client request query parameters to match on.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-route-httproutematch.html#cfn-appmesh-route-httproutematch-queryparameters)
     */
    public fun queryParameters(): Any? = unwrap(this).getQueryParameters()

    /**
     * The client request scheme to match on.
     *
     * Specify only one. Applicable only for HTTP2 routes.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-route-httproutematch.html#cfn-appmesh-route-httproutematch-scheme)
     */
    public fun scheme(): String? = unwrap(this).getScheme()

    /**
     * A builder for [HttpRouteMatchProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param headers The client request headers to match on.
       */
      public fun headers(headers: IResolvable)

      /**
       * @param headers The client request headers to match on.
       */
      public fun headers(headers: List<Any>)

      /**
       * @param headers The client request headers to match on.
       */
      public fun headers(vararg headers: Any)

      /**
       * @param method The client request method to match on.
       * Specify only one.
       */
      public fun method(method: String)

      /**
       * @param path The client request path to match on.
       */
      public fun path(path: IResolvable)

      /**
       * @param path The client request path to match on.
       */
      public fun path(path: HttpPathMatchProperty)

      /**
       * @param path The client request path to match on.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("009420f2969a20c35f935fa5a7d88970b02cead52cdf6653a70335ca15e7b8cb")
      public fun path(path: HttpPathMatchProperty.Builder.() -> Unit)

      /**
       * @param port The port number to match on.
       */
      public fun port(port: Number)

      /**
       * @param prefix Specifies the path to match requests with.
       * This parameter must always start with `/` , which by itself matches all requests to the
       * virtual service name. You can also match for path-based routing of requests. For example, if
       * your virtual service name is `my-service.local` and you want the route to match requests to
       * `my-service.local/metrics` , your prefix should be `/metrics` .
       */
      public fun prefix(prefix: String)

      /**
       * @param queryParameters The client request query parameters to match on.
       */
      public fun queryParameters(queryParameters: IResolvable)

      /**
       * @param queryParameters The client request query parameters to match on.
       */
      public fun queryParameters(queryParameters: List<Any>)

      /**
       * @param queryParameters The client request query parameters to match on.
       */
      public fun queryParameters(vararg queryParameters: Any)

      /**
       * @param scheme The client request scheme to match on.
       * Specify only one. Applicable only for HTTP2 routes.
       */
      public fun scheme(scheme: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.appmesh.CfnRoute.HttpRouteMatchProperty.Builder =
          software.amazon.awscdk.services.appmesh.CfnRoute.HttpRouteMatchProperty.builder()

      /**
       * @param headers The client request headers to match on.
       */
      override fun headers(headers: IResolvable) {
        cdkBuilder.headers(headers.let(IResolvable::unwrap))
      }

      /**
       * @param headers The client request headers to match on.
       */
      override fun headers(headers: List<Any>) {
        cdkBuilder.headers(headers)
      }

      /**
       * @param headers The client request headers to match on.
       */
      override fun headers(vararg headers: Any): Unit = headers(headers.toList())

      /**
       * @param method The client request method to match on.
       * Specify only one.
       */
      override fun method(method: String) {
        cdkBuilder.method(method)
      }

      /**
       * @param path The client request path to match on.
       */
      override fun path(path: IResolvable) {
        cdkBuilder.path(path.let(IResolvable::unwrap))
      }

      /**
       * @param path The client request path to match on.
       */
      override fun path(path: HttpPathMatchProperty) {
        cdkBuilder.path(path.let(HttpPathMatchProperty::unwrap))
      }

      /**
       * @param path The client request path to match on.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("009420f2969a20c35f935fa5a7d88970b02cead52cdf6653a70335ca15e7b8cb")
      override fun path(path: HttpPathMatchProperty.Builder.() -> Unit): Unit =
          path(HttpPathMatchProperty(path))

      /**
       * @param port The port number to match on.
       */
      override fun port(port: Number) {
        cdkBuilder.port(port)
      }

      /**
       * @param prefix Specifies the path to match requests with.
       * This parameter must always start with `/` , which by itself matches all requests to the
       * virtual service name. You can also match for path-based routing of requests. For example, if
       * your virtual service name is `my-service.local` and you want the route to match requests to
       * `my-service.local/metrics` , your prefix should be `/metrics` .
       */
      override fun prefix(prefix: String) {
        cdkBuilder.prefix(prefix)
      }

      /**
       * @param queryParameters The client request query parameters to match on.
       */
      override fun queryParameters(queryParameters: IResolvable) {
        cdkBuilder.queryParameters(queryParameters.let(IResolvable::unwrap))
      }

      /**
       * @param queryParameters The client request query parameters to match on.
       */
      override fun queryParameters(queryParameters: List<Any>) {
        cdkBuilder.queryParameters(queryParameters)
      }

      /**
       * @param queryParameters The client request query parameters to match on.
       */
      override fun queryParameters(vararg queryParameters: Any): Unit =
          queryParameters(queryParameters.toList())

      /**
       * @param scheme The client request scheme to match on.
       * Specify only one. Applicable only for HTTP2 routes.
       */
      override fun scheme(scheme: String) {
        cdkBuilder.scheme(scheme)
      }

      public fun build(): software.amazon.awscdk.services.appmesh.CfnRoute.HttpRouteMatchProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.appmesh.CfnRoute.HttpRouteMatchProperty,
    ) : CdkObject(cdkObject), HttpRouteMatchProperty {
      /**
       * The client request headers to match on.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-route-httproutematch.html#cfn-appmesh-route-httproutematch-headers)
       */
      override fun headers(): Any? = unwrap(this).getHeaders()

      /**
       * The client request method to match on.
       *
       * Specify only one.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-route-httproutematch.html#cfn-appmesh-route-httproutematch-method)
       */
      override fun method(): String? = unwrap(this).getMethod()

      /**
       * The client request path to match on.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-route-httproutematch.html#cfn-appmesh-route-httproutematch-path)
       */
      override fun path(): Any? = unwrap(this).getPath()

      /**
       * The port number to match on.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-route-httproutematch.html#cfn-appmesh-route-httproutematch-port)
       */
      override fun port(): Number? = unwrap(this).getPort()

      /**
       * Specifies the path to match requests with.
       *
       * This parameter must always start with `/` , which by itself matches all requests to the
       * virtual service name. You can also match for path-based routing of requests. For example, if
       * your virtual service name is `my-service.local` and you want the route to match requests to
       * `my-service.local/metrics` , your prefix should be `/metrics` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-route-httproutematch.html#cfn-appmesh-route-httproutematch-prefix)
       */
      override fun prefix(): String? = unwrap(this).getPrefix()

      /**
       * The client request query parameters to match on.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-route-httproutematch.html#cfn-appmesh-route-httproutematch-queryparameters)
       */
      override fun queryParameters(): Any? = unwrap(this).getQueryParameters()

      /**
       * The client request scheme to match on.
       *
       * Specify only one. Applicable only for HTTP2 routes.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-route-httproutematch.html#cfn-appmesh-route-httproutematch-scheme)
       */
      override fun scheme(): String? = unwrap(this).getScheme()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): HttpRouteMatchProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.appmesh.CfnRoute.HttpRouteMatchProperty):
          HttpRouteMatchProperty = CdkObjectWrappers.wrap(cdkObject) as HttpRouteMatchProperty

      internal fun unwrap(wrapped: HttpRouteMatchProperty):
          software.amazon.awscdk.services.appmesh.CfnRoute.HttpRouteMatchProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.appmesh.CfnRoute.HttpRouteMatchProperty
    }
  }

  /**
   * An object that represents a gRPC route type.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.appmesh.*;
   * GrpcRouteProperty grpcRouteProperty = GrpcRouteProperty.builder()
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
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-route-grpcroute.html)
   */
  public interface GrpcRouteProperty {
    /**
     * An object that represents the action to take if a match is determined.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-route-grpcroute.html#cfn-appmesh-route-grpcroute-action)
     */
    public fun action(): Any

    /**
     * An object that represents the criteria for determining a request match.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-route-grpcroute.html#cfn-appmesh-route-grpcroute-match)
     */
    public fun match(): Any

    /**
     * An object that represents a retry policy.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-route-grpcroute.html#cfn-appmesh-route-grpcroute-retrypolicy)
     */
    public fun retryPolicy(): Any? = unwrap(this).getRetryPolicy()

    /**
     * An object that represents types of timeouts.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-route-grpcroute.html#cfn-appmesh-route-grpcroute-timeout)
     */
    public fun timeout(): Any? = unwrap(this).getTimeout()

    /**
     * A builder for [GrpcRouteProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param action An object that represents the action to take if a match is determined. 
       */
      public fun action(action: IResolvable)

      /**
       * @param action An object that represents the action to take if a match is determined. 
       */
      public fun action(action: GrpcRouteActionProperty)

      /**
       * @param action An object that represents the action to take if a match is determined. 
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("deb356349d43b14b819c27ec44bcfabbef82f200fa82ab4ce6c3de51f38ac167")
      public fun action(action: GrpcRouteActionProperty.Builder.() -> Unit)

      /**
       * @param match An object that represents the criteria for determining a request match. 
       */
      public fun match(match: IResolvable)

      /**
       * @param match An object that represents the criteria for determining a request match. 
       */
      public fun match(match: GrpcRouteMatchProperty)

      /**
       * @param match An object that represents the criteria for determining a request match. 
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("009ee1182c5e9df562b3e667c43d88998718ea63df21ccdbb5c29ecaacdd6a4e")
      public fun match(match: GrpcRouteMatchProperty.Builder.() -> Unit)

      /**
       * @param retryPolicy An object that represents a retry policy.
       */
      public fun retryPolicy(retryPolicy: IResolvable)

      /**
       * @param retryPolicy An object that represents a retry policy.
       */
      public fun retryPolicy(retryPolicy: GrpcRetryPolicyProperty)

      /**
       * @param retryPolicy An object that represents a retry policy.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("2d0404dbdc3e4067a9ee29cf3c155d2a25d2a1e53f23d6a731943ab905531f27")
      public fun retryPolicy(retryPolicy: GrpcRetryPolicyProperty.Builder.() -> Unit)

      /**
       * @param timeout An object that represents types of timeouts.
       */
      public fun timeout(timeout: IResolvable)

      /**
       * @param timeout An object that represents types of timeouts.
       */
      public fun timeout(timeout: GrpcTimeoutProperty)

      /**
       * @param timeout An object that represents types of timeouts.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("1ab6b3ffbf90f3d4463628beddf62a71100df5d666e0c39dcc5df20e8cd51c80")
      public fun timeout(timeout: GrpcTimeoutProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.appmesh.CfnRoute.GrpcRouteProperty.Builder =
          software.amazon.awscdk.services.appmesh.CfnRoute.GrpcRouteProperty.builder()

      /**
       * @param action An object that represents the action to take if a match is determined. 
       */
      override fun action(action: IResolvable) {
        cdkBuilder.action(action.let(IResolvable::unwrap))
      }

      /**
       * @param action An object that represents the action to take if a match is determined. 
       */
      override fun action(action: GrpcRouteActionProperty) {
        cdkBuilder.action(action.let(GrpcRouteActionProperty::unwrap))
      }

      /**
       * @param action An object that represents the action to take if a match is determined. 
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("deb356349d43b14b819c27ec44bcfabbef82f200fa82ab4ce6c3de51f38ac167")
      override fun action(action: GrpcRouteActionProperty.Builder.() -> Unit): Unit =
          action(GrpcRouteActionProperty(action))

      /**
       * @param match An object that represents the criteria for determining a request match. 
       */
      override fun match(match: IResolvable) {
        cdkBuilder.match(match.let(IResolvable::unwrap))
      }

      /**
       * @param match An object that represents the criteria for determining a request match. 
       */
      override fun match(match: GrpcRouteMatchProperty) {
        cdkBuilder.match(match.let(GrpcRouteMatchProperty::unwrap))
      }

      /**
       * @param match An object that represents the criteria for determining a request match. 
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("009ee1182c5e9df562b3e667c43d88998718ea63df21ccdbb5c29ecaacdd6a4e")
      override fun match(match: GrpcRouteMatchProperty.Builder.() -> Unit): Unit =
          match(GrpcRouteMatchProperty(match))

      /**
       * @param retryPolicy An object that represents a retry policy.
       */
      override fun retryPolicy(retryPolicy: IResolvable) {
        cdkBuilder.retryPolicy(retryPolicy.let(IResolvable::unwrap))
      }

      /**
       * @param retryPolicy An object that represents a retry policy.
       */
      override fun retryPolicy(retryPolicy: GrpcRetryPolicyProperty) {
        cdkBuilder.retryPolicy(retryPolicy.let(GrpcRetryPolicyProperty::unwrap))
      }

      /**
       * @param retryPolicy An object that represents a retry policy.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("2d0404dbdc3e4067a9ee29cf3c155d2a25d2a1e53f23d6a731943ab905531f27")
      override fun retryPolicy(retryPolicy: GrpcRetryPolicyProperty.Builder.() -> Unit): Unit =
          retryPolicy(GrpcRetryPolicyProperty(retryPolicy))

      /**
       * @param timeout An object that represents types of timeouts.
       */
      override fun timeout(timeout: IResolvable) {
        cdkBuilder.timeout(timeout.let(IResolvable::unwrap))
      }

      /**
       * @param timeout An object that represents types of timeouts.
       */
      override fun timeout(timeout: GrpcTimeoutProperty) {
        cdkBuilder.timeout(timeout.let(GrpcTimeoutProperty::unwrap))
      }

      /**
       * @param timeout An object that represents types of timeouts.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("1ab6b3ffbf90f3d4463628beddf62a71100df5d666e0c39dcc5df20e8cd51c80")
      override fun timeout(timeout: GrpcTimeoutProperty.Builder.() -> Unit): Unit =
          timeout(GrpcTimeoutProperty(timeout))

      public fun build(): software.amazon.awscdk.services.appmesh.CfnRoute.GrpcRouteProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject: software.amazon.awscdk.services.appmesh.CfnRoute.GrpcRouteProperty,
    ) : CdkObject(cdkObject), GrpcRouteProperty {
      /**
       * An object that represents the action to take if a match is determined.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-route-grpcroute.html#cfn-appmesh-route-grpcroute-action)
       */
      override fun action(): Any = unwrap(this).getAction()

      /**
       * An object that represents the criteria for determining a request match.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-route-grpcroute.html#cfn-appmesh-route-grpcroute-match)
       */
      override fun match(): Any = unwrap(this).getMatch()

      /**
       * An object that represents a retry policy.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-route-grpcroute.html#cfn-appmesh-route-grpcroute-retrypolicy)
       */
      override fun retryPolicy(): Any? = unwrap(this).getRetryPolicy()

      /**
       * An object that represents types of timeouts.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-route-grpcroute.html#cfn-appmesh-route-grpcroute-timeout)
       */
      override fun timeout(): Any? = unwrap(this).getTimeout()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): GrpcRouteProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.appmesh.CfnRoute.GrpcRouteProperty):
          GrpcRouteProperty = CdkObjectWrappers.wrap(cdkObject) as GrpcRouteProperty

      internal fun unwrap(wrapped: GrpcRouteProperty):
          software.amazon.awscdk.services.appmesh.CfnRoute.GrpcRouteProperty = (wrapped as
          CdkObject).cdkObject as software.amazon.awscdk.services.appmesh.CfnRoute.GrpcRouteProperty
    }
  }

  /**
   * An object that represents the action to take if a match is determined.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.appmesh.*;
   * HttpRouteActionProperty httpRouteActionProperty = HttpRouteActionProperty.builder()
   * .weightedTargets(List.of(WeightedTargetProperty.builder()
   * .virtualNode("virtualNode")
   * .weight(123)
   * // the properties below are optional
   * .port(123)
   * .build()))
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-route-httprouteaction.html)
   */
  public interface HttpRouteActionProperty {
    /**
     * An object that represents the targets that traffic is routed to when a request matches the
     * route.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-route-httprouteaction.html#cfn-appmesh-route-httprouteaction-weightedtargets)
     */
    public fun weightedTargets(): Any

    /**
     * A builder for [HttpRouteActionProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param weightedTargets An object that represents the targets that traffic is routed to when
       * a request matches the route. 
       */
      public fun weightedTargets(weightedTargets: IResolvable)

      /**
       * @param weightedTargets An object that represents the targets that traffic is routed to when
       * a request matches the route. 
       */
      public fun weightedTargets(weightedTargets: List<Any>)

      /**
       * @param weightedTargets An object that represents the targets that traffic is routed to when
       * a request matches the route. 
       */
      public fun weightedTargets(vararg weightedTargets: Any)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.appmesh.CfnRoute.HttpRouteActionProperty.Builder =
          software.amazon.awscdk.services.appmesh.CfnRoute.HttpRouteActionProperty.builder()

      /**
       * @param weightedTargets An object that represents the targets that traffic is routed to when
       * a request matches the route. 
       */
      override fun weightedTargets(weightedTargets: IResolvable) {
        cdkBuilder.weightedTargets(weightedTargets.let(IResolvable::unwrap))
      }

      /**
       * @param weightedTargets An object that represents the targets that traffic is routed to when
       * a request matches the route. 
       */
      override fun weightedTargets(weightedTargets: List<Any>) {
        cdkBuilder.weightedTargets(weightedTargets)
      }

      /**
       * @param weightedTargets An object that represents the targets that traffic is routed to when
       * a request matches the route. 
       */
      override fun weightedTargets(vararg weightedTargets: Any): Unit =
          weightedTargets(weightedTargets.toList())

      public fun build(): software.amazon.awscdk.services.appmesh.CfnRoute.HttpRouteActionProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.appmesh.CfnRoute.HttpRouteActionProperty,
    ) : CdkObject(cdkObject), HttpRouteActionProperty {
      /**
       * An object that represents the targets that traffic is routed to when a request matches the
       * route.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-route-httprouteaction.html#cfn-appmesh-route-httprouteaction-weightedtargets)
       */
      override fun weightedTargets(): Any = unwrap(this).getWeightedTargets()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): HttpRouteActionProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.appmesh.CfnRoute.HttpRouteActionProperty):
          HttpRouteActionProperty = CdkObjectWrappers.wrap(cdkObject) as HttpRouteActionProperty

      internal fun unwrap(wrapped: HttpRouteActionProperty):
          software.amazon.awscdk.services.appmesh.CfnRoute.HttpRouteActionProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.appmesh.CfnRoute.HttpRouteActionProperty
    }
  }

  /**
   * An object that represents the range of values to match on.
   *
   * The first character of the range is included in the range, though the last character is not.
   * For example, if the range specified were 1-100, only values 1-99 would be matched.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.appmesh.*;
   * MatchRangeProperty matchRangeProperty = MatchRangeProperty.builder()
   * .end(123)
   * .start(123)
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-route-matchrange.html)
   */
  public interface MatchRangeProperty {
    /**
     * The end of the range.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-route-matchrange.html#cfn-appmesh-route-matchrange-end)
     */
    public fun end(): Number

    /**
     * The start of the range.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-route-matchrange.html#cfn-appmesh-route-matchrange-start)
     */
    public fun start(): Number

    /**
     * A builder for [MatchRangeProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param end The end of the range. 
       */
      public fun end(end: Number)

      /**
       * @param start The start of the range. 
       */
      public fun start(start: Number)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.appmesh.CfnRoute.MatchRangeProperty.Builder =
          software.amazon.awscdk.services.appmesh.CfnRoute.MatchRangeProperty.builder()

      /**
       * @param end The end of the range. 
       */
      override fun end(end: Number) {
        cdkBuilder.end(end)
      }

      /**
       * @param start The start of the range. 
       */
      override fun start(start: Number) {
        cdkBuilder.start(start)
      }

      public fun build(): software.amazon.awscdk.services.appmesh.CfnRoute.MatchRangeProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject: software.amazon.awscdk.services.appmesh.CfnRoute.MatchRangeProperty,
    ) : CdkObject(cdkObject), MatchRangeProperty {
      /**
       * The end of the range.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-route-matchrange.html#cfn-appmesh-route-matchrange-end)
       */
      override fun end(): Number = unwrap(this).getEnd()

      /**
       * The start of the range.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-route-matchrange.html#cfn-appmesh-route-matchrange-start)
       */
      override fun start(): Number = unwrap(this).getStart()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): MatchRangeProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.appmesh.CfnRoute.MatchRangeProperty):
          MatchRangeProperty = CdkObjectWrappers.wrap(cdkObject) as MatchRangeProperty

      internal fun unwrap(wrapped: MatchRangeProperty):
          software.amazon.awscdk.services.appmesh.CfnRoute.MatchRangeProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.appmesh.CfnRoute.MatchRangeProperty
    }
  }

  /**
   * An object that represents a TCP route type.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.appmesh.*;
   * TcpRouteProperty tcpRouteProperty = TcpRouteProperty.builder()
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
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-route-tcproute.html)
   */
  public interface TcpRouteProperty {
    /**
     * The action to take if a match is determined.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-route-tcproute.html#cfn-appmesh-route-tcproute-action)
     */
    public fun action(): Any

    /**
     * An object that represents the criteria for determining a request match.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-route-tcproute.html#cfn-appmesh-route-tcproute-match)
     */
    public fun match(): Any? = unwrap(this).getMatch()

    /**
     * An object that represents types of timeouts.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-route-tcproute.html#cfn-appmesh-route-tcproute-timeout)
     */
    public fun timeout(): Any? = unwrap(this).getTimeout()

    /**
     * A builder for [TcpRouteProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param action The action to take if a match is determined. 
       */
      public fun action(action: IResolvable)

      /**
       * @param action The action to take if a match is determined. 
       */
      public fun action(action: TcpRouteActionProperty)

      /**
       * @param action The action to take if a match is determined. 
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("62d055f4c1c68793ad51559c95d77ed9a50b791fecfd73686943286c1198917a")
      public fun action(action: TcpRouteActionProperty.Builder.() -> Unit)

      /**
       * @param match An object that represents the criteria for determining a request match.
       */
      public fun match(match: IResolvable)

      /**
       * @param match An object that represents the criteria for determining a request match.
       */
      public fun match(match: TcpRouteMatchProperty)

      /**
       * @param match An object that represents the criteria for determining a request match.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("f42835d85357504b2baa3fad47e076d767de55be0a7faf135b1bc2002132c891")
      public fun match(match: TcpRouteMatchProperty.Builder.() -> Unit)

      /**
       * @param timeout An object that represents types of timeouts.
       */
      public fun timeout(timeout: IResolvable)

      /**
       * @param timeout An object that represents types of timeouts.
       */
      public fun timeout(timeout: TcpTimeoutProperty)

      /**
       * @param timeout An object that represents types of timeouts.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("41979e326604c0b0b062081fded5dec4fd8a862e343227bcbed8b3baefb8de87")
      public fun timeout(timeout: TcpTimeoutProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.appmesh.CfnRoute.TcpRouteProperty.Builder =
          software.amazon.awscdk.services.appmesh.CfnRoute.TcpRouteProperty.builder()

      /**
       * @param action The action to take if a match is determined. 
       */
      override fun action(action: IResolvable) {
        cdkBuilder.action(action.let(IResolvable::unwrap))
      }

      /**
       * @param action The action to take if a match is determined. 
       */
      override fun action(action: TcpRouteActionProperty) {
        cdkBuilder.action(action.let(TcpRouteActionProperty::unwrap))
      }

      /**
       * @param action The action to take if a match is determined. 
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("62d055f4c1c68793ad51559c95d77ed9a50b791fecfd73686943286c1198917a")
      override fun action(action: TcpRouteActionProperty.Builder.() -> Unit): Unit =
          action(TcpRouteActionProperty(action))

      /**
       * @param match An object that represents the criteria for determining a request match.
       */
      override fun match(match: IResolvable) {
        cdkBuilder.match(match.let(IResolvable::unwrap))
      }

      /**
       * @param match An object that represents the criteria for determining a request match.
       */
      override fun match(match: TcpRouteMatchProperty) {
        cdkBuilder.match(match.let(TcpRouteMatchProperty::unwrap))
      }

      /**
       * @param match An object that represents the criteria for determining a request match.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("f42835d85357504b2baa3fad47e076d767de55be0a7faf135b1bc2002132c891")
      override fun match(match: TcpRouteMatchProperty.Builder.() -> Unit): Unit =
          match(TcpRouteMatchProperty(match))

      /**
       * @param timeout An object that represents types of timeouts.
       */
      override fun timeout(timeout: IResolvable) {
        cdkBuilder.timeout(timeout.let(IResolvable::unwrap))
      }

      /**
       * @param timeout An object that represents types of timeouts.
       */
      override fun timeout(timeout: TcpTimeoutProperty) {
        cdkBuilder.timeout(timeout.let(TcpTimeoutProperty::unwrap))
      }

      /**
       * @param timeout An object that represents types of timeouts.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("41979e326604c0b0b062081fded5dec4fd8a862e343227bcbed8b3baefb8de87")
      override fun timeout(timeout: TcpTimeoutProperty.Builder.() -> Unit): Unit =
          timeout(TcpTimeoutProperty(timeout))

      public fun build(): software.amazon.awscdk.services.appmesh.CfnRoute.TcpRouteProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject: software.amazon.awscdk.services.appmesh.CfnRoute.TcpRouteProperty,
    ) : CdkObject(cdkObject), TcpRouteProperty {
      /**
       * The action to take if a match is determined.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-route-tcproute.html#cfn-appmesh-route-tcproute-action)
       */
      override fun action(): Any = unwrap(this).getAction()

      /**
       * An object that represents the criteria for determining a request match.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-route-tcproute.html#cfn-appmesh-route-tcproute-match)
       */
      override fun match(): Any? = unwrap(this).getMatch()

      /**
       * An object that represents types of timeouts.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-route-tcproute.html#cfn-appmesh-route-tcproute-timeout)
       */
      override fun timeout(): Any? = unwrap(this).getTimeout()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): TcpRouteProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.appmesh.CfnRoute.TcpRouteProperty):
          TcpRouteProperty = CdkObjectWrappers.wrap(cdkObject) as TcpRouteProperty

      internal fun unwrap(wrapped: TcpRouteProperty):
          software.amazon.awscdk.services.appmesh.CfnRoute.TcpRouteProperty = (wrapped as
          CdkObject).cdkObject as software.amazon.awscdk.services.appmesh.CfnRoute.TcpRouteProperty
    }
  }

  /**
   * An object that represents types of timeouts.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.appmesh.*;
   * TcpTimeoutProperty tcpTimeoutProperty = TcpTimeoutProperty.builder()
   * .idle(DurationProperty.builder()
   * .unit("unit")
   * .value(123)
   * .build())
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-route-tcptimeout.html)
   */
  public interface TcpTimeoutProperty {
    /**
     * An object that represents an idle timeout.
     *
     * An idle timeout bounds the amount of time that a connection may be idle. The default value is
     * none.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-route-tcptimeout.html#cfn-appmesh-route-tcptimeout-idle)
     */
    public fun idle(): Any? = unwrap(this).getIdle()

    /**
     * A builder for [TcpTimeoutProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param idle An object that represents an idle timeout.
       * An idle timeout bounds the amount of time that a connection may be idle. The default value
       * is none.
       */
      public fun idle(idle: IResolvable)

      /**
       * @param idle An object that represents an idle timeout.
       * An idle timeout bounds the amount of time that a connection may be idle. The default value
       * is none.
       */
      public fun idle(idle: DurationProperty)

      /**
       * @param idle An object that represents an idle timeout.
       * An idle timeout bounds the amount of time that a connection may be idle. The default value
       * is none.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("1c4160b98941c730a1e2015fb21c37469fa386be6106183c7f29c91982b2f7a7")
      public fun idle(idle: DurationProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.appmesh.CfnRoute.TcpTimeoutProperty.Builder =
          software.amazon.awscdk.services.appmesh.CfnRoute.TcpTimeoutProperty.builder()

      /**
       * @param idle An object that represents an idle timeout.
       * An idle timeout bounds the amount of time that a connection may be idle. The default value
       * is none.
       */
      override fun idle(idle: IResolvable) {
        cdkBuilder.idle(idle.let(IResolvable::unwrap))
      }

      /**
       * @param idle An object that represents an idle timeout.
       * An idle timeout bounds the amount of time that a connection may be idle. The default value
       * is none.
       */
      override fun idle(idle: DurationProperty) {
        cdkBuilder.idle(idle.let(DurationProperty::unwrap))
      }

      /**
       * @param idle An object that represents an idle timeout.
       * An idle timeout bounds the amount of time that a connection may be idle. The default value
       * is none.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("1c4160b98941c730a1e2015fb21c37469fa386be6106183c7f29c91982b2f7a7")
      override fun idle(idle: DurationProperty.Builder.() -> Unit): Unit =
          idle(DurationProperty(idle))

      public fun build(): software.amazon.awscdk.services.appmesh.CfnRoute.TcpTimeoutProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject: software.amazon.awscdk.services.appmesh.CfnRoute.TcpTimeoutProperty,
    ) : CdkObject(cdkObject), TcpTimeoutProperty {
      /**
       * An object that represents an idle timeout.
       *
       * An idle timeout bounds the amount of time that a connection may be idle. The default value
       * is none.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-route-tcptimeout.html#cfn-appmesh-route-tcptimeout-idle)
       */
      override fun idle(): Any? = unwrap(this).getIdle()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): TcpTimeoutProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.appmesh.CfnRoute.TcpTimeoutProperty):
          TcpTimeoutProperty = CdkObjectWrappers.wrap(cdkObject) as TcpTimeoutProperty

      internal fun unwrap(wrapped: TcpTimeoutProperty):
          software.amazon.awscdk.services.appmesh.CfnRoute.TcpTimeoutProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.appmesh.CfnRoute.TcpTimeoutProperty
    }
  }

  /**
   * An object that represents types of timeouts.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.appmesh.*;
   * GrpcTimeoutProperty grpcTimeoutProperty = GrpcTimeoutProperty.builder()
   * .idle(DurationProperty.builder()
   * .unit("unit")
   * .value(123)
   * .build())
   * .perRequest(DurationProperty.builder()
   * .unit("unit")
   * .value(123)
   * .build())
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-route-grpctimeout.html)
   */
  public interface GrpcTimeoutProperty {
    /**
     * An object that represents an idle timeout.
     *
     * An idle timeout bounds the amount of time that a connection may be idle. The default value is
     * none.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-route-grpctimeout.html#cfn-appmesh-route-grpctimeout-idle)
     */
    public fun idle(): Any? = unwrap(this).getIdle()

    /**
     * An object that represents a per request timeout.
     *
     * The default value is 15 seconds. If you set a higher timeout, then make sure that the higher
     * value is set for each App Mesh resource in a conversation. For example, if a virtual node
     * backend uses a virtual router provider to route to another virtual node, then the timeout should
     * be greater than 15 seconds for the source and destination virtual node and the route.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-route-grpctimeout.html#cfn-appmesh-route-grpctimeout-perrequest)
     */
    public fun perRequest(): Any? = unwrap(this).getPerRequest()

    /**
     * A builder for [GrpcTimeoutProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param idle An object that represents an idle timeout.
       * An idle timeout bounds the amount of time that a connection may be idle. The default value
       * is none.
       */
      public fun idle(idle: IResolvable)

      /**
       * @param idle An object that represents an idle timeout.
       * An idle timeout bounds the amount of time that a connection may be idle. The default value
       * is none.
       */
      public fun idle(idle: DurationProperty)

      /**
       * @param idle An object that represents an idle timeout.
       * An idle timeout bounds the amount of time that a connection may be idle. The default value
       * is none.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("95c5794f36a0a9c9668fb52ca7fb2a4b5c359637bc1d4d2ed2cb6b36aef36fdf")
      public fun idle(idle: DurationProperty.Builder.() -> Unit)

      /**
       * @param perRequest An object that represents a per request timeout.
       * The default value is 15 seconds. If you set a higher timeout, then make sure that the
       * higher value is set for each App Mesh resource in a conversation. For example, if a virtual
       * node backend uses a virtual router provider to route to another virtual node, then the timeout
       * should be greater than 15 seconds for the source and destination virtual node and the route.
       */
      public fun perRequest(perRequest: IResolvable)

      /**
       * @param perRequest An object that represents a per request timeout.
       * The default value is 15 seconds. If you set a higher timeout, then make sure that the
       * higher value is set for each App Mesh resource in a conversation. For example, if a virtual
       * node backend uses a virtual router provider to route to another virtual node, then the timeout
       * should be greater than 15 seconds for the source and destination virtual node and the route.
       */
      public fun perRequest(perRequest: DurationProperty)

      /**
       * @param perRequest An object that represents a per request timeout.
       * The default value is 15 seconds. If you set a higher timeout, then make sure that the
       * higher value is set for each App Mesh resource in a conversation. For example, if a virtual
       * node backend uses a virtual router provider to route to another virtual node, then the timeout
       * should be greater than 15 seconds for the source and destination virtual node and the route.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("f5438550ba4fd648dc25d25dc5a576a858788355a6ecf2edae71d1633f3f004b")
      public fun perRequest(perRequest: DurationProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.appmesh.CfnRoute.GrpcTimeoutProperty.Builder =
          software.amazon.awscdk.services.appmesh.CfnRoute.GrpcTimeoutProperty.builder()

      /**
       * @param idle An object that represents an idle timeout.
       * An idle timeout bounds the amount of time that a connection may be idle. The default value
       * is none.
       */
      override fun idle(idle: IResolvable) {
        cdkBuilder.idle(idle.let(IResolvable::unwrap))
      }

      /**
       * @param idle An object that represents an idle timeout.
       * An idle timeout bounds the amount of time that a connection may be idle. The default value
       * is none.
       */
      override fun idle(idle: DurationProperty) {
        cdkBuilder.idle(idle.let(DurationProperty::unwrap))
      }

      /**
       * @param idle An object that represents an idle timeout.
       * An idle timeout bounds the amount of time that a connection may be idle. The default value
       * is none.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("95c5794f36a0a9c9668fb52ca7fb2a4b5c359637bc1d4d2ed2cb6b36aef36fdf")
      override fun idle(idle: DurationProperty.Builder.() -> Unit): Unit =
          idle(DurationProperty(idle))

      /**
       * @param perRequest An object that represents a per request timeout.
       * The default value is 15 seconds. If you set a higher timeout, then make sure that the
       * higher value is set for each App Mesh resource in a conversation. For example, if a virtual
       * node backend uses a virtual router provider to route to another virtual node, then the timeout
       * should be greater than 15 seconds for the source and destination virtual node and the route.
       */
      override fun perRequest(perRequest: IResolvable) {
        cdkBuilder.perRequest(perRequest.let(IResolvable::unwrap))
      }

      /**
       * @param perRequest An object that represents a per request timeout.
       * The default value is 15 seconds. If you set a higher timeout, then make sure that the
       * higher value is set for each App Mesh resource in a conversation. For example, if a virtual
       * node backend uses a virtual router provider to route to another virtual node, then the timeout
       * should be greater than 15 seconds for the source and destination virtual node and the route.
       */
      override fun perRequest(perRequest: DurationProperty) {
        cdkBuilder.perRequest(perRequest.let(DurationProperty::unwrap))
      }

      /**
       * @param perRequest An object that represents a per request timeout.
       * The default value is 15 seconds. If you set a higher timeout, then make sure that the
       * higher value is set for each App Mesh resource in a conversation. For example, if a virtual
       * node backend uses a virtual router provider to route to another virtual node, then the timeout
       * should be greater than 15 seconds for the source and destination virtual node and the route.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("f5438550ba4fd648dc25d25dc5a576a858788355a6ecf2edae71d1633f3f004b")
      override fun perRequest(perRequest: DurationProperty.Builder.() -> Unit): Unit =
          perRequest(DurationProperty(perRequest))

      public fun build(): software.amazon.awscdk.services.appmesh.CfnRoute.GrpcTimeoutProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject: software.amazon.awscdk.services.appmesh.CfnRoute.GrpcTimeoutProperty,
    ) : CdkObject(cdkObject), GrpcTimeoutProperty {
      /**
       * An object that represents an idle timeout.
       *
       * An idle timeout bounds the amount of time that a connection may be idle. The default value
       * is none.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-route-grpctimeout.html#cfn-appmesh-route-grpctimeout-idle)
       */
      override fun idle(): Any? = unwrap(this).getIdle()

      /**
       * An object that represents a per request timeout.
       *
       * The default value is 15 seconds. If you set a higher timeout, then make sure that the
       * higher value is set for each App Mesh resource in a conversation. For example, if a virtual
       * node backend uses a virtual router provider to route to another virtual node, then the timeout
       * should be greater than 15 seconds for the source and destination virtual node and the route.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-route-grpctimeout.html#cfn-appmesh-route-grpctimeout-perrequest)
       */
      override fun perRequest(): Any? = unwrap(this).getPerRequest()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): GrpcTimeoutProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.appmesh.CfnRoute.GrpcTimeoutProperty):
          GrpcTimeoutProperty = CdkObjectWrappers.wrap(cdkObject) as GrpcTimeoutProperty

      internal fun unwrap(wrapped: GrpcTimeoutProperty):
          software.amazon.awscdk.services.appmesh.CfnRoute.GrpcTimeoutProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.appmesh.CfnRoute.GrpcTimeoutProperty
    }
  }

  /**
   * An object that represents the HTTP header in the request.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.appmesh.*;
   * HttpRouteHeaderProperty httpRouteHeaderProperty = HttpRouteHeaderProperty.builder()
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
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-route-httprouteheader.html)
   */
  public interface HttpRouteHeaderProperty {
    /**
     * Specify `True` to match anything except the match criteria.
     *
     * The default value is `False` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-route-httprouteheader.html#cfn-appmesh-route-httprouteheader-invert)
     */
    public fun invert(): Any? = unwrap(this).getInvert()

    /**
     * The `HeaderMatchMethod` object.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-route-httprouteheader.html#cfn-appmesh-route-httprouteheader-match)
     */
    public fun match(): Any? = unwrap(this).getMatch()

    /**
     * A name for the HTTP header in the client request that will be matched on.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-route-httprouteheader.html#cfn-appmesh-route-httprouteheader-name)
     */
    public fun name(): String

    /**
     * A builder for [HttpRouteHeaderProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param invert Specify `True` to match anything except the match criteria.
       * The default value is `False` .
       */
      public fun invert(invert: Boolean)

      /**
       * @param invert Specify `True` to match anything except the match criteria.
       * The default value is `False` .
       */
      public fun invert(invert: IResolvable)

      /**
       * @param match The `HeaderMatchMethod` object.
       */
      public fun match(match: IResolvable)

      /**
       * @param match The `HeaderMatchMethod` object.
       */
      public fun match(match: HeaderMatchMethodProperty)

      /**
       * @param match The `HeaderMatchMethod` object.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("943aaa4aa398ae17e9d2d5e5753b2fe642ffc59b5354bfa49414263c1115cb7d")
      public fun match(match: HeaderMatchMethodProperty.Builder.() -> Unit)

      /**
       * @param name A name for the HTTP header in the client request that will be matched on. 
       */
      public fun name(name: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.appmesh.CfnRoute.HttpRouteHeaderProperty.Builder =
          software.amazon.awscdk.services.appmesh.CfnRoute.HttpRouteHeaderProperty.builder()

      /**
       * @param invert Specify `True` to match anything except the match criteria.
       * The default value is `False` .
       */
      override fun invert(invert: Boolean) {
        cdkBuilder.invert(invert)
      }

      /**
       * @param invert Specify `True` to match anything except the match criteria.
       * The default value is `False` .
       */
      override fun invert(invert: IResolvable) {
        cdkBuilder.invert(invert.let(IResolvable::unwrap))
      }

      /**
       * @param match The `HeaderMatchMethod` object.
       */
      override fun match(match: IResolvable) {
        cdkBuilder.match(match.let(IResolvable::unwrap))
      }

      /**
       * @param match The `HeaderMatchMethod` object.
       */
      override fun match(match: HeaderMatchMethodProperty) {
        cdkBuilder.match(match.let(HeaderMatchMethodProperty::unwrap))
      }

      /**
       * @param match The `HeaderMatchMethod` object.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("943aaa4aa398ae17e9d2d5e5753b2fe642ffc59b5354bfa49414263c1115cb7d")
      override fun match(match: HeaderMatchMethodProperty.Builder.() -> Unit): Unit =
          match(HeaderMatchMethodProperty(match))

      /**
       * @param name A name for the HTTP header in the client request that will be matched on. 
       */
      override fun name(name: String) {
        cdkBuilder.name(name)
      }

      public fun build(): software.amazon.awscdk.services.appmesh.CfnRoute.HttpRouteHeaderProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.appmesh.CfnRoute.HttpRouteHeaderProperty,
    ) : CdkObject(cdkObject), HttpRouteHeaderProperty {
      /**
       * Specify `True` to match anything except the match criteria.
       *
       * The default value is `False` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-route-httprouteheader.html#cfn-appmesh-route-httprouteheader-invert)
       */
      override fun invert(): Any? = unwrap(this).getInvert()

      /**
       * The `HeaderMatchMethod` object.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-route-httprouteheader.html#cfn-appmesh-route-httprouteheader-match)
       */
      override fun match(): Any? = unwrap(this).getMatch()

      /**
       * A name for the HTTP header in the client request that will be matched on.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-route-httprouteheader.html#cfn-appmesh-route-httprouteheader-name)
       */
      override fun name(): String = unwrap(this).getName()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): HttpRouteHeaderProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.appmesh.CfnRoute.HttpRouteHeaderProperty):
          HttpRouteHeaderProperty = CdkObjectWrappers.wrap(cdkObject) as HttpRouteHeaderProperty

      internal fun unwrap(wrapped: HttpRouteHeaderProperty):
          software.amazon.awscdk.services.appmesh.CfnRoute.HttpRouteHeaderProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.appmesh.CfnRoute.HttpRouteHeaderProperty
    }
  }

  /**
   * An object that represents the method and value to match with the header value sent in a
   * request.
   *
   * Specify one match method.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.appmesh.*;
   * HeaderMatchMethodProperty headerMatchMethodProperty = HeaderMatchMethodProperty.builder()
   * .exact("exact")
   * .prefix("prefix")
   * .range(MatchRangeProperty.builder()
   * .end(123)
   * .start(123)
   * .build())
   * .regex("regex")
   * .suffix("suffix")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-route-headermatchmethod.html)
   */
  public interface HeaderMatchMethodProperty {
    /**
     * The value sent by the client must match the specified value exactly.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-route-headermatchmethod.html#cfn-appmesh-route-headermatchmethod-exact)
     */
    public fun exact(): String? = unwrap(this).getExact()

    /**
     * The value sent by the client must begin with the specified characters.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-route-headermatchmethod.html#cfn-appmesh-route-headermatchmethod-prefix)
     */
    public fun prefix(): String? = unwrap(this).getPrefix()

    /**
     * An object that represents the range of values to match on.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-route-headermatchmethod.html#cfn-appmesh-route-headermatchmethod-range)
     */
    public fun range(): Any? = unwrap(this).getRange()

    /**
     * The value sent by the client must include the specified characters.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-route-headermatchmethod.html#cfn-appmesh-route-headermatchmethod-regex)
     */
    public fun regex(): String? = unwrap(this).getRegex()

    /**
     * The value sent by the client must end with the specified characters.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-route-headermatchmethod.html#cfn-appmesh-route-headermatchmethod-suffix)
     */
    public fun suffix(): String? = unwrap(this).getSuffix()

    /**
     * A builder for [HeaderMatchMethodProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param exact The value sent by the client must match the specified value exactly.
       */
      public fun exact(exact: String)

      /**
       * @param prefix The value sent by the client must begin with the specified characters.
       */
      public fun prefix(prefix: String)

      /**
       * @param range An object that represents the range of values to match on.
       */
      public fun range(range: IResolvable)

      /**
       * @param range An object that represents the range of values to match on.
       */
      public fun range(range: MatchRangeProperty)

      /**
       * @param range An object that represents the range of values to match on.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("f1f7c2815286fff09a13306072604d8f0b4e9cefb087fb765e2f32673f2ebc31")
      public fun range(range: MatchRangeProperty.Builder.() -> Unit)

      /**
       * @param regex The value sent by the client must include the specified characters.
       */
      public fun regex(regex: String)

      /**
       * @param suffix The value sent by the client must end with the specified characters.
       */
      public fun suffix(suffix: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.appmesh.CfnRoute.HeaderMatchMethodProperty.Builder =
          software.amazon.awscdk.services.appmesh.CfnRoute.HeaderMatchMethodProperty.builder()

      /**
       * @param exact The value sent by the client must match the specified value exactly.
       */
      override fun exact(exact: String) {
        cdkBuilder.exact(exact)
      }

      /**
       * @param prefix The value sent by the client must begin with the specified characters.
       */
      override fun prefix(prefix: String) {
        cdkBuilder.prefix(prefix)
      }

      /**
       * @param range An object that represents the range of values to match on.
       */
      override fun range(range: IResolvable) {
        cdkBuilder.range(range.let(IResolvable::unwrap))
      }

      /**
       * @param range An object that represents the range of values to match on.
       */
      override fun range(range: MatchRangeProperty) {
        cdkBuilder.range(range.let(MatchRangeProperty::unwrap))
      }

      /**
       * @param range An object that represents the range of values to match on.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("f1f7c2815286fff09a13306072604d8f0b4e9cefb087fb765e2f32673f2ebc31")
      override fun range(range: MatchRangeProperty.Builder.() -> Unit): Unit =
          range(MatchRangeProperty(range))

      /**
       * @param regex The value sent by the client must include the specified characters.
       */
      override fun regex(regex: String) {
        cdkBuilder.regex(regex)
      }

      /**
       * @param suffix The value sent by the client must end with the specified characters.
       */
      override fun suffix(suffix: String) {
        cdkBuilder.suffix(suffix)
      }

      public fun build(): software.amazon.awscdk.services.appmesh.CfnRoute.HeaderMatchMethodProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.appmesh.CfnRoute.HeaderMatchMethodProperty,
    ) : CdkObject(cdkObject), HeaderMatchMethodProperty {
      /**
       * The value sent by the client must match the specified value exactly.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-route-headermatchmethod.html#cfn-appmesh-route-headermatchmethod-exact)
       */
      override fun exact(): String? = unwrap(this).getExact()

      /**
       * The value sent by the client must begin with the specified characters.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-route-headermatchmethod.html#cfn-appmesh-route-headermatchmethod-prefix)
       */
      override fun prefix(): String? = unwrap(this).getPrefix()

      /**
       * An object that represents the range of values to match on.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-route-headermatchmethod.html#cfn-appmesh-route-headermatchmethod-range)
       */
      override fun range(): Any? = unwrap(this).getRange()

      /**
       * The value sent by the client must include the specified characters.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-route-headermatchmethod.html#cfn-appmesh-route-headermatchmethod-regex)
       */
      override fun regex(): String? = unwrap(this).getRegex()

      /**
       * The value sent by the client must end with the specified characters.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-route-headermatchmethod.html#cfn-appmesh-route-headermatchmethod-suffix)
       */
      override fun suffix(): String? = unwrap(this).getSuffix()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): HeaderMatchMethodProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.appmesh.CfnRoute.HeaderMatchMethodProperty):
          HeaderMatchMethodProperty = CdkObjectWrappers.wrap(cdkObject) as HeaderMatchMethodProperty

      internal fun unwrap(wrapped: HeaderMatchMethodProperty):
          software.amazon.awscdk.services.appmesh.CfnRoute.HeaderMatchMethodProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.appmesh.CfnRoute.HeaderMatchMethodProperty
    }
  }

  /**
   * An object that represents a retry policy.
   *
   * Specify at least one value for at least one of the types of `RetryEvents` , a value for
   * `maxRetries` , and a value for `perRetryTimeout` . Both `server-error` and `gateway-error` under
   * `httpRetryEvents` include the Envoy `reset` policy. For more information on the `reset` policy,
   * see the [Envoy
   * documentation](https://docs.aws.amazon.com/https://www.envoyproxy.io/docs/envoy/latest/configuration/http/http_filters/router_filter#x-envoy-retry-on)
   * .
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.appmesh.*;
   * HttpRetryPolicyProperty httpRetryPolicyProperty = HttpRetryPolicyProperty.builder()
   * .maxRetries(123)
   * .perRetryTimeout(DurationProperty.builder()
   * .unit("unit")
   * .value(123)
   * .build())
   * // the properties below are optional
   * .httpRetryEvents(List.of("httpRetryEvents"))
   * .tcpRetryEvents(List.of("tcpRetryEvents"))
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-route-httpretrypolicy.html)
   */
  public interface HttpRetryPolicyProperty {
    /**
     * Specify at least one of the following values.
     *
     * * *server-error* – HTTP status codes 500, 501, 502, 503, 504, 505, 506, 507, 508, 510, and
     * 511
     * * *gateway-error* – HTTP status codes 502, 503, and 504
     * * *client-error* – HTTP status code 409
     * * *stream-error* – Retry on refused stream
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-route-httpretrypolicy.html#cfn-appmesh-route-httpretrypolicy-httpretryevents)
     */
    public fun httpRetryEvents(): List<String> = unwrap(this).getHttpRetryEvents() ?: emptyList()

    /**
     * The maximum number of retry attempts.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-route-httpretrypolicy.html#cfn-appmesh-route-httpretrypolicy-maxretries)
     */
    public fun maxRetries(): Number

    /**
     * The timeout for each retry attempt.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-route-httpretrypolicy.html#cfn-appmesh-route-httpretrypolicy-perretrytimeout)
     */
    public fun perRetryTimeout(): Any

    /**
     * Specify a valid value.
     *
     * The event occurs before any processing of a request has started and is encountered when the
     * upstream is temporarily or permanently unavailable.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-route-httpretrypolicy.html#cfn-appmesh-route-httpretrypolicy-tcpretryevents)
     */
    public fun tcpRetryEvents(): List<String> = unwrap(this).getTcpRetryEvents() ?: emptyList()

    /**
     * A builder for [HttpRetryPolicyProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param httpRetryEvents Specify at least one of the following values.
       * * *server-error* – HTTP status codes 500, 501, 502, 503, 504, 505, 506, 507, 508, 510, and
       * 511
       * * *gateway-error* – HTTP status codes 502, 503, and 504
       * * *client-error* – HTTP status code 409
       * * *stream-error* – Retry on refused stream
       */
      public fun httpRetryEvents(httpRetryEvents: List<String>)

      /**
       * @param httpRetryEvents Specify at least one of the following values.
       * * *server-error* – HTTP status codes 500, 501, 502, 503, 504, 505, 506, 507, 508, 510, and
       * 511
       * * *gateway-error* – HTTP status codes 502, 503, and 504
       * * *client-error* – HTTP status code 409
       * * *stream-error* – Retry on refused stream
       */
      public fun httpRetryEvents(vararg httpRetryEvents: String)

      /**
       * @param maxRetries The maximum number of retry attempts. 
       */
      public fun maxRetries(maxRetries: Number)

      /**
       * @param perRetryTimeout The timeout for each retry attempt. 
       */
      public fun perRetryTimeout(perRetryTimeout: IResolvable)

      /**
       * @param perRetryTimeout The timeout for each retry attempt. 
       */
      public fun perRetryTimeout(perRetryTimeout: DurationProperty)

      /**
       * @param perRetryTimeout The timeout for each retry attempt. 
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("784c51a336be1296c387c22042f53a53c7d5122591c957b70ed9fd13eb1ca12a")
      public fun perRetryTimeout(perRetryTimeout: DurationProperty.Builder.() -> Unit)

      /**
       * @param tcpRetryEvents Specify a valid value.
       * The event occurs before any processing of a request has started and is encountered when the
       * upstream is temporarily or permanently unavailable.
       */
      public fun tcpRetryEvents(tcpRetryEvents: List<String>)

      /**
       * @param tcpRetryEvents Specify a valid value.
       * The event occurs before any processing of a request has started and is encountered when the
       * upstream is temporarily or permanently unavailable.
       */
      public fun tcpRetryEvents(vararg tcpRetryEvents: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.appmesh.CfnRoute.HttpRetryPolicyProperty.Builder =
          software.amazon.awscdk.services.appmesh.CfnRoute.HttpRetryPolicyProperty.builder()

      /**
       * @param httpRetryEvents Specify at least one of the following values.
       * * *server-error* – HTTP status codes 500, 501, 502, 503, 504, 505, 506, 507, 508, 510, and
       * 511
       * * *gateway-error* – HTTP status codes 502, 503, and 504
       * * *client-error* – HTTP status code 409
       * * *stream-error* – Retry on refused stream
       */
      override fun httpRetryEvents(httpRetryEvents: List<String>) {
        cdkBuilder.httpRetryEvents(httpRetryEvents)
      }

      /**
       * @param httpRetryEvents Specify at least one of the following values.
       * * *server-error* – HTTP status codes 500, 501, 502, 503, 504, 505, 506, 507, 508, 510, and
       * 511
       * * *gateway-error* – HTTP status codes 502, 503, and 504
       * * *client-error* – HTTP status code 409
       * * *stream-error* – Retry on refused stream
       */
      override fun httpRetryEvents(vararg httpRetryEvents: String): Unit =
          httpRetryEvents(httpRetryEvents.toList())

      /**
       * @param maxRetries The maximum number of retry attempts. 
       */
      override fun maxRetries(maxRetries: Number) {
        cdkBuilder.maxRetries(maxRetries)
      }

      /**
       * @param perRetryTimeout The timeout for each retry attempt. 
       */
      override fun perRetryTimeout(perRetryTimeout: IResolvable) {
        cdkBuilder.perRetryTimeout(perRetryTimeout.let(IResolvable::unwrap))
      }

      /**
       * @param perRetryTimeout The timeout for each retry attempt. 
       */
      override fun perRetryTimeout(perRetryTimeout: DurationProperty) {
        cdkBuilder.perRetryTimeout(perRetryTimeout.let(DurationProperty::unwrap))
      }

      /**
       * @param perRetryTimeout The timeout for each retry attempt. 
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("784c51a336be1296c387c22042f53a53c7d5122591c957b70ed9fd13eb1ca12a")
      override fun perRetryTimeout(perRetryTimeout: DurationProperty.Builder.() -> Unit): Unit =
          perRetryTimeout(DurationProperty(perRetryTimeout))

      /**
       * @param tcpRetryEvents Specify a valid value.
       * The event occurs before any processing of a request has started and is encountered when the
       * upstream is temporarily or permanently unavailable.
       */
      override fun tcpRetryEvents(tcpRetryEvents: List<String>) {
        cdkBuilder.tcpRetryEvents(tcpRetryEvents)
      }

      /**
       * @param tcpRetryEvents Specify a valid value.
       * The event occurs before any processing of a request has started and is encountered when the
       * upstream is temporarily or permanently unavailable.
       */
      override fun tcpRetryEvents(vararg tcpRetryEvents: String): Unit =
          tcpRetryEvents(tcpRetryEvents.toList())

      public fun build(): software.amazon.awscdk.services.appmesh.CfnRoute.HttpRetryPolicyProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.appmesh.CfnRoute.HttpRetryPolicyProperty,
    ) : CdkObject(cdkObject), HttpRetryPolicyProperty {
      /**
       * Specify at least one of the following values.
       *
       * * *server-error* – HTTP status codes 500, 501, 502, 503, 504, 505, 506, 507, 508, 510, and
       * 511
       * * *gateway-error* – HTTP status codes 502, 503, and 504
       * * *client-error* – HTTP status code 409
       * * *stream-error* – Retry on refused stream
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-route-httpretrypolicy.html#cfn-appmesh-route-httpretrypolicy-httpretryevents)
       */
      override fun httpRetryEvents(): List<String> = unwrap(this).getHttpRetryEvents() ?:
          emptyList()

      /**
       * The maximum number of retry attempts.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-route-httpretrypolicy.html#cfn-appmesh-route-httpretrypolicy-maxretries)
       */
      override fun maxRetries(): Number = unwrap(this).getMaxRetries()

      /**
       * The timeout for each retry attempt.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-route-httpretrypolicy.html#cfn-appmesh-route-httpretrypolicy-perretrytimeout)
       */
      override fun perRetryTimeout(): Any = unwrap(this).getPerRetryTimeout()

      /**
       * Specify a valid value.
       *
       * The event occurs before any processing of a request has started and is encountered when the
       * upstream is temporarily or permanently unavailable.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-route-httpretrypolicy.html#cfn-appmesh-route-httpretrypolicy-tcpretryevents)
       */
      override fun tcpRetryEvents(): List<String> = unwrap(this).getTcpRetryEvents() ?: emptyList()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): HttpRetryPolicyProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.appmesh.CfnRoute.HttpRetryPolicyProperty):
          HttpRetryPolicyProperty = CdkObjectWrappers.wrap(cdkObject) as HttpRetryPolicyProperty

      internal fun unwrap(wrapped: HttpRetryPolicyProperty):
          software.amazon.awscdk.services.appmesh.CfnRoute.HttpRetryPolicyProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.appmesh.CfnRoute.HttpRetryPolicyProperty
    }
  }

  /**
   * An object that represents the match method.
   *
   * Specify one of the match values.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.appmesh.*;
   * GrpcRouteMetadataMatchMethodProperty grpcRouteMetadataMatchMethodProperty =
   * GrpcRouteMetadataMatchMethodProperty.builder()
   * .exact("exact")
   * .prefix("prefix")
   * .range(MatchRangeProperty.builder()
   * .end(123)
   * .start(123)
   * .build())
   * .regex("regex")
   * .suffix("suffix")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-route-grpcroutemetadatamatchmethod.html)
   */
  public interface GrpcRouteMetadataMatchMethodProperty {
    /**
     * The value sent by the client must match the specified value exactly.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-route-grpcroutemetadatamatchmethod.html#cfn-appmesh-route-grpcroutemetadatamatchmethod-exact)
     */
    public fun exact(): String? = unwrap(this).getExact()

    /**
     * The value sent by the client must begin with the specified characters.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-route-grpcroutemetadatamatchmethod.html#cfn-appmesh-route-grpcroutemetadatamatchmethod-prefix)
     */
    public fun prefix(): String? = unwrap(this).getPrefix()

    /**
     * An object that represents the range of values to match on.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-route-grpcroutemetadatamatchmethod.html#cfn-appmesh-route-grpcroutemetadatamatchmethod-range)
     */
    public fun range(): Any? = unwrap(this).getRange()

    /**
     * The value sent by the client must include the specified characters.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-route-grpcroutemetadatamatchmethod.html#cfn-appmesh-route-grpcroutemetadatamatchmethod-regex)
     */
    public fun regex(): String? = unwrap(this).getRegex()

    /**
     * The value sent by the client must end with the specified characters.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-route-grpcroutemetadatamatchmethod.html#cfn-appmesh-route-grpcroutemetadatamatchmethod-suffix)
     */
    public fun suffix(): String? = unwrap(this).getSuffix()

    /**
     * A builder for [GrpcRouteMetadataMatchMethodProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param exact The value sent by the client must match the specified value exactly.
       */
      public fun exact(exact: String)

      /**
       * @param prefix The value sent by the client must begin with the specified characters.
       */
      public fun prefix(prefix: String)

      /**
       * @param range An object that represents the range of values to match on.
       */
      public fun range(range: IResolvable)

      /**
       * @param range An object that represents the range of values to match on.
       */
      public fun range(range: MatchRangeProperty)

      /**
       * @param range An object that represents the range of values to match on.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("618ca50b7f60d9a6e27b7d7af0585371cbc8ac043e9f2cea2692993a2ab5c8b9")
      public fun range(range: MatchRangeProperty.Builder.() -> Unit)

      /**
       * @param regex The value sent by the client must include the specified characters.
       */
      public fun regex(regex: String)

      /**
       * @param suffix The value sent by the client must end with the specified characters.
       */
      public fun suffix(suffix: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.appmesh.CfnRoute.GrpcRouteMetadataMatchMethodProperty.Builder
          =
          software.amazon.awscdk.services.appmesh.CfnRoute.GrpcRouteMetadataMatchMethodProperty.builder()

      /**
       * @param exact The value sent by the client must match the specified value exactly.
       */
      override fun exact(exact: String) {
        cdkBuilder.exact(exact)
      }

      /**
       * @param prefix The value sent by the client must begin with the specified characters.
       */
      override fun prefix(prefix: String) {
        cdkBuilder.prefix(prefix)
      }

      /**
       * @param range An object that represents the range of values to match on.
       */
      override fun range(range: IResolvable) {
        cdkBuilder.range(range.let(IResolvable::unwrap))
      }

      /**
       * @param range An object that represents the range of values to match on.
       */
      override fun range(range: MatchRangeProperty) {
        cdkBuilder.range(range.let(MatchRangeProperty::unwrap))
      }

      /**
       * @param range An object that represents the range of values to match on.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("618ca50b7f60d9a6e27b7d7af0585371cbc8ac043e9f2cea2692993a2ab5c8b9")
      override fun range(range: MatchRangeProperty.Builder.() -> Unit): Unit =
          range(MatchRangeProperty(range))

      /**
       * @param regex The value sent by the client must include the specified characters.
       */
      override fun regex(regex: String) {
        cdkBuilder.regex(regex)
      }

      /**
       * @param suffix The value sent by the client must end with the specified characters.
       */
      override fun suffix(suffix: String) {
        cdkBuilder.suffix(suffix)
      }

      public fun build():
          software.amazon.awscdk.services.appmesh.CfnRoute.GrpcRouteMetadataMatchMethodProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.appmesh.CfnRoute.GrpcRouteMetadataMatchMethodProperty,
    ) : CdkObject(cdkObject), GrpcRouteMetadataMatchMethodProperty {
      /**
       * The value sent by the client must match the specified value exactly.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-route-grpcroutemetadatamatchmethod.html#cfn-appmesh-route-grpcroutemetadatamatchmethod-exact)
       */
      override fun exact(): String? = unwrap(this).getExact()

      /**
       * The value sent by the client must begin with the specified characters.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-route-grpcroutemetadatamatchmethod.html#cfn-appmesh-route-grpcroutemetadatamatchmethod-prefix)
       */
      override fun prefix(): String? = unwrap(this).getPrefix()

      /**
       * An object that represents the range of values to match on.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-route-grpcroutemetadatamatchmethod.html#cfn-appmesh-route-grpcroutemetadatamatchmethod-range)
       */
      override fun range(): Any? = unwrap(this).getRange()

      /**
       * The value sent by the client must include the specified characters.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-route-grpcroutemetadatamatchmethod.html#cfn-appmesh-route-grpcroutemetadatamatchmethod-regex)
       */
      override fun regex(): String? = unwrap(this).getRegex()

      /**
       * The value sent by the client must end with the specified characters.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-route-grpcroutemetadatamatchmethod.html#cfn-appmesh-route-grpcroutemetadatamatchmethod-suffix)
       */
      override fun suffix(): String? = unwrap(this).getSuffix()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          GrpcRouteMetadataMatchMethodProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.appmesh.CfnRoute.GrpcRouteMetadataMatchMethodProperty):
          GrpcRouteMetadataMatchMethodProperty = CdkObjectWrappers.wrap(cdkObject) as
          GrpcRouteMetadataMatchMethodProperty

      internal fun unwrap(wrapped: GrpcRouteMetadataMatchMethodProperty):
          software.amazon.awscdk.services.appmesh.CfnRoute.GrpcRouteMetadataMatchMethodProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.appmesh.CfnRoute.GrpcRouteMetadataMatchMethodProperty
    }
  }

  /**
   * An object that represents a target and its relative weight.
   *
   * Traffic is distributed across targets according to their relative weight. For example, a
   * weighted target with a relative weight of 50 receives five times as much traffic as one with a
   * relative weight of 10. The total weight for all targets combined must be less than or equal to
   * 100.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.appmesh.*;
   * WeightedTargetProperty weightedTargetProperty = WeightedTargetProperty.builder()
   * .virtualNode("virtualNode")
   * .weight(123)
   * // the properties below are optional
   * .port(123)
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-route-weightedtarget.html)
   */
  public interface WeightedTargetProperty {
    /**
     * The targeted port of the weighted object.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-route-weightedtarget.html#cfn-appmesh-route-weightedtarget-port)
     */
    public fun port(): Number? = unwrap(this).getPort()

    /**
     * The virtual node to associate with the weighted target.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-route-weightedtarget.html#cfn-appmesh-route-weightedtarget-virtualnode)
     */
    public fun virtualNode(): String

    /**
     * The relative weight of the weighted target.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-route-weightedtarget.html#cfn-appmesh-route-weightedtarget-weight)
     */
    public fun weight(): Number

    /**
     * A builder for [WeightedTargetProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param port The targeted port of the weighted object.
       */
      public fun port(port: Number)

      /**
       * @param virtualNode The virtual node to associate with the weighted target. 
       */
      public fun virtualNode(virtualNode: String)

      /**
       * @param weight The relative weight of the weighted target. 
       */
      public fun weight(weight: Number)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.appmesh.CfnRoute.WeightedTargetProperty.Builder =
          software.amazon.awscdk.services.appmesh.CfnRoute.WeightedTargetProperty.builder()

      /**
       * @param port The targeted port of the weighted object.
       */
      override fun port(port: Number) {
        cdkBuilder.port(port)
      }

      /**
       * @param virtualNode The virtual node to associate with the weighted target. 
       */
      override fun virtualNode(virtualNode: String) {
        cdkBuilder.virtualNode(virtualNode)
      }

      /**
       * @param weight The relative weight of the weighted target. 
       */
      override fun weight(weight: Number) {
        cdkBuilder.weight(weight)
      }

      public fun build(): software.amazon.awscdk.services.appmesh.CfnRoute.WeightedTargetProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.appmesh.CfnRoute.WeightedTargetProperty,
    ) : CdkObject(cdkObject), WeightedTargetProperty {
      /**
       * The targeted port of the weighted object.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-route-weightedtarget.html#cfn-appmesh-route-weightedtarget-port)
       */
      override fun port(): Number? = unwrap(this).getPort()

      /**
       * The virtual node to associate with the weighted target.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-route-weightedtarget.html#cfn-appmesh-route-weightedtarget-virtualnode)
       */
      override fun virtualNode(): String = unwrap(this).getVirtualNode()

      /**
       * The relative weight of the weighted target.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-route-weightedtarget.html#cfn-appmesh-route-weightedtarget-weight)
       */
      override fun weight(): Number = unwrap(this).getWeight()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): WeightedTargetProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.appmesh.CfnRoute.WeightedTargetProperty):
          WeightedTargetProperty = CdkObjectWrappers.wrap(cdkObject) as WeightedTargetProperty

      internal fun unwrap(wrapped: WeightedTargetProperty):
          software.amazon.awscdk.services.appmesh.CfnRoute.WeightedTargetProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.appmesh.CfnRoute.WeightedTargetProperty
    }
  }

  /**
   * An object that represents the query parameter in the request.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.appmesh.*;
   * QueryParameterProperty queryParameterProperty = QueryParameterProperty.builder()
   * .name("name")
   * // the properties below are optional
   * .match(HttpQueryParameterMatchProperty.builder()
   * .exact("exact")
   * .build())
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-route-queryparameter.html)
   */
  public interface QueryParameterProperty {
    /**
     * The query parameter to match on.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-route-queryparameter.html#cfn-appmesh-route-queryparameter-match)
     */
    public fun match(): Any? = unwrap(this).getMatch()

    /**
     * A name for the query parameter that will be matched on.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-route-queryparameter.html#cfn-appmesh-route-queryparameter-name)
     */
    public fun name(): String

    /**
     * A builder for [QueryParameterProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param match The query parameter to match on.
       */
      public fun match(match: IResolvable)

      /**
       * @param match The query parameter to match on.
       */
      public fun match(match: HttpQueryParameterMatchProperty)

      /**
       * @param match The query parameter to match on.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("54a474d5592f6d7ce5e6ea7ce9c611ebed2dd706b95c36442ae3dd2c5865ea5d")
      public fun match(match: HttpQueryParameterMatchProperty.Builder.() -> Unit)

      /**
       * @param name A name for the query parameter that will be matched on. 
       */
      public fun name(name: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.appmesh.CfnRoute.QueryParameterProperty.Builder =
          software.amazon.awscdk.services.appmesh.CfnRoute.QueryParameterProperty.builder()

      /**
       * @param match The query parameter to match on.
       */
      override fun match(match: IResolvable) {
        cdkBuilder.match(match.let(IResolvable::unwrap))
      }

      /**
       * @param match The query parameter to match on.
       */
      override fun match(match: HttpQueryParameterMatchProperty) {
        cdkBuilder.match(match.let(HttpQueryParameterMatchProperty::unwrap))
      }

      /**
       * @param match The query parameter to match on.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("54a474d5592f6d7ce5e6ea7ce9c611ebed2dd706b95c36442ae3dd2c5865ea5d")
      override fun match(match: HttpQueryParameterMatchProperty.Builder.() -> Unit): Unit =
          match(HttpQueryParameterMatchProperty(match))

      /**
       * @param name A name for the query parameter that will be matched on. 
       */
      override fun name(name: String) {
        cdkBuilder.name(name)
      }

      public fun build(): software.amazon.awscdk.services.appmesh.CfnRoute.QueryParameterProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.appmesh.CfnRoute.QueryParameterProperty,
    ) : CdkObject(cdkObject), QueryParameterProperty {
      /**
       * The query parameter to match on.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-route-queryparameter.html#cfn-appmesh-route-queryparameter-match)
       */
      override fun match(): Any? = unwrap(this).getMatch()

      /**
       * A name for the query parameter that will be matched on.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-route-queryparameter.html#cfn-appmesh-route-queryparameter-name)
       */
      override fun name(): String = unwrap(this).getName()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): QueryParameterProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.appmesh.CfnRoute.QueryParameterProperty):
          QueryParameterProperty = CdkObjectWrappers.wrap(cdkObject) as QueryParameterProperty

      internal fun unwrap(wrapped: QueryParameterProperty):
          software.amazon.awscdk.services.appmesh.CfnRoute.QueryParameterProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.appmesh.CfnRoute.QueryParameterProperty
    }
  }

  /**
   * An object that represents an HTTP or HTTP/2 route type.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.appmesh.*;
   * HttpRouteProperty httpRouteProperty = HttpRouteProperty.builder()
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
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-route-httproute.html)
   */
  public interface HttpRouteProperty {
    /**
     * An object that represents the action to take if a match is determined.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-route-httproute.html#cfn-appmesh-route-httproute-action)
     */
    public fun action(): Any

    /**
     * An object that represents the criteria for determining a request match.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-route-httproute.html#cfn-appmesh-route-httproute-match)
     */
    public fun match(): Any

    /**
     * An object that represents a retry policy.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-route-httproute.html#cfn-appmesh-route-httproute-retrypolicy)
     */
    public fun retryPolicy(): Any? = unwrap(this).getRetryPolicy()

    /**
     * An object that represents types of timeouts.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-route-httproute.html#cfn-appmesh-route-httproute-timeout)
     */
    public fun timeout(): Any? = unwrap(this).getTimeout()

    /**
     * A builder for [HttpRouteProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param action An object that represents the action to take if a match is determined. 
       */
      public fun action(action: IResolvable)

      /**
       * @param action An object that represents the action to take if a match is determined. 
       */
      public fun action(action: HttpRouteActionProperty)

      /**
       * @param action An object that represents the action to take if a match is determined. 
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("8dfd294369a3aa58c38d45ef30d12b4e4343acb29bd29d257a3991b2f675feab")
      public fun action(action: HttpRouteActionProperty.Builder.() -> Unit)

      /**
       * @param match An object that represents the criteria for determining a request match. 
       */
      public fun match(match: IResolvable)

      /**
       * @param match An object that represents the criteria for determining a request match. 
       */
      public fun match(match: HttpRouteMatchProperty)

      /**
       * @param match An object that represents the criteria for determining a request match. 
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("8af0e70e5cbd57e3fea91410cadfaf6f8d85e0f422b840d2a93900146a2b327a")
      public fun match(match: HttpRouteMatchProperty.Builder.() -> Unit)

      /**
       * @param retryPolicy An object that represents a retry policy.
       */
      public fun retryPolicy(retryPolicy: IResolvable)

      /**
       * @param retryPolicy An object that represents a retry policy.
       */
      public fun retryPolicy(retryPolicy: HttpRetryPolicyProperty)

      /**
       * @param retryPolicy An object that represents a retry policy.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("2ccf4635c876a872e5a0297bfa9b4a5781a8a090451a691fe9d1bc3883b4f790")
      public fun retryPolicy(retryPolicy: HttpRetryPolicyProperty.Builder.() -> Unit)

      /**
       * @param timeout An object that represents types of timeouts.
       */
      public fun timeout(timeout: IResolvable)

      /**
       * @param timeout An object that represents types of timeouts.
       */
      public fun timeout(timeout: HttpTimeoutProperty)

      /**
       * @param timeout An object that represents types of timeouts.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("6794853ce597e6d6113e7169abe7272f9423ca3b3d195a0d98848bf77a32fd9c")
      public fun timeout(timeout: HttpTimeoutProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.appmesh.CfnRoute.HttpRouteProperty.Builder =
          software.amazon.awscdk.services.appmesh.CfnRoute.HttpRouteProperty.builder()

      /**
       * @param action An object that represents the action to take if a match is determined. 
       */
      override fun action(action: IResolvable) {
        cdkBuilder.action(action.let(IResolvable::unwrap))
      }

      /**
       * @param action An object that represents the action to take if a match is determined. 
       */
      override fun action(action: HttpRouteActionProperty) {
        cdkBuilder.action(action.let(HttpRouteActionProperty::unwrap))
      }

      /**
       * @param action An object that represents the action to take if a match is determined. 
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("8dfd294369a3aa58c38d45ef30d12b4e4343acb29bd29d257a3991b2f675feab")
      override fun action(action: HttpRouteActionProperty.Builder.() -> Unit): Unit =
          action(HttpRouteActionProperty(action))

      /**
       * @param match An object that represents the criteria for determining a request match. 
       */
      override fun match(match: IResolvable) {
        cdkBuilder.match(match.let(IResolvable::unwrap))
      }

      /**
       * @param match An object that represents the criteria for determining a request match. 
       */
      override fun match(match: HttpRouteMatchProperty) {
        cdkBuilder.match(match.let(HttpRouteMatchProperty::unwrap))
      }

      /**
       * @param match An object that represents the criteria for determining a request match. 
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("8af0e70e5cbd57e3fea91410cadfaf6f8d85e0f422b840d2a93900146a2b327a")
      override fun match(match: HttpRouteMatchProperty.Builder.() -> Unit): Unit =
          match(HttpRouteMatchProperty(match))

      /**
       * @param retryPolicy An object that represents a retry policy.
       */
      override fun retryPolicy(retryPolicy: IResolvable) {
        cdkBuilder.retryPolicy(retryPolicy.let(IResolvable::unwrap))
      }

      /**
       * @param retryPolicy An object that represents a retry policy.
       */
      override fun retryPolicy(retryPolicy: HttpRetryPolicyProperty) {
        cdkBuilder.retryPolicy(retryPolicy.let(HttpRetryPolicyProperty::unwrap))
      }

      /**
       * @param retryPolicy An object that represents a retry policy.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("2ccf4635c876a872e5a0297bfa9b4a5781a8a090451a691fe9d1bc3883b4f790")
      override fun retryPolicy(retryPolicy: HttpRetryPolicyProperty.Builder.() -> Unit): Unit =
          retryPolicy(HttpRetryPolicyProperty(retryPolicy))

      /**
       * @param timeout An object that represents types of timeouts.
       */
      override fun timeout(timeout: IResolvable) {
        cdkBuilder.timeout(timeout.let(IResolvable::unwrap))
      }

      /**
       * @param timeout An object that represents types of timeouts.
       */
      override fun timeout(timeout: HttpTimeoutProperty) {
        cdkBuilder.timeout(timeout.let(HttpTimeoutProperty::unwrap))
      }

      /**
       * @param timeout An object that represents types of timeouts.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("6794853ce597e6d6113e7169abe7272f9423ca3b3d195a0d98848bf77a32fd9c")
      override fun timeout(timeout: HttpTimeoutProperty.Builder.() -> Unit): Unit =
          timeout(HttpTimeoutProperty(timeout))

      public fun build(): software.amazon.awscdk.services.appmesh.CfnRoute.HttpRouteProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject: software.amazon.awscdk.services.appmesh.CfnRoute.HttpRouteProperty,
    ) : CdkObject(cdkObject), HttpRouteProperty {
      /**
       * An object that represents the action to take if a match is determined.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-route-httproute.html#cfn-appmesh-route-httproute-action)
       */
      override fun action(): Any = unwrap(this).getAction()

      /**
       * An object that represents the criteria for determining a request match.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-route-httproute.html#cfn-appmesh-route-httproute-match)
       */
      override fun match(): Any = unwrap(this).getMatch()

      /**
       * An object that represents a retry policy.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-route-httproute.html#cfn-appmesh-route-httproute-retrypolicy)
       */
      override fun retryPolicy(): Any? = unwrap(this).getRetryPolicy()

      /**
       * An object that represents types of timeouts.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-route-httproute.html#cfn-appmesh-route-httproute-timeout)
       */
      override fun timeout(): Any? = unwrap(this).getTimeout()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): HttpRouteProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.appmesh.CfnRoute.HttpRouteProperty):
          HttpRouteProperty = CdkObjectWrappers.wrap(cdkObject) as HttpRouteProperty

      internal fun unwrap(wrapped: HttpRouteProperty):
          software.amazon.awscdk.services.appmesh.CfnRoute.HttpRouteProperty = (wrapped as
          CdkObject).cdkObject as software.amazon.awscdk.services.appmesh.CfnRoute.HttpRouteProperty
    }
  }

  /**
   * An object that represents the match metadata for the route.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.appmesh.*;
   * GrpcRouteMetadataProperty grpcRouteMetadataProperty = GrpcRouteMetadataProperty.builder()
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
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-route-grpcroutemetadata.html)
   */
  public interface GrpcRouteMetadataProperty {
    /**
     * Specify `True` to match anything except the match criteria.
     *
     * The default value is `False` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-route-grpcroutemetadata.html#cfn-appmesh-route-grpcroutemetadata-invert)
     */
    public fun invert(): Any? = unwrap(this).getInvert()

    /**
     * An object that represents the data to match from the request.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-route-grpcroutemetadata.html#cfn-appmesh-route-grpcroutemetadata-match)
     */
    public fun match(): Any? = unwrap(this).getMatch()

    /**
     * The name of the route.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-route-grpcroutemetadata.html#cfn-appmesh-route-grpcroutemetadata-name)
     */
    public fun name(): String

    /**
     * A builder for [GrpcRouteMetadataProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param invert Specify `True` to match anything except the match criteria.
       * The default value is `False` .
       */
      public fun invert(invert: Boolean)

      /**
       * @param invert Specify `True` to match anything except the match criteria.
       * The default value is `False` .
       */
      public fun invert(invert: IResolvable)

      /**
       * @param match An object that represents the data to match from the request.
       */
      public fun match(match: IResolvable)

      /**
       * @param match An object that represents the data to match from the request.
       */
      public fun match(match: GrpcRouteMetadataMatchMethodProperty)

      /**
       * @param match An object that represents the data to match from the request.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("d36445f7b17779f42c1279fbfb47636c8e19441c8a5da343ec1a77f719f5d7b6")
      public fun match(match: GrpcRouteMetadataMatchMethodProperty.Builder.() -> Unit)

      /**
       * @param name The name of the route. 
       */
      public fun name(name: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.appmesh.CfnRoute.GrpcRouteMetadataProperty.Builder =
          software.amazon.awscdk.services.appmesh.CfnRoute.GrpcRouteMetadataProperty.builder()

      /**
       * @param invert Specify `True` to match anything except the match criteria.
       * The default value is `False` .
       */
      override fun invert(invert: Boolean) {
        cdkBuilder.invert(invert)
      }

      /**
       * @param invert Specify `True` to match anything except the match criteria.
       * The default value is `False` .
       */
      override fun invert(invert: IResolvable) {
        cdkBuilder.invert(invert.let(IResolvable::unwrap))
      }

      /**
       * @param match An object that represents the data to match from the request.
       */
      override fun match(match: IResolvable) {
        cdkBuilder.match(match.let(IResolvable::unwrap))
      }

      /**
       * @param match An object that represents the data to match from the request.
       */
      override fun match(match: GrpcRouteMetadataMatchMethodProperty) {
        cdkBuilder.match(match.let(GrpcRouteMetadataMatchMethodProperty::unwrap))
      }

      /**
       * @param match An object that represents the data to match from the request.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("d36445f7b17779f42c1279fbfb47636c8e19441c8a5da343ec1a77f719f5d7b6")
      override fun match(match: GrpcRouteMetadataMatchMethodProperty.Builder.() -> Unit): Unit =
          match(GrpcRouteMetadataMatchMethodProperty(match))

      /**
       * @param name The name of the route. 
       */
      override fun name(name: String) {
        cdkBuilder.name(name)
      }

      public fun build(): software.amazon.awscdk.services.appmesh.CfnRoute.GrpcRouteMetadataProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.appmesh.CfnRoute.GrpcRouteMetadataProperty,
    ) : CdkObject(cdkObject), GrpcRouteMetadataProperty {
      /**
       * Specify `True` to match anything except the match criteria.
       *
       * The default value is `False` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-route-grpcroutemetadata.html#cfn-appmesh-route-grpcroutemetadata-invert)
       */
      override fun invert(): Any? = unwrap(this).getInvert()

      /**
       * An object that represents the data to match from the request.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-route-grpcroutemetadata.html#cfn-appmesh-route-grpcroutemetadata-match)
       */
      override fun match(): Any? = unwrap(this).getMatch()

      /**
       * The name of the route.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-route-grpcroutemetadata.html#cfn-appmesh-route-grpcroutemetadata-name)
       */
      override fun name(): String = unwrap(this).getName()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): GrpcRouteMetadataProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.appmesh.CfnRoute.GrpcRouteMetadataProperty):
          GrpcRouteMetadataProperty = CdkObjectWrappers.wrap(cdkObject) as GrpcRouteMetadataProperty

      internal fun unwrap(wrapped: GrpcRouteMetadataProperty):
          software.amazon.awscdk.services.appmesh.CfnRoute.GrpcRouteMetadataProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.appmesh.CfnRoute.GrpcRouteMetadataProperty
    }
  }

  /**
   * An object that represents the criteria for determining a request match.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.appmesh.*;
   * GrpcRouteMatchProperty grpcRouteMatchProperty = GrpcRouteMatchProperty.builder()
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
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-route-grpcroutematch.html)
   */
  public interface GrpcRouteMatchProperty {
    /**
     * An object that represents the data to match from the request.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-route-grpcroutematch.html#cfn-appmesh-route-grpcroutematch-metadata)
     */
    public fun metadata(): Any? = unwrap(this).getMetadata()

    /**
     * The method name to match from the request.
     *
     * If you specify a name, you must also specify a `serviceName` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-route-grpcroutematch.html#cfn-appmesh-route-grpcroutematch-methodname)
     */
    public fun methodName(): String? = unwrap(this).getMethodName()

    /**
     * The port number to match on.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-route-grpcroutematch.html#cfn-appmesh-route-grpcroutematch-port)
     */
    public fun port(): Number? = unwrap(this).getPort()

    /**
     * The fully qualified domain name for the service to match from the request.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-route-grpcroutematch.html#cfn-appmesh-route-grpcroutematch-servicename)
     */
    public fun serviceName(): String? = unwrap(this).getServiceName()

    /**
     * A builder for [GrpcRouteMatchProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param metadata An object that represents the data to match from the request.
       */
      public fun metadata(metadata: IResolvable)

      /**
       * @param metadata An object that represents the data to match from the request.
       */
      public fun metadata(metadata: List<Any>)

      /**
       * @param metadata An object that represents the data to match from the request.
       */
      public fun metadata(vararg metadata: Any)

      /**
       * @param methodName The method name to match from the request.
       * If you specify a name, you must also specify a `serviceName` .
       */
      public fun methodName(methodName: String)

      /**
       * @param port The port number to match on.
       */
      public fun port(port: Number)

      /**
       * @param serviceName The fully qualified domain name for the service to match from the
       * request.
       */
      public fun serviceName(serviceName: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.appmesh.CfnRoute.GrpcRouteMatchProperty.Builder =
          software.amazon.awscdk.services.appmesh.CfnRoute.GrpcRouteMatchProperty.builder()

      /**
       * @param metadata An object that represents the data to match from the request.
       */
      override fun metadata(metadata: IResolvable) {
        cdkBuilder.metadata(metadata.let(IResolvable::unwrap))
      }

      /**
       * @param metadata An object that represents the data to match from the request.
       */
      override fun metadata(metadata: List<Any>) {
        cdkBuilder.metadata(metadata)
      }

      /**
       * @param metadata An object that represents the data to match from the request.
       */
      override fun metadata(vararg metadata: Any): Unit = metadata(metadata.toList())

      /**
       * @param methodName The method name to match from the request.
       * If you specify a name, you must also specify a `serviceName` .
       */
      override fun methodName(methodName: String) {
        cdkBuilder.methodName(methodName)
      }

      /**
       * @param port The port number to match on.
       */
      override fun port(port: Number) {
        cdkBuilder.port(port)
      }

      /**
       * @param serviceName The fully qualified domain name for the service to match from the
       * request.
       */
      override fun serviceName(serviceName: String) {
        cdkBuilder.serviceName(serviceName)
      }

      public fun build(): software.amazon.awscdk.services.appmesh.CfnRoute.GrpcRouteMatchProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.appmesh.CfnRoute.GrpcRouteMatchProperty,
    ) : CdkObject(cdkObject), GrpcRouteMatchProperty {
      /**
       * An object that represents the data to match from the request.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-route-grpcroutematch.html#cfn-appmesh-route-grpcroutematch-metadata)
       */
      override fun metadata(): Any? = unwrap(this).getMetadata()

      /**
       * The method name to match from the request.
       *
       * If you specify a name, you must also specify a `serviceName` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-route-grpcroutematch.html#cfn-appmesh-route-grpcroutematch-methodname)
       */
      override fun methodName(): String? = unwrap(this).getMethodName()

      /**
       * The port number to match on.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-route-grpcroutematch.html#cfn-appmesh-route-grpcroutematch-port)
       */
      override fun port(): Number? = unwrap(this).getPort()

      /**
       * The fully qualified domain name for the service to match from the request.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-route-grpcroutematch.html#cfn-appmesh-route-grpcroutematch-servicename)
       */
      override fun serviceName(): String? = unwrap(this).getServiceName()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): GrpcRouteMatchProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.appmesh.CfnRoute.GrpcRouteMatchProperty):
          GrpcRouteMatchProperty = CdkObjectWrappers.wrap(cdkObject) as GrpcRouteMatchProperty

      internal fun unwrap(wrapped: GrpcRouteMatchProperty):
          software.amazon.awscdk.services.appmesh.CfnRoute.GrpcRouteMatchProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.appmesh.CfnRoute.GrpcRouteMatchProperty
    }
  }

  /**
   * An object that represents a duration of time.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.appmesh.*;
   * DurationProperty durationProperty = DurationProperty.builder()
   * .unit("unit")
   * .value(123)
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-route-duration.html)
   */
  public interface DurationProperty {
    /**
     * A unit of time.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-route-duration.html#cfn-appmesh-route-duration-unit)
     */
    public fun unit(): String

    /**
     * A number of time units.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-route-duration.html#cfn-appmesh-route-duration-value)
     */
    public fun `value`(): Number

    /**
     * A builder for [DurationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param unit A unit of time. 
       */
      public fun unit(unit: String)

      /**
       * @param value A number of time units. 
       */
      public fun `value`(`value`: Number)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.appmesh.CfnRoute.DurationProperty.Builder =
          software.amazon.awscdk.services.appmesh.CfnRoute.DurationProperty.builder()

      /**
       * @param unit A unit of time. 
       */
      override fun unit(unit: String) {
        cdkBuilder.unit(unit)
      }

      /**
       * @param value A number of time units. 
       */
      override fun `value`(`value`: Number) {
        cdkBuilder.`value`(`value`)
      }

      public fun build(): software.amazon.awscdk.services.appmesh.CfnRoute.DurationProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject: software.amazon.awscdk.services.appmesh.CfnRoute.DurationProperty,
    ) : CdkObject(cdkObject), DurationProperty {
      /**
       * A unit of time.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-route-duration.html#cfn-appmesh-route-duration-unit)
       */
      override fun unit(): String = unwrap(this).getUnit()

      /**
       * A number of time units.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-route-duration.html#cfn-appmesh-route-duration-value)
       */
      override fun `value`(): Number = unwrap(this).getValue()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): DurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.appmesh.CfnRoute.DurationProperty):
          DurationProperty = CdkObjectWrappers.wrap(cdkObject) as DurationProperty

      internal fun unwrap(wrapped: DurationProperty):
          software.amazon.awscdk.services.appmesh.CfnRoute.DurationProperty = (wrapped as
          CdkObject).cdkObject as software.amazon.awscdk.services.appmesh.CfnRoute.DurationProperty
    }
  }

  /**
   * An object that represents types of timeouts.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.appmesh.*;
   * HttpTimeoutProperty httpTimeoutProperty = HttpTimeoutProperty.builder()
   * .idle(DurationProperty.builder()
   * .unit("unit")
   * .value(123)
   * .build())
   * .perRequest(DurationProperty.builder()
   * .unit("unit")
   * .value(123)
   * .build())
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-route-httptimeout.html)
   */
  public interface HttpTimeoutProperty {
    /**
     * An object that represents an idle timeout.
     *
     * An idle timeout bounds the amount of time that a connection may be idle. The default value is
     * none.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-route-httptimeout.html#cfn-appmesh-route-httptimeout-idle)
     */
    public fun idle(): Any? = unwrap(this).getIdle()

    /**
     * An object that represents a per request timeout.
     *
     * The default value is 15 seconds. If you set a higher timeout, then make sure that the higher
     * value is set for each App Mesh resource in a conversation. For example, if a virtual node
     * backend uses a virtual router provider to route to another virtual node, then the timeout should
     * be greater than 15 seconds for the source and destination virtual node and the route.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-route-httptimeout.html#cfn-appmesh-route-httptimeout-perrequest)
     */
    public fun perRequest(): Any? = unwrap(this).getPerRequest()

    /**
     * A builder for [HttpTimeoutProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param idle An object that represents an idle timeout.
       * An idle timeout bounds the amount of time that a connection may be idle. The default value
       * is none.
       */
      public fun idle(idle: IResolvable)

      /**
       * @param idle An object that represents an idle timeout.
       * An idle timeout bounds the amount of time that a connection may be idle. The default value
       * is none.
       */
      public fun idle(idle: DurationProperty)

      /**
       * @param idle An object that represents an idle timeout.
       * An idle timeout bounds the amount of time that a connection may be idle. The default value
       * is none.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("a80d6568c352c41a46becbc98cc29bd3837834a9c9855733dfd66bea9b834c26")
      public fun idle(idle: DurationProperty.Builder.() -> Unit)

      /**
       * @param perRequest An object that represents a per request timeout.
       * The default value is 15 seconds. If you set a higher timeout, then make sure that the
       * higher value is set for each App Mesh resource in a conversation. For example, if a virtual
       * node backend uses a virtual router provider to route to another virtual node, then the timeout
       * should be greater than 15 seconds for the source and destination virtual node and the route.
       */
      public fun perRequest(perRequest: IResolvable)

      /**
       * @param perRequest An object that represents a per request timeout.
       * The default value is 15 seconds. If you set a higher timeout, then make sure that the
       * higher value is set for each App Mesh resource in a conversation. For example, if a virtual
       * node backend uses a virtual router provider to route to another virtual node, then the timeout
       * should be greater than 15 seconds for the source and destination virtual node and the route.
       */
      public fun perRequest(perRequest: DurationProperty)

      /**
       * @param perRequest An object that represents a per request timeout.
       * The default value is 15 seconds. If you set a higher timeout, then make sure that the
       * higher value is set for each App Mesh resource in a conversation. For example, if a virtual
       * node backend uses a virtual router provider to route to another virtual node, then the timeout
       * should be greater than 15 seconds for the source and destination virtual node and the route.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("b83625a5d9cf26bfa8eece30847253209f9ca0475c29c3aa07ea94eab8463445")
      public fun perRequest(perRequest: DurationProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.appmesh.CfnRoute.HttpTimeoutProperty.Builder =
          software.amazon.awscdk.services.appmesh.CfnRoute.HttpTimeoutProperty.builder()

      /**
       * @param idle An object that represents an idle timeout.
       * An idle timeout bounds the amount of time that a connection may be idle. The default value
       * is none.
       */
      override fun idle(idle: IResolvable) {
        cdkBuilder.idle(idle.let(IResolvable::unwrap))
      }

      /**
       * @param idle An object that represents an idle timeout.
       * An idle timeout bounds the amount of time that a connection may be idle. The default value
       * is none.
       */
      override fun idle(idle: DurationProperty) {
        cdkBuilder.idle(idle.let(DurationProperty::unwrap))
      }

      /**
       * @param idle An object that represents an idle timeout.
       * An idle timeout bounds the amount of time that a connection may be idle. The default value
       * is none.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("a80d6568c352c41a46becbc98cc29bd3837834a9c9855733dfd66bea9b834c26")
      override fun idle(idle: DurationProperty.Builder.() -> Unit): Unit =
          idle(DurationProperty(idle))

      /**
       * @param perRequest An object that represents a per request timeout.
       * The default value is 15 seconds. If you set a higher timeout, then make sure that the
       * higher value is set for each App Mesh resource in a conversation. For example, if a virtual
       * node backend uses a virtual router provider to route to another virtual node, then the timeout
       * should be greater than 15 seconds for the source and destination virtual node and the route.
       */
      override fun perRequest(perRequest: IResolvable) {
        cdkBuilder.perRequest(perRequest.let(IResolvable::unwrap))
      }

      /**
       * @param perRequest An object that represents a per request timeout.
       * The default value is 15 seconds. If you set a higher timeout, then make sure that the
       * higher value is set for each App Mesh resource in a conversation. For example, if a virtual
       * node backend uses a virtual router provider to route to another virtual node, then the timeout
       * should be greater than 15 seconds for the source and destination virtual node and the route.
       */
      override fun perRequest(perRequest: DurationProperty) {
        cdkBuilder.perRequest(perRequest.let(DurationProperty::unwrap))
      }

      /**
       * @param perRequest An object that represents a per request timeout.
       * The default value is 15 seconds. If you set a higher timeout, then make sure that the
       * higher value is set for each App Mesh resource in a conversation. For example, if a virtual
       * node backend uses a virtual router provider to route to another virtual node, then the timeout
       * should be greater than 15 seconds for the source and destination virtual node and the route.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("b83625a5d9cf26bfa8eece30847253209f9ca0475c29c3aa07ea94eab8463445")
      override fun perRequest(perRequest: DurationProperty.Builder.() -> Unit): Unit =
          perRequest(DurationProperty(perRequest))

      public fun build(): software.amazon.awscdk.services.appmesh.CfnRoute.HttpTimeoutProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject: software.amazon.awscdk.services.appmesh.CfnRoute.HttpTimeoutProperty,
    ) : CdkObject(cdkObject), HttpTimeoutProperty {
      /**
       * An object that represents an idle timeout.
       *
       * An idle timeout bounds the amount of time that a connection may be idle. The default value
       * is none.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-route-httptimeout.html#cfn-appmesh-route-httptimeout-idle)
       */
      override fun idle(): Any? = unwrap(this).getIdle()

      /**
       * An object that represents a per request timeout.
       *
       * The default value is 15 seconds. If you set a higher timeout, then make sure that the
       * higher value is set for each App Mesh resource in a conversation. For example, if a virtual
       * node backend uses a virtual router provider to route to another virtual node, then the timeout
       * should be greater than 15 seconds for the source and destination virtual node and the route.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-route-httptimeout.html#cfn-appmesh-route-httptimeout-perrequest)
       */
      override fun perRequest(): Any? = unwrap(this).getPerRequest()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): HttpTimeoutProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.appmesh.CfnRoute.HttpTimeoutProperty):
          HttpTimeoutProperty = CdkObjectWrappers.wrap(cdkObject) as HttpTimeoutProperty

      internal fun unwrap(wrapped: HttpTimeoutProperty):
          software.amazon.awscdk.services.appmesh.CfnRoute.HttpTimeoutProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.appmesh.CfnRoute.HttpTimeoutProperty
    }
  }
}
