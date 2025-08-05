@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.cleanrooms

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
 * Properties for defining a `CfnMembership`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.cleanrooms.*;
 * CfnMembershipProps cfnMembershipProps = CfnMembershipProps.builder()
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
public interface CfnMembershipProps {
  /**
   * The unique ID for the associated collaboration.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cleanrooms-membership.html#cfn-cleanrooms-membership-collaborationidentifier)
   */
  public fun collaborationIdentifier(): String

  /**
   * The default job result configuration for the membership.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cleanrooms-membership.html#cfn-cleanrooms-membership-defaultjobresultconfiguration)
   */
  public fun defaultJobResultConfiguration(): Any? = unwrap(this).getDefaultJobResultConfiguration()

  /**
   * The default protected query result configuration as specified by the member who can receive
   * results.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cleanrooms-membership.html#cfn-cleanrooms-membership-defaultresultconfiguration)
   */
  public fun defaultResultConfiguration(): Any? = unwrap(this).getDefaultResultConfiguration()

  /**
   * An indicator as to whether job logging has been enabled or disabled for the collaboration.
   *
   * When `ENABLED` , AWS Clean Rooms logs details about jobs run within this collaboration and
   * those logs can be viewed in Amazon CloudWatch Logs. The default value is `DISABLED` .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cleanrooms-membership.html#cfn-cleanrooms-membership-joblogstatus)
   */
  public fun jobLogStatus(): String? = unwrap(this).getJobLogStatus()

  /**
   * The payment responsibilities accepted by the collaboration member.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cleanrooms-membership.html#cfn-cleanrooms-membership-paymentconfiguration)
   */
  public fun paymentConfiguration(): Any? = unwrap(this).getPaymentConfiguration()

  /**
   * An indicator as to whether query logging has been enabled or disabled for the membership.
   *
   * When `ENABLED` , AWS Clean Rooms logs details about queries run within this collaboration and
   * those logs can be viewed in Amazon CloudWatch Logs. The default value is `DISABLED` .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cleanrooms-membership.html#cfn-cleanrooms-membership-querylogstatus)
   */
  public fun queryLogStatus(): String

