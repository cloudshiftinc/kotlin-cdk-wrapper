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
public class CfnStreamingDistributionTrustedSignersPropertyDsl {
    private val cdkBuilder: CfnStreamingDistribution.TrustedSignersProperty.Builder =
        CfnStreamingDistribution.TrustedSignersProperty.builder()

    private val _awsAccountNumbers: MutableList<String> = mutableListOf()

    public fun awsAccountNumbers(vararg awsAccountNumbers: String) {
        _awsAccountNumbers.addAll(listOf(*awsAccountNumbers))
    }

    public fun awsAccountNumbers(awsAccountNumbers: Collection<String>) {
        _awsAccountNumbers.addAll(awsAccountNumbers)
    }

    public fun enabled(enabled: Boolean) {
        cdkBuilder.enabled(enabled)
    }

    public fun enabled(enabled: IResolvable) {
        cdkBuilder.enabled(enabled)
    }

    public fun build(): CfnStreamingDistribution.TrustedSignersProperty {
        if (_awsAccountNumbers.isNotEmpty()) cdkBuilder.awsAccountNumbers(_awsAccountNumbers)
        return cdkBuilder.build()
    }
}
