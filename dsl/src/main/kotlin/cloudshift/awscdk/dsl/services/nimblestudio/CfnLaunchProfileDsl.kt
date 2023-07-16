@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.nimblestudio

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.Map
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.nimblestudio.CfnLaunchProfile
import software.constructs.Construct

@CdkDslMarker
public class CfnLaunchProfileDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: CfnLaunchProfile.Builder = CfnLaunchProfile.Builder.create(scope, id)

  private val _ec2SubnetIds: MutableList<String> = mutableListOf()

  private val _launchProfileProtocolVersions: MutableList<String> = mutableListOf()

  private val _studioComponentIds: MutableList<String> = mutableListOf()

  public fun description(description: String) {
    cdkBuilder.description(description)
  }

  public fun ec2SubnetIds(vararg ec2SubnetIds: String) {
    _ec2SubnetIds.addAll(listOf(*ec2SubnetIds))
  }

  public fun ec2SubnetIds(ec2SubnetIds: Collection<String>) {
    _ec2SubnetIds.addAll(ec2SubnetIds)
  }

  public fun launchProfileProtocolVersions(vararg launchProfileProtocolVersions: String) {
    _launchProfileProtocolVersions.addAll(listOf(*launchProfileProtocolVersions))
  }

  public fun launchProfileProtocolVersions(launchProfileProtocolVersions: Collection<String>) {
    _launchProfileProtocolVersions.addAll(launchProfileProtocolVersions)
  }

  public fun name(name: String) {
    cdkBuilder.name(name)
  }

  public fun streamConfiguration(streamConfiguration: IResolvable) {
    cdkBuilder.streamConfiguration(streamConfiguration)
  }

  public
      fun streamConfiguration(streamConfiguration: CfnLaunchProfile.StreamConfigurationProperty) {
    cdkBuilder.streamConfiguration(streamConfiguration)
  }

  public fun studioComponentIds(vararg studioComponentIds: String) {
    _studioComponentIds.addAll(listOf(*studioComponentIds))
  }

  public fun studioComponentIds(studioComponentIds: Collection<String>) {
    _studioComponentIds.addAll(studioComponentIds)
  }

  public fun studioId(studioId: String) {
    cdkBuilder.studioId(studioId)
  }

  public fun tags(tags: Map<String, String>) {
    cdkBuilder.tags(tags)
  }

  public fun build(): CfnLaunchProfile {
    if(_ec2SubnetIds.isNotEmpty()) cdkBuilder.ec2SubnetIds(_ec2SubnetIds)
    if(_launchProfileProtocolVersions.isNotEmpty())
        cdkBuilder.launchProfileProtocolVersions(_launchProfileProtocolVersions)
    if(_studioComponentIds.isNotEmpty()) cdkBuilder.studioComponentIds(_studioComponentIds)
    return cdkBuilder.build()
  }
}
