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
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.cloudfront.CfnStreamingDistribution
import kotlin.Boolean
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList

@CdkDslMarker
public class CfnStreamingDistributionStreamingDistributionConfigPropertyDsl {
    private val cdkBuilder: CfnStreamingDistribution.StreamingDistributionConfigProperty.Builder =
        CfnStreamingDistribution.StreamingDistributionConfigProperty.builder()

    private val _aliases: MutableList<String> = mutableListOf()

    public fun aliases(vararg aliases: String) {
        _aliases.addAll(listOf(*aliases))
    }

    public fun aliases(aliases: Collection<String>) {
        _aliases.addAll(aliases)
    }

    public fun comment(comment: String) {
        cdkBuilder.comment(comment)
    }

    public fun enabled(enabled: Boolean) {
        cdkBuilder.enabled(enabled)
    }

    public fun enabled(enabled: IResolvable) {
        cdkBuilder.enabled(enabled)
    }

    public fun logging(logging: IResolvable) {
        cdkBuilder.logging(logging)
    }

    public fun logging(logging: CfnStreamingDistribution.LoggingProperty) {
        cdkBuilder.logging(logging)
    }

    public fun priceClass(priceClass: String) {
        cdkBuilder.priceClass(priceClass)
    }

    public fun s3Origin(s3Origin: IResolvable) {
        cdkBuilder.s3Origin(s3Origin)
    }

    public fun s3Origin(s3Origin: CfnStreamingDistribution.S3OriginProperty) {
        cdkBuilder.s3Origin(s3Origin)
    }

    public fun trustedSigners(trustedSigners: IResolvable) {
        cdkBuilder.trustedSigners(trustedSigners)
    }

    public fun trustedSigners(trustedSigners: CfnStreamingDistribution.TrustedSignersProperty) {
        cdkBuilder.trustedSigners(trustedSigners)
    }

    public fun build(): CfnStreamingDistribution.StreamingDistributionConfigProperty {
        if (_aliases.isNotEmpty()) cdkBuilder.aliases(_aliases)
        return cdkBuilder.build()
    }
}
