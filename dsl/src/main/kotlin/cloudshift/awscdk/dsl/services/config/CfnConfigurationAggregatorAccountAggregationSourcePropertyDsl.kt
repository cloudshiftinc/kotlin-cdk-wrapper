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

package cloudshift.awscdk.dsl.services.config

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.config.CfnConfigurationAggregator

/**
 * A collection of accounts and regions.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.config.*;
 * AccountAggregationSourceProperty accountAggregationSourceProperty =
 * AccountAggregationSourceProperty.builder()
 * .accountIds(List.of("accountIds"))
 * // the properties below are optional
 * .allAwsRegions(false)
 * .awsRegions(List.of("awsRegions"))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-config-configurationaggregator-accountaggregationsource.html)
 */
@CdkDslMarker
public class CfnConfigurationAggregatorAccountAggregationSourcePropertyDsl {
    private val cdkBuilder: CfnConfigurationAggregator.AccountAggregationSourceProperty.Builder =
        CfnConfigurationAggregator.AccountAggregationSourceProperty.builder()

    private val _accountIds: MutableList<String> = mutableListOf()

    private val _awsRegions: MutableList<String> = mutableListOf()

    /** @param accountIds The 12-digit account ID of the account being aggregated. */
    public fun accountIds(vararg accountIds: String) {
        _accountIds.addAll(listOf(*accountIds))
    }

    /** @param accountIds The 12-digit account ID of the account being aggregated. */
    public fun accountIds(accountIds: Collection<String>) {
        _accountIds.addAll(accountIds)
    }

    /** @param allAwsRegions If true, aggregate existing AWS Config regions and future regions. */
    public fun allAwsRegions(allAwsRegions: Boolean) {
        cdkBuilder.allAwsRegions(allAwsRegions)
    }

    /** @param allAwsRegions If true, aggregate existing AWS Config regions and future regions. */
    public fun allAwsRegions(allAwsRegions: IResolvable) {
        cdkBuilder.allAwsRegions(allAwsRegions)
    }

    /** @param awsRegions The source regions being aggregated. */
    public fun awsRegions(vararg awsRegions: String) {
        _awsRegions.addAll(listOf(*awsRegions))
    }

    /** @param awsRegions The source regions being aggregated. */
    public fun awsRegions(awsRegions: Collection<String>) {
        _awsRegions.addAll(awsRegions)
    }

    public fun build(): CfnConfigurationAggregator.AccountAggregationSourceProperty {
        if (_accountIds.isNotEmpty()) cdkBuilder.accountIds(_accountIds)
        if (_awsRegions.isNotEmpty()) cdkBuilder.awsRegions(_awsRegions)
        return cdkBuilder.build()
    }
}
