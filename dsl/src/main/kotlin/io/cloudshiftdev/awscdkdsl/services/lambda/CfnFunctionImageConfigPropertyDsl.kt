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

package io.cloudshiftdev.awscdkdsl.services.lambda

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.services.lambda.CfnFunction

/**
 * Configuration values that override the container image Dockerfile settings.
 *
 * For more information, see
 * [Container image settings](https://docs.aws.amazon.com/lambda/latest/dg/images-create.html#images-parms)
 * .
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.lambda.*;
 * ImageConfigProperty imageConfigProperty = ImageConfigProperty.builder()
 * .command(List.of("command"))
 * .entryPoint(List.of("entryPoint"))
 * .workingDirectory("workingDirectory")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lambda-function-imageconfig.html)
 */
@CdkDslMarker
public class CfnFunctionImageConfigPropertyDsl {
    private val cdkBuilder: CfnFunction.ImageConfigProperty.Builder =
        CfnFunction.ImageConfigProperty.builder()

    private val _command: MutableList<String> = mutableListOf()

    private val _entryPoint: MutableList<String> = mutableListOf()

    /**
     * @param command Specifies parameters that you want to pass in with ENTRYPOINT. You can specify
     *   a maximum of 1,500 parameters in the list.
     */
    public fun command(vararg command: String) {
        _command.addAll(listOf(*command))
    }

    /**
     * @param command Specifies parameters that you want to pass in with ENTRYPOINT. You can specify
     *   a maximum of 1,500 parameters in the list.
     */
    public fun command(command: Collection<String>) {
        _command.addAll(command)
    }

    /**
     * @param entryPoint Specifies the entry point to their application, which is typically the
     *   location of the runtime executable. You can specify a maximum of 1,500 string entries in
     *   the list.
     */
    public fun entryPoint(vararg entryPoint: String) {
        _entryPoint.addAll(listOf(*entryPoint))
    }

    /**
     * @param entryPoint Specifies the entry point to their application, which is typically the
     *   location of the runtime executable. You can specify a maximum of 1,500 string entries in
     *   the list.
     */
    public fun entryPoint(entryPoint: Collection<String>) {
        _entryPoint.addAll(entryPoint)
    }

    /**
     * @param workingDirectory Specifies the working directory. The length of the directory string
     *   cannot exceed 1,000 characters.
     */
    public fun workingDirectory(workingDirectory: String) {
        cdkBuilder.workingDirectory(workingDirectory)
    }

    public fun build(): CfnFunction.ImageConfigProperty {
        if (_command.isNotEmpty()) cdkBuilder.command(_command)
        if (_entryPoint.isNotEmpty()) cdkBuilder.entryPoint(_entryPoint)
        return cdkBuilder.build()
    }
}
