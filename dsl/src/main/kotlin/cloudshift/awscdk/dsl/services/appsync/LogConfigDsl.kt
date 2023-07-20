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

package cloudshift.awscdk.dsl.services.appsync

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.appsync.FieldLogLevel
import software.amazon.awscdk.services.appsync.LogConfig
import software.amazon.awscdk.services.iam.IRole
import software.amazon.awscdk.services.logs.RetentionDays
import kotlin.Boolean

@CdkDslMarker
public class LogConfigDsl {
    private val cdkBuilder: LogConfig.Builder = LogConfig.builder()

    public fun excludeVerboseContent(excludeVerboseContent: Boolean) {
        cdkBuilder.excludeVerboseContent(excludeVerboseContent)
    }

    public fun excludeVerboseContent(excludeVerboseContent: IResolvable) {
        cdkBuilder.excludeVerboseContent(excludeVerboseContent)
    }

    public fun fieldLogLevel(fieldLogLevel: FieldLogLevel) {
        cdkBuilder.fieldLogLevel(fieldLogLevel)
    }

    public fun retention(retention: RetentionDays) {
        cdkBuilder.retention(retention)
    }

    public fun role(role: IRole) {
        cdkBuilder.role(role)
    }

    public fun build(): LogConfig = cdkBuilder.build()
}
