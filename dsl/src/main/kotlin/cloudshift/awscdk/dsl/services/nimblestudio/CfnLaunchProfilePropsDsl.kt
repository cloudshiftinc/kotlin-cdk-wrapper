@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.nimblestudio

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.Map
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.nimblestudio.CfnLaunchProfile
import software.amazon.awscdk.services.nimblestudio.CfnLaunchProfileProps

@CdkDslMarker
public class CfnLaunchProfilePropsDsl {
  private val cdkBuilder: CfnLaunchProfileProps.Builder = CfnLaunchProfileProps.builder()

  private val _ec2SubnetIds: MutableList<String> = mutableListOf()

  private val _launchProfileProtocolVersions: MutableList<String> = mutableListOf()

  private val _studioComponentIds: MutableList<String> = mutableListOf()

  /**
   * @param description A human-readable description of the launch profile.
   */
  public fun description(description: String) {
    cdkBuilder.description(description)
  }

  /**
   * @param ec2SubnetIds Unique identifiers for a collection of EC2 subnets. 
   */
  public fun ec2SubnetIds(vararg ec2SubnetIds: String) {
    _ec2SubnetIds.addAll(listOf(*ec2SubnetIds))
  }

  /**
   * @param ec2SubnetIds Unique identifiers for a collection of EC2 subnets. 
   */
  public fun ec2SubnetIds(ec2SubnetIds: Collection<String>) {
    _ec2SubnetIds.addAll(ec2SubnetIds)
  }

  /**
   * @param launchProfileProtocolVersions The version number of the protocol that is used by the
   * launch profile. 
   * The only valid version is "2021-03-31".
   */
  public fun launchProfileProtocolVersions(vararg launchProfileProtocolVersions: String) {
    _launchProfileProtocolVersions.addAll(listOf(*launchProfileProtocolVersions))
  }

  /**
   * @param launchProfileProtocolVersions The version number of the protocol that is used by the
   * launch profile. 
   * The only valid version is "2021-03-31".
   */
  public fun launchProfileProtocolVersions(launchProfileProtocolVersions: Collection<String>) {
    _launchProfileProtocolVersions.addAll(launchProfileProtocolVersions)
  }

  /**
   * @param name A friendly name for the launch profile. 
   */
  public fun name(name: String) {
    cdkBuilder.name(name)
  }

  /**
   * @param streamConfiguration A configuration for a streaming session. 
   */
  public fun streamConfiguration(streamConfiguration: IResolvable) {
    cdkBuilder.streamConfiguration(streamConfiguration)
  }

  /**
   * @param streamConfiguration A configuration for a streaming session. 
   */
  public
      fun streamConfiguration(streamConfiguration: CfnLaunchProfile.StreamConfigurationProperty) {
    cdkBuilder.streamConfiguration(streamConfiguration)
  }

  /**
   * @param studioComponentIds Unique identifiers for a collection of studio components that can be
   * used with this launch profile. 
   */
  public fun studioComponentIds(vararg studioComponentIds: String) {
    _studioComponentIds.addAll(listOf(*studioComponentIds))
  }

  /**
   * @param studioComponentIds Unique identifiers for a collection of studio components that can be
   * used with this launch profile. 
   */
  public fun studioComponentIds(studioComponentIds: Collection<String>) {
    _studioComponentIds.addAll(studioComponentIds)
  }

  /**
   * @param studioId The unique identifier for a studio resource. 
   * In Nimble Studio , all other resources are contained in a studio resource.
   */
  public fun studioId(studioId: String) {
    cdkBuilder.studioId(studioId)
  }

  /**
   * @param tags An array of key-value pairs to apply to this resource.
   * For more information, see
   * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
   * .
   */
  public fun tags(tags: Map<String, String>) {
    cdkBuilder.tags(tags)
  }

  public fun build(): CfnLaunchProfileProps {
    if(_ec2SubnetIds.isNotEmpty()) cdkBuilder.ec2SubnetIds(_ec2SubnetIds)
    if(_launchProfileProtocolVersions.isNotEmpty())
        cdkBuilder.launchProfileProtocolVersions(_launchProfileProtocolVersions)
    if(_studioComponentIds.isNotEmpty()) cdkBuilder.studioComponentIds(_studioComponentIds)
    return cdkBuilder.build()
  }
}
