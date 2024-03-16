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
 * Creates a gateway route.
 *
 * A gateway route is attached to a virtual gateway and routes traffic to an existing virtual
 * service. If a route matches a request, it can distribute traffic to a target virtual service.
 *
 * For more information about gateway routes, see [Gateway
 * routes](https://docs.aws.amazon.com/app-mesh/latest/userguide/gateway-routes.html) .
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.appmesh.*;
 * CfnGatewayRoute cfnGatewayRoute = CfnGatewayRoute.Builder.create(this, "MyCfnGatewayRoute")
 * .meshName("meshName")
 * .spec(GatewayRouteSpecProperty.builder()
 * .grpcRoute(GrpcGatewayRouteProperty.builder()
 * .action(GrpcGatewayRouteActionProperty.builder()
 * .target(GatewayRouteTargetProperty.builder()
 * .virtualService(GatewayRouteVirtualServiceProperty.builder()
 * .virtualServiceName("virtualServiceName")
 * .build())
 * // the properties below are optional
 * .port(123)
 * .build())
 * // the properties below are optional
 * .rewrite(GrpcGatewayRouteRewriteProperty.builder()
 * .hostname(GatewayRouteHostnameRewriteProperty.builder()
 * .defaultTargetHostname("defaultTargetHostname")
 * .build())
 * .build())
 * .build())
 * .match(GrpcGatewayRouteMatchProperty.builder()
 * .hostname(GatewayRouteHostnameMatchProperty.builder()
 * .exact("exact")
 * .suffix("suffix")
 * .build())
 * .metadata(List.of(GrpcGatewayRouteMetadataProperty.builder()
 * .name("name")
 * // the properties below are optional
 * .invert(false)
 * .match(GatewayRouteMetadataMatchProperty.builder()
 * .exact("exact")
 * .prefix("prefix")
 * .range(GatewayRouteRangeMatchProperty.builder()
 * .end(123)
 * .start(123)
 * .build())
 * .regex("regex")
 * .suffix("suffix")
 * .build())
 * .build()))
 * .port(123)
 * .serviceName("serviceName")
 * .build())
 * .build())
 * .http2Route(HttpGatewayRouteProperty.builder()
 * .action(HttpGatewayRouteActionProperty.builder()
 * .target(GatewayRouteTargetProperty.builder()
 * .virtualService(GatewayRouteVirtualServiceProperty.builder()
 * .virtualServiceName("virtualServiceName")
 * .build())
 * // the properties below are optional
 * .port(123)
 * .build())
 * // the properties below are optional
 * .rewrite(HttpGatewayRouteRewriteProperty.builder()
 * .hostname(GatewayRouteHostnameRewriteProperty.builder()
 * .defaultTargetHostname("defaultTargetHostname")
 * .build())
 * .path(HttpGatewayRoutePathRewriteProperty.builder()
 * .exact("exact")
 * .build())
 * .prefix(HttpGatewayRoutePrefixRewriteProperty.builder()
 * .defaultPrefix("defaultPrefix")
 * .value("value")
 * .build())
 * .build())
 * .build())
 * .match(HttpGatewayRouteMatchProperty.builder()
 * .headers(List.of(HttpGatewayRouteHeaderProperty.builder()
 * .name("name")
 * // the properties below are optional
 * .invert(false)
 * .match(HttpGatewayRouteHeaderMatchProperty.builder()
 * .exact("exact")
 * .prefix("prefix")
 * .range(GatewayRouteRangeMatchProperty.builder()
 * .end(123)
 * .start(123)
 * .build())
 * .regex("regex")
 * .suffix("suffix")
 * .build())
 * .build()))
 * .hostname(GatewayRouteHostnameMatchProperty.builder()
 * .exact("exact")
 * .suffix("suffix")
 * .build())
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
 * .build())
 * .build())
 * .httpRoute(HttpGatewayRouteProperty.builder()
 * .action(HttpGatewayRouteActionProperty.builder()
 * .target(GatewayRouteTargetProperty.builder()
 * .virtualService(GatewayRouteVirtualServiceProperty.builder()
 * .virtualServiceName("virtualServiceName")
 * .build())
 * // the properties below are optional
 * .port(123)
 * .build())
 * // the properties below are optional
 * .rewrite(HttpGatewayRouteRewriteProperty.builder()
 * .hostname(GatewayRouteHostnameRewriteProperty.builder()
 * .defaultTargetHostname("defaultTargetHostname")
 * .build())
 * .path(HttpGatewayRoutePathRewriteProperty.builder()
 * .exact("exact")
 * .build())
 * .prefix(HttpGatewayRoutePrefixRewriteProperty.builder()
 * .defaultPrefix("defaultPrefix")
 * .value("value")
 * .build())
 * .build())
 * .build())
 * .match(HttpGatewayRouteMatchProperty.builder()
 * .headers(List.of(HttpGatewayRouteHeaderProperty.builder()
 * .name("name")
 * // the properties below are optional
 * .invert(false)
 * .match(HttpGatewayRouteHeaderMatchProperty.builder()
 * .exact("exact")
 * .prefix("prefix")
 * .range(GatewayRouteRangeMatchProperty.builder()
 * .end(123)
 * .start(123)
 * .build())
 * .regex("regex")
 * .suffix("suffix")
 * .build())
 * .build()))
 * .hostname(GatewayRouteHostnameMatchProperty.builder()
 * .exact("exact")
 * .suffix("suffix")
 * .build())
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
 * .build())
 * .build())
 * .priority(123)
 * .build())
 * .virtualGatewayName("virtualGatewayName")
 * // the properties below are optional
 * .gatewayRouteName("gatewayRouteName")
 * .meshOwner("meshOwner")
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appmesh-gatewayroute.html)
 */
