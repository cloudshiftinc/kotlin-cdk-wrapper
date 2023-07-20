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

package cloudshift.awscdk.dsl.services.autoscaling

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.autoscaling.ApplyCloudFormationInitOptions
import kotlin.Boolean
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList

@CdkDslMarker
public class ApplyCloudFormationInitOptionsDsl {
    private val cdkBuilder: ApplyCloudFormationInitOptions.Builder =
        ApplyCloudFormationInitOptions.builder()

    private val _configSets: MutableList<String> = mutableListOf()

    public fun configSets(vararg configSets: String) {
        _configSets.addAll(listOf(*configSets))
    }

    public fun configSets(configSets: Collection<String>) {
        _configSets.addAll(configSets)
    }

    public fun embedFingerprint(embedFingerprint: Boolean) {
        cdkBuilder.embedFingerprint(embedFingerprint)
    }

    public fun ignoreFailures(ignoreFailures: Boolean) {
        cdkBuilder.ignoreFailures(ignoreFailures)
    }

    public fun includeRole(includeRole: Boolean) {
        cdkBuilder.includeRole(includeRole)
    }

    public fun includeUrl(includeUrl: Boolean) {
        cdkBuilder.includeUrl(includeUrl)
    }

    public fun printLog(printLog: Boolean) {
        cdkBuilder.printLog(printLog)
    }

    public fun build(): ApplyCloudFormationInitOptions {
        if (_configSets.isNotEmpty()) cdkBuilder.configSets(_configSets)
        return cdkBuilder.build()
    }
}
