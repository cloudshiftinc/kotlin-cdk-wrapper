package io.cloudshiftdev.awscdk.services.opensearchservice

import io.cloudshiftdev.awscdk.CdkObject
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.collections.List
import kotlin.collections.Map
import kotlin.jvm.JvmName

public interface CfnDomainProps {
  /**
   * An AWS Identity and Access Management ( IAM ) policy document that specifies who can access the
   * OpenSearch Service domain and their permissions.
   *
   * For more information, see [Configuring access
   * policies](https://docs.aws.amazon.com/opensearch-service/latest/developerguide/ac.html#ac-creating)
   * in the *Amazon OpenSearch Service Developer Guide* .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opensearchservice-domain.html#cfn-opensearchservice-domain-accesspolicies)
   */
  public fun accessPolicies(): Any? = unwrap(this).getAccessPolicies()

  /**
   * Additional options to specify for the OpenSearch Service domain.
   *
   * For more information, see
   * [AdvancedOptions](https://docs.aws.amazon.com/opensearch-service/latest/APIReference/API_CreateDomain.html#API_CreateDomain_RequestBody)
   * in the OpenSearch Service API reference.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opensearchservice-domain.html#cfn-opensearchservice-domain-advancedoptions)
   */
  public fun advancedOptions(): Any? = unwrap(this).getAdvancedOptions()

  /**
   * Specifies options for fine-grained access control and SAML authentication.
   *
   * If you specify advanced security options, you must also enable node-to-node encryption (
   * [NodeToNodeEncryptionOptions](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opensearchservice-domain-nodetonodeencryptionoptions.html)
   * ) and encryption at rest (
   * [EncryptionAtRestOptions](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opensearchservice-domain-encryptionatrestoptions.html)
   * ). You must also enable `EnforceHTTPS` within
   * [DomainEndpointOptions](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opensearchservice-domain-domainendpointoptions.html)
   * , which requires HTTPS for all traffic to the domain.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opensearchservice-domain.html#cfn-opensearchservice-domain-advancedsecurityoptions)
   */
  public fun advancedSecurityOptions(): Any? = unwrap(this).getAdvancedSecurityOptions()

  /**
   * Container for the cluster configuration of a domain.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opensearchservice-domain.html#cfn-opensearchservice-domain-clusterconfig)
   */
  public fun clusterConfig(): Any? = unwrap(this).getClusterConfig()

  /**
   * Configures OpenSearch Service to use Amazon Cognito authentication for OpenSearch Dashboards.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opensearchservice-domain.html#cfn-opensearchservice-domain-cognitooptions)
   */
  public fun cognitoOptions(): Any? = unwrap(this).getCognitoOptions()

  /**
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opensearchservice-domain.html#cfn-opensearchservice-domain-domainarn)
   */
  public fun domainArn(): String? = unwrap(this).getDomainArn()

  /**
   * Specifies additional options for the domain endpoint, such as whether to require HTTPS for all
   * traffic or whether to use a custom endpoint rather than the default endpoint.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opensearchservice-domain.html#cfn-opensearchservice-domain-domainendpointoptions)
   */
  public fun domainEndpointOptions(): Any? = unwrap(this).getDomainEndpointOptions()

  /**
   * A name for the OpenSearch Service domain.
   *
   * The name must have a minimum length of 3 and a maximum length of 28. If you don't specify a
   * name, AWS CloudFormation generates a unique physical ID and uses that ID for the domain name. For
   * more information, see [Name
   * Type](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-name.html) .
   *
   * Required when creating a new domain.
   *
   *
   * If you specify a name, you can't perform updates that require replacement of this resource. You
   * can perform updates that require no or some interruption. If you must replace the resource,
   * specify a new name.
   *
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opensearchservice-domain.html#cfn-opensearchservice-domain-domainname)
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
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opensearchservice-domain.html#cfn-opensearchservice-domain-ebsoptions)
   */
  public fun ebsOptions(): Any? = unwrap(this).getEbsOptions()

  /**
   * Whether the domain should encrypt data at rest, and if so, the AWS KMS key to use.
   *
   * See [Encryption of data at rest for Amazon OpenSearch
   * Service](https://docs.aws.amazon.com/opensearch-service/latest/developerguide/encryption-at-rest.html)
   * .
   *
   * If no encryption at rest options were initially specified in the template, updating this
   * property by adding it causes no interruption. However, if you change this property after it's
   * already been set within a template, the domain is deleted and recreated in order to modify the
   * property.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opensearchservice-domain.html#cfn-opensearchservice-domain-encryptionatrestoptions)
   */
  public fun encryptionAtRestOptions(): Any? = unwrap(this).getEncryptionAtRestOptions()

  /**
   * The version of OpenSearch to use.
   *
   * The value must be in the format `OpenSearch_X.Y` or `Elasticsearch_X.Y` . If not specified, the
   * latest version of OpenSearch is used. For information about the versions that OpenSearch Service
   * supports, see [Supported versions of OpenSearch and
   * Elasticsearch](https://docs.aws.amazon.com/opensearch-service/latest/developerguide/what-is.html#choosing-version)
   * in the *Amazon OpenSearch Service Developer Guide* .
   *
   * If you set the
   * [EnableVersionUpgrade](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-attribute-updatepolicy.html#cfn-attributes-updatepolicy-upgradeopensearchdomain)
   * update policy to `true` , you can update `EngineVersion` without interruption. When
   * `EnableVersionUpgrade` is set to `false` , or is not specified, updating `EngineVersion` results
   * in
   * [replacement](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/using-cfn-updating-stacks-update-behaviors.html#update-replacement)
   * .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opensearchservice-domain.html#cfn-opensearchservice-domain-engineversion)
   */
  public fun engineVersion(): String? = unwrap(this).getEngineVersion()

  /**
   * Choose either dual stack or IPv4 as your IP address type.
   *
   * Dual stack allows you to share domain resources across IPv4 and IPv6 address types, and is the
   * recommended option. If you set your IP address type to dual stack, you can't change your address
   * type later.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opensearchservice-domain.html#cfn-opensearchservice-domain-ipaddresstype)
   */
  public fun ipAddressType(): String? = unwrap(this).getIpAddressType()

