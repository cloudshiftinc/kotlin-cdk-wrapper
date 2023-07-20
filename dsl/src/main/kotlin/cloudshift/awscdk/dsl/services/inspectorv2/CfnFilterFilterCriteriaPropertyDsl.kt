@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.inspectorv2

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.inspectorv2.CfnFilter

@CdkDslMarker
public class CfnFilterFilterCriteriaPropertyDsl {
  private val cdkBuilder: CfnFilter.FilterCriteriaProperty.Builder =
      CfnFilter.FilterCriteriaProperty.builder()

  private val _awsAccountId: MutableList<Any> = mutableListOf()

  private val _componentId: MutableList<Any> = mutableListOf()

  private val _componentType: MutableList<Any> = mutableListOf()

  private val _ec2InstanceImageId: MutableList<Any> = mutableListOf()

  private val _ec2InstanceSubnetId: MutableList<Any> = mutableListOf()

  private val _ec2InstanceVpcId: MutableList<Any> = mutableListOf()

  private val _ecrImageArchitecture: MutableList<Any> = mutableListOf()

  private val _ecrImageHash: MutableList<Any> = mutableListOf()

  private val _ecrImagePushedAt: MutableList<Any> = mutableListOf()

  private val _ecrImageRegistry: MutableList<Any> = mutableListOf()

  private val _ecrImageRepositoryName: MutableList<Any> = mutableListOf()

  private val _ecrImageTags: MutableList<Any> = mutableListOf()

  private val _findingArn: MutableList<Any> = mutableListOf()

  private val _findingStatus: MutableList<Any> = mutableListOf()

  private val _findingType: MutableList<Any> = mutableListOf()

  private val _firstObservedAt: MutableList<Any> = mutableListOf()

  private val _inspectorScore: MutableList<Any> = mutableListOf()

  private val _lastObservedAt: MutableList<Any> = mutableListOf()

  private val _networkProtocol: MutableList<Any> = mutableListOf()

  private val _portRange: MutableList<Any> = mutableListOf()

  private val _relatedVulnerabilities: MutableList<Any> = mutableListOf()

  private val _resourceId: MutableList<Any> = mutableListOf()

  private val _resourceTags: MutableList<Any> = mutableListOf()

  private val _resourceType: MutableList<Any> = mutableListOf()

  private val _severity: MutableList<Any> = mutableListOf()

  private val _title: MutableList<Any> = mutableListOf()

  private val _updatedAt: MutableList<Any> = mutableListOf()

  private val _vendorSeverity: MutableList<Any> = mutableListOf()

  private val _vulnerabilityId: MutableList<Any> = mutableListOf()

  private val _vulnerabilitySource: MutableList<Any> = mutableListOf()

  private val _vulnerablePackages: MutableList<Any> = mutableListOf()

  public fun awsAccountId(vararg awsAccountId: Any) {
    _awsAccountId.addAll(listOf(*awsAccountId))
  }

  public fun awsAccountId(awsAccountId: Collection<Any>) {
    _awsAccountId.addAll(awsAccountId)
  }

  public fun awsAccountId(awsAccountId: IResolvable) {
    cdkBuilder.awsAccountId(awsAccountId)
  }

  public fun componentId(vararg componentId: Any) {
    _componentId.addAll(listOf(*componentId))
  }

  public fun componentId(componentId: Collection<Any>) {
    _componentId.addAll(componentId)
  }

  public fun componentId(componentId: IResolvable) {
    cdkBuilder.componentId(componentId)
  }

  public fun componentType(vararg componentType: Any) {
    _componentType.addAll(listOf(*componentType))
  }

  public fun componentType(componentType: Collection<Any>) {
    _componentType.addAll(componentType)
  }

  public fun componentType(componentType: IResolvable) {
    cdkBuilder.componentType(componentType)
  }

