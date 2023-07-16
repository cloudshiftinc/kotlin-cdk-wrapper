@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.inspector

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.Number
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.inspector.CfnAssessmentTemplateProps

@CdkDslMarker
public class CfnAssessmentTemplatePropsDsl {
  private val cdkBuilder: CfnAssessmentTemplateProps.Builder = CfnAssessmentTemplateProps.builder()

  private val _rulesPackageArns: MutableList<String> = mutableListOf()

  private val _userAttributesForFindings: MutableList<Any> = mutableListOf()

  public fun assessmentTargetArn(assessmentTargetArn: String) {
    cdkBuilder.assessmentTargetArn(assessmentTargetArn)
  }

  public fun assessmentTemplateName(assessmentTemplateName: String) {
    cdkBuilder.assessmentTemplateName(assessmentTemplateName)
  }

  public fun durationInSeconds(durationInSeconds: Number) {
    cdkBuilder.durationInSeconds(durationInSeconds)
  }

  public fun rulesPackageArns(vararg rulesPackageArns: String) {
    _rulesPackageArns.addAll(listOf(*rulesPackageArns))
  }

  public fun rulesPackageArns(rulesPackageArns: Collection<String>) {
    _rulesPackageArns.addAll(rulesPackageArns)
  }

  public fun userAttributesForFindings(vararg userAttributesForFindings: Any) {
    _userAttributesForFindings.addAll(listOf(*userAttributesForFindings))
  }

  public fun userAttributesForFindings(userAttributesForFindings: Collection<Any>) {
    _userAttributesForFindings.addAll(userAttributesForFindings)
  }

  public fun userAttributesForFindings(userAttributesForFindings: IResolvable) {
    cdkBuilder.userAttributesForFindings(userAttributesForFindings)
  }

  public fun build(): CfnAssessmentTemplateProps {
    if(_rulesPackageArns.isNotEmpty()) cdkBuilder.rulesPackageArns(_rulesPackageArns)
    if(_userAttributesForFindings.isNotEmpty())
        cdkBuilder.userAttributesForFindings(_userAttributesForFindings)
    return cdkBuilder.build()
  }
}
