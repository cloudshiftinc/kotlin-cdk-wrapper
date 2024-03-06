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

package io.cloudshiftdev.awscdkdsl.services.apigateway

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.Boolean
import kotlin.String
import software.amazon.awscdk.services.apigateway.DeploymentProps
import software.amazon.awscdk.services.apigateway.IRestApi

/**
 * Example:
 * ```
 * // production stage
 * LogGroup prodLogGroup = new LogGroup(this, "PrdLogs");
 * RestApi api = RestApi.Builder.create(this, "books")
 * .deployOptions(StageOptions.builder()
 * .accessLogDestination(new LogGroupLogDestination(prodLogGroup))
 * .accessLogFormat(AccessLogFormat.jsonWithStandardFields())
 * .build())
 * .build();
 * Deployment deployment = Deployment.Builder.create(this, "Deployment").api(api).build();
 * // development stage
 * LogGroup devLogGroup = new LogGroup(this, "DevLogs");
 * Stage.Builder.create(this, "dev")
 * .deployment(deployment)
 * .accessLogDestination(new LogGroupLogDestination(devLogGroup))
 * .accessLogFormat(AccessLogFormat.jsonWithStandardFields(JsonWithStandardFieldProps.builder()
 * .caller(false)
 * .httpMethod(true)
 * .ip(true)
 * .protocol(true)
 * .requestTime(true)
 * .resourcePath(true)
 * .responseLength(true)
 * .status(true)
 * .user(true)
 * .build()))
 * .build();
 * ```
 */
@CdkDslMarker
public class DeploymentPropsDsl {
    private val cdkBuilder: DeploymentProps.Builder = DeploymentProps.builder()

    /** @param api The Rest API to deploy. */
    public fun api(api: IRestApi) {
        cdkBuilder.api(api)
    }

    /** @param description A description of the purpose of the API Gateway deployment. */
    public fun description(description: String) {
        cdkBuilder.description(description)
    }

    /**
     * @param retainDeployments When an API Gateway model is updated, a new deployment will
     *   automatically be created. If this is true, the old API Gateway Deployment resource will not
     *   be deleted. This will allow manually reverting back to a previous deployment in case for
     *   example
     */
    public fun retainDeployments(retainDeployments: Boolean) {
        cdkBuilder.retainDeployments(retainDeployments)
    }

    public fun build(): DeploymentProps = cdkBuilder.build()
}
