@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.auditmanager

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

/**
 * Properties for defining a `CfnAssessment`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.auditmanager.*;
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
public interface CfnAssessmentProps {
  /**
   * The destination that evidence reports are stored in for the assessment.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-auditmanager-assessment.html#cfn-auditmanager-assessment-assessmentreportsdestination)
   */
  public fun assessmentReportsDestination(): Any? = unwrap(this).getAssessmentReportsDestination()

  /**
   * The AWS account that's associated with the assessment.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-auditmanager-assessment.html#cfn-auditmanager-assessment-awsaccount)
   */
  public fun awsAccount(): Any? = unwrap(this).getAwsAccount()

  /**
   * The delegations that are associated with the assessment.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-auditmanager-assessment.html#cfn-auditmanager-assessment-delegations)
   */
  public fun delegations(): Any? = unwrap(this).getDelegations()

  /**
   * The description of the assessment.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-auditmanager-assessment.html#cfn-auditmanager-assessment-description)
   */
  public fun description(): String? = unwrap(this).getDescription()

  /**
   * The unique identifier for the framework.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-auditmanager-assessment.html#cfn-auditmanager-assessment-frameworkid)
   */
  public fun frameworkId(): String? = unwrap(this).getFrameworkId()

  /**
   * The name of the assessment.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-auditmanager-assessment.html#cfn-auditmanager-assessment-name)
   */
  public fun name(): String? = unwrap(this).getName()

  /**
   * The roles that are associated with the assessment.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-auditmanager-assessment.html#cfn-auditmanager-assessment-roles)
   */
  public fun roles(): Any? = unwrap(this).getRoles()

  /**
   * The wrapper of AWS accounts and services that are in scope for the assessment.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-auditmanager-assessment.html#cfn-auditmanager-assessment-scope)
   */
  public fun scope(): Any? = unwrap(this).getScope()

  /**
   * The overall status of the assessment.
   *
   * When you create a new assessment, the initial `Status` value is always `ACTIVE` . When you
   * create an assessment, even if you specify the value as `INACTIVE` , the value overrides to
   * `ACTIVE` .
   *
   * After you create an assessment, you can change the value of the `Status` property at any time.
   * For example, when you want to stop collecting evidence for your assessment, you can change the
   * assessment status to `INACTIVE` .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-auditmanager-assessment.html#cfn-auditmanager-assessment-status)
   */
  public fun status(): String? = unwrap(this).getStatus()

  /**
   * The tags that are associated with the assessment.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-auditmanager-assessment.html#cfn-auditmanager-assessment-tags)
   */
  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * A builder for [CfnAssessmentProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param assessmentReportsDestination The destination that evidence reports are stored in for
     * the assessment.
     */
    public fun assessmentReportsDestination(assessmentReportsDestination: IResolvable)

    /**
     * @param assessmentReportsDestination The destination that evidence reports are stored in for
     * the assessment.
     */
    public
        fun assessmentReportsDestination(assessmentReportsDestination: CfnAssessment.AssessmentReportsDestinationProperty)

    /**
     * @param assessmentReportsDestination The destination that evidence reports are stored in for
     * the assessment.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("d45a92590fac480b84e0922f895a54e01613930d1ef6cc7b2fff795eccf9645d")
    public
        fun assessmentReportsDestination(assessmentReportsDestination: CfnAssessment.AssessmentReportsDestinationProperty.Builder.() -> Unit)

    /**
     * @param awsAccount The AWS account that's associated with the assessment.
     */
    public fun awsAccount(awsAccount: IResolvable)

    /**
     * @param awsAccount The AWS account that's associated with the assessment.
     */
    public fun awsAccount(awsAccount: CfnAssessment.AWSAccountProperty)

    /**
     * @param awsAccount The AWS account that's associated with the assessment.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("a7699628e029d4cb8fa1aec29bfe2fac9952da8caacddbb70958ad6c911c51b8")
    public fun awsAccount(awsAccount: CfnAssessment.AWSAccountProperty.Builder.() -> Unit)

    /**
     * @param delegations The delegations that are associated with the assessment.
     */
    public fun delegations(delegations: IResolvable)

    /**
     * @param delegations The delegations that are associated with the assessment.
     */
    public fun delegations(delegations: List<Any>)

    /**
     * @param delegations The delegations that are associated with the assessment.
     */
    public fun delegations(vararg delegations: Any)

    /**
     * @param description The description of the assessment.
     */
    public fun description(description: String)

    /**
     * @param frameworkId The unique identifier for the framework.
     */
    public fun frameworkId(frameworkId: String)

    /**
     * @param name The name of the assessment.
     */
    public fun name(name: String)

    /**
     * @param roles The roles that are associated with the assessment.
     */
    public fun roles(roles: IResolvable)

    /**
     * @param roles The roles that are associated with the assessment.
     */
    public fun roles(roles: List<Any>)

    /**
     * @param roles The roles that are associated with the assessment.
     */
    public fun roles(vararg roles: Any)

    /**
     * @param scope The wrapper of AWS accounts and services that are in scope for the assessment.
     */
    public fun scope(scope: IResolvable)

    /**
     * @param scope The wrapper of AWS accounts and services that are in scope for the assessment.
     */
    public fun scope(scope: CfnAssessment.ScopeProperty)

    /**
     * @param scope The wrapper of AWS accounts and services that are in scope for the assessment.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("33852bce087844d5a53885fcf9e30ac29943c684be5506ee4b355ef1a572015a")
    public fun scope(scope: CfnAssessment.ScopeProperty.Builder.() -> Unit)

    /**
     * @param status The overall status of the assessment.
     * When you create a new assessment, the initial `Status` value is always `ACTIVE` . When you
     * create an assessment, even if you specify the value as `INACTIVE` , the value overrides to
     * `ACTIVE` .
     *
     * After you create an assessment, you can change the value of the `Status` property at any
     * time. For example, when you want to stop collecting evidence for your assessment, you can change
     * the assessment status to `INACTIVE` .
     */
    public fun status(status: String)

    /**
     * @param tags The tags that are associated with the assessment.
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * @param tags The tags that are associated with the assessment.
     */
    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.auditmanager.CfnAssessmentProps.Builder
        = software.amazon.awscdk.services.auditmanager.CfnAssessmentProps.builder()

    /**
     * @param assessmentReportsDestination The destination that evidence reports are stored in for
     * the assessment.
     */
    override fun assessmentReportsDestination(assessmentReportsDestination: IResolvable) {
      cdkBuilder.assessmentReportsDestination(assessmentReportsDestination.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param assessmentReportsDestination The destination that evidence reports are stored in for
     * the assessment.
     */
    override
        fun assessmentReportsDestination(assessmentReportsDestination: CfnAssessment.AssessmentReportsDestinationProperty) {
      cdkBuilder.assessmentReportsDestination(assessmentReportsDestination.let(CfnAssessment.AssessmentReportsDestinationProperty.Companion::unwrap))
    }

    /**
     * @param assessmentReportsDestination The destination that evidence reports are stored in for
     * the assessment.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("d45a92590fac480b84e0922f895a54e01613930d1ef6cc7b2fff795eccf9645d")
    override
        fun assessmentReportsDestination(assessmentReportsDestination: CfnAssessment.AssessmentReportsDestinationProperty.Builder.() -> Unit):
        Unit =
        assessmentReportsDestination(CfnAssessment.AssessmentReportsDestinationProperty(assessmentReportsDestination))

    /**
     * @param awsAccount The AWS account that's associated with the assessment.
     */
    override fun awsAccount(awsAccount: IResolvable) {
      cdkBuilder.awsAccount(awsAccount.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param awsAccount The AWS account that's associated with the assessment.
     */
    override fun awsAccount(awsAccount: CfnAssessment.AWSAccountProperty) {
      cdkBuilder.awsAccount(awsAccount.let(CfnAssessment.AWSAccountProperty.Companion::unwrap))
    }

    /**
     * @param awsAccount The AWS account that's associated with the assessment.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("a7699628e029d4cb8fa1aec29bfe2fac9952da8caacddbb70958ad6c911c51b8")
    override fun awsAccount(awsAccount: CfnAssessment.AWSAccountProperty.Builder.() -> Unit): Unit =
        awsAccount(CfnAssessment.AWSAccountProperty(awsAccount))

    /**
     * @param delegations The delegations that are associated with the assessment.
     */
    override fun delegations(delegations: IResolvable) {
      cdkBuilder.delegations(delegations.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param delegations The delegations that are associated with the assessment.
     */
    override fun delegations(delegations: List<Any>) {
      cdkBuilder.delegations(delegations.map{CdkObjectWrappers.unwrap(it)})
    }

    /**
     * @param delegations The delegations that are associated with the assessment.
     */
    override fun delegations(vararg delegations: Any): Unit = delegations(delegations.toList())

    /**
     * @param description The description of the assessment.
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * @param frameworkId The unique identifier for the framework.
     */
    override fun frameworkId(frameworkId: String) {
      cdkBuilder.frameworkId(frameworkId)
    }

    /**
     * @param name The name of the assessment.
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    /**
     * @param roles The roles that are associated with the assessment.
     */
    override fun roles(roles: IResolvable) {
      cdkBuilder.roles(roles.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param roles The roles that are associated with the assessment.
     */
    override fun roles(roles: List<Any>) {
      cdkBuilder.roles(roles.map{CdkObjectWrappers.unwrap(it)})
    }

    /**
     * @param roles The roles that are associated with the assessment.
     */
    override fun roles(vararg roles: Any): Unit = roles(roles.toList())

    /**
     * @param scope The wrapper of AWS accounts and services that are in scope for the assessment.
     */
    override fun scope(scope: IResolvable) {
      cdkBuilder.scope(scope.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param scope The wrapper of AWS accounts and services that are in scope for the assessment.
     */
    override fun scope(scope: CfnAssessment.ScopeProperty) {
      cdkBuilder.scope(scope.let(CfnAssessment.ScopeProperty.Companion::unwrap))
    }

    /**
     * @param scope The wrapper of AWS accounts and services that are in scope for the assessment.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("33852bce087844d5a53885fcf9e30ac29943c684be5506ee4b355ef1a572015a")
    override fun scope(scope: CfnAssessment.ScopeProperty.Builder.() -> Unit): Unit =
        scope(CfnAssessment.ScopeProperty(scope))

    /**
     * @param status The overall status of the assessment.
     * When you create a new assessment, the initial `Status` value is always `ACTIVE` . When you
     * create an assessment, even if you specify the value as `INACTIVE` , the value overrides to
     * `ACTIVE` .
     *
     * After you create an assessment, you can change the value of the `Status` property at any
     * time. For example, when you want to stop collecting evidence for your assessment, you can change
     * the assessment status to `INACTIVE` .
     */
    override fun status(status: String) {
      cdkBuilder.status(status)
    }

    /**
     * @param tags The tags that are associated with the assessment.
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag.Companion::unwrap))
    }

    /**
     * @param tags The tags that are associated with the assessment.
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.auditmanager.CfnAssessmentProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.auditmanager.CfnAssessmentProps,
  ) : CdkObject(cdkObject), CfnAssessmentProps {
    /**
     * The destination that evidence reports are stored in for the assessment.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-auditmanager-assessment.html#cfn-auditmanager-assessment-assessmentreportsdestination)
     */
    override fun assessmentReportsDestination(): Any? =
        unwrap(this).getAssessmentReportsDestination()

    /**
     * The AWS account that's associated with the assessment.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-auditmanager-assessment.html#cfn-auditmanager-assessment-awsaccount)
     */
    override fun awsAccount(): Any? = unwrap(this).getAwsAccount()

    /**
     * The delegations that are associated with the assessment.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-auditmanager-assessment.html#cfn-auditmanager-assessment-delegations)
     */
    override fun delegations(): Any? = unwrap(this).getDelegations()

    /**
     * The description of the assessment.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-auditmanager-assessment.html#cfn-auditmanager-assessment-description)
     */
    override fun description(): String? = unwrap(this).getDescription()

    /**
     * The unique identifier for the framework.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-auditmanager-assessment.html#cfn-auditmanager-assessment-frameworkid)
     */
    override fun frameworkId(): String? = unwrap(this).getFrameworkId()

    /**
     * The name of the assessment.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-auditmanager-assessment.html#cfn-auditmanager-assessment-name)
     */
    override fun name(): String? = unwrap(this).getName()

    /**
     * The roles that are associated with the assessment.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-auditmanager-assessment.html#cfn-auditmanager-assessment-roles)
     */
    override fun roles(): Any? = unwrap(this).getRoles()

    /**
     * The wrapper of AWS accounts and services that are in scope for the assessment.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-auditmanager-assessment.html#cfn-auditmanager-assessment-scope)
     */
    override fun scope(): Any? = unwrap(this).getScope()

    /**
     * The overall status of the assessment.
     *
     * When you create a new assessment, the initial `Status` value is always `ACTIVE` . When you
     * create an assessment, even if you specify the value as `INACTIVE` , the value overrides to
     * `ACTIVE` .
     *
     * After you create an assessment, you can change the value of the `Status` property at any
     * time. For example, when you want to stop collecting evidence for your assessment, you can change
     * the assessment status to `INACTIVE` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-auditmanager-assessment.html#cfn-auditmanager-assessment-status)
     */
    override fun status(): String? = unwrap(this).getStatus()

    /**
     * The tags that are associated with the assessment.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-auditmanager-assessment.html#cfn-auditmanager-assessment-tags)
     */
    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnAssessmentProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.auditmanager.CfnAssessmentProps):
        CfnAssessmentProps = CdkObjectWrappers.wrap(cdkObject) as? CfnAssessmentProps ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnAssessmentProps):
        software.amazon.awscdk.services.auditmanager.CfnAssessmentProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.auditmanager.CfnAssessmentProps
  }
}
