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
 * Creates a virtual node within a service mesh.
 *
 * A virtual node acts as a logical pointer to a particular task group, such as an Amazon ECS
 * service or a Kubernetes deployment. When you create a virtual node, you can specify the service
 * discovery information for your task group, and whether the proxy running in a task group will
 * communicate with other proxies using Transport Layer Security (TLS).
 *
 * You define a `listener` for any inbound traffic that your virtual node expects. Any virtual
 * service that your virtual node expects to communicate to is specified as a `backend` .
 *
 * The response metadata for your new virtual node contains the `arn` that is associated with the
 * virtual node. Set this value to the full ARN; for example,
 * `arn:aws:appmesh:us-west-2:123456789012:myMesh/default/virtualNode/myApp` ) as the
 * `APPMESH_RESOURCE_ARN` environment variable for your task group's Envoy proxy container in your task
 * definition or pod spec. This is then mapped to the `node.id` and `node.cluster` Envoy parameters.
 *
 *
 * By default, App Mesh uses the name of the resource you specified in `APPMESH_RESOURCE_ARN` when
 * Envoy is referring to itself in metrics and traces. You can override this behavior by setting the
 * `APPMESH_RESOURCE_CLUSTER` environment variable with your own name.
 *
 *
 * For more information about virtual nodes, see [Virtual
 * nodes](https://docs.aws.amazon.com/app-mesh/latest/userguide/virtual_nodes.html) . You must be using
 * `1.15.0` or later of the Envoy image when setting these variables. For more information aboutApp
 * Mesh Envoy variables, see [Envoy
 * image](https://docs.aws.amazon.com/app-mesh/latest/userguide/envoy.html) in the AWS App Mesh User
 * Guide.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.appmesh.*;
 * CfnVirtualNode cfnVirtualNode = CfnVirtualNode.Builder.create(this, "MyCfnVirtualNode")
 * .meshName("meshName")
 * .spec(VirtualNodeSpecProperty.builder()
 * .backendDefaults(BackendDefaultsProperty.builder()
 * .clientPolicy(ClientPolicyProperty.builder()
 * .tls(ClientPolicyTlsProperty.builder()
 * .validation(TlsValidationContextProperty.builder()
 * .trust(TlsValidationContextTrustProperty.builder()
 * .acm(TlsValidationContextAcmTrustProperty.builder()
 * .certificateAuthorityArns(List.of("certificateAuthorityArns"))
 * .build())
 * .file(TlsValidationContextFileTrustProperty.builder()
 * .certificateChain("certificateChain")
 * .build())
 * .sds(TlsValidationContextSdsTrustProperty.builder()
 * .secretName("secretName")
 * .build())
 * .build())
 * // the properties below are optional
 * .subjectAlternativeNames(SubjectAlternativeNamesProperty.builder()
 * .match(SubjectAlternativeNameMatchersProperty.builder()
 * .exact(List.of("exact"))
 * .build())
 * .build())
 * .build())
 * // the properties below are optional
 * .certificate(ClientTlsCertificateProperty.builder()
 * .file(ListenerTlsFileCertificateProperty.builder()
 * .certificateChain("certificateChain")
 * .privateKey("privateKey")
 * .build())
 * .sds(ListenerTlsSdsCertificateProperty.builder()
 * .secretName("secretName")
 * .build())
 * .build())
 * .enforce(false)
 * .ports(List.of(123))
 * .build())
 * .build())
 * .build())
 * .backends(List.of(BackendProperty.builder()
 * .virtualService(VirtualServiceBackendProperty.builder()
 * .virtualServiceName("virtualServiceName")
 * // the properties below are optional
 * .clientPolicy(ClientPolicyProperty.builder()
 * .tls(ClientPolicyTlsProperty.builder()
 * .validation(TlsValidationContextProperty.builder()
 * .trust(TlsValidationContextTrustProperty.builder()
 * .acm(TlsValidationContextAcmTrustProperty.builder()
 * .certificateAuthorityArns(List.of("certificateAuthorityArns"))
 * .build())
 * .file(TlsValidationContextFileTrustProperty.builder()
 * .certificateChain("certificateChain")
 * .build())
 * .sds(TlsValidationContextSdsTrustProperty.builder()
 * .secretName("secretName")
 * .build())
 * .build())
 * // the properties below are optional
 * .subjectAlternativeNames(SubjectAlternativeNamesProperty.builder()
 * .match(SubjectAlternativeNameMatchersProperty.builder()
 * .exact(List.of("exact"))
 * .build())
 * .build())
 * .build())
 * // the properties below are optional
 * .certificate(ClientTlsCertificateProperty.builder()
 * .file(ListenerTlsFileCertificateProperty.builder()
 * .certificateChain("certificateChain")
 * .privateKey("privateKey")
 * .build())
 * .sds(ListenerTlsSdsCertificateProperty.builder()
 * .secretName("secretName")
 * .build())
 * .build())
 * .enforce(false)
 * .ports(List.of(123))
 * .build())
 * .build())
 * .build())
 * .build()))
 * .listeners(List.of(ListenerProperty.builder()
 * .portMapping(PortMappingProperty.builder()
 * .port(123)
 * .protocol("protocol")
 * .build())
 * // the properties below are optional
 * .connectionPool(VirtualNodeConnectionPoolProperty.builder()
 * .grpc(VirtualNodeGrpcConnectionPoolProperty.builder()
 * .maxRequests(123)
 * .build())
 * .http(VirtualNodeHttpConnectionPoolProperty.builder()
 * .maxConnections(123)
 * // the properties below are optional
 * .maxPendingRequests(123)
 * .build())
 * .http2(VirtualNodeHttp2ConnectionPoolProperty.builder()
 * .maxRequests(123)
 * .build())
 * .tcp(VirtualNodeTcpConnectionPoolProperty.builder()
 * .maxConnections(123)
 * .build())
 * .build())
 * .healthCheck(HealthCheckProperty.builder()
 * .healthyThreshold(123)
 * .intervalMillis(123)
 * .protocol("protocol")
 * .timeoutMillis(123)
 * .unhealthyThreshold(123)
 * // the properties below are optional
 * .path("path")
 * .port(123)
 * .build())
 * .outlierDetection(OutlierDetectionProperty.builder()
 * .baseEjectionDuration(DurationProperty.builder()
 * .unit("unit")
 * .value(123)
 * .build())
 * .interval(DurationProperty.builder()
 * .unit("unit")
 * .value(123)
 * .build())
 * .maxEjectionPercent(123)
 * .maxServerErrors(123)
 * .build())
 * .timeout(ListenerTimeoutProperty.builder()
 * .grpc(GrpcTimeoutProperty.builder()
 * .idle(DurationProperty.builder()
 * .unit("unit")
 * .value(123)
 * .build())
 * .perRequest(DurationProperty.builder()
 * .unit("unit")
 * .value(123)
 * .build())
 * .build())
 * .http(HttpTimeoutProperty.builder()
 * .idle(DurationProperty.builder()
 * .unit("unit")
 * .value(123)
 * .build())
 * .perRequest(DurationProperty.builder()
 * .unit("unit")
 * .value(123)
 * .build())
 * .build())
 * .http2(HttpTimeoutProperty.builder()
 * .idle(DurationProperty.builder()
 * .unit("unit")
 * .value(123)
 * .build())
 * .perRequest(DurationProperty.builder()
 * .unit("unit")
 * .value(123)
 * .build())
 * .build())
 * .tcp(TcpTimeoutProperty.builder()
 * .idle(DurationProperty.builder()
 * .unit("unit")
 * .value(123)
 * .build())
 * .build())
 * .build())
 * .tls(ListenerTlsProperty.builder()
 * .certificate(ListenerTlsCertificateProperty.builder()
 * .acm(ListenerTlsAcmCertificateProperty.builder()
 * .certificateArn("certificateArn")
 * .build())
 * .file(ListenerTlsFileCertificateProperty.builder()
 * .certificateChain("certificateChain")
 * .privateKey("privateKey")
 * .build())
 * .sds(ListenerTlsSdsCertificateProperty.builder()
 * .secretName("secretName")
 * .build())
 * .build())
 * .mode("mode")
 * // the properties below are optional
 * .validation(ListenerTlsValidationContextProperty.builder()
 * .trust(ListenerTlsValidationContextTrustProperty.builder()
 * .file(TlsValidationContextFileTrustProperty.builder()
 * .certificateChain("certificateChain")
 * .build())
 * .sds(TlsValidationContextSdsTrustProperty.builder()
 * .secretName("secretName")
 * .build())
 * .build())
 * // the properties below are optional
 * .subjectAlternativeNames(SubjectAlternativeNamesProperty.builder()
 * .match(SubjectAlternativeNameMatchersProperty.builder()
 * .exact(List.of("exact"))
 * .build())
 * .build())
 * .build())
 * .build())
 * .build()))
 * .logging(LoggingProperty.builder()
 * .accessLog(AccessLogProperty.builder()
 * .file(FileAccessLogProperty.builder()
 * .path("path")
 * // the properties below are optional
 * .format(LoggingFormatProperty.builder()
 * .json(List.of(JsonFormatRefProperty.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .text("text")
 * .build())
 * .build())
 * .build())
 * .build())
 * .serviceDiscovery(ServiceDiscoveryProperty.builder()
 * .awsCloudMap(AwsCloudMapServiceDiscoveryProperty.builder()
 * .namespaceName("namespaceName")
 * .serviceName("serviceName")
 * // the properties below are optional
 * .attributes(List.of(AwsCloudMapInstanceAttributeProperty.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .ipPreference("ipPreference")
 * .build())
 * .dns(DnsServiceDiscoveryProperty.builder()
 * .hostname("hostname")
 * // the properties below are optional
 * .ipPreference("ipPreference")
 * .responseType("responseType")
 * .build())
 * .build())
 * .build())
 * // the properties below are optional
 * .meshOwner("meshOwner")
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .virtualNodeName("virtualNodeName")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appmesh-virtualnode.html)
 */
public open class CfnVirtualNode(
  cdkObject: software.amazon.awscdk.services.appmesh.CfnVirtualNode,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnVirtualNodeProps,
  ) :
      this(software.amazon.awscdk.services.appmesh.CfnVirtualNode(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id, props.let(CfnVirtualNodeProps.Companion::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnVirtualNodeProps.Builder.() -> Unit,
  ) : this(scope, id, CfnVirtualNodeProps(props)
  )

  /**
   * The full Amazon Resource Name (ARN) for the virtual node.
   */
  public open fun attrArn(): String = unwrap(this).getAttrArn()

  /**
   *
   */
  public open fun attrId(): String = unwrap(this).getAttrId()

  /**
   * The name of the service mesh that the virtual node resides in.
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
   * The unique identifier for the virtual node.
   */
  public open fun attrUid(): String = unwrap(this).getAttrUid()

  /**
   * The name of the virtual node.
   */
  public open fun attrVirtualNodeName(): String = unwrap(this).getAttrVirtualNodeName()

  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector.Companion::unwrap))
  }

  /**
   * The name of the service mesh to create the virtual node in.
   */
  public open fun meshName(): String = unwrap(this).getMeshName()

  /**
   * The name of the service mesh to create the virtual node in.
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
   * The virtual node specification to apply.
   */
  public open fun spec(): Any = unwrap(this).getSpec()

  /**
   * The virtual node specification to apply.
   */
  public open fun spec(`value`: IResolvable) {
    unwrap(this).setSpec(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   * The virtual node specification to apply.
   */
  public open fun spec(`value`: VirtualNodeSpecProperty) {
    unwrap(this).setSpec(`value`.let(VirtualNodeSpecProperty.Companion::unwrap))
  }

  /**
   * The virtual node specification to apply.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("670c355d7ff77c011573957b0f75401a6b1a2dc8af7cbc3a4a6c564a14244a52")
  public open fun spec(`value`: VirtualNodeSpecProperty.Builder.() -> Unit): Unit =
      spec(VirtualNodeSpecProperty(`value`))

  /**
   * Tag Manager which manages the tags for this resource.
   */
  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  /**
   * Optional metadata that you can apply to the virtual node to assist with categorization and
   * organization.
   */
  public open fun tagsRaw(): List<CfnTag> = unwrap(this).getTagsRaw()?.map(CfnTag::wrap) ?:
      emptyList()

  /**
   * Optional metadata that you can apply to the virtual node to assist with categorization and
   * organization.
   */
  public open fun tagsRaw(`value`: List<CfnTag>) {
    unwrap(this).setTagsRaw(`value`.map(CfnTag.Companion::unwrap))
  }

  /**
   * Optional metadata that you can apply to the virtual node to assist with categorization and
   * organization.
   */
  public open fun tagsRaw(vararg `value`: CfnTag): Unit = tagsRaw(`value`.toList())

  /**
   * The name to use for the virtual node.
   */
  public open fun virtualNodeName(): String? = unwrap(this).getVirtualNodeName()

  /**
   * The name to use for the virtual node.
   */
  public open fun virtualNodeName(`value`: String) {
    unwrap(this).setVirtualNodeName(`value`)
  }

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.appmesh.CfnVirtualNode].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The name of the service mesh to create the virtual node in.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appmesh-virtualnode.html#cfn-appmesh-virtualnode-meshname)
     * @param meshName The name of the service mesh to create the virtual node in. 
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
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appmesh-virtualnode.html#cfn-appmesh-virtualnode-meshowner)
     * @param meshOwner The AWS IAM account ID of the service mesh owner. 
     */
    public fun meshOwner(meshOwner: String)

    /**
     * The virtual node specification to apply.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appmesh-virtualnode.html#cfn-appmesh-virtualnode-spec)
     * @param spec The virtual node specification to apply. 
     */
    public fun spec(spec: IResolvable)

    /**
     * The virtual node specification to apply.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appmesh-virtualnode.html#cfn-appmesh-virtualnode-spec)
     * @param spec The virtual node specification to apply. 
     */
    public fun spec(spec: VirtualNodeSpecProperty)

    /**
     * The virtual node specification to apply.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appmesh-virtualnode.html#cfn-appmesh-virtualnode-spec)
     * @param spec The virtual node specification to apply. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("1155f49a4f07152dc7878b95fb5bfab1a0c3e50c20c9713c79e31d05776f1ee6")
    public fun spec(spec: VirtualNodeSpecProperty.Builder.() -> Unit)

    /**
     * Optional metadata that you can apply to the virtual node to assist with categorization and
     * organization.
     *
     * Each tag consists of a key and an optional value, both of which you define. Tag keys can have
     * a maximum character length of 128 characters, and tag values can have a maximum length of 256
     * characters.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appmesh-virtualnode.html#cfn-appmesh-virtualnode-tags)
     * @param tags Optional metadata that you can apply to the virtual node to assist with
     * categorization and organization. 
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * Optional metadata that you can apply to the virtual node to assist with categorization and
     * organization.
     *
     * Each tag consists of a key and an optional value, both of which you define. Tag keys can have
     * a maximum character length of 128 characters, and tag values can have a maximum length of 256
     * characters.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appmesh-virtualnode.html#cfn-appmesh-virtualnode-tags)
     * @param tags Optional metadata that you can apply to the virtual node to assist with
     * categorization and organization. 
     */
    public fun tags(vararg tags: CfnTag)

    /**
     * The name to use for the virtual node.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appmesh-virtualnode.html#cfn-appmesh-virtualnode-virtualnodename)
     * @param virtualNodeName The name to use for the virtual node. 
     */
    public fun virtualNodeName(virtualNodeName: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.appmesh.CfnVirtualNode.Builder =
        software.amazon.awscdk.services.appmesh.CfnVirtualNode.Builder.create(scope, id)

    /**
     * The name of the service mesh to create the virtual node in.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appmesh-virtualnode.html#cfn-appmesh-virtualnode-meshname)
     * @param meshName The name of the service mesh to create the virtual node in. 
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
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appmesh-virtualnode.html#cfn-appmesh-virtualnode-meshowner)
     * @param meshOwner The AWS IAM account ID of the service mesh owner. 
     */
    override fun meshOwner(meshOwner: String) {
      cdkBuilder.meshOwner(meshOwner)
    }

    /**
     * The virtual node specification to apply.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appmesh-virtualnode.html#cfn-appmesh-virtualnode-spec)
     * @param spec The virtual node specification to apply. 
     */
    override fun spec(spec: IResolvable) {
      cdkBuilder.spec(spec.let(IResolvable.Companion::unwrap))
    }

    /**
     * The virtual node specification to apply.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appmesh-virtualnode.html#cfn-appmesh-virtualnode-spec)
     * @param spec The virtual node specification to apply. 
     */
    override fun spec(spec: VirtualNodeSpecProperty) {
      cdkBuilder.spec(spec.let(VirtualNodeSpecProperty.Companion::unwrap))
    }

    /**
     * The virtual node specification to apply.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appmesh-virtualnode.html#cfn-appmesh-virtualnode-spec)
     * @param spec The virtual node specification to apply. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("1155f49a4f07152dc7878b95fb5bfab1a0c3e50c20c9713c79e31d05776f1ee6")
    override fun spec(spec: VirtualNodeSpecProperty.Builder.() -> Unit): Unit =
        spec(VirtualNodeSpecProperty(spec))

    /**
     * Optional metadata that you can apply to the virtual node to assist with categorization and
     * organization.
     *
     * Each tag consists of a key and an optional value, both of which you define. Tag keys can have
     * a maximum character length of 128 characters, and tag values can have a maximum length of 256
     * characters.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appmesh-virtualnode.html#cfn-appmesh-virtualnode-tags)
     * @param tags Optional metadata that you can apply to the virtual node to assist with
     * categorization and organization. 
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag.Companion::unwrap))
    }

    /**
     * Optional metadata that you can apply to the virtual node to assist with categorization and
     * organization.
     *
     * Each tag consists of a key and an optional value, both of which you define. Tag keys can have
     * a maximum character length of 128 characters, and tag values can have a maximum length of 256
     * characters.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appmesh-virtualnode.html#cfn-appmesh-virtualnode-tags)
     * @param tags Optional metadata that you can apply to the virtual node to assist with
     * categorization and organization. 
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    /**
     * The name to use for the virtual node.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appmesh-virtualnode.html#cfn-appmesh-virtualnode-virtualnodename)
     * @param virtualNodeName The name to use for the virtual node. 
     */
    override fun virtualNodeName(virtualNodeName: String) {
      cdkBuilder.virtualNodeName(virtualNodeName)
    }

    public fun build(): software.amazon.awscdk.services.appmesh.CfnVirtualNode = cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.appmesh.CfnVirtualNode.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnVirtualNode {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnVirtualNode(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.appmesh.CfnVirtualNode):
        CfnVirtualNode = CfnVirtualNode(cdkObject)

    internal fun unwrap(wrapped: CfnVirtualNode):
        software.amazon.awscdk.services.appmesh.CfnVirtualNode = wrapped.cdkObject as
        software.amazon.awscdk.services.appmesh.CfnVirtualNode
  }

  /**
   * An object that represents the access logging information for a virtual node.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.appmesh.*;
   * AccessLogProperty accessLogProperty = AccessLogProperty.builder()
   * .file(FileAccessLogProperty.builder()
   * .path("path")
   * // the properties below are optional
   * .format(LoggingFormatProperty.builder()
   * .json(List.of(JsonFormatRefProperty.builder()
   * .key("key")
   * .value("value")
   * .build()))
   * .text("text")
   * .build())
   * .build())
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-virtualnode-accesslog.html)
   */
  public interface AccessLogProperty {
    /**
     * The file object to send virtual node access logs to.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-virtualnode-accesslog.html#cfn-appmesh-virtualnode-accesslog-file)
     */
    public fun `file`(): Any? = unwrap(this).getFile()

    /**
     * A builder for [AccessLogProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param file The file object to send virtual node access logs to.
       */
      public fun `file`(`file`: IResolvable)

      /**
       * @param file The file object to send virtual node access logs to.
       */
      public fun `file`(`file`: FileAccessLogProperty)

      /**
       * @param file The file object to send virtual node access logs to.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("77a047efa54dbe4f6bd35e41f99e0b994b871af1fe1cd5f0d009d1c2c47a2962")
      public fun `file`(`file`: FileAccessLogProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.appmesh.CfnVirtualNode.AccessLogProperty.Builder =
          software.amazon.awscdk.services.appmesh.CfnVirtualNode.AccessLogProperty.builder()

      /**
       * @param file The file object to send virtual node access logs to.
       */
      override fun `file`(`file`: IResolvable) {
        cdkBuilder.`file`(`file`.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param file The file object to send virtual node access logs to.
       */
      override fun `file`(`file`: FileAccessLogProperty) {
        cdkBuilder.`file`(`file`.let(FileAccessLogProperty.Companion::unwrap))
      }

      /**
       * @param file The file object to send virtual node access logs to.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("77a047efa54dbe4f6bd35e41f99e0b994b871af1fe1cd5f0d009d1c2c47a2962")
      override fun `file`(`file`: FileAccessLogProperty.Builder.() -> Unit): Unit =
          `file`(FileAccessLogProperty(`file`))

      public fun build(): software.amazon.awscdk.services.appmesh.CfnVirtualNode.AccessLogProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.appmesh.CfnVirtualNode.AccessLogProperty,
    ) : CdkObject(cdkObject), AccessLogProperty {
      /**
       * The file object to send virtual node access logs to.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-virtualnode-accesslog.html#cfn-appmesh-virtualnode-accesslog-file)
       */
      override fun `file`(): Any? = unwrap(this).getFile()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): AccessLogProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.appmesh.CfnVirtualNode.AccessLogProperty):
          AccessLogProperty = CdkObjectWrappers.wrap(cdkObject) as? AccessLogProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: AccessLogProperty):
          software.amazon.awscdk.services.appmesh.CfnVirtualNode.AccessLogProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.appmesh.CfnVirtualNode.AccessLogProperty
    }
  }

  /**
   * An object that represents the AWS Cloud Map attribute information for your virtual node.
   *
   *
   * AWS Cloud Map is not available in the eu-south-1 Region.
   *
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.appmesh.*;
   * AwsCloudMapInstanceAttributeProperty awsCloudMapInstanceAttributeProperty =
   * AwsCloudMapInstanceAttributeProperty.builder()
   * .key("key")
   * .value("value")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-virtualnode-awscloudmapinstanceattribute.html)
   */
  public interface AwsCloudMapInstanceAttributeProperty {
    /**
     * The name of an AWS Cloud Map service instance attribute key.
     *
     * Any AWS Cloud Map service instance that contains the specified key and value is returned.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-virtualnode-awscloudmapinstanceattribute.html#cfn-appmesh-virtualnode-awscloudmapinstanceattribute-key)
     */
    public fun key(): String

    /**
     * The value of an AWS Cloud Map service instance attribute key.
     *
     * Any AWS Cloud Map service instance that contains the specified key and value is returned.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-virtualnode-awscloudmapinstanceattribute.html#cfn-appmesh-virtualnode-awscloudmapinstanceattribute-value)
     */
    public fun `value`(): String

    /**
     * A builder for [AwsCloudMapInstanceAttributeProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param key The name of an AWS Cloud Map service instance attribute key. 
       * Any AWS Cloud Map service instance that contains the specified key and value is returned.
       */
      public fun key(key: String)

      /**
       * @param value The value of an AWS Cloud Map service instance attribute key. 
       * Any AWS Cloud Map service instance that contains the specified key and value is returned.
       */
      public fun `value`(`value`: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.appmesh.CfnVirtualNode.AwsCloudMapInstanceAttributeProperty.Builder
          =
          software.amazon.awscdk.services.appmesh.CfnVirtualNode.AwsCloudMapInstanceAttributeProperty.builder()

      /**
       * @param key The name of an AWS Cloud Map service instance attribute key. 
       * Any AWS Cloud Map service instance that contains the specified key and value is returned.
       */
      override fun key(key: String) {
        cdkBuilder.key(key)
      }

      /**
       * @param value The value of an AWS Cloud Map service instance attribute key. 
       * Any AWS Cloud Map service instance that contains the specified key and value is returned.
       */
      override fun `value`(`value`: String) {
        cdkBuilder.`value`(`value`)
      }

      public fun build():
          software.amazon.awscdk.services.appmesh.CfnVirtualNode.AwsCloudMapInstanceAttributeProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.appmesh.CfnVirtualNode.AwsCloudMapInstanceAttributeProperty,
    ) : CdkObject(cdkObject), AwsCloudMapInstanceAttributeProperty {
      /**
       * The name of an AWS Cloud Map service instance attribute key.
       *
       * Any AWS Cloud Map service instance that contains the specified key and value is returned.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-virtualnode-awscloudmapinstanceattribute.html#cfn-appmesh-virtualnode-awscloudmapinstanceattribute-key)
       */
      override fun key(): String = unwrap(this).getKey()

      /**
       * The value of an AWS Cloud Map service instance attribute key.
       *
       * Any AWS Cloud Map service instance that contains the specified key and value is returned.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-virtualnode-awscloudmapinstanceattribute.html#cfn-appmesh-virtualnode-awscloudmapinstanceattribute-value)
       */
      override fun `value`(): String = unwrap(this).getValue()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          AwsCloudMapInstanceAttributeProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.appmesh.CfnVirtualNode.AwsCloudMapInstanceAttributeProperty):
          AwsCloudMapInstanceAttributeProperty = CdkObjectWrappers.wrap(cdkObject) as?
          AwsCloudMapInstanceAttributeProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: AwsCloudMapInstanceAttributeProperty):
          software.amazon.awscdk.services.appmesh.CfnVirtualNode.AwsCloudMapInstanceAttributeProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.appmesh.CfnVirtualNode.AwsCloudMapInstanceAttributeProperty
    }
  }

  /**
   * An object that represents the AWS Cloud Map service discovery information for your virtual
   * node.
   *
   *
   * AWS Cloud Map is not available in the eu-south-1 Region.
   *
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.appmesh.*;
   * AwsCloudMapServiceDiscoveryProperty awsCloudMapServiceDiscoveryProperty =
   * AwsCloudMapServiceDiscoveryProperty.builder()
   * .namespaceName("namespaceName")
   * .serviceName("serviceName")
   * // the properties below are optional
   * .attributes(List.of(AwsCloudMapInstanceAttributeProperty.builder()
   * .key("key")
   * .value("value")
   * .build()))
   * .ipPreference("ipPreference")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-virtualnode-awscloudmapservicediscovery.html)
   */
  public interface AwsCloudMapServiceDiscoveryProperty {
    /**
     * A string map that contains attributes with values that you can use to filter instances by any
     * custom attribute that you specified when you registered the instance.
     *
     * Only instances that match all of the specified key/value pairs will be returned.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-virtualnode-awscloudmapservicediscovery.html#cfn-appmesh-virtualnode-awscloudmapservicediscovery-attributes)
     */
    public fun attributes(): Any? = unwrap(this).getAttributes()

    /**
     * The preferred IP version that this virtual node uses.
     *
     * Setting the IP preference on the virtual node only overrides the IP preference set for the
     * mesh on this specific node.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-virtualnode-awscloudmapservicediscovery.html#cfn-appmesh-virtualnode-awscloudmapservicediscovery-ippreference)
     */
    public fun ipPreference(): String? = unwrap(this).getIpPreference()

    /**
     * The HTTP name of the AWS Cloud Map namespace to use.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-virtualnode-awscloudmapservicediscovery.html#cfn-appmesh-virtualnode-awscloudmapservicediscovery-namespacename)
     */
    public fun namespaceName(): String

    /**
     * The name of the AWS Cloud Map service to use.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-virtualnode-awscloudmapservicediscovery.html#cfn-appmesh-virtualnode-awscloudmapservicediscovery-servicename)
     */
    public fun serviceName(): String

    /**
     * A builder for [AwsCloudMapServiceDiscoveryProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param attributes A string map that contains attributes with values that you can use to
       * filter instances by any custom attribute that you specified when you registered the instance.
       * Only instances that match all of the specified key/value pairs will be returned.
       */
      public fun attributes(attributes: IResolvable)

      /**
       * @param attributes A string map that contains attributes with values that you can use to
       * filter instances by any custom attribute that you specified when you registered the instance.
       * Only instances that match all of the specified key/value pairs will be returned.
       */
      public fun attributes(attributes: List<Any>)

      /**
       * @param attributes A string map that contains attributes with values that you can use to
       * filter instances by any custom attribute that you specified when you registered the instance.
       * Only instances that match all of the specified key/value pairs will be returned.
       */
      public fun attributes(vararg attributes: Any)

      /**
       * @param ipPreference The preferred IP version that this virtual node uses.
       * Setting the IP preference on the virtual node only overrides the IP preference set for the
       * mesh on this specific node.
       */
      public fun ipPreference(ipPreference: String)

      /**
       * @param namespaceName The HTTP name of the AWS Cloud Map namespace to use. 
       */
      public fun namespaceName(namespaceName: String)

      /**
       * @param serviceName The name of the AWS Cloud Map service to use. 
       */
      public fun serviceName(serviceName: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.appmesh.CfnVirtualNode.AwsCloudMapServiceDiscoveryProperty.Builder
          =
          software.amazon.awscdk.services.appmesh.CfnVirtualNode.AwsCloudMapServiceDiscoveryProperty.builder()

      /**
       * @param attributes A string map that contains attributes with values that you can use to
       * filter instances by any custom attribute that you specified when you registered the instance.
       * Only instances that match all of the specified key/value pairs will be returned.
       */
      override fun attributes(attributes: IResolvable) {
        cdkBuilder.attributes(attributes.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param attributes A string map that contains attributes with values that you can use to
       * filter instances by any custom attribute that you specified when you registered the instance.
       * Only instances that match all of the specified key/value pairs will be returned.
       */
      override fun attributes(attributes: List<Any>) {
        cdkBuilder.attributes(attributes.map{CdkObjectWrappers.unwrap(it)})
      }

      /**
       * @param attributes A string map that contains attributes with values that you can use to
       * filter instances by any custom attribute that you specified when you registered the instance.
       * Only instances that match all of the specified key/value pairs will be returned.
       */
      override fun attributes(vararg attributes: Any): Unit = attributes(attributes.toList())

      /**
       * @param ipPreference The preferred IP version that this virtual node uses.
       * Setting the IP preference on the virtual node only overrides the IP preference set for the
       * mesh on this specific node.
       */
      override fun ipPreference(ipPreference: String) {
        cdkBuilder.ipPreference(ipPreference)
      }

      /**
       * @param namespaceName The HTTP name of the AWS Cloud Map namespace to use. 
       */
      override fun namespaceName(namespaceName: String) {
        cdkBuilder.namespaceName(namespaceName)
      }

      /**
       * @param serviceName The name of the AWS Cloud Map service to use. 
       */
      override fun serviceName(serviceName: String) {
        cdkBuilder.serviceName(serviceName)
      }

      public fun build():
          software.amazon.awscdk.services.appmesh.CfnVirtualNode.AwsCloudMapServiceDiscoveryProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.appmesh.CfnVirtualNode.AwsCloudMapServiceDiscoveryProperty,
    ) : CdkObject(cdkObject), AwsCloudMapServiceDiscoveryProperty {
      /**
       * A string map that contains attributes with values that you can use to filter instances by
       * any custom attribute that you specified when you registered the instance.
       *
       * Only instances that match all of the specified key/value pairs will be returned.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-virtualnode-awscloudmapservicediscovery.html#cfn-appmesh-virtualnode-awscloudmapservicediscovery-attributes)
       */
      override fun attributes(): Any? = unwrap(this).getAttributes()

      /**
       * The preferred IP version that this virtual node uses.
       *
       * Setting the IP preference on the virtual node only overrides the IP preference set for the
       * mesh on this specific node.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-virtualnode-awscloudmapservicediscovery.html#cfn-appmesh-virtualnode-awscloudmapservicediscovery-ippreference)
       */
      override fun ipPreference(): String? = unwrap(this).getIpPreference()

      /**
       * The HTTP name of the AWS Cloud Map namespace to use.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-virtualnode-awscloudmapservicediscovery.html#cfn-appmesh-virtualnode-awscloudmapservicediscovery-namespacename)
       */
      override fun namespaceName(): String = unwrap(this).getNamespaceName()

      /**
       * The name of the AWS Cloud Map service to use.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-virtualnode-awscloudmapservicediscovery.html#cfn-appmesh-virtualnode-awscloudmapservicediscovery-servicename)
       */
      override fun serviceName(): String = unwrap(this).getServiceName()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          AwsCloudMapServiceDiscoveryProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.appmesh.CfnVirtualNode.AwsCloudMapServiceDiscoveryProperty):
          AwsCloudMapServiceDiscoveryProperty = CdkObjectWrappers.wrap(cdkObject) as?
          AwsCloudMapServiceDiscoveryProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: AwsCloudMapServiceDiscoveryProperty):
          software.amazon.awscdk.services.appmesh.CfnVirtualNode.AwsCloudMapServiceDiscoveryProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.appmesh.CfnVirtualNode.AwsCloudMapServiceDiscoveryProperty
    }
  }

  /**
   * An object that represents the default properties for a backend.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.appmesh.*;
   * BackendDefaultsProperty backendDefaultsProperty = BackendDefaultsProperty.builder()
   * .clientPolicy(ClientPolicyProperty.builder()
   * .tls(ClientPolicyTlsProperty.builder()
   * .validation(TlsValidationContextProperty.builder()
   * .trust(TlsValidationContextTrustProperty.builder()
   * .acm(TlsValidationContextAcmTrustProperty.builder()
   * .certificateAuthorityArns(List.of("certificateAuthorityArns"))
   * .build())
   * .file(TlsValidationContextFileTrustProperty.builder()
   * .certificateChain("certificateChain")
   * .build())
   * .sds(TlsValidationContextSdsTrustProperty.builder()
   * .secretName("secretName")
   * .build())
   * .build())
   * // the properties below are optional
   * .subjectAlternativeNames(SubjectAlternativeNamesProperty.builder()
   * .match(SubjectAlternativeNameMatchersProperty.builder()
   * .exact(List.of("exact"))
   * .build())
   * .build())
   * .build())
   * // the properties below are optional
   * .certificate(ClientTlsCertificateProperty.builder()
   * .file(ListenerTlsFileCertificateProperty.builder()
   * .certificateChain("certificateChain")
   * .privateKey("privateKey")
   * .build())
   * .sds(ListenerTlsSdsCertificateProperty.builder()
   * .secretName("secretName")
   * .build())
   * .build())
   * .enforce(false)
   * .ports(List.of(123))
   * .build())
   * .build())
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-virtualnode-backenddefaults.html)
   */
  public interface BackendDefaultsProperty {
    /**
     * A reference to an object that represents a client policy.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-virtualnode-backenddefaults.html#cfn-appmesh-virtualnode-backenddefaults-clientpolicy)
     */
    public fun clientPolicy(): Any? = unwrap(this).getClientPolicy()

    /**
     * A builder for [BackendDefaultsProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param clientPolicy A reference to an object that represents a client policy.
       */
      public fun clientPolicy(clientPolicy: IResolvable)

      /**
       * @param clientPolicy A reference to an object that represents a client policy.
       */
      public fun clientPolicy(clientPolicy: ClientPolicyProperty)

      /**
       * @param clientPolicy A reference to an object that represents a client policy.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("ec82bae459447564b82e97e36187eb807c00ee08eac5befe6bb4c7f379c5866d")
      public fun clientPolicy(clientPolicy: ClientPolicyProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.appmesh.CfnVirtualNode.BackendDefaultsProperty.Builder =
          software.amazon.awscdk.services.appmesh.CfnVirtualNode.BackendDefaultsProperty.builder()

      /**
       * @param clientPolicy A reference to an object that represents a client policy.
       */
      override fun clientPolicy(clientPolicy: IResolvable) {
        cdkBuilder.clientPolicy(clientPolicy.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param clientPolicy A reference to an object that represents a client policy.
       */
      override fun clientPolicy(clientPolicy: ClientPolicyProperty) {
        cdkBuilder.clientPolicy(clientPolicy.let(ClientPolicyProperty.Companion::unwrap))
      }

      /**
       * @param clientPolicy A reference to an object that represents a client policy.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("ec82bae459447564b82e97e36187eb807c00ee08eac5befe6bb4c7f379c5866d")
      override fun clientPolicy(clientPolicy: ClientPolicyProperty.Builder.() -> Unit): Unit =
          clientPolicy(ClientPolicyProperty(clientPolicy))

      public fun build():
          software.amazon.awscdk.services.appmesh.CfnVirtualNode.BackendDefaultsProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.appmesh.CfnVirtualNode.BackendDefaultsProperty,
    ) : CdkObject(cdkObject), BackendDefaultsProperty {
      /**
       * A reference to an object that represents a client policy.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-virtualnode-backenddefaults.html#cfn-appmesh-virtualnode-backenddefaults-clientpolicy)
       */
      override fun clientPolicy(): Any? = unwrap(this).getClientPolicy()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): BackendDefaultsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.appmesh.CfnVirtualNode.BackendDefaultsProperty):
          BackendDefaultsProperty = CdkObjectWrappers.wrap(cdkObject) as? BackendDefaultsProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: BackendDefaultsProperty):
          software.amazon.awscdk.services.appmesh.CfnVirtualNode.BackendDefaultsProperty = (wrapped
          as CdkObject).cdkObject as
          software.amazon.awscdk.services.appmesh.CfnVirtualNode.BackendDefaultsProperty
    }
  }

  /**
   * An object that represents the backends that a virtual node is expected to send outbound traffic
   * to.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.appmesh.*;
   * BackendProperty backendProperty = BackendProperty.builder()
   * .virtualService(VirtualServiceBackendProperty.builder()
   * .virtualServiceName("virtualServiceName")
   * // the properties below are optional
   * .clientPolicy(ClientPolicyProperty.builder()
   * .tls(ClientPolicyTlsProperty.builder()
   * .validation(TlsValidationContextProperty.builder()
   * .trust(TlsValidationContextTrustProperty.builder()
   * .acm(TlsValidationContextAcmTrustProperty.builder()
   * .certificateAuthorityArns(List.of("certificateAuthorityArns"))
   * .build())
   * .file(TlsValidationContextFileTrustProperty.builder()
   * .certificateChain("certificateChain")
   * .build())
   * .sds(TlsValidationContextSdsTrustProperty.builder()
   * .secretName("secretName")
   * .build())
   * .build())
   * // the properties below are optional
   * .subjectAlternativeNames(SubjectAlternativeNamesProperty.builder()
   * .match(SubjectAlternativeNameMatchersProperty.builder()
   * .exact(List.of("exact"))
   * .build())
   * .build())
   * .build())
   * // the properties below are optional
   * .certificate(ClientTlsCertificateProperty.builder()
   * .file(ListenerTlsFileCertificateProperty.builder()
   * .certificateChain("certificateChain")
   * .privateKey("privateKey")
   * .build())
   * .sds(ListenerTlsSdsCertificateProperty.builder()
   * .secretName("secretName")
   * .build())
   * .build())
   * .enforce(false)
   * .ports(List.of(123))
   * .build())
   * .build())
   * .build())
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-virtualnode-backend.html)
   */
  public interface BackendProperty {
    /**
     * Specifies a virtual service to use as a backend.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-virtualnode-backend.html#cfn-appmesh-virtualnode-backend-virtualservice)
     */
    public fun virtualService(): Any? = unwrap(this).getVirtualService()

    /**
     * A builder for [BackendProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param virtualService Specifies a virtual service to use as a backend.
       */
      public fun virtualService(virtualService: IResolvable)

      /**
       * @param virtualService Specifies a virtual service to use as a backend.
       */
      public fun virtualService(virtualService: VirtualServiceBackendProperty)

      /**
       * @param virtualService Specifies a virtual service to use as a backend.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("5c45154c7b732c8f59abc0fb00ae92eae74b98e93f2cff81eb01385b916a79fb")
      public fun virtualService(virtualService: VirtualServiceBackendProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.appmesh.CfnVirtualNode.BackendProperty.Builder =
          software.amazon.awscdk.services.appmesh.CfnVirtualNode.BackendProperty.builder()

      /**
       * @param virtualService Specifies a virtual service to use as a backend.
       */
      override fun virtualService(virtualService: IResolvable) {
        cdkBuilder.virtualService(virtualService.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param virtualService Specifies a virtual service to use as a backend.
       */
      override fun virtualService(virtualService: VirtualServiceBackendProperty) {
        cdkBuilder.virtualService(virtualService.let(VirtualServiceBackendProperty.Companion::unwrap))
      }

      /**
       * @param virtualService Specifies a virtual service to use as a backend.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("5c45154c7b732c8f59abc0fb00ae92eae74b98e93f2cff81eb01385b916a79fb")
      override fun virtualService(virtualService: VirtualServiceBackendProperty.Builder.() -> Unit):
          Unit = virtualService(VirtualServiceBackendProperty(virtualService))

      public fun build(): software.amazon.awscdk.services.appmesh.CfnVirtualNode.BackendProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.appmesh.CfnVirtualNode.BackendProperty,
    ) : CdkObject(cdkObject), BackendProperty {
      /**
       * Specifies a virtual service to use as a backend.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-virtualnode-backend.html#cfn-appmesh-virtualnode-backend-virtualservice)
       */
      override fun virtualService(): Any? = unwrap(this).getVirtualService()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): BackendProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.appmesh.CfnVirtualNode.BackendProperty):
          BackendProperty = CdkObjectWrappers.wrap(cdkObject) as? BackendProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: BackendProperty):
          software.amazon.awscdk.services.appmesh.CfnVirtualNode.BackendProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.appmesh.CfnVirtualNode.BackendProperty
    }
  }

  /**
   * An object that represents a client policy.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.appmesh.*;
   * ClientPolicyProperty clientPolicyProperty = ClientPolicyProperty.builder()
   * .tls(ClientPolicyTlsProperty.builder()
   * .validation(TlsValidationContextProperty.builder()
   * .trust(TlsValidationContextTrustProperty.builder()
   * .acm(TlsValidationContextAcmTrustProperty.builder()
   * .certificateAuthorityArns(List.of("certificateAuthorityArns"))
   * .build())
   * .file(TlsValidationContextFileTrustProperty.builder()
   * .certificateChain("certificateChain")
   * .build())
   * .sds(TlsValidationContextSdsTrustProperty.builder()
   * .secretName("secretName")
   * .build())
   * .build())
   * // the properties below are optional
   * .subjectAlternativeNames(SubjectAlternativeNamesProperty.builder()
   * .match(SubjectAlternativeNameMatchersProperty.builder()
   * .exact(List.of("exact"))
   * .build())
   * .build())
   * .build())
   * // the properties below are optional
   * .certificate(ClientTlsCertificateProperty.builder()
   * .file(ListenerTlsFileCertificateProperty.builder()
   * .certificateChain("certificateChain")
   * .privateKey("privateKey")
   * .build())
   * .sds(ListenerTlsSdsCertificateProperty.builder()
   * .secretName("secretName")
   * .build())
   * .build())
   * .enforce(false)
   * .ports(List.of(123))
   * .build())
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-virtualnode-clientpolicy.html)
   */
  public interface ClientPolicyProperty {
    /**
     * A reference to an object that represents a Transport Layer Security (TLS) client policy.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-virtualnode-clientpolicy.html#cfn-appmesh-virtualnode-clientpolicy-tls)
     */
    public fun tls(): Any? = unwrap(this).getTls()

    /**
     * A builder for [ClientPolicyProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param tls A reference to an object that represents a Transport Layer Security (TLS) client
       * policy.
       */
      public fun tls(tls: IResolvable)

      /**
       * @param tls A reference to an object that represents a Transport Layer Security (TLS) client
       * policy.
       */
      public fun tls(tls: ClientPolicyTlsProperty)

      /**
       * @param tls A reference to an object that represents a Transport Layer Security (TLS) client
       * policy.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("6e457bcfa4301806bc603707bed028637b0f3e6140ab3f94a7f2bce997ede57f")
      public fun tls(tls: ClientPolicyTlsProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.appmesh.CfnVirtualNode.ClientPolicyProperty.Builder =
          software.amazon.awscdk.services.appmesh.CfnVirtualNode.ClientPolicyProperty.builder()

      /**
       * @param tls A reference to an object that represents a Transport Layer Security (TLS) client
       * policy.
       */
      override fun tls(tls: IResolvable) {
        cdkBuilder.tls(tls.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param tls A reference to an object that represents a Transport Layer Security (TLS) client
       * policy.
       */
      override fun tls(tls: ClientPolicyTlsProperty) {
        cdkBuilder.tls(tls.let(ClientPolicyTlsProperty.Companion::unwrap))
      }

      /**
       * @param tls A reference to an object that represents a Transport Layer Security (TLS) client
       * policy.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("6e457bcfa4301806bc603707bed028637b0f3e6140ab3f94a7f2bce997ede57f")
      override fun tls(tls: ClientPolicyTlsProperty.Builder.() -> Unit): Unit =
          tls(ClientPolicyTlsProperty(tls))

      public fun build():
          software.amazon.awscdk.services.appmesh.CfnVirtualNode.ClientPolicyProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.appmesh.CfnVirtualNode.ClientPolicyProperty,
    ) : CdkObject(cdkObject), ClientPolicyProperty {
      /**
       * A reference to an object that represents a Transport Layer Security (TLS) client policy.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-virtualnode-clientpolicy.html#cfn-appmesh-virtualnode-clientpolicy-tls)
       */
      override fun tls(): Any? = unwrap(this).getTls()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): ClientPolicyProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.appmesh.CfnVirtualNode.ClientPolicyProperty):
          ClientPolicyProperty = CdkObjectWrappers.wrap(cdkObject) as? ClientPolicyProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: ClientPolicyProperty):
          software.amazon.awscdk.services.appmesh.CfnVirtualNode.ClientPolicyProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.appmesh.CfnVirtualNode.ClientPolicyProperty
    }
  }

  /**
   * A reference to an object that represents a Transport Layer Security (TLS) client policy.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.appmesh.*;
   * ClientPolicyTlsProperty clientPolicyTlsProperty = ClientPolicyTlsProperty.builder()
   * .validation(TlsValidationContextProperty.builder()
   * .trust(TlsValidationContextTrustProperty.builder()
   * .acm(TlsValidationContextAcmTrustProperty.builder()
   * .certificateAuthorityArns(List.of("certificateAuthorityArns"))
   * .build())
   * .file(TlsValidationContextFileTrustProperty.builder()
   * .certificateChain("certificateChain")
   * .build())
   * .sds(TlsValidationContextSdsTrustProperty.builder()
   * .secretName("secretName")
   * .build())
   * .build())
   * // the properties below are optional
   * .subjectAlternativeNames(SubjectAlternativeNamesProperty.builder()
   * .match(SubjectAlternativeNameMatchersProperty.builder()
   * .exact(List.of("exact"))
   * .build())
   * .build())
   * .build())
   * // the properties below are optional
   * .certificate(ClientTlsCertificateProperty.builder()
   * .file(ListenerTlsFileCertificateProperty.builder()
   * .certificateChain("certificateChain")
   * .privateKey("privateKey")
   * .build())
   * .sds(ListenerTlsSdsCertificateProperty.builder()
   * .secretName("secretName")
   * .build())
   * .build())
   * .enforce(false)
   * .ports(List.of(123))
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-virtualnode-clientpolicytls.html)
   */
  public interface ClientPolicyTlsProperty {
    /**
     * A reference to an object that represents a client's TLS certificate.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-virtualnode-clientpolicytls.html#cfn-appmesh-virtualnode-clientpolicytls-certificate)
     */
    public fun certificate(): Any? = unwrap(this).getCertificate()

    /**
     * Whether the policy is enforced.
     *
     * The default is `True` , if a value isn't specified.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-virtualnode-clientpolicytls.html#cfn-appmesh-virtualnode-clientpolicytls-enforce)
     */
    public fun enforce(): Any? = unwrap(this).getEnforce()

    /**
     * One or more ports that the policy is enforced for.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-virtualnode-clientpolicytls.html#cfn-appmesh-virtualnode-clientpolicytls-ports)
     */
    public fun ports(): Any? = unwrap(this).getPorts()

    /**
     * A reference to an object that represents a TLS validation context.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-virtualnode-clientpolicytls.html#cfn-appmesh-virtualnode-clientpolicytls-validation)
     */
    public fun validation(): Any

    /**
     * A builder for [ClientPolicyTlsProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param certificate A reference to an object that represents a client's TLS certificate.
       */
      public fun certificate(certificate: IResolvable)

      /**
       * @param certificate A reference to an object that represents a client's TLS certificate.
       */
      public fun certificate(certificate: ClientTlsCertificateProperty)

      /**
       * @param certificate A reference to an object that represents a client's TLS certificate.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("6f1308834fc19d7fc2de1cdaf4e6ba553f82ed9303e831028cacbf0dedef967b")
      public fun certificate(certificate: ClientTlsCertificateProperty.Builder.() -> Unit)

      /**
       * @param enforce Whether the policy is enforced.
       * The default is `True` , if a value isn't specified.
       */
      public fun enforce(enforce: Boolean)

      /**
       * @param enforce Whether the policy is enforced.
       * The default is `True` , if a value isn't specified.
       */
      public fun enforce(enforce: IResolvable)

      /**
       * @param ports One or more ports that the policy is enforced for.
       */
      public fun ports(ports: IResolvable)

      /**
       * @param ports One or more ports that the policy is enforced for.
       */
      public fun ports(ports: List<Number>)

      /**
       * @param ports One or more ports that the policy is enforced for.
       */
      public fun ports(vararg ports: Number)

      /**
       * @param validation A reference to an object that represents a TLS validation context. 
       */
      public fun validation(validation: IResolvable)

      /**
       * @param validation A reference to an object that represents a TLS validation context. 
       */
      public fun validation(validation: TlsValidationContextProperty)

      /**
       * @param validation A reference to an object that represents a TLS validation context. 
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("52251e4e5cf1a4945988da2a08bc8a38c4b08b204471dd117c172382e28c6f5f")
      public fun validation(validation: TlsValidationContextProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.appmesh.CfnVirtualNode.ClientPolicyTlsProperty.Builder =
          software.amazon.awscdk.services.appmesh.CfnVirtualNode.ClientPolicyTlsProperty.builder()

      /**
       * @param certificate A reference to an object that represents a client's TLS certificate.
       */
      override fun certificate(certificate: IResolvable) {
        cdkBuilder.certificate(certificate.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param certificate A reference to an object that represents a client's TLS certificate.
       */
      override fun certificate(certificate: ClientTlsCertificateProperty) {
        cdkBuilder.certificate(certificate.let(ClientTlsCertificateProperty.Companion::unwrap))
      }

      /**
       * @param certificate A reference to an object that represents a client's TLS certificate.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("6f1308834fc19d7fc2de1cdaf4e6ba553f82ed9303e831028cacbf0dedef967b")
      override fun certificate(certificate: ClientTlsCertificateProperty.Builder.() -> Unit): Unit =
          certificate(ClientTlsCertificateProperty(certificate))

      /**
       * @param enforce Whether the policy is enforced.
       * The default is `True` , if a value isn't specified.
       */
      override fun enforce(enforce: Boolean) {
        cdkBuilder.enforce(enforce)
      }

      /**
       * @param enforce Whether the policy is enforced.
       * The default is `True` , if a value isn't specified.
       */
      override fun enforce(enforce: IResolvable) {
        cdkBuilder.enforce(enforce.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param ports One or more ports that the policy is enforced for.
       */
      override fun ports(ports: IResolvable) {
        cdkBuilder.ports(ports.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param ports One or more ports that the policy is enforced for.
       */
      override fun ports(ports: List<Number>) {
        cdkBuilder.ports(ports)
      }

      /**
       * @param ports One or more ports that the policy is enforced for.
       */
      override fun ports(vararg ports: Number): Unit = ports(ports.toList())

      /**
       * @param validation A reference to an object that represents a TLS validation context. 
       */
      override fun validation(validation: IResolvable) {
        cdkBuilder.validation(validation.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param validation A reference to an object that represents a TLS validation context. 
       */
      override fun validation(validation: TlsValidationContextProperty) {
        cdkBuilder.validation(validation.let(TlsValidationContextProperty.Companion::unwrap))
      }

      /**
       * @param validation A reference to an object that represents a TLS validation context. 
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("52251e4e5cf1a4945988da2a08bc8a38c4b08b204471dd117c172382e28c6f5f")
      override fun validation(validation: TlsValidationContextProperty.Builder.() -> Unit): Unit =
          validation(TlsValidationContextProperty(validation))

      public fun build():
          software.amazon.awscdk.services.appmesh.CfnVirtualNode.ClientPolicyTlsProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.appmesh.CfnVirtualNode.ClientPolicyTlsProperty,
    ) : CdkObject(cdkObject), ClientPolicyTlsProperty {
      /**
       * A reference to an object that represents a client's TLS certificate.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-virtualnode-clientpolicytls.html#cfn-appmesh-virtualnode-clientpolicytls-certificate)
       */
      override fun certificate(): Any? = unwrap(this).getCertificate()

      /**
       * Whether the policy is enforced.
       *
       * The default is `True` , if a value isn't specified.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-virtualnode-clientpolicytls.html#cfn-appmesh-virtualnode-clientpolicytls-enforce)
       */
      override fun enforce(): Any? = unwrap(this).getEnforce()

      /**
       * One or more ports that the policy is enforced for.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-virtualnode-clientpolicytls.html#cfn-appmesh-virtualnode-clientpolicytls-ports)
       */
      override fun ports(): Any? = unwrap(this).getPorts()

      /**
       * A reference to an object that represents a TLS validation context.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-virtualnode-clientpolicytls.html#cfn-appmesh-virtualnode-clientpolicytls-validation)
       */
      override fun validation(): Any = unwrap(this).getValidation()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): ClientPolicyTlsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.appmesh.CfnVirtualNode.ClientPolicyTlsProperty):
          ClientPolicyTlsProperty = CdkObjectWrappers.wrap(cdkObject) as? ClientPolicyTlsProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: ClientPolicyTlsProperty):
          software.amazon.awscdk.services.appmesh.CfnVirtualNode.ClientPolicyTlsProperty = (wrapped
          as CdkObject).cdkObject as
          software.amazon.awscdk.services.appmesh.CfnVirtualNode.ClientPolicyTlsProperty
    }
  }

  /**
   * An object that represents the client's certificate.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.appmesh.*;
   * ClientTlsCertificateProperty clientTlsCertificateProperty =
   * ClientTlsCertificateProperty.builder()
   * .file(ListenerTlsFileCertificateProperty.builder()
   * .certificateChain("certificateChain")
   * .privateKey("privateKey")
   * .build())
   * .sds(ListenerTlsSdsCertificateProperty.builder()
   * .secretName("secretName")
   * .build())
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-virtualnode-clienttlscertificate.html)
   */
  public interface ClientTlsCertificateProperty {
    /**
     * An object that represents a local file certificate.
     *
     * The certificate must meet specific requirements and you must have proxy authorization
     * enabled. For more information, see [Transport Layer Security
     * (TLS)](https://docs.aws.amazon.com/app-mesh/latest/userguide/tls.html) .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-virtualnode-clienttlscertificate.html#cfn-appmesh-virtualnode-clienttlscertificate-file)
     */
    public fun `file`(): Any? = unwrap(this).getFile()

    /**
     * A reference to an object that represents a client's TLS Secret Discovery Service certificate.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-virtualnode-clienttlscertificate.html#cfn-appmesh-virtualnode-clienttlscertificate-sds)
     */
    public fun sds(): Any? = unwrap(this).getSds()

    /**
     * A builder for [ClientTlsCertificateProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param file An object that represents a local file certificate.
       * The certificate must meet specific requirements and you must have proxy authorization
       * enabled. For more information, see [Transport Layer Security
       * (TLS)](https://docs.aws.amazon.com/app-mesh/latest/userguide/tls.html) .
       */
      public fun `file`(`file`: IResolvable)

      /**
       * @param file An object that represents a local file certificate.
       * The certificate must meet specific requirements and you must have proxy authorization
       * enabled. For more information, see [Transport Layer Security
       * (TLS)](https://docs.aws.amazon.com/app-mesh/latest/userguide/tls.html) .
       */
      public fun `file`(`file`: ListenerTlsFileCertificateProperty)

      /**
       * @param file An object that represents a local file certificate.
       * The certificate must meet specific requirements and you must have proxy authorization
       * enabled. For more information, see [Transport Layer Security
       * (TLS)](https://docs.aws.amazon.com/app-mesh/latest/userguide/tls.html) .
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("89dca484bf00da5c3810ab17ce2c7fd790d5f2cb61f116d8e1691f971a7974de")
      public fun `file`(`file`: ListenerTlsFileCertificateProperty.Builder.() -> Unit)

      /**
       * @param sds A reference to an object that represents a client's TLS Secret Discovery Service
       * certificate.
       */
      public fun sds(sds: IResolvable)

      /**
       * @param sds A reference to an object that represents a client's TLS Secret Discovery Service
       * certificate.
       */
      public fun sds(sds: ListenerTlsSdsCertificateProperty)

      /**
       * @param sds A reference to an object that represents a client's TLS Secret Discovery Service
       * certificate.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("f178bacd4f943b1f35bfc93258a12bc42329f24ada864adbe4f0230c8eec7dc1")
      public fun sds(sds: ListenerTlsSdsCertificateProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.appmesh.CfnVirtualNode.ClientTlsCertificateProperty.Builder
          =
          software.amazon.awscdk.services.appmesh.CfnVirtualNode.ClientTlsCertificateProperty.builder()

      /**
       * @param file An object that represents a local file certificate.
       * The certificate must meet specific requirements and you must have proxy authorization
       * enabled. For more information, see [Transport Layer Security
       * (TLS)](https://docs.aws.amazon.com/app-mesh/latest/userguide/tls.html) .
       */
      override fun `file`(`file`: IResolvable) {
        cdkBuilder.`file`(`file`.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param file An object that represents a local file certificate.
       * The certificate must meet specific requirements and you must have proxy authorization
       * enabled. For more information, see [Transport Layer Security
       * (TLS)](https://docs.aws.amazon.com/app-mesh/latest/userguide/tls.html) .
       */
      override fun `file`(`file`: ListenerTlsFileCertificateProperty) {
        cdkBuilder.`file`(`file`.let(ListenerTlsFileCertificateProperty.Companion::unwrap))
      }

      /**
       * @param file An object that represents a local file certificate.
       * The certificate must meet specific requirements and you must have proxy authorization
       * enabled. For more information, see [Transport Layer Security
       * (TLS)](https://docs.aws.amazon.com/app-mesh/latest/userguide/tls.html) .
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("89dca484bf00da5c3810ab17ce2c7fd790d5f2cb61f116d8e1691f971a7974de")
      override fun `file`(`file`: ListenerTlsFileCertificateProperty.Builder.() -> Unit): Unit =
          `file`(ListenerTlsFileCertificateProperty(`file`))

      /**
       * @param sds A reference to an object that represents a client's TLS Secret Discovery Service
       * certificate.
       */
      override fun sds(sds: IResolvable) {
        cdkBuilder.sds(sds.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param sds A reference to an object that represents a client's TLS Secret Discovery Service
       * certificate.
       */
      override fun sds(sds: ListenerTlsSdsCertificateProperty) {
        cdkBuilder.sds(sds.let(ListenerTlsSdsCertificateProperty.Companion::unwrap))
      }

      /**
       * @param sds A reference to an object that represents a client's TLS Secret Discovery Service
       * certificate.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("f178bacd4f943b1f35bfc93258a12bc42329f24ada864adbe4f0230c8eec7dc1")
      override fun sds(sds: ListenerTlsSdsCertificateProperty.Builder.() -> Unit): Unit =
          sds(ListenerTlsSdsCertificateProperty(sds))

      public fun build():
          software.amazon.awscdk.services.appmesh.CfnVirtualNode.ClientTlsCertificateProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.appmesh.CfnVirtualNode.ClientTlsCertificateProperty,
    ) : CdkObject(cdkObject), ClientTlsCertificateProperty {
      /**
       * An object that represents a local file certificate.
       *
       * The certificate must meet specific requirements and you must have proxy authorization
       * enabled. For more information, see [Transport Layer Security
       * (TLS)](https://docs.aws.amazon.com/app-mesh/latest/userguide/tls.html) .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-virtualnode-clienttlscertificate.html#cfn-appmesh-virtualnode-clienttlscertificate-file)
       */
      override fun `file`(): Any? = unwrap(this).getFile()

      /**
       * A reference to an object that represents a client's TLS Secret Discovery Service
       * certificate.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-virtualnode-clienttlscertificate.html#cfn-appmesh-virtualnode-clienttlscertificate-sds)
       */
      override fun sds(): Any? = unwrap(this).getSds()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): ClientTlsCertificateProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.appmesh.CfnVirtualNode.ClientTlsCertificateProperty):
          ClientTlsCertificateProperty = CdkObjectWrappers.wrap(cdkObject) as?
          ClientTlsCertificateProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: ClientTlsCertificateProperty):
          software.amazon.awscdk.services.appmesh.CfnVirtualNode.ClientTlsCertificateProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.appmesh.CfnVirtualNode.ClientTlsCertificateProperty
    }
  }

  /**
   * An object that represents the DNS service discovery information for your virtual node.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.appmesh.*;
   * DnsServiceDiscoveryProperty dnsServiceDiscoveryProperty = DnsServiceDiscoveryProperty.builder()
   * .hostname("hostname")
   * // the properties below are optional
   * .ipPreference("ipPreference")
   * .responseType("responseType")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-virtualnode-dnsservicediscovery.html)
   */
  public interface DnsServiceDiscoveryProperty {
    /**
     * Specifies the DNS service discovery hostname for the virtual node.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-virtualnode-dnsservicediscovery.html#cfn-appmesh-virtualnode-dnsservicediscovery-hostname)
     */
    public fun hostname(): String

    /**
     * The preferred IP version that this virtual node uses.
     *
     * Setting the IP preference on the virtual node only overrides the IP preference set for the
     * mesh on this specific node.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-virtualnode-dnsservicediscovery.html#cfn-appmesh-virtualnode-dnsservicediscovery-ippreference)
     */
    public fun ipPreference(): String? = unwrap(this).getIpPreference()

    /**
     * Specifies the DNS response type for the virtual node.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-virtualnode-dnsservicediscovery.html#cfn-appmesh-virtualnode-dnsservicediscovery-responsetype)
     */
    public fun responseType(): String? = unwrap(this).getResponseType()

    /**
     * A builder for [DnsServiceDiscoveryProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param hostname Specifies the DNS service discovery hostname for the virtual node. 
       */
      public fun hostname(hostname: String)

      /**
       * @param ipPreference The preferred IP version that this virtual node uses.
       * Setting the IP preference on the virtual node only overrides the IP preference set for the
       * mesh on this specific node.
       */
      public fun ipPreference(ipPreference: String)

      /**
       * @param responseType Specifies the DNS response type for the virtual node.
       */
      public fun responseType(responseType: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.appmesh.CfnVirtualNode.DnsServiceDiscoveryProperty.Builder
          =
          software.amazon.awscdk.services.appmesh.CfnVirtualNode.DnsServiceDiscoveryProperty.builder()

      /**
       * @param hostname Specifies the DNS service discovery hostname for the virtual node. 
       */
      override fun hostname(hostname: String) {
        cdkBuilder.hostname(hostname)
      }

      /**
       * @param ipPreference The preferred IP version that this virtual node uses.
       * Setting the IP preference on the virtual node only overrides the IP preference set for the
       * mesh on this specific node.
       */
      override fun ipPreference(ipPreference: String) {
        cdkBuilder.ipPreference(ipPreference)
      }

      /**
       * @param responseType Specifies the DNS response type for the virtual node.
       */
      override fun responseType(responseType: String) {
        cdkBuilder.responseType(responseType)
      }

      public fun build():
          software.amazon.awscdk.services.appmesh.CfnVirtualNode.DnsServiceDiscoveryProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.appmesh.CfnVirtualNode.DnsServiceDiscoveryProperty,
    ) : CdkObject(cdkObject), DnsServiceDiscoveryProperty {
      /**
       * Specifies the DNS service discovery hostname for the virtual node.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-virtualnode-dnsservicediscovery.html#cfn-appmesh-virtualnode-dnsservicediscovery-hostname)
       */
      override fun hostname(): String = unwrap(this).getHostname()

      /**
       * The preferred IP version that this virtual node uses.
       *
       * Setting the IP preference on the virtual node only overrides the IP preference set for the
       * mesh on this specific node.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-virtualnode-dnsservicediscovery.html#cfn-appmesh-virtualnode-dnsservicediscovery-ippreference)
       */
      override fun ipPreference(): String? = unwrap(this).getIpPreference()

      /**
       * Specifies the DNS response type for the virtual node.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-virtualnode-dnsservicediscovery.html#cfn-appmesh-virtualnode-dnsservicediscovery-responsetype)
       */
      override fun responseType(): String? = unwrap(this).getResponseType()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): DnsServiceDiscoveryProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.appmesh.CfnVirtualNode.DnsServiceDiscoveryProperty):
          DnsServiceDiscoveryProperty = CdkObjectWrappers.wrap(cdkObject) as?
          DnsServiceDiscoveryProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: DnsServiceDiscoveryProperty):
          software.amazon.awscdk.services.appmesh.CfnVirtualNode.DnsServiceDiscoveryProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.appmesh.CfnVirtualNode.DnsServiceDiscoveryProperty
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
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-virtualnode-duration.html)
   */
  public interface DurationProperty {
    /**
     * A unit of time.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-virtualnode-duration.html#cfn-appmesh-virtualnode-duration-unit)
     */
    public fun unit(): String

    /**
     * A number of time units.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-virtualnode-duration.html#cfn-appmesh-virtualnode-duration-value)
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
          software.amazon.awscdk.services.appmesh.CfnVirtualNode.DurationProperty.Builder =
          software.amazon.awscdk.services.appmesh.CfnVirtualNode.DurationProperty.builder()

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

      public fun build(): software.amazon.awscdk.services.appmesh.CfnVirtualNode.DurationProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.appmesh.CfnVirtualNode.DurationProperty,
    ) : CdkObject(cdkObject), DurationProperty {
      /**
       * A unit of time.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-virtualnode-duration.html#cfn-appmesh-virtualnode-duration-unit)
       */
      override fun unit(): String = unwrap(this).getUnit()

      /**
       * A number of time units.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-virtualnode-duration.html#cfn-appmesh-virtualnode-duration-value)
       */
      override fun `value`(): Number = unwrap(this).getValue()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): DurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.appmesh.CfnVirtualNode.DurationProperty):
          DurationProperty = CdkObjectWrappers.wrap(cdkObject) as? DurationProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: DurationProperty):
          software.amazon.awscdk.services.appmesh.CfnVirtualNode.DurationProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.appmesh.CfnVirtualNode.DurationProperty
    }
  }

  /**
   * An object that represents an access log file.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.appmesh.*;
   * FileAccessLogProperty fileAccessLogProperty = FileAccessLogProperty.builder()
   * .path("path")
   * // the properties below are optional
   * .format(LoggingFormatProperty.builder()
   * .json(List.of(JsonFormatRefProperty.builder()
   * .key("key")
   * .value("value")
   * .build()))
   * .text("text")
   * .build())
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-virtualnode-fileaccesslog.html)
   */
  public interface FileAccessLogProperty {
    /**
     * The specified format for the logs.
     *
     * The format is either `json_format` or `text_format` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-virtualnode-fileaccesslog.html#cfn-appmesh-virtualnode-fileaccesslog-format)
     */
    public fun format(): Any? = unwrap(this).getFormat()

    /**
     * The file path to write access logs to.
     *
     * You can use `/dev/stdout` to send access logs to standard out and configure your Envoy
     * container to use a log driver, such as `awslogs` , to export the access logs to a log storage
     * service such as Amazon CloudWatch Logs. You can also specify a path in the Envoy container's
     * file system to write the files to disk.
     *
     *
     * The Envoy process must have write permissions to the path that you specify here. Otherwise,
     * Envoy fails to bootstrap properly.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-virtualnode-fileaccesslog.html#cfn-appmesh-virtualnode-fileaccesslog-path)
     */
    public fun path(): String

    /**
     * A builder for [FileAccessLogProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param format The specified format for the logs.
       * The format is either `json_format` or `text_format` .
       */
      public fun format(format: IResolvable)

      /**
       * @param format The specified format for the logs.
       * The format is either `json_format` or `text_format` .
       */
      public fun format(format: LoggingFormatProperty)

      /**
       * @param format The specified format for the logs.
       * The format is either `json_format` or `text_format` .
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("b235caa145ca773f775f76940aff30e31dc76f06c6ef5577b6a0326b5350a3ec")
      public fun format(format: LoggingFormatProperty.Builder.() -> Unit)

      /**
       * @param path The file path to write access logs to. 
       * You can use `/dev/stdout` to send access logs to standard out and configure your Envoy
       * container to use a log driver, such as `awslogs` , to export the access logs to a log storage
       * service such as Amazon CloudWatch Logs. You can also specify a path in the Envoy container's
       * file system to write the files to disk.
       *
       *
       * The Envoy process must have write permissions to the path that you specify here. Otherwise,
       * Envoy fails to bootstrap properly.
       */
      public fun path(path: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.appmesh.CfnVirtualNode.FileAccessLogProperty.Builder =
          software.amazon.awscdk.services.appmesh.CfnVirtualNode.FileAccessLogProperty.builder()

      /**
       * @param format The specified format for the logs.
       * The format is either `json_format` or `text_format` .
       */
      override fun format(format: IResolvable) {
        cdkBuilder.format(format.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param format The specified format for the logs.
       * The format is either `json_format` or `text_format` .
       */
      override fun format(format: LoggingFormatProperty) {
        cdkBuilder.format(format.let(LoggingFormatProperty.Companion::unwrap))
      }

      /**
       * @param format The specified format for the logs.
       * The format is either `json_format` or `text_format` .
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("b235caa145ca773f775f76940aff30e31dc76f06c6ef5577b6a0326b5350a3ec")
      override fun format(format: LoggingFormatProperty.Builder.() -> Unit): Unit =
          format(LoggingFormatProperty(format))

      /**
       * @param path The file path to write access logs to. 
       * You can use `/dev/stdout` to send access logs to standard out and configure your Envoy
       * container to use a log driver, such as `awslogs` , to export the access logs to a log storage
       * service such as Amazon CloudWatch Logs. You can also specify a path in the Envoy container's
       * file system to write the files to disk.
       *
       *
       * The Envoy process must have write permissions to the path that you specify here. Otherwise,
       * Envoy fails to bootstrap properly.
       */
      override fun path(path: String) {
        cdkBuilder.path(path)
      }

      public fun build():
          software.amazon.awscdk.services.appmesh.CfnVirtualNode.FileAccessLogProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.appmesh.CfnVirtualNode.FileAccessLogProperty,
    ) : CdkObject(cdkObject), FileAccessLogProperty {
      /**
       * The specified format for the logs.
       *
       * The format is either `json_format` or `text_format` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-virtualnode-fileaccesslog.html#cfn-appmesh-virtualnode-fileaccesslog-format)
       */
      override fun format(): Any? = unwrap(this).getFormat()

      /**
       * The file path to write access logs to.
       *
       * You can use `/dev/stdout` to send access logs to standard out and configure your Envoy
       * container to use a log driver, such as `awslogs` , to export the access logs to a log storage
       * service such as Amazon CloudWatch Logs. You can also specify a path in the Envoy container's
       * file system to write the files to disk.
       *
       *
       * The Envoy process must have write permissions to the path that you specify here. Otherwise,
       * Envoy fails to bootstrap properly.
       *
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-virtualnode-fileaccesslog.html#cfn-appmesh-virtualnode-fileaccesslog-path)
       */
      override fun path(): String = unwrap(this).getPath()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): FileAccessLogProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.appmesh.CfnVirtualNode.FileAccessLogProperty):
          FileAccessLogProperty = CdkObjectWrappers.wrap(cdkObject) as? FileAccessLogProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: FileAccessLogProperty):
          software.amazon.awscdk.services.appmesh.CfnVirtualNode.FileAccessLogProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.appmesh.CfnVirtualNode.FileAccessLogProperty
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
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-virtualnode-grpctimeout.html)
   */
  public interface GrpcTimeoutProperty {
    /**
     * An object that represents an idle timeout.
     *
     * An idle timeout bounds the amount of time that a connection may be idle. The default value is
     * none.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-virtualnode-grpctimeout.html#cfn-appmesh-virtualnode-grpctimeout-idle)
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
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-virtualnode-grpctimeout.html#cfn-appmesh-virtualnode-grpctimeout-perrequest)
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
      @JvmName("90b25b27f96c7e2df24ce038e0a897063f89275adfac0b54881036c661e0e80b")
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
      @JvmName("266c0d44ee846fcab305abe9d71f1af2ec6a53d4d89660754765ee39a43917cd")
      public fun perRequest(perRequest: DurationProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.appmesh.CfnVirtualNode.GrpcTimeoutProperty.Builder =
          software.amazon.awscdk.services.appmesh.CfnVirtualNode.GrpcTimeoutProperty.builder()

      /**
       * @param idle An object that represents an idle timeout.
       * An idle timeout bounds the amount of time that a connection may be idle. The default value
       * is none.
       */
      override fun idle(idle: IResolvable) {
        cdkBuilder.idle(idle.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param idle An object that represents an idle timeout.
       * An idle timeout bounds the amount of time that a connection may be idle. The default value
       * is none.
       */
      override fun idle(idle: DurationProperty) {
        cdkBuilder.idle(idle.let(DurationProperty.Companion::unwrap))
      }

      /**
       * @param idle An object that represents an idle timeout.
       * An idle timeout bounds the amount of time that a connection may be idle. The default value
       * is none.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("90b25b27f96c7e2df24ce038e0a897063f89275adfac0b54881036c661e0e80b")
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
        cdkBuilder.perRequest(perRequest.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param perRequest An object that represents a per request timeout.
       * The default value is 15 seconds. If you set a higher timeout, then make sure that the
       * higher value is set for each App Mesh resource in a conversation. For example, if a virtual
       * node backend uses a virtual router provider to route to another virtual node, then the timeout
       * should be greater than 15 seconds for the source and destination virtual node and the route.
       */
      override fun perRequest(perRequest: DurationProperty) {
        cdkBuilder.perRequest(perRequest.let(DurationProperty.Companion::unwrap))
      }

      /**
       * @param perRequest An object that represents a per request timeout.
       * The default value is 15 seconds. If you set a higher timeout, then make sure that the
       * higher value is set for each App Mesh resource in a conversation. For example, if a virtual
       * node backend uses a virtual router provider to route to another virtual node, then the timeout
       * should be greater than 15 seconds for the source and destination virtual node and the route.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("266c0d44ee846fcab305abe9d71f1af2ec6a53d4d89660754765ee39a43917cd")
      override fun perRequest(perRequest: DurationProperty.Builder.() -> Unit): Unit =
          perRequest(DurationProperty(perRequest))

      public fun build(): software.amazon.awscdk.services.appmesh.CfnVirtualNode.GrpcTimeoutProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.appmesh.CfnVirtualNode.GrpcTimeoutProperty,
    ) : CdkObject(cdkObject), GrpcTimeoutProperty {
      /**
       * An object that represents an idle timeout.
       *
       * An idle timeout bounds the amount of time that a connection may be idle. The default value
       * is none.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-virtualnode-grpctimeout.html#cfn-appmesh-virtualnode-grpctimeout-idle)
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
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-virtualnode-grpctimeout.html#cfn-appmesh-virtualnode-grpctimeout-perrequest)
       */
      override fun perRequest(): Any? = unwrap(this).getPerRequest()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): GrpcTimeoutProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.appmesh.CfnVirtualNode.GrpcTimeoutProperty):
          GrpcTimeoutProperty = CdkObjectWrappers.wrap(cdkObject) as? GrpcTimeoutProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: GrpcTimeoutProperty):
          software.amazon.awscdk.services.appmesh.CfnVirtualNode.GrpcTimeoutProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.appmesh.CfnVirtualNode.GrpcTimeoutProperty
    }
  }

  /**
   * An object that represents the health check policy for a virtual node's listener.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.appmesh.*;
   * HealthCheckProperty healthCheckProperty = HealthCheckProperty.builder()
   * .healthyThreshold(123)
   * .intervalMillis(123)
   * .protocol("protocol")
   * .timeoutMillis(123)
   * .unhealthyThreshold(123)
   * // the properties below are optional
   * .path("path")
   * .port(123)
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-virtualnode-healthcheck.html)
   */
  public interface HealthCheckProperty {
    /**
     * The number of consecutive successful health checks that must occur before declaring listener
     * healthy.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-virtualnode-healthcheck.html#cfn-appmesh-virtualnode-healthcheck-healthythreshold)
     */
    public fun healthyThreshold(): Number

    /**
     * The time period in milliseconds between each health check execution.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-virtualnode-healthcheck.html#cfn-appmesh-virtualnode-healthcheck-intervalmillis)
     */
    public fun intervalMillis(): Number

    /**
     * The destination path for the health check request.
     *
     * This value is only used if the specified protocol is HTTP or HTTP/2. For any other protocol,
     * this value is ignored.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-virtualnode-healthcheck.html#cfn-appmesh-virtualnode-healthcheck-path)
     */
    public fun path(): String? = unwrap(this).getPath()

    /**
     * The destination port for the health check request.
     *
     * This port must match the port defined in the `PortMapping` for the listener.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-virtualnode-healthcheck.html#cfn-appmesh-virtualnode-healthcheck-port)
     */
    public fun port(): Number? = unwrap(this).getPort()

    /**
     * The protocol for the health check request.
     *
     * If you specify `grpc` , then your service must conform to the [GRPC Health Checking
     * Protocol](https://docs.aws.amazon.com/https://github.com/grpc/grpc/blob/master/doc/health-checking.md)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-virtualnode-healthcheck.html#cfn-appmesh-virtualnode-healthcheck-protocol)
     */
    public fun protocol(): String

    /**
     * The amount of time to wait when receiving a response from the health check, in milliseconds.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-virtualnode-healthcheck.html#cfn-appmesh-virtualnode-healthcheck-timeoutmillis)
     */
    public fun timeoutMillis(): Number

    /**
     * The number of consecutive failed health checks that must occur before declaring a virtual
     * node unhealthy.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-virtualnode-healthcheck.html#cfn-appmesh-virtualnode-healthcheck-unhealthythreshold)
     */
    public fun unhealthyThreshold(): Number

    /**
     * A builder for [HealthCheckProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param healthyThreshold The number of consecutive successful health checks that must occur
       * before declaring listener healthy. 
       */
      public fun healthyThreshold(healthyThreshold: Number)

      /**
       * @param intervalMillis The time period in milliseconds between each health check execution. 
       */
      public fun intervalMillis(intervalMillis: Number)

      /**
       * @param path The destination path for the health check request.
       * This value is only used if the specified protocol is HTTP or HTTP/2. For any other
       * protocol, this value is ignored.
       */
      public fun path(path: String)

      /**
       * @param port The destination port for the health check request.
       * This port must match the port defined in the `PortMapping` for the listener.
       */
      public fun port(port: Number)

      /**
       * @param protocol The protocol for the health check request. 
       * If you specify `grpc` , then your service must conform to the [GRPC Health Checking
       * Protocol](https://docs.aws.amazon.com/https://github.com/grpc/grpc/blob/master/doc/health-checking.md)
       * .
       */
      public fun protocol(protocol: String)

      /**
       * @param timeoutMillis The amount of time to wait when receiving a response from the health
       * check, in milliseconds. 
       */
      public fun timeoutMillis(timeoutMillis: Number)

      /**
       * @param unhealthyThreshold The number of consecutive failed health checks that must occur
       * before declaring a virtual node unhealthy. 
       */
      public fun unhealthyThreshold(unhealthyThreshold: Number)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.appmesh.CfnVirtualNode.HealthCheckProperty.Builder =
          software.amazon.awscdk.services.appmesh.CfnVirtualNode.HealthCheckProperty.builder()

      /**
       * @param healthyThreshold The number of consecutive successful health checks that must occur
       * before declaring listener healthy. 
       */
      override fun healthyThreshold(healthyThreshold: Number) {
        cdkBuilder.healthyThreshold(healthyThreshold)
      }

      /**
       * @param intervalMillis The time period in milliseconds between each health check execution. 
       */
      override fun intervalMillis(intervalMillis: Number) {
        cdkBuilder.intervalMillis(intervalMillis)
      }

      /**
       * @param path The destination path for the health check request.
       * This value is only used if the specified protocol is HTTP or HTTP/2. For any other
       * protocol, this value is ignored.
       */
      override fun path(path: String) {
        cdkBuilder.path(path)
      }

      /**
       * @param port The destination port for the health check request.
       * This port must match the port defined in the `PortMapping` for the listener.
       */
      override fun port(port: Number) {
        cdkBuilder.port(port)
      }

      /**
       * @param protocol The protocol for the health check request. 
       * If you specify `grpc` , then your service must conform to the [GRPC Health Checking
       * Protocol](https://docs.aws.amazon.com/https://github.com/grpc/grpc/blob/master/doc/health-checking.md)
       * .
       */
      override fun protocol(protocol: String) {
        cdkBuilder.protocol(protocol)
      }

      /**
       * @param timeoutMillis The amount of time to wait when receiving a response from the health
       * check, in milliseconds. 
       */
      override fun timeoutMillis(timeoutMillis: Number) {
        cdkBuilder.timeoutMillis(timeoutMillis)
      }

      /**
       * @param unhealthyThreshold The number of consecutive failed health checks that must occur
       * before declaring a virtual node unhealthy. 
       */
      override fun unhealthyThreshold(unhealthyThreshold: Number) {
        cdkBuilder.unhealthyThreshold(unhealthyThreshold)
      }

      public fun build(): software.amazon.awscdk.services.appmesh.CfnVirtualNode.HealthCheckProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.appmesh.CfnVirtualNode.HealthCheckProperty,
    ) : CdkObject(cdkObject), HealthCheckProperty {
      /**
       * The number of consecutive successful health checks that must occur before declaring
       * listener healthy.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-virtualnode-healthcheck.html#cfn-appmesh-virtualnode-healthcheck-healthythreshold)
       */
      override fun healthyThreshold(): Number = unwrap(this).getHealthyThreshold()

      /**
       * The time period in milliseconds between each health check execution.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-virtualnode-healthcheck.html#cfn-appmesh-virtualnode-healthcheck-intervalmillis)
       */
      override fun intervalMillis(): Number = unwrap(this).getIntervalMillis()

      /**
       * The destination path for the health check request.
       *
       * This value is only used if the specified protocol is HTTP or HTTP/2. For any other
       * protocol, this value is ignored.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-virtualnode-healthcheck.html#cfn-appmesh-virtualnode-healthcheck-path)
       */
      override fun path(): String? = unwrap(this).getPath()

      /**
       * The destination port for the health check request.
       *
       * This port must match the port defined in the `PortMapping` for the listener.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-virtualnode-healthcheck.html#cfn-appmesh-virtualnode-healthcheck-port)
       */
      override fun port(): Number? = unwrap(this).getPort()

      /**
       * The protocol for the health check request.
       *
       * If you specify `grpc` , then your service must conform to the [GRPC Health Checking
       * Protocol](https://docs.aws.amazon.com/https://github.com/grpc/grpc/blob/master/doc/health-checking.md)
       * .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-virtualnode-healthcheck.html#cfn-appmesh-virtualnode-healthcheck-protocol)
       */
      override fun protocol(): String = unwrap(this).getProtocol()

      /**
       * The amount of time to wait when receiving a response from the health check, in
       * milliseconds.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-virtualnode-healthcheck.html#cfn-appmesh-virtualnode-healthcheck-timeoutmillis)
       */
      override fun timeoutMillis(): Number = unwrap(this).getTimeoutMillis()

      /**
       * The number of consecutive failed health checks that must occur before declaring a virtual
       * node unhealthy.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-virtualnode-healthcheck.html#cfn-appmesh-virtualnode-healthcheck-unhealthythreshold)
       */
      override fun unhealthyThreshold(): Number = unwrap(this).getUnhealthyThreshold()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): HealthCheckProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.appmesh.CfnVirtualNode.HealthCheckProperty):
          HealthCheckProperty = CdkObjectWrappers.wrap(cdkObject) as? HealthCheckProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: HealthCheckProperty):
          software.amazon.awscdk.services.appmesh.CfnVirtualNode.HealthCheckProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.appmesh.CfnVirtualNode.HealthCheckProperty
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
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-virtualnode-httptimeout.html)
   */
  public interface HttpTimeoutProperty {
    /**
     * An object that represents an idle timeout.
     *
     * An idle timeout bounds the amount of time that a connection may be idle. The default value is
     * none.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-virtualnode-httptimeout.html#cfn-appmesh-virtualnode-httptimeout-idle)
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
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-virtualnode-httptimeout.html#cfn-appmesh-virtualnode-httptimeout-perrequest)
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
      @JvmName("a2f3e48fe5f784e249dbd62ccb6d52a3c4d1e206053d4dd61b1b0226c7e0eba6")
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
      @JvmName("9a4ffbaa43003f5b92e407476af9a078f5806499ab4d93b1de0978b4e5ebcd64")
      public fun perRequest(perRequest: DurationProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.appmesh.CfnVirtualNode.HttpTimeoutProperty.Builder =
          software.amazon.awscdk.services.appmesh.CfnVirtualNode.HttpTimeoutProperty.builder()

      /**
       * @param idle An object that represents an idle timeout.
       * An idle timeout bounds the amount of time that a connection may be idle. The default value
       * is none.
       */
      override fun idle(idle: IResolvable) {
        cdkBuilder.idle(idle.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param idle An object that represents an idle timeout.
       * An idle timeout bounds the amount of time that a connection may be idle. The default value
       * is none.
       */
      override fun idle(idle: DurationProperty) {
        cdkBuilder.idle(idle.let(DurationProperty.Companion::unwrap))
      }

      /**
       * @param idle An object that represents an idle timeout.
       * An idle timeout bounds the amount of time that a connection may be idle. The default value
       * is none.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("a2f3e48fe5f784e249dbd62ccb6d52a3c4d1e206053d4dd61b1b0226c7e0eba6")
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
        cdkBuilder.perRequest(perRequest.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param perRequest An object that represents a per request timeout.
       * The default value is 15 seconds. If you set a higher timeout, then make sure that the
       * higher value is set for each App Mesh resource in a conversation. For example, if a virtual
       * node backend uses a virtual router provider to route to another virtual node, then the timeout
       * should be greater than 15 seconds for the source and destination virtual node and the route.
       */
      override fun perRequest(perRequest: DurationProperty) {
        cdkBuilder.perRequest(perRequest.let(DurationProperty.Companion::unwrap))
      }

      /**
       * @param perRequest An object that represents a per request timeout.
       * The default value is 15 seconds. If you set a higher timeout, then make sure that the
       * higher value is set for each App Mesh resource in a conversation. For example, if a virtual
       * node backend uses a virtual router provider to route to another virtual node, then the timeout
       * should be greater than 15 seconds for the source and destination virtual node and the route.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("9a4ffbaa43003f5b92e407476af9a078f5806499ab4d93b1de0978b4e5ebcd64")
      override fun perRequest(perRequest: DurationProperty.Builder.() -> Unit): Unit =
          perRequest(DurationProperty(perRequest))

      public fun build(): software.amazon.awscdk.services.appmesh.CfnVirtualNode.HttpTimeoutProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.appmesh.CfnVirtualNode.HttpTimeoutProperty,
    ) : CdkObject(cdkObject), HttpTimeoutProperty {
      /**
       * An object that represents an idle timeout.
       *
       * An idle timeout bounds the amount of time that a connection may be idle. The default value
       * is none.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-virtualnode-httptimeout.html#cfn-appmesh-virtualnode-httptimeout-idle)
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
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-virtualnode-httptimeout.html#cfn-appmesh-virtualnode-httptimeout-perrequest)
       */
      override fun perRequest(): Any? = unwrap(this).getPerRequest()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): HttpTimeoutProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.appmesh.CfnVirtualNode.HttpTimeoutProperty):
          HttpTimeoutProperty = CdkObjectWrappers.wrap(cdkObject) as? HttpTimeoutProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: HttpTimeoutProperty):
          software.amazon.awscdk.services.appmesh.CfnVirtualNode.HttpTimeoutProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.appmesh.CfnVirtualNode.HttpTimeoutProperty
    }
  }

  /**
   * An object that represents the key value pairs for the JSON.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.appmesh.*;
   * JsonFormatRefProperty jsonFormatRefProperty = JsonFormatRefProperty.builder()
   * .key("key")
   * .value("value")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-virtualnode-jsonformatref.html)
   */
  public interface JsonFormatRefProperty {
    /**
     * The specified key for the JSON.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-virtualnode-jsonformatref.html#cfn-appmesh-virtualnode-jsonformatref-key)
     */
    public fun key(): String

    /**
     * The specified value for the JSON.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-virtualnode-jsonformatref.html#cfn-appmesh-virtualnode-jsonformatref-value)
     */
    public fun `value`(): String

    /**
     * A builder for [JsonFormatRefProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param key The specified key for the JSON. 
       */
      public fun key(key: String)

      /**
       * @param value The specified value for the JSON. 
       */
      public fun `value`(`value`: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.appmesh.CfnVirtualNode.JsonFormatRefProperty.Builder =
          software.amazon.awscdk.services.appmesh.CfnVirtualNode.JsonFormatRefProperty.builder()

      /**
       * @param key The specified key for the JSON. 
       */
      override fun key(key: String) {
        cdkBuilder.key(key)
      }

      /**
       * @param value The specified value for the JSON. 
       */
      override fun `value`(`value`: String) {
        cdkBuilder.`value`(`value`)
      }

      public fun build():
          software.amazon.awscdk.services.appmesh.CfnVirtualNode.JsonFormatRefProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.appmesh.CfnVirtualNode.JsonFormatRefProperty,
    ) : CdkObject(cdkObject), JsonFormatRefProperty {
      /**
       * The specified key for the JSON.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-virtualnode-jsonformatref.html#cfn-appmesh-virtualnode-jsonformatref-key)
       */
      override fun key(): String = unwrap(this).getKey()

      /**
       * The specified value for the JSON.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-virtualnode-jsonformatref.html#cfn-appmesh-virtualnode-jsonformatref-value)
       */
      override fun `value`(): String = unwrap(this).getValue()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): JsonFormatRefProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.appmesh.CfnVirtualNode.JsonFormatRefProperty):
          JsonFormatRefProperty = CdkObjectWrappers.wrap(cdkObject) as? JsonFormatRefProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: JsonFormatRefProperty):
          software.amazon.awscdk.services.appmesh.CfnVirtualNode.JsonFormatRefProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.appmesh.CfnVirtualNode.JsonFormatRefProperty
    }
  }

  /**
   * An object that represents a listener for a virtual node.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.appmesh.*;
   * ListenerProperty listenerProperty = ListenerProperty.builder()
   * .portMapping(PortMappingProperty.builder()
   * .port(123)
   * .protocol("protocol")
   * .build())
   * // the properties below are optional
   * .connectionPool(VirtualNodeConnectionPoolProperty.builder()
   * .grpc(VirtualNodeGrpcConnectionPoolProperty.builder()
   * .maxRequests(123)
   * .build())
   * .http(VirtualNodeHttpConnectionPoolProperty.builder()
   * .maxConnections(123)
   * // the properties below are optional
   * .maxPendingRequests(123)
   * .build())
   * .http2(VirtualNodeHttp2ConnectionPoolProperty.builder()
   * .maxRequests(123)
   * .build())
   * .tcp(VirtualNodeTcpConnectionPoolProperty.builder()
   * .maxConnections(123)
   * .build())
   * .build())
   * .healthCheck(HealthCheckProperty.builder()
   * .healthyThreshold(123)
   * .intervalMillis(123)
   * .protocol("protocol")
   * .timeoutMillis(123)
   * .unhealthyThreshold(123)
   * // the properties below are optional
   * .path("path")
   * .port(123)
   * .build())
   * .outlierDetection(OutlierDetectionProperty.builder()
   * .baseEjectionDuration(DurationProperty.builder()
   * .unit("unit")
   * .value(123)
   * .build())
   * .interval(DurationProperty.builder()
   * .unit("unit")
   * .value(123)
   * .build())
   * .maxEjectionPercent(123)
   * .maxServerErrors(123)
   * .build())
   * .timeout(ListenerTimeoutProperty.builder()
   * .grpc(GrpcTimeoutProperty.builder()
   * .idle(DurationProperty.builder()
   * .unit("unit")
   * .value(123)
   * .build())
   * .perRequest(DurationProperty.builder()
   * .unit("unit")
   * .value(123)
   * .build())
   * .build())
   * .http(HttpTimeoutProperty.builder()
   * .idle(DurationProperty.builder()
   * .unit("unit")
   * .value(123)
   * .build())
   * .perRequest(DurationProperty.builder()
   * .unit("unit")
   * .value(123)
   * .build())
   * .build())
   * .http2(HttpTimeoutProperty.builder()
   * .idle(DurationProperty.builder()
   * .unit("unit")
   * .value(123)
   * .build())
   * .perRequest(DurationProperty.builder()
   * .unit("unit")
   * .value(123)
   * .build())
   * .build())
   * .tcp(TcpTimeoutProperty.builder()
   * .idle(DurationProperty.builder()
   * .unit("unit")
   * .value(123)
   * .build())
   * .build())
   * .build())
   * .tls(ListenerTlsProperty.builder()
   * .certificate(ListenerTlsCertificateProperty.builder()
   * .acm(ListenerTlsAcmCertificateProperty.builder()
   * .certificateArn("certificateArn")
   * .build())
   * .file(ListenerTlsFileCertificateProperty.builder()
   * .certificateChain("certificateChain")
   * .privateKey("privateKey")
   * .build())
   * .sds(ListenerTlsSdsCertificateProperty.builder()
   * .secretName("secretName")
   * .build())
   * .build())
   * .mode("mode")
   * // the properties below are optional
   * .validation(ListenerTlsValidationContextProperty.builder()
   * .trust(ListenerTlsValidationContextTrustProperty.builder()
   * .file(TlsValidationContextFileTrustProperty.builder()
   * .certificateChain("certificateChain")
   * .build())
   * .sds(TlsValidationContextSdsTrustProperty.builder()
   * .secretName("secretName")
   * .build())
   * .build())
   * // the properties below are optional
   * .subjectAlternativeNames(SubjectAlternativeNamesProperty.builder()
   * .match(SubjectAlternativeNameMatchersProperty.builder()
   * .exact(List.of("exact"))
   * .build())
   * .build())
   * .build())
   * .build())
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-virtualnode-listener.html)
   */
  public interface ListenerProperty {
    /**
     * The connection pool information for the listener.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-virtualnode-listener.html#cfn-appmesh-virtualnode-listener-connectionpool)
     */
    public fun connectionPool(): Any? = unwrap(this).getConnectionPool()

    /**
     * The health check information for the listener.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-virtualnode-listener.html#cfn-appmesh-virtualnode-listener-healthcheck)
     */
    public fun healthCheck(): Any? = unwrap(this).getHealthCheck()

    /**
     * The outlier detection information for the listener.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-virtualnode-listener.html#cfn-appmesh-virtualnode-listener-outlierdetection)
     */
    public fun outlierDetection(): Any? = unwrap(this).getOutlierDetection()

    /**
     * The port mapping information for the listener.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-virtualnode-listener.html#cfn-appmesh-virtualnode-listener-portmapping)
     */
    public fun portMapping(): Any

    /**
     * An object that represents timeouts for different protocols.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-virtualnode-listener.html#cfn-appmesh-virtualnode-listener-timeout)
     */
    public fun timeout(): Any? = unwrap(this).getTimeout()

    /**
     * A reference to an object that represents the Transport Layer Security (TLS) properties for a
     * listener.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-virtualnode-listener.html#cfn-appmesh-virtualnode-listener-tls)
     */
    public fun tls(): Any? = unwrap(this).getTls()

    /**
     * A builder for [ListenerProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param connectionPool The connection pool information for the listener.
       */
      public fun connectionPool(connectionPool: IResolvable)

      /**
       * @param connectionPool The connection pool information for the listener.
       */
      public fun connectionPool(connectionPool: VirtualNodeConnectionPoolProperty)

      /**
       * @param connectionPool The connection pool information for the listener.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("73e8bb2088b07f1d9c17f979646d8caac2840f3c300b54d8ece5dc4e2dc29cdc")
      public
          fun connectionPool(connectionPool: VirtualNodeConnectionPoolProperty.Builder.() -> Unit)

      /**
       * @param healthCheck The health check information for the listener.
       */
      public fun healthCheck(healthCheck: IResolvable)

      /**
       * @param healthCheck The health check information for the listener.
       */
      public fun healthCheck(healthCheck: HealthCheckProperty)

      /**
       * @param healthCheck The health check information for the listener.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("610909536009ea3eb8f02b76bcc5d28f01ecb6ef2da3be37c321acd89b42f00b")
      public fun healthCheck(healthCheck: HealthCheckProperty.Builder.() -> Unit)

      /**
       * @param outlierDetection The outlier detection information for the listener.
       */
      public fun outlierDetection(outlierDetection: IResolvable)

      /**
       * @param outlierDetection The outlier detection information for the listener.
       */
      public fun outlierDetection(outlierDetection: OutlierDetectionProperty)

      /**
       * @param outlierDetection The outlier detection information for the listener.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("efa48cf3186219ec8ba58de0ca22dba76fb8b02bee554c5e3928ede7f82343e0")
      public fun outlierDetection(outlierDetection: OutlierDetectionProperty.Builder.() -> Unit)

      /**
       * @param portMapping The port mapping information for the listener. 
       */
      public fun portMapping(portMapping: IResolvable)

      /**
       * @param portMapping The port mapping information for the listener. 
       */
      public fun portMapping(portMapping: PortMappingProperty)

      /**
       * @param portMapping The port mapping information for the listener. 
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("3a9ffae0ca6685027997ecf8c0f50d78da5f5be9757ddf54526a3adfb2adeffe")
      public fun portMapping(portMapping: PortMappingProperty.Builder.() -> Unit)

      /**
       * @param timeout An object that represents timeouts for different protocols.
       */
      public fun timeout(timeout: IResolvable)

      /**
       * @param timeout An object that represents timeouts for different protocols.
       */
      public fun timeout(timeout: ListenerTimeoutProperty)

      /**
       * @param timeout An object that represents timeouts for different protocols.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("297ae121626d7760558e8ac310372c9625a8836052094f88a2ba4837a1305a16")
      public fun timeout(timeout: ListenerTimeoutProperty.Builder.() -> Unit)

      /**
       * @param tls A reference to an object that represents the Transport Layer Security (TLS)
       * properties for a listener.
       */
      public fun tls(tls: IResolvable)

      /**
       * @param tls A reference to an object that represents the Transport Layer Security (TLS)
       * properties for a listener.
       */
      public fun tls(tls: ListenerTlsProperty)

      /**
       * @param tls A reference to an object that represents the Transport Layer Security (TLS)
       * properties for a listener.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("0008091fd2d52098801ae827f99c4c6aecd3332fb40603851df92a3eeb7cc68f")
      public fun tls(tls: ListenerTlsProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.appmesh.CfnVirtualNode.ListenerProperty.Builder =
          software.amazon.awscdk.services.appmesh.CfnVirtualNode.ListenerProperty.builder()

      /**
       * @param connectionPool The connection pool information for the listener.
       */
      override fun connectionPool(connectionPool: IResolvable) {
        cdkBuilder.connectionPool(connectionPool.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param connectionPool The connection pool information for the listener.
       */
      override fun connectionPool(connectionPool: VirtualNodeConnectionPoolProperty) {
        cdkBuilder.connectionPool(connectionPool.let(VirtualNodeConnectionPoolProperty.Companion::unwrap))
      }

      /**
       * @param connectionPool The connection pool information for the listener.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("73e8bb2088b07f1d9c17f979646d8caac2840f3c300b54d8ece5dc4e2dc29cdc")
      override
          fun connectionPool(connectionPool: VirtualNodeConnectionPoolProperty.Builder.() -> Unit):
          Unit = connectionPool(VirtualNodeConnectionPoolProperty(connectionPool))

      /**
       * @param healthCheck The health check information for the listener.
       */
      override fun healthCheck(healthCheck: IResolvable) {
        cdkBuilder.healthCheck(healthCheck.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param healthCheck The health check information for the listener.
       */
      override fun healthCheck(healthCheck: HealthCheckProperty) {
        cdkBuilder.healthCheck(healthCheck.let(HealthCheckProperty.Companion::unwrap))
      }

      /**
       * @param healthCheck The health check information for the listener.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("610909536009ea3eb8f02b76bcc5d28f01ecb6ef2da3be37c321acd89b42f00b")
      override fun healthCheck(healthCheck: HealthCheckProperty.Builder.() -> Unit): Unit =
          healthCheck(HealthCheckProperty(healthCheck))

      /**
       * @param outlierDetection The outlier detection information for the listener.
       */
      override fun outlierDetection(outlierDetection: IResolvable) {
        cdkBuilder.outlierDetection(outlierDetection.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param outlierDetection The outlier detection information for the listener.
       */
      override fun outlierDetection(outlierDetection: OutlierDetectionProperty) {
        cdkBuilder.outlierDetection(outlierDetection.let(OutlierDetectionProperty.Companion::unwrap))
      }

      /**
       * @param outlierDetection The outlier detection information for the listener.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("efa48cf3186219ec8ba58de0ca22dba76fb8b02bee554c5e3928ede7f82343e0")
      override fun outlierDetection(outlierDetection: OutlierDetectionProperty.Builder.() -> Unit):
          Unit = outlierDetection(OutlierDetectionProperty(outlierDetection))

      /**
       * @param portMapping The port mapping information for the listener. 
       */
      override fun portMapping(portMapping: IResolvable) {
        cdkBuilder.portMapping(portMapping.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param portMapping The port mapping information for the listener. 
       */
      override fun portMapping(portMapping: PortMappingProperty) {
        cdkBuilder.portMapping(portMapping.let(PortMappingProperty.Companion::unwrap))
      }

      /**
       * @param portMapping The port mapping information for the listener. 
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("3a9ffae0ca6685027997ecf8c0f50d78da5f5be9757ddf54526a3adfb2adeffe")
      override fun portMapping(portMapping: PortMappingProperty.Builder.() -> Unit): Unit =
          portMapping(PortMappingProperty(portMapping))

      /**
       * @param timeout An object that represents timeouts for different protocols.
       */
      override fun timeout(timeout: IResolvable) {
        cdkBuilder.timeout(timeout.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param timeout An object that represents timeouts for different protocols.
       */
      override fun timeout(timeout: ListenerTimeoutProperty) {
        cdkBuilder.timeout(timeout.let(ListenerTimeoutProperty.Companion::unwrap))
      }

      /**
       * @param timeout An object that represents timeouts for different protocols.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("297ae121626d7760558e8ac310372c9625a8836052094f88a2ba4837a1305a16")
      override fun timeout(timeout: ListenerTimeoutProperty.Builder.() -> Unit): Unit =
          timeout(ListenerTimeoutProperty(timeout))

      /**
       * @param tls A reference to an object that represents the Transport Layer Security (TLS)
       * properties for a listener.
       */
      override fun tls(tls: IResolvable) {
        cdkBuilder.tls(tls.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param tls A reference to an object that represents the Transport Layer Security (TLS)
       * properties for a listener.
       */
      override fun tls(tls: ListenerTlsProperty) {
        cdkBuilder.tls(tls.let(ListenerTlsProperty.Companion::unwrap))
      }

      /**
       * @param tls A reference to an object that represents the Transport Layer Security (TLS)
       * properties for a listener.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("0008091fd2d52098801ae827f99c4c6aecd3332fb40603851df92a3eeb7cc68f")
      override fun tls(tls: ListenerTlsProperty.Builder.() -> Unit): Unit =
          tls(ListenerTlsProperty(tls))

      public fun build(): software.amazon.awscdk.services.appmesh.CfnVirtualNode.ListenerProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.appmesh.CfnVirtualNode.ListenerProperty,
    ) : CdkObject(cdkObject), ListenerProperty {
      /**
       * The connection pool information for the listener.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-virtualnode-listener.html#cfn-appmesh-virtualnode-listener-connectionpool)
       */
      override fun connectionPool(): Any? = unwrap(this).getConnectionPool()

      /**
       * The health check information for the listener.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-virtualnode-listener.html#cfn-appmesh-virtualnode-listener-healthcheck)
       */
      override fun healthCheck(): Any? = unwrap(this).getHealthCheck()

      /**
       * The outlier detection information for the listener.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-virtualnode-listener.html#cfn-appmesh-virtualnode-listener-outlierdetection)
       */
      override fun outlierDetection(): Any? = unwrap(this).getOutlierDetection()

      /**
       * The port mapping information for the listener.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-virtualnode-listener.html#cfn-appmesh-virtualnode-listener-portmapping)
       */
      override fun portMapping(): Any = unwrap(this).getPortMapping()

      /**
       * An object that represents timeouts for different protocols.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-virtualnode-listener.html#cfn-appmesh-virtualnode-listener-timeout)
       */
      override fun timeout(): Any? = unwrap(this).getTimeout()

      /**
       * A reference to an object that represents the Transport Layer Security (TLS) properties for
       * a listener.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-virtualnode-listener.html#cfn-appmesh-virtualnode-listener-tls)
       */
      override fun tls(): Any? = unwrap(this).getTls()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): ListenerProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.appmesh.CfnVirtualNode.ListenerProperty):
          ListenerProperty = CdkObjectWrappers.wrap(cdkObject) as? ListenerProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: ListenerProperty):
          software.amazon.awscdk.services.appmesh.CfnVirtualNode.ListenerProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.appmesh.CfnVirtualNode.ListenerProperty
    }
  }

  /**
   * An object that represents timeouts for different protocols.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.appmesh.*;
   * ListenerTimeoutProperty listenerTimeoutProperty = ListenerTimeoutProperty.builder()
   * .grpc(GrpcTimeoutProperty.builder()
   * .idle(DurationProperty.builder()
   * .unit("unit")
   * .value(123)
   * .build())
   * .perRequest(DurationProperty.builder()
   * .unit("unit")
   * .value(123)
   * .build())
   * .build())
   * .http(HttpTimeoutProperty.builder()
   * .idle(DurationProperty.builder()
   * .unit("unit")
   * .value(123)
   * .build())
   * .perRequest(DurationProperty.builder()
   * .unit("unit")
   * .value(123)
   * .build())
   * .build())
   * .http2(HttpTimeoutProperty.builder()
   * .idle(DurationProperty.builder()
   * .unit("unit")
   * .value(123)
   * .build())
   * .perRequest(DurationProperty.builder()
   * .unit("unit")
   * .value(123)
   * .build())
   * .build())
   * .tcp(TcpTimeoutProperty.builder()
   * .idle(DurationProperty.builder()
   * .unit("unit")
   * .value(123)
   * .build())
   * .build())
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-virtualnode-listenertimeout.html)
   */
  public interface ListenerTimeoutProperty {
    /**
     * An object that represents types of timeouts.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-virtualnode-listenertimeout.html#cfn-appmesh-virtualnode-listenertimeout-grpc)
     */
    public fun grpc(): Any? = unwrap(this).getGrpc()

    /**
     * An object that represents types of timeouts.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-virtualnode-listenertimeout.html#cfn-appmesh-virtualnode-listenertimeout-http)
     */
    public fun http(): Any? = unwrap(this).getHttp()

    /**
     * An object that represents types of timeouts.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-virtualnode-listenertimeout.html#cfn-appmesh-virtualnode-listenertimeout-http2)
     */
    public fun http2(): Any? = unwrap(this).getHttp2()

    /**
     * An object that represents types of timeouts.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-virtualnode-listenertimeout.html#cfn-appmesh-virtualnode-listenertimeout-tcp)
     */
    public fun tcp(): Any? = unwrap(this).getTcp()

    /**
     * A builder for [ListenerTimeoutProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param grpc An object that represents types of timeouts.
       */
      public fun grpc(grpc: IResolvable)

      /**
       * @param grpc An object that represents types of timeouts.
       */
      public fun grpc(grpc: GrpcTimeoutProperty)

      /**
       * @param grpc An object that represents types of timeouts.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("24ab94bdef721a1d71e64b1366e6fa97856af0605600c4386e2b3a4d3bee9b92")
      public fun grpc(grpc: GrpcTimeoutProperty.Builder.() -> Unit)

      /**
       * @param http An object that represents types of timeouts.
       */
      public fun http(http: IResolvable)

      /**
       * @param http An object that represents types of timeouts.
       */
      public fun http(http: HttpTimeoutProperty)

      /**
       * @param http An object that represents types of timeouts.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("ec837eab74e9ee033aded64202fddce06d4c51d521c77b554e3b17d74c2afcdf")
      public fun http(http: HttpTimeoutProperty.Builder.() -> Unit)

      /**
       * @param http2 An object that represents types of timeouts.
       */
      public fun http2(http2: IResolvable)

      /**
       * @param http2 An object that represents types of timeouts.
       */
      public fun http2(http2: HttpTimeoutProperty)

      /**
       * @param http2 An object that represents types of timeouts.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("ecd650fe52c88cc09a88346ca59cdd8ee5cb66f5e62241a9f55df42e85e5ae76")
      public fun http2(http2: HttpTimeoutProperty.Builder.() -> Unit)

      /**
       * @param tcp An object that represents types of timeouts.
       */
      public fun tcp(tcp: IResolvable)

      /**
       * @param tcp An object that represents types of timeouts.
       */
      public fun tcp(tcp: TcpTimeoutProperty)

      /**
       * @param tcp An object that represents types of timeouts.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("2367403a8ddfd6a378681f9db77a7303388e580a270a1a2f8e7fc4b2c32ce07a")
      public fun tcp(tcp: TcpTimeoutProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.appmesh.CfnVirtualNode.ListenerTimeoutProperty.Builder =
          software.amazon.awscdk.services.appmesh.CfnVirtualNode.ListenerTimeoutProperty.builder()

      /**
       * @param grpc An object that represents types of timeouts.
       */
      override fun grpc(grpc: IResolvable) {
        cdkBuilder.grpc(grpc.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param grpc An object that represents types of timeouts.
       */
      override fun grpc(grpc: GrpcTimeoutProperty) {
        cdkBuilder.grpc(grpc.let(GrpcTimeoutProperty.Companion::unwrap))
      }

      /**
       * @param grpc An object that represents types of timeouts.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("24ab94bdef721a1d71e64b1366e6fa97856af0605600c4386e2b3a4d3bee9b92")
      override fun grpc(grpc: GrpcTimeoutProperty.Builder.() -> Unit): Unit =
          grpc(GrpcTimeoutProperty(grpc))

      /**
       * @param http An object that represents types of timeouts.
       */
      override fun http(http: IResolvable) {
        cdkBuilder.http(http.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param http An object that represents types of timeouts.
       */
      override fun http(http: HttpTimeoutProperty) {
        cdkBuilder.http(http.let(HttpTimeoutProperty.Companion::unwrap))
      }

      /**
       * @param http An object that represents types of timeouts.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("ec837eab74e9ee033aded64202fddce06d4c51d521c77b554e3b17d74c2afcdf")
      override fun http(http: HttpTimeoutProperty.Builder.() -> Unit): Unit =
          http(HttpTimeoutProperty(http))

      /**
       * @param http2 An object that represents types of timeouts.
       */
      override fun http2(http2: IResolvable) {
        cdkBuilder.http2(http2.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param http2 An object that represents types of timeouts.
       */
      override fun http2(http2: HttpTimeoutProperty) {
        cdkBuilder.http2(http2.let(HttpTimeoutProperty.Companion::unwrap))
      }

      /**
       * @param http2 An object that represents types of timeouts.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("ecd650fe52c88cc09a88346ca59cdd8ee5cb66f5e62241a9f55df42e85e5ae76")
      override fun http2(http2: HttpTimeoutProperty.Builder.() -> Unit): Unit =
          http2(HttpTimeoutProperty(http2))

      /**
       * @param tcp An object that represents types of timeouts.
       */
      override fun tcp(tcp: IResolvable) {
        cdkBuilder.tcp(tcp.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param tcp An object that represents types of timeouts.
       */
      override fun tcp(tcp: TcpTimeoutProperty) {
        cdkBuilder.tcp(tcp.let(TcpTimeoutProperty.Companion::unwrap))
      }

      /**
       * @param tcp An object that represents types of timeouts.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("2367403a8ddfd6a378681f9db77a7303388e580a270a1a2f8e7fc4b2c32ce07a")
      override fun tcp(tcp: TcpTimeoutProperty.Builder.() -> Unit): Unit =
          tcp(TcpTimeoutProperty(tcp))

      public fun build():
          software.amazon.awscdk.services.appmesh.CfnVirtualNode.ListenerTimeoutProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.appmesh.CfnVirtualNode.ListenerTimeoutProperty,
    ) : CdkObject(cdkObject), ListenerTimeoutProperty {
      /**
       * An object that represents types of timeouts.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-virtualnode-listenertimeout.html#cfn-appmesh-virtualnode-listenertimeout-grpc)
       */
      override fun grpc(): Any? = unwrap(this).getGrpc()

      /**
       * An object that represents types of timeouts.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-virtualnode-listenertimeout.html#cfn-appmesh-virtualnode-listenertimeout-http)
       */
      override fun http(): Any? = unwrap(this).getHttp()

      /**
       * An object that represents types of timeouts.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-virtualnode-listenertimeout.html#cfn-appmesh-virtualnode-listenertimeout-http2)
       */
      override fun http2(): Any? = unwrap(this).getHttp2()

      /**
       * An object that represents types of timeouts.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-virtualnode-listenertimeout.html#cfn-appmesh-virtualnode-listenertimeout-tcp)
       */
      override fun tcp(): Any? = unwrap(this).getTcp()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): ListenerTimeoutProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.appmesh.CfnVirtualNode.ListenerTimeoutProperty):
          ListenerTimeoutProperty = CdkObjectWrappers.wrap(cdkObject) as? ListenerTimeoutProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: ListenerTimeoutProperty):
          software.amazon.awscdk.services.appmesh.CfnVirtualNode.ListenerTimeoutProperty = (wrapped
          as CdkObject).cdkObject as
          software.amazon.awscdk.services.appmesh.CfnVirtualNode.ListenerTimeoutProperty
    }
  }

  /**
   * An object that represents an AWS Certificate Manager certificate.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.appmesh.*;
   * ListenerTlsAcmCertificateProperty listenerTlsAcmCertificateProperty =
   * ListenerTlsAcmCertificateProperty.builder()
   * .certificateArn("certificateArn")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-virtualnode-listenertlsacmcertificate.html)
   */
  public interface ListenerTlsAcmCertificateProperty {
    /**
     * The Amazon Resource Name (ARN) for the certificate.
     *
     * The certificate must meet specific requirements and you must have proxy authorization
     * enabled. For more information, see [Transport Layer Security
     * (TLS)](https://docs.aws.amazon.com/app-mesh/latest/userguide/tls.html#virtual-node-tls-prerequisites)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-virtualnode-listenertlsacmcertificate.html#cfn-appmesh-virtualnode-listenertlsacmcertificate-certificatearn)
     */
    public fun certificateArn(): String

    /**
     * A builder for [ListenerTlsAcmCertificateProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param certificateArn The Amazon Resource Name (ARN) for the certificate. 
       * The certificate must meet specific requirements and you must have proxy authorization
       * enabled. For more information, see [Transport Layer Security
       * (TLS)](https://docs.aws.amazon.com/app-mesh/latest/userguide/tls.html#virtual-node-tls-prerequisites)
       * .
       */
      public fun certificateArn(certificateArn: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.appmesh.CfnVirtualNode.ListenerTlsAcmCertificateProperty.Builder
          =
          software.amazon.awscdk.services.appmesh.CfnVirtualNode.ListenerTlsAcmCertificateProperty.builder()

      /**
       * @param certificateArn The Amazon Resource Name (ARN) for the certificate. 
       * The certificate must meet specific requirements and you must have proxy authorization
       * enabled. For more information, see [Transport Layer Security
       * (TLS)](https://docs.aws.amazon.com/app-mesh/latest/userguide/tls.html#virtual-node-tls-prerequisites)
       * .
       */
      override fun certificateArn(certificateArn: String) {
        cdkBuilder.certificateArn(certificateArn)
      }

      public fun build():
          software.amazon.awscdk.services.appmesh.CfnVirtualNode.ListenerTlsAcmCertificateProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.appmesh.CfnVirtualNode.ListenerTlsAcmCertificateProperty,
    ) : CdkObject(cdkObject), ListenerTlsAcmCertificateProperty {
      /**
       * The Amazon Resource Name (ARN) for the certificate.
       *
       * The certificate must meet specific requirements and you must have proxy authorization
       * enabled. For more information, see [Transport Layer Security
       * (TLS)](https://docs.aws.amazon.com/app-mesh/latest/userguide/tls.html#virtual-node-tls-prerequisites)
       * .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-virtualnode-listenertlsacmcertificate.html#cfn-appmesh-virtualnode-listenertlsacmcertificate-certificatearn)
       */
      override fun certificateArn(): String = unwrap(this).getCertificateArn()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          ListenerTlsAcmCertificateProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.appmesh.CfnVirtualNode.ListenerTlsAcmCertificateProperty):
          ListenerTlsAcmCertificateProperty = CdkObjectWrappers.wrap(cdkObject) as?
          ListenerTlsAcmCertificateProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: ListenerTlsAcmCertificateProperty):
          software.amazon.awscdk.services.appmesh.CfnVirtualNode.ListenerTlsAcmCertificateProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.appmesh.CfnVirtualNode.ListenerTlsAcmCertificateProperty
    }
  }

  /**
   * An object that represents a listener's Transport Layer Security (TLS) certificate.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.appmesh.*;
   * ListenerTlsCertificateProperty listenerTlsCertificateProperty =
   * ListenerTlsCertificateProperty.builder()
   * .acm(ListenerTlsAcmCertificateProperty.builder()
   * .certificateArn("certificateArn")
   * .build())
   * .file(ListenerTlsFileCertificateProperty.builder()
   * .certificateChain("certificateChain")
   * .privateKey("privateKey")
   * .build())
   * .sds(ListenerTlsSdsCertificateProperty.builder()
   * .secretName("secretName")
   * .build())
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-virtualnode-listenertlscertificate.html)
   */
  public interface ListenerTlsCertificateProperty {
    /**
     * A reference to an object that represents an AWS Certificate Manager certificate.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-virtualnode-listenertlscertificate.html#cfn-appmesh-virtualnode-listenertlscertificate-acm)
     */
    public fun acm(): Any? = unwrap(this).getAcm()

    /**
     * A reference to an object that represents a local file certificate.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-virtualnode-listenertlscertificate.html#cfn-appmesh-virtualnode-listenertlscertificate-file)
     */
    public fun `file`(): Any? = unwrap(this).getFile()

    /**
     * A reference to an object that represents a listener's Secret Discovery Service certificate.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-virtualnode-listenertlscertificate.html#cfn-appmesh-virtualnode-listenertlscertificate-sds)
     */
    public fun sds(): Any? = unwrap(this).getSds()

    /**
     * A builder for [ListenerTlsCertificateProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param acm A reference to an object that represents an AWS Certificate Manager certificate.
       */
      public fun acm(acm: IResolvable)

      /**
       * @param acm A reference to an object that represents an AWS Certificate Manager certificate.
       */
      public fun acm(acm: ListenerTlsAcmCertificateProperty)

      /**
       * @param acm A reference to an object that represents an AWS Certificate Manager certificate.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("bb032ee5102ad80e953ad2ce55b834aa42e25e80b7ff85776f6fa47e9ebfb403")
      public fun acm(acm: ListenerTlsAcmCertificateProperty.Builder.() -> Unit)

      /**
       * @param file A reference to an object that represents a local file certificate.
       */
      public fun `file`(`file`: IResolvable)

      /**
       * @param file A reference to an object that represents a local file certificate.
       */
      public fun `file`(`file`: ListenerTlsFileCertificateProperty)

      /**
       * @param file A reference to an object that represents a local file certificate.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("74fad4106711e75536bcbf59b5fd58437dc9a98979579dc2f7c7ac7a876bd97c")
      public fun `file`(`file`: ListenerTlsFileCertificateProperty.Builder.() -> Unit)

      /**
       * @param sds A reference to an object that represents a listener's Secret Discovery Service
       * certificate.
       */
      public fun sds(sds: IResolvable)

      /**
       * @param sds A reference to an object that represents a listener's Secret Discovery Service
       * certificate.
       */
      public fun sds(sds: ListenerTlsSdsCertificateProperty)

      /**
       * @param sds A reference to an object that represents a listener's Secret Discovery Service
       * certificate.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("c82a3641aca69e99c1d0e545d21e29720899db03c76f37ab907a7b496c450a10")
      public fun sds(sds: ListenerTlsSdsCertificateProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.appmesh.CfnVirtualNode.ListenerTlsCertificateProperty.Builder
          =
          software.amazon.awscdk.services.appmesh.CfnVirtualNode.ListenerTlsCertificateProperty.builder()

      /**
       * @param acm A reference to an object that represents an AWS Certificate Manager certificate.
       */
      override fun acm(acm: IResolvable) {
        cdkBuilder.acm(acm.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param acm A reference to an object that represents an AWS Certificate Manager certificate.
       */
      override fun acm(acm: ListenerTlsAcmCertificateProperty) {
        cdkBuilder.acm(acm.let(ListenerTlsAcmCertificateProperty.Companion::unwrap))
      }

      /**
       * @param acm A reference to an object that represents an AWS Certificate Manager certificate.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("bb032ee5102ad80e953ad2ce55b834aa42e25e80b7ff85776f6fa47e9ebfb403")
      override fun acm(acm: ListenerTlsAcmCertificateProperty.Builder.() -> Unit): Unit =
          acm(ListenerTlsAcmCertificateProperty(acm))

      /**
       * @param file A reference to an object that represents a local file certificate.
       */
      override fun `file`(`file`: IResolvable) {
        cdkBuilder.`file`(`file`.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param file A reference to an object that represents a local file certificate.
       */
      override fun `file`(`file`: ListenerTlsFileCertificateProperty) {
        cdkBuilder.`file`(`file`.let(ListenerTlsFileCertificateProperty.Companion::unwrap))
      }

      /**
       * @param file A reference to an object that represents a local file certificate.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("74fad4106711e75536bcbf59b5fd58437dc9a98979579dc2f7c7ac7a876bd97c")
      override fun `file`(`file`: ListenerTlsFileCertificateProperty.Builder.() -> Unit): Unit =
          `file`(ListenerTlsFileCertificateProperty(`file`))

      /**
       * @param sds A reference to an object that represents a listener's Secret Discovery Service
       * certificate.
       */
      override fun sds(sds: IResolvable) {
        cdkBuilder.sds(sds.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param sds A reference to an object that represents a listener's Secret Discovery Service
       * certificate.
       */
      override fun sds(sds: ListenerTlsSdsCertificateProperty) {
        cdkBuilder.sds(sds.let(ListenerTlsSdsCertificateProperty.Companion::unwrap))
      }

      /**
       * @param sds A reference to an object that represents a listener's Secret Discovery Service
       * certificate.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("c82a3641aca69e99c1d0e545d21e29720899db03c76f37ab907a7b496c450a10")
      override fun sds(sds: ListenerTlsSdsCertificateProperty.Builder.() -> Unit): Unit =
          sds(ListenerTlsSdsCertificateProperty(sds))

      public fun build():
          software.amazon.awscdk.services.appmesh.CfnVirtualNode.ListenerTlsCertificateProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.appmesh.CfnVirtualNode.ListenerTlsCertificateProperty,
    ) : CdkObject(cdkObject), ListenerTlsCertificateProperty {
      /**
       * A reference to an object that represents an AWS Certificate Manager certificate.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-virtualnode-listenertlscertificate.html#cfn-appmesh-virtualnode-listenertlscertificate-acm)
       */
      override fun acm(): Any? = unwrap(this).getAcm()

      /**
       * A reference to an object that represents a local file certificate.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-virtualnode-listenertlscertificate.html#cfn-appmesh-virtualnode-listenertlscertificate-file)
       */
      override fun `file`(): Any? = unwrap(this).getFile()

      /**
       * A reference to an object that represents a listener's Secret Discovery Service certificate.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-virtualnode-listenertlscertificate.html#cfn-appmesh-virtualnode-listenertlscertificate-sds)
       */
      override fun sds(): Any? = unwrap(this).getSds()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): ListenerTlsCertificateProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.appmesh.CfnVirtualNode.ListenerTlsCertificateProperty):
          ListenerTlsCertificateProperty = CdkObjectWrappers.wrap(cdkObject) as?
          ListenerTlsCertificateProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: ListenerTlsCertificateProperty):
          software.amazon.awscdk.services.appmesh.CfnVirtualNode.ListenerTlsCertificateProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.appmesh.CfnVirtualNode.ListenerTlsCertificateProperty
    }
  }

  /**
   * An object that represents a local file certificate.
   *
   * The certificate must meet specific requirements and you must have proxy authorization enabled.
   * For more information, see [Transport Layer Security
   * (TLS)](https://docs.aws.amazon.com/app-mesh/latest/userguide/tls.html#virtual-node-tls-prerequisites)
   * .
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.appmesh.*;
   * ListenerTlsFileCertificateProperty listenerTlsFileCertificateProperty =
   * ListenerTlsFileCertificateProperty.builder()
   * .certificateChain("certificateChain")
   * .privateKey("privateKey")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-virtualnode-listenertlsfilecertificate.html)
   */
  public interface ListenerTlsFileCertificateProperty {
    /**
     * The certificate chain for the certificate.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-virtualnode-listenertlsfilecertificate.html#cfn-appmesh-virtualnode-listenertlsfilecertificate-certificatechain)
     */
    public fun certificateChain(): String

    /**
     * The private key for a certificate stored on the file system of the virtual node that the
     * proxy is running on.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-virtualnode-listenertlsfilecertificate.html#cfn-appmesh-virtualnode-listenertlsfilecertificate-privatekey)
     */
    public fun privateKey(): String

    /**
     * A builder for [ListenerTlsFileCertificateProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param certificateChain The certificate chain for the certificate. 
       */
      public fun certificateChain(certificateChain: String)

      /**
       * @param privateKey The private key for a certificate stored on the file system of the
       * virtual node that the proxy is running on. 
       */
      public fun privateKey(privateKey: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.appmesh.CfnVirtualNode.ListenerTlsFileCertificateProperty.Builder
          =
          software.amazon.awscdk.services.appmesh.CfnVirtualNode.ListenerTlsFileCertificateProperty.builder()

      /**
       * @param certificateChain The certificate chain for the certificate. 
       */
      override fun certificateChain(certificateChain: String) {
        cdkBuilder.certificateChain(certificateChain)
      }

      /**
       * @param privateKey The private key for a certificate stored on the file system of the
       * virtual node that the proxy is running on. 
       */
      override fun privateKey(privateKey: String) {
        cdkBuilder.privateKey(privateKey)
      }

      public fun build():
          software.amazon.awscdk.services.appmesh.CfnVirtualNode.ListenerTlsFileCertificateProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.appmesh.CfnVirtualNode.ListenerTlsFileCertificateProperty,
    ) : CdkObject(cdkObject), ListenerTlsFileCertificateProperty {
      /**
       * The certificate chain for the certificate.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-virtualnode-listenertlsfilecertificate.html#cfn-appmesh-virtualnode-listenertlsfilecertificate-certificatechain)
       */
      override fun certificateChain(): String = unwrap(this).getCertificateChain()

      /**
       * The private key for a certificate stored on the file system of the virtual node that the
       * proxy is running on.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-virtualnode-listenertlsfilecertificate.html#cfn-appmesh-virtualnode-listenertlsfilecertificate-privatekey)
       */
      override fun privateKey(): String = unwrap(this).getPrivateKey()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          ListenerTlsFileCertificateProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.appmesh.CfnVirtualNode.ListenerTlsFileCertificateProperty):
          ListenerTlsFileCertificateProperty = CdkObjectWrappers.wrap(cdkObject) as?
          ListenerTlsFileCertificateProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: ListenerTlsFileCertificateProperty):
          software.amazon.awscdk.services.appmesh.CfnVirtualNode.ListenerTlsFileCertificateProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.appmesh.CfnVirtualNode.ListenerTlsFileCertificateProperty
    }
  }

  /**
   * An object that represents the Transport Layer Security (TLS) properties for a listener.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.appmesh.*;
   * ListenerTlsProperty listenerTlsProperty = ListenerTlsProperty.builder()
   * .certificate(ListenerTlsCertificateProperty.builder()
   * .acm(ListenerTlsAcmCertificateProperty.builder()
   * .certificateArn("certificateArn")
   * .build())
   * .file(ListenerTlsFileCertificateProperty.builder()
   * .certificateChain("certificateChain")
   * .privateKey("privateKey")
   * .build())
   * .sds(ListenerTlsSdsCertificateProperty.builder()
   * .secretName("secretName")
   * .build())
   * .build())
   * .mode("mode")
   * // the properties below are optional
   * .validation(ListenerTlsValidationContextProperty.builder()
   * .trust(ListenerTlsValidationContextTrustProperty.builder()
   * .file(TlsValidationContextFileTrustProperty.builder()
   * .certificateChain("certificateChain")
   * .build())
   * .sds(TlsValidationContextSdsTrustProperty.builder()
   * .secretName("secretName")
   * .build())
   * .build())
   * // the properties below are optional
   * .subjectAlternativeNames(SubjectAlternativeNamesProperty.builder()
   * .match(SubjectAlternativeNameMatchersProperty.builder()
   * .exact(List.of("exact"))
   * .build())
   * .build())
   * .build())
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-virtualnode-listenertls.html)
   */
  public interface ListenerTlsProperty {
    /**
     * A reference to an object that represents a listener's Transport Layer Security (TLS)
     * certificate.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-virtualnode-listenertls.html#cfn-appmesh-virtualnode-listenertls-certificate)
     */
    public fun certificate(): Any

    /**
     * Specify one of the following modes.
     *
     * * ** STRICT – Listener only accepts connections with TLS enabled.
     * * ** PERMISSIVE – Listener accepts connections with or without TLS enabled.
     * * ** DISABLED – Listener only accepts connections without TLS.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-virtualnode-listenertls.html#cfn-appmesh-virtualnode-listenertls-mode)
     */
    public fun mode(): String

    /**
     * A reference to an object that represents a listener's Transport Layer Security (TLS)
     * validation context.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-virtualnode-listenertls.html#cfn-appmesh-virtualnode-listenertls-validation)
     */
    public fun validation(): Any? = unwrap(this).getValidation()

    /**
     * A builder for [ListenerTlsProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param certificate A reference to an object that represents a listener's Transport Layer
       * Security (TLS) certificate. 
       */
      public fun certificate(certificate: IResolvable)

      /**
       * @param certificate A reference to an object that represents a listener's Transport Layer
       * Security (TLS) certificate. 
       */
      public fun certificate(certificate: ListenerTlsCertificateProperty)

      /**
       * @param certificate A reference to an object that represents a listener's Transport Layer
       * Security (TLS) certificate. 
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("15a66daa66c3b460d194e3fe5bc22be0a14ffea04b50cf2142dd0d8be36258b5")
      public fun certificate(certificate: ListenerTlsCertificateProperty.Builder.() -> Unit)

      /**
       * @param mode Specify one of the following modes. 
       * * ** STRICT – Listener only accepts connections with TLS enabled.
       * * ** PERMISSIVE – Listener accepts connections with or without TLS enabled.
       * * ** DISABLED – Listener only accepts connections without TLS.
       */
      public fun mode(mode: String)

      /**
       * @param validation A reference to an object that represents a listener's Transport Layer
       * Security (TLS) validation context.
       */
      public fun validation(validation: IResolvable)

      /**
       * @param validation A reference to an object that represents a listener's Transport Layer
       * Security (TLS) validation context.
       */
      public fun validation(validation: ListenerTlsValidationContextProperty)

      /**
       * @param validation A reference to an object that represents a listener's Transport Layer
       * Security (TLS) validation context.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("36ab8e075abb74c1fa39f8eee4d5f3d39a37610e664f68a221417bfb3fc5132b")
      public fun validation(validation: ListenerTlsValidationContextProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.appmesh.CfnVirtualNode.ListenerTlsProperty.Builder =
          software.amazon.awscdk.services.appmesh.CfnVirtualNode.ListenerTlsProperty.builder()

      /**
       * @param certificate A reference to an object that represents a listener's Transport Layer
       * Security (TLS) certificate. 
       */
      override fun certificate(certificate: IResolvable) {
        cdkBuilder.certificate(certificate.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param certificate A reference to an object that represents a listener's Transport Layer
       * Security (TLS) certificate. 
       */
      override fun certificate(certificate: ListenerTlsCertificateProperty) {
        cdkBuilder.certificate(certificate.let(ListenerTlsCertificateProperty.Companion::unwrap))
      }

      /**
       * @param certificate A reference to an object that represents a listener's Transport Layer
       * Security (TLS) certificate. 
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("15a66daa66c3b460d194e3fe5bc22be0a14ffea04b50cf2142dd0d8be36258b5")
      override fun certificate(certificate: ListenerTlsCertificateProperty.Builder.() -> Unit): Unit
          = certificate(ListenerTlsCertificateProperty(certificate))

      /**
       * @param mode Specify one of the following modes. 
       * * ** STRICT – Listener only accepts connections with TLS enabled.
       * * ** PERMISSIVE – Listener accepts connections with or without TLS enabled.
       * * ** DISABLED – Listener only accepts connections without TLS.
       */
      override fun mode(mode: String) {
        cdkBuilder.mode(mode)
      }

      /**
       * @param validation A reference to an object that represents a listener's Transport Layer
       * Security (TLS) validation context.
       */
      override fun validation(validation: IResolvable) {
        cdkBuilder.validation(validation.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param validation A reference to an object that represents a listener's Transport Layer
       * Security (TLS) validation context.
       */
      override fun validation(validation: ListenerTlsValidationContextProperty) {
        cdkBuilder.validation(validation.let(ListenerTlsValidationContextProperty.Companion::unwrap))
      }

      /**
       * @param validation A reference to an object that represents a listener's Transport Layer
       * Security (TLS) validation context.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("36ab8e075abb74c1fa39f8eee4d5f3d39a37610e664f68a221417bfb3fc5132b")
      override fun validation(validation: ListenerTlsValidationContextProperty.Builder.() -> Unit):
          Unit = validation(ListenerTlsValidationContextProperty(validation))

      public fun build(): software.amazon.awscdk.services.appmesh.CfnVirtualNode.ListenerTlsProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.appmesh.CfnVirtualNode.ListenerTlsProperty,
    ) : CdkObject(cdkObject), ListenerTlsProperty {
      /**
       * A reference to an object that represents a listener's Transport Layer Security (TLS)
       * certificate.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-virtualnode-listenertls.html#cfn-appmesh-virtualnode-listenertls-certificate)
       */
      override fun certificate(): Any = unwrap(this).getCertificate()

      /**
       * Specify one of the following modes.
       *
       * * ** STRICT – Listener only accepts connections with TLS enabled.
       * * ** PERMISSIVE – Listener accepts connections with or without TLS enabled.
       * * ** DISABLED – Listener only accepts connections without TLS.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-virtualnode-listenertls.html#cfn-appmesh-virtualnode-listenertls-mode)
       */
      override fun mode(): String = unwrap(this).getMode()

      /**
       * A reference to an object that represents a listener's Transport Layer Security (TLS)
       * validation context.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-virtualnode-listenertls.html#cfn-appmesh-virtualnode-listenertls-validation)
       */
      override fun validation(): Any? = unwrap(this).getValidation()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): ListenerTlsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.appmesh.CfnVirtualNode.ListenerTlsProperty):
          ListenerTlsProperty = CdkObjectWrappers.wrap(cdkObject) as? ListenerTlsProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: ListenerTlsProperty):
          software.amazon.awscdk.services.appmesh.CfnVirtualNode.ListenerTlsProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.appmesh.CfnVirtualNode.ListenerTlsProperty
    }
  }

  /**
   * An object that represents the listener's Secret Discovery Service certificate.
   *
   * The proxy must be configured with a local SDS provider via a Unix Domain Socket. See App Mesh
   * [TLS documentation](https://docs.aws.amazon.com/app-mesh/latest/userguide/tls.html) for more info.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.appmesh.*;
   * ListenerTlsSdsCertificateProperty listenerTlsSdsCertificateProperty =
   * ListenerTlsSdsCertificateProperty.builder()
   * .secretName("secretName")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-virtualnode-listenertlssdscertificate.html)
   */
  public interface ListenerTlsSdsCertificateProperty {
    /**
     * A reference to an object that represents the name of the secret requested from the Secret
     * Discovery Service provider representing Transport Layer Security (TLS) materials like a
     * certificate or certificate chain.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-virtualnode-listenertlssdscertificate.html#cfn-appmesh-virtualnode-listenertlssdscertificate-secretname)
     */
    public fun secretName(): String

    /**
     * A builder for [ListenerTlsSdsCertificateProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param secretName A reference to an object that represents the name of the secret requested
       * from the Secret Discovery Service provider representing Transport Layer Security (TLS)
       * materials like a certificate or certificate chain. 
       */
      public fun secretName(secretName: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.appmesh.CfnVirtualNode.ListenerTlsSdsCertificateProperty.Builder
          =
          software.amazon.awscdk.services.appmesh.CfnVirtualNode.ListenerTlsSdsCertificateProperty.builder()

      /**
       * @param secretName A reference to an object that represents the name of the secret requested
       * from the Secret Discovery Service provider representing Transport Layer Security (TLS)
       * materials like a certificate or certificate chain. 
       */
      override fun secretName(secretName: String) {
        cdkBuilder.secretName(secretName)
      }

      public fun build():
          software.amazon.awscdk.services.appmesh.CfnVirtualNode.ListenerTlsSdsCertificateProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.appmesh.CfnVirtualNode.ListenerTlsSdsCertificateProperty,
    ) : CdkObject(cdkObject), ListenerTlsSdsCertificateProperty {
      /**
       * A reference to an object that represents the name of the secret requested from the Secret
       * Discovery Service provider representing Transport Layer Security (TLS) materials like a
       * certificate or certificate chain.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-virtualnode-listenertlssdscertificate.html#cfn-appmesh-virtualnode-listenertlssdscertificate-secretname)
       */
      override fun secretName(): String = unwrap(this).getSecretName()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          ListenerTlsSdsCertificateProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.appmesh.CfnVirtualNode.ListenerTlsSdsCertificateProperty):
          ListenerTlsSdsCertificateProperty = CdkObjectWrappers.wrap(cdkObject) as?
          ListenerTlsSdsCertificateProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: ListenerTlsSdsCertificateProperty):
          software.amazon.awscdk.services.appmesh.CfnVirtualNode.ListenerTlsSdsCertificateProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.appmesh.CfnVirtualNode.ListenerTlsSdsCertificateProperty
    }
  }

  /**
   * An object that represents a listener's Transport Layer Security (TLS) validation context.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.appmesh.*;
   * ListenerTlsValidationContextProperty listenerTlsValidationContextProperty =
   * ListenerTlsValidationContextProperty.builder()
   * .trust(ListenerTlsValidationContextTrustProperty.builder()
   * .file(TlsValidationContextFileTrustProperty.builder()
   * .certificateChain("certificateChain")
   * .build())
   * .sds(TlsValidationContextSdsTrustProperty.builder()
   * .secretName("secretName")
   * .build())
   * .build())
   * // the properties below are optional
   * .subjectAlternativeNames(SubjectAlternativeNamesProperty.builder()
   * .match(SubjectAlternativeNameMatchersProperty.builder()
   * .exact(List.of("exact"))
   * .build())
   * .build())
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-virtualnode-listenertlsvalidationcontext.html)
   */
  public interface ListenerTlsValidationContextProperty {
    /**
     * A reference to an object that represents the SANs for a listener's Transport Layer Security
     * (TLS) validation context.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-virtualnode-listenertlsvalidationcontext.html#cfn-appmesh-virtualnode-listenertlsvalidationcontext-subjectalternativenames)
     */
    public fun subjectAlternativeNames(): Any? = unwrap(this).getSubjectAlternativeNames()

    /**
     * A reference to where to retrieve the trust chain when validating a peer’s Transport Layer
     * Security (TLS) certificate.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-virtualnode-listenertlsvalidationcontext.html#cfn-appmesh-virtualnode-listenertlsvalidationcontext-trust)
     */
    public fun trust(): Any

    /**
     * A builder for [ListenerTlsValidationContextProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param subjectAlternativeNames A reference to an object that represents the SANs for a
       * listener's Transport Layer Security (TLS) validation context.
       */
      public fun subjectAlternativeNames(subjectAlternativeNames: IResolvable)

      /**
       * @param subjectAlternativeNames A reference to an object that represents the SANs for a
       * listener's Transport Layer Security (TLS) validation context.
       */
      public fun subjectAlternativeNames(subjectAlternativeNames: SubjectAlternativeNamesProperty)

      /**
       * @param subjectAlternativeNames A reference to an object that represents the SANs for a
       * listener's Transport Layer Security (TLS) validation context.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("edc06a6797214a405c22d9acce7c7f1acb2bfbdb52657dcab08d01ef2ae82b3c")
      public
          fun subjectAlternativeNames(subjectAlternativeNames: SubjectAlternativeNamesProperty.Builder.() -> Unit)

      /**
       * @param trust A reference to where to retrieve the trust chain when validating a peer’s
       * Transport Layer Security (TLS) certificate. 
       */
      public fun trust(trust: IResolvable)

      /**
       * @param trust A reference to where to retrieve the trust chain when validating a peer’s
       * Transport Layer Security (TLS) certificate. 
       */
      public fun trust(trust: ListenerTlsValidationContextTrustProperty)

      /**
       * @param trust A reference to where to retrieve the trust chain when validating a peer’s
       * Transport Layer Security (TLS) certificate. 
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("c8f9cbc6a44f432cb74fd5cb2ae2ba93efbd7535b4ace97cf387e0b803dd7212")
      public fun trust(trust: ListenerTlsValidationContextTrustProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.appmesh.CfnVirtualNode.ListenerTlsValidationContextProperty.Builder
          =
          software.amazon.awscdk.services.appmesh.CfnVirtualNode.ListenerTlsValidationContextProperty.builder()

      /**
       * @param subjectAlternativeNames A reference to an object that represents the SANs for a
       * listener's Transport Layer Security (TLS) validation context.
       */
      override fun subjectAlternativeNames(subjectAlternativeNames: IResolvable) {
        cdkBuilder.subjectAlternativeNames(subjectAlternativeNames.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param subjectAlternativeNames A reference to an object that represents the SANs for a
       * listener's Transport Layer Security (TLS) validation context.
       */
      override
          fun subjectAlternativeNames(subjectAlternativeNames: SubjectAlternativeNamesProperty) {
        cdkBuilder.subjectAlternativeNames(subjectAlternativeNames.let(SubjectAlternativeNamesProperty.Companion::unwrap))
      }

      /**
       * @param subjectAlternativeNames A reference to an object that represents the SANs for a
       * listener's Transport Layer Security (TLS) validation context.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("edc06a6797214a405c22d9acce7c7f1acb2bfbdb52657dcab08d01ef2ae82b3c")
      override
          fun subjectAlternativeNames(subjectAlternativeNames: SubjectAlternativeNamesProperty.Builder.() -> Unit):
          Unit = subjectAlternativeNames(SubjectAlternativeNamesProperty(subjectAlternativeNames))

      /**
       * @param trust A reference to where to retrieve the trust chain when validating a peer’s
       * Transport Layer Security (TLS) certificate. 
       */
      override fun trust(trust: IResolvable) {
        cdkBuilder.trust(trust.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param trust A reference to where to retrieve the trust chain when validating a peer’s
       * Transport Layer Security (TLS) certificate. 
       */
      override fun trust(trust: ListenerTlsValidationContextTrustProperty) {
        cdkBuilder.trust(trust.let(ListenerTlsValidationContextTrustProperty.Companion::unwrap))
      }

      /**
       * @param trust A reference to where to retrieve the trust chain when validating a peer’s
       * Transport Layer Security (TLS) certificate. 
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("c8f9cbc6a44f432cb74fd5cb2ae2ba93efbd7535b4ace97cf387e0b803dd7212")
      override fun trust(trust: ListenerTlsValidationContextTrustProperty.Builder.() -> Unit): Unit
          = trust(ListenerTlsValidationContextTrustProperty(trust))

      public fun build():
          software.amazon.awscdk.services.appmesh.CfnVirtualNode.ListenerTlsValidationContextProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.appmesh.CfnVirtualNode.ListenerTlsValidationContextProperty,
    ) : CdkObject(cdkObject), ListenerTlsValidationContextProperty {
      /**
       * A reference to an object that represents the SANs for a listener's Transport Layer Security
       * (TLS) validation context.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-virtualnode-listenertlsvalidationcontext.html#cfn-appmesh-virtualnode-listenertlsvalidationcontext-subjectalternativenames)
       */
      override fun subjectAlternativeNames(): Any? = unwrap(this).getSubjectAlternativeNames()

      /**
       * A reference to where to retrieve the trust chain when validating a peer’s Transport Layer
       * Security (TLS) certificate.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-virtualnode-listenertlsvalidationcontext.html#cfn-appmesh-virtualnode-listenertlsvalidationcontext-trust)
       */
      override fun trust(): Any = unwrap(this).getTrust()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          ListenerTlsValidationContextProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.appmesh.CfnVirtualNode.ListenerTlsValidationContextProperty):
          ListenerTlsValidationContextProperty = CdkObjectWrappers.wrap(cdkObject) as?
          ListenerTlsValidationContextProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: ListenerTlsValidationContextProperty):
          software.amazon.awscdk.services.appmesh.CfnVirtualNode.ListenerTlsValidationContextProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.appmesh.CfnVirtualNode.ListenerTlsValidationContextProperty
    }
  }

  /**
   * An object that represents a listener's Transport Layer Security (TLS) validation context trust.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.appmesh.*;
   * ListenerTlsValidationContextTrustProperty listenerTlsValidationContextTrustProperty =
   * ListenerTlsValidationContextTrustProperty.builder()
   * .file(TlsValidationContextFileTrustProperty.builder()
   * .certificateChain("certificateChain")
   * .build())
   * .sds(TlsValidationContextSdsTrustProperty.builder()
   * .secretName("secretName")
   * .build())
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-virtualnode-listenertlsvalidationcontexttrust.html)
   */
  public interface ListenerTlsValidationContextTrustProperty {
    /**
     * An object that represents a Transport Layer Security (TLS) validation context trust for a
     * local file.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-virtualnode-listenertlsvalidationcontexttrust.html#cfn-appmesh-virtualnode-listenertlsvalidationcontexttrust-file)
     */
    public fun `file`(): Any? = unwrap(this).getFile()

    /**
     * A reference to an object that represents a listener's Transport Layer Security (TLS) Secret
     * Discovery Service validation context trust.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-virtualnode-listenertlsvalidationcontexttrust.html#cfn-appmesh-virtualnode-listenertlsvalidationcontexttrust-sds)
     */
    public fun sds(): Any? = unwrap(this).getSds()

    /**
     * A builder for [ListenerTlsValidationContextTrustProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param file An object that represents a Transport Layer Security (TLS) validation context
       * trust for a local file.
       */
      public fun `file`(`file`: IResolvable)

      /**
       * @param file An object that represents a Transport Layer Security (TLS) validation context
       * trust for a local file.
       */
      public fun `file`(`file`: TlsValidationContextFileTrustProperty)

      /**
       * @param file An object that represents a Transport Layer Security (TLS) validation context
       * trust for a local file.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("620bb98ce49c51057e2bf1be641b9c5f54afa1d2fa0f7d061d3190010ad556b8")
      public fun `file`(`file`: TlsValidationContextFileTrustProperty.Builder.() -> Unit)

      /**
       * @param sds A reference to an object that represents a listener's Transport Layer Security
       * (TLS) Secret Discovery Service validation context trust.
       */
      public fun sds(sds: IResolvable)

      /**
       * @param sds A reference to an object that represents a listener's Transport Layer Security
       * (TLS) Secret Discovery Service validation context trust.
       */
      public fun sds(sds: TlsValidationContextSdsTrustProperty)

      /**
       * @param sds A reference to an object that represents a listener's Transport Layer Security
       * (TLS) Secret Discovery Service validation context trust.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("a0fa3c2e113d57cb6586f5dd27bc894489a059a0e7b77a0f92b1cce375da7328")
      public fun sds(sds: TlsValidationContextSdsTrustProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.appmesh.CfnVirtualNode.ListenerTlsValidationContextTrustProperty.Builder
          =
          software.amazon.awscdk.services.appmesh.CfnVirtualNode.ListenerTlsValidationContextTrustProperty.builder()

      /**
       * @param file An object that represents a Transport Layer Security (TLS) validation context
       * trust for a local file.
       */
      override fun `file`(`file`: IResolvable) {
        cdkBuilder.`file`(`file`.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param file An object that represents a Transport Layer Security (TLS) validation context
       * trust for a local file.
       */
      override fun `file`(`file`: TlsValidationContextFileTrustProperty) {
        cdkBuilder.`file`(`file`.let(TlsValidationContextFileTrustProperty.Companion::unwrap))
      }

      /**
       * @param file An object that represents a Transport Layer Security (TLS) validation context
       * trust for a local file.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("620bb98ce49c51057e2bf1be641b9c5f54afa1d2fa0f7d061d3190010ad556b8")
      override fun `file`(`file`: TlsValidationContextFileTrustProperty.Builder.() -> Unit): Unit =
          `file`(TlsValidationContextFileTrustProperty(`file`))

      /**
       * @param sds A reference to an object that represents a listener's Transport Layer Security
       * (TLS) Secret Discovery Service validation context trust.
       */
      override fun sds(sds: IResolvable) {
        cdkBuilder.sds(sds.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param sds A reference to an object that represents a listener's Transport Layer Security
       * (TLS) Secret Discovery Service validation context trust.
       */
      override fun sds(sds: TlsValidationContextSdsTrustProperty) {
        cdkBuilder.sds(sds.let(TlsValidationContextSdsTrustProperty.Companion::unwrap))
      }

      /**
       * @param sds A reference to an object that represents a listener's Transport Layer Security
       * (TLS) Secret Discovery Service validation context trust.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("a0fa3c2e113d57cb6586f5dd27bc894489a059a0e7b77a0f92b1cce375da7328")
      override fun sds(sds: TlsValidationContextSdsTrustProperty.Builder.() -> Unit): Unit =
          sds(TlsValidationContextSdsTrustProperty(sds))

      public fun build():
          software.amazon.awscdk.services.appmesh.CfnVirtualNode.ListenerTlsValidationContextTrustProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.appmesh.CfnVirtualNode.ListenerTlsValidationContextTrustProperty,
    ) : CdkObject(cdkObject), ListenerTlsValidationContextTrustProperty {
      /**
       * An object that represents a Transport Layer Security (TLS) validation context trust for a
       * local file.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-virtualnode-listenertlsvalidationcontexttrust.html#cfn-appmesh-virtualnode-listenertlsvalidationcontexttrust-file)
       */
      override fun `file`(): Any? = unwrap(this).getFile()

      /**
       * A reference to an object that represents a listener's Transport Layer Security (TLS) Secret
       * Discovery Service validation context trust.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-virtualnode-listenertlsvalidationcontexttrust.html#cfn-appmesh-virtualnode-listenertlsvalidationcontexttrust-sds)
       */
      override fun sds(): Any? = unwrap(this).getSds()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          ListenerTlsValidationContextTrustProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.appmesh.CfnVirtualNode.ListenerTlsValidationContextTrustProperty):
          ListenerTlsValidationContextTrustProperty = CdkObjectWrappers.wrap(cdkObject) as?
          ListenerTlsValidationContextTrustProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: ListenerTlsValidationContextTrustProperty):
          software.amazon.awscdk.services.appmesh.CfnVirtualNode.ListenerTlsValidationContextTrustProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.appmesh.CfnVirtualNode.ListenerTlsValidationContextTrustProperty
    }
  }

  /**
   * An object that represents the format for the logs.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.appmesh.*;
   * LoggingFormatProperty loggingFormatProperty = LoggingFormatProperty.builder()
   * .json(List.of(JsonFormatRefProperty.builder()
   * .key("key")
   * .value("value")
   * .build()))
   * .text("text")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-virtualnode-loggingformat.html)
   */
  public interface LoggingFormatProperty {
    /**
     * The logging format for JSON.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-virtualnode-loggingformat.html#cfn-appmesh-virtualnode-loggingformat-json)
     */
    public fun json(): Any? = unwrap(this).getJson()

    /**
     * The logging format for text.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-virtualnode-loggingformat.html#cfn-appmesh-virtualnode-loggingformat-text)
     */
    public fun text(): String? = unwrap(this).getText()

    /**
     * A builder for [LoggingFormatProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param json The logging format for JSON.
       */
      public fun json(json: IResolvable)

      /**
       * @param json The logging format for JSON.
       */
      public fun json(json: List<Any>)

      /**
       * @param json The logging format for JSON.
       */
      public fun json(vararg json: Any)

      /**
       * @param text The logging format for text.
       */
      public fun text(text: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.appmesh.CfnVirtualNode.LoggingFormatProperty.Builder =
          software.amazon.awscdk.services.appmesh.CfnVirtualNode.LoggingFormatProperty.builder()

      /**
       * @param json The logging format for JSON.
       */
      override fun json(json: IResolvable) {
        cdkBuilder.json(json.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param json The logging format for JSON.
       */
      override fun json(json: List<Any>) {
        cdkBuilder.json(json.map{CdkObjectWrappers.unwrap(it)})
      }

      /**
       * @param json The logging format for JSON.
       */
      override fun json(vararg json: Any): Unit = json(json.toList())

      /**
       * @param text The logging format for text.
       */
      override fun text(text: String) {
        cdkBuilder.text(text)
      }

      public fun build():
          software.amazon.awscdk.services.appmesh.CfnVirtualNode.LoggingFormatProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.appmesh.CfnVirtualNode.LoggingFormatProperty,
    ) : CdkObject(cdkObject), LoggingFormatProperty {
      /**
       * The logging format for JSON.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-virtualnode-loggingformat.html#cfn-appmesh-virtualnode-loggingformat-json)
       */
      override fun json(): Any? = unwrap(this).getJson()

      /**
       * The logging format for text.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-virtualnode-loggingformat.html#cfn-appmesh-virtualnode-loggingformat-text)
       */
      override fun text(): String? = unwrap(this).getText()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): LoggingFormatProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.appmesh.CfnVirtualNode.LoggingFormatProperty):
          LoggingFormatProperty = CdkObjectWrappers.wrap(cdkObject) as? LoggingFormatProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: LoggingFormatProperty):
          software.amazon.awscdk.services.appmesh.CfnVirtualNode.LoggingFormatProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.appmesh.CfnVirtualNode.LoggingFormatProperty
    }
  }

  /**
   * An object that represents the logging information for a virtual node.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.appmesh.*;
   * LoggingProperty loggingProperty = LoggingProperty.builder()
   * .accessLog(AccessLogProperty.builder()
   * .file(FileAccessLogProperty.builder()
   * .path("path")
   * // the properties below are optional
   * .format(LoggingFormatProperty.builder()
   * .json(List.of(JsonFormatRefProperty.builder()
   * .key("key")
   * .value("value")
   * .build()))
   * .text("text")
   * .build())
   * .build())
   * .build())
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-virtualnode-logging.html)
   */
  public interface LoggingProperty {
    /**
     * The access log configuration for a virtual node.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-virtualnode-logging.html#cfn-appmesh-virtualnode-logging-accesslog)
     */
    public fun accessLog(): Any? = unwrap(this).getAccessLog()

    /**
     * A builder for [LoggingProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param accessLog The access log configuration for a virtual node.
       */
      public fun accessLog(accessLog: IResolvable)

      /**
       * @param accessLog The access log configuration for a virtual node.
       */
      public fun accessLog(accessLog: AccessLogProperty)

      /**
       * @param accessLog The access log configuration for a virtual node.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("a35f0f98ded7a2bd9905d69c135fe419b32fd83db36df883dded919d62b585dd")
      public fun accessLog(accessLog: AccessLogProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.appmesh.CfnVirtualNode.LoggingProperty.Builder =
          software.amazon.awscdk.services.appmesh.CfnVirtualNode.LoggingProperty.builder()

      /**
       * @param accessLog The access log configuration for a virtual node.
       */
      override fun accessLog(accessLog: IResolvable) {
        cdkBuilder.accessLog(accessLog.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param accessLog The access log configuration for a virtual node.
       */
      override fun accessLog(accessLog: AccessLogProperty) {
        cdkBuilder.accessLog(accessLog.let(AccessLogProperty.Companion::unwrap))
      }

      /**
       * @param accessLog The access log configuration for a virtual node.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("a35f0f98ded7a2bd9905d69c135fe419b32fd83db36df883dded919d62b585dd")
      override fun accessLog(accessLog: AccessLogProperty.Builder.() -> Unit): Unit =
          accessLog(AccessLogProperty(accessLog))

      public fun build(): software.amazon.awscdk.services.appmesh.CfnVirtualNode.LoggingProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.appmesh.CfnVirtualNode.LoggingProperty,
    ) : CdkObject(cdkObject), LoggingProperty {
      /**
       * The access log configuration for a virtual node.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-virtualnode-logging.html#cfn-appmesh-virtualnode-logging-accesslog)
       */
      override fun accessLog(): Any? = unwrap(this).getAccessLog()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): LoggingProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.appmesh.CfnVirtualNode.LoggingProperty):
          LoggingProperty = CdkObjectWrappers.wrap(cdkObject) as? LoggingProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: LoggingProperty):
          software.amazon.awscdk.services.appmesh.CfnVirtualNode.LoggingProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.appmesh.CfnVirtualNode.LoggingProperty
    }
  }

  /**
   * An object that represents the outlier detection for a virtual node's listener.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.appmesh.*;
   * OutlierDetectionProperty outlierDetectionProperty = OutlierDetectionProperty.builder()
   * .baseEjectionDuration(DurationProperty.builder()
   * .unit("unit")
   * .value(123)
   * .build())
   * .interval(DurationProperty.builder()
   * .unit("unit")
   * .value(123)
   * .build())
   * .maxEjectionPercent(123)
   * .maxServerErrors(123)
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-virtualnode-outlierdetection.html)
   */
  public interface OutlierDetectionProperty {
    /**
     * The base amount of time for which a host is ejected.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-virtualnode-outlierdetection.html#cfn-appmesh-virtualnode-outlierdetection-baseejectionduration)
     */
    public fun baseEjectionDuration(): Any

    /**
     * The time interval between ejection sweep analysis.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-virtualnode-outlierdetection.html#cfn-appmesh-virtualnode-outlierdetection-interval)
     */
    public fun interval(): Any

    /**
     * Maximum percentage of hosts in load balancing pool for upstream service that can be ejected.
     *
     * Will eject at least one host regardless of the value.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-virtualnode-outlierdetection.html#cfn-appmesh-virtualnode-outlierdetection-maxejectionpercent)
     */
    public fun maxEjectionPercent(): Number

    /**
     * Number of consecutive `5xx` errors required for ejection.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-virtualnode-outlierdetection.html#cfn-appmesh-virtualnode-outlierdetection-maxservererrors)
     */
    public fun maxServerErrors(): Number

    /**
     * A builder for [OutlierDetectionProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param baseEjectionDuration The base amount of time for which a host is ejected. 
       */
      public fun baseEjectionDuration(baseEjectionDuration: IResolvable)

      /**
       * @param baseEjectionDuration The base amount of time for which a host is ejected. 
       */
      public fun baseEjectionDuration(baseEjectionDuration: DurationProperty)

      /**
       * @param baseEjectionDuration The base amount of time for which a host is ejected. 
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("0867a5ae648b42fd076947eb99dfd241a5aecb6a534ba6a6d59ba9bd2717b04f")
      public fun baseEjectionDuration(baseEjectionDuration: DurationProperty.Builder.() -> Unit)

      /**
       * @param interval The time interval between ejection sweep analysis. 
       */
      public fun interval(interval: IResolvable)

      /**
       * @param interval The time interval between ejection sweep analysis. 
       */
      public fun interval(interval: DurationProperty)

      /**
       * @param interval The time interval between ejection sweep analysis. 
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("27d118dd24b02a9b9c8cd6e041185ff348351f81340827bd053f9e032927a5c3")
      public fun interval(interval: DurationProperty.Builder.() -> Unit)

      /**
       * @param maxEjectionPercent Maximum percentage of hosts in load balancing pool for upstream
       * service that can be ejected. 
       * Will eject at least one host regardless of the value.
       */
      public fun maxEjectionPercent(maxEjectionPercent: Number)

      /**
       * @param maxServerErrors Number of consecutive `5xx` errors required for ejection. 
       */
      public fun maxServerErrors(maxServerErrors: Number)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.appmesh.CfnVirtualNode.OutlierDetectionProperty.Builder =
          software.amazon.awscdk.services.appmesh.CfnVirtualNode.OutlierDetectionProperty.builder()

      /**
       * @param baseEjectionDuration The base amount of time for which a host is ejected. 
       */
      override fun baseEjectionDuration(baseEjectionDuration: IResolvable) {
        cdkBuilder.baseEjectionDuration(baseEjectionDuration.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param baseEjectionDuration The base amount of time for which a host is ejected. 
       */
      override fun baseEjectionDuration(baseEjectionDuration: DurationProperty) {
        cdkBuilder.baseEjectionDuration(baseEjectionDuration.let(DurationProperty.Companion::unwrap))
      }

      /**
       * @param baseEjectionDuration The base amount of time for which a host is ejected. 
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("0867a5ae648b42fd076947eb99dfd241a5aecb6a534ba6a6d59ba9bd2717b04f")
      override fun baseEjectionDuration(baseEjectionDuration: DurationProperty.Builder.() -> Unit):
          Unit = baseEjectionDuration(DurationProperty(baseEjectionDuration))

      /**
       * @param interval The time interval between ejection sweep analysis. 
       */
      override fun interval(interval: IResolvable) {
        cdkBuilder.interval(interval.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param interval The time interval between ejection sweep analysis. 
       */
      override fun interval(interval: DurationProperty) {
        cdkBuilder.interval(interval.let(DurationProperty.Companion::unwrap))
      }

      /**
       * @param interval The time interval between ejection sweep analysis. 
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("27d118dd24b02a9b9c8cd6e041185ff348351f81340827bd053f9e032927a5c3")
      override fun interval(interval: DurationProperty.Builder.() -> Unit): Unit =
          interval(DurationProperty(interval))

      /**
       * @param maxEjectionPercent Maximum percentage of hosts in load balancing pool for upstream
       * service that can be ejected. 
       * Will eject at least one host regardless of the value.
       */
      override fun maxEjectionPercent(maxEjectionPercent: Number) {
        cdkBuilder.maxEjectionPercent(maxEjectionPercent)
      }

      /**
       * @param maxServerErrors Number of consecutive `5xx` errors required for ejection. 
       */
      override fun maxServerErrors(maxServerErrors: Number) {
        cdkBuilder.maxServerErrors(maxServerErrors)
      }

      public fun build():
          software.amazon.awscdk.services.appmesh.CfnVirtualNode.OutlierDetectionProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.appmesh.CfnVirtualNode.OutlierDetectionProperty,
    ) : CdkObject(cdkObject), OutlierDetectionProperty {
      /**
       * The base amount of time for which a host is ejected.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-virtualnode-outlierdetection.html#cfn-appmesh-virtualnode-outlierdetection-baseejectionduration)
       */
      override fun baseEjectionDuration(): Any = unwrap(this).getBaseEjectionDuration()

      /**
       * The time interval between ejection sweep analysis.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-virtualnode-outlierdetection.html#cfn-appmesh-virtualnode-outlierdetection-interval)
       */
      override fun interval(): Any = unwrap(this).getInterval()

      /**
       * Maximum percentage of hosts in load balancing pool for upstream service that can be
       * ejected.
       *
       * Will eject at least one host regardless of the value.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-virtualnode-outlierdetection.html#cfn-appmesh-virtualnode-outlierdetection-maxejectionpercent)
       */
      override fun maxEjectionPercent(): Number = unwrap(this).getMaxEjectionPercent()

      /**
       * Number of consecutive `5xx` errors required for ejection.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-virtualnode-outlierdetection.html#cfn-appmesh-virtualnode-outlierdetection-maxservererrors)
       */
      override fun maxServerErrors(): Number = unwrap(this).getMaxServerErrors()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): OutlierDetectionProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.appmesh.CfnVirtualNode.OutlierDetectionProperty):
          OutlierDetectionProperty = CdkObjectWrappers.wrap(cdkObject) as? OutlierDetectionProperty
          ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: OutlierDetectionProperty):
          software.amazon.awscdk.services.appmesh.CfnVirtualNode.OutlierDetectionProperty = (wrapped
          as CdkObject).cdkObject as
          software.amazon.awscdk.services.appmesh.CfnVirtualNode.OutlierDetectionProperty
    }
  }

  /**
   * An object representing a virtual node or virtual router listener port mapping.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.appmesh.*;
   * PortMappingProperty portMappingProperty = PortMappingProperty.builder()
   * .port(123)
   * .protocol("protocol")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-virtualnode-portmapping.html)
   */
  public interface PortMappingProperty {
    /**
     * The port used for the port mapping.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-virtualnode-portmapping.html#cfn-appmesh-virtualnode-portmapping-port)
     */
    public fun port(): Number

    /**
     * The protocol used for the port mapping.
     *
     * Specify `http` , `http2` , `grpc` , or `tcp` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-virtualnode-portmapping.html#cfn-appmesh-virtualnode-portmapping-protocol)
     */
    public fun protocol(): String

    /**
     * A builder for [PortMappingProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param port The port used for the port mapping. 
       */
      public fun port(port: Number)

      /**
       * @param protocol The protocol used for the port mapping. 
       * Specify `http` , `http2` , `grpc` , or `tcp` .
       */
      public fun protocol(protocol: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.appmesh.CfnVirtualNode.PortMappingProperty.Builder =
          software.amazon.awscdk.services.appmesh.CfnVirtualNode.PortMappingProperty.builder()

      /**
       * @param port The port used for the port mapping. 
       */
      override fun port(port: Number) {
        cdkBuilder.port(port)
      }

      /**
       * @param protocol The protocol used for the port mapping. 
       * Specify `http` , `http2` , `grpc` , or `tcp` .
       */
      override fun protocol(protocol: String) {
        cdkBuilder.protocol(protocol)
      }

      public fun build(): software.amazon.awscdk.services.appmesh.CfnVirtualNode.PortMappingProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.appmesh.CfnVirtualNode.PortMappingProperty,
    ) : CdkObject(cdkObject), PortMappingProperty {
      /**
       * The port used for the port mapping.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-virtualnode-portmapping.html#cfn-appmesh-virtualnode-portmapping-port)
       */
      override fun port(): Number = unwrap(this).getPort()

      /**
       * The protocol used for the port mapping.
       *
       * Specify `http` , `http2` , `grpc` , or `tcp` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-virtualnode-portmapping.html#cfn-appmesh-virtualnode-portmapping-protocol)
       */
      override fun protocol(): String = unwrap(this).getProtocol()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): PortMappingProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.appmesh.CfnVirtualNode.PortMappingProperty):
          PortMappingProperty = CdkObjectWrappers.wrap(cdkObject) as? PortMappingProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: PortMappingProperty):
          software.amazon.awscdk.services.appmesh.CfnVirtualNode.PortMappingProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.appmesh.CfnVirtualNode.PortMappingProperty
    }
  }

  /**
   * An object that represents the service discovery information for a virtual node.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.appmesh.*;
   * ServiceDiscoveryProperty serviceDiscoveryProperty = ServiceDiscoveryProperty.builder()
   * .awsCloudMap(AwsCloudMapServiceDiscoveryProperty.builder()
   * .namespaceName("namespaceName")
   * .serviceName("serviceName")
   * // the properties below are optional
   * .attributes(List.of(AwsCloudMapInstanceAttributeProperty.builder()
   * .key("key")
   * .value("value")
   * .build()))
   * .ipPreference("ipPreference")
   * .build())
   * .dns(DnsServiceDiscoveryProperty.builder()
   * .hostname("hostname")
   * // the properties below are optional
   * .ipPreference("ipPreference")
   * .responseType("responseType")
   * .build())
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-virtualnode-servicediscovery.html)
   */
  public interface ServiceDiscoveryProperty {
    /**
     * Specifies any AWS Cloud Map information for the virtual node.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-virtualnode-servicediscovery.html#cfn-appmesh-virtualnode-servicediscovery-awscloudmap)
     */
    public fun awsCloudMap(): Any? = unwrap(this).getAwsCloudMap()

    /**
     * Specifies the DNS information for the virtual node.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-virtualnode-servicediscovery.html#cfn-appmesh-virtualnode-servicediscovery-dns)
     */
    public fun dns(): Any? = unwrap(this).getDns()

    /**
     * A builder for [ServiceDiscoveryProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param awsCloudMap Specifies any AWS Cloud Map information for the virtual node.
       */
      public fun awsCloudMap(awsCloudMap: IResolvable)

      /**
       * @param awsCloudMap Specifies any AWS Cloud Map information for the virtual node.
       */
      public fun awsCloudMap(awsCloudMap: AwsCloudMapServiceDiscoveryProperty)

      /**
       * @param awsCloudMap Specifies any AWS Cloud Map information for the virtual node.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("4f4452b939a9d3b4aa9934695f09cb4d64015d289bd0701da15ccf4ca562756d")
      public fun awsCloudMap(awsCloudMap: AwsCloudMapServiceDiscoveryProperty.Builder.() -> Unit)

      /**
       * @param dns Specifies the DNS information for the virtual node.
       */
      public fun dns(dns: IResolvable)

      /**
       * @param dns Specifies the DNS information for the virtual node.
       */
      public fun dns(dns: DnsServiceDiscoveryProperty)

      /**
       * @param dns Specifies the DNS information for the virtual node.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("e79e4905cd9f949ff7be9422a85e0a6091b615a3075d869480e67de3930a3937")
      public fun dns(dns: DnsServiceDiscoveryProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.appmesh.CfnVirtualNode.ServiceDiscoveryProperty.Builder =
          software.amazon.awscdk.services.appmesh.CfnVirtualNode.ServiceDiscoveryProperty.builder()

      /**
       * @param awsCloudMap Specifies any AWS Cloud Map information for the virtual node.
       */
      override fun awsCloudMap(awsCloudMap: IResolvable) {
        cdkBuilder.awsCloudMap(awsCloudMap.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param awsCloudMap Specifies any AWS Cloud Map information for the virtual node.
       */
      override fun awsCloudMap(awsCloudMap: AwsCloudMapServiceDiscoveryProperty) {
        cdkBuilder.awsCloudMap(awsCloudMap.let(AwsCloudMapServiceDiscoveryProperty.Companion::unwrap))
      }

      /**
       * @param awsCloudMap Specifies any AWS Cloud Map information for the virtual node.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("4f4452b939a9d3b4aa9934695f09cb4d64015d289bd0701da15ccf4ca562756d")
      override fun awsCloudMap(awsCloudMap: AwsCloudMapServiceDiscoveryProperty.Builder.() -> Unit):
          Unit = awsCloudMap(AwsCloudMapServiceDiscoveryProperty(awsCloudMap))

      /**
       * @param dns Specifies the DNS information for the virtual node.
       */
      override fun dns(dns: IResolvable) {
        cdkBuilder.dns(dns.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param dns Specifies the DNS information for the virtual node.
       */
      override fun dns(dns: DnsServiceDiscoveryProperty) {
        cdkBuilder.dns(dns.let(DnsServiceDiscoveryProperty.Companion::unwrap))
      }

      /**
       * @param dns Specifies the DNS information for the virtual node.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("e79e4905cd9f949ff7be9422a85e0a6091b615a3075d869480e67de3930a3937")
      override fun dns(dns: DnsServiceDiscoveryProperty.Builder.() -> Unit): Unit =
          dns(DnsServiceDiscoveryProperty(dns))

      public fun build():
          software.amazon.awscdk.services.appmesh.CfnVirtualNode.ServiceDiscoveryProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.appmesh.CfnVirtualNode.ServiceDiscoveryProperty,
    ) : CdkObject(cdkObject), ServiceDiscoveryProperty {
      /**
       * Specifies any AWS Cloud Map information for the virtual node.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-virtualnode-servicediscovery.html#cfn-appmesh-virtualnode-servicediscovery-awscloudmap)
       */
      override fun awsCloudMap(): Any? = unwrap(this).getAwsCloudMap()

      /**
       * Specifies the DNS information for the virtual node.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-virtualnode-servicediscovery.html#cfn-appmesh-virtualnode-servicediscovery-dns)
       */
      override fun dns(): Any? = unwrap(this).getDns()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): ServiceDiscoveryProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.appmesh.CfnVirtualNode.ServiceDiscoveryProperty):
          ServiceDiscoveryProperty = CdkObjectWrappers.wrap(cdkObject) as? ServiceDiscoveryProperty
          ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: ServiceDiscoveryProperty):
          software.amazon.awscdk.services.appmesh.CfnVirtualNode.ServiceDiscoveryProperty = (wrapped
          as CdkObject).cdkObject as
          software.amazon.awscdk.services.appmesh.CfnVirtualNode.ServiceDiscoveryProperty
    }
  }

  /**
   * An object that represents the methods by which a subject alternative name on a peer Transport
   * Layer Security (TLS) certificate can be matched.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.appmesh.*;
   * SubjectAlternativeNameMatchersProperty subjectAlternativeNameMatchersProperty =
   * SubjectAlternativeNameMatchersProperty.builder()
   * .exact(List.of("exact"))
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-virtualnode-subjectalternativenamematchers.html)
   */
  public interface SubjectAlternativeNameMatchersProperty {
    /**
     * The values sent must match the specified values exactly.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-virtualnode-subjectalternativenamematchers.html#cfn-appmesh-virtualnode-subjectalternativenamematchers-exact)
     */
    public fun exact(): List<String> = unwrap(this).getExact() ?: emptyList()

    /**
     * A builder for [SubjectAlternativeNameMatchersProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param exact The values sent must match the specified values exactly.
       */
      public fun exact(exact: List<String>)

      /**
       * @param exact The values sent must match the specified values exactly.
       */
      public fun exact(vararg exact: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.appmesh.CfnVirtualNode.SubjectAlternativeNameMatchersProperty.Builder
          =
          software.amazon.awscdk.services.appmesh.CfnVirtualNode.SubjectAlternativeNameMatchersProperty.builder()

      /**
       * @param exact The values sent must match the specified values exactly.
       */
      override fun exact(exact: List<String>) {
        cdkBuilder.exact(exact)
      }

      /**
       * @param exact The values sent must match the specified values exactly.
       */
      override fun exact(vararg exact: String): Unit = exact(exact.toList())

      public fun build():
          software.amazon.awscdk.services.appmesh.CfnVirtualNode.SubjectAlternativeNameMatchersProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.appmesh.CfnVirtualNode.SubjectAlternativeNameMatchersProperty,
    ) : CdkObject(cdkObject), SubjectAlternativeNameMatchersProperty {
      /**
       * The values sent must match the specified values exactly.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-virtualnode-subjectalternativenamematchers.html#cfn-appmesh-virtualnode-subjectalternativenamematchers-exact)
       */
      override fun exact(): List<String> = unwrap(this).getExact() ?: emptyList()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          SubjectAlternativeNameMatchersProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.appmesh.CfnVirtualNode.SubjectAlternativeNameMatchersProperty):
          SubjectAlternativeNameMatchersProperty = CdkObjectWrappers.wrap(cdkObject) as?
          SubjectAlternativeNameMatchersProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: SubjectAlternativeNameMatchersProperty):
          software.amazon.awscdk.services.appmesh.CfnVirtualNode.SubjectAlternativeNameMatchersProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.appmesh.CfnVirtualNode.SubjectAlternativeNameMatchersProperty
    }
  }

  /**
   * An object that represents the subject alternative names secured by the certificate.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.appmesh.*;
   * SubjectAlternativeNamesProperty subjectAlternativeNamesProperty =
   * SubjectAlternativeNamesProperty.builder()
   * .match(SubjectAlternativeNameMatchersProperty.builder()
   * .exact(List.of("exact"))
   * .build())
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-virtualnode-subjectalternativenames.html)
   */
  public interface SubjectAlternativeNamesProperty {
    /**
     * An object that represents the criteria for determining a SANs match.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-virtualnode-subjectalternativenames.html#cfn-appmesh-virtualnode-subjectalternativenames-match)
     */
    public fun match(): Any

    /**
     * A builder for [SubjectAlternativeNamesProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param match An object that represents the criteria for determining a SANs match. 
       */
      public fun match(match: IResolvable)

      /**
       * @param match An object that represents the criteria for determining a SANs match. 
       */
      public fun match(match: SubjectAlternativeNameMatchersProperty)

      /**
       * @param match An object that represents the criteria for determining a SANs match. 
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("2d75a28480f58e64c5c9aef98fb928d9df770b21bd41a24aa274293535ab4932")
      public fun match(match: SubjectAlternativeNameMatchersProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.appmesh.CfnVirtualNode.SubjectAlternativeNamesProperty.Builder
          =
          software.amazon.awscdk.services.appmesh.CfnVirtualNode.SubjectAlternativeNamesProperty.builder()

      /**
       * @param match An object that represents the criteria for determining a SANs match. 
       */
      override fun match(match: IResolvable) {
        cdkBuilder.match(match.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param match An object that represents the criteria for determining a SANs match. 
       */
      override fun match(match: SubjectAlternativeNameMatchersProperty) {
        cdkBuilder.match(match.let(SubjectAlternativeNameMatchersProperty.Companion::unwrap))
      }

      /**
       * @param match An object that represents the criteria for determining a SANs match. 
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("2d75a28480f58e64c5c9aef98fb928d9df770b21bd41a24aa274293535ab4932")
      override fun match(match: SubjectAlternativeNameMatchersProperty.Builder.() -> Unit): Unit =
          match(SubjectAlternativeNameMatchersProperty(match))

      public fun build():
          software.amazon.awscdk.services.appmesh.CfnVirtualNode.SubjectAlternativeNamesProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.appmesh.CfnVirtualNode.SubjectAlternativeNamesProperty,
    ) : CdkObject(cdkObject), SubjectAlternativeNamesProperty {
      /**
       * An object that represents the criteria for determining a SANs match.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-virtualnode-subjectalternativenames.html#cfn-appmesh-virtualnode-subjectalternativenames-match)
       */
      override fun match(): Any = unwrap(this).getMatch()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): SubjectAlternativeNamesProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.appmesh.CfnVirtualNode.SubjectAlternativeNamesProperty):
          SubjectAlternativeNamesProperty = CdkObjectWrappers.wrap(cdkObject) as?
          SubjectAlternativeNamesProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: SubjectAlternativeNamesProperty):
          software.amazon.awscdk.services.appmesh.CfnVirtualNode.SubjectAlternativeNamesProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.appmesh.CfnVirtualNode.SubjectAlternativeNamesProperty
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
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-virtualnode-tcptimeout.html)
   */
  public interface TcpTimeoutProperty {
    /**
     * An object that represents an idle timeout.
     *
     * An idle timeout bounds the amount of time that a connection may be idle. The default value is
     * none.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-virtualnode-tcptimeout.html#cfn-appmesh-virtualnode-tcptimeout-idle)
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
      @JvmName("1202822280c7976ca3248e5db1a8cd0d1890e751704b05a427555359639593d4")
      public fun idle(idle: DurationProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.appmesh.CfnVirtualNode.TcpTimeoutProperty.Builder =
          software.amazon.awscdk.services.appmesh.CfnVirtualNode.TcpTimeoutProperty.builder()

      /**
       * @param idle An object that represents an idle timeout.
       * An idle timeout bounds the amount of time that a connection may be idle. The default value
       * is none.
       */
      override fun idle(idle: IResolvable) {
        cdkBuilder.idle(idle.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param idle An object that represents an idle timeout.
       * An idle timeout bounds the amount of time that a connection may be idle. The default value
       * is none.
       */
      override fun idle(idle: DurationProperty) {
        cdkBuilder.idle(idle.let(DurationProperty.Companion::unwrap))
      }

      /**
       * @param idle An object that represents an idle timeout.
       * An idle timeout bounds the amount of time that a connection may be idle. The default value
       * is none.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("1202822280c7976ca3248e5db1a8cd0d1890e751704b05a427555359639593d4")
      override fun idle(idle: DurationProperty.Builder.() -> Unit): Unit =
          idle(DurationProperty(idle))

      public fun build(): software.amazon.awscdk.services.appmesh.CfnVirtualNode.TcpTimeoutProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.appmesh.CfnVirtualNode.TcpTimeoutProperty,
    ) : CdkObject(cdkObject), TcpTimeoutProperty {
      /**
       * An object that represents an idle timeout.
       *
       * An idle timeout bounds the amount of time that a connection may be idle. The default value
       * is none.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-virtualnode-tcptimeout.html#cfn-appmesh-virtualnode-tcptimeout-idle)
       */
      override fun idle(): Any? = unwrap(this).getIdle()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): TcpTimeoutProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.appmesh.CfnVirtualNode.TcpTimeoutProperty):
          TcpTimeoutProperty = CdkObjectWrappers.wrap(cdkObject) as? TcpTimeoutProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: TcpTimeoutProperty):
          software.amazon.awscdk.services.appmesh.CfnVirtualNode.TcpTimeoutProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.appmesh.CfnVirtualNode.TcpTimeoutProperty
    }
  }

  /**
   * An object that represents a Transport Layer Security (TLS) validation context trust for an AWS
   * Certificate Manager certificate.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.appmesh.*;
   * TlsValidationContextAcmTrustProperty tlsValidationContextAcmTrustProperty =
   * TlsValidationContextAcmTrustProperty.builder()
   * .certificateAuthorityArns(List.of("certificateAuthorityArns"))
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-virtualnode-tlsvalidationcontextacmtrust.html)
   */
  public interface TlsValidationContextAcmTrustProperty {
    /**
     * One or more ACM Amazon Resource Name (ARN)s.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-virtualnode-tlsvalidationcontextacmtrust.html#cfn-appmesh-virtualnode-tlsvalidationcontextacmtrust-certificateauthorityarns)
     */
    public fun certificateAuthorityArns(): List<String>

    /**
     * A builder for [TlsValidationContextAcmTrustProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param certificateAuthorityArns One or more ACM Amazon Resource Name (ARN)s. 
       */
      public fun certificateAuthorityArns(certificateAuthorityArns: List<String>)

      /**
       * @param certificateAuthorityArns One or more ACM Amazon Resource Name (ARN)s. 
       */
      public fun certificateAuthorityArns(vararg certificateAuthorityArns: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.appmesh.CfnVirtualNode.TlsValidationContextAcmTrustProperty.Builder
          =
          software.amazon.awscdk.services.appmesh.CfnVirtualNode.TlsValidationContextAcmTrustProperty.builder()

      /**
       * @param certificateAuthorityArns One or more ACM Amazon Resource Name (ARN)s. 
       */
      override fun certificateAuthorityArns(certificateAuthorityArns: List<String>) {
        cdkBuilder.certificateAuthorityArns(certificateAuthorityArns)
      }

      /**
       * @param certificateAuthorityArns One or more ACM Amazon Resource Name (ARN)s. 
       */
      override fun certificateAuthorityArns(vararg certificateAuthorityArns: String): Unit =
          certificateAuthorityArns(certificateAuthorityArns.toList())

      public fun build():
          software.amazon.awscdk.services.appmesh.CfnVirtualNode.TlsValidationContextAcmTrustProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.appmesh.CfnVirtualNode.TlsValidationContextAcmTrustProperty,
    ) : CdkObject(cdkObject), TlsValidationContextAcmTrustProperty {
      /**
       * One or more ACM Amazon Resource Name (ARN)s.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-virtualnode-tlsvalidationcontextacmtrust.html#cfn-appmesh-virtualnode-tlsvalidationcontextacmtrust-certificateauthorityarns)
       */
      override fun certificateAuthorityArns(): List<String> =
          unwrap(this).getCertificateAuthorityArns()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          TlsValidationContextAcmTrustProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.appmesh.CfnVirtualNode.TlsValidationContextAcmTrustProperty):
          TlsValidationContextAcmTrustProperty = CdkObjectWrappers.wrap(cdkObject) as?
          TlsValidationContextAcmTrustProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: TlsValidationContextAcmTrustProperty):
          software.amazon.awscdk.services.appmesh.CfnVirtualNode.TlsValidationContextAcmTrustProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.appmesh.CfnVirtualNode.TlsValidationContextAcmTrustProperty
    }
  }

  /**
   * An object that represents a Transport Layer Security (TLS) validation context trust for a local
   * file.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.appmesh.*;
   * TlsValidationContextFileTrustProperty tlsValidationContextFileTrustProperty =
   * TlsValidationContextFileTrustProperty.builder()
   * .certificateChain("certificateChain")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-virtualnode-tlsvalidationcontextfiletrust.html)
   */
  public interface TlsValidationContextFileTrustProperty {
    /**
     * The certificate trust chain for a certificate stored on the file system of the virtual node
     * that the proxy is running on.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-virtualnode-tlsvalidationcontextfiletrust.html#cfn-appmesh-virtualnode-tlsvalidationcontextfiletrust-certificatechain)
     */
    public fun certificateChain(): String

    /**
     * A builder for [TlsValidationContextFileTrustProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param certificateChain The certificate trust chain for a certificate stored on the file
       * system of the virtual node that the proxy is running on. 
       */
      public fun certificateChain(certificateChain: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.appmesh.CfnVirtualNode.TlsValidationContextFileTrustProperty.Builder
          =
          software.amazon.awscdk.services.appmesh.CfnVirtualNode.TlsValidationContextFileTrustProperty.builder()

      /**
       * @param certificateChain The certificate trust chain for a certificate stored on the file
       * system of the virtual node that the proxy is running on. 
       */
      override fun certificateChain(certificateChain: String) {
        cdkBuilder.certificateChain(certificateChain)
      }

      public fun build():
          software.amazon.awscdk.services.appmesh.CfnVirtualNode.TlsValidationContextFileTrustProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.appmesh.CfnVirtualNode.TlsValidationContextFileTrustProperty,
    ) : CdkObject(cdkObject), TlsValidationContextFileTrustProperty {
      /**
       * The certificate trust chain for a certificate stored on the file system of the virtual node
       * that the proxy is running on.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-virtualnode-tlsvalidationcontextfiletrust.html#cfn-appmesh-virtualnode-tlsvalidationcontextfiletrust-certificatechain)
       */
      override fun certificateChain(): String = unwrap(this).getCertificateChain()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          TlsValidationContextFileTrustProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.appmesh.CfnVirtualNode.TlsValidationContextFileTrustProperty):
          TlsValidationContextFileTrustProperty = CdkObjectWrappers.wrap(cdkObject) as?
          TlsValidationContextFileTrustProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: TlsValidationContextFileTrustProperty):
          software.amazon.awscdk.services.appmesh.CfnVirtualNode.TlsValidationContextFileTrustProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.appmesh.CfnVirtualNode.TlsValidationContextFileTrustProperty
    }
  }

  /**
   * An object that represents how the proxy will validate its peer during Transport Layer Security
   * (TLS) negotiation.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.appmesh.*;
   * TlsValidationContextProperty tlsValidationContextProperty =
   * TlsValidationContextProperty.builder()
   * .trust(TlsValidationContextTrustProperty.builder()
   * .acm(TlsValidationContextAcmTrustProperty.builder()
   * .certificateAuthorityArns(List.of("certificateAuthorityArns"))
   * .build())
   * .file(TlsValidationContextFileTrustProperty.builder()
   * .certificateChain("certificateChain")
   * .build())
   * .sds(TlsValidationContextSdsTrustProperty.builder()
   * .secretName("secretName")
   * .build())
   * .build())
   * // the properties below are optional
   * .subjectAlternativeNames(SubjectAlternativeNamesProperty.builder()
   * .match(SubjectAlternativeNameMatchersProperty.builder()
   * .exact(List.of("exact"))
   * .build())
   * .build())
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-virtualnode-tlsvalidationcontext.html)
   */
  public interface TlsValidationContextProperty {
    /**
     * A reference to an object that represents the SANs for a Transport Layer Security (TLS)
     * validation context.
     *
     * If you don't specify SANs on the *terminating* mesh endpoint, the Envoy proxy for that node
     * doesn't verify the SAN on a peer client certificate. If you don't specify SANs on the
     * *originating* mesh endpoint, the SAN on the certificate provided by the terminating endpoint
     * must match the mesh endpoint service discovery configuration. Since SPIRE vended certificates
     * have a SPIFFE ID as a name, you must set the SAN since the name doesn't match the service
     * discovery name.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-virtualnode-tlsvalidationcontext.html#cfn-appmesh-virtualnode-tlsvalidationcontext-subjectalternativenames)
     */
    public fun subjectAlternativeNames(): Any? = unwrap(this).getSubjectAlternativeNames()

    /**
     * A reference to where to retrieve the trust chain when validating a peer’s Transport Layer
     * Security (TLS) certificate.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-virtualnode-tlsvalidationcontext.html#cfn-appmesh-virtualnode-tlsvalidationcontext-trust)
     */
    public fun trust(): Any

    /**
     * A builder for [TlsValidationContextProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param subjectAlternativeNames A reference to an object that represents the SANs for a
       * Transport Layer Security (TLS) validation context.
       * If you don't specify SANs on the *terminating* mesh endpoint, the Envoy proxy for that node
       * doesn't verify the SAN on a peer client certificate. If you don't specify SANs on the
       * *originating* mesh endpoint, the SAN on the certificate provided by the terminating endpoint
       * must match the mesh endpoint service discovery configuration. Since SPIRE vended certificates
       * have a SPIFFE ID as a name, you must set the SAN since the name doesn't match the service
       * discovery name.
       */
      public fun subjectAlternativeNames(subjectAlternativeNames: IResolvable)

      /**
       * @param subjectAlternativeNames A reference to an object that represents the SANs for a
       * Transport Layer Security (TLS) validation context.
       * If you don't specify SANs on the *terminating* mesh endpoint, the Envoy proxy for that node
       * doesn't verify the SAN on a peer client certificate. If you don't specify SANs on the
       * *originating* mesh endpoint, the SAN on the certificate provided by the terminating endpoint
       * must match the mesh endpoint service discovery configuration. Since SPIRE vended certificates
       * have a SPIFFE ID as a name, you must set the SAN since the name doesn't match the service
       * discovery name.
       */
      public fun subjectAlternativeNames(subjectAlternativeNames: SubjectAlternativeNamesProperty)

      /**
       * @param subjectAlternativeNames A reference to an object that represents the SANs for a
       * Transport Layer Security (TLS) validation context.
       * If you don't specify SANs on the *terminating* mesh endpoint, the Envoy proxy for that node
       * doesn't verify the SAN on a peer client certificate. If you don't specify SANs on the
       * *originating* mesh endpoint, the SAN on the certificate provided by the terminating endpoint
       * must match the mesh endpoint service discovery configuration. Since SPIRE vended certificates
       * have a SPIFFE ID as a name, you must set the SAN since the name doesn't match the service
       * discovery name.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("2fbac1c9e17d90922149c31c7fa1e1e1a4509bfe76c8b013c33c69fa977e3697")
      public
          fun subjectAlternativeNames(subjectAlternativeNames: SubjectAlternativeNamesProperty.Builder.() -> Unit)

      /**
       * @param trust A reference to where to retrieve the trust chain when validating a peer’s
       * Transport Layer Security (TLS) certificate. 
       */
      public fun trust(trust: IResolvable)

      /**
       * @param trust A reference to where to retrieve the trust chain when validating a peer’s
       * Transport Layer Security (TLS) certificate. 
       */
      public fun trust(trust: TlsValidationContextTrustProperty)

      /**
       * @param trust A reference to where to retrieve the trust chain when validating a peer’s
       * Transport Layer Security (TLS) certificate. 
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("c010c0c915933602efc06c66a1d3dbf78856d82cf99b1638743b881d342f088a")
      public fun trust(trust: TlsValidationContextTrustProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.appmesh.CfnVirtualNode.TlsValidationContextProperty.Builder
          =
          software.amazon.awscdk.services.appmesh.CfnVirtualNode.TlsValidationContextProperty.builder()

      /**
       * @param subjectAlternativeNames A reference to an object that represents the SANs for a
       * Transport Layer Security (TLS) validation context.
       * If you don't specify SANs on the *terminating* mesh endpoint, the Envoy proxy for that node
       * doesn't verify the SAN on a peer client certificate. If you don't specify SANs on the
       * *originating* mesh endpoint, the SAN on the certificate provided by the terminating endpoint
       * must match the mesh endpoint service discovery configuration. Since SPIRE vended certificates
       * have a SPIFFE ID as a name, you must set the SAN since the name doesn't match the service
       * discovery name.
       */
      override fun subjectAlternativeNames(subjectAlternativeNames: IResolvable) {
        cdkBuilder.subjectAlternativeNames(subjectAlternativeNames.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param subjectAlternativeNames A reference to an object that represents the SANs for a
       * Transport Layer Security (TLS) validation context.
       * If you don't specify SANs on the *terminating* mesh endpoint, the Envoy proxy for that node
       * doesn't verify the SAN on a peer client certificate. If you don't specify SANs on the
       * *originating* mesh endpoint, the SAN on the certificate provided by the terminating endpoint
       * must match the mesh endpoint service discovery configuration. Since SPIRE vended certificates
       * have a SPIFFE ID as a name, you must set the SAN since the name doesn't match the service
       * discovery name.
       */
      override
          fun subjectAlternativeNames(subjectAlternativeNames: SubjectAlternativeNamesProperty) {
        cdkBuilder.subjectAlternativeNames(subjectAlternativeNames.let(SubjectAlternativeNamesProperty.Companion::unwrap))
      }

      /**
       * @param subjectAlternativeNames A reference to an object that represents the SANs for a
       * Transport Layer Security (TLS) validation context.
       * If you don't specify SANs on the *terminating* mesh endpoint, the Envoy proxy for that node
       * doesn't verify the SAN on a peer client certificate. If you don't specify SANs on the
       * *originating* mesh endpoint, the SAN on the certificate provided by the terminating endpoint
       * must match the mesh endpoint service discovery configuration. Since SPIRE vended certificates
       * have a SPIFFE ID as a name, you must set the SAN since the name doesn't match the service
       * discovery name.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("2fbac1c9e17d90922149c31c7fa1e1e1a4509bfe76c8b013c33c69fa977e3697")
      override
          fun subjectAlternativeNames(subjectAlternativeNames: SubjectAlternativeNamesProperty.Builder.() -> Unit):
          Unit = subjectAlternativeNames(SubjectAlternativeNamesProperty(subjectAlternativeNames))

      /**
       * @param trust A reference to where to retrieve the trust chain when validating a peer’s
       * Transport Layer Security (TLS) certificate. 
       */
      override fun trust(trust: IResolvable) {
        cdkBuilder.trust(trust.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param trust A reference to where to retrieve the trust chain when validating a peer’s
       * Transport Layer Security (TLS) certificate. 
       */
      override fun trust(trust: TlsValidationContextTrustProperty) {
        cdkBuilder.trust(trust.let(TlsValidationContextTrustProperty.Companion::unwrap))
      }

      /**
       * @param trust A reference to where to retrieve the trust chain when validating a peer’s
       * Transport Layer Security (TLS) certificate. 
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("c010c0c915933602efc06c66a1d3dbf78856d82cf99b1638743b881d342f088a")
      override fun trust(trust: TlsValidationContextTrustProperty.Builder.() -> Unit): Unit =
          trust(TlsValidationContextTrustProperty(trust))

      public fun build():
          software.amazon.awscdk.services.appmesh.CfnVirtualNode.TlsValidationContextProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.appmesh.CfnVirtualNode.TlsValidationContextProperty,
    ) : CdkObject(cdkObject), TlsValidationContextProperty {
      /**
       * A reference to an object that represents the SANs for a Transport Layer Security (TLS)
       * validation context.
       *
       * If you don't specify SANs on the *terminating* mesh endpoint, the Envoy proxy for that node
       * doesn't verify the SAN on a peer client certificate. If you don't specify SANs on the
       * *originating* mesh endpoint, the SAN on the certificate provided by the terminating endpoint
       * must match the mesh endpoint service discovery configuration. Since SPIRE vended certificates
       * have a SPIFFE ID as a name, you must set the SAN since the name doesn't match the service
       * discovery name.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-virtualnode-tlsvalidationcontext.html#cfn-appmesh-virtualnode-tlsvalidationcontext-subjectalternativenames)
       */
      override fun subjectAlternativeNames(): Any? = unwrap(this).getSubjectAlternativeNames()

      /**
       * A reference to where to retrieve the trust chain when validating a peer’s Transport Layer
       * Security (TLS) certificate.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-virtualnode-tlsvalidationcontext.html#cfn-appmesh-virtualnode-tlsvalidationcontext-trust)
       */
      override fun trust(): Any = unwrap(this).getTrust()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): TlsValidationContextProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.appmesh.CfnVirtualNode.TlsValidationContextProperty):
          TlsValidationContextProperty = CdkObjectWrappers.wrap(cdkObject) as?
          TlsValidationContextProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: TlsValidationContextProperty):
          software.amazon.awscdk.services.appmesh.CfnVirtualNode.TlsValidationContextProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.appmesh.CfnVirtualNode.TlsValidationContextProperty
    }
  }

  /**
   * An object that represents a Transport Layer Security (TLS) Secret Discovery Service validation
   * context trust.
   *
   * The proxy must be configured with a local SDS provider via a Unix Domain Socket. See App Mesh
   * [TLS documentation](https://docs.aws.amazon.com/app-mesh/latest/userguide/tls.html) for more info.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.appmesh.*;
   * TlsValidationContextSdsTrustProperty tlsValidationContextSdsTrustProperty =
   * TlsValidationContextSdsTrustProperty.builder()
   * .secretName("secretName")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-virtualnode-tlsvalidationcontextsdstrust.html)
   */
  public interface TlsValidationContextSdsTrustProperty {
    /**
     * A reference to an object that represents the name of the secret for a Transport Layer
     * Security (TLS) Secret Discovery Service validation context trust.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-virtualnode-tlsvalidationcontextsdstrust.html#cfn-appmesh-virtualnode-tlsvalidationcontextsdstrust-secretname)
     */
    public fun secretName(): String

    /**
     * A builder for [TlsValidationContextSdsTrustProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param secretName A reference to an object that represents the name of the secret for a
       * Transport Layer Security (TLS) Secret Discovery Service validation context trust. 
       */
      public fun secretName(secretName: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.appmesh.CfnVirtualNode.TlsValidationContextSdsTrustProperty.Builder
          =
          software.amazon.awscdk.services.appmesh.CfnVirtualNode.TlsValidationContextSdsTrustProperty.builder()

      /**
       * @param secretName A reference to an object that represents the name of the secret for a
       * Transport Layer Security (TLS) Secret Discovery Service validation context trust. 
       */
      override fun secretName(secretName: String) {
        cdkBuilder.secretName(secretName)
      }

      public fun build():
          software.amazon.awscdk.services.appmesh.CfnVirtualNode.TlsValidationContextSdsTrustProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.appmesh.CfnVirtualNode.TlsValidationContextSdsTrustProperty,
    ) : CdkObject(cdkObject), TlsValidationContextSdsTrustProperty {
      /**
       * A reference to an object that represents the name of the secret for a Transport Layer
       * Security (TLS) Secret Discovery Service validation context trust.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-virtualnode-tlsvalidationcontextsdstrust.html#cfn-appmesh-virtualnode-tlsvalidationcontextsdstrust-secretname)
       */
      override fun secretName(): String = unwrap(this).getSecretName()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          TlsValidationContextSdsTrustProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.appmesh.CfnVirtualNode.TlsValidationContextSdsTrustProperty):
          TlsValidationContextSdsTrustProperty = CdkObjectWrappers.wrap(cdkObject) as?
          TlsValidationContextSdsTrustProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: TlsValidationContextSdsTrustProperty):
          software.amazon.awscdk.services.appmesh.CfnVirtualNode.TlsValidationContextSdsTrustProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.appmesh.CfnVirtualNode.TlsValidationContextSdsTrustProperty
    }
  }

  /**
   * An object that represents a Transport Layer Security (TLS) validation context trust.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.appmesh.*;
   * TlsValidationContextTrustProperty tlsValidationContextTrustProperty =
   * TlsValidationContextTrustProperty.builder()
   * .acm(TlsValidationContextAcmTrustProperty.builder()
   * .certificateAuthorityArns(List.of("certificateAuthorityArns"))
   * .build())
   * .file(TlsValidationContextFileTrustProperty.builder()
   * .certificateChain("certificateChain")
   * .build())
   * .sds(TlsValidationContextSdsTrustProperty.builder()
   * .secretName("secretName")
   * .build())
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-virtualnode-tlsvalidationcontexttrust.html)
   */
  public interface TlsValidationContextTrustProperty {
    /**
     * A reference to an object that represents a Transport Layer Security (TLS) validation context
     * trust for an AWS Certificate Manager certificate.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-virtualnode-tlsvalidationcontexttrust.html#cfn-appmesh-virtualnode-tlsvalidationcontexttrust-acm)
     */
    public fun acm(): Any? = unwrap(this).getAcm()

    /**
     * An object that represents a Transport Layer Security (TLS) validation context trust for a
     * local file.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-virtualnode-tlsvalidationcontexttrust.html#cfn-appmesh-virtualnode-tlsvalidationcontexttrust-file)
     */
    public fun `file`(): Any? = unwrap(this).getFile()

    /**
     * A reference to an object that represents a Transport Layer Security (TLS) Secret Discovery
     * Service validation context trust.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-virtualnode-tlsvalidationcontexttrust.html#cfn-appmesh-virtualnode-tlsvalidationcontexttrust-sds)
     */
    public fun sds(): Any? = unwrap(this).getSds()

    /**
     * A builder for [TlsValidationContextTrustProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param acm A reference to an object that represents a Transport Layer Security (TLS)
       * validation context trust for an AWS Certificate Manager certificate.
       */
      public fun acm(acm: IResolvable)

      /**
       * @param acm A reference to an object that represents a Transport Layer Security (TLS)
       * validation context trust for an AWS Certificate Manager certificate.
       */
      public fun acm(acm: TlsValidationContextAcmTrustProperty)

      /**
       * @param acm A reference to an object that represents a Transport Layer Security (TLS)
       * validation context trust for an AWS Certificate Manager certificate.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("fb63f15a5cad48e41bf4fe1e5f2aa2ae1aeda3bc331063aadec52e56a1e06a08")
      public fun acm(acm: TlsValidationContextAcmTrustProperty.Builder.() -> Unit)

      /**
       * @param file An object that represents a Transport Layer Security (TLS) validation context
       * trust for a local file.
       */
      public fun `file`(`file`: IResolvable)

      /**
       * @param file An object that represents a Transport Layer Security (TLS) validation context
       * trust for a local file.
       */
      public fun `file`(`file`: TlsValidationContextFileTrustProperty)

      /**
       * @param file An object that represents a Transport Layer Security (TLS) validation context
       * trust for a local file.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("6597900f308a602deef50656d736b7ddb34b29ef5b3a7cb8a83e55d8de744860")
      public fun `file`(`file`: TlsValidationContextFileTrustProperty.Builder.() -> Unit)

      /**
       * @param sds A reference to an object that represents a Transport Layer Security (TLS) Secret
       * Discovery Service validation context trust.
       */
      public fun sds(sds: IResolvable)

      /**
       * @param sds A reference to an object that represents a Transport Layer Security (TLS) Secret
       * Discovery Service validation context trust.
       */
      public fun sds(sds: TlsValidationContextSdsTrustProperty)

      /**
       * @param sds A reference to an object that represents a Transport Layer Security (TLS) Secret
       * Discovery Service validation context trust.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("d24627abc7e81d199764f87dccbc7e922ddeeee1622a06fda7588dc04cd2bd4a")
      public fun sds(sds: TlsValidationContextSdsTrustProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.appmesh.CfnVirtualNode.TlsValidationContextTrustProperty.Builder
          =
          software.amazon.awscdk.services.appmesh.CfnVirtualNode.TlsValidationContextTrustProperty.builder()

      /**
       * @param acm A reference to an object that represents a Transport Layer Security (TLS)
       * validation context trust for an AWS Certificate Manager certificate.
       */
      override fun acm(acm: IResolvable) {
        cdkBuilder.acm(acm.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param acm A reference to an object that represents a Transport Layer Security (TLS)
       * validation context trust for an AWS Certificate Manager certificate.
       */
      override fun acm(acm: TlsValidationContextAcmTrustProperty) {
        cdkBuilder.acm(acm.let(TlsValidationContextAcmTrustProperty.Companion::unwrap))
      }

      /**
       * @param acm A reference to an object that represents a Transport Layer Security (TLS)
       * validation context trust for an AWS Certificate Manager certificate.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("fb63f15a5cad48e41bf4fe1e5f2aa2ae1aeda3bc331063aadec52e56a1e06a08")
      override fun acm(acm: TlsValidationContextAcmTrustProperty.Builder.() -> Unit): Unit =
          acm(TlsValidationContextAcmTrustProperty(acm))

      /**
       * @param file An object that represents a Transport Layer Security (TLS) validation context
       * trust for a local file.
       */
      override fun `file`(`file`: IResolvable) {
        cdkBuilder.`file`(`file`.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param file An object that represents a Transport Layer Security (TLS) validation context
       * trust for a local file.
       */
      override fun `file`(`file`: TlsValidationContextFileTrustProperty) {
        cdkBuilder.`file`(`file`.let(TlsValidationContextFileTrustProperty.Companion::unwrap))
      }

      /**
       * @param file An object that represents a Transport Layer Security (TLS) validation context
       * trust for a local file.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("6597900f308a602deef50656d736b7ddb34b29ef5b3a7cb8a83e55d8de744860")
      override fun `file`(`file`: TlsValidationContextFileTrustProperty.Builder.() -> Unit): Unit =
          `file`(TlsValidationContextFileTrustProperty(`file`))

      /**
       * @param sds A reference to an object that represents a Transport Layer Security (TLS) Secret
       * Discovery Service validation context trust.
       */
      override fun sds(sds: IResolvable) {
        cdkBuilder.sds(sds.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param sds A reference to an object that represents a Transport Layer Security (TLS) Secret
       * Discovery Service validation context trust.
       */
      override fun sds(sds: TlsValidationContextSdsTrustProperty) {
        cdkBuilder.sds(sds.let(TlsValidationContextSdsTrustProperty.Companion::unwrap))
      }

      /**
       * @param sds A reference to an object that represents a Transport Layer Security (TLS) Secret
       * Discovery Service validation context trust.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("d24627abc7e81d199764f87dccbc7e922ddeeee1622a06fda7588dc04cd2bd4a")
      override fun sds(sds: TlsValidationContextSdsTrustProperty.Builder.() -> Unit): Unit =
          sds(TlsValidationContextSdsTrustProperty(sds))

      public fun build():
          software.amazon.awscdk.services.appmesh.CfnVirtualNode.TlsValidationContextTrustProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.appmesh.CfnVirtualNode.TlsValidationContextTrustProperty,
    ) : CdkObject(cdkObject), TlsValidationContextTrustProperty {
      /**
       * A reference to an object that represents a Transport Layer Security (TLS) validation
       * context trust for an AWS Certificate Manager certificate.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-virtualnode-tlsvalidationcontexttrust.html#cfn-appmesh-virtualnode-tlsvalidationcontexttrust-acm)
       */
      override fun acm(): Any? = unwrap(this).getAcm()

      /**
       * An object that represents a Transport Layer Security (TLS) validation context trust for a
       * local file.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-virtualnode-tlsvalidationcontexttrust.html#cfn-appmesh-virtualnode-tlsvalidationcontexttrust-file)
       */
      override fun `file`(): Any? = unwrap(this).getFile()

      /**
       * A reference to an object that represents a Transport Layer Security (TLS) Secret Discovery
       * Service validation context trust.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-virtualnode-tlsvalidationcontexttrust.html#cfn-appmesh-virtualnode-tlsvalidationcontexttrust-sds)
       */
      override fun sds(): Any? = unwrap(this).getSds()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          TlsValidationContextTrustProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.appmesh.CfnVirtualNode.TlsValidationContextTrustProperty):
          TlsValidationContextTrustProperty = CdkObjectWrappers.wrap(cdkObject) as?
          TlsValidationContextTrustProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: TlsValidationContextTrustProperty):
          software.amazon.awscdk.services.appmesh.CfnVirtualNode.TlsValidationContextTrustProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.appmesh.CfnVirtualNode.TlsValidationContextTrustProperty
    }
  }

  /**
   * An object that represents the type of virtual node connection pool.
   *
   * Only one protocol is used at a time and should be the same protocol as the one chosen under
   * port mapping.
   *
   * If not present the default value for `maxPendingRequests` is `2147483647` .
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.appmesh.*;
   * VirtualNodeConnectionPoolProperty virtualNodeConnectionPoolProperty =
   * VirtualNodeConnectionPoolProperty.builder()
   * .grpc(VirtualNodeGrpcConnectionPoolProperty.builder()
   * .maxRequests(123)
   * .build())
   * .http(VirtualNodeHttpConnectionPoolProperty.builder()
   * .maxConnections(123)
   * // the properties below are optional
   * .maxPendingRequests(123)
   * .build())
   * .http2(VirtualNodeHttp2ConnectionPoolProperty.builder()
   * .maxRequests(123)
   * .build())
   * .tcp(VirtualNodeTcpConnectionPoolProperty.builder()
   * .maxConnections(123)
   * .build())
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-virtualnode-virtualnodeconnectionpool.html)
   */
  public interface VirtualNodeConnectionPoolProperty {
    /**
     * An object that represents a type of connection pool.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-virtualnode-virtualnodeconnectionpool.html#cfn-appmesh-virtualnode-virtualnodeconnectionpool-grpc)
     */
    public fun grpc(): Any? = unwrap(this).getGrpc()

    /**
     * An object that represents a type of connection pool.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-virtualnode-virtualnodeconnectionpool.html#cfn-appmesh-virtualnode-virtualnodeconnectionpool-http)
     */
    public fun http(): Any? = unwrap(this).getHttp()

    /**
     * An object that represents a type of connection pool.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-virtualnode-virtualnodeconnectionpool.html#cfn-appmesh-virtualnode-virtualnodeconnectionpool-http2)
     */
    public fun http2(): Any? = unwrap(this).getHttp2()

    /**
     * An object that represents a type of connection pool.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-virtualnode-virtualnodeconnectionpool.html#cfn-appmesh-virtualnode-virtualnodeconnectionpool-tcp)
     */
    public fun tcp(): Any? = unwrap(this).getTcp()

    /**
     * A builder for [VirtualNodeConnectionPoolProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param grpc An object that represents a type of connection pool.
       */
      public fun grpc(grpc: IResolvable)

      /**
       * @param grpc An object that represents a type of connection pool.
       */
      public fun grpc(grpc: VirtualNodeGrpcConnectionPoolProperty)

      /**
       * @param grpc An object that represents a type of connection pool.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("28974c9fe5f41ea5caad4092771fd829ab391c7effd1481770a6d4e6ae948c68")
      public fun grpc(grpc: VirtualNodeGrpcConnectionPoolProperty.Builder.() -> Unit)

      /**
       * @param http An object that represents a type of connection pool.
       */
      public fun http(http: IResolvable)

      /**
       * @param http An object that represents a type of connection pool.
       */
      public fun http(http: VirtualNodeHttpConnectionPoolProperty)

      /**
       * @param http An object that represents a type of connection pool.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("710d3775ee0701901c1c87a294918f36b97a7e8b73c0ed6e5c74d48b9fc15889")
      public fun http(http: VirtualNodeHttpConnectionPoolProperty.Builder.() -> Unit)

      /**
       * @param http2 An object that represents a type of connection pool.
       */
      public fun http2(http2: IResolvable)

      /**
       * @param http2 An object that represents a type of connection pool.
       */
      public fun http2(http2: VirtualNodeHttp2ConnectionPoolProperty)

      /**
       * @param http2 An object that represents a type of connection pool.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("4c61792de0aa041e7cf5c767a0b49fa9b652f59742fb071d8a3e72d0db73aa56")
      public fun http2(http2: VirtualNodeHttp2ConnectionPoolProperty.Builder.() -> Unit)

      /**
       * @param tcp An object that represents a type of connection pool.
       */
      public fun tcp(tcp: IResolvable)

      /**
       * @param tcp An object that represents a type of connection pool.
       */
      public fun tcp(tcp: VirtualNodeTcpConnectionPoolProperty)

      /**
       * @param tcp An object that represents a type of connection pool.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("5fb0def611e45703cfc80421c772a7a82487c79e2f0cff1f064cd444fcca638f")
      public fun tcp(tcp: VirtualNodeTcpConnectionPoolProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.appmesh.CfnVirtualNode.VirtualNodeConnectionPoolProperty.Builder
          =
          software.amazon.awscdk.services.appmesh.CfnVirtualNode.VirtualNodeConnectionPoolProperty.builder()

      /**
       * @param grpc An object that represents a type of connection pool.
       */
      override fun grpc(grpc: IResolvable) {
        cdkBuilder.grpc(grpc.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param grpc An object that represents a type of connection pool.
       */
      override fun grpc(grpc: VirtualNodeGrpcConnectionPoolProperty) {
        cdkBuilder.grpc(grpc.let(VirtualNodeGrpcConnectionPoolProperty.Companion::unwrap))
      }

      /**
       * @param grpc An object that represents a type of connection pool.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("28974c9fe5f41ea5caad4092771fd829ab391c7effd1481770a6d4e6ae948c68")
      override fun grpc(grpc: VirtualNodeGrpcConnectionPoolProperty.Builder.() -> Unit): Unit =
          grpc(VirtualNodeGrpcConnectionPoolProperty(grpc))

      /**
       * @param http An object that represents a type of connection pool.
       */
      override fun http(http: IResolvable) {
        cdkBuilder.http(http.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param http An object that represents a type of connection pool.
       */
      override fun http(http: VirtualNodeHttpConnectionPoolProperty) {
        cdkBuilder.http(http.let(VirtualNodeHttpConnectionPoolProperty.Companion::unwrap))
      }

      /**
       * @param http An object that represents a type of connection pool.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("710d3775ee0701901c1c87a294918f36b97a7e8b73c0ed6e5c74d48b9fc15889")
      override fun http(http: VirtualNodeHttpConnectionPoolProperty.Builder.() -> Unit): Unit =
          http(VirtualNodeHttpConnectionPoolProperty(http))

      /**
       * @param http2 An object that represents a type of connection pool.
       */
      override fun http2(http2: IResolvable) {
        cdkBuilder.http2(http2.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param http2 An object that represents a type of connection pool.
       */
      override fun http2(http2: VirtualNodeHttp2ConnectionPoolProperty) {
        cdkBuilder.http2(http2.let(VirtualNodeHttp2ConnectionPoolProperty.Companion::unwrap))
      }

      /**
       * @param http2 An object that represents a type of connection pool.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("4c61792de0aa041e7cf5c767a0b49fa9b652f59742fb071d8a3e72d0db73aa56")
      override fun http2(http2: VirtualNodeHttp2ConnectionPoolProperty.Builder.() -> Unit): Unit =
          http2(VirtualNodeHttp2ConnectionPoolProperty(http2))

      /**
       * @param tcp An object that represents a type of connection pool.
       */
      override fun tcp(tcp: IResolvable) {
        cdkBuilder.tcp(tcp.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param tcp An object that represents a type of connection pool.
       */
      override fun tcp(tcp: VirtualNodeTcpConnectionPoolProperty) {
        cdkBuilder.tcp(tcp.let(VirtualNodeTcpConnectionPoolProperty.Companion::unwrap))
      }

      /**
       * @param tcp An object that represents a type of connection pool.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("5fb0def611e45703cfc80421c772a7a82487c79e2f0cff1f064cd444fcca638f")
      override fun tcp(tcp: VirtualNodeTcpConnectionPoolProperty.Builder.() -> Unit): Unit =
          tcp(VirtualNodeTcpConnectionPoolProperty(tcp))

      public fun build():
          software.amazon.awscdk.services.appmesh.CfnVirtualNode.VirtualNodeConnectionPoolProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.appmesh.CfnVirtualNode.VirtualNodeConnectionPoolProperty,
    ) : CdkObject(cdkObject), VirtualNodeConnectionPoolProperty {
      /**
       * An object that represents a type of connection pool.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-virtualnode-virtualnodeconnectionpool.html#cfn-appmesh-virtualnode-virtualnodeconnectionpool-grpc)
       */
      override fun grpc(): Any? = unwrap(this).getGrpc()

      /**
       * An object that represents a type of connection pool.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-virtualnode-virtualnodeconnectionpool.html#cfn-appmesh-virtualnode-virtualnodeconnectionpool-http)
       */
      override fun http(): Any? = unwrap(this).getHttp()

      /**
       * An object that represents a type of connection pool.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-virtualnode-virtualnodeconnectionpool.html#cfn-appmesh-virtualnode-virtualnodeconnectionpool-http2)
       */
      override fun http2(): Any? = unwrap(this).getHttp2()

      /**
       * An object that represents a type of connection pool.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-virtualnode-virtualnodeconnectionpool.html#cfn-appmesh-virtualnode-virtualnodeconnectionpool-tcp)
       */
      override fun tcp(): Any? = unwrap(this).getTcp()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          VirtualNodeConnectionPoolProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.appmesh.CfnVirtualNode.VirtualNodeConnectionPoolProperty):
          VirtualNodeConnectionPoolProperty = CdkObjectWrappers.wrap(cdkObject) as?
          VirtualNodeConnectionPoolProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: VirtualNodeConnectionPoolProperty):
          software.amazon.awscdk.services.appmesh.CfnVirtualNode.VirtualNodeConnectionPoolProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.appmesh.CfnVirtualNode.VirtualNodeConnectionPoolProperty
    }
  }

  /**
   * An object that represents a type of connection pool.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.appmesh.*;
   * VirtualNodeGrpcConnectionPoolProperty virtualNodeGrpcConnectionPoolProperty =
   * VirtualNodeGrpcConnectionPoolProperty.builder()
   * .maxRequests(123)
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-virtualnode-virtualnodegrpcconnectionpool.html)
   */
  public interface VirtualNodeGrpcConnectionPoolProperty {
    /**
     * Maximum number of inflight requests Envoy can concurrently support across hosts in upstream
     * cluster.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-virtualnode-virtualnodegrpcconnectionpool.html#cfn-appmesh-virtualnode-virtualnodegrpcconnectionpool-maxrequests)
     */
    public fun maxRequests(): Number

    /**
     * A builder for [VirtualNodeGrpcConnectionPoolProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param maxRequests Maximum number of inflight requests Envoy can concurrently support
       * across hosts in upstream cluster. 
       */
      public fun maxRequests(maxRequests: Number)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.appmesh.CfnVirtualNode.VirtualNodeGrpcConnectionPoolProperty.Builder
          =
          software.amazon.awscdk.services.appmesh.CfnVirtualNode.VirtualNodeGrpcConnectionPoolProperty.builder()

      /**
       * @param maxRequests Maximum number of inflight requests Envoy can concurrently support
       * across hosts in upstream cluster. 
       */
      override fun maxRequests(maxRequests: Number) {
        cdkBuilder.maxRequests(maxRequests)
      }

      public fun build():
          software.amazon.awscdk.services.appmesh.CfnVirtualNode.VirtualNodeGrpcConnectionPoolProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.appmesh.CfnVirtualNode.VirtualNodeGrpcConnectionPoolProperty,
    ) : CdkObject(cdkObject), VirtualNodeGrpcConnectionPoolProperty {
      /**
       * Maximum number of inflight requests Envoy can concurrently support across hosts in upstream
       * cluster.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-virtualnode-virtualnodegrpcconnectionpool.html#cfn-appmesh-virtualnode-virtualnodegrpcconnectionpool-maxrequests)
       */
      override fun maxRequests(): Number = unwrap(this).getMaxRequests()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          VirtualNodeGrpcConnectionPoolProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.appmesh.CfnVirtualNode.VirtualNodeGrpcConnectionPoolProperty):
          VirtualNodeGrpcConnectionPoolProperty = CdkObjectWrappers.wrap(cdkObject) as?
          VirtualNodeGrpcConnectionPoolProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: VirtualNodeGrpcConnectionPoolProperty):
          software.amazon.awscdk.services.appmesh.CfnVirtualNode.VirtualNodeGrpcConnectionPoolProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.appmesh.CfnVirtualNode.VirtualNodeGrpcConnectionPoolProperty
    }
  }

  /**
   * An object that represents a type of connection pool.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.appmesh.*;
   * VirtualNodeHttp2ConnectionPoolProperty virtualNodeHttp2ConnectionPoolProperty =
   * VirtualNodeHttp2ConnectionPoolProperty.builder()
   * .maxRequests(123)
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-virtualnode-virtualnodehttp2connectionpool.html)
   */
  public interface VirtualNodeHttp2ConnectionPoolProperty {
    /**
     * Maximum number of inflight requests Envoy can concurrently support across hosts in upstream
     * cluster.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-virtualnode-virtualnodehttp2connectionpool.html#cfn-appmesh-virtualnode-virtualnodehttp2connectionpool-maxrequests)
     */
    public fun maxRequests(): Number

    /**
     * A builder for [VirtualNodeHttp2ConnectionPoolProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param maxRequests Maximum number of inflight requests Envoy can concurrently support
       * across hosts in upstream cluster. 
       */
      public fun maxRequests(maxRequests: Number)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.appmesh.CfnVirtualNode.VirtualNodeHttp2ConnectionPoolProperty.Builder
          =
          software.amazon.awscdk.services.appmesh.CfnVirtualNode.VirtualNodeHttp2ConnectionPoolProperty.builder()

      /**
       * @param maxRequests Maximum number of inflight requests Envoy can concurrently support
       * across hosts in upstream cluster. 
       */
      override fun maxRequests(maxRequests: Number) {
        cdkBuilder.maxRequests(maxRequests)
      }

      public fun build():
          software.amazon.awscdk.services.appmesh.CfnVirtualNode.VirtualNodeHttp2ConnectionPoolProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.appmesh.CfnVirtualNode.VirtualNodeHttp2ConnectionPoolProperty,
    ) : CdkObject(cdkObject), VirtualNodeHttp2ConnectionPoolProperty {
      /**
       * Maximum number of inflight requests Envoy can concurrently support across hosts in upstream
       * cluster.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-virtualnode-virtualnodehttp2connectionpool.html#cfn-appmesh-virtualnode-virtualnodehttp2connectionpool-maxrequests)
       */
      override fun maxRequests(): Number = unwrap(this).getMaxRequests()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          VirtualNodeHttp2ConnectionPoolProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.appmesh.CfnVirtualNode.VirtualNodeHttp2ConnectionPoolProperty):
          VirtualNodeHttp2ConnectionPoolProperty = CdkObjectWrappers.wrap(cdkObject) as?
          VirtualNodeHttp2ConnectionPoolProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: VirtualNodeHttp2ConnectionPoolProperty):
          software.amazon.awscdk.services.appmesh.CfnVirtualNode.VirtualNodeHttp2ConnectionPoolProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.appmesh.CfnVirtualNode.VirtualNodeHttp2ConnectionPoolProperty
    }
  }

  /**
   * An object that represents a type of connection pool.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.appmesh.*;
   * VirtualNodeHttpConnectionPoolProperty virtualNodeHttpConnectionPoolProperty =
   * VirtualNodeHttpConnectionPoolProperty.builder()
   * .maxConnections(123)
   * // the properties below are optional
   * .maxPendingRequests(123)
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-virtualnode-virtualnodehttpconnectionpool.html)
   */
  public interface VirtualNodeHttpConnectionPoolProperty {
    /**
     * Maximum number of outbound TCP connections Envoy can establish concurrently with all hosts in
     * upstream cluster.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-virtualnode-virtualnodehttpconnectionpool.html#cfn-appmesh-virtualnode-virtualnodehttpconnectionpool-maxconnections)
     */
    public fun maxConnections(): Number

    /**
     * Number of overflowing requests after `max_connections` Envoy will queue to upstream cluster.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-virtualnode-virtualnodehttpconnectionpool.html#cfn-appmesh-virtualnode-virtualnodehttpconnectionpool-maxpendingrequests)
     */
    public fun maxPendingRequests(): Number? = unwrap(this).getMaxPendingRequests()

    /**
     * A builder for [VirtualNodeHttpConnectionPoolProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param maxConnections Maximum number of outbound TCP connections Envoy can establish
       * concurrently with all hosts in upstream cluster. 
       */
      public fun maxConnections(maxConnections: Number)

      /**
       * @param maxPendingRequests Number of overflowing requests after `max_connections` Envoy will
       * queue to upstream cluster.
       */
      public fun maxPendingRequests(maxPendingRequests: Number)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.appmesh.CfnVirtualNode.VirtualNodeHttpConnectionPoolProperty.Builder
          =
          software.amazon.awscdk.services.appmesh.CfnVirtualNode.VirtualNodeHttpConnectionPoolProperty.builder()

      /**
       * @param maxConnections Maximum number of outbound TCP connections Envoy can establish
       * concurrently with all hosts in upstream cluster. 
       */
      override fun maxConnections(maxConnections: Number) {
        cdkBuilder.maxConnections(maxConnections)
      }

      /**
       * @param maxPendingRequests Number of overflowing requests after `max_connections` Envoy will
       * queue to upstream cluster.
       */
      override fun maxPendingRequests(maxPendingRequests: Number) {
        cdkBuilder.maxPendingRequests(maxPendingRequests)
      }

      public fun build():
          software.amazon.awscdk.services.appmesh.CfnVirtualNode.VirtualNodeHttpConnectionPoolProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.appmesh.CfnVirtualNode.VirtualNodeHttpConnectionPoolProperty,
    ) : CdkObject(cdkObject), VirtualNodeHttpConnectionPoolProperty {
      /**
       * Maximum number of outbound TCP connections Envoy can establish concurrently with all hosts
       * in upstream cluster.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-virtualnode-virtualnodehttpconnectionpool.html#cfn-appmesh-virtualnode-virtualnodehttpconnectionpool-maxconnections)
       */
      override fun maxConnections(): Number = unwrap(this).getMaxConnections()

      /**
       * Number of overflowing requests after `max_connections` Envoy will queue to upstream
       * cluster.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-virtualnode-virtualnodehttpconnectionpool.html#cfn-appmesh-virtualnode-virtualnodehttpconnectionpool-maxpendingrequests)
       */
      override fun maxPendingRequests(): Number? = unwrap(this).getMaxPendingRequests()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          VirtualNodeHttpConnectionPoolProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.appmesh.CfnVirtualNode.VirtualNodeHttpConnectionPoolProperty):
          VirtualNodeHttpConnectionPoolProperty = CdkObjectWrappers.wrap(cdkObject) as?
          VirtualNodeHttpConnectionPoolProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: VirtualNodeHttpConnectionPoolProperty):
          software.amazon.awscdk.services.appmesh.CfnVirtualNode.VirtualNodeHttpConnectionPoolProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.appmesh.CfnVirtualNode.VirtualNodeHttpConnectionPoolProperty
    }
  }

  /**
   * An object that represents the specification of a virtual node.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.appmesh.*;
   * VirtualNodeSpecProperty virtualNodeSpecProperty = VirtualNodeSpecProperty.builder()
   * .backendDefaults(BackendDefaultsProperty.builder()
   * .clientPolicy(ClientPolicyProperty.builder()
   * .tls(ClientPolicyTlsProperty.builder()
   * .validation(TlsValidationContextProperty.builder()
   * .trust(TlsValidationContextTrustProperty.builder()
   * .acm(TlsValidationContextAcmTrustProperty.builder()
   * .certificateAuthorityArns(List.of("certificateAuthorityArns"))
   * .build())
   * .file(TlsValidationContextFileTrustProperty.builder()
   * .certificateChain("certificateChain")
   * .build())
   * .sds(TlsValidationContextSdsTrustProperty.builder()
   * .secretName("secretName")
   * .build())
   * .build())
   * // the properties below are optional
   * .subjectAlternativeNames(SubjectAlternativeNamesProperty.builder()
   * .match(SubjectAlternativeNameMatchersProperty.builder()
   * .exact(List.of("exact"))
   * .build())
   * .build())
   * .build())
   * // the properties below are optional
   * .certificate(ClientTlsCertificateProperty.builder()
   * .file(ListenerTlsFileCertificateProperty.builder()
   * .certificateChain("certificateChain")
   * .privateKey("privateKey")
   * .build())
   * .sds(ListenerTlsSdsCertificateProperty.builder()
   * .secretName("secretName")
   * .build())
   * .build())
   * .enforce(false)
   * .ports(List.of(123))
   * .build())
   * .build())
   * .build())
   * .backends(List.of(BackendProperty.builder()
   * .virtualService(VirtualServiceBackendProperty.builder()
   * .virtualServiceName("virtualServiceName")
   * // the properties below are optional
   * .clientPolicy(ClientPolicyProperty.builder()
   * .tls(ClientPolicyTlsProperty.builder()
   * .validation(TlsValidationContextProperty.builder()
   * .trust(TlsValidationContextTrustProperty.builder()
   * .acm(TlsValidationContextAcmTrustProperty.builder()
   * .certificateAuthorityArns(List.of("certificateAuthorityArns"))
   * .build())
   * .file(TlsValidationContextFileTrustProperty.builder()
   * .certificateChain("certificateChain")
   * .build())
   * .sds(TlsValidationContextSdsTrustProperty.builder()
   * .secretName("secretName")
   * .build())
   * .build())
   * // the properties below are optional
   * .subjectAlternativeNames(SubjectAlternativeNamesProperty.builder()
   * .match(SubjectAlternativeNameMatchersProperty.builder()
   * .exact(List.of("exact"))
   * .build())
   * .build())
   * .build())
   * // the properties below are optional
   * .certificate(ClientTlsCertificateProperty.builder()
   * .file(ListenerTlsFileCertificateProperty.builder()
   * .certificateChain("certificateChain")
   * .privateKey("privateKey")
   * .build())
   * .sds(ListenerTlsSdsCertificateProperty.builder()
   * .secretName("secretName")
   * .build())
   * .build())
   * .enforce(false)
   * .ports(List.of(123))
   * .build())
   * .build())
   * .build())
   * .build()))
   * .listeners(List.of(ListenerProperty.builder()
   * .portMapping(PortMappingProperty.builder()
   * .port(123)
   * .protocol("protocol")
   * .build())
   * // the properties below are optional
   * .connectionPool(VirtualNodeConnectionPoolProperty.builder()
   * .grpc(VirtualNodeGrpcConnectionPoolProperty.builder()
   * .maxRequests(123)
   * .build())
   * .http(VirtualNodeHttpConnectionPoolProperty.builder()
   * .maxConnections(123)
   * // the properties below are optional
   * .maxPendingRequests(123)
   * .build())
   * .http2(VirtualNodeHttp2ConnectionPoolProperty.builder()
   * .maxRequests(123)
   * .build())
   * .tcp(VirtualNodeTcpConnectionPoolProperty.builder()
   * .maxConnections(123)
   * .build())
   * .build())
   * .healthCheck(HealthCheckProperty.builder()
   * .healthyThreshold(123)
   * .intervalMillis(123)
   * .protocol("protocol")
   * .timeoutMillis(123)
   * .unhealthyThreshold(123)
   * // the properties below are optional
   * .path("path")
   * .port(123)
   * .build())
   * .outlierDetection(OutlierDetectionProperty.builder()
   * .baseEjectionDuration(DurationProperty.builder()
   * .unit("unit")
   * .value(123)
   * .build())
   * .interval(DurationProperty.builder()
   * .unit("unit")
   * .value(123)
   * .build())
   * .maxEjectionPercent(123)
   * .maxServerErrors(123)
   * .build())
   * .timeout(ListenerTimeoutProperty.builder()
   * .grpc(GrpcTimeoutProperty.builder()
   * .idle(DurationProperty.builder()
   * .unit("unit")
   * .value(123)
   * .build())
   * .perRequest(DurationProperty.builder()
   * .unit("unit")
   * .value(123)
   * .build())
   * .build())
   * .http(HttpTimeoutProperty.builder()
   * .idle(DurationProperty.builder()
   * .unit("unit")
   * .value(123)
   * .build())
   * .perRequest(DurationProperty.builder()
   * .unit("unit")
   * .value(123)
   * .build())
   * .build())
   * .http2(HttpTimeoutProperty.builder()
   * .idle(DurationProperty.builder()
   * .unit("unit")
   * .value(123)
   * .build())
   * .perRequest(DurationProperty.builder()
   * .unit("unit")
   * .value(123)
   * .build())
   * .build())
   * .tcp(TcpTimeoutProperty.builder()
   * .idle(DurationProperty.builder()
   * .unit("unit")
   * .value(123)
   * .build())
   * .build())
   * .build())
   * .tls(ListenerTlsProperty.builder()
   * .certificate(ListenerTlsCertificateProperty.builder()
   * .acm(ListenerTlsAcmCertificateProperty.builder()
   * .certificateArn("certificateArn")
   * .build())
   * .file(ListenerTlsFileCertificateProperty.builder()
   * .certificateChain("certificateChain")
   * .privateKey("privateKey")
   * .build())
   * .sds(ListenerTlsSdsCertificateProperty.builder()
   * .secretName("secretName")
   * .build())
   * .build())
   * .mode("mode")
   * // the properties below are optional
   * .validation(ListenerTlsValidationContextProperty.builder()
   * .trust(ListenerTlsValidationContextTrustProperty.builder()
   * .file(TlsValidationContextFileTrustProperty.builder()
   * .certificateChain("certificateChain")
   * .build())
   * .sds(TlsValidationContextSdsTrustProperty.builder()
   * .secretName("secretName")
   * .build())
   * .build())
   * // the properties below are optional
   * .subjectAlternativeNames(SubjectAlternativeNamesProperty.builder()
   * .match(SubjectAlternativeNameMatchersProperty.builder()
   * .exact(List.of("exact"))
   * .build())
   * .build())
   * .build())
   * .build())
   * .build()))
   * .logging(LoggingProperty.builder()
   * .accessLog(AccessLogProperty.builder()
   * .file(FileAccessLogProperty.builder()
   * .path("path")
   * // the properties below are optional
   * .format(LoggingFormatProperty.builder()
   * .json(List.of(JsonFormatRefProperty.builder()
   * .key("key")
   * .value("value")
   * .build()))
   * .text("text")
   * .build())
   * .build())
   * .build())
   * .build())
   * .serviceDiscovery(ServiceDiscoveryProperty.builder()
   * .awsCloudMap(AwsCloudMapServiceDiscoveryProperty.builder()
   * .namespaceName("namespaceName")
   * .serviceName("serviceName")
   * // the properties below are optional
   * .attributes(List.of(AwsCloudMapInstanceAttributeProperty.builder()
   * .key("key")
   * .value("value")
   * .build()))
   * .ipPreference("ipPreference")
   * .build())
   * .dns(DnsServiceDiscoveryProperty.builder()
   * .hostname("hostname")
   * // the properties below are optional
   * .ipPreference("ipPreference")
   * .responseType("responseType")
   * .build())
   * .build())
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-virtualnode-virtualnodespec.html)
   */
  public interface VirtualNodeSpecProperty {
    /**
     * A reference to an object that represents the defaults for backends.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-virtualnode-virtualnodespec.html#cfn-appmesh-virtualnode-virtualnodespec-backenddefaults)
     */
    public fun backendDefaults(): Any? = unwrap(this).getBackendDefaults()

    /**
     * The backends that the virtual node is expected to send outbound traffic to.
     *
     *
     * App Mesh doesn't validate the existence of those virtual services specified in backends. This
     * is to prevent a cyclic dependency between virtual nodes and virtual services creation. Make sure
     * the virtual service name is correct. The virtual service can be created afterwards if it doesn't
     * already exist.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-virtualnode-virtualnodespec.html#cfn-appmesh-virtualnode-virtualnodespec-backends)
     */
    public fun backends(): Any? = unwrap(this).getBackends()

    /**
     * The listener that the virtual node is expected to receive inbound traffic from.
     *
     * You can specify one listener.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-virtualnode-virtualnodespec.html#cfn-appmesh-virtualnode-virtualnodespec-listeners)
     */
    public fun listeners(): Any? = unwrap(this).getListeners()

    /**
     * The inbound and outbound access logging information for the virtual node.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-virtualnode-virtualnodespec.html#cfn-appmesh-virtualnode-virtualnodespec-logging)
     */
    public fun logging(): Any? = unwrap(this).getLogging()

    /**
     * The service discovery information for the virtual node.
     *
     * If your virtual node does not expect ingress traffic, you can omit this parameter. If you
     * specify a `listener` , then you must specify service discovery information.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-virtualnode-virtualnodespec.html#cfn-appmesh-virtualnode-virtualnodespec-servicediscovery)
     */
    public fun serviceDiscovery(): Any? = unwrap(this).getServiceDiscovery()

    /**
     * A builder for [VirtualNodeSpecProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param backendDefaults A reference to an object that represents the defaults for backends.
       */
      public fun backendDefaults(backendDefaults: IResolvable)

      /**
       * @param backendDefaults A reference to an object that represents the defaults for backends.
       */
      public fun backendDefaults(backendDefaults: BackendDefaultsProperty)

      /**
       * @param backendDefaults A reference to an object that represents the defaults for backends.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("93c3429e7267bbe197b1993db796cff2ee93608dd5dc9265b57428a20d027d41")
      public fun backendDefaults(backendDefaults: BackendDefaultsProperty.Builder.() -> Unit)

      /**
       * @param backends The backends that the virtual node is expected to send outbound traffic to.
       *
       * App Mesh doesn't validate the existence of those virtual services specified in backends.
       * This is to prevent a cyclic dependency between virtual nodes and virtual services creation.
       * Make sure the virtual service name is correct. The virtual service can be created afterwards
       * if it doesn't already exist.
       */
      public fun backends(backends: IResolvable)

      /**
       * @param backends The backends that the virtual node is expected to send outbound traffic to.
       *
       * App Mesh doesn't validate the existence of those virtual services specified in backends.
       * This is to prevent a cyclic dependency between virtual nodes and virtual services creation.
       * Make sure the virtual service name is correct. The virtual service can be created afterwards
       * if it doesn't already exist.
       */
      public fun backends(backends: List<Any>)

      /**
       * @param backends The backends that the virtual node is expected to send outbound traffic to.
       *
       * App Mesh doesn't validate the existence of those virtual services specified in backends.
       * This is to prevent a cyclic dependency between virtual nodes and virtual services creation.
       * Make sure the virtual service name is correct. The virtual service can be created afterwards
       * if it doesn't already exist.
       */
      public fun backends(vararg backends: Any)

      /**
       * @param listeners The listener that the virtual node is expected to receive inbound traffic
       * from.
       * You can specify one listener.
       */
      public fun listeners(listeners: IResolvable)

      /**
       * @param listeners The listener that the virtual node is expected to receive inbound traffic
       * from.
       * You can specify one listener.
       */
      public fun listeners(listeners: List<Any>)

      /**
       * @param listeners The listener that the virtual node is expected to receive inbound traffic
       * from.
       * You can specify one listener.
       */
      public fun listeners(vararg listeners: Any)

      /**
       * @param logging The inbound and outbound access logging information for the virtual node.
       */
      public fun logging(logging: IResolvable)

      /**
       * @param logging The inbound and outbound access logging information for the virtual node.
       */
      public fun logging(logging: LoggingProperty)

      /**
       * @param logging The inbound and outbound access logging information for the virtual node.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("6441afb3d8eb2098051cfdb3da250f0894bb2b65ac3918ec37dbf49f66a0feb3")
      public fun logging(logging: LoggingProperty.Builder.() -> Unit)

      /**
       * @param serviceDiscovery The service discovery information for the virtual node.
       * If your virtual node does not expect ingress traffic, you can omit this parameter. If you
       * specify a `listener` , then you must specify service discovery information.
       */
      public fun serviceDiscovery(serviceDiscovery: IResolvable)

      /**
       * @param serviceDiscovery The service discovery information for the virtual node.
       * If your virtual node does not expect ingress traffic, you can omit this parameter. If you
       * specify a `listener` , then you must specify service discovery information.
       */
      public fun serviceDiscovery(serviceDiscovery: ServiceDiscoveryProperty)

      /**
       * @param serviceDiscovery The service discovery information for the virtual node.
       * If your virtual node does not expect ingress traffic, you can omit this parameter. If you
       * specify a `listener` , then you must specify service discovery information.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("87f3a53ccc7e8f18b7a781960027007b7d263e276f31f2c1caa0c5b74cefef6b")
      public fun serviceDiscovery(serviceDiscovery: ServiceDiscoveryProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.appmesh.CfnVirtualNode.VirtualNodeSpecProperty.Builder =
          software.amazon.awscdk.services.appmesh.CfnVirtualNode.VirtualNodeSpecProperty.builder()

      /**
       * @param backendDefaults A reference to an object that represents the defaults for backends.
       */
      override fun backendDefaults(backendDefaults: IResolvable) {
        cdkBuilder.backendDefaults(backendDefaults.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param backendDefaults A reference to an object that represents the defaults for backends.
       */
      override fun backendDefaults(backendDefaults: BackendDefaultsProperty) {
        cdkBuilder.backendDefaults(backendDefaults.let(BackendDefaultsProperty.Companion::unwrap))
      }

      /**
       * @param backendDefaults A reference to an object that represents the defaults for backends.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("93c3429e7267bbe197b1993db796cff2ee93608dd5dc9265b57428a20d027d41")
      override fun backendDefaults(backendDefaults: BackendDefaultsProperty.Builder.() -> Unit):
          Unit = backendDefaults(BackendDefaultsProperty(backendDefaults))

      /**
       * @param backends The backends that the virtual node is expected to send outbound traffic to.
       *
       * App Mesh doesn't validate the existence of those virtual services specified in backends.
       * This is to prevent a cyclic dependency between virtual nodes and virtual services creation.
       * Make sure the virtual service name is correct. The virtual service can be created afterwards
       * if it doesn't already exist.
       */
      override fun backends(backends: IResolvable) {
        cdkBuilder.backends(backends.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param backends The backends that the virtual node is expected to send outbound traffic to.
       *
       * App Mesh doesn't validate the existence of those virtual services specified in backends.
       * This is to prevent a cyclic dependency between virtual nodes and virtual services creation.
       * Make sure the virtual service name is correct. The virtual service can be created afterwards
       * if it doesn't already exist.
       */
      override fun backends(backends: List<Any>) {
        cdkBuilder.backends(backends.map{CdkObjectWrappers.unwrap(it)})
      }

      /**
       * @param backends The backends that the virtual node is expected to send outbound traffic to.
       *
       * App Mesh doesn't validate the existence of those virtual services specified in backends.
       * This is to prevent a cyclic dependency between virtual nodes and virtual services creation.
       * Make sure the virtual service name is correct. The virtual service can be created afterwards
       * if it doesn't already exist.
       */
      override fun backends(vararg backends: Any): Unit = backends(backends.toList())

      /**
       * @param listeners The listener that the virtual node is expected to receive inbound traffic
       * from.
       * You can specify one listener.
       */
      override fun listeners(listeners: IResolvable) {
        cdkBuilder.listeners(listeners.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param listeners The listener that the virtual node is expected to receive inbound traffic
       * from.
       * You can specify one listener.
       */
      override fun listeners(listeners: List<Any>) {
        cdkBuilder.listeners(listeners.map{CdkObjectWrappers.unwrap(it)})
      }

      /**
       * @param listeners The listener that the virtual node is expected to receive inbound traffic
       * from.
       * You can specify one listener.
       */
      override fun listeners(vararg listeners: Any): Unit = listeners(listeners.toList())

      /**
       * @param logging The inbound and outbound access logging information for the virtual node.
       */
      override fun logging(logging: IResolvable) {
        cdkBuilder.logging(logging.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param logging The inbound and outbound access logging information for the virtual node.
       */
      override fun logging(logging: LoggingProperty) {
        cdkBuilder.logging(logging.let(LoggingProperty.Companion::unwrap))
      }

      /**
       * @param logging The inbound and outbound access logging information for the virtual node.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("6441afb3d8eb2098051cfdb3da250f0894bb2b65ac3918ec37dbf49f66a0feb3")
      override fun logging(logging: LoggingProperty.Builder.() -> Unit): Unit =
          logging(LoggingProperty(logging))

      /**
       * @param serviceDiscovery The service discovery information for the virtual node.
       * If your virtual node does not expect ingress traffic, you can omit this parameter. If you
       * specify a `listener` , then you must specify service discovery information.
       */
      override fun serviceDiscovery(serviceDiscovery: IResolvable) {
        cdkBuilder.serviceDiscovery(serviceDiscovery.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param serviceDiscovery The service discovery information for the virtual node.
       * If your virtual node does not expect ingress traffic, you can omit this parameter. If you
       * specify a `listener` , then you must specify service discovery information.
       */
      override fun serviceDiscovery(serviceDiscovery: ServiceDiscoveryProperty) {
        cdkBuilder.serviceDiscovery(serviceDiscovery.let(ServiceDiscoveryProperty.Companion::unwrap))
      }

      /**
       * @param serviceDiscovery The service discovery information for the virtual node.
       * If your virtual node does not expect ingress traffic, you can omit this parameter. If you
       * specify a `listener` , then you must specify service discovery information.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("87f3a53ccc7e8f18b7a781960027007b7d263e276f31f2c1caa0c5b74cefef6b")
      override fun serviceDiscovery(serviceDiscovery: ServiceDiscoveryProperty.Builder.() -> Unit):
          Unit = serviceDiscovery(ServiceDiscoveryProperty(serviceDiscovery))

      public fun build():
          software.amazon.awscdk.services.appmesh.CfnVirtualNode.VirtualNodeSpecProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.appmesh.CfnVirtualNode.VirtualNodeSpecProperty,
    ) : CdkObject(cdkObject), VirtualNodeSpecProperty {
      /**
       * A reference to an object that represents the defaults for backends.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-virtualnode-virtualnodespec.html#cfn-appmesh-virtualnode-virtualnodespec-backenddefaults)
       */
      override fun backendDefaults(): Any? = unwrap(this).getBackendDefaults()

      /**
       * The backends that the virtual node is expected to send outbound traffic to.
       *
       *
       * App Mesh doesn't validate the existence of those virtual services specified in backends.
       * This is to prevent a cyclic dependency between virtual nodes and virtual services creation.
       * Make sure the virtual service name is correct. The virtual service can be created afterwards
       * if it doesn't already exist.
       *
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-virtualnode-virtualnodespec.html#cfn-appmesh-virtualnode-virtualnodespec-backends)
       */
      override fun backends(): Any? = unwrap(this).getBackends()

      /**
       * The listener that the virtual node is expected to receive inbound traffic from.
       *
       * You can specify one listener.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-virtualnode-virtualnodespec.html#cfn-appmesh-virtualnode-virtualnodespec-listeners)
       */
      override fun listeners(): Any? = unwrap(this).getListeners()

      /**
       * The inbound and outbound access logging information for the virtual node.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-virtualnode-virtualnodespec.html#cfn-appmesh-virtualnode-virtualnodespec-logging)
       */
      override fun logging(): Any? = unwrap(this).getLogging()

      /**
       * The service discovery information for the virtual node.
       *
       * If your virtual node does not expect ingress traffic, you can omit this parameter. If you
       * specify a `listener` , then you must specify service discovery information.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-virtualnode-virtualnodespec.html#cfn-appmesh-virtualnode-virtualnodespec-servicediscovery)
       */
      override fun serviceDiscovery(): Any? = unwrap(this).getServiceDiscovery()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): VirtualNodeSpecProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.appmesh.CfnVirtualNode.VirtualNodeSpecProperty):
          VirtualNodeSpecProperty = CdkObjectWrappers.wrap(cdkObject) as? VirtualNodeSpecProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: VirtualNodeSpecProperty):
          software.amazon.awscdk.services.appmesh.CfnVirtualNode.VirtualNodeSpecProperty = (wrapped
          as CdkObject).cdkObject as
          software.amazon.awscdk.services.appmesh.CfnVirtualNode.VirtualNodeSpecProperty
    }
  }

  /**
   * An object that represents a type of connection pool.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.appmesh.*;
   * VirtualNodeTcpConnectionPoolProperty virtualNodeTcpConnectionPoolProperty =
   * VirtualNodeTcpConnectionPoolProperty.builder()
   * .maxConnections(123)
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-virtualnode-virtualnodetcpconnectionpool.html)
   */
  public interface VirtualNodeTcpConnectionPoolProperty {
    /**
     * Maximum number of outbound TCP connections Envoy can establish concurrently with all hosts in
     * upstream cluster.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-virtualnode-virtualnodetcpconnectionpool.html#cfn-appmesh-virtualnode-virtualnodetcpconnectionpool-maxconnections)
     */
    public fun maxConnections(): Number

    /**
     * A builder for [VirtualNodeTcpConnectionPoolProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param maxConnections Maximum number of outbound TCP connections Envoy can establish
       * concurrently with all hosts in upstream cluster. 
       */
      public fun maxConnections(maxConnections: Number)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.appmesh.CfnVirtualNode.VirtualNodeTcpConnectionPoolProperty.Builder
          =
          software.amazon.awscdk.services.appmesh.CfnVirtualNode.VirtualNodeTcpConnectionPoolProperty.builder()

      /**
       * @param maxConnections Maximum number of outbound TCP connections Envoy can establish
       * concurrently with all hosts in upstream cluster. 
       */
      override fun maxConnections(maxConnections: Number) {
        cdkBuilder.maxConnections(maxConnections)
      }

      public fun build():
          software.amazon.awscdk.services.appmesh.CfnVirtualNode.VirtualNodeTcpConnectionPoolProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.appmesh.CfnVirtualNode.VirtualNodeTcpConnectionPoolProperty,
    ) : CdkObject(cdkObject), VirtualNodeTcpConnectionPoolProperty {
      /**
       * Maximum number of outbound TCP connections Envoy can establish concurrently with all hosts
       * in upstream cluster.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-virtualnode-virtualnodetcpconnectionpool.html#cfn-appmesh-virtualnode-virtualnodetcpconnectionpool-maxconnections)
       */
      override fun maxConnections(): Number = unwrap(this).getMaxConnections()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          VirtualNodeTcpConnectionPoolProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.appmesh.CfnVirtualNode.VirtualNodeTcpConnectionPoolProperty):
          VirtualNodeTcpConnectionPoolProperty = CdkObjectWrappers.wrap(cdkObject) as?
          VirtualNodeTcpConnectionPoolProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: VirtualNodeTcpConnectionPoolProperty):
          software.amazon.awscdk.services.appmesh.CfnVirtualNode.VirtualNodeTcpConnectionPoolProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.appmesh.CfnVirtualNode.VirtualNodeTcpConnectionPoolProperty
    }
  }

  /**
   * An object that represents a virtual service backend for a virtual node.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.appmesh.*;
   * VirtualServiceBackendProperty virtualServiceBackendProperty =
   * VirtualServiceBackendProperty.builder()
   * .virtualServiceName("virtualServiceName")
   * // the properties below are optional
   * .clientPolicy(ClientPolicyProperty.builder()
   * .tls(ClientPolicyTlsProperty.builder()
   * .validation(TlsValidationContextProperty.builder()
   * .trust(TlsValidationContextTrustProperty.builder()
   * .acm(TlsValidationContextAcmTrustProperty.builder()
   * .certificateAuthorityArns(List.of("certificateAuthorityArns"))
   * .build())
   * .file(TlsValidationContextFileTrustProperty.builder()
   * .certificateChain("certificateChain")
   * .build())
   * .sds(TlsValidationContextSdsTrustProperty.builder()
   * .secretName("secretName")
   * .build())
   * .build())
   * // the properties below are optional
   * .subjectAlternativeNames(SubjectAlternativeNamesProperty.builder()
   * .match(SubjectAlternativeNameMatchersProperty.builder()
   * .exact(List.of("exact"))
   * .build())
   * .build())
   * .build())
   * // the properties below are optional
   * .certificate(ClientTlsCertificateProperty.builder()
   * .file(ListenerTlsFileCertificateProperty.builder()
   * .certificateChain("certificateChain")
   * .privateKey("privateKey")
   * .build())
   * .sds(ListenerTlsSdsCertificateProperty.builder()
   * .secretName("secretName")
   * .build())
   * .build())
   * .enforce(false)
   * .ports(List.of(123))
   * .build())
   * .build())
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-virtualnode-virtualservicebackend.html)
   */
  public interface VirtualServiceBackendProperty {
    /**
     * A reference to an object that represents the client policy for a backend.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-virtualnode-virtualservicebackend.html#cfn-appmesh-virtualnode-virtualservicebackend-clientpolicy)
     */
    public fun clientPolicy(): Any? = unwrap(this).getClientPolicy()

    /**
     * The name of the virtual service that is acting as a virtual node backend.
     *
     *
     * App Mesh doesn't validate the existence of those virtual services specified in backends. This
     * is to prevent a cyclic dependency between virtual nodes and virtual services creation. Make sure
     * the virtual service name is correct. The virtual service can be created afterwards if it doesn't
     * already exist.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-virtualnode-virtualservicebackend.html#cfn-appmesh-virtualnode-virtualservicebackend-virtualservicename)
     */
    public fun virtualServiceName(): String

    /**
     * A builder for [VirtualServiceBackendProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param clientPolicy A reference to an object that represents the client policy for a
       * backend.
       */
      public fun clientPolicy(clientPolicy: IResolvable)

      /**
       * @param clientPolicy A reference to an object that represents the client policy for a
       * backend.
       */
      public fun clientPolicy(clientPolicy: ClientPolicyProperty)

      /**
       * @param clientPolicy A reference to an object that represents the client policy for a
       * backend.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("022f978780cab0ef15845ab544ecf5221e76f3617033f5630cf66211959b3666")
      public fun clientPolicy(clientPolicy: ClientPolicyProperty.Builder.() -> Unit)

      /**
       * @param virtualServiceName The name of the virtual service that is acting as a virtual node
       * backend. 
       *
       * App Mesh doesn't validate the existence of those virtual services specified in backends.
       * This is to prevent a cyclic dependency between virtual nodes and virtual services creation.
       * Make sure the virtual service name is correct. The virtual service can be created afterwards
       * if it doesn't already exist.
       */
      public fun virtualServiceName(virtualServiceName: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.appmesh.CfnVirtualNode.VirtualServiceBackendProperty.Builder
          =
          software.amazon.awscdk.services.appmesh.CfnVirtualNode.VirtualServiceBackendProperty.builder()

      /**
       * @param clientPolicy A reference to an object that represents the client policy for a
       * backend.
       */
      override fun clientPolicy(clientPolicy: IResolvable) {
        cdkBuilder.clientPolicy(clientPolicy.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param clientPolicy A reference to an object that represents the client policy for a
       * backend.
       */
      override fun clientPolicy(clientPolicy: ClientPolicyProperty) {
        cdkBuilder.clientPolicy(clientPolicy.let(ClientPolicyProperty.Companion::unwrap))
      }

      /**
       * @param clientPolicy A reference to an object that represents the client policy for a
       * backend.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("022f978780cab0ef15845ab544ecf5221e76f3617033f5630cf66211959b3666")
      override fun clientPolicy(clientPolicy: ClientPolicyProperty.Builder.() -> Unit): Unit =
          clientPolicy(ClientPolicyProperty(clientPolicy))

      /**
       * @param virtualServiceName The name of the virtual service that is acting as a virtual node
       * backend. 
       *
       * App Mesh doesn't validate the existence of those virtual services specified in backends.
       * This is to prevent a cyclic dependency between virtual nodes and virtual services creation.
       * Make sure the virtual service name is correct. The virtual service can be created afterwards
       * if it doesn't already exist.
       */
      override fun virtualServiceName(virtualServiceName: String) {
        cdkBuilder.virtualServiceName(virtualServiceName)
      }

      public fun build():
          software.amazon.awscdk.services.appmesh.CfnVirtualNode.VirtualServiceBackendProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.appmesh.CfnVirtualNode.VirtualServiceBackendProperty,
    ) : CdkObject(cdkObject), VirtualServiceBackendProperty {
      /**
       * A reference to an object that represents the client policy for a backend.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-virtualnode-virtualservicebackend.html#cfn-appmesh-virtualnode-virtualservicebackend-clientpolicy)
       */
      override fun clientPolicy(): Any? = unwrap(this).getClientPolicy()

      /**
       * The name of the virtual service that is acting as a virtual node backend.
       *
       *
       * App Mesh doesn't validate the existence of those virtual services specified in backends.
       * This is to prevent a cyclic dependency between virtual nodes and virtual services creation.
       * Make sure the virtual service name is correct. The virtual service can be created afterwards
       * if it doesn't already exist.
       *
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-virtualnode-virtualservicebackend.html#cfn-appmesh-virtualnode-virtualservicebackend-virtualservicename)
       */
      override fun virtualServiceName(): String = unwrap(this).getVirtualServiceName()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): VirtualServiceBackendProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.appmesh.CfnVirtualNode.VirtualServiceBackendProperty):
          VirtualServiceBackendProperty = CdkObjectWrappers.wrap(cdkObject) as?
          VirtualServiceBackendProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: VirtualServiceBackendProperty):
          software.amazon.awscdk.services.appmesh.CfnVirtualNode.VirtualServiceBackendProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.appmesh.CfnVirtualNode.VirtualServiceBackendProperty
    }
  }
}
