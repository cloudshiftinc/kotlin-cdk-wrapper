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

import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.auditmanager.CfnAssessment
import software.amazon.awscdk.services.auditmanager.CfnAssessmentProps
import software.constructs.Construct

public object auditmanager {
    /**
     * The `AWS::AuditManager::Assessment` resource is an Audit Manager resource type that defines
     * the scope of audit evidence collected by Audit Manager .
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
    public inline fun cfnAssessment(
        scope: Construct,
        id: String,
        block: CfnAssessmentDsl.() -> Unit = {},
    ): CfnAssessment {
        val builder = CfnAssessmentDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * The `AWSAccount` property type specifies the wrapper of the AWS account details, such as
     * account ID, email address, and so on.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.auditmanager.*;
     * AWSAccountProperty aWSAccountProperty = AWSAccountProperty.builder()
     * .emailAddress("emailAddress")
     * .id("id")
     * .name("name")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-auditmanager-assessment-awsaccount.html)
     */
    public inline fun cfnAssessmentAWSAccountProperty(
        block: CfnAssessmentAWSAccountPropertyDsl.() -> Unit = {}
    ): CfnAssessment.AWSAccountProperty {
        val builder = CfnAssessmentAWSAccountPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The `AWSService` property type specifies an AWS service such as Amazon S3 , AWS CloudTrail ,
     * and so on.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.auditmanager.*;
     * AWSServiceProperty aWSServiceProperty = AWSServiceProperty.builder()
     * .serviceName("serviceName")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-auditmanager-assessment-awsservice.html)
     */
    public inline fun cfnAssessmentAWSServiceProperty(
        block: CfnAssessmentAWSServicePropertyDsl.() -> Unit = {}
    ): CfnAssessment.AWSServiceProperty {
        val builder = CfnAssessmentAWSServicePropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The `AssessmentReportsDestination` property type specifies the location in which AWS Audit
     * Manager saves assessment reports for the given assessment.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.auditmanager.*;
     * AssessmentReportsDestinationProperty assessmentReportsDestinationProperty =
     * AssessmentReportsDestinationProperty.builder()
     * .destination("destination")
     * .destinationType("destinationType")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-auditmanager-assessment-assessmentreportsdestination.html)
     */
    public inline fun cfnAssessmentAssessmentReportsDestinationProperty(
        block: CfnAssessmentAssessmentReportsDestinationPropertyDsl.() -> Unit = {}
    ): CfnAssessment.AssessmentReportsDestinationProperty {
        val builder = CfnAssessmentAssessmentReportsDestinationPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The `Delegation` property type specifies the assignment of a control set to a delegate for
     * review.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.auditmanager.*;
     * DelegationProperty delegationProperty = DelegationProperty.builder()
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
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-auditmanager-assessment-delegation.html)
     */
    public inline fun cfnAssessmentDelegationProperty(
        block: CfnAssessmentDelegationPropertyDsl.() -> Unit = {}
    ): CfnAssessment.DelegationProperty {
        val builder = CfnAssessmentDelegationPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

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
    public inline fun cfnAssessmentProps(
        block: CfnAssessmentPropsDsl.() -> Unit = {}
    ): CfnAssessmentProps {
        val builder = CfnAssessmentPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The `Role` property type specifies the wrapper that contains AWS Audit Manager role
     * information, such as the role type and IAM Amazon Resource Name (ARN).
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.auditmanager.*;
     * RoleProperty roleProperty = RoleProperty.builder()
     * .roleArn("roleArn")
     * .roleType("roleType")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-auditmanager-assessment-role.html)
     */
    public inline fun cfnAssessmentRoleProperty(
        block: CfnAssessmentRolePropertyDsl.() -> Unit = {}
    ): CfnAssessment.RoleProperty {
        val builder = CfnAssessmentRolePropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The `Scope` property type specifies the wrapper that contains the AWS accounts and services
     * that are in scope for the assessment.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.auditmanager.*;
     * ScopeProperty scopeProperty = ScopeProperty.builder()
     * .awsAccounts(List.of(AWSAccountProperty.builder()
     * .emailAddress("emailAddress")
     * .id("id")
     * .name("name")
     * .build()))
     * .awsServices(List.of(AWSServiceProperty.builder()
     * .serviceName("serviceName")
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-auditmanager-assessment-scope.html)
     */
    public inline fun cfnAssessmentScopeProperty(
        block: CfnAssessmentScopePropertyDsl.() -> Unit = {}
    ): CfnAssessment.ScopeProperty {
        val builder = CfnAssessmentScopePropertyDsl()
        builder.apply(block)
        return builder.build()
    }
}
