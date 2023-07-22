@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.elasticsearch

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.common.MapBuilder
import cloudshift.awscdk.dsl.CfnTagDsl
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.Map
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.elasticsearch.CfnDomain
import software.amazon.awscdk.services.elasticsearch.CfnDomainProps

@CdkDslMarker
public class CfnDomainPropsDsl {
  private val cdkBuilder: CfnDomainProps.Builder = CfnDomainProps.builder()

  private val _tags: MutableList<CfnTag> = mutableListOf()

  /**
   * @param accessPolicies An AWS Identity and Access Management ( IAM ) policy document that
   * specifies who can access the OpenSearch Service domain and their permissions.
   * For more information, see [Configuring access
   * policies](https://docs.aws.amazon.com/opensearch-service/latest/developerguide/ac.html#ac-creating)
   * in the *Amazon OpenSearch Service Developer Guid* e.
   */
  public fun accessPolicies(accessPolicies: MapBuilder.() -> Unit = {}) {
    val builder = MapBuilder()
    builder.apply(accessPolicies)
    cdkBuilder.accessPolicies(builder.map)
  }

  /**
   * @param accessPolicies An AWS Identity and Access Management ( IAM ) policy document that
   * specifies who can access the OpenSearch Service domain and their permissions.
   * For more information, see [Configuring access
   * policies](https://docs.aws.amazon.com/opensearch-service/latest/developerguide/ac.html#ac-creating)
   * in the *Amazon OpenSearch Service Developer Guid* e.
   */
  public fun accessPolicies(accessPolicies: Any) {
    cdkBuilder.accessPolicies(accessPolicies)
  }

  /**
   * @param advancedOptions Additional options to specify for the OpenSearch Service domain.
   * For more information, see [Advanced cluster
   * parameters](https://docs.aws.amazon.com/opensearch-service/latest/developerguide/createupdatedomains.html#createdomain-configure-advanced-options)
   * in the *Amazon OpenSearch Service Developer Guide* .
   */
  public fun advancedOptions(advancedOptions: Map<String, String>) {
    cdkBuilder.advancedOptions(advancedOptions)
  }

  /**
   * @param advancedOptions Additional options to specify for the OpenSearch Service domain.
   * For more information, see [Advanced cluster
   * parameters](https://docs.aws.amazon.com/opensearch-service/latest/developerguide/createupdatedomains.html#createdomain-configure-advanced-options)
   * in the *Amazon OpenSearch Service Developer Guide* .
   */
  public fun advancedOptions(advancedOptions: IResolvable) {
    cdkBuilder.advancedOptions(advancedOptions)
  }

  /**
   * @param advancedSecurityOptions Specifies options for fine-grained access control.
   */
  public fun advancedSecurityOptions(advancedSecurityOptions: IResolvable) {
    cdkBuilder.advancedSecurityOptions(advancedSecurityOptions)
  }

  /**
   * @param advancedSecurityOptions Specifies options for fine-grained access control.
   */
  public
      fun advancedSecurityOptions(advancedSecurityOptions: CfnDomain.AdvancedSecurityOptionsInputProperty) {
    cdkBuilder.advancedSecurityOptions(advancedSecurityOptions)
  }

  /**
   * @param cognitoOptions Configures OpenSearch Service to use Amazon Cognito authentication for
   * OpenSearch Dashboards.
   */
  public fun cognitoOptions(cognitoOptions: IResolvable) {
    cdkBuilder.cognitoOptions(cognitoOptions)
  }

  /**
   * @param cognitoOptions Configures OpenSearch Service to use Amazon Cognito authentication for
   * OpenSearch Dashboards.
   */
  public fun cognitoOptions(cognitoOptions: CfnDomain.CognitoOptionsProperty) {
    cdkBuilder.cognitoOptions(cognitoOptions)
  }

  /**
   * @param domainArn the value to be set.
   */
  public fun domainArn(domainArn: String) {
    cdkBuilder.domainArn(domainArn)
  }

  /**
   * @param domainEndpointOptions Specifies additional options for the domain endpoint, such as
   * whether to require HTTPS for all traffic or whether to use a custom endpoint rather than the
   * default endpoint.
   */
  public fun domainEndpointOptions(domainEndpointOptions: IResolvable) {
    cdkBuilder.domainEndpointOptions(domainEndpointOptions)
  }

