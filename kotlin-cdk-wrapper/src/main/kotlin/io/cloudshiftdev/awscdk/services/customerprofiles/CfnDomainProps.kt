@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.customerprofiles

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

/**
 * Properties for defining a `CfnDomain`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.customerprofiles.*;
 * CfnDomainProps cfnDomainProps = CfnDomainProps.builder()
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
public interface CfnDomainProps {
  /**
   * The URL of the SQS dead letter queue, which is used for reporting errors associated with
   * ingesting data from third party applications.
   *
   * You must set up a policy on the `DeadLetterQueue` for the `SendMessage` operation to enable
   * Amazon Connect Customer Profiles to send messages to the `DeadLetterQueue` .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-customerprofiles-domain.html#cfn-customerprofiles-domain-deadletterqueueurl)
   */
  public fun deadLetterQueueUrl(): String? = unwrap(this).getDeadLetterQueueUrl()

  /**
   * The default encryption key, which is an AWS managed key, is used when no specific type of
   * encryption key is specified.
   *
   * It is used to encrypt all data before it is placed in permanent or semi-permanent storage.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-customerprofiles-domain.html#cfn-customerprofiles-domain-defaultencryptionkey)
   */
  public fun defaultEncryptionKey(): String? = unwrap(this).getDefaultEncryptionKey()

  /**
   * The default number of days until the data within the domain expires.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-customerprofiles-domain.html#cfn-customerprofiles-domain-defaultexpirationdays)
   */
  public fun defaultExpirationDays(): Number

  /**
   * The unique name of the domain.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-customerprofiles-domain.html#cfn-customerprofiles-domain-domainname)
   */
  public fun domainName(): String

  /**
   * The process of matching duplicate profiles.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-customerprofiles-domain.html#cfn-customerprofiles-domain-matching)
   */
  public fun matching(): Any? = unwrap(this).getMatching()

  /**
   * The process of matching duplicate profiles using Rule-Based matching.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-customerprofiles-domain.html#cfn-customerprofiles-domain-rulebasedmatching)
   */
  public fun ruleBasedMatching(): Any? = unwrap(this).getRuleBasedMatching()

  /**
   * The tags used to organize, track, or control access for this resource.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-customerprofiles-domain.html#cfn-customerprofiles-domain-tags)
   */
  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * A builder for [CfnDomainProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param deadLetterQueueUrl The URL of the SQS dead letter queue, which is used for reporting
     * errors associated with ingesting data from third party applications.
     * You must set up a policy on the `DeadLetterQueue` for the `SendMessage` operation to enable
     * Amazon Connect Customer Profiles to send messages to the `DeadLetterQueue` .
     */
    public fun deadLetterQueueUrl(deadLetterQueueUrl: String)

    /**
     * @param defaultEncryptionKey The default encryption key, which is an AWS managed key, is used
     * when no specific type of encryption key is specified.
     * It is used to encrypt all data before it is placed in permanent or semi-permanent storage.
     */
    public fun defaultEncryptionKey(defaultEncryptionKey: String)

    /**
     * @param defaultExpirationDays The default number of days until the data within the domain
     * expires. 
     */
    public fun defaultExpirationDays(defaultExpirationDays: Number)

    /**
     * @param domainName The unique name of the domain. 
     */
    public fun domainName(domainName: String)

    /**
     * @param matching The process of matching duplicate profiles.
     */
    public fun matching(matching: IResolvable)

    /**
     * @param matching The process of matching duplicate profiles.
     */
    public fun matching(matching: CfnDomain.MatchingProperty)

    /**
     * @param matching The process of matching duplicate profiles.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("616c3918a5393a6a5027daf5ea382fa821ebf54d29fd36ba7c7f98cef57ca758")
    public fun matching(matching: CfnDomain.MatchingProperty.Builder.() -> Unit)

    /**
     * @param ruleBasedMatching The process of matching duplicate profiles using Rule-Based
     * matching.
     */
    public fun ruleBasedMatching(ruleBasedMatching: IResolvable)

    /**
     * @param ruleBasedMatching The process of matching duplicate profiles using Rule-Based
     * matching.
     */
    public fun ruleBasedMatching(ruleBasedMatching: CfnDomain.RuleBasedMatchingProperty)

    /**
     * @param ruleBasedMatching The process of matching duplicate profiles using Rule-Based
     * matching.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("605a04d3abbfdc9a3c6ad04e7489192f80af21dd850989cbb6e5e9ffe25157ee")
    public
        fun ruleBasedMatching(ruleBasedMatching: CfnDomain.RuleBasedMatchingProperty.Builder.() -> Unit)

    /**
     * @param tags The tags used to organize, track, or control access for this resource.
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * @param tags The tags used to organize, track, or control access for this resource.
     */
    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.customerprofiles.CfnDomainProps.Builder
        = software.amazon.awscdk.services.customerprofiles.CfnDomainProps.builder()

    /**
     * @param deadLetterQueueUrl The URL of the SQS dead letter queue, which is used for reporting
     * errors associated with ingesting data from third party applications.
     * You must set up a policy on the `DeadLetterQueue` for the `SendMessage` operation to enable
     * Amazon Connect Customer Profiles to send messages to the `DeadLetterQueue` .
     */
    override fun deadLetterQueueUrl(deadLetterQueueUrl: String) {
      cdkBuilder.deadLetterQueueUrl(deadLetterQueueUrl)
    }

    /**
     * @param defaultEncryptionKey The default encryption key, which is an AWS managed key, is used
     * when no specific type of encryption key is specified.
     * It is used to encrypt all data before it is placed in permanent or semi-permanent storage.
     */
    override fun defaultEncryptionKey(defaultEncryptionKey: String) {
      cdkBuilder.defaultEncryptionKey(defaultEncryptionKey)
    }

    /**
     * @param defaultExpirationDays The default number of days until the data within the domain
     * expires. 
     */
    override fun defaultExpirationDays(defaultExpirationDays: Number) {
      cdkBuilder.defaultExpirationDays(defaultExpirationDays)
    }

    /**
     * @param domainName The unique name of the domain. 
     */
    override fun domainName(domainName: String) {
      cdkBuilder.domainName(domainName)
    }

    /**
     * @param matching The process of matching duplicate profiles.
     */
    override fun matching(matching: IResolvable) {
      cdkBuilder.matching(matching.let(IResolvable::unwrap))
    }

    /**
     * @param matching The process of matching duplicate profiles.
     */
    override fun matching(matching: CfnDomain.MatchingProperty) {
      cdkBuilder.matching(matching.let(CfnDomain.MatchingProperty::unwrap))
    }

    /**
     * @param matching The process of matching duplicate profiles.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("616c3918a5393a6a5027daf5ea382fa821ebf54d29fd36ba7c7f98cef57ca758")
    override fun matching(matching: CfnDomain.MatchingProperty.Builder.() -> Unit): Unit =
        matching(CfnDomain.MatchingProperty(matching))

    /**
     * @param ruleBasedMatching The process of matching duplicate profiles using Rule-Based
     * matching.
     */
    override fun ruleBasedMatching(ruleBasedMatching: IResolvable) {
      cdkBuilder.ruleBasedMatching(ruleBasedMatching.let(IResolvable::unwrap))
    }

    /**
     * @param ruleBasedMatching The process of matching duplicate profiles using Rule-Based
     * matching.
     */
    override fun ruleBasedMatching(ruleBasedMatching: CfnDomain.RuleBasedMatchingProperty) {
      cdkBuilder.ruleBasedMatching(ruleBasedMatching.let(CfnDomain.RuleBasedMatchingProperty::unwrap))
    }

    /**
     * @param ruleBasedMatching The process of matching duplicate profiles using Rule-Based
     * matching.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("605a04d3abbfdc9a3c6ad04e7489192f80af21dd850989cbb6e5e9ffe25157ee")
    override
        fun ruleBasedMatching(ruleBasedMatching: CfnDomain.RuleBasedMatchingProperty.Builder.() -> Unit):
        Unit = ruleBasedMatching(CfnDomain.RuleBasedMatchingProperty(ruleBasedMatching))

    /**
     * @param tags The tags used to organize, track, or control access for this resource.
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    /**
     * @param tags The tags used to organize, track, or control access for this resource.
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.customerprofiles.CfnDomainProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.customerprofiles.CfnDomainProps,
  ) : CdkObject(cdkObject), CfnDomainProps {
    /**
     * The URL of the SQS dead letter queue, which is used for reporting errors associated with
     * ingesting data from third party applications.
     *
     * You must set up a policy on the `DeadLetterQueue` for the `SendMessage` operation to enable
     * Amazon Connect Customer Profiles to send messages to the `DeadLetterQueue` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-customerprofiles-domain.html#cfn-customerprofiles-domain-deadletterqueueurl)
     */
    override fun deadLetterQueueUrl(): String? = unwrap(this).getDeadLetterQueueUrl()

    /**
     * The default encryption key, which is an AWS managed key, is used when no specific type of
     * encryption key is specified.
     *
     * It is used to encrypt all data before it is placed in permanent or semi-permanent storage.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-customerprofiles-domain.html#cfn-customerprofiles-domain-defaultencryptionkey)
     */
    override fun defaultEncryptionKey(): String? = unwrap(this).getDefaultEncryptionKey()

    /**
     * The default number of days until the data within the domain expires.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-customerprofiles-domain.html#cfn-customerprofiles-domain-defaultexpirationdays)
     */
    override fun defaultExpirationDays(): Number = unwrap(this).getDefaultExpirationDays()

    /**
     * The unique name of the domain.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-customerprofiles-domain.html#cfn-customerprofiles-domain-domainname)
     */
    override fun domainName(): String = unwrap(this).getDomainName()

    /**
     * The process of matching duplicate profiles.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-customerprofiles-domain.html#cfn-customerprofiles-domain-matching)
     */
    override fun matching(): Any? = unwrap(this).getMatching()

    /**
     * The process of matching duplicate profiles using Rule-Based matching.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-customerprofiles-domain.html#cfn-customerprofiles-domain-rulebasedmatching)
     */
    override fun ruleBasedMatching(): Any? = unwrap(this).getRuleBasedMatching()

    /**
     * The tags used to organize, track, or control access for this resource.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-customerprofiles-domain.html#cfn-customerprofiles-domain-tags)
     */
    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnDomainProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.customerprofiles.CfnDomainProps):
        CfnDomainProps = CdkObjectWrappers.wrap(cdkObject) as? CfnDomainProps ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnDomainProps):
        software.amazon.awscdk.services.customerprofiles.CfnDomainProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.customerprofiles.CfnDomainProps
  }
}