  /**
   * An object with one or more of the following keys: `SEARCH_SLOW_LOGS` , `ES_APPLICATION_LOGS` ,
   * `INDEX_SLOW_LOGS` , `AUDIT_LOGS` , depending on the types of logs you want to publish.
   *
   * Each key needs a valid `LogPublishingOption` value. For the full syntax, see the
   * [examples](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opensearchservice-domain.html#aws-resource-opensearchservice-domain--examples)
   * .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opensearchservice-domain.html#cfn-opensearchservice-domain-logpublishingoptions)
   */
  public fun logPublishingOptions(): Any? = unwrap(this).getLogPublishingOptions()

  /**
   * Specifies whether node-to-node encryption is enabled.
   *
   * See [Node-to-node encryption for Amazon OpenSearch
   * Service](https://docs.aws.amazon.com/opensearch-service/latest/developerguide/ntn.html) .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opensearchservice-domain.html#cfn-opensearchservice-domain-nodetonodeencryptionoptions)
   */
  public fun nodeToNodeEncryptionOptions(): Any? = unwrap(this).getNodeToNodeEncryptionOptions()

  /**
   * Options for a domain's off-peak window, during which OpenSearch Service can perform mandatory
   * configuration changes on the domain.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opensearchservice-domain.html#cfn-opensearchservice-domain-offpeakwindowoptions)
   */
  public fun offPeakWindowOptions(): Any? = unwrap(this).getOffPeakWindowOptions()

  /**
   * *DEPRECATED* .
   *
   * The automated snapshot configuration for the OpenSearch Service domain indexes.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opensearchservice-domain.html#cfn-opensearchservice-domain-snapshotoptions)
   */
  public fun snapshotOptions(): Any? = unwrap(this).getSnapshotOptions()

  /**
   * Service software update options for the domain.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opensearchservice-domain.html#cfn-opensearchservice-domain-softwareupdateoptions)
   */
  public fun softwareUpdateOptions(): Any? = unwrap(this).getSoftwareUpdateOptions()

