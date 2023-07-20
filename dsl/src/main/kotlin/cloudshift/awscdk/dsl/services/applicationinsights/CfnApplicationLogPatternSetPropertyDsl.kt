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

package cloudshift.awscdk.dsl.services.applicationinsights

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.applicationinsights.CfnApplication
import kotlin.Any
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList

@CdkDslMarker
public class CfnApplicationLogPatternSetPropertyDsl {
    private val cdkBuilder: CfnApplication.LogPatternSetProperty.Builder =
        CfnApplication.LogPatternSetProperty.builder()

    private val _logPatterns: MutableList<Any> = mutableListOf()

    public fun logPatterns(vararg logPatterns: Any) {
        _logPatterns.addAll(listOf(*logPatterns))
    }

    public fun logPatterns(logPatterns: Collection<Any>) {
        _logPatterns.addAll(logPatterns)
    }

    public fun logPatterns(logPatterns: IResolvable) {
        cdkBuilder.logPatterns(logPatterns)
    }

    public fun patternSetName(patternSetName: String) {
        cdkBuilder.patternSetName(patternSetName)
    }

    public fun build(): CfnApplication.LogPatternSetProperty {
        if (_logPatterns.isNotEmpty()) cdkBuilder.logPatterns(_logPatterns)
        return cdkBuilder.build()
    }
}
