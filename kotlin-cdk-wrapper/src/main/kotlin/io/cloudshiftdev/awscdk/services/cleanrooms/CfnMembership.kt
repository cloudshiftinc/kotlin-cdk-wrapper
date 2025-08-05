@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.cleanrooms

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.ITaggableV2
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * Creates a membership for a specific collaboration identifier and joins the collaboration.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.cleanrooms.*;
 * CfnMembership cfnMembership = CfnMembership.Builder.create(this, "MyCfnMembership")
 * .collaborationIdentifier("collaborationIdentifier")
 * .queryLogStatus("queryLogStatus")
 * // the properties below are optional
 * .defaultJobResultConfiguration(MembershipProtectedJobResultConfigurationProperty.builder()
 * .outputConfiguration(MembershipProtectedJobOutputConfigurationProperty.builder()
 * .s3(ProtectedJobS3OutputConfigurationInputProperty.builder()
 * .bucket("bucket")
 * // the properties below are optional
 * .keyPrefix("keyPrefix")
 * .build())
 * .build())
 * .roleArn("roleArn")
 * .build())
 * .defaultResultConfiguration(MembershipProtectedQueryResultConfigurationProperty.builder()
 * .outputConfiguration(MembershipProtectedQueryOutputConfigurationProperty.builder()
 * .s3(ProtectedQueryS3OutputConfigurationProperty.builder()
 * .bucket("bucket")
 * .resultFormat("resultFormat")
 * // the properties below are optional
 * .keyPrefix("keyPrefix")
 * .singleFileOutput(false)
 * .build())
 * .build())
 * // the properties below are optional
 * .roleArn("roleArn")
 * .build())
 * .jobLogStatus("jobLogStatus")
 * .paymentConfiguration(MembershipPaymentConfigurationProperty.builder()
 * .queryCompute(MembershipQueryComputePaymentConfigProperty.builder()
 * .isResponsible(false)
 * .build())
 * // the properties below are optional
 * .jobCompute(MembershipJobComputePaymentConfigProperty.builder()
 * .isResponsible(false)
 * .build())
 * .machineLearning(MembershipMLPaymentConfigProperty.builder()
 * .modelInference(MembershipModelInferencePaymentConfigProperty.builder()
 * .isResponsible(false)
 * .build())
 * .modelTraining(MembershipModelTrainingPaymentConfigProperty.builder()
 * .isResponsible(false)
 * .build())
 * .build())
 * .build())
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cleanrooms-membership.html)
 */