  /**
   * @param domainEndpointOptions Specifies additional options for the domain endpoint, such as
   * whether to require HTTPS for all traffic or whether to use a custom endpoint rather than the
   * default endpoint.
   */
  public fun domainEndpointOptions(domainEndpointOptions: CfnDomain.DomainEndpointOptionsProperty) {
    cdkBuilder.domainEndpointOptions(domainEndpointOptions)
  }

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
  public fun domainName(domainName: String) {
    cdkBuilder.domainName(domainName)
  }

  /**
   * @param ebsOptions The configurations of Amazon Elastic Block Store (Amazon EBS) volumes that
   * are attached to data nodes in the OpenSearch Service domain.
   * For more information, see [EBS volume size
   * limits](https://docs.aws.amazon.com/opensearch-service/latest/developerguide/limits.html#ebsresource)
   * in the *Amazon OpenSearch Service Developer Guide* .
   */
  public fun ebsOptions(ebsOptions: IResolvable) {
    cdkBuilder.ebsOptions(ebsOptions)
  }

  /**
   * @param ebsOptions The configurations of Amazon Elastic Block Store (Amazon EBS) volumes that
   * are attached to data nodes in the OpenSearch Service domain.
   * For more information, see [EBS volume size
   * limits](https://docs.aws.amazon.com/opensearch-service/latest/developerguide/limits.html#ebsresource)
   * in the *Amazon OpenSearch Service Developer Guide* .
   */
  public fun ebsOptions(ebsOptions: CfnDomain.EBSOptionsProperty) {
    cdkBuilder.ebsOptions(ebsOptions)
  }

  /**
   * @param elasticsearchClusterConfig ElasticsearchClusterConfig is a property of the
   * AWS::Elasticsearch::Domain resource that configures the cluster of an Amazon OpenSearch Service
   * domain.
   */
  public fun elasticsearchClusterConfig(elasticsearchClusterConfig: IResolvable) {
    cdkBuilder.elasticsearchClusterConfig(elasticsearchClusterConfig)
  }

  /**
   * @param elasticsearchClusterConfig ElasticsearchClusterConfig is a property of the
   * AWS::Elasticsearch::Domain resource that configures the cluster of an Amazon OpenSearch Service
   * domain.
   */
  public
      fun elasticsearchClusterConfig(elasticsearchClusterConfig: CfnDomain.ElasticsearchClusterConfigProperty) {
    cdkBuilder.elasticsearchClusterConfig(elasticsearchClusterConfig)
  }

  /**
   * @param elasticsearchVersion The version of Elasticsearch to use, such as 2.3. If not specified,
   * 1.5 is used as the default. For information about the versions that OpenSearch Service supports,
   * see [Supported versions of OpenSearch and
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
  public fun elasticsearchVersion(elasticsearchVersion: String) {
    cdkBuilder.elasticsearchVersion(elasticsearchVersion)
  }

  /**
   * @param encryptionAtRestOptions Whether the domain should encrypt data at rest, and if so, the
   * AWS Key Management Service key to use.
   * See [Encryption of data at rest for Amazon OpenSearch
   * Service](https://docs.aws.amazon.com/opensearch-service/latest/developerguide/encryption-at-rest.html)
   * .
   */
  public fun encryptionAtRestOptions(encryptionAtRestOptions: IResolvable) {
    cdkBuilder.encryptionAtRestOptions(encryptionAtRestOptions)
  }

  /**
   * @param encryptionAtRestOptions Whether the domain should encrypt data at rest, and if so, the
   * AWS Key Management Service key to use.
   * See [Encryption of data at rest for Amazon OpenSearch
   * Service](https://docs.aws.amazon.com/opensearch-service/latest/developerguide/encryption-at-rest.html)
   * .
   */
  public
      fun encryptionAtRestOptions(encryptionAtRestOptions: CfnDomain.EncryptionAtRestOptionsProperty) {
    cdkBuilder.encryptionAtRestOptions(encryptionAtRestOptions)
  }

  /**
   * @param logPublishingOptions An object with one or more of the following keys:
   * `SEARCH_SLOW_LOGS` , `ES_APPLICATION_LOGS` , `INDEX_SLOW_LOGS` , `AUDIT_LOGS` , depending on the
   * types of logs you want to publish.
   * Each key needs a valid `LogPublishingOption` value.
   */
  public fun logPublishingOptions(logPublishingOptions: MapBuilder.() -> Unit = {}) {
    val builder = MapBuilder()
    builder.apply(logPublishingOptions)
    cdkBuilder.logPublishingOptions(builder.map)
  }

