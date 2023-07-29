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
import cloudshift.awscdk.dsl.CfnTagDsl
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.services.config.CfnAggregationAuthorization
import software.constructs.Construct

/**
 * An object that represents the authorizations granted to aggregator accounts and regions.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.config.*;
 * CfnAggregationAuthorization cfnAggregationAuthorization =
 * CfnAggregationAuthorization.Builder.create(this, "MyCfnAggregationAuthorization")
 * .authorizedAccountId("authorizedAccountId")
 * .authorizedAwsRegion("authorizedAwsRegion")
 * // the properties below are optional
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-config-aggregationauthorization.html)
 */
@CdkDslMarker
public class CfnAggregationAuthorizationDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnAggregationAuthorization.Builder =
        CfnAggregationAuthorization.Builder.create(scope, id)

    private val _tags: MutableList<CfnTag> = mutableListOf()

    /**
     * The 12-digit account ID of the account authorized to aggregate data.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-config-aggregationauthorization.html#cfn-config-aggregationauthorization-authorizedaccountid)
     *
     * @param authorizedAccountId The 12-digit account ID of the account authorized to aggregate
     *   data.
     */
    public fun authorizedAccountId(authorizedAccountId: String) {
        cdkBuilder.authorizedAccountId(authorizedAccountId)
    }

    /**
     * The region authorized to collect aggregated data.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-config-aggregationauthorization.html#cfn-config-aggregationauthorization-authorizedawsregion)
     *
     * @param authorizedAwsRegion The region authorized to collect aggregated data.
     */
    public fun authorizedAwsRegion(authorizedAwsRegion: String) {
        cdkBuilder.authorizedAwsRegion(authorizedAwsRegion)
    }

    /**
     * An array of tag object.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-config-aggregationauthorization.html#cfn-config-aggregationauthorization-tags)
     *
     * @param tags An array of tag object.
     */
    public fun tags(tags: CfnTagDsl.() -> Unit) {
        _tags.add(CfnTagDsl().apply(tags).build())
    }

    /**
     * An array of tag object.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-config-aggregationauthorization.html#cfn-config-aggregationauthorization-tags)
     *
     * @param tags An array of tag object.
     */
    public fun tags(tags: Collection<CfnTag>) {
        _tags.addAll(tags)
    }

    public fun build(): CfnAggregationAuthorization {
        if (_tags.isNotEmpty()) cdkBuilder.tags(_tags)
        return cdkBuilder.build()
    }
}
