@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.elasticsearch

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
import kotlin.collections.Map
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * The AWS::Elasticsearch::Domain resource creates an Amazon OpenSearch Service domain.
 *
 *
 * The `AWS::Elasticsearch::Domain` resource is being replaced by the
 * [AWS::OpenSearchService::Domain](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opensearchservice-domain.html)
 * resource. While the legacy Elasticsearch resource and options are still supported, we recommend
 * modifying your existing Cloudformation templates to use the new OpenSearch Service resource, which
 * supports both OpenSearch and legacy Elasticsearch. For instructions to upgrade domains defined
 * within CloudFormation from Elasticsearch to OpenSearch, see
 * [Remarks](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opensearchservice-domain.html#aws-resource-opensearchservice-domain--remarks)
 * .
 *
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.elasticsearch.*;
 * Object accessPolicies;
 * CfnDomain cfnDomain = CfnDomain.Builder.create(this, "MyCfnDomain")
 * .accessPolicies(accessPolicies)
 * .advancedOptions(Map.of(
 * "advancedOptionsKey", "advancedOptions"))
 * .advancedSecurityOptions(AdvancedSecurityOptionsInputProperty.builder()
 * .anonymousAuthEnabled(false)
 * .enabled(false)
 * .internalUserDatabaseEnabled(false)
 * .masterUserOptions(MasterUserOptionsProperty.builder()
 * .masterUserArn("masterUserArn")
 * .masterUserName("masterUserName")
 * .masterUserPassword("masterUserPassword")
 * .build())
 * .build())
 * .cognitoOptions(CognitoOptionsProperty.builder()
 * .enabled(false)
 * .identityPoolId("identityPoolId")
 * .roleArn("roleArn")
 * .userPoolId("userPoolId")
 * .build())
 * .domainArn("domainArn")
 * .domainEndpointOptions(DomainEndpointOptionsProperty.builder()
 * .customEndpoint("customEndpoint")
 * .customEndpointCertificateArn("customEndpointCertificateArn")
 * .customEndpointEnabled(false)
 * .enforceHttps(false)
 * .tlsSecurityPolicy("tlsSecurityPolicy")
 * .build())
 * .domainName("domainName")
 * .ebsOptions(EBSOptionsProperty.builder()
 * .ebsEnabled(false)
 * .iops(123)
 * .volumeSize(123)
 * .volumeType("volumeType")
 * .build())
 * .elasticsearchClusterConfig(ElasticsearchClusterConfigProperty.builder()
 * .coldStorageOptions(ColdStorageOptionsProperty.builder()
 * .enabled(false)
 * .build())
 * .dedicatedMasterCount(123)
 * .dedicatedMasterEnabled(false)
 * .dedicatedMasterType("dedicatedMasterType")
 * .instanceCount(123)
 * .instanceType("instanceType")
 * .warmCount(123)
 * .warmEnabled(false)
 * .warmType("warmType")
 * .zoneAwarenessConfig(ZoneAwarenessConfigProperty.builder()
 * .availabilityZoneCount(123)
 * .build())
 * .zoneAwarenessEnabled(false)
 * .build())
 * .elasticsearchVersion("elasticsearchVersion")
 * .encryptionAtRestOptions(EncryptionAtRestOptionsProperty.builder()
 * .enabled(false)
 * .kmsKeyId("kmsKeyId")
 * .build())
 * .logPublishingOptions(Map.of(
 * "logPublishingOptionsKey", LogPublishingOptionProperty.builder()
 * .cloudWatchLogsLogGroupArn("cloudWatchLogsLogGroupArn")
 * .enabled(false)
 * .build()))
 * .nodeToNodeEncryptionOptions(NodeToNodeEncryptionOptionsProperty.builder()
 * .enabled(false)
 * .build())
 * .snapshotOptions(SnapshotOptionsProperty.builder()
 * .automatedSnapshotStartHour(123)
 * .build())
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .vpcOptions(VPCOptionsProperty.builder()
 * .securityGroupIds(List.of("securityGroupIds"))
 * .subnetIds(List.of("subnetIds"))
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticsearch-domain.html)
 */
public open class CfnDomain(
  cdkObject: software.amazon.awscdk.services.elasticsearch.CfnDomain,
) : CfnResource(cdkObject),
    IInspectable,
    ITaggable {
  public constructor(scope: CloudshiftdevConstructsConstruct, id: String) :
      this(software.amazon.awscdk.services.elasticsearch.CfnDomain(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id)
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnDomainProps,
  ) :
      this(software.amazon.awscdk.services.elasticsearch.CfnDomain(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id, props.let(CfnDomainProps.Companion::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnDomainProps.Builder.() -> Unit,
  ) : this(scope, id, CfnDomainProps(props)
  )

  /**
   * An AWS Identity and Access Management ( IAM ) policy document that specifies who can access the
   * OpenSearch Service domain and their permissions.
   */
  public open fun accessPolicies(): Any? = unwrap(this).getAccessPolicies()

  /**
   * An AWS Identity and Access Management ( IAM ) policy document that specifies who can access the
   * OpenSearch Service domain and their permissions.
   */
  public open fun accessPolicies(`value`: Any) {
    unwrap(this).setAccessPolicies(`value`)
  }

  /**
   * Additional options to specify for the OpenSearch Service domain.
   */
  public open fun advancedOptions(): Any? = unwrap(this).getAdvancedOptions()

  /**
   * Additional options to specify for the OpenSearch Service domain.
   */
  public open fun advancedOptions(`value`: IResolvable) {
    unwrap(this).setAdvancedOptions(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   * Additional options to specify for the OpenSearch Service domain.
   */
  public open fun advancedOptions(`value`: Map<String, String>) {
    unwrap(this).setAdvancedOptions(`value`)
  }

  /**
   * Specifies options for fine-grained access control.
   */
  public open fun advancedSecurityOptions(): Any? = unwrap(this).getAdvancedSecurityOptions()

  /**
   * Specifies options for fine-grained access control.
   */
  public open fun advancedSecurityOptions(`value`: IResolvable) {
    unwrap(this).setAdvancedSecurityOptions(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   * Specifies options for fine-grained access control.
   */
  public open fun advancedSecurityOptions(`value`: AdvancedSecurityOptionsInputProperty) {
    unwrap(this).setAdvancedSecurityOptions(`value`.let(AdvancedSecurityOptionsInputProperty.Companion::unwrap))
  }

  /**
   * Specifies options for fine-grained access control.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("773ccefc549b2fa4e4123cae827637e6f1cffb6bb3ac66c5c9615023a04f7c5a")
  public open
      fun advancedSecurityOptions(`value`: AdvancedSecurityOptionsInputProperty.Builder.() -> Unit):
      Unit = advancedSecurityOptions(AdvancedSecurityOptionsInputProperty(`value`))

  /**
   * The Amazon Resource Name (ARN) of the domain, such as
   * `arn:aws:es:us-west-2:123456789012:domain/mystack-elasti-1ab2cdefghij` .
   *
   * This returned value is the same as the one returned by `AWS::Elasticsearch::Domain.DomainArn` .
   */
  public open fun attrArn(): String = unwrap(this).getAttrArn()

  /**
   * The domain-specific endpoint that's used for requests to the OpenSearch APIs, such as
   * `search-mystack-elasti-1ab2cdefghij-ab1c2deckoyb3hofw7wpqa3cm.us-west-1.es.amazonaws.com` .
   */
  public open fun attrDomainEndpoint(): String = unwrap(this).getAttrDomainEndpoint()

  /**
   *
   */
  public open fun attrId(): String = unwrap(this).getAttrId()

  /**
   * Configures OpenSearch Service to use Amazon Cognito authentication for OpenSearch Dashboards.
   */
  public open fun cognitoOptions(): Any? = unwrap(this).getCognitoOptions()

  /**
   * Configures OpenSearch Service to use Amazon Cognito authentication for OpenSearch Dashboards.
   */
  public open fun cognitoOptions(`value`: IResolvable) {
    unwrap(this).setCognitoOptions(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   * Configures OpenSearch Service to use Amazon Cognito authentication for OpenSearch Dashboards.
   */
  public open fun cognitoOptions(`value`: CognitoOptionsProperty) {
    unwrap(this).setCognitoOptions(`value`.let(CognitoOptionsProperty.Companion::unwrap))
  }

  /**
   * Configures OpenSearch Service to use Amazon Cognito authentication for OpenSearch Dashboards.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("376ff02f0c45af686dcbcb6056dad195037e22f0171f6eddab7b10a5c794371a")
  public open fun cognitoOptions(`value`: CognitoOptionsProperty.Builder.() -> Unit): Unit =
      cognitoOptions(CognitoOptionsProperty(`value`))

  /**
   *
   */
  public open fun domainArn(): String? = unwrap(this).getDomainArn()

  /**
   *
   */
  public open fun domainArn(`value`: String) {
    unwrap(this).setDomainArn(`value`)
  }

  /**
   * Specifies additional options for the domain endpoint, such as whether to require HTTPS for all
   * traffic or whether to use a custom endpoint rather than the default endpoint.
   */
  public open fun domainEndpointOptions(): Any? = unwrap(this).getDomainEndpointOptions()

  /**
   * Specifies additional options for the domain endpoint, such as whether to require HTTPS for all
   * traffic or whether to use a custom endpoint rather than the default endpoint.
   */
  public open fun domainEndpointOptions(`value`: IResolvable) {
    unwrap(this).setDomainEndpointOptions(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   * Specifies additional options for the domain endpoint, such as whether to require HTTPS for all
   * traffic or whether to use a custom endpoint rather than the default endpoint.
   */
  public open fun domainEndpointOptions(`value`: DomainEndpointOptionsProperty) {
    unwrap(this).setDomainEndpointOptions(`value`.let(DomainEndpointOptionsProperty.Companion::unwrap))
  }

  /**
   * Specifies additional options for the domain endpoint, such as whether to require HTTPS for all
   * traffic or whether to use a custom endpoint rather than the default endpoint.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("d009ac74fb400129841db85366ad59b56e1718eb8e3980da47f79396489b3937")
  public open fun domainEndpointOptions(`value`: DomainEndpointOptionsProperty.Builder.() -> Unit):
      Unit = domainEndpointOptions(DomainEndpointOptionsProperty(`value`))

  /**
   * A name for the OpenSearch Service domain.
   */
  public open fun domainName(): String? = unwrap(this).getDomainName()

  /**
   * A name for the OpenSearch Service domain.
   */
  public open fun domainName(`value`: String) {
    unwrap(this).setDomainName(`value`)
  }

  /**
   * The configurations of Amazon Elastic Block Store (Amazon EBS) volumes that are attached to data
   * nodes in the OpenSearch Service domain.
   */
  public open fun ebsOptions(): Any? = unwrap(this).getEbsOptions()

  /**
   * The configurations of Amazon Elastic Block Store (Amazon EBS) volumes that are attached to data
   * nodes in the OpenSearch Service domain.
   */
  public open fun ebsOptions(`value`: IResolvable) {
    unwrap(this).setEbsOptions(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   * The configurations of Amazon Elastic Block Store (Amazon EBS) volumes that are attached to data
   * nodes in the OpenSearch Service domain.
   */
  public open fun ebsOptions(`value`: EBSOptionsProperty) {
    unwrap(this).setEbsOptions(`value`.let(EBSOptionsProperty.Companion::unwrap))
  }

  /**
   * The configurations of Amazon Elastic Block Store (Amazon EBS) volumes that are attached to data
   * nodes in the OpenSearch Service domain.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("6768c00a3029573cc0cb79072789436e8391425507648ddc3c9d02be5261e712")
  public open fun ebsOptions(`value`: EBSOptionsProperty.Builder.() -> Unit): Unit =
      ebsOptions(EBSOptionsProperty(`value`))

  /**
   * ElasticsearchClusterConfig is a property of the AWS::Elasticsearch::Domain resource that
   * configures the cluster of an Amazon OpenSearch Service domain.
   */
  public open fun elasticsearchClusterConfig(): Any? = unwrap(this).getElasticsearchClusterConfig()

  /**
   * ElasticsearchClusterConfig is a property of the AWS::Elasticsearch::Domain resource that
   * configures the cluster of an Amazon OpenSearch Service domain.
   */
  public open fun elasticsearchClusterConfig(`value`: IResolvable) {
    unwrap(this).setElasticsearchClusterConfig(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   * ElasticsearchClusterConfig is a property of the AWS::Elasticsearch::Domain resource that
   * configures the cluster of an Amazon OpenSearch Service domain.
   */
  public open fun elasticsearchClusterConfig(`value`: ElasticsearchClusterConfigProperty) {
    unwrap(this).setElasticsearchClusterConfig(`value`.let(ElasticsearchClusterConfigProperty.Companion::unwrap))
  }

  /**
   * ElasticsearchClusterConfig is a property of the AWS::Elasticsearch::Domain resource that
   * configures the cluster of an Amazon OpenSearch Service domain.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("e7ae7d596e4d54f29d7f6d9ff6714a6dfd7522ffa503bc13c56d2cdf331d6d37")
  public open
      fun elasticsearchClusterConfig(`value`: ElasticsearchClusterConfigProperty.Builder.() -> Unit):
      Unit = elasticsearchClusterConfig(ElasticsearchClusterConfigProperty(`value`))

  /**
   * The version of Elasticsearch to use, such as 2.3. If not specified, 1.5 is used as the default.
   * For information about the versions that OpenSearch Service supports, see [Supported versions of
   * OpenSearch and
   * Elasticsearch](https://docs.aws.amazon.com/opensearch-service/latest/developerguide/what-is.html#choosing-version)
   * in the *Amazon OpenSearch Service Developer Guide* .
   */
  public open fun elasticsearchVersion(): String? = unwrap(this).getElasticsearchVersion()

  /**
   * The version of Elasticsearch to use, such as 2.3. If not specified, 1.5 is used as the default.
   * For information about the versions that OpenSearch Service supports, see [Supported versions of
   * OpenSearch and
   * Elasticsearch](https://docs.aws.amazon.com/opensearch-service/latest/developerguide/what-is.html#choosing-version)
   * in the *Amazon OpenSearch Service Developer Guide* .
   */
  public open fun elasticsearchVersion(`value`: String) {
    unwrap(this).setElasticsearchVersion(`value`)
  }

  /**
   * Whether the domain should encrypt data at rest, and if so, the AWS Key Management Service key
   * to use.
   */
  public open fun encryptionAtRestOptions(): Any? = unwrap(this).getEncryptionAtRestOptions()

  /**
   * Whether the domain should encrypt data at rest, and if so, the AWS Key Management Service key
   * to use.
   */
  public open fun encryptionAtRestOptions(`value`: IResolvable) {
    unwrap(this).setEncryptionAtRestOptions(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   * Whether the domain should encrypt data at rest, and if so, the AWS Key Management Service key
   * to use.
   */
  public open fun encryptionAtRestOptions(`value`: EncryptionAtRestOptionsProperty) {
    unwrap(this).setEncryptionAtRestOptions(`value`.let(EncryptionAtRestOptionsProperty.Companion::unwrap))
  }

  /**
   * Whether the domain should encrypt data at rest, and if so, the AWS Key Management Service key
   * to use.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("bf46e4a8c2c129a1414c35e7de13148b1aef54052da188dc43acc672fd774c9c")
  public open
      fun encryptionAtRestOptions(`value`: EncryptionAtRestOptionsProperty.Builder.() -> Unit): Unit
      = encryptionAtRestOptions(EncryptionAtRestOptionsProperty(`value`))

  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector.Companion::unwrap))
  }

  /**
   * An object with one or more of the following keys: `SEARCH_SLOW_LOGS` , `ES_APPLICATION_LOGS` ,
   * `INDEX_SLOW_LOGS` , `AUDIT_LOGS` , depending on the types of logs you want to publish.
   */
  public open fun logPublishingOptions(): Any? = unwrap(this).getLogPublishingOptions()

  /**
   * An object with one or more of the following keys: `SEARCH_SLOW_LOGS` , `ES_APPLICATION_LOGS` ,
   * `INDEX_SLOW_LOGS` , `AUDIT_LOGS` , depending on the types of logs you want to publish.
   */
  public open fun logPublishingOptions(`value`: IResolvable) {
    unwrap(this).setLogPublishingOptions(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   * An object with one or more of the following keys: `SEARCH_SLOW_LOGS` , `ES_APPLICATION_LOGS` ,
   * `INDEX_SLOW_LOGS` , `AUDIT_LOGS` , depending on the types of logs you want to publish.
   */
  public open fun logPublishingOptions(`value`: Map<String, Any>) {
    unwrap(this).setLogPublishingOptions(`value`.mapValues{CdkObjectWrappers.unwrap(it.value)})
  }

  /**
   * Specifies whether node-to-node encryption is enabled.
   */
  public open fun nodeToNodeEncryptionOptions(): Any? =
      unwrap(this).getNodeToNodeEncryptionOptions()

  /**
   * Specifies whether node-to-node encryption is enabled.
   */
  public open fun nodeToNodeEncryptionOptions(`value`: IResolvable) {
    unwrap(this).setNodeToNodeEncryptionOptions(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   * Specifies whether node-to-node encryption is enabled.
   */
  public open fun nodeToNodeEncryptionOptions(`value`: NodeToNodeEncryptionOptionsProperty) {
    unwrap(this).setNodeToNodeEncryptionOptions(`value`.let(NodeToNodeEncryptionOptionsProperty.Companion::unwrap))
  }

  /**
   * Specifies whether node-to-node encryption is enabled.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("8c9ff30a6a1b7e574775fad68c85f558198153c1046bd4193cc2dadb23755b78")
  public open
      fun nodeToNodeEncryptionOptions(`value`: NodeToNodeEncryptionOptionsProperty.Builder.() -> Unit):
      Unit = nodeToNodeEncryptionOptions(NodeToNodeEncryptionOptionsProperty(`value`))

  /**
   * *DEPRECATED* .
   */
  public open fun snapshotOptions(): Any? = unwrap(this).getSnapshotOptions()

  /**
   * *DEPRECATED* .
   */
  public open fun snapshotOptions(`value`: IResolvable) {
    unwrap(this).setSnapshotOptions(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   * *DEPRECATED* .
   */
  public open fun snapshotOptions(`value`: SnapshotOptionsProperty) {
    unwrap(this).setSnapshotOptions(`value`.let(SnapshotOptionsProperty.Companion::unwrap))
  }

  /**
   * *DEPRECATED* .
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("bc4f150efb3c3973f06d2ca913e6a89d0cd541d421ce5b07116f3743b6965254")
  public open fun snapshotOptions(`value`: SnapshotOptionsProperty.Builder.() -> Unit): Unit =
      snapshotOptions(SnapshotOptionsProperty(`value`))

  /**
   * Tag Manager which manages the tags for this resource.
   */
  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  /**
   * An arbitrary set of tags (key–value pairs) to associate with the OpenSearch Service domain.
   */
  public open fun tagsRaw(): List<CfnTag> = unwrap(this).getTagsRaw()?.map(CfnTag::wrap) ?:
      emptyList()

  /**
   * An arbitrary set of tags (key–value pairs) to associate with the OpenSearch Service domain.
   */
  public open fun tagsRaw(`value`: List<CfnTag>) {
    unwrap(this).setTagsRaw(`value`.map(CfnTag.Companion::unwrap))
  }

  /**
   * An arbitrary set of tags (key–value pairs) to associate with the OpenSearch Service domain.
   */
  public open fun tagsRaw(vararg `value`: CfnTag): Unit = tagsRaw(`value`.toList())

  /**
   * The virtual private cloud (VPC) configuration for the OpenSearch Service domain.
   */
  public open fun vpcOptions(): Any? = unwrap(this).getVpcOptions()

  /**
   * The virtual private cloud (VPC) configuration for the OpenSearch Service domain.
   */
  public open fun vpcOptions(`value`: IResolvable) {
    unwrap(this).setVpcOptions(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   * The virtual private cloud (VPC) configuration for the OpenSearch Service domain.
   */
  public open fun vpcOptions(`value`: VPCOptionsProperty) {
    unwrap(this).setVpcOptions(`value`.let(VPCOptionsProperty.Companion::unwrap))
  }

  /**
   * The virtual private cloud (VPC) configuration for the OpenSearch Service domain.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("ad36f4e76fe63ece9232840e75ac1284de33647ee6fcb250834483f35ed59775")
  public open fun vpcOptions(`value`: VPCOptionsProperty.Builder.() -> Unit): Unit =
      vpcOptions(VPCOptionsProperty(`value`))

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.elasticsearch.CfnDomain].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * An AWS Identity and Access Management ( IAM ) policy document that specifies who can access
     * the OpenSearch Service domain and their permissions.
     *
     * For more information, see [Configuring access
     * policies](https://docs.aws.amazon.com/opensearch-service/latest/developerguide/ac.html#ac-creating)
     * in the *Amazon OpenSearch Service Developer Guid* e.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticsearch-domain.html#cfn-elasticsearch-domain-accesspolicies)
     * @param accessPolicies An AWS Identity and Access Management ( IAM ) policy document that
     * specifies who can access the OpenSearch Service domain and their permissions. 
     */
    public fun accessPolicies(accessPolicies: Any)

    /**
     * Additional options to specify for the OpenSearch Service domain.
     *
     * For more information, see [Advanced cluster
     * parameters](https://docs.aws.amazon.com/opensearch-service/latest/developerguide/createupdatedomains.html#createdomain-configure-advanced-options)
     * in the *Amazon OpenSearch Service Developer Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticsearch-domain.html#cfn-elasticsearch-domain-advancedoptions)
     * @param advancedOptions Additional options to specify for the OpenSearch Service domain. 
     */
    public fun advancedOptions(advancedOptions: IResolvable)

    /**
     * Additional options to specify for the OpenSearch Service domain.
     *
     * For more information, see [Advanced cluster
     * parameters](https://docs.aws.amazon.com/opensearch-service/latest/developerguide/createupdatedomains.html#createdomain-configure-advanced-options)
     * in the *Amazon OpenSearch Service Developer Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticsearch-domain.html#cfn-elasticsearch-domain-advancedoptions)
     * @param advancedOptions Additional options to specify for the OpenSearch Service domain. 
     */
    public fun advancedOptions(advancedOptions: Map<String, String>)

    /**
     * Specifies options for fine-grained access control.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticsearch-domain.html#cfn-elasticsearch-domain-advancedsecurityoptions)
     * @param advancedSecurityOptions Specifies options for fine-grained access control. 
     */
    public fun advancedSecurityOptions(advancedSecurityOptions: IResolvable)

    /**
     * Specifies options for fine-grained access control.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticsearch-domain.html#cfn-elasticsearch-domain-advancedsecurityoptions)
     * @param advancedSecurityOptions Specifies options for fine-grained access control. 
     */
    public
        fun advancedSecurityOptions(advancedSecurityOptions: AdvancedSecurityOptionsInputProperty)

    /**
     * Specifies options for fine-grained access control.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticsearch-domain.html#cfn-elasticsearch-domain-advancedsecurityoptions)
     * @param advancedSecurityOptions Specifies options for fine-grained access control. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("bb504904a7587abeba267c32d0bffd3f6767f0a3c402604120a150b8bd1adb28")
    public
        fun advancedSecurityOptions(advancedSecurityOptions: AdvancedSecurityOptionsInputProperty.Builder.() -> Unit)

    /**
     * Configures OpenSearch Service to use Amazon Cognito authentication for OpenSearch Dashboards.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticsearch-domain.html#cfn-elasticsearch-domain-cognitooptions)
     * @param cognitoOptions Configures OpenSearch Service to use Amazon Cognito authentication for
     * OpenSearch Dashboards. 
     */
    public fun cognitoOptions(cognitoOptions: IResolvable)

    /**
     * Configures OpenSearch Service to use Amazon Cognito authentication for OpenSearch Dashboards.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticsearch-domain.html#cfn-elasticsearch-domain-cognitooptions)
     * @param cognitoOptions Configures OpenSearch Service to use Amazon Cognito authentication for
     * OpenSearch Dashboards. 
     */
    public fun cognitoOptions(cognitoOptions: CognitoOptionsProperty)

    /**
     * Configures OpenSearch Service to use Amazon Cognito authentication for OpenSearch Dashboards.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticsearch-domain.html#cfn-elasticsearch-domain-cognitooptions)
     * @param cognitoOptions Configures OpenSearch Service to use Amazon Cognito authentication for
     * OpenSearch Dashboards. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("02c04adaa73bbc4d4e9f4d7c0384f51585afcb7fc3101bc0b2d83833feab8b32")
    public fun cognitoOptions(cognitoOptions: CognitoOptionsProperty.Builder.() -> Unit)

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticsearch-domain.html#cfn-elasticsearch-domain-domainarn)
     * @param domainArn 
     */
    public fun domainArn(domainArn: String)

    /**
     * Specifies additional options for the domain endpoint, such as whether to require HTTPS for
     * all traffic or whether to use a custom endpoint rather than the default endpoint.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticsearch-domain.html#cfn-elasticsearch-domain-domainendpointoptions)
     * @param domainEndpointOptions Specifies additional options for the domain endpoint, such as
     * whether to require HTTPS for all traffic or whether to use a custom endpoint rather than the
     * default endpoint. 
     */
    public fun domainEndpointOptions(domainEndpointOptions: IResolvable)

    /**
     * Specifies additional options for the domain endpoint, such as whether to require HTTPS for
     * all traffic or whether to use a custom endpoint rather than the default endpoint.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticsearch-domain.html#cfn-elasticsearch-domain-domainendpointoptions)
     * @param domainEndpointOptions Specifies additional options for the domain endpoint, such as
     * whether to require HTTPS for all traffic or whether to use a custom endpoint rather than the
     * default endpoint. 
     */
    public fun domainEndpointOptions(domainEndpointOptions: DomainEndpointOptionsProperty)

    /**
     * Specifies additional options for the domain endpoint, such as whether to require HTTPS for
     * all traffic or whether to use a custom endpoint rather than the default endpoint.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticsearch-domain.html#cfn-elasticsearch-domain-domainendpointoptions)
     * @param domainEndpointOptions Specifies additional options for the domain endpoint, such as
     * whether to require HTTPS for all traffic or whether to use a custom endpoint rather than the
     * default endpoint. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("4869c5dee7f082e87fa965a3be680763f6fd8c50c0efb261db8a3eb68e28921d")
    public
        fun domainEndpointOptions(domainEndpointOptions: DomainEndpointOptionsProperty.Builder.() -> Unit)

    /**
     * A name for the OpenSearch Service domain.
     *
     * For valid values, see the
     * [DomainName](https://docs.aws.amazon.com/opensearch-service/latest/developerguide/configuration-api.html#configuration-api-datatypes-domainname)
     * data type in the *Amazon OpenSearch Service Developer Guide* . If you don't specify a name, AWS
     * CloudFormation generates a unique physical ID and uses that ID for the domain name. For more
     * information, see [Name
     * Type](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-name.html) .
     *
     *
     * If you specify a name, you cannot perform updates that require replacement of this resource.
     * You can perform updates that require no or some interruption. If you must replace the resource,
     * specify a new name.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticsearch-domain.html#cfn-elasticsearch-domain-domainname)
     * @param domainName A name for the OpenSearch Service domain. 
     */
    public fun domainName(domainName: String)

    /**
     * The configurations of Amazon Elastic Block Store (Amazon EBS) volumes that are attached to
     * data nodes in the OpenSearch Service domain.
     *
     * For more information, see [EBS volume size
     * limits](https://docs.aws.amazon.com/opensearch-service/latest/developerguide/limits.html#ebsresource)
     * in the *Amazon OpenSearch Service Developer Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticsearch-domain.html#cfn-elasticsearch-domain-ebsoptions)
     * @param ebsOptions The configurations of Amazon Elastic Block Store (Amazon EBS) volumes that
     * are attached to data nodes in the OpenSearch Service domain. 
     */
    public fun ebsOptions(ebsOptions: IResolvable)

    /**
     * The configurations of Amazon Elastic Block Store (Amazon EBS) volumes that are attached to
     * data nodes in the OpenSearch Service domain.
     *
     * For more information, see [EBS volume size
     * limits](https://docs.aws.amazon.com/opensearch-service/latest/developerguide/limits.html#ebsresource)
     * in the *Amazon OpenSearch Service Developer Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticsearch-domain.html#cfn-elasticsearch-domain-ebsoptions)
     * @param ebsOptions The configurations of Amazon Elastic Block Store (Amazon EBS) volumes that
     * are attached to data nodes in the OpenSearch Service domain. 
     */
    public fun ebsOptions(ebsOptions: EBSOptionsProperty)

    /**
     * The configurations of Amazon Elastic Block Store (Amazon EBS) volumes that are attached to
     * data nodes in the OpenSearch Service domain.
     *
     * For more information, see [EBS volume size
     * limits](https://docs.aws.amazon.com/opensearch-service/latest/developerguide/limits.html#ebsresource)
     * in the *Amazon OpenSearch Service Developer Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticsearch-domain.html#cfn-elasticsearch-domain-ebsoptions)
     * @param ebsOptions The configurations of Amazon Elastic Block Store (Amazon EBS) volumes that
     * are attached to data nodes in the OpenSearch Service domain. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("c4e85df7c6b7a9001fa4bfc258e7863399aef3b1826404e2af4c7a38e646fe8a")
    public fun ebsOptions(ebsOptions: EBSOptionsProperty.Builder.() -> Unit)

    /**
     * ElasticsearchClusterConfig is a property of the AWS::Elasticsearch::Domain resource that
     * configures the cluster of an Amazon OpenSearch Service domain.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticsearch-domain.html#cfn-elasticsearch-domain-elasticsearchclusterconfig)
     * @param elasticsearchClusterConfig ElasticsearchClusterConfig is a property of the
     * AWS::Elasticsearch::Domain resource that configures the cluster of an Amazon OpenSearch Service
     * domain. 
     */
    public fun elasticsearchClusterConfig(elasticsearchClusterConfig: IResolvable)

    /**
     * ElasticsearchClusterConfig is a property of the AWS::Elasticsearch::Domain resource that
     * configures the cluster of an Amazon OpenSearch Service domain.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticsearch-domain.html#cfn-elasticsearch-domain-elasticsearchclusterconfig)
     * @param elasticsearchClusterConfig ElasticsearchClusterConfig is a property of the
     * AWS::Elasticsearch::Domain resource that configures the cluster of an Amazon OpenSearch Service
     * domain. 
     */
    public
        fun elasticsearchClusterConfig(elasticsearchClusterConfig: ElasticsearchClusterConfigProperty)

    /**
     * ElasticsearchClusterConfig is a property of the AWS::Elasticsearch::Domain resource that
     * configures the cluster of an Amazon OpenSearch Service domain.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticsearch-domain.html#cfn-elasticsearch-domain-elasticsearchclusterconfig)
     * @param elasticsearchClusterConfig ElasticsearchClusterConfig is a property of the
     * AWS::Elasticsearch::Domain resource that configures the cluster of an Amazon OpenSearch Service
     * domain. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("c39776ab909b055508fc1cee38bbcd6132a0d10196754b515ba262a40567e39c")
    public
        fun elasticsearchClusterConfig(elasticsearchClusterConfig: ElasticsearchClusterConfigProperty.Builder.() -> Unit)

    /**
     * The version of Elasticsearch to use, such as 2.3. If not specified, 1.5 is used as the
     * default. For information about the versions that OpenSearch Service supports, see [Supported
     * versions of OpenSearch and
     * Elasticsearch](https://docs.aws.amazon.com/opensearch-service/latest/developerguide/what-is.html#choosing-version)
     * in the *Amazon OpenSearch Service Developer Guide* .
     *
     * If you set the
     * [EnableVersionUpgrade](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-attribute-updatepolicy.html#cfn-attributes-updatepolicy-upgradeopensearchdomain)
     * update policy to `true` , you can update `ElasticsearchVersion` without interruption. When
     * `EnableVersionUpgrade` is set to `false` , or is not specified, updating `ElasticsearchVersion`
     * results in
     * [replacement](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/using-cfn-updating-stacks-update-behaviors.html#update-replacement)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticsearch-domain.html#cfn-elasticsearch-domain-elasticsearchversion)
     * @param elasticsearchVersion The version of Elasticsearch to use, such as 2.3. If not
     * specified, 1.5 is used as the default. For information about the versions that OpenSearch
     * Service supports, see [Supported versions of OpenSearch and
     * Elasticsearch](https://docs.aws.amazon.com/opensearch-service/latest/developerguide/what-is.html#choosing-version)
     * in the *Amazon OpenSearch Service Developer Guide* . 
     */
    public fun elasticsearchVersion(elasticsearchVersion: String)

    /**
     * Whether the domain should encrypt data at rest, and if so, the AWS Key Management Service key
     * to use.
     *
     * See [Encryption of data at rest for Amazon OpenSearch
     * Service](https://docs.aws.amazon.com/opensearch-service/latest/developerguide/encryption-at-rest.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticsearch-domain.html#cfn-elasticsearch-domain-encryptionatrestoptions)
     * @param encryptionAtRestOptions Whether the domain should encrypt data at rest, and if so, the
     * AWS Key Management Service key to use. 
     */
    public fun encryptionAtRestOptions(encryptionAtRestOptions: IResolvable)

    /**
     * Whether the domain should encrypt data at rest, and if so, the AWS Key Management Service key
     * to use.
     *
     * See [Encryption of data at rest for Amazon OpenSearch
     * Service](https://docs.aws.amazon.com/opensearch-service/latest/developerguide/encryption-at-rest.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticsearch-domain.html#cfn-elasticsearch-domain-encryptionatrestoptions)
     * @param encryptionAtRestOptions Whether the domain should encrypt data at rest, and if so, the
     * AWS Key Management Service key to use. 
     */
    public fun encryptionAtRestOptions(encryptionAtRestOptions: EncryptionAtRestOptionsProperty)

    /**
     * Whether the domain should encrypt data at rest, and if so, the AWS Key Management Service key
     * to use.
     *
     * See [Encryption of data at rest for Amazon OpenSearch
     * Service](https://docs.aws.amazon.com/opensearch-service/latest/developerguide/encryption-at-rest.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticsearch-domain.html#cfn-elasticsearch-domain-encryptionatrestoptions)
     * @param encryptionAtRestOptions Whether the domain should encrypt data at rest, and if so, the
     * AWS Key Management Service key to use. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("8320db660a34415aa9d094cca4924d36f11e55e2b203728911494f3cd29df022")
    public
        fun encryptionAtRestOptions(encryptionAtRestOptions: EncryptionAtRestOptionsProperty.Builder.() -> Unit)

    /**
     * An object with one or more of the following keys: `SEARCH_SLOW_LOGS` , `ES_APPLICATION_LOGS`
     * , `INDEX_SLOW_LOGS` , `AUDIT_LOGS` , depending on the types of logs you want to publish.
     *
     * Each key needs a valid `LogPublishingOption` value.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticsearch-domain.html#cfn-elasticsearch-domain-logpublishingoptions)
     * @param logPublishingOptions An object with one or more of the following keys:
     * `SEARCH_SLOW_LOGS` , `ES_APPLICATION_LOGS` , `INDEX_SLOW_LOGS` , `AUDIT_LOGS` , depending on the
     * types of logs you want to publish. 
     */
    public fun logPublishingOptions(logPublishingOptions: IResolvable)

    /**
     * An object with one or more of the following keys: `SEARCH_SLOW_LOGS` , `ES_APPLICATION_LOGS`
     * , `INDEX_SLOW_LOGS` , `AUDIT_LOGS` , depending on the types of logs you want to publish.
     *
     * Each key needs a valid `LogPublishingOption` value.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticsearch-domain.html#cfn-elasticsearch-domain-logpublishingoptions)
     * @param logPublishingOptions An object with one or more of the following keys:
     * `SEARCH_SLOW_LOGS` , `ES_APPLICATION_LOGS` , `INDEX_SLOW_LOGS` , `AUDIT_LOGS` , depending on the
     * types of logs you want to publish. 
     */
    public fun logPublishingOptions(logPublishingOptions: Map<String, Any>)

    /**
     * Specifies whether node-to-node encryption is enabled.
     *
     * See [Node-to-node encryption for Amazon OpenSearch
     * Service](https://docs.aws.amazon.com/opensearch-service/latest/developerguide/ntn.html) .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticsearch-domain.html#cfn-elasticsearch-domain-nodetonodeencryptionoptions)
     * @param nodeToNodeEncryptionOptions Specifies whether node-to-node encryption is enabled. 
     */
    public fun nodeToNodeEncryptionOptions(nodeToNodeEncryptionOptions: IResolvable)

    /**
     * Specifies whether node-to-node encryption is enabled.
     *
     * See [Node-to-node encryption for Amazon OpenSearch
     * Service](https://docs.aws.amazon.com/opensearch-service/latest/developerguide/ntn.html) .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticsearch-domain.html#cfn-elasticsearch-domain-nodetonodeencryptionoptions)
     * @param nodeToNodeEncryptionOptions Specifies whether node-to-node encryption is enabled. 
     */
    public
        fun nodeToNodeEncryptionOptions(nodeToNodeEncryptionOptions: NodeToNodeEncryptionOptionsProperty)

    /**
     * Specifies whether node-to-node encryption is enabled.
     *
     * See [Node-to-node encryption for Amazon OpenSearch
     * Service](https://docs.aws.amazon.com/opensearch-service/latest/developerguide/ntn.html) .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticsearch-domain.html#cfn-elasticsearch-domain-nodetonodeencryptionoptions)
     * @param nodeToNodeEncryptionOptions Specifies whether node-to-node encryption is enabled. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("0b014ca6637b558a99492fd728be1f18159f43019e21def598d9569ea16e2fd3")
    public
        fun nodeToNodeEncryptionOptions(nodeToNodeEncryptionOptions: NodeToNodeEncryptionOptionsProperty.Builder.() -> Unit)

    /**
     * *DEPRECATED* .
     *
     * The automated snapshot configuration for the OpenSearch Service domain indices.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticsearch-domain.html#cfn-elasticsearch-domain-snapshotoptions)
     * @param snapshotOptions *DEPRECATED* . 
     */
    public fun snapshotOptions(snapshotOptions: IResolvable)

    /**
     * *DEPRECATED* .
     *
     * The automated snapshot configuration for the OpenSearch Service domain indices.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticsearch-domain.html#cfn-elasticsearch-domain-snapshotoptions)
     * @param snapshotOptions *DEPRECATED* . 
     */
    public fun snapshotOptions(snapshotOptions: SnapshotOptionsProperty)

    /**
     * *DEPRECATED* .
     *
     * The automated snapshot configuration for the OpenSearch Service domain indices.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticsearch-domain.html#cfn-elasticsearch-domain-snapshotoptions)
     * @param snapshotOptions *DEPRECATED* . 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("46747f5623a38821047b996ba4524c1c648e164a66637321babaa37d159b2460")
    public fun snapshotOptions(snapshotOptions: SnapshotOptionsProperty.Builder.() -> Unit)

    /**
     * An arbitrary set of tags (key–value pairs) to associate with the OpenSearch Service domain.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticsearch-domain.html#cfn-elasticsearch-domain-tags)
     * @param tags An arbitrary set of tags (key–value pairs) to associate with the OpenSearch
     * Service domain. 
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * An arbitrary set of tags (key–value pairs) to associate with the OpenSearch Service domain.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticsearch-domain.html#cfn-elasticsearch-domain-tags)
     * @param tags An arbitrary set of tags (key–value pairs) to associate with the OpenSearch
     * Service domain. 
     */
    public fun tags(vararg tags: CfnTag)

    /**
     * The virtual private cloud (VPC) configuration for the OpenSearch Service domain.
     *
     * For more information, see [Launching your Amazon OpenSearch Service domains within a
     * VPC](https://docs.aws.amazon.com/opensearch-service/latest/developerguide/vpc.html) in the
     * *Amazon OpenSearch Service Developer Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticsearch-domain.html#cfn-elasticsearch-domain-vpcoptions)
     * @param vpcOptions The virtual private cloud (VPC) configuration for the OpenSearch Service
     * domain. 
     */
    public fun vpcOptions(vpcOptions: IResolvable)

    /**
     * The virtual private cloud (VPC) configuration for the OpenSearch Service domain.
     *
     * For more information, see [Launching your Amazon OpenSearch Service domains within a
     * VPC](https://docs.aws.amazon.com/opensearch-service/latest/developerguide/vpc.html) in the
     * *Amazon OpenSearch Service Developer Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticsearch-domain.html#cfn-elasticsearch-domain-vpcoptions)
     * @param vpcOptions The virtual private cloud (VPC) configuration for the OpenSearch Service
     * domain. 
     */
    public fun vpcOptions(vpcOptions: VPCOptionsProperty)

    /**
     * The virtual private cloud (VPC) configuration for the OpenSearch Service domain.
     *
     * For more information, see [Launching your Amazon OpenSearch Service domains within a
     * VPC](https://docs.aws.amazon.com/opensearch-service/latest/developerguide/vpc.html) in the
     * *Amazon OpenSearch Service Developer Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticsearch-domain.html#cfn-elasticsearch-domain-vpcoptions)
     * @param vpcOptions The virtual private cloud (VPC) configuration for the OpenSearch Service
     * domain. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("656bc9229ee8294ec5c29f3bda4752a4b03621f0a008d7e5c593522f46ea35e3")
    public fun vpcOptions(vpcOptions: VPCOptionsProperty.Builder.() -> Unit)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.elasticsearch.CfnDomain.Builder =
        software.amazon.awscdk.services.elasticsearch.CfnDomain.Builder.create(scope, id)

    /**
     * An AWS Identity and Access Management ( IAM ) policy document that specifies who can access
     * the OpenSearch Service domain and their permissions.
     *
     * For more information, see [Configuring access
     * policies](https://docs.aws.amazon.com/opensearch-service/latest/developerguide/ac.html#ac-creating)
     * in the *Amazon OpenSearch Service Developer Guid* e.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticsearch-domain.html#cfn-elasticsearch-domain-accesspolicies)
     * @param accessPolicies An AWS Identity and Access Management ( IAM ) policy document that
     * specifies who can access the OpenSearch Service domain and their permissions. 
     */
    override fun accessPolicies(accessPolicies: Any) {
      cdkBuilder.accessPolicies(accessPolicies)
    }

    /**
     * Additional options to specify for the OpenSearch Service domain.
     *
     * For more information, see [Advanced cluster
     * parameters](https://docs.aws.amazon.com/opensearch-service/latest/developerguide/createupdatedomains.html#createdomain-configure-advanced-options)
     * in the *Amazon OpenSearch Service Developer Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticsearch-domain.html#cfn-elasticsearch-domain-advancedoptions)
     * @param advancedOptions Additional options to specify for the OpenSearch Service domain. 
     */
    override fun advancedOptions(advancedOptions: IResolvable) {
      cdkBuilder.advancedOptions(advancedOptions.let(IResolvable.Companion::unwrap))
    }

    /**
     * Additional options to specify for the OpenSearch Service domain.
     *
     * For more information, see [Advanced cluster
     * parameters](https://docs.aws.amazon.com/opensearch-service/latest/developerguide/createupdatedomains.html#createdomain-configure-advanced-options)
     * in the *Amazon OpenSearch Service Developer Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticsearch-domain.html#cfn-elasticsearch-domain-advancedoptions)
     * @param advancedOptions Additional options to specify for the OpenSearch Service domain. 
     */
    override fun advancedOptions(advancedOptions: Map<String, String>) {
      cdkBuilder.advancedOptions(advancedOptions)
    }

    /**
     * Specifies options for fine-grained access control.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticsearch-domain.html#cfn-elasticsearch-domain-advancedsecurityoptions)
     * @param advancedSecurityOptions Specifies options for fine-grained access control. 
     */
    override fun advancedSecurityOptions(advancedSecurityOptions: IResolvable) {
      cdkBuilder.advancedSecurityOptions(advancedSecurityOptions.let(IResolvable.Companion::unwrap))
    }

    /**
     * Specifies options for fine-grained access control.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticsearch-domain.html#cfn-elasticsearch-domain-advancedsecurityoptions)
     * @param advancedSecurityOptions Specifies options for fine-grained access control. 
     */
    override
        fun advancedSecurityOptions(advancedSecurityOptions: AdvancedSecurityOptionsInputProperty) {
      cdkBuilder.advancedSecurityOptions(advancedSecurityOptions.let(AdvancedSecurityOptionsInputProperty.Companion::unwrap))
    }

    /**
     * Specifies options for fine-grained access control.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticsearch-domain.html#cfn-elasticsearch-domain-advancedsecurityoptions)
     * @param advancedSecurityOptions Specifies options for fine-grained access control. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("bb504904a7587abeba267c32d0bffd3f6767f0a3c402604120a150b8bd1adb28")
    override
        fun advancedSecurityOptions(advancedSecurityOptions: AdvancedSecurityOptionsInputProperty.Builder.() -> Unit):
        Unit =
        advancedSecurityOptions(AdvancedSecurityOptionsInputProperty(advancedSecurityOptions))

    /**
     * Configures OpenSearch Service to use Amazon Cognito authentication for OpenSearch Dashboards.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticsearch-domain.html#cfn-elasticsearch-domain-cognitooptions)
     * @param cognitoOptions Configures OpenSearch Service to use Amazon Cognito authentication for
     * OpenSearch Dashboards. 
     */
    override fun cognitoOptions(cognitoOptions: IResolvable) {
      cdkBuilder.cognitoOptions(cognitoOptions.let(IResolvable.Companion::unwrap))
    }

    /**
     * Configures OpenSearch Service to use Amazon Cognito authentication for OpenSearch Dashboards.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticsearch-domain.html#cfn-elasticsearch-domain-cognitooptions)
     * @param cognitoOptions Configures OpenSearch Service to use Amazon Cognito authentication for
     * OpenSearch Dashboards. 
     */
    override fun cognitoOptions(cognitoOptions: CognitoOptionsProperty) {
      cdkBuilder.cognitoOptions(cognitoOptions.let(CognitoOptionsProperty.Companion::unwrap))
    }

    /**
     * Configures OpenSearch Service to use Amazon Cognito authentication for OpenSearch Dashboards.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticsearch-domain.html#cfn-elasticsearch-domain-cognitooptions)
     * @param cognitoOptions Configures OpenSearch Service to use Amazon Cognito authentication for
     * OpenSearch Dashboards. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("02c04adaa73bbc4d4e9f4d7c0384f51585afcb7fc3101bc0b2d83833feab8b32")
    override fun cognitoOptions(cognitoOptions: CognitoOptionsProperty.Builder.() -> Unit): Unit =
        cognitoOptions(CognitoOptionsProperty(cognitoOptions))

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticsearch-domain.html#cfn-elasticsearch-domain-domainarn)
     * @param domainArn 
     */
    override fun domainArn(domainArn: String) {
      cdkBuilder.domainArn(domainArn)
    }

    /**
     * Specifies additional options for the domain endpoint, such as whether to require HTTPS for
     * all traffic or whether to use a custom endpoint rather than the default endpoint.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticsearch-domain.html#cfn-elasticsearch-domain-domainendpointoptions)
     * @param domainEndpointOptions Specifies additional options for the domain endpoint, such as
     * whether to require HTTPS for all traffic or whether to use a custom endpoint rather than the
     * default endpoint. 
     */
    override fun domainEndpointOptions(domainEndpointOptions: IResolvable) {
      cdkBuilder.domainEndpointOptions(domainEndpointOptions.let(IResolvable.Companion::unwrap))
    }

    /**
     * Specifies additional options for the domain endpoint, such as whether to require HTTPS for
     * all traffic or whether to use a custom endpoint rather than the default endpoint.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticsearch-domain.html#cfn-elasticsearch-domain-domainendpointoptions)
     * @param domainEndpointOptions Specifies additional options for the domain endpoint, such as
     * whether to require HTTPS for all traffic or whether to use a custom endpoint rather than the
     * default endpoint. 
     */
    override fun domainEndpointOptions(domainEndpointOptions: DomainEndpointOptionsProperty) {
      cdkBuilder.domainEndpointOptions(domainEndpointOptions.let(DomainEndpointOptionsProperty.Companion::unwrap))
    }

    /**
     * Specifies additional options for the domain endpoint, such as whether to require HTTPS for
     * all traffic or whether to use a custom endpoint rather than the default endpoint.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticsearch-domain.html#cfn-elasticsearch-domain-domainendpointoptions)
     * @param domainEndpointOptions Specifies additional options for the domain endpoint, such as
     * whether to require HTTPS for all traffic or whether to use a custom endpoint rather than the
     * default endpoint. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("4869c5dee7f082e87fa965a3be680763f6fd8c50c0efb261db8a3eb68e28921d")
    override
        fun domainEndpointOptions(domainEndpointOptions: DomainEndpointOptionsProperty.Builder.() -> Unit):
        Unit = domainEndpointOptions(DomainEndpointOptionsProperty(domainEndpointOptions))

    /**
     * A name for the OpenSearch Service domain.
     *
     * For valid values, see the
     * [DomainName](https://docs.aws.amazon.com/opensearch-service/latest/developerguide/configuration-api.html#configuration-api-datatypes-domainname)
     * data type in the *Amazon OpenSearch Service Developer Guide* . If you don't specify a name, AWS
     * CloudFormation generates a unique physical ID and uses that ID for the domain name. For more
     * information, see [Name
     * Type](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-name.html) .
     *
     *
     * If you specify a name, you cannot perform updates that require replacement of this resource.
     * You can perform updates that require no or some interruption. If you must replace the resource,
     * specify a new name.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticsearch-domain.html#cfn-elasticsearch-domain-domainname)
     * @param domainName A name for the OpenSearch Service domain. 
     */
    override fun domainName(domainName: String) {
      cdkBuilder.domainName(domainName)
    }

    /**
     * The configurations of Amazon Elastic Block Store (Amazon EBS) volumes that are attached to
     * data nodes in the OpenSearch Service domain.
     *
     * For more information, see [EBS volume size
     * limits](https://docs.aws.amazon.com/opensearch-service/latest/developerguide/limits.html#ebsresource)
     * in the *Amazon OpenSearch Service Developer Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticsearch-domain.html#cfn-elasticsearch-domain-ebsoptions)
     * @param ebsOptions The configurations of Amazon Elastic Block Store (Amazon EBS) volumes that
     * are attached to data nodes in the OpenSearch Service domain. 
     */
    override fun ebsOptions(ebsOptions: IResolvable) {
      cdkBuilder.ebsOptions(ebsOptions.let(IResolvable.Companion::unwrap))
    }

    /**
     * The configurations of Amazon Elastic Block Store (Amazon EBS) volumes that are attached to
     * data nodes in the OpenSearch Service domain.
     *
     * For more information, see [EBS volume size
     * limits](https://docs.aws.amazon.com/opensearch-service/latest/developerguide/limits.html#ebsresource)
     * in the *Amazon OpenSearch Service Developer Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticsearch-domain.html#cfn-elasticsearch-domain-ebsoptions)
     * @param ebsOptions The configurations of Amazon Elastic Block Store (Amazon EBS) volumes that
     * are attached to data nodes in the OpenSearch Service domain. 
     */
    override fun ebsOptions(ebsOptions: EBSOptionsProperty) {
      cdkBuilder.ebsOptions(ebsOptions.let(EBSOptionsProperty.Companion::unwrap))
    }

    /**
     * The configurations of Amazon Elastic Block Store (Amazon EBS) volumes that are attached to
     * data nodes in the OpenSearch Service domain.
     *
     * For more information, see [EBS volume size
     * limits](https://docs.aws.amazon.com/opensearch-service/latest/developerguide/limits.html#ebsresource)
     * in the *Amazon OpenSearch Service Developer Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticsearch-domain.html#cfn-elasticsearch-domain-ebsoptions)
     * @param ebsOptions The configurations of Amazon Elastic Block Store (Amazon EBS) volumes that
     * are attached to data nodes in the OpenSearch Service domain. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("c4e85df7c6b7a9001fa4bfc258e7863399aef3b1826404e2af4c7a38e646fe8a")
    override fun ebsOptions(ebsOptions: EBSOptionsProperty.Builder.() -> Unit): Unit =
        ebsOptions(EBSOptionsProperty(ebsOptions))

    /**
     * ElasticsearchClusterConfig is a property of the AWS::Elasticsearch::Domain resource that
     * configures the cluster of an Amazon OpenSearch Service domain.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticsearch-domain.html#cfn-elasticsearch-domain-elasticsearchclusterconfig)
     * @param elasticsearchClusterConfig ElasticsearchClusterConfig is a property of the
     * AWS::Elasticsearch::Domain resource that configures the cluster of an Amazon OpenSearch Service
     * domain. 
     */
    override fun elasticsearchClusterConfig(elasticsearchClusterConfig: IResolvable) {
      cdkBuilder.elasticsearchClusterConfig(elasticsearchClusterConfig.let(IResolvable.Companion::unwrap))
    }

    /**
     * ElasticsearchClusterConfig is a property of the AWS::Elasticsearch::Domain resource that
     * configures the cluster of an Amazon OpenSearch Service domain.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticsearch-domain.html#cfn-elasticsearch-domain-elasticsearchclusterconfig)
     * @param elasticsearchClusterConfig ElasticsearchClusterConfig is a property of the
     * AWS::Elasticsearch::Domain resource that configures the cluster of an Amazon OpenSearch Service
     * domain. 
     */
    override
        fun elasticsearchClusterConfig(elasticsearchClusterConfig: ElasticsearchClusterConfigProperty) {
      cdkBuilder.elasticsearchClusterConfig(elasticsearchClusterConfig.let(ElasticsearchClusterConfigProperty.Companion::unwrap))
    }

    /**
     * ElasticsearchClusterConfig is a property of the AWS::Elasticsearch::Domain resource that
     * configures the cluster of an Amazon OpenSearch Service domain.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticsearch-domain.html#cfn-elasticsearch-domain-elasticsearchclusterconfig)
     * @param elasticsearchClusterConfig ElasticsearchClusterConfig is a property of the
     * AWS::Elasticsearch::Domain resource that configures the cluster of an Amazon OpenSearch Service
     * domain. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("c39776ab909b055508fc1cee38bbcd6132a0d10196754b515ba262a40567e39c")
    override
        fun elasticsearchClusterConfig(elasticsearchClusterConfig: ElasticsearchClusterConfigProperty.Builder.() -> Unit):
        Unit =
        elasticsearchClusterConfig(ElasticsearchClusterConfigProperty(elasticsearchClusterConfig))

    /**
     * The version of Elasticsearch to use, such as 2.3. If not specified, 1.5 is used as the
     * default. For information about the versions that OpenSearch Service supports, see [Supported
     * versions of OpenSearch and
     * Elasticsearch](https://docs.aws.amazon.com/opensearch-service/latest/developerguide/what-is.html#choosing-version)
     * in the *Amazon OpenSearch Service Developer Guide* .
     *
     * If you set the
     * [EnableVersionUpgrade](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-attribute-updatepolicy.html#cfn-attributes-updatepolicy-upgradeopensearchdomain)
     * update policy to `true` , you can update `ElasticsearchVersion` without interruption. When
     * `EnableVersionUpgrade` is set to `false` , or is not specified, updating `ElasticsearchVersion`
     * results in
     * [replacement](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/using-cfn-updating-stacks-update-behaviors.html#update-replacement)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticsearch-domain.html#cfn-elasticsearch-domain-elasticsearchversion)
     * @param elasticsearchVersion The version of Elasticsearch to use, such as 2.3. If not
     * specified, 1.5 is used as the default. For information about the versions that OpenSearch
     * Service supports, see [Supported versions of OpenSearch and
     * Elasticsearch](https://docs.aws.amazon.com/opensearch-service/latest/developerguide/what-is.html#choosing-version)
     * in the *Amazon OpenSearch Service Developer Guide* . 
     */
    override fun elasticsearchVersion(elasticsearchVersion: String) {
      cdkBuilder.elasticsearchVersion(elasticsearchVersion)
    }

    /**
     * Whether the domain should encrypt data at rest, and if so, the AWS Key Management Service key
     * to use.
     *
     * See [Encryption of data at rest for Amazon OpenSearch
     * Service](https://docs.aws.amazon.com/opensearch-service/latest/developerguide/encryption-at-rest.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticsearch-domain.html#cfn-elasticsearch-domain-encryptionatrestoptions)
     * @param encryptionAtRestOptions Whether the domain should encrypt data at rest, and if so, the
     * AWS Key Management Service key to use. 
     */
    override fun encryptionAtRestOptions(encryptionAtRestOptions: IResolvable) {
      cdkBuilder.encryptionAtRestOptions(encryptionAtRestOptions.let(IResolvable.Companion::unwrap))
    }

    /**
     * Whether the domain should encrypt data at rest, and if so, the AWS Key Management Service key
     * to use.
     *
     * See [Encryption of data at rest for Amazon OpenSearch
     * Service](https://docs.aws.amazon.com/opensearch-service/latest/developerguide/encryption-at-rest.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticsearch-domain.html#cfn-elasticsearch-domain-encryptionatrestoptions)
     * @param encryptionAtRestOptions Whether the domain should encrypt data at rest, and if so, the
     * AWS Key Management Service key to use. 
     */
    override fun encryptionAtRestOptions(encryptionAtRestOptions: EncryptionAtRestOptionsProperty) {
      cdkBuilder.encryptionAtRestOptions(encryptionAtRestOptions.let(EncryptionAtRestOptionsProperty.Companion::unwrap))
    }

    /**
     * Whether the domain should encrypt data at rest, and if so, the AWS Key Management Service key
     * to use.
     *
     * See [Encryption of data at rest for Amazon OpenSearch
     * Service](https://docs.aws.amazon.com/opensearch-service/latest/developerguide/encryption-at-rest.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticsearch-domain.html#cfn-elasticsearch-domain-encryptionatrestoptions)
     * @param encryptionAtRestOptions Whether the domain should encrypt data at rest, and if so, the
     * AWS Key Management Service key to use. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("8320db660a34415aa9d094cca4924d36f11e55e2b203728911494f3cd29df022")
    override
        fun encryptionAtRestOptions(encryptionAtRestOptions: EncryptionAtRestOptionsProperty.Builder.() -> Unit):
        Unit = encryptionAtRestOptions(EncryptionAtRestOptionsProperty(encryptionAtRestOptions))

    /**
     * An object with one or more of the following keys: `SEARCH_SLOW_LOGS` , `ES_APPLICATION_LOGS`
     * , `INDEX_SLOW_LOGS` , `AUDIT_LOGS` , depending on the types of logs you want to publish.
     *
     * Each key needs a valid `LogPublishingOption` value.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticsearch-domain.html#cfn-elasticsearch-domain-logpublishingoptions)
     * @param logPublishingOptions An object with one or more of the following keys:
     * `SEARCH_SLOW_LOGS` , `ES_APPLICATION_LOGS` , `INDEX_SLOW_LOGS` , `AUDIT_LOGS` , depending on the
     * types of logs you want to publish. 
     */
    override fun logPublishingOptions(logPublishingOptions: IResolvable) {
      cdkBuilder.logPublishingOptions(logPublishingOptions.let(IResolvable.Companion::unwrap))
    }

    /**
     * An object with one or more of the following keys: `SEARCH_SLOW_LOGS` , `ES_APPLICATION_LOGS`
     * , `INDEX_SLOW_LOGS` , `AUDIT_LOGS` , depending on the types of logs you want to publish.
     *
     * Each key needs a valid `LogPublishingOption` value.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticsearch-domain.html#cfn-elasticsearch-domain-logpublishingoptions)
     * @param logPublishingOptions An object with one or more of the following keys:
     * `SEARCH_SLOW_LOGS` , `ES_APPLICATION_LOGS` , `INDEX_SLOW_LOGS` , `AUDIT_LOGS` , depending on the
     * types of logs you want to publish. 
     */
    override fun logPublishingOptions(logPublishingOptions: Map<String, Any>) {
      cdkBuilder.logPublishingOptions(logPublishingOptions.mapValues{CdkObjectWrappers.unwrap(it.value)})
    }

    /**
     * Specifies whether node-to-node encryption is enabled.
     *
     * See [Node-to-node encryption for Amazon OpenSearch
     * Service](https://docs.aws.amazon.com/opensearch-service/latest/developerguide/ntn.html) .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticsearch-domain.html#cfn-elasticsearch-domain-nodetonodeencryptionoptions)
     * @param nodeToNodeEncryptionOptions Specifies whether node-to-node encryption is enabled. 
     */
    override fun nodeToNodeEncryptionOptions(nodeToNodeEncryptionOptions: IResolvable) {
      cdkBuilder.nodeToNodeEncryptionOptions(nodeToNodeEncryptionOptions.let(IResolvable.Companion::unwrap))
    }

    /**
     * Specifies whether node-to-node encryption is enabled.
     *
     * See [Node-to-node encryption for Amazon OpenSearch
     * Service](https://docs.aws.amazon.com/opensearch-service/latest/developerguide/ntn.html) .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticsearch-domain.html#cfn-elasticsearch-domain-nodetonodeencryptionoptions)
     * @param nodeToNodeEncryptionOptions Specifies whether node-to-node encryption is enabled. 
     */
    override
        fun nodeToNodeEncryptionOptions(nodeToNodeEncryptionOptions: NodeToNodeEncryptionOptionsProperty) {
      cdkBuilder.nodeToNodeEncryptionOptions(nodeToNodeEncryptionOptions.let(NodeToNodeEncryptionOptionsProperty.Companion::unwrap))
    }

    /**
     * Specifies whether node-to-node encryption is enabled.
     *
     * See [Node-to-node encryption for Amazon OpenSearch
     * Service](https://docs.aws.amazon.com/opensearch-service/latest/developerguide/ntn.html) .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticsearch-domain.html#cfn-elasticsearch-domain-nodetonodeencryptionoptions)
     * @param nodeToNodeEncryptionOptions Specifies whether node-to-node encryption is enabled. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("0b014ca6637b558a99492fd728be1f18159f43019e21def598d9569ea16e2fd3")
    override
        fun nodeToNodeEncryptionOptions(nodeToNodeEncryptionOptions: NodeToNodeEncryptionOptionsProperty.Builder.() -> Unit):
        Unit =
        nodeToNodeEncryptionOptions(NodeToNodeEncryptionOptionsProperty(nodeToNodeEncryptionOptions))

    /**
     * *DEPRECATED* .
     *
     * The automated snapshot configuration for the OpenSearch Service domain indices.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticsearch-domain.html#cfn-elasticsearch-domain-snapshotoptions)
     * @param snapshotOptions *DEPRECATED* . 
     */
    override fun snapshotOptions(snapshotOptions: IResolvable) {
      cdkBuilder.snapshotOptions(snapshotOptions.let(IResolvable.Companion::unwrap))
    }

    /**
     * *DEPRECATED* .
     *
     * The automated snapshot configuration for the OpenSearch Service domain indices.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticsearch-domain.html#cfn-elasticsearch-domain-snapshotoptions)
     * @param snapshotOptions *DEPRECATED* . 
     */
    override fun snapshotOptions(snapshotOptions: SnapshotOptionsProperty) {
      cdkBuilder.snapshotOptions(snapshotOptions.let(SnapshotOptionsProperty.Companion::unwrap))
    }

    /**
     * *DEPRECATED* .
     *
     * The automated snapshot configuration for the OpenSearch Service domain indices.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticsearch-domain.html#cfn-elasticsearch-domain-snapshotoptions)
     * @param snapshotOptions *DEPRECATED* . 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("46747f5623a38821047b996ba4524c1c648e164a66637321babaa37d159b2460")
    override fun snapshotOptions(snapshotOptions: SnapshotOptionsProperty.Builder.() -> Unit): Unit
        = snapshotOptions(SnapshotOptionsProperty(snapshotOptions))

    /**
     * An arbitrary set of tags (key–value pairs) to associate with the OpenSearch Service domain.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticsearch-domain.html#cfn-elasticsearch-domain-tags)
     * @param tags An arbitrary set of tags (key–value pairs) to associate with the OpenSearch
     * Service domain. 
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag.Companion::unwrap))
    }

    /**
     * An arbitrary set of tags (key–value pairs) to associate with the OpenSearch Service domain.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticsearch-domain.html#cfn-elasticsearch-domain-tags)
     * @param tags An arbitrary set of tags (key–value pairs) to associate with the OpenSearch
     * Service domain. 
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    /**
     * The virtual private cloud (VPC) configuration for the OpenSearch Service domain.
     *
     * For more information, see [Launching your Amazon OpenSearch Service domains within a
     * VPC](https://docs.aws.amazon.com/opensearch-service/latest/developerguide/vpc.html) in the
     * *Amazon OpenSearch Service Developer Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticsearch-domain.html#cfn-elasticsearch-domain-vpcoptions)
     * @param vpcOptions The virtual private cloud (VPC) configuration for the OpenSearch Service
     * domain. 
     */
    override fun vpcOptions(vpcOptions: IResolvable) {
      cdkBuilder.vpcOptions(vpcOptions.let(IResolvable.Companion::unwrap))
    }

    /**
     * The virtual private cloud (VPC) configuration for the OpenSearch Service domain.
     *
     * For more information, see [Launching your Amazon OpenSearch Service domains within a
     * VPC](https://docs.aws.amazon.com/opensearch-service/latest/developerguide/vpc.html) in the
     * *Amazon OpenSearch Service Developer Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticsearch-domain.html#cfn-elasticsearch-domain-vpcoptions)
     * @param vpcOptions The virtual private cloud (VPC) configuration for the OpenSearch Service
     * domain. 
     */
    override fun vpcOptions(vpcOptions: VPCOptionsProperty) {
      cdkBuilder.vpcOptions(vpcOptions.let(VPCOptionsProperty.Companion::unwrap))
    }

    /**
     * The virtual private cloud (VPC) configuration for the OpenSearch Service domain.
     *
     * For more information, see [Launching your Amazon OpenSearch Service domains within a
     * VPC](https://docs.aws.amazon.com/opensearch-service/latest/developerguide/vpc.html) in the
     * *Amazon OpenSearch Service Developer Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticsearch-domain.html#cfn-elasticsearch-domain-vpcoptions)
     * @param vpcOptions The virtual private cloud (VPC) configuration for the OpenSearch Service
     * domain. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("656bc9229ee8294ec5c29f3bda4752a4b03621f0a008d7e5c593522f46ea35e3")
    override fun vpcOptions(vpcOptions: VPCOptionsProperty.Builder.() -> Unit): Unit =
        vpcOptions(VPCOptionsProperty(vpcOptions))

    public fun build(): software.amazon.awscdk.services.elasticsearch.CfnDomain = cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.elasticsearch.CfnDomain.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnDomain {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnDomain(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.elasticsearch.CfnDomain): CfnDomain
        = CfnDomain(cdkObject)

    internal fun unwrap(wrapped: CfnDomain): software.amazon.awscdk.services.elasticsearch.CfnDomain
        = wrapped.cdkObject as software.amazon.awscdk.services.elasticsearch.CfnDomain
  }

  /**
   * Specifies options for fine-grained access control.
   *
   *
   * The `AWS::Elasticsearch::Domain` resource is being replaced by the
   * [AWS::OpenSearchService::Domain](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opensearchservice-domain.html)
   * resource. While the legacy Elasticsearch resource and options are still supported, we recommend
   * modifying your existing Cloudformation templates to use the new OpenSearch Service resource, which
   * supports both OpenSearch and Elasticsearch. For more information about the service rename, see
   * [New resource
   * types](https://docs.aws.amazon.com/opensearch-service/latest/developerguide/rename.html#rename-resource)
   * in the *Amazon OpenSearch Service Developer Guide* .
   *
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.elasticsearch.*;
   * AdvancedSecurityOptionsInputProperty advancedSecurityOptionsInputProperty =
   * AdvancedSecurityOptionsInputProperty.builder()
   * .anonymousAuthEnabled(false)
   * .enabled(false)
   * .internalUserDatabaseEnabled(false)
   * .masterUserOptions(MasterUserOptionsProperty.builder()
   * .masterUserArn("masterUserArn")
   * .masterUserName("masterUserName")
   * .masterUserPassword("masterUserPassword")
   * .build())
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticsearch-domain-advancedsecurityoptionsinput.html)
   */
  public interface AdvancedSecurityOptionsInputProperty {
    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticsearch-domain-advancedsecurityoptionsinput.html#cfn-elasticsearch-domain-advancedsecurityoptionsinput-anonymousauthenabled)
     */
    public fun anonymousAuthEnabled(): Any? = unwrap(this).getAnonymousAuthEnabled()

    /**
     * True to enable fine-grained access control.
     *
     * You must also enable encryption of data at rest and node-to-node encryption.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticsearch-domain-advancedsecurityoptionsinput.html#cfn-elasticsearch-domain-advancedsecurityoptionsinput-enabled)
     */
    public fun enabled(): Any? = unwrap(this).getEnabled()

    /**
     * True to enable the internal user database.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticsearch-domain-advancedsecurityoptionsinput.html#cfn-elasticsearch-domain-advancedsecurityoptionsinput-internaluserdatabaseenabled)
     */
    public fun internalUserDatabaseEnabled(): Any? = unwrap(this).getInternalUserDatabaseEnabled()

    /**
     * Specifies information about the master user.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticsearch-domain-advancedsecurityoptionsinput.html#cfn-elasticsearch-domain-advancedsecurityoptionsinput-masteruseroptions)
     */
    public fun masterUserOptions(): Any? = unwrap(this).getMasterUserOptions()

    /**
     * A builder for [AdvancedSecurityOptionsInputProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param anonymousAuthEnabled the value to be set.
       */
      public fun anonymousAuthEnabled(anonymousAuthEnabled: Boolean)

      /**
       * @param anonymousAuthEnabled the value to be set.
       */
      public fun anonymousAuthEnabled(anonymousAuthEnabled: IResolvable)

      /**
       * @param enabled True to enable fine-grained access control.
       * You must also enable encryption of data at rest and node-to-node encryption.
       */
      public fun enabled(enabled: Boolean)

      /**
       * @param enabled True to enable fine-grained access control.
       * You must also enable encryption of data at rest and node-to-node encryption.
       */
      public fun enabled(enabled: IResolvable)

      /**
       * @param internalUserDatabaseEnabled True to enable the internal user database.
       */
      public fun internalUserDatabaseEnabled(internalUserDatabaseEnabled: Boolean)

      /**
       * @param internalUserDatabaseEnabled True to enable the internal user database.
       */
      public fun internalUserDatabaseEnabled(internalUserDatabaseEnabled: IResolvable)

      /**
       * @param masterUserOptions Specifies information about the master user.
       */
      public fun masterUserOptions(masterUserOptions: IResolvable)

      /**
       * @param masterUserOptions Specifies information about the master user.
       */
      public fun masterUserOptions(masterUserOptions: MasterUserOptionsProperty)

      /**
       * @param masterUserOptions Specifies information about the master user.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("f8b99364a7a797efb4caa40815da91bc63a60a5bafb54620f1c05db76cda54b0")
      public fun masterUserOptions(masterUserOptions: MasterUserOptionsProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.elasticsearch.CfnDomain.AdvancedSecurityOptionsInputProperty.Builder
          =
          software.amazon.awscdk.services.elasticsearch.CfnDomain.AdvancedSecurityOptionsInputProperty.builder()

      /**
       * @param anonymousAuthEnabled the value to be set.
       */
      override fun anonymousAuthEnabled(anonymousAuthEnabled: Boolean) {
        cdkBuilder.anonymousAuthEnabled(anonymousAuthEnabled)
      }

      /**
       * @param anonymousAuthEnabled the value to be set.
       */
      override fun anonymousAuthEnabled(anonymousAuthEnabled: IResolvable) {
        cdkBuilder.anonymousAuthEnabled(anonymousAuthEnabled.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param enabled True to enable fine-grained access control.
       * You must also enable encryption of data at rest and node-to-node encryption.
       */
      override fun enabled(enabled: Boolean) {
        cdkBuilder.enabled(enabled)
      }

      /**
       * @param enabled True to enable fine-grained access control.
       * You must also enable encryption of data at rest and node-to-node encryption.
       */
      override fun enabled(enabled: IResolvable) {
        cdkBuilder.enabled(enabled.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param internalUserDatabaseEnabled True to enable the internal user database.
       */
      override fun internalUserDatabaseEnabled(internalUserDatabaseEnabled: Boolean) {
        cdkBuilder.internalUserDatabaseEnabled(internalUserDatabaseEnabled)
      }

      /**
       * @param internalUserDatabaseEnabled True to enable the internal user database.
       */
      override fun internalUserDatabaseEnabled(internalUserDatabaseEnabled: IResolvable) {
        cdkBuilder.internalUserDatabaseEnabled(internalUserDatabaseEnabled.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param masterUserOptions Specifies information about the master user.
       */
      override fun masterUserOptions(masterUserOptions: IResolvable) {
        cdkBuilder.masterUserOptions(masterUserOptions.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param masterUserOptions Specifies information about the master user.
       */
      override fun masterUserOptions(masterUserOptions: MasterUserOptionsProperty) {
        cdkBuilder.masterUserOptions(masterUserOptions.let(MasterUserOptionsProperty.Companion::unwrap))
      }

      /**
       * @param masterUserOptions Specifies information about the master user.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("f8b99364a7a797efb4caa40815da91bc63a60a5bafb54620f1c05db76cda54b0")
      override
          fun masterUserOptions(masterUserOptions: MasterUserOptionsProperty.Builder.() -> Unit):
          Unit = masterUserOptions(MasterUserOptionsProperty(masterUserOptions))

      public fun build():
          software.amazon.awscdk.services.elasticsearch.CfnDomain.AdvancedSecurityOptionsInputProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.elasticsearch.CfnDomain.AdvancedSecurityOptionsInputProperty,
    ) : CdkObject(cdkObject),
        AdvancedSecurityOptionsInputProperty {
      /**
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticsearch-domain-advancedsecurityoptionsinput.html#cfn-elasticsearch-domain-advancedsecurityoptionsinput-anonymousauthenabled)
       */
      override fun anonymousAuthEnabled(): Any? = unwrap(this).getAnonymousAuthEnabled()

      /**
       * True to enable fine-grained access control.
       *
       * You must also enable encryption of data at rest and node-to-node encryption.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticsearch-domain-advancedsecurityoptionsinput.html#cfn-elasticsearch-domain-advancedsecurityoptionsinput-enabled)
       */
      override fun enabled(): Any? = unwrap(this).getEnabled()

      /**
       * True to enable the internal user database.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticsearch-domain-advancedsecurityoptionsinput.html#cfn-elasticsearch-domain-advancedsecurityoptionsinput-internaluserdatabaseenabled)
       */
      override fun internalUserDatabaseEnabled(): Any? =
          unwrap(this).getInternalUserDatabaseEnabled()

      /**
       * Specifies information about the master user.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticsearch-domain-advancedsecurityoptionsinput.html#cfn-elasticsearch-domain-advancedsecurityoptionsinput-masteruseroptions)
       */
      override fun masterUserOptions(): Any? = unwrap(this).getMasterUserOptions()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          AdvancedSecurityOptionsInputProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.elasticsearch.CfnDomain.AdvancedSecurityOptionsInputProperty):
          AdvancedSecurityOptionsInputProperty = CdkObjectWrappers.wrap(cdkObject) as?
          AdvancedSecurityOptionsInputProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: AdvancedSecurityOptionsInputProperty):
          software.amazon.awscdk.services.elasticsearch.CfnDomain.AdvancedSecurityOptionsInputProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.elasticsearch.CfnDomain.AdvancedSecurityOptionsInputProperty
    }
  }

  /**
   * Configures OpenSearch Service to use Amazon Cognito authentication for OpenSearch Dashboards.
   *
   *
   * The `AWS::Elasticsearch::Domain` resource is being replaced by the
   * [AWS::OpenSearchService::Domain](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opensearchservice-domain.html)
   * resource. While the legacy Elasticsearch resource and options are still supported, we recommend
   * modifying your existing Cloudformation templates to use the new OpenSearch Service resource, which
   * supports both OpenSearch and Elasticsearch. For more information about the service rename, see
   * [New resource
   * types](https://docs.aws.amazon.com/opensearch-service/latest/developerguide/rename.html#rename-resource)
   * in the *Amazon OpenSearch Service Developer Guide* .
   *
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.elasticsearch.*;
   * CognitoOptionsProperty cognitoOptionsProperty = CognitoOptionsProperty.builder()
   * .enabled(false)
   * .identityPoolId("identityPoolId")
   * .roleArn("roleArn")
   * .userPoolId("userPoolId")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticsearch-domain-cognitooptions.html)
   */
  public interface CognitoOptionsProperty {
    /**
     * Whether to enable or disable Amazon Cognito authentication for OpenSearch Dashboards.
     *
     * See [Amazon Cognito authentication for OpenSearch
     * Dashboards](https://docs.aws.amazon.com/opensearch-service/latest/developerguide/cognito-auth.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticsearch-domain-cognitooptions.html#cfn-elasticsearch-domain-cognitooptions-enabled)
     */
    public fun enabled(): Any? = unwrap(this).getEnabled()

    /**
     * The Amazon Cognito identity pool ID that you want OpenSearch Service to use for OpenSearch
     * Dashboards authentication.
     *
     * Required if you enable Cognito authentication.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticsearch-domain-cognitooptions.html#cfn-elasticsearch-domain-cognitooptions-identitypoolid)
     */
    public fun identityPoolId(): String? = unwrap(this).getIdentityPoolId()

    /**
     * The `AmazonESCognitoAccess` role that allows OpenSearch Service to configure your user pool
     * and identity pool.
     *
     * Required if you enable Cognito authentication.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticsearch-domain-cognitooptions.html#cfn-elasticsearch-domain-cognitooptions-rolearn)
     */
    public fun roleArn(): String? = unwrap(this).getRoleArn()

    /**
     * The Amazon Cognito user pool ID that you want OpenSearch Service to use for OpenSearch
     * Dashboards authentication.
     *
     * Required if you enable Cognito authentication.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticsearch-domain-cognitooptions.html#cfn-elasticsearch-domain-cognitooptions-userpoolid)
     */
    public fun userPoolId(): String? = unwrap(this).getUserPoolId()

    /**
     * A builder for [CognitoOptionsProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param enabled Whether to enable or disable Amazon Cognito authentication for OpenSearch
       * Dashboards.
       * See [Amazon Cognito authentication for OpenSearch
       * Dashboards](https://docs.aws.amazon.com/opensearch-service/latest/developerguide/cognito-auth.html)
       * .
       */
      public fun enabled(enabled: Boolean)

      /**
       * @param enabled Whether to enable or disable Amazon Cognito authentication for OpenSearch
       * Dashboards.
       * See [Amazon Cognito authentication for OpenSearch
       * Dashboards](https://docs.aws.amazon.com/opensearch-service/latest/developerguide/cognito-auth.html)
       * .
       */
      public fun enabled(enabled: IResolvable)

      /**
       * @param identityPoolId The Amazon Cognito identity pool ID that you want OpenSearch Service
       * to use for OpenSearch Dashboards authentication.
       * Required if you enable Cognito authentication.
       */
      public fun identityPoolId(identityPoolId: String)

      /**
       * @param roleArn The `AmazonESCognitoAccess` role that allows OpenSearch Service to configure
       * your user pool and identity pool.
       * Required if you enable Cognito authentication.
       */
      public fun roleArn(roleArn: String)

      /**
       * @param userPoolId The Amazon Cognito user pool ID that you want OpenSearch Service to use
       * for OpenSearch Dashboards authentication.
       * Required if you enable Cognito authentication.
       */
      public fun userPoolId(userPoolId: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.elasticsearch.CfnDomain.CognitoOptionsProperty.Builder =
          software.amazon.awscdk.services.elasticsearch.CfnDomain.CognitoOptionsProperty.builder()

      /**
       * @param enabled Whether to enable or disable Amazon Cognito authentication for OpenSearch
       * Dashboards.
       * See [Amazon Cognito authentication for OpenSearch
       * Dashboards](https://docs.aws.amazon.com/opensearch-service/latest/developerguide/cognito-auth.html)
       * .
       */
      override fun enabled(enabled: Boolean) {
        cdkBuilder.enabled(enabled)
      }

      /**
       * @param enabled Whether to enable or disable Amazon Cognito authentication for OpenSearch
       * Dashboards.
       * See [Amazon Cognito authentication for OpenSearch
       * Dashboards](https://docs.aws.amazon.com/opensearch-service/latest/developerguide/cognito-auth.html)
       * .
       */
      override fun enabled(enabled: IResolvable) {
        cdkBuilder.enabled(enabled.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param identityPoolId The Amazon Cognito identity pool ID that you want OpenSearch Service
       * to use for OpenSearch Dashboards authentication.
       * Required if you enable Cognito authentication.
       */
      override fun identityPoolId(identityPoolId: String) {
        cdkBuilder.identityPoolId(identityPoolId)
      }

      /**
       * @param roleArn The `AmazonESCognitoAccess` role that allows OpenSearch Service to configure
       * your user pool and identity pool.
       * Required if you enable Cognito authentication.
       */
      override fun roleArn(roleArn: String) {
        cdkBuilder.roleArn(roleArn)
      }

      /**
       * @param userPoolId The Amazon Cognito user pool ID that you want OpenSearch Service to use
       * for OpenSearch Dashboards authentication.
       * Required if you enable Cognito authentication.
       */
      override fun userPoolId(userPoolId: String) {
        cdkBuilder.userPoolId(userPoolId)
      }

      public fun build():
          software.amazon.awscdk.services.elasticsearch.CfnDomain.CognitoOptionsProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.elasticsearch.CfnDomain.CognitoOptionsProperty,
    ) : CdkObject(cdkObject),
        CognitoOptionsProperty {
      /**
       * Whether to enable or disable Amazon Cognito authentication for OpenSearch Dashboards.
       *
       * See [Amazon Cognito authentication for OpenSearch
       * Dashboards](https://docs.aws.amazon.com/opensearch-service/latest/developerguide/cognito-auth.html)
       * .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticsearch-domain-cognitooptions.html#cfn-elasticsearch-domain-cognitooptions-enabled)
       */
      override fun enabled(): Any? = unwrap(this).getEnabled()

      /**
       * The Amazon Cognito identity pool ID that you want OpenSearch Service to use for OpenSearch
       * Dashboards authentication.
       *
       * Required if you enable Cognito authentication.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticsearch-domain-cognitooptions.html#cfn-elasticsearch-domain-cognitooptions-identitypoolid)
       */
      override fun identityPoolId(): String? = unwrap(this).getIdentityPoolId()

      /**
       * The `AmazonESCognitoAccess` role that allows OpenSearch Service to configure your user pool
       * and identity pool.
       *
       * Required if you enable Cognito authentication.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticsearch-domain-cognitooptions.html#cfn-elasticsearch-domain-cognitooptions-rolearn)
       */
      override fun roleArn(): String? = unwrap(this).getRoleArn()

      /**
       * The Amazon Cognito user pool ID that you want OpenSearch Service to use for OpenSearch
       * Dashboards authentication.
       *
       * Required if you enable Cognito authentication.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticsearch-domain-cognitooptions.html#cfn-elasticsearch-domain-cognitooptions-userpoolid)
       */
      override fun userPoolId(): String? = unwrap(this).getUserPoolId()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): CognitoOptionsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.elasticsearch.CfnDomain.CognitoOptionsProperty):
          CognitoOptionsProperty = CdkObjectWrappers.wrap(cdkObject) as? CognitoOptionsProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: CognitoOptionsProperty):
          software.amazon.awscdk.services.elasticsearch.CfnDomain.CognitoOptionsProperty = (wrapped
          as CdkObject).cdkObject as
          software.amazon.awscdk.services.elasticsearch.CfnDomain.CognitoOptionsProperty
    }
  }

  /**
   * Specifies options for cold storage. For more information, see [Cold storage for Amazon
   * Elasticsearch
   * Service](https://docs.aws.amazon.com/elasticsearch-service/latest/developerguide/cold-storage.html)
   * .
   *
   *
   * The `AWS::Elasticsearch::Domain` resource is being replaced by the
   * [AWS::OpenSearchService::Domain](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opensearchservice-domain.html)
   * resource. While the legacy Elasticsearch resource and options are still supported, we recommend
   * modifying your existing Cloudformation templates to use the new OpenSearch Service resource, which
   * supports both OpenSearch and Elasticsearch. For more information about the service rename, see
   * [New resource
   * types](https://docs.aws.amazon.com/opensearch-service/latest/developerguide/rename.html#rename-resource)
   * in the *Amazon OpenSearch Service Developer Guide* .
   *
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.elasticsearch.*;
   * ColdStorageOptionsProperty coldStorageOptionsProperty = ColdStorageOptionsProperty.builder()
   * .enabled(false)
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticsearch-domain-coldstorageoptions.html)
   */
  public interface ColdStorageOptionsProperty {
    /**
     * Whether to enable or disable cold storage on the domain.
     *
     * You must enable UltraWarm storage in order to enable cold storage.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticsearch-domain-coldstorageoptions.html#cfn-elasticsearch-domain-coldstorageoptions-enabled)
     */
    public fun enabled(): Any? = unwrap(this).getEnabled()

    /**
     * A builder for [ColdStorageOptionsProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param enabled Whether to enable or disable cold storage on the domain.
       * You must enable UltraWarm storage in order to enable cold storage.
       */
      public fun enabled(enabled: Boolean)

      /**
       * @param enabled Whether to enable or disable cold storage on the domain.
       * You must enable UltraWarm storage in order to enable cold storage.
       */
      public fun enabled(enabled: IResolvable)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.elasticsearch.CfnDomain.ColdStorageOptionsProperty.Builder
          =
          software.amazon.awscdk.services.elasticsearch.CfnDomain.ColdStorageOptionsProperty.builder()

      /**
       * @param enabled Whether to enable or disable cold storage on the domain.
       * You must enable UltraWarm storage in order to enable cold storage.
       */
      override fun enabled(enabled: Boolean) {
        cdkBuilder.enabled(enabled)
      }

      /**
       * @param enabled Whether to enable or disable cold storage on the domain.
       * You must enable UltraWarm storage in order to enable cold storage.
       */
      override fun enabled(enabled: IResolvable) {
        cdkBuilder.enabled(enabled.let(IResolvable.Companion::unwrap))
      }

      public fun build():
          software.amazon.awscdk.services.elasticsearch.CfnDomain.ColdStorageOptionsProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.elasticsearch.CfnDomain.ColdStorageOptionsProperty,
    ) : CdkObject(cdkObject),
        ColdStorageOptionsProperty {
      /**
       * Whether to enable or disable cold storage on the domain.
       *
       * You must enable UltraWarm storage in order to enable cold storage.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticsearch-domain-coldstorageoptions.html#cfn-elasticsearch-domain-coldstorageoptions-enabled)
       */
      override fun enabled(): Any? = unwrap(this).getEnabled()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): ColdStorageOptionsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.elasticsearch.CfnDomain.ColdStorageOptionsProperty):
          ColdStorageOptionsProperty = CdkObjectWrappers.wrap(cdkObject) as?
          ColdStorageOptionsProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: ColdStorageOptionsProperty):
          software.amazon.awscdk.services.elasticsearch.CfnDomain.ColdStorageOptionsProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.elasticsearch.CfnDomain.ColdStorageOptionsProperty
    }
  }

  /**
   * Specifies additional options for the domain endpoint, such as whether to require HTTPS for all
   * traffic or whether to use a custom endpoint rather than the default endpoint.
   *
   *
   * The `AWS::Elasticsearch::Domain` resource is being replaced by the
   * [AWS::OpenSearchService::Domain](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opensearchservice-domain.html)
   * resource. While the legacy Elasticsearch resource and options are still supported, we recommend
   * modifying your existing Cloudformation templates to use the new OpenSearch Service resource, which
   * supports both OpenSearch and Elasticsearch. For more information about the service rename, see
   * [New resource
   * types](https://docs.aws.amazon.com/opensearch-service/latest/developerguide/rename.html#rename-resource)
   * in the *Amazon OpenSearch Service Developer Guide* .
   *
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.elasticsearch.*;
   * DomainEndpointOptionsProperty domainEndpointOptionsProperty =
   * DomainEndpointOptionsProperty.builder()
   * .customEndpoint("customEndpoint")
   * .customEndpointCertificateArn("customEndpointCertificateArn")
   * .customEndpointEnabled(false)
   * .enforceHttps(false)
   * .tlsSecurityPolicy("tlsSecurityPolicy")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticsearch-domain-domainendpointoptions.html)
   */
  public interface DomainEndpointOptionsProperty {
    /**
     * The fully qualified URL for your custom endpoint.
     *
     * Required if you enabled a custom endpoint for the domain.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticsearch-domain-domainendpointoptions.html#cfn-elasticsearch-domain-domainendpointoptions-customendpoint)
     */
    public fun customEndpoint(): String? = unwrap(this).getCustomEndpoint()

    /**
     * The AWS Certificate Manager ARN for your domain's SSL/TLS certificate.
     *
     * Required if you enabled a custom endpoint for the domain.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticsearch-domain-domainendpointoptions.html#cfn-elasticsearch-domain-domainendpointoptions-customendpointcertificatearn)
     */
    public fun customEndpointCertificateArn(): String? =
        unwrap(this).getCustomEndpointCertificateArn()

    /**
     * True to enable a custom endpoint for the domain.
     *
     * If enabled, you must also provide values for `CustomEndpoint` and
     * `CustomEndpointCertificateArn` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticsearch-domain-domainendpointoptions.html#cfn-elasticsearch-domain-domainendpointoptions-customendpointenabled)
     */
    public fun customEndpointEnabled(): Any? = unwrap(this).getCustomEndpointEnabled()

    /**
     * True to require that all traffic to the domain arrive over HTTPS.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticsearch-domain-domainendpointoptions.html#cfn-elasticsearch-domain-domainendpointoptions-enforcehttps)
     */
    public fun enforceHttps(): Any? = unwrap(this).getEnforceHttps()

    /**
     * The minimum TLS version required for traffic to the domain. Valid values are TLS 1.3
     * (recommended) or 1.2:.
     *
     * * `Policy-Min-TLS-1-0-2019-07`
     * * `Policy-Min-TLS-1-2-2019-07`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticsearch-domain-domainendpointoptions.html#cfn-elasticsearch-domain-domainendpointoptions-tlssecuritypolicy)
     */
    public fun tlsSecurityPolicy(): String? = unwrap(this).getTlsSecurityPolicy()

    /**
     * A builder for [DomainEndpointOptionsProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param customEndpoint The fully qualified URL for your custom endpoint.
       * Required if you enabled a custom endpoint for the domain.
       */
      public fun customEndpoint(customEndpoint: String)

      /**
       * @param customEndpointCertificateArn The AWS Certificate Manager ARN for your domain's
       * SSL/TLS certificate.
       * Required if you enabled a custom endpoint for the domain.
       */
      public fun customEndpointCertificateArn(customEndpointCertificateArn: String)

      /**
       * @param customEndpointEnabled True to enable a custom endpoint for the domain.
       * If enabled, you must also provide values for `CustomEndpoint` and
       * `CustomEndpointCertificateArn` .
       */
      public fun customEndpointEnabled(customEndpointEnabled: Boolean)

      /**
       * @param customEndpointEnabled True to enable a custom endpoint for the domain.
       * If enabled, you must also provide values for `CustomEndpoint` and
       * `CustomEndpointCertificateArn` .
       */
      public fun customEndpointEnabled(customEndpointEnabled: IResolvable)

      /**
       * @param enforceHttps True to require that all traffic to the domain arrive over HTTPS.
       */
      public fun enforceHttps(enforceHttps: Boolean)

      /**
       * @param enforceHttps True to require that all traffic to the domain arrive over HTTPS.
       */
      public fun enforceHttps(enforceHttps: IResolvable)

      /**
       * @param tlsSecurityPolicy The minimum TLS version required for traffic to the domain. Valid
       * values are TLS 1.3 (recommended) or 1.2:.
       * * `Policy-Min-TLS-1-0-2019-07`
       * * `Policy-Min-TLS-1-2-2019-07`
       */
      public fun tlsSecurityPolicy(tlsSecurityPolicy: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.elasticsearch.CfnDomain.DomainEndpointOptionsProperty.Builder
          =
          software.amazon.awscdk.services.elasticsearch.CfnDomain.DomainEndpointOptionsProperty.builder()

      /**
       * @param customEndpoint The fully qualified URL for your custom endpoint.
       * Required if you enabled a custom endpoint for the domain.
       */
      override fun customEndpoint(customEndpoint: String) {
        cdkBuilder.customEndpoint(customEndpoint)
      }

      /**
       * @param customEndpointCertificateArn The AWS Certificate Manager ARN for your domain's
       * SSL/TLS certificate.
       * Required if you enabled a custom endpoint for the domain.
       */
      override fun customEndpointCertificateArn(customEndpointCertificateArn: String) {
        cdkBuilder.customEndpointCertificateArn(customEndpointCertificateArn)
      }

      /**
       * @param customEndpointEnabled True to enable a custom endpoint for the domain.
       * If enabled, you must also provide values for `CustomEndpoint` and
       * `CustomEndpointCertificateArn` .
       */
      override fun customEndpointEnabled(customEndpointEnabled: Boolean) {
        cdkBuilder.customEndpointEnabled(customEndpointEnabled)
      }

      /**
       * @param customEndpointEnabled True to enable a custom endpoint for the domain.
       * If enabled, you must also provide values for `CustomEndpoint` and
       * `CustomEndpointCertificateArn` .
       */
      override fun customEndpointEnabled(customEndpointEnabled: IResolvable) {
        cdkBuilder.customEndpointEnabled(customEndpointEnabled.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param enforceHttps True to require that all traffic to the domain arrive over HTTPS.
       */
      override fun enforceHttps(enforceHttps: Boolean) {
        cdkBuilder.enforceHttps(enforceHttps)
      }

      /**
       * @param enforceHttps True to require that all traffic to the domain arrive over HTTPS.
       */
      override fun enforceHttps(enforceHttps: IResolvable) {
        cdkBuilder.enforceHttps(enforceHttps.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param tlsSecurityPolicy The minimum TLS version required for traffic to the domain. Valid
       * values are TLS 1.3 (recommended) or 1.2:.
       * * `Policy-Min-TLS-1-0-2019-07`
       * * `Policy-Min-TLS-1-2-2019-07`
       */
      override fun tlsSecurityPolicy(tlsSecurityPolicy: String) {
        cdkBuilder.tlsSecurityPolicy(tlsSecurityPolicy)
      }

      public fun build():
          software.amazon.awscdk.services.elasticsearch.CfnDomain.DomainEndpointOptionsProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.elasticsearch.CfnDomain.DomainEndpointOptionsProperty,
    ) : CdkObject(cdkObject),
        DomainEndpointOptionsProperty {
      /**
       * The fully qualified URL for your custom endpoint.
       *
       * Required if you enabled a custom endpoint for the domain.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticsearch-domain-domainendpointoptions.html#cfn-elasticsearch-domain-domainendpointoptions-customendpoint)
       */
      override fun customEndpoint(): String? = unwrap(this).getCustomEndpoint()

      /**
       * The AWS Certificate Manager ARN for your domain's SSL/TLS certificate.
       *
       * Required if you enabled a custom endpoint for the domain.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticsearch-domain-domainendpointoptions.html#cfn-elasticsearch-domain-domainendpointoptions-customendpointcertificatearn)
       */
      override fun customEndpointCertificateArn(): String? =
          unwrap(this).getCustomEndpointCertificateArn()

      /**
       * True to enable a custom endpoint for the domain.
       *
       * If enabled, you must also provide values for `CustomEndpoint` and
       * `CustomEndpointCertificateArn` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticsearch-domain-domainendpointoptions.html#cfn-elasticsearch-domain-domainendpointoptions-customendpointenabled)
       */
      override fun customEndpointEnabled(): Any? = unwrap(this).getCustomEndpointEnabled()

      /**
       * True to require that all traffic to the domain arrive over HTTPS.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticsearch-domain-domainendpointoptions.html#cfn-elasticsearch-domain-domainendpointoptions-enforcehttps)
       */
      override fun enforceHttps(): Any? = unwrap(this).getEnforceHttps()

      /**
       * The minimum TLS version required for traffic to the domain. Valid values are TLS 1.3
       * (recommended) or 1.2:.
       *
       * * `Policy-Min-TLS-1-0-2019-07`
       * * `Policy-Min-TLS-1-2-2019-07`
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticsearch-domain-domainendpointoptions.html#cfn-elasticsearch-domain-domainendpointoptions-tlssecuritypolicy)
       */
      override fun tlsSecurityPolicy(): String? = unwrap(this).getTlsSecurityPolicy()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): DomainEndpointOptionsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.elasticsearch.CfnDomain.DomainEndpointOptionsProperty):
          DomainEndpointOptionsProperty = CdkObjectWrappers.wrap(cdkObject) as?
          DomainEndpointOptionsProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: DomainEndpointOptionsProperty):
          software.amazon.awscdk.services.elasticsearch.CfnDomain.DomainEndpointOptionsProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.elasticsearch.CfnDomain.DomainEndpointOptionsProperty
    }
  }

  /**
   * The configurations of Amazon Elastic Block Store (Amazon EBS) volumes that are attached to data
   * nodes in the OpenSearch Service domain.
   *
   * For more information, see [EBS volume size
   * limits](https://docs.aws.amazon.com/opensearch-service/latest/developerguide/limits.html#ebsresource)
   * in the *Amazon OpenSearch Service Developer Guide* .
   *
   *
   * The `AWS::Elasticsearch::Domain` resource is being replaced by the
   * [AWS::OpenSearchService::Domain](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opensearchservice-domain.html)
   * resource. While the legacy Elasticsearch resource and options are still supported, we recommend
   * modifying your existing Cloudformation templates to use the new OpenSearch Service resource, which
   * supports both OpenSearch and Elasticsearch. For more information about the service rename, see
   * [New resource
   * types](https://docs.aws.amazon.com/opensearch-service/latest/developerguide/rename.html#rename-resource)
   * in the *Amazon OpenSearch Service Developer Guide* .
   *
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.elasticsearch.*;
   * EBSOptionsProperty eBSOptionsProperty = EBSOptionsProperty.builder()
   * .ebsEnabled(false)
   * .iops(123)
   * .volumeSize(123)
   * .volumeType("volumeType")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticsearch-domain-ebsoptions.html)
   */
  public interface EBSOptionsProperty {
    /**
     * Specifies whether Amazon EBS volumes are attached to data nodes in the OpenSearch Service
     * domain.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticsearch-domain-ebsoptions.html#cfn-elasticsearch-domain-ebsoptions-ebsenabled)
     */
    public fun ebsEnabled(): Any? = unwrap(this).getEbsEnabled()

    /**
     * The number of I/O operations per second (IOPS) that the volume supports.
     *
     * This property applies only to provisioned IOPS EBS volume types.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticsearch-domain-ebsoptions.html#cfn-elasticsearch-domain-ebsoptions-iops)
     */
    public fun iops(): Number? = unwrap(this).getIops()

    /**
     * The size (in GiB) of the EBS volume for each data node.
     *
     * The minimum and maximum size of an EBS volume depends on the EBS volume type and the instance
     * type to which it is attached. For more information, see [EBS volume size
     * limits](https://docs.aws.amazon.com/opensearch-service/latest/developerguide/limits.html#ebsresource)
     * in the *Amazon OpenSearch Service Developer Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticsearch-domain-ebsoptions.html#cfn-elasticsearch-domain-ebsoptions-volumesize)
     */
    public fun volumeSize(): Number? = unwrap(this).getVolumeSize()

    /**
     * The EBS volume type to use with the OpenSearch Service domain, such as standard, gp2, or io1.
     *
     * For more information about each type, see [Amazon EBS volume
     * types](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/EBSVolumeTypes.html) in the *Amazon
     * EC2 User Guide for Linux Instances* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticsearch-domain-ebsoptions.html#cfn-elasticsearch-domain-ebsoptions-volumetype)
     */
    public fun volumeType(): String? = unwrap(this).getVolumeType()

    /**
     * A builder for [EBSOptionsProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param ebsEnabled Specifies whether Amazon EBS volumes are attached to data nodes in the
       * OpenSearch Service domain.
       */
      public fun ebsEnabled(ebsEnabled: Boolean)

      /**
       * @param ebsEnabled Specifies whether Amazon EBS volumes are attached to data nodes in the
       * OpenSearch Service domain.
       */
      public fun ebsEnabled(ebsEnabled: IResolvable)

      /**
       * @param iops The number of I/O operations per second (IOPS) that the volume supports.
       * This property applies only to provisioned IOPS EBS volume types.
       */
      public fun iops(iops: Number)

      /**
       * @param volumeSize The size (in GiB) of the EBS volume for each data node.
       * The minimum and maximum size of an EBS volume depends on the EBS volume type and the
       * instance type to which it is attached. For more information, see [EBS volume size
       * limits](https://docs.aws.amazon.com/opensearch-service/latest/developerguide/limits.html#ebsresource)
       * in the *Amazon OpenSearch Service Developer Guide* .
       */
      public fun volumeSize(volumeSize: Number)

      /**
       * @param volumeType The EBS volume type to use with the OpenSearch Service domain, such as
       * standard, gp2, or io1.
       * For more information about each type, see [Amazon EBS volume
       * types](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/EBSVolumeTypes.html) in the *Amazon
       * EC2 User Guide for Linux Instances* .
       */
      public fun volumeType(volumeType: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.elasticsearch.CfnDomain.EBSOptionsProperty.Builder =
          software.amazon.awscdk.services.elasticsearch.CfnDomain.EBSOptionsProperty.builder()

      /**
       * @param ebsEnabled Specifies whether Amazon EBS volumes are attached to data nodes in the
       * OpenSearch Service domain.
       */
      override fun ebsEnabled(ebsEnabled: Boolean) {
        cdkBuilder.ebsEnabled(ebsEnabled)
      }

      /**
       * @param ebsEnabled Specifies whether Amazon EBS volumes are attached to data nodes in the
       * OpenSearch Service domain.
       */
      override fun ebsEnabled(ebsEnabled: IResolvable) {
        cdkBuilder.ebsEnabled(ebsEnabled.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param iops The number of I/O operations per second (IOPS) that the volume supports.
       * This property applies only to provisioned IOPS EBS volume types.
       */
      override fun iops(iops: Number) {
        cdkBuilder.iops(iops)
      }

      /**
       * @param volumeSize The size (in GiB) of the EBS volume for each data node.
       * The minimum and maximum size of an EBS volume depends on the EBS volume type and the
       * instance type to which it is attached. For more information, see [EBS volume size
       * limits](https://docs.aws.amazon.com/opensearch-service/latest/developerguide/limits.html#ebsresource)
       * in the *Amazon OpenSearch Service Developer Guide* .
       */
      override fun volumeSize(volumeSize: Number) {
        cdkBuilder.volumeSize(volumeSize)
      }

      /**
       * @param volumeType The EBS volume type to use with the OpenSearch Service domain, such as
       * standard, gp2, or io1.
       * For more information about each type, see [Amazon EBS volume
       * types](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/EBSVolumeTypes.html) in the *Amazon
       * EC2 User Guide for Linux Instances* .
       */
      override fun volumeType(volumeType: String) {
        cdkBuilder.volumeType(volumeType)
      }

      public fun build(): software.amazon.awscdk.services.elasticsearch.CfnDomain.EBSOptionsProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.elasticsearch.CfnDomain.EBSOptionsProperty,
    ) : CdkObject(cdkObject),
        EBSOptionsProperty {
      /**
       * Specifies whether Amazon EBS volumes are attached to data nodes in the OpenSearch Service
       * domain.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticsearch-domain-ebsoptions.html#cfn-elasticsearch-domain-ebsoptions-ebsenabled)
       */
      override fun ebsEnabled(): Any? = unwrap(this).getEbsEnabled()

      /**
       * The number of I/O operations per second (IOPS) that the volume supports.
       *
       * This property applies only to provisioned IOPS EBS volume types.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticsearch-domain-ebsoptions.html#cfn-elasticsearch-domain-ebsoptions-iops)
       */
      override fun iops(): Number? = unwrap(this).getIops()

      /**
       * The size (in GiB) of the EBS volume for each data node.
       *
       * The minimum and maximum size of an EBS volume depends on the EBS volume type and the
       * instance type to which it is attached. For more information, see [EBS volume size
       * limits](https://docs.aws.amazon.com/opensearch-service/latest/developerguide/limits.html#ebsresource)
       * in the *Amazon OpenSearch Service Developer Guide* .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticsearch-domain-ebsoptions.html#cfn-elasticsearch-domain-ebsoptions-volumesize)
       */
      override fun volumeSize(): Number? = unwrap(this).getVolumeSize()

      /**
       * The EBS volume type to use with the OpenSearch Service domain, such as standard, gp2, or
       * io1.
       *
       * For more information about each type, see [Amazon EBS volume
       * types](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/EBSVolumeTypes.html) in the *Amazon
       * EC2 User Guide for Linux Instances* .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticsearch-domain-ebsoptions.html#cfn-elasticsearch-domain-ebsoptions-volumetype)
       */
      override fun volumeType(): String? = unwrap(this).getVolumeType()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): EBSOptionsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.elasticsearch.CfnDomain.EBSOptionsProperty):
          EBSOptionsProperty = CdkObjectWrappers.wrap(cdkObject) as? EBSOptionsProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: EBSOptionsProperty):
          software.amazon.awscdk.services.elasticsearch.CfnDomain.EBSOptionsProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.elasticsearch.CfnDomain.EBSOptionsProperty
    }
  }

  /**
   * The cluster configuration for the OpenSearch Service domain.
   *
   * You can specify options such as the instance type and the number of instances. For more
   * information, see [Creating and managing Amazon OpenSearch Service
   * domains](https://docs.aws.amazon.com/opensearch-service/latest/developerguide/createupdatedomains.html)
   * in the *Amazon OpenSearch Service Developer Guide* .
   *
   *
   * The `AWS::Elasticsearch::Domain` resource is being replaced by the
   * [AWS::OpenSearchService::Domain](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opensearchservice-domain.html)
   * resource. While the legacy Elasticsearch resource and options are still supported, we recommend
   * modifying your existing Cloudformation templates to use the new OpenSearch Service resource, which
   * supports both OpenSearch and Elasticsearch. For more information about the service rename, see
   * [New resource
   * types](https://docs.aws.amazon.com/opensearch-service/latest/developerguide/rename.html#rename-resource)
   * in the *Amazon OpenSearch Service Developer Guide* .
   *
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.elasticsearch.*;
   * ElasticsearchClusterConfigProperty elasticsearchClusterConfigProperty =
   * ElasticsearchClusterConfigProperty.builder()
   * .coldStorageOptions(ColdStorageOptionsProperty.builder()
   * .enabled(false)
   * .build())
   * .dedicatedMasterCount(123)
   * .dedicatedMasterEnabled(false)
   * .dedicatedMasterType("dedicatedMasterType")
   * .instanceCount(123)
   * .instanceType("instanceType")
   * .warmCount(123)
   * .warmEnabled(false)
   * .warmType("warmType")
   * .zoneAwarenessConfig(ZoneAwarenessConfigProperty.builder()
   * .availabilityZoneCount(123)
   * .build())
   * .zoneAwarenessEnabled(false)
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticsearch-domain-elasticsearchclusterconfig.html)
   */
  public interface ElasticsearchClusterConfigProperty {
    /**
     * Specifies cold storage options for the domain.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticsearch-domain-elasticsearchclusterconfig.html#cfn-elasticsearch-domain-elasticsearchclusterconfig-coldstorageoptions)
     */
    public fun coldStorageOptions(): Any? = unwrap(this).getColdStorageOptions()

    /**
     * The number of instances to use for the master node.
     *
     * If you specify this property, you must specify true for the DedicatedMasterEnabled property.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticsearch-domain-elasticsearchclusterconfig.html#cfn-elasticsearch-domain-elasticsearchclusterconfig-dedicatedmastercount)
     */
    public fun dedicatedMasterCount(): Number? = unwrap(this).getDedicatedMasterCount()

    /**
     * Indicates whether to use a dedicated master node for the OpenSearch Service domain.
     *
     * A dedicated master node is a cluster node that performs cluster management tasks, but doesn't
     * hold data or respond to data upload requests. Dedicated master nodes offload cluster management
     * tasks to increase the stability of your search clusters. See [Dedicated master nodes in Amazon
     * OpenSearch
     * Service](https://docs.aws.amazon.com/opensearch-service/latest/developerguide/managedomains-dedicatedmasternodes.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticsearch-domain-elasticsearchclusterconfig.html#cfn-elasticsearch-domain-elasticsearchclusterconfig-dedicatedmasterenabled)
     */
    public fun dedicatedMasterEnabled(): Any? = unwrap(this).getDedicatedMasterEnabled()

    /**
     * The hardware configuration of the computer that hosts the dedicated master node, such as
     * `m3.medium.elasticsearch` . If you specify this property, you must specify true for the
     * `DedicatedMasterEnabled` property. For valid values, see [Supported instance types in Amazon
     * OpenSearch
     * Service](https://docs.aws.amazon.com/opensearch-service/latest/developerguide/supported-instance-types.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticsearch-domain-elasticsearchclusterconfig.html#cfn-elasticsearch-domain-elasticsearchclusterconfig-dedicatedmastertype)
     */
    public fun dedicatedMasterType(): String? = unwrap(this).getDedicatedMasterType()

    /**
     * The number of data nodes (instances) to use in the OpenSearch Service domain.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticsearch-domain-elasticsearchclusterconfig.html#cfn-elasticsearch-domain-elasticsearchclusterconfig-instancecount)
     */
    public fun instanceCount(): Number? = unwrap(this).getInstanceCount()

    /**
     * The instance type for your data nodes, such as `m3.medium.elasticsearch` . For valid values,
     * see [Supported instance types in Amazon OpenSearch
     * Service](https://docs.aws.amazon.com/opensearch-service/latest/developerguide/supported-instance-types.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticsearch-domain-elasticsearchclusterconfig.html#cfn-elasticsearch-domain-elasticsearchclusterconfig-instancetype)
     */
    public fun instanceType(): String? = unwrap(this).getInstanceType()

    /**
     * The number of warm nodes in the cluster.
     *
     * Required if you enable warm storage.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticsearch-domain-elasticsearchclusterconfig.html#cfn-elasticsearch-domain-elasticsearchclusterconfig-warmcount)
     */
    public fun warmCount(): Number? = unwrap(this).getWarmCount()

    /**
     * Whether to enable warm storage for the cluster.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticsearch-domain-elasticsearchclusterconfig.html#cfn-elasticsearch-domain-elasticsearchclusterconfig-warmenabled)
     */
    public fun warmEnabled(): Any? = unwrap(this).getWarmEnabled()

    /**
     * The instance type for the cluster's warm nodes.
     *
     * Required if you enable warm storage.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticsearch-domain-elasticsearchclusterconfig.html#cfn-elasticsearch-domain-elasticsearchclusterconfig-warmtype)
     */
    public fun warmType(): String? = unwrap(this).getWarmType()

    /**
     * Specifies zone awareness configuration options.
     *
     * Only use if `ZoneAwarenessEnabled` is `true` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticsearch-domain-elasticsearchclusterconfig.html#cfn-elasticsearch-domain-elasticsearchclusterconfig-zoneawarenessconfig)
     */
    public fun zoneAwarenessConfig(): Any? = unwrap(this).getZoneAwarenessConfig()

    /**
     * Indicates whether to enable zone awareness for the OpenSearch Service domain.
     *
     * When you enable zone awareness, OpenSearch Service allocates the nodes and replica index
     * shards that belong to a cluster across two Availability Zones (AZs) in the same region to
     * prevent data loss and minimize downtime in the event of node or data center failure. Don't
     * enable zone awareness if your cluster has no replica index shards or is a single-node cluster.
     * For more information, see [Configuring a multi-AZ domain in Amazon OpenSearch
     * Service](https://docs.aws.amazon.com/opensearch-service/latest/developerguide/managedomains-multiaz.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticsearch-domain-elasticsearchclusterconfig.html#cfn-elasticsearch-domain-elasticsearchclusterconfig-zoneawarenessenabled)
     */
    public fun zoneAwarenessEnabled(): Any? = unwrap(this).getZoneAwarenessEnabled()

    /**
     * A builder for [ElasticsearchClusterConfigProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param coldStorageOptions Specifies cold storage options for the domain.
       */
      public fun coldStorageOptions(coldStorageOptions: IResolvable)

      /**
       * @param coldStorageOptions Specifies cold storage options for the domain.
       */
      public fun coldStorageOptions(coldStorageOptions: ColdStorageOptionsProperty)

      /**
       * @param coldStorageOptions Specifies cold storage options for the domain.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("422146e369f2bd2058d64bd25b67c7c132c1c7cd214cc901c1b4df6c7519c19d")
      public
          fun coldStorageOptions(coldStorageOptions: ColdStorageOptionsProperty.Builder.() -> Unit)

      /**
       * @param dedicatedMasterCount The number of instances to use for the master node.
       * If you specify this property, you must specify true for the DedicatedMasterEnabled
       * property.
       */
      public fun dedicatedMasterCount(dedicatedMasterCount: Number)

      /**
       * @param dedicatedMasterEnabled Indicates whether to use a dedicated master node for the
       * OpenSearch Service domain.
       * A dedicated master node is a cluster node that performs cluster management tasks, but
       * doesn't hold data or respond to data upload requests. Dedicated master nodes offload cluster
       * management tasks to increase the stability of your search clusters. See [Dedicated master
       * nodes in Amazon OpenSearch
       * Service](https://docs.aws.amazon.com/opensearch-service/latest/developerguide/managedomains-dedicatedmasternodes.html)
       * .
       */
      public fun dedicatedMasterEnabled(dedicatedMasterEnabled: Boolean)

      /**
       * @param dedicatedMasterEnabled Indicates whether to use a dedicated master node for the
       * OpenSearch Service domain.
       * A dedicated master node is a cluster node that performs cluster management tasks, but
       * doesn't hold data or respond to data upload requests. Dedicated master nodes offload cluster
       * management tasks to increase the stability of your search clusters. See [Dedicated master
       * nodes in Amazon OpenSearch
       * Service](https://docs.aws.amazon.com/opensearch-service/latest/developerguide/managedomains-dedicatedmasternodes.html)
       * .
       */
      public fun dedicatedMasterEnabled(dedicatedMasterEnabled: IResolvable)

      /**
       * @param dedicatedMasterType The hardware configuration of the computer that hosts the
       * dedicated master node, such as `m3.medium.elasticsearch` . If you specify this property, you
       * must specify true for the `DedicatedMasterEnabled` property. For valid values, see [Supported
       * instance types in Amazon OpenSearch
       * Service](https://docs.aws.amazon.com/opensearch-service/latest/developerguide/supported-instance-types.html)
       * .
       */
      public fun dedicatedMasterType(dedicatedMasterType: String)

      /**
       * @param instanceCount The number of data nodes (instances) to use in the OpenSearch Service
       * domain.
       */
      public fun instanceCount(instanceCount: Number)

      /**
       * @param instanceType The instance type for your data nodes, such as
       * `m3.medium.elasticsearch` . For valid values, see [Supported instance types in Amazon
       * OpenSearch
       * Service](https://docs.aws.amazon.com/opensearch-service/latest/developerguide/supported-instance-types.html)
       * .
       */
      public fun instanceType(instanceType: String)

      /**
       * @param warmCount The number of warm nodes in the cluster.
       * Required if you enable warm storage.
       */
      public fun warmCount(warmCount: Number)

      /**
       * @param warmEnabled Whether to enable warm storage for the cluster.
       */
      public fun warmEnabled(warmEnabled: Boolean)

      /**
       * @param warmEnabled Whether to enable warm storage for the cluster.
       */
      public fun warmEnabled(warmEnabled: IResolvable)

      /**
       * @param warmType The instance type for the cluster's warm nodes.
       * Required if you enable warm storage.
       */
      public fun warmType(warmType: String)

      /**
       * @param zoneAwarenessConfig Specifies zone awareness configuration options.
       * Only use if `ZoneAwarenessEnabled` is `true` .
       */
      public fun zoneAwarenessConfig(zoneAwarenessConfig: IResolvable)

      /**
       * @param zoneAwarenessConfig Specifies zone awareness configuration options.
       * Only use if `ZoneAwarenessEnabled` is `true` .
       */
      public fun zoneAwarenessConfig(zoneAwarenessConfig: ZoneAwarenessConfigProperty)

      /**
       * @param zoneAwarenessConfig Specifies zone awareness configuration options.
       * Only use if `ZoneAwarenessEnabled` is `true` .
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("934fdbf4a6c0696b943b2d5c8721ebac46efd04bbe642d45996d5fb74040eb3c")
      public
          fun zoneAwarenessConfig(zoneAwarenessConfig: ZoneAwarenessConfigProperty.Builder.() -> Unit)

      /**
       * @param zoneAwarenessEnabled Indicates whether to enable zone awareness for the OpenSearch
       * Service domain.
       * When you enable zone awareness, OpenSearch Service allocates the nodes and replica index
       * shards that belong to a cluster across two Availability Zones (AZs) in the same region to
       * prevent data loss and minimize downtime in the event of node or data center failure. Don't
       * enable zone awareness if your cluster has no replica index shards or is a single-node cluster.
       * For more information, see [Configuring a multi-AZ domain in Amazon OpenSearch
       * Service](https://docs.aws.amazon.com/opensearch-service/latest/developerguide/managedomains-multiaz.html)
       * .
       */
      public fun zoneAwarenessEnabled(zoneAwarenessEnabled: Boolean)

      /**
       * @param zoneAwarenessEnabled Indicates whether to enable zone awareness for the OpenSearch
       * Service domain.
       * When you enable zone awareness, OpenSearch Service allocates the nodes and replica index
       * shards that belong to a cluster across two Availability Zones (AZs) in the same region to
       * prevent data loss and minimize downtime in the event of node or data center failure. Don't
       * enable zone awareness if your cluster has no replica index shards or is a single-node cluster.
       * For more information, see [Configuring a multi-AZ domain in Amazon OpenSearch
       * Service](https://docs.aws.amazon.com/opensearch-service/latest/developerguide/managedomains-multiaz.html)
       * .
       */
      public fun zoneAwarenessEnabled(zoneAwarenessEnabled: IResolvable)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.elasticsearch.CfnDomain.ElasticsearchClusterConfigProperty.Builder
          =
          software.amazon.awscdk.services.elasticsearch.CfnDomain.ElasticsearchClusterConfigProperty.builder()

      /**
       * @param coldStorageOptions Specifies cold storage options for the domain.
       */
      override fun coldStorageOptions(coldStorageOptions: IResolvable) {
        cdkBuilder.coldStorageOptions(coldStorageOptions.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param coldStorageOptions Specifies cold storage options for the domain.
       */
      override fun coldStorageOptions(coldStorageOptions: ColdStorageOptionsProperty) {
        cdkBuilder.coldStorageOptions(coldStorageOptions.let(ColdStorageOptionsProperty.Companion::unwrap))
      }

      /**
       * @param coldStorageOptions Specifies cold storage options for the domain.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("422146e369f2bd2058d64bd25b67c7c132c1c7cd214cc901c1b4df6c7519c19d")
      override
          fun coldStorageOptions(coldStorageOptions: ColdStorageOptionsProperty.Builder.() -> Unit):
          Unit = coldStorageOptions(ColdStorageOptionsProperty(coldStorageOptions))

      /**
       * @param dedicatedMasterCount The number of instances to use for the master node.
       * If you specify this property, you must specify true for the DedicatedMasterEnabled
       * property.
       */
      override fun dedicatedMasterCount(dedicatedMasterCount: Number) {
        cdkBuilder.dedicatedMasterCount(dedicatedMasterCount)
      }

      /**
       * @param dedicatedMasterEnabled Indicates whether to use a dedicated master node for the
       * OpenSearch Service domain.
       * A dedicated master node is a cluster node that performs cluster management tasks, but
       * doesn't hold data or respond to data upload requests. Dedicated master nodes offload cluster
       * management tasks to increase the stability of your search clusters. See [Dedicated master
       * nodes in Amazon OpenSearch
       * Service](https://docs.aws.amazon.com/opensearch-service/latest/developerguide/managedomains-dedicatedmasternodes.html)
       * .
       */
      override fun dedicatedMasterEnabled(dedicatedMasterEnabled: Boolean) {
        cdkBuilder.dedicatedMasterEnabled(dedicatedMasterEnabled)
      }

      /**
       * @param dedicatedMasterEnabled Indicates whether to use a dedicated master node for the
       * OpenSearch Service domain.
       * A dedicated master node is a cluster node that performs cluster management tasks, but
       * doesn't hold data or respond to data upload requests. Dedicated master nodes offload cluster
       * management tasks to increase the stability of your search clusters. See [Dedicated master
       * nodes in Amazon OpenSearch
       * Service](https://docs.aws.amazon.com/opensearch-service/latest/developerguide/managedomains-dedicatedmasternodes.html)
       * .
       */
      override fun dedicatedMasterEnabled(dedicatedMasterEnabled: IResolvable) {
        cdkBuilder.dedicatedMasterEnabled(dedicatedMasterEnabled.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param dedicatedMasterType The hardware configuration of the computer that hosts the
       * dedicated master node, such as `m3.medium.elasticsearch` . If you specify this property, you
       * must specify true for the `DedicatedMasterEnabled` property. For valid values, see [Supported
       * instance types in Amazon OpenSearch
       * Service](https://docs.aws.amazon.com/opensearch-service/latest/developerguide/supported-instance-types.html)
       * .
       */
      override fun dedicatedMasterType(dedicatedMasterType: String) {
        cdkBuilder.dedicatedMasterType(dedicatedMasterType)
      }

      /**
       * @param instanceCount The number of data nodes (instances) to use in the OpenSearch Service
       * domain.
       */
      override fun instanceCount(instanceCount: Number) {
        cdkBuilder.instanceCount(instanceCount)
      }

      /**
       * @param instanceType The instance type for your data nodes, such as
       * `m3.medium.elasticsearch` . For valid values, see [Supported instance types in Amazon
       * OpenSearch
       * Service](https://docs.aws.amazon.com/opensearch-service/latest/developerguide/supported-instance-types.html)
       * .
       */
      override fun instanceType(instanceType: String) {
        cdkBuilder.instanceType(instanceType)
      }

      /**
       * @param warmCount The number of warm nodes in the cluster.
       * Required if you enable warm storage.
       */
      override fun warmCount(warmCount: Number) {
        cdkBuilder.warmCount(warmCount)
      }

      /**
       * @param warmEnabled Whether to enable warm storage for the cluster.
       */
      override fun warmEnabled(warmEnabled: Boolean) {
        cdkBuilder.warmEnabled(warmEnabled)
      }

      /**
       * @param warmEnabled Whether to enable warm storage for the cluster.
       */
      override fun warmEnabled(warmEnabled: IResolvable) {
        cdkBuilder.warmEnabled(warmEnabled.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param warmType The instance type for the cluster's warm nodes.
       * Required if you enable warm storage.
       */
      override fun warmType(warmType: String) {
        cdkBuilder.warmType(warmType)
      }

      /**
       * @param zoneAwarenessConfig Specifies zone awareness configuration options.
       * Only use if `ZoneAwarenessEnabled` is `true` .
       */
      override fun zoneAwarenessConfig(zoneAwarenessConfig: IResolvable) {
        cdkBuilder.zoneAwarenessConfig(zoneAwarenessConfig.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param zoneAwarenessConfig Specifies zone awareness configuration options.
       * Only use if `ZoneAwarenessEnabled` is `true` .
       */
      override fun zoneAwarenessConfig(zoneAwarenessConfig: ZoneAwarenessConfigProperty) {
        cdkBuilder.zoneAwarenessConfig(zoneAwarenessConfig.let(ZoneAwarenessConfigProperty.Companion::unwrap))
      }

      /**
       * @param zoneAwarenessConfig Specifies zone awareness configuration options.
       * Only use if `ZoneAwarenessEnabled` is `true` .
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("934fdbf4a6c0696b943b2d5c8721ebac46efd04bbe642d45996d5fb74040eb3c")
      override
          fun zoneAwarenessConfig(zoneAwarenessConfig: ZoneAwarenessConfigProperty.Builder.() -> Unit):
          Unit = zoneAwarenessConfig(ZoneAwarenessConfigProperty(zoneAwarenessConfig))

      /**
       * @param zoneAwarenessEnabled Indicates whether to enable zone awareness for the OpenSearch
       * Service domain.
       * When you enable zone awareness, OpenSearch Service allocates the nodes and replica index
       * shards that belong to a cluster across two Availability Zones (AZs) in the same region to
       * prevent data loss and minimize downtime in the event of node or data center failure. Don't
       * enable zone awareness if your cluster has no replica index shards or is a single-node cluster.
       * For more information, see [Configuring a multi-AZ domain in Amazon OpenSearch
       * Service](https://docs.aws.amazon.com/opensearch-service/latest/developerguide/managedomains-multiaz.html)
       * .
       */
      override fun zoneAwarenessEnabled(zoneAwarenessEnabled: Boolean) {
        cdkBuilder.zoneAwarenessEnabled(zoneAwarenessEnabled)
      }

      /**
       * @param zoneAwarenessEnabled Indicates whether to enable zone awareness for the OpenSearch
       * Service domain.
       * When you enable zone awareness, OpenSearch Service allocates the nodes and replica index
       * shards that belong to a cluster across two Availability Zones (AZs) in the same region to
       * prevent data loss and minimize downtime in the event of node or data center failure. Don't
       * enable zone awareness if your cluster has no replica index shards or is a single-node cluster.
       * For more information, see [Configuring a multi-AZ domain in Amazon OpenSearch
       * Service](https://docs.aws.amazon.com/opensearch-service/latest/developerguide/managedomains-multiaz.html)
       * .
       */
      override fun zoneAwarenessEnabled(zoneAwarenessEnabled: IResolvable) {
        cdkBuilder.zoneAwarenessEnabled(zoneAwarenessEnabled.let(IResolvable.Companion::unwrap))
      }

      public fun build():
          software.amazon.awscdk.services.elasticsearch.CfnDomain.ElasticsearchClusterConfigProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.elasticsearch.CfnDomain.ElasticsearchClusterConfigProperty,
    ) : CdkObject(cdkObject),
        ElasticsearchClusterConfigProperty {
      /**
       * Specifies cold storage options for the domain.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticsearch-domain-elasticsearchclusterconfig.html#cfn-elasticsearch-domain-elasticsearchclusterconfig-coldstorageoptions)
       */
      override fun coldStorageOptions(): Any? = unwrap(this).getColdStorageOptions()

      /**
       * The number of instances to use for the master node.
       *
       * If you specify this property, you must specify true for the DedicatedMasterEnabled
       * property.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticsearch-domain-elasticsearchclusterconfig.html#cfn-elasticsearch-domain-elasticsearchclusterconfig-dedicatedmastercount)
       */
      override fun dedicatedMasterCount(): Number? = unwrap(this).getDedicatedMasterCount()

      /**
       * Indicates whether to use a dedicated master node for the OpenSearch Service domain.
       *
       * A dedicated master node is a cluster node that performs cluster management tasks, but
       * doesn't hold data or respond to data upload requests. Dedicated master nodes offload cluster
       * management tasks to increase the stability of your search clusters. See [Dedicated master
       * nodes in Amazon OpenSearch
       * Service](https://docs.aws.amazon.com/opensearch-service/latest/developerguide/managedomains-dedicatedmasternodes.html)
       * .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticsearch-domain-elasticsearchclusterconfig.html#cfn-elasticsearch-domain-elasticsearchclusterconfig-dedicatedmasterenabled)
       */
      override fun dedicatedMasterEnabled(): Any? = unwrap(this).getDedicatedMasterEnabled()

      /**
       * The hardware configuration of the computer that hosts the dedicated master node, such as
       * `m3.medium.elasticsearch` . If you specify this property, you must specify true for the
       * `DedicatedMasterEnabled` property. For valid values, see [Supported instance types in Amazon
       * OpenSearch
       * Service](https://docs.aws.amazon.com/opensearch-service/latest/developerguide/supported-instance-types.html)
       * .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticsearch-domain-elasticsearchclusterconfig.html#cfn-elasticsearch-domain-elasticsearchclusterconfig-dedicatedmastertype)
       */
      override fun dedicatedMasterType(): String? = unwrap(this).getDedicatedMasterType()

      /**
       * The number of data nodes (instances) to use in the OpenSearch Service domain.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticsearch-domain-elasticsearchclusterconfig.html#cfn-elasticsearch-domain-elasticsearchclusterconfig-instancecount)
       */
      override fun instanceCount(): Number? = unwrap(this).getInstanceCount()

      /**
       * The instance type for your data nodes, such as `m3.medium.elasticsearch` . For valid
       * values, see [Supported instance types in Amazon OpenSearch
       * Service](https://docs.aws.amazon.com/opensearch-service/latest/developerguide/supported-instance-types.html)
       * .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticsearch-domain-elasticsearchclusterconfig.html#cfn-elasticsearch-domain-elasticsearchclusterconfig-instancetype)
       */
      override fun instanceType(): String? = unwrap(this).getInstanceType()

      /**
       * The number of warm nodes in the cluster.
       *
       * Required if you enable warm storage.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticsearch-domain-elasticsearchclusterconfig.html#cfn-elasticsearch-domain-elasticsearchclusterconfig-warmcount)
       */
      override fun warmCount(): Number? = unwrap(this).getWarmCount()

      /**
       * Whether to enable warm storage for the cluster.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticsearch-domain-elasticsearchclusterconfig.html#cfn-elasticsearch-domain-elasticsearchclusterconfig-warmenabled)
       */
      override fun warmEnabled(): Any? = unwrap(this).getWarmEnabled()

      /**
       * The instance type for the cluster's warm nodes.
       *
       * Required if you enable warm storage.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticsearch-domain-elasticsearchclusterconfig.html#cfn-elasticsearch-domain-elasticsearchclusterconfig-warmtype)
       */
      override fun warmType(): String? = unwrap(this).getWarmType()

      /**
       * Specifies zone awareness configuration options.
       *
       * Only use if `ZoneAwarenessEnabled` is `true` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticsearch-domain-elasticsearchclusterconfig.html#cfn-elasticsearch-domain-elasticsearchclusterconfig-zoneawarenessconfig)
       */
      override fun zoneAwarenessConfig(): Any? = unwrap(this).getZoneAwarenessConfig()

      /**
       * Indicates whether to enable zone awareness for the OpenSearch Service domain.
       *
       * When you enable zone awareness, OpenSearch Service allocates the nodes and replica index
       * shards that belong to a cluster across two Availability Zones (AZs) in the same region to
       * prevent data loss and minimize downtime in the event of node or data center failure. Don't
       * enable zone awareness if your cluster has no replica index shards or is a single-node cluster.
       * For more information, see [Configuring a multi-AZ domain in Amazon OpenSearch
       * Service](https://docs.aws.amazon.com/opensearch-service/latest/developerguide/managedomains-multiaz.html)
       * .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticsearch-domain-elasticsearchclusterconfig.html#cfn-elasticsearch-domain-elasticsearchclusterconfig-zoneawarenessenabled)
       */
      override fun zoneAwarenessEnabled(): Any? = unwrap(this).getZoneAwarenessEnabled()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          ElasticsearchClusterConfigProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.elasticsearch.CfnDomain.ElasticsearchClusterConfigProperty):
          ElasticsearchClusterConfigProperty = CdkObjectWrappers.wrap(cdkObject) as?
          ElasticsearchClusterConfigProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: ElasticsearchClusterConfigProperty):
          software.amazon.awscdk.services.elasticsearch.CfnDomain.ElasticsearchClusterConfigProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.elasticsearch.CfnDomain.ElasticsearchClusterConfigProperty
    }
  }

  /**
   * Whether the domain should encrypt data at rest, and if so, the AWS Key Management Service key
   * to use.
   *
   *
   * The `AWS::Elasticsearch::Domain` resource is being replaced by the
   * [AWS::OpenSearchService::Domain](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opensearchservice-domain.html)
   * resource. While the legacy Elasticsearch resource and options are still supported, we recommend
   * modifying your existing Cloudformation templates to use the new OpenSearch Service resource, which
   * supports both OpenSearch and Elasticsearch. For more information about the service rename, see
   * [New resource
   * types](https://docs.aws.amazon.com/opensearch-service/latest/developerguide/rename.html#rename-resource)
   * in the *Amazon OpenSearch Service Developer Guide* .
   *
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.elasticsearch.*;
   * EncryptionAtRestOptionsProperty encryptionAtRestOptionsProperty =
   * EncryptionAtRestOptionsProperty.builder()
   * .enabled(false)
   * .kmsKeyId("kmsKeyId")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticsearch-domain-encryptionatrestoptions.html)
   */
  public interface EncryptionAtRestOptionsProperty {
    /**
     * Specify `true` to enable encryption at rest.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticsearch-domain-encryptionatrestoptions.html#cfn-elasticsearch-domain-encryptionatrestoptions-enabled)
     */
    public fun enabled(): Any? = unwrap(this).getEnabled()

    /**
     * The KMS key ID.
     *
     * Takes the form `1a2a3a4-1a2a-3a4a-5a6a-1a2a3a4a5a6a` . Required if you enable encryption at
     * rest.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticsearch-domain-encryptionatrestoptions.html#cfn-elasticsearch-domain-encryptionatrestoptions-kmskeyid)
     */
    public fun kmsKeyId(): String? = unwrap(this).getKmsKeyId()

    /**
     * A builder for [EncryptionAtRestOptionsProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param enabled Specify `true` to enable encryption at rest.
       */
      public fun enabled(enabled: Boolean)

      /**
       * @param enabled Specify `true` to enable encryption at rest.
       */
      public fun enabled(enabled: IResolvable)

      /**
       * @param kmsKeyId The KMS key ID.
       * Takes the form `1a2a3a4-1a2a-3a4a-5a6a-1a2a3a4a5a6a` . Required if you enable encryption at
       * rest.
       */
      public fun kmsKeyId(kmsKeyId: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.elasticsearch.CfnDomain.EncryptionAtRestOptionsProperty.Builder
          =
          software.amazon.awscdk.services.elasticsearch.CfnDomain.EncryptionAtRestOptionsProperty.builder()

      /**
       * @param enabled Specify `true` to enable encryption at rest.
       */
      override fun enabled(enabled: Boolean) {
        cdkBuilder.enabled(enabled)
      }

      /**
       * @param enabled Specify `true` to enable encryption at rest.
       */
      override fun enabled(enabled: IResolvable) {
        cdkBuilder.enabled(enabled.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param kmsKeyId The KMS key ID.
       * Takes the form `1a2a3a4-1a2a-3a4a-5a6a-1a2a3a4a5a6a` . Required if you enable encryption at
       * rest.
       */
      override fun kmsKeyId(kmsKeyId: String) {
        cdkBuilder.kmsKeyId(kmsKeyId)
      }

      public fun build():
          software.amazon.awscdk.services.elasticsearch.CfnDomain.EncryptionAtRestOptionsProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.elasticsearch.CfnDomain.EncryptionAtRestOptionsProperty,
    ) : CdkObject(cdkObject),
        EncryptionAtRestOptionsProperty {
      /**
       * Specify `true` to enable encryption at rest.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticsearch-domain-encryptionatrestoptions.html#cfn-elasticsearch-domain-encryptionatrestoptions-enabled)
       */
      override fun enabled(): Any? = unwrap(this).getEnabled()

      /**
       * The KMS key ID.
       *
       * Takes the form `1a2a3a4-1a2a-3a4a-5a6a-1a2a3a4a5a6a` . Required if you enable encryption at
       * rest.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticsearch-domain-encryptionatrestoptions.html#cfn-elasticsearch-domain-encryptionatrestoptions-kmskeyid)
       */
      override fun kmsKeyId(): String? = unwrap(this).getKmsKeyId()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): EncryptionAtRestOptionsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.elasticsearch.CfnDomain.EncryptionAtRestOptionsProperty):
          EncryptionAtRestOptionsProperty = CdkObjectWrappers.wrap(cdkObject) as?
          EncryptionAtRestOptionsProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: EncryptionAtRestOptionsProperty):
          software.amazon.awscdk.services.elasticsearch.CfnDomain.EncryptionAtRestOptionsProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.elasticsearch.CfnDomain.EncryptionAtRestOptionsProperty
    }
  }

  /**
   * The `AWS::Elasticsearch::Domain` resource is being replaced by the
   * [AWS::OpenSearchService::Domain](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opensearchservice-domain.html)
   * resource. While the legacy Elasticsearch resource and options are still supported, we recommend
   * modifying your existing Cloudformation templates to use the new OpenSearch Service resource, which
   * supports both OpenSearch and Elasticsearch. For more information about the service rename, see
   * [New resource
   * types](https://docs.aws.amazon.com/opensearch-service/latest/developerguide/rename.html#rename-resource)
   * in the *Amazon OpenSearch Service Developer Guide* .
   *
   * Specifies whether the OpenSearch Service domain publishes the Elasticsearch application, search
   * slow logs, or index slow logs to Amazon CloudWatch. Each option must be an object of name
   * `SEARCH_SLOW_LOGS` , `ES_APPLICATION_LOGS` , `INDEX_SLOW_LOGS` , or `AUDIT_LOGS` depending on the
   * type of logs you want to publish.
   *
   * If you enable a slow log, you still have to enable the *collection* of slow logs using the
   * Configuration API. To learn more, see [Enabling log publishing ( AWS
   * CLI)](https://docs.aws.amazon.com/opensearch-service/latest/developerguide/createdomain-configure-slow-logs.html#createdomain-configure-slow-logs-cli)
   * .
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.elasticsearch.*;
   * LogPublishingOptionProperty logPublishingOptionProperty = LogPublishingOptionProperty.builder()
   * .cloudWatchLogsLogGroupArn("cloudWatchLogsLogGroupArn")
   * .enabled(false)
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticsearch-domain-logpublishingoption.html)
   */
  public interface LogPublishingOptionProperty {
    /**
     * Specifies the CloudWatch log group to publish to.
     *
     * Required if you enable log publishing for the domain.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticsearch-domain-logpublishingoption.html#cfn-elasticsearch-domain-logpublishingoption-cloudwatchlogsloggrouparn)
     */
    public fun cloudWatchLogsLogGroupArn(): String? = unwrap(this).getCloudWatchLogsLogGroupArn()

    /**
     * If `true` , enables the publishing of logs to CloudWatch.
     *
     * Default: `false` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticsearch-domain-logpublishingoption.html#cfn-elasticsearch-domain-logpublishingoption-enabled)
     */
    public fun enabled(): Any? = unwrap(this).getEnabled()

    /**
     * A builder for [LogPublishingOptionProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param cloudWatchLogsLogGroupArn Specifies the CloudWatch log group to publish to.
       * Required if you enable log publishing for the domain.
       */
      public fun cloudWatchLogsLogGroupArn(cloudWatchLogsLogGroupArn: String)

      /**
       * @param enabled If `true` , enables the publishing of logs to CloudWatch.
       * Default: `false` .
       */
      public fun enabled(enabled: Boolean)

      /**
       * @param enabled If `true` , enables the publishing of logs to CloudWatch.
       * Default: `false` .
       */
      public fun enabled(enabled: IResolvable)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.elasticsearch.CfnDomain.LogPublishingOptionProperty.Builder
          =
          software.amazon.awscdk.services.elasticsearch.CfnDomain.LogPublishingOptionProperty.builder()

      /**
       * @param cloudWatchLogsLogGroupArn Specifies the CloudWatch log group to publish to.
       * Required if you enable log publishing for the domain.
       */
      override fun cloudWatchLogsLogGroupArn(cloudWatchLogsLogGroupArn: String) {
        cdkBuilder.cloudWatchLogsLogGroupArn(cloudWatchLogsLogGroupArn)
      }

      /**
       * @param enabled If `true` , enables the publishing of logs to CloudWatch.
       * Default: `false` .
       */
      override fun enabled(enabled: Boolean) {
        cdkBuilder.enabled(enabled)
      }

      /**
       * @param enabled If `true` , enables the publishing of logs to CloudWatch.
       * Default: `false` .
       */
      override fun enabled(enabled: IResolvable) {
        cdkBuilder.enabled(enabled.let(IResolvable.Companion::unwrap))
      }

      public fun build():
          software.amazon.awscdk.services.elasticsearch.CfnDomain.LogPublishingOptionProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.elasticsearch.CfnDomain.LogPublishingOptionProperty,
    ) : CdkObject(cdkObject),
        LogPublishingOptionProperty {
      /**
       * Specifies the CloudWatch log group to publish to.
       *
       * Required if you enable log publishing for the domain.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticsearch-domain-logpublishingoption.html#cfn-elasticsearch-domain-logpublishingoption-cloudwatchlogsloggrouparn)
       */
      override fun cloudWatchLogsLogGroupArn(): String? =
          unwrap(this).getCloudWatchLogsLogGroupArn()

      /**
       * If `true` , enables the publishing of logs to CloudWatch.
       *
       * Default: `false` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticsearch-domain-logpublishingoption.html#cfn-elasticsearch-domain-logpublishingoption-enabled)
       */
      override fun enabled(): Any? = unwrap(this).getEnabled()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): LogPublishingOptionProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.elasticsearch.CfnDomain.LogPublishingOptionProperty):
          LogPublishingOptionProperty = CdkObjectWrappers.wrap(cdkObject) as?
          LogPublishingOptionProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: LogPublishingOptionProperty):
          software.amazon.awscdk.services.elasticsearch.CfnDomain.LogPublishingOptionProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.elasticsearch.CfnDomain.LogPublishingOptionProperty
    }
  }

  /**
   * Specifies information about the master user. Required if you enabled the internal user
   * database.
   *
   *
   * The `AWS::Elasticsearch::Domain` resource is being replaced by the
   * [AWS::OpenSearchService::Domain](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opensearchservice-domain.html)
   * resource. While the legacy Elasticsearch resource and options are still supported, we recommend
   * modifying your existing Cloudformation templates to use the new OpenSearch Service resource, which
   * supports both OpenSearch and Elasticsearch. For more information about the service rename, see
   * [New resource
   * types](https://docs.aws.amazon.com/opensearch-service/latest/developerguide/rename.html#rename-resource)
   * in the *Amazon OpenSearch Service Developer Guide* .
   *
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.elasticsearch.*;
   * MasterUserOptionsProperty masterUserOptionsProperty = MasterUserOptionsProperty.builder()
   * .masterUserArn("masterUserArn")
   * .masterUserName("masterUserName")
   * .masterUserPassword("masterUserPassword")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticsearch-domain-masteruseroptions.html)
   */
  public interface MasterUserOptionsProperty {
    /**
     * ARN for the master user.
     *
     * Only specify if `InternalUserDatabaseEnabled` is false in `AdvancedSecurityOptions` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticsearch-domain-masteruseroptions.html#cfn-elasticsearch-domain-masteruseroptions-masteruserarn)
     */
    public fun masterUserArn(): String? = unwrap(this).getMasterUserArn()

    /**
     * Username for the master user.
     *
     * Only specify if `InternalUserDatabaseEnabled` is true in `AdvancedSecurityOptions` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticsearch-domain-masteruseroptions.html#cfn-elasticsearch-domain-masteruseroptions-masterusername)
     */
    public fun masterUserName(): String? = unwrap(this).getMasterUserName()

    /**
     * Password for the master user.
     *
     * Only specify if `InternalUserDatabaseEnabled` is true in `AdvancedSecurityOptions` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticsearch-domain-masteruseroptions.html#cfn-elasticsearch-domain-masteruseroptions-masteruserpassword)
     */
    public fun masterUserPassword(): String? = unwrap(this).getMasterUserPassword()

    /**
     * A builder for [MasterUserOptionsProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param masterUserArn ARN for the master user.
       * Only specify if `InternalUserDatabaseEnabled` is false in `AdvancedSecurityOptions` .
       */
      public fun masterUserArn(masterUserArn: String)

      /**
       * @param masterUserName Username for the master user.
       * Only specify if `InternalUserDatabaseEnabled` is true in `AdvancedSecurityOptions` .
       */
      public fun masterUserName(masterUserName: String)

      /**
       * @param masterUserPassword Password for the master user.
       * Only specify if `InternalUserDatabaseEnabled` is true in `AdvancedSecurityOptions` .
       */
      public fun masterUserPassword(masterUserPassword: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.elasticsearch.CfnDomain.MasterUserOptionsProperty.Builder
          =
          software.amazon.awscdk.services.elasticsearch.CfnDomain.MasterUserOptionsProperty.builder()

      /**
       * @param masterUserArn ARN for the master user.
       * Only specify if `InternalUserDatabaseEnabled` is false in `AdvancedSecurityOptions` .
       */
      override fun masterUserArn(masterUserArn: String) {
        cdkBuilder.masterUserArn(masterUserArn)
      }

      /**
       * @param masterUserName Username for the master user.
       * Only specify if `InternalUserDatabaseEnabled` is true in `AdvancedSecurityOptions` .
       */
      override fun masterUserName(masterUserName: String) {
        cdkBuilder.masterUserName(masterUserName)
      }

      /**
       * @param masterUserPassword Password for the master user.
       * Only specify if `InternalUserDatabaseEnabled` is true in `AdvancedSecurityOptions` .
       */
      override fun masterUserPassword(masterUserPassword: String) {
        cdkBuilder.masterUserPassword(masterUserPassword)
      }

      public fun build():
          software.amazon.awscdk.services.elasticsearch.CfnDomain.MasterUserOptionsProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.elasticsearch.CfnDomain.MasterUserOptionsProperty,
    ) : CdkObject(cdkObject),
        MasterUserOptionsProperty {
      /**
       * ARN for the master user.
       *
       * Only specify if `InternalUserDatabaseEnabled` is false in `AdvancedSecurityOptions` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticsearch-domain-masteruseroptions.html#cfn-elasticsearch-domain-masteruseroptions-masteruserarn)
       */
      override fun masterUserArn(): String? = unwrap(this).getMasterUserArn()

      /**
       * Username for the master user.
       *
       * Only specify if `InternalUserDatabaseEnabled` is true in `AdvancedSecurityOptions` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticsearch-domain-masteruseroptions.html#cfn-elasticsearch-domain-masteruseroptions-masterusername)
       */
      override fun masterUserName(): String? = unwrap(this).getMasterUserName()

      /**
       * Password for the master user.
       *
       * Only specify if `InternalUserDatabaseEnabled` is true in `AdvancedSecurityOptions` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticsearch-domain-masteruseroptions.html#cfn-elasticsearch-domain-masteruseroptions-masteruserpassword)
       */
      override fun masterUserPassword(): String? = unwrap(this).getMasterUserPassword()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): MasterUserOptionsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.elasticsearch.CfnDomain.MasterUserOptionsProperty):
          MasterUserOptionsProperty = CdkObjectWrappers.wrap(cdkObject) as?
          MasterUserOptionsProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: MasterUserOptionsProperty):
          software.amazon.awscdk.services.elasticsearch.CfnDomain.MasterUserOptionsProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.elasticsearch.CfnDomain.MasterUserOptionsProperty
    }
  }

  /**
   * Specifies whether node-to-node encryption is enabled.
   *
   *
   * The `AWS::Elasticsearch::Domain` resource is being replaced by the
   * [AWS::OpenSearchService::Domain](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opensearchservice-domain.html)
   * resource. While the legacy Elasticsearch resource and options are still supported, we recommend
   * modifying your existing Cloudformation templates to use the new OpenSearch Service resource, which
   * supports both OpenSearch and Elasticsearch. For more information about the service rename, see
   * [New resource
   * types](https://docs.aws.amazon.com/opensearch-service/latest/developerguide/rename.html#rename-resource)
   * in the *Amazon OpenSearch Service Developer Guide* .
   *
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.elasticsearch.*;
   * NodeToNodeEncryptionOptionsProperty nodeToNodeEncryptionOptionsProperty =
   * NodeToNodeEncryptionOptionsProperty.builder()
   * .enabled(false)
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticsearch-domain-nodetonodeencryptionoptions.html)
   */
  public interface NodeToNodeEncryptionOptionsProperty {
    /**
     * Specifies whether node-to-node encryption is enabled, as a Boolean.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticsearch-domain-nodetonodeencryptionoptions.html#cfn-elasticsearch-domain-nodetonodeencryptionoptions-enabled)
     */
    public fun enabled(): Any? = unwrap(this).getEnabled()

    /**
     * A builder for [NodeToNodeEncryptionOptionsProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param enabled Specifies whether node-to-node encryption is enabled, as a Boolean.
       */
      public fun enabled(enabled: Boolean)

      /**
       * @param enabled Specifies whether node-to-node encryption is enabled, as a Boolean.
       */
      public fun enabled(enabled: IResolvable)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.elasticsearch.CfnDomain.NodeToNodeEncryptionOptionsProperty.Builder
          =
          software.amazon.awscdk.services.elasticsearch.CfnDomain.NodeToNodeEncryptionOptionsProperty.builder()

      /**
       * @param enabled Specifies whether node-to-node encryption is enabled, as a Boolean.
       */
      override fun enabled(enabled: Boolean) {
        cdkBuilder.enabled(enabled)
      }

      /**
       * @param enabled Specifies whether node-to-node encryption is enabled, as a Boolean.
       */
      override fun enabled(enabled: IResolvable) {
        cdkBuilder.enabled(enabled.let(IResolvable.Companion::unwrap))
      }

      public fun build():
          software.amazon.awscdk.services.elasticsearch.CfnDomain.NodeToNodeEncryptionOptionsProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.elasticsearch.CfnDomain.NodeToNodeEncryptionOptionsProperty,
    ) : CdkObject(cdkObject),
        NodeToNodeEncryptionOptionsProperty {
      /**
       * Specifies whether node-to-node encryption is enabled, as a Boolean.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticsearch-domain-nodetonodeencryptionoptions.html#cfn-elasticsearch-domain-nodetonodeencryptionoptions-enabled)
       */
      override fun enabled(): Any? = unwrap(this).getEnabled()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          NodeToNodeEncryptionOptionsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.elasticsearch.CfnDomain.NodeToNodeEncryptionOptionsProperty):
          NodeToNodeEncryptionOptionsProperty = CdkObjectWrappers.wrap(cdkObject) as?
          NodeToNodeEncryptionOptionsProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: NodeToNodeEncryptionOptionsProperty):
          software.amazon.awscdk.services.elasticsearch.CfnDomain.NodeToNodeEncryptionOptionsProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.elasticsearch.CfnDomain.NodeToNodeEncryptionOptionsProperty
    }
  }

  /**
   * The `AWS::Elasticsearch::Domain` resource is being replaced by the
   * [AWS::OpenSearchService::Domain](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opensearchservice-domain.html)
   * resource. While the legacy Elasticsearch resource and options are still supported, we recommend
   * modifying your existing Cloudformation templates to use the new OpenSearch Service resource, which
   * supports both OpenSearch and Elasticsearch. For more information about the service rename, see
   * [New resource
   * types](https://docs.aws.amazon.com/opensearch-service/latest/developerguide/rename.html#rename-resource)
   * in the *Amazon OpenSearch Service Developer Guide* .
   *
   * *DEPRECATED* . For domains running Elasticsearch 5.3 and later, OpenSearch Service takes hourly
   * automated snapshots, making this setting irrelevant. For domains running earlier versions of
   * Elasticsearch, OpenSearch Service takes daily automated snapshots.
   *
   * The automated snapshot configuration for the OpenSearch Service domain indices.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.elasticsearch.*;
   * SnapshotOptionsProperty snapshotOptionsProperty = SnapshotOptionsProperty.builder()
   * .automatedSnapshotStartHour(123)
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticsearch-domain-snapshotoptions.html)
   */
  public interface SnapshotOptionsProperty {
    /**
     * The hour in UTC during which the service takes an automated daily snapshot of the indices in
     * the OpenSearch Service domain.
     *
     * For example, if you specify 0, OpenSearch Service takes an automated snapshot everyday
     * between midnight and 1 am. You can specify a value between 0 and 23.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticsearch-domain-snapshotoptions.html#cfn-elasticsearch-domain-snapshotoptions-automatedsnapshotstarthour)
     */
    public fun automatedSnapshotStartHour(): Number? = unwrap(this).getAutomatedSnapshotStartHour()

    /**
     * A builder for [SnapshotOptionsProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param automatedSnapshotStartHour The hour in UTC during which the service takes an
       * automated daily snapshot of the indices in the OpenSearch Service domain.
       * For example, if you specify 0, OpenSearch Service takes an automated snapshot everyday
       * between midnight and 1 am. You can specify a value between 0 and 23.
       */
      public fun automatedSnapshotStartHour(automatedSnapshotStartHour: Number)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.elasticsearch.CfnDomain.SnapshotOptionsProperty.Builder =
          software.amazon.awscdk.services.elasticsearch.CfnDomain.SnapshotOptionsProperty.builder()

      /**
       * @param automatedSnapshotStartHour The hour in UTC during which the service takes an
       * automated daily snapshot of the indices in the OpenSearch Service domain.
       * For example, if you specify 0, OpenSearch Service takes an automated snapshot everyday
       * between midnight and 1 am. You can specify a value between 0 and 23.
       */
      override fun automatedSnapshotStartHour(automatedSnapshotStartHour: Number) {
        cdkBuilder.automatedSnapshotStartHour(automatedSnapshotStartHour)
      }

      public fun build():
          software.amazon.awscdk.services.elasticsearch.CfnDomain.SnapshotOptionsProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.elasticsearch.CfnDomain.SnapshotOptionsProperty,
    ) : CdkObject(cdkObject),
        SnapshotOptionsProperty {
      /**
       * The hour in UTC during which the service takes an automated daily snapshot of the indices
       * in the OpenSearch Service domain.
       *
       * For example, if you specify 0, OpenSearch Service takes an automated snapshot everyday
       * between midnight and 1 am. You can specify a value between 0 and 23.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticsearch-domain-snapshotoptions.html#cfn-elasticsearch-domain-snapshotoptions-automatedsnapshotstarthour)
       */
      override fun automatedSnapshotStartHour(): Number? =
          unwrap(this).getAutomatedSnapshotStartHour()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): SnapshotOptionsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.elasticsearch.CfnDomain.SnapshotOptionsProperty):
          SnapshotOptionsProperty = CdkObjectWrappers.wrap(cdkObject) as? SnapshotOptionsProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: SnapshotOptionsProperty):
          software.amazon.awscdk.services.elasticsearch.CfnDomain.SnapshotOptionsProperty = (wrapped
          as CdkObject).cdkObject as
          software.amazon.awscdk.services.elasticsearch.CfnDomain.SnapshotOptionsProperty
    }
  }

  /**
   * The virtual private cloud (VPC) configuration for the OpenSearch Service domain.
   *
   * For more information, see [Launching your Amazon OpenSearch Service domains using a
   * VPC](https://docs.aws.amazon.com/opensearch-service/latest/developerguide/vpc.html) in the *Amazon
   * OpenSearch Service Developer Guide* .
   *
   *
   * The `AWS::Elasticsearch::Domain` resource is being replaced by the
   * [AWS::OpenSearchService::Domain](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opensearchservice-domain.html)
   * resource. While the legacy Elasticsearch resource and options are still supported, we recommend
   * modifying your existing Cloudformation templates to use the new OpenSearch Service resource, which
   * supports both OpenSearch and Elasticsearch. For more information about the service rename, see
   * [New resource
   * types](https://docs.aws.amazon.com/opensearch-service/latest/developerguide/rename.html#rename-resource)
   * in the *Amazon OpenSearch Service Developer Guide* .
   *
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.elasticsearch.*;
   * VPCOptionsProperty vPCOptionsProperty = VPCOptionsProperty.builder()
   * .securityGroupIds(List.of("securityGroupIds"))
   * .subnetIds(List.of("subnetIds"))
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticsearch-domain-vpcoptions.html)
   */
  public interface VPCOptionsProperty {
    /**
     * The list of security group IDs that are associated with the VPC endpoints for the domain.
     *
     * If you don't provide a security group ID, OpenSearch Service uses the default security group
     * for the VPC. To learn more, see [Security groups for your
     * VPC](https://docs.aws.amazon.com/vpc/latest/userguide/VPC_SecurityGroups.html) in the *Amazon
     * VPC User Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticsearch-domain-vpcoptions.html#cfn-elasticsearch-domain-vpcoptions-securitygroupids)
     */
    public fun securityGroupIds(): List<String> = unwrap(this).getSecurityGroupIds() ?: emptyList()

    /**
     * Provide one subnet ID for each Availability Zone that your domain uses.
     *
     * For example, you must specify three subnet IDs for a three Availability Zone domain. To learn
     * more, see [VPCs and subnets](https://docs.aws.amazon.com/vpc/latest/userguide/VPC_Subnets.html)
     * in the *Amazon VPC User Guide* .
     *
     * Required if you're creating your domain inside a VPC.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticsearch-domain-vpcoptions.html#cfn-elasticsearch-domain-vpcoptions-subnetids)
     */
    public fun subnetIds(): List<String> = unwrap(this).getSubnetIds() ?: emptyList()

    /**
     * A builder for [VPCOptionsProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param securityGroupIds The list of security group IDs that are associated with the VPC
       * endpoints for the domain.
       * If you don't provide a security group ID, OpenSearch Service uses the default security
       * group for the VPC. To learn more, see [Security groups for your
       * VPC](https://docs.aws.amazon.com/vpc/latest/userguide/VPC_SecurityGroups.html) in the *Amazon
       * VPC User Guide* .
       */
      public fun securityGroupIds(securityGroupIds: List<String>)

      /**
       * @param securityGroupIds The list of security group IDs that are associated with the VPC
       * endpoints for the domain.
       * If you don't provide a security group ID, OpenSearch Service uses the default security
       * group for the VPC. To learn more, see [Security groups for your
       * VPC](https://docs.aws.amazon.com/vpc/latest/userguide/VPC_SecurityGroups.html) in the *Amazon
       * VPC User Guide* .
       */
      public fun securityGroupIds(vararg securityGroupIds: String)

      /**
       * @param subnetIds Provide one subnet ID for each Availability Zone that your domain uses.
       * For example, you must specify three subnet IDs for a three Availability Zone domain. To
       * learn more, see [VPCs and
       * subnets](https://docs.aws.amazon.com/vpc/latest/userguide/VPC_Subnets.html) in the *Amazon VPC
       * User Guide* .
       *
       * Required if you're creating your domain inside a VPC.
       */
      public fun subnetIds(subnetIds: List<String>)

      /**
       * @param subnetIds Provide one subnet ID for each Availability Zone that your domain uses.
       * For example, you must specify three subnet IDs for a three Availability Zone domain. To
       * learn more, see [VPCs and
       * subnets](https://docs.aws.amazon.com/vpc/latest/userguide/VPC_Subnets.html) in the *Amazon VPC
       * User Guide* .
       *
       * Required if you're creating your domain inside a VPC.
       */
      public fun subnetIds(vararg subnetIds: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.elasticsearch.CfnDomain.VPCOptionsProperty.Builder =
          software.amazon.awscdk.services.elasticsearch.CfnDomain.VPCOptionsProperty.builder()

      /**
       * @param securityGroupIds The list of security group IDs that are associated with the VPC
       * endpoints for the domain.
       * If you don't provide a security group ID, OpenSearch Service uses the default security
       * group for the VPC. To learn more, see [Security groups for your
       * VPC](https://docs.aws.amazon.com/vpc/latest/userguide/VPC_SecurityGroups.html) in the *Amazon
       * VPC User Guide* .
       */
      override fun securityGroupIds(securityGroupIds: List<String>) {
        cdkBuilder.securityGroupIds(securityGroupIds)
      }

      /**
       * @param securityGroupIds The list of security group IDs that are associated with the VPC
       * endpoints for the domain.
       * If you don't provide a security group ID, OpenSearch Service uses the default security
       * group for the VPC. To learn more, see [Security groups for your
       * VPC](https://docs.aws.amazon.com/vpc/latest/userguide/VPC_SecurityGroups.html) in the *Amazon
       * VPC User Guide* .
       */
      override fun securityGroupIds(vararg securityGroupIds: String): Unit =
          securityGroupIds(securityGroupIds.toList())

      /**
       * @param subnetIds Provide one subnet ID for each Availability Zone that your domain uses.
       * For example, you must specify three subnet IDs for a three Availability Zone domain. To
       * learn more, see [VPCs and
       * subnets](https://docs.aws.amazon.com/vpc/latest/userguide/VPC_Subnets.html) in the *Amazon VPC
       * User Guide* .
       *
       * Required if you're creating your domain inside a VPC.
       */
      override fun subnetIds(subnetIds: List<String>) {
        cdkBuilder.subnetIds(subnetIds)
      }

      /**
       * @param subnetIds Provide one subnet ID for each Availability Zone that your domain uses.
       * For example, you must specify three subnet IDs for a three Availability Zone domain. To
       * learn more, see [VPCs and
       * subnets](https://docs.aws.amazon.com/vpc/latest/userguide/VPC_Subnets.html) in the *Amazon VPC
       * User Guide* .
       *
       * Required if you're creating your domain inside a VPC.
       */
      override fun subnetIds(vararg subnetIds: String): Unit = subnetIds(subnetIds.toList())

      public fun build(): software.amazon.awscdk.services.elasticsearch.CfnDomain.VPCOptionsProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.elasticsearch.CfnDomain.VPCOptionsProperty,
    ) : CdkObject(cdkObject),
        VPCOptionsProperty {
      /**
       * The list of security group IDs that are associated with the VPC endpoints for the domain.
       *
       * If you don't provide a security group ID, OpenSearch Service uses the default security
       * group for the VPC. To learn more, see [Security groups for your
       * VPC](https://docs.aws.amazon.com/vpc/latest/userguide/VPC_SecurityGroups.html) in the *Amazon
       * VPC User Guide* .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticsearch-domain-vpcoptions.html#cfn-elasticsearch-domain-vpcoptions-securitygroupids)
       */
      override fun securityGroupIds(): List<String> = unwrap(this).getSecurityGroupIds() ?:
          emptyList()

      /**
       * Provide one subnet ID for each Availability Zone that your domain uses.
       *
       * For example, you must specify three subnet IDs for a three Availability Zone domain. To
       * learn more, see [VPCs and
       * subnets](https://docs.aws.amazon.com/vpc/latest/userguide/VPC_Subnets.html) in the *Amazon VPC
       * User Guide* .
       *
       * Required if you're creating your domain inside a VPC.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticsearch-domain-vpcoptions.html#cfn-elasticsearch-domain-vpcoptions-subnetids)
       */
      override fun subnetIds(): List<String> = unwrap(this).getSubnetIds() ?: emptyList()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): VPCOptionsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.elasticsearch.CfnDomain.VPCOptionsProperty):
          VPCOptionsProperty = CdkObjectWrappers.wrap(cdkObject) as? VPCOptionsProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: VPCOptionsProperty):
          software.amazon.awscdk.services.elasticsearch.CfnDomain.VPCOptionsProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.elasticsearch.CfnDomain.VPCOptionsProperty
    }
  }

  /**
   * Specifies zone awareness configuration options. Only use if `ZoneAwarenessEnabled` is `true` .
   *
   *
   * The `AWS::Elasticsearch::Domain` resource is being replaced by the
   * [AWS::OpenSearchService::Domain](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opensearchservice-domain.html)
   * resource. While the legacy Elasticsearch resource and options are still supported, we recommend
   * modifying your existing Cloudformation templates to use the new OpenSearch Service resource, which
   * supports both OpenSearch and Elasticsearch. For more information about the service rename, see
   * [New resource
   * types](https://docs.aws.amazon.com/opensearch-service/latest/developerguide/rename.html#rename-resource)
   * in the *Amazon OpenSearch Service Developer Guide* .
   *
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.elasticsearch.*;
   * ZoneAwarenessConfigProperty zoneAwarenessConfigProperty = ZoneAwarenessConfigProperty.builder()
   * .availabilityZoneCount(123)
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticsearch-domain-zoneawarenessconfig.html)
   */
  public interface ZoneAwarenessConfigProperty {
    /**
     * If you enabled multiple Availability Zones (AZs), the number of AZs that you want the domain
     * to use.
     *
     * Valid values are `2` and `3` . Default is 2.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticsearch-domain-zoneawarenessconfig.html#cfn-elasticsearch-domain-zoneawarenessconfig-availabilityzonecount)
     */
    public fun availabilityZoneCount(): Number? = unwrap(this).getAvailabilityZoneCount()

    /**
     * A builder for [ZoneAwarenessConfigProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param availabilityZoneCount If you enabled multiple Availability Zones (AZs), the number
       * of AZs that you want the domain to use.
       * Valid values are `2` and `3` . Default is 2.
       */
      public fun availabilityZoneCount(availabilityZoneCount: Number)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.elasticsearch.CfnDomain.ZoneAwarenessConfigProperty.Builder
          =
          software.amazon.awscdk.services.elasticsearch.CfnDomain.ZoneAwarenessConfigProperty.builder()

      /**
       * @param availabilityZoneCount If you enabled multiple Availability Zones (AZs), the number
       * of AZs that you want the domain to use.
       * Valid values are `2` and `3` . Default is 2.
       */
      override fun availabilityZoneCount(availabilityZoneCount: Number) {
        cdkBuilder.availabilityZoneCount(availabilityZoneCount)
      }

      public fun build():
          software.amazon.awscdk.services.elasticsearch.CfnDomain.ZoneAwarenessConfigProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.elasticsearch.CfnDomain.ZoneAwarenessConfigProperty,
    ) : CdkObject(cdkObject),
        ZoneAwarenessConfigProperty {
      /**
       * If you enabled multiple Availability Zones (AZs), the number of AZs that you want the
       * domain to use.
       *
       * Valid values are `2` and `3` . Default is 2.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticsearch-domain-zoneawarenessconfig.html#cfn-elasticsearch-domain-zoneawarenessconfig-availabilityzonecount)
       */
      override fun availabilityZoneCount(): Number? = unwrap(this).getAvailabilityZoneCount()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): ZoneAwarenessConfigProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.elasticsearch.CfnDomain.ZoneAwarenessConfigProperty):
          ZoneAwarenessConfigProperty = CdkObjectWrappers.wrap(cdkObject) as?
          ZoneAwarenessConfigProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: ZoneAwarenessConfigProperty):
          software.amazon.awscdk.services.elasticsearch.CfnDomain.ZoneAwarenessConfigProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.elasticsearch.CfnDomain.ZoneAwarenessConfigProperty
    }
  }
}
