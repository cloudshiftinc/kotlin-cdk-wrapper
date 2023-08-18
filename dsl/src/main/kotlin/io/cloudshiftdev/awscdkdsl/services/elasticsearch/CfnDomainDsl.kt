@file:Suppress(
    "RedundantVisibilityModifier",
    "RedundantUnitReturnType",
    "RemoveRedundantQualifierName",
    "unused",
    "UnusedImport",
    "ClassName",
    "REDUNDANT_PROJECTION",
    "DEPRECATION"
)

package io.cloudshiftdev.awscdkdsl.services.elasticsearch

import io.cloudshiftdev.awscdkdsl.CfnTagDsl
import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import io.cloudshiftdev.awscdkdsl.common.MapBuilder
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.Map
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.elasticsearch.CfnDomain
import software.constructs.Construct

/**
 * The AWS::Elasticsearch::Domain resource creates an Amazon OpenSearch Service domain.
 *
 * The `AWS::Elasticsearch::Domain` resource is being replaced by the
 * [AWS::OpenSearchService::Domain](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opensearchservice-domain.html)
 * resource. While the legacy Elasticsearch resource and options are still supported, we recommend
 * modifying your existing Cloudformation templates to use the new OpenSearch Service resource,
 * which supports both OpenSearch and legacy Elasticsearch. For instructions to upgrade domains
 * defined within CloudFormation from Elasticsearch to OpenSearch, see
 * [Remarks](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opensearchservice-domain.html#aws-resource-opensearchservice-domain--remarks)
 * .
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.elasticsearch.*;
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
@CdkDslMarker
public class CfnDomainDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnDomain.Builder = CfnDomain.Builder.create(scope, id)

    private val _tags: MutableList<CfnTag> = mutableListOf()

    /**
     * An AWS Identity and Access Management ( IAM ) policy document that specifies who can access
     * the OpenSearch Service domain and their permissions.
     *
     * For more information, see
     * [Configuring access policies](https://docs.aws.amazon.com/opensearch-service/latest/developerguide/ac.html#ac-creating)
     * in the *Amazon OpenSearch Service Developer Guid* e.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticsearch-domain.html#cfn-elasticsearch-domain-accesspolicies)
     *
     * @param accessPolicies An AWS Identity and Access Management ( IAM ) policy document that
     *   specifies who can access the OpenSearch Service domain and their permissions.
     */
    public fun accessPolicies(accessPolicies: MapBuilder.() -> Unit = {}) {
        val builder = MapBuilder()
        builder.apply(accessPolicies)
        cdkBuilder.accessPolicies(builder.map)
    }

    /**
     * An AWS Identity and Access Management ( IAM ) policy document that specifies who can access
     * the OpenSearch Service domain and their permissions.
     *
     * For more information, see
     * [Configuring access policies](https://docs.aws.amazon.com/opensearch-service/latest/developerguide/ac.html#ac-creating)
     * in the *Amazon OpenSearch Service Developer Guid* e.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticsearch-domain.html#cfn-elasticsearch-domain-accesspolicies)
     *
     * @param accessPolicies An AWS Identity and Access Management ( IAM ) policy document that
     *   specifies who can access the OpenSearch Service domain and their permissions.
     */
    public fun accessPolicies(accessPolicies: Any) {
        cdkBuilder.accessPolicies(accessPolicies)
    }

    /**
     * Additional options to specify for the OpenSearch Service domain.
     *
     * For more information, see
     * [Advanced cluster parameters](https://docs.aws.amazon.com/opensearch-service/latest/developerguide/createupdatedomains.html#createdomain-configure-advanced-options)
     * in the *Amazon OpenSearch Service Developer Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticsearch-domain.html#cfn-elasticsearch-domain-advancedoptions)
     *
     * @param advancedOptions Additional options to specify for the OpenSearch Service domain.
     */
    public fun advancedOptions(advancedOptions: Map<String, String>) {
        cdkBuilder.advancedOptions(advancedOptions)
    }

    /**
     * Additional options to specify for the OpenSearch Service domain.
     *
     * For more information, see
     * [Advanced cluster parameters](https://docs.aws.amazon.com/opensearch-service/latest/developerguide/createupdatedomains.html#createdomain-configure-advanced-options)
     * in the *Amazon OpenSearch Service Developer Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticsearch-domain.html#cfn-elasticsearch-domain-advancedoptions)
     *
     * @param advancedOptions Additional options to specify for the OpenSearch Service domain.
     */
    public fun advancedOptions(advancedOptions: IResolvable) {
        cdkBuilder.advancedOptions(advancedOptions)
    }

    /**
     * Specifies options for fine-grained access control.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticsearch-domain.html#cfn-elasticsearch-domain-advancedsecurityoptions)
     *
     * @param advancedSecurityOptions Specifies options for fine-grained access control.
     */
    public fun advancedSecurityOptions(advancedSecurityOptions: IResolvable) {
        cdkBuilder.advancedSecurityOptions(advancedSecurityOptions)
    }

    /**
     * Specifies options for fine-grained access control.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticsearch-domain.html#cfn-elasticsearch-domain-advancedsecurityoptions)
     *
     * @param advancedSecurityOptions Specifies options for fine-grained access control.
     */
    public fun advancedSecurityOptions(
        advancedSecurityOptions: CfnDomain.AdvancedSecurityOptionsInputProperty
    ) {
        cdkBuilder.advancedSecurityOptions(advancedSecurityOptions)
    }

    /**
     * Configures OpenSearch Service to use Amazon Cognito authentication for OpenSearch Dashboards.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticsearch-domain.html#cfn-elasticsearch-domain-cognitooptions)
     *
     * @param cognitoOptions Configures OpenSearch Service to use Amazon Cognito authentication for
     *   OpenSearch Dashboards.
     */
    public fun cognitoOptions(cognitoOptions: IResolvable) {
        cdkBuilder.cognitoOptions(cognitoOptions)
    }

    /**
     * Configures OpenSearch Service to use Amazon Cognito authentication for OpenSearch Dashboards.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticsearch-domain.html#cfn-elasticsearch-domain-cognitooptions)
     *
     * @param cognitoOptions Configures OpenSearch Service to use Amazon Cognito authentication for
     *   OpenSearch Dashboards.
     */
    public fun cognitoOptions(cognitoOptions: CfnDomain.CognitoOptionsProperty) {
        cdkBuilder.cognitoOptions(cognitoOptions)
    }

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticsearch-domain.html#cfn-elasticsearch-domain-domainarn)
     *
     * @param domainArn
     */
    public fun domainArn(domainArn: String) {
        cdkBuilder.domainArn(domainArn)
    }

    /**
     * Specifies additional options for the domain endpoint, such as whether to require HTTPS for
     * all traffic or whether to use a custom endpoint rather than the default endpoint.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticsearch-domain.html#cfn-elasticsearch-domain-domainendpointoptions)
     *
     * @param domainEndpointOptions Specifies additional options for the domain endpoint, such as
     *   whether to require HTTPS for all traffic or whether to use a custom endpoint rather than
     *   the default endpoint.
     */
    public fun domainEndpointOptions(domainEndpointOptions: IResolvable) {
        cdkBuilder.domainEndpointOptions(domainEndpointOptions)
    }

    /**
     * Specifies additional options for the domain endpoint, such as whether to require HTTPS for
     * all traffic or whether to use a custom endpoint rather than the default endpoint.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticsearch-domain.html#cfn-elasticsearch-domain-domainendpointoptions)
     *
     * @param domainEndpointOptions Specifies additional options for the domain endpoint, such as
     *   whether to require HTTPS for all traffic or whether to use a custom endpoint rather than
     *   the default endpoint.
     */
    public fun domainEndpointOptions(
        domainEndpointOptions: CfnDomain.DomainEndpointOptionsProperty
    ) {
        cdkBuilder.domainEndpointOptions(domainEndpointOptions)
    }

    /**
     * A name for the OpenSearch Service domain.
     *
     * For valid values, see the
     * [DomainName](https://docs.aws.amazon.com/opensearch-service/latest/developerguide/configuration-api.html#configuration-api-datatypes-domainname)
     * data type in the *Amazon OpenSearch Service Developer Guide* . If you don't specify a name,
     * AWS CloudFormation generates a unique physical ID and uses that ID for the domain name. For
     * more information, see
     * [Name Type](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-name.html)
     * .
     *
     * If you specify a name, you cannot perform updates that require replacement of this resource.
     * You can perform updates that require no or some interruption. If you must replace the
     * resource, specify a new name.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticsearch-domain.html#cfn-elasticsearch-domain-domainname)
     *
     * @param domainName A name for the OpenSearch Service domain.
     */
    public fun domainName(domainName: String) {
        cdkBuilder.domainName(domainName)
    }

    /**
     * The configurations of Amazon Elastic Block Store (Amazon EBS) volumes that are attached to
     * data nodes in the OpenSearch Service domain.
     *
     * For more information, see
     * [EBS volume size limits](https://docs.aws.amazon.com/opensearch-service/latest/developerguide/limits.html#ebsresource)
     * in the *Amazon OpenSearch Service Developer Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticsearch-domain.html#cfn-elasticsearch-domain-ebsoptions)
     *
     * @param ebsOptions The configurations of Amazon Elastic Block Store (Amazon EBS) volumes that
     *   are attached to data nodes in the OpenSearch Service domain.
     */
    public fun ebsOptions(ebsOptions: IResolvable) {
        cdkBuilder.ebsOptions(ebsOptions)
    }

    /**
     * The configurations of Amazon Elastic Block Store (Amazon EBS) volumes that are attached to
     * data nodes in the OpenSearch Service domain.
     *
     * For more information, see
     * [EBS volume size limits](https://docs.aws.amazon.com/opensearch-service/latest/developerguide/limits.html#ebsresource)
     * in the *Amazon OpenSearch Service Developer Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticsearch-domain.html#cfn-elasticsearch-domain-ebsoptions)
     *
     * @param ebsOptions The configurations of Amazon Elastic Block Store (Amazon EBS) volumes that
     *   are attached to data nodes in the OpenSearch Service domain.
     */
    public fun ebsOptions(ebsOptions: CfnDomain.EBSOptionsProperty) {
        cdkBuilder.ebsOptions(ebsOptions)
    }

    /**
     * ElasticsearchClusterConfig is a property of the AWS::Elasticsearch::Domain resource that
     * configures the cluster of an Amazon OpenSearch Service domain.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticsearch-domain.html#cfn-elasticsearch-domain-elasticsearchclusterconfig)
     *
     * @param elasticsearchClusterConfig ElasticsearchClusterConfig is a property of the
     *   AWS::Elasticsearch::Domain resource that configures the cluster of an Amazon OpenSearch
     *   Service domain.
     */
    public fun elasticsearchClusterConfig(elasticsearchClusterConfig: IResolvable) {
        cdkBuilder.elasticsearchClusterConfig(elasticsearchClusterConfig)
    }

    /**
     * ElasticsearchClusterConfig is a property of the AWS::Elasticsearch::Domain resource that
     * configures the cluster of an Amazon OpenSearch Service domain.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticsearch-domain.html#cfn-elasticsearch-domain-elasticsearchclusterconfig)
     *
     * @param elasticsearchClusterConfig ElasticsearchClusterConfig is a property of the
     *   AWS::Elasticsearch::Domain resource that configures the cluster of an Amazon OpenSearch
     *   Service domain.
     */
    public fun elasticsearchClusterConfig(
        elasticsearchClusterConfig: CfnDomain.ElasticsearchClusterConfigProperty
    ) {
        cdkBuilder.elasticsearchClusterConfig(elasticsearchClusterConfig)
    }

    /**
     * The version of Elasticsearch to use, such as 2.3. If not specified, 1.5 is used as the
     * default. For information about the versions that OpenSearch Service supports, see
     * [Supported versions of OpenSearch and Elasticsearch](https://docs.aws.amazon.com/opensearch-service/latest/developerguide/what-is.html#choosing-version)
     * in the *Amazon OpenSearch Service Developer Guide* .
     *
     * If you set the
     * [EnableVersionUpgrade](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-attribute-updatepolicy.html#cfn-attributes-updatepolicy-upgradeopensearchdomain)
     * update policy to `true` , you can update `ElasticsearchVersion` without interruption. When
     * `EnableVersionUpgrade` is set to `false` , or is not specified, updating
     * `ElasticsearchVersion` results in
     * [replacement](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/using-cfn-updating-stacks-update-behaviors.html#update-replacement)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticsearch-domain.html#cfn-elasticsearch-domain-elasticsearchversion)
     *
     * @param elasticsearchVersion The version of Elasticsearch to use, such as 2.3. If not
     *   specified, 1.5 is used as the default. For information about the versions that OpenSearch
     *   Service supports, see
     *   [Supported versions of OpenSearch and Elasticsearch](https://docs.aws.amazon.com/opensearch-service/latest/developerguide/what-is.html#choosing-version)
     *   in the *Amazon OpenSearch Service Developer Guide* .
     */
    public fun elasticsearchVersion(elasticsearchVersion: String) {
        cdkBuilder.elasticsearchVersion(elasticsearchVersion)
    }

    /**
     * Whether the domain should encrypt data at rest, and if so, the AWS Key Management Service key
     * to use.
     *
     * See
     * [Encryption of data at rest for Amazon OpenSearch Service](https://docs.aws.amazon.com/opensearch-service/latest/developerguide/encryption-at-rest.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticsearch-domain.html#cfn-elasticsearch-domain-encryptionatrestoptions)
     *
     * @param encryptionAtRestOptions Whether the domain should encrypt data at rest, and if so, the
     *   AWS Key Management Service key to use.
     */
    public fun encryptionAtRestOptions(encryptionAtRestOptions: IResolvable) {
        cdkBuilder.encryptionAtRestOptions(encryptionAtRestOptions)
    }

    /**
     * Whether the domain should encrypt data at rest, and if so, the AWS Key Management Service key
     * to use.
     *
     * See
     * [Encryption of data at rest for Amazon OpenSearch Service](https://docs.aws.amazon.com/opensearch-service/latest/developerguide/encryption-at-rest.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticsearch-domain.html#cfn-elasticsearch-domain-encryptionatrestoptions)
     *
     * @param encryptionAtRestOptions Whether the domain should encrypt data at rest, and if so, the
     *   AWS Key Management Service key to use.
     */
    public fun encryptionAtRestOptions(
        encryptionAtRestOptions: CfnDomain.EncryptionAtRestOptionsProperty
    ) {
        cdkBuilder.encryptionAtRestOptions(encryptionAtRestOptions)
    }

    /**
     * An object with one or more of the following keys: `SEARCH_SLOW_LOGS` , `ES_APPLICATION_LOGS`
     * , `INDEX_SLOW_LOGS` , `AUDIT_LOGS` , depending on the types of logs you want to publish.
     *
     * Each key needs a valid `LogPublishingOption` value.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticsearch-domain.html#cfn-elasticsearch-domain-logpublishingoptions)
     *
     * @param logPublishingOptions An object with one or more of the following keys:
     *   `SEARCH_SLOW_LOGS` , `ES_APPLICATION_LOGS` , `INDEX_SLOW_LOGS` , `AUDIT_LOGS` , depending
     *   on the types of logs you want to publish.
     */
    public fun logPublishingOptions(logPublishingOptions: MapBuilder.() -> Unit = {}) {
        val builder = MapBuilder()
        builder.apply(logPublishingOptions)
        cdkBuilder.logPublishingOptions(builder.map)
    }

    /**
     * An object with one or more of the following keys: `SEARCH_SLOW_LOGS` , `ES_APPLICATION_LOGS`
     * , `INDEX_SLOW_LOGS` , `AUDIT_LOGS` , depending on the types of logs you want to publish.
     *
     * Each key needs a valid `LogPublishingOption` value.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticsearch-domain.html#cfn-elasticsearch-domain-logpublishingoptions)
     *
     * @param logPublishingOptions An object with one or more of the following keys:
     *   `SEARCH_SLOW_LOGS` , `ES_APPLICATION_LOGS` , `INDEX_SLOW_LOGS` , `AUDIT_LOGS` , depending
     *   on the types of logs you want to publish.
     */
    public fun logPublishingOptions(logPublishingOptions: Map<String, Any>) {
        cdkBuilder.logPublishingOptions(logPublishingOptions)
    }

    /**
     * An object with one or more of the following keys: `SEARCH_SLOW_LOGS` , `ES_APPLICATION_LOGS`
     * , `INDEX_SLOW_LOGS` , `AUDIT_LOGS` , depending on the types of logs you want to publish.
     *
     * Each key needs a valid `LogPublishingOption` value.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticsearch-domain.html#cfn-elasticsearch-domain-logpublishingoptions)
     *
     * @param logPublishingOptions An object with one or more of the following keys:
     *   `SEARCH_SLOW_LOGS` , `ES_APPLICATION_LOGS` , `INDEX_SLOW_LOGS` , `AUDIT_LOGS` , depending
     *   on the types of logs you want to publish.
     */
    public fun logPublishingOptions(logPublishingOptions: IResolvable) {
        cdkBuilder.logPublishingOptions(logPublishingOptions)
    }

    /**
     * Specifies whether node-to-node encryption is enabled.
     *
     * See
     * [Node-to-node encryption for Amazon OpenSearch Service](https://docs.aws.amazon.com/opensearch-service/latest/developerguide/ntn.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticsearch-domain.html#cfn-elasticsearch-domain-nodetonodeencryptionoptions)
     *
     * @param nodeToNodeEncryptionOptions Specifies whether node-to-node encryption is enabled.
     */
    public fun nodeToNodeEncryptionOptions(nodeToNodeEncryptionOptions: IResolvable) {
        cdkBuilder.nodeToNodeEncryptionOptions(nodeToNodeEncryptionOptions)
    }

    /**
     * Specifies whether node-to-node encryption is enabled.
     *
     * See
     * [Node-to-node encryption for Amazon OpenSearch Service](https://docs.aws.amazon.com/opensearch-service/latest/developerguide/ntn.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticsearch-domain.html#cfn-elasticsearch-domain-nodetonodeencryptionoptions)
     *
     * @param nodeToNodeEncryptionOptions Specifies whether node-to-node encryption is enabled.
     */
    public fun nodeToNodeEncryptionOptions(
        nodeToNodeEncryptionOptions: CfnDomain.NodeToNodeEncryptionOptionsProperty
    ) {
        cdkBuilder.nodeToNodeEncryptionOptions(nodeToNodeEncryptionOptions)
    }

    /**
     * *DEPRECATED* .
     *
     * The automated snapshot configuration for the OpenSearch Service domain indices.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticsearch-domain.html#cfn-elasticsearch-domain-snapshotoptions)
     *
     * @param snapshotOptions *DEPRECATED* .
     */
    public fun snapshotOptions(snapshotOptions: IResolvable) {
        cdkBuilder.snapshotOptions(snapshotOptions)
    }

    /**
     * *DEPRECATED* .
     *
     * The automated snapshot configuration for the OpenSearch Service domain indices.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticsearch-domain.html#cfn-elasticsearch-domain-snapshotoptions)
     *
     * @param snapshotOptions *DEPRECATED* .
     */
    public fun snapshotOptions(snapshotOptions: CfnDomain.SnapshotOptionsProperty) {
        cdkBuilder.snapshotOptions(snapshotOptions)
    }

    /**
     * An arbitrary set of tags (key–value pairs) to associate with the OpenSearch Service domain.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticsearch-domain.html#cfn-elasticsearch-domain-tags)
     *
     * @param tags An arbitrary set of tags (key–value pairs) to associate with the OpenSearch
     *   Service domain.
     */
    public fun tags(tags: CfnTagDsl.() -> Unit) {
        _tags.add(CfnTagDsl().apply(tags).build())
    }

    /**
     * An arbitrary set of tags (key–value pairs) to associate with the OpenSearch Service domain.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticsearch-domain.html#cfn-elasticsearch-domain-tags)
     *
     * @param tags An arbitrary set of tags (key–value pairs) to associate with the OpenSearch
     *   Service domain.
     */
    public fun tags(tags: Collection<CfnTag>) {
        _tags.addAll(tags)
    }

    /**
     * The virtual private cloud (VPC) configuration for the OpenSearch Service domain.
     *
     * For more information, see
     * [Launching your Amazon OpenSearch Service domains within a VPC](https://docs.aws.amazon.com/opensearch-service/latest/developerguide/vpc.html)
     * in the *Amazon OpenSearch Service Developer Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticsearch-domain.html#cfn-elasticsearch-domain-vpcoptions)
     *
     * @param vpcOptions The virtual private cloud (VPC) configuration for the OpenSearch Service
     *   domain.
     */
    public fun vpcOptions(vpcOptions: IResolvable) {
        cdkBuilder.vpcOptions(vpcOptions)
    }

    /**
     * The virtual private cloud (VPC) configuration for the OpenSearch Service domain.
     *
     * For more information, see
     * [Launching your Amazon OpenSearch Service domains within a VPC](https://docs.aws.amazon.com/opensearch-service/latest/developerguide/vpc.html)
     * in the *Amazon OpenSearch Service Developer Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticsearch-domain.html#cfn-elasticsearch-domain-vpcoptions)
     *
     * @param vpcOptions The virtual private cloud (VPC) configuration for the OpenSearch Service
     *   domain.
     */
    public fun vpcOptions(vpcOptions: CfnDomain.VPCOptionsProperty) {
        cdkBuilder.vpcOptions(vpcOptions)
    }

    public fun build(): CfnDomain {
        if (_tags.isNotEmpty()) cdkBuilder.tags(_tags)
        return cdkBuilder.build()
    }
}
