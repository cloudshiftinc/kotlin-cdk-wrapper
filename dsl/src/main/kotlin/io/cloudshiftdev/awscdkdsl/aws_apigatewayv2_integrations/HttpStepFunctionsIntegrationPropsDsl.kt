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

package io.cloudshiftdev.awscdkdsl.aws_apigatewayv2_integrations

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import software.amazon.awscdk.aws_apigatewayv2_integrations.HttpStepFunctionsIntegrationProps
import software.amazon.awscdk.services.apigatewayv2.HttpIntegrationSubtype
import software.amazon.awscdk.services.apigatewayv2.ParameterMapping
import software.amazon.awscdk.services.stepfunctions.StateMachine

/**
 * Properties to initialize `HttpStepFunctionsIntegration`.
 *
 * Example:
 * ```
 * import software.amazon.awscdk.aws_apigatewayv2_integrations.HttpStepFunctionsIntegration;
 * import software.amazon.awscdk.services.stepfunctions.*;
 * StateMachine stateMachine;
 * HttpApi httpApi;
 * httpApi.addRoutes(AddRoutesOptions.builder()
 * .path("/start")
 * .methods(List.of(HttpMethod.POST))
 * .integration(HttpStepFunctionsIntegration.Builder.create("StartExecutionIntegration")
 * .stateMachine(stateMachine)
 * .subtype(HttpIntegrationSubtype.STEPFUNCTIONS_START_EXECUTION)
 * .build())
 * .build());
 * httpApi.addRoutes(AddRoutesOptions.builder()
 * .path("/start-sync")
 * .methods(List.of(HttpMethod.POST))
 * .integration(HttpStepFunctionsIntegration.Builder.create("StartSyncExecutionIntegration")
 * .stateMachine(stateMachine)
 * .subtype(HttpIntegrationSubtype.STEPFUNCTIONS_START_SYNC_EXECUTION)
 * .build())
 * .build());
 * httpApi.addRoutes(AddRoutesOptions.builder()
 * .path("/stop")
 * .methods(List.of(HttpMethod.POST))
 * .integration(HttpStepFunctionsIntegration.Builder.create("StopExecutionIntegration")
 * .stateMachine(stateMachine)
 * .subtype(HttpIntegrationSubtype.STEPFUNCTIONS_STOP_EXECUTION)
 * // For the `STOP_EXECUTION` subtype, it is necessary to specify the `executionArn`.
 * .parameterMapping(new ParameterMapping().custom("ExecutionArn",
 * "$request.querystring.executionArn"))
 * .build())
 * .build());
 * ```
 */
@CdkDslMarker
public class HttpStepFunctionsIntegrationPropsDsl {
    private val cdkBuilder: HttpStepFunctionsIntegrationProps.Builder =
        HttpStepFunctionsIntegrationProps.builder()

    /**
     * @param parameterMapping Specifies how to transform HTTP requests before sending them to the
     *   backend. When the subtype is either `START_EXECUTION` or `START_SYNC_EXECUTION`, it is
     *   necessary to specify the `StateMachineArn`. Conversely, when the subtype is
     *   `STOP_EXECUTION`, the `ExecutionArn` must be specified.
     */
    public fun parameterMapping(parameterMapping: ParameterMapping) {
        cdkBuilder.parameterMapping(parameterMapping)
    }

    /** @param stateMachine Statemachine that Integrates with API Gateway. */
    public fun stateMachine(stateMachine: StateMachine) {
        cdkBuilder.stateMachine(stateMachine)
    }

    /**
     * @param subtype The subtype of the HTTP integration. Only subtypes starting with
     *   STEPFUNCTIONS_ can be specified.
     */
    public fun subtype(subtype: HttpIntegrationSubtype) {
        cdkBuilder.subtype(subtype)
    }

    public fun build(): HttpStepFunctionsIntegrationProps = cdkBuilder.build()
}