  public fun ec2InstanceImageId(vararg ec2InstanceImageId: Any) {
    _ec2InstanceImageId.addAll(listOf(*ec2InstanceImageId))
  }

  public fun ec2InstanceImageId(ec2InstanceImageId: Collection<Any>) {
    _ec2InstanceImageId.addAll(ec2InstanceImageId)
  }

  public fun ec2InstanceImageId(ec2InstanceImageId: IResolvable) {
    cdkBuilder.ec2InstanceImageId(ec2InstanceImageId)
  }

  public fun ec2InstanceSubnetId(vararg ec2InstanceSubnetId: Any) {
    _ec2InstanceSubnetId.addAll(listOf(*ec2InstanceSubnetId))
  }

  public fun ec2InstanceSubnetId(ec2InstanceSubnetId: Collection<Any>) {
    _ec2InstanceSubnetId.addAll(ec2InstanceSubnetId)
  }

  public fun ec2InstanceSubnetId(ec2InstanceSubnetId: IResolvable) {
    cdkBuilder.ec2InstanceSubnetId(ec2InstanceSubnetId)
  }

  public fun ec2InstanceVpcId(vararg ec2InstanceVpcId: Any) {
    _ec2InstanceVpcId.addAll(listOf(*ec2InstanceVpcId))
  }

  public fun ec2InstanceVpcId(ec2InstanceVpcId: Collection<Any>) {
    _ec2InstanceVpcId.addAll(ec2InstanceVpcId)
  }

  public fun ec2InstanceVpcId(ec2InstanceVpcId: IResolvable) {
    cdkBuilder.ec2InstanceVpcId(ec2InstanceVpcId)
  }

  public fun ecrImageArchitecture(vararg ecrImageArchitecture: Any) {
    _ecrImageArchitecture.addAll(listOf(*ecrImageArchitecture))
  }

  public fun ecrImageArchitecture(ecrImageArchitecture: Collection<Any>) {
    _ecrImageArchitecture.addAll(ecrImageArchitecture)
  }

  public fun ecrImageArchitecture(ecrImageArchitecture: IResolvable) {
    cdkBuilder.ecrImageArchitecture(ecrImageArchitecture)
  }

  public fun ecrImageHash(vararg ecrImageHash: Any) {
    _ecrImageHash.addAll(listOf(*ecrImageHash))
  }

  public fun ecrImageHash(ecrImageHash: Collection<Any>) {
    _ecrImageHash.addAll(ecrImageHash)
  }

  public fun ecrImageHash(ecrImageHash: IResolvable) {
    cdkBuilder.ecrImageHash(ecrImageHash)
  }

  public fun ecrImagePushedAt(vararg ecrImagePushedAt: Any) {
    _ecrImagePushedAt.addAll(listOf(*ecrImagePushedAt))
  }

  public fun ecrImagePushedAt(ecrImagePushedAt: Collection<Any>) {
    _ecrImagePushedAt.addAll(ecrImagePushedAt)
  }

  public fun ecrImagePushedAt(ecrImagePushedAt: IResolvable) {
    cdkBuilder.ecrImagePushedAt(ecrImagePushedAt)
  }

  public fun ecrImageRegistry(vararg ecrImageRegistry: Any) {
    _ecrImageRegistry.addAll(listOf(*ecrImageRegistry))
  }

  public fun ecrImageRegistry(ecrImageRegistry: Collection<Any>) {
    _ecrImageRegistry.addAll(ecrImageRegistry)
  }

  public fun ecrImageRegistry(ecrImageRegistry: IResolvable) {
    cdkBuilder.ecrImageRegistry(ecrImageRegistry)
  }

  public fun ecrImageRepositoryName(vararg ecrImageRepositoryName: Any) {
    _ecrImageRepositoryName.addAll(listOf(*ecrImageRepositoryName))
  }

  public fun ecrImageRepositoryName(ecrImageRepositoryName: Collection<Any>) {
    _ecrImageRepositoryName.addAll(ecrImageRepositoryName)
  }

