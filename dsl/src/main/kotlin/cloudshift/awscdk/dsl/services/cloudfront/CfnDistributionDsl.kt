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

package cloudshift.awscdk.dsl.services.cloudfront

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.dsl.CfnTagDsl
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.cloudfront.CfnDistribution
import software.constructs.Construct
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList

@CdkDslMarker
public class CfnDistributionDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnDistribution.Builder = CfnDistribution.Builder.create(scope, id)

    private val _tags: MutableList<CfnTag> = mutableListOf()

    public fun distributionConfig(distributionConfig: IResolvable) {
        cdkBuilder.distributionConfig(distributionConfig)
    }

    public fun distributionConfig(distributionConfig: CfnDistribution.DistributionConfigProperty) {
        cdkBuilder.distributionConfig(distributionConfig)
    }

    public fun tags(tags: CfnTagDsl.() -> Unit) {
        _tags.add(CfnTagDsl().apply(tags).build())
    }

    public fun tags(tags: Collection<CfnTag>) {
        _tags.addAll(tags)
    }

    public fun build(): CfnDistribution {
        if (_tags.isNotEmpty()) cdkBuilder.tags(_tags)
        return cdkBuilder.build()
    }
}
