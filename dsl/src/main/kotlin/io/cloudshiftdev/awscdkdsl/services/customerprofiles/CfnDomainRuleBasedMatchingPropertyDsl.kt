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

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.Any
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.customerprofiles.CfnDomain

/**
 * The process of matching duplicate profiles using Rule-Based matching.
 *
 * If `RuleBasedMatching = true` , Amazon Connect Customer Profiles will start to match and merge
 * your profiles according to your configuration in the `RuleBasedMatchingRequest` . You can use the
 * `ListRuleBasedMatches` and `GetSimilarProfiles` API to return and review the results. Also, if
 * you have configured `ExportingConfig` in the `RuleBasedMatchingRequest` , you can download the
 * results from S3.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.customerprofiles.*;
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
@CdkDslMarker
public class CfnDomainRuleBasedMatchingPropertyDsl {
    private val cdkBuilder: CfnDomain.RuleBasedMatchingProperty.Builder =
        CfnDomain.RuleBasedMatchingProperty.builder()

    private val _matchingRules: MutableList<Any> = mutableListOf()

    /**
     * @param attributeTypesSelector Configures information about the `AttributeTypesSelector` where
     *   the rule-based identity resolution uses to match profiles.
     */
    public fun attributeTypesSelector(attributeTypesSelector: IResolvable) {
        cdkBuilder.attributeTypesSelector(attributeTypesSelector)
    }

    /**
     * @param attributeTypesSelector Configures information about the `AttributeTypesSelector` where
     *   the rule-based identity resolution uses to match profiles.
     */
    public fun attributeTypesSelector(
        attributeTypesSelector: CfnDomain.AttributeTypesSelectorProperty
    ) {
        cdkBuilder.attributeTypesSelector(attributeTypesSelector)
    }

    /**
     * @param conflictResolution Determines how the auto-merging process should resolve conflicts
     *   between different profiles. For example, if Profile A and Profile B have the same
     *   `FirstName` and `LastName` , `ConflictResolution` specifies which `EmailAddress` should be
     *   used.
     */
    public fun conflictResolution(conflictResolution: IResolvable) {
        cdkBuilder.conflictResolution(conflictResolution)
    }

    /**
     * @param conflictResolution Determines how the auto-merging process should resolve conflicts
     *   between different profiles. For example, if Profile A and Profile B have the same
     *   `FirstName` and `LastName` , `ConflictResolution` specifies which `EmailAddress` should be
     *   used.
     */
    public fun conflictResolution(conflictResolution: CfnDomain.ConflictResolutionProperty) {
        cdkBuilder.conflictResolution(conflictResolution)
    }

    /** @param enabled The flag that enables the matching process of duplicate profiles. */
    public fun enabled(enabled: Boolean) {
        cdkBuilder.enabled(enabled)
    }

    /** @param enabled The flag that enables the matching process of duplicate profiles. */
    public fun enabled(enabled: IResolvable) {
        cdkBuilder.enabled(enabled)
    }

    /** @param exportingConfig The S3 location where Identity Resolution Jobs write result files. */
    public fun exportingConfig(exportingConfig: IResolvable) {
        cdkBuilder.exportingConfig(exportingConfig)
    }

    /** @param exportingConfig The S3 location where Identity Resolution Jobs write result files. */
    public fun exportingConfig(exportingConfig: CfnDomain.ExportingConfigProperty) {
        cdkBuilder.exportingConfig(exportingConfig)
    }

    /**
     * @param matchingRules Configures how the rule-based matching process should match profiles.
     *   You can have up to 15 `MatchingRule` in the `MatchingRules` .
     */
    public fun matchingRules(vararg matchingRules: Any) {
        _matchingRules.addAll(listOf(*matchingRules))
    }

    /**
     * @param matchingRules Configures how the rule-based matching process should match profiles.
     *   You can have up to 15 `MatchingRule` in the `MatchingRules` .
     */
    public fun matchingRules(matchingRules: Collection<Any>) {
        _matchingRules.addAll(matchingRules)
    }

    /**
     * @param matchingRules Configures how the rule-based matching process should match profiles.
     *   You can have up to 15 `MatchingRule` in the `MatchingRules` .
     */
    public fun matchingRules(matchingRules: IResolvable) {
        cdkBuilder.matchingRules(matchingRules)
    }

    /**
     * @param maxAllowedRuleLevelForMatching Indicates the maximum allowed rule level for matching.
     */
    public fun maxAllowedRuleLevelForMatching(maxAllowedRuleLevelForMatching: Number) {
        cdkBuilder.maxAllowedRuleLevelForMatching(maxAllowedRuleLevelForMatching)
    }

    /**
     * @param maxAllowedRuleLevelForMerging Indicates the maximum allowed rule level for merging.
     */
    public fun maxAllowedRuleLevelForMerging(maxAllowedRuleLevelForMerging: Number) {
        cdkBuilder.maxAllowedRuleLevelForMerging(maxAllowedRuleLevelForMerging)
    }

    /** @param status The status of rule-based matching rule. */
    public fun status(status: String) {
        cdkBuilder.status(status)
    }

    public fun build(): CfnDomain.RuleBasedMatchingProperty {
        if (_matchingRules.isNotEmpty()) cdkBuilder.matchingRules(_matchingRules)
        return cdkBuilder.build()
    }
}
