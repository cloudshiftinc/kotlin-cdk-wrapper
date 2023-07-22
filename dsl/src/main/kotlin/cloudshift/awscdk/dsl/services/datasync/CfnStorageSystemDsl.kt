@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.datasync

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.dsl.CfnTagDsl
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.datasync.CfnStorageSystem
import software.constructs.Construct

@CdkDslMarker
public class CfnStorageSystemDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: CfnStorageSystem.Builder = CfnStorageSystem.Builder.create(scope, id)

  private val _agentArns: MutableList<String> = mutableListOf()

  private val _tags: MutableList<CfnTag> = mutableListOf()

  /**
   * Specifies the Amazon Resource Name (ARN) of the DataSync agent that connects to and reads from
   * your on-premises storage system's management interface.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datasync-storagesystem.html#cfn-datasync-storagesystem-agentarns)
   * @param agentArns Specifies the Amazon Resource Name (ARN) of the DataSync agent that connects
   * to and reads from your on-premises storage system's management interface. 
   */
  public fun agentArns(vararg agentArns: String) {
    _agentArns.addAll(listOf(*agentArns))
  }

  /**
   * Specifies the Amazon Resource Name (ARN) of the DataSync agent that connects to and reads from
   * your on-premises storage system's management interface.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datasync-storagesystem.html#cfn-datasync-storagesystem-agentarns)
   * @param agentArns Specifies the Amazon Resource Name (ARN) of the DataSync agent that connects
   * to and reads from your on-premises storage system's management interface. 
   */
  public fun agentArns(agentArns: Collection<String>) {
    _agentArns.addAll(agentArns)
  }

  /**
   * Specifies the ARN of the Amazon CloudWatch log group for monitoring and logging discovery job
   * events.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datasync-storagesystem.html#cfn-datasync-storagesystem-cloudwatchloggrouparn)
   * @param cloudWatchLogGroupArn Specifies the ARN of the Amazon CloudWatch log group for
   * monitoring and logging discovery job events. 
   */
  public fun cloudWatchLogGroupArn(cloudWatchLogGroupArn: String) {
    cdkBuilder.cloudWatchLogGroupArn(cloudWatchLogGroupArn)
  }

  /**
   * Specifies a familiar name for your on-premises storage system.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datasync-storagesystem.html#cfn-datasync-storagesystem-name)
   * @param name Specifies a familiar name for your on-premises storage system. 
   */
  public fun name(name: String) {
    cdkBuilder.name(name)
  }

  /**
   * Specifies the server name and network port required to connect with the management interface of
   * your on-premises storage system.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datasync-storagesystem.html#cfn-datasync-storagesystem-serverconfiguration)
   * @param serverConfiguration Specifies the server name and network port required to connect with
   * the management interface of your on-premises storage system. 
   */
  public fun serverConfiguration(serverConfiguration: IResolvable) {
    cdkBuilder.serverConfiguration(serverConfiguration)
  }

  /**
   * Specifies the server name and network port required to connect with the management interface of
   * your on-premises storage system.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datasync-storagesystem.html#cfn-datasync-storagesystem-serverconfiguration)
   * @param serverConfiguration Specifies the server name and network port required to connect with
   * the management interface of your on-premises storage system. 
   */
  public
      fun serverConfiguration(serverConfiguration: CfnStorageSystem.ServerConfigurationProperty) {
    cdkBuilder.serverConfiguration(serverConfiguration)
  }

  /**
   * Specifies the user name and password for accessing your on-premises storage system's management
   * interface.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datasync-storagesystem.html#cfn-datasync-storagesystem-servercredentials)
   * @param serverCredentials Specifies the user name and password for accessing your on-premises
   * storage system's management interface. 
   */
  public fun serverCredentials(serverCredentials: IResolvable) {
    cdkBuilder.serverCredentials(serverCredentials)
  }

  /**
   * Specifies the user name and password for accessing your on-premises storage system's management
   * interface.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datasync-storagesystem.html#cfn-datasync-storagesystem-servercredentials)
   * @param serverCredentials Specifies the user name and password for accessing your on-premises
   * storage system's management interface. 
   */
  public fun serverCredentials(serverCredentials: CfnStorageSystem.ServerCredentialsProperty) {
    cdkBuilder.serverCredentials(serverCredentials)
  }

  /**
   * Specifies the type of on-premises storage system that you want DataSync Discovery to collect
   * information about.
   *
   *
   * DataSync Discovery currently supports NetApp Fabric-Attached Storage (FAS) and All Flash FAS
   * (AFF) systems running ONTAP 9.7 or later.
   *
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datasync-storagesystem.html#cfn-datasync-storagesystem-systemtype)
   * @param systemType Specifies the type of on-premises storage system that you want DataSync
   * Discovery to collect information about. 
   */
  public fun systemType(systemType: String) {
    cdkBuilder.systemType(systemType)
  }

  /**
   * Specifies labels that help you categorize, filter, and search for your AWS resources.
   *
   * We recommend creating at least a name tag for your on-premises storage system.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datasync-storagesystem.html#cfn-datasync-storagesystem-tags)
   * @param tags Specifies labels that help you categorize, filter, and search for your AWS
   * resources. 
   */
  public fun tags(tags: CfnTagDsl.() -> Unit) {
    _tags.add(CfnTagDsl().apply(tags).build())
  }

  /**
   * Specifies labels that help you categorize, filter, and search for your AWS resources.
   *
   * We recommend creating at least a name tag for your on-premises storage system.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datasync-storagesystem.html#cfn-datasync-storagesystem-tags)
   * @param tags Specifies labels that help you categorize, filter, and search for your AWS
   * resources. 
   */
  public fun tags(tags: Collection<CfnTag>) {
    _tags.addAll(tags)
  }

  public fun build(): CfnStorageSystem {
    if(_agentArns.isNotEmpty()) cdkBuilder.agentArns(_agentArns)
    if(_tags.isNotEmpty()) cdkBuilder.tags(_tags)
    return cdkBuilder.build()
  }
}
