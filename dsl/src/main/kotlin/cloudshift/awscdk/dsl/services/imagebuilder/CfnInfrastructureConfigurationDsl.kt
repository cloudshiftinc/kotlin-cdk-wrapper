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

  /**
   * The description of the infrastructure configuration.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-imagebuilder-infrastructureconfiguration.html#cfn-imagebuilder-infrastructureconfiguration-description)
   * @param description The description of the infrastructure configuration. 
   */
  public fun description(description: String) {
    cdkBuilder.description(description)
  }

  /**
   * The instance metadata option settings for the infrastructure configuration.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-imagebuilder-infrastructureconfiguration.html#cfn-imagebuilder-infrastructureconfiguration-instancemetadataoptions)
   * @param instanceMetadataOptions The instance metadata option settings for the infrastructure
   * configuration. 
   */
  public fun instanceMetadataOptions(instanceMetadataOptions: IResolvable) {
    cdkBuilder.instanceMetadataOptions(instanceMetadataOptions)
  }

  /**
   * The instance metadata option settings for the infrastructure configuration.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-imagebuilder-infrastructureconfiguration.html#cfn-imagebuilder-infrastructureconfiguration-instancemetadataoptions)
   * @param instanceMetadataOptions The instance metadata option settings for the infrastructure
   * configuration. 
   */
  public
      fun instanceMetadataOptions(instanceMetadataOptions: CfnInfrastructureConfiguration.InstanceMetadataOptionsProperty) {
    cdkBuilder.instanceMetadataOptions(instanceMetadataOptions)
  }

  /**
   * The instance profile of the infrastructure configuration.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-imagebuilder-infrastructureconfiguration.html#cfn-imagebuilder-infrastructureconfiguration-instanceprofilename)
   * @param instanceProfileName The instance profile of the infrastructure configuration. 
   */
  public fun instanceProfileName(instanceProfileName: String) {
    cdkBuilder.instanceProfileName(instanceProfileName)
  }

  /**
   * The instance types of the infrastructure configuration.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-imagebuilder-infrastructureconfiguration.html#cfn-imagebuilder-infrastructureconfiguration-instancetypes)
   * @param instanceTypes The instance types of the infrastructure configuration. 
   */
  public fun instanceTypes(vararg instanceTypes: String) {
    _instanceTypes.addAll(listOf(*instanceTypes))
  }

  /**
   * The instance types of the infrastructure configuration.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-imagebuilder-infrastructureconfiguration.html#cfn-imagebuilder-infrastructureconfiguration-instancetypes)
   * @param instanceTypes The instance types of the infrastructure configuration. 
   */
  public fun instanceTypes(instanceTypes: Collection<String>) {
    _instanceTypes.addAll(instanceTypes)
  }

  /**
   * The Amazon EC2 key pair of the infrastructure configuration.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-imagebuilder-infrastructureconfiguration.html#cfn-imagebuilder-infrastructureconfiguration-keypair)
   * @param keyPair The Amazon EC2 key pair of the infrastructure configuration. 
   */
  public fun keyPair(keyPair: String) {
    cdkBuilder.keyPair(keyPair)
  }

  /**
   * The logging configuration defines where Image Builder uploads your logs.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-imagebuilder-infrastructureconfiguration.html#cfn-imagebuilder-infrastructureconfiguration-logging)
   * @param logging The logging configuration defines where Image Builder uploads your logs. 
   */
  public fun logging(logging: IResolvable) {
    cdkBuilder.logging(logging)
  }

  /**
   * The logging configuration defines where Image Builder uploads your logs.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-imagebuilder-infrastructureconfiguration.html#cfn-imagebuilder-infrastructureconfiguration-logging)
   * @param logging The logging configuration defines where Image Builder uploads your logs. 
   */
  public fun logging(logging: CfnInfrastructureConfiguration.LoggingProperty) {
    cdkBuilder.logging(logging)
  }

  /**
   * The name of the infrastructure configuration.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-imagebuilder-infrastructureconfiguration.html#cfn-imagebuilder-infrastructureconfiguration-name)
   * @param name The name of the infrastructure configuration. 
   */
  public fun name(name: String) {
    cdkBuilder.name(name)
  }

  /**
   * The tags attached to the resource created by Image Builder.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-imagebuilder-infrastructureconfiguration.html#cfn-imagebuilder-infrastructureconfiguration-resourcetags)
   * @param resourceTags The tags attached to the resource created by Image Builder. 
   */
  public fun resourceTags(resourceTags: Map<String, String>) {
    cdkBuilder.resourceTags(resourceTags)
  }

  /**
   * The tags attached to the resource created by Image Builder.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-imagebuilder-infrastructureconfiguration.html#cfn-imagebuilder-infrastructureconfiguration-resourcetags)
   * @param resourceTags The tags attached to the resource created by Image Builder. 
   */
  public fun resourceTags(resourceTags: IResolvable) {
    cdkBuilder.resourceTags(resourceTags)
  }

  /**
   * The security group IDs of the infrastructure configuration.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-imagebuilder-infrastructureconfiguration.html#cfn-imagebuilder-infrastructureconfiguration-securitygroupids)
   * @param securityGroupIds The security group IDs of the infrastructure configuration. 
   */
  public fun securityGroupIds(vararg securityGroupIds: String) {
    _securityGroupIds.addAll(listOf(*securityGroupIds))
  }

  /**
   * The security group IDs of the infrastructure configuration.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-imagebuilder-infrastructureconfiguration.html#cfn-imagebuilder-infrastructureconfiguration-securitygroupids)
   * @param securityGroupIds The security group IDs of the infrastructure configuration. 
   */
  public fun securityGroupIds(securityGroupIds: Collection<String>) {
    _securityGroupIds.addAll(securityGroupIds)
  }

  /**
   * The Amazon Resource Name (ARN) of the SNS topic for the infrastructure configuration.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-imagebuilder-infrastructureconfiguration.html#cfn-imagebuilder-infrastructureconfiguration-snstopicarn)
   * @param snsTopicArn The Amazon Resource Name (ARN) of the SNS topic for the infrastructure
   * configuration. 
   */
  public fun snsTopicArn(snsTopicArn: String) {
    cdkBuilder.snsTopicArn(snsTopicArn)
  }

  /**
   * The subnet ID of the infrastructure configuration.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-imagebuilder-infrastructureconfiguration.html#cfn-imagebuilder-infrastructureconfiguration-subnetid)
   * @param subnetId The subnet ID of the infrastructure configuration. 
   */
  public fun subnetId(subnetId: String) {
    cdkBuilder.subnetId(subnetId)
  }

  /**
   * The tags of the infrastructure configuration.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-imagebuilder-infrastructureconfiguration.html#cfn-imagebuilder-infrastructureconfiguration-tags)
   * @param tags The tags of the infrastructure configuration. 
   */
  public fun tags(tags: Map<String, String>) {
    cdkBuilder.tags(tags)
  }

  /**
   * The terminate instance on failure configuration of the infrastructure configuration.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-imagebuilder-infrastructureconfiguration.html#cfn-imagebuilder-infrastructureconfiguration-terminateinstanceonfailure)
   * @param terminateInstanceOnFailure The terminate instance on failure configuration of the
   * infrastructure configuration. 
   */
  public fun terminateInstanceOnFailure(terminateInstanceOnFailure: Boolean) {
    cdkBuilder.terminateInstanceOnFailure(terminateInstanceOnFailure)
  }

  /**
   * The terminate instance on failure configuration of the infrastructure configuration.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-imagebuilder-infrastructureconfiguration.html#cfn-imagebuilder-infrastructureconfiguration-terminateinstanceonfailure)
   * @param terminateInstanceOnFailure The terminate instance on failure configuration of the
   * infrastructure configuration. 
   */
  public fun terminateInstanceOnFailure(terminateInstanceOnFailure: IResolvable) {
    cdkBuilder.terminateInstanceOnFailure(terminateInstanceOnFailure)
  }

  public fun build(): CfnInfrastructureConfiguration {
    if(_instanceTypes.isNotEmpty()) cdkBuilder.instanceTypes(_instanceTypes)
    if(_securityGroupIds.isNotEmpty()) cdkBuilder.securityGroupIds(_securityGroupIds)
    return cdkBuilder.build()
  }
}
