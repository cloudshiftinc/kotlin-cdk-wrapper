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

package io.cloudshiftdev.awscdkdsl.services.kinesisanalyticsv2

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.kinesisanalyticsv2.CfnApplication

/**
 * For an SQL-based Amazon Kinesis Data Analytics application, describes a processor that is used to
 * preprocess the records in the stream before being processed by your application code.
 *
 * Currently, the only input processor available is
 * [Amazon Lambda](https://docs.aws.amazon.com/lambda/) .
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.kinesisanalyticsv2.*;
 * InputProcessingConfigurationProperty inputProcessingConfigurationProperty =
 * InputProcessingConfigurationProperty.builder()
 * .inputLambdaProcessor(InputLambdaProcessorProperty.builder()
 * .resourceArn("resourceArn")
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-application-inputprocessingconfiguration.html)
 */
@CdkDslMarker
public class CfnApplicationInputProcessingConfigurationPropertyDsl {
    private val cdkBuilder: CfnApplication.InputProcessingConfigurationProperty.Builder =
        CfnApplication.InputProcessingConfigurationProperty.builder()

    /**
     * @param inputLambdaProcessor The
     *   [InputLambdaProcessor](https://docs.aws.amazon.com/managed-flink/latest/apiv2/API_InputLambdaProcessor.html)
     *   that is used to preprocess the records in the stream before being processed by your
     *   application code.
     */
    public fun inputLambdaProcessor(inputLambdaProcessor: IResolvable) {
        cdkBuilder.inputLambdaProcessor(inputLambdaProcessor)
    }

    /**
     * @param inputLambdaProcessor The
     *   [InputLambdaProcessor](https://docs.aws.amazon.com/managed-flink/latest/apiv2/API_InputLambdaProcessor.html)
     *   that is used to preprocess the records in the stream before being processed by your
     *   application code.
     */
    public fun inputLambdaProcessor(
        inputLambdaProcessor: CfnApplication.InputLambdaProcessorProperty
    ) {
        cdkBuilder.inputLambdaProcessor(inputLambdaProcessor)
    }

    public fun build(): CfnApplication.InputProcessingConfigurationProperty = cdkBuilder.build()
}
