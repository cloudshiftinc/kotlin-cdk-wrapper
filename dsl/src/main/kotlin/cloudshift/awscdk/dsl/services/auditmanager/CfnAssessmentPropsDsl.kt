@file:Suppress(
    "RedundantVisibilityModifier",
    "RedundantUnitReturnType",
    "RemoveRedundantQualifierName",
    "unused",
    "UnusedImport",
    "ClassName",
    "REDUNDANT_PROJECTION",
    "DEPRECATION"
)

package cloudshift.awscdk.dsl.services.auditmanager

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.dsl.CfnTagDsl
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.auditmanager.CfnAssessment
import software.amazon.awscdk.services.auditmanager.CfnAssessmentProps

/**
 * Properties for defining a `CfnAssessment`.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.auditmanager.*;
 * CfnAssessmentProps cfnAssessmentProps = CfnAssessmentProps.builder()
 * .assessmentReportsDestination(AssessmentReportsDestinationProperty.builder()
 * .destination("destination")
 * .destinationType("destinationType")
 * .build())
 * .awsAccount(AWSAccountProperty.builder()
 * .emailAddress("emailAddress")
 * .id("id")
 * .name("name")
 * .build())
 * .delegations(List.of(DelegationProperty.builder()
 * .assessmentId("assessmentId")
 * .assessmentName("assessmentName")
 * .comment("comment")
 * .controlSetId("controlSetId")
 * .createdBy("createdBy")
 * .creationTime(123)
 * .id("id")
 * .lastUpdated(123)
 * .roleArn("roleArn")
 * .roleType("roleType")
 * .status("status")
 * .build()))
 * .description("description")
 * .frameworkId("frameworkId")
 * .name("name")
 * .roles(List.of(RoleProperty.builder()
 * .roleArn("roleArn")
 * .roleType("roleType")
 * .build()))
 * .scope(ScopeProperty.builder()
 * .awsAccounts(List.of(AWSAccountProperty.builder()
 * .emailAddress("emailAddress")
 * .id("id")
 * .name("name")
 * .build()))
 * .awsServices(List.of(AWSServiceProperty.builder()
 * .serviceName("serviceName")
 * .build()))
 * .build())
 * .status("status")
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-auditmanager-assessment.html)
 */
@CdkDslMarker
public class CfnAssessmentPropsDsl {
    private val cdkBuilder: CfnAssessmentProps.Builder = CfnAssessmentProps.builder()

    private val _delegations: MutableList<Any> = mutableListOf()

    private val _roles: MutableList<Any> = mutableListOf()

    private val _tags: MutableList<CfnTag> = mutableListOf()

    /**
     * @param assessmentReportsDestination The destination that evidence reports are stored in for
     *   the assessment.
     */
    public fun assessmentReportsDestination(assessmentReportsDestination: IResolvable) {
        cdkBuilder.assessmentReportsDestination(assessmentReportsDestination)
    }

    /**
     * @param assessmentReportsDestination The destination that evidence reports are stored in for
     *   the assessment.
     */
    public fun assessmentReportsDestination(
        assessmentReportsDestination: CfnAssessment.AssessmentReportsDestinationProperty
    ) {
        cdkBuilder.assessmentReportsDestination(assessmentReportsDestination)
    }

    /** @param awsAccount The AWS account that's associated with the assessment. */
    public fun awsAccount(awsAccount: IResolvable) {
        cdkBuilder.awsAccount(awsAccount)
    }

    /** @param awsAccount The AWS account that's associated with the assessment. */
    public fun awsAccount(awsAccount: CfnAssessment.AWSAccountProperty) {
        cdkBuilder.awsAccount(awsAccount)
    }

    /** @param delegations The delegations that are associated with the assessment. */
    public fun delegations(vararg delegations: Any) {
        _delegations.addAll(listOf(*delegations))
    }

    /** @param delegations The delegations that are associated with the assessment. */
    public fun delegations(delegations: Collection<Any>) {
        _delegations.addAll(delegations)
    }

    /** @param delegations The delegations that are associated with the assessment. */
    public fun delegations(delegations: IResolvable) {
        cdkBuilder.delegations(delegations)
    }

    /** @param description The description of the assessment. */
    public fun description(description: String) {
        cdkBuilder.description(description)
    }

    /** @param frameworkId The unique identifier for the framework. */
    public fun frameworkId(frameworkId: String) {
        cdkBuilder.frameworkId(frameworkId)
    }

    /** @param name The name of the assessment. */
    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    /** @param roles The roles that are associated with the assessment. */
    public fun roles(vararg roles: Any) {
        _roles.addAll(listOf(*roles))
    }

    /** @param roles The roles that are associated with the assessment. */
    public fun roles(roles: Collection<Any>) {
        _roles.addAll(roles)
    }

    /** @param roles The roles that are associated with the assessment. */
    public fun roles(roles: IResolvable) {
        cdkBuilder.roles(roles)
    }

    /**
     * @param scope The wrapper of AWS accounts and services that are in scope for the assessment.
     */
    public fun scope(scope: IResolvable) {
        cdkBuilder.scope(scope)
    }

    /**
     * @param scope The wrapper of AWS accounts and services that are in scope for the assessment.
     */
    public fun scope(scope: CfnAssessment.ScopeProperty) {
        cdkBuilder.scope(scope)
    }

    /**
     * @param status The overall status of the assessment. When you create a new assessment, the
     *   initial `Status` value is always `ACTIVE` . When you create an assessment, even if you
     *   specify the value as `INACTIVE` , the value overrides to `ACTIVE` .
     *
     * After you create an assessment, you can change the value of the `Status` property at any
     * time. For example, when you want to stop collecting evidence for your assessment, you can
     * change the assessment status to `INACTIVE` .
     */
    public fun status(status: String) {
        cdkBuilder.status(status)
    }

    /** @param tags The tags that are associated with the assessment. */
    public fun tags(tags: CfnTagDsl.() -> Unit) {
        _tags.add(CfnTagDsl().apply(tags).build())
    }

    /** @param tags The tags that are associated with the assessment. */
    public fun tags(tags: Collection<CfnTag>) {
        _tags.addAll(tags)
    }

    public fun build(): CfnAssessmentProps {
        if (_delegations.isNotEmpty()) cdkBuilder.delegations(_delegations)
        if (_roles.isNotEmpty()) cdkBuilder.roles(_roles)
        if (_tags.isNotEmpty()) cdkBuilder.tags(_tags)
        return cdkBuilder.build()
    }
}