  public fun ecrImageRepositoryName(ecrImageRepositoryName: IResolvable) {
    cdkBuilder.ecrImageRepositoryName(ecrImageRepositoryName)
  }

  public fun ecrImageTags(vararg ecrImageTags: Any) {
    _ecrImageTags.addAll(listOf(*ecrImageTags))
  }

  public fun ecrImageTags(ecrImageTags: Collection<Any>) {
    _ecrImageTags.addAll(ecrImageTags)
  }

  public fun ecrImageTags(ecrImageTags: IResolvable) {
    cdkBuilder.ecrImageTags(ecrImageTags)
  }

  public fun findingArn(vararg findingArn: Any) {
    _findingArn.addAll(listOf(*findingArn))
  }

  public fun findingArn(findingArn: Collection<Any>) {
    _findingArn.addAll(findingArn)
  }

  public fun findingArn(findingArn: IResolvable) {
    cdkBuilder.findingArn(findingArn)
  }

  public fun findingStatus(vararg findingStatus: Any) {
    _findingStatus.addAll(listOf(*findingStatus))
  }

  public fun findingStatus(findingStatus: Collection<Any>) {
    _findingStatus.addAll(findingStatus)
  }

  public fun findingStatus(findingStatus: IResolvable) {
    cdkBuilder.findingStatus(findingStatus)
  }

  public fun findingType(vararg findingType: Any) {
    _findingType.addAll(listOf(*findingType))
  }

  public fun findingType(findingType: Collection<Any>) {
    _findingType.addAll(findingType)
  }

  public fun findingType(findingType: IResolvable) {
    cdkBuilder.findingType(findingType)
  }

  public fun firstObservedAt(vararg firstObservedAt: Any) {
    _firstObservedAt.addAll(listOf(*firstObservedAt))
  }

  public fun firstObservedAt(firstObservedAt: Collection<Any>) {
    _firstObservedAt.addAll(firstObservedAt)
  }

  public fun firstObservedAt(firstObservedAt: IResolvable) {
    cdkBuilder.firstObservedAt(firstObservedAt)
  }

  public fun inspectorScore(vararg inspectorScore: Any) {
    _inspectorScore.addAll(listOf(*inspectorScore))
  }

  public fun inspectorScore(inspectorScore: Collection<Any>) {
    _inspectorScore.addAll(inspectorScore)
  }

  public fun inspectorScore(inspectorScore: IResolvable) {
    cdkBuilder.inspectorScore(inspectorScore)
  }

  public fun lastObservedAt(vararg lastObservedAt: Any) {
    _lastObservedAt.addAll(listOf(*lastObservedAt))
  }

  public fun lastObservedAt(lastObservedAt: Collection<Any>) {
    _lastObservedAt.addAll(lastObservedAt)
  }

  public fun lastObservedAt(lastObservedAt: IResolvable) {
    cdkBuilder.lastObservedAt(lastObservedAt)
  }

  public fun networkProtocol(vararg networkProtocol: Any) {
    _networkProtocol.addAll(listOf(*networkProtocol))
  }

  public fun networkProtocol(networkProtocol: Collection<Any>) {
    _networkProtocol.addAll(networkProtocol)
  }

  public fun networkProtocol(networkProtocol: IResolvable) {
    cdkBuilder.networkProtocol(networkProtocol)
  }

  public fun portRange(vararg portRange: Any) {
    _portRange.addAll(listOf(*portRange))
  }

  public fun portRange(portRange: Collection<Any>) {
    _portRange.addAll(portRange)
  }

  public fun portRange(portRange: IResolvable) {
    cdkBuilder.portRange(portRange)
  }

  public fun relatedVulnerabilities(vararg relatedVulnerabilities: Any) {
    _relatedVulnerabilities.addAll(listOf(*relatedVulnerabilities))
  }

