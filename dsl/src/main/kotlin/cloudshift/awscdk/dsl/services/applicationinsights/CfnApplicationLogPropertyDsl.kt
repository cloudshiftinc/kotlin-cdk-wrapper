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
import software.amazon.awscdk.services.applicationinsights.CfnApplication
import kotlin.String

@CdkDslMarker
public class CfnApplicationLogPropertyDsl {
    private val cdkBuilder: CfnApplication.LogProperty.Builder = CfnApplication.LogProperty.builder()

    public fun encoding(encoding: String) {
        cdkBuilder.encoding(encoding)
    }

    public fun logGroupName(logGroupName: String) {
        cdkBuilder.logGroupName(logGroupName)
    }

    public fun logPath(logPath: String) {
        cdkBuilder.logPath(logPath)
    }

    public fun logType(logType: String) {
        cdkBuilder.logType(logType)
    }

    public fun patternSet(patternSet: String) {
        cdkBuilder.patternSet(patternSet)
    }

    public fun build(): CfnApplication.LogProperty = cdkBuilder.build()
}
