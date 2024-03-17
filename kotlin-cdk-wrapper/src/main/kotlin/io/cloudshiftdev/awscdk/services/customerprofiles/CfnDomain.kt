@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.customerprofiles

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
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * Specifies an Amazon Connect Customer Profiles Domain.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.customerprofiles.*;
 * CfnDomain cfnDomain = CfnDomain.Builder.create(this, "MyCfnDomain")
 * .defaultExpirationDays(123)
 * .domainName("domainName")
 * // the properties below are optional
 * .deadLetterQueueUrl("deadLetterQueueUrl")
 * .defaultEncryptionKey("defaultEncryptionKey")
 * .matching(MatchingProperty.builder()
 * .enabled(false)
 * // the properties below are optional
 * .autoMerging(AutoMergingProperty.builder()
 * .enabled(false)
 * // the properties below are optional
 * .conflictResolution(ConflictResolutionProperty.builder()
 * .conflictResolvingModel("conflictResolvingModel")
 * // the properties below are optional
 * .sourceName("sourceName")
 * .build())
 * .consolidation(ConsolidationProperty.builder()
 * .matchingAttributesList(List.of(List.of("matchingAttributesList")))
 * .build())
 * .minAllowedConfidenceScoreForMerging(123)
 * .build())
 * .exportingConfig(ExportingConfigProperty.builder()
 * .s3Exporting(S3ExportingConfigProperty.builder()
 * .s3BucketName("s3BucketName")
 * // the properties below are optional
 * .s3KeyName("s3KeyName")
 * .build())
 * .build())
 * .jobSchedule(JobScheduleProperty.builder()
 * .dayOfTheWeek("dayOfTheWeek")
 * .time("time")
 * .build())
 * .build())
 * .ruleBasedMatching(RuleBasedMatchingProperty.builder()
 * .enabled(false)
 * // the properties below are optional
 * .attributeTypesSelector(AttributeTypesSelectorProperty.builder()
 * .attributeMatchingModel("attributeMatchingModel")
 * // the properties below are optional
 * .address(List.of("address"))
 * .emailAddress(List.of("emailAddress"))
 * .phoneNumber(List.of("phoneNumber"))
 * .build())
 * .conflictResolution(ConflictResolutionProperty.builder()
 * .conflictResolvingModel("conflictResolvingModel")
 * // the properties below are optional
 * .sourceName("sourceName")
 * .build())
 * .exportingConfig(ExportingConfigProperty.builder()
 * .s3Exporting(S3ExportingConfigProperty.builder()
 * .s3BucketName("s3BucketName")
 * // the properties below are optional
 * .s3KeyName("s3KeyName")
 * .build())
 * .build())
 * .matchingRules(List.of(MatchingRuleProperty.builder()
 * .rule(List.of("rule"))
 * .build()))
 * .maxAllowedRuleLevelForMatching(123)
 * .maxAllowedRuleLevelForMerging(123)
 * .status("status")
 * .build())
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-customerprofiles-domain.html)
 */
