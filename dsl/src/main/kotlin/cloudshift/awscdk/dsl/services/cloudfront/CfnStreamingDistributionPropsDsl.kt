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
import software.amazon.awscdk.services.cloudfront.CfnStreamingDistribution
import software.amazon.awscdk.services.cloudfront.CfnStreamingDistributionProps
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList

@CdkDslMarker
public class CfnStreamingDistributionPropsDsl {
    private val cdkBuilder: CfnStreamingDistributionProps.Builder =
        CfnStreamingDistributionProps.builder()

    private val _tags: MutableList<CfnTag> = mutableListOf()

    public fun streamingDistributionConfig(streamingDistributionConfig: IResolvable) {
        cdkBuilder.streamingDistributionConfig(streamingDistributionConfig)
    }

    public fun streamingDistributionConfig(streamingDistributionConfig: CfnStreamingDistribution.StreamingDistributionConfigProperty) {
        cdkBuilder.streamingDistributionConfig(streamingDistributionConfig)
    }

    public fun tags(tags: CfnTagDsl.() -> Unit) {
        _tags.add(CfnTagDsl().apply(tags).build())
    }

    public fun tags(tags: Collection<CfnTag>) {
        _tags.addAll(tags)
    }

    public fun build(): CfnStreamingDistributionProps {
        if (_tags.isNotEmpty()) cdkBuilder.tags(_tags)
        return cdkBuilder.build()
    }
}
