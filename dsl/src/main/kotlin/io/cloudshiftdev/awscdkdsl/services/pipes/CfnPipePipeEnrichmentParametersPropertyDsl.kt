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

package io.cloudshiftdev.awscdkdsl.services.pipes

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.pipes.CfnPipe

/**
 * The parameters required to set up enrichment on your pipe.
 *
 * Example:
 * ```
 * Queue sourceQueue;
 * Queue targetQueue;
 * LogGroup loggroup;
 * Pipe pipe = Pipe.Builder.create(this, "Pipe")
 * .source(new SqsSource(sourceQueue))
 * .target(new SqsTarget(targetQueue))
 * .logLevel(LogLevel.TRACE)
 * .logIncludeExecutionData(List.of(IncludeExecutionData.ALL))
 * .logDestinations(List.of(
 * new CloudwatchDestination(loggroup)))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pipes-pipe-pipeenrichmentparameters.html)
 */
@CdkDslMarker
public class CfnPipePipeEnrichmentParametersPropertyDsl {
    private val cdkBuilder: CfnPipe.PipeEnrichmentParametersProperty.Builder =
        CfnPipe.PipeEnrichmentParametersProperty.builder()

    /**
     * @param httpParameters Contains the HTTP parameters to use when the target is a API Gateway
     *   REST endpoint or EventBridge ApiDestination. If you specify an API Gateway REST API or
     *   EventBridge ApiDestination as a target, you can use this parameter to specify headers, path
     *   parameters, and query string keys/values as part of your target invoking request. If you're
     *   using ApiDestinations, the corresponding Connection can also have these values configured.
     *   In case of any conflicting keys, values from the Connection take precedence.
     */
    public fun httpParameters(httpParameters: IResolvable) {
        cdkBuilder.httpParameters(httpParameters)
    }

    /**
     * @param httpParameters Contains the HTTP parameters to use when the target is a API Gateway
     *   REST endpoint or EventBridge ApiDestination. If you specify an API Gateway REST API or
     *   EventBridge ApiDestination as a target, you can use this parameter to specify headers, path
     *   parameters, and query string keys/values as part of your target invoking request. If you're
     *   using ApiDestinations, the corresponding Connection can also have these values configured.
     *   In case of any conflicting keys, values from the Connection take precedence.
     */
    public fun httpParameters(httpParameters: CfnPipe.PipeEnrichmentHttpParametersProperty) {
        cdkBuilder.httpParameters(httpParameters)
    }

    /**
     * @param inputTemplate Valid JSON text passed to the enrichment. In this case, nothing from the
     *   event itself is passed to the enrichment. For more information, see
     *   [The JavaScript Object Notation (JSON) Data Interchange Format](https://docs.aws.amazon.com/http://www.rfc-editor.org/rfc/rfc7159.txt)
     *   .
     *
     * To remove an input template, specify an empty string.
     */
    public fun inputTemplate(inputTemplate: String) {
        cdkBuilder.inputTemplate(inputTemplate)
    }

    public fun build(): CfnPipe.PipeEnrichmentParametersProperty = cdkBuilder.build()
}
