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

package cloudshift.awscdk.dsl.services.lambda

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.lambda.CfnFunction
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList

@CdkDslMarker
public class CfnFunctionImageConfigPropertyDsl {
    private val cdkBuilder: CfnFunction.ImageConfigProperty.Builder =
        CfnFunction.ImageConfigProperty.builder()

    private val _command: MutableList<String> = mutableListOf()

    private val _entryPoint: MutableList<String> = mutableListOf()

    public fun command(vararg command: String) {
        _command.addAll(listOf(*command))
    }

    public fun command(command: Collection<String>) {
        _command.addAll(command)
    }

    public fun entryPoint(vararg entryPoint: String) {
        _entryPoint.addAll(listOf(*entryPoint))
    }

    public fun entryPoint(entryPoint: Collection<String>) {
        _entryPoint.addAll(entryPoint)
    }

    public fun workingDirectory(workingDirectory: String) {
        cdkBuilder.workingDirectory(workingDirectory)
    }

    public fun build(): CfnFunction.ImageConfigProperty {
        if (_command.isNotEmpty()) cdkBuilder.command(_command)
        if (_entryPoint.isNotEmpty()) cdkBuilder.entryPoint(_entryPoint)
        return cdkBuilder.build()
    }
}
