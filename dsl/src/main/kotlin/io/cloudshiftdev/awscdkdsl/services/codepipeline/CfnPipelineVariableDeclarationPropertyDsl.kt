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

package io.cloudshiftdev.awscdkdsl.services.codepipeline

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.codepipeline.CfnPipeline

/**
 * A variable declared at the pipeline level.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.codepipeline.*;
 * VariableDeclarationProperty variableDeclarationProperty = VariableDeclarationProperty.builder()
 * .name("name")
 * // the properties below are optional
 * .defaultValue("defaultValue")
 * .description("description")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codepipeline-pipeline-variabledeclaration.html)
 */
@CdkDslMarker
public class CfnPipelineVariableDeclarationPropertyDsl {
    private val cdkBuilder: CfnPipeline.VariableDeclarationProperty.Builder =
        CfnPipeline.VariableDeclarationProperty.builder()

    /** @param defaultValue The value of a pipeline-level variable. */
    public fun defaultValue(defaultValue: String) {
        cdkBuilder.defaultValue(defaultValue)
    }

    /**
     * @param description The description of a pipeline-level variable. It's used to add additional
     *   context about the variable, and not being used at time when pipeline executes.
     */
    public fun description(description: String) {
        cdkBuilder.description(description)
    }

    /** @param name The name of a pipeline-level variable. */
    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    public fun build(): CfnPipeline.VariableDeclarationProperty = cdkBuilder.build()
}