  /**
   * An arbitrary set of tags (key–value pairs) to associate with the OpenSearch Service domain.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opensearchservice-domain.html#cfn-opensearchservice-domain-tags)
   */
  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * The virtual private cloud (VPC) configuration for the OpenSearch Service domain.
   *
   * For more information, see [Launching your Amazon OpenSearch Service domains within a
   * VPC](https://docs.aws.amazon.com/opensearch-service/latest/developerguide/vpc.html) in the *Amazon
   * OpenSearch Service Developer Guide* .
   *
   * If you remove this entity altogether, along with its associated properties, it causes a
   * replacement. You might encounter this scenario if you're updating your security configuration from
   * a VPC to a public endpoint.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opensearchservice-domain.html#cfn-opensearchservice-domain-vpcoptions)
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
     * in the *Amazon OpenSearch Service Developer Guide* .
     */
    public fun accessPolicies(accessPolicies: Any)

    /**
     * @param advancedOptions Additional options to specify for the OpenSearch Service domain.
     * For more information, see
     * [AdvancedOptions](https://docs.aws.amazon.com/opensearch-service/latest/APIReference/API_CreateDomain.html#API_CreateDomain_RequestBody)
     * in the OpenSearch Service API reference.
     */
    public fun advancedOptions(advancedOptions: IResolvable)

    /**
     * @param advancedOptions Additional options to specify for the OpenSearch Service domain.
     * For more information, see
     * [AdvancedOptions](https://docs.aws.amazon.com/opensearch-service/latest/APIReference/API_CreateDomain.html#API_CreateDomain_RequestBody)
     * in the OpenSearch Service API reference.
     */
    public fun advancedOptions(advancedOptions: Map<String, String>)

    /**
     * @param advancedSecurityOptions Specifies options for fine-grained access control and SAML
     * authentication.
     * If you specify advanced security options, you must also enable node-to-node encryption (
     * [NodeToNodeEncryptionOptions](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opensearchservice-domain-nodetonodeencryptionoptions.html)
     * ) and encryption at rest (
     * [EncryptionAtRestOptions](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opensearchservice-domain-encryptionatrestoptions.html)
     * ). You must also enable `EnforceHTTPS` within
     * [DomainEndpointOptions](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opensearchservice-domain-domainendpointoptions.html)
     * , which requires HTTPS for all traffic to the domain.
     */
    public fun advancedSecurityOptions(advancedSecurityOptions: IResolvable)

    /**
     * @param advancedSecurityOptions Specifies options for fine-grained access control and SAML
     * authentication.
     * If you specify advanced security options, you must also enable node-to-node encryption (
     * [NodeToNodeEncryptionOptions](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opensearchservice-domain-nodetonodeencryptionoptions.html)
     * ) and encryption at rest (
     * [EncryptionAtRestOptions](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opensearchservice-domain-encryptionatrestoptions.html)
     * ). You must also enable `EnforceHTTPS` within
     * [DomainEndpointOptions](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opensearchservice-domain-domainendpointoptions.html)
     * , which requires HTTPS for all traffic to the domain.
     */
    public
        fun advancedSecurityOptions(advancedSecurityOptions: CfnDomain.AdvancedSecurityOptionsInputProperty)

    /**
     * @param advancedSecurityOptions Specifies options for fine-grained access control and SAML
     * authentication.
     * If you specify advanced security options, you must also enable node-to-node encryption (
     * [NodeToNodeEncryptionOptions](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opensearchservice-domain-nodetonodeencryptionoptions.html)
     * ) and encryption at rest (
     * [EncryptionAtRestOptions](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opensearchservice-domain-encryptionatrestoptions.html)
     * ). You must also enable `EnforceHTTPS` within
     * [DomainEndpointOptions](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opensearchservice-domain-domainendpointoptions.html)
     * , which requires HTTPS for all traffic to the domain.
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("30ee01b6517988e016702c0105a13244fc39a2b67acb3b25d648b02bb1ca0315")
    public
        fun advancedSecurityOptions(advancedSecurityOptions: CfnDomain.AdvancedSecurityOptionsInputProperty.Builder.() -> Unit)

    /**
     * @param clusterConfig Container for the cluster configuration of a domain.
     */
    public fun clusterConfig(clusterConfig: IResolvable)

    /**
     * @param clusterConfig Container for the cluster configuration of a domain.
     */
    public fun clusterConfig(clusterConfig: CfnDomain.ClusterConfigProperty)

    /**
     * @param clusterConfig Container for the cluster configuration of a domain.
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("687c132b4b0ffd0bc9bac0e8de2446bab001c920a4d4af584fe3264ddce988de")
    public fun clusterConfig(clusterConfig: CfnDomain.ClusterConfigProperty.Builder.() -> Unit)

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
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("118366a035fd8aafeeec90750d0fdc0e1b356259add40980f15d2d6304d50439")
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
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("051edb339c8b160f809c4b2e5afe7f3e8443311c6d7eb20776d5c0335f15e280")
    public
        fun domainEndpointOptions(domainEndpointOptions: CfnDomain.DomainEndpointOptionsProperty.Builder.() -> Unit)

    /**
     * @param domainName A name for the OpenSearch Service domain.
     * The name must have a minimum length of 3 and a maximum length of 28. If you don't specify a
     * name, AWS CloudFormation generates a unique physical ID and uses that ID for the domain name.
     * For more information, see [Name
     * Type](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-name.html) .
     *
     * Required when creating a new domain.
     *
     *
     * If you specify a name, you can't perform updates that require replacement of this resource.
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
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("76604c52ddb45fa2e3e93fe73d14da85c5309704253238b37106c691b6737aff")
    public fun ebsOptions(ebsOptions: CfnDomain.EBSOptionsProperty.Builder.() -> Unit)

    /**
     * @param encryptionAtRestOptions Whether the domain should encrypt data at rest, and if so, the
     * AWS KMS key to use.
     * See [Encryption of data at rest for Amazon OpenSearch
     * Service](https://docs.aws.amazon.com/opensearch-service/latest/developerguide/encryption-at-rest.html)
     * .
     *
     * If no encryption at rest options were initially specified in the template, updating this
     * property by adding it causes no interruption. However, if you change this property after it's
     * already been set within a template, the domain is deleted and recreated in order to modify the
     * property.
     */
    public fun encryptionAtRestOptions(encryptionAtRestOptions: IResolvable)

    /**
     * @param encryptionAtRestOptions Whether the domain should encrypt data at rest, and if so, the
     * AWS KMS key to use.
     * See [Encryption of data at rest for Amazon OpenSearch
     * Service](https://docs.aws.amazon.com/opensearch-service/latest/developerguide/encryption-at-rest.html)
     * .
     *
     * If no encryption at rest options were initially specified in the template, updating this
     * property by adding it causes no interruption. However, if you change this property after it's
     * already been set within a template, the domain is deleted and recreated in order to modify the
     * property.
     */
    public
        fun encryptionAtRestOptions(encryptionAtRestOptions: CfnDomain.EncryptionAtRestOptionsProperty)

    /**
     * @param encryptionAtRestOptions Whether the domain should encrypt data at rest, and if so, the
     * AWS KMS key to use.
     * See [Encryption of data at rest for Amazon OpenSearch
     * Service](https://docs.aws.amazon.com/opensearch-service/latest/developerguide/encryption-at-rest.html)
     * .
     *
     * If no encryption at rest options were initially specified in the template, updating this
     * property by adding it causes no interruption. However, if you change this property after it's
     * already been set within a template, the domain is deleted and recreated in order to modify the
     * property.
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("0675df4b91d7c60f2bfbcac7f144a25e595f44ffbddd0d51a6732e6d9180c804")
    public
        fun encryptionAtRestOptions(encryptionAtRestOptions: CfnDomain.EncryptionAtRestOptionsProperty.Builder.() -> Unit)

    /**
     * @param engineVersion The version of OpenSearch to use.
     * The value must be in the format `OpenSearch_X.Y` or `Elasticsearch_X.Y` . If not specified,
     * the latest version of OpenSearch is used. For information about the versions that OpenSearch
     * Service supports, see [Supported versions of OpenSearch and
     * Elasticsearch](https://docs.aws.amazon.com/opensearch-service/latest/developerguide/what-is.html#choosing-version)
     * in the *Amazon OpenSearch Service Developer Guide* .
     *
     * If you set the
     * [EnableVersionUpgrade](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-attribute-updatepolicy.html#cfn-attributes-updatepolicy-upgradeopensearchdomain)
     * update policy to `true` , you can update `EngineVersion` without interruption. When
     * `EnableVersionUpgrade` is set to `false` , or is not specified, updating `EngineVersion` results
     * in
     * [replacement](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/using-cfn-updating-stacks-update-behaviors.html#update-replacement)
     * .
     */
    public fun engineVersion(engineVersion: String)

    /**
     * @param ipAddressType Choose either dual stack or IPv4 as your IP address type.
     * Dual stack allows you to share domain resources across IPv4 and IPv6 address types, and is
     * the recommended option. If you set your IP address type to dual stack, you can't change your
     * address type later.
     */
    public fun ipAddressType(ipAddressType: String)

    /**
     * @param logPublishingOptions An object with one or more of the following keys:
     * `SEARCH_SLOW_LOGS` , `ES_APPLICATION_LOGS` , `INDEX_SLOW_LOGS` , `AUDIT_LOGS` , depending on the
     * types of logs you want to publish.
     * Each key needs a valid `LogPublishingOption` value. For the full syntax, see the
     * [examples](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opensearchservice-domain.html#aws-resource-opensearchservice-domain--examples)
     * .
     */
    public fun logPublishingOptions(logPublishingOptions: IResolvable)

    /**
     * @param logPublishingOptions An object with one or more of the following keys:
     * `SEARCH_SLOW_LOGS` , `ES_APPLICATION_LOGS` , `INDEX_SLOW_LOGS` , `AUDIT_LOGS` , depending on the
     * types of logs you want to publish.
     * Each key needs a valid `LogPublishingOption` value. For the full syntax, see the
     * [examples](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opensearchservice-domain.html#aws-resource-opensearchservice-domain--examples)
     * .
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
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("126c70573ca5a4c41bc9c179ce3f17c9ffc4b4063175fa41cef1982653a46939")
    public
        fun nodeToNodeEncryptionOptions(nodeToNodeEncryptionOptions: CfnDomain.NodeToNodeEncryptionOptionsProperty.Builder.() -> Unit)

    /**
     * @param offPeakWindowOptions Options for a domain's off-peak window, during which OpenSearch
     * Service can perform mandatory configuration changes on the domain.
     */
    public fun offPeakWindowOptions(offPeakWindowOptions: IResolvable)

    /**
     * @param offPeakWindowOptions Options for a domain's off-peak window, during which OpenSearch
     * Service can perform mandatory configuration changes on the domain.
     */
    public fun offPeakWindowOptions(offPeakWindowOptions: CfnDomain.OffPeakWindowOptionsProperty)

    /**
     * @param offPeakWindowOptions Options for a domain's off-peak window, during which OpenSearch
     * Service can perform mandatory configuration changes on the domain.
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("ca9d785ff5be5741e5ec97deacd17bda8dd39a70da0db7a61d3efe04fba61c09")
    public
        fun offPeakWindowOptions(offPeakWindowOptions: CfnDomain.OffPeakWindowOptionsProperty.Builder.() -> Unit)

    /**
     * @param snapshotOptions *DEPRECATED* .
     * The automated snapshot configuration for the OpenSearch Service domain indexes.
     */
    public fun snapshotOptions(snapshotOptions: IResolvable)

    /**
     * @param snapshotOptions *DEPRECATED* .
     * The automated snapshot configuration for the OpenSearch Service domain indexes.
     */
    public fun snapshotOptions(snapshotOptions: CfnDomain.SnapshotOptionsProperty)

    /**
     * @param snapshotOptions *DEPRECATED* .
     * The automated snapshot configuration for the OpenSearch Service domain indexes.
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("fc89ccf6c244ae00445f272cf807218ebe7041819bca81708fff0509fbec64a0")
    public
        fun snapshotOptions(snapshotOptions: CfnDomain.SnapshotOptionsProperty.Builder.() -> Unit)

    /**
     * @param softwareUpdateOptions Service software update options for the domain.
     */
    public fun softwareUpdateOptions(softwareUpdateOptions: IResolvable)

    /**
     * @param softwareUpdateOptions Service software update options for the domain.
     */
    public fun softwareUpdateOptions(softwareUpdateOptions: CfnDomain.SoftwareUpdateOptionsProperty)

    /**
     * @param softwareUpdateOptions Service software update options for the domain.
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("d95b98ca239721610e8320b147a9a7e1391d4417a9640c6cd923653f27dfe5cb")
    public
        fun softwareUpdateOptions(softwareUpdateOptions: CfnDomain.SoftwareUpdateOptionsProperty.Builder.() -> Unit)

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
     *
     * If you remove this entity altogether, along with its associated properties, it causes a
     * replacement. You might encounter this scenario if you're updating your security configuration
     * from a VPC to a public endpoint.
     */
    public fun vpcOptions(vpcOptions: IResolvable)

    /**
     * @param vpcOptions The virtual private cloud (VPC) configuration for the OpenSearch Service
     * domain.
     * For more information, see [Launching your Amazon OpenSearch Service domains within a
     * VPC](https://docs.aws.amazon.com/opensearch-service/latest/developerguide/vpc.html) in the
     * *Amazon OpenSearch Service Developer Guide* .
     *
     * If you remove this entity altogether, along with its associated properties, it causes a
     * replacement. You might encounter this scenario if you're updating your security configuration
     * from a VPC to a public endpoint.
     */
    public fun vpcOptions(vpcOptions: CfnDomain.VPCOptionsProperty)

    /**
     * @param vpcOptions The virtual private cloud (VPC) configuration for the OpenSearch Service
     * domain.
     * For more information, see [Launching your Amazon OpenSearch Service domains within a
     * VPC](https://docs.aws.amazon.com/opensearch-service/latest/developerguide/vpc.html) in the
     * *Amazon OpenSearch Service Developer Guide* .
     *
     * If you remove this entity altogether, along with its associated properties, it causes a
     * replacement. You might encounter this scenario if you're updating your security configuration
     * from a VPC to a public endpoint.
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("39958d8993f1ed65d23a53c8c95a6418a976f01082d16479c3c32ab5c014c1c1")
    public fun vpcOptions(vpcOptions: CfnDomain.VPCOptionsProperty.Builder.() -> Unit)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.opensearchservice.CfnDomainProps.Builder
        = software.amazon.awscdk.services.opensearchservice.CfnDomainProps.builder()

    /**
     * @param accessPolicies An AWS Identity and Access Management ( IAM ) policy document that
     * specifies who can access the OpenSearch Service domain and their permissions.
     * For more information, see [Configuring access
     * policies](https://docs.aws.amazon.com/opensearch-service/latest/developerguide/ac.html#ac-creating)
     * in the *Amazon OpenSearch Service Developer Guide* .
     */
    override fun accessPolicies(accessPolicies: Any) {
      cdkBuilder.accessPolicies(accessPolicies)
    }

    /**
     * @param advancedOptions Additional options to specify for the OpenSearch Service domain.
     * For more information, see
     * [AdvancedOptions](https://docs.aws.amazon.com/opensearch-service/latest/APIReference/API_CreateDomain.html#API_CreateDomain_RequestBody)
     * in the OpenSearch Service API reference.
     */
    override fun advancedOptions(advancedOptions: IResolvable) {
      cdkBuilder.advancedOptions(advancedOptions.let(IResolvable::unwrap))
    }

    /**
     * @param advancedOptions Additional options to specify for the OpenSearch Service domain.
     * For more information, see
     * [AdvancedOptions](https://docs.aws.amazon.com/opensearch-service/latest/APIReference/API_CreateDomain.html#API_CreateDomain_RequestBody)
     * in the OpenSearch Service API reference.
     */
    override fun advancedOptions(advancedOptions: Map<String, String>) {
      cdkBuilder.advancedOptions(advancedOptions)
    }

    /**
     * @param advancedSecurityOptions Specifies options for fine-grained access control and SAML
     * authentication.
     * If you specify advanced security options, you must also enable node-to-node encryption (
     * [NodeToNodeEncryptionOptions](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opensearchservice-domain-nodetonodeencryptionoptions.html)
     * ) and encryption at rest (
     * [EncryptionAtRestOptions](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opensearchservice-domain-encryptionatrestoptions.html)
     * ). You must also enable `EnforceHTTPS` within
     * [DomainEndpointOptions](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opensearchservice-domain-domainendpointoptions.html)
     * , which requires HTTPS for all traffic to the domain.
     */
    override fun advancedSecurityOptions(advancedSecurityOptions: IResolvable) {
      cdkBuilder.advancedSecurityOptions(advancedSecurityOptions.let(IResolvable::unwrap))
    }

    /**
     * @param advancedSecurityOptions Specifies options for fine-grained access control and SAML
     * authentication.
     * If you specify advanced security options, you must also enable node-to-node encryption (
     * [NodeToNodeEncryptionOptions](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opensearchservice-domain-nodetonodeencryptionoptions.html)
     * ) and encryption at rest (
     * [EncryptionAtRestOptions](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opensearchservice-domain-encryptionatrestoptions.html)
     * ). You must also enable `EnforceHTTPS` within
     * [DomainEndpointOptions](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opensearchservice-domain-domainendpointoptions.html)
     * , which requires HTTPS for all traffic to the domain.
     */
    override
        fun advancedSecurityOptions(advancedSecurityOptions: CfnDomain.AdvancedSecurityOptionsInputProperty) {
      cdkBuilder.advancedSecurityOptions(advancedSecurityOptions.let(CfnDomain.AdvancedSecurityOptionsInputProperty::unwrap))
    }

    /**
     * @param advancedSecurityOptions Specifies options for fine-grained access control and SAML
     * authentication.
     * If you specify advanced security options, you must also enable node-to-node encryption (
     * [NodeToNodeEncryptionOptions](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opensearchservice-domain-nodetonodeencryptionoptions.html)
     * ) and encryption at rest (
     * [EncryptionAtRestOptions](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opensearchservice-domain-encryptionatrestoptions.html)
     * ). You must also enable `EnforceHTTPS` within
     * [DomainEndpointOptions](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opensearchservice-domain-domainendpointoptions.html)
     * , which requires HTTPS for all traffic to the domain.
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("30ee01b6517988e016702c0105a13244fc39a2b67acb3b25d648b02bb1ca0315")
    override
        fun advancedSecurityOptions(advancedSecurityOptions: CfnDomain.AdvancedSecurityOptionsInputProperty.Builder.() -> Unit):
        Unit =
        advancedSecurityOptions(CfnDomain.AdvancedSecurityOptionsInputProperty(advancedSecurityOptions))

    /**
     * @param clusterConfig Container for the cluster configuration of a domain.
     */
    override fun clusterConfig(clusterConfig: IResolvable) {
      cdkBuilder.clusterConfig(clusterConfig.let(IResolvable::unwrap))
    }

    /**
     * @param clusterConfig Container for the cluster configuration of a domain.
     */
    override fun clusterConfig(clusterConfig: CfnDomain.ClusterConfigProperty) {
      cdkBuilder.clusterConfig(clusterConfig.let(CfnDomain.ClusterConfigProperty::unwrap))
    }

    /**
     * @param clusterConfig Container for the cluster configuration of a domain.
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("687c132b4b0ffd0bc9bac0e8de2446bab001c920a4d4af584fe3264ddce988de")
    override fun clusterConfig(clusterConfig: CfnDomain.ClusterConfigProperty.Builder.() -> Unit):
        Unit = clusterConfig(CfnDomain.ClusterConfigProperty(clusterConfig))

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
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("118366a035fd8aafeeec90750d0fdc0e1b356259add40980f15d2d6304d50439")
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
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("051edb339c8b160f809c4b2e5afe7f3e8443311c6d7eb20776d5c0335f15e280")
    override
        fun domainEndpointOptions(domainEndpointOptions: CfnDomain.DomainEndpointOptionsProperty.Builder.() -> Unit):
        Unit = domainEndpointOptions(CfnDomain.DomainEndpointOptionsProperty(domainEndpointOptions))

    /**
     * @param domainName A name for the OpenSearch Service domain.
     * The name must have a minimum length of 3 and a maximum length of 28. If you don't specify a
     * name, AWS CloudFormation generates a unique physical ID and uses that ID for the domain name.
     * For more information, see [Name
     * Type](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-name.html) .
     *
     * Required when creating a new domain.
     *
     *
     * If you specify a name, you can't perform updates that require replacement of this resource.
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
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("76604c52ddb45fa2e3e93fe73d14da85c5309704253238b37106c691b6737aff")
    override fun ebsOptions(ebsOptions: CfnDomain.EBSOptionsProperty.Builder.() -> Unit): Unit =
        ebsOptions(CfnDomain.EBSOptionsProperty(ebsOptions))

    /**
     * @param encryptionAtRestOptions Whether the domain should encrypt data at rest, and if so, the
     * AWS KMS key to use.
     * See [Encryption of data at rest for Amazon OpenSearch
     * Service](https://docs.aws.amazon.com/opensearch-service/latest/developerguide/encryption-at-rest.html)
     * .
     *
     * If no encryption at rest options were initially specified in the template, updating this
     * property by adding it causes no interruption. However, if you change this property after it's
     * already been set within a template, the domain is deleted and recreated in order to modify the
     * property.
     */
    override fun encryptionAtRestOptions(encryptionAtRestOptions: IResolvable) {
      cdkBuilder.encryptionAtRestOptions(encryptionAtRestOptions.let(IResolvable::unwrap))
    }

    /**
     * @param encryptionAtRestOptions Whether the domain should encrypt data at rest, and if so, the
     * AWS KMS key to use.
     * See [Encryption of data at rest for Amazon OpenSearch
     * Service](https://docs.aws.amazon.com/opensearch-service/latest/developerguide/encryption-at-rest.html)
     * .
     *
     * If no encryption at rest options were initially specified in the template, updating this
     * property by adding it causes no interruption. However, if you change this property after it's
     * already been set within a template, the domain is deleted and recreated in order to modify the
     * property.
     */
    override
        fun encryptionAtRestOptions(encryptionAtRestOptions: CfnDomain.EncryptionAtRestOptionsProperty) {
      cdkBuilder.encryptionAtRestOptions(encryptionAtRestOptions.let(CfnDomain.EncryptionAtRestOptionsProperty::unwrap))
    }

    /**
     * @param encryptionAtRestOptions Whether the domain should encrypt data at rest, and if so, the
     * AWS KMS key to use.
     * See [Encryption of data at rest for Amazon OpenSearch
     * Service](https://docs.aws.amazon.com/opensearch-service/latest/developerguide/encryption-at-rest.html)
     * .
     *
     * If no encryption at rest options were initially specified in the template, updating this
     * property by adding it causes no interruption. However, if you change this property after it's
     * already been set within a template, the domain is deleted and recreated in order to modify the
     * property.
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("0675df4b91d7c60f2bfbcac7f144a25e595f44ffbddd0d51a6732e6d9180c804")
    override
        fun encryptionAtRestOptions(encryptionAtRestOptions: CfnDomain.EncryptionAtRestOptionsProperty.Builder.() -> Unit):
        Unit =
        encryptionAtRestOptions(CfnDomain.EncryptionAtRestOptionsProperty(encryptionAtRestOptions))

    /**
     * @param engineVersion The version of OpenSearch to use.
     * The value must be in the format `OpenSearch_X.Y` or `Elasticsearch_X.Y` . If not specified,
     * the latest version of OpenSearch is used. For information about the versions that OpenSearch
     * Service supports, see [Supported versions of OpenSearch and
     * Elasticsearch](https://docs.aws.amazon.com/opensearch-service/latest/developerguide/what-is.html#choosing-version)
     * in the *Amazon OpenSearch Service Developer Guide* .
     *
     * If you set the
     * [EnableVersionUpgrade](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-attribute-updatepolicy.html#cfn-attributes-updatepolicy-upgradeopensearchdomain)
     * update policy to `true` , you can update `EngineVersion` without interruption. When
     * `EnableVersionUpgrade` is set to `false` , or is not specified, updating `EngineVersion` results
     * in
     * [replacement](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/using-cfn-updating-stacks-update-behaviors.html#update-replacement)
     * .
     */
    override fun engineVersion(engineVersion: String) {
      cdkBuilder.engineVersion(engineVersion)
    }

    /**
     * @param ipAddressType Choose either dual stack or IPv4 as your IP address type.
     * Dual stack allows you to share domain resources across IPv4 and IPv6 address types, and is
     * the recommended option. If you set your IP address type to dual stack, you can't change your
     * address type later.
     */
    override fun ipAddressType(ipAddressType: String) {
      cdkBuilder.ipAddressType(ipAddressType)
    }

    /**
     * @param logPublishingOptions An object with one or more of the following keys:
     * `SEARCH_SLOW_LOGS` , `ES_APPLICATION_LOGS` , `INDEX_SLOW_LOGS` , `AUDIT_LOGS` , depending on the
     * types of logs you want to publish.
     * Each key needs a valid `LogPublishingOption` value. For the full syntax, see the
     * [examples](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opensearchservice-domain.html#aws-resource-opensearchservice-domain--examples)
     * .
     */
    override fun logPublishingOptions(logPublishingOptions: IResolvable) {
      cdkBuilder.logPublishingOptions(logPublishingOptions.let(IResolvable::unwrap))
    }

    /**
     * @param logPublishingOptions An object with one or more of the following keys:
     * `SEARCH_SLOW_LOGS` , `ES_APPLICATION_LOGS` , `INDEX_SLOW_LOGS` , `AUDIT_LOGS` , depending on the
     * types of logs you want to publish.
     * Each key needs a valid `LogPublishingOption` value. For the full syntax, see the
     * [examples](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opensearchservice-domain.html#aws-resource-opensearchservice-domain--examples)
     * .
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
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("126c70573ca5a4c41bc9c179ce3f17c9ffc4b4063175fa41cef1982653a46939")
    override
        fun nodeToNodeEncryptionOptions(nodeToNodeEncryptionOptions: CfnDomain.NodeToNodeEncryptionOptionsProperty.Builder.() -> Unit):
        Unit =
        nodeToNodeEncryptionOptions(CfnDomain.NodeToNodeEncryptionOptionsProperty(nodeToNodeEncryptionOptions))

    /**
     * @param offPeakWindowOptions Options for a domain's off-peak window, during which OpenSearch
     * Service can perform mandatory configuration changes on the domain.
     */
    override fun offPeakWindowOptions(offPeakWindowOptions: IResolvable) {
      cdkBuilder.offPeakWindowOptions(offPeakWindowOptions.let(IResolvable::unwrap))
    }

    /**
     * @param offPeakWindowOptions Options for a domain's off-peak window, during which OpenSearch
     * Service can perform mandatory configuration changes on the domain.
     */
    override
        fun offPeakWindowOptions(offPeakWindowOptions: CfnDomain.OffPeakWindowOptionsProperty) {
      cdkBuilder.offPeakWindowOptions(offPeakWindowOptions.let(CfnDomain.OffPeakWindowOptionsProperty::unwrap))
    }

    /**
     * @param offPeakWindowOptions Options for a domain's off-peak window, during which OpenSearch
     * Service can perform mandatory configuration changes on the domain.
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("ca9d785ff5be5741e5ec97deacd17bda8dd39a70da0db7a61d3efe04fba61c09")
    override
        fun offPeakWindowOptions(offPeakWindowOptions: CfnDomain.OffPeakWindowOptionsProperty.Builder.() -> Unit):
        Unit = offPeakWindowOptions(CfnDomain.OffPeakWindowOptionsProperty(offPeakWindowOptions))

    /**
     * @param snapshotOptions *DEPRECATED* .
     * The automated snapshot configuration for the OpenSearch Service domain indexes.
     */
    override fun snapshotOptions(snapshotOptions: IResolvable) {
      cdkBuilder.snapshotOptions(snapshotOptions.let(IResolvable::unwrap))
    }

    /**
     * @param snapshotOptions *DEPRECATED* .
     * The automated snapshot configuration for the OpenSearch Service domain indexes.
     */
    override fun snapshotOptions(snapshotOptions: CfnDomain.SnapshotOptionsProperty) {
      cdkBuilder.snapshotOptions(snapshotOptions.let(CfnDomain.SnapshotOptionsProperty::unwrap))
    }

    /**
     * @param snapshotOptions *DEPRECATED* .
     * The automated snapshot configuration for the OpenSearch Service domain indexes.
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("fc89ccf6c244ae00445f272cf807218ebe7041819bca81708fff0509fbec64a0")
    override
        fun snapshotOptions(snapshotOptions: CfnDomain.SnapshotOptionsProperty.Builder.() -> Unit):
        Unit = snapshotOptions(CfnDomain.SnapshotOptionsProperty(snapshotOptions))

    /**
     * @param softwareUpdateOptions Service software update options for the domain.
     */
    override fun softwareUpdateOptions(softwareUpdateOptions: IResolvable) {
      cdkBuilder.softwareUpdateOptions(softwareUpdateOptions.let(IResolvable::unwrap))
    }

    /**
     * @param softwareUpdateOptions Service software update options for the domain.
     */
    override
        fun softwareUpdateOptions(softwareUpdateOptions: CfnDomain.SoftwareUpdateOptionsProperty) {
      cdkBuilder.softwareUpdateOptions(softwareUpdateOptions.let(CfnDomain.SoftwareUpdateOptionsProperty::unwrap))
    }

    /**
     * @param softwareUpdateOptions Service software update options for the domain.
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("d95b98ca239721610e8320b147a9a7e1391d4417a9640c6cd923653f27dfe5cb")
    override
        fun softwareUpdateOptions(softwareUpdateOptions: CfnDomain.SoftwareUpdateOptionsProperty.Builder.() -> Unit):
        Unit = softwareUpdateOptions(CfnDomain.SoftwareUpdateOptionsProperty(softwareUpdateOptions))

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
     *
     * If you remove this entity altogether, along with its associated properties, it causes a
     * replacement. You might encounter this scenario if you're updating your security configuration
     * from a VPC to a public endpoint.
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
     *
     * If you remove this entity altogether, along with its associated properties, it causes a
     * replacement. You might encounter this scenario if you're updating your security configuration
     * from a VPC to a public endpoint.
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
     *
     * If you remove this entity altogether, along with its associated properties, it causes a
     * replacement. You might encounter this scenario if you're updating your security configuration
     * from a VPC to a public endpoint.
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("39958d8993f1ed65d23a53c8c95a6418a976f01082d16479c3c32ab5c014c1c1")
    override fun vpcOptions(vpcOptions: CfnDomain.VPCOptionsProperty.Builder.() -> Unit): Unit =
        vpcOptions(CfnDomain.VPCOptionsProperty(vpcOptions))

    public fun build(): software.amazon.awscdk.services.opensearchservice.CfnDomainProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.opensearchservice.CfnDomainProps,
  ) : CdkObject(cdkObject), CfnDomainProps {
    /**
     * An AWS Identity and Access Management ( IAM ) policy document that specifies who can access
     * the OpenSearch Service domain and their permissions.
     *
     * For more information, see [Configuring access
     * policies](https://docs.aws.amazon.com/opensearch-service/latest/developerguide/ac.html#ac-creating)
     * in the *Amazon OpenSearch Service Developer Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opensearchservice-domain.html#cfn-opensearchservice-domain-accesspolicies)
     */
    override fun accessPolicies(): Any? = unwrap(this).getAccessPolicies()

    /**
     * Additional options to specify for the OpenSearch Service domain.
     *
     * For more information, see
     * [AdvancedOptions](https://docs.aws.amazon.com/opensearch-service/latest/APIReference/API_CreateDomain.html#API_CreateDomain_RequestBody)
     * in the OpenSearch Service API reference.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opensearchservice-domain.html#cfn-opensearchservice-domain-advancedoptions)
     */
    override fun advancedOptions(): Any? = unwrap(this).getAdvancedOptions()

    /**
     * Specifies options for fine-grained access control and SAML authentication.
     *
     * If you specify advanced security options, you must also enable node-to-node encryption (
     * [NodeToNodeEncryptionOptions](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opensearchservice-domain-nodetonodeencryptionoptions.html)
     * ) and encryption at rest (
     * [EncryptionAtRestOptions](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opensearchservice-domain-encryptionatrestoptions.html)
     * ). You must also enable `EnforceHTTPS` within
     * [DomainEndpointOptions](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opensearchservice-domain-domainendpointoptions.html)
     * , which requires HTTPS for all traffic to the domain.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opensearchservice-domain.html#cfn-opensearchservice-domain-advancedsecurityoptions)
     */
    override fun advancedSecurityOptions(): Any? = unwrap(this).getAdvancedSecurityOptions()

    /**
     * Container for the cluster configuration of a domain.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opensearchservice-domain.html#cfn-opensearchservice-domain-clusterconfig)
     */
    override fun clusterConfig(): Any? = unwrap(this).getClusterConfig()

    /**
     * Configures OpenSearch Service to use Amazon Cognito authentication for OpenSearch Dashboards.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opensearchservice-domain.html#cfn-opensearchservice-domain-cognitooptions)
     */
    override fun cognitoOptions(): Any? = unwrap(this).getCognitoOptions()

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opensearchservice-domain.html#cfn-opensearchservice-domain-domainarn)
     */
    override fun domainArn(): String? = unwrap(this).getDomainArn()

    /**
     * Specifies additional options for the domain endpoint, such as whether to require HTTPS for
     * all traffic or whether to use a custom endpoint rather than the default endpoint.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opensearchservice-domain.html#cfn-opensearchservice-domain-domainendpointoptions)
     */
    override fun domainEndpointOptions(): Any? = unwrap(this).getDomainEndpointOptions()

    /**
     * A name for the OpenSearch Service domain.
     *
     * The name must have a minimum length of 3 and a maximum length of 28. If you don't specify a
     * name, AWS CloudFormation generates a unique physical ID and uses that ID for the domain name.
     * For more information, see [Name
     * Type](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-name.html) .
     *
     * Required when creating a new domain.
     *
     *
     * If you specify a name, you can't perform updates that require replacement of this resource.
     * You can perform updates that require no or some interruption. If you must replace the resource,
     * specify a new name.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opensearchservice-domain.html#cfn-opensearchservice-domain-domainname)
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
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opensearchservice-domain.html#cfn-opensearchservice-domain-ebsoptions)
     */
    override fun ebsOptions(): Any? = unwrap(this).getEbsOptions()

    /**
     * Whether the domain should encrypt data at rest, and if so, the AWS KMS key to use.
     *
     * See [Encryption of data at rest for Amazon OpenSearch
     * Service](https://docs.aws.amazon.com/opensearch-service/latest/developerguide/encryption-at-rest.html)
     * .
     *
     * If no encryption at rest options were initially specified in the template, updating this
     * property by adding it causes no interruption. However, if you change this property after it's
     * already been set within a template, the domain is deleted and recreated in order to modify the
     * property.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opensearchservice-domain.html#cfn-opensearchservice-domain-encryptionatrestoptions)
     */
    override fun encryptionAtRestOptions(): Any? = unwrap(this).getEncryptionAtRestOptions()

    /**
     * The version of OpenSearch to use.
     *
     * The value must be in the format `OpenSearch_X.Y` or `Elasticsearch_X.Y` . If not specified,
     * the latest version of OpenSearch is used. For information about the versions that OpenSearch
     * Service supports, see [Supported versions of OpenSearch and
     * Elasticsearch](https://docs.aws.amazon.com/opensearch-service/latest/developerguide/what-is.html#choosing-version)
     * in the *Amazon OpenSearch Service Developer Guide* .
     *
     * If you set the
     * [EnableVersionUpgrade](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-attribute-updatepolicy.html#cfn-attributes-updatepolicy-upgradeopensearchdomain)
     * update policy to `true` , you can update `EngineVersion` without interruption. When
     * `EnableVersionUpgrade` is set to `false` , or is not specified, updating `EngineVersion` results
     * in
     * [replacement](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/using-cfn-updating-stacks-update-behaviors.html#update-replacement)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opensearchservice-domain.html#cfn-opensearchservice-domain-engineversion)
     */
    override fun engineVersion(): String? = unwrap(this).getEngineVersion()

    /**
     * Choose either dual stack or IPv4 as your IP address type.
     *
     * Dual stack allows you to share domain resources across IPv4 and IPv6 address types, and is
     * the recommended option. If you set your IP address type to dual stack, you can't change your
     * address type later.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opensearchservice-domain.html#cfn-opensearchservice-domain-ipaddresstype)
     */
    override fun ipAddressType(): String? = unwrap(this).getIpAddressType()

    /**
     * An object with one or more of the following keys: `SEARCH_SLOW_LOGS` , `ES_APPLICATION_LOGS`
     * , `INDEX_SLOW_LOGS` , `AUDIT_LOGS` , depending on the types of logs you want to publish.
     *
     * Each key needs a valid `LogPublishingOption` value. For the full syntax, see the
     * [examples](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opensearchservice-domain.html#aws-resource-opensearchservice-domain--examples)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opensearchservice-domain.html#cfn-opensearchservice-domain-logpublishingoptions)
     */
    override fun logPublishingOptions(): Any? = unwrap(this).getLogPublishingOptions()

    /**
     * Specifies whether node-to-node encryption is enabled.
     *
     * See [Node-to-node encryption for Amazon OpenSearch
     * Service](https://docs.aws.amazon.com/opensearch-service/latest/developerguide/ntn.html) .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opensearchservice-domain.html#cfn-opensearchservice-domain-nodetonodeencryptionoptions)
     */
    override fun nodeToNodeEncryptionOptions(): Any? = unwrap(this).getNodeToNodeEncryptionOptions()

    /**
     * Options for a domain's off-peak window, during which OpenSearch Service can perform mandatory
     * configuration changes on the domain.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opensearchservice-domain.html#cfn-opensearchservice-domain-offpeakwindowoptions)
     */
    override fun offPeakWindowOptions(): Any? = unwrap(this).getOffPeakWindowOptions()

    /**
     * *DEPRECATED* .
     *
     * The automated snapshot configuration for the OpenSearch Service domain indexes.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opensearchservice-domain.html#cfn-opensearchservice-domain-snapshotoptions)
     */
    override fun snapshotOptions(): Any? = unwrap(this).getSnapshotOptions()

    /**
     * Service software update options for the domain.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opensearchservice-domain.html#cfn-opensearchservice-domain-softwareupdateoptions)
     */
    override fun softwareUpdateOptions(): Any? = unwrap(this).getSoftwareUpdateOptions()

    /**
     * An arbitrary set of tags (key–value pairs) to associate with the OpenSearch Service domain.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opensearchservice-domain.html#cfn-opensearchservice-domain-tags)
     */
    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

    /**
     * The virtual private cloud (VPC) configuration for the OpenSearch Service domain.
     *
     * For more information, see [Launching your Amazon OpenSearch Service domains within a
     * VPC](https://docs.aws.amazon.com/opensearch-service/latest/developerguide/vpc.html) in the
     * *Amazon OpenSearch Service Developer Guide* .
     *
     * If you remove this entity altogether, along with its associated properties, it causes a
     * replacement. You might encounter this scenario if you're updating your security configuration
     * from a VPC to a public endpoint.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opensearchservice-domain.html#cfn-opensearchservice-domain-vpcoptions)
     */
    override fun vpcOptions(): Any? = unwrap(this).getVpcOptions()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnDomainProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.opensearchservice.CfnDomainProps):
        CfnDomainProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnDomainProps):
        software.amazon.awscdk.services.opensearchservice.CfnDomainProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.opensearchservice.CfnDomainProps
  }
}
