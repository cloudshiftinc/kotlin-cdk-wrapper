@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.auditmanager

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.ITaggable
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * The `AWS::AuditManager::Assessment` resource is an Audit Manager resource type that defines the
 * scope of audit evidence collected by Audit Manager .
 *
 * An Audit Manager assessment is an implementation of an Audit Manager framework.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.auditmanager.*;
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
public open class CfnAssessment(
  cdkObject: software.amazon.awscdk.services.auditmanager.CfnAssessment,
) : CfnResource(cdkObject),
    IInspectable,
    ITaggable {
  public constructor(scope: CloudshiftdevConstructsConstruct, id: String) :
      this(software.amazon.awscdk.services.auditmanager.CfnAssessment(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id)
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnAssessmentProps,
  ) :
      this(software.amazon.awscdk.services.auditmanager.CfnAssessment(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id, props.let(CfnAssessmentProps.Companion::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnAssessmentProps.Builder.() -> Unit,
  ) : this(scope, id, CfnAssessmentProps(props)
  )

  /**
   * The destination that evidence reports are stored in for the assessment.
   */
  public open fun assessmentReportsDestination(): Any? =
      unwrap(this).getAssessmentReportsDestination()

  /**
   * The destination that evidence reports are stored in for the assessment.
   */
  public open fun assessmentReportsDestination(`value`: IResolvable) {
    unwrap(this).setAssessmentReportsDestination(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   * The destination that evidence reports are stored in for the assessment.
   */
  public open fun assessmentReportsDestination(`value`: AssessmentReportsDestinationProperty) {
    unwrap(this).setAssessmentReportsDestination(`value`.let(AssessmentReportsDestinationProperty.Companion::unwrap))
  }

  /**
   * The destination that evidence reports are stored in for the assessment.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("2787eccfcc4317d2da4bce1af29c28e964f176f12a7eee9c41b942f2ab78976e")
  public open
      fun assessmentReportsDestination(`value`: AssessmentReportsDestinationProperty.Builder.() -> Unit):
      Unit = assessmentReportsDestination(AssessmentReportsDestinationProperty(`value`))

  /**
   * The Amazon Resource Name (ARN) of the assessment.
   */
  public open fun attrArn(): String = unwrap(this).getAttrArn()

  /**
   * The unique identifier for the assessment.
   */
  public open fun attrAssessmentId(): String = unwrap(this).getAttrAssessmentId()

  /**
   * Specifies when the assessment was created.
   */
  public open fun attrCreationTime(): IResolvable =
      unwrap(this).getAttrCreationTime().let(IResolvable::wrap)

  /**
   * The AWS account that's associated with the assessment.
   */
  public open fun awsAccount(): Any? = unwrap(this).getAwsAccount()

  /**
   * The AWS account that's associated with the assessment.
   */
  public open fun awsAccount(`value`: IResolvable) {
    unwrap(this).setAwsAccount(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   * The AWS account that's associated with the assessment.
   */
  public open fun awsAccount(`value`: AWSAccountProperty) {
    unwrap(this).setAwsAccount(`value`.let(AWSAccountProperty.Companion::unwrap))
  }

  /**
   * The AWS account that's associated with the assessment.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("dfc0f6942aad9e32e254c317a5204fdbbbb760c5770988556472ab851f1f7614")
  public open fun awsAccount(`value`: AWSAccountProperty.Builder.() -> Unit): Unit =
      awsAccount(AWSAccountProperty(`value`))

  /**
   * The delegations that are associated with the assessment.
   */
  public open fun delegations(): Any? = unwrap(this).getDelegations()

  /**
   * The delegations that are associated with the assessment.
   */
  public open fun delegations(`value`: IResolvable) {
    unwrap(this).setDelegations(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   * The delegations that are associated with the assessment.
   */
  public open fun delegations(`value`: List<Any>) {
    unwrap(this).setDelegations(`value`.map{CdkObjectWrappers.unwrap(it)})
  }

  /**
   * The delegations that are associated with the assessment.
   */
  public open fun delegations(vararg `value`: Any): Unit = delegations(`value`.toList())

  /**
   * The description of the assessment.
   */
  public open fun description(): String? = unwrap(this).getDescription()

  /**
   * The description of the assessment.
   */
  public open fun description(`value`: String) {
    unwrap(this).setDescription(`value`)
  }

  /**
   * The unique identifier for the framework.
   */
  public open fun frameworkId(): String? = unwrap(this).getFrameworkId()

  /**
   * The unique identifier for the framework.
   */
  public open fun frameworkId(`value`: String) {
    unwrap(this).setFrameworkId(`value`)
  }

  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector.Companion::unwrap))
  }

  /**
   * The name of the assessment.
   */
  public open fun name(): String? = unwrap(this).getName()

  /**
   * The name of the assessment.
   */
  public open fun name(`value`: String) {
    unwrap(this).setName(`value`)
  }

  /**
   * The roles that are associated with the assessment.
   */
  public open fun roles(): Any? = unwrap(this).getRoles()

  /**
   * The roles that are associated with the assessment.
   */
  public open fun roles(`value`: IResolvable) {
    unwrap(this).setRoles(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   * The roles that are associated with the assessment.
   */
  public open fun roles(`value`: List<Any>) {
    unwrap(this).setRoles(`value`.map{CdkObjectWrappers.unwrap(it)})
  }

  /**
   * The roles that are associated with the assessment.
   */
  public open fun roles(vararg `value`: Any): Unit = roles(`value`.toList())

  /**
   * The wrapper of AWS accounts and services that are in scope for the assessment.
   */
  public open fun scope(): Any? = unwrap(this).getScope()

  /**
   * The wrapper of AWS accounts and services that are in scope for the assessment.
   */
  public open fun scope(`value`: IResolvable) {
    unwrap(this).setScope(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   * The wrapper of AWS accounts and services that are in scope for the assessment.
   */
  public open fun scope(`value`: ScopeProperty) {
    unwrap(this).setScope(`value`.let(ScopeProperty.Companion::unwrap))
  }

  /**
   * The wrapper of AWS accounts and services that are in scope for the assessment.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("927ed310f9222539748590577d39de037ad1ff1e8d04b788db09c97045459b17")
  public open fun scope(`value`: ScopeProperty.Builder.() -> Unit): Unit =
      scope(ScopeProperty(`value`))

  /**
   * The overall status of the assessment.
   */
  public open fun status(): String? = unwrap(this).getStatus()

  /**
   * The overall status of the assessment.
   */
  public open fun status(`value`: String) {
    unwrap(this).setStatus(`value`)
  }

  /**
   * Tag Manager which manages the tags for this resource.
   */
  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  /**
   * The tags that are associated with the assessment.
   */
  public open fun tagsRaw(): List<CfnTag> = unwrap(this).getTagsRaw()?.map(CfnTag::wrap) ?:
      emptyList()

  /**
   * The tags that are associated with the assessment.
   */
  public open fun tagsRaw(`value`: List<CfnTag>) {
    unwrap(this).setTagsRaw(`value`.map(CfnTag.Companion::unwrap))
  }

  /**
   * The tags that are associated with the assessment.
   */
  public open fun tagsRaw(vararg `value`: CfnTag): Unit = tagsRaw(`value`.toList())

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.auditmanager.CfnAssessment].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The destination that evidence reports are stored in for the assessment.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-auditmanager-assessment.html#cfn-auditmanager-assessment-assessmentreportsdestination)
     * @param assessmentReportsDestination The destination that evidence reports are stored in for
     * the assessment. 
     */
    public fun assessmentReportsDestination(assessmentReportsDestination: IResolvable)

    /**
     * The destination that evidence reports are stored in for the assessment.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-auditmanager-assessment.html#cfn-auditmanager-assessment-assessmentreportsdestination)
     * @param assessmentReportsDestination The destination that evidence reports are stored in for
     * the assessment. 
     */
    public
        fun assessmentReportsDestination(assessmentReportsDestination: AssessmentReportsDestinationProperty)

    /**
     * The destination that evidence reports are stored in for the assessment.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-auditmanager-assessment.html#cfn-auditmanager-assessment-assessmentreportsdestination)
     * @param assessmentReportsDestination The destination that evidence reports are stored in for
     * the assessment. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("2291bdad9e377b5b15886106ecdd4ad5cacac6721cc3864c84ce221e4f985f7b")
    public
        fun assessmentReportsDestination(assessmentReportsDestination: AssessmentReportsDestinationProperty.Builder.() -> Unit)

    /**
     * The AWS account that's associated with the assessment.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-auditmanager-assessment.html#cfn-auditmanager-assessment-awsaccount)
     * @param awsAccount The AWS account that's associated with the assessment. 
     */
    public fun awsAccount(awsAccount: IResolvable)

    /**
     * The AWS account that's associated with the assessment.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-auditmanager-assessment.html#cfn-auditmanager-assessment-awsaccount)
     * @param awsAccount The AWS account that's associated with the assessment. 
     */
    public fun awsAccount(awsAccount: AWSAccountProperty)

    /**
     * The AWS account that's associated with the assessment.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-auditmanager-assessment.html#cfn-auditmanager-assessment-awsaccount)
     * @param awsAccount The AWS account that's associated with the assessment. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("1580483e9c07085cc822510773463770606f203d1f70bd8575549ccf14ef7a91")
    public fun awsAccount(awsAccount: AWSAccountProperty.Builder.() -> Unit)

    /**
     * The delegations that are associated with the assessment.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-auditmanager-assessment.html#cfn-auditmanager-assessment-delegations)
     * @param delegations The delegations that are associated with the assessment. 
     */
    public fun delegations(delegations: IResolvable)

    /**
     * The delegations that are associated with the assessment.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-auditmanager-assessment.html#cfn-auditmanager-assessment-delegations)
     * @param delegations The delegations that are associated with the assessment. 
     */
    public fun delegations(delegations: List<Any>)

    /**
     * The delegations that are associated with the assessment.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-auditmanager-assessment.html#cfn-auditmanager-assessment-delegations)
     * @param delegations The delegations that are associated with the assessment. 
     */
    public fun delegations(vararg delegations: Any)

    /**
     * The description of the assessment.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-auditmanager-assessment.html#cfn-auditmanager-assessment-description)
     * @param description The description of the assessment. 
     */
    public fun description(description: String)

    /**
     * The unique identifier for the framework.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-auditmanager-assessment.html#cfn-auditmanager-assessment-frameworkid)
     * @param frameworkId The unique identifier for the framework. 
     */
    public fun frameworkId(frameworkId: String)

    /**
     * The name of the assessment.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-auditmanager-assessment.html#cfn-auditmanager-assessment-name)
     * @param name The name of the assessment. 
     */
    public fun name(name: String)

    /**
     * The roles that are associated with the assessment.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-auditmanager-assessment.html#cfn-auditmanager-assessment-roles)
     * @param roles The roles that are associated with the assessment. 
     */
    public fun roles(roles: IResolvable)

    /**
     * The roles that are associated with the assessment.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-auditmanager-assessment.html#cfn-auditmanager-assessment-roles)
     * @param roles The roles that are associated with the assessment. 
     */
    public fun roles(roles: List<Any>)

    /**
     * The roles that are associated with the assessment.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-auditmanager-assessment.html#cfn-auditmanager-assessment-roles)
     * @param roles The roles that are associated with the assessment. 
     */
    public fun roles(vararg roles: Any)

    /**
     * The wrapper of AWS accounts and services that are in scope for the assessment.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-auditmanager-assessment.html#cfn-auditmanager-assessment-scope)
     * @param scope The wrapper of AWS accounts and services that are in scope for the assessment. 
     */
    public fun scope(scope: IResolvable)

    /**
     * The wrapper of AWS accounts and services that are in scope for the assessment.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-auditmanager-assessment.html#cfn-auditmanager-assessment-scope)
     * @param scope The wrapper of AWS accounts and services that are in scope for the assessment. 
     */
    public fun scope(scope: ScopeProperty)

    /**
     * The wrapper of AWS accounts and services that are in scope for the assessment.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-auditmanager-assessment.html#cfn-auditmanager-assessment-scope)
     * @param scope The wrapper of AWS accounts and services that are in scope for the assessment. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("6cd79e98afe771933cfa678ad4e6945e8c8b781c2bead15848ae7da762a4a333")
    public fun scope(scope: ScopeProperty.Builder.() -> Unit)

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
     * @param status The overall status of the assessment. 
     */
    public fun status(status: String)

    /**
     * The tags that are associated with the assessment.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-auditmanager-assessment.html#cfn-auditmanager-assessment-tags)
     * @param tags The tags that are associated with the assessment. 
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * The tags that are associated with the assessment.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-auditmanager-assessment.html#cfn-auditmanager-assessment-tags)
     * @param tags The tags that are associated with the assessment. 
     */
    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.auditmanager.CfnAssessment.Builder =
        software.amazon.awscdk.services.auditmanager.CfnAssessment.Builder.create(scope, id)

    /**
     * The destination that evidence reports are stored in for the assessment.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-auditmanager-assessment.html#cfn-auditmanager-assessment-assessmentreportsdestination)
     * @param assessmentReportsDestination The destination that evidence reports are stored in for
     * the assessment. 
     */
    override fun assessmentReportsDestination(assessmentReportsDestination: IResolvable) {
      cdkBuilder.assessmentReportsDestination(assessmentReportsDestination.let(IResolvable.Companion::unwrap))
    }

    /**
     * The destination that evidence reports are stored in for the assessment.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-auditmanager-assessment.html#cfn-auditmanager-assessment-assessmentreportsdestination)
     * @param assessmentReportsDestination The destination that evidence reports are stored in for
     * the assessment. 
     */
    override
        fun assessmentReportsDestination(assessmentReportsDestination: AssessmentReportsDestinationProperty) {
      cdkBuilder.assessmentReportsDestination(assessmentReportsDestination.let(AssessmentReportsDestinationProperty.Companion::unwrap))
    }

    /**
     * The destination that evidence reports are stored in for the assessment.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-auditmanager-assessment.html#cfn-auditmanager-assessment-assessmentreportsdestination)
     * @param assessmentReportsDestination The destination that evidence reports are stored in for
     * the assessment. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("2291bdad9e377b5b15886106ecdd4ad5cacac6721cc3864c84ce221e4f985f7b")
    override
        fun assessmentReportsDestination(assessmentReportsDestination: AssessmentReportsDestinationProperty.Builder.() -> Unit):
        Unit =
        assessmentReportsDestination(AssessmentReportsDestinationProperty(assessmentReportsDestination))

    /**
     * The AWS account that's associated with the assessment.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-auditmanager-assessment.html#cfn-auditmanager-assessment-awsaccount)
     * @param awsAccount The AWS account that's associated with the assessment. 
     */
    override fun awsAccount(awsAccount: IResolvable) {
      cdkBuilder.awsAccount(awsAccount.let(IResolvable.Companion::unwrap))
    }

    /**
     * The AWS account that's associated with the assessment.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-auditmanager-assessment.html#cfn-auditmanager-assessment-awsaccount)
     * @param awsAccount The AWS account that's associated with the assessment. 
     */
    override fun awsAccount(awsAccount: AWSAccountProperty) {
      cdkBuilder.awsAccount(awsAccount.let(AWSAccountProperty.Companion::unwrap))
    }

    /**
     * The AWS account that's associated with the assessment.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-auditmanager-assessment.html#cfn-auditmanager-assessment-awsaccount)
     * @param awsAccount The AWS account that's associated with the assessment. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("1580483e9c07085cc822510773463770606f203d1f70bd8575549ccf14ef7a91")
    override fun awsAccount(awsAccount: AWSAccountProperty.Builder.() -> Unit): Unit =
        awsAccount(AWSAccountProperty(awsAccount))

    /**
     * The delegations that are associated with the assessment.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-auditmanager-assessment.html#cfn-auditmanager-assessment-delegations)
     * @param delegations The delegations that are associated with the assessment. 
     */
    override fun delegations(delegations: IResolvable) {
      cdkBuilder.delegations(delegations.let(IResolvable.Companion::unwrap))
    }

    /**
     * The delegations that are associated with the assessment.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-auditmanager-assessment.html#cfn-auditmanager-assessment-delegations)
     * @param delegations The delegations that are associated with the assessment. 
     */
    override fun delegations(delegations: List<Any>) {
      cdkBuilder.delegations(delegations.map{CdkObjectWrappers.unwrap(it)})
    }

    /**
     * The delegations that are associated with the assessment.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-auditmanager-assessment.html#cfn-auditmanager-assessment-delegations)
     * @param delegations The delegations that are associated with the assessment. 
     */
    override fun delegations(vararg delegations: Any): Unit = delegations(delegations.toList())

    /**
     * The description of the assessment.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-auditmanager-assessment.html#cfn-auditmanager-assessment-description)
     * @param description The description of the assessment. 
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * The unique identifier for the framework.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-auditmanager-assessment.html#cfn-auditmanager-assessment-frameworkid)
     * @param frameworkId The unique identifier for the framework. 
     */
    override fun frameworkId(frameworkId: String) {
      cdkBuilder.frameworkId(frameworkId)
    }

    /**
     * The name of the assessment.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-auditmanager-assessment.html#cfn-auditmanager-assessment-name)
     * @param name The name of the assessment. 
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    /**
     * The roles that are associated with the assessment.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-auditmanager-assessment.html#cfn-auditmanager-assessment-roles)
     * @param roles The roles that are associated with the assessment. 
     */
    override fun roles(roles: IResolvable) {
      cdkBuilder.roles(roles.let(IResolvable.Companion::unwrap))
    }

    /**
     * The roles that are associated with the assessment.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-auditmanager-assessment.html#cfn-auditmanager-assessment-roles)
     * @param roles The roles that are associated with the assessment. 
     */
    override fun roles(roles: List<Any>) {
      cdkBuilder.roles(roles.map{CdkObjectWrappers.unwrap(it)})
    }

    /**
     * The roles that are associated with the assessment.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-auditmanager-assessment.html#cfn-auditmanager-assessment-roles)
     * @param roles The roles that are associated with the assessment. 
     */
    override fun roles(vararg roles: Any): Unit = roles(roles.toList())

    /**
     * The wrapper of AWS accounts and services that are in scope for the assessment.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-auditmanager-assessment.html#cfn-auditmanager-assessment-scope)
     * @param scope The wrapper of AWS accounts and services that are in scope for the assessment. 
     */
    override fun scope(scope: IResolvable) {
      cdkBuilder.scope(scope.let(IResolvable.Companion::unwrap))
    }

    /**
     * The wrapper of AWS accounts and services that are in scope for the assessment.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-auditmanager-assessment.html#cfn-auditmanager-assessment-scope)
     * @param scope The wrapper of AWS accounts and services that are in scope for the assessment. 
     */
    override fun scope(scope: ScopeProperty) {
      cdkBuilder.scope(scope.let(ScopeProperty.Companion::unwrap))
    }

    /**
     * The wrapper of AWS accounts and services that are in scope for the assessment.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-auditmanager-assessment.html#cfn-auditmanager-assessment-scope)
     * @param scope The wrapper of AWS accounts and services that are in scope for the assessment. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("6cd79e98afe771933cfa678ad4e6945e8c8b781c2bead15848ae7da762a4a333")
    override fun scope(scope: ScopeProperty.Builder.() -> Unit): Unit = scope(ScopeProperty(scope))

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
     * @param status The overall status of the assessment. 
     */
    override fun status(status: String) {
      cdkBuilder.status(status)
    }

    /**
     * The tags that are associated with the assessment.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-auditmanager-assessment.html#cfn-auditmanager-assessment-tags)
     * @param tags The tags that are associated with the assessment. 
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag.Companion::unwrap))
    }

    /**
     * The tags that are associated with the assessment.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-auditmanager-assessment.html#cfn-auditmanager-assessment-tags)
     * @param tags The tags that are associated with the assessment. 
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.auditmanager.CfnAssessment =
        cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.auditmanager.CfnAssessment.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnAssessment {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnAssessment(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.auditmanager.CfnAssessment):
        CfnAssessment = CfnAssessment(cdkObject)

    internal fun unwrap(wrapped: CfnAssessment):
        software.amazon.awscdk.services.auditmanager.CfnAssessment = wrapped.cdkObject as
        software.amazon.awscdk.services.auditmanager.CfnAssessment
  }

  /**
   * The `AWSAccount` property type specifies the wrapper of the AWS account details, such as
   * account ID, email address, and so on.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.auditmanager.*;
   * AWSAccountProperty aWSAccountProperty = AWSAccountProperty.builder()
   * .emailAddress("emailAddress")
   * .id("id")
   * .name("name")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-auditmanager-assessment-awsaccount.html)
   */
  public interface AWSAccountProperty {
    /**
     * The email address that's associated with the AWS account .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-auditmanager-assessment-awsaccount.html#cfn-auditmanager-assessment-awsaccount-emailaddress)
     */
    public fun emailAddress(): String? = unwrap(this).getEmailAddress()

    /**
     * The identifier for the AWS account .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-auditmanager-assessment-awsaccount.html#cfn-auditmanager-assessment-awsaccount-id)
     */
    public fun id(): String? = unwrap(this).getId()

    /**
     * The name of the AWS account .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-auditmanager-assessment-awsaccount.html#cfn-auditmanager-assessment-awsaccount-name)
     */
    public fun name(): String? = unwrap(this).getName()

    /**
     * A builder for [AWSAccountProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param emailAddress The email address that's associated with the AWS account .
       */
      public fun emailAddress(emailAddress: String)

      /**
       * @param id The identifier for the AWS account .
       */
      public fun id(id: String)

      /**
       * @param name The name of the AWS account .
       */
      public fun name(name: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.auditmanager.CfnAssessment.AWSAccountProperty.Builder =
          software.amazon.awscdk.services.auditmanager.CfnAssessment.AWSAccountProperty.builder()

      /**
       * @param emailAddress The email address that's associated with the AWS account .
       */
      override fun emailAddress(emailAddress: String) {
        cdkBuilder.emailAddress(emailAddress)
      }

      /**
       * @param id The identifier for the AWS account .
       */
      override fun id(id: String) {
        cdkBuilder.id(id)
      }

      /**
       * @param name The name of the AWS account .
       */
      override fun name(name: String) {
        cdkBuilder.name(name)
      }

      public fun build():
          software.amazon.awscdk.services.auditmanager.CfnAssessment.AWSAccountProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.auditmanager.CfnAssessment.AWSAccountProperty,
    ) : CdkObject(cdkObject),
        AWSAccountProperty {
      /**
       * The email address that's associated with the AWS account .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-auditmanager-assessment-awsaccount.html#cfn-auditmanager-assessment-awsaccount-emailaddress)
       */
      override fun emailAddress(): String? = unwrap(this).getEmailAddress()

      /**
       * The identifier for the AWS account .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-auditmanager-assessment-awsaccount.html#cfn-auditmanager-assessment-awsaccount-id)
       */
      override fun id(): String? = unwrap(this).getId()

      /**
       * The name of the AWS account .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-auditmanager-assessment-awsaccount.html#cfn-auditmanager-assessment-awsaccount-name)
       */
      override fun name(): String? = unwrap(this).getName()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): AWSAccountProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.auditmanager.CfnAssessment.AWSAccountProperty):
          AWSAccountProperty = CdkObjectWrappers.wrap(cdkObject) as? AWSAccountProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: AWSAccountProperty):
          software.amazon.awscdk.services.auditmanager.CfnAssessment.AWSAccountProperty = (wrapped
          as CdkObject).cdkObject as
          software.amazon.awscdk.services.auditmanager.CfnAssessment.AWSAccountProperty
    }
  }

  /**
   * The `AWSService` property type specifies an AWS service such as Amazon S3 , AWS CloudTrail ,
   * and so on.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.auditmanager.*;
   * AWSServiceProperty aWSServiceProperty = AWSServiceProperty.builder()
   * .serviceName("serviceName")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-auditmanager-assessment-awsservice.html)
   */
  public interface AWSServiceProperty {
    /**
     * The name of the AWS service .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-auditmanager-assessment-awsservice.html#cfn-auditmanager-assessment-awsservice-servicename)
     */
    public fun serviceName(): String? = unwrap(this).getServiceName()

    /**
     * A builder for [AWSServiceProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param serviceName The name of the AWS service .
       */
      public fun serviceName(serviceName: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.auditmanager.CfnAssessment.AWSServiceProperty.Builder =
          software.amazon.awscdk.services.auditmanager.CfnAssessment.AWSServiceProperty.builder()

      /**
       * @param serviceName The name of the AWS service .
       */
      override fun serviceName(serviceName: String) {
        cdkBuilder.serviceName(serviceName)
      }

      public fun build():
          software.amazon.awscdk.services.auditmanager.CfnAssessment.AWSServiceProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.auditmanager.CfnAssessment.AWSServiceProperty,
    ) : CdkObject(cdkObject),
        AWSServiceProperty {
      /**
       * The name of the AWS service .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-auditmanager-assessment-awsservice.html#cfn-auditmanager-assessment-awsservice-servicename)
       */
      override fun serviceName(): String? = unwrap(this).getServiceName()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): AWSServiceProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.auditmanager.CfnAssessment.AWSServiceProperty):
          AWSServiceProperty = CdkObjectWrappers.wrap(cdkObject) as? AWSServiceProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: AWSServiceProperty):
          software.amazon.awscdk.services.auditmanager.CfnAssessment.AWSServiceProperty = (wrapped
          as CdkObject).cdkObject as
          software.amazon.awscdk.services.auditmanager.CfnAssessment.AWSServiceProperty
    }
  }

  /**
   * The `AssessmentReportsDestination` property type specifies the location in which AWS Audit
   * Manager saves assessment reports for the given assessment.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.auditmanager.*;
   * AssessmentReportsDestinationProperty assessmentReportsDestinationProperty =
   * AssessmentReportsDestinationProperty.builder()
   * .destination("destination")
   * .destinationType("destinationType")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-auditmanager-assessment-assessmentreportsdestination.html)
   */
  public interface AssessmentReportsDestinationProperty {
    /**
     * The destination bucket where Audit Manager stores assessment reports.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-auditmanager-assessment-assessmentreportsdestination.html#cfn-auditmanager-assessment-assessmentreportsdestination-destination)
     */
    public fun destination(): String? = unwrap(this).getDestination()

    /**
     * The destination type, such as Amazon S3.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-auditmanager-assessment-assessmentreportsdestination.html#cfn-auditmanager-assessment-assessmentreportsdestination-destinationtype)
     */
    public fun destinationType(): String? = unwrap(this).getDestinationType()

    /**
     * A builder for [AssessmentReportsDestinationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param destination The destination bucket where Audit Manager stores assessment reports.
       */
      public fun destination(destination: String)

      /**
       * @param destinationType The destination type, such as Amazon S3.
       */
      public fun destinationType(destinationType: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.auditmanager.CfnAssessment.AssessmentReportsDestinationProperty.Builder
          =
          software.amazon.awscdk.services.auditmanager.CfnAssessment.AssessmentReportsDestinationProperty.builder()

      /**
       * @param destination The destination bucket where Audit Manager stores assessment reports.
       */
      override fun destination(destination: String) {
        cdkBuilder.destination(destination)
      }

      /**
       * @param destinationType The destination type, such as Amazon S3.
       */
      override fun destinationType(destinationType: String) {
        cdkBuilder.destinationType(destinationType)
      }

      public fun build():
          software.amazon.awscdk.services.auditmanager.CfnAssessment.AssessmentReportsDestinationProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.auditmanager.CfnAssessment.AssessmentReportsDestinationProperty,
    ) : CdkObject(cdkObject),
        AssessmentReportsDestinationProperty {
      /**
       * The destination bucket where Audit Manager stores assessment reports.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-auditmanager-assessment-assessmentreportsdestination.html#cfn-auditmanager-assessment-assessmentreportsdestination-destination)
       */
      override fun destination(): String? = unwrap(this).getDestination()

      /**
       * The destination type, such as Amazon S3.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-auditmanager-assessment-assessmentreportsdestination.html#cfn-auditmanager-assessment-assessmentreportsdestination-destinationtype)
       */
      override fun destinationType(): String? = unwrap(this).getDestinationType()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          AssessmentReportsDestinationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.auditmanager.CfnAssessment.AssessmentReportsDestinationProperty):
          AssessmentReportsDestinationProperty = CdkObjectWrappers.wrap(cdkObject) as?
          AssessmentReportsDestinationProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: AssessmentReportsDestinationProperty):
          software.amazon.awscdk.services.auditmanager.CfnAssessment.AssessmentReportsDestinationProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.auditmanager.CfnAssessment.AssessmentReportsDestinationProperty
    }
  }

  /**
   * The `Delegation` property type specifies the assignment of a control set to a delegate for
   * review.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.auditmanager.*;
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
  public interface DelegationProperty {
    /**
     * The identifier for the assessment that's associated with the delegation.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-auditmanager-assessment-delegation.html#cfn-auditmanager-assessment-delegation-assessmentid)
     */
    public fun assessmentId(): String? = unwrap(this).getAssessmentId()

    /**
     * The name of the assessment that's associated with the delegation.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-auditmanager-assessment-delegation.html#cfn-auditmanager-assessment-delegation-assessmentname)
     */
    public fun assessmentName(): String? = unwrap(this).getAssessmentName()

    /**
     * The comment that's related to the delegation.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-auditmanager-assessment-delegation.html#cfn-auditmanager-assessment-delegation-comment)
     */
    public fun comment(): String? = unwrap(this).getComment()

    /**
     * The identifier for the control set that's associated with the delegation.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-auditmanager-assessment-delegation.html#cfn-auditmanager-assessment-delegation-controlsetid)
     */
    public fun controlSetId(): String? = unwrap(this).getControlSetId()

    /**
     * The user or role that created the delegation.
     *
     * *Minimum* : `1`
     *
     * *Maximum* : `100`
     *
     * *Pattern* : `^[a-zA-Z0-9-_()\\[\\]\\s]+$`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-auditmanager-assessment-delegation.html#cfn-auditmanager-assessment-delegation-createdby)
     */
    public fun createdBy(): String? = unwrap(this).getCreatedBy()

    /**
     * Specifies when the delegation was created.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-auditmanager-assessment-delegation.html#cfn-auditmanager-assessment-delegation-creationtime)
     */
    public fun creationTime(): Number? = unwrap(this).getCreationTime()

    /**
     * The unique identifier for the delegation.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-auditmanager-assessment-delegation.html#cfn-auditmanager-assessment-delegation-id)
     */
    public fun id(): String? = unwrap(this).getId()

    /**
     * Specifies when the delegation was last updated.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-auditmanager-assessment-delegation.html#cfn-auditmanager-assessment-delegation-lastupdated)
     */
    public fun lastUpdated(): Number? = unwrap(this).getLastUpdated()

    /**
     * The Amazon Resource Name (ARN) of the IAM role.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-auditmanager-assessment-delegation.html#cfn-auditmanager-assessment-delegation-rolearn)
     */
    public fun roleArn(): String? = unwrap(this).getRoleArn()

    /**
     * The type of customer persona.
     *
     *
     * In `CreateAssessment` , `roleType` can only be `PROCESS_OWNER` .
     *
     * In `UpdateSettings` , `roleType` can only be `PROCESS_OWNER` .
     *
     * In `BatchCreateDelegationByAssessment` , `roleType` can only be `RESOURCE_OWNER` .
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-auditmanager-assessment-delegation.html#cfn-auditmanager-assessment-delegation-roletype)
     */
    public fun roleType(): String? = unwrap(this).getRoleType()

    /**
     * The status of the delegation.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-auditmanager-assessment-delegation.html#cfn-auditmanager-assessment-delegation-status)
     */
    public fun status(): String? = unwrap(this).getStatus()

    /**
     * A builder for [DelegationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param assessmentId The identifier for the assessment that's associated with the
       * delegation.
       */
      public fun assessmentId(assessmentId: String)

      /**
       * @param assessmentName The name of the assessment that's associated with the delegation.
       */
      public fun assessmentName(assessmentName: String)

      /**
       * @param comment The comment that's related to the delegation.
       */
      public fun comment(comment: String)

      /**
       * @param controlSetId The identifier for the control set that's associated with the
       * delegation.
       */
      public fun controlSetId(controlSetId: String)

      /**
       * @param createdBy The user or role that created the delegation.
       * *Minimum* : `1`
       *
       * *Maximum* : `100`
       *
       * *Pattern* : `^[a-zA-Z0-9-_()\\[\\]\\s]+$`
       */
      public fun createdBy(createdBy: String)

      /**
       * @param creationTime Specifies when the delegation was created.
       */
      public fun creationTime(creationTime: Number)

      /**
       * @param id The unique identifier for the delegation.
       */
      public fun id(id: String)

      /**
       * @param lastUpdated Specifies when the delegation was last updated.
       */
      public fun lastUpdated(lastUpdated: Number)

      /**
       * @param roleArn The Amazon Resource Name (ARN) of the IAM role.
       */
      public fun roleArn(roleArn: String)

      /**
       * @param roleType The type of customer persona.
       *
       * In `CreateAssessment` , `roleType` can only be `PROCESS_OWNER` .
       *
       * In `UpdateSettings` , `roleType` can only be `PROCESS_OWNER` .
       *
       * In `BatchCreateDelegationByAssessment` , `roleType` can only be `RESOURCE_OWNER` .
       */
      public fun roleType(roleType: String)

      /**
       * @param status The status of the delegation.
       */
      public fun status(status: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.auditmanager.CfnAssessment.DelegationProperty.Builder =
          software.amazon.awscdk.services.auditmanager.CfnAssessment.DelegationProperty.builder()

      /**
       * @param assessmentId The identifier for the assessment that's associated with the
       * delegation.
       */
      override fun assessmentId(assessmentId: String) {
        cdkBuilder.assessmentId(assessmentId)
      }

      /**
       * @param assessmentName The name of the assessment that's associated with the delegation.
       */
      override fun assessmentName(assessmentName: String) {
        cdkBuilder.assessmentName(assessmentName)
      }

      /**
       * @param comment The comment that's related to the delegation.
       */
      override fun comment(comment: String) {
        cdkBuilder.comment(comment)
      }

      /**
       * @param controlSetId The identifier for the control set that's associated with the
       * delegation.
       */
      override fun controlSetId(controlSetId: String) {
        cdkBuilder.controlSetId(controlSetId)
      }

      /**
       * @param createdBy The user or role that created the delegation.
       * *Minimum* : `1`
       *
       * *Maximum* : `100`
       *
       * *Pattern* : `^[a-zA-Z0-9-_()\\[\\]\\s]+$`
       */
      override fun createdBy(createdBy: String) {
        cdkBuilder.createdBy(createdBy)
      }

      /**
       * @param creationTime Specifies when the delegation was created.
       */
      override fun creationTime(creationTime: Number) {
        cdkBuilder.creationTime(creationTime)
      }

      /**
       * @param id The unique identifier for the delegation.
       */
      override fun id(id: String) {
        cdkBuilder.id(id)
      }

      /**
       * @param lastUpdated Specifies when the delegation was last updated.
       */
      override fun lastUpdated(lastUpdated: Number) {
        cdkBuilder.lastUpdated(lastUpdated)
      }

      /**
       * @param roleArn The Amazon Resource Name (ARN) of the IAM role.
       */
      override fun roleArn(roleArn: String) {
        cdkBuilder.roleArn(roleArn)
      }

      /**
       * @param roleType The type of customer persona.
       *
       * In `CreateAssessment` , `roleType` can only be `PROCESS_OWNER` .
       *
       * In `UpdateSettings` , `roleType` can only be `PROCESS_OWNER` .
       *
       * In `BatchCreateDelegationByAssessment` , `roleType` can only be `RESOURCE_OWNER` .
       */
      override fun roleType(roleType: String) {
        cdkBuilder.roleType(roleType)
      }

      /**
       * @param status The status of the delegation.
       */
      override fun status(status: String) {
        cdkBuilder.status(status)
      }

      public fun build():
          software.amazon.awscdk.services.auditmanager.CfnAssessment.DelegationProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.auditmanager.CfnAssessment.DelegationProperty,
    ) : CdkObject(cdkObject),
        DelegationProperty {
      /**
       * The identifier for the assessment that's associated with the delegation.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-auditmanager-assessment-delegation.html#cfn-auditmanager-assessment-delegation-assessmentid)
       */
      override fun assessmentId(): String? = unwrap(this).getAssessmentId()

      /**
       * The name of the assessment that's associated with the delegation.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-auditmanager-assessment-delegation.html#cfn-auditmanager-assessment-delegation-assessmentname)
       */
      override fun assessmentName(): String? = unwrap(this).getAssessmentName()

      /**
       * The comment that's related to the delegation.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-auditmanager-assessment-delegation.html#cfn-auditmanager-assessment-delegation-comment)
       */
      override fun comment(): String? = unwrap(this).getComment()

      /**
       * The identifier for the control set that's associated with the delegation.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-auditmanager-assessment-delegation.html#cfn-auditmanager-assessment-delegation-controlsetid)
       */
      override fun controlSetId(): String? = unwrap(this).getControlSetId()

      /**
       * The user or role that created the delegation.
       *
       * *Minimum* : `1`
       *
       * *Maximum* : `100`
       *
       * *Pattern* : `^[a-zA-Z0-9-_()\\[\\]\\s]+$`
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-auditmanager-assessment-delegation.html#cfn-auditmanager-assessment-delegation-createdby)
       */
      override fun createdBy(): String? = unwrap(this).getCreatedBy()

      /**
       * Specifies when the delegation was created.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-auditmanager-assessment-delegation.html#cfn-auditmanager-assessment-delegation-creationtime)
       */
      override fun creationTime(): Number? = unwrap(this).getCreationTime()

      /**
       * The unique identifier for the delegation.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-auditmanager-assessment-delegation.html#cfn-auditmanager-assessment-delegation-id)
       */
      override fun id(): String? = unwrap(this).getId()

      /**
       * Specifies when the delegation was last updated.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-auditmanager-assessment-delegation.html#cfn-auditmanager-assessment-delegation-lastupdated)
       */
      override fun lastUpdated(): Number? = unwrap(this).getLastUpdated()

      /**
       * The Amazon Resource Name (ARN) of the IAM role.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-auditmanager-assessment-delegation.html#cfn-auditmanager-assessment-delegation-rolearn)
       */
      override fun roleArn(): String? = unwrap(this).getRoleArn()

      /**
       * The type of customer persona.
       *
       *
       * In `CreateAssessment` , `roleType` can only be `PROCESS_OWNER` .
       *
       * In `UpdateSettings` , `roleType` can only be `PROCESS_OWNER` .
       *
       * In `BatchCreateDelegationByAssessment` , `roleType` can only be `RESOURCE_OWNER` .
       *
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-auditmanager-assessment-delegation.html#cfn-auditmanager-assessment-delegation-roletype)
       */
      override fun roleType(): String? = unwrap(this).getRoleType()

      /**
       * The status of the delegation.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-auditmanager-assessment-delegation.html#cfn-auditmanager-assessment-delegation-status)
       */
      override fun status(): String? = unwrap(this).getStatus()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): DelegationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.auditmanager.CfnAssessment.DelegationProperty):
          DelegationProperty = CdkObjectWrappers.wrap(cdkObject) as? DelegationProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: DelegationProperty):
          software.amazon.awscdk.services.auditmanager.CfnAssessment.DelegationProperty = (wrapped
          as CdkObject).cdkObject as
          software.amazon.awscdk.services.auditmanager.CfnAssessment.DelegationProperty
    }
  }

  /**
   * The `Role` property type specifies the wrapper that contains AWS Audit Manager role
   * information, such as the role type and IAM Amazon Resource Name (ARN).
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.auditmanager.*;
   * RoleProperty roleProperty = RoleProperty.builder()
   * .roleArn("roleArn")
   * .roleType("roleType")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-auditmanager-assessment-role.html)
   */
  public interface RoleProperty {
    /**
     * The Amazon Resource Name (ARN) of the IAM role.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-auditmanager-assessment-role.html#cfn-auditmanager-assessment-role-rolearn)
     */
    public fun roleArn(): String? = unwrap(this).getRoleArn()

    /**
     * The type of customer persona.
     *
     *
     * In `CreateAssessment` , `roleType` can only be `PROCESS_OWNER` .
     *
     * In `UpdateSettings` , `roleType` can only be `PROCESS_OWNER` .
     *
     * In `BatchCreateDelegationByAssessment` , `roleType` can only be `RESOURCE_OWNER` .
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-auditmanager-assessment-role.html#cfn-auditmanager-assessment-role-roletype)
     */
    public fun roleType(): String? = unwrap(this).getRoleType()

    /**
     * A builder for [RoleProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param roleArn The Amazon Resource Name (ARN) of the IAM role.
       */
      public fun roleArn(roleArn: String)

      /**
       * @param roleType The type of customer persona.
       *
       * In `CreateAssessment` , `roleType` can only be `PROCESS_OWNER` .
       *
       * In `UpdateSettings` , `roleType` can only be `PROCESS_OWNER` .
       *
       * In `BatchCreateDelegationByAssessment` , `roleType` can only be `RESOURCE_OWNER` .
       */
      public fun roleType(roleType: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.auditmanager.CfnAssessment.RoleProperty.Builder =
          software.amazon.awscdk.services.auditmanager.CfnAssessment.RoleProperty.builder()

      /**
       * @param roleArn The Amazon Resource Name (ARN) of the IAM role.
       */
      override fun roleArn(roleArn: String) {
        cdkBuilder.roleArn(roleArn)
      }

      /**
       * @param roleType The type of customer persona.
       *
       * In `CreateAssessment` , `roleType` can only be `PROCESS_OWNER` .
       *
       * In `UpdateSettings` , `roleType` can only be `PROCESS_OWNER` .
       *
       * In `BatchCreateDelegationByAssessment` , `roleType` can only be `RESOURCE_OWNER` .
       */
      override fun roleType(roleType: String) {
        cdkBuilder.roleType(roleType)
      }

      public fun build(): software.amazon.awscdk.services.auditmanager.CfnAssessment.RoleProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.auditmanager.CfnAssessment.RoleProperty,
    ) : CdkObject(cdkObject),
        RoleProperty {
      /**
       * The Amazon Resource Name (ARN) of the IAM role.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-auditmanager-assessment-role.html#cfn-auditmanager-assessment-role-rolearn)
       */
      override fun roleArn(): String? = unwrap(this).getRoleArn()

      /**
       * The type of customer persona.
       *
       *
       * In `CreateAssessment` , `roleType` can only be `PROCESS_OWNER` .
       *
       * In `UpdateSettings` , `roleType` can only be `PROCESS_OWNER` .
       *
       * In `BatchCreateDelegationByAssessment` , `roleType` can only be `RESOURCE_OWNER` .
       *
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-auditmanager-assessment-role.html#cfn-auditmanager-assessment-role-roletype)
       */
      override fun roleType(): String? = unwrap(this).getRoleType()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): RoleProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.auditmanager.CfnAssessment.RoleProperty):
          RoleProperty = CdkObjectWrappers.wrap(cdkObject) as? RoleProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: RoleProperty):
          software.amazon.awscdk.services.auditmanager.CfnAssessment.RoleProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.auditmanager.CfnAssessment.RoleProperty
    }
  }

  /**
   * The `Scope` property type specifies the wrapper that contains the AWS accounts and services
   * that are in scope for the assessment.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.auditmanager.*;
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
  public interface ScopeProperty {
    /**
     * The AWS accounts that are included in the scope of the assessment.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-auditmanager-assessment-scope.html#cfn-auditmanager-assessment-scope-awsaccounts)
     */
    public fun awsAccounts(): Any? = unwrap(this).getAwsAccounts()

    /**
     * The AWS services that are included in the scope of the assessment.
     *
     *
     * This API parameter is no longer supported. If you use this parameter to specify one or more
     * AWS services , Audit Manager ignores this input. Instead, the value for `awsServices` will show
     * as empty.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-auditmanager-assessment-scope.html#cfn-auditmanager-assessment-scope-awsservices)
     */
    public fun awsServices(): Any? = unwrap(this).getAwsServices()

    /**
     * A builder for [ScopeProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param awsAccounts The AWS accounts that are included in the scope of the assessment.
       */
      public fun awsAccounts(awsAccounts: IResolvable)

      /**
       * @param awsAccounts The AWS accounts that are included in the scope of the assessment.
       */
      public fun awsAccounts(awsAccounts: List<Any>)

      /**
       * @param awsAccounts The AWS accounts that are included in the scope of the assessment.
       */
      public fun awsAccounts(vararg awsAccounts: Any)

      /**
       * @param awsServices The AWS services that are included in the scope of the assessment.
       *
       * This API parameter is no longer supported. If you use this parameter to specify one or more
       * AWS services , Audit Manager ignores this input. Instead, the value for `awsServices` will
       * show as empty.
       */
      public fun awsServices(awsServices: IResolvable)

      /**
       * @param awsServices The AWS services that are included in the scope of the assessment.
       *
       * This API parameter is no longer supported. If you use this parameter to specify one or more
       * AWS services , Audit Manager ignores this input. Instead, the value for `awsServices` will
       * show as empty.
       */
      public fun awsServices(awsServices: List<Any>)

      /**
       * @param awsServices The AWS services that are included in the scope of the assessment.
       *
       * This API parameter is no longer supported. If you use this parameter to specify one or more
       * AWS services , Audit Manager ignores this input. Instead, the value for `awsServices` will
       * show as empty.
       */
      public fun awsServices(vararg awsServices: Any)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.auditmanager.CfnAssessment.ScopeProperty.Builder =
          software.amazon.awscdk.services.auditmanager.CfnAssessment.ScopeProperty.builder()

      /**
       * @param awsAccounts The AWS accounts that are included in the scope of the assessment.
       */
      override fun awsAccounts(awsAccounts: IResolvable) {
        cdkBuilder.awsAccounts(awsAccounts.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param awsAccounts The AWS accounts that are included in the scope of the assessment.
       */
      override fun awsAccounts(awsAccounts: List<Any>) {
        cdkBuilder.awsAccounts(awsAccounts.map{CdkObjectWrappers.unwrap(it)})
      }

      /**
       * @param awsAccounts The AWS accounts that are included in the scope of the assessment.
       */
      override fun awsAccounts(vararg awsAccounts: Any): Unit = awsAccounts(awsAccounts.toList())

      /**
       * @param awsServices The AWS services that are included in the scope of the assessment.
       *
       * This API parameter is no longer supported. If you use this parameter to specify one or more
       * AWS services , Audit Manager ignores this input. Instead, the value for `awsServices` will
       * show as empty.
       */
      override fun awsServices(awsServices: IResolvable) {
        cdkBuilder.awsServices(awsServices.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param awsServices The AWS services that are included in the scope of the assessment.
       *
       * This API parameter is no longer supported. If you use this parameter to specify one or more
       * AWS services , Audit Manager ignores this input. Instead, the value for `awsServices` will
       * show as empty.
       */
      override fun awsServices(awsServices: List<Any>) {
        cdkBuilder.awsServices(awsServices.map{CdkObjectWrappers.unwrap(it)})
      }

      /**
       * @param awsServices The AWS services that are included in the scope of the assessment.
       *
       * This API parameter is no longer supported. If you use this parameter to specify one or more
       * AWS services , Audit Manager ignores this input. Instead, the value for `awsServices` will
       * show as empty.
       */
      override fun awsServices(vararg awsServices: Any): Unit = awsServices(awsServices.toList())

      public fun build(): software.amazon.awscdk.services.auditmanager.CfnAssessment.ScopeProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.auditmanager.CfnAssessment.ScopeProperty,
    ) : CdkObject(cdkObject),
        ScopeProperty {
      /**
       * The AWS accounts that are included in the scope of the assessment.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-auditmanager-assessment-scope.html#cfn-auditmanager-assessment-scope-awsaccounts)
       */
      override fun awsAccounts(): Any? = unwrap(this).getAwsAccounts()

      /**
       * The AWS services that are included in the scope of the assessment.
       *
       *
       * This API parameter is no longer supported. If you use this parameter to specify one or more
       * AWS services , Audit Manager ignores this input. Instead, the value for `awsServices` will
       * show as empty.
       *
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-auditmanager-assessment-scope.html#cfn-auditmanager-assessment-scope-awsservices)
       */
      override fun awsServices(): Any? = unwrap(this).getAwsServices()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): ScopeProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.auditmanager.CfnAssessment.ScopeProperty):
          ScopeProperty = CdkObjectWrappers.wrap(cdkObject) as? ScopeProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: ScopeProperty):
          software.amazon.awscdk.services.auditmanager.CfnAssessment.ScopeProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.auditmanager.CfnAssessment.ScopeProperty
    }
  }
}