public open class CfnGatewayRoute internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.appmesh.CfnGatewayRoute,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  /**
   * The full Amazon Resource Name (ARN) for the gateway route.
   */
  public open fun attrArn(): String = unwrap(this).getAttrArn()

  /**
   * The name of the gateway route.
   */
  public open fun attrGatewayRouteName(): String = unwrap(this).getAttrGatewayRouteName()

  /**
   *
   */
  public open fun attrId(): String = unwrap(this).getAttrId()

  /**
   * The name of the service mesh that the gateway route resides in.
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
   * The IAM account ID of the resource owner.
   *
   * If the account ID is not your own, then it's the ID of the mesh owner or of another account
   * that the mesh is shared with. For more information about mesh sharing, see [Working with Shared
   * Meshes](https://docs.aws.amazon.com/app-mesh/latest/userguide/sharing.html) .
   */
  public open fun attrResourceOwner(): String = unwrap(this).getAttrResourceOwner()

  /**
   * The unique identifier for the gateway route.
   */
  public open fun attrUid(): String = unwrap(this).getAttrUid()

  /**
   * The name of the virtual gateway that the gateway route is associated with.
   */
  public open fun attrVirtualGatewayName(): String = unwrap(this).getAttrVirtualGatewayName()

  /**
   * The name of the gateway route.
   */
  public open fun gatewayRouteName(): String? = unwrap(this).getGatewayRouteName()

  /**
   * The name of the gateway route.
   */
  public open fun gatewayRouteName(`value`: String) {
    unwrap(this).setGatewayRouteName(`value`)
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
   * The name of the service mesh that the resource resides in.
   */
  public open fun meshName(): String = unwrap(this).getMeshName()

  /**
   * The name of the service mesh that the resource resides in.
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
   * The specifications of the gateway route.
   */
  public open fun spec(): Any = unwrap(this).getSpec()

  /**
   * The specifications of the gateway route.
   */
  public open fun spec(`value`: IResolvable) {
    unwrap(this).setSpec(`value`.let(IResolvable::unwrap))
  }

  /**
   * The specifications of the gateway route.
   */
  public open fun spec(`value`: GatewayRouteSpecProperty) {
    unwrap(this).setSpec(`value`.let(GatewayRouteSpecProperty::unwrap))
  }

  /**
   * The specifications of the gateway route.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("516e010fd40c06579324b12e9e9e7838e1d01e14e61919f1bca7346a90dd5ae0")
  public open fun spec(`value`: GatewayRouteSpecProperty.Builder.() -> Unit): Unit =
      spec(GatewayRouteSpecProperty(`value`))

  /**
   * Tag Manager which manages the tags for this resource.
   */
  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  /**
   * Optional metadata that you can apply to the gateway route to assist with categorization and
   * organization.
   */
  public open fun tagsRaw(): List<CfnTag> = unwrap(this).getTagsRaw()?.map(CfnTag::wrap) ?:
      emptyList()

  /**
   * Optional metadata that you can apply to the gateway route to assist with categorization and
   * organization.
   */
  public open fun tagsRaw(`value`: List<CfnTag>) {
    unwrap(this).setTagsRaw(`value`.map(CfnTag::unwrap))
  }

  /**
   * Optional metadata that you can apply to the gateway route to assist with categorization and
   * organization.
   */
  public open fun tagsRaw(vararg `value`: CfnTag): Unit = tagsRaw(`value`.toList())

  /**
   * The virtual gateway that the gateway route is associated with.
   */
  public open fun virtualGatewayName(): String = unwrap(this).getVirtualGatewayName()

  /**
   * The virtual gateway that the gateway route is associated with.
   */
  public open fun virtualGatewayName(`value`: String) {
    unwrap(this).setVirtualGatewayName(`value`)
  }

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.appmesh.CfnGatewayRoute].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The name of the gateway route.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appmesh-gatewayroute.html#cfn-appmesh-gatewayroute-gatewayroutename)
     * @param gatewayRouteName The name of the gateway route. 
     */
    public fun gatewayRouteName(gatewayRouteName: String)

    /**
     * The name of the service mesh that the resource resides in.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appmesh-gatewayroute.html#cfn-appmesh-gatewayroute-meshname)
     * @param meshName The name of the service mesh that the resource resides in. 
     */
    public fun meshName(meshName: String)

    /**
     * The AWS IAM account ID of the service mesh owner.
     *
     * If the account ID is not your own, then it's the ID of the account that shared the mesh with
     * your account. For more information about mesh sharing, see [Working with shared
     * meshes](https://docs.aws.amazon.com/app-mesh/latest/userguide/sharing.html) .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appmesh-gatewayroute.html#cfn-appmesh-gatewayroute-meshowner)
     * @param meshOwner The AWS IAM account ID of the service mesh owner. 
     */
    public fun meshOwner(meshOwner: String)

    /**
     * The specifications of the gateway route.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appmesh-gatewayroute.html#cfn-appmesh-gatewayroute-spec)
     * @param spec The specifications of the gateway route. 
     */
    public fun spec(spec: IResolvable)

    /**
     * The specifications of the gateway route.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appmesh-gatewayroute.html#cfn-appmesh-gatewayroute-spec)
     * @param spec The specifications of the gateway route. 
     */
    public fun spec(spec: GatewayRouteSpecProperty)

    /**
     * The specifications of the gateway route.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appmesh-gatewayroute.html#cfn-appmesh-gatewayroute-spec)
     * @param spec The specifications of the gateway route. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("024510c4be71df139eec20dff9e4b3f60e7c065e3d8c155a3e172c5501feadea")
    public fun spec(spec: GatewayRouteSpecProperty.Builder.() -> Unit)

    /**
     * Optional metadata that you can apply to the gateway route to assist with categorization and
     * organization.
     *
     * Each tag consists of a key and an optional value, both of which you define. Tag keys can have
     * a maximum character length of 128 characters, and tag values can have a maximum length of 256
     * characters.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appmesh-gatewayroute.html#cfn-appmesh-gatewayroute-tags)
     * @param tags Optional metadata that you can apply to the gateway route to assist with
     * categorization and organization. 
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * Optional metadata that you can apply to the gateway route to assist with categorization and
     * organization.
     *
     * Each tag consists of a key and an optional value, both of which you define. Tag keys can have
     * a maximum character length of 128 characters, and tag values can have a maximum length of 256
     * characters.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appmesh-gatewayroute.html#cfn-appmesh-gatewayroute-tags)
     * @param tags Optional metadata that you can apply to the gateway route to assist with
     * categorization and organization. 
     */
    public fun tags(vararg tags: CfnTag)

    /**
     * The virtual gateway that the gateway route is associated with.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appmesh-gatewayroute.html#cfn-appmesh-gatewayroute-virtualgatewayname)
     * @param virtualGatewayName The virtual gateway that the gateway route is associated with. 
     */
    public fun virtualGatewayName(virtualGatewayName: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.appmesh.CfnGatewayRoute.Builder =
        software.amazon.awscdk.services.appmesh.CfnGatewayRoute.Builder.create(scope, id)

    /**
     * The name of the gateway route.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appmesh-gatewayroute.html#cfn-appmesh-gatewayroute-gatewayroutename)
     * @param gatewayRouteName The name of the gateway route. 
     */
    override fun gatewayRouteName(gatewayRouteName: String) {
      cdkBuilder.gatewayRouteName(gatewayRouteName)
    }

    /**
     * The name of the service mesh that the resource resides in.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appmesh-gatewayroute.html#cfn-appmesh-gatewayroute-meshname)
     * @param meshName The name of the service mesh that the resource resides in. 
     */
    override fun meshName(meshName: String) {
      cdkBuilder.meshName(meshName)
    }

    /**
     * The AWS IAM account ID of the service mesh owner.
     *
     * If the account ID is not your own, then it's the ID of the account that shared the mesh with
     * your account. For more information about mesh sharing, see [Working with shared
     * meshes](https://docs.aws.amazon.com/app-mesh/latest/userguide/sharing.html) .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appmesh-gatewayroute.html#cfn-appmesh-gatewayroute-meshowner)
     * @param meshOwner The AWS IAM account ID of the service mesh owner. 
     */
    override fun meshOwner(meshOwner: String) {
      cdkBuilder.meshOwner(meshOwner)
    }

    /**
     * The specifications of the gateway route.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appmesh-gatewayroute.html#cfn-appmesh-gatewayroute-spec)
     * @param spec The specifications of the gateway route. 
     */
    override fun spec(spec: IResolvable) {
      cdkBuilder.spec(spec.let(IResolvable::unwrap))
    }

    /**
     * The specifications of the gateway route.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appmesh-gatewayroute.html#cfn-appmesh-gatewayroute-spec)
     * @param spec The specifications of the gateway route. 
     */
    override fun spec(spec: GatewayRouteSpecProperty) {
      cdkBuilder.spec(spec.let(GatewayRouteSpecProperty::unwrap))
    }

    /**
     * The specifications of the gateway route.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appmesh-gatewayroute.html#cfn-appmesh-gatewayroute-spec)
     * @param spec The specifications of the gateway route. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("024510c4be71df139eec20dff9e4b3f60e7c065e3d8c155a3e172c5501feadea")
    override fun spec(spec: GatewayRouteSpecProperty.Builder.() -> Unit): Unit =
        spec(GatewayRouteSpecProperty(spec))

    /**
     * Optional metadata that you can apply to the gateway route to assist with categorization and
     * organization.
     *
     * Each tag consists of a key and an optional value, both of which you define. Tag keys can have
     * a maximum character length of 128 characters, and tag values can have a maximum length of 256
     * characters.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appmesh-gatewayroute.html#cfn-appmesh-gatewayroute-tags)
     * @param tags Optional metadata that you can apply to the gateway route to assist with
     * categorization and organization. 
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    /**
     * Optional metadata that you can apply to the gateway route to assist with categorization and
     * organization.
     *
     * Each tag consists of a key and an optional value, both of which you define. Tag keys can have
     * a maximum character length of 128 characters, and tag values can have a maximum length of 256
     * characters.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appmesh-gatewayroute.html#cfn-appmesh-gatewayroute-tags)
     * @param tags Optional metadata that you can apply to the gateway route to assist with
     * categorization and organization. 
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    /**
     * The virtual gateway that the gateway route is associated with.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appmesh-gatewayroute.html#cfn-appmesh-gatewayroute-virtualgatewayname)
     * @param virtualGatewayName The virtual gateway that the gateway route is associated with. 
     */
    override fun virtualGatewayName(virtualGatewayName: String) {
      cdkBuilder.virtualGatewayName(virtualGatewayName)
    }

    public fun build(): software.amazon.awscdk.services.appmesh.CfnGatewayRoute = cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.appmesh.CfnGatewayRoute.CFN_RESOURCE_TYPE_NAME

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

  /**
   * An object that represents the criteria for determining a request match.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.appmesh.*;
   * HttpGatewayRouteMatchProperty httpGatewayRouteMatchProperty =
   * HttpGatewayRouteMatchProperty.builder()
   * .headers(List.of(HttpGatewayRouteHeaderProperty.builder()
   * .name("name")
   * // the properties below are optional
   * .invert(false)
   * .match(HttpGatewayRouteHeaderMatchProperty.builder()
   * .exact("exact")
   * .prefix("prefix")
   * .range(GatewayRouteRangeMatchProperty.builder()
   * .end(123)
   * .start(123)
   * .build())
   * .regex("regex")
   * .suffix("suffix")
   * .build())
   * .build()))
   * .hostname(GatewayRouteHostnameMatchProperty.builder()
   * .exact("exact")
   * .suffix("suffix")
   * .build())
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
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-gatewayroute-httpgatewayroutematch.html)
   */
  public interface HttpGatewayRouteMatchProperty {
    /**
     * The client request headers to match on.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-gatewayroute-httpgatewayroutematch.html#cfn-appmesh-gatewayroute-httpgatewayroutematch-headers)
     */
    public fun headers(): Any? = unwrap(this).getHeaders()

    /**
     * The host name to match on.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-gatewayroute-httpgatewayroutematch.html#cfn-appmesh-gatewayroute-httpgatewayroutematch-hostname)
     */
    public fun hostname(): Any? = unwrap(this).getHostname()

    /**
     * The method to match on.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-gatewayroute-httpgatewayroutematch.html#cfn-appmesh-gatewayroute-httpgatewayroutematch-method)
     */
    public fun method(): String? = unwrap(this).getMethod()

    /**
     * The path to match on.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-gatewayroute-httpgatewayroutematch.html#cfn-appmesh-gatewayroute-httpgatewayroutematch-path)
     */
    public fun path(): Any? = unwrap(this).getPath()

    /**
     * The port number to match on.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-gatewayroute-httpgatewayroutematch.html#cfn-appmesh-gatewayroute-httpgatewayroutematch-port)
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
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-gatewayroute-httpgatewayroutematch.html#cfn-appmesh-gatewayroute-httpgatewayroutematch-prefix)
     */
    public fun prefix(): String? = unwrap(this).getPrefix()

    /**
     * The query parameter to match on.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-gatewayroute-httpgatewayroutematch.html#cfn-appmesh-gatewayroute-httpgatewayroutematch-queryparameters)
     */
    public fun queryParameters(): Any? = unwrap(this).getQueryParameters()

    /**
     * A builder for [HttpGatewayRouteMatchProperty]
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
       * @param hostname The host name to match on.
       */
      public fun hostname(hostname: IResolvable)

      /**
       * @param hostname The host name to match on.
       */
      public fun hostname(hostname: GatewayRouteHostnameMatchProperty)

      /**
       * @param hostname The host name to match on.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("e1d71769d1f2cfb93e9238becb380bb908bc79654ee401d3fa39e74df4f9a916")
      public fun hostname(hostname: GatewayRouteHostnameMatchProperty.Builder.() -> Unit)

      /**
       * @param method The method to match on.
       */
      public fun method(method: String)

      /**
       * @param path The path to match on.
       */
      public fun path(path: IResolvable)

      /**
       * @param path The path to match on.
       */
      public fun path(path: HttpPathMatchProperty)

      /**
       * @param path The path to match on.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("02f3f43e18c1796a033693d51aa268f96f0b65b0366195aa72856dc5aad63ab1")
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
       * @param queryParameters The query parameter to match on.
       */
      public fun queryParameters(queryParameters: IResolvable)

      /**
       * @param queryParameters The query parameter to match on.
       */
      public fun queryParameters(queryParameters: List<Any>)

      /**
       * @param queryParameters The query parameter to match on.
       */
      public fun queryParameters(vararg queryParameters: Any)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.appmesh.CfnGatewayRoute.HttpGatewayRouteMatchProperty.Builder
          =
          software.amazon.awscdk.services.appmesh.CfnGatewayRoute.HttpGatewayRouteMatchProperty.builder()

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
       * @param hostname The host name to match on.
       */
      override fun hostname(hostname: IResolvable) {
        cdkBuilder.hostname(hostname.let(IResolvable::unwrap))
      }

      /**
       * @param hostname The host name to match on.
       */
      override fun hostname(hostname: GatewayRouteHostnameMatchProperty) {
        cdkBuilder.hostname(hostname.let(GatewayRouteHostnameMatchProperty::unwrap))
      }

      /**
       * @param hostname The host name to match on.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("e1d71769d1f2cfb93e9238becb380bb908bc79654ee401d3fa39e74df4f9a916")
      override fun hostname(hostname: GatewayRouteHostnameMatchProperty.Builder.() -> Unit): Unit =
          hostname(GatewayRouteHostnameMatchProperty(hostname))

      /**
       * @param method The method to match on.
       */
      override fun method(method: String) {
        cdkBuilder.method(method)
      }

      /**
       * @param path The path to match on.
       */
      override fun path(path: IResolvable) {
        cdkBuilder.path(path.let(IResolvable::unwrap))
      }

      /**
       * @param path The path to match on.
       */
      override fun path(path: HttpPathMatchProperty) {
        cdkBuilder.path(path.let(HttpPathMatchProperty::unwrap))
      }

      /**
       * @param path The path to match on.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("02f3f43e18c1796a033693d51aa268f96f0b65b0366195aa72856dc5aad63ab1")
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
       * @param queryParameters The query parameter to match on.
       */
      override fun queryParameters(queryParameters: IResolvable) {
        cdkBuilder.queryParameters(queryParameters.let(IResolvable::unwrap))
      }

      /**
       * @param queryParameters The query parameter to match on.
       */
      override fun queryParameters(queryParameters: List<Any>) {
        cdkBuilder.queryParameters(queryParameters)
      }

      /**
       * @param queryParameters The query parameter to match on.
       */
      override fun queryParameters(vararg queryParameters: Any): Unit =
          queryParameters(queryParameters.toList())

      public fun build():
          software.amazon.awscdk.services.appmesh.CfnGatewayRoute.HttpGatewayRouteMatchProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.appmesh.CfnGatewayRoute.HttpGatewayRouteMatchProperty,
    ) : CdkObject(cdkObject), HttpGatewayRouteMatchProperty {
      /**
       * The client request headers to match on.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-gatewayroute-httpgatewayroutematch.html#cfn-appmesh-gatewayroute-httpgatewayroutematch-headers)
       */
      override fun headers(): Any? = unwrap(this).getHeaders()

      /**
       * The host name to match on.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-gatewayroute-httpgatewayroutematch.html#cfn-appmesh-gatewayroute-httpgatewayroutematch-hostname)
       */
      override fun hostname(): Any? = unwrap(this).getHostname()

      /**
       * The method to match on.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-gatewayroute-httpgatewayroutematch.html#cfn-appmesh-gatewayroute-httpgatewayroutematch-method)
       */
      override fun method(): String? = unwrap(this).getMethod()

      /**
       * The path to match on.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-gatewayroute-httpgatewayroutematch.html#cfn-appmesh-gatewayroute-httpgatewayroutematch-path)
       */
      override fun path(): Any? = unwrap(this).getPath()

      /**
       * The port number to match on.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-gatewayroute-httpgatewayroutematch.html#cfn-appmesh-gatewayroute-httpgatewayroutematch-port)
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
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-gatewayroute-httpgatewayroutematch.html#cfn-appmesh-gatewayroute-httpgatewayroutematch-prefix)
       */
      override fun prefix(): String? = unwrap(this).getPrefix()

      /**
       * The query parameter to match on.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-gatewayroute-httpgatewayroutematch.html#cfn-appmesh-gatewayroute-httpgatewayroutematch-queryparameters)
       */
      override fun queryParameters(): Any? = unwrap(this).getQueryParameters()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): HttpGatewayRouteMatchProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.appmesh.CfnGatewayRoute.HttpGatewayRouteMatchProperty):
          HttpGatewayRouteMatchProperty = CdkObjectWrappers.wrap(cdkObject) as
          HttpGatewayRouteMatchProperty

      internal fun unwrap(wrapped: HttpGatewayRouteMatchProperty):
          software.amazon.awscdk.services.appmesh.CfnGatewayRoute.HttpGatewayRouteMatchProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.appmesh.CfnGatewayRoute.HttpGatewayRouteMatchProperty
    }
  }

  /**
   * An object representing the beginning characters of the route to rewrite.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.appmesh.*;
   * HttpGatewayRoutePrefixRewriteProperty httpGatewayRoutePrefixRewriteProperty =
   * HttpGatewayRoutePrefixRewriteProperty.builder()
   * .defaultPrefix("defaultPrefix")
   * .value("value")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-gatewayroute-httpgatewayrouteprefixrewrite.html)
   */
  public interface HttpGatewayRoutePrefixRewriteProperty {
    /**
     * The default prefix used to replace the incoming route prefix when rewritten.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-gatewayroute-httpgatewayrouteprefixrewrite.html#cfn-appmesh-gatewayroute-httpgatewayrouteprefixrewrite-defaultprefix)
     */
    public fun defaultPrefix(): String? = unwrap(this).getDefaultPrefix()

    /**
     * The value used to replace the incoming route prefix when rewritten.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-gatewayroute-httpgatewayrouteprefixrewrite.html#cfn-appmesh-gatewayroute-httpgatewayrouteprefixrewrite-value)
     */
    public fun `value`(): String? = unwrap(this).getValue()

    /**
     * A builder for [HttpGatewayRoutePrefixRewriteProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param defaultPrefix The default prefix used to replace the incoming route prefix when
       * rewritten.
       */
      public fun defaultPrefix(defaultPrefix: String)

      /**
       * @param value The value used to replace the incoming route prefix when rewritten.
       */
      public fun `value`(`value`: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.appmesh.CfnGatewayRoute.HttpGatewayRoutePrefixRewriteProperty.Builder
          =
          software.amazon.awscdk.services.appmesh.CfnGatewayRoute.HttpGatewayRoutePrefixRewriteProperty.builder()

      /**
       * @param defaultPrefix The default prefix used to replace the incoming route prefix when
       * rewritten.
       */
      override fun defaultPrefix(defaultPrefix: String) {
        cdkBuilder.defaultPrefix(defaultPrefix)
      }

      /**
       * @param value The value used to replace the incoming route prefix when rewritten.
       */
      override fun `value`(`value`: String) {
        cdkBuilder.`value`(`value`)
      }

      public fun build():
          software.amazon.awscdk.services.appmesh.CfnGatewayRoute.HttpGatewayRoutePrefixRewriteProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.appmesh.CfnGatewayRoute.HttpGatewayRoutePrefixRewriteProperty,
    ) : CdkObject(cdkObject), HttpGatewayRoutePrefixRewriteProperty {
      /**
       * The default prefix used to replace the incoming route prefix when rewritten.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-gatewayroute-httpgatewayrouteprefixrewrite.html#cfn-appmesh-gatewayroute-httpgatewayrouteprefixrewrite-defaultprefix)
       */
      override fun defaultPrefix(): String? = unwrap(this).getDefaultPrefix()

      /**
       * The value used to replace the incoming route prefix when rewritten.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-gatewayroute-httpgatewayrouteprefixrewrite.html#cfn-appmesh-gatewayroute-httpgatewayrouteprefixrewrite-value)
       */
      override fun `value`(): String? = unwrap(this).getValue()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          HttpGatewayRoutePrefixRewriteProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.appmesh.CfnGatewayRoute.HttpGatewayRoutePrefixRewriteProperty):
          HttpGatewayRoutePrefixRewriteProperty = CdkObjectWrappers.wrap(cdkObject) as
          HttpGatewayRoutePrefixRewriteProperty

      internal fun unwrap(wrapped: HttpGatewayRoutePrefixRewriteProperty):
          software.amazon.awscdk.services.appmesh.CfnGatewayRoute.HttpGatewayRoutePrefixRewriteProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.appmesh.CfnGatewayRoute.HttpGatewayRoutePrefixRewriteProperty
    }
  }

  /**
   * An object representing the gateway route to rewrite.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.appmesh.*;
   * HttpGatewayRouteRewriteProperty httpGatewayRouteRewriteProperty =
   * HttpGatewayRouteRewriteProperty.builder()
   * .hostname(GatewayRouteHostnameRewriteProperty.builder()
   * .defaultTargetHostname("defaultTargetHostname")
   * .build())
   * .path(HttpGatewayRoutePathRewriteProperty.builder()
   * .exact("exact")
   * .build())
   * .prefix(HttpGatewayRoutePrefixRewriteProperty.builder()
   * .defaultPrefix("defaultPrefix")
   * .value("value")
   * .build())
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-gatewayroute-httpgatewayrouterewrite.html)
   */
  public interface HttpGatewayRouteRewriteProperty {
    /**
     * The host name to rewrite.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-gatewayroute-httpgatewayrouterewrite.html#cfn-appmesh-gatewayroute-httpgatewayrouterewrite-hostname)
     */
    public fun hostname(): Any? = unwrap(this).getHostname()

    /**
     * The path to rewrite.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-gatewayroute-httpgatewayrouterewrite.html#cfn-appmesh-gatewayroute-httpgatewayrouterewrite-path)
     */
    public fun path(): Any? = unwrap(this).getPath()

    /**
     * The specified beginning characters to rewrite.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-gatewayroute-httpgatewayrouterewrite.html#cfn-appmesh-gatewayroute-httpgatewayrouterewrite-prefix)
     */
    public fun prefix(): Any? = unwrap(this).getPrefix()

    /**
     * A builder for [HttpGatewayRouteRewriteProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param hostname The host name to rewrite.
       */
      public fun hostname(hostname: IResolvable)

      /**
       * @param hostname The host name to rewrite.
       */
      public fun hostname(hostname: GatewayRouteHostnameRewriteProperty)

      /**
       * @param hostname The host name to rewrite.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("d76c90549eeca1ed2bc5082c6fd8cc03eb27225c01398d5dd5a23dd6b814df04")
      public fun hostname(hostname: GatewayRouteHostnameRewriteProperty.Builder.() -> Unit)

      /**
       * @param path The path to rewrite.
       */
      public fun path(path: IResolvable)

      /**
       * @param path The path to rewrite.
       */
      public fun path(path: HttpGatewayRoutePathRewriteProperty)

      /**
       * @param path The path to rewrite.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("0ae37aca4e33de72b612e3b5f3cc9dae707f7ae3ab727c8717a9d24acd1ffed5")
      public fun path(path: HttpGatewayRoutePathRewriteProperty.Builder.() -> Unit)

      /**
       * @param prefix The specified beginning characters to rewrite.
       */
      public fun prefix(prefix: IResolvable)

      /**
       * @param prefix The specified beginning characters to rewrite.
       */
      public fun prefix(prefix: HttpGatewayRoutePrefixRewriteProperty)

      /**
       * @param prefix The specified beginning characters to rewrite.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("0cbb9831a01271d35491bb280f23420c2bdc24f62932d18cb8f49d4fa00fa774")
      public fun prefix(prefix: HttpGatewayRoutePrefixRewriteProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.appmesh.CfnGatewayRoute.HttpGatewayRouteRewriteProperty.Builder
          =
          software.amazon.awscdk.services.appmesh.CfnGatewayRoute.HttpGatewayRouteRewriteProperty.builder()

      /**
       * @param hostname The host name to rewrite.
       */
      override fun hostname(hostname: IResolvable) {
        cdkBuilder.hostname(hostname.let(IResolvable::unwrap))
      }

      /**
       * @param hostname The host name to rewrite.
       */
      override fun hostname(hostname: GatewayRouteHostnameRewriteProperty) {
        cdkBuilder.hostname(hostname.let(GatewayRouteHostnameRewriteProperty::unwrap))
      }

      /**
       * @param hostname The host name to rewrite.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("d76c90549eeca1ed2bc5082c6fd8cc03eb27225c01398d5dd5a23dd6b814df04")
      override fun hostname(hostname: GatewayRouteHostnameRewriteProperty.Builder.() -> Unit): Unit
          = hostname(GatewayRouteHostnameRewriteProperty(hostname))

      /**
       * @param path The path to rewrite.
       */
      override fun path(path: IResolvable) {
        cdkBuilder.path(path.let(IResolvable::unwrap))
      }

      /**
       * @param path The path to rewrite.
       */
      override fun path(path: HttpGatewayRoutePathRewriteProperty) {
        cdkBuilder.path(path.let(HttpGatewayRoutePathRewriteProperty::unwrap))
      }

      /**
       * @param path The path to rewrite.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("0ae37aca4e33de72b612e3b5f3cc9dae707f7ae3ab727c8717a9d24acd1ffed5")
      override fun path(path: HttpGatewayRoutePathRewriteProperty.Builder.() -> Unit): Unit =
          path(HttpGatewayRoutePathRewriteProperty(path))

      /**
       * @param prefix The specified beginning characters to rewrite.
       */
      override fun prefix(prefix: IResolvable) {
        cdkBuilder.prefix(prefix.let(IResolvable::unwrap))
      }

      /**
       * @param prefix The specified beginning characters to rewrite.
       */
      override fun prefix(prefix: HttpGatewayRoutePrefixRewriteProperty) {
        cdkBuilder.prefix(prefix.let(HttpGatewayRoutePrefixRewriteProperty::unwrap))
      }

      /**
       * @param prefix The specified beginning characters to rewrite.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("0cbb9831a01271d35491bb280f23420c2bdc24f62932d18cb8f49d4fa00fa774")
      override fun prefix(prefix: HttpGatewayRoutePrefixRewriteProperty.Builder.() -> Unit): Unit =
          prefix(HttpGatewayRoutePrefixRewriteProperty(prefix))

      public fun build():
          software.amazon.awscdk.services.appmesh.CfnGatewayRoute.HttpGatewayRouteRewriteProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.appmesh.CfnGatewayRoute.HttpGatewayRouteRewriteProperty,
    ) : CdkObject(cdkObject), HttpGatewayRouteRewriteProperty {
      /**
       * The host name to rewrite.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-gatewayroute-httpgatewayrouterewrite.html#cfn-appmesh-gatewayroute-httpgatewayrouterewrite-hostname)
       */
      override fun hostname(): Any? = unwrap(this).getHostname()

      /**
       * The path to rewrite.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-gatewayroute-httpgatewayrouterewrite.html#cfn-appmesh-gatewayroute-httpgatewayrouterewrite-path)
       */
      override fun path(): Any? = unwrap(this).getPath()

      /**
       * The specified beginning characters to rewrite.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-gatewayroute-httpgatewayrouterewrite.html#cfn-appmesh-gatewayroute-httpgatewayrouterewrite-prefix)
       */
      override fun prefix(): Any? = unwrap(this).getPrefix()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): HttpGatewayRouteRewriteProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.appmesh.CfnGatewayRoute.HttpGatewayRouteRewriteProperty):
          HttpGatewayRouteRewriteProperty = CdkObjectWrappers.wrap(cdkObject) as
          HttpGatewayRouteRewriteProperty

      internal fun unwrap(wrapped: HttpGatewayRouteRewriteProperty):
          software.amazon.awscdk.services.appmesh.CfnGatewayRoute.HttpGatewayRouteRewriteProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.appmesh.CfnGatewayRoute.HttpGatewayRouteRewriteProperty
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
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-gatewayroute-queryparameter.html)
   */
  public interface QueryParameterProperty {
    /**
     * The query parameter to match on.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-gatewayroute-queryparameter.html#cfn-appmesh-gatewayroute-queryparameter-match)
     */
    public fun match(): Any? = unwrap(this).getMatch()

    /**
     * A name for the query parameter that will be matched on.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-gatewayroute-queryparameter.html#cfn-appmesh-gatewayroute-queryparameter-name)
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
      @JvmName("027a218ab1a49211ec6dc4aa7e3504cef35d0e9e3d4a94c3f63c78e34d1d8127")
      public fun match(match: HttpQueryParameterMatchProperty.Builder.() -> Unit)

      /**
       * @param name A name for the query parameter that will be matched on. 
       */
      public fun name(name: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.appmesh.CfnGatewayRoute.QueryParameterProperty.Builder =
          software.amazon.awscdk.services.appmesh.CfnGatewayRoute.QueryParameterProperty.builder()

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
      @JvmName("027a218ab1a49211ec6dc4aa7e3504cef35d0e9e3d4a94c3f63c78e34d1d8127")
      override fun match(match: HttpQueryParameterMatchProperty.Builder.() -> Unit): Unit =
          match(HttpQueryParameterMatchProperty(match))

      /**
       * @param name A name for the query parameter that will be matched on. 
       */
      override fun name(name: String) {
        cdkBuilder.name(name)
      }

      public fun build():
          software.amazon.awscdk.services.appmesh.CfnGatewayRoute.QueryParameterProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.appmesh.CfnGatewayRoute.QueryParameterProperty,
    ) : CdkObject(cdkObject), QueryParameterProperty {
      /**
       * The query parameter to match on.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-gatewayroute-queryparameter.html#cfn-appmesh-gatewayroute-queryparameter-match)
       */
      override fun match(): Any? = unwrap(this).getMatch()

      /**
       * A name for the query parameter that will be matched on.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-gatewayroute-queryparameter.html#cfn-appmesh-gatewayroute-queryparameter-name)
       */
      override fun name(): String = unwrap(this).getName()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): QueryParameterProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.appmesh.CfnGatewayRoute.QueryParameterProperty):
          QueryParameterProperty = CdkObjectWrappers.wrap(cdkObject) as QueryParameterProperty

      internal fun unwrap(wrapped: QueryParameterProperty):
          software.amazon.awscdk.services.appmesh.CfnGatewayRoute.QueryParameterProperty = (wrapped
          as CdkObject).cdkObject as
          software.amazon.awscdk.services.appmesh.CfnGatewayRoute.QueryParameterProperty
    }
  }

  /**
   * An object that represents a gateway route target.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.appmesh.*;
   * GatewayRouteTargetProperty gatewayRouteTargetProperty = GatewayRouteTargetProperty.builder()
   * .virtualService(GatewayRouteVirtualServiceProperty.builder()
   * .virtualServiceName("virtualServiceName")
   * .build())
   * // the properties below are optional
   * .port(123)
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-gatewayroute-gatewayroutetarget.html)
   */
  public interface GatewayRouteTargetProperty {
    /**
     * The port number of the gateway route target.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-gatewayroute-gatewayroutetarget.html#cfn-appmesh-gatewayroute-gatewayroutetarget-port)
     */
    public fun port(): Number? = unwrap(this).getPort()

    /**
     * An object that represents a virtual service gateway route target.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-gatewayroute-gatewayroutetarget.html#cfn-appmesh-gatewayroute-gatewayroutetarget-virtualservice)
     */
    public fun virtualService(): Any

    /**
     * A builder for [GatewayRouteTargetProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param port The port number of the gateway route target.
       */
      public fun port(port: Number)

      /**
       * @param virtualService An object that represents a virtual service gateway route target. 
       */
      public fun virtualService(virtualService: IResolvable)

      /**
       * @param virtualService An object that represents a virtual service gateway route target. 
       */
      public fun virtualService(virtualService: GatewayRouteVirtualServiceProperty)

      /**
       * @param virtualService An object that represents a virtual service gateway route target. 
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("a414a9a466bb8280175f846eae283b057bba5f57e0e932f87dc27b241157e961")
      public
          fun virtualService(virtualService: GatewayRouteVirtualServiceProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.appmesh.CfnGatewayRoute.GatewayRouteTargetProperty.Builder
          =
          software.amazon.awscdk.services.appmesh.CfnGatewayRoute.GatewayRouteTargetProperty.builder()

      /**
       * @param port The port number of the gateway route target.
       */
      override fun port(port: Number) {
        cdkBuilder.port(port)
      }

      /**
       * @param virtualService An object that represents a virtual service gateway route target. 
       */
      override fun virtualService(virtualService: IResolvable) {
        cdkBuilder.virtualService(virtualService.let(IResolvable::unwrap))
      }

      /**
       * @param virtualService An object that represents a virtual service gateway route target. 
       */
      override fun virtualService(virtualService: GatewayRouteVirtualServiceProperty) {
        cdkBuilder.virtualService(virtualService.let(GatewayRouteVirtualServiceProperty::unwrap))
      }

      /**
       * @param virtualService An object that represents a virtual service gateway route target. 
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("a414a9a466bb8280175f846eae283b057bba5f57e0e932f87dc27b241157e961")
      override
          fun virtualService(virtualService: GatewayRouteVirtualServiceProperty.Builder.() -> Unit):
          Unit = virtualService(GatewayRouteVirtualServiceProperty(virtualService))

      public fun build():
          software.amazon.awscdk.services.appmesh.CfnGatewayRoute.GatewayRouteTargetProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.appmesh.CfnGatewayRoute.GatewayRouteTargetProperty,
    ) : CdkObject(cdkObject), GatewayRouteTargetProperty {
      /**
       * The port number of the gateway route target.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-gatewayroute-gatewayroutetarget.html#cfn-appmesh-gatewayroute-gatewayroutetarget-port)
       */
      override fun port(): Number? = unwrap(this).getPort()

      /**
       * An object that represents a virtual service gateway route target.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-gatewayroute-gatewayroutetarget.html#cfn-appmesh-gatewayroute-gatewayroutetarget-virtualservice)
       */
      override fun virtualService(): Any = unwrap(this).getVirtualService()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): GatewayRouteTargetProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.appmesh.CfnGatewayRoute.GatewayRouteTargetProperty):
          GatewayRouteTargetProperty = CdkObjectWrappers.wrap(cdkObject) as
          GatewayRouteTargetProperty

      internal fun unwrap(wrapped: GatewayRouteTargetProperty):
          software.amazon.awscdk.services.appmesh.CfnGatewayRoute.GatewayRouteTargetProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.appmesh.CfnGatewayRoute.GatewayRouteTargetProperty
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
   * GatewayRouteRangeMatchProperty gatewayRouteRangeMatchProperty =
   * GatewayRouteRangeMatchProperty.builder()
   * .end(123)
   * .start(123)
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-gatewayroute-gatewayrouterangematch.html)
   */
  public interface GatewayRouteRangeMatchProperty {
    /**
     * The end of the range.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-gatewayroute-gatewayrouterangematch.html#cfn-appmesh-gatewayroute-gatewayrouterangematch-end)
     */
    public fun end(): Number

    /**
     * The start of the range.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-gatewayroute-gatewayrouterangematch.html#cfn-appmesh-gatewayroute-gatewayrouterangematch-start)
     */
    public fun start(): Number

    /**
     * A builder for [GatewayRouteRangeMatchProperty]
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
          software.amazon.awscdk.services.appmesh.CfnGatewayRoute.GatewayRouteRangeMatchProperty.Builder
          =
          software.amazon.awscdk.services.appmesh.CfnGatewayRoute.GatewayRouteRangeMatchProperty.builder()

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

      public fun build():
          software.amazon.awscdk.services.appmesh.CfnGatewayRoute.GatewayRouteRangeMatchProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.appmesh.CfnGatewayRoute.GatewayRouteRangeMatchProperty,
    ) : CdkObject(cdkObject), GatewayRouteRangeMatchProperty {
      /**
       * The end of the range.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-gatewayroute-gatewayrouterangematch.html#cfn-appmesh-gatewayroute-gatewayrouterangematch-end)
       */
      override fun end(): Number = unwrap(this).getEnd()

      /**
       * The start of the range.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-gatewayroute-gatewayrouterangematch.html#cfn-appmesh-gatewayroute-gatewayrouterangematch-start)
       */
      override fun start(): Number = unwrap(this).getStart()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): GatewayRouteRangeMatchProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.appmesh.CfnGatewayRoute.GatewayRouteRangeMatchProperty):
          GatewayRouteRangeMatchProperty = CdkObjectWrappers.wrap(cdkObject) as
          GatewayRouteRangeMatchProperty

      internal fun unwrap(wrapped: GatewayRouteRangeMatchProperty):
          software.amazon.awscdk.services.appmesh.CfnGatewayRoute.GatewayRouteRangeMatchProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.appmesh.CfnGatewayRoute.GatewayRouteRangeMatchProperty
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
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-gatewayroute-httpqueryparametermatch.html)
   */
  public interface HttpQueryParameterMatchProperty {
    /**
     * The exact query parameter to match on.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-gatewayroute-httpqueryparametermatch.html#cfn-appmesh-gatewayroute-httpqueryparametermatch-exact)
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
          software.amazon.awscdk.services.appmesh.CfnGatewayRoute.HttpQueryParameterMatchProperty.Builder
          =
          software.amazon.awscdk.services.appmesh.CfnGatewayRoute.HttpQueryParameterMatchProperty.builder()

      /**
       * @param exact The exact query parameter to match on.
       */
      override fun exact(exact: String) {
        cdkBuilder.exact(exact)
      }

      public fun build():
          software.amazon.awscdk.services.appmesh.CfnGatewayRoute.HttpQueryParameterMatchProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.appmesh.CfnGatewayRoute.HttpQueryParameterMatchProperty,
    ) : CdkObject(cdkObject), HttpQueryParameterMatchProperty {
      /**
       * The exact query parameter to match on.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-gatewayroute-httpqueryparametermatch.html#cfn-appmesh-gatewayroute-httpqueryparametermatch-exact)
       */
      override fun exact(): String? = unwrap(this).getExact()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): HttpQueryParameterMatchProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.appmesh.CfnGatewayRoute.HttpQueryParameterMatchProperty):
          HttpQueryParameterMatchProperty = CdkObjectWrappers.wrap(cdkObject) as
          HttpQueryParameterMatchProperty

      internal fun unwrap(wrapped: HttpQueryParameterMatchProperty):
          software.amazon.awscdk.services.appmesh.CfnGatewayRoute.HttpQueryParameterMatchProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.appmesh.CfnGatewayRoute.HttpQueryParameterMatchProperty
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
   * HttpGatewayRouteActionProperty httpGatewayRouteActionProperty =
   * HttpGatewayRouteActionProperty.builder()
   * .target(GatewayRouteTargetProperty.builder()
   * .virtualService(GatewayRouteVirtualServiceProperty.builder()
   * .virtualServiceName("virtualServiceName")
   * .build())
   * // the properties below are optional
   * .port(123)
   * .build())
   * // the properties below are optional
   * .rewrite(HttpGatewayRouteRewriteProperty.builder()
   * .hostname(GatewayRouteHostnameRewriteProperty.builder()
   * .defaultTargetHostname("defaultTargetHostname")
   * .build())
   * .path(HttpGatewayRoutePathRewriteProperty.builder()
   * .exact("exact")
   * .build())
   * .prefix(HttpGatewayRoutePrefixRewriteProperty.builder()
   * .defaultPrefix("defaultPrefix")
   * .value("value")
   * .build())
   * .build())
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-gatewayroute-httpgatewayrouteaction.html)
   */
  public interface HttpGatewayRouteActionProperty {
    /**
     * The gateway route action to rewrite.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-gatewayroute-httpgatewayrouteaction.html#cfn-appmesh-gatewayroute-httpgatewayrouteaction-rewrite)
     */
    public fun rewrite(): Any? = unwrap(this).getRewrite()

    /**
     * An object that represents the target that traffic is routed to when a request matches the
     * gateway route.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-gatewayroute-httpgatewayrouteaction.html#cfn-appmesh-gatewayroute-httpgatewayrouteaction-target)
     */
    public fun target(): Any

    /**
     * A builder for [HttpGatewayRouteActionProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param rewrite The gateway route action to rewrite.
       */
      public fun rewrite(rewrite: IResolvable)

      /**
       * @param rewrite The gateway route action to rewrite.
       */
      public fun rewrite(rewrite: HttpGatewayRouteRewriteProperty)

      /**
       * @param rewrite The gateway route action to rewrite.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("4595161aa5ed2932acf97580609a37d906040913f24392f5f3463c3c48136a0c")
      public fun rewrite(rewrite: HttpGatewayRouteRewriteProperty.Builder.() -> Unit)

      /**
       * @param target An object that represents the target that traffic is routed to when a request
       * matches the gateway route. 
       */
      public fun target(target: IResolvable)

      /**
       * @param target An object that represents the target that traffic is routed to when a request
       * matches the gateway route. 
       */
      public fun target(target: GatewayRouteTargetProperty)

      /**
       * @param target An object that represents the target that traffic is routed to when a request
       * matches the gateway route. 
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("7511ba72bcdf2c64bce395e562862dc1ab3c620a99fb298efa904ff630ee8fe5")
      public fun target(target: GatewayRouteTargetProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.appmesh.CfnGatewayRoute.HttpGatewayRouteActionProperty.Builder
          =
          software.amazon.awscdk.services.appmesh.CfnGatewayRoute.HttpGatewayRouteActionProperty.builder()

      /**
       * @param rewrite The gateway route action to rewrite.
       */
      override fun rewrite(rewrite: IResolvable) {
        cdkBuilder.rewrite(rewrite.let(IResolvable::unwrap))
      }

      /**
       * @param rewrite The gateway route action to rewrite.
       */
      override fun rewrite(rewrite: HttpGatewayRouteRewriteProperty) {
        cdkBuilder.rewrite(rewrite.let(HttpGatewayRouteRewriteProperty::unwrap))
      }

      /**
       * @param rewrite The gateway route action to rewrite.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("4595161aa5ed2932acf97580609a37d906040913f24392f5f3463c3c48136a0c")
      override fun rewrite(rewrite: HttpGatewayRouteRewriteProperty.Builder.() -> Unit): Unit =
          rewrite(HttpGatewayRouteRewriteProperty(rewrite))

      /**
       * @param target An object that represents the target that traffic is routed to when a request
       * matches the gateway route. 
       */
      override fun target(target: IResolvable) {
        cdkBuilder.target(target.let(IResolvable::unwrap))
      }

      /**
       * @param target An object that represents the target that traffic is routed to when a request
       * matches the gateway route. 
       */
      override fun target(target: GatewayRouteTargetProperty) {
        cdkBuilder.target(target.let(GatewayRouteTargetProperty::unwrap))
      }

      /**
       * @param target An object that represents the target that traffic is routed to when a request
       * matches the gateway route. 
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("7511ba72bcdf2c64bce395e562862dc1ab3c620a99fb298efa904ff630ee8fe5")
      override fun target(target: GatewayRouteTargetProperty.Builder.() -> Unit): Unit =
          target(GatewayRouteTargetProperty(target))

      public fun build():
          software.amazon.awscdk.services.appmesh.CfnGatewayRoute.HttpGatewayRouteActionProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.appmesh.CfnGatewayRoute.HttpGatewayRouteActionProperty,
    ) : CdkObject(cdkObject), HttpGatewayRouteActionProperty {
      /**
       * The gateway route action to rewrite.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-gatewayroute-httpgatewayrouteaction.html#cfn-appmesh-gatewayroute-httpgatewayrouteaction-rewrite)
       */
      override fun rewrite(): Any? = unwrap(this).getRewrite()

      /**
       * An object that represents the target that traffic is routed to when a request matches the
       * gateway route.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-gatewayroute-httpgatewayrouteaction.html#cfn-appmesh-gatewayroute-httpgatewayrouteaction-target)
       */
      override fun target(): Any = unwrap(this).getTarget()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): HttpGatewayRouteActionProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.appmesh.CfnGatewayRoute.HttpGatewayRouteActionProperty):
          HttpGatewayRouteActionProperty = CdkObjectWrappers.wrap(cdkObject) as
          HttpGatewayRouteActionProperty

      internal fun unwrap(wrapped: HttpGatewayRouteActionProperty):
          software.amazon.awscdk.services.appmesh.CfnGatewayRoute.HttpGatewayRouteActionProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.appmesh.CfnGatewayRoute.HttpGatewayRouteActionProperty
    }
  }

  /**
   * An object representing the gateway route host name to rewrite.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.appmesh.*;
   * GatewayRouteHostnameRewriteProperty gatewayRouteHostnameRewriteProperty =
   * GatewayRouteHostnameRewriteProperty.builder()
   * .defaultTargetHostname("defaultTargetHostname")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-gatewayroute-gatewayroutehostnamerewrite.html)
   */
  public interface GatewayRouteHostnameRewriteProperty {
    /**
     * The default target host name to write to.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-gatewayroute-gatewayroutehostnamerewrite.html#cfn-appmesh-gatewayroute-gatewayroutehostnamerewrite-defaulttargethostname)
     */
    public fun defaultTargetHostname(): String? = unwrap(this).getDefaultTargetHostname()

    /**
     * A builder for [GatewayRouteHostnameRewriteProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param defaultTargetHostname The default target host name to write to.
       */
      public fun defaultTargetHostname(defaultTargetHostname: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.appmesh.CfnGatewayRoute.GatewayRouteHostnameRewriteProperty.Builder
          =
          software.amazon.awscdk.services.appmesh.CfnGatewayRoute.GatewayRouteHostnameRewriteProperty.builder()

      /**
       * @param defaultTargetHostname The default target host name to write to.
       */
      override fun defaultTargetHostname(defaultTargetHostname: String) {
        cdkBuilder.defaultTargetHostname(defaultTargetHostname)
      }

      public fun build():
          software.amazon.awscdk.services.appmesh.CfnGatewayRoute.GatewayRouteHostnameRewriteProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.appmesh.CfnGatewayRoute.GatewayRouteHostnameRewriteProperty,
    ) : CdkObject(cdkObject), GatewayRouteHostnameRewriteProperty {
      /**
       * The default target host name to write to.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-gatewayroute-gatewayroutehostnamerewrite.html#cfn-appmesh-gatewayroute-gatewayroutehostnamerewrite-defaulttargethostname)
       */
      override fun defaultTargetHostname(): String? = unwrap(this).getDefaultTargetHostname()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          GatewayRouteHostnameRewriteProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.appmesh.CfnGatewayRoute.GatewayRouteHostnameRewriteProperty):
          GatewayRouteHostnameRewriteProperty = CdkObjectWrappers.wrap(cdkObject) as
          GatewayRouteHostnameRewriteProperty

      internal fun unwrap(wrapped: GatewayRouteHostnameRewriteProperty):
          software.amazon.awscdk.services.appmesh.CfnGatewayRoute.GatewayRouteHostnameRewriteProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.appmesh.CfnGatewayRoute.GatewayRouteHostnameRewriteProperty
    }
  }

  /**
   * An object that represents the gateway route to rewrite.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.appmesh.*;
   * GrpcGatewayRouteRewriteProperty grpcGatewayRouteRewriteProperty =
   * GrpcGatewayRouteRewriteProperty.builder()
   * .hostname(GatewayRouteHostnameRewriteProperty.builder()
   * .defaultTargetHostname("defaultTargetHostname")
   * .build())
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-gatewayroute-grpcgatewayrouterewrite.html)
   */
  public interface GrpcGatewayRouteRewriteProperty {
    /**
     * The host name of the gateway route to rewrite.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-gatewayroute-grpcgatewayrouterewrite.html#cfn-appmesh-gatewayroute-grpcgatewayrouterewrite-hostname)
     */
    public fun hostname(): Any? = unwrap(this).getHostname()

    /**
     * A builder for [GrpcGatewayRouteRewriteProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param hostname The host name of the gateway route to rewrite.
       */
      public fun hostname(hostname: IResolvable)

      /**
       * @param hostname The host name of the gateway route to rewrite.
       */
      public fun hostname(hostname: GatewayRouteHostnameRewriteProperty)

      /**
       * @param hostname The host name of the gateway route to rewrite.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("ea962b36ff67d8164bfe9d56a4b92240e6d215288e85d90e16288cad289586bb")
      public fun hostname(hostname: GatewayRouteHostnameRewriteProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.appmesh.CfnGatewayRoute.GrpcGatewayRouteRewriteProperty.Builder
          =
          software.amazon.awscdk.services.appmesh.CfnGatewayRoute.GrpcGatewayRouteRewriteProperty.builder()

      /**
       * @param hostname The host name of the gateway route to rewrite.
       */
      override fun hostname(hostname: IResolvable) {
        cdkBuilder.hostname(hostname.let(IResolvable::unwrap))
      }

      /**
       * @param hostname The host name of the gateway route to rewrite.
       */
      override fun hostname(hostname: GatewayRouteHostnameRewriteProperty) {
        cdkBuilder.hostname(hostname.let(GatewayRouteHostnameRewriteProperty::unwrap))
      }

      /**
       * @param hostname The host name of the gateway route to rewrite.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("ea962b36ff67d8164bfe9d56a4b92240e6d215288e85d90e16288cad289586bb")
      override fun hostname(hostname: GatewayRouteHostnameRewriteProperty.Builder.() -> Unit): Unit
          = hostname(GatewayRouteHostnameRewriteProperty(hostname))

      public fun build():
          software.amazon.awscdk.services.appmesh.CfnGatewayRoute.GrpcGatewayRouteRewriteProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.appmesh.CfnGatewayRoute.GrpcGatewayRouteRewriteProperty,
    ) : CdkObject(cdkObject), GrpcGatewayRouteRewriteProperty {
      /**
       * The host name of the gateway route to rewrite.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-gatewayroute-grpcgatewayrouterewrite.html#cfn-appmesh-gatewayroute-grpcgatewayrouterewrite-hostname)
       */
      override fun hostname(): Any? = unwrap(this).getHostname()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): GrpcGatewayRouteRewriteProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.appmesh.CfnGatewayRoute.GrpcGatewayRouteRewriteProperty):
          GrpcGatewayRouteRewriteProperty = CdkObjectWrappers.wrap(cdkObject) as
          GrpcGatewayRouteRewriteProperty

      internal fun unwrap(wrapped: GrpcGatewayRouteRewriteProperty):
          software.amazon.awscdk.services.appmesh.CfnGatewayRoute.GrpcGatewayRouteRewriteProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.appmesh.CfnGatewayRoute.GrpcGatewayRouteRewriteProperty
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
   * GrpcGatewayRouteMatchProperty grpcGatewayRouteMatchProperty =
   * GrpcGatewayRouteMatchProperty.builder()
   * .hostname(GatewayRouteHostnameMatchProperty.builder()
   * .exact("exact")
   * .suffix("suffix")
   * .build())
   * .metadata(List.of(GrpcGatewayRouteMetadataProperty.builder()
   * .name("name")
   * // the properties below are optional
   * .invert(false)
   * .match(GatewayRouteMetadataMatchProperty.builder()
   * .exact("exact")
   * .prefix("prefix")
   * .range(GatewayRouteRangeMatchProperty.builder()
   * .end(123)
   * .start(123)
   * .build())
   * .regex("regex")
   * .suffix("suffix")
   * .build())
   * .build()))
   * .port(123)
   * .serviceName("serviceName")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-gatewayroute-grpcgatewayroutematch.html)
   */
  public interface GrpcGatewayRouteMatchProperty {
    /**
     * The gateway route host name to be matched on.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-gatewayroute-grpcgatewayroutematch.html#cfn-appmesh-gatewayroute-grpcgatewayroutematch-hostname)
     */
    public fun hostname(): Any? = unwrap(this).getHostname()

    /**
     * The gateway route metadata to be matched on.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-gatewayroute-grpcgatewayroutematch.html#cfn-appmesh-gatewayroute-grpcgatewayroutematch-metadata)
     */
    public fun metadata(): Any? = unwrap(this).getMetadata()

    /**
     * The gateway route port to be matched on.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-gatewayroute-grpcgatewayroutematch.html#cfn-appmesh-gatewayroute-grpcgatewayroutematch-port)
     */
    public fun port(): Number? = unwrap(this).getPort()

    /**
     * The fully qualified domain name for the service to match from the request.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-gatewayroute-grpcgatewayroutematch.html#cfn-appmesh-gatewayroute-grpcgatewayroutematch-servicename)
     */
    public fun serviceName(): String? = unwrap(this).getServiceName()

    /**
     * A builder for [GrpcGatewayRouteMatchProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param hostname The gateway route host name to be matched on.
       */
      public fun hostname(hostname: IResolvable)

      /**
       * @param hostname The gateway route host name to be matched on.
       */
      public fun hostname(hostname: GatewayRouteHostnameMatchProperty)

      /**
       * @param hostname The gateway route host name to be matched on.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("986e86ae6e3366131d92920eb5f68e6aac18c5daf1b054d7fa33667e46d9275b")
      public fun hostname(hostname: GatewayRouteHostnameMatchProperty.Builder.() -> Unit)

      /**
       * @param metadata The gateway route metadata to be matched on.
       */
      public fun metadata(metadata: IResolvable)

      /**
       * @param metadata The gateway route metadata to be matched on.
       */
      public fun metadata(metadata: List<Any>)

      /**
       * @param metadata The gateway route metadata to be matched on.
       */
      public fun metadata(vararg metadata: Any)

      /**
       * @param port The gateway route port to be matched on.
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
          software.amazon.awscdk.services.appmesh.CfnGatewayRoute.GrpcGatewayRouteMatchProperty.Builder
          =
          software.amazon.awscdk.services.appmesh.CfnGatewayRoute.GrpcGatewayRouteMatchProperty.builder()

      /**
       * @param hostname The gateway route host name to be matched on.
       */
      override fun hostname(hostname: IResolvable) {
        cdkBuilder.hostname(hostname.let(IResolvable::unwrap))
      }

      /**
       * @param hostname The gateway route host name to be matched on.
       */
      override fun hostname(hostname: GatewayRouteHostnameMatchProperty) {
        cdkBuilder.hostname(hostname.let(GatewayRouteHostnameMatchProperty::unwrap))
      }

      /**
       * @param hostname The gateway route host name to be matched on.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("986e86ae6e3366131d92920eb5f68e6aac18c5daf1b054d7fa33667e46d9275b")
      override fun hostname(hostname: GatewayRouteHostnameMatchProperty.Builder.() -> Unit): Unit =
          hostname(GatewayRouteHostnameMatchProperty(hostname))

      /**
       * @param metadata The gateway route metadata to be matched on.
       */
      override fun metadata(metadata: IResolvable) {
        cdkBuilder.metadata(metadata.let(IResolvable::unwrap))
      }

      /**
       * @param metadata The gateway route metadata to be matched on.
       */
      override fun metadata(metadata: List<Any>) {
        cdkBuilder.metadata(metadata)
      }

      /**
       * @param metadata The gateway route metadata to be matched on.
       */
      override fun metadata(vararg metadata: Any): Unit = metadata(metadata.toList())

      /**
       * @param port The gateway route port to be matched on.
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

      public fun build():
          software.amazon.awscdk.services.appmesh.CfnGatewayRoute.GrpcGatewayRouteMatchProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.appmesh.CfnGatewayRoute.GrpcGatewayRouteMatchProperty,
    ) : CdkObject(cdkObject), GrpcGatewayRouteMatchProperty {
      /**
       * The gateway route host name to be matched on.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-gatewayroute-grpcgatewayroutematch.html#cfn-appmesh-gatewayroute-grpcgatewayroutematch-hostname)
       */
      override fun hostname(): Any? = unwrap(this).getHostname()

      /**
       * The gateway route metadata to be matched on.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-gatewayroute-grpcgatewayroutematch.html#cfn-appmesh-gatewayroute-grpcgatewayroutematch-metadata)
       */
      override fun metadata(): Any? = unwrap(this).getMetadata()

      /**
       * The gateway route port to be matched on.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-gatewayroute-grpcgatewayroutematch.html#cfn-appmesh-gatewayroute-grpcgatewayroutematch-port)
       */
      override fun port(): Number? = unwrap(this).getPort()

      /**
       * The fully qualified domain name for the service to match from the request.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-gatewayroute-grpcgatewayroutematch.html#cfn-appmesh-gatewayroute-grpcgatewayroutematch-servicename)
       */
      override fun serviceName(): String? = unwrap(this).getServiceName()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): GrpcGatewayRouteMatchProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.appmesh.CfnGatewayRoute.GrpcGatewayRouteMatchProperty):
          GrpcGatewayRouteMatchProperty = CdkObjectWrappers.wrap(cdkObject) as
          GrpcGatewayRouteMatchProperty

      internal fun unwrap(wrapped: GrpcGatewayRouteMatchProperty):
          software.amazon.awscdk.services.appmesh.CfnGatewayRoute.GrpcGatewayRouteMatchProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.appmesh.CfnGatewayRoute.GrpcGatewayRouteMatchProperty
    }
  }

  /**
   * An object that represents the path to rewrite.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.appmesh.*;
   * HttpGatewayRoutePathRewriteProperty httpGatewayRoutePathRewriteProperty =
   * HttpGatewayRoutePathRewriteProperty.builder()
   * .exact("exact")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-gatewayroute-httpgatewayroutepathrewrite.html)
   */
  public interface HttpGatewayRoutePathRewriteProperty {
    /**
     * The exact path to rewrite.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-gatewayroute-httpgatewayroutepathrewrite.html#cfn-appmesh-gatewayroute-httpgatewayroutepathrewrite-exact)
     */
    public fun exact(): String? = unwrap(this).getExact()

    /**
     * A builder for [HttpGatewayRoutePathRewriteProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param exact The exact path to rewrite.
       */
      public fun exact(exact: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.appmesh.CfnGatewayRoute.HttpGatewayRoutePathRewriteProperty.Builder
          =
          software.amazon.awscdk.services.appmesh.CfnGatewayRoute.HttpGatewayRoutePathRewriteProperty.builder()

      /**
       * @param exact The exact path to rewrite.
       */
      override fun exact(exact: String) {
        cdkBuilder.exact(exact)
      }

      public fun build():
          software.amazon.awscdk.services.appmesh.CfnGatewayRoute.HttpGatewayRoutePathRewriteProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.appmesh.CfnGatewayRoute.HttpGatewayRoutePathRewriteProperty,
    ) : CdkObject(cdkObject), HttpGatewayRoutePathRewriteProperty {
      /**
       * The exact path to rewrite.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-gatewayroute-httpgatewayroutepathrewrite.html#cfn-appmesh-gatewayroute-httpgatewayroutepathrewrite-exact)
       */
      override fun exact(): String? = unwrap(this).getExact()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          HttpGatewayRoutePathRewriteProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.appmesh.CfnGatewayRoute.HttpGatewayRoutePathRewriteProperty):
          HttpGatewayRoutePathRewriteProperty = CdkObjectWrappers.wrap(cdkObject) as
          HttpGatewayRoutePathRewriteProperty

      internal fun unwrap(wrapped: HttpGatewayRoutePathRewriteProperty):
          software.amazon.awscdk.services.appmesh.CfnGatewayRoute.HttpGatewayRoutePathRewriteProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.appmesh.CfnGatewayRoute.HttpGatewayRoutePathRewriteProperty
    }
  }

  /**
   * An object representing the gateway route host name to match.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.appmesh.*;
   * GatewayRouteHostnameMatchProperty gatewayRouteHostnameMatchProperty =
   * GatewayRouteHostnameMatchProperty.builder()
   * .exact("exact")
   * .suffix("suffix")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-gatewayroute-gatewayroutehostnamematch.html)
   */
  public interface GatewayRouteHostnameMatchProperty {
    /**
     * The exact host name to match on.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-gatewayroute-gatewayroutehostnamematch.html#cfn-appmesh-gatewayroute-gatewayroutehostnamematch-exact)
     */
    public fun exact(): String? = unwrap(this).getExact()

    /**
     * The specified ending characters of the host name to match on.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-gatewayroute-gatewayroutehostnamematch.html#cfn-appmesh-gatewayroute-gatewayroutehostnamematch-suffix)
     */
    public fun suffix(): String? = unwrap(this).getSuffix()

    /**
     * A builder for [GatewayRouteHostnameMatchProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param exact The exact host name to match on.
       */
      public fun exact(exact: String)

      /**
       * @param suffix The specified ending characters of the host name to match on.
       */
      public fun suffix(suffix: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.appmesh.CfnGatewayRoute.GatewayRouteHostnameMatchProperty.Builder
          =
          software.amazon.awscdk.services.appmesh.CfnGatewayRoute.GatewayRouteHostnameMatchProperty.builder()

      /**
       * @param exact The exact host name to match on.
       */
      override fun exact(exact: String) {
        cdkBuilder.exact(exact)
      }

      /**
       * @param suffix The specified ending characters of the host name to match on.
       */
      override fun suffix(suffix: String) {
        cdkBuilder.suffix(suffix)
      }

      public fun build():
          software.amazon.awscdk.services.appmesh.CfnGatewayRoute.GatewayRouteHostnameMatchProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.appmesh.CfnGatewayRoute.GatewayRouteHostnameMatchProperty,
    ) : CdkObject(cdkObject), GatewayRouteHostnameMatchProperty {
      /**
       * The exact host name to match on.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-gatewayroute-gatewayroutehostnamematch.html#cfn-appmesh-gatewayroute-gatewayroutehostnamematch-exact)
       */
      override fun exact(): String? = unwrap(this).getExact()

      /**
       * The specified ending characters of the host name to match on.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-gatewayroute-gatewayroutehostnamematch.html#cfn-appmesh-gatewayroute-gatewayroutehostnamematch-suffix)
       */
      override fun suffix(): String? = unwrap(this).getSuffix()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          GatewayRouteHostnameMatchProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.appmesh.CfnGatewayRoute.GatewayRouteHostnameMatchProperty):
          GatewayRouteHostnameMatchProperty = CdkObjectWrappers.wrap(cdkObject) as
          GatewayRouteHostnameMatchProperty

      internal fun unwrap(wrapped: GatewayRouteHostnameMatchProperty):
          software.amazon.awscdk.services.appmesh.CfnGatewayRoute.GatewayRouteHostnameMatchProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.appmesh.CfnGatewayRoute.GatewayRouteHostnameMatchProperty
    }
  }

  /**
   * An object representing the method header to be matched.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.appmesh.*;
   * GatewayRouteMetadataMatchProperty gatewayRouteMetadataMatchProperty =
   * GatewayRouteMetadataMatchProperty.builder()
   * .exact("exact")
   * .prefix("prefix")
   * .range(GatewayRouteRangeMatchProperty.builder()
   * .end(123)
   * .start(123)
   * .build())
   * .regex("regex")
   * .suffix("suffix")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-gatewayroute-gatewayroutemetadatamatch.html)
   */
  public interface GatewayRouteMetadataMatchProperty {
    /**
     * The exact method header to be matched on.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-gatewayroute-gatewayroutemetadatamatch.html#cfn-appmesh-gatewayroute-gatewayroutemetadatamatch-exact)
     */
    public fun exact(): String? = unwrap(this).getExact()

    /**
     * The specified beginning characters of the method header to be matched on.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-gatewayroute-gatewayroutemetadatamatch.html#cfn-appmesh-gatewayroute-gatewayroutemetadatamatch-prefix)
     */
    public fun prefix(): String? = unwrap(this).getPrefix()

    /**
     * An object that represents the range of values to match on.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-gatewayroute-gatewayroutemetadatamatch.html#cfn-appmesh-gatewayroute-gatewayroutemetadatamatch-range)
     */
    public fun range(): Any? = unwrap(this).getRange()

    /**
     * The regex used to match the method header.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-gatewayroute-gatewayroutemetadatamatch.html#cfn-appmesh-gatewayroute-gatewayroutemetadatamatch-regex)
     */
    public fun regex(): String? = unwrap(this).getRegex()

    /**
     * The specified ending characters of the method header to match on.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-gatewayroute-gatewayroutemetadatamatch.html#cfn-appmesh-gatewayroute-gatewayroutemetadatamatch-suffix)
     */
    public fun suffix(): String? = unwrap(this).getSuffix()

    /**
     * A builder for [GatewayRouteMetadataMatchProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param exact The exact method header to be matched on.
       */
      public fun exact(exact: String)

      /**
       * @param prefix The specified beginning characters of the method header to be matched on.
       */
      public fun prefix(prefix: String)

      /**
       * @param range An object that represents the range of values to match on.
       */
      public fun range(range: IResolvable)

      /**
       * @param range An object that represents the range of values to match on.
       */
      public fun range(range: GatewayRouteRangeMatchProperty)

      /**
       * @param range An object that represents the range of values to match on.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("59c69f20ba599e306047d9e19bef62df93a64f848ac3b020c38b157baad87553")
      public fun range(range: GatewayRouteRangeMatchProperty.Builder.() -> Unit)

      /**
       * @param regex The regex used to match the method header.
       */
      public fun regex(regex: String)

      /**
       * @param suffix The specified ending characters of the method header to match on.
       */
      public fun suffix(suffix: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.appmesh.CfnGatewayRoute.GatewayRouteMetadataMatchProperty.Builder
          =
          software.amazon.awscdk.services.appmesh.CfnGatewayRoute.GatewayRouteMetadataMatchProperty.builder()

      /**
       * @param exact The exact method header to be matched on.
       */
      override fun exact(exact: String) {
        cdkBuilder.exact(exact)
      }

      /**
       * @param prefix The specified beginning characters of the method header to be matched on.
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
      override fun range(range: GatewayRouteRangeMatchProperty) {
        cdkBuilder.range(range.let(GatewayRouteRangeMatchProperty::unwrap))
      }

      /**
       * @param range An object that represents the range of values to match on.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("59c69f20ba599e306047d9e19bef62df93a64f848ac3b020c38b157baad87553")
      override fun range(range: GatewayRouteRangeMatchProperty.Builder.() -> Unit): Unit =
          range(GatewayRouteRangeMatchProperty(range))

      /**
       * @param regex The regex used to match the method header.
       */
      override fun regex(regex: String) {
        cdkBuilder.regex(regex)
      }

      /**
       * @param suffix The specified ending characters of the method header to match on.
       */
      override fun suffix(suffix: String) {
        cdkBuilder.suffix(suffix)
      }

      public fun build():
          software.amazon.awscdk.services.appmesh.CfnGatewayRoute.GatewayRouteMetadataMatchProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.appmesh.CfnGatewayRoute.GatewayRouteMetadataMatchProperty,
    ) : CdkObject(cdkObject), GatewayRouteMetadataMatchProperty {
      /**
       * The exact method header to be matched on.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-gatewayroute-gatewayroutemetadatamatch.html#cfn-appmesh-gatewayroute-gatewayroutemetadatamatch-exact)
       */
      override fun exact(): String? = unwrap(this).getExact()

      /**
       * The specified beginning characters of the method header to be matched on.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-gatewayroute-gatewayroutemetadatamatch.html#cfn-appmesh-gatewayroute-gatewayroutemetadatamatch-prefix)
       */
      override fun prefix(): String? = unwrap(this).getPrefix()

      /**
       * An object that represents the range of values to match on.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-gatewayroute-gatewayroutemetadatamatch.html#cfn-appmesh-gatewayroute-gatewayroutemetadatamatch-range)
       */
      override fun range(): Any? = unwrap(this).getRange()

      /**
       * The regex used to match the method header.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-gatewayroute-gatewayroutemetadatamatch.html#cfn-appmesh-gatewayroute-gatewayroutemetadatamatch-regex)
       */
      override fun regex(): String? = unwrap(this).getRegex()

      /**
       * The specified ending characters of the method header to match on.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-gatewayroute-gatewayroutemetadatamatch.html#cfn-appmesh-gatewayroute-gatewayroutemetadatamatch-suffix)
       */
      override fun suffix(): String? = unwrap(this).getSuffix()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          GatewayRouteMetadataMatchProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.appmesh.CfnGatewayRoute.GatewayRouteMetadataMatchProperty):
          GatewayRouteMetadataMatchProperty = CdkObjectWrappers.wrap(cdkObject) as
          GatewayRouteMetadataMatchProperty

      internal fun unwrap(wrapped: GatewayRouteMetadataMatchProperty):
          software.amazon.awscdk.services.appmesh.CfnGatewayRoute.GatewayRouteMetadataMatchProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.appmesh.CfnGatewayRoute.GatewayRouteMetadataMatchProperty
    }
  }

  /**
   * An object that represents an HTTP gateway route.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.appmesh.*;
   * HttpGatewayRouteProperty httpGatewayRouteProperty = HttpGatewayRouteProperty.builder()
   * .action(HttpGatewayRouteActionProperty.builder()
   * .target(GatewayRouteTargetProperty.builder()
   * .virtualService(GatewayRouteVirtualServiceProperty.builder()
   * .virtualServiceName("virtualServiceName")
   * .build())
   * // the properties below are optional
   * .port(123)
   * .build())
   * // the properties below are optional
   * .rewrite(HttpGatewayRouteRewriteProperty.builder()
   * .hostname(GatewayRouteHostnameRewriteProperty.builder()
   * .defaultTargetHostname("defaultTargetHostname")
   * .build())
   * .path(HttpGatewayRoutePathRewriteProperty.builder()
   * .exact("exact")
   * .build())
   * .prefix(HttpGatewayRoutePrefixRewriteProperty.builder()
   * .defaultPrefix("defaultPrefix")
   * .value("value")
   * .build())
   * .build())
   * .build())
   * .match(HttpGatewayRouteMatchProperty.builder()
   * .headers(List.of(HttpGatewayRouteHeaderProperty.builder()
   * .name("name")
   * // the properties below are optional
   * .invert(false)
   * .match(HttpGatewayRouteHeaderMatchProperty.builder()
   * .exact("exact")
   * .prefix("prefix")
   * .range(GatewayRouteRangeMatchProperty.builder()
   * .end(123)
   * .start(123)
   * .build())
   * .regex("regex")
   * .suffix("suffix")
   * .build())
   * .build()))
   * .hostname(GatewayRouteHostnameMatchProperty.builder()
   * .exact("exact")
   * .suffix("suffix")
   * .build())
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
   * .build())
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-gatewayroute-httpgatewayroute.html)
   */
  public interface HttpGatewayRouteProperty {
    /**
     * An object that represents the action to take if a match is determined.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-gatewayroute-httpgatewayroute.html#cfn-appmesh-gatewayroute-httpgatewayroute-action)
     */
    public fun action(): Any

    /**
     * An object that represents the criteria for determining a request match.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-gatewayroute-httpgatewayroute.html#cfn-appmesh-gatewayroute-httpgatewayroute-match)
     */
    public fun match(): Any

    /**
     * A builder for [HttpGatewayRouteProperty]
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
      public fun action(action: HttpGatewayRouteActionProperty)

      /**
       * @param action An object that represents the action to take if a match is determined. 
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("c449bf2166af344ba40a1cfbb889aa9887952fdd65805838aed84488bc18bcfb")
      public fun action(action: HttpGatewayRouteActionProperty.Builder.() -> Unit)

      /**
       * @param match An object that represents the criteria for determining a request match. 
       */
      public fun match(match: IResolvable)

      /**
       * @param match An object that represents the criteria for determining a request match. 
       */
      public fun match(match: HttpGatewayRouteMatchProperty)

      /**
       * @param match An object that represents the criteria for determining a request match. 
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("3f677423fa328fcffdd3d500ea46fe09b203dfd3382263c21f89337452fc707e")
      public fun match(match: HttpGatewayRouteMatchProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.appmesh.CfnGatewayRoute.HttpGatewayRouteProperty.Builder =
          software.amazon.awscdk.services.appmesh.CfnGatewayRoute.HttpGatewayRouteProperty.builder()

      /**
       * @param action An object that represents the action to take if a match is determined. 
       */
      override fun action(action: IResolvable) {
        cdkBuilder.action(action.let(IResolvable::unwrap))
      }

      /**
       * @param action An object that represents the action to take if a match is determined. 
       */
      override fun action(action: HttpGatewayRouteActionProperty) {
        cdkBuilder.action(action.let(HttpGatewayRouteActionProperty::unwrap))
      }

      /**
       * @param action An object that represents the action to take if a match is determined. 
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("c449bf2166af344ba40a1cfbb889aa9887952fdd65805838aed84488bc18bcfb")
      override fun action(action: HttpGatewayRouteActionProperty.Builder.() -> Unit): Unit =
          action(HttpGatewayRouteActionProperty(action))

      /**
       * @param match An object that represents the criteria for determining a request match. 
       */
      override fun match(match: IResolvable) {
        cdkBuilder.match(match.let(IResolvable::unwrap))
      }

      /**
       * @param match An object that represents the criteria for determining a request match. 
       */
      override fun match(match: HttpGatewayRouteMatchProperty) {
        cdkBuilder.match(match.let(HttpGatewayRouteMatchProperty::unwrap))
      }

      /**
       * @param match An object that represents the criteria for determining a request match. 
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("3f677423fa328fcffdd3d500ea46fe09b203dfd3382263c21f89337452fc707e")
      override fun match(match: HttpGatewayRouteMatchProperty.Builder.() -> Unit): Unit =
          match(HttpGatewayRouteMatchProperty(match))

      public fun build():
          software.amazon.awscdk.services.appmesh.CfnGatewayRoute.HttpGatewayRouteProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.appmesh.CfnGatewayRoute.HttpGatewayRouteProperty,
    ) : CdkObject(cdkObject), HttpGatewayRouteProperty {
      /**
       * An object that represents the action to take if a match is determined.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-gatewayroute-httpgatewayroute.html#cfn-appmesh-gatewayroute-httpgatewayroute-action)
       */
      override fun action(): Any = unwrap(this).getAction()

      /**
       * An object that represents the criteria for determining a request match.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-gatewayroute-httpgatewayroute.html#cfn-appmesh-gatewayroute-httpgatewayroute-match)
       */
      override fun match(): Any = unwrap(this).getMatch()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): HttpGatewayRouteProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.appmesh.CfnGatewayRoute.HttpGatewayRouteProperty):
          HttpGatewayRouteProperty = CdkObjectWrappers.wrap(cdkObject) as HttpGatewayRouteProperty

      internal fun unwrap(wrapped: HttpGatewayRouteProperty):
          software.amazon.awscdk.services.appmesh.CfnGatewayRoute.HttpGatewayRouteProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.appmesh.CfnGatewayRoute.HttpGatewayRouteProperty
    }
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
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-gatewayroute-httppathmatch.html)
   */
  public interface HttpPathMatchProperty {
    /**
     * The exact path to match on.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-gatewayroute-httppathmatch.html#cfn-appmesh-gatewayroute-httppathmatch-exact)
     */
    public fun exact(): String? = unwrap(this).getExact()

    /**
     * The regex used to match the path.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-gatewayroute-httppathmatch.html#cfn-appmesh-gatewayroute-httppathmatch-regex)
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
          software.amazon.awscdk.services.appmesh.CfnGatewayRoute.HttpPathMatchProperty.Builder =
          software.amazon.awscdk.services.appmesh.CfnGatewayRoute.HttpPathMatchProperty.builder()

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

      public fun build():
          software.amazon.awscdk.services.appmesh.CfnGatewayRoute.HttpPathMatchProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.appmesh.CfnGatewayRoute.HttpPathMatchProperty,
    ) : CdkObject(cdkObject), HttpPathMatchProperty {
      /**
       * The exact path to match on.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-gatewayroute-httppathmatch.html#cfn-appmesh-gatewayroute-httppathmatch-exact)
       */
      override fun exact(): String? = unwrap(this).getExact()

      /**
       * The regex used to match the path.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-gatewayroute-httppathmatch.html#cfn-appmesh-gatewayroute-httppathmatch-regex)
       */
      override fun regex(): String? = unwrap(this).getRegex()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): HttpPathMatchProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.appmesh.CfnGatewayRoute.HttpPathMatchProperty):
          HttpPathMatchProperty = CdkObjectWrappers.wrap(cdkObject) as HttpPathMatchProperty

      internal fun unwrap(wrapped: HttpPathMatchProperty):
          software.amazon.awscdk.services.appmesh.CfnGatewayRoute.HttpPathMatchProperty = (wrapped
          as CdkObject).cdkObject as
          software.amazon.awscdk.services.appmesh.CfnGatewayRoute.HttpPathMatchProperty
    }
  }

  /**
   * An object that represents a gateway route specification.
   *
   * Specify one gateway route type.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.appmesh.*;
   * GatewayRouteSpecProperty gatewayRouteSpecProperty = GatewayRouteSpecProperty.builder()
   * .grpcRoute(GrpcGatewayRouteProperty.builder()
   * .action(GrpcGatewayRouteActionProperty.builder()
   * .target(GatewayRouteTargetProperty.builder()
   * .virtualService(GatewayRouteVirtualServiceProperty.builder()
   * .virtualServiceName("virtualServiceName")
   * .build())
   * // the properties below are optional
   * .port(123)
   * .build())
   * // the properties below are optional
   * .rewrite(GrpcGatewayRouteRewriteProperty.builder()
   * .hostname(GatewayRouteHostnameRewriteProperty.builder()
   * .defaultTargetHostname("defaultTargetHostname")
   * .build())
   * .build())
   * .build())
   * .match(GrpcGatewayRouteMatchProperty.builder()
   * .hostname(GatewayRouteHostnameMatchProperty.builder()
   * .exact("exact")
   * .suffix("suffix")
   * .build())
   * .metadata(List.of(GrpcGatewayRouteMetadataProperty.builder()
   * .name("name")
   * // the properties below are optional
   * .invert(false)
   * .match(GatewayRouteMetadataMatchProperty.builder()
   * .exact("exact")
   * .prefix("prefix")
   * .range(GatewayRouteRangeMatchProperty.builder()
   * .end(123)
   * .start(123)
   * .build())
   * .regex("regex")
   * .suffix("suffix")
   * .build())
   * .build()))
   * .port(123)
   * .serviceName("serviceName")
   * .build())
   * .build())
   * .http2Route(HttpGatewayRouteProperty.builder()
   * .action(HttpGatewayRouteActionProperty.builder()
   * .target(GatewayRouteTargetProperty.builder()
   * .virtualService(GatewayRouteVirtualServiceProperty.builder()
   * .virtualServiceName("virtualServiceName")
   * .build())
   * // the properties below are optional
   * .port(123)
   * .build())
   * // the properties below are optional
   * .rewrite(HttpGatewayRouteRewriteProperty.builder()
   * .hostname(GatewayRouteHostnameRewriteProperty.builder()
   * .defaultTargetHostname("defaultTargetHostname")
   * .build())
   * .path(HttpGatewayRoutePathRewriteProperty.builder()
   * .exact("exact")
   * .build())
   * .prefix(HttpGatewayRoutePrefixRewriteProperty.builder()
   * .defaultPrefix("defaultPrefix")
   * .value("value")
   * .build())
   * .build())
   * .build())
   * .match(HttpGatewayRouteMatchProperty.builder()
   * .headers(List.of(HttpGatewayRouteHeaderProperty.builder()
   * .name("name")
   * // the properties below are optional
   * .invert(false)
   * .match(HttpGatewayRouteHeaderMatchProperty.builder()
   * .exact("exact")
   * .prefix("prefix")
   * .range(GatewayRouteRangeMatchProperty.builder()
   * .end(123)
   * .start(123)
   * .build())
   * .regex("regex")
   * .suffix("suffix")
   * .build())
   * .build()))
   * .hostname(GatewayRouteHostnameMatchProperty.builder()
   * .exact("exact")
   * .suffix("suffix")
   * .build())
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
   * .build())
   * .build())
   * .httpRoute(HttpGatewayRouteProperty.builder()
   * .action(HttpGatewayRouteActionProperty.builder()
   * .target(GatewayRouteTargetProperty.builder()
   * .virtualService(GatewayRouteVirtualServiceProperty.builder()
   * .virtualServiceName("virtualServiceName")
   * .build())
   * // the properties below are optional
   * .port(123)
   * .build())
   * // the properties below are optional
   * .rewrite(HttpGatewayRouteRewriteProperty.builder()
   * .hostname(GatewayRouteHostnameRewriteProperty.builder()
   * .defaultTargetHostname("defaultTargetHostname")
   * .build())
   * .path(HttpGatewayRoutePathRewriteProperty.builder()
   * .exact("exact")
   * .build())
   * .prefix(HttpGatewayRoutePrefixRewriteProperty.builder()
   * .defaultPrefix("defaultPrefix")
   * .value("value")
   * .build())
   * .build())
   * .build())
   * .match(HttpGatewayRouteMatchProperty.builder()
   * .headers(List.of(HttpGatewayRouteHeaderProperty.builder()
   * .name("name")
   * // the properties below are optional
   * .invert(false)
   * .match(HttpGatewayRouteHeaderMatchProperty.builder()
   * .exact("exact")
   * .prefix("prefix")
   * .range(GatewayRouteRangeMatchProperty.builder()
   * .end(123)
   * .start(123)
   * .build())
   * .regex("regex")
   * .suffix("suffix")
   * .build())
   * .build()))
   * .hostname(GatewayRouteHostnameMatchProperty.builder()
   * .exact("exact")
   * .suffix("suffix")
   * .build())
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
   * .build())
   * .build())
   * .priority(123)
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-gatewayroute-gatewayroutespec.html)
   */
  public interface GatewayRouteSpecProperty {
    /**
     * An object that represents the specification of a gRPC gateway route.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-gatewayroute-gatewayroutespec.html#cfn-appmesh-gatewayroute-gatewayroutespec-grpcroute)
     */
    public fun grpcRoute(): Any? = unwrap(this).getGrpcRoute()

    /**
     * An object that represents the specification of an HTTP/2 gateway route.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-gatewayroute-gatewayroutespec.html#cfn-appmesh-gatewayroute-gatewayroutespec-http2route)
     */
    public fun http2Route(): Any? = unwrap(this).getHttp2Route()

    /**
     * An object that represents the specification of an HTTP gateway route.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-gatewayroute-gatewayroutespec.html#cfn-appmesh-gatewayroute-gatewayroutespec-httproute)
     */
    public fun httpRoute(): Any? = unwrap(this).getHttpRoute()

    /**
     * The ordering of the gateway routes spec.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-gatewayroute-gatewayroutespec.html#cfn-appmesh-gatewayroute-gatewayroutespec-priority)
     */
    public fun priority(): Number? = unwrap(this).getPriority()

    /**
     * A builder for [GatewayRouteSpecProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param grpcRoute An object that represents the specification of a gRPC gateway route.
       */
      public fun grpcRoute(grpcRoute: IResolvable)

      /**
       * @param grpcRoute An object that represents the specification of a gRPC gateway route.
       */
      public fun grpcRoute(grpcRoute: GrpcGatewayRouteProperty)

      /**
       * @param grpcRoute An object that represents the specification of a gRPC gateway route.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("9ba955b20867711f21ad2ca280f987a3d3b5131f6e389e6f2902756e108eb927")
      public fun grpcRoute(grpcRoute: GrpcGatewayRouteProperty.Builder.() -> Unit)

      /**
       * @param http2Route An object that represents the specification of an HTTP/2 gateway route.
       */
      public fun http2Route(http2Route: IResolvable)

      /**
       * @param http2Route An object that represents the specification of an HTTP/2 gateway route.
       */
      public fun http2Route(http2Route: HttpGatewayRouteProperty)

      /**
       * @param http2Route An object that represents the specification of an HTTP/2 gateway route.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("bced87db47d043ffd51ea911ee6b5b75d6b030fe59cd5fcd70b8fd10ac690829")
      public fun http2Route(http2Route: HttpGatewayRouteProperty.Builder.() -> Unit)

      /**
       * @param httpRoute An object that represents the specification of an HTTP gateway route.
       */
      public fun httpRoute(httpRoute: IResolvable)

      /**
       * @param httpRoute An object that represents the specification of an HTTP gateway route.
       */
      public fun httpRoute(httpRoute: HttpGatewayRouteProperty)

      /**
       * @param httpRoute An object that represents the specification of an HTTP gateway route.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("2326c5433d615a4ae58ec1f536430545a2588ae70575b4f2dd4a5707b57695e6")
      public fun httpRoute(httpRoute: HttpGatewayRouteProperty.Builder.() -> Unit)

      /**
       * @param priority The ordering of the gateway routes spec.
       */
      public fun priority(priority: Number)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.appmesh.CfnGatewayRoute.GatewayRouteSpecProperty.Builder =
          software.amazon.awscdk.services.appmesh.CfnGatewayRoute.GatewayRouteSpecProperty.builder()

      /**
       * @param grpcRoute An object that represents the specification of a gRPC gateway route.
       */
      override fun grpcRoute(grpcRoute: IResolvable) {
        cdkBuilder.grpcRoute(grpcRoute.let(IResolvable::unwrap))
      }

      /**
       * @param grpcRoute An object that represents the specification of a gRPC gateway route.
       */
      override fun grpcRoute(grpcRoute: GrpcGatewayRouteProperty) {
        cdkBuilder.grpcRoute(grpcRoute.let(GrpcGatewayRouteProperty::unwrap))
      }

      /**
       * @param grpcRoute An object that represents the specification of a gRPC gateway route.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("9ba955b20867711f21ad2ca280f987a3d3b5131f6e389e6f2902756e108eb927")
      override fun grpcRoute(grpcRoute: GrpcGatewayRouteProperty.Builder.() -> Unit): Unit =
          grpcRoute(GrpcGatewayRouteProperty(grpcRoute))

      /**
       * @param http2Route An object that represents the specification of an HTTP/2 gateway route.
       */
      override fun http2Route(http2Route: IResolvable) {
        cdkBuilder.http2Route(http2Route.let(IResolvable::unwrap))
      }

      /**
       * @param http2Route An object that represents the specification of an HTTP/2 gateway route.
       */
      override fun http2Route(http2Route: HttpGatewayRouteProperty) {
        cdkBuilder.http2Route(http2Route.let(HttpGatewayRouteProperty::unwrap))
      }

      /**
       * @param http2Route An object that represents the specification of an HTTP/2 gateway route.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("bced87db47d043ffd51ea911ee6b5b75d6b030fe59cd5fcd70b8fd10ac690829")
      override fun http2Route(http2Route: HttpGatewayRouteProperty.Builder.() -> Unit): Unit =
          http2Route(HttpGatewayRouteProperty(http2Route))

      /**
       * @param httpRoute An object that represents the specification of an HTTP gateway route.
       */
      override fun httpRoute(httpRoute: IResolvable) {
        cdkBuilder.httpRoute(httpRoute.let(IResolvable::unwrap))
      }

      /**
       * @param httpRoute An object that represents the specification of an HTTP gateway route.
       */
      override fun httpRoute(httpRoute: HttpGatewayRouteProperty) {
        cdkBuilder.httpRoute(httpRoute.let(HttpGatewayRouteProperty::unwrap))
      }

      /**
       * @param httpRoute An object that represents the specification of an HTTP gateway route.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("2326c5433d615a4ae58ec1f536430545a2588ae70575b4f2dd4a5707b57695e6")
      override fun httpRoute(httpRoute: HttpGatewayRouteProperty.Builder.() -> Unit): Unit =
          httpRoute(HttpGatewayRouteProperty(httpRoute))

      /**
       * @param priority The ordering of the gateway routes spec.
       */
      override fun priority(priority: Number) {
        cdkBuilder.priority(priority)
      }

      public fun build():
          software.amazon.awscdk.services.appmesh.CfnGatewayRoute.GatewayRouteSpecProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.appmesh.CfnGatewayRoute.GatewayRouteSpecProperty,
    ) : CdkObject(cdkObject), GatewayRouteSpecProperty {
      /**
       * An object that represents the specification of a gRPC gateway route.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-gatewayroute-gatewayroutespec.html#cfn-appmesh-gatewayroute-gatewayroutespec-grpcroute)
       */
      override fun grpcRoute(): Any? = unwrap(this).getGrpcRoute()

      /**
       * An object that represents the specification of an HTTP/2 gateway route.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-gatewayroute-gatewayroutespec.html#cfn-appmesh-gatewayroute-gatewayroutespec-http2route)
       */
      override fun http2Route(): Any? = unwrap(this).getHttp2Route()

      /**
       * An object that represents the specification of an HTTP gateway route.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-gatewayroute-gatewayroutespec.html#cfn-appmesh-gatewayroute-gatewayroutespec-httproute)
       */
      override fun httpRoute(): Any? = unwrap(this).getHttpRoute()

      /**
       * The ordering of the gateway routes spec.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-gatewayroute-gatewayroutespec.html#cfn-appmesh-gatewayroute-gatewayroutespec-priority)
       */
      override fun priority(): Number? = unwrap(this).getPriority()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): GatewayRouteSpecProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.appmesh.CfnGatewayRoute.GatewayRouteSpecProperty):
          GatewayRouteSpecProperty = CdkObjectWrappers.wrap(cdkObject) as GatewayRouteSpecProperty

      internal fun unwrap(wrapped: GatewayRouteSpecProperty):
          software.amazon.awscdk.services.appmesh.CfnGatewayRoute.GatewayRouteSpecProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.appmesh.CfnGatewayRoute.GatewayRouteSpecProperty
    }
  }

  /**
   * An object that represents the HTTP header in the gateway route.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.appmesh.*;
   * HttpGatewayRouteHeaderProperty httpGatewayRouteHeaderProperty =
   * HttpGatewayRouteHeaderProperty.builder()
   * .name("name")
   * // the properties below are optional
   * .invert(false)
   * .match(HttpGatewayRouteHeaderMatchProperty.builder()
   * .exact("exact")
   * .prefix("prefix")
   * .range(GatewayRouteRangeMatchProperty.builder()
   * .end(123)
   * .start(123)
   * .build())
   * .regex("regex")
   * .suffix("suffix")
   * .build())
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-gatewayroute-httpgatewayrouteheader.html)
   */
  public interface HttpGatewayRouteHeaderProperty {
    /**
     * Specify `True` to match anything except the match criteria.
     *
     * The default value is `False` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-gatewayroute-httpgatewayrouteheader.html#cfn-appmesh-gatewayroute-httpgatewayrouteheader-invert)
     */
    public fun invert(): Any? = unwrap(this).getInvert()

    /**
     * An object that represents the method and value to match with the header value sent in a
     * request.
     *
     * Specify one match method.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-gatewayroute-httpgatewayrouteheader.html#cfn-appmesh-gatewayroute-httpgatewayrouteheader-match)
     */
    public fun match(): Any? = unwrap(this).getMatch()

    /**
     * A name for the HTTP header in the gateway route that will be matched on.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-gatewayroute-httpgatewayrouteheader.html#cfn-appmesh-gatewayroute-httpgatewayrouteheader-name)
     */
    public fun name(): String

    /**
     * A builder for [HttpGatewayRouteHeaderProperty]
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
       * @param match An object that represents the method and value to match with the header value
       * sent in a request.
       * Specify one match method.
       */
      public fun match(match: IResolvable)

      /**
       * @param match An object that represents the method and value to match with the header value
       * sent in a request.
       * Specify one match method.
       */
      public fun match(match: HttpGatewayRouteHeaderMatchProperty)

      /**
       * @param match An object that represents the method and value to match with the header value
       * sent in a request.
       * Specify one match method.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("0dfbf8b5058ffc7d2fed5abeefc1451a07414615f5375f1e140ad6ab77474b84")
      public fun match(match: HttpGatewayRouteHeaderMatchProperty.Builder.() -> Unit)

      /**
       * @param name A name for the HTTP header in the gateway route that will be matched on. 
       */
      public fun name(name: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.appmesh.CfnGatewayRoute.HttpGatewayRouteHeaderProperty.Builder
          =
          software.amazon.awscdk.services.appmesh.CfnGatewayRoute.HttpGatewayRouteHeaderProperty.builder()

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
       * @param match An object that represents the method and value to match with the header value
       * sent in a request.
       * Specify one match method.
       */
      override fun match(match: IResolvable) {
        cdkBuilder.match(match.let(IResolvable::unwrap))
      }

      /**
       * @param match An object that represents the method and value to match with the header value
       * sent in a request.
       * Specify one match method.
       */
      override fun match(match: HttpGatewayRouteHeaderMatchProperty) {
        cdkBuilder.match(match.let(HttpGatewayRouteHeaderMatchProperty::unwrap))
      }

      /**
       * @param match An object that represents the method and value to match with the header value
       * sent in a request.
       * Specify one match method.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("0dfbf8b5058ffc7d2fed5abeefc1451a07414615f5375f1e140ad6ab77474b84")
      override fun match(match: HttpGatewayRouteHeaderMatchProperty.Builder.() -> Unit): Unit =
          match(HttpGatewayRouteHeaderMatchProperty(match))

      /**
       * @param name A name for the HTTP header in the gateway route that will be matched on. 
       */
      override fun name(name: String) {
        cdkBuilder.name(name)
      }

      public fun build():
          software.amazon.awscdk.services.appmesh.CfnGatewayRoute.HttpGatewayRouteHeaderProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.appmesh.CfnGatewayRoute.HttpGatewayRouteHeaderProperty,
    ) : CdkObject(cdkObject), HttpGatewayRouteHeaderProperty {
      /**
       * Specify `True` to match anything except the match criteria.
       *
       * The default value is `False` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-gatewayroute-httpgatewayrouteheader.html#cfn-appmesh-gatewayroute-httpgatewayrouteheader-invert)
       */
      override fun invert(): Any? = unwrap(this).getInvert()

      /**
       * An object that represents the method and value to match with the header value sent in a
       * request.
       *
       * Specify one match method.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-gatewayroute-httpgatewayrouteheader.html#cfn-appmesh-gatewayroute-httpgatewayrouteheader-match)
       */
      override fun match(): Any? = unwrap(this).getMatch()

      /**
       * A name for the HTTP header in the gateway route that will be matched on.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-gatewayroute-httpgatewayrouteheader.html#cfn-appmesh-gatewayroute-httpgatewayrouteheader-name)
       */
      override fun name(): String = unwrap(this).getName()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): HttpGatewayRouteHeaderProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.appmesh.CfnGatewayRoute.HttpGatewayRouteHeaderProperty):
          HttpGatewayRouteHeaderProperty = CdkObjectWrappers.wrap(cdkObject) as
          HttpGatewayRouteHeaderProperty

      internal fun unwrap(wrapped: HttpGatewayRouteHeaderProperty):
          software.amazon.awscdk.services.appmesh.CfnGatewayRoute.HttpGatewayRouteHeaderProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.appmesh.CfnGatewayRoute.HttpGatewayRouteHeaderProperty
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
   * GrpcGatewayRouteActionProperty grpcGatewayRouteActionProperty =
   * GrpcGatewayRouteActionProperty.builder()
   * .target(GatewayRouteTargetProperty.builder()
   * .virtualService(GatewayRouteVirtualServiceProperty.builder()
   * .virtualServiceName("virtualServiceName")
   * .build())
   * // the properties below are optional
   * .port(123)
   * .build())
   * // the properties below are optional
   * .rewrite(GrpcGatewayRouteRewriteProperty.builder()
   * .hostname(GatewayRouteHostnameRewriteProperty.builder()
   * .defaultTargetHostname("defaultTargetHostname")
   * .build())
   * .build())
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-gatewayroute-grpcgatewayrouteaction.html)
   */
  public interface GrpcGatewayRouteActionProperty {
    /**
     * The gateway route action to rewrite.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-gatewayroute-grpcgatewayrouteaction.html#cfn-appmesh-gatewayroute-grpcgatewayrouteaction-rewrite)
     */
    public fun rewrite(): Any? = unwrap(this).getRewrite()

    /**
     * An object that represents the target that traffic is routed to when a request matches the
     * gateway route.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-gatewayroute-grpcgatewayrouteaction.html#cfn-appmesh-gatewayroute-grpcgatewayrouteaction-target)
     */
    public fun target(): Any

    /**
     * A builder for [GrpcGatewayRouteActionProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param rewrite The gateway route action to rewrite.
       */
      public fun rewrite(rewrite: IResolvable)

      /**
       * @param rewrite The gateway route action to rewrite.
       */
      public fun rewrite(rewrite: GrpcGatewayRouteRewriteProperty)

      /**
       * @param rewrite The gateway route action to rewrite.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("5945a157de2f1f923ea34ca95471cf4dbdba908f2b97297eae085b7406dc0921")
      public fun rewrite(rewrite: GrpcGatewayRouteRewriteProperty.Builder.() -> Unit)

      /**
       * @param target An object that represents the target that traffic is routed to when a request
       * matches the gateway route. 
       */
      public fun target(target: IResolvable)

      /**
       * @param target An object that represents the target that traffic is routed to when a request
       * matches the gateway route. 
       */
      public fun target(target: GatewayRouteTargetProperty)

      /**
       * @param target An object that represents the target that traffic is routed to when a request
       * matches the gateway route. 
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("4a0812448e5aad1c8c7d0bc2131687925875fd12f5fd359b6ee7786c6dfddb91")
      public fun target(target: GatewayRouteTargetProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.appmesh.CfnGatewayRoute.GrpcGatewayRouteActionProperty.Builder
          =
          software.amazon.awscdk.services.appmesh.CfnGatewayRoute.GrpcGatewayRouteActionProperty.builder()

      /**
       * @param rewrite The gateway route action to rewrite.
       */
      override fun rewrite(rewrite: IResolvable) {
        cdkBuilder.rewrite(rewrite.let(IResolvable::unwrap))
      }

      /**
       * @param rewrite The gateway route action to rewrite.
       */
      override fun rewrite(rewrite: GrpcGatewayRouteRewriteProperty) {
        cdkBuilder.rewrite(rewrite.let(GrpcGatewayRouteRewriteProperty::unwrap))
      }

      /**
       * @param rewrite The gateway route action to rewrite.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("5945a157de2f1f923ea34ca95471cf4dbdba908f2b97297eae085b7406dc0921")
      override fun rewrite(rewrite: GrpcGatewayRouteRewriteProperty.Builder.() -> Unit): Unit =
          rewrite(GrpcGatewayRouteRewriteProperty(rewrite))

      /**
       * @param target An object that represents the target that traffic is routed to when a request
       * matches the gateway route. 
       */
      override fun target(target: IResolvable) {
        cdkBuilder.target(target.let(IResolvable::unwrap))
      }

      /**
       * @param target An object that represents the target that traffic is routed to when a request
       * matches the gateway route. 
       */
      override fun target(target: GatewayRouteTargetProperty) {
        cdkBuilder.target(target.let(GatewayRouteTargetProperty::unwrap))
      }

      /**
       * @param target An object that represents the target that traffic is routed to when a request
       * matches the gateway route. 
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("4a0812448e5aad1c8c7d0bc2131687925875fd12f5fd359b6ee7786c6dfddb91")
      override fun target(target: GatewayRouteTargetProperty.Builder.() -> Unit): Unit =
          target(GatewayRouteTargetProperty(target))

      public fun build():
          software.amazon.awscdk.services.appmesh.CfnGatewayRoute.GrpcGatewayRouteActionProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.appmesh.CfnGatewayRoute.GrpcGatewayRouteActionProperty,
    ) : CdkObject(cdkObject), GrpcGatewayRouteActionProperty {
      /**
       * The gateway route action to rewrite.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-gatewayroute-grpcgatewayrouteaction.html#cfn-appmesh-gatewayroute-grpcgatewayrouteaction-rewrite)
       */
      override fun rewrite(): Any? = unwrap(this).getRewrite()

      /**
       * An object that represents the target that traffic is routed to when a request matches the
       * gateway route.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-gatewayroute-grpcgatewayrouteaction.html#cfn-appmesh-gatewayroute-grpcgatewayrouteaction-target)
       */
      override fun target(): Any = unwrap(this).getTarget()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): GrpcGatewayRouteActionProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.appmesh.CfnGatewayRoute.GrpcGatewayRouteActionProperty):
          GrpcGatewayRouteActionProperty = CdkObjectWrappers.wrap(cdkObject) as
          GrpcGatewayRouteActionProperty

      internal fun unwrap(wrapped: GrpcGatewayRouteActionProperty):
          software.amazon.awscdk.services.appmesh.CfnGatewayRoute.GrpcGatewayRouteActionProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.appmesh.CfnGatewayRoute.GrpcGatewayRouteActionProperty
    }
  }

  /**
   * An object that represents the virtual service that traffic is routed to.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.appmesh.*;
   * GatewayRouteVirtualServiceProperty gatewayRouteVirtualServiceProperty =
   * GatewayRouteVirtualServiceProperty.builder()
   * .virtualServiceName("virtualServiceName")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-gatewayroute-gatewayroutevirtualservice.html)
   */
  public interface GatewayRouteVirtualServiceProperty {
    /**
     * The name of the virtual service that traffic is routed to.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-gatewayroute-gatewayroutevirtualservice.html#cfn-appmesh-gatewayroute-gatewayroutevirtualservice-virtualservicename)
     */
    public fun virtualServiceName(): String

    /**
     * A builder for [GatewayRouteVirtualServiceProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param virtualServiceName The name of the virtual service that traffic is routed to. 
       */
      public fun virtualServiceName(virtualServiceName: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.appmesh.CfnGatewayRoute.GatewayRouteVirtualServiceProperty.Builder
          =
          software.amazon.awscdk.services.appmesh.CfnGatewayRoute.GatewayRouteVirtualServiceProperty.builder()

      /**
       * @param virtualServiceName The name of the virtual service that traffic is routed to. 
       */
      override fun virtualServiceName(virtualServiceName: String) {
        cdkBuilder.virtualServiceName(virtualServiceName)
      }

      public fun build():
          software.amazon.awscdk.services.appmesh.CfnGatewayRoute.GatewayRouteVirtualServiceProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.appmesh.CfnGatewayRoute.GatewayRouteVirtualServiceProperty,
    ) : CdkObject(cdkObject), GatewayRouteVirtualServiceProperty {
      /**
       * The name of the virtual service that traffic is routed to.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-gatewayroute-gatewayroutevirtualservice.html#cfn-appmesh-gatewayroute-gatewayroutevirtualservice-virtualservicename)
       */
      override fun virtualServiceName(): String = unwrap(this).getVirtualServiceName()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          GatewayRouteVirtualServiceProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.appmesh.CfnGatewayRoute.GatewayRouteVirtualServiceProperty):
          GatewayRouteVirtualServiceProperty = CdkObjectWrappers.wrap(cdkObject) as
          GatewayRouteVirtualServiceProperty

      internal fun unwrap(wrapped: GatewayRouteVirtualServiceProperty):
          software.amazon.awscdk.services.appmesh.CfnGatewayRoute.GatewayRouteVirtualServiceProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.appmesh.CfnGatewayRoute.GatewayRouteVirtualServiceProperty
    }
  }

  /**
   * An object that represents a gRPC gateway route.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.appmesh.*;
   * GrpcGatewayRouteProperty grpcGatewayRouteProperty = GrpcGatewayRouteProperty.builder()
   * .action(GrpcGatewayRouteActionProperty.builder()
   * .target(GatewayRouteTargetProperty.builder()
   * .virtualService(GatewayRouteVirtualServiceProperty.builder()
   * .virtualServiceName("virtualServiceName")
   * .build())
   * // the properties below are optional
   * .port(123)
   * .build())
   * // the properties below are optional
   * .rewrite(GrpcGatewayRouteRewriteProperty.builder()
   * .hostname(GatewayRouteHostnameRewriteProperty.builder()
   * .defaultTargetHostname("defaultTargetHostname")
   * .build())
   * .build())
   * .build())
   * .match(GrpcGatewayRouteMatchProperty.builder()
   * .hostname(GatewayRouteHostnameMatchProperty.builder()
   * .exact("exact")
   * .suffix("suffix")
   * .build())
   * .metadata(List.of(GrpcGatewayRouteMetadataProperty.builder()
   * .name("name")
   * // the properties below are optional
   * .invert(false)
   * .match(GatewayRouteMetadataMatchProperty.builder()
   * .exact("exact")
   * .prefix("prefix")
   * .range(GatewayRouteRangeMatchProperty.builder()
   * .end(123)
   * .start(123)
   * .build())
   * .regex("regex")
   * .suffix("suffix")
   * .build())
   * .build()))
   * .port(123)
   * .serviceName("serviceName")
   * .build())
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-gatewayroute-grpcgatewayroute.html)
   */
  public interface GrpcGatewayRouteProperty {
    /**
     * An object that represents the action to take if a match is determined.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-gatewayroute-grpcgatewayroute.html#cfn-appmesh-gatewayroute-grpcgatewayroute-action)
     */
    public fun action(): Any

    /**
     * An object that represents the criteria for determining a request match.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-gatewayroute-grpcgatewayroute.html#cfn-appmesh-gatewayroute-grpcgatewayroute-match)
     */
    public fun match(): Any

    /**
     * A builder for [GrpcGatewayRouteProperty]
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
      public fun action(action: GrpcGatewayRouteActionProperty)

      /**
       * @param action An object that represents the action to take if a match is determined. 
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("d799c5cc1629cd2c3aa08a919954cb15221596855193923dd8db4a92b52d8c49")
      public fun action(action: GrpcGatewayRouteActionProperty.Builder.() -> Unit)

      /**
       * @param match An object that represents the criteria for determining a request match. 
       */
      public fun match(match: IResolvable)

      /**
       * @param match An object that represents the criteria for determining a request match. 
       */
      public fun match(match: GrpcGatewayRouteMatchProperty)

      /**
       * @param match An object that represents the criteria for determining a request match. 
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("5562889ffa0f866f2b2b44904b1ad3ccfeeb885c7f120e484411dbb71f1b253d")
      public fun match(match: GrpcGatewayRouteMatchProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.appmesh.CfnGatewayRoute.GrpcGatewayRouteProperty.Builder =
          software.amazon.awscdk.services.appmesh.CfnGatewayRoute.GrpcGatewayRouteProperty.builder()

      /**
       * @param action An object that represents the action to take if a match is determined. 
       */
      override fun action(action: IResolvable) {
        cdkBuilder.action(action.let(IResolvable::unwrap))
      }

      /**
       * @param action An object that represents the action to take if a match is determined. 
       */
      override fun action(action: GrpcGatewayRouteActionProperty) {
        cdkBuilder.action(action.let(GrpcGatewayRouteActionProperty::unwrap))
      }

      /**
       * @param action An object that represents the action to take if a match is determined. 
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("d799c5cc1629cd2c3aa08a919954cb15221596855193923dd8db4a92b52d8c49")
      override fun action(action: GrpcGatewayRouteActionProperty.Builder.() -> Unit): Unit =
          action(GrpcGatewayRouteActionProperty(action))

      /**
       * @param match An object that represents the criteria for determining a request match. 
       */
      override fun match(match: IResolvable) {
        cdkBuilder.match(match.let(IResolvable::unwrap))
      }

      /**
       * @param match An object that represents the criteria for determining a request match. 
       */
      override fun match(match: GrpcGatewayRouteMatchProperty) {
        cdkBuilder.match(match.let(GrpcGatewayRouteMatchProperty::unwrap))
      }

      /**
       * @param match An object that represents the criteria for determining a request match. 
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("5562889ffa0f866f2b2b44904b1ad3ccfeeb885c7f120e484411dbb71f1b253d")
      override fun match(match: GrpcGatewayRouteMatchProperty.Builder.() -> Unit): Unit =
          match(GrpcGatewayRouteMatchProperty(match))

      public fun build():
          software.amazon.awscdk.services.appmesh.CfnGatewayRoute.GrpcGatewayRouteProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.appmesh.CfnGatewayRoute.GrpcGatewayRouteProperty,
    ) : CdkObject(cdkObject), GrpcGatewayRouteProperty {
      /**
       * An object that represents the action to take if a match is determined.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-gatewayroute-grpcgatewayroute.html#cfn-appmesh-gatewayroute-grpcgatewayroute-action)
       */
      override fun action(): Any = unwrap(this).getAction()

      /**
       * An object that represents the criteria for determining a request match.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-gatewayroute-grpcgatewayroute.html#cfn-appmesh-gatewayroute-grpcgatewayroute-match)
       */
      override fun match(): Any = unwrap(this).getMatch()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): GrpcGatewayRouteProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.appmesh.CfnGatewayRoute.GrpcGatewayRouteProperty):
          GrpcGatewayRouteProperty = CdkObjectWrappers.wrap(cdkObject) as GrpcGatewayRouteProperty

      internal fun unwrap(wrapped: GrpcGatewayRouteProperty):
          software.amazon.awscdk.services.appmesh.CfnGatewayRoute.GrpcGatewayRouteProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.appmesh.CfnGatewayRoute.GrpcGatewayRouteProperty
    }
  }

  /**
   * An object representing the metadata of the gateway route.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.appmesh.*;
   * GrpcGatewayRouteMetadataProperty grpcGatewayRouteMetadataProperty =
   * GrpcGatewayRouteMetadataProperty.builder()
   * .name("name")
   * // the properties below are optional
   * .invert(false)
   * .match(GatewayRouteMetadataMatchProperty.builder()
   * .exact("exact")
   * .prefix("prefix")
   * .range(GatewayRouteRangeMatchProperty.builder()
   * .end(123)
   * .start(123)
   * .build())
   * .regex("regex")
   * .suffix("suffix")
   * .build())
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-gatewayroute-grpcgatewayroutemetadata.html)
   */
  public interface GrpcGatewayRouteMetadataProperty {
    /**
     * Specify `True` to match anything except the match criteria.
     *
     * The default value is `False` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-gatewayroute-grpcgatewayroutemetadata.html#cfn-appmesh-gatewayroute-grpcgatewayroutemetadata-invert)
     */
    public fun invert(): Any? = unwrap(this).getInvert()

    /**
     * The criteria for determining a metadata match.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-gatewayroute-grpcgatewayroutemetadata.html#cfn-appmesh-gatewayroute-grpcgatewayroutemetadata-match)
     */
    public fun match(): Any? = unwrap(this).getMatch()

    /**
     * A name for the gateway route metadata.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-gatewayroute-grpcgatewayroutemetadata.html#cfn-appmesh-gatewayroute-grpcgatewayroutemetadata-name)
     */
    public fun name(): String

    /**
     * A builder for [GrpcGatewayRouteMetadataProperty]
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
       * @param match The criteria for determining a metadata match.
       */
      public fun match(match: IResolvable)

      /**
       * @param match The criteria for determining a metadata match.
       */
      public fun match(match: GatewayRouteMetadataMatchProperty)

      /**
       * @param match The criteria for determining a metadata match.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("23f4becdd8860f5679dbd1ee5baedea108c816767defd9d65496e9e32e99d6e2")
      public fun match(match: GatewayRouteMetadataMatchProperty.Builder.() -> Unit)

      /**
       * @param name A name for the gateway route metadata. 
       */
      public fun name(name: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.appmesh.CfnGatewayRoute.GrpcGatewayRouteMetadataProperty.Builder
          =
          software.amazon.awscdk.services.appmesh.CfnGatewayRoute.GrpcGatewayRouteMetadataProperty.builder()

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
       * @param match The criteria for determining a metadata match.
       */
      override fun match(match: IResolvable) {
        cdkBuilder.match(match.let(IResolvable::unwrap))
      }

      /**
       * @param match The criteria for determining a metadata match.
       */
      override fun match(match: GatewayRouteMetadataMatchProperty) {
        cdkBuilder.match(match.let(GatewayRouteMetadataMatchProperty::unwrap))
      }

      /**
       * @param match The criteria for determining a metadata match.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("23f4becdd8860f5679dbd1ee5baedea108c816767defd9d65496e9e32e99d6e2")
      override fun match(match: GatewayRouteMetadataMatchProperty.Builder.() -> Unit): Unit =
          match(GatewayRouteMetadataMatchProperty(match))

      /**
       * @param name A name for the gateway route metadata. 
       */
      override fun name(name: String) {
        cdkBuilder.name(name)
      }

      public fun build():
          software.amazon.awscdk.services.appmesh.CfnGatewayRoute.GrpcGatewayRouteMetadataProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.appmesh.CfnGatewayRoute.GrpcGatewayRouteMetadataProperty,
    ) : CdkObject(cdkObject), GrpcGatewayRouteMetadataProperty {
      /**
       * Specify `True` to match anything except the match criteria.
       *
       * The default value is `False` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-gatewayroute-grpcgatewayroutemetadata.html#cfn-appmesh-gatewayroute-grpcgatewayroutemetadata-invert)
       */
      override fun invert(): Any? = unwrap(this).getInvert()

      /**
       * The criteria for determining a metadata match.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-gatewayroute-grpcgatewayroutemetadata.html#cfn-appmesh-gatewayroute-grpcgatewayroutemetadata-match)
       */
      override fun match(): Any? = unwrap(this).getMatch()

      /**
       * A name for the gateway route metadata.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-gatewayroute-grpcgatewayroutemetadata.html#cfn-appmesh-gatewayroute-grpcgatewayroutemetadata-name)
       */
      override fun name(): String = unwrap(this).getName()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): GrpcGatewayRouteMetadataProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.appmesh.CfnGatewayRoute.GrpcGatewayRouteMetadataProperty):
          GrpcGatewayRouteMetadataProperty = CdkObjectWrappers.wrap(cdkObject) as
          GrpcGatewayRouteMetadataProperty

      internal fun unwrap(wrapped: GrpcGatewayRouteMetadataProperty):
          software.amazon.awscdk.services.appmesh.CfnGatewayRoute.GrpcGatewayRouteMetadataProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.appmesh.CfnGatewayRoute.GrpcGatewayRouteMetadataProperty
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
   * HttpGatewayRouteHeaderMatchProperty httpGatewayRouteHeaderMatchProperty =
   * HttpGatewayRouteHeaderMatchProperty.builder()
   * .exact("exact")
   * .prefix("prefix")
   * .range(GatewayRouteRangeMatchProperty.builder()
   * .end(123)
   * .start(123)
   * .build())
   * .regex("regex")
   * .suffix("suffix")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-gatewayroute-httpgatewayrouteheadermatch.html)
   */
  public interface HttpGatewayRouteHeaderMatchProperty {
    /**
     * The value sent by the client must match the specified value exactly.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-gatewayroute-httpgatewayrouteheadermatch.html#cfn-appmesh-gatewayroute-httpgatewayrouteheadermatch-exact)
     */
    public fun exact(): String? = unwrap(this).getExact()

    /**
     * The value sent by the client must begin with the specified characters.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-gatewayroute-httpgatewayrouteheadermatch.html#cfn-appmesh-gatewayroute-httpgatewayrouteheadermatch-prefix)
     */
    public fun prefix(): String? = unwrap(this).getPrefix()

    /**
     * An object that represents the range of values to match on.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-gatewayroute-httpgatewayrouteheadermatch.html#cfn-appmesh-gatewayroute-httpgatewayrouteheadermatch-range)
     */
    public fun range(): Any? = unwrap(this).getRange()

    /**
     * The value sent by the client must include the specified characters.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-gatewayroute-httpgatewayrouteheadermatch.html#cfn-appmesh-gatewayroute-httpgatewayrouteheadermatch-regex)
     */
    public fun regex(): String? = unwrap(this).getRegex()

    /**
     * The value sent by the client must end with the specified characters.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-gatewayroute-httpgatewayrouteheadermatch.html#cfn-appmesh-gatewayroute-httpgatewayrouteheadermatch-suffix)
     */
    public fun suffix(): String? = unwrap(this).getSuffix()

    /**
     * A builder for [HttpGatewayRouteHeaderMatchProperty]
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
      public fun range(range: GatewayRouteRangeMatchProperty)

      /**
       * @param range An object that represents the range of values to match on.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("6960f9384dbb08a16d8003ef5cffeab85b10084f63688a9fd9b28fb14d3df3d2")
      public fun range(range: GatewayRouteRangeMatchProperty.Builder.() -> Unit)

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
          software.amazon.awscdk.services.appmesh.CfnGatewayRoute.HttpGatewayRouteHeaderMatchProperty.Builder
          =
          software.amazon.awscdk.services.appmesh.CfnGatewayRoute.HttpGatewayRouteHeaderMatchProperty.builder()

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
      override fun range(range: GatewayRouteRangeMatchProperty) {
        cdkBuilder.range(range.let(GatewayRouteRangeMatchProperty::unwrap))
      }

      /**
       * @param range An object that represents the range of values to match on.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("6960f9384dbb08a16d8003ef5cffeab85b10084f63688a9fd9b28fb14d3df3d2")
      override fun range(range: GatewayRouteRangeMatchProperty.Builder.() -> Unit): Unit =
          range(GatewayRouteRangeMatchProperty(range))

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
          software.amazon.awscdk.services.appmesh.CfnGatewayRoute.HttpGatewayRouteHeaderMatchProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.appmesh.CfnGatewayRoute.HttpGatewayRouteHeaderMatchProperty,
    ) : CdkObject(cdkObject), HttpGatewayRouteHeaderMatchProperty {
      /**
       * The value sent by the client must match the specified value exactly.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-gatewayroute-httpgatewayrouteheadermatch.html#cfn-appmesh-gatewayroute-httpgatewayrouteheadermatch-exact)
       */
      override fun exact(): String? = unwrap(this).getExact()

      /**
       * The value sent by the client must begin with the specified characters.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-gatewayroute-httpgatewayrouteheadermatch.html#cfn-appmesh-gatewayroute-httpgatewayrouteheadermatch-prefix)
       */
      override fun prefix(): String? = unwrap(this).getPrefix()

      /**
       * An object that represents the range of values to match on.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-gatewayroute-httpgatewayrouteheadermatch.html#cfn-appmesh-gatewayroute-httpgatewayrouteheadermatch-range)
       */
      override fun range(): Any? = unwrap(this).getRange()

      /**
       * The value sent by the client must include the specified characters.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-gatewayroute-httpgatewayrouteheadermatch.html#cfn-appmesh-gatewayroute-httpgatewayrouteheadermatch-regex)
       */
      override fun regex(): String? = unwrap(this).getRegex()

      /**
       * The value sent by the client must end with the specified characters.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-gatewayroute-httpgatewayrouteheadermatch.html#cfn-appmesh-gatewayroute-httpgatewayrouteheadermatch-suffix)
       */
      override fun suffix(): String? = unwrap(this).getSuffix()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          HttpGatewayRouteHeaderMatchProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.appmesh.CfnGatewayRoute.HttpGatewayRouteHeaderMatchProperty):
          HttpGatewayRouteHeaderMatchProperty = CdkObjectWrappers.wrap(cdkObject) as
          HttpGatewayRouteHeaderMatchProperty

      internal fun unwrap(wrapped: HttpGatewayRouteHeaderMatchProperty):
          software.amazon.awscdk.services.appmesh.CfnGatewayRoute.HttpGatewayRouteHeaderMatchProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.appmesh.CfnGatewayRoute.HttpGatewayRouteHeaderMatchProperty
    }
  }
}
