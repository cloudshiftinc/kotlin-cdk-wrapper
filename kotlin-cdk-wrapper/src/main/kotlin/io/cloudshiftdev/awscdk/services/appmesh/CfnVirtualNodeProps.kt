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
 * Properties for defining a `CfnVirtualNode`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.appmesh.*;
 * CfnVirtualNodeProps cfnVirtualNodeProps = CfnVirtualNodeProps.builder()
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
public interface CfnVirtualNodeProps {
  /**
   * The name of the service mesh to create the virtual node in.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appmesh-virtualnode.html#cfn-appmesh-virtualnode-meshname)
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
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appmesh-virtualnode.html#cfn-appmesh-virtualnode-meshowner)
   */
  public fun meshOwner(): String? = unwrap(this).getMeshOwner()

  /**
   * The virtual node specification to apply.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appmesh-virtualnode.html#cfn-appmesh-virtualnode-spec)
   */
  public fun spec(): Any

  /**
   * Optional metadata that you can apply to the virtual node to assist with categorization and
   * organization.
   *
   * Each tag consists of a key and an optional value, both of which you define. Tag keys can have a
   * maximum character length of 128 characters, and tag values can have a maximum length of 256
   * characters.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appmesh-virtualnode.html#cfn-appmesh-virtualnode-tags)
   */
  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * The name to use for the virtual node.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appmesh-virtualnode.html#cfn-appmesh-virtualnode-virtualnodename)
   */
  public fun virtualNodeName(): String? = unwrap(this).getVirtualNodeName()

  /**
   * A builder for [CfnVirtualNodeProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param meshName The name of the service mesh to create the virtual node in. 
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
     * @param spec The virtual node specification to apply. 
     */
    public fun spec(spec: IResolvable)

    /**
     * @param spec The virtual node specification to apply. 
     */
    public fun spec(spec: CfnVirtualNode.VirtualNodeSpecProperty)

    /**
     * @param spec The virtual node specification to apply. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("501c52cfcaebe3dbaea190f62334124725f535e05c621bfa3286df9e364a4cc1")
    public fun spec(spec: CfnVirtualNode.VirtualNodeSpecProperty.Builder.() -> Unit)

    /**
     * @param tags Optional metadata that you can apply to the virtual node to assist with
     * categorization and organization.
     * Each tag consists of a key and an optional value, both of which you define. Tag keys can have
     * a maximum character length of 128 characters, and tag values can have a maximum length of 256
     * characters.
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * @param tags Optional metadata that you can apply to the virtual node to assist with
     * categorization and organization.
     * Each tag consists of a key and an optional value, both of which you define. Tag keys can have
     * a maximum character length of 128 characters, and tag values can have a maximum length of 256
     * characters.
     */
    public fun tags(vararg tags: CfnTag)

    /**
     * @param virtualNodeName The name to use for the virtual node.
     */
    public fun virtualNodeName(virtualNodeName: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.appmesh.CfnVirtualNodeProps.Builder =
        software.amazon.awscdk.services.appmesh.CfnVirtualNodeProps.builder()

    /**
     * @param meshName The name of the service mesh to create the virtual node in. 
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
     * @param spec The virtual node specification to apply. 
     */
    override fun spec(spec: IResolvable) {
      cdkBuilder.spec(spec.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param spec The virtual node specification to apply. 
     */
    override fun spec(spec: CfnVirtualNode.VirtualNodeSpecProperty) {
      cdkBuilder.spec(spec.let(CfnVirtualNode.VirtualNodeSpecProperty.Companion::unwrap))
    }

    /**
     * @param spec The virtual node specification to apply. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("501c52cfcaebe3dbaea190f62334124725f535e05c621bfa3286df9e364a4cc1")
    override fun spec(spec: CfnVirtualNode.VirtualNodeSpecProperty.Builder.() -> Unit): Unit =
        spec(CfnVirtualNode.VirtualNodeSpecProperty(spec))

    /**
     * @param tags Optional metadata that you can apply to the virtual node to assist with
     * categorization and organization.
     * Each tag consists of a key and an optional value, both of which you define. Tag keys can have
     * a maximum character length of 128 characters, and tag values can have a maximum length of 256
     * characters.
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag.Companion::unwrap))
    }

    /**
     * @param tags Optional metadata that you can apply to the virtual node to assist with
     * categorization and organization.
     * Each tag consists of a key and an optional value, both of which you define. Tag keys can have
     * a maximum character length of 128 characters, and tag values can have a maximum length of 256
     * characters.
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    /**
     * @param virtualNodeName The name to use for the virtual node.
     */
    override fun virtualNodeName(virtualNodeName: String) {
      cdkBuilder.virtualNodeName(virtualNodeName)
    }

    public fun build(): software.amazon.awscdk.services.appmesh.CfnVirtualNodeProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.appmesh.CfnVirtualNodeProps,
  ) : CdkObject(cdkObject),
      CfnVirtualNodeProps {
    /**
     * The name of the service mesh to create the virtual node in.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appmesh-virtualnode.html#cfn-appmesh-virtualnode-meshname)
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
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appmesh-virtualnode.html#cfn-appmesh-virtualnode-meshowner)
     */
    override fun meshOwner(): String? = unwrap(this).getMeshOwner()

    /**
     * The virtual node specification to apply.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appmesh-virtualnode.html#cfn-appmesh-virtualnode-spec)
     */
    override fun spec(): Any = unwrap(this).getSpec()

    /**
     * Optional metadata that you can apply to the virtual node to assist with categorization and
     * organization.
     *
     * Each tag consists of a key and an optional value, both of which you define. Tag keys can have
     * a maximum character length of 128 characters, and tag values can have a maximum length of 256
     * characters.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appmesh-virtualnode.html#cfn-appmesh-virtualnode-tags)
     */
    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

    /**
     * The name to use for the virtual node.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appmesh-virtualnode.html#cfn-appmesh-virtualnode-virtualnodename)
     */
    override fun virtualNodeName(): String? = unwrap(this).getVirtualNodeName()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnVirtualNodeProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.appmesh.CfnVirtualNodeProps):
        CfnVirtualNodeProps = CdkObjectWrappers.wrap(cdkObject) as? CfnVirtualNodeProps ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnVirtualNodeProps):
        software.amazon.awscdk.services.appmesh.CfnVirtualNodeProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.appmesh.CfnVirtualNodeProps
  }
}