public open class CfnMembership(
  cdkObject: software.amazon.awscdk.services.cleanrooms.CfnMembership,
) : CfnResource(cdkObject),
    IInspectable,
    ITaggableV2 {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnMembershipProps,
  ) :
      this(software.amazon.awscdk.services.cleanrooms.CfnMembership(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id, props.let(CfnMembershipProps.Companion::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnMembershipProps.Builder.() -> Unit,
  ) : this(scope, id, CfnMembershipProps(props)
  )

  /**
   * Returns the Amazon Resource Name (ARN) of the specified membership.
   *
   * Example:
   * `arn:aws:cleanrooms:us-east-1:111122223333:membership/a1b2c3d4-5678-90ab-cdef-EXAMPLE11111`
   */
  public open fun attrArn(): String = unwrap(this).getAttrArn()

  /**
   * Returns the Amazon Resource Name (ARN) of the specified collaboration.
   *
   * Example:
   * `arn:aws:cleanrooms:us-east-1:111122223333:collaboration/a1b2c3d4-5678-90ab-cdef-EXAMPLE11111`
   */
  public open fun attrCollaborationArn(): String = unwrap(this).getAttrCollaborationArn()

  /**
   * Returns the unique identifier of the specified collaboration creator account.
   *
   * Example: `a1b2c3d4-5678-90ab-cdef-EXAMPLE11111`
   */
  public open fun attrCollaborationCreatorAccountId(): String =
      unwrap(this).getAttrCollaborationCreatorAccountId()

  /**
   * Returns the unique identifier of the specified membership.
   *
   * Example: `a1b2c3d4-5678-90ab-cdef-EXAMPLE22222`
   */
  public open fun attrMembershipIdentifier(): String = unwrap(this).getAttrMembershipIdentifier()

  /**
   * Tag Manager which manages the tags for this resource.
   */
  public override fun cdkTagManager(): TagManager =
      unwrap(this).getCdkTagManager().let(TagManager::wrap)

  /**
   * The unique ID for the associated collaboration.
   */
  public open fun collaborationIdentifier(): String = unwrap(this).getCollaborationIdentifier()

  /**
   * The unique ID for the associated collaboration.
   */
  public open fun collaborationIdentifier(`value`: String) {
    unwrap(this).setCollaborationIdentifier(`value`)
  }

  /**
   * The default job result configuration for the membership.
   */
  public open fun defaultJobResultConfiguration(): Any? =
      unwrap(this).getDefaultJobResultConfiguration()

  /**
   * The default job result configuration for the membership.
   */
  public open fun defaultJobResultConfiguration(`value`: IResolvable) {
    unwrap(this).setDefaultJobResultConfiguration(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   * The default job result configuration for the membership.
   */
  public open
      fun defaultJobResultConfiguration(`value`: MembershipProtectedJobResultConfigurationProperty) {
    unwrap(this).setDefaultJobResultConfiguration(`value`.let(MembershipProtectedJobResultConfigurationProperty.Companion::unwrap))
  }

  /**
   * The default job result configuration for the membership.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("cb7fc4986f6a0a57a4c6364c1b1951a2d202f03a381e739613389d40b141d393")
  public open
      fun defaultJobResultConfiguration(`value`: MembershipProtectedJobResultConfigurationProperty.Builder.() -> Unit):
      Unit =
      defaultJobResultConfiguration(MembershipProtectedJobResultConfigurationProperty(`value`))

  /**
   * The default protected query result configuration as specified by the member who can receive
   * results.
   */
  public open fun defaultResultConfiguration(): Any? = unwrap(this).getDefaultResultConfiguration()

  /**
   * The default protected query result configuration as specified by the member who can receive
   * results.
   */
  public open fun defaultResultConfiguration(`value`: IResolvable) {
    unwrap(this).setDefaultResultConfiguration(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   * The default protected query result configuration as specified by the member who can receive
   * results.
   */
  public open
      fun defaultResultConfiguration(`value`: MembershipProtectedQueryResultConfigurationProperty) {
    unwrap(this).setDefaultResultConfiguration(`value`.let(MembershipProtectedQueryResultConfigurationProperty.Companion::unwrap))
  }

  /**
   * The default protected query result configuration as specified by the member who can receive
   * results.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("11e31fd9aaeb3a89524d9fbefae14a057b8bf26feeab297ec9ef986b2bd87f3e")
  public open
      fun defaultResultConfiguration(`value`: MembershipProtectedQueryResultConfigurationProperty.Builder.() -> Unit):
      Unit =
      defaultResultConfiguration(MembershipProtectedQueryResultConfigurationProperty(`value`))

  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector.Companion::unwrap))
  }

  /**
   * An indicator as to whether job logging has been enabled or disabled for the collaboration.
   */
  public open fun jobLogStatus(): String? = unwrap(this).getJobLogStatus()

  /**
   * An indicator as to whether job logging has been enabled or disabled for the collaboration.
   */
  public open fun jobLogStatus(`value`: String) {
    unwrap(this).setJobLogStatus(`value`)
  }

  /**
   * The payment responsibilities accepted by the collaboration member.
   */
  public open fun paymentConfiguration(): Any? = unwrap(this).getPaymentConfiguration()

  /**
   * The payment responsibilities accepted by the collaboration member.
   */
  public open fun paymentConfiguration(`value`: IResolvable) {
    unwrap(this).setPaymentConfiguration(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   * The payment responsibilities accepted by the collaboration member.
   */
  public open fun paymentConfiguration(`value`: MembershipPaymentConfigurationProperty) {
    unwrap(this).setPaymentConfiguration(`value`.let(MembershipPaymentConfigurationProperty.Companion::unwrap))
  }

  /**
   * The payment responsibilities accepted by the collaboration member.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("a31f3ad321ba01ad951334da843b4763ff03d4bcb24dd2eaabd60b8699eb7f3a")
  public open
      fun paymentConfiguration(`value`: MembershipPaymentConfigurationProperty.Builder.() -> Unit):
      Unit = paymentConfiguration(MembershipPaymentConfigurationProperty(`value`))

  /**
   * An indicator as to whether query logging has been enabled or disabled for the membership.
   */
  public open fun queryLogStatus(): String = unwrap(this).getQueryLogStatus()

  /**
   * An indicator as to whether query logging has been enabled or disabled for the membership.
   */
  public open fun queryLogStatus(`value`: String) {
    unwrap(this).setQueryLogStatus(`value`)
  }

  /**
   * An optional label that you can assign to a resource when you create it.
   */
  public open fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * An optional label that you can assign to a resource when you create it.
   */
  public open fun tags(`value`: List<CfnTag>) {
    unwrap(this).setTags(`value`.map(CfnTag.Companion::unwrap))
  }

  /**
   * An optional label that you can assign to a resource when you create it.
   */
  public open fun tags(vararg `value`: CfnTag): Unit = tags(`value`.toList())

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.cleanrooms.CfnMembership].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The unique ID for the associated collaboration.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cleanrooms-membership.html#cfn-cleanrooms-membership-collaborationidentifier)
     * @param collaborationIdentifier The unique ID for the associated collaboration. 
     */
    public fun collaborationIdentifier(collaborationIdentifier: String)

    /**
     * The default job result configuration for the membership.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cleanrooms-membership.html#cfn-cleanrooms-membership-defaultjobresultconfiguration)
     * @param defaultJobResultConfiguration The default job result configuration for the membership.
     * 
     */
    public fun defaultJobResultConfiguration(defaultJobResultConfiguration: IResolvable)

    /**
     * The default job result configuration for the membership.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cleanrooms-membership.html#cfn-cleanrooms-membership-defaultjobresultconfiguration)
     * @param defaultJobResultConfiguration The default job result configuration for the membership.
     * 
     */
    public
        fun defaultJobResultConfiguration(defaultJobResultConfiguration: MembershipProtectedJobResultConfigurationProperty)

    /**
     * The default job result configuration for the membership.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cleanrooms-membership.html#cfn-cleanrooms-membership-defaultjobresultconfiguration)
     * @param defaultJobResultConfiguration The default job result configuration for the membership.
     * 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("6b8f665ee5f396669cae7f004b8cb9647bb18b036c722e61ea3d3f2e09de165c")
    public
        fun defaultJobResultConfiguration(defaultJobResultConfiguration: MembershipProtectedJobResultConfigurationProperty.Builder.() -> Unit)

    /**
     * The default protected query result configuration as specified by the member who can receive
     * results.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cleanrooms-membership.html#cfn-cleanrooms-membership-defaultresultconfiguration)
     * @param defaultResultConfiguration The default protected query result configuration as
     * specified by the member who can receive results. 
     */
    public fun defaultResultConfiguration(defaultResultConfiguration: IResolvable)

    /**
     * The default protected query result configuration as specified by the member who can receive
     * results.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cleanrooms-membership.html#cfn-cleanrooms-membership-defaultresultconfiguration)
     * @param defaultResultConfiguration The default protected query result configuration as
     * specified by the member who can receive results. 
     */
    public
        fun defaultResultConfiguration(defaultResultConfiguration: MembershipProtectedQueryResultConfigurationProperty)

    /**
     * The default protected query result configuration as specified by the member who can receive
     * results.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cleanrooms-membership.html#cfn-cleanrooms-membership-defaultresultconfiguration)
     * @param defaultResultConfiguration The default protected query result configuration as
     * specified by the member who can receive results. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("ff10055830626e7a3e8e88058441fda25c39c687a5dc20f0ad94ad925fbcf884")
    public
        fun defaultResultConfiguration(defaultResultConfiguration: MembershipProtectedQueryResultConfigurationProperty.Builder.() -> Unit)

    /**
     * An indicator as to whether job logging has been enabled or disabled for the collaboration.
     *
     * When `ENABLED` , AWS Clean Rooms logs details about jobs run within this collaboration and
     * those logs can be viewed in Amazon CloudWatch Logs. The default value is `DISABLED` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cleanrooms-membership.html#cfn-cleanrooms-membership-joblogstatus)
     * @param jobLogStatus An indicator as to whether job logging has been enabled or disabled for
     * the collaboration. 
     */
    public fun jobLogStatus(jobLogStatus: String)

    /**
     * The payment responsibilities accepted by the collaboration member.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cleanrooms-membership.html#cfn-cleanrooms-membership-paymentconfiguration)
     * @param paymentConfiguration The payment responsibilities accepted by the collaboration
     * member. 
     */
    public fun paymentConfiguration(paymentConfiguration: IResolvable)

    /**
     * The payment responsibilities accepted by the collaboration member.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cleanrooms-membership.html#cfn-cleanrooms-membership-paymentconfiguration)
     * @param paymentConfiguration The payment responsibilities accepted by the collaboration
     * member. 
     */
    public fun paymentConfiguration(paymentConfiguration: MembershipPaymentConfigurationProperty)

    /**
     * The payment responsibilities accepted by the collaboration member.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cleanrooms-membership.html#cfn-cleanrooms-membership-paymentconfiguration)
     * @param paymentConfiguration The payment responsibilities accepted by the collaboration
     * member. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("9448e8539ccbb7c90896b2c06fdc1dc42d633ae9b6cd07facc40e0ff0d79fe3b")
    public
        fun paymentConfiguration(paymentConfiguration: MembershipPaymentConfigurationProperty.Builder.() -> Unit)

    /**
     * An indicator as to whether query logging has been enabled or disabled for the membership.
     *
     * When `ENABLED` , AWS Clean Rooms logs details about queries run within this collaboration and
     * those logs can be viewed in Amazon CloudWatch Logs. The default value is `DISABLED` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cleanrooms-membership.html#cfn-cleanrooms-membership-querylogstatus)
     * @param queryLogStatus An indicator as to whether query logging has been enabled or disabled
     * for the membership. 
     */
    public fun queryLogStatus(queryLogStatus: String)

    /**
     * An optional label that you can assign to a resource when you create it.
     *
     * Each tag consists of a key and an optional value, both of which you define. When you use
     * tagging, you can also use tag-based access control in IAM policies to control access to this
     * resource.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cleanrooms-membership.html#cfn-cleanrooms-membership-tags)
     * @param tags An optional label that you can assign to a resource when you create it. 
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * An optional label that you can assign to a resource when you create it.
     *
     * Each tag consists of a key and an optional value, both of which you define. When you use
     * tagging, you can also use tag-based access control in IAM policies to control access to this
     * resource.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cleanrooms-membership.html#cfn-cleanrooms-membership-tags)
     * @param tags An optional label that you can assign to a resource when you create it. 
     */
    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.cleanrooms.CfnMembership.Builder =
        software.amazon.awscdk.services.cleanrooms.CfnMembership.Builder.create(scope, id)

    /**
     * The unique ID for the associated collaboration.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cleanrooms-membership.html#cfn-cleanrooms-membership-collaborationidentifier)
     * @param collaborationIdentifier The unique ID for the associated collaboration. 
     */
    override fun collaborationIdentifier(collaborationIdentifier: String) {
      cdkBuilder.collaborationIdentifier(collaborationIdentifier)
    }

    /**
     * The default job result configuration for the membership.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cleanrooms-membership.html#cfn-cleanrooms-membership-defaultjobresultconfiguration)
     * @param defaultJobResultConfiguration The default job result configuration for the membership.
     * 
     */
    override fun defaultJobResultConfiguration(defaultJobResultConfiguration: IResolvable) {
      cdkBuilder.defaultJobResultConfiguration(defaultJobResultConfiguration.let(IResolvable.Companion::unwrap))
    }

    /**
     * The default job result configuration for the membership.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cleanrooms-membership.html#cfn-cleanrooms-membership-defaultjobresultconfiguration)
     * @param defaultJobResultConfiguration The default job result configuration for the membership.
     * 
     */
    override
        fun defaultJobResultConfiguration(defaultJobResultConfiguration: MembershipProtectedJobResultConfigurationProperty) {
      cdkBuilder.defaultJobResultConfiguration(defaultJobResultConfiguration.let(MembershipProtectedJobResultConfigurationProperty.Companion::unwrap))
    }

    /**
     * The default job result configuration for the membership.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cleanrooms-membership.html#cfn-cleanrooms-membership-defaultjobresultconfiguration)
     * @param defaultJobResultConfiguration The default job result configuration for the membership.
     * 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("6b8f665ee5f396669cae7f004b8cb9647bb18b036c722e61ea3d3f2e09de165c")
    override
        fun defaultJobResultConfiguration(defaultJobResultConfiguration: MembershipProtectedJobResultConfigurationProperty.Builder.() -> Unit):
        Unit =
        defaultJobResultConfiguration(MembershipProtectedJobResultConfigurationProperty(defaultJobResultConfiguration))

    /**
     * The default protected query result configuration as specified by the member who can receive
     * results.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cleanrooms-membership.html#cfn-cleanrooms-membership-defaultresultconfiguration)
     * @param defaultResultConfiguration The default protected query result configuration as
     * specified by the member who can receive results. 
     */
    override fun defaultResultConfiguration(defaultResultConfiguration: IResolvable) {
      cdkBuilder.defaultResultConfiguration(defaultResultConfiguration.let(IResolvable.Companion::unwrap))
    }

    /**
     * The default protected query result configuration as specified by the member who can receive
     * results.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cleanrooms-membership.html#cfn-cleanrooms-membership-defaultresultconfiguration)
     * @param defaultResultConfiguration The default protected query result configuration as
     * specified by the member who can receive results. 
     */
    override
        fun defaultResultConfiguration(defaultResultConfiguration: MembershipProtectedQueryResultConfigurationProperty) {
      cdkBuilder.defaultResultConfiguration(defaultResultConfiguration.let(MembershipProtectedQueryResultConfigurationProperty.Companion::unwrap))
    }

    /**
     * The default protected query result configuration as specified by the member who can receive
     * results.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cleanrooms-membership.html#cfn-cleanrooms-membership-defaultresultconfiguration)
     * @param defaultResultConfiguration The default protected query result configuration as
     * specified by the member who can receive results. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("ff10055830626e7a3e8e88058441fda25c39c687a5dc20f0ad94ad925fbcf884")
    override
        fun defaultResultConfiguration(defaultResultConfiguration: MembershipProtectedQueryResultConfigurationProperty.Builder.() -> Unit):
        Unit =
        defaultResultConfiguration(MembershipProtectedQueryResultConfigurationProperty(defaultResultConfiguration))

    /**
     * An indicator as to whether job logging has been enabled or disabled for the collaboration.
     *
     * When `ENABLED` , AWS Clean Rooms logs details about jobs run within this collaboration and
     * those logs can be viewed in Amazon CloudWatch Logs. The default value is `DISABLED` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cleanrooms-membership.html#cfn-cleanrooms-membership-joblogstatus)
     * @param jobLogStatus An indicator as to whether job logging has been enabled or disabled for
     * the collaboration. 
     */
    override fun jobLogStatus(jobLogStatus: String) {
      cdkBuilder.jobLogStatus(jobLogStatus)
    }

    /**
     * The payment responsibilities accepted by the collaboration member.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cleanrooms-membership.html#cfn-cleanrooms-membership-paymentconfiguration)
     * @param paymentConfiguration The payment responsibilities accepted by the collaboration
     * member. 
     */
    override fun paymentConfiguration(paymentConfiguration: IResolvable) {
      cdkBuilder.paymentConfiguration(paymentConfiguration.let(IResolvable.Companion::unwrap))
    }

    /**
     * The payment responsibilities accepted by the collaboration member.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cleanrooms-membership.html#cfn-cleanrooms-membership-paymentconfiguration)
     * @param paymentConfiguration The payment responsibilities accepted by the collaboration
     * member. 
     */
    override
        fun paymentConfiguration(paymentConfiguration: MembershipPaymentConfigurationProperty) {
      cdkBuilder.paymentConfiguration(paymentConfiguration.let(MembershipPaymentConfigurationProperty.Companion::unwrap))
    }

    /**
     * The payment responsibilities accepted by the collaboration member.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cleanrooms-membership.html#cfn-cleanrooms-membership-paymentconfiguration)
     * @param paymentConfiguration The payment responsibilities accepted by the collaboration
     * member. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("9448e8539ccbb7c90896b2c06fdc1dc42d633ae9b6cd07facc40e0ff0d79fe3b")
    override
        fun paymentConfiguration(paymentConfiguration: MembershipPaymentConfigurationProperty.Builder.() -> Unit):
        Unit = paymentConfiguration(MembershipPaymentConfigurationProperty(paymentConfiguration))

    /**
     * An indicator as to whether query logging has been enabled or disabled for the membership.
     *
     * When `ENABLED` , AWS Clean Rooms logs details about queries run within this collaboration and
     * those logs can be viewed in Amazon CloudWatch Logs. The default value is `DISABLED` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cleanrooms-membership.html#cfn-cleanrooms-membership-querylogstatus)
     * @param queryLogStatus An indicator as to whether query logging has been enabled or disabled
     * for the membership. 
     */
    override fun queryLogStatus(queryLogStatus: String) {
      cdkBuilder.queryLogStatus(queryLogStatus)
    }

    /**
     * An optional label that you can assign to a resource when you create it.
     *
     * Each tag consists of a key and an optional value, both of which you define. When you use
     * tagging, you can also use tag-based access control in IAM policies to control access to this
     * resource.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cleanrooms-membership.html#cfn-cleanrooms-membership-tags)
     * @param tags An optional label that you can assign to a resource when you create it. 
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag.Companion::unwrap))
    }

    /**
     * An optional label that you can assign to a resource when you create it.
     *
     * Each tag consists of a key and an optional value, both of which you define. When you use
     * tagging, you can also use tag-based access control in IAM policies to control access to this
     * resource.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cleanrooms-membership.html#cfn-cleanrooms-membership-tags)
     * @param tags An optional label that you can assign to a resource when you create it. 
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.cleanrooms.CfnMembership =
        cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.cleanrooms.CfnMembership.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnMembership {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnMembership(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.cleanrooms.CfnMembership):
        CfnMembership = CfnMembership(cdkObject)

    internal fun unwrap(wrapped: CfnMembership):
        software.amazon.awscdk.services.cleanrooms.CfnMembership = wrapped.cdkObject as
        software.amazon.awscdk.services.cleanrooms.CfnMembership
  }

  /**
   * An object representing the payment responsibilities accepted by the collaboration member for
   * query and job compute costs.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.cleanrooms.*;
   * MembershipJobComputePaymentConfigProperty membershipJobComputePaymentConfigProperty =
   * MembershipJobComputePaymentConfigProperty.builder()
   * .isResponsible(false)
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cleanrooms-membership-membershipjobcomputepaymentconfig.html)
   */
  public interface MembershipJobComputePaymentConfigProperty {
    /**
     * Indicates whether the collaboration member has accepted to pay for job compute costs ( `TRUE`
     * ) or has not accepted to pay for query and job compute costs ( `FALSE` ).
     *
     * There is only one member who pays for queries and jobs.
     *
     * An error message is returned for the following reasons:
     *
     * * If you set the value to `FALSE` but you are responsible to pay for query and job compute
     * costs.
     * * If you set the value to `TRUE` but you are not responsible to pay for query and job compute
     * costs.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cleanrooms-membership-membershipjobcomputepaymentconfig.html#cfn-cleanrooms-membership-membershipjobcomputepaymentconfig-isresponsible)
     */
    public fun isResponsible(): Any

    /**
     * A builder for [MembershipJobComputePaymentConfigProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param isResponsible Indicates whether the collaboration member has accepted to pay for job
       * compute costs ( `TRUE` ) or has not accepted to pay for query and job compute costs ( `FALSE`
       * ). 
       * There is only one member who pays for queries and jobs.
       *
       * An error message is returned for the following reasons:
       *
       * * If you set the value to `FALSE` but you are responsible to pay for query and job compute
       * costs.
       * * If you set the value to `TRUE` but you are not responsible to pay for query and job
       * compute costs.
       */
      public fun isResponsible(isResponsible: Boolean)

      /**
       * @param isResponsible Indicates whether the collaboration member has accepted to pay for job
       * compute costs ( `TRUE` ) or has not accepted to pay for query and job compute costs ( `FALSE`
       * ). 
       * There is only one member who pays for queries and jobs.
       *
       * An error message is returned for the following reasons:
       *
       * * If you set the value to `FALSE` but you are responsible to pay for query and job compute
       * costs.
       * * If you set the value to `TRUE` but you are not responsible to pay for query and job
       * compute costs.
       */
      public fun isResponsible(isResponsible: IResolvable)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.cleanrooms.CfnMembership.MembershipJobComputePaymentConfigProperty.Builder
          =
          software.amazon.awscdk.services.cleanrooms.CfnMembership.MembershipJobComputePaymentConfigProperty.builder()

      /**
       * @param isResponsible Indicates whether the collaboration member has accepted to pay for job
       * compute costs ( `TRUE` ) or has not accepted to pay for query and job compute costs ( `FALSE`
       * ). 
       * There is only one member who pays for queries and jobs.
       *
       * An error message is returned for the following reasons:
       *
       * * If you set the value to `FALSE` but you are responsible to pay for query and job compute
       * costs.
       * * If you set the value to `TRUE` but you are not responsible to pay for query and job
       * compute costs.
       */
      override fun isResponsible(isResponsible: Boolean) {
        cdkBuilder.isResponsible(isResponsible)
      }

      /**
       * @param isResponsible Indicates whether the collaboration member has accepted to pay for job
       * compute costs ( `TRUE` ) or has not accepted to pay for query and job compute costs ( `FALSE`
       * ). 
       * There is only one member who pays for queries and jobs.
       *
       * An error message is returned for the following reasons:
       *
       * * If you set the value to `FALSE` but you are responsible to pay for query and job compute
       * costs.
       * * If you set the value to `TRUE` but you are not responsible to pay for query and job
       * compute costs.
       */
      override fun isResponsible(isResponsible: IResolvable) {
        cdkBuilder.isResponsible(isResponsible.let(IResolvable.Companion::unwrap))
      }

      public fun build():
          software.amazon.awscdk.services.cleanrooms.CfnMembership.MembershipJobComputePaymentConfigProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.cleanrooms.CfnMembership.MembershipJobComputePaymentConfigProperty,
    ) : CdkObject(cdkObject),
        MembershipJobComputePaymentConfigProperty {
      /**
       * Indicates whether the collaboration member has accepted to pay for job compute costs (
       * `TRUE` ) or has not accepted to pay for query and job compute costs ( `FALSE` ).
       *
       * There is only one member who pays for queries and jobs.
       *
       * An error message is returned for the following reasons:
       *
       * * If you set the value to `FALSE` but you are responsible to pay for query and job compute
       * costs.
       * * If you set the value to `TRUE` but you are not responsible to pay for query and job
       * compute costs.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cleanrooms-membership-membershipjobcomputepaymentconfig.html#cfn-cleanrooms-membership-membershipjobcomputepaymentconfig-isresponsible)
       */
      override fun isResponsible(): Any = unwrap(this).getIsResponsible()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          MembershipJobComputePaymentConfigProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.cleanrooms.CfnMembership.MembershipJobComputePaymentConfigProperty):
          MembershipJobComputePaymentConfigProperty = CdkObjectWrappers.wrap(cdkObject) as?
          MembershipJobComputePaymentConfigProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: MembershipJobComputePaymentConfigProperty):
          software.amazon.awscdk.services.cleanrooms.CfnMembership.MembershipJobComputePaymentConfigProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.cleanrooms.CfnMembership.MembershipJobComputePaymentConfigProperty
    }
  }

  /**
   * An object representing the collaboration member's machine learning payment responsibilities set
   * by the collaboration creator.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.cleanrooms.*;
   * MembershipMLPaymentConfigProperty membershipMLPaymentConfigProperty =
   * MembershipMLPaymentConfigProperty.builder()
   * .modelInference(MembershipModelInferencePaymentConfigProperty.builder()
   * .isResponsible(false)
   * .build())
   * .modelTraining(MembershipModelTrainingPaymentConfigProperty.builder()
   * .isResponsible(false)
   * .build())
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cleanrooms-membership-membershipmlpaymentconfig.html)
   */
  public interface MembershipMLPaymentConfigProperty {
    /**
     * The payment responsibilities accepted by the member for model inference.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cleanrooms-membership-membershipmlpaymentconfig.html#cfn-cleanrooms-membership-membershipmlpaymentconfig-modelinference)
     */
    public fun modelInference(): Any? = unwrap(this).getModelInference()

    /**
     * The payment responsibilities accepted by the member for model training.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cleanrooms-membership-membershipmlpaymentconfig.html#cfn-cleanrooms-membership-membershipmlpaymentconfig-modeltraining)
     */
    public fun modelTraining(): Any? = unwrap(this).getModelTraining()

    /**
     * A builder for [MembershipMLPaymentConfigProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param modelInference The payment responsibilities accepted by the member for model
       * inference.
       */
      public fun modelInference(modelInference: IResolvable)

      /**
       * @param modelInference The payment responsibilities accepted by the member for model
       * inference.
       */
      public fun modelInference(modelInference: MembershipModelInferencePaymentConfigProperty)

      /**
       * @param modelInference The payment responsibilities accepted by the member for model
       * inference.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("f75ca1787818d4b78a8756131e69b2c260e19c1dfea3ef1a21edb648c15a2feb")
      public
          fun modelInference(modelInference: MembershipModelInferencePaymentConfigProperty.Builder.() -> Unit)

      /**
       * @param modelTraining The payment responsibilities accepted by the member for model
       * training.
       */
      public fun modelTraining(modelTraining: IResolvable)

      /**
       * @param modelTraining The payment responsibilities accepted by the member for model
       * training.
       */
      public fun modelTraining(modelTraining: MembershipModelTrainingPaymentConfigProperty)

      /**
       * @param modelTraining The payment responsibilities accepted by the member for model
       * training.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("398bf5c8f578e02a109b247e712a41392b28f84d5745ff5f362a32b25a6feae9")
      public
          fun modelTraining(modelTraining: MembershipModelTrainingPaymentConfigProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.cleanrooms.CfnMembership.MembershipMLPaymentConfigProperty.Builder
          =
          software.amazon.awscdk.services.cleanrooms.CfnMembership.MembershipMLPaymentConfigProperty.builder()

      /**
       * @param modelInference The payment responsibilities accepted by the member for model
       * inference.
       */
      override fun modelInference(modelInference: IResolvable) {
        cdkBuilder.modelInference(modelInference.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param modelInference The payment responsibilities accepted by the member for model
       * inference.
       */
      override fun modelInference(modelInference: MembershipModelInferencePaymentConfigProperty) {
        cdkBuilder.modelInference(modelInference.let(MembershipModelInferencePaymentConfigProperty.Companion::unwrap))
      }

      /**
       * @param modelInference The payment responsibilities accepted by the member for model
       * inference.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("f75ca1787818d4b78a8756131e69b2c260e19c1dfea3ef1a21edb648c15a2feb")
      override
          fun modelInference(modelInference: MembershipModelInferencePaymentConfigProperty.Builder.() -> Unit):
          Unit = modelInference(MembershipModelInferencePaymentConfigProperty(modelInference))

      /**
       * @param modelTraining The payment responsibilities accepted by the member for model
       * training.
       */
      override fun modelTraining(modelTraining: IResolvable) {
        cdkBuilder.modelTraining(modelTraining.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param modelTraining The payment responsibilities accepted by the member for model
       * training.
       */
      override fun modelTraining(modelTraining: MembershipModelTrainingPaymentConfigProperty) {
        cdkBuilder.modelTraining(modelTraining.let(MembershipModelTrainingPaymentConfigProperty.Companion::unwrap))
      }

      /**
       * @param modelTraining The payment responsibilities accepted by the member for model
       * training.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("398bf5c8f578e02a109b247e712a41392b28f84d5745ff5f362a32b25a6feae9")
      override
          fun modelTraining(modelTraining: MembershipModelTrainingPaymentConfigProperty.Builder.() -> Unit):
          Unit = modelTraining(MembershipModelTrainingPaymentConfigProperty(modelTraining))

      public fun build():
          software.amazon.awscdk.services.cleanrooms.CfnMembership.MembershipMLPaymentConfigProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.cleanrooms.CfnMembership.MembershipMLPaymentConfigProperty,
    ) : CdkObject(cdkObject),
        MembershipMLPaymentConfigProperty {
      /**
       * The payment responsibilities accepted by the member for model inference.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cleanrooms-membership-membershipmlpaymentconfig.html#cfn-cleanrooms-membership-membershipmlpaymentconfig-modelinference)
       */
      override fun modelInference(): Any? = unwrap(this).getModelInference()

      /**
       * The payment responsibilities accepted by the member for model training.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cleanrooms-membership-membershipmlpaymentconfig.html#cfn-cleanrooms-membership-membershipmlpaymentconfig-modeltraining)
       */
      override fun modelTraining(): Any? = unwrap(this).getModelTraining()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          MembershipMLPaymentConfigProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.cleanrooms.CfnMembership.MembershipMLPaymentConfigProperty):
          MembershipMLPaymentConfigProperty = CdkObjectWrappers.wrap(cdkObject) as?
          MembershipMLPaymentConfigProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: MembershipMLPaymentConfigProperty):
          software.amazon.awscdk.services.cleanrooms.CfnMembership.MembershipMLPaymentConfigProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.cleanrooms.CfnMembership.MembershipMLPaymentConfigProperty
    }
  }

  /**
   * An object representing the collaboration member's model inference payment responsibilities set
   * by the collaboration creator.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.cleanrooms.*;
   * MembershipModelInferencePaymentConfigProperty membershipModelInferencePaymentConfigProperty =
   * MembershipModelInferencePaymentConfigProperty.builder()
   * .isResponsible(false)
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cleanrooms-membership-membershipmodelinferencepaymentconfig.html)
   */
  public interface MembershipModelInferencePaymentConfigProperty {
    /**
     * Indicates whether the collaboration member has accepted to pay for model inference costs (
     * `TRUE` ) or has not accepted to pay for model inference costs ( `FALSE` ).
     *
     * If the collaboration creator has not specified anyone to pay for model inference costs, then
     * the member who can query is the default payer.
     *
     * An error message is returned for the following reasons:
     *
     * * If you set the value to `FALSE` but you are responsible to pay for model inference costs.
     * * If you set the value to `TRUE` but you are not responsible to pay for model inference
     * costs.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cleanrooms-membership-membershipmodelinferencepaymentconfig.html#cfn-cleanrooms-membership-membershipmodelinferencepaymentconfig-isresponsible)
     */
    public fun isResponsible(): Any

    /**
     * A builder for [MembershipModelInferencePaymentConfigProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param isResponsible Indicates whether the collaboration member has accepted to pay for
       * model inference costs ( `TRUE` ) or has not accepted to pay for model inference costs (
       * `FALSE` ). 
       * If the collaboration creator has not specified anyone to pay for model inference costs,
       * then the member who can query is the default payer.
       *
       * An error message is returned for the following reasons:
       *
       * * If you set the value to `FALSE` but you are responsible to pay for model inference costs.
       * * If you set the value to `TRUE` but you are not responsible to pay for model inference
       * costs.
       */
      public fun isResponsible(isResponsible: Boolean)

      /**
       * @param isResponsible Indicates whether the collaboration member has accepted to pay for
       * model inference costs ( `TRUE` ) or has not accepted to pay for model inference costs (
       * `FALSE` ). 
       * If the collaboration creator has not specified anyone to pay for model inference costs,
       * then the member who can query is the default payer.
       *
       * An error message is returned for the following reasons:
       *
       * * If you set the value to `FALSE` but you are responsible to pay for model inference costs.
       * * If you set the value to `TRUE` but you are not responsible to pay for model inference
       * costs.
       */
      public fun isResponsible(isResponsible: IResolvable)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.cleanrooms.CfnMembership.MembershipModelInferencePaymentConfigProperty.Builder
          =
          software.amazon.awscdk.services.cleanrooms.CfnMembership.MembershipModelInferencePaymentConfigProperty.builder()

      /**
       * @param isResponsible Indicates whether the collaboration member has accepted to pay for
       * model inference costs ( `TRUE` ) or has not accepted to pay for model inference costs (
       * `FALSE` ). 
       * If the collaboration creator has not specified anyone to pay for model inference costs,
       * then the member who can query is the default payer.
       *
       * An error message is returned for the following reasons:
       *
       * * If you set the value to `FALSE` but you are responsible to pay for model inference costs.
       * * If you set the value to `TRUE` but you are not responsible to pay for model inference
       * costs.
       */
      override fun isResponsible(isResponsible: Boolean) {
        cdkBuilder.isResponsible(isResponsible)
      }

      /**
       * @param isResponsible Indicates whether the collaboration member has accepted to pay for
       * model inference costs ( `TRUE` ) or has not accepted to pay for model inference costs (
       * `FALSE` ). 
       * If the collaboration creator has not specified anyone to pay for model inference costs,
       * then the member who can query is the default payer.
       *
       * An error message is returned for the following reasons:
       *
       * * If you set the value to `FALSE` but you are responsible to pay for model inference costs.
       * * If you set the value to `TRUE` but you are not responsible to pay for model inference
       * costs.
       */
      override fun isResponsible(isResponsible: IResolvable) {
        cdkBuilder.isResponsible(isResponsible.let(IResolvable.Companion::unwrap))
      }

      public fun build():
          software.amazon.awscdk.services.cleanrooms.CfnMembership.MembershipModelInferencePaymentConfigProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.cleanrooms.CfnMembership.MembershipModelInferencePaymentConfigProperty,
    ) : CdkObject(cdkObject),
        MembershipModelInferencePaymentConfigProperty {
      /**
       * Indicates whether the collaboration member has accepted to pay for model inference costs (
       * `TRUE` ) or has not accepted to pay for model inference costs ( `FALSE` ).
       *
       * If the collaboration creator has not specified anyone to pay for model inference costs,
       * then the member who can query is the default payer.
       *
       * An error message is returned for the following reasons:
       *
       * * If you set the value to `FALSE` but you are responsible to pay for model inference costs.
       * * If you set the value to `TRUE` but you are not responsible to pay for model inference
       * costs.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cleanrooms-membership-membershipmodelinferencepaymentconfig.html#cfn-cleanrooms-membership-membershipmodelinferencepaymentconfig-isresponsible)
       */
      override fun isResponsible(): Any = unwrap(this).getIsResponsible()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          MembershipModelInferencePaymentConfigProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.cleanrooms.CfnMembership.MembershipModelInferencePaymentConfigProperty):
          MembershipModelInferencePaymentConfigProperty = CdkObjectWrappers.wrap(cdkObject) as?
          MembershipModelInferencePaymentConfigProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: MembershipModelInferencePaymentConfigProperty):
          software.amazon.awscdk.services.cleanrooms.CfnMembership.MembershipModelInferencePaymentConfigProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.cleanrooms.CfnMembership.MembershipModelInferencePaymentConfigProperty
    }
  }

  /**
   * An object representing the collaboration member's model training payment responsibilities set
   * by the collaboration creator.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.cleanrooms.*;
   * MembershipModelTrainingPaymentConfigProperty membershipModelTrainingPaymentConfigProperty =
   * MembershipModelTrainingPaymentConfigProperty.builder()
   * .isResponsible(false)
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cleanrooms-membership-membershipmodeltrainingpaymentconfig.html)
   */
  public interface MembershipModelTrainingPaymentConfigProperty {
    /**
     * Indicates whether the collaboration member has accepted to pay for model training costs (
     * `TRUE` ) or has not accepted to pay for model training costs ( `FALSE` ).
     *
     * If the collaboration creator has not specified anyone to pay for model training costs, then
     * the member who can query is the default payer.
     *
     * An error message is returned for the following reasons:
     *
     * * If you set the value to `FALSE` but you are responsible to pay for model training costs.
     * * If you set the value to `TRUE` but you are not responsible to pay for model training costs.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cleanrooms-membership-membershipmodeltrainingpaymentconfig.html#cfn-cleanrooms-membership-membershipmodeltrainingpaymentconfig-isresponsible)
     */
    public fun isResponsible(): Any

    /**
     * A builder for [MembershipModelTrainingPaymentConfigProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param isResponsible Indicates whether the collaboration member has accepted to pay for
       * model training costs ( `TRUE` ) or has not accepted to pay for model training costs ( `FALSE`
       * ). 
       * If the collaboration creator has not specified anyone to pay for model training costs, then
       * the member who can query is the default payer.
       *
       * An error message is returned for the following reasons:
       *
       * * If you set the value to `FALSE` but you are responsible to pay for model training costs.
       * * If you set the value to `TRUE` but you are not responsible to pay for model training
       * costs.
       */
      public fun isResponsible(isResponsible: Boolean)

      /**
       * @param isResponsible Indicates whether the collaboration member has accepted to pay for
       * model training costs ( `TRUE` ) or has not accepted to pay for model training costs ( `FALSE`
       * ). 
       * If the collaboration creator has not specified anyone to pay for model training costs, then
       * the member who can query is the default payer.
       *
       * An error message is returned for the following reasons:
       *
       * * If you set the value to `FALSE` but you are responsible to pay for model training costs.
       * * If you set the value to `TRUE` but you are not responsible to pay for model training
       * costs.
       */
      public fun isResponsible(isResponsible: IResolvable)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.cleanrooms.CfnMembership.MembershipModelTrainingPaymentConfigProperty.Builder
          =
          software.amazon.awscdk.services.cleanrooms.CfnMembership.MembershipModelTrainingPaymentConfigProperty.builder()

      /**
       * @param isResponsible Indicates whether the collaboration member has accepted to pay for
       * model training costs ( `TRUE` ) or has not accepted to pay for model training costs ( `FALSE`
       * ). 
       * If the collaboration creator has not specified anyone to pay for model training costs, then
       * the member who can query is the default payer.
       *
       * An error message is returned for the following reasons:
       *
       * * If you set the value to `FALSE` but you are responsible to pay for model training costs.
       * * If you set the value to `TRUE` but you are not responsible to pay for model training
       * costs.
       */
      override fun isResponsible(isResponsible: Boolean) {
        cdkBuilder.isResponsible(isResponsible)
      }

      /**
       * @param isResponsible Indicates whether the collaboration member has accepted to pay for
       * model training costs ( `TRUE` ) or has not accepted to pay for model training costs ( `FALSE`
       * ). 
       * If the collaboration creator has not specified anyone to pay for model training costs, then
       * the member who can query is the default payer.
       *
       * An error message is returned for the following reasons:
       *
       * * If you set the value to `FALSE` but you are responsible to pay for model training costs.
       * * If you set the value to `TRUE` but you are not responsible to pay for model training
       * costs.
       */
      override fun isResponsible(isResponsible: IResolvable) {
        cdkBuilder.isResponsible(isResponsible.let(IResolvable.Companion::unwrap))
      }

      public fun build():
          software.amazon.awscdk.services.cleanrooms.CfnMembership.MembershipModelTrainingPaymentConfigProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.cleanrooms.CfnMembership.MembershipModelTrainingPaymentConfigProperty,
    ) : CdkObject(cdkObject),
        MembershipModelTrainingPaymentConfigProperty {
      /**
       * Indicates whether the collaboration member has accepted to pay for model training costs (
       * `TRUE` ) or has not accepted to pay for model training costs ( `FALSE` ).
       *
       * If the collaboration creator has not specified anyone to pay for model training costs, then
       * the member who can query is the default payer.
       *
       * An error message is returned for the following reasons:
       *
       * * If you set the value to `FALSE` but you are responsible to pay for model training costs.
       * * If you set the value to `TRUE` but you are not responsible to pay for model training
       * costs.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cleanrooms-membership-membershipmodeltrainingpaymentconfig.html#cfn-cleanrooms-membership-membershipmodeltrainingpaymentconfig-isresponsible)
       */
      override fun isResponsible(): Any = unwrap(this).getIsResponsible()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          MembershipModelTrainingPaymentConfigProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.cleanrooms.CfnMembership.MembershipModelTrainingPaymentConfigProperty):
          MembershipModelTrainingPaymentConfigProperty = CdkObjectWrappers.wrap(cdkObject) as?
          MembershipModelTrainingPaymentConfigProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: MembershipModelTrainingPaymentConfigProperty):
          software.amazon.awscdk.services.cleanrooms.CfnMembership.MembershipModelTrainingPaymentConfigProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.cleanrooms.CfnMembership.MembershipModelTrainingPaymentConfigProperty
    }
  }

  /**
   * An object representing the payment responsibilities accepted by the collaboration member.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.cleanrooms.*;
   * MembershipPaymentConfigurationProperty membershipPaymentConfigurationProperty =
   * MembershipPaymentConfigurationProperty.builder()
   * .queryCompute(MembershipQueryComputePaymentConfigProperty.builder()
   * .isResponsible(false)
   * .build())
   * // the properties below are optional
   * .jobCompute(MembershipJobComputePaymentConfigProperty.builder()
   * .isResponsible(false)
   * .build())
   * .machineLearning(MembershipMLPaymentConfigProperty.builder()
   * .modelInference(MembershipModelInferencePaymentConfigProperty.builder()
   * .isResponsible(false)
   * .build())
   * .modelTraining(MembershipModelTrainingPaymentConfigProperty.builder()
   * .isResponsible(false)
   * .build())
   * .build())
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cleanrooms-membership-membershippaymentconfiguration.html)
   */
  public interface MembershipPaymentConfigurationProperty {
    /**
     * The payment responsibilities accepted by the collaboration member for job compute costs.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cleanrooms-membership-membershippaymentconfiguration.html#cfn-cleanrooms-membership-membershippaymentconfiguration-jobcompute)
     */
    public fun jobCompute(): Any? = unwrap(this).getJobCompute()

    /**
     * The payment responsibilities accepted by the collaboration member for machine learning costs.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cleanrooms-membership-membershippaymentconfiguration.html#cfn-cleanrooms-membership-membershippaymentconfiguration-machinelearning)
     */
    public fun machineLearning(): Any? = unwrap(this).getMachineLearning()

    /**
     * The payment responsibilities accepted by the collaboration member for query compute costs.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cleanrooms-membership-membershippaymentconfiguration.html#cfn-cleanrooms-membership-membershippaymentconfiguration-querycompute)
     */
    public fun queryCompute(): Any

    /**
     * A builder for [MembershipPaymentConfigurationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param jobCompute The payment responsibilities accepted by the collaboration member for job
       * compute costs.
       */
      public fun jobCompute(jobCompute: IResolvable)

      /**
       * @param jobCompute The payment responsibilities accepted by the collaboration member for job
       * compute costs.
       */
      public fun jobCompute(jobCompute: MembershipJobComputePaymentConfigProperty)

      /**
       * @param jobCompute The payment responsibilities accepted by the collaboration member for job
       * compute costs.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("0030cbbc87f91b56bb8b73eed5258b91ea7620b5ef69eb6a90505d4f50123aa0")
      public
          fun jobCompute(jobCompute: MembershipJobComputePaymentConfigProperty.Builder.() -> Unit)

      /**
       * @param machineLearning The payment responsibilities accepted by the collaboration member
       * for machine learning costs.
       */
      public fun machineLearning(machineLearning: IResolvable)

      /**
       * @param machineLearning The payment responsibilities accepted by the collaboration member
       * for machine learning costs.
       */
      public fun machineLearning(machineLearning: MembershipMLPaymentConfigProperty)

      /**
       * @param machineLearning The payment responsibilities accepted by the collaboration member
       * for machine learning costs.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("a41e2efe1035d0f473867bd2935f715633d45a4b0fb66f2ab6e9560303ab425e")
      public
          fun machineLearning(machineLearning: MembershipMLPaymentConfigProperty.Builder.() -> Unit)

      /**
       * @param queryCompute The payment responsibilities accepted by the collaboration member for
       * query compute costs. 
       */
      public fun queryCompute(queryCompute: IResolvable)

      /**
       * @param queryCompute The payment responsibilities accepted by the collaboration member for
       * query compute costs. 
       */
      public fun queryCompute(queryCompute: MembershipQueryComputePaymentConfigProperty)

      /**
       * @param queryCompute The payment responsibilities accepted by the collaboration member for
       * query compute costs. 
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("99db9738787f7ef099be61fcf4a886932773ebc185510d1ce209505a4bf570fe")
      public
          fun queryCompute(queryCompute: MembershipQueryComputePaymentConfigProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.cleanrooms.CfnMembership.MembershipPaymentConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.cleanrooms.CfnMembership.MembershipPaymentConfigurationProperty.builder()

      /**
       * @param jobCompute The payment responsibilities accepted by the collaboration member for job
       * compute costs.
       */
      override fun jobCompute(jobCompute: IResolvable) {
        cdkBuilder.jobCompute(jobCompute.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param jobCompute The payment responsibilities accepted by the collaboration member for job
       * compute costs.
       */
      override fun jobCompute(jobCompute: MembershipJobComputePaymentConfigProperty) {
        cdkBuilder.jobCompute(jobCompute.let(MembershipJobComputePaymentConfigProperty.Companion::unwrap))
      }

      /**
       * @param jobCompute The payment responsibilities accepted by the collaboration member for job
       * compute costs.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("0030cbbc87f91b56bb8b73eed5258b91ea7620b5ef69eb6a90505d4f50123aa0")
      override
          fun jobCompute(jobCompute: MembershipJobComputePaymentConfigProperty.Builder.() -> Unit):
          Unit = jobCompute(MembershipJobComputePaymentConfigProperty(jobCompute))

      /**
       * @param machineLearning The payment responsibilities accepted by the collaboration member
       * for machine learning costs.
       */
      override fun machineLearning(machineLearning: IResolvable) {
        cdkBuilder.machineLearning(machineLearning.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param machineLearning The payment responsibilities accepted by the collaboration member
       * for machine learning costs.
       */
      override fun machineLearning(machineLearning: MembershipMLPaymentConfigProperty) {
        cdkBuilder.machineLearning(machineLearning.let(MembershipMLPaymentConfigProperty.Companion::unwrap))
      }

      /**
       * @param machineLearning The payment responsibilities accepted by the collaboration member
       * for machine learning costs.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("a41e2efe1035d0f473867bd2935f715633d45a4b0fb66f2ab6e9560303ab425e")
      override
          fun machineLearning(machineLearning: MembershipMLPaymentConfigProperty.Builder.() -> Unit):
          Unit = machineLearning(MembershipMLPaymentConfigProperty(machineLearning))

      /**
       * @param queryCompute The payment responsibilities accepted by the collaboration member for
       * query compute costs. 
       */
      override fun queryCompute(queryCompute: IResolvable) {
        cdkBuilder.queryCompute(queryCompute.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param queryCompute The payment responsibilities accepted by the collaboration member for
       * query compute costs. 
       */
      override fun queryCompute(queryCompute: MembershipQueryComputePaymentConfigProperty) {
        cdkBuilder.queryCompute(queryCompute.let(MembershipQueryComputePaymentConfigProperty.Companion::unwrap))
      }

      /**
       * @param queryCompute The payment responsibilities accepted by the collaboration member for
       * query compute costs. 
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("99db9738787f7ef099be61fcf4a886932773ebc185510d1ce209505a4bf570fe")
      override
          fun queryCompute(queryCompute: MembershipQueryComputePaymentConfigProperty.Builder.() -> Unit):
          Unit = queryCompute(MembershipQueryComputePaymentConfigProperty(queryCompute))

      public fun build():
          software.amazon.awscdk.services.cleanrooms.CfnMembership.MembershipPaymentConfigurationProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.cleanrooms.CfnMembership.MembershipPaymentConfigurationProperty,
    ) : CdkObject(cdkObject),
        MembershipPaymentConfigurationProperty {
      /**
       * The payment responsibilities accepted by the collaboration member for job compute costs.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cleanrooms-membership-membershippaymentconfiguration.html#cfn-cleanrooms-membership-membershippaymentconfiguration-jobcompute)
       */
      override fun jobCompute(): Any? = unwrap(this).getJobCompute()

      /**
       * The payment responsibilities accepted by the collaboration member for machine learning
       * costs.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cleanrooms-membership-membershippaymentconfiguration.html#cfn-cleanrooms-membership-membershippaymentconfiguration-machinelearning)
       */
      override fun machineLearning(): Any? = unwrap(this).getMachineLearning()

      /**
       * The payment responsibilities accepted by the collaboration member for query compute costs.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cleanrooms-membership-membershippaymentconfiguration.html#cfn-cleanrooms-membership-membershippaymentconfiguration-querycompute)
       */
      override fun queryCompute(): Any = unwrap(this).getQueryCompute()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          MembershipPaymentConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.cleanrooms.CfnMembership.MembershipPaymentConfigurationProperty):
          MembershipPaymentConfigurationProperty = CdkObjectWrappers.wrap(cdkObject) as?
          MembershipPaymentConfigurationProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: MembershipPaymentConfigurationProperty):
          software.amazon.awscdk.services.cleanrooms.CfnMembership.MembershipPaymentConfigurationProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.cleanrooms.CfnMembership.MembershipPaymentConfigurationProperty
    }
  }

  /**
   * Contains configurations for protected job results.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.cleanrooms.*;
   * MembershipProtectedJobOutputConfigurationProperty
   * membershipProtectedJobOutputConfigurationProperty =
   * MembershipProtectedJobOutputConfigurationProperty.builder()
   * .s3(ProtectedJobS3OutputConfigurationInputProperty.builder()
   * .bucket("bucket")
   * // the properties below are optional
   * .keyPrefix("keyPrefix")
   * .build())
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cleanrooms-membership-membershipprotectedjoboutputconfiguration.html)
   */
  public interface MembershipProtectedJobOutputConfigurationProperty {
    /**
     * Contains the configuration to write the job results to S3.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cleanrooms-membership-membershipprotectedjoboutputconfiguration.html#cfn-cleanrooms-membership-membershipprotectedjoboutputconfiguration-s3)
     */
    public fun s3(): Any

    /**
     * A builder for [MembershipProtectedJobOutputConfigurationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param s3 Contains the configuration to write the job results to S3. 
       */
      public fun s3(s3: IResolvable)

      /**
       * @param s3 Contains the configuration to write the job results to S3. 
       */
      public fun s3(s3: ProtectedJobS3OutputConfigurationInputProperty)

      /**
       * @param s3 Contains the configuration to write the job results to S3. 
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("7bb9cfe12282eabacd9ea868fa38e0d942f01c1fa07bc4375f2c8a4514ed74c7")
      public fun s3(s3: ProtectedJobS3OutputConfigurationInputProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.cleanrooms.CfnMembership.MembershipProtectedJobOutputConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.cleanrooms.CfnMembership.MembershipProtectedJobOutputConfigurationProperty.builder()

      /**
       * @param s3 Contains the configuration to write the job results to S3. 
       */
      override fun s3(s3: IResolvable) {
        cdkBuilder.s3(s3.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param s3 Contains the configuration to write the job results to S3. 
       */
      override fun s3(s3: ProtectedJobS3OutputConfigurationInputProperty) {
        cdkBuilder.s3(s3.let(ProtectedJobS3OutputConfigurationInputProperty.Companion::unwrap))
      }

      /**
       * @param s3 Contains the configuration to write the job results to S3. 
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("7bb9cfe12282eabacd9ea868fa38e0d942f01c1fa07bc4375f2c8a4514ed74c7")
      override fun s3(s3: ProtectedJobS3OutputConfigurationInputProperty.Builder.() -> Unit): Unit =
          s3(ProtectedJobS3OutputConfigurationInputProperty(s3))

      public fun build():
          software.amazon.awscdk.services.cleanrooms.CfnMembership.MembershipProtectedJobOutputConfigurationProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.cleanrooms.CfnMembership.MembershipProtectedJobOutputConfigurationProperty,
    ) : CdkObject(cdkObject),
        MembershipProtectedJobOutputConfigurationProperty {
      /**
       * Contains the configuration to write the job results to S3.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cleanrooms-membership-membershipprotectedjoboutputconfiguration.html#cfn-cleanrooms-membership-membershipprotectedjoboutputconfiguration-s3)
       */
      override fun s3(): Any = unwrap(this).getS3()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          MembershipProtectedJobOutputConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.cleanrooms.CfnMembership.MembershipProtectedJobOutputConfigurationProperty):
          MembershipProtectedJobOutputConfigurationProperty = CdkObjectWrappers.wrap(cdkObject) as?
          MembershipProtectedJobOutputConfigurationProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: MembershipProtectedJobOutputConfigurationProperty):
          software.amazon.awscdk.services.cleanrooms.CfnMembership.MembershipProtectedJobOutputConfigurationProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.cleanrooms.CfnMembership.MembershipProtectedJobOutputConfigurationProperty
    }
  }

  /**
   * Contains configurations for protected job results.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.cleanrooms.*;
   * MembershipProtectedJobResultConfigurationProperty
   * membershipProtectedJobResultConfigurationProperty =
   * MembershipProtectedJobResultConfigurationProperty.builder()
   * .outputConfiguration(MembershipProtectedJobOutputConfigurationProperty.builder()
   * .s3(ProtectedJobS3OutputConfigurationInputProperty.builder()
   * .bucket("bucket")
   * // the properties below are optional
   * .keyPrefix("keyPrefix")
   * .build())
   * .build())
   * .roleArn("roleArn")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cleanrooms-membership-membershipprotectedjobresultconfiguration.html)
   */
  public interface MembershipProtectedJobResultConfigurationProperty {
    /**
     * The output configuration for a protected job result.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cleanrooms-membership-membershipprotectedjobresultconfiguration.html#cfn-cleanrooms-membership-membershipprotectedjobresultconfiguration-outputconfiguration)
     */
    public fun outputConfiguration(): Any

    /**
     * The unique ARN for an IAM role that is used by AWS Clean Rooms to write protected job results
     * to the result location, given by the member who can receive results.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cleanrooms-membership-membershipprotectedjobresultconfiguration.html#cfn-cleanrooms-membership-membershipprotectedjobresultconfiguration-rolearn)
     */
    public fun roleArn(): String

    /**
     * A builder for [MembershipProtectedJobResultConfigurationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param outputConfiguration The output configuration for a protected job result. 
       */
      public fun outputConfiguration(outputConfiguration: IResolvable)

      /**
       * @param outputConfiguration The output configuration for a protected job result. 
       */
      public
          fun outputConfiguration(outputConfiguration: MembershipProtectedJobOutputConfigurationProperty)

      /**
       * @param outputConfiguration The output configuration for a protected job result. 
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("55a1ba112bc0b4af8b2fdb1509ca9a6106fb59e252d5398923f79fd3df0f73e6")
      public
          fun outputConfiguration(outputConfiguration: MembershipProtectedJobOutputConfigurationProperty.Builder.() -> Unit)

      /**
       * @param roleArn The unique ARN for an IAM role that is used by AWS Clean Rooms to write
       * protected job results to the result location, given by the member who can receive results. 
       */
      public fun roleArn(roleArn: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.cleanrooms.CfnMembership.MembershipProtectedJobResultConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.cleanrooms.CfnMembership.MembershipProtectedJobResultConfigurationProperty.builder()

      /**
       * @param outputConfiguration The output configuration for a protected job result. 
       */
      override fun outputConfiguration(outputConfiguration: IResolvable) {
        cdkBuilder.outputConfiguration(outputConfiguration.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param outputConfiguration The output configuration for a protected job result. 
       */
      override
          fun outputConfiguration(outputConfiguration: MembershipProtectedJobOutputConfigurationProperty) {
        cdkBuilder.outputConfiguration(outputConfiguration.let(MembershipProtectedJobOutputConfigurationProperty.Companion::unwrap))
      }

      /**
       * @param outputConfiguration The output configuration for a protected job result. 
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("55a1ba112bc0b4af8b2fdb1509ca9a6106fb59e252d5398923f79fd3df0f73e6")
      override
          fun outputConfiguration(outputConfiguration: MembershipProtectedJobOutputConfigurationProperty.Builder.() -> Unit):
          Unit =
          outputConfiguration(MembershipProtectedJobOutputConfigurationProperty(outputConfiguration))

      /**
       * @param roleArn The unique ARN for an IAM role that is used by AWS Clean Rooms to write
       * protected job results to the result location, given by the member who can receive results. 
       */
      override fun roleArn(roleArn: String) {
        cdkBuilder.roleArn(roleArn)
      }

      public fun build():
          software.amazon.awscdk.services.cleanrooms.CfnMembership.MembershipProtectedJobResultConfigurationProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.cleanrooms.CfnMembership.MembershipProtectedJobResultConfigurationProperty,
    ) : CdkObject(cdkObject),
        MembershipProtectedJobResultConfigurationProperty {
      /**
       * The output configuration for a protected job result.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cleanrooms-membership-membershipprotectedjobresultconfiguration.html#cfn-cleanrooms-membership-membershipprotectedjobresultconfiguration-outputconfiguration)
       */
      override fun outputConfiguration(): Any = unwrap(this).getOutputConfiguration()

      /**
       * The unique ARN for an IAM role that is used by AWS Clean Rooms to write protected job
       * results to the result location, given by the member who can receive results.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cleanrooms-membership-membershipprotectedjobresultconfiguration.html#cfn-cleanrooms-membership-membershipprotectedjobresultconfiguration-rolearn)
       */
      override fun roleArn(): String = unwrap(this).getRoleArn()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          MembershipProtectedJobResultConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.cleanrooms.CfnMembership.MembershipProtectedJobResultConfigurationProperty):
          MembershipProtectedJobResultConfigurationProperty = CdkObjectWrappers.wrap(cdkObject) as?
          MembershipProtectedJobResultConfigurationProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: MembershipProtectedJobResultConfigurationProperty):
          software.amazon.awscdk.services.cleanrooms.CfnMembership.MembershipProtectedJobResultConfigurationProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.cleanrooms.CfnMembership.MembershipProtectedJobResultConfigurationProperty
    }
  }

  /**
   * Contains configurations for protected query results.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.cleanrooms.*;
   * MembershipProtectedQueryOutputConfigurationProperty
   * membershipProtectedQueryOutputConfigurationProperty =
   * MembershipProtectedQueryOutputConfigurationProperty.builder()
   * .s3(ProtectedQueryS3OutputConfigurationProperty.builder()
   * .bucket("bucket")
   * .resultFormat("resultFormat")
   * // the properties below are optional
   * .keyPrefix("keyPrefix")
   * .singleFileOutput(false)
   * .build())
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cleanrooms-membership-membershipprotectedqueryoutputconfiguration.html)
   */
  public interface MembershipProtectedQueryOutputConfigurationProperty {
    /**
     * Required configuration for a protected query with an `s3` output type.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cleanrooms-membership-membershipprotectedqueryoutputconfiguration.html#cfn-cleanrooms-membership-membershipprotectedqueryoutputconfiguration-s3)
     */
    public fun s3(): Any

    /**
     * A builder for [MembershipProtectedQueryOutputConfigurationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param s3 Required configuration for a protected query with an `s3` output type. 
       */
      public fun s3(s3: IResolvable)

      /**
       * @param s3 Required configuration for a protected query with an `s3` output type. 
       */
      public fun s3(s3: ProtectedQueryS3OutputConfigurationProperty)

      /**
       * @param s3 Required configuration for a protected query with an `s3` output type. 
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("b2597a2165549dafd127ba9eee175ac3ddd48f847c4150eae23d54c4edf57e86")
      public fun s3(s3: ProtectedQueryS3OutputConfigurationProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.cleanrooms.CfnMembership.MembershipProtectedQueryOutputConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.cleanrooms.CfnMembership.MembershipProtectedQueryOutputConfigurationProperty.builder()

      /**
       * @param s3 Required configuration for a protected query with an `s3` output type. 
       */
      override fun s3(s3: IResolvable) {
        cdkBuilder.s3(s3.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param s3 Required configuration for a protected query with an `s3` output type. 
       */
      override fun s3(s3: ProtectedQueryS3OutputConfigurationProperty) {
        cdkBuilder.s3(s3.let(ProtectedQueryS3OutputConfigurationProperty.Companion::unwrap))
      }

      /**
       * @param s3 Required configuration for a protected query with an `s3` output type. 
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("b2597a2165549dafd127ba9eee175ac3ddd48f847c4150eae23d54c4edf57e86")
      override fun s3(s3: ProtectedQueryS3OutputConfigurationProperty.Builder.() -> Unit): Unit =
          s3(ProtectedQueryS3OutputConfigurationProperty(s3))

      public fun build():
          software.amazon.awscdk.services.cleanrooms.CfnMembership.MembershipProtectedQueryOutputConfigurationProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.cleanrooms.CfnMembership.MembershipProtectedQueryOutputConfigurationProperty,
    ) : CdkObject(cdkObject),
        MembershipProtectedQueryOutputConfigurationProperty {
      /**
       * Required configuration for a protected query with an `s3` output type.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cleanrooms-membership-membershipprotectedqueryoutputconfiguration.html#cfn-cleanrooms-membership-membershipprotectedqueryoutputconfiguration-s3)
       */
      override fun s3(): Any = unwrap(this).getS3()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          MembershipProtectedQueryOutputConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.cleanrooms.CfnMembership.MembershipProtectedQueryOutputConfigurationProperty):
          MembershipProtectedQueryOutputConfigurationProperty = CdkObjectWrappers.wrap(cdkObject)
          as? MembershipProtectedQueryOutputConfigurationProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: MembershipProtectedQueryOutputConfigurationProperty):
          software.amazon.awscdk.services.cleanrooms.CfnMembership.MembershipProtectedQueryOutputConfigurationProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.cleanrooms.CfnMembership.MembershipProtectedQueryOutputConfigurationProperty
    }
  }

  /**
   * Contains configurations for protected query results.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.cleanrooms.*;
   * MembershipProtectedQueryResultConfigurationProperty
   * membershipProtectedQueryResultConfigurationProperty =
   * MembershipProtectedQueryResultConfigurationProperty.builder()
   * .outputConfiguration(MembershipProtectedQueryOutputConfigurationProperty.builder()
   * .s3(ProtectedQueryS3OutputConfigurationProperty.builder()
   * .bucket("bucket")
   * .resultFormat("resultFormat")
   * // the properties below are optional
   * .keyPrefix("keyPrefix")
   * .singleFileOutput(false)
   * .build())
   * .build())
   * // the properties below are optional
   * .roleArn("roleArn")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cleanrooms-membership-membershipprotectedqueryresultconfiguration.html)
   */
  public interface MembershipProtectedQueryResultConfigurationProperty {
    /**
     * Configuration for protected query results.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cleanrooms-membership-membershipprotectedqueryresultconfiguration.html#cfn-cleanrooms-membership-membershipprotectedqueryresultconfiguration-outputconfiguration)
     */
    public fun outputConfiguration(): Any

    /**
     * The unique ARN for an IAM role that is used by AWS Clean Rooms to write protected query
     * results to the result location, given by the member who can receive results.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cleanrooms-membership-membershipprotectedqueryresultconfiguration.html#cfn-cleanrooms-membership-membershipprotectedqueryresultconfiguration-rolearn)
     */
    public fun roleArn(): String? = unwrap(this).getRoleArn()

    /**
     * A builder for [MembershipProtectedQueryResultConfigurationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param outputConfiguration Configuration for protected query results. 
       */
      public fun outputConfiguration(outputConfiguration: IResolvable)

      /**
       * @param outputConfiguration Configuration for protected query results. 
       */
      public
          fun outputConfiguration(outputConfiguration: MembershipProtectedQueryOutputConfigurationProperty)

      /**
       * @param outputConfiguration Configuration for protected query results. 
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("93a26914910069f23c97364d93aff5d276755a5650cbd67e26be4291735331f4")
      public
          fun outputConfiguration(outputConfiguration: MembershipProtectedQueryOutputConfigurationProperty.Builder.() -> Unit)

      /**
       * @param roleArn The unique ARN for an IAM role that is used by AWS Clean Rooms to write
       * protected query results to the result location, given by the member who can receive results.
       */
      public fun roleArn(roleArn: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.cleanrooms.CfnMembership.MembershipProtectedQueryResultConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.cleanrooms.CfnMembership.MembershipProtectedQueryResultConfigurationProperty.builder()

      /**
       * @param outputConfiguration Configuration for protected query results. 
       */
      override fun outputConfiguration(outputConfiguration: IResolvable) {
        cdkBuilder.outputConfiguration(outputConfiguration.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param outputConfiguration Configuration for protected query results. 
       */
      override
          fun outputConfiguration(outputConfiguration: MembershipProtectedQueryOutputConfigurationProperty) {
        cdkBuilder.outputConfiguration(outputConfiguration.let(MembershipProtectedQueryOutputConfigurationProperty.Companion::unwrap))
      }

      /**
       * @param outputConfiguration Configuration for protected query results. 
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("93a26914910069f23c97364d93aff5d276755a5650cbd67e26be4291735331f4")
      override
          fun outputConfiguration(outputConfiguration: MembershipProtectedQueryOutputConfigurationProperty.Builder.() -> Unit):
          Unit =
          outputConfiguration(MembershipProtectedQueryOutputConfigurationProperty(outputConfiguration))

      /**
       * @param roleArn The unique ARN for an IAM role that is used by AWS Clean Rooms to write
       * protected query results to the result location, given by the member who can receive results.
       */
      override fun roleArn(roleArn: String) {
        cdkBuilder.roleArn(roleArn)
      }

      public fun build():
          software.amazon.awscdk.services.cleanrooms.CfnMembership.MembershipProtectedQueryResultConfigurationProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.cleanrooms.CfnMembership.MembershipProtectedQueryResultConfigurationProperty,
    ) : CdkObject(cdkObject),
        MembershipProtectedQueryResultConfigurationProperty {
      /**
       * Configuration for protected query results.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cleanrooms-membership-membershipprotectedqueryresultconfiguration.html#cfn-cleanrooms-membership-membershipprotectedqueryresultconfiguration-outputconfiguration)
       */
      override fun outputConfiguration(): Any = unwrap(this).getOutputConfiguration()

      /**
       * The unique ARN for an IAM role that is used by AWS Clean Rooms to write protected query
       * results to the result location, given by the member who can receive results.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cleanrooms-membership-membershipprotectedqueryresultconfiguration.html#cfn-cleanrooms-membership-membershipprotectedqueryresultconfiguration-rolearn)
       */
      override fun roleArn(): String? = unwrap(this).getRoleArn()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          MembershipProtectedQueryResultConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.cleanrooms.CfnMembership.MembershipProtectedQueryResultConfigurationProperty):
          MembershipProtectedQueryResultConfigurationProperty = CdkObjectWrappers.wrap(cdkObject)
          as? MembershipProtectedQueryResultConfigurationProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: MembershipProtectedQueryResultConfigurationProperty):
          software.amazon.awscdk.services.cleanrooms.CfnMembership.MembershipProtectedQueryResultConfigurationProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.cleanrooms.CfnMembership.MembershipProtectedQueryResultConfigurationProperty
    }
  }

  /**
   * An object representing the payment responsibilities accepted by the collaboration member for
   * query compute costs.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.cleanrooms.*;
   * MembershipQueryComputePaymentConfigProperty membershipQueryComputePaymentConfigProperty =
   * MembershipQueryComputePaymentConfigProperty.builder()
   * .isResponsible(false)
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cleanrooms-membership-membershipquerycomputepaymentconfig.html)
   */
  public interface MembershipQueryComputePaymentConfigProperty {
    /**
     * Indicates whether the collaboration member has accepted to pay for query compute costs (
     * `TRUE` ) or has not accepted to pay for query compute costs ( `FALSE` ).
     *
     * If the collaboration creator has not specified anyone to pay for query compute costs, then
     * the member who can query is the default payer.
     *
     * An error message is returned for the following reasons:
     *
     * * If you set the value to `FALSE` but you are responsible to pay for query compute costs.
     * * If you set the value to `TRUE` but you are not responsible to pay for query compute costs.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cleanrooms-membership-membershipquerycomputepaymentconfig.html#cfn-cleanrooms-membership-membershipquerycomputepaymentconfig-isresponsible)
     */
    public fun isResponsible(): Any

    /**
     * A builder for [MembershipQueryComputePaymentConfigProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param isResponsible Indicates whether the collaboration member has accepted to pay for
       * query compute costs ( `TRUE` ) or has not accepted to pay for query compute costs ( `FALSE` ).
       * 
       * If the collaboration creator has not specified anyone to pay for query compute costs, then
       * the member who can query is the default payer.
       *
       * An error message is returned for the following reasons:
       *
       * * If you set the value to `FALSE` but you are responsible to pay for query compute costs.
       * * If you set the value to `TRUE` but you are not responsible to pay for query compute
       * costs.
       */
      public fun isResponsible(isResponsible: Boolean)

      /**
       * @param isResponsible Indicates whether the collaboration member has accepted to pay for
       * query compute costs ( `TRUE` ) or has not accepted to pay for query compute costs ( `FALSE` ).
       * 
       * If the collaboration creator has not specified anyone to pay for query compute costs, then
       * the member who can query is the default payer.
       *
       * An error message is returned for the following reasons:
       *
       * * If you set the value to `FALSE` but you are responsible to pay for query compute costs.
       * * If you set the value to `TRUE` but you are not responsible to pay for query compute
       * costs.
       */
      public fun isResponsible(isResponsible: IResolvable)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.cleanrooms.CfnMembership.MembershipQueryComputePaymentConfigProperty.Builder
          =
          software.amazon.awscdk.services.cleanrooms.CfnMembership.MembershipQueryComputePaymentConfigProperty.builder()

      /**
       * @param isResponsible Indicates whether the collaboration member has accepted to pay for
       * query compute costs ( `TRUE` ) or has not accepted to pay for query compute costs ( `FALSE` ).
       * 
       * If the collaboration creator has not specified anyone to pay for query compute costs, then
       * the member who can query is the default payer.
       *
       * An error message is returned for the following reasons:
       *
       * * If you set the value to `FALSE` but you are responsible to pay for query compute costs.
       * * If you set the value to `TRUE` but you are not responsible to pay for query compute
       * costs.
       */
      override fun isResponsible(isResponsible: Boolean) {
        cdkBuilder.isResponsible(isResponsible)
      }

      /**
       * @param isResponsible Indicates whether the collaboration member has accepted to pay for
       * query compute costs ( `TRUE` ) or has not accepted to pay for query compute costs ( `FALSE` ).
       * 
       * If the collaboration creator has not specified anyone to pay for query compute costs, then
       * the member who can query is the default payer.
       *
       * An error message is returned for the following reasons:
       *
       * * If you set the value to `FALSE` but you are responsible to pay for query compute costs.
       * * If you set the value to `TRUE` but you are not responsible to pay for query compute
       * costs.
       */
      override fun isResponsible(isResponsible: IResolvable) {
        cdkBuilder.isResponsible(isResponsible.let(IResolvable.Companion::unwrap))
      }

      public fun build():
          software.amazon.awscdk.services.cleanrooms.CfnMembership.MembershipQueryComputePaymentConfigProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.cleanrooms.CfnMembership.MembershipQueryComputePaymentConfigProperty,
    ) : CdkObject(cdkObject),
        MembershipQueryComputePaymentConfigProperty {
      /**
       * Indicates whether the collaboration member has accepted to pay for query compute costs (
       * `TRUE` ) or has not accepted to pay for query compute costs ( `FALSE` ).
       *
       * If the collaboration creator has not specified anyone to pay for query compute costs, then
       * the member who can query is the default payer.
       *
       * An error message is returned for the following reasons:
       *
       * * If you set the value to `FALSE` but you are responsible to pay for query compute costs.
       * * If you set the value to `TRUE` but you are not responsible to pay for query compute
       * costs.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cleanrooms-membership-membershipquerycomputepaymentconfig.html#cfn-cleanrooms-membership-membershipquerycomputepaymentconfig-isresponsible)
       */
      override fun isResponsible(): Any = unwrap(this).getIsResponsible()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          MembershipQueryComputePaymentConfigProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.cleanrooms.CfnMembership.MembershipQueryComputePaymentConfigProperty):
          MembershipQueryComputePaymentConfigProperty = CdkObjectWrappers.wrap(cdkObject) as?
          MembershipQueryComputePaymentConfigProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: MembershipQueryComputePaymentConfigProperty):
          software.amazon.awscdk.services.cleanrooms.CfnMembership.MembershipQueryComputePaymentConfigProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.cleanrooms.CfnMembership.MembershipQueryComputePaymentConfigProperty
    }
  }

  /**
   * Contains input information for protected jobs with an S3 output type.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.cleanrooms.*;
   * ProtectedJobS3OutputConfigurationInputProperty protectedJobS3OutputConfigurationInputProperty =
   * ProtectedJobS3OutputConfigurationInputProperty.builder()
   * .bucket("bucket")
   * // the properties below are optional
   * .keyPrefix("keyPrefix")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cleanrooms-membership-protectedjobs3outputconfigurationinput.html)
   */
  public interface ProtectedJobS3OutputConfigurationInputProperty {
    /**
     * The S3 bucket for job output.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cleanrooms-membership-protectedjobs3outputconfigurationinput.html#cfn-cleanrooms-membership-protectedjobs3outputconfigurationinput-bucket)
     */
    public fun bucket(): String

    /**
     * The S3 prefix to unload the protected job results.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cleanrooms-membership-protectedjobs3outputconfigurationinput.html#cfn-cleanrooms-membership-protectedjobs3outputconfigurationinput-keyprefix)
     */
    public fun keyPrefix(): String? = unwrap(this).getKeyPrefix()

    /**
     * A builder for [ProtectedJobS3OutputConfigurationInputProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param bucket The S3 bucket for job output. 
       */
      public fun bucket(bucket: String)

      /**
       * @param keyPrefix The S3 prefix to unload the protected job results.
       */
      public fun keyPrefix(keyPrefix: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.cleanrooms.CfnMembership.ProtectedJobS3OutputConfigurationInputProperty.Builder
          =
          software.amazon.awscdk.services.cleanrooms.CfnMembership.ProtectedJobS3OutputConfigurationInputProperty.builder()

      /**
       * @param bucket The S3 bucket for job output. 
       */
      override fun bucket(bucket: String) {
        cdkBuilder.bucket(bucket)
      }

      /**
       * @param keyPrefix The S3 prefix to unload the protected job results.
       */
      override fun keyPrefix(keyPrefix: String) {
        cdkBuilder.keyPrefix(keyPrefix)
      }

      public fun build():
          software.amazon.awscdk.services.cleanrooms.CfnMembership.ProtectedJobS3OutputConfigurationInputProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.cleanrooms.CfnMembership.ProtectedJobS3OutputConfigurationInputProperty,
    ) : CdkObject(cdkObject),
        ProtectedJobS3OutputConfigurationInputProperty {
      /**
       * The S3 bucket for job output.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cleanrooms-membership-protectedjobs3outputconfigurationinput.html#cfn-cleanrooms-membership-protectedjobs3outputconfigurationinput-bucket)
       */
      override fun bucket(): String = unwrap(this).getBucket()

      /**
       * The S3 prefix to unload the protected job results.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cleanrooms-membership-protectedjobs3outputconfigurationinput.html#cfn-cleanrooms-membership-protectedjobs3outputconfigurationinput-keyprefix)
       */
      override fun keyPrefix(): String? = unwrap(this).getKeyPrefix()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          ProtectedJobS3OutputConfigurationInputProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.cleanrooms.CfnMembership.ProtectedJobS3OutputConfigurationInputProperty):
          ProtectedJobS3OutputConfigurationInputProperty = CdkObjectWrappers.wrap(cdkObject) as?
          ProtectedJobS3OutputConfigurationInputProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: ProtectedJobS3OutputConfigurationInputProperty):
          software.amazon.awscdk.services.cleanrooms.CfnMembership.ProtectedJobS3OutputConfigurationInputProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.cleanrooms.CfnMembership.ProtectedJobS3OutputConfigurationInputProperty
    }
  }

  /**
   * Contains the configuration to write the query results to S3.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.cleanrooms.*;
   * ProtectedQueryS3OutputConfigurationProperty protectedQueryS3OutputConfigurationProperty =
   * ProtectedQueryS3OutputConfigurationProperty.builder()
   * .bucket("bucket")
   * .resultFormat("resultFormat")
   * // the properties below are optional
   * .keyPrefix("keyPrefix")
   * .singleFileOutput(false)
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cleanrooms-membership-protectedquerys3outputconfiguration.html)
   */
  public interface ProtectedQueryS3OutputConfigurationProperty {
    /**
     * The S3 bucket to unload the protected query results.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cleanrooms-membership-protectedquerys3outputconfiguration.html#cfn-cleanrooms-membership-protectedquerys3outputconfiguration-bucket)
     */
    public fun bucket(): String

    /**
     * The S3 prefix to unload the protected query results.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cleanrooms-membership-protectedquerys3outputconfiguration.html#cfn-cleanrooms-membership-protectedquerys3outputconfiguration-keyprefix)
     */
    public fun keyPrefix(): String? = unwrap(this).getKeyPrefix()

    /**
     * Intended file format of the result.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cleanrooms-membership-protectedquerys3outputconfiguration.html#cfn-cleanrooms-membership-protectedquerys3outputconfiguration-resultformat)
     */
    public fun resultFormat(): String

    /**
     * Indicates whether files should be output as a single file ( `TRUE` ) or output as multiple
     * files ( `FALSE` ).
     *
     * This parameter is only supported for analyses with the Spark analytics engine.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cleanrooms-membership-protectedquerys3outputconfiguration.html#cfn-cleanrooms-membership-protectedquerys3outputconfiguration-singlefileoutput)
     */
    public fun singleFileOutput(): Any? = unwrap(this).getSingleFileOutput()

    /**
     * A builder for [ProtectedQueryS3OutputConfigurationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param bucket The S3 bucket to unload the protected query results. 
       */
      public fun bucket(bucket: String)

      /**
       * @param keyPrefix The S3 prefix to unload the protected query results.
       */
      public fun keyPrefix(keyPrefix: String)

      /**
       * @param resultFormat Intended file format of the result. 
       */
      public fun resultFormat(resultFormat: String)

      /**
       * @param singleFileOutput Indicates whether files should be output as a single file ( `TRUE`
       * ) or output as multiple files ( `FALSE` ).
       * This parameter is only supported for analyses with the Spark analytics engine.
       */
      public fun singleFileOutput(singleFileOutput: Boolean)

      /**
       * @param singleFileOutput Indicates whether files should be output as a single file ( `TRUE`
       * ) or output as multiple files ( `FALSE` ).
       * This parameter is only supported for analyses with the Spark analytics engine.
       */
      public fun singleFileOutput(singleFileOutput: IResolvable)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.cleanrooms.CfnMembership.ProtectedQueryS3OutputConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.cleanrooms.CfnMembership.ProtectedQueryS3OutputConfigurationProperty.builder()

      /**
       * @param bucket The S3 bucket to unload the protected query results. 
       */
      override fun bucket(bucket: String) {
        cdkBuilder.bucket(bucket)
      }

      /**
       * @param keyPrefix The S3 prefix to unload the protected query results.
       */
      override fun keyPrefix(keyPrefix: String) {
        cdkBuilder.keyPrefix(keyPrefix)
      }

      /**
       * @param resultFormat Intended file format of the result. 
       */
      override fun resultFormat(resultFormat: String) {
        cdkBuilder.resultFormat(resultFormat)
      }

      /**
       * @param singleFileOutput Indicates whether files should be output as a single file ( `TRUE`
       * ) or output as multiple files ( `FALSE` ).
       * This parameter is only supported for analyses with the Spark analytics engine.
       */
      override fun singleFileOutput(singleFileOutput: Boolean) {
        cdkBuilder.singleFileOutput(singleFileOutput)
      }

      /**
       * @param singleFileOutput Indicates whether files should be output as a single file ( `TRUE`
       * ) or output as multiple files ( `FALSE` ).
       * This parameter is only supported for analyses with the Spark analytics engine.
       */
      override fun singleFileOutput(singleFileOutput: IResolvable) {
        cdkBuilder.singleFileOutput(singleFileOutput.let(IResolvable.Companion::unwrap))
      }

      public fun build():
          software.amazon.awscdk.services.cleanrooms.CfnMembership.ProtectedQueryS3OutputConfigurationProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.cleanrooms.CfnMembership.ProtectedQueryS3OutputConfigurationProperty,
    ) : CdkObject(cdkObject),
        ProtectedQueryS3OutputConfigurationProperty {
      /**
       * The S3 bucket to unload the protected query results.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cleanrooms-membership-protectedquerys3outputconfiguration.html#cfn-cleanrooms-membership-protectedquerys3outputconfiguration-bucket)
       */
      override fun bucket(): String = unwrap(this).getBucket()

      /**
       * The S3 prefix to unload the protected query results.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cleanrooms-membership-protectedquerys3outputconfiguration.html#cfn-cleanrooms-membership-protectedquerys3outputconfiguration-keyprefix)
       */
      override fun keyPrefix(): String? = unwrap(this).getKeyPrefix()

      /**
       * Intended file format of the result.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cleanrooms-membership-protectedquerys3outputconfiguration.html#cfn-cleanrooms-membership-protectedquerys3outputconfiguration-resultformat)
       */
      override fun resultFormat(): String = unwrap(this).getResultFormat()

      /**
       * Indicates whether files should be output as a single file ( `TRUE` ) or output as multiple
       * files ( `FALSE` ).
       *
       * This parameter is only supported for analyses with the Spark analytics engine.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cleanrooms-membership-protectedquerys3outputconfiguration.html#cfn-cleanrooms-membership-protectedquerys3outputconfiguration-singlefileoutput)
       */
      override fun singleFileOutput(): Any? = unwrap(this).getSingleFileOutput()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          ProtectedQueryS3OutputConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.cleanrooms.CfnMembership.ProtectedQueryS3OutputConfigurationProperty):
          ProtectedQueryS3OutputConfigurationProperty = CdkObjectWrappers.wrap(cdkObject) as?
          ProtectedQueryS3OutputConfigurationProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: ProtectedQueryS3OutputConfigurationProperty):
          software.amazon.awscdk.services.cleanrooms.CfnMembership.ProtectedQueryS3OutputConfigurationProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.cleanrooms.CfnMembership.ProtectedQueryS3OutputConfigurationProperty
    }
  }
}
