@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.elasticsearch

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.collections.Map
import kotlin.jvm.JvmName

/**
 * Properties for defining a `CfnDomain`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.elasticsearch.*;
 * Object accessPolicies;
 * CfnDomainProps cfnDomainProps = CfnDomainProps.builder()
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
public interface CfnDomainProps {
  /**
   * An AWS Identity and Access Management ( IAM ) policy document that specifies who can access the
   * OpenSearch Service domain and their permissions.
   *
   * For more information, see [Configuring access
   * policies](https://docs.aws.amazon.com/opensearch-service/latest/developerguide/ac.html#ac-creating)
   * in the *Amazon OpenSearch Service Developer Guid* e.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticsearch-domain.html#cfn-elasticsearch-domain-accesspolicies)
   */
  public fun accessPolicies(): Any? = unwrap(this).getAccessPolicies()

  /**
   * Additional options to specify for the OpenSearch Service domain.
   *
   * For more information, see [Advanced cluster
   * parameters](https://docs.aws.amazon.com/opensearch-service/latest/developerguide/createupdatedomains.html#createdomain-configure-advanced-options)
   * in the *Amazon OpenSearch Service Developer Guide* .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticsearch-domain.html#cfn-elasticsearch-domain-advancedoptions)
   */
  public fun advancedOptions(): Any? = unwrap(this).getAdvancedOptions()

  /**
   * Specifies options for fine-grained access control.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticsearch-domain.html#cfn-elasticsearch-domain-advancedsecurityoptions)
   */
  public fun advancedSecurityOptions(): Any? = unwrap(this).getAdvancedSecurityOptions()

  /**
   * Configures OpenSearch Service to use Amazon Cognito authentication for OpenSearch Dashboards.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticsearch-domain.html#cfn-elasticsearch-domain-cognitooptions)
   */
  public fun cognitoOptions(): Any? = unwrap(this).getCognitoOptions()

  /**
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticsearch-domain.html#cfn-elasticsearch-domain-domainarn)
   */
  public fun domainArn(): String? = unwrap(this).getDomainArn()

  /**
   * Specifies additional options for the domain endpoint, such as whether to require HTTPS for all
   * traffic or whether to use a custom endpoint rather than the default endpoint.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticsearch-domain.html#cfn-elasticsearch-domain-domainendpointoptions)
   */
  public fun domainEndpointOptions(): Any? = unwrap(this).getDomainEndpointOptions()

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
   */
  public fun domainName(): String? = unwrap(this).getDomainName()

  /**
   * The configurations of Amazon Elastic Block Store (Amazon EBS) volumes that are attached to data
   * nodes in the OpenSearch Service domain.
   *
   * For more information, see [EBS volume size
   * limits](https://docs.aws.amazon.com/opensearch-service/latest/developerguide/limits.html#ebsresource)
   * in the *Amazon OpenSearch Service Developer Guide* .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticsearch-domain.html#cfn-elasticsearch-domain-ebsoptions)
   */
  public fun ebsOptions(): Any? = unwrap(this).getEbsOptions()

  /**
   * ElasticsearchClusterConfig is a property of the AWS::Elasticsearch::Domain resource that
   * configures the cluster of an Amazon OpenSearch Service domain.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticsearch-domain.html#cfn-elasticsearch-domain-elasticsearchclusterconfig)
   */
  public fun elasticsearchClusterConfig(): Any? = unwrap(this).getElasticsearchClusterConfig()

  /**
   * The version of Elasticsearch to use, such as 2.3. If not specified, 1.5 is used as the default.
   * For information about the versions that OpenSearch Service supports, see [Supported versions of
   * OpenSearch and
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
   */
  public fun elasticsearchVersion(): String? = unwrap(this).getElasticsearchVersion()

  /**
   * Whether the domain should encrypt data at rest, and if so, the AWS Key Management Service key
   * to use.
   *
   * See [Encryption of data at rest for Amazon OpenSearch
   * Service](https://docs.aws.amazon.com/opensearch-service/latest/developerguide/encryption-at-rest.html)
   * .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticsearch-domain.html#cfn-elasticsearch-domain-encryptionatrestoptions)
   */
  public fun encryptionAtRestOptions(): Any? = unwrap(this).getEncryptionAtRestOptions()

  /**
   * An object with one or more of the following keys: `SEARCH_SLOW_LOGS` , `ES_APPLICATION_LOGS` ,
   * `INDEX_SLOW_LOGS` , `AUDIT_LOGS` , depending on the types of logs you want to publish.
   *
   * Each key needs a valid `LogPublishingOption` value.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticsearch-domain.html#cfn-elasticsearch-domain-logpublishingoptions)
   */
  public fun logPublishingOptions(): Any? = unwrap(this).getLogPublishingOptions()

  /**
   * Specifies whether node-to-node encryption is enabled.
   *
   * See [Node-to-node encryption for Amazon OpenSearch
   * Service](https://docs.aws.amazon.com/opensearch-service/latest/developerguide/ntn.html) .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticsearch-domain.html#cfn-elasticsearch-domain-nodetonodeencryptionoptions)
   */
  public fun nodeToNodeEncryptionOptions(): Any? = unwrap(this).getNodeToNodeEncryptionOptions()

  /**
   * *DEPRECATED* .
   *
   * The automated snapshot configuration for the OpenSearch Service domain indices.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticsearch-domain.html#cfn-elasticsearch-domain-snapshotoptions)
   */
  public fun snapshotOptions(): Any? = unwrap(this).getSnapshotOptions()

  /**
   * An arbitrary set of tags (key–value pairs) to associate with the OpenSearch Service domain.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticsearch-domain.html#cfn-elasticsearch-domain-tags)
   */
  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * The virtual private cloud (VPC) configuration for the OpenSearch Service domain.
   *
   * For more information, see [Launching your Amazon OpenSearch Service domains within a
   * VPC](https://docs.aws.amazon.com/opensearch-service/latest/developerguide/vpc.html) in the *Amazon
   * OpenSearch Service Developer Guide* .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticsearch-domain.html#cfn-elasticsearch-domain-vpcoptions)
   */
  public fun vpcOptions(): Any? = unwrap(this).getVpcOptions()

  /**
   * A builder for [CfnDomainProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param accessPolicies An AWS Identity and Access Management ( IAM ) policy document that
     * specifies who can access the OpenSearch Service domain and their permissions.
     * For more information, see [Configuring access
     * policies](https://docs.aws.amazon.com/opensearch-service/latest/developerguide/ac.html#ac-creating)
     * in the *Amazon OpenSearch Service Developer Guid* e.
     */
    public fun accessPolicies(accessPolicies: Any)

    /**
     * @param advancedOptions Additional options to specify for the OpenSearch Service domain.
     * For more information, see [Advanced cluster
     * parameters](https://docs.aws.amazon.com/opensearch-service/latest/developerguide/createupdatedomains.html#createdomain-configure-advanced-options)
     * in the *Amazon OpenSearch Service Developer Guide* .
     */
    public fun advancedOptions(advancedOptions: IResolvable)

    /**
     * @param advancedOptions Additional options to specify for the OpenSearch Service domain.
     * For more information, see [Advanced cluster
     * parameters](https://docs.aws.amazon.com/opensearch-service/latest/developerguide/createupdatedomains.html#createdomain-configure-advanced-options)
     * in the *Amazon OpenSearch Service Developer Guide* .
     */
    public fun advancedOptions(advancedOptions: Map<String, String>)

    /**
     * @param advancedSecurityOptions Specifies options for fine-grained access control.
     */
    public fun advancedSecurityOptions(advancedSecurityOptions: IResolvable)

    /**
     * @param advancedSecurityOptions Specifies options for fine-grained access control.
     */
    public
        fun advancedSecurityOptions(advancedSecurityOptions: CfnDomain.AdvancedSecurityOptionsInputProperty)

    /**
     * @param advancedSecurityOptions Specifies options for fine-grained access control.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("50d069ce8363f0b61dbba673dbe267859dec462e47eb5705170d33440393c43e")
    public
        fun advancedSecurityOptions(advancedSecurityOptions: CfnDomain.AdvancedSecurityOptionsInputProperty.Builder.() -> Unit)

    /**
     * @param cognitoOptions Configures OpenSearch Service to use Amazon Cognito authentication for
     * OpenSearch Dashboards.
     */
    public fun cognitoOptions(cognitoOptions: IResolvable)

    /**
     * @param cognitoOptions Configures OpenSearch Service to use Amazon Cognito authentication for
     * OpenSearch Dashboards.
     */
    public fun cognitoOptions(cognitoOptions: CfnDomain.CognitoOptionsProperty)

    /**
     * @param cognitoOptions Configures OpenSearch Service to use Amazon Cognito authentication for
     * OpenSearch Dashboards.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("89e6717344b3728e3cd25adc3343cde5ac8c9be469a2f271899674f19a76ae96")
    public fun cognitoOptions(cognitoOptions: CfnDomain.CognitoOptionsProperty.Builder.() -> Unit)

    /**
     * @param domainArn the value to be set.
     */
    public fun domainArn(domainArn: String)

    /**
     * @param domainEndpointOptions Specifies additional options for the domain endpoint, such as
     * whether to require HTTPS for all traffic or whether to use a custom endpoint rather than the
     * default endpoint.
     */
    public fun domainEndpointOptions(domainEndpointOptions: IResolvable)

    /**
     * @param domainEndpointOptions Specifies additional options for the domain endpoint, such as
     * whether to require HTTPS for all traffic or whether to use a custom endpoint rather than the
     * default endpoint.
     */
    public fun domainEndpointOptions(domainEndpointOptions: CfnDomain.DomainEndpointOptionsProperty)

    /**
     * @param domainEndpointOptions Specifies additional options for the domain endpoint, such as
     * whether to require HTTPS for all traffic or whether to use a custom endpoint rather than the
     * default endpoint.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("f84379a8689372c0b471619ea2587600fdaab93d3355b719732a00352a0d4131")
    public
        fun domainEndpointOptions(domainEndpointOptions: CfnDomain.DomainEndpointOptionsProperty.Builder.() -> Unit)

    /**
     * @param domainName A name for the OpenSearch Service domain.
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
     */
    public fun domainName(domainName: String)

    /**
     * @param ebsOptions The configurations of Amazon Elastic Block Store (Amazon EBS) volumes that
     * are attached to data nodes in the OpenSearch Service domain.
     * For more information, see [EBS volume size
     * limits](https://docs.aws.amazon.com/opensearch-service/latest/developerguide/limits.html#ebsresource)
     * in the *Amazon OpenSearch Service Developer Guide* .
     */
    public fun ebsOptions(ebsOptions: IResolvable)

    /**
     * @param ebsOptions The configurations of Amazon Elastic Block Store (Amazon EBS) volumes that
     * are attached to data nodes in the OpenSearch Service domain.
     * For more information, see [EBS volume size
     * limits](https://docs.aws.amazon.com/opensearch-service/latest/developerguide/limits.html#ebsresource)
     * in the *Amazon OpenSearch Service Developer Guide* .
     */
    public fun ebsOptions(ebsOptions: CfnDomain.EBSOptionsProperty)

    /**
     * @param ebsOptions The configurations of Amazon Elastic Block Store (Amazon EBS) volumes that
     * are attached to data nodes in the OpenSearch Service domain.
     * For more information, see [EBS volume size
     * limits](https://docs.aws.amazon.com/opensearch-service/latest/developerguide/limits.html#ebsresource)
     * in the *Amazon OpenSearch Service Developer Guide* .
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("c5650cf1db98cb0af7433f5ba44cd71bde157d752274c6e9eea214e78761b167")
    public fun ebsOptions(ebsOptions: CfnDomain.EBSOptionsProperty.Builder.() -> Unit)

    /**
     * @param elasticsearchClusterConfig ElasticsearchClusterConfig is a property of the
     * AWS::Elasticsearch::Domain resource that configures the cluster of an Amazon OpenSearch Service
     * domain.
     */
    public fun elasticsearchClusterConfig(elasticsearchClusterConfig: IResolvable)

    /**
     * @param elasticsearchClusterConfig ElasticsearchClusterConfig is a property of the
     * AWS::Elasticsearch::Domain resource that configures the cluster of an Amazon OpenSearch Service
     * domain.
     */
    public
        fun elasticsearchClusterConfig(elasticsearchClusterConfig: CfnDomain.ElasticsearchClusterConfigProperty)

    /**
     * @param elasticsearchClusterConfig ElasticsearchClusterConfig is a property of the
     * AWS::Elasticsearch::Domain resource that configures the cluster of an Amazon OpenSearch Service
     * domain.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("c066cb1f954b7830700b635d3a8aa99f7e44df883c1bb8d1a67f2f9ad8b8f7a0")
    public
        fun elasticsearchClusterConfig(elasticsearchClusterConfig: CfnDomain.ElasticsearchClusterConfigProperty.Builder.() -> Unit)

    /**
     * @param elasticsearchVersion The version of Elasticsearch to use, such as 2.3. If not
     * specified, 1.5 is used as the default. For information about the versions that OpenSearch
     * Service supports, see [Supported versions of OpenSearch and
     * Elasticsearch](https://docs.aws.amazon.com/opensearch-service/latest/developerguide/what-is.html#choosing-version)
     * in the *Amazon OpenSearch Service Developer Guide* .
     * If you set the
     * [EnableVersionUpgrade](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-attribute-updatepolicy.html#cfn-attributes-updatepolicy-upgradeopensearchdomain)
     * update policy to `true` , you can update `ElasticsearchVersion` without interruption. When
     * `EnableVersionUpgrade` is set to `false` , or is not specified, updating `ElasticsearchVersion`
     * results in
     * [replacement](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/using-cfn-updating-stacks-update-behaviors.html#update-replacement)
     * .
     */
    public fun elasticsearchVersion(elasticsearchVersion: String)

    /**
     * @param encryptionAtRestOptions Whether the domain should encrypt data at rest, and if so, the
     * AWS Key Management Service key to use.
     * See [Encryption of data at rest for Amazon OpenSearch
     * Service](https://docs.aws.amazon.com/opensearch-service/latest/developerguide/encryption-at-rest.html)
     * .
     */
    public fun encryptionAtRestOptions(encryptionAtRestOptions: IResolvable)

    /**
     * @param encryptionAtRestOptions Whether the domain should encrypt data at rest, and if so, the
     * AWS Key Management Service key to use.
     * See [Encryption of data at rest for Amazon OpenSearch
     * Service](https://docs.aws.amazon.com/opensearch-service/latest/developerguide/encryption-at-rest.html)
     * .
     */
    public
        fun encryptionAtRestOptions(encryptionAtRestOptions: CfnDomain.EncryptionAtRestOptionsProperty)

    /**
     * @param encryptionAtRestOptions Whether the domain should encrypt data at rest, and if so, the
     * AWS Key Management Service key to use.
     * See [Encryption of data at rest for Amazon OpenSearch
     * Service](https://docs.aws.amazon.com/opensearch-service/latest/developerguide/encryption-at-rest.html)
     * .
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("d4072ac921cbb0c2727d782a42bd58e69362114e428175970aeec397d2c8c2a7")
    public
        fun encryptionAtRestOptions(encryptionAtRestOptions: CfnDomain.EncryptionAtRestOptionsProperty.Builder.() -> Unit)

    /**
     * @param logPublishingOptions An object with one or more of the following keys:
     * `SEARCH_SLOW_LOGS` , `ES_APPLICATION_LOGS` , `INDEX_SLOW_LOGS` , `AUDIT_LOGS` , depending on the
     * types of logs you want to publish.
     * Each key needs a valid `LogPublishingOption` value.
     */
    public fun logPublishingOptions(logPublishingOptions: IResolvable)

    /**
     * @param logPublishingOptions An object with one or more of the following keys:
     * `SEARCH_SLOW_LOGS` , `ES_APPLICATION_LOGS` , `INDEX_SLOW_LOGS` , `AUDIT_LOGS` , depending on the
     * types of logs you want to publish.
     * Each key needs a valid `LogPublishingOption` value.
     */
    public fun logPublishingOptions(logPublishingOptions: Map<String, Any>)

    /**
     * @param nodeToNodeEncryptionOptions Specifies whether node-to-node encryption is enabled.
     * See [Node-to-node encryption for Amazon OpenSearch
     * Service](https://docs.aws.amazon.com/opensearch-service/latest/developerguide/ntn.html) .
     */
    public fun nodeToNodeEncryptionOptions(nodeToNodeEncryptionOptions: IResolvable)

    /**
     * @param nodeToNodeEncryptionOptions Specifies whether node-to-node encryption is enabled.
     * See [Node-to-node encryption for Amazon OpenSearch
     * Service](https://docs.aws.amazon.com/opensearch-service/latest/developerguide/ntn.html) .
     */
    public
        fun nodeToNodeEncryptionOptions(nodeToNodeEncryptionOptions: CfnDomain.NodeToNodeEncryptionOptionsProperty)

    /**
     * @param nodeToNodeEncryptionOptions Specifies whether node-to-node encryption is enabled.
     * See [Node-to-node encryption for Amazon OpenSearch
     * Service](https://docs.aws.amazon.com/opensearch-service/latest/developerguide/ntn.html) .
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("c228037ed4321e49b29dc77e8c0e144466ef1ff7bd5857ac200883f0ecfa7329")
    public
        fun nodeToNodeEncryptionOptions(nodeToNodeEncryptionOptions: CfnDomain.NodeToNodeEncryptionOptionsProperty.Builder.() -> Unit)

    /**
     * @param snapshotOptions *DEPRECATED* .
     * The automated snapshot configuration for the OpenSearch Service domain indices.
     */
    public fun snapshotOptions(snapshotOptions: IResolvable)

    /**
     * @param snapshotOptions *DEPRECATED* .
     * The automated snapshot configuration for the OpenSearch Service domain indices.
     */
    public fun snapshotOptions(snapshotOptions: CfnDomain.SnapshotOptionsProperty)

    /**
     * @param snapshotOptions *DEPRECATED* .
     * The automated snapshot configuration for the OpenSearch Service domain indices.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("8fa0ba68714d54331505baf65e67e92cf187bcda367bf8ac2bb5eef1bed2adea")
    public
        fun snapshotOptions(snapshotOptions: CfnDomain.SnapshotOptionsProperty.Builder.() -> Unit)

    /**
     * @param tags An arbitrary set of tags (key–value pairs) to associate with the OpenSearch
     * Service domain.
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * @param tags An arbitrary set of tags (key–value pairs) to associate with the OpenSearch
     * Service domain.
     */
    public fun tags(vararg tags: CfnTag)

    /**
     * @param vpcOptions The virtual private cloud (VPC) configuration for the OpenSearch Service
     * domain.
     * For more information, see [Launching your Amazon OpenSearch Service domains within a
     * VPC](https://docs.aws.amazon.com/opensearch-service/latest/developerguide/vpc.html) in the
     * *Amazon OpenSearch Service Developer Guide* .
     */
    public fun vpcOptions(vpcOptions: IResolvable)

    /**
     * @param vpcOptions The virtual private cloud (VPC) configuration for the OpenSearch Service
     * domain.
     * For more information, see [Launching your Amazon OpenSearch Service domains within a
     * VPC](https://docs.aws.amazon.com/opensearch-service/latest/developerguide/vpc.html) in the
     * *Amazon OpenSearch Service Developer Guide* .
     */
    public fun vpcOptions(vpcOptions: CfnDomain.VPCOptionsProperty)

    /**
     * @param vpcOptions The virtual private cloud (VPC) configuration for the OpenSearch Service
     * domain.
     * For more information, see [Launching your Amazon OpenSearch Service domains within a
     * VPC](https://docs.aws.amazon.com/opensearch-service/latest/developerguide/vpc.html) in the
     * *Amazon OpenSearch Service Developer Guide* .
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("bd085fa7b192f56cb1de104be3ad5979fd46f6c5045776f9400610a20b8cd0a9")
    public fun vpcOptions(vpcOptions: CfnDomain.VPCOptionsProperty.Builder.() -> Unit)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.elasticsearch.CfnDomainProps.Builder =
        software.amazon.awscdk.services.elasticsearch.CfnDomainProps.builder()

    /**
     * @param accessPolicies An AWS Identity and Access Management ( IAM ) policy document that
     * specifies who can access the OpenSearch Service domain and their permissions.
     * For more information, see [Configuring access
     * policies](https://docs.aws.amazon.com/opensearch-service/latest/developerguide/ac.html#ac-creating)
     * in the *Amazon OpenSearch Service Developer Guid* e.
     */
    override fun accessPolicies(accessPolicies: Any) {
      cdkBuilder.accessPolicies(accessPolicies)
    }

    /**
     * @param advancedOptions Additional options to specify for the OpenSearch Service domain.
     * For more information, see [Advanced cluster
     * parameters](https://docs.aws.amazon.com/opensearch-service/latest/developerguide/createupdatedomains.html#createdomain-configure-advanced-options)
     * in the *Amazon OpenSearch Service Developer Guide* .
     */
    override fun advancedOptions(advancedOptions: IResolvable) {
      cdkBuilder.advancedOptions(advancedOptions.let(IResolvable::unwrap))
    }

    /**
     * @param advancedOptions Additional options to specify for the OpenSearch Service domain.
     * For more information, see [Advanced cluster
     * parameters](https://docs.aws.amazon.com/opensearch-service/latest/developerguide/createupdatedomains.html#createdomain-configure-advanced-options)
     * in the *Amazon OpenSearch Service Developer Guide* .
     */
    override fun advancedOptions(advancedOptions: Map<String, String>) {
      cdkBuilder.advancedOptions(advancedOptions)
    }

    /**
     * @param advancedSecurityOptions Specifies options for fine-grained access control.
     */
    override fun advancedSecurityOptions(advancedSecurityOptions: IResolvable) {
      cdkBuilder.advancedSecurityOptions(advancedSecurityOptions.let(IResolvable::unwrap))
    }

    /**
     * @param advancedSecurityOptions Specifies options for fine-grained access control.
     */
    override
        fun advancedSecurityOptions(advancedSecurityOptions: CfnDomain.AdvancedSecurityOptionsInputProperty) {
      cdkBuilder.advancedSecurityOptions(advancedSecurityOptions.let(CfnDomain.AdvancedSecurityOptionsInputProperty::unwrap))
    }

    /**
     * @param advancedSecurityOptions Specifies options for fine-grained access control.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("50d069ce8363f0b61dbba673dbe267859dec462e47eb5705170d33440393c43e")
    override
        fun advancedSecurityOptions(advancedSecurityOptions: CfnDomain.AdvancedSecurityOptionsInputProperty.Builder.() -> Unit):
        Unit =
        advancedSecurityOptions(CfnDomain.AdvancedSecurityOptionsInputProperty(advancedSecurityOptions))

    /**
     * @param cognitoOptions Configures OpenSearch Service to use Amazon Cognito authentication for
     * OpenSearch Dashboards.
     */
    override fun cognitoOptions(cognitoOptions: IResolvable) {
      cdkBuilder.cognitoOptions(cognitoOptions.let(IResolvable::unwrap))
    }

    /**
     * @param cognitoOptions Configures OpenSearch Service to use Amazon Cognito authentication for
     * OpenSearch Dashboards.
     */
    override fun cognitoOptions(cognitoOptions: CfnDomain.CognitoOptionsProperty) {
      cdkBuilder.cognitoOptions(cognitoOptions.let(CfnDomain.CognitoOptionsProperty::unwrap))
    }

    /**
     * @param cognitoOptions Configures OpenSearch Service to use Amazon Cognito authentication for
     * OpenSearch Dashboards.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("89e6717344b3728e3cd25adc3343cde5ac8c9be469a2f271899674f19a76ae96")
    override
        fun cognitoOptions(cognitoOptions: CfnDomain.CognitoOptionsProperty.Builder.() -> Unit):
        Unit = cognitoOptions(CfnDomain.CognitoOptionsProperty(cognitoOptions))

    /**
     * @param domainArn the value to be set.
     */
    override fun domainArn(domainArn: String) {
      cdkBuilder.domainArn(domainArn)
    }

    /**
     * @param domainEndpointOptions Specifies additional options for the domain endpoint, such as
     * whether to require HTTPS for all traffic or whether to use a custom endpoint rather than the
     * default endpoint.
     */
    override fun domainEndpointOptions(domainEndpointOptions: IResolvable) {
      cdkBuilder.domainEndpointOptions(domainEndpointOptions.let(IResolvable::unwrap))
    }

    /**
     * @param domainEndpointOptions Specifies additional options for the domain endpoint, such as
     * whether to require HTTPS for all traffic or whether to use a custom endpoint rather than the
     * default endpoint.
     */
    override
        fun domainEndpointOptions(domainEndpointOptions: CfnDomain.DomainEndpointOptionsProperty) {
      cdkBuilder.domainEndpointOptions(domainEndpointOptions.let(CfnDomain.DomainEndpointOptionsProperty::unwrap))
    }

    /**
     * @param domainEndpointOptions Specifies additional options for the domain endpoint, such as
     * whether to require HTTPS for all traffic or whether to use a custom endpoint rather than the
     * default endpoint.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("f84379a8689372c0b471619ea2587600fdaab93d3355b719732a00352a0d4131")
    override
        fun domainEndpointOptions(domainEndpointOptions: CfnDomain.DomainEndpointOptionsProperty.Builder.() -> Unit):
        Unit = domainEndpointOptions(CfnDomain.DomainEndpointOptionsProperty(domainEndpointOptions))

    /**
     * @param domainName A name for the OpenSearch Service domain.
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
     */
    override fun domainName(domainName: String) {
      cdkBuilder.domainName(domainName)
    }

    /**
     * @param ebsOptions The configurations of Amazon Elastic Block Store (Amazon EBS) volumes that
     * are attached to data nodes in the OpenSearch Service domain.
     * For more information, see [EBS volume size
     * limits](https://docs.aws.amazon.com/opensearch-service/latest/developerguide/limits.html#ebsresource)
     * in the *Amazon OpenSearch Service Developer Guide* .
     */
    override fun ebsOptions(ebsOptions: IResolvable) {
      cdkBuilder.ebsOptions(ebsOptions.let(IResolvable::unwrap))
    }

    /**
     * @param ebsOptions The configurations of Amazon Elastic Block Store (Amazon EBS) volumes that
     * are attached to data nodes in the OpenSearch Service domain.
     * For more information, see [EBS volume size
     * limits](https://docs.aws.amazon.com/opensearch-service/latest/developerguide/limits.html#ebsresource)
     * in the *Amazon OpenSearch Service Developer Guide* .
     */
    override fun ebsOptions(ebsOptions: CfnDomain.EBSOptionsProperty) {
      cdkBuilder.ebsOptions(ebsOptions.let(CfnDomain.EBSOptionsProperty::unwrap))
    }

    /**
     * @param ebsOptions The configurations of Amazon Elastic Block Store (Amazon EBS) volumes that
     * are attached to data nodes in the OpenSearch Service domain.
     * For more information, see [EBS volume size
     * limits](https://docs.aws.amazon.com/opensearch-service/latest/developerguide/limits.html#ebsresource)
     * in the *Amazon OpenSearch Service Developer Guide* .
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("c5650cf1db98cb0af7433f5ba44cd71bde157d752274c6e9eea214e78761b167")
    override fun ebsOptions(ebsOptions: CfnDomain.EBSOptionsProperty.Builder.() -> Unit): Unit =
        ebsOptions(CfnDomain.EBSOptionsProperty(ebsOptions))

    /**
     * @param elasticsearchClusterConfig ElasticsearchClusterConfig is a property of the
     * AWS::Elasticsearch::Domain resource that configures the cluster of an Amazon OpenSearch Service
     * domain.
     */
    override fun elasticsearchClusterConfig(elasticsearchClusterConfig: IResolvable) {
      cdkBuilder.elasticsearchClusterConfig(elasticsearchClusterConfig.let(IResolvable::unwrap))
    }

    /**
     * @param elasticsearchClusterConfig ElasticsearchClusterConfig is a property of the
     * AWS::Elasticsearch::Domain resource that configures the cluster of an Amazon OpenSearch Service
     * domain.
     */
    override
        fun elasticsearchClusterConfig(elasticsearchClusterConfig: CfnDomain.ElasticsearchClusterConfigProperty) {
      cdkBuilder.elasticsearchClusterConfig(elasticsearchClusterConfig.let(CfnDomain.ElasticsearchClusterConfigProperty::unwrap))
    }

    /**
     * @param elasticsearchClusterConfig ElasticsearchClusterConfig is a property of the
     * AWS::Elasticsearch::Domain resource that configures the cluster of an Amazon OpenSearch Service
     * domain.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("c066cb1f954b7830700b635d3a8aa99f7e44df883c1bb8d1a67f2f9ad8b8f7a0")
    override
        fun elasticsearchClusterConfig(elasticsearchClusterConfig: CfnDomain.ElasticsearchClusterConfigProperty.Builder.() -> Unit):
        Unit =
        elasticsearchClusterConfig(CfnDomain.ElasticsearchClusterConfigProperty(elasticsearchClusterConfig))

    /**
     * @param elasticsearchVersion The version of Elasticsearch to use, such as 2.3. If not
     * specified, 1.5 is used as the default. For information about the versions that OpenSearch
     * Service supports, see [Supported versions of OpenSearch and
     * Elasticsearch](https://docs.aws.amazon.com/opensearch-service/latest/developerguide/what-is.html#choosing-version)
     * in the *Amazon OpenSearch Service Developer Guide* .
     * If you set the
     * [EnableVersionUpgrade](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-attribute-updatepolicy.html#cfn-attributes-updatepolicy-upgradeopensearchdomain)
     * update policy to `true` , you can update `ElasticsearchVersion` without interruption. When
     * `EnableVersionUpgrade` is set to `false` , or is not specified, updating `ElasticsearchVersion`
     * results in
     * [replacement](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/using-cfn-updating-stacks-update-behaviors.html#update-replacement)
     * .
     */
    override fun elasticsearchVersion(elasticsearchVersion: String) {
      cdkBuilder.elasticsearchVersion(elasticsearchVersion)
    }

    /**
     * @param encryptionAtRestOptions Whether the domain should encrypt data at rest, and if so, the
     * AWS Key Management Service key to use.
     * See [Encryption of data at rest for Amazon OpenSearch
     * Service](https://docs.aws.amazon.com/opensearch-service/latest/developerguide/encryption-at-rest.html)
     * .
     */
    override fun encryptionAtRestOptions(encryptionAtRestOptions: IResolvable) {
      cdkBuilder.encryptionAtRestOptions(encryptionAtRestOptions.let(IResolvable::unwrap))
    }

    /**
     * @param encryptionAtRestOptions Whether the domain should encrypt data at rest, and if so, the
     * AWS Key Management Service key to use.
     * See [Encryption of data at rest for Amazon OpenSearch
     * Service](https://docs.aws.amazon.com/opensearch-service/latest/developerguide/encryption-at-rest.html)
     * .
     */
    override
        fun encryptionAtRestOptions(encryptionAtRestOptions: CfnDomain.EncryptionAtRestOptionsProperty) {
      cdkBuilder.encryptionAtRestOptions(encryptionAtRestOptions.let(CfnDomain.EncryptionAtRestOptionsProperty::unwrap))
    }

    /**
     * @param encryptionAtRestOptions Whether the domain should encrypt data at rest, and if so, the
     * AWS Key Management Service key to use.
     * See [Encryption of data at rest for Amazon OpenSearch
     * Service](https://docs.aws.amazon.com/opensearch-service/latest/developerguide/encryption-at-rest.html)
     * .
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("d4072ac921cbb0c2727d782a42bd58e69362114e428175970aeec397d2c8c2a7")
    override
        fun encryptionAtRestOptions(encryptionAtRestOptions: CfnDomain.EncryptionAtRestOptionsProperty.Builder.() -> Unit):
        Unit =
        encryptionAtRestOptions(CfnDomain.EncryptionAtRestOptionsProperty(encryptionAtRestOptions))

    /**
     * @param logPublishingOptions An object with one or more of the following keys:
     * `SEARCH_SLOW_LOGS` , `ES_APPLICATION_LOGS` , `INDEX_SLOW_LOGS` , `AUDIT_LOGS` , depending on the
     * types of logs you want to publish.
     * Each key needs a valid `LogPublishingOption` value.
     */
    override fun logPublishingOptions(logPublishingOptions: IResolvable) {
      cdkBuilder.logPublishingOptions(logPublishingOptions.let(IResolvable::unwrap))
    }

    /**
     * @param logPublishingOptions An object with one or more of the following keys:
     * `SEARCH_SLOW_LOGS` , `ES_APPLICATION_LOGS` , `INDEX_SLOW_LOGS` , `AUDIT_LOGS` , depending on the
     * types of logs you want to publish.
     * Each key needs a valid `LogPublishingOption` value.
     */
    override fun logPublishingOptions(logPublishingOptions: Map<String, Any>) {
      cdkBuilder.logPublishingOptions(logPublishingOptions)
    }

    /**
     * @param nodeToNodeEncryptionOptions Specifies whether node-to-node encryption is enabled.
     * See [Node-to-node encryption for Amazon OpenSearch
     * Service](https://docs.aws.amazon.com/opensearch-service/latest/developerguide/ntn.html) .
     */
    override fun nodeToNodeEncryptionOptions(nodeToNodeEncryptionOptions: IResolvable) {
      cdkBuilder.nodeToNodeEncryptionOptions(nodeToNodeEncryptionOptions.let(IResolvable::unwrap))
    }

    /**
     * @param nodeToNodeEncryptionOptions Specifies whether node-to-node encryption is enabled.
     * See [Node-to-node encryption for Amazon OpenSearch
     * Service](https://docs.aws.amazon.com/opensearch-service/latest/developerguide/ntn.html) .
     */
    override
        fun nodeToNodeEncryptionOptions(nodeToNodeEncryptionOptions: CfnDomain.NodeToNodeEncryptionOptionsProperty) {
      cdkBuilder.nodeToNodeEncryptionOptions(nodeToNodeEncryptionOptions.let(CfnDomain.NodeToNodeEncryptionOptionsProperty::unwrap))
    }

    /**
     * @param nodeToNodeEncryptionOptions Specifies whether node-to-node encryption is enabled.
     * See [Node-to-node encryption for Amazon OpenSearch
     * Service](https://docs.aws.amazon.com/opensearch-service/latest/developerguide/ntn.html) .
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("c228037ed4321e49b29dc77e8c0e144466ef1ff7bd5857ac200883f0ecfa7329")
    override
        fun nodeToNodeEncryptionOptions(nodeToNodeEncryptionOptions: CfnDomain.NodeToNodeEncryptionOptionsProperty.Builder.() -> Unit):
        Unit =
        nodeToNodeEncryptionOptions(CfnDomain.NodeToNodeEncryptionOptionsProperty(nodeToNodeEncryptionOptions))

    /**
     * @param snapshotOptions *DEPRECATED* .
     * The automated snapshot configuration for the OpenSearch Service domain indices.
     */
    override fun snapshotOptions(snapshotOptions: IResolvable) {
      cdkBuilder.snapshotOptions(snapshotOptions.let(IResolvable::unwrap))
    }

    /**
     * @param snapshotOptions *DEPRECATED* .
     * The automated snapshot configuration for the OpenSearch Service domain indices.
     */
    override fun snapshotOptions(snapshotOptions: CfnDomain.SnapshotOptionsProperty) {
      cdkBuilder.snapshotOptions(snapshotOptions.let(CfnDomain.SnapshotOptionsProperty::unwrap))
    }

    /**
     * @param snapshotOptions *DEPRECATED* .
     * The automated snapshot configuration for the OpenSearch Service domain indices.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("8fa0ba68714d54331505baf65e67e92cf187bcda367bf8ac2bb5eef1bed2adea")
    override
        fun snapshotOptions(snapshotOptions: CfnDomain.SnapshotOptionsProperty.Builder.() -> Unit):
        Unit = snapshotOptions(CfnDomain.SnapshotOptionsProperty(snapshotOptions))

    /**
     * @param tags An arbitrary set of tags (key–value pairs) to associate with the OpenSearch
     * Service domain.
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    /**
     * @param tags An arbitrary set of tags (key–value pairs) to associate with the OpenSearch
     * Service domain.
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    /**
     * @param vpcOptions The virtual private cloud (VPC) configuration for the OpenSearch Service
     * domain.
     * For more information, see [Launching your Amazon OpenSearch Service domains within a
     * VPC](https://docs.aws.amazon.com/opensearch-service/latest/developerguide/vpc.html) in the
     * *Amazon OpenSearch Service Developer Guide* .
     */
    override fun vpcOptions(vpcOptions: IResolvable) {
      cdkBuilder.vpcOptions(vpcOptions.let(IResolvable::unwrap))
    }

    /**
     * @param vpcOptions The virtual private cloud (VPC) configuration for the OpenSearch Service
     * domain.
     * For more information, see [Launching your Amazon OpenSearch Service domains within a
     * VPC](https://docs.aws.amazon.com/opensearch-service/latest/developerguide/vpc.html) in the
     * *Amazon OpenSearch Service Developer Guide* .
     */
    override fun vpcOptions(vpcOptions: CfnDomain.VPCOptionsProperty) {
      cdkBuilder.vpcOptions(vpcOptions.let(CfnDomain.VPCOptionsProperty::unwrap))
    }

    /**
     * @param vpcOptions The virtual private cloud (VPC) configuration for the OpenSearch Service
     * domain.
     * For more information, see [Launching your Amazon OpenSearch Service domains within a
     * VPC](https://docs.aws.amazon.com/opensearch-service/latest/developerguide/vpc.html) in the
     * *Amazon OpenSearch Service Developer Guide* .
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("bd085fa7b192f56cb1de104be3ad5979fd46f6c5045776f9400610a20b8cd0a9")
    override fun vpcOptions(vpcOptions: CfnDomain.VPCOptionsProperty.Builder.() -> Unit): Unit =
        vpcOptions(CfnDomain.VPCOptionsProperty(vpcOptions))

    public fun build(): software.amazon.awscdk.services.elasticsearch.CfnDomainProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.elasticsearch.CfnDomainProps,
  ) : CdkObject(cdkObject), CfnDomainProps {
    /**
     * An AWS Identity and Access Management ( IAM ) policy document that specifies who can access
     * the OpenSearch Service domain and their permissions.
     *
     * For more information, see [Configuring access
     * policies](https://docs.aws.amazon.com/opensearch-service/latest/developerguide/ac.html#ac-creating)
     * in the *Amazon OpenSearch Service Developer Guid* e.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticsearch-domain.html#cfn-elasticsearch-domain-accesspolicies)
     */
    override fun accessPolicies(): Any? = unwrap(this).getAccessPolicies()

    /**
     * Additional options to specify for the OpenSearch Service domain.
     *
     * For more information, see [Advanced cluster
     * parameters](https://docs.aws.amazon.com/opensearch-service/latest/developerguide/createupdatedomains.html#createdomain-configure-advanced-options)
     * in the *Amazon OpenSearch Service Developer Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticsearch-domain.html#cfn-elasticsearch-domain-advancedoptions)
     */
    override fun advancedOptions(): Any? = unwrap(this).getAdvancedOptions()

    /**
     * Specifies options for fine-grained access control.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticsearch-domain.html#cfn-elasticsearch-domain-advancedsecurityoptions)
     */
    override fun advancedSecurityOptions(): Any? = unwrap(this).getAdvancedSecurityOptions()

    /**
     * Configures OpenSearch Service to use Amazon Cognito authentication for OpenSearch Dashboards.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticsearch-domain.html#cfn-elasticsearch-domain-cognitooptions)
     */
    override fun cognitoOptions(): Any? = unwrap(this).getCognitoOptions()

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticsearch-domain.html#cfn-elasticsearch-domain-domainarn)
     */
    override fun domainArn(): String? = unwrap(this).getDomainArn()

    /**
     * Specifies additional options for the domain endpoint, such as whether to require HTTPS for
     * all traffic or whether to use a custom endpoint rather than the default endpoint.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticsearch-domain.html#cfn-elasticsearch-domain-domainendpointoptions)
     */
    override fun domainEndpointOptions(): Any? = unwrap(this).getDomainEndpointOptions()

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
     */
    override fun domainName(): String? = unwrap(this).getDomainName()

    /**
     * The configurations of Amazon Elastic Block Store (Amazon EBS) volumes that are attached to
     * data nodes in the OpenSearch Service domain.
     *
     * For more information, see [EBS volume size
     * limits](https://docs.aws.amazon.com/opensearch-service/latest/developerguide/limits.html#ebsresource)
     * in the *Amazon OpenSearch Service Developer Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticsearch-domain.html#cfn-elasticsearch-domain-ebsoptions)
     */
    override fun ebsOptions(): Any? = unwrap(this).getEbsOptions()

    /**
     * ElasticsearchClusterConfig is a property of the AWS::Elasticsearch::Domain resource that
     * configures the cluster of an Amazon OpenSearch Service domain.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticsearch-domain.html#cfn-elasticsearch-domain-elasticsearchclusterconfig)
     */
    override fun elasticsearchClusterConfig(): Any? = unwrap(this).getElasticsearchClusterConfig()

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
     */
    override fun elasticsearchVersion(): String? = unwrap(this).getElasticsearchVersion()

    /**
     * Whether the domain should encrypt data at rest, and if so, the AWS Key Management Service key
     * to use.
     *
     * See [Encryption of data at rest for Amazon OpenSearch
     * Service](https://docs.aws.amazon.com/opensearch-service/latest/developerguide/encryption-at-rest.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticsearch-domain.html#cfn-elasticsearch-domain-encryptionatrestoptions)
     */
    override fun encryptionAtRestOptions(): Any? = unwrap(this).getEncryptionAtRestOptions()

    /**
     * An object with one or more of the following keys: `SEARCH_SLOW_LOGS` , `ES_APPLICATION_LOGS`
     * , `INDEX_SLOW_LOGS` , `AUDIT_LOGS` , depending on the types of logs you want to publish.
     *
     * Each key needs a valid `LogPublishingOption` value.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticsearch-domain.html#cfn-elasticsearch-domain-logpublishingoptions)
     */
    override fun logPublishingOptions(): Any? = unwrap(this).getLogPublishingOptions()

    /**
     * Specifies whether node-to-node encryption is enabled.
     *
     * See [Node-to-node encryption for Amazon OpenSearch
     * Service](https://docs.aws.amazon.com/opensearch-service/latest/developerguide/ntn.html) .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticsearch-domain.html#cfn-elasticsearch-domain-nodetonodeencryptionoptions)
     */
    override fun nodeToNodeEncryptionOptions(): Any? = unwrap(this).getNodeToNodeEncryptionOptions()

    /**
     * *DEPRECATED* .
     *
     * The automated snapshot configuration for the OpenSearch Service domain indices.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticsearch-domain.html#cfn-elasticsearch-domain-snapshotoptions)
     */
    override fun snapshotOptions(): Any? = unwrap(this).getSnapshotOptions()

    /**
     * An arbitrary set of tags (key–value pairs) to associate with the OpenSearch Service domain.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticsearch-domain.html#cfn-elasticsearch-domain-tags)
     */
    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

    /**
     * The virtual private cloud (VPC) configuration for the OpenSearch Service domain.
     *
     * For more information, see [Launching your Amazon OpenSearch Service domains within a
     * VPC](https://docs.aws.amazon.com/opensearch-service/latest/developerguide/vpc.html) in the
     * *Amazon OpenSearch Service Developer Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticsearch-domain.html#cfn-elasticsearch-domain-vpcoptions)
     */
    override fun vpcOptions(): Any? = unwrap(this).getVpcOptions()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnDomainProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.elasticsearch.CfnDomainProps):
        CfnDomainProps = CdkObjectWrappers.wrap(cdkObject) as CfnDomainProps

    internal fun unwrap(wrapped: CfnDomainProps):
        software.amazon.awscdk.services.elasticsearch.CfnDomainProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.elasticsearch.CfnDomainProps
  }
}
