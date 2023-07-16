@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.securityhub

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.securityhub.CfnAutomationRule

@CdkDslMarker
public class CfnAutomationRuleAutomationRulesFindingFiltersPropertyDsl {
  private val cdkBuilder: CfnAutomationRule.AutomationRulesFindingFiltersProperty.Builder =
      CfnAutomationRule.AutomationRulesFindingFiltersProperty.builder()

  private val _awsAccountId: MutableList<Any> = mutableListOf()

  private val _companyName: MutableList<Any> = mutableListOf()

  private val _complianceAssociatedStandardsId: MutableList<Any> = mutableListOf()

  private val _complianceSecurityControlId: MutableList<Any> = mutableListOf()

  private val _complianceStatus: MutableList<Any> = mutableListOf()

  private val _confidence: MutableList<Any> = mutableListOf()

  private val _createdAt: MutableList<Any> = mutableListOf()

  private val _criticality: MutableList<Any> = mutableListOf()

  private val _description: MutableList<Any> = mutableListOf()

  private val _firstObservedAt: MutableList<Any> = mutableListOf()

  private val _generatorId: MutableList<Any> = mutableListOf()

  private val _id: MutableList<Any> = mutableListOf()

  private val _lastObservedAt: MutableList<Any> = mutableListOf()

  private val _noteText: MutableList<Any> = mutableListOf()

  private val _noteUpdatedAt: MutableList<Any> = mutableListOf()

  private val _noteUpdatedBy: MutableList<Any> = mutableListOf()

  private val _productArn: MutableList<Any> = mutableListOf()

  private val _productName: MutableList<Any> = mutableListOf()

  private val _recordState: MutableList<Any> = mutableListOf()

  private val _relatedFindingsId: MutableList<Any> = mutableListOf()

  private val _relatedFindingsProductArn: MutableList<Any> = mutableListOf()

  private val _resourceDetailsOther: MutableList<Any> = mutableListOf()

  private val _resourceId: MutableList<Any> = mutableListOf()

  private val _resourcePartition: MutableList<Any> = mutableListOf()

  private val _resourceRegion: MutableList<Any> = mutableListOf()

  private val _resourceTags: MutableList<Any> = mutableListOf()

  private val _resourceType: MutableList<Any> = mutableListOf()

  private val _severityLabel: MutableList<Any> = mutableListOf()

  private val _sourceUrl: MutableList<Any> = mutableListOf()

  private val _title: MutableList<Any> = mutableListOf()

  private val _type: MutableList<Any> = mutableListOf()

  private val _updatedAt: MutableList<Any> = mutableListOf()

  private val _userDefinedFields: MutableList<Any> = mutableListOf()

  private val _verificationState: MutableList<Any> = mutableListOf()

  private val _workflowStatus: MutableList<Any> = mutableListOf()

  public fun awsAccountId(vararg awsAccountId: Any) {
    _awsAccountId.addAll(listOf(*awsAccountId))
  }

  public fun awsAccountId(awsAccountId: Collection<Any>) {
    _awsAccountId.addAll(awsAccountId)
  }

  public fun awsAccountId(awsAccountId: IResolvable) {
    cdkBuilder.awsAccountId(awsAccountId)
  }

  public fun companyName(vararg companyName: Any) {
    _companyName.addAll(listOf(*companyName))
  }

  public fun companyName(companyName: Collection<Any>) {
    _companyName.addAll(companyName)
  }

  public fun companyName(companyName: IResolvable) {
    cdkBuilder.companyName(companyName)
  }

  public fun complianceAssociatedStandardsId(vararg complianceAssociatedStandardsId: Any) {
    _complianceAssociatedStandardsId.addAll(listOf(*complianceAssociatedStandardsId))
  }

  public fun complianceAssociatedStandardsId(complianceAssociatedStandardsId: Collection<Any>) {
    _complianceAssociatedStandardsId.addAll(complianceAssociatedStandardsId)
  }

  public fun complianceAssociatedStandardsId(complianceAssociatedStandardsId: IResolvable) {
    cdkBuilder.complianceAssociatedStandardsId(complianceAssociatedStandardsId)
  }

  public fun complianceSecurityControlId(vararg complianceSecurityControlId: Any) {
    _complianceSecurityControlId.addAll(listOf(*complianceSecurityControlId))
  }

