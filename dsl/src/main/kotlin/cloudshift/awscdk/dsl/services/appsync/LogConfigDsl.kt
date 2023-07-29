@file:Suppress(
    "RedundantVisibilityModifier",
    "RedundantUnitReturnType",
    "RemoveRedundantQualifierName",
    "unused",
    "UnusedImport",
    "ClassName",
    "REDUNDANT_PROJECTION",
    "DEPRECATION"
)

package cloudshift.awscdk.dsl.services.appsync

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.appsync.FieldLogLevel
import software.amazon.awscdk.services.appsync.LogConfig
import software.amazon.awscdk.services.iam.IRole
import software.amazon.awscdk.services.logs.RetentionDays

/**
 * Logging configuration for AppSync.
 *
 * Example:
 * ```
 * import software.amazon.awscdk.services.logs.*;
 * LogConfig logConfig = LogConfig.builder()
 * .retention(RetentionDays.ONE_WEEK)
 * .build();
 * GraphqlApi.Builder.create(this, "api")
 * .authorizationConfig(AuthorizationConfig.builder().build())
 * .name("myApi")
 * .schema(SchemaFile.fromAsset(join(__dirname, "myApi.graphql")))
 * .logConfig(logConfig)
 * .build();
 * ```
 */
@CdkDslMarker
public class LogConfigDsl {
    private val cdkBuilder: LogConfig.Builder = LogConfig.builder()

    /** @param excludeVerboseContent exclude verbose content. */
    public fun excludeVerboseContent(excludeVerboseContent: Boolean) {
        cdkBuilder.excludeVerboseContent(excludeVerboseContent)
    }

    /** @param excludeVerboseContent exclude verbose content. */
    public fun excludeVerboseContent(excludeVerboseContent: IResolvable) {
        cdkBuilder.excludeVerboseContent(excludeVerboseContent)
    }

    /** @param fieldLogLevel log level for fields. */
    public fun fieldLogLevel(fieldLogLevel: FieldLogLevel) {
        cdkBuilder.fieldLogLevel(fieldLogLevel)
    }

    /**
     * @param retention The number of days log events are kept in CloudWatch Logs. By default
     *   AppSync keeps the logs infinitely. When updating this property, unsetting it doesn't remove
     *   the log retention policy. To remove the retention policy, set the value to `INFINITE`
     */
    public fun retention(retention: RetentionDays) {
        cdkBuilder.retention(retention)
    }

    /** @param role The role for CloudWatch Logs. */
    public fun role(role: IRole) {
        cdkBuilder.role(role)
    }

    public fun build(): LogConfig = cdkBuilder.build()
}
