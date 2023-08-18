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

package io.cloudshiftdev.awscdkdsl.services.sam

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import io.cloudshiftdev.awscdkdsl.common.MapBuilder
import kotlin.Any
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.sam.CfnStateMachine

/**
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.sam.*;
 * Object statement;
 * IAMPolicyDocumentProperty iAMPolicyDocumentProperty = Map.of(
 * "statement", statement,
 * "version", "version");
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-serverless-statemachine-iampolicydocument.html)
 */
@CdkDslMarker
public class CfnStateMachineIAMPolicyDocumentPropertyDsl {
    private val cdkBuilder: CfnStateMachine.IAMPolicyDocumentProperty.Builder =
        CfnStateMachine.IAMPolicyDocumentProperty.builder()

    /** @param statement the value to be set. */
    public fun statement(statement: MapBuilder.() -> Unit = {}) {
        val builder = MapBuilder()
        builder.apply(statement)
        cdkBuilder.statement(builder.map)
    }

    /** @param statement the value to be set. */
    public fun statement(statement: Any) {
        cdkBuilder.statement(statement)
    }

    /** @param version the value to be set. */
    public fun version(version: String) {
        cdkBuilder.version(version)
    }

    public fun build(): CfnStateMachine.IAMPolicyDocumentProperty = cdkBuilder.build()
}
