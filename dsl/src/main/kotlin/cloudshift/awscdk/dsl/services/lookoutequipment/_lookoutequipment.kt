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

package cloudshift.awscdk.dsl.services.lookoutequipment

import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.lookoutequipment.CfnInferenceScheduler
import software.amazon.awscdk.services.lookoutequipment.CfnInferenceSchedulerProps
import software.constructs.Construct

public object lookoutequipment {
    /**
     * Creates a scheduled inference.
     *
     * Scheduling an inference is setting up a continuous real-time inference plan to analyze new
     * measurement data. When setting up the schedule, you provide an Amazon S3 bucket location for
     * the input data, assign it a delimiter between separate entries in the data, set an offset
     * delay if desired, and set the frequency of inferencing. You must also provide an Amazon S3
     * bucket location for the output data.
     *
     * Updating some properties below (for example, InferenceSchedulerName and ServerSideKmsKeyId)
     * triggers a resource replacement, which requires a new model. To replace such a property using
     * AWS CloudFormation , but without creating a completely new stack, you must replace ModelName.
     * If you need to replace the property, but want to use the same model, delete the current stack
     * and create a new one with the updated properties.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.lookoutequipment.*;
     * Object dataInputConfiguration;
     * Object dataOutputConfiguration;
     * CfnInferenceScheduler cfnInferenceScheduler = CfnInferenceScheduler.Builder.create(this,
     * "MyCfnInferenceScheduler")
     * .dataInputConfiguration(dataInputConfiguration)
     * .dataOutputConfiguration(dataOutputConfiguration)
     * .dataUploadFrequency("dataUploadFrequency")
     * .modelName("modelName")
     * .roleArn("roleArn")
     * // the properties below are optional
     * .dataDelayOffsetInMinutes(123)
     * .inferenceSchedulerName("inferenceSchedulerName")
     * .serverSideKmsKeyId("serverSideKmsKeyId")
     * .tags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lookoutequipment-inferencescheduler.html)
     */
    public inline fun cfnInferenceScheduler(
        scope: Construct,
        id: String,
        block: CfnInferenceSchedulerDsl.() -> Unit = {},
    ): CfnInferenceScheduler {
        val builder = CfnInferenceSchedulerDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Specifies configuration information for the input data for the inference scheduler, including
     * delimiter, format, and dataset location.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.lookoutequipment.*;
     * DataInputConfigurationProperty dataInputConfigurationProperty =
     * DataInputConfigurationProperty.builder()
     * .s3InputConfiguration(S3InputConfigurationProperty.builder()
     * .bucket("bucket")
     * // the properties below are optional
     * .prefix("prefix")
     * .build())
     * // the properties below are optional
     * .inferenceInputNameConfiguration(InputNameConfigurationProperty.builder()
     * .componentTimestampDelimiter("componentTimestampDelimiter")
     * .timestampFormat("timestampFormat")
     * .build())
     * .inputTimeZoneOffset("inputTimeZoneOffset")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lookoutequipment-inferencescheduler-datainputconfiguration.html)
     */
    public inline fun cfnInferenceSchedulerDataInputConfigurationProperty(
        block: CfnInferenceSchedulerDataInputConfigurationPropertyDsl.() -> Unit = {}
    ): CfnInferenceScheduler.DataInputConfigurationProperty {
        val builder = CfnInferenceSchedulerDataInputConfigurationPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Specifies configuration information for the output results for the inference scheduler,
     * including the S3 location for the output.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.lookoutequipment.*;
     * DataOutputConfigurationProperty dataOutputConfigurationProperty =
     * DataOutputConfigurationProperty.builder()
     * .s3OutputConfiguration(S3OutputConfigurationProperty.builder()
     * .bucket("bucket")
     * // the properties below are optional
     * .prefix("prefix")
     * .build())
     * // the properties below are optional
     * .kmsKeyId("kmsKeyId")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lookoutequipment-inferencescheduler-dataoutputconfiguration.html)
     */
    public inline fun cfnInferenceSchedulerDataOutputConfigurationProperty(
        block: CfnInferenceSchedulerDataOutputConfigurationPropertyDsl.() -> Unit = {}
    ): CfnInferenceScheduler.DataOutputConfigurationProperty {
        val builder = CfnInferenceSchedulerDataOutputConfigurationPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Specifies configuration information for the input data for the inference, including timestamp
     * format and delimiter.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.lookoutequipment.*;
     * InputNameConfigurationProperty inputNameConfigurationProperty =
     * InputNameConfigurationProperty.builder()
     * .componentTimestampDelimiter("componentTimestampDelimiter")
     * .timestampFormat("timestampFormat")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lookoutequipment-inferencescheduler-inputnameconfiguration.html)
     */
    public inline fun cfnInferenceSchedulerInputNameConfigurationProperty(
        block: CfnInferenceSchedulerInputNameConfigurationPropertyDsl.() -> Unit = {}
    ): CfnInferenceScheduler.InputNameConfigurationProperty {
        val builder = CfnInferenceSchedulerInputNameConfigurationPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnInferenceScheduler`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.lookoutequipment.*;
     * Object dataInputConfiguration;
     * Object dataOutputConfiguration;
     * CfnInferenceSchedulerProps cfnInferenceSchedulerProps = CfnInferenceSchedulerProps.builder()
     * .dataInputConfiguration(dataInputConfiguration)
     * .dataOutputConfiguration(dataOutputConfiguration)
     * .dataUploadFrequency("dataUploadFrequency")
     * .modelName("modelName")
     * .roleArn("roleArn")
     * // the properties below are optional
     * .dataDelayOffsetInMinutes(123)
     * .inferenceSchedulerName("inferenceSchedulerName")
     * .serverSideKmsKeyId("serverSideKmsKeyId")
     * .tags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lookoutequipment-inferencescheduler.html)
     */
    public inline fun cfnInferenceSchedulerProps(
        block: CfnInferenceSchedulerPropsDsl.() -> Unit = {}
    ): CfnInferenceSchedulerProps {
        val builder = CfnInferenceSchedulerPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Specifies configuration information for the input data for the inference, including input
     * data S3 location.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.lookoutequipment.*;
     * S3InputConfigurationProperty s3InputConfigurationProperty =
     * S3InputConfigurationProperty.builder()
     * .bucket("bucket")
     * // the properties below are optional
     * .prefix("prefix")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lookoutequipment-inferencescheduler-s3inputconfiguration.html)
     */
    public inline fun cfnInferenceSchedulerS3InputConfigurationProperty(
        block: CfnInferenceSchedulerS3InputConfigurationPropertyDsl.() -> Unit = {}
    ): CfnInferenceScheduler.S3InputConfigurationProperty {
        val builder = CfnInferenceSchedulerS3InputConfigurationPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Specifies configuration information for the output results from the inference, including
     * output S3 location.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.lookoutequipment.*;
     * S3OutputConfigurationProperty s3OutputConfigurationProperty =
     * S3OutputConfigurationProperty.builder()
     * .bucket("bucket")
     * // the properties below are optional
     * .prefix("prefix")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lookoutequipment-inferencescheduler-s3outputconfiguration.html)
     */
    public inline fun cfnInferenceSchedulerS3OutputConfigurationProperty(
        block: CfnInferenceSchedulerS3OutputConfigurationPropertyDsl.() -> Unit = {}
    ): CfnInferenceScheduler.S3OutputConfigurationProperty {
        val builder = CfnInferenceSchedulerS3OutputConfigurationPropertyDsl()
        builder.apply(block)
        return builder.build()
    }
}
