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

package io.cloudshiftdev.awscdkdsl.services.auditmanager

import io.cloudshiftdev.awscdkdsl.CfnTagDsl
import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.auditmanager.CfnAssessment
import software.constructs.Construct

/**
 * The `AWS::AuditManager::Assessment` resource is an Audit Manager resource type that defines the
 * scope of audit evidence collected by Audit Manager .
 *
 * An Audit Manager assessment is an implementation of an Audit Manager framework.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.auditmanager.*;
 * CfnAssessment cfnAssessment = CfnAssessment.Builder.create(this, "MyCfnAssessment")
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
public class CfnAssessmentDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnAssessment.Builder = CfnAssessment.Builder.create(scope, id)

    private val _delegations: MutableList<Any> = mutableListOf()

    private val _roles: MutableList<Any> = mutableListOf()

    private val _tags: MutableList<CfnTag> = mutableListOf()

    /**
     * The destination that evidence reports are stored in for the assessment.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-auditmanager-assessment.html#cfn-auditmanager-assessment-assessmentreportsdestination)
     *
     * @param assessmentReportsDestination The destination that evidence reports are stored in for
     *   the assessment.
     */
    public fun assessmentReportsDestination(assessmentReportsDestination: IResolvable) {
        cdkBuilder.assessmentReportsDestination(assessmentReportsDestination)
    }

    /**
     * The destination that evidence reports are stored in for the assessment.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-auditmanager-assessment.html#cfn-auditmanager-assessment-assessmentreportsdestination)
     *
     * @param assessmentReportsDestination The destination that evidence reports are stored in for
     *   the assessment.
     */
    public fun assessmentReportsDestination(
        assessmentReportsDestination: CfnAssessment.AssessmentReportsDestinationProperty
    ) {
        cdkBuilder.assessmentReportsDestination(assessmentReportsDestination)
    }

    /**
     * The AWS account that's associated with the assessment.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-auditmanager-assessment.html#cfn-auditmanager-assessment-awsaccount)
     *
     * @param awsAccount The AWS account that's associated with the assessment.
     */
    public fun awsAccount(awsAccount: IResolvable) {
        cdkBuilder.awsAccount(awsAccount)
    }

    /**
     * The AWS account that's associated with the assessment.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-auditmanager-assessment.html#cfn-auditmanager-assessment-awsaccount)
     *
     * @param awsAccount The AWS account that's associated with the assessment.
     */
    public fun awsAccount(awsAccount: CfnAssessment.AWSAccountProperty) {
        cdkBuilder.awsAccount(awsAccount)
    }

    /**
     * The delegations that are associated with the assessment.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-auditmanager-assessment.html#cfn-auditmanager-assessment-delegations)
     *
     * @param delegations The delegations that are associated with the assessment.
     */
    public fun delegations(vararg delegations: Any) {
        _delegations.addAll(listOf(*delegations))
    }

    /**
     * The delegations that are associated with the assessment.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-auditmanager-assessment.html#cfn-auditmanager-assessment-delegations)
     *
     * @param delegations The delegations that are associated with the assessment.
     */
    public fun delegations(delegations: Collection<Any>) {
        _delegations.addAll(delegations)
    }

    /**
     * The delegations that are associated with the assessment.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-auditmanager-assessment.html#cfn-auditmanager-assessment-delegations)
     *
     * @param delegations The delegations that are associated with the assessment.
     */
    public fun delegations(delegations: IResolvable) {
        cdkBuilder.delegations(delegations)
    }

    /**
     * The description of the assessment.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-auditmanager-assessment.html#cfn-auditmanager-assessment-description)
     *
     * @param description The description of the assessment.
     */
    public fun description(description: String) {
        cdkBuilder.description(description)
    }

    /**
     * The unique identifier for the framework.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-auditmanager-assessment.html#cfn-auditmanager-assessment-frameworkid)
     *
     * @param frameworkId The unique identifier for the framework.
     */
    public fun frameworkId(frameworkId: String) {
        cdkBuilder.frameworkId(frameworkId)
    }

    /**
     * The name of the assessment.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-auditmanager-assessment.html#cfn-auditmanager-assessment-name)
     *
     * @param name The name of the assessment.
     */
    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    /**
     * The roles that are associated with the assessment.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-auditmanager-assessment.html#cfn-auditmanager-assessment-roles)
     *
     * @param roles The roles that are associated with the assessment.
     */
    public fun roles(vararg roles: Any) {
        _roles.addAll(listOf(*roles))
    }

    /**
     * The roles that are associated with the assessment.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-auditmanager-assessment.html#cfn-auditmanager-assessment-roles)
     *
     * @param roles The roles that are associated with the assessment.
     */
    public fun roles(roles: Collection<Any>) {
        _roles.addAll(roles)
    }

    /**
     * The roles that are associated with the assessment.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-auditmanager-assessment.html#cfn-auditmanager-assessment-roles)
     *
     * @param roles The roles that are associated with the assessment.
     */
    public fun roles(roles: IResolvable) {
        cdkBuilder.roles(roles)
    }

    /**
     * The wrapper of AWS accounts and services that are in scope for the assessment.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-auditmanager-assessment.html#cfn-auditmanager-assessment-scope)
     *
     * @param scope The wrapper of AWS accounts and services that are in scope for the assessment.
     */
    public fun scope(scope: IResolvable) {
        cdkBuilder.scope(scope)
    }

    /**
     * The wrapper of AWS accounts and services that are in scope for the assessment.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-auditmanager-assessment.html#cfn-auditmanager-assessment-scope)
     *
     * @param scope The wrapper of AWS accounts and services that are in scope for the assessment.
     */
    public fun scope(scope: CfnAssessment.ScopeProperty) {
        cdkBuilder.scope(scope)
    }

    /**
     * The overall status of the assessment.
     *
     * When you create a new assessment, the initial `Status` value is always `ACTIVE` . When you
     * create an assessment, even if you specify the value as `INACTIVE` , the value overrides to
     * `ACTIVE` .
     *
     * After you create an assessment, you can change the value of the `Status` property at any
     * time. For example, when you want to stop collecting evidence for your assessment, you can
     * change the assessment status to `INACTIVE` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-auditmanager-assessment.html#cfn-auditmanager-assessment-status)
     *
     * @param status The overall status of the assessment.
     */
    public fun status(status: String) {
        cdkBuilder.status(status)
    }

    /**
     * The tags that are associated with the assessment.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-auditmanager-assessment.html#cfn-auditmanager-assessment-tags)
     *
     * @param tags The tags that are associated with the assessment.
     */
    public fun tags(tags: CfnTagDsl.() -> Unit) {
        _tags.add(CfnTagDsl().apply(tags).build())
    }

    /**
     * The tags that are associated with the assessment.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-auditmanager-assessment.html#cfn-auditmanager-assessment-tags)
     *
     * @param tags The tags that are associated with the assessment.
     */
    public fun tags(tags: Collection<CfnTag>) {
        _tags.addAll(tags)
    }

    public fun build(): CfnAssessment {
        if (_delegations.isNotEmpty()) cdkBuilder.delegations(_delegations)
        if (_roles.isNotEmpty()) cdkBuilder.roles(_roles)
        if (_tags.isNotEmpty()) cdkBuilder.tags(_tags)
        return cdkBuilder.build()
    }
}
