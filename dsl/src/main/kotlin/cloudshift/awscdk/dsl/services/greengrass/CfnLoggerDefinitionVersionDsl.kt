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

package cloudshift.awscdk.dsl.services.greengrass

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.greengrass.CfnLoggerDefinitionVersion
import software.constructs.Construct
import kotlin.Any
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList

@CdkDslMarker
public class CfnLoggerDefinitionVersionDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnLoggerDefinitionVersion.Builder =
        CfnLoggerDefinitionVersion.Builder.create(scope, id)

    private val _loggers: MutableList<Any> = mutableListOf()

    public fun loggerDefinitionId(loggerDefinitionId: String) {
        cdkBuilder.loggerDefinitionId(loggerDefinitionId)
    }

    public fun loggers(vararg loggers: Any) {
        _loggers.addAll(listOf(*loggers))
    }

    public fun loggers(loggers: Collection<Any>) {
        _loggers.addAll(loggers)
    }

    public fun loggers(loggers: IResolvable) {
        cdkBuilder.loggers(loggers)
    }

    public fun build(): CfnLoggerDefinitionVersion {
        if (_loggers.isNotEmpty()) cdkBuilder.loggers(_loggers)
        return cdkBuilder.build()
    }
}