  public fun relatedVulnerabilities(relatedVulnerabilities: Collection<Any>) {
    _relatedVulnerabilities.addAll(relatedVulnerabilities)
  }

  public fun relatedVulnerabilities(relatedVulnerabilities: IResolvable) {
    cdkBuilder.relatedVulnerabilities(relatedVulnerabilities)
  }

  public fun resourceId(vararg resourceId: Any) {
    _resourceId.addAll(listOf(*resourceId))
  }

  public fun resourceId(resourceId: Collection<Any>) {
    _resourceId.addAll(resourceId)
  }

  public fun resourceId(resourceId: IResolvable) {
    cdkBuilder.resourceId(resourceId)
  }

  public fun resourceTags(vararg resourceTags: Any) {
    _resourceTags.addAll(listOf(*resourceTags))
  }

  public fun resourceTags(resourceTags: Collection<Any>) {
    _resourceTags.addAll(resourceTags)
  }

  public fun resourceTags(resourceTags: IResolvable) {
    cdkBuilder.resourceTags(resourceTags)
  }

  public fun resourceType(vararg resourceType: Any) {
    _resourceType.addAll(listOf(*resourceType))
  }

  public fun resourceType(resourceType: Collection<Any>) {
    _resourceType.addAll(resourceType)
  }

  public fun resourceType(resourceType: IResolvable) {
    cdkBuilder.resourceType(resourceType)
  }

  public fun severity(vararg severity: Any) {
    _severity.addAll(listOf(*severity))
  }

  public fun severity(severity: Collection<Any>) {
    _severity.addAll(severity)
  }

  public fun severity(severity: IResolvable) {
    cdkBuilder.severity(severity)
  }

  public fun title(vararg title: Any) {
    _title.addAll(listOf(*title))
  }

  public fun title(title: Collection<Any>) {
    _title.addAll(title)
  }

  public fun title(title: IResolvable) {
    cdkBuilder.title(title)
  }

  public fun updatedAt(vararg updatedAt: Any) {
    _updatedAt.addAll(listOf(*updatedAt))
  }

  public fun updatedAt(updatedAt: Collection<Any>) {
    _updatedAt.addAll(updatedAt)
  }

  public fun updatedAt(updatedAt: IResolvable) {
    cdkBuilder.updatedAt(updatedAt)
  }

  public fun vendorSeverity(vararg vendorSeverity: Any) {
    _vendorSeverity.addAll(listOf(*vendorSeverity))
  }

  public fun vendorSeverity(vendorSeverity: Collection<Any>) {
    _vendorSeverity.addAll(vendorSeverity)
  }

  public fun vendorSeverity(vendorSeverity: IResolvable) {
    cdkBuilder.vendorSeverity(vendorSeverity)
  }

  public fun vulnerabilityId(vararg vulnerabilityId: Any) {
    _vulnerabilityId.addAll(listOf(*vulnerabilityId))
  }

  public fun vulnerabilityId(vulnerabilityId: Collection<Any>) {
    _vulnerabilityId.addAll(vulnerabilityId)
  }

  public fun vulnerabilityId(vulnerabilityId: IResolvable) {
    cdkBuilder.vulnerabilityId(vulnerabilityId)
  }

  public fun vulnerabilitySource(vararg vulnerabilitySource: Any) {
    _vulnerabilitySource.addAll(listOf(*vulnerabilitySource))
  }

  public fun vulnerabilitySource(vulnerabilitySource: Collection<Any>) {
    _vulnerabilitySource.addAll(vulnerabilitySource)
  }

  public fun vulnerabilitySource(vulnerabilitySource: IResolvable) {
    cdkBuilder.vulnerabilitySource(vulnerabilitySource)
  }

  public fun vulnerablePackages(vararg vulnerablePackages: Any) {
    _vulnerablePackages.addAll(listOf(*vulnerablePackages))
  }

  public fun vulnerablePackages(vulnerablePackages: Collection<Any>) {
    _vulnerablePackages.addAll(vulnerablePackages)
  }