public open class CfnDomain internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.customerprofiles.CfnDomain,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  /**
   * The timestamp of when the domain was created.
   */
  public open fun attrCreatedAt(): String = unwrap(this).getAttrCreatedAt()

  /**
   * The timestamp of when the domain was most recently edited.
   */
  public open fun attrLastUpdatedAt(): String = unwrap(this).getAttrLastUpdatedAt()

  /**
   * The status of rule-based matching rule.
   */
  public open fun attrRuleBasedMatchingStatus(): String =
      unwrap(this).getAttrRuleBasedMatchingStatus()

  /**
   * Usage-specific statistics about the domain.
   */
  public open fun attrStats(): IResolvable = unwrap(this).getAttrStats().let(IResolvable::wrap)

  /**
   * The URL of the SQS dead letter queue, which is used for reporting errors associated with
   * ingesting data from third party applications.
   */
  public open fun deadLetterQueueUrl(): String? = unwrap(this).getDeadLetterQueueUrl()

  /**
   * The URL of the SQS dead letter queue, which is used for reporting errors associated with
   * ingesting data from third party applications.
   */
  public open fun deadLetterQueueUrl(`value`: String) {
    unwrap(this).setDeadLetterQueueUrl(`value`)
  }

  /**
   * The default encryption key, which is an AWS managed key, is used when no specific type of
   * encryption key is specified.
   */
  public open fun defaultEncryptionKey(): String? = unwrap(this).getDefaultEncryptionKey()

  /**
   * The default encryption key, which is an AWS managed key, is used when no specific type of
   * encryption key is specified.
   */
  public open fun defaultEncryptionKey(`value`: String) {
    unwrap(this).setDefaultEncryptionKey(`value`)
  }

  /**
   * The default number of days until the data within the domain expires.
   */
  public open fun defaultExpirationDays(): Number = unwrap(this).getDefaultExpirationDays()

  /**
   * The default number of days until the data within the domain expires.
   */
  public open fun defaultExpirationDays(`value`: Number) {
    unwrap(this).setDefaultExpirationDays(`value`)
  }

  /**
   * The unique name of the domain.
   */
  public open fun domainName(): String = unwrap(this).getDomainName()

  /**
   * The unique name of the domain.
   */
  public open fun domainName(`value`: String) {
    unwrap(this).setDomainName(`value`)
  }

  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  /**
   * The process of matching duplicate profiles.
   */
  public open fun matching(): Any? = unwrap(this).getMatching()

  /**
   * The process of matching duplicate profiles.
   */
  public open fun matching(`value`: IResolvable) {
    unwrap(this).setMatching(`value`.let(IResolvable::unwrap))
  }

  /**
   * The process of matching duplicate profiles.
   */
  public open fun matching(`value`: MatchingProperty) {
    unwrap(this).setMatching(`value`.let(MatchingProperty::unwrap))
  }

  /**
   * The process of matching duplicate profiles.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("79b5098f940539e246e8bd2177c27653a198e3a5968b8a66e091896480569b87")
  public open fun matching(`value`: MatchingProperty.Builder.() -> Unit): Unit =
      matching(MatchingProperty(`value`))

  /**
   * The process of matching duplicate profiles using Rule-Based matching.
   */
  public open fun ruleBasedMatching(): Any? = unwrap(this).getRuleBasedMatching()

  /**
   * The process of matching duplicate profiles using Rule-Based matching.
   */
  public open fun ruleBasedMatching(`value`: IResolvable) {
    unwrap(this).setRuleBasedMatching(`value`.let(IResolvable::unwrap))
  }

  /**
   * The process of matching duplicate profiles using Rule-Based matching.
   */
  public open fun ruleBasedMatching(`value`: RuleBasedMatchingProperty) {
    unwrap(this).setRuleBasedMatching(`value`.let(RuleBasedMatchingProperty::unwrap))
  }

  /**
   * The process of matching duplicate profiles using Rule-Based matching.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("8d664378f35733db769b89be93076878909cb45db0a43a2f608ea1f8d4a99348")
  public open fun ruleBasedMatching(`value`: RuleBasedMatchingProperty.Builder.() -> Unit): Unit =
      ruleBasedMatching(RuleBasedMatchingProperty(`value`))

  /**
   * Tag Manager which manages the tags for this resource.
   */
  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  /**
   * The tags used to organize, track, or control access for this resource.
   */
  public open fun tagsRaw(): List<CfnTag> = unwrap(this).getTagsRaw()?.map(CfnTag::wrap) ?:
      emptyList()

  /**
   * The tags used to organize, track, or control access for this resource.
   */
  public open fun tagsRaw(`value`: List<CfnTag>) {
    unwrap(this).setTagsRaw(`value`.map(CfnTag::unwrap))
  }

  /**
   * The tags used to organize, track, or control access for this resource.
   */
  public open fun tagsRaw(vararg `value`: CfnTag): Unit = tagsRaw(`value`.toList())

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.customerprofiles.CfnDomain].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The URL of the SQS dead letter queue, which is used for reporting errors associated with
     * ingesting data from third party applications.
     *
     * You must set up a policy on the `DeadLetterQueue` for the `SendMessage` operation to enable
     * Amazon Connect Customer Profiles to send messages to the `DeadLetterQueue` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-customerprofiles-domain.html#cfn-customerprofiles-domain-deadletterqueueurl)
     * @param deadLetterQueueUrl The URL of the SQS dead letter queue, which is used for reporting
     * errors associated with ingesting data from third party applications. 
     */
    public fun deadLetterQueueUrl(deadLetterQueueUrl: String)

    /**
     * The default encryption key, which is an AWS managed key, is used when no specific type of
     * encryption key is specified.
     *
     * It is used to encrypt all data before it is placed in permanent or semi-permanent storage.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-customerprofiles-domain.html#cfn-customerprofiles-domain-defaultencryptionkey)
     * @param defaultEncryptionKey The default encryption key, which is an AWS managed key, is used
     * when no specific type of encryption key is specified. 
     */
    public fun defaultEncryptionKey(defaultEncryptionKey: String)

    /**
     * The default number of days until the data within the domain expires.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-customerprofiles-domain.html#cfn-customerprofiles-domain-defaultexpirationdays)
     * @param defaultExpirationDays The default number of days until the data within the domain
     * expires. 
     */
    public fun defaultExpirationDays(defaultExpirationDays: Number)

    /**
     * The unique name of the domain.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-customerprofiles-domain.html#cfn-customerprofiles-domain-domainname)
     * @param domainName The unique name of the domain. 
     */
    public fun domainName(domainName: String)

    /**
     * The process of matching duplicate profiles.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-customerprofiles-domain.html#cfn-customerprofiles-domain-matching)
     * @param matching The process of matching duplicate profiles. 
     */
    public fun matching(matching: IResolvable)

    /**
     * The process of matching duplicate profiles.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-customerprofiles-domain.html#cfn-customerprofiles-domain-matching)
     * @param matching The process of matching duplicate profiles. 
     */
    public fun matching(matching: MatchingProperty)

    /**
     * The process of matching duplicate profiles.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-customerprofiles-domain.html#cfn-customerprofiles-domain-matching)
     * @param matching The process of matching duplicate profiles. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("e38458ae34c1765a7a7e49301316b30b82fdfd804502c05ef8e5ec16df7b4655")
    public fun matching(matching: MatchingProperty.Builder.() -> Unit)

    /**
     * The process of matching duplicate profiles using Rule-Based matching.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-customerprofiles-domain.html#cfn-customerprofiles-domain-rulebasedmatching)
     * @param ruleBasedMatching The process of matching duplicate profiles using Rule-Based
     * matching. 
     */
    public fun ruleBasedMatching(ruleBasedMatching: IResolvable)

    /**
     * The process of matching duplicate profiles using Rule-Based matching.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-customerprofiles-domain.html#cfn-customerprofiles-domain-rulebasedmatching)
     * @param ruleBasedMatching The process of matching duplicate profiles using Rule-Based
     * matching. 
     */
    public fun ruleBasedMatching(ruleBasedMatching: RuleBasedMatchingProperty)

    /**
     * The process of matching duplicate profiles using Rule-Based matching.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-customerprofiles-domain.html#cfn-customerprofiles-domain-rulebasedmatching)
     * @param ruleBasedMatching The process of matching duplicate profiles using Rule-Based
     * matching. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("ad6c8326479fec31d0175a3f92ce3ffe573427cf4bb03162d5bf5e7ced4837bc")
    public fun ruleBasedMatching(ruleBasedMatching: RuleBasedMatchingProperty.Builder.() -> Unit)

    /**
     * The tags used to organize, track, or control access for this resource.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-customerprofiles-domain.html#cfn-customerprofiles-domain-tags)
     * @param tags The tags used to organize, track, or control access for this resource. 
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * The tags used to organize, track, or control access for this resource.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-customerprofiles-domain.html#cfn-customerprofiles-domain-tags)
     * @param tags The tags used to organize, track, or control access for this resource. 
     */
    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.customerprofiles.CfnDomain.Builder =
        software.amazon.awscdk.services.customerprofiles.CfnDomain.Builder.create(scope, id)

    /**
     * The URL of the SQS dead letter queue, which is used for reporting errors associated with
     * ingesting data from third party applications.
     *
     * You must set up a policy on the `DeadLetterQueue` for the `SendMessage` operation to enable
     * Amazon Connect Customer Profiles to send messages to the `DeadLetterQueue` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-customerprofiles-domain.html#cfn-customerprofiles-domain-deadletterqueueurl)
     * @param deadLetterQueueUrl The URL of the SQS dead letter queue, which is used for reporting
     * errors associated with ingesting data from third party applications. 
     */
    override fun deadLetterQueueUrl(deadLetterQueueUrl: String) {
      cdkBuilder.deadLetterQueueUrl(deadLetterQueueUrl)
    }

    /**
     * The default encryption key, which is an AWS managed key, is used when no specific type of
     * encryption key is specified.
     *
     * It is used to encrypt all data before it is placed in permanent or semi-permanent storage.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-customerprofiles-domain.html#cfn-customerprofiles-domain-defaultencryptionkey)
     * @param defaultEncryptionKey The default encryption key, which is an AWS managed key, is used
     * when no specific type of encryption key is specified. 
     */
    override fun defaultEncryptionKey(defaultEncryptionKey: String) {
      cdkBuilder.defaultEncryptionKey(defaultEncryptionKey)
    }

    /**
     * The default number of days until the data within the domain expires.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-customerprofiles-domain.html#cfn-customerprofiles-domain-defaultexpirationdays)
     * @param defaultExpirationDays The default number of days until the data within the domain
     * expires. 
     */
    override fun defaultExpirationDays(defaultExpirationDays: Number) {
      cdkBuilder.defaultExpirationDays(defaultExpirationDays)
    }

    /**
     * The unique name of the domain.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-customerprofiles-domain.html#cfn-customerprofiles-domain-domainname)
     * @param domainName The unique name of the domain. 
     */
    override fun domainName(domainName: String) {
      cdkBuilder.domainName(domainName)
    }

    /**
     * The process of matching duplicate profiles.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-customerprofiles-domain.html#cfn-customerprofiles-domain-matching)
     * @param matching The process of matching duplicate profiles. 
     */
    override fun matching(matching: IResolvable) {
      cdkBuilder.matching(matching.let(IResolvable::unwrap))
    }

    /**
     * The process of matching duplicate profiles.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-customerprofiles-domain.html#cfn-customerprofiles-domain-matching)
     * @param matching The process of matching duplicate profiles. 
     */
    override fun matching(matching: MatchingProperty) {
      cdkBuilder.matching(matching.let(MatchingProperty::unwrap))
    }

    /**
     * The process of matching duplicate profiles.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-customerprofiles-domain.html#cfn-customerprofiles-domain-matching)
     * @param matching The process of matching duplicate profiles. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("e38458ae34c1765a7a7e49301316b30b82fdfd804502c05ef8e5ec16df7b4655")
    override fun matching(matching: MatchingProperty.Builder.() -> Unit): Unit =
        matching(MatchingProperty(matching))

    /**
     * The process of matching duplicate profiles using Rule-Based matching.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-customerprofiles-domain.html#cfn-customerprofiles-domain-rulebasedmatching)
     * @param ruleBasedMatching The process of matching duplicate profiles using Rule-Based
     * matching. 
     */
    override fun ruleBasedMatching(ruleBasedMatching: IResolvable) {
      cdkBuilder.ruleBasedMatching(ruleBasedMatching.let(IResolvable::unwrap))
    }

    /**
     * The process of matching duplicate profiles using Rule-Based matching.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-customerprofiles-domain.html#cfn-customerprofiles-domain-rulebasedmatching)
     * @param ruleBasedMatching The process of matching duplicate profiles using Rule-Based
     * matching. 
     */
    override fun ruleBasedMatching(ruleBasedMatching: RuleBasedMatchingProperty) {
      cdkBuilder.ruleBasedMatching(ruleBasedMatching.let(RuleBasedMatchingProperty::unwrap))
    }

    /**
     * The process of matching duplicate profiles using Rule-Based matching.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-customerprofiles-domain.html#cfn-customerprofiles-domain-rulebasedmatching)
     * @param ruleBasedMatching The process of matching duplicate profiles using Rule-Based
     * matching. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("ad6c8326479fec31d0175a3f92ce3ffe573427cf4bb03162d5bf5e7ced4837bc")
    override fun ruleBasedMatching(ruleBasedMatching: RuleBasedMatchingProperty.Builder.() -> Unit):
        Unit = ruleBasedMatching(RuleBasedMatchingProperty(ruleBasedMatching))

    /**
     * The tags used to organize, track, or control access for this resource.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-customerprofiles-domain.html#cfn-customerprofiles-domain-tags)
     * @param tags The tags used to organize, track, or control access for this resource. 
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    /**
     * The tags used to organize, track, or control access for this resource.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-customerprofiles-domain.html#cfn-customerprofiles-domain-tags)
     * @param tags The tags used to organize, track, or control access for this resource. 
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.customerprofiles.CfnDomain =
        cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.customerprofiles.CfnDomain.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnDomain {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnDomain(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.customerprofiles.CfnDomain):
        CfnDomain = CfnDomain(cdkObject)

    internal fun unwrap(wrapped: CfnDomain):
        software.amazon.awscdk.services.customerprofiles.CfnDomain = wrapped.cdkObject
  }

  /**
   * The S3 location where Identity Resolution Jobs write result files.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.customerprofiles.*;
   * S3ExportingConfigProperty s3ExportingConfigProperty = S3ExportingConfigProperty.builder()
   * .s3BucketName("s3BucketName")
   * // the properties below are optional
   * .s3KeyName("s3KeyName")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-customerprofiles-domain-s3exportingconfig.html)
   */
  public interface S3ExportingConfigProperty {
    /**
     * The name of the S3 bucket where Identity Resolution Jobs write result files.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-customerprofiles-domain-s3exportingconfig.html#cfn-customerprofiles-domain-s3exportingconfig-s3bucketname)
     */
    public fun s3BucketName(): String

    /**
     * The S3 key name of the location where Identity Resolution Jobs write result files.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-customerprofiles-domain-s3exportingconfig.html#cfn-customerprofiles-domain-s3exportingconfig-s3keyname)
     */
    public fun s3KeyName(): String? = unwrap(this).getS3KeyName()

    /**
     * A builder for [S3ExportingConfigProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param s3BucketName The name of the S3 bucket where Identity Resolution Jobs write result
       * files. 
       */
      public fun s3BucketName(s3BucketName: String)

      /**
       * @param s3KeyName The S3 key name of the location where Identity Resolution Jobs write
       * result files.
       */
      public fun s3KeyName(s3KeyName: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.customerprofiles.CfnDomain.S3ExportingConfigProperty.Builder
          =
          software.amazon.awscdk.services.customerprofiles.CfnDomain.S3ExportingConfigProperty.builder()

      /**
       * @param s3BucketName The name of the S3 bucket where Identity Resolution Jobs write result
       * files. 
       */
      override fun s3BucketName(s3BucketName: String) {
        cdkBuilder.s3BucketName(s3BucketName)
      }

      /**
       * @param s3KeyName The S3 key name of the location where Identity Resolution Jobs write
       * result files.
       */
      override fun s3KeyName(s3KeyName: String) {
        cdkBuilder.s3KeyName(s3KeyName)
      }

      public fun build():
          software.amazon.awscdk.services.customerprofiles.CfnDomain.S3ExportingConfigProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.customerprofiles.CfnDomain.S3ExportingConfigProperty,
    ) : CdkObject(cdkObject), S3ExportingConfigProperty {
      /**
       * The name of the S3 bucket where Identity Resolution Jobs write result files.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-customerprofiles-domain-s3exportingconfig.html#cfn-customerprofiles-domain-s3exportingconfig-s3bucketname)
       */
      override fun s3BucketName(): String = unwrap(this).getS3BucketName()

      /**
       * The S3 key name of the location where Identity Resolution Jobs write result files.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-customerprofiles-domain-s3exportingconfig.html#cfn-customerprofiles-domain-s3exportingconfig-s3keyname)
       */
      override fun s3KeyName(): String? = unwrap(this).getS3KeyName()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): S3ExportingConfigProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.customerprofiles.CfnDomain.S3ExportingConfigProperty):
          S3ExportingConfigProperty = CdkObjectWrappers.wrap(cdkObject) as?
          S3ExportingConfigProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: S3ExportingConfigProperty):
          software.amazon.awscdk.services.customerprofiles.CfnDomain.S3ExportingConfigProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.customerprofiles.CfnDomain.S3ExportingConfigProperty
    }
  }

  /**
   * Configuration information about the auto-merging process.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.customerprofiles.*;
   * AutoMergingProperty autoMergingProperty = AutoMergingProperty.builder()
   * .enabled(false)
   * // the properties below are optional
   * .conflictResolution(ConflictResolutionProperty.builder()
   * .conflictResolvingModel("conflictResolvingModel")
   * // the properties below are optional
   * .sourceName("sourceName")
   * .build())
   * .consolidation(ConsolidationProperty.builder()
   * .matchingAttributesList(List.of(List.of("matchingAttributesList")))
   * .build())
   * .minAllowedConfidenceScoreForMerging(123)
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-customerprofiles-domain-automerging.html)
   */
  public interface AutoMergingProperty {
    /**
     * Determines how the auto-merging process should resolve conflicts between different profiles.
     *
     * For example, if Profile A and Profile B have the same `FirstName` and `LastName` ,
     * `ConflictResolution` specifies which `EmailAddress` should be used.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-customerprofiles-domain-automerging.html#cfn-customerprofiles-domain-automerging-conflictresolution)
     */
    public fun conflictResolution(): Any? = unwrap(this).getConflictResolution()

    /**
     * A list of matching attributes that represent matching criteria.
     *
     * If two profiles meet at least one of the requirements in the matching attributes list, they
     * will be merged.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-customerprofiles-domain-automerging.html#cfn-customerprofiles-domain-automerging-consolidation)
     */
    public fun consolidation(): Any? = unwrap(this).getConsolidation()

    /**
     * The flag that enables the auto-merging of duplicate profiles.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-customerprofiles-domain-automerging.html#cfn-customerprofiles-domain-automerging-enabled)
     */
    public fun enabled(): Any

    /**
     * A number between 0 and 1 that represents the minimum confidence score required for profiles
     * within a matching group to be merged during the auto-merge process.
     *
     * A higher score means that a higher similarity is required to merge profiles.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-customerprofiles-domain-automerging.html#cfn-customerprofiles-domain-automerging-minallowedconfidencescoreformerging)
     */
    public fun minAllowedConfidenceScoreForMerging(): Number? =
        unwrap(this).getMinAllowedConfidenceScoreForMerging()

    /**
     * A builder for [AutoMergingProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param conflictResolution Determines how the auto-merging process should resolve conflicts
       * between different profiles.
       * For example, if Profile A and Profile B have the same `FirstName` and `LastName` ,
       * `ConflictResolution` specifies which `EmailAddress` should be used.
       */
      public fun conflictResolution(conflictResolution: IResolvable)

      /**
       * @param conflictResolution Determines how the auto-merging process should resolve conflicts
       * between different profiles.
       * For example, if Profile A and Profile B have the same `FirstName` and `LastName` ,
       * `ConflictResolution` specifies which `EmailAddress` should be used.
       */
      public fun conflictResolution(conflictResolution: ConflictResolutionProperty)

      /**
       * @param conflictResolution Determines how the auto-merging process should resolve conflicts
       * between different profiles.
       * For example, if Profile A and Profile B have the same `FirstName` and `LastName` ,
       * `ConflictResolution` specifies which `EmailAddress` should be used.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("a5ccb8bda605b8c0ced514db1ddecb795bb5dafb1a21230a08e064f1dcf1bd7e")
      public
          fun conflictResolution(conflictResolution: ConflictResolutionProperty.Builder.() -> Unit)

      /**
       * @param consolidation A list of matching attributes that represent matching criteria.
       * If two profiles meet at least one of the requirements in the matching attributes list, they
       * will be merged.
       */
      public fun consolidation(consolidation: IResolvable)

      /**
       * @param consolidation A list of matching attributes that represent matching criteria.
       * If two profiles meet at least one of the requirements in the matching attributes list, they
       * will be merged.
       */
      public fun consolidation(consolidation: ConsolidationProperty)

      /**
       * @param consolidation A list of matching attributes that represent matching criteria.
       * If two profiles meet at least one of the requirements in the matching attributes list, they
       * will be merged.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("588475a49e8665372eaaf66d60a9ace54fcd7d2dcd66c30f0ad94144aa78d90d")
      public fun consolidation(consolidation: ConsolidationProperty.Builder.() -> Unit)

      /**
       * @param enabled The flag that enables the auto-merging of duplicate profiles. 
       */
      public fun enabled(enabled: Boolean)

      /**
       * @param enabled The flag that enables the auto-merging of duplicate profiles. 
       */
      public fun enabled(enabled: IResolvable)

      /**
       * @param minAllowedConfidenceScoreForMerging A number between 0 and 1 that represents the
       * minimum confidence score required for profiles within a matching group to be merged during the
       * auto-merge process.
       * A higher score means that a higher similarity is required to merge profiles.
       */
      public fun minAllowedConfidenceScoreForMerging(minAllowedConfidenceScoreForMerging: Number)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.customerprofiles.CfnDomain.AutoMergingProperty.Builder =
          software.amazon.awscdk.services.customerprofiles.CfnDomain.AutoMergingProperty.builder()

      /**
       * @param conflictResolution Determines how the auto-merging process should resolve conflicts
       * between different profiles.
       * For example, if Profile A and Profile B have the same `FirstName` and `LastName` ,
       * `ConflictResolution` specifies which `EmailAddress` should be used.
       */
      override fun conflictResolution(conflictResolution: IResolvable) {
        cdkBuilder.conflictResolution(conflictResolution.let(IResolvable::unwrap))
      }

      /**
       * @param conflictResolution Determines how the auto-merging process should resolve conflicts
       * between different profiles.
       * For example, if Profile A and Profile B have the same `FirstName` and `LastName` ,
       * `ConflictResolution` specifies which `EmailAddress` should be used.
       */
      override fun conflictResolution(conflictResolution: ConflictResolutionProperty) {
        cdkBuilder.conflictResolution(conflictResolution.let(ConflictResolutionProperty::unwrap))
      }

      /**
       * @param conflictResolution Determines how the auto-merging process should resolve conflicts
       * between different profiles.
       * For example, if Profile A and Profile B have the same `FirstName` and `LastName` ,
       * `ConflictResolution` specifies which `EmailAddress` should be used.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("a5ccb8bda605b8c0ced514db1ddecb795bb5dafb1a21230a08e064f1dcf1bd7e")
      override
          fun conflictResolution(conflictResolution: ConflictResolutionProperty.Builder.() -> Unit):
          Unit = conflictResolution(ConflictResolutionProperty(conflictResolution))

      /**
       * @param consolidation A list of matching attributes that represent matching criteria.
       * If two profiles meet at least one of the requirements in the matching attributes list, they
       * will be merged.
       */
      override fun consolidation(consolidation: IResolvable) {
        cdkBuilder.consolidation(consolidation.let(IResolvable::unwrap))
      }

      /**
       * @param consolidation A list of matching attributes that represent matching criteria.
       * If two profiles meet at least one of the requirements in the matching attributes list, they
       * will be merged.
       */
      override fun consolidation(consolidation: ConsolidationProperty) {
        cdkBuilder.consolidation(consolidation.let(ConsolidationProperty::unwrap))
      }

      /**
       * @param consolidation A list of matching attributes that represent matching criteria.
       * If two profiles meet at least one of the requirements in the matching attributes list, they
       * will be merged.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("588475a49e8665372eaaf66d60a9ace54fcd7d2dcd66c30f0ad94144aa78d90d")
      override fun consolidation(consolidation: ConsolidationProperty.Builder.() -> Unit): Unit =
          consolidation(ConsolidationProperty(consolidation))

      /**
       * @param enabled The flag that enables the auto-merging of duplicate profiles. 
       */
      override fun enabled(enabled: Boolean) {
        cdkBuilder.enabled(enabled)
      }

      /**
       * @param enabled The flag that enables the auto-merging of duplicate profiles. 
       */
      override fun enabled(enabled: IResolvable) {
        cdkBuilder.enabled(enabled.let(IResolvable::unwrap))
      }

      /**
       * @param minAllowedConfidenceScoreForMerging A number between 0 and 1 that represents the
       * minimum confidence score required for profiles within a matching group to be merged during the
       * auto-merge process.
       * A higher score means that a higher similarity is required to merge profiles.
       */
      override
          fun minAllowedConfidenceScoreForMerging(minAllowedConfidenceScoreForMerging: Number) {
        cdkBuilder.minAllowedConfidenceScoreForMerging(minAllowedConfidenceScoreForMerging)
      }

      public fun build():
          software.amazon.awscdk.services.customerprofiles.CfnDomain.AutoMergingProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.customerprofiles.CfnDomain.AutoMergingProperty,
    ) : CdkObject(cdkObject), AutoMergingProperty {
      /**
       * Determines how the auto-merging process should resolve conflicts between different
       * profiles.
       *
       * For example, if Profile A and Profile B have the same `FirstName` and `LastName` ,
       * `ConflictResolution` specifies which `EmailAddress` should be used.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-customerprofiles-domain-automerging.html#cfn-customerprofiles-domain-automerging-conflictresolution)
       */
      override fun conflictResolution(): Any? = unwrap(this).getConflictResolution()

      /**
       * A list of matching attributes that represent matching criteria.
       *
       * If two profiles meet at least one of the requirements in the matching attributes list, they
       * will be merged.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-customerprofiles-domain-automerging.html#cfn-customerprofiles-domain-automerging-consolidation)
       */
      override fun consolidation(): Any? = unwrap(this).getConsolidation()

      /**
       * The flag that enables the auto-merging of duplicate profiles.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-customerprofiles-domain-automerging.html#cfn-customerprofiles-domain-automerging-enabled)
       */
      override fun enabled(): Any = unwrap(this).getEnabled()

      /**
       * A number between 0 and 1 that represents the minimum confidence score required for profiles
       * within a matching group to be merged during the auto-merge process.
       *
       * A higher score means that a higher similarity is required to merge profiles.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-customerprofiles-domain-automerging.html#cfn-customerprofiles-domain-automerging-minallowedconfidencescoreformerging)
       */
      override fun minAllowedConfidenceScoreForMerging(): Number? =
          unwrap(this).getMinAllowedConfidenceScoreForMerging()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): AutoMergingProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.customerprofiles.CfnDomain.AutoMergingProperty):
          AutoMergingProperty = CdkObjectWrappers.wrap(cdkObject) as? AutoMergingProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: AutoMergingProperty):
          software.amazon.awscdk.services.customerprofiles.CfnDomain.AutoMergingProperty = (wrapped
          as CdkObject).cdkObject as
          software.amazon.awscdk.services.customerprofiles.CfnDomain.AutoMergingProperty
    }
  }

  /**
   * The process of matching duplicate profiles using Rule-Based matching.
   *
   * If `RuleBasedMatching = true` , Amazon Connect Customer Profiles will start to match and merge
   * your profiles according to your configuration in the `RuleBasedMatchingRequest` . You can use the
   * `ListRuleBasedMatches` and `GetSimilarProfiles` API to return and review the results. Also, if you
   * have configured `ExportingConfig` in the `RuleBasedMatchingRequest` , you can download the results
   * from S3.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.customerprofiles.*;
   * RuleBasedMatchingProperty ruleBasedMatchingProperty = RuleBasedMatchingProperty.builder()
   * .enabled(false)
   * // the properties below are optional
   * .attributeTypesSelector(AttributeTypesSelectorProperty.builder()
   * .attributeMatchingModel("attributeMatchingModel")
   * // the properties below are optional
   * .address(List.of("address"))
   * .emailAddress(List.of("emailAddress"))
   * .phoneNumber(List.of("phoneNumber"))
   * .build())
   * .conflictResolution(ConflictResolutionProperty.builder()
   * .conflictResolvingModel("conflictResolvingModel")
   * // the properties below are optional
   * .sourceName("sourceName")
   * .build())
   * .exportingConfig(ExportingConfigProperty.builder()
   * .s3Exporting(S3ExportingConfigProperty.builder()
   * .s3BucketName("s3BucketName")
   * // the properties below are optional
   * .s3KeyName("s3KeyName")
   * .build())
   * .build())
   * .matchingRules(List.of(MatchingRuleProperty.builder()
   * .rule(List.of("rule"))
   * .build()))
   * .maxAllowedRuleLevelForMatching(123)
   * .maxAllowedRuleLevelForMerging(123)
   * .status("status")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-customerprofiles-domain-rulebasedmatching.html)
   */
  public interface RuleBasedMatchingProperty {
    /**
     * Configures information about the `AttributeTypesSelector` where the rule-based identity
     * resolution uses to match profiles.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-customerprofiles-domain-rulebasedmatching.html#cfn-customerprofiles-domain-rulebasedmatching-attributetypesselector)
     */
    public fun attributeTypesSelector(): Any? = unwrap(this).getAttributeTypesSelector()

    /**
     * Determines how the auto-merging process should resolve conflicts between different profiles.
     *
     * For example, if Profile A and Profile B have the same `FirstName` and `LastName` ,
     * `ConflictResolution` specifies which `EmailAddress` should be used.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-customerprofiles-domain-rulebasedmatching.html#cfn-customerprofiles-domain-rulebasedmatching-conflictresolution)
     */
    public fun conflictResolution(): Any? = unwrap(this).getConflictResolution()

    /**
     * The flag that enables the matching process of duplicate profiles.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-customerprofiles-domain-rulebasedmatching.html#cfn-customerprofiles-domain-rulebasedmatching-enabled)
     */
    public fun enabled(): Any

    /**
     * The S3 location where Identity Resolution Jobs write result files.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-customerprofiles-domain-rulebasedmatching.html#cfn-customerprofiles-domain-rulebasedmatching-exportingconfig)
     */
    public fun exportingConfig(): Any? = unwrap(this).getExportingConfig()

    /**
     * Configures how the rule-based matching process should match profiles.
     *
     * You can have up to 15 `MatchingRule` in the `MatchingRules` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-customerprofiles-domain-rulebasedmatching.html#cfn-customerprofiles-domain-rulebasedmatching-matchingrules)
     */
    public fun matchingRules(): Any? = unwrap(this).getMatchingRules()

    /**
     * Indicates the maximum allowed rule level for matching.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-customerprofiles-domain-rulebasedmatching.html#cfn-customerprofiles-domain-rulebasedmatching-maxallowedrulelevelformatching)
     */
    public fun maxAllowedRuleLevelForMatching(): Number? =
        unwrap(this).getMaxAllowedRuleLevelForMatching()

    /**
     * Indicates the maximum allowed rule level for merging.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-customerprofiles-domain-rulebasedmatching.html#cfn-customerprofiles-domain-rulebasedmatching-maxallowedrulelevelformerging)
     */
    public fun maxAllowedRuleLevelForMerging(): Number? =
        unwrap(this).getMaxAllowedRuleLevelForMerging()

    /**
     * The status of rule-based matching rule.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-customerprofiles-domain-rulebasedmatching.html#cfn-customerprofiles-domain-rulebasedmatching-status)
     */
    public fun status(): String? = unwrap(this).getStatus()

    /**
     * A builder for [RuleBasedMatchingProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param attributeTypesSelector Configures information about the `AttributeTypesSelector`
       * where the rule-based identity resolution uses to match profiles.
       */
      public fun attributeTypesSelector(attributeTypesSelector: IResolvable)

      /**
       * @param attributeTypesSelector Configures information about the `AttributeTypesSelector`
       * where the rule-based identity resolution uses to match profiles.
       */
      public fun attributeTypesSelector(attributeTypesSelector: AttributeTypesSelectorProperty)

      /**
       * @param attributeTypesSelector Configures information about the `AttributeTypesSelector`
       * where the rule-based identity resolution uses to match profiles.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("384295a2d64f6e20fa9fdd4eff187f211054525d9c5899874c59c253ef9b3909")
      public
          fun attributeTypesSelector(attributeTypesSelector: AttributeTypesSelectorProperty.Builder.() -> Unit)

      /**
       * @param conflictResolution Determines how the auto-merging process should resolve conflicts
       * between different profiles.
       * For example, if Profile A and Profile B have the same `FirstName` and `LastName` ,
       * `ConflictResolution` specifies which `EmailAddress` should be used.
       */
      public fun conflictResolution(conflictResolution: IResolvable)

      /**
       * @param conflictResolution Determines how the auto-merging process should resolve conflicts
       * between different profiles.
       * For example, if Profile A and Profile B have the same `FirstName` and `LastName` ,
       * `ConflictResolution` specifies which `EmailAddress` should be used.
       */
      public fun conflictResolution(conflictResolution: ConflictResolutionProperty)

      /**
       * @param conflictResolution Determines how the auto-merging process should resolve conflicts
       * between different profiles.
       * For example, if Profile A and Profile B have the same `FirstName` and `LastName` ,
       * `ConflictResolution` specifies which `EmailAddress` should be used.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("93ec69cbddffcd12af33b57f49d61f338305f823b557ca488dc39f2b24b247bf")
      public
          fun conflictResolution(conflictResolution: ConflictResolutionProperty.Builder.() -> Unit)

      /**
       * @param enabled The flag that enables the matching process of duplicate profiles. 
       */
      public fun enabled(enabled: Boolean)

      /**
       * @param enabled The flag that enables the matching process of duplicate profiles. 
       */
      public fun enabled(enabled: IResolvable)

      /**
       * @param exportingConfig The S3 location where Identity Resolution Jobs write result files.
       */
      public fun exportingConfig(exportingConfig: IResolvable)

      /**
       * @param exportingConfig The S3 location where Identity Resolution Jobs write result files.
       */
      public fun exportingConfig(exportingConfig: ExportingConfigProperty)

      /**
       * @param exportingConfig The S3 location where Identity Resolution Jobs write result files.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("3ae8dd681fa699bfc90a4ced2542f77bd9e133e50290bb6967915d30a976a5b7")
      public fun exportingConfig(exportingConfig: ExportingConfigProperty.Builder.() -> Unit)

      /**
       * @param matchingRules Configures how the rule-based matching process should match profiles.
       * You can have up to 15 `MatchingRule` in the `MatchingRules` .
       */
      public fun matchingRules(matchingRules: IResolvable)

      /**
       * @param matchingRules Configures how the rule-based matching process should match profiles.
       * You can have up to 15 `MatchingRule` in the `MatchingRules` .
       */
      public fun matchingRules(matchingRules: List<Any>)

      /**
       * @param matchingRules Configures how the rule-based matching process should match profiles.
       * You can have up to 15 `MatchingRule` in the `MatchingRules` .
       */
      public fun matchingRules(vararg matchingRules: Any)

      /**
       * @param maxAllowedRuleLevelForMatching Indicates the maximum allowed rule level for
       * matching.
       */
      public fun maxAllowedRuleLevelForMatching(maxAllowedRuleLevelForMatching: Number)

      /**
       * @param maxAllowedRuleLevelForMerging Indicates the maximum allowed rule level for merging.
       */
      public fun maxAllowedRuleLevelForMerging(maxAllowedRuleLevelForMerging: Number)

      /**
       * @param status The status of rule-based matching rule.
       */
      public fun status(status: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.customerprofiles.CfnDomain.RuleBasedMatchingProperty.Builder
          =
          software.amazon.awscdk.services.customerprofiles.CfnDomain.RuleBasedMatchingProperty.builder()

      /**
       * @param attributeTypesSelector Configures information about the `AttributeTypesSelector`
       * where the rule-based identity resolution uses to match profiles.
       */
      override fun attributeTypesSelector(attributeTypesSelector: IResolvable) {
        cdkBuilder.attributeTypesSelector(attributeTypesSelector.let(IResolvable::unwrap))
      }

      /**
       * @param attributeTypesSelector Configures information about the `AttributeTypesSelector`
       * where the rule-based identity resolution uses to match profiles.
       */
      override fun attributeTypesSelector(attributeTypesSelector: AttributeTypesSelectorProperty) {
        cdkBuilder.attributeTypesSelector(attributeTypesSelector.let(AttributeTypesSelectorProperty::unwrap))
      }

      /**
       * @param attributeTypesSelector Configures information about the `AttributeTypesSelector`
       * where the rule-based identity resolution uses to match profiles.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("384295a2d64f6e20fa9fdd4eff187f211054525d9c5899874c59c253ef9b3909")
      override
          fun attributeTypesSelector(attributeTypesSelector: AttributeTypesSelectorProperty.Builder.() -> Unit):
          Unit = attributeTypesSelector(AttributeTypesSelectorProperty(attributeTypesSelector))

      /**
       * @param conflictResolution Determines how the auto-merging process should resolve conflicts
       * between different profiles.
       * For example, if Profile A and Profile B have the same `FirstName` and `LastName` ,
       * `ConflictResolution` specifies which `EmailAddress` should be used.
       */
      override fun conflictResolution(conflictResolution: IResolvable) {
        cdkBuilder.conflictResolution(conflictResolution.let(IResolvable::unwrap))
      }

      /**
       * @param conflictResolution Determines how the auto-merging process should resolve conflicts
       * between different profiles.
       * For example, if Profile A and Profile B have the same `FirstName` and `LastName` ,
       * `ConflictResolution` specifies which `EmailAddress` should be used.
       */
      override fun conflictResolution(conflictResolution: ConflictResolutionProperty) {
        cdkBuilder.conflictResolution(conflictResolution.let(ConflictResolutionProperty::unwrap))
      }

      /**
       * @param conflictResolution Determines how the auto-merging process should resolve conflicts
       * between different profiles.
       * For example, if Profile A and Profile B have the same `FirstName` and `LastName` ,
       * `ConflictResolution` specifies which `EmailAddress` should be used.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("93ec69cbddffcd12af33b57f49d61f338305f823b557ca488dc39f2b24b247bf")
      override
          fun conflictResolution(conflictResolution: ConflictResolutionProperty.Builder.() -> Unit):
          Unit = conflictResolution(ConflictResolutionProperty(conflictResolution))

      /**
       * @param enabled The flag that enables the matching process of duplicate profiles. 
       */
      override fun enabled(enabled: Boolean) {
        cdkBuilder.enabled(enabled)
      }

      /**
       * @param enabled The flag that enables the matching process of duplicate profiles. 
       */
      override fun enabled(enabled: IResolvable) {
        cdkBuilder.enabled(enabled.let(IResolvable::unwrap))
      }

      /**
       * @param exportingConfig The S3 location where Identity Resolution Jobs write result files.
       */
      override fun exportingConfig(exportingConfig: IResolvable) {
        cdkBuilder.exportingConfig(exportingConfig.let(IResolvable::unwrap))
      }

      /**
       * @param exportingConfig The S3 location where Identity Resolution Jobs write result files.
       */
      override fun exportingConfig(exportingConfig: ExportingConfigProperty) {
        cdkBuilder.exportingConfig(exportingConfig.let(ExportingConfigProperty::unwrap))
      }

      /**
       * @param exportingConfig The S3 location where Identity Resolution Jobs write result files.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("3ae8dd681fa699bfc90a4ced2542f77bd9e133e50290bb6967915d30a976a5b7")
      override fun exportingConfig(exportingConfig: ExportingConfigProperty.Builder.() -> Unit):
          Unit = exportingConfig(ExportingConfigProperty(exportingConfig))

      /**
       * @param matchingRules Configures how the rule-based matching process should match profiles.
       * You can have up to 15 `MatchingRule` in the `MatchingRules` .
       */
      override fun matchingRules(matchingRules: IResolvable) {
        cdkBuilder.matchingRules(matchingRules.let(IResolvable::unwrap))
      }

      /**
       * @param matchingRules Configures how the rule-based matching process should match profiles.
       * You can have up to 15 `MatchingRule` in the `MatchingRules` .
       */
      override fun matchingRules(matchingRules: List<Any>) {
        cdkBuilder.matchingRules(matchingRules)
      }

      /**
       * @param matchingRules Configures how the rule-based matching process should match profiles.
       * You can have up to 15 `MatchingRule` in the `MatchingRules` .
       */
      override fun matchingRules(vararg matchingRules: Any): Unit =
          matchingRules(matchingRules.toList())

      /**
       * @param maxAllowedRuleLevelForMatching Indicates the maximum allowed rule level for
       * matching.
       */
      override fun maxAllowedRuleLevelForMatching(maxAllowedRuleLevelForMatching: Number) {
        cdkBuilder.maxAllowedRuleLevelForMatching(maxAllowedRuleLevelForMatching)
      }

      /**
       * @param maxAllowedRuleLevelForMerging Indicates the maximum allowed rule level for merging.
       */
      override fun maxAllowedRuleLevelForMerging(maxAllowedRuleLevelForMerging: Number) {
        cdkBuilder.maxAllowedRuleLevelForMerging(maxAllowedRuleLevelForMerging)
      }

      /**
       * @param status The status of rule-based matching rule.
       */
      override fun status(status: String) {
        cdkBuilder.status(status)
      }

      public fun build():
          software.amazon.awscdk.services.customerprofiles.CfnDomain.RuleBasedMatchingProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.customerprofiles.CfnDomain.RuleBasedMatchingProperty,
    ) : CdkObject(cdkObject), RuleBasedMatchingProperty {
      /**
       * Configures information about the `AttributeTypesSelector` where the rule-based identity
       * resolution uses to match profiles.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-customerprofiles-domain-rulebasedmatching.html#cfn-customerprofiles-domain-rulebasedmatching-attributetypesselector)
       */
      override fun attributeTypesSelector(): Any? = unwrap(this).getAttributeTypesSelector()

      /**
       * Determines how the auto-merging process should resolve conflicts between different
       * profiles.
       *
       * For example, if Profile A and Profile B have the same `FirstName` and `LastName` ,
       * `ConflictResolution` specifies which `EmailAddress` should be used.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-customerprofiles-domain-rulebasedmatching.html#cfn-customerprofiles-domain-rulebasedmatching-conflictresolution)
       */
      override fun conflictResolution(): Any? = unwrap(this).getConflictResolution()

      /**
       * The flag that enables the matching process of duplicate profiles.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-customerprofiles-domain-rulebasedmatching.html#cfn-customerprofiles-domain-rulebasedmatching-enabled)
       */
      override fun enabled(): Any = unwrap(this).getEnabled()

      /**
       * The S3 location where Identity Resolution Jobs write result files.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-customerprofiles-domain-rulebasedmatching.html#cfn-customerprofiles-domain-rulebasedmatching-exportingconfig)
       */
      override fun exportingConfig(): Any? = unwrap(this).getExportingConfig()

      /**
       * Configures how the rule-based matching process should match profiles.
       *
       * You can have up to 15 `MatchingRule` in the `MatchingRules` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-customerprofiles-domain-rulebasedmatching.html#cfn-customerprofiles-domain-rulebasedmatching-matchingrules)
       */
      override fun matchingRules(): Any? = unwrap(this).getMatchingRules()

      /**
       * Indicates the maximum allowed rule level for matching.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-customerprofiles-domain-rulebasedmatching.html#cfn-customerprofiles-domain-rulebasedmatching-maxallowedrulelevelformatching)
       */
      override fun maxAllowedRuleLevelForMatching(): Number? =
          unwrap(this).getMaxAllowedRuleLevelForMatching()

      /**
       * Indicates the maximum allowed rule level for merging.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-customerprofiles-domain-rulebasedmatching.html#cfn-customerprofiles-domain-rulebasedmatching-maxallowedrulelevelformerging)
       */
      override fun maxAllowedRuleLevelForMerging(): Number? =
          unwrap(this).getMaxAllowedRuleLevelForMerging()

      /**
       * The status of rule-based matching rule.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-customerprofiles-domain-rulebasedmatching.html#cfn-customerprofiles-domain-rulebasedmatching-status)
       */
      override fun status(): String? = unwrap(this).getStatus()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): RuleBasedMatchingProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.customerprofiles.CfnDomain.RuleBasedMatchingProperty):
          RuleBasedMatchingProperty = CdkObjectWrappers.wrap(cdkObject) as?
          RuleBasedMatchingProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: RuleBasedMatchingProperty):
          software.amazon.awscdk.services.customerprofiles.CfnDomain.RuleBasedMatchingProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.customerprofiles.CfnDomain.RuleBasedMatchingProperty
    }
  }

  /**
   * The process of matching duplicate profiles.
   *
   * If `Matching = true` , Amazon Connect Customer Profiles starts a weekly batch process called
   * *Identity Resolution Job* . If you do not specify a date and time for the *Identity Resolution
   * Job* to run, by default it runs every Saturday at 12AM UTC to detect duplicate profiles in your
   * domains. After the *Identity Resolution Job* completes, use the `GetMatches` API to return and
   * review the results. Or, if you have configured `ExportingConfig` in the `MatchingRequest` , you
   * can download the results from S3.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.customerprofiles.*;
   * MatchingProperty matchingProperty = MatchingProperty.builder()
   * .enabled(false)
   * // the properties below are optional
   * .autoMerging(AutoMergingProperty.builder()
   * .enabled(false)
   * // the properties below are optional
   * .conflictResolution(ConflictResolutionProperty.builder()
   * .conflictResolvingModel("conflictResolvingModel")
   * // the properties below are optional
   * .sourceName("sourceName")
   * .build())
   * .consolidation(ConsolidationProperty.builder()
   * .matchingAttributesList(List.of(List.of("matchingAttributesList")))
   * .build())
   * .minAllowedConfidenceScoreForMerging(123)
   * .build())
   * .exportingConfig(ExportingConfigProperty.builder()
   * .s3Exporting(S3ExportingConfigProperty.builder()
   * .s3BucketName("s3BucketName")
   * // the properties below are optional
   * .s3KeyName("s3KeyName")
   * .build())
   * .build())
   * .jobSchedule(JobScheduleProperty.builder()
   * .dayOfTheWeek("dayOfTheWeek")
   * .time("time")
   * .build())
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-customerprofiles-domain-matching.html)
   */
  public interface MatchingProperty {
    /**
     * Configuration information about the auto-merging process.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-customerprofiles-domain-matching.html#cfn-customerprofiles-domain-matching-automerging)
     */
    public fun autoMerging(): Any? = unwrap(this).getAutoMerging()

    /**
     * The flag that enables the matching process of duplicate profiles.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-customerprofiles-domain-matching.html#cfn-customerprofiles-domain-matching-enabled)
     */
    public fun enabled(): Any

    /**
     * The S3 location where Identity Resolution Jobs write result files.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-customerprofiles-domain-matching.html#cfn-customerprofiles-domain-matching-exportingconfig)
     */
    public fun exportingConfig(): Any? = unwrap(this).getExportingConfig()

    /**
     * The day and time when do you want to start the Identity Resolution Job every week.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-customerprofiles-domain-matching.html#cfn-customerprofiles-domain-matching-jobschedule)
     */
    public fun jobSchedule(): Any? = unwrap(this).getJobSchedule()

    /**
     * A builder for [MatchingProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param autoMerging Configuration information about the auto-merging process.
       */
      public fun autoMerging(autoMerging: IResolvable)

      /**
       * @param autoMerging Configuration information about the auto-merging process.
       */
      public fun autoMerging(autoMerging: AutoMergingProperty)

      /**
       * @param autoMerging Configuration information about the auto-merging process.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("006c8afb155ab17de412e5eced95bbf709a1b974ded50cbc76bfc3401e13b256")
      public fun autoMerging(autoMerging: AutoMergingProperty.Builder.() -> Unit)

      /**
       * @param enabled The flag that enables the matching process of duplicate profiles. 
       */
      public fun enabled(enabled: Boolean)

      /**
       * @param enabled The flag that enables the matching process of duplicate profiles. 
       */
      public fun enabled(enabled: IResolvable)

      /**
       * @param exportingConfig The S3 location where Identity Resolution Jobs write result files.
       */
      public fun exportingConfig(exportingConfig: IResolvable)

      /**
       * @param exportingConfig The S3 location where Identity Resolution Jobs write result files.
       */
      public fun exportingConfig(exportingConfig: ExportingConfigProperty)

      /**
       * @param exportingConfig The S3 location where Identity Resolution Jobs write result files.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("e4cec075da95f0eaaee5ce2d281806dd984b8c1307ef88f39332d60fb47da8dc")
      public fun exportingConfig(exportingConfig: ExportingConfigProperty.Builder.() -> Unit)

      /**
       * @param jobSchedule The day and time when do you want to start the Identity Resolution Job
       * every week.
       */
      public fun jobSchedule(jobSchedule: IResolvable)

      /**
       * @param jobSchedule The day and time when do you want to start the Identity Resolution Job
       * every week.
       */
      public fun jobSchedule(jobSchedule: JobScheduleProperty)

      /**
       * @param jobSchedule The day and time when do you want to start the Identity Resolution Job
       * every week.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("c9b628426b7ed68c60c13c72d013513ebf9e5810bee900c1197cfa87ba054cc1")
      public fun jobSchedule(jobSchedule: JobScheduleProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.customerprofiles.CfnDomain.MatchingProperty.Builder =
          software.amazon.awscdk.services.customerprofiles.CfnDomain.MatchingProperty.builder()

      /**
       * @param autoMerging Configuration information about the auto-merging process.
       */
      override fun autoMerging(autoMerging: IResolvable) {
        cdkBuilder.autoMerging(autoMerging.let(IResolvable::unwrap))
      }

      /**
       * @param autoMerging Configuration information about the auto-merging process.
       */
      override fun autoMerging(autoMerging: AutoMergingProperty) {
        cdkBuilder.autoMerging(autoMerging.let(AutoMergingProperty::unwrap))
      }

      /**
       * @param autoMerging Configuration information about the auto-merging process.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("006c8afb155ab17de412e5eced95bbf709a1b974ded50cbc76bfc3401e13b256")
      override fun autoMerging(autoMerging: AutoMergingProperty.Builder.() -> Unit): Unit =
          autoMerging(AutoMergingProperty(autoMerging))

      /**
       * @param enabled The flag that enables the matching process of duplicate profiles. 
       */
      override fun enabled(enabled: Boolean) {
        cdkBuilder.enabled(enabled)
      }

      /**
       * @param enabled The flag that enables the matching process of duplicate profiles. 
       */
      override fun enabled(enabled: IResolvable) {
        cdkBuilder.enabled(enabled.let(IResolvable::unwrap))
      }

      /**
       * @param exportingConfig The S3 location where Identity Resolution Jobs write result files.
       */
      override fun exportingConfig(exportingConfig: IResolvable) {
        cdkBuilder.exportingConfig(exportingConfig.let(IResolvable::unwrap))
      }

      /**
       * @param exportingConfig The S3 location where Identity Resolution Jobs write result files.
       */
      override fun exportingConfig(exportingConfig: ExportingConfigProperty) {
        cdkBuilder.exportingConfig(exportingConfig.let(ExportingConfigProperty::unwrap))
      }

      /**
       * @param exportingConfig The S3 location where Identity Resolution Jobs write result files.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("e4cec075da95f0eaaee5ce2d281806dd984b8c1307ef88f39332d60fb47da8dc")
      override fun exportingConfig(exportingConfig: ExportingConfigProperty.Builder.() -> Unit):
          Unit = exportingConfig(ExportingConfigProperty(exportingConfig))

      /**
       * @param jobSchedule The day and time when do you want to start the Identity Resolution Job
       * every week.
       */
      override fun jobSchedule(jobSchedule: IResolvable) {
        cdkBuilder.jobSchedule(jobSchedule.let(IResolvable::unwrap))
      }

      /**
       * @param jobSchedule The day and time when do you want to start the Identity Resolution Job
       * every week.
       */
      override fun jobSchedule(jobSchedule: JobScheduleProperty) {
        cdkBuilder.jobSchedule(jobSchedule.let(JobScheduleProperty::unwrap))
      }

      /**
       * @param jobSchedule The day and time when do you want to start the Identity Resolution Job
       * every week.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("c9b628426b7ed68c60c13c72d013513ebf9e5810bee900c1197cfa87ba054cc1")
      override fun jobSchedule(jobSchedule: JobScheduleProperty.Builder.() -> Unit): Unit =
          jobSchedule(JobScheduleProperty(jobSchedule))

      public fun build():
          software.amazon.awscdk.services.customerprofiles.CfnDomain.MatchingProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.customerprofiles.CfnDomain.MatchingProperty,
    ) : CdkObject(cdkObject), MatchingProperty {
      /**
       * Configuration information about the auto-merging process.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-customerprofiles-domain-matching.html#cfn-customerprofiles-domain-matching-automerging)
       */
      override fun autoMerging(): Any? = unwrap(this).getAutoMerging()

      /**
       * The flag that enables the matching process of duplicate profiles.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-customerprofiles-domain-matching.html#cfn-customerprofiles-domain-matching-enabled)
       */
      override fun enabled(): Any = unwrap(this).getEnabled()

      /**
       * The S3 location where Identity Resolution Jobs write result files.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-customerprofiles-domain-matching.html#cfn-customerprofiles-domain-matching-exportingconfig)
       */
      override fun exportingConfig(): Any? = unwrap(this).getExportingConfig()

      /**
       * The day and time when do you want to start the Identity Resolution Job every week.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-customerprofiles-domain-matching.html#cfn-customerprofiles-domain-matching-jobschedule)
       */
      override fun jobSchedule(): Any? = unwrap(this).getJobSchedule()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): MatchingProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.customerprofiles.CfnDomain.MatchingProperty):
          MatchingProperty = CdkObjectWrappers.wrap(cdkObject) as? MatchingProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: MatchingProperty):
          software.amazon.awscdk.services.customerprofiles.CfnDomain.MatchingProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.customerprofiles.CfnDomain.MatchingProperty
    }
  }

  /**
   * Determines how the auto-merging process should resolve conflicts between different profiles.
   *
   * For example, if Profile A and Profile B have the same `FirstName` and `LastName` ,
   * `ConflictResolution` specifies which `EmailAddress` should be used.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.customerprofiles.*;
   * ConflictResolutionProperty conflictResolutionProperty = ConflictResolutionProperty.builder()
   * .conflictResolvingModel("conflictResolvingModel")
   * // the properties below are optional
   * .sourceName("sourceName")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-customerprofiles-domain-conflictresolution.html)
   */
  public interface ConflictResolutionProperty {
    /**
     * How the auto-merging process should resolve conflicts between different profiles.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-customerprofiles-domain-conflictresolution.html#cfn-customerprofiles-domain-conflictresolution-conflictresolvingmodel)
     */
    public fun conflictResolvingModel(): String

    /**
     * The `ObjectType` name that is used to resolve profile merging conflicts when choosing
     * `SOURCE` as the `ConflictResolvingModel` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-customerprofiles-domain-conflictresolution.html#cfn-customerprofiles-domain-conflictresolution-sourcename)
     */
    public fun sourceName(): String? = unwrap(this).getSourceName()

    /**
     * A builder for [ConflictResolutionProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param conflictResolvingModel How the auto-merging process should resolve conflicts between
       * different profiles. 
       */
      public fun conflictResolvingModel(conflictResolvingModel: String)

      /**
       * @param sourceName The `ObjectType` name that is used to resolve profile merging conflicts
       * when choosing `SOURCE` as the `ConflictResolvingModel` .
       */
      public fun sourceName(sourceName: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.customerprofiles.CfnDomain.ConflictResolutionProperty.Builder
          =
          software.amazon.awscdk.services.customerprofiles.CfnDomain.ConflictResolutionProperty.builder()

      /**
       * @param conflictResolvingModel How the auto-merging process should resolve conflicts between
       * different profiles. 
       */
      override fun conflictResolvingModel(conflictResolvingModel: String) {
        cdkBuilder.conflictResolvingModel(conflictResolvingModel)
      }

      /**
       * @param sourceName The `ObjectType` name that is used to resolve profile merging conflicts
       * when choosing `SOURCE` as the `ConflictResolvingModel` .
       */
      override fun sourceName(sourceName: String) {
        cdkBuilder.sourceName(sourceName)
      }

      public fun build():
          software.amazon.awscdk.services.customerprofiles.CfnDomain.ConflictResolutionProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.customerprofiles.CfnDomain.ConflictResolutionProperty,
    ) : CdkObject(cdkObject), ConflictResolutionProperty {
      /**
       * How the auto-merging process should resolve conflicts between different profiles.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-customerprofiles-domain-conflictresolution.html#cfn-customerprofiles-domain-conflictresolution-conflictresolvingmodel)
       */
      override fun conflictResolvingModel(): String = unwrap(this).getConflictResolvingModel()

      /**
       * The `ObjectType` name that is used to resolve profile merging conflicts when choosing
       * `SOURCE` as the `ConflictResolvingModel` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-customerprofiles-domain-conflictresolution.html#cfn-customerprofiles-domain-conflictresolution-sourcename)
       */
      override fun sourceName(): String? = unwrap(this).getSourceName()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): ConflictResolutionProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.customerprofiles.CfnDomain.ConflictResolutionProperty):
          ConflictResolutionProperty = CdkObjectWrappers.wrap(cdkObject) as?
          ConflictResolutionProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: ConflictResolutionProperty):
          software.amazon.awscdk.services.customerprofiles.CfnDomain.ConflictResolutionProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.customerprofiles.CfnDomain.ConflictResolutionProperty
    }
  }

  /**
   * Configuration information for exporting Identity Resolution results, for example, to an S3
   * bucket.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.customerprofiles.*;
   * ExportingConfigProperty exportingConfigProperty = ExportingConfigProperty.builder()
   * .s3Exporting(S3ExportingConfigProperty.builder()
   * .s3BucketName("s3BucketName")
   * // the properties below are optional
   * .s3KeyName("s3KeyName")
   * .build())
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-customerprofiles-domain-exportingconfig.html)
   */
  public interface ExportingConfigProperty {
    /**
     * The S3 location where Identity Resolution Jobs write result files.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-customerprofiles-domain-exportingconfig.html#cfn-customerprofiles-domain-exportingconfig-s3exporting)
     */
    public fun s3Exporting(): Any? = unwrap(this).getS3Exporting()

    /**
     * A builder for [ExportingConfigProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param s3Exporting The S3 location where Identity Resolution Jobs write result files.
       */
      public fun s3Exporting(s3Exporting: IResolvable)

      /**
       * @param s3Exporting The S3 location where Identity Resolution Jobs write result files.
       */
      public fun s3Exporting(s3Exporting: S3ExportingConfigProperty)

      /**
       * @param s3Exporting The S3 location where Identity Resolution Jobs write result files.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("98229fa0b36a910e2b9314fa9ee3e949dfbc31df45f06105683d17c08005dede")
      public fun s3Exporting(s3Exporting: S3ExportingConfigProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.customerprofiles.CfnDomain.ExportingConfigProperty.Builder
          =
          software.amazon.awscdk.services.customerprofiles.CfnDomain.ExportingConfigProperty.builder()

      /**
       * @param s3Exporting The S3 location where Identity Resolution Jobs write result files.
       */
      override fun s3Exporting(s3Exporting: IResolvable) {
        cdkBuilder.s3Exporting(s3Exporting.let(IResolvable::unwrap))
      }

      /**
       * @param s3Exporting The S3 location where Identity Resolution Jobs write result files.
       */
      override fun s3Exporting(s3Exporting: S3ExportingConfigProperty) {
        cdkBuilder.s3Exporting(s3Exporting.let(S3ExportingConfigProperty::unwrap))
      }

      /**
       * @param s3Exporting The S3 location where Identity Resolution Jobs write result files.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("98229fa0b36a910e2b9314fa9ee3e949dfbc31df45f06105683d17c08005dede")
      override fun s3Exporting(s3Exporting: S3ExportingConfigProperty.Builder.() -> Unit): Unit =
          s3Exporting(S3ExportingConfigProperty(s3Exporting))

      public fun build():
          software.amazon.awscdk.services.customerprofiles.CfnDomain.ExportingConfigProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.customerprofiles.CfnDomain.ExportingConfigProperty,
    ) : CdkObject(cdkObject), ExportingConfigProperty {
      /**
       * The S3 location where Identity Resolution Jobs write result files.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-customerprofiles-domain-exportingconfig.html#cfn-customerprofiles-domain-exportingconfig-s3exporting)
       */
      override fun s3Exporting(): Any? = unwrap(this).getS3Exporting()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): ExportingConfigProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.customerprofiles.CfnDomain.ExportingConfigProperty):
          ExportingConfigProperty = CdkObjectWrappers.wrap(cdkObject) as? ExportingConfigProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: ExportingConfigProperty):
          software.amazon.awscdk.services.customerprofiles.CfnDomain.ExportingConfigProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.customerprofiles.CfnDomain.ExportingConfigProperty
    }
  }

  /**
   * Configures information about the `AttributeTypesSelector` which rule-based identity resolution
   * uses to match profiles.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.customerprofiles.*;
   * AttributeTypesSelectorProperty attributeTypesSelectorProperty =
   * AttributeTypesSelectorProperty.builder()
   * .attributeMatchingModel("attributeMatchingModel")
   * // the properties below are optional
   * .address(List.of("address"))
   * .emailAddress(List.of("emailAddress"))
   * .phoneNumber(List.of("phoneNumber"))
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-customerprofiles-domain-attributetypesselector.html)
   */
  public interface AttributeTypesSelectorProperty {
    /**
     * The `Address` type.
     *
     * You can choose from `Address` , `BusinessAddress` , `MaillingAddress` , and `ShippingAddress`
     * . You only can use the `Address` type in the `MatchingRule` . For example, if you want to match
     * a profile based on `BusinessAddress.City` or `MaillingAddress.City` , you can choose the
     * `BusinessAddress` and the `MaillingAddress` to represent the `Address` type and specify the
     * `Address.City` on the matching rule.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-customerprofiles-domain-attributetypesselector.html#cfn-customerprofiles-domain-attributetypesselector-address)
     */
    public fun address(): List<String> = unwrap(this).getAddress() ?: emptyList()

    /**
     * Configures the `AttributeMatchingModel` , you can either choose `ONE_TO_ONE` or
     * `MANY_TO_MANY` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-customerprofiles-domain-attributetypesselector.html#cfn-customerprofiles-domain-attributetypesselector-attributematchingmodel)
     */
    public fun attributeMatchingModel(): String

    /**
     * The Email type.
     *
     * You can choose from `EmailAddress` , `BusinessEmailAddress` and `PersonalEmailAddress` . You
     * only can use the `EmailAddress` type in the `MatchingRule` . For example, if you want to match
     * profile based on `PersonalEmailAddress` or `BusinessEmailAddress` , you can choose the
     * `PersonalEmailAddress` and the `BusinessEmailAddress` to represent the `EmailAddress` type and
     * only specify the `EmailAddress` on the matching rule.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-customerprofiles-domain-attributetypesselector.html#cfn-customerprofiles-domain-attributetypesselector-emailaddress)
     */
    public fun emailAddress(): List<String> = unwrap(this).getEmailAddress() ?: emptyList()

    /**
     * The `PhoneNumber` type.
     *
     * You can choose from `PhoneNumber` , `HomePhoneNumber` , and `MobilePhoneNumber` . You only
     * can use the `PhoneNumber` type in the `MatchingRule` . For example, if you want to match a
     * profile based on `Phone` or `HomePhone` , you can choose the `Phone` and the `HomePhone` to
     * represent the `PhoneNumber` type and only specify the `PhoneNumber` on the matching rule.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-customerprofiles-domain-attributetypesselector.html#cfn-customerprofiles-domain-attributetypesselector-phonenumber)
     */
    public fun phoneNumber(): List<String> = unwrap(this).getPhoneNumber() ?: emptyList()

    /**
     * A builder for [AttributeTypesSelectorProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param address The `Address` type.
       * You can choose from `Address` , `BusinessAddress` , `MaillingAddress` , and
       * `ShippingAddress` . You only can use the `Address` type in the `MatchingRule` . For example,
       * if you want to match a profile based on `BusinessAddress.City` or `MaillingAddress.City` , you
       * can choose the `BusinessAddress` and the `MaillingAddress` to represent the `Address` type and
       * specify the `Address.City` on the matching rule.
       */
      public fun address(address: List<String>)

      /**
       * @param address The `Address` type.
       * You can choose from `Address` , `BusinessAddress` , `MaillingAddress` , and
       * `ShippingAddress` . You only can use the `Address` type in the `MatchingRule` . For example,
       * if you want to match a profile based on `BusinessAddress.City` or `MaillingAddress.City` , you
       * can choose the `BusinessAddress` and the `MaillingAddress` to represent the `Address` type and
       * specify the `Address.City` on the matching rule.
       */
      public fun address(vararg address: String)

      /**
       * @param attributeMatchingModel Configures the `AttributeMatchingModel` , you can either
       * choose `ONE_TO_ONE` or `MANY_TO_MANY` . 
       */
      public fun attributeMatchingModel(attributeMatchingModel: String)

      /**
       * @param emailAddress The Email type.
       * You can choose from `EmailAddress` , `BusinessEmailAddress` and `PersonalEmailAddress` .
       * You only can use the `EmailAddress` type in the `MatchingRule` . For example, if you want to
       * match profile based on `PersonalEmailAddress` or `BusinessEmailAddress` , you can choose the
       * `PersonalEmailAddress` and the `BusinessEmailAddress` to represent the `EmailAddress` type and
       * only specify the `EmailAddress` on the matching rule.
       */
      public fun emailAddress(emailAddress: List<String>)

      /**
       * @param emailAddress The Email type.
       * You can choose from `EmailAddress` , `BusinessEmailAddress` and `PersonalEmailAddress` .
       * You only can use the `EmailAddress` type in the `MatchingRule` . For example, if you want to
       * match profile based on `PersonalEmailAddress` or `BusinessEmailAddress` , you can choose the
       * `PersonalEmailAddress` and the `BusinessEmailAddress` to represent the `EmailAddress` type and
       * only specify the `EmailAddress` on the matching rule.
       */
      public fun emailAddress(vararg emailAddress: String)

      /**
       * @param phoneNumber The `PhoneNumber` type.
       * You can choose from `PhoneNumber` , `HomePhoneNumber` , and `MobilePhoneNumber` . You only
       * can use the `PhoneNumber` type in the `MatchingRule` . For example, if you want to match a
       * profile based on `Phone` or `HomePhone` , you can choose the `Phone` and the `HomePhone` to
       * represent the `PhoneNumber` type and only specify the `PhoneNumber` on the matching rule.
       */
      public fun phoneNumber(phoneNumber: List<String>)

      /**
       * @param phoneNumber The `PhoneNumber` type.
       * You can choose from `PhoneNumber` , `HomePhoneNumber` , and `MobilePhoneNumber` . You only
       * can use the `PhoneNumber` type in the `MatchingRule` . For example, if you want to match a
       * profile based on `Phone` or `HomePhone` , you can choose the `Phone` and the `HomePhone` to
       * represent the `PhoneNumber` type and only specify the `PhoneNumber` on the matching rule.
       */
      public fun phoneNumber(vararg phoneNumber: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.customerprofiles.CfnDomain.AttributeTypesSelectorProperty.Builder
          =
          software.amazon.awscdk.services.customerprofiles.CfnDomain.AttributeTypesSelectorProperty.builder()

      /**
       * @param address The `Address` type.
       * You can choose from `Address` , `BusinessAddress` , `MaillingAddress` , and
       * `ShippingAddress` . You only can use the `Address` type in the `MatchingRule` . For example,
       * if you want to match a profile based on `BusinessAddress.City` or `MaillingAddress.City` , you
       * can choose the `BusinessAddress` and the `MaillingAddress` to represent the `Address` type and
       * specify the `Address.City` on the matching rule.
       */
      override fun address(address: List<String>) {
        cdkBuilder.address(address)
      }

      /**
       * @param address The `Address` type.
       * You can choose from `Address` , `BusinessAddress` , `MaillingAddress` , and
       * `ShippingAddress` . You only can use the `Address` type in the `MatchingRule` . For example,
       * if you want to match a profile based on `BusinessAddress.City` or `MaillingAddress.City` , you
       * can choose the `BusinessAddress` and the `MaillingAddress` to represent the `Address` type and
       * specify the `Address.City` on the matching rule.
       */
      override fun address(vararg address: String): Unit = address(address.toList())

      /**
       * @param attributeMatchingModel Configures the `AttributeMatchingModel` , you can either
       * choose `ONE_TO_ONE` or `MANY_TO_MANY` . 
       */
      override fun attributeMatchingModel(attributeMatchingModel: String) {
        cdkBuilder.attributeMatchingModel(attributeMatchingModel)
      }

      /**
       * @param emailAddress The Email type.
       * You can choose from `EmailAddress` , `BusinessEmailAddress` and `PersonalEmailAddress` .
       * You only can use the `EmailAddress` type in the `MatchingRule` . For example, if you want to
       * match profile based on `PersonalEmailAddress` or `BusinessEmailAddress` , you can choose the
       * `PersonalEmailAddress` and the `BusinessEmailAddress` to represent the `EmailAddress` type and
       * only specify the `EmailAddress` on the matching rule.
       */
      override fun emailAddress(emailAddress: List<String>) {
        cdkBuilder.emailAddress(emailAddress)
      }

      /**
       * @param emailAddress The Email type.
       * You can choose from `EmailAddress` , `BusinessEmailAddress` and `PersonalEmailAddress` .
       * You only can use the `EmailAddress` type in the `MatchingRule` . For example, if you want to
       * match profile based on `PersonalEmailAddress` or `BusinessEmailAddress` , you can choose the
       * `PersonalEmailAddress` and the `BusinessEmailAddress` to represent the `EmailAddress` type and
       * only specify the `EmailAddress` on the matching rule.
       */
      override fun emailAddress(vararg emailAddress: String): Unit =
          emailAddress(emailAddress.toList())

      /**
       * @param phoneNumber The `PhoneNumber` type.
       * You can choose from `PhoneNumber` , `HomePhoneNumber` , and `MobilePhoneNumber` . You only
       * can use the `PhoneNumber` type in the `MatchingRule` . For example, if you want to match a
       * profile based on `Phone` or `HomePhone` , you can choose the `Phone` and the `HomePhone` to
       * represent the `PhoneNumber` type and only specify the `PhoneNumber` on the matching rule.
       */
      override fun phoneNumber(phoneNumber: List<String>) {
        cdkBuilder.phoneNumber(phoneNumber)
      }

      /**
       * @param phoneNumber The `PhoneNumber` type.
       * You can choose from `PhoneNumber` , `HomePhoneNumber` , and `MobilePhoneNumber` . You only
       * can use the `PhoneNumber` type in the `MatchingRule` . For example, if you want to match a
       * profile based on `Phone` or `HomePhone` , you can choose the `Phone` and the `HomePhone` to
       * represent the `PhoneNumber` type and only specify the `PhoneNumber` on the matching rule.
       */
      override fun phoneNumber(vararg phoneNumber: String): Unit = phoneNumber(phoneNumber.toList())

      public fun build():
          software.amazon.awscdk.services.customerprofiles.CfnDomain.AttributeTypesSelectorProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.customerprofiles.CfnDomain.AttributeTypesSelectorProperty,
    ) : CdkObject(cdkObject), AttributeTypesSelectorProperty {
      /**
       * The `Address` type.
       *
       * You can choose from `Address` , `BusinessAddress` , `MaillingAddress` , and
       * `ShippingAddress` . You only can use the `Address` type in the `MatchingRule` . For example,
       * if you want to match a profile based on `BusinessAddress.City` or `MaillingAddress.City` , you
       * can choose the `BusinessAddress` and the `MaillingAddress` to represent the `Address` type and
       * specify the `Address.City` on the matching rule.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-customerprofiles-domain-attributetypesselector.html#cfn-customerprofiles-domain-attributetypesselector-address)
       */
      override fun address(): List<String> = unwrap(this).getAddress() ?: emptyList()

      /**
       * Configures the `AttributeMatchingModel` , you can either choose `ONE_TO_ONE` or
       * `MANY_TO_MANY` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-customerprofiles-domain-attributetypesselector.html#cfn-customerprofiles-domain-attributetypesselector-attributematchingmodel)
       */
      override fun attributeMatchingModel(): String = unwrap(this).getAttributeMatchingModel()

      /**
       * The Email type.
       *
       * You can choose from `EmailAddress` , `BusinessEmailAddress` and `PersonalEmailAddress` .
       * You only can use the `EmailAddress` type in the `MatchingRule` . For example, if you want to
       * match profile based on `PersonalEmailAddress` or `BusinessEmailAddress` , you can choose the
       * `PersonalEmailAddress` and the `BusinessEmailAddress` to represent the `EmailAddress` type and
       * only specify the `EmailAddress` on the matching rule.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-customerprofiles-domain-attributetypesselector.html#cfn-customerprofiles-domain-attributetypesselector-emailaddress)
       */
      override fun emailAddress(): List<String> = unwrap(this).getEmailAddress() ?: emptyList()

      /**
       * The `PhoneNumber` type.
       *
       * You can choose from `PhoneNumber` , `HomePhoneNumber` , and `MobilePhoneNumber` . You only
       * can use the `PhoneNumber` type in the `MatchingRule` . For example, if you want to match a
       * profile based on `Phone` or `HomePhone` , you can choose the `Phone` and the `HomePhone` to
       * represent the `PhoneNumber` type and only specify the `PhoneNumber` on the matching rule.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-customerprofiles-domain-attributetypesselector.html#cfn-customerprofiles-domain-attributetypesselector-phonenumber)
       */
      override fun phoneNumber(): List<String> = unwrap(this).getPhoneNumber() ?: emptyList()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): AttributeTypesSelectorProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.customerprofiles.CfnDomain.AttributeTypesSelectorProperty):
          AttributeTypesSelectorProperty = CdkObjectWrappers.wrap(cdkObject) as?
          AttributeTypesSelectorProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: AttributeTypesSelectorProperty):
          software.amazon.awscdk.services.customerprofiles.CfnDomain.AttributeTypesSelectorProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.customerprofiles.CfnDomain.AttributeTypesSelectorProperty
    }
  }

  /**
   * A list of matching attributes that represent matching criteria.
   *
   * If two profiles meet at least one of the requirements in the matching attributes list, they
   * will be merged.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.customerprofiles.*;
   * ConsolidationProperty consolidationProperty = ConsolidationProperty.builder()
   * .matchingAttributesList(List.of(List.of("matchingAttributesList")))
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-customerprofiles-domain-consolidation.html)
   */
  public interface ConsolidationProperty {
    /**
     * A list of matching criteria.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-customerprofiles-domain-consolidation.html#cfn-customerprofiles-domain-consolidation-matchingattributeslist)
     */
    public fun matchingAttributesList(): Any

    /**
     * A builder for [ConsolidationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param matchingAttributesList A list of matching criteria. 
       */
      public fun matchingAttributesList(matchingAttributesList: IResolvable)

      /**
       * @param matchingAttributesList A list of matching criteria. 
       */
      public fun matchingAttributesList(matchingAttributesList: List<List<String>>)

      /**
       * @param matchingAttributesList A list of matching criteria. 
       */
      public fun matchingAttributesList(vararg matchingAttributesList: List<String>)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.customerprofiles.CfnDomain.ConsolidationProperty.Builder =
          software.amazon.awscdk.services.customerprofiles.CfnDomain.ConsolidationProperty.builder()

      /**
       * @param matchingAttributesList A list of matching criteria. 
       */
      override fun matchingAttributesList(matchingAttributesList: IResolvable) {
        cdkBuilder.matchingAttributesList(matchingAttributesList.let(IResolvable::unwrap))
      }

      /**
       * @param matchingAttributesList A list of matching criteria. 
       */
      override fun matchingAttributesList(matchingAttributesList: List<List<String>>) {
        cdkBuilder.matchingAttributesList(matchingAttributesList)
      }

      /**
       * @param matchingAttributesList A list of matching criteria. 
       */
      override fun matchingAttributesList(vararg matchingAttributesList: List<String>): Unit =
          matchingAttributesList(matchingAttributesList.toList())

      public fun build():
          software.amazon.awscdk.services.customerprofiles.CfnDomain.ConsolidationProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.customerprofiles.CfnDomain.ConsolidationProperty,
    ) : CdkObject(cdkObject), ConsolidationProperty {
      /**
       * A list of matching criteria.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-customerprofiles-domain-consolidation.html#cfn-customerprofiles-domain-consolidation-matchingattributeslist)
       */
      override fun matchingAttributesList(): Any = unwrap(this).getMatchingAttributesList()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): ConsolidationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.customerprofiles.CfnDomain.ConsolidationProperty):
          ConsolidationProperty = CdkObjectWrappers.wrap(cdkObject) as? ConsolidationProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: ConsolidationProperty):
          software.amazon.awscdk.services.customerprofiles.CfnDomain.ConsolidationProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.customerprofiles.CfnDomain.ConsolidationProperty
    }
  }

  /**
   * The day and time when do you want to start the Identity Resolution Job every week.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.customerprofiles.*;
   * JobScheduleProperty jobScheduleProperty = JobScheduleProperty.builder()
   * .dayOfTheWeek("dayOfTheWeek")
   * .time("time")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-customerprofiles-domain-jobschedule.html)
   */
  public interface JobScheduleProperty {
    /**
     * The day when the Identity Resolution Job should run every week.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-customerprofiles-domain-jobschedule.html#cfn-customerprofiles-domain-jobschedule-dayoftheweek)
     */
    public fun dayOfTheWeek(): String

    /**
     * The time when the Identity Resolution Job should run every week.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-customerprofiles-domain-jobschedule.html#cfn-customerprofiles-domain-jobschedule-time)
     */
    public fun time(): String

    /**
     * A builder for [JobScheduleProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param dayOfTheWeek The day when the Identity Resolution Job should run every week. 
       */
      public fun dayOfTheWeek(dayOfTheWeek: String)

      /**
       * @param time The time when the Identity Resolution Job should run every week. 
       */
      public fun time(time: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.customerprofiles.CfnDomain.JobScheduleProperty.Builder =
          software.amazon.awscdk.services.customerprofiles.CfnDomain.JobScheduleProperty.builder()

      /**
       * @param dayOfTheWeek The day when the Identity Resolution Job should run every week. 
       */
      override fun dayOfTheWeek(dayOfTheWeek: String) {
        cdkBuilder.dayOfTheWeek(dayOfTheWeek)
      }

      /**
       * @param time The time when the Identity Resolution Job should run every week. 
       */
      override fun time(time: String) {
        cdkBuilder.time(time)
      }

      public fun build():
          software.amazon.awscdk.services.customerprofiles.CfnDomain.JobScheduleProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.customerprofiles.CfnDomain.JobScheduleProperty,
    ) : CdkObject(cdkObject), JobScheduleProperty {
      /**
       * The day when the Identity Resolution Job should run every week.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-customerprofiles-domain-jobschedule.html#cfn-customerprofiles-domain-jobschedule-dayoftheweek)
       */
      override fun dayOfTheWeek(): String = unwrap(this).getDayOfTheWeek()

      /**
       * The time when the Identity Resolution Job should run every week.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-customerprofiles-domain-jobschedule.html#cfn-customerprofiles-domain-jobschedule-time)
       */
      override fun time(): String = unwrap(this).getTime()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): JobScheduleProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.customerprofiles.CfnDomain.JobScheduleProperty):
          JobScheduleProperty = CdkObjectWrappers.wrap(cdkObject) as? JobScheduleProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: JobScheduleProperty):
          software.amazon.awscdk.services.customerprofiles.CfnDomain.JobScheduleProperty = (wrapped
          as CdkObject).cdkObject as
          software.amazon.awscdk.services.customerprofiles.CfnDomain.JobScheduleProperty
    }
  }

  /**
   * Specifies how the rule-based matching process should match profiles.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.customerprofiles.*;
   * MatchingRuleProperty matchingRuleProperty = MatchingRuleProperty.builder()
   * .rule(List.of("rule"))
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-customerprofiles-domain-matchingrule.html)
   */
  public interface MatchingRuleProperty {
    /**
     * A single rule level of the `MatchRules` .
     *
     * Configures how the rule-based matching process should match profiles.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-customerprofiles-domain-matchingrule.html#cfn-customerprofiles-domain-matchingrule-rule)
     */
    public fun rule(): List<String>

    /**
     * A builder for [MatchingRuleProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param rule A single rule level of the `MatchRules` . 
       * Configures how the rule-based matching process should match profiles.
       */
      public fun rule(rule: List<String>)

      /**
       * @param rule A single rule level of the `MatchRules` . 
       * Configures how the rule-based matching process should match profiles.
       */
      public fun rule(vararg rule: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.customerprofiles.CfnDomain.MatchingRuleProperty.Builder =
          software.amazon.awscdk.services.customerprofiles.CfnDomain.MatchingRuleProperty.builder()

      /**
       * @param rule A single rule level of the `MatchRules` . 
       * Configures how the rule-based matching process should match profiles.
       */
      override fun rule(rule: List<String>) {
        cdkBuilder.rule(rule)
      }

      /**
       * @param rule A single rule level of the `MatchRules` . 
       * Configures how the rule-based matching process should match profiles.
       */
      override fun rule(vararg rule: String): Unit = rule(rule.toList())

      public fun build():
          software.amazon.awscdk.services.customerprofiles.CfnDomain.MatchingRuleProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.customerprofiles.CfnDomain.MatchingRuleProperty,
    ) : CdkObject(cdkObject), MatchingRuleProperty {
      /**
       * A single rule level of the `MatchRules` .
       *
       * Configures how the rule-based matching process should match profiles.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-customerprofiles-domain-matchingrule.html#cfn-customerprofiles-domain-matchingrule-rule)
       */
      override fun rule(): List<String> = unwrap(this).getRule()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): MatchingRuleProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.customerprofiles.CfnDomain.MatchingRuleProperty):
          MatchingRuleProperty = CdkObjectWrappers.wrap(cdkObject) as? MatchingRuleProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: MatchingRuleProperty):
          software.amazon.awscdk.services.customerprofiles.CfnDomain.MatchingRuleProperty = (wrapped
          as CdkObject).cdkObject as
          software.amazon.awscdk.services.customerprofiles.CfnDomain.MatchingRuleProperty
    }
  }

  /**
   * Usage-specific statistics about the domain.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.customerprofiles.*;
   * DomainStatsProperty domainStatsProperty = DomainStatsProperty.builder()
   * .meteringProfileCount(123)
   * .objectCount(123)
   * .profileCount(123)
   * .totalSize(123)
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-customerprofiles-domain-domainstats.html)
   */
  public interface DomainStatsProperty {
    /**
     * The number of profiles that you are currently paying for in the domain.
     *
     * If you have more than 100 objects associated with a single profile, that profile counts as
     * two profiles. If you have more than 200 objects, that profile counts as three, and so on.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-customerprofiles-domain-domainstats.html#cfn-customerprofiles-domain-domainstats-meteringprofilecount)
     */
    public fun meteringProfileCount(): Number? = unwrap(this).getMeteringProfileCount()

    /**
     * The total number of objects in domain.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-customerprofiles-domain-domainstats.html#cfn-customerprofiles-domain-domainstats-objectcount)
     */
    public fun objectCount(): Number? = unwrap(this).getObjectCount()

    /**
     * The total number of profiles currently in the domain.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-customerprofiles-domain-domainstats.html#cfn-customerprofiles-domain-domainstats-profilecount)
     */
    public fun profileCount(): Number? = unwrap(this).getProfileCount()

    /**
     * The total size, in bytes, of all objects in the domain.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-customerprofiles-domain-domainstats.html#cfn-customerprofiles-domain-domainstats-totalsize)
     */
    public fun totalSize(): Number? = unwrap(this).getTotalSize()

    /**
     * A builder for [DomainStatsProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param meteringProfileCount The number of profiles that you are currently paying for in the
       * domain.
       * If you have more than 100 objects associated with a single profile, that profile counts as
       * two profiles. If you have more than 200 objects, that profile counts as three, and so on.
       */
      public fun meteringProfileCount(meteringProfileCount: Number)

      /**
       * @param objectCount The total number of objects in domain.
       */
      public fun objectCount(objectCount: Number)

      /**
       * @param profileCount The total number of profiles currently in the domain.
       */
      public fun profileCount(profileCount: Number)

      /**
       * @param totalSize The total size, in bytes, of all objects in the domain.
       */
      public fun totalSize(totalSize: Number)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.customerprofiles.CfnDomain.DomainStatsProperty.Builder =
          software.amazon.awscdk.services.customerprofiles.CfnDomain.DomainStatsProperty.builder()

      /**
       * @param meteringProfileCount The number of profiles that you are currently paying for in the
       * domain.
       * If you have more than 100 objects associated with a single profile, that profile counts as
       * two profiles. If you have more than 200 objects, that profile counts as three, and so on.
       */
      override fun meteringProfileCount(meteringProfileCount: Number) {
        cdkBuilder.meteringProfileCount(meteringProfileCount)
      }

      /**
       * @param objectCount The total number of objects in domain.
       */
      override fun objectCount(objectCount: Number) {
        cdkBuilder.objectCount(objectCount)
      }

      /**
       * @param profileCount The total number of profiles currently in the domain.
       */
      override fun profileCount(profileCount: Number) {
        cdkBuilder.profileCount(profileCount)
      }

      /**
       * @param totalSize The total size, in bytes, of all objects in the domain.
       */
      override fun totalSize(totalSize: Number) {
        cdkBuilder.totalSize(totalSize)
      }

      public fun build():
          software.amazon.awscdk.services.customerprofiles.CfnDomain.DomainStatsProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.customerprofiles.CfnDomain.DomainStatsProperty,
    ) : CdkObject(cdkObject), DomainStatsProperty {
      /**
       * The number of profiles that you are currently paying for in the domain.
       *
       * If you have more than 100 objects associated with a single profile, that profile counts as
       * two profiles. If you have more than 200 objects, that profile counts as three, and so on.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-customerprofiles-domain-domainstats.html#cfn-customerprofiles-domain-domainstats-meteringprofilecount)
       */
      override fun meteringProfileCount(): Number? = unwrap(this).getMeteringProfileCount()

      /**
       * The total number of objects in domain.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-customerprofiles-domain-domainstats.html#cfn-customerprofiles-domain-domainstats-objectcount)
       */
      override fun objectCount(): Number? = unwrap(this).getObjectCount()

      /**
       * The total number of profiles currently in the domain.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-customerprofiles-domain-domainstats.html#cfn-customerprofiles-domain-domainstats-profilecount)
       */
      override fun profileCount(): Number? = unwrap(this).getProfileCount()

      /**
       * The total size, in bytes, of all objects in the domain.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-customerprofiles-domain-domainstats.html#cfn-customerprofiles-domain-domainstats-totalsize)
       */
      override fun totalSize(): Number? = unwrap(this).getTotalSize()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): DomainStatsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.customerprofiles.CfnDomain.DomainStatsProperty):
          DomainStatsProperty = CdkObjectWrappers.wrap(cdkObject) as? DomainStatsProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: DomainStatsProperty):
          software.amazon.awscdk.services.customerprofiles.CfnDomain.DomainStatsProperty = (wrapped
          as CdkObject).cdkObject as
          software.amazon.awscdk.services.customerprofiles.CfnDomain.DomainStatsProperty
    }
  }
}
