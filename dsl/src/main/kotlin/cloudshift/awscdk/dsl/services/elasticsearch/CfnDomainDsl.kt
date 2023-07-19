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
import software.constructs.Construct

@CdkDslMarker
public class CfnDomainDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: CfnDomain.Builder = CfnDomain.Builder.create(scope, id)

  private val _tags: MutableList<CfnTag> = mutableListOf()

  public fun accessPolicies(block: MapBuilder.() -> Unit = {}) {
    val builder = MapBuilder()
    builder.apply(block)
    cdkBuilder.accessPolicies(builder.map)
  }

  public fun accessPolicies(accessPolicies: Any) {
    cdkBuilder.accessPolicies(accessPolicies)
  }

  public fun advancedOptions(advancedOptions: Map<String, String>) {
    cdkBuilder.advancedOptions(advancedOptions)
  }

  public fun advancedOptions(advancedOptions: IResolvable) {
    cdkBuilder.advancedOptions(advancedOptions)
  }

  public fun advancedSecurityOptions(advancedSecurityOptions: IResolvable) {
    cdkBuilder.advancedSecurityOptions(advancedSecurityOptions)
  }

  public
      fun advancedSecurityOptions(advancedSecurityOptions: CfnDomain.AdvancedSecurityOptionsInputProperty) {
    cdkBuilder.advancedSecurityOptions(advancedSecurityOptions)
  }

  public fun cognitoOptions(cognitoOptions: IResolvable) {
    cdkBuilder.cognitoOptions(cognitoOptions)
  }

  public fun cognitoOptions(cognitoOptions: CfnDomain.CognitoOptionsProperty) {
    cdkBuilder.cognitoOptions(cognitoOptions)
  }

  public fun domainEndpointOptions(domainEndpointOptions: IResolvable) {
    cdkBuilder.domainEndpointOptions(domainEndpointOptions)
  }

  public fun domainEndpointOptions(domainEndpointOptions: CfnDomain.DomainEndpointOptionsProperty) {
    cdkBuilder.domainEndpointOptions(domainEndpointOptions)
  }

  public fun domainName(domainName: String) {
    cdkBuilder.domainName(domainName)
  }

  public fun ebsOptions(ebsOptions: IResolvable) {
    cdkBuilder.ebsOptions(ebsOptions)
  }

  public fun ebsOptions(ebsOptions: CfnDomain.EBSOptionsProperty) {
    cdkBuilder.ebsOptions(ebsOptions)
  }

  public fun elasticsearchClusterConfig(elasticsearchClusterConfig: IResolvable) {
    cdkBuilder.elasticsearchClusterConfig(elasticsearchClusterConfig)
  }

  public
      fun elasticsearchClusterConfig(elasticsearchClusterConfig: CfnDomain.ElasticsearchClusterConfigProperty) {
    cdkBuilder.elasticsearchClusterConfig(elasticsearchClusterConfig)
  }

  public fun elasticsearchVersion(elasticsearchVersion: String) {
    cdkBuilder.elasticsearchVersion(elasticsearchVersion)
  }

  public fun encryptionAtRestOptions(encryptionAtRestOptions: IResolvable) {
    cdkBuilder.encryptionAtRestOptions(encryptionAtRestOptions)
  }

  public
      fun encryptionAtRestOptions(encryptionAtRestOptions: CfnDomain.EncryptionAtRestOptionsProperty) {
    cdkBuilder.encryptionAtRestOptions(encryptionAtRestOptions)
  }

  public fun logPublishingOptions(block: MapBuilder.() -> Unit = {}) {
    val builder = MapBuilder()
    builder.apply(block)
    cdkBuilder.logPublishingOptions(builder.map)
  }

  public fun logPublishingOptions(logPublishingOptions: Map<String, Any>) {
    cdkBuilder.logPublishingOptions(logPublishingOptions)
  }

  public fun logPublishingOptions(logPublishingOptions: IResolvable) {
    cdkBuilder.logPublishingOptions(logPublishingOptions)
  }

  public fun nodeToNodeEncryptionOptions(nodeToNodeEncryptionOptions: IResolvable) {
    cdkBuilder.nodeToNodeEncryptionOptions(nodeToNodeEncryptionOptions)
  }

  public
      fun nodeToNodeEncryptionOptions(nodeToNodeEncryptionOptions: CfnDomain.NodeToNodeEncryptionOptionsProperty) {
    cdkBuilder.nodeToNodeEncryptionOptions(nodeToNodeEncryptionOptions)
  }

  public fun snapshotOptions(snapshotOptions: IResolvable) {
    cdkBuilder.snapshotOptions(snapshotOptions)
  }

  public fun snapshotOptions(snapshotOptions: CfnDomain.SnapshotOptionsProperty) {
    cdkBuilder.snapshotOptions(snapshotOptions)
  }

  public fun tags(tags: CfnTagDsl.() -> Unit) {
    _tags.add(CfnTagDsl().apply(tags).build())
  }

  public fun tags(tags: Collection<CfnTag>) {
    _tags.addAll(tags)
  }

  public fun vpcOptions(vpcOptions: IResolvable) {
    cdkBuilder.vpcOptions(vpcOptions)
  }

  public fun vpcOptions(vpcOptions: CfnDomain.VPCOptionsProperty) {
    cdkBuilder.vpcOptions(vpcOptions)
  }

  public fun build(): CfnDomain {
    if(_tags.isNotEmpty()) cdkBuilder.tags(_tags)
    return cdkBuilder.build()
  }
}