  public fun complianceSecurityControlId(complianceSecurityControlId: Collection<Any>) {
    _complianceSecurityControlId.addAll(complianceSecurityControlId)
  }

  public fun complianceSecurityControlId(complianceSecurityControlId: IResolvable) {
    cdkBuilder.complianceSecurityControlId(complianceSecurityControlId)
  }

  public fun complianceStatus(vararg complianceStatus: Any) {
    _complianceStatus.addAll(listOf(*complianceStatus))
  }

  public fun complianceStatus(complianceStatus: Collection<Any>) {
    _complianceStatus.addAll(complianceStatus)
  }

  public fun complianceStatus(complianceStatus: IResolvable) {
    cdkBuilder.complianceStatus(complianceStatus)
  }

  public fun confidence(vararg confidence: Any) {
    _confidence.addAll(listOf(*confidence))
  }

  public fun confidence(confidence: Collection<Any>) {
    _confidence.addAll(confidence)
  }

  public fun confidence(confidence: IResolvable) {
    cdkBuilder.confidence(confidence)
  }

  public fun createdAt(vararg createdAt: Any) {
    _createdAt.addAll(listOf(*createdAt))
  }

  public fun createdAt(createdAt: Collection<Any>) {
    _createdAt.addAll(createdAt)
  }

  public fun createdAt(createdAt: IResolvable) {
    cdkBuilder.createdAt(createdAt)
  }

  public fun criticality(vararg criticality: Any) {
    _criticality.addAll(listOf(*criticality))
  }

  public fun criticality(criticality: Collection<Any>) {
    _criticality.addAll(criticality)
  }

  public fun criticality(criticality: IResolvable) {
    cdkBuilder.criticality(criticality)
  }

  public fun description(vararg description: Any) {
    _description.addAll(listOf(*description))
  }

  public fun description(description: Collection<Any>) {
    _description.addAll(description)
  }

