package io.cloudshiftdev.awscdk.services.cleanrooms

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.ITaggableV2
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnMembership internal constructor(
  private val cdkObject: software.amazon.awscdk.services.cleanrooms.CfnMembership,
) : CfnResource(cdkObject), IInspectable, ITaggableV2 {
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
   * The default protected query result configuration as specified by the member who can receive
   * results.
   */
  public open fun defaultResultConfiguration(): Any? = unwrap(this).getDefaultResultConfiguration()

  /**
   * The default protected query result configuration as specified by the member who can receive
   * results.
   */
  public open fun defaultResultConfiguration(`value`: IResolvable) {
    unwrap(this).setDefaultResultConfiguration(`value`.let(IResolvable::unwrap))
  }

  /**
   * The default protected query result configuration as specified by the member who can receive
   * results.
   */
  public open
      fun defaultResultConfiguration(`value`: MembershipProtectedQueryResultConfigurationProperty) {
    unwrap(this).setDefaultResultConfiguration(`value`.let(MembershipProtectedQueryResultConfigurationProperty::unwrap))
  }

  /**
   * The default protected query result configuration as specified by the member who can receive
   * results.
   */
  @Suppress("INAPPLICABLE_JVM_NAME")
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
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  /**
   * The payment responsibilities accepted by the collaboration member.
   */
  public open fun paymentConfiguration(): Any? = unwrap(this).getPaymentConfiguration()

  /**
   * The payment responsibilities accepted by the collaboration member.
   */
  public open fun paymentConfiguration(`value`: IResolvable) {
    unwrap(this).setPaymentConfiguration(`value`.let(IResolvable::unwrap))
  }

  /**
   * The payment responsibilities accepted by the collaboration member.
   */
  public open fun paymentConfiguration(`value`: MembershipPaymentConfigurationProperty) {
    unwrap(this).setPaymentConfiguration(`value`.let(MembershipPaymentConfigurationProperty::unwrap))
  }

  /**
   * The payment responsibilities accepted by the collaboration member.
   */
  @Suppress("INAPPLICABLE_JVM_NAME")
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
    unwrap(this).setTags(`value`.map(CfnTag::unwrap))
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
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("ff10055830626e7a3e8e88058441fda25c39c687a5dc20f0ad94ad925fbcf884")
    public
        fun defaultResultConfiguration(defaultResultConfiguration: MembershipProtectedQueryResultConfigurationProperty.Builder.() -> Unit)

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
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("9448e8539ccbb7c90896b2c06fdc1dc42d633ae9b6cd07facc40e0ff0d79fe3b")
    public
        fun paymentConfiguration(paymentConfiguration: MembershipPaymentConfigurationProperty.Builder.() -> Unit)

    /**
     * An indicator as to whether query logging has been enabled or disabled for the membership.
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
     * The default protected query result configuration as specified by the member who can receive
     * results.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cleanrooms-membership.html#cfn-cleanrooms-membership-defaultresultconfiguration)
     * @param defaultResultConfiguration The default protected query result configuration as
     * specified by the member who can receive results. 
     */
    override fun defaultResultConfiguration(defaultResultConfiguration: IResolvable) {
      cdkBuilder.defaultResultConfiguration(defaultResultConfiguration.let(IResolvable::unwrap))
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
      cdkBuilder.defaultResultConfiguration(defaultResultConfiguration.let(MembershipProtectedQueryResultConfigurationProperty::unwrap))
    }

    /**
     * The default protected query result configuration as specified by the member who can receive
     * results.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cleanrooms-membership.html#cfn-cleanrooms-membership-defaultresultconfiguration)
     * @param defaultResultConfiguration The default protected query result configuration as
     * specified by the member who can receive results. 
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("ff10055830626e7a3e8e88058441fda25c39c687a5dc20f0ad94ad925fbcf884")
    override
        fun defaultResultConfiguration(defaultResultConfiguration: MembershipProtectedQueryResultConfigurationProperty.Builder.() -> Unit):
        Unit =
        defaultResultConfiguration(MembershipProtectedQueryResultConfigurationProperty(defaultResultConfiguration))

    /**
     * The payment responsibilities accepted by the collaboration member.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cleanrooms-membership.html#cfn-cleanrooms-membership-paymentconfiguration)
     * @param paymentConfiguration The payment responsibilities accepted by the collaboration
     * member. 
     */
    override fun paymentConfiguration(paymentConfiguration: IResolvable) {
      cdkBuilder.paymentConfiguration(paymentConfiguration.let(IResolvable::unwrap))
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
      cdkBuilder.paymentConfiguration(paymentConfiguration.let(MembershipPaymentConfigurationProperty::unwrap))
    }

    /**
     * The payment responsibilities accepted by the collaboration member.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cleanrooms-membership.html#cfn-cleanrooms-membership-paymentconfiguration)
     * @param paymentConfiguration The payment responsibilities accepted by the collaboration
     * member. 
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("9448e8539ccbb7c90896b2c06fdc1dc42d633ae9b6cd07facc40e0ff0d79fe3b")
    override
        fun paymentConfiguration(paymentConfiguration: MembershipPaymentConfigurationProperty.Builder.() -> Unit):
        Unit = paymentConfiguration(MembershipPaymentConfigurationProperty(paymentConfiguration))

    /**
     * An indicator as to whether query logging has been enabled or disabled for the membership.
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
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
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
    init {

    }

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
        software.amazon.awscdk.services.cleanrooms.CfnMembership = wrapped.cdkObject
  }

  public interface MembershipPaymentConfigurationProperty {
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
      @Suppress("INAPPLICABLE_JVM_NAME")
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
       * @param queryCompute The payment responsibilities accepted by the collaboration member for
       * query compute costs. 
       */
      override fun queryCompute(queryCompute: IResolvable) {
        cdkBuilder.queryCompute(queryCompute.let(IResolvable::unwrap))
      }

      /**
       * @param queryCompute The payment responsibilities accepted by the collaboration member for
       * query compute costs. 
       */
      override fun queryCompute(queryCompute: MembershipQueryComputePaymentConfigProperty) {
        cdkBuilder.queryCompute(queryCompute.let(MembershipQueryComputePaymentConfigProperty::unwrap))
      }

      /**
       * @param queryCompute The payment responsibilities accepted by the collaboration member for
       * query compute costs. 
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("99db9738787f7ef099be61fcf4a886932773ebc185510d1ce209505a4bf570fe")
      override
          fun queryCompute(queryCompute: MembershipQueryComputePaymentConfigProperty.Builder.() -> Unit):
          Unit = queryCompute(MembershipQueryComputePaymentConfigProperty(queryCompute))

      public fun build():
          software.amazon.awscdk.services.cleanrooms.CfnMembership.MembershipPaymentConfigurationProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.cleanrooms.CfnMembership.MembershipPaymentConfigurationProperty,
    ) : MembershipPaymentConfigurationProperty {
      /**
       * The payment responsibilities accepted by the collaboration member for query compute costs.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cleanrooms-membership-membershippaymentconfiguration.html#cfn-cleanrooms-membership-membershippaymentconfiguration-querycompute)
       */
      override fun queryCompute(): Any = unwrap(this).getQueryCompute()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}):
          MembershipPaymentConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.cleanrooms.CfnMembership.MembershipPaymentConfigurationProperty):
          MembershipPaymentConfigurationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: MembershipPaymentConfigurationProperty):
          software.amazon.awscdk.services.cleanrooms.CfnMembership.MembershipPaymentConfigurationProperty
          = (wrapped as Wrapper).cdkObject
    }
  }

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

      public fun build():
          software.amazon.awscdk.services.cleanrooms.CfnMembership.ProtectedQueryS3OutputConfigurationProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.cleanrooms.CfnMembership.ProtectedQueryS3OutputConfigurationProperty,
    ) : ProtectedQueryS3OutputConfigurationProperty {
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
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}):
          ProtectedQueryS3OutputConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.cleanrooms.CfnMembership.ProtectedQueryS3OutputConfigurationProperty):
          ProtectedQueryS3OutputConfigurationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ProtectedQueryS3OutputConfigurationProperty):
          software.amazon.awscdk.services.cleanrooms.CfnMembership.ProtectedQueryS3OutputConfigurationProperty
          = (wrapped as Wrapper).cdkObject
    }
  }

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
        cdkBuilder.isResponsible(isResponsible.let(IResolvable::unwrap))
      }

      public fun build():
          software.amazon.awscdk.services.cleanrooms.CfnMembership.MembershipQueryComputePaymentConfigProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.cleanrooms.CfnMembership.MembershipQueryComputePaymentConfigProperty,
    ) : MembershipQueryComputePaymentConfigProperty {
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
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}):
          MembershipQueryComputePaymentConfigProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.cleanrooms.CfnMembership.MembershipQueryComputePaymentConfigProperty):
          MembershipQueryComputePaymentConfigProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: MembershipQueryComputePaymentConfigProperty):
          software.amazon.awscdk.services.cleanrooms.CfnMembership.MembershipQueryComputePaymentConfigProperty
          = (wrapped as Wrapper).cdkObject
    }
  }

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
      @Suppress("INAPPLICABLE_JVM_NAME")
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
        cdkBuilder.outputConfiguration(outputConfiguration.let(IResolvable::unwrap))
      }

      /**
       * @param outputConfiguration Configuration for protected query results. 
       */
      override
          fun outputConfiguration(outputConfiguration: MembershipProtectedQueryOutputConfigurationProperty) {
        cdkBuilder.outputConfiguration(outputConfiguration.let(MembershipProtectedQueryOutputConfigurationProperty::unwrap))
      }

      /**
       * @param outputConfiguration Configuration for protected query results. 
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
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

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.cleanrooms.CfnMembership.MembershipProtectedQueryResultConfigurationProperty,
    ) : MembershipProtectedQueryResultConfigurationProperty {
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
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}):
          MembershipProtectedQueryResultConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.cleanrooms.CfnMembership.MembershipProtectedQueryResultConfigurationProperty):
          MembershipProtectedQueryResultConfigurationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: MembershipProtectedQueryResultConfigurationProperty):
          software.amazon.awscdk.services.cleanrooms.CfnMembership.MembershipProtectedQueryResultConfigurationProperty
          = (wrapped as Wrapper).cdkObject
    }
  }

  public interface MembershipProtectedQueryOutputConfigurationProperty {
    /**
     * Required configuration for a protected query with an `S3` output type.
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
       * @param s3 Required configuration for a protected query with an `S3` output type. 
       */
      public fun s3(s3: IResolvable)

      /**
       * @param s3 Required configuration for a protected query with an `S3` output type. 
       */
      public fun s3(s3: ProtectedQueryS3OutputConfigurationProperty)

      /**
       * @param s3 Required configuration for a protected query with an `S3` output type. 
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("b2597a2165549dafd127ba9eee175ac3ddd48f847c4150eae23d54c4edf57e86")
      public fun s3(s3: ProtectedQueryS3OutputConfigurationProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.cleanrooms.CfnMembership.MembershipProtectedQueryOutputConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.cleanrooms.CfnMembership.MembershipProtectedQueryOutputConfigurationProperty.builder()

      /**
       * @param s3 Required configuration for a protected query with an `S3` output type. 
       */
      override fun s3(s3: IResolvable) {
        cdkBuilder.s3(s3.let(IResolvable::unwrap))
      }

      /**
       * @param s3 Required configuration for a protected query with an `S3` output type. 
       */
      override fun s3(s3: ProtectedQueryS3OutputConfigurationProperty) {
        cdkBuilder.s3(s3.let(ProtectedQueryS3OutputConfigurationProperty::unwrap))
      }

      /**
       * @param s3 Required configuration for a protected query with an `S3` output type. 
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("b2597a2165549dafd127ba9eee175ac3ddd48f847c4150eae23d54c4edf57e86")
      override fun s3(s3: ProtectedQueryS3OutputConfigurationProperty.Builder.() -> Unit): Unit =
          s3(ProtectedQueryS3OutputConfigurationProperty(s3))

      public fun build():
          software.amazon.awscdk.services.cleanrooms.CfnMembership.MembershipProtectedQueryOutputConfigurationProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.cleanrooms.CfnMembership.MembershipProtectedQueryOutputConfigurationProperty,
    ) : MembershipProtectedQueryOutputConfigurationProperty {
      /**
       * Required configuration for a protected query with an `S3` output type.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cleanrooms-membership-membershipprotectedqueryoutputconfiguration.html#cfn-cleanrooms-membership-membershipprotectedqueryoutputconfiguration-s3)
       */
      override fun s3(): Any = unwrap(this).getS3()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}):
          MembershipProtectedQueryOutputConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.cleanrooms.CfnMembership.MembershipProtectedQueryOutputConfigurationProperty):
          MembershipProtectedQueryOutputConfigurationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: MembershipProtectedQueryOutputConfigurationProperty):
          software.amazon.awscdk.services.cleanrooms.CfnMembership.MembershipProtectedQueryOutputConfigurationProperty
          = (wrapped as Wrapper).cdkObject
    }
  }
}
