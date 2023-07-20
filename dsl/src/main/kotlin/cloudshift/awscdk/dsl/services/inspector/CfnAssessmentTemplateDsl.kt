@file:Suppress(
    "RedundantVisibilityModifier",
    "RedundantUnitReturnType",
    "RemoveRedundantQualifierName",
    "unused",
    "UnusedImport",
    "ClassName",
    "REDUNDANT_PROJECTION",
    "DEPRECATION",
)

package cloudshift.awscdk.dsl.services.inspector

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.inspector.CfnAssessmentTemplate
import software.constructs.Construct
import kotlin.Any
import kotlin.Number
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList

@CdkDslMarker
public class CfnAssessmentTemplateDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnAssessmentTemplate.Builder =
        CfnAssessmentTemplate.Builder.create(scope, id)

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

    public fun build(): CfnAssessmentTemplate {
        if (_rulesPackageArns.isNotEmpty()) cdkBuilder.rulesPackageArns(_rulesPackageArns)
        if (_userAttributesForFindings.isNotEmpty()) {
            cdkBuilder.userAttributesForFindings(_userAttributesForFindings)
        }
        return cdkBuilder.build()
    }
}
