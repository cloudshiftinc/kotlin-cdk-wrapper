@file:Suppress(
    "RedundantVisibilityModifier",
    "RedundantUnitReturnType",
    "RemoveRedundantQualifierName",
    "unused",
    "UnusedImport",
    "ClassName",
    "REDUNDANT_PROJECTION",
    "DEPRECATION",
)

package cloudshift.awscdk.dsl.services.config

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.dsl.CfnTagDsl
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.services.config.CfnAggregationAuthorization
import software.constructs.Construct
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList

@CdkDslMarker
public class CfnAggregationAuthorizationDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnAggregationAuthorization.Builder =
        CfnAggregationAuthorization.Builder.create(scope, id)

    private val _tags: MutableList<CfnTag> = mutableListOf()

    public fun authorizedAccountId(authorizedAccountId: String) {
        cdkBuilder.authorizedAccountId(authorizedAccountId)
    }

    public fun authorizedAwsRegion(authorizedAwsRegion: String) {
        cdkBuilder.authorizedAwsRegion(authorizedAwsRegion)
    }

    public fun tags(tags: CfnTagDsl.() -> Unit) {
        _tags.add(CfnTagDsl().apply(tags).build())
    }

    public fun tags(tags: Collection<CfnTag>) {
        _tags.addAll(tags)
    }

    public fun build(): CfnAggregationAuthorization {
        if (_tags.isNotEmpty()) cdkBuilder.tags(_tags)
        return cdkBuilder.build()
    }
}