  public fun vulnerablePackages(vulnerablePackages: IResolvable) {
    cdkBuilder.vulnerablePackages(vulnerablePackages)
  }

  public fun build(): CfnFilter.FilterCriteriaProperty {
    if(_awsAccountId.isNotEmpty()) cdkBuilder.awsAccountId(_awsAccountId)
    if(_componentId.isNotEmpty()) cdkBuilder.componentId(_componentId)
    if(_componentType.isNotEmpty()) cdkBuilder.componentType(_componentType)
    if(_ec2InstanceImageId.isNotEmpty()) cdkBuilder.ec2InstanceImageId(_ec2InstanceImageId)
    if(_ec2InstanceSubnetId.isNotEmpty()) cdkBuilder.ec2InstanceSubnetId(_ec2InstanceSubnetId)
    if(_ec2InstanceVpcId.isNotEmpty()) cdkBuilder.ec2InstanceVpcId(_ec2InstanceVpcId)
    if(_ecrImageArchitecture.isNotEmpty()) cdkBuilder.ecrImageArchitecture(_ecrImageArchitecture)
    if(_ecrImageHash.isNotEmpty()) cdkBuilder.ecrImageHash(_ecrImageHash)
    if(_ecrImagePushedAt.isNotEmpty()) cdkBuilder.ecrImagePushedAt(_ecrImagePushedAt)
    if(_ecrImageRegistry.isNotEmpty()) cdkBuilder.ecrImageRegistry(_ecrImageRegistry)
    if(_ecrImageRepositoryName.isNotEmpty())
        cdkBuilder.ecrImageRepositoryName(_ecrImageRepositoryName)
    if(_ecrImageTags.isNotEmpty()) cdkBuilder.ecrImageTags(_ecrImageTags)
    if(_findingArn.isNotEmpty()) cdkBuilder.findingArn(_findingArn)
    if(_findingStatus.isNotEmpty()) cdkBuilder.findingStatus(_findingStatus)
    if(_findingType.isNotEmpty()) cdkBuilder.findingType(_findingType)
    if(_firstObservedAt.isNotEmpty()) cdkBuilder.firstObservedAt(_firstObservedAt)
    if(_inspectorScore.isNotEmpty()) cdkBuilder.inspectorScore(_inspectorScore)
    if(_lastObservedAt.isNotEmpty()) cdkBuilder.lastObservedAt(_lastObservedAt)
    if(_networkProtocol.isNotEmpty()) cdkBuilder.networkProtocol(_networkProtocol)
    if(_portRange.isNotEmpty()) cdkBuilder.portRange(_portRange)
    if(_relatedVulnerabilities.isNotEmpty())
        cdkBuilder.relatedVulnerabilities(_relatedVulnerabilities)
    if(_resourceId.isNotEmpty()) cdkBuilder.resourceId(_resourceId)
    if(_resourceTags.isNotEmpty()) cdkBuilder.resourceTags(_resourceTags)
    if(_resourceType.isNotEmpty()) cdkBuilder.resourceType(_resourceType)
    if(_severity.isNotEmpty()) cdkBuilder.severity(_severity)
    if(_title.isNotEmpty()) cdkBuilder.title(_title)
    if(_updatedAt.isNotEmpty()) cdkBuilder.updatedAt(_updatedAt)
    if(_vendorSeverity.isNotEmpty()) cdkBuilder.vendorSeverity(_vendorSeverity)
    if(_vulnerabilityId.isNotEmpty()) cdkBuilder.vulnerabilityId(_vulnerabilityId)
    if(_vulnerabilitySource.isNotEmpty()) cdkBuilder.vulnerabilitySource(_vulnerabilitySource)
    if(_vulnerablePackages.isNotEmpty()) cdkBuilder.vulnerablePackages(_vulnerablePackages)
    return cdkBuilder.build()
  }
}
