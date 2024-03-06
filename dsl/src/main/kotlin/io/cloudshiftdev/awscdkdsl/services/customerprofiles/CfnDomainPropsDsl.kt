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

package io.cloudshiftdev.awscdkdsl.services.customerprofiles

import io.cloudshiftdev.awscdkdsl.CfnTagDsl
import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.customerprofiles.CfnDomain
import software.amazon.awscdk.services.customerprofiles.CfnDomainProps

/**
 * Properties for defining a `CfnDomain`.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.customerprofiles.*;
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
@CdkDslMarker
public class CfnDomainPropsDsl {
    private val cdkBuilder: CfnDomainProps.Builder = CfnDomainProps.builder()

    private val _tags: MutableList<CfnTag> = mutableListOf()

    /**
     * @param deadLetterQueueUrl The URL of the SQS dead letter queue, which is used for reporting
     *   errors associated with ingesting data from third party applications. You must set up a
     *   policy on the `DeadLetterQueue` for the `SendMessage` operation to enable Amazon Connect
     *   Customer Profiles to send messages to the `DeadLetterQueue` .
     */
    public fun deadLetterQueueUrl(deadLetterQueueUrl: String) {
        cdkBuilder.deadLetterQueueUrl(deadLetterQueueUrl)
    }

    /**
     * @param defaultEncryptionKey The default encryption key, which is an AWS managed key, is used
     *   when no specific type of encryption key is specified. It is used to encrypt all data before
     *   it is placed in permanent or semi-permanent storage.
     */
    public fun defaultEncryptionKey(defaultEncryptionKey: String) {
        cdkBuilder.defaultEncryptionKey(defaultEncryptionKey)
    }

    /**
     * @param defaultExpirationDays The default number of days until the data within the domain
     *   expires.
     */
    public fun defaultExpirationDays(defaultExpirationDays: Number) {
        cdkBuilder.defaultExpirationDays(defaultExpirationDays)
    }

    /** @param domainName The unique name of the domain. */
    public fun domainName(domainName: String) {
        cdkBuilder.domainName(domainName)
    }

    /** @param matching The process of matching duplicate profiles. */
    public fun matching(matching: IResolvable) {
        cdkBuilder.matching(matching)
    }

    /** @param matching The process of matching duplicate profiles. */
    public fun matching(matching: CfnDomain.MatchingProperty) {
        cdkBuilder.matching(matching)
    }

    /**
     * @param ruleBasedMatching The process of matching duplicate profiles using Rule-Based
     *   matching.
     */
    public fun ruleBasedMatching(ruleBasedMatching: IResolvable) {
        cdkBuilder.ruleBasedMatching(ruleBasedMatching)
    }

    /**
     * @param ruleBasedMatching The process of matching duplicate profiles using Rule-Based
     *   matching.
     */
    public fun ruleBasedMatching(ruleBasedMatching: CfnDomain.RuleBasedMatchingProperty) {
        cdkBuilder.ruleBasedMatching(ruleBasedMatching)
    }

    /** @param tags The tags used to organize, track, or control access for this resource. */
    public fun tags(tags: CfnTagDsl.() -> Unit) {
        _tags.add(CfnTagDsl().apply(tags).build())
    }

    /** @param tags The tags used to organize, track, or control access for this resource. */
    public fun tags(tags: Collection<CfnTag>) {
        _tags.addAll(tags)
    }

    public fun build(): CfnDomainProps {
        if (_tags.isNotEmpty()) cdkBuilder.tags(_tags)
        return cdkBuilder.build()
    }
}
