@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.gamelift

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.Deprecated
import kotlin.Number
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.gamelift.CfnFleet
import software.constructs.Construct

@CdkDslMarker
public class CfnFleetDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: CfnFleet.Builder = CfnFleet.Builder.create(scope, id)

  private val _ec2InboundPermissions: MutableList<Any> = mutableListOf()

  private val _locations: MutableList<Any> = mutableListOf()

  private val _logPaths: MutableList<String> = mutableListOf()

  private val _metricGroups: MutableList<String> = mutableListOf()

  public fun anywhereConfiguration(anywhereConfiguration: IResolvable) {
    cdkBuilder.anywhereConfiguration(anywhereConfiguration)
  }

  public fun anywhereConfiguration(anywhereConfiguration: CfnFleet.AnywhereConfigurationProperty) {
    cdkBuilder.anywhereConfiguration(anywhereConfiguration)
  }

  public fun buildId(buildId: String) {
    cdkBuilder.buildId(buildId)
  }

  public fun certificateConfiguration(certificateConfiguration: IResolvable) {
    cdkBuilder.certificateConfiguration(certificateConfiguration)
  }

  public
      fun certificateConfiguration(certificateConfiguration: CfnFleet.CertificateConfigurationProperty) {
    cdkBuilder.certificateConfiguration(certificateConfiguration)
  }

  public fun computeType(computeType: String) {
    cdkBuilder.computeType(computeType)
  }

  public fun description(description: String) {
    cdkBuilder.description(description)
  }

  public fun desiredEc2Instances(desiredEc2Instances: Number) {
    cdkBuilder.desiredEc2Instances(desiredEc2Instances)
  }

  public fun ec2InboundPermissions(vararg ec2InboundPermissions: Any) {
    _ec2InboundPermissions.addAll(listOf(*ec2InboundPermissions))
  }

  public fun ec2InboundPermissions(ec2InboundPermissions: Collection<Any>) {
    _ec2InboundPermissions.addAll(ec2InboundPermissions)
  }

  public fun ec2InboundPermissions(ec2InboundPermissions: IResolvable) {
    cdkBuilder.ec2InboundPermissions(ec2InboundPermissions)
  }

  public fun ec2InstanceType(ec2InstanceType: String) {
    cdkBuilder.ec2InstanceType(ec2InstanceType)
  }

  public fun fleetType(fleetType: String) {
    cdkBuilder.fleetType(fleetType)
  }

  public fun instanceRoleArn(instanceRoleArn: String) {
    cdkBuilder.instanceRoleArn(instanceRoleArn)
  }

  public fun locations(vararg locations: Any) {
    _locations.addAll(listOf(*locations))
  }

  public fun locations(locations: Collection<Any>) {
    _locations.addAll(locations)
  }

  public fun locations(locations: IResolvable) {
    cdkBuilder.locations(locations)
  }

  @Deprecated(message = "deprecated in CDK")
  public fun logPaths(vararg logPaths: String) {
    _logPaths.addAll(listOf(*logPaths))
  }

  @Deprecated(message = "deprecated in CDK")
  public fun logPaths(logPaths: Collection<String>) {
    _logPaths.addAll(logPaths)
  }

  public fun maxSize(maxSize: Number) {
    cdkBuilder.maxSize(maxSize)
  }

  public fun metricGroups(vararg metricGroups: String) {
    _metricGroups.addAll(listOf(*metricGroups))
  }

  public fun metricGroups(metricGroups: Collection<String>) {
    _metricGroups.addAll(metricGroups)
  }

  public fun minSize(minSize: Number) {
    cdkBuilder.minSize(minSize)
  }

  public fun name(name: String) {
    cdkBuilder.name(name)
  }

  public fun newGameSessionProtectionPolicy(newGameSessionProtectionPolicy: String) {
    cdkBuilder.newGameSessionProtectionPolicy(newGameSessionProtectionPolicy)
  }

  public fun peerVpcAwsAccountId(peerVpcAwsAccountId: String) {
    cdkBuilder.peerVpcAwsAccountId(peerVpcAwsAccountId)
  }

  public fun peerVpcId(peerVpcId: String) {
    cdkBuilder.peerVpcId(peerVpcId)
  }

  public fun resourceCreationLimitPolicy(resourceCreationLimitPolicy: IResolvable) {
    cdkBuilder.resourceCreationLimitPolicy(resourceCreationLimitPolicy)
  }

  public
      fun resourceCreationLimitPolicy(resourceCreationLimitPolicy: CfnFleet.ResourceCreationLimitPolicyProperty) {
    cdkBuilder.resourceCreationLimitPolicy(resourceCreationLimitPolicy)
  }

  public fun runtimeConfiguration(runtimeConfiguration: IResolvable) {
    cdkBuilder.runtimeConfiguration(runtimeConfiguration)
  }

  public fun runtimeConfiguration(runtimeConfiguration: CfnFleet.RuntimeConfigurationProperty) {
    cdkBuilder.runtimeConfiguration(runtimeConfiguration)
  }

  public fun scriptId(scriptId: String) {
    cdkBuilder.scriptId(scriptId)
  }

  @Deprecated(message = "deprecated in CDK")
  public fun serverLaunchParameters(serverLaunchParameters: String) {
    cdkBuilder.serverLaunchParameters(serverLaunchParameters)
  }

  @Deprecated(message = "deprecated in CDK")
  public fun serverLaunchPath(serverLaunchPath: String) {
    cdkBuilder.serverLaunchPath(serverLaunchPath)
  }

  public fun build(): CfnFleet {
    if(_ec2InboundPermissions.isNotEmpty()) cdkBuilder.ec2InboundPermissions(_ec2InboundPermissions)
    if(_locations.isNotEmpty()) cdkBuilder.locations(_locations)
    if(_logPaths.isNotEmpty()) cdkBuilder.logPaths(_logPaths)
    if(_metricGroups.isNotEmpty()) cdkBuilder.metricGroups(_metricGroups)
    return cdkBuilder.build()
  }
}