  /**
   * An optional label that you can assign to a resource when you create it.
   *
   * Each tag consists of a key and an optional value, both of which you define. When you use
   * tagging, you can also use tag-based access control in IAM policies to control access to this
   * resource.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cleanrooms-membership.html#cfn-cleanrooms-membership-tags)
   */
  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * A builder for [CfnMembershipProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param collaborationIdentifier The unique ID for the associated collaboration. 
     */
    public fun collaborationIdentifier(collaborationIdentifier: String)

    /**
     * @param defaultJobResultConfiguration The default job result configuration for the membership.
     */
    public fun defaultJobResultConfiguration(defaultJobResultConfiguration: IResolvable)

    /**
     * @param defaultJobResultConfiguration The default job result configuration for the membership.
     */
    public
        fun defaultJobResultConfiguration(defaultJobResultConfiguration: CfnMembership.MembershipProtectedJobResultConfigurationProperty)

    /**
     * @param defaultJobResultConfiguration The default job result configuration for the membership.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("d0a9553e85b63ca6b7ad28226822eafd634229a01e596da7bb30ab3873eafaea")
    public
        fun defaultJobResultConfiguration(defaultJobResultConfiguration: CfnMembership.MembershipProtectedJobResultConfigurationProperty.Builder.() -> Unit)

    /**
     * @param defaultResultConfiguration The default protected query result configuration as
     * specified by the member who can receive results.
     */
    public fun defaultResultConfiguration(defaultResultConfiguration: IResolvable)

    /**
     * @param defaultResultConfiguration The default protected query result configuration as
     * specified by the member who can receive results.
     */
    public
        fun defaultResultConfiguration(defaultResultConfiguration: CfnMembership.MembershipProtectedQueryResultConfigurationProperty)

    /**
     * @param defaultResultConfiguration The default protected query result configuration as
     * specified by the member who can receive results.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("012db4d184f0a697c1ea154824cad0a173b6cb0e21adb37afcb6d7d25a436166")
    public
        fun defaultResultConfiguration(defaultResultConfiguration: CfnMembership.MembershipProtectedQueryResultConfigurationProperty.Builder.() -> Unit)

    /**
     * @param jobLogStatus An indicator as to whether job logging has been enabled or disabled for
     * the collaboration.
     * When `ENABLED` , AWS Clean Rooms logs details about jobs run within this collaboration and
     * those logs can be viewed in Amazon CloudWatch Logs. The default value is `DISABLED` .
     */
    public fun jobLogStatus(jobLogStatus: String)

    /**
     * @param paymentConfiguration The payment responsibilities accepted by the collaboration
     * member.
     */
    public fun paymentConfiguration(paymentConfiguration: IResolvable)

    /**
     * @param paymentConfiguration The payment responsibilities accepted by the collaboration
     * member.
     */
    public
        fun paymentConfiguration(paymentConfiguration: CfnMembership.MembershipPaymentConfigurationProperty)

    /**
     * @param paymentConfiguration The payment responsibilities accepted by the collaboration
     * member.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("eb7529328879513aabfb11b672a54ed19c59afcb6a9b90a17fed8bc2502a15e7")
    public
        fun paymentConfiguration(paymentConfiguration: CfnMembership.MembershipPaymentConfigurationProperty.Builder.() -> Unit)

    /**
     * @param queryLogStatus An indicator as to whether query logging has been enabled or disabled
     * for the membership. 
     * When `ENABLED` , AWS Clean Rooms logs details about queries run within this collaboration and
     * those logs can be viewed in Amazon CloudWatch Logs. The default value is `DISABLED` .
     */
    public fun queryLogStatus(queryLogStatus: String)

    /**
     * @param tags An optional label that you can assign to a resource when you create it.
     * Each tag consists of a key and an optional value, both of which you define. When you use
     * tagging, you can also use tag-based access control in IAM policies to control access to this
     * resource.
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * @param tags An optional label that you can assign to a resource when you create it.
     * Each tag consists of a key and an optional value, both of which you define. When you use
     * tagging, you can also use tag-based access control in IAM policies to control access to this
     * resource.
     */
    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.cleanrooms.CfnMembershipProps.Builder =
        software.amazon.awscdk.services.cleanrooms.CfnMembershipProps.builder()

    /**
     * @param collaborationIdentifier The unique ID for the associated collaboration. 
     */
    override fun collaborationIdentifier(collaborationIdentifier: String) {
      cdkBuilder.collaborationIdentifier(collaborationIdentifier)
    }

    /**
     * @param defaultJobResultConfiguration The default job result configuration for the membership.
     */
    override fun defaultJobResultConfiguration(defaultJobResultConfiguration: IResolvable) {
      cdkBuilder.defaultJobResultConfiguration(defaultJobResultConfiguration.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param defaultJobResultConfiguration The default job result configuration for the membership.
     */
    override
        fun defaultJobResultConfiguration(defaultJobResultConfiguration: CfnMembership.MembershipProtectedJobResultConfigurationProperty) {
      cdkBuilder.defaultJobResultConfiguration(defaultJobResultConfiguration.let(CfnMembership.MembershipProtectedJobResultConfigurationProperty.Companion::unwrap))
    }

    /**
     * @param defaultJobResultConfiguration The default job result configuration for the membership.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("d0a9553e85b63ca6b7ad28226822eafd634229a01e596da7bb30ab3873eafaea")
    override
        fun defaultJobResultConfiguration(defaultJobResultConfiguration: CfnMembership.MembershipProtectedJobResultConfigurationProperty.Builder.() -> Unit):
        Unit =
        defaultJobResultConfiguration(CfnMembership.MembershipProtectedJobResultConfigurationProperty(defaultJobResultConfiguration))

    /**
     * @param defaultResultConfiguration The default protected query result configuration as
     * specified by the member who can receive results.
     */
    override fun defaultResultConfiguration(defaultResultConfiguration: IResolvable) {
      cdkBuilder.defaultResultConfiguration(defaultResultConfiguration.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param defaultResultConfiguration The default protected query result configuration as
     * specified by the member who can receive results.
     */
    override
        fun defaultResultConfiguration(defaultResultConfiguration: CfnMembership.MembershipProtectedQueryResultConfigurationProperty) {
      cdkBuilder.defaultResultConfiguration(defaultResultConfiguration.let(CfnMembership.MembershipProtectedQueryResultConfigurationProperty.Companion::unwrap))
    }

    /**
     * @param defaultResultConfiguration The default protected query result configuration as
     * specified by the member who can receive results.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("012db4d184f0a697c1ea154824cad0a173b6cb0e21adb37afcb6d7d25a436166")
    override
        fun defaultResultConfiguration(defaultResultConfiguration: CfnMembership.MembershipProtectedQueryResultConfigurationProperty.Builder.() -> Unit):
        Unit =
        defaultResultConfiguration(CfnMembership.MembershipProtectedQueryResultConfigurationProperty(defaultResultConfiguration))

    /**
     * @param jobLogStatus An indicator as to whether job logging has been enabled or disabled for
     * the collaboration.
     * When `ENABLED` , AWS Clean Rooms logs details about jobs run within this collaboration and
     * those logs can be viewed in Amazon CloudWatch Logs. The default value is `DISABLED` .
     */
    override fun jobLogStatus(jobLogStatus: String) {
      cdkBuilder.jobLogStatus(jobLogStatus)
    }

    /**
     * @param paymentConfiguration The payment responsibilities accepted by the collaboration
     * member.
     */
    override fun paymentConfiguration(paymentConfiguration: IResolvable) {
      cdkBuilder.paymentConfiguration(paymentConfiguration.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param paymentConfiguration The payment responsibilities accepted by the collaboration
     * member.
     */
    override
        fun paymentConfiguration(paymentConfiguration: CfnMembership.MembershipPaymentConfigurationProperty) {
      cdkBuilder.paymentConfiguration(paymentConfiguration.let(CfnMembership.MembershipPaymentConfigurationProperty.Companion::unwrap))
    }

    /**
     * @param paymentConfiguration The payment responsibilities accepted by the collaboration
     * member.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("eb7529328879513aabfb11b672a54ed19c59afcb6a9b90a17fed8bc2502a15e7")
    override
        fun paymentConfiguration(paymentConfiguration: CfnMembership.MembershipPaymentConfigurationProperty.Builder.() -> Unit):
        Unit =
        paymentConfiguration(CfnMembership.MembershipPaymentConfigurationProperty(paymentConfiguration))

    /**
     * @param queryLogStatus An indicator as to whether query logging has been enabled or disabled
     * for the membership. 
     * When `ENABLED` , AWS Clean Rooms logs details about queries run within this collaboration and
     * those logs can be viewed in Amazon CloudWatch Logs. The default value is `DISABLED` .
     */
    override fun queryLogStatus(queryLogStatus: String) {
      cdkBuilder.queryLogStatus(queryLogStatus)
    }

    /**
     * @param tags An optional label that you can assign to a resource when you create it.
     * Each tag consists of a key and an optional value, both of which you define. When you use
     * tagging, you can also use tag-based access control in IAM policies to control access to this
     * resource.
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag.Companion::unwrap))
    }

    /**
     * @param tags An optional label that you can assign to a resource when you create it.
     * Each tag consists of a key and an optional value, both of which you define. When you use
     * tagging, you can also use tag-based access control in IAM policies to control access to this
     * resource.
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.cleanrooms.CfnMembershipProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.cleanrooms.CfnMembershipProps,
  ) : CdkObject(cdkObject),
      CfnMembershipProps {
    /**
     * The unique ID for the associated collaboration.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cleanrooms-membership.html#cfn-cleanrooms-membership-collaborationidentifier)
     */
    override fun collaborationIdentifier(): String = unwrap(this).getCollaborationIdentifier()

    /**
     * The default job result configuration for the membership.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cleanrooms-membership.html#cfn-cleanrooms-membership-defaultjobresultconfiguration)
     */
    override fun defaultJobResultConfiguration(): Any? =
        unwrap(this).getDefaultJobResultConfiguration()

    /**
     * The default protected query result configuration as specified by the member who can receive
     * results.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cleanrooms-membership.html#cfn-cleanrooms-membership-defaultresultconfiguration)
     */
    override fun defaultResultConfiguration(): Any? = unwrap(this).getDefaultResultConfiguration()

    /**
     * An indicator as to whether job logging has been enabled or disabled for the collaboration.
     *
     * When `ENABLED` , AWS Clean Rooms logs details about jobs run within this collaboration and
     * those logs can be viewed in Amazon CloudWatch Logs. The default value is `DISABLED` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cleanrooms-membership.html#cfn-cleanrooms-membership-joblogstatus)
     */
    override fun jobLogStatus(): String? = unwrap(this).getJobLogStatus()

    /**
     * The payment responsibilities accepted by the collaboration member.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cleanrooms-membership.html#cfn-cleanrooms-membership-paymentconfiguration)
     */
    override fun paymentConfiguration(): Any? = unwrap(this).getPaymentConfiguration()

    /**
     * An indicator as to whether query logging has been enabled or disabled for the membership.
     *
     * When `ENABLED` , AWS Clean Rooms logs details about queries run within this collaboration and
     * those logs can be viewed in Amazon CloudWatch Logs. The default value is `DISABLED` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cleanrooms-membership.html#cfn-cleanrooms-membership-querylogstatus)
     */
    override fun queryLogStatus(): String = unwrap(this).getQueryLogStatus()

    /**
     * An optional label that you can assign to a resource when you create it.
     *
     * Each tag consists of a key and an optional value, both of which you define. When you use
     * tagging, you can also use tag-based access control in IAM policies to control access to this
     * resource.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cleanrooms-membership.html#cfn-cleanrooms-membership-tags)
     */
    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnMembershipProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.cleanrooms.CfnMembershipProps):
        CfnMembershipProps = CdkObjectWrappers.wrap(cdkObject) as? CfnMembershipProps ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnMembershipProps):
        software.amazon.awscdk.services.cleanrooms.CfnMembershipProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.cleanrooms.CfnMembershipProps
  }
}
