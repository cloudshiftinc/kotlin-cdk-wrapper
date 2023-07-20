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

package cloudshift.awscdk.dsl.services.s3

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.s3.CfnBucket
import kotlin.Any
import kotlin.collections.Collection
import kotlin.collections.MutableList

@CdkDslMarker
public class CfnBucketCorsConfigurationPropertyDsl {
    private val cdkBuilder: CfnBucket.CorsConfigurationProperty.Builder =
        CfnBucket.CorsConfigurationProperty.builder()

    private val _corsRules: MutableList<Any> = mutableListOf()

    public fun corsRules(vararg corsRules: Any) {
        _corsRules.addAll(listOf(*corsRules))
    }

    public fun corsRules(corsRules: Collection<Any>) {
        _corsRules.addAll(corsRules)
    }

    public fun corsRules(corsRules: IResolvable) {
        cdkBuilder.corsRules(corsRules)
    }

    public fun build(): CfnBucket.CorsConfigurationProperty {
        if (_corsRules.isNotEmpty()) cdkBuilder.corsRules(_corsRules)
        return cdkBuilder.build()
    }
}
