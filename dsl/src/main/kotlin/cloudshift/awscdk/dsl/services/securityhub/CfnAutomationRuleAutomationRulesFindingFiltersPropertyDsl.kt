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

  /**
   * @param awsAccountId The AWS account ID in which a finding was generated.
   */
  public fun awsAccountId(vararg awsAccountId: Any) {
    _awsAccountId.addAll(listOf(*awsAccountId))
  }

  /**
   * @param awsAccountId The AWS account ID in which a finding was generated.
   */
  public fun awsAccountId(awsAccountId: Collection<Any>) {
    _awsAccountId.addAll(awsAccountId)
  }

  /**
   * @param awsAccountId The AWS account ID in which a finding was generated.
   */
  public fun awsAccountId(awsAccountId: IResolvable) {
    cdkBuilder.awsAccountId(awsAccountId)
  }

  /**
   * @param companyName The name of the company for the product that generated the finding.
   * For control-based findings, the company is AWS .
   */
  public fun companyName(vararg companyName: Any) {
    _companyName.addAll(listOf(*companyName))
  }

  /**
   * @param companyName The name of the company for the product that generated the finding.
   * For control-based findings, the company is AWS .
   */
  public fun companyName(companyName: Collection<Any>) {
    _companyName.addAll(companyName)
  }

  /**
   * @param companyName The name of the company for the product that generated the finding.
   * For control-based findings, the company is AWS .
   */
  public fun companyName(companyName: IResolvable) {
    cdkBuilder.companyName(companyName)
  }

  /**
   * @param complianceAssociatedStandardsId The unique identifier of a standard in which a control
   * is enabled.
   * This field consists of the resource portion of the Amazon Resource Name (ARN) returned for a
   * standard in the
   * [DescribeStandards](https://docs.aws.amazon.com/securityhub/1.0/APIReference/API_DescribeStandards.html)
   * API response.
   */
  public fun complianceAssociatedStandardsId(vararg complianceAssociatedStandardsId: Any) {
    _complianceAssociatedStandardsId.addAll(listOf(*complianceAssociatedStandardsId))
  }

  /**
   * @param complianceAssociatedStandardsId The unique identifier of a standard in which a control
   * is enabled.
   * This field consists of the resource portion of the Amazon Resource Name (ARN) returned for a
   * standard in the
   * [DescribeStandards](https://docs.aws.amazon.com/securityhub/1.0/APIReference/API_DescribeStandards.html)
   * API response.
   */
  public fun complianceAssociatedStandardsId(complianceAssociatedStandardsId: Collection<Any>) {
    _complianceAssociatedStandardsId.addAll(complianceAssociatedStandardsId)
  }

  /**
   * @param complianceAssociatedStandardsId The unique identifier of a standard in which a control
   * is enabled.
   * This field consists of the resource portion of the Amazon Resource Name (ARN) returned for a
   * standard in the
   * [DescribeStandards](https://docs.aws.amazon.com/securityhub/1.0/APIReference/API_DescribeStandards.html)
   * API response.
   */
  public fun complianceAssociatedStandardsId(complianceAssociatedStandardsId: IResolvable) {
    cdkBuilder.complianceAssociatedStandardsId(complianceAssociatedStandardsId)
  }

  /**
   * @param complianceSecurityControlId The security control ID for which a finding was generated.
   * Security control IDs are the same across standards.
   */
  public fun complianceSecurityControlId(vararg complianceSecurityControlId: Any) {
    _complianceSecurityControlId.addAll(listOf(*complianceSecurityControlId))
  }

  /**
   * @param complianceSecurityControlId The security control ID for which a finding was generated.
   * Security control IDs are the same across standards.
   */
  public fun complianceSecurityControlId(complianceSecurityControlId: Collection<Any>) {
    _complianceSecurityControlId.addAll(complianceSecurityControlId)
  }

  /**
   * @param complianceSecurityControlId The security control ID for which a finding was generated.
   * Security control IDs are the same across standards.
   */
  public fun complianceSecurityControlId(complianceSecurityControlId: IResolvable) {
    cdkBuilder.complianceSecurityControlId(complianceSecurityControlId)
  }

  /**
   * @param complianceStatus The result of a security check.
   * This field is only used for findings generated from controls.
   */
  public fun complianceStatus(vararg complianceStatus: Any) {
    _complianceStatus.addAll(listOf(*complianceStatus))
  }

  /**
   * @param complianceStatus The result of a security check.
   * This field is only used for findings generated from controls.
   */
  public fun complianceStatus(complianceStatus: Collection<Any>) {
    _complianceStatus.addAll(complianceStatus)
  }

  /**
   * @param complianceStatus The result of a security check.
   * This field is only used for findings generated from controls.
   */
  public fun complianceStatus(complianceStatus: IResolvable) {
    cdkBuilder.complianceStatus(complianceStatus)
  }

  /**
   * @param confidence The likelihood that a finding accurately identifies the behavior or issue
   * that it was intended to identify.
   * `Confidence` is scored on a 0–100 basis using a ratio scale. A value of `0` means 0 percent
   * confidence, and a value of `100` means 100 percent confidence. For example, a data exfiltration
   * detection based on a statistical deviation of network traffic has low confidence because an actual
   * exfiltration hasn't been verified. For more information, see
   * [Confidence](https://docs.aws.amazon.com/securityhub/latest/userguide/asff-top-level-attributes.html#asff-confidence)
   * in the *AWS Security Hub User Guide* .
   */
  public fun confidence(vararg confidence: Any) {
    _confidence.addAll(listOf(*confidence))
  }

  /**
   * @param confidence The likelihood that a finding accurately identifies the behavior or issue
   * that it was intended to identify.
   * `Confidence` is scored on a 0–100 basis using a ratio scale. A value of `0` means 0 percent
   * confidence, and a value of `100` means 100 percent confidence. For example, a data exfiltration
   * detection based on a statistical deviation of network traffic has low confidence because an actual
   * exfiltration hasn't been verified. For more information, see
   * [Confidence](https://docs.aws.amazon.com/securityhub/latest/userguide/asff-top-level-attributes.html#asff-confidence)
   * in the *AWS Security Hub User Guide* .
   */
  public fun confidence(confidence: Collection<Any>) {
    _confidence.addAll(confidence)
  }

  /**
   * @param confidence The likelihood that a finding accurately identifies the behavior or issue
   * that it was intended to identify.
   * `Confidence` is scored on a 0–100 basis using a ratio scale. A value of `0` means 0 percent
   * confidence, and a value of `100` means 100 percent confidence. For example, a data exfiltration
   * detection based on a statistical deviation of network traffic has low confidence because an actual
   * exfiltration hasn't been verified. For more information, see
   * [Confidence](https://docs.aws.amazon.com/securityhub/latest/userguide/asff-top-level-attributes.html#asff-confidence)
   * in the *AWS Security Hub User Guide* .
   */
  public fun confidence(confidence: IResolvable) {
    cdkBuilder.confidence(confidence)
  }

  /**
   * @param createdAt A timestamp that indicates when this finding record was created.
   * Uses the `date-time` format specified in [RFC 3339 section 5.6, Internet Date/Time
   * Format](https://docs.aws.amazon.com/https://tools.ietf.org/html/rfc3339#section-5.6) . The value
   * cannot contain spaces. For example, `2020-03-22T13:22:13.933Z` .
   */
  public fun createdAt(vararg createdAt: Any) {
    _createdAt.addAll(listOf(*createdAt))
  }

  /**
   * @param createdAt A timestamp that indicates when this finding record was created.
   * Uses the `date-time` format specified in [RFC 3339 section 5.6, Internet Date/Time
   * Format](https://docs.aws.amazon.com/https://tools.ietf.org/html/rfc3339#section-5.6) . The value
   * cannot contain spaces. For example, `2020-03-22T13:22:13.933Z` .
   */
  public fun createdAt(createdAt: Collection<Any>) {
    _createdAt.addAll(createdAt)
  }

  /**
   * @param createdAt A timestamp that indicates when this finding record was created.
   * Uses the `date-time` format specified in [RFC 3339 section 5.6, Internet Date/Time
   * Format](https://docs.aws.amazon.com/https://tools.ietf.org/html/rfc3339#section-5.6) . The value
   * cannot contain spaces. For example, `2020-03-22T13:22:13.933Z` .
   */
  public fun createdAt(createdAt: IResolvable) {
    cdkBuilder.createdAt(createdAt)
  }

  /**
   * @param criticality The level of importance that is assigned to the resources that are
   * associated with a finding.
   * `Criticality` is scored on a 0–100 basis, using a ratio scale that supports only full integers.
   * A score of `0` means that the underlying resources have no criticality, and a score of `100` is
   * reserved for the most critical resources. For more information, see
   * [Criticality](https://docs.aws.amazon.com/securityhub/latest/userguide/asff-top-level-attributes.html#asff-criticality)
   * in the *AWS Security Hub User Guide* .
   */
  public fun criticality(vararg criticality: Any) {
    _criticality.addAll(listOf(*criticality))
  }

  /**
   * @param criticality The level of importance that is assigned to the resources that are
   * associated with a finding.
   * `Criticality` is scored on a 0–100 basis, using a ratio scale that supports only full integers.
   * A score of `0` means that the underlying resources have no criticality, and a score of `100` is
   * reserved for the most critical resources. For more information, see
   * [Criticality](https://docs.aws.amazon.com/securityhub/latest/userguide/asff-top-level-attributes.html#asff-criticality)
   * in the *AWS Security Hub User Guide* .
   */
  public fun criticality(criticality: Collection<Any>) {
    _criticality.addAll(criticality)
  }

  /**
   * @param criticality The level of importance that is assigned to the resources that are
   * associated with a finding.
   * `Criticality` is scored on a 0–100 basis, using a ratio scale that supports only full integers.
   * A score of `0` means that the underlying resources have no criticality, and a score of `100` is
   * reserved for the most critical resources. For more information, see
   * [Criticality](https://docs.aws.amazon.com/securityhub/latest/userguide/asff-top-level-attributes.html#asff-criticality)
   * in the *AWS Security Hub User Guide* .
   */
  public fun criticality(criticality: IResolvable) {
    cdkBuilder.criticality(criticality)
  }

  /**
   * @param description A finding's description.
   */
  public fun description(vararg description: Any) {
    _description.addAll(listOf(*description))
  }

  /**
   * @param description A finding's description.
   */
  public fun description(description: Collection<Any>) {
    _description.addAll(description)
  }

  /**
   * @param description A finding's description.
   */
  public fun description(description: IResolvable) {
    cdkBuilder.description(description)
  }

  /**
   * @param firstObservedAt A timestamp that indicates when the potential security issue captured by
   * a finding was first observed by the security findings product.
   * Uses the `date-time` format specified in [RFC 3339 section 5.6, Internet Date/Time
   * Format](https://docs.aws.amazon.com/https://tools.ietf.org/html/rfc3339#section-5.6) . The value
   * cannot contain spaces. For example, `2020-03-22T13:22:13.933Z` .
   */
  public fun firstObservedAt(vararg firstObservedAt: Any) {
    _firstObservedAt.addAll(listOf(*firstObservedAt))
  }

  /**
   * @param firstObservedAt A timestamp that indicates when the potential security issue captured by
   * a finding was first observed by the security findings product.
   * Uses the `date-time` format specified in [RFC 3339 section 5.6, Internet Date/Time
   * Format](https://docs.aws.amazon.com/https://tools.ietf.org/html/rfc3339#section-5.6) . The value
   * cannot contain spaces. For example, `2020-03-22T13:22:13.933Z` .
   */
  public fun firstObservedAt(firstObservedAt: Collection<Any>) {
    _firstObservedAt.addAll(firstObservedAt)
  }

  /**
   * @param firstObservedAt A timestamp that indicates when the potential security issue captured by
   * a finding was first observed by the security findings product.
   * Uses the `date-time` format specified in [RFC 3339 section 5.6, Internet Date/Time
   * Format](https://docs.aws.amazon.com/https://tools.ietf.org/html/rfc3339#section-5.6) . The value
   * cannot contain spaces. For example, `2020-03-22T13:22:13.933Z` .
   */
  public fun firstObservedAt(firstObservedAt: IResolvable) {
    cdkBuilder.firstObservedAt(firstObservedAt)
  }

  /**
   * @param generatorId The identifier for the solution-specific component that generated a finding.
   */
  public fun generatorId(vararg generatorId: Any) {
    _generatorId.addAll(listOf(*generatorId))
  }

  /**
   * @param generatorId The identifier for the solution-specific component that generated a finding.
   */
  public fun generatorId(generatorId: Collection<Any>) {
    _generatorId.addAll(generatorId)
  }

  /**
   * @param generatorId The identifier for the solution-specific component that generated a finding.
   */
  public fun generatorId(generatorId: IResolvable) {
    cdkBuilder.generatorId(generatorId)
  }

  /**
   * @param id The product-specific identifier for a finding.
   */
  public fun id(vararg id: Any) {
    _id.addAll(listOf(*id))
  }

  /**
   * @param id The product-specific identifier for a finding.
   */
  public fun id(id: Collection<Any>) {
    _id.addAll(id)
  }

  /**
   * @param id The product-specific identifier for a finding.
   */
  public fun id(id: IResolvable) {
    cdkBuilder.id(id)
  }

  /**
   * @param lastObservedAt A timestamp that indicates when the potential security issue captured by
   * a finding was most recently observed by the security findings product.
   * Uses the `date-time` format specified in [RFC 3339 section 5.6, Internet Date/Time
   * Format](https://docs.aws.amazon.com/https://tools.ietf.org/html/rfc3339#section-5.6) . The value
   * cannot contain spaces. For example, `2020-03-22T13:22:13.933Z` .
   */
  public fun lastObservedAt(vararg lastObservedAt: Any) {
    _lastObservedAt.addAll(listOf(*lastObservedAt))
  }

  /**
   * @param lastObservedAt A timestamp that indicates when the potential security issue captured by
   * a finding was most recently observed by the security findings product.
   * Uses the `date-time` format specified in [RFC 3339 section 5.6, Internet Date/Time
   * Format](https://docs.aws.amazon.com/https://tools.ietf.org/html/rfc3339#section-5.6) . The value
   * cannot contain spaces. For example, `2020-03-22T13:22:13.933Z` .
   */
  public fun lastObservedAt(lastObservedAt: Collection<Any>) {
    _lastObservedAt.addAll(lastObservedAt)
  }

  /**
   * @param lastObservedAt A timestamp that indicates when the potential security issue captured by
   * a finding was most recently observed by the security findings product.
   * Uses the `date-time` format specified in [RFC 3339 section 5.6, Internet Date/Time
   * Format](https://docs.aws.amazon.com/https://tools.ietf.org/html/rfc3339#section-5.6) . The value
   * cannot contain spaces. For example, `2020-03-22T13:22:13.933Z` .
   */
  public fun lastObservedAt(lastObservedAt: IResolvable) {
    cdkBuilder.lastObservedAt(lastObservedAt)
  }

  /**
   * @param noteText The text of a user-defined note that's added to a finding.
   */
  public fun noteText(vararg noteText: Any) {
    _noteText.addAll(listOf(*noteText))
  }

  /**
   * @param noteText The text of a user-defined note that's added to a finding.
   */
  public fun noteText(noteText: Collection<Any>) {
    _noteText.addAll(noteText)
  }

  /**
   * @param noteText The text of a user-defined note that's added to a finding.
   */
  public fun noteText(noteText: IResolvable) {
    cdkBuilder.noteText(noteText)
  }

  /**
   * @param noteUpdatedAt The timestamp of when the note was updated.
   * Uses the date-time format specified in [RFC 3339 section 5.6, Internet Date/Time
   * Format](https://docs.aws.amazon.com/https://www.rfc-editor.org/rfc/rfc3339#section-5.6) . The
   * value cannot contain spaces. For example, `2020-03-22T13:22:13.933Z` .
   */
  public fun noteUpdatedAt(vararg noteUpdatedAt: Any) {
    _noteUpdatedAt.addAll(listOf(*noteUpdatedAt))
  }

  /**
   * @param noteUpdatedAt The timestamp of when the note was updated.
   * Uses the date-time format specified in [RFC 3339 section 5.6, Internet Date/Time
   * Format](https://docs.aws.amazon.com/https://www.rfc-editor.org/rfc/rfc3339#section-5.6) . The
   * value cannot contain spaces. For example, `2020-03-22T13:22:13.933Z` .
   */
  public fun noteUpdatedAt(noteUpdatedAt: Collection<Any>) {
    _noteUpdatedAt.addAll(noteUpdatedAt)
  }

  /**
   * @param noteUpdatedAt The timestamp of when the note was updated.
   * Uses the date-time format specified in [RFC 3339 section 5.6, Internet Date/Time
   * Format](https://docs.aws.amazon.com/https://www.rfc-editor.org/rfc/rfc3339#section-5.6) . The
   * value cannot contain spaces. For example, `2020-03-22T13:22:13.933Z` .
   */
  public fun noteUpdatedAt(noteUpdatedAt: IResolvable) {
    cdkBuilder.noteUpdatedAt(noteUpdatedAt)
  }

  /**
   * @param noteUpdatedBy The principal that created a note.
   */
  public fun noteUpdatedBy(vararg noteUpdatedBy: Any) {
    _noteUpdatedBy.addAll(listOf(*noteUpdatedBy))
  }

  /**
   * @param noteUpdatedBy The principal that created a note.
   */
  public fun noteUpdatedBy(noteUpdatedBy: Collection<Any>) {
    _noteUpdatedBy.addAll(noteUpdatedBy)
  }

  /**
   * @param noteUpdatedBy The principal that created a note.
   */
  public fun noteUpdatedBy(noteUpdatedBy: IResolvable) {
    cdkBuilder.noteUpdatedBy(noteUpdatedBy)
  }

  /**
   * @param productArn The Amazon Resource Name (ARN) for a third-party product that generated a
   * finding in Security Hub.
   */
  public fun productArn(vararg productArn: Any) {
    _productArn.addAll(listOf(*productArn))
  }

  /**
   * @param productArn The Amazon Resource Name (ARN) for a third-party product that generated a
   * finding in Security Hub.
   */
  public fun productArn(productArn: Collection<Any>) {
    _productArn.addAll(productArn)
  }

  /**
   * @param productArn The Amazon Resource Name (ARN) for a third-party product that generated a
   * finding in Security Hub.
   */
  public fun productArn(productArn: IResolvable) {
    cdkBuilder.productArn(productArn)
  }

  /**
   * @param productName Provides the name of the product that generated the finding.
   * For control-based findings, the product name is Security Hub.
   */
  public fun productName(vararg productName: Any) {
    _productName.addAll(listOf(*productName))
  }

  /**
   * @param productName Provides the name of the product that generated the finding.
   * For control-based findings, the product name is Security Hub.
   */
  public fun productName(productName: Collection<Any>) {
    _productName.addAll(productName)
  }

  /**
   * @param productName Provides the name of the product that generated the finding.
   * For control-based findings, the product name is Security Hub.
   */
  public fun productName(productName: IResolvable) {
    cdkBuilder.productName(productName)
  }

  /**
   * @param recordState Provides the current state of a finding.
   */
  public fun recordState(vararg recordState: Any) {
    _recordState.addAll(listOf(*recordState))
  }

  /**
   * @param recordState Provides the current state of a finding.
   */
  public fun recordState(recordState: Collection<Any>) {
    _recordState.addAll(recordState)
  }

  /**
   * @param recordState Provides the current state of a finding.
   */
  public fun recordState(recordState: IResolvable) {
    cdkBuilder.recordState(recordState)
  }

  /**
   * @param relatedFindingsId The product-generated identifier for a related finding.
   */
  public fun relatedFindingsId(vararg relatedFindingsId: Any) {
    _relatedFindingsId.addAll(listOf(*relatedFindingsId))
  }

  /**
   * @param relatedFindingsId The product-generated identifier for a related finding.
   */
  public fun relatedFindingsId(relatedFindingsId: Collection<Any>) {
    _relatedFindingsId.addAll(relatedFindingsId)
  }

  /**
   * @param relatedFindingsId The product-generated identifier for a related finding.
   */
  public fun relatedFindingsId(relatedFindingsId: IResolvable) {
    cdkBuilder.relatedFindingsId(relatedFindingsId)
  }

  /**
   * @param relatedFindingsProductArn The ARN for the product that generated a related finding.
   */
  public fun relatedFindingsProductArn(vararg relatedFindingsProductArn: Any) {
    _relatedFindingsProductArn.addAll(listOf(*relatedFindingsProductArn))
  }

  /**
   * @param relatedFindingsProductArn The ARN for the product that generated a related finding.
   */
  public fun relatedFindingsProductArn(relatedFindingsProductArn: Collection<Any>) {
    _relatedFindingsProductArn.addAll(relatedFindingsProductArn)
  }

  /**
   * @param relatedFindingsProductArn The ARN for the product that generated a related finding.
   */
  public fun relatedFindingsProductArn(relatedFindingsProductArn: IResolvable) {
    cdkBuilder.relatedFindingsProductArn(relatedFindingsProductArn)
  }

  /**
   * @param resourceDetailsOther Custom fields and values about the resource that a finding pertains
   * to.
   */
  public fun resourceDetailsOther(vararg resourceDetailsOther: Any) {
    _resourceDetailsOther.addAll(listOf(*resourceDetailsOther))
  }

  /**
   * @param resourceDetailsOther Custom fields and values about the resource that a finding pertains
   * to.
   */
  public fun resourceDetailsOther(resourceDetailsOther: Collection<Any>) {
    _resourceDetailsOther.addAll(resourceDetailsOther)
  }

  /**
   * @param resourceDetailsOther Custom fields and values about the resource that a finding pertains
   * to.
   */
  public fun resourceDetailsOther(resourceDetailsOther: IResolvable) {
    cdkBuilder.resourceDetailsOther(resourceDetailsOther)
  }

  /**
   * @param resourceId The identifier for the given resource type.
   * For AWS resources that are identified by Amazon Resource Names (ARNs), this is the ARN. For AWS
   * resources that lack ARNs, this is the identifier as defined by the AWS service that created the
   * resource. For non- AWS resources, this is a unique identifier that is associated with the
   * resource.
   */
  public fun resourceId(vararg resourceId: Any) {
    _resourceId.addAll(listOf(*resourceId))
  }

  /**
   * @param resourceId The identifier for the given resource type.
   * For AWS resources that are identified by Amazon Resource Names (ARNs), this is the ARN. For AWS
   * resources that lack ARNs, this is the identifier as defined by the AWS service that created the
   * resource. For non- AWS resources, this is a unique identifier that is associated with the
   * resource.
   */
  public fun resourceId(resourceId: Collection<Any>) {
    _resourceId.addAll(resourceId)
  }

  /**
   * @param resourceId The identifier for the given resource type.
   * For AWS resources that are identified by Amazon Resource Names (ARNs), this is the ARN. For AWS
   * resources that lack ARNs, this is the identifier as defined by the AWS service that created the
   * resource. For non- AWS resources, this is a unique identifier that is associated with the
   * resource.
   */
  public fun resourceId(resourceId: IResolvable) {
    cdkBuilder.resourceId(resourceId)
  }

  /**
   * @param resourcePartition The partition in which the resource that the finding pertains to is
   * located.
   * A partition is a group of AWS Regions . Each AWS account is scoped to one partition.
   */
  public fun resourcePartition(vararg resourcePartition: Any) {
    _resourcePartition.addAll(listOf(*resourcePartition))
  }

  /**
   * @param resourcePartition The partition in which the resource that the finding pertains to is
   * located.
   * A partition is a group of AWS Regions . Each AWS account is scoped to one partition.
   */
  public fun resourcePartition(resourcePartition: Collection<Any>) {
    _resourcePartition.addAll(resourcePartition)
  }

  /**
   * @param resourcePartition The partition in which the resource that the finding pertains to is
   * located.
   * A partition is a group of AWS Regions . Each AWS account is scoped to one partition.
   */
  public fun resourcePartition(resourcePartition: IResolvable) {
    cdkBuilder.resourcePartition(resourcePartition)
  }

  /**
   * @param resourceRegion The AWS Region where the resource that a finding pertains to is located.
   */
  public fun resourceRegion(vararg resourceRegion: Any) {
    _resourceRegion.addAll(listOf(*resourceRegion))
  }

  /**
   * @param resourceRegion The AWS Region where the resource that a finding pertains to is located.
   */
  public fun resourceRegion(resourceRegion: Collection<Any>) {
    _resourceRegion.addAll(resourceRegion)
  }

  /**
   * @param resourceRegion The AWS Region where the resource that a finding pertains to is located.
   */
  public fun resourceRegion(resourceRegion: IResolvable) {
    cdkBuilder.resourceRegion(resourceRegion)
  }

  /**
   * @param resourceTags A list of AWS tags associated with a resource at the time the finding was
   * processed.
   */
  public fun resourceTags(vararg resourceTags: Any) {
    _resourceTags.addAll(listOf(*resourceTags))
  }

  /**
   * @param resourceTags A list of AWS tags associated with a resource at the time the finding was
   * processed.
   */
  public fun resourceTags(resourceTags: Collection<Any>) {
    _resourceTags.addAll(resourceTags)
  }

  /**
   * @param resourceTags A list of AWS tags associated with a resource at the time the finding was
   * processed.
   */
  public fun resourceTags(resourceTags: IResolvable) {
    cdkBuilder.resourceTags(resourceTags)
  }

  /**
   * @param resourceType A finding's title.
   */
  public fun resourceType(vararg resourceType: Any) {
    _resourceType.addAll(listOf(*resourceType))
  }

  /**
   * @param resourceType A finding's title.
   */
  public fun resourceType(resourceType: Collection<Any>) {
    _resourceType.addAll(resourceType)
  }

  /**
   * @param resourceType A finding's title.
   */
  public fun resourceType(resourceType: IResolvable) {
    cdkBuilder.resourceType(resourceType)
  }

  /**
   * @param severityLabel The severity value of the finding.
   */
  public fun severityLabel(vararg severityLabel: Any) {
    _severityLabel.addAll(listOf(*severityLabel))
  }

  /**
   * @param severityLabel The severity value of the finding.
   */
  public fun severityLabel(severityLabel: Collection<Any>) {
    _severityLabel.addAll(severityLabel)
  }

  /**
   * @param severityLabel The severity value of the finding.
   */
  public fun severityLabel(severityLabel: IResolvable) {
    cdkBuilder.severityLabel(severityLabel)
  }

  /**
   * @param sourceUrl Provides a URL that links to a page about the current finding in the finding
   * product.
   */
  public fun sourceUrl(vararg sourceUrl: Any) {
    _sourceUrl.addAll(listOf(*sourceUrl))
  }

  /**
   * @param sourceUrl Provides a URL that links to a page about the current finding in the finding
   * product.
   */
  public fun sourceUrl(sourceUrl: Collection<Any>) {
    _sourceUrl.addAll(sourceUrl)
  }

  /**
   * @param sourceUrl Provides a URL that links to a page about the current finding in the finding
   * product.
   */
  public fun sourceUrl(sourceUrl: IResolvable) {
    cdkBuilder.sourceUrl(sourceUrl)
  }

  /**
   * @param title A finding's title.
   */
  public fun title(vararg title: Any) {
    _title.addAll(listOf(*title))
  }

  /**
   * @param title A finding's title.
   */
  public fun title(title: Collection<Any>) {
    _title.addAll(title)
  }

  /**
   * @param title A finding's title.
   */
  public fun title(title: IResolvable) {
    cdkBuilder.title(title)
  }

  /**
   * @param type One or more finding types in the format of namespace/category/classifier that
   * classify a finding.
   * For a list of namespaces, classifiers, and categories, see [Types taxonomy for
   * ASFF](https://docs.aws.amazon.com/securityhub/latest/userguide/securityhub-findings-format-type-taxonomy.html)
   * in the *AWS Security Hub User Guide* .
   */
  public fun type(vararg type: Any) {
    _type.addAll(listOf(*type))
  }

  /**
   * @param type One or more finding types in the format of namespace/category/classifier that
   * classify a finding.
   * For a list of namespaces, classifiers, and categories, see [Types taxonomy for
   * ASFF](https://docs.aws.amazon.com/securityhub/latest/userguide/securityhub-findings-format-type-taxonomy.html)
   * in the *AWS Security Hub User Guide* .
   */
  public fun type(type: Collection<Any>) {
    _type.addAll(type)
  }

  /**
   * @param type One or more finding types in the format of namespace/category/classifier that
   * classify a finding.
   * For a list of namespaces, classifiers, and categories, see [Types taxonomy for
   * ASFF](https://docs.aws.amazon.com/securityhub/latest/userguide/securityhub-findings-format-type-taxonomy.html)
   * in the *AWS Security Hub User Guide* .
   */
  public fun type(type: IResolvable) {
    cdkBuilder.type(type)
  }

  /**
   * @param updatedAt A timestamp that indicates when the finding record was most recently updated.
   * Uses the `date-time` format specified in [RFC 3339 section 5.6, Internet Date/Time
   * Format](https://docs.aws.amazon.com/https://tools.ietf.org/html/rfc3339#section-5.6) . The value
   * cannot contain spaces. For example, `2020-03-22T13:22:13.933Z` .
   */
  public fun updatedAt(vararg updatedAt: Any) {
    _updatedAt.addAll(listOf(*updatedAt))
  }

  /**
   * @param updatedAt A timestamp that indicates when the finding record was most recently updated.
   * Uses the `date-time` format specified in [RFC 3339 section 5.6, Internet Date/Time
   * Format](https://docs.aws.amazon.com/https://tools.ietf.org/html/rfc3339#section-5.6) . The value
   * cannot contain spaces. For example, `2020-03-22T13:22:13.933Z` .
   */
  public fun updatedAt(updatedAt: Collection<Any>) {
    _updatedAt.addAll(updatedAt)
  }

  /**
   * @param updatedAt A timestamp that indicates when the finding record was most recently updated.
   * Uses the `date-time` format specified in [RFC 3339 section 5.6, Internet Date/Time
   * Format](https://docs.aws.amazon.com/https://tools.ietf.org/html/rfc3339#section-5.6) . The value
   * cannot contain spaces. For example, `2020-03-22T13:22:13.933Z` .
   */
  public fun updatedAt(updatedAt: IResolvable) {
    cdkBuilder.updatedAt(updatedAt)
  }

  /**
   * @param userDefinedFields A list of user-defined name and value string pairs added to a finding.
   */
  public fun userDefinedFields(vararg userDefinedFields: Any) {
    _userDefinedFields.addAll(listOf(*userDefinedFields))
  }

  /**
   * @param userDefinedFields A list of user-defined name and value string pairs added to a finding.
   */
  public fun userDefinedFields(userDefinedFields: Collection<Any>) {
    _userDefinedFields.addAll(userDefinedFields)
  }

  /**
   * @param userDefinedFields A list of user-defined name and value string pairs added to a finding.
   */
  public fun userDefinedFields(userDefinedFields: IResolvable) {
    cdkBuilder.userDefinedFields(userDefinedFields)
  }

  /**
   * @param verificationState Provides the veracity of a finding.
   */
  public fun verificationState(vararg verificationState: Any) {
    _verificationState.addAll(listOf(*verificationState))
  }

  /**
   * @param verificationState Provides the veracity of a finding.
   */
  public fun verificationState(verificationState: Collection<Any>) {
    _verificationState.addAll(verificationState)
  }

  /**
   * @param verificationState Provides the veracity of a finding.
   */
  public fun verificationState(verificationState: IResolvable) {
    cdkBuilder.verificationState(verificationState)
  }

  /**
   * @param workflowStatus Provides information about the status of the investigation into a
   * finding.
   */
  public fun workflowStatus(vararg workflowStatus: Any) {
    _workflowStatus.addAll(listOf(*workflowStatus))
  }

  /**
   * @param workflowStatus Provides information about the status of the investigation into a
   * finding.
   */
  public fun workflowStatus(workflowStatus: Collection<Any>) {
    _workflowStatus.addAll(workflowStatus)
  }

  /**
   * @param workflowStatus Provides information about the status of the investigation into a
   * finding.
   */
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
