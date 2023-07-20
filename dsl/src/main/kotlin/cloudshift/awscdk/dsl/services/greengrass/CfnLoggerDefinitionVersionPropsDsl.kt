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
import software.amazon.awscdk.services.greengrass.CfnLoggerDefinitionVersionProps
import kotlin.Any
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList

@CdkDslMarker
public class CfnLoggerDefinitionVersionPropsDsl {
    private val cdkBuilder: CfnLoggerDefinitionVersionProps.Builder =
        CfnLoggerDefinitionVersionProps.builder()

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

    public fun build(): CfnLoggerDefinitionVersionProps {
        if (_loggers.isNotEmpty()) cdkBuilder.loggers(_loggers)
        return cdkBuilder.build()
    }
}
