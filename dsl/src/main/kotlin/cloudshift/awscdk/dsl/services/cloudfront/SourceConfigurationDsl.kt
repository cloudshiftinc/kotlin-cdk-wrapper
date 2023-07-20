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
import software.amazon.awscdk.Duration
import software.amazon.awscdk.services.cloudfront.Behavior
import software.amazon.awscdk.services.cloudfront.CustomOriginConfig
import software.amazon.awscdk.services.cloudfront.FailoverStatusCode
import software.amazon.awscdk.services.cloudfront.S3OriginConfig
import software.amazon.awscdk.services.cloudfront.SourceConfiguration
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList

@CdkDslMarker
public class SourceConfigurationDsl {
    private val cdkBuilder: SourceConfiguration.Builder = SourceConfiguration.builder()

    private val _behaviors: MutableList<Behavior> = mutableListOf()

    private val _failoverCriteriaStatusCodes: MutableList<FailoverStatusCode> = mutableListOf()

    public fun behaviors(behaviors: BehaviorDsl.() -> Unit) {
        _behaviors.add(BehaviorDsl().apply(behaviors).build())
    }

    public fun behaviors(behaviors: Collection<Behavior>) {
        _behaviors.addAll(behaviors)
    }

    public fun connectionAttempts(connectionAttempts: Number) {
        cdkBuilder.connectionAttempts(connectionAttempts)
    }

    public fun connectionTimeout(connectionTimeout: Duration) {
        cdkBuilder.connectionTimeout(connectionTimeout)
    }

    public fun customOriginSource(block: CustomOriginConfigDsl.() -> Unit = {}) {
        val builder = CustomOriginConfigDsl()
        builder.apply(block)
        cdkBuilder.customOriginSource(builder.build())
    }

    public fun customOriginSource(customOriginSource: CustomOriginConfig) {
        cdkBuilder.customOriginSource(customOriginSource)
    }

    public fun failoverCriteriaStatusCodes(vararg failoverCriteriaStatusCodes: FailoverStatusCode) {
        _failoverCriteriaStatusCodes.addAll(listOf(*failoverCriteriaStatusCodes))
    }

    public fun failoverCriteriaStatusCodes(failoverCriteriaStatusCodes: Collection<FailoverStatusCode>) {
        _failoverCriteriaStatusCodes.addAll(failoverCriteriaStatusCodes)
    }

    public fun failoverCustomOriginSource(block: CustomOriginConfigDsl.() -> Unit = {}) {
        val builder = CustomOriginConfigDsl()
        builder.apply(block)
        cdkBuilder.failoverCustomOriginSource(builder.build())
    }

    public fun failoverCustomOriginSource(failoverCustomOriginSource: CustomOriginConfig) {
        cdkBuilder.failoverCustomOriginSource(failoverCustomOriginSource)
    }

    public fun failoverS3OriginSource(block: S3OriginConfigDsl.() -> Unit = {}) {
        val builder = S3OriginConfigDsl()
        builder.apply(block)
        cdkBuilder.failoverS3OriginSource(builder.build())
    }

    public fun failoverS3OriginSource(failoverS3OriginSource: S3OriginConfig) {
        cdkBuilder.failoverS3OriginSource(failoverS3OriginSource)
    }

    public fun originShieldRegion(originShieldRegion: String) {
        cdkBuilder.originShieldRegion(originShieldRegion)
    }

    public fun s3OriginSource(block: S3OriginConfigDsl.() -> Unit = {}) {
        val builder = S3OriginConfigDsl()
        builder.apply(block)
        cdkBuilder.s3OriginSource(builder.build())
    }

    public fun s3OriginSource(s3OriginSource: S3OriginConfig) {
        cdkBuilder.s3OriginSource(s3OriginSource)
    }

    public fun build(): SourceConfiguration {
        if (_behaviors.isNotEmpty()) cdkBuilder.behaviors(_behaviors)
        if (_failoverCriteriaStatusCodes.isNotEmpty()) {
            cdkBuilder.failoverCriteriaStatusCodes(_failoverCriteriaStatusCodes)
        }
        return cdkBuilder.build()
    }
}