  /**
   * @param logPublishingOptions An object with one or more of the following keys:
   * `SEARCH_SLOW_LOGS` , `ES_APPLICATION_LOGS` , `INDEX_SLOW_LOGS` , `AUDIT_LOGS` , depending on the
   * types of logs you want to publish.
   * Each key needs a valid `LogPublishingOption` value.
   */
  public fun logPublishingOptions(logPublishingOptions: Map<String, Any>) {
    cdkBuilder.logPublishingOptions(logPublishingOptions)
  }

  /**
   * @param logPublishingOptions An object with one or more of the following keys:
   * `SEARCH_SLOW_LOGS` , `ES_APPLICATION_LOGS` , `INDEX_SLOW_LOGS` , `AUDIT_LOGS` , depending on the
   * types of logs you want to publish.
   * Each key needs a valid `LogPublishingOption` value.
   */
  public fun logPublishingOptions(logPublishingOptions: IResolvable) {
    cdkBuilder.logPublishingOptions(logPublishingOptions)
  }

  /**
   * @param nodeToNodeEncryptionOptions Specifies whether node-to-node encryption is enabled.
   * See [Node-to-node encryption for Amazon OpenSearch
   * Service](https://docs.aws.amazon.com/opensearch-service/latest/developerguide/ntn.html) .
   */
  public fun nodeToNodeEncryptionOptions(nodeToNodeEncryptionOptions: IResolvable) {
    cdkBuilder.nodeToNodeEncryptionOptions(nodeToNodeEncryptionOptions)
  }

  /**
   * @param nodeToNodeEncryptionOptions Specifies whether node-to-node encryption is enabled.
   * See [Node-to-node encryption for Amazon OpenSearch
   * Service](https://docs.aws.amazon.com/opensearch-service/latest/developerguide/ntn.html) .
   */
  public
      fun nodeToNodeEncryptionOptions(nodeToNodeEncryptionOptions: CfnDomain.NodeToNodeEncryptionOptionsProperty) {
    cdkBuilder.nodeToNodeEncryptionOptions(nodeToNodeEncryptionOptions)
  }

  /**
   * @param snapshotOptions *DEPRECATED* .
   * The automated snapshot configuration for the OpenSearch Service domain indices.
   */
  public fun snapshotOptions(snapshotOptions: IResolvable) {
    cdkBuilder.snapshotOptions(snapshotOptions)
  }

  /**
   * @param snapshotOptions *DEPRECATED* .
   * The automated snapshot configuration for the OpenSearch Service domain indices.
   */
  public fun snapshotOptions(snapshotOptions: CfnDomain.SnapshotOptionsProperty) {
    cdkBuilder.snapshotOptions(snapshotOptions)
  }

  /**
   * @param tags An arbitrary set of tags (key–value pairs) to associate with the OpenSearch Service
   * domain.
   */
  public fun tags(tags: CfnTagDsl.() -> Unit) {
    _tags.add(CfnTagDsl().apply(tags).build())
  }

  /**
   * @param tags An arbitrary set of tags (key–value pairs) to associate with the OpenSearch Service
   * domain.
   */
  public fun tags(tags: Collection<CfnTag>) {
    _tags.addAll(tags)
  }

  /**
   * @param vpcOptions The virtual private cloud (VPC) configuration for the OpenSearch Service
   * domain.
   * For more information, see [Launching your Amazon OpenSearch Service domains within a
   * VPC](https://docs.aws.amazon.com/opensearch-service/latest/developerguide/vpc.html) in the *Amazon
   * OpenSearch Service Developer Guide* .
   */
  public fun vpcOptions(vpcOptions: IResolvable) {
    cdkBuilder.vpcOptions(vpcOptions)
  }

  /**
   * @param vpcOptions The virtual private cloud (VPC) configuration for the OpenSearch Service
   * domain.
   * For more information, see [Launching your Amazon OpenSearch Service domains within a
   * VPC](https://docs.aws.amazon.com/opensearch-service/latest/developerguide/vpc.html) in the *Amazon
   * OpenSearch Service Developer Guide* .
   */
  public fun vpcOptions(vpcOptions: CfnDomain.VPCOptionsProperty) {
    cdkBuilder.vpcOptions(vpcOptions)
  }

  public fun build(): CfnDomainProps {
    if(_tags.isNotEmpty()) cdkBuilder.tags(_tags)
    return cdkBuilder.build()
  }
}
