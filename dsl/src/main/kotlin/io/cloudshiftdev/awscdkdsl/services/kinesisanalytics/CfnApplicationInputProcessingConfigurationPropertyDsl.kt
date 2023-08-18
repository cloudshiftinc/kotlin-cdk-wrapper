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

package io.cloudshiftdev.awscdkdsl.services.kinesisanalytics

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.kinesisanalytics.CfnApplication

/**
 * Provides a description of a processor that is used to preprocess the records in the stream before
 * being processed by your application code.
 *
 * Currently, the only input processor available is
 * [AWS Lambda](https://docs.aws.amazon.com/lambda/) .
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.kinesisanalytics.*;
 * InputProcessingConfigurationProperty inputProcessingConfigurationProperty =
 * InputProcessingConfigurationProperty.builder()
 * .inputLambdaProcessor(InputLambdaProcessorProperty.builder()
 * .resourceArn("resourceArn")
 * .roleArn("roleArn")
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalytics-application-inputprocessingconfiguration.html)
 */
@CdkDslMarker
public class CfnApplicationInputProcessingConfigurationPropertyDsl {
    private val cdkBuilder: CfnApplication.InputProcessingConfigurationProperty.Builder =
        CfnApplication.InputProcessingConfigurationProperty.builder()

    /**
     * @param inputLambdaProcessor The
     *   [InputLambdaProcessor](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalytics-application-inputlambdaprocessor.html)
     *   that is used to preprocess the records in the stream before being processed by your
     *   application code.
     */
    public fun inputLambdaProcessor(inputLambdaProcessor: IResolvable) {
        cdkBuilder.inputLambdaProcessor(inputLambdaProcessor)
    }

    /**
     * @param inputLambdaProcessor The
     *   [InputLambdaProcessor](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalytics-application-inputlambdaprocessor.html)
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
