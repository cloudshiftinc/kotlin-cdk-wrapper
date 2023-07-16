@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.imagebuilder

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.Map
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.imagebuilder.CfnInfrastructureConfiguration
import software.constructs.Construct

@CdkDslMarker
public class CfnInfrastructureConfigurationDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: CfnInfrastructureConfiguration.Builder =
      CfnInfrastructureConfiguration.Builder.create(scope, id)

  private val _instanceTypes: MutableList<String> = mutableListOf()

  private val _securityGroupIds: MutableList<String> = mutableListOf()

  public fun description(description: String) {
    cdkBuilder.description(description)
  }

  public fun instanceMetadataOptions(instanceMetadataOptions: IResolvable) {
    cdkBuilder.instanceMetadataOptions(instanceMetadataOptions)
  }

  public
      fun instanceMetadataOptions(instanceMetadataOptions: CfnInfrastructureConfiguration.InstanceMetadataOptionsProperty) {
    cdkBuilder.instanceMetadataOptions(instanceMetadataOptions)
  }

  public fun instanceProfileName(instanceProfileName: String) {
    cdkBuilder.instanceProfileName(instanceProfileName)
  }

  public fun instanceTypes(vararg instanceTypes: String) {
    _instanceTypes.addAll(listOf(*instanceTypes))
  }

  public fun instanceTypes(instanceTypes: Collection<String>) {
    _instanceTypes.addAll(instanceTypes)
  }

  public fun keyPair(keyPair: String) {
    cdkBuilder.keyPair(keyPair)
  }

  public fun logging(logging: IResolvable) {
    cdkBuilder.logging(logging)
  }

  public fun logging(logging: CfnInfrastructureConfiguration.LoggingProperty) {
    cdkBuilder.logging(logging)
  }

  public fun name(name: String) {
    cdkBuilder.name(name)
  }

  public fun resourceTags(resourceTags: Map<String, String>) {
    cdkBuilder.resourceTags(resourceTags)
  }

  public fun resourceTags(resourceTags: IResolvable) {
    cdkBuilder.resourceTags(resourceTags)
  }

  public fun securityGroupIds(vararg securityGroupIds: String) {
    _securityGroupIds.addAll(listOf(*securityGroupIds))
  }

  public fun securityGroupIds(securityGroupIds: Collection<String>) {
    _securityGroupIds.addAll(securityGroupIds)
  }

  public fun snsTopicArn(snsTopicArn: String) {
    cdkBuilder.snsTopicArn(snsTopicArn)
  }

  public fun subnetId(subnetId: String) {
    cdkBuilder.subnetId(subnetId)
  }

  public fun tags(tags: Map<String, String>) {
    cdkBuilder.tags(tags)
  }

  public fun terminateInstanceOnFailure(terminateInstanceOnFailure: Boolean) {
    cdkBuilder.terminateInstanceOnFailure(terminateInstanceOnFailure)
  }

  public fun terminateInstanceOnFailure(terminateInstanceOnFailure: IResolvable) {
    cdkBuilder.terminateInstanceOnFailure(terminateInstanceOnFailure)
  }

  public fun build(): CfnInfrastructureConfiguration {
    if(_instanceTypes.isNotEmpty()) cdkBuilder.instanceTypes(_instanceTypes)
    if(_securityGroupIds.isNotEmpty()) cdkBuilder.securityGroupIds(_securityGroupIds)
    return cdkBuilder.build()
  }
}