  public fun description(description: IResolvable) {
    cdkBuilder.description(description)
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

  public fun generatorId(vararg generatorId: Any) {
    _generatorId.addAll(listOf(*generatorId))
  }

  public fun generatorId(generatorId: Collection<Any>) {
    _generatorId.addAll(generatorId)
  }

  public fun generatorId(generatorId: IResolvable) {
    cdkBuilder.generatorId(generatorId)
  }

  public fun id(vararg id: Any) {
    _id.addAll(listOf(*id))
  }

  public fun id(id: Collection<Any>) {
    _id.addAll(id)
  }

  public fun id(id: IResolvable) {
    cdkBuilder.id(id)
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

  public fun noteText(vararg noteText: Any) {
    _noteText.addAll(listOf(*noteText))
  }

  public fun noteText(noteText: Collection<Any>) {
    _noteText.addAll(noteText)
  }

  public fun noteText(noteText: IResolvable) {
    cdkBuilder.noteText(noteText)
  }

  public fun noteUpdatedAt(vararg noteUpdatedAt: Any) {
    _noteUpdatedAt.addAll(listOf(*noteUpdatedAt))
  }

  public fun noteUpdatedAt(noteUpdatedAt: Collection<Any>) {
    _noteUpdatedAt.addAll(noteUpdatedAt)
  }

  public fun noteUpdatedAt(noteUpdatedAt: IResolvable) {
    cdkBuilder.noteUpdatedAt(noteUpdatedAt)
  }

  public fun noteUpdatedBy(vararg noteUpdatedBy: Any) {
    _noteUpdatedBy.addAll(listOf(*noteUpdatedBy))
  }

  public fun noteUpdatedBy(noteUpdatedBy: Collection<Any>) {
    _noteUpdatedBy.addAll(noteUpdatedBy)
  }

  public fun noteUpdatedBy(noteUpdatedBy: IResolvable) {
    cdkBuilder.noteUpdatedBy(noteUpdatedBy)
  }

  public fun productArn(vararg productArn: Any) {
    _productArn.addAll(listOf(*productArn))
  }

  public fun productArn(productArn: Collection<Any>) {
    _productArn.addAll(productArn)
  }

  public fun productArn(productArn: IResolvable) {
    cdkBuilder.productArn(productArn)
  }

  public fun productName(vararg productName: Any) {
    _productName.addAll(listOf(*productName))
  }

  public fun productName(productName: Collection<Any>) {
    _productName.addAll(productName)
  }

  public fun productName(productName: IResolvable) {
    cdkBuilder.productName(productName)
  }

  public fun recordState(vararg recordState: Any) {
    _recordState.addAll(listOf(*recordState))
  }

  public fun recordState(recordState: Collection<Any>) {
    _recordState.addAll(recordState)
  }

  public fun recordState(recordState: IResolvable) {
    cdkBuilder.recordState(recordState)
  }

  public fun relatedFindingsId(vararg relatedFindingsId: Any) {
    _relatedFindingsId.addAll(listOf(*relatedFindingsId))
  }

  public fun relatedFindingsId(relatedFindingsId: Collection<Any>) {
    _relatedFindingsId.addAll(relatedFindingsId)
  }

  public fun relatedFindingsId(relatedFindingsId: IResolvable) {
    cdkBuilder.relatedFindingsId(relatedFindingsId)
  }

  public fun relatedFindingsProductArn(vararg relatedFindingsProductArn: Any) {
    _relatedFindingsProductArn.addAll(listOf(*relatedFindingsProductArn))
  }

  public fun relatedFindingsProductArn(relatedFindingsProductArn: Collection<Any>) {
    _relatedFindingsProductArn.addAll(relatedFindingsProductArn)
  }

  public fun relatedFindingsProductArn(relatedFindingsProductArn: IResolvable) {
    cdkBuilder.relatedFindingsProductArn(relatedFindingsProductArn)
  }

  public fun resourceDetailsOther(vararg resourceDetailsOther: Any) {
    _resourceDetailsOther.addAll(listOf(*resourceDetailsOther))
  }

  public fun resourceDetailsOther(resourceDetailsOther: Collection<Any>) {
    _resourceDetailsOther.addAll(resourceDetailsOther)
  }

  public fun resourceDetailsOther(resourceDetailsOther: IResolvable) {
    cdkBuilder.resourceDetailsOther(resourceDetailsOther)
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

  public fun resourcePartition(vararg resourcePartition: Any) {
    _resourcePartition.addAll(listOf(*resourcePartition))
  }

  public fun resourcePartition(resourcePartition: Collection<Any>) {
    _resourcePartition.addAll(resourcePartition)
  }

  public fun resourcePartition(resourcePartition: IResolvable) {
    cdkBuilder.resourcePartition(resourcePartition)
  }

  public fun resourceRegion(vararg resourceRegion: Any) {
    _resourceRegion.addAll(listOf(*resourceRegion))
  }

  public fun resourceRegion(resourceRegion: Collection<Any>) {
    _resourceRegion.addAll(resourceRegion)
  }

  public fun resourceRegion(resourceRegion: IResolvable) {
    cdkBuilder.resourceRegion(resourceRegion)
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

  public fun severityLabel(vararg severityLabel: Any) {
    _severityLabel.addAll(listOf(*severityLabel))
  }

  public fun severityLabel(severityLabel: Collection<Any>) {
    _severityLabel.addAll(severityLabel)
  }

  public fun severityLabel(severityLabel: IResolvable) {
    cdkBuilder.severityLabel(severityLabel)
  }

  public fun sourceUrl(vararg sourceUrl: Any) {
    _sourceUrl.addAll(listOf(*sourceUrl))
  }

  public fun sourceUrl(sourceUrl: Collection<Any>) {
    _sourceUrl.addAll(sourceUrl)
  }

  public fun sourceUrl(sourceUrl: IResolvable) {
    cdkBuilder.sourceUrl(sourceUrl)
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

  public fun type(vararg type: Any) {
    _type.addAll(listOf(*type))
  }

  public fun type(type: Collection<Any>) {
    _type.addAll(type)
  }

  public fun type(type: IResolvable) {
    cdkBuilder.type(type)
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

  public fun userDefinedFields(vararg userDefinedFields: Any) {
    _userDefinedFields.addAll(listOf(*userDefinedFields))
  }

  public fun userDefinedFields(userDefinedFields: Collection<Any>) {
    _userDefinedFields.addAll(userDefinedFields)
  }

  public fun userDefinedFields(userDefinedFields: IResolvable) {
    cdkBuilder.userDefinedFields(userDefinedFields)
  }

  public fun verificationState(vararg verificationState: Any) {
    _verificationState.addAll(listOf(*verificationState))
  }

  public fun verificationState(verificationState: Collection<Any>) {
    _verificationState.addAll(verificationState)
  }

  public fun verificationState(verificationState: IResolvable) {
    cdkBuilder.verificationState(verificationState)
  }

  public fun workflowStatus(vararg workflowStatus: Any) {
    _workflowStatus.addAll(listOf(*workflowStatus))
  }

  public fun workflowStatus(workflowStatus: Collection<Any>) {
    _workflowStatus.addAll(workflowStatus)
  }

  public fun workflowStatus(workflowStatus: IResolvable) {
    cdkBuilder.workflowStatus(workflowStatus)
  }

  public fun build(): CfnAutomationRule.AutomationRulesFindingFiltersProperty {
    if(_awsAccountId.isNotEmpty()) cdkBuilder.awsAccountId(_awsAccountId)
    if(_companyName.isNotEmpty()) cdkBuilder.companyName(_companyName)
    if(_complianceAssociatedStandardsId.isNotEmpty())
        cdkBuilder.complianceAssociatedStandardsId(_complianceAssociatedStandardsId)
    if(_complianceSecurityControlId.isNotEmpty())
        cdkBuilder.complianceSecurityControlId(_complianceSecurityControlId)
    if(_complianceStatus.isNotEmpty()) cdkBuilder.complianceStatus(_complianceStatus)
    if(_confidence.isNotEmpty()) cdkBuilder.confidence(_confidence)
    if(_createdAt.isNotEmpty()) cdkBuilder.createdAt(_createdAt)
    if(_criticality.isNotEmpty()) cdkBuilder.criticality(_criticality)
    if(_description.isNotEmpty()) cdkBuilder.description(_description)
    if(_firstObservedAt.isNotEmpty()) cdkBuilder.firstObservedAt(_firstObservedAt)
    if(_generatorId.isNotEmpty()) cdkBuilder.generatorId(_generatorId)
    if(_id.isNotEmpty()) cdkBuilder.id(_id)
    if(_lastObservedAt.isNotEmpty()) cdkBuilder.lastObservedAt(_lastObservedAt)
    if(_noteText.isNotEmpty()) cdkBuilder.noteText(_noteText)
    if(_noteUpdatedAt.isNotEmpty()) cdkBuilder.noteUpdatedAt(_noteUpdatedAt)
    if(_noteUpdatedBy.isNotEmpty()) cdkBuilder.noteUpdatedBy(_noteUpdatedBy)
    if(_productArn.isNotEmpty()) cdkBuilder.productArn(_productArn)
    if(_productName.isNotEmpty()) cdkBuilder.productName(_productName)
    if(_recordState.isNotEmpty()) cdkBuilder.recordState(_recordState)
    if(_relatedFindingsId.isNotEmpty()) cdkBuilder.relatedFindingsId(_relatedFindingsId)
    if(_relatedFindingsProductArn.isNotEmpty())
        cdkBuilder.relatedFindingsProductArn(_relatedFindingsProductArn)
    if(_resourceDetailsOther.isNotEmpty()) cdkBuilder.resourceDetailsOther(_resourceDetailsOther)
    if(_resourceId.isNotEmpty()) cdkBuilder.resourceId(_resourceId)
    if(_resourcePartition.isNotEmpty()) cdkBuilder.resourcePartition(_resourcePartition)
    if(_resourceRegion.isNotEmpty()) cdkBuilder.resourceRegion(_resourceRegion)
    if(_resourceTags.isNotEmpty()) cdkBuilder.resourceTags(_resourceTags)
    if(_resourceType.isNotEmpty()) cdkBuilder.resourceType(_resourceType)
    if(_severityLabel.isNotEmpty()) cdkBuilder.severityLabel(_severityLabel)
    if(_sourceUrl.isNotEmpty()) cdkBuilder.sourceUrl(_sourceUrl)
    if(_title.isNotEmpty()) cdkBuilder.title(_title)
    if(_type.isNotEmpty()) cdkBuilder.type(_type)
    if(_updatedAt.isNotEmpty()) cdkBuilder.updatedAt(_updatedAt)
    if(_userDefinedFields.isNotEmpty()) cdkBuilder.userDefinedFields(_userDefinedFields)
    if(_verificationState.isNotEmpty()) cdkBuilder.verificationState(_verificationState)
    if(_workflowStatus.isNotEmpty()) cdkBuilder.workflowStatus(_workflowStatus)
    return cdkBuilder.build()
  }
}
