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

package cloudshift.awscdk.dsl.services.iotanalytics

import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.iotanalytics.CfnChannel
import software.amazon.awscdk.services.iotanalytics.CfnChannelProps
import software.amazon.awscdk.services.iotanalytics.CfnDataset
import software.amazon.awscdk.services.iotanalytics.CfnDatasetProps
import software.amazon.awscdk.services.iotanalytics.CfnDatastore
import software.amazon.awscdk.services.iotanalytics.CfnDatastoreProps
import software.amazon.awscdk.services.iotanalytics.CfnPipeline
import software.amazon.awscdk.services.iotanalytics.CfnPipelineProps
import software.constructs.Construct

public object iotanalytics {
    /**
     * The AWS::IoTAnalytics::Channel resource collects data from an MQTT topic and archives the
     * raw, unprocessed messages before publishing the data to a pipeline.
     *
     * For more information, see
     * [How to Use AWS IoT Analytics](https://docs.aws.amazon.com/iotanalytics/latest/userguide/welcome.html#aws-iot-analytics-how)
     * in the *AWS IoT Analytics User Guide* .
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.iotanalytics.*;
     * Object serviceManagedS3;
     * CfnChannel cfnChannel = CfnChannel.Builder.create(this, "MyCfnChannel")
     * .channelName("channelName")
     * .channelStorage(ChannelStorageProperty.builder()
     * .customerManagedS3(CustomerManagedS3Property.builder()
     * .bucket("bucket")
     * .roleArn("roleArn")
     * // the properties below are optional
     * .keyPrefix("keyPrefix")
     * .build())
     * .serviceManagedS3(serviceManagedS3)
     * .build())
     * .retentionPeriod(RetentionPeriodProperty.builder()
     * .numberOfDays(123)
     * .unlimited(false)
     * .build())
     * .tags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotanalytics-channel.html)
     */
    public inline fun cfnChannel(
        scope: Construct,
        id: String,
        block: CfnChannelDsl.() -> Unit = {},
    ): CfnChannel {
        val builder = CfnChannelDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Where channel data is stored.
     *
     * You may choose one of `serviceManagedS3` , `customerManagedS3` storage. If not specified, the
     * default is `serviceManagedS3` . This can't be changed after creation of the channel.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.iotanalytics.*;
     * Object serviceManagedS3;
     * ChannelStorageProperty channelStorageProperty = ChannelStorageProperty.builder()
     * .customerManagedS3(CustomerManagedS3Property.builder()
     * .bucket("bucket")
     * .roleArn("roleArn")
     * // the properties below are optional
     * .keyPrefix("keyPrefix")
     * .build())
     * .serviceManagedS3(serviceManagedS3)
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotanalytics-channel-channelstorage.html)
     */
    public inline fun cfnChannelChannelStorageProperty(
        block: CfnChannelChannelStoragePropertyDsl.() -> Unit = {}
    ): CfnChannel.ChannelStorageProperty {
        val builder = CfnChannelChannelStoragePropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Used to store channel data in an S3 bucket that you manage.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.iotanalytics.*;
     * CustomerManagedS3Property customerManagedS3Property = CustomerManagedS3Property.builder()
     * .bucket("bucket")
     * .roleArn("roleArn")
     * // the properties below are optional
     * .keyPrefix("keyPrefix")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotanalytics-channel-customermanageds3.html)
     */
    public inline fun cfnChannelCustomerManagedS3Property(
        block: CfnChannelCustomerManagedS3PropertyDsl.() -> Unit = {}
    ): CfnChannel.CustomerManagedS3Property {
        val builder = CfnChannelCustomerManagedS3PropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnChannel`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.iotanalytics.*;
     * Object serviceManagedS3;
     * CfnChannelProps cfnChannelProps = CfnChannelProps.builder()
     * .channelName("channelName")
     * .channelStorage(ChannelStorageProperty.builder()
     * .customerManagedS3(CustomerManagedS3Property.builder()
     * .bucket("bucket")
     * .roleArn("roleArn")
     * // the properties below are optional
     * .keyPrefix("keyPrefix")
     * .build())
     * .serviceManagedS3(serviceManagedS3)
     * .build())
     * .retentionPeriod(RetentionPeriodProperty.builder()
     * .numberOfDays(123)
     * .unlimited(false)
     * .build())
     * .tags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotanalytics-channel.html)
     */
    public inline fun cfnChannelProps(block: CfnChannelPropsDsl.() -> Unit = {}): CfnChannelProps {
        val builder = CfnChannelPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * How long, in days, message data is kept.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.iotanalytics.*;
     * RetentionPeriodProperty retentionPeriodProperty = RetentionPeriodProperty.builder()
     * .numberOfDays(123)
     * .unlimited(false)
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotanalytics-channel-retentionperiod.html)
     */
    public inline fun cfnChannelRetentionPeriodProperty(
        block: CfnChannelRetentionPeriodPropertyDsl.() -> Unit = {}
    ): CfnChannel.RetentionPeriodProperty {
        val builder = CfnChannelRetentionPeriodPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The AWS::IoTAnalytics::Dataset resource stores data retrieved from a data store by applying a
     * `queryAction` (an SQL query) or a `containerAction` (executing a containerized application).
     *
     * The data set can be populated manually by calling `CreateDatasetContent` or automatically
     * according to a `trigger` you specify. For more information, see
     * [How to Use AWS IoT Analytics](https://docs.aws.amazon.com/iotanalytics/latest/userguide/welcome.html#aws-iot-analytics-how)
     * in the *AWS IoT Analytics User Guide* .
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.iotanalytics.*;
     * CfnDataset cfnDataset = CfnDataset.Builder.create(this, "MyCfnDataset")
     * .actions(List.of(ActionProperty.builder()
     * .actionName("actionName")
     * // the properties below are optional
     * .containerAction(ContainerActionProperty.builder()
     * .executionRoleArn("executionRoleArn")
     * .image("image")
     * .resourceConfiguration(ResourceConfigurationProperty.builder()
     * .computeType("computeType")
     * .volumeSizeInGb(123)
     * .build())
     * // the properties below are optional
     * .variables(List.of(VariableProperty.builder()
     * .variableName("variableName")
     * // the properties below are optional
     * .datasetContentVersionValue(DatasetContentVersionValueProperty.builder()
     * .datasetName("datasetName")
     * .build())
     * .doubleValue(123)
     * .outputFileUriValue(OutputFileUriValueProperty.builder()
     * .fileName("fileName")
     * .build())
     * .stringValue("stringValue")
     * .build()))
     * .build())
     * .queryAction(QueryActionProperty.builder()
     * .sqlQuery("sqlQuery")
     * // the properties below are optional
     * .filters(List.of(FilterProperty.builder()
     * .deltaTime(DeltaTimeProperty.builder()
     * .offsetSeconds(123)
     * .timeExpression("timeExpression")
     * .build())
     * .build()))
     * .build())
     * .build()))
     * // the properties below are optional
     * .contentDeliveryRules(List.of(DatasetContentDeliveryRuleProperty.builder()
     * .destination(DatasetContentDeliveryRuleDestinationProperty.builder()
     * .iotEventsDestinationConfiguration(IotEventsDestinationConfigurationProperty.builder()
     * .inputName("inputName")
     * .roleArn("roleArn")
     * .build())
     * .s3DestinationConfiguration(S3DestinationConfigurationProperty.builder()
     * .bucket("bucket")
     * .key("key")
     * .roleArn("roleArn")
     * // the properties below are optional
     * .glueConfiguration(GlueConfigurationProperty.builder()
     * .databaseName("databaseName")
     * .tableName("tableName")
     * .build())
     * .build())
     * .build())
     * // the properties below are optional
     * .entryName("entryName")
     * .build()))
     * .datasetName("datasetName")
     * .lateDataRules(List.of(LateDataRuleProperty.builder()
     * .ruleConfiguration(LateDataRuleConfigurationProperty.builder()
     * .deltaTimeSessionWindowConfiguration(DeltaTimeSessionWindowConfigurationProperty.builder()
     * .timeoutInMinutes(123)
     * .build())
     * .build())
     * // the properties below are optional
     * .ruleName("ruleName")
     * .build()))
     * .retentionPeriod(RetentionPeriodProperty.builder()
     * .numberOfDays(123)
     * .unlimited(false)
     * .build())
     * .tags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .triggers(List.of(TriggerProperty.builder()
     * .schedule(ScheduleProperty.builder()
     * .scheduleExpression("scheduleExpression")
     * .build())
     * .triggeringDataset(TriggeringDatasetProperty.builder()
     * .datasetName("datasetName")
     * .build())
     * .build()))
     * .versioningConfiguration(VersioningConfigurationProperty.builder()
     * .maxVersions(123)
     * .unlimited(false)
     * .build())
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotanalytics-dataset.html)
     */
    public inline fun cfnDataset(
        scope: Construct,
        id: String,
        block: CfnDatasetDsl.() -> Unit = {},
    ): CfnDataset {
        val builder = CfnDatasetDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Information needed to run the "containerAction" to produce data set contents.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.iotanalytics.*;
     * ActionProperty actionProperty = ActionProperty.builder()
     * .actionName("actionName")
     * // the properties below are optional
     * .containerAction(ContainerActionProperty.builder()
     * .executionRoleArn("executionRoleArn")
     * .image("image")
     * .resourceConfiguration(ResourceConfigurationProperty.builder()
     * .computeType("computeType")
     * .volumeSizeInGb(123)
     * .build())
     * // the properties below are optional
     * .variables(List.of(VariableProperty.builder()
     * .variableName("variableName")
     * // the properties below are optional
     * .datasetContentVersionValue(DatasetContentVersionValueProperty.builder()
     * .datasetName("datasetName")
     * .build())
     * .doubleValue(123)
     * .outputFileUriValue(OutputFileUriValueProperty.builder()
     * .fileName("fileName")
     * .build())
     * .stringValue("stringValue")
     * .build()))
     * .build())
     * .queryAction(QueryActionProperty.builder()
     * .sqlQuery("sqlQuery")
     * // the properties below are optional
     * .filters(List.of(FilterProperty.builder()
     * .deltaTime(DeltaTimeProperty.builder()
     * .offsetSeconds(123)
     * .timeExpression("timeExpression")
     * .build())
     * .build()))
     * .build())
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotanalytics-dataset-action.html)
     */
    public inline fun cfnDatasetActionProperty(
        block: CfnDatasetActionPropertyDsl.() -> Unit = {}
    ): CfnDataset.ActionProperty {
        val builder = CfnDatasetActionPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Information needed to run the "containerAction" to produce data set contents.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.iotanalytics.*;
     * ContainerActionProperty containerActionProperty = ContainerActionProperty.builder()
     * .executionRoleArn("executionRoleArn")
     * .image("image")
     * .resourceConfiguration(ResourceConfigurationProperty.builder()
     * .computeType("computeType")
     * .volumeSizeInGb(123)
     * .build())
     * // the properties below are optional
     * .variables(List.of(VariableProperty.builder()
     * .variableName("variableName")
     * // the properties below are optional
     * .datasetContentVersionValue(DatasetContentVersionValueProperty.builder()
     * .datasetName("datasetName")
     * .build())
     * .doubleValue(123)
     * .outputFileUriValue(OutputFileUriValueProperty.builder()
     * .fileName("fileName")
     * .build())
     * .stringValue("stringValue")
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotanalytics-dataset-containeraction.html)
     */
    public inline fun cfnDatasetContainerActionProperty(
        block: CfnDatasetContainerActionPropertyDsl.() -> Unit = {}
    ): CfnDataset.ContainerActionProperty {
        val builder = CfnDatasetContainerActionPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The destination to which dataset contents are delivered.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.iotanalytics.*;
     * DatasetContentDeliveryRuleDestinationProperty datasetContentDeliveryRuleDestinationProperty =
     * DatasetContentDeliveryRuleDestinationProperty.builder()
     * .iotEventsDestinationConfiguration(IotEventsDestinationConfigurationProperty.builder()
     * .inputName("inputName")
     * .roleArn("roleArn")
     * .build())
     * .s3DestinationConfiguration(S3DestinationConfigurationProperty.builder()
     * .bucket("bucket")
     * .key("key")
     * .roleArn("roleArn")
     * // the properties below are optional
     * .glueConfiguration(GlueConfigurationProperty.builder()
     * .databaseName("databaseName")
     * .tableName("tableName")
     * .build())
     * .build())
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotanalytics-dataset-datasetcontentdeliveryruledestination.html)
     */
    public inline fun cfnDatasetDatasetContentDeliveryRuleDestinationProperty(
        block: CfnDatasetDatasetContentDeliveryRuleDestinationPropertyDsl.() -> Unit = {}
    ): CfnDataset.DatasetContentDeliveryRuleDestinationProperty {
        val builder = CfnDatasetDatasetContentDeliveryRuleDestinationPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * When dataset contents are created, they are delivered to destination specified here.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.iotanalytics.*;
     * DatasetContentDeliveryRuleProperty datasetContentDeliveryRuleProperty =
     * DatasetContentDeliveryRuleProperty.builder()
     * .destination(DatasetContentDeliveryRuleDestinationProperty.builder()
     * .iotEventsDestinationConfiguration(IotEventsDestinationConfigurationProperty.builder()
     * .inputName("inputName")
     * .roleArn("roleArn")
     * .build())
     * .s3DestinationConfiguration(S3DestinationConfigurationProperty.builder()
     * .bucket("bucket")
     * .key("key")
     * .roleArn("roleArn")
     * // the properties below are optional
     * .glueConfiguration(GlueConfigurationProperty.builder()
     * .databaseName("databaseName")
     * .tableName("tableName")
     * .build())
     * .build())
     * .build())
     * // the properties below are optional
     * .entryName("entryName")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotanalytics-dataset-datasetcontentdeliveryrule.html)
     */
    public inline fun cfnDatasetDatasetContentDeliveryRuleProperty(
        block: CfnDatasetDatasetContentDeliveryRulePropertyDsl.() -> Unit = {}
    ): CfnDataset.DatasetContentDeliveryRuleProperty {
        val builder = CfnDatasetDatasetContentDeliveryRulePropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The dataset whose latest contents are used as input to the notebook or application.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.iotanalytics.*;
     * DatasetContentVersionValueProperty datasetContentVersionValueProperty =
     * DatasetContentVersionValueProperty.builder()
     * .datasetName("datasetName")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotanalytics-dataset-datasetcontentversionvalue.html)
     */
    public inline fun cfnDatasetDatasetContentVersionValueProperty(
        block: CfnDatasetDatasetContentVersionValuePropertyDsl.() -> Unit = {}
    ): CfnDataset.DatasetContentVersionValueProperty {
        val builder = CfnDatasetDatasetContentVersionValuePropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Used to limit data to that which has arrived since the last execution of the action.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.iotanalytics.*;
     * DeltaTimeProperty deltaTimeProperty = DeltaTimeProperty.builder()
     * .offsetSeconds(123)
     * .timeExpression("timeExpression")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotanalytics-dataset-deltatime.html)
     */
    public inline fun cfnDatasetDeltaTimeProperty(
        block: CfnDatasetDeltaTimePropertyDsl.() -> Unit = {}
    ): CfnDataset.DeltaTimeProperty {
        val builder = CfnDatasetDeltaTimePropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * A structure that contains the configuration information of a delta time session window.
     *
     * [`DeltaTime`](https://docs.aws.amazon.com/iotanalytics/latest/APIReference/API_DeltaTime.html)
     * specifies a time interval. You can use `DeltaTime` to create dataset contents with data that
     * has arrived in the data store since the last execution. For an example of `DeltaTime` , see
     * [Creating a SQL dataset with a delta window (CLI)](https://docs.aws.amazon.com/iotanalytics/latest/userguide/automate-create-dataset.html#automate-example6)
     * in the *AWS IoT Analytics User Guide* .
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.iotanalytics.*;
     * DeltaTimeSessionWindowConfigurationProperty deltaTimeSessionWindowConfigurationProperty =
     * DeltaTimeSessionWindowConfigurationProperty.builder()
     * .timeoutInMinutes(123)
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotanalytics-dataset-deltatimesessionwindowconfiguration.html)
     */
    public inline fun cfnDatasetDeltaTimeSessionWindowConfigurationProperty(
        block: CfnDatasetDeltaTimeSessionWindowConfigurationPropertyDsl.() -> Unit = {}
    ): CfnDataset.DeltaTimeSessionWindowConfigurationProperty {
        val builder = CfnDatasetDeltaTimeSessionWindowConfigurationPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Information which is used to filter message data, to segregate it according to the time frame
     * in which it arrives.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.iotanalytics.*;
     * FilterProperty filterProperty = FilterProperty.builder()
     * .deltaTime(DeltaTimeProperty.builder()
     * .offsetSeconds(123)
     * .timeExpression("timeExpression")
     * .build())
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotanalytics-dataset-filter.html)
     */
    public inline fun cfnDatasetFilterProperty(
        block: CfnDatasetFilterPropertyDsl.() -> Unit = {}
    ): CfnDataset.FilterProperty {
        val builder = CfnDatasetFilterPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Configuration information for coordination with AWS Glue , a fully managed extract, transform
     * and load (ETL) service.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.iotanalytics.*;
     * GlueConfigurationProperty glueConfigurationProperty = GlueConfigurationProperty.builder()
     * .databaseName("databaseName")
     * .tableName("tableName")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotanalytics-dataset-glueconfiguration.html)
     */
    public inline fun cfnDatasetGlueConfigurationProperty(
        block: CfnDatasetGlueConfigurationPropertyDsl.() -> Unit = {}
    ): CfnDataset.GlueConfigurationProperty {
        val builder = CfnDatasetGlueConfigurationPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Configuration information for delivery of dataset contents to AWS IoT Events .
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.iotanalytics.*;
     * IotEventsDestinationConfigurationProperty iotEventsDestinationConfigurationProperty =
     * IotEventsDestinationConfigurationProperty.builder()
     * .inputName("inputName")
     * .roleArn("roleArn")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotanalytics-dataset-ioteventsdestinationconfiguration.html)
     */
    public inline fun cfnDatasetIotEventsDestinationConfigurationProperty(
        block: CfnDatasetIotEventsDestinationConfigurationPropertyDsl.() -> Unit = {}
    ): CfnDataset.IotEventsDestinationConfigurationProperty {
        val builder = CfnDatasetIotEventsDestinationConfigurationPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The information needed to configure a delta time session window.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.iotanalytics.*;
     * LateDataRuleConfigurationProperty lateDataRuleConfigurationProperty =
     * LateDataRuleConfigurationProperty.builder()
     * .deltaTimeSessionWindowConfiguration(DeltaTimeSessionWindowConfigurationProperty.builder()
     * .timeoutInMinutes(123)
     * .build())
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotanalytics-dataset-latedataruleconfiguration.html)
     */
    public inline fun cfnDatasetLateDataRuleConfigurationProperty(
        block: CfnDatasetLateDataRuleConfigurationPropertyDsl.() -> Unit = {}
    ): CfnDataset.LateDataRuleConfigurationProperty {
        val builder = CfnDatasetLateDataRuleConfigurationPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * A structure that contains the name and configuration information of a late data rule.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.iotanalytics.*;
     * LateDataRuleProperty lateDataRuleProperty = LateDataRuleProperty.builder()
     * .ruleConfiguration(LateDataRuleConfigurationProperty.builder()
     * .deltaTimeSessionWindowConfiguration(DeltaTimeSessionWindowConfigurationProperty.builder()
     * .timeoutInMinutes(123)
     * .build())
     * .build())
     * // the properties below are optional
     * .ruleName("ruleName")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotanalytics-dataset-latedatarule.html)
     */
    public inline fun cfnDatasetLateDataRuleProperty(
        block: CfnDatasetLateDataRulePropertyDsl.() -> Unit = {}
    ): CfnDataset.LateDataRuleProperty {
        val builder = CfnDatasetLateDataRulePropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The value of the variable as a structure that specifies an output file URI.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.iotanalytics.*;
     * OutputFileUriValueProperty outputFileUriValueProperty = OutputFileUriValueProperty.builder()
     * .fileName("fileName")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotanalytics-dataset-outputfileurivalue.html)
     */
    public inline fun cfnDatasetOutputFileUriValueProperty(
        block: CfnDatasetOutputFileUriValuePropertyDsl.() -> Unit = {}
    ): CfnDataset.OutputFileUriValueProperty {
        val builder = CfnDatasetOutputFileUriValuePropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnDataset`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.iotanalytics.*;
     * CfnDatasetProps cfnDatasetProps = CfnDatasetProps.builder()
     * .actions(List.of(ActionProperty.builder()
     * .actionName("actionName")
     * // the properties below are optional
     * .containerAction(ContainerActionProperty.builder()
     * .executionRoleArn("executionRoleArn")
     * .image("image")
     * .resourceConfiguration(ResourceConfigurationProperty.builder()
     * .computeType("computeType")
     * .volumeSizeInGb(123)
     * .build())
     * // the properties below are optional
     * .variables(List.of(VariableProperty.builder()
     * .variableName("variableName")
     * // the properties below are optional
     * .datasetContentVersionValue(DatasetContentVersionValueProperty.builder()
     * .datasetName("datasetName")
     * .build())
     * .doubleValue(123)
     * .outputFileUriValue(OutputFileUriValueProperty.builder()
     * .fileName("fileName")
     * .build())
     * .stringValue("stringValue")
     * .build()))
     * .build())
     * .queryAction(QueryActionProperty.builder()
     * .sqlQuery("sqlQuery")
     * // the properties below are optional
     * .filters(List.of(FilterProperty.builder()
     * .deltaTime(DeltaTimeProperty.builder()
     * .offsetSeconds(123)
     * .timeExpression("timeExpression")
     * .build())
     * .build()))
     * .build())
     * .build()))
     * // the properties below are optional
     * .contentDeliveryRules(List.of(DatasetContentDeliveryRuleProperty.builder()
     * .destination(DatasetContentDeliveryRuleDestinationProperty.builder()
     * .iotEventsDestinationConfiguration(IotEventsDestinationConfigurationProperty.builder()
     * .inputName("inputName")
     * .roleArn("roleArn")
     * .build())
     * .s3DestinationConfiguration(S3DestinationConfigurationProperty.builder()
     * .bucket("bucket")
     * .key("key")
     * .roleArn("roleArn")
     * // the properties below are optional
     * .glueConfiguration(GlueConfigurationProperty.builder()
     * .databaseName("databaseName")
     * .tableName("tableName")
     * .build())
     * .build())
     * .build())
     * // the properties below are optional
     * .entryName("entryName")
     * .build()))
     * .datasetName("datasetName")
     * .lateDataRules(List.of(LateDataRuleProperty.builder()
     * .ruleConfiguration(LateDataRuleConfigurationProperty.builder()
     * .deltaTimeSessionWindowConfiguration(DeltaTimeSessionWindowConfigurationProperty.builder()
     * .timeoutInMinutes(123)
     * .build())
     * .build())
     * // the properties below are optional
     * .ruleName("ruleName")
     * .build()))
     * .retentionPeriod(RetentionPeriodProperty.builder()
     * .numberOfDays(123)
     * .unlimited(false)
     * .build())
     * .tags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .triggers(List.of(TriggerProperty.builder()
     * .schedule(ScheduleProperty.builder()
     * .scheduleExpression("scheduleExpression")
     * .build())
     * .triggeringDataset(TriggeringDatasetProperty.builder()
     * .datasetName("datasetName")
     * .build())
     * .build()))
     * .versioningConfiguration(VersioningConfigurationProperty.builder()
     * .maxVersions(123)
     * .unlimited(false)
     * .build())
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotanalytics-dataset.html)
     */
    public inline fun cfnDatasetProps(block: CfnDatasetPropsDsl.() -> Unit = {}): CfnDatasetProps {
        val builder = CfnDatasetPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * An "SqlQueryDatasetAction" object that uses an SQL query to automatically create data set
     * contents.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.iotanalytics.*;
     * QueryActionProperty queryActionProperty = QueryActionProperty.builder()
     * .sqlQuery("sqlQuery")
     * // the properties below are optional
     * .filters(List.of(FilterProperty.builder()
     * .deltaTime(DeltaTimeProperty.builder()
     * .offsetSeconds(123)
     * .timeExpression("timeExpression")
     * .build())
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotanalytics-dataset-queryaction.html)
     */
    public inline fun cfnDatasetQueryActionProperty(
        block: CfnDatasetQueryActionPropertyDsl.() -> Unit = {}
    ): CfnDataset.QueryActionProperty {
        val builder = CfnDatasetQueryActionPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The configuration of the resource used to execute the `containerAction` .
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.iotanalytics.*;
     * ResourceConfigurationProperty resourceConfigurationProperty =
     * ResourceConfigurationProperty.builder()
     * .computeType("computeType")
     * .volumeSizeInGb(123)
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotanalytics-dataset-resourceconfiguration.html)
     */
    public inline fun cfnDatasetResourceConfigurationProperty(
        block: CfnDatasetResourceConfigurationPropertyDsl.() -> Unit = {}
    ): CfnDataset.ResourceConfigurationProperty {
        val builder = CfnDatasetResourceConfigurationPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * How long, in days, message data is kept.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.iotanalytics.*;
     * RetentionPeriodProperty retentionPeriodProperty = RetentionPeriodProperty.builder()
     * .numberOfDays(123)
     * .unlimited(false)
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotanalytics-dataset-retentionperiod.html)
     */
    public inline fun cfnDatasetRetentionPeriodProperty(
        block: CfnDatasetRetentionPeriodPropertyDsl.() -> Unit = {}
    ): CfnDataset.RetentionPeriodProperty {
        val builder = CfnDatasetRetentionPeriodPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Configuration information for delivery of dataset contents to Amazon Simple Storage Service
     * (Amazon S3).
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.iotanalytics.*;
     * S3DestinationConfigurationProperty s3DestinationConfigurationProperty =
     * S3DestinationConfigurationProperty.builder()
     * .bucket("bucket")
     * .key("key")
     * .roleArn("roleArn")
     * // the properties below are optional
     * .glueConfiguration(GlueConfigurationProperty.builder()
     * .databaseName("databaseName")
     * .tableName("tableName")
     * .build())
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotanalytics-dataset-s3destinationconfiguration.html)
     */
    public inline fun cfnDatasetS3DestinationConfigurationProperty(
        block: CfnDatasetS3DestinationConfigurationPropertyDsl.() -> Unit = {}
    ): CfnDataset.S3DestinationConfigurationProperty {
        val builder = CfnDatasetS3DestinationConfigurationPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The schedule for when to trigger an update.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.iotanalytics.*;
     * ScheduleProperty scheduleProperty = ScheduleProperty.builder()
     * .scheduleExpression("scheduleExpression")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotanalytics-dataset-schedule.html)
     */
    public inline fun cfnDatasetScheduleProperty(
        block: CfnDatasetSchedulePropertyDsl.() -> Unit = {}
    ): CfnDataset.ScheduleProperty {
        val builder = CfnDatasetSchedulePropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The "DatasetTrigger" that specifies when the data set is automatically updated.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.iotanalytics.*;
     * TriggerProperty triggerProperty = TriggerProperty.builder()
     * .schedule(ScheduleProperty.builder()
     * .scheduleExpression("scheduleExpression")
     * .build())
     * .triggeringDataset(TriggeringDatasetProperty.builder()
     * .datasetName("datasetName")
     * .build())
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotanalytics-dataset-trigger.html)
     */
    public inline fun cfnDatasetTriggerProperty(
        block: CfnDatasetTriggerPropertyDsl.() -> Unit = {}
    ): CfnDataset.TriggerProperty {
        val builder = CfnDatasetTriggerPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Information about the dataset whose content generation triggers the new dataset content
     * generation.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.iotanalytics.*;
     * TriggeringDatasetProperty triggeringDatasetProperty = TriggeringDatasetProperty.builder()
     * .datasetName("datasetName")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotanalytics-dataset-triggeringdataset.html)
     */
    public inline fun cfnDatasetTriggeringDatasetProperty(
        block: CfnDatasetTriggeringDatasetPropertyDsl.() -> Unit = {}
    ): CfnDataset.TriggeringDatasetProperty {
        val builder = CfnDatasetTriggeringDatasetPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * An instance of a variable to be passed to the `containerAction` execution.
     *
     * Each variable must have a name and a value given by one of `stringValue` ,
     * `datasetContentVersionValue` , or `outputFileUriValue` .
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.iotanalytics.*;
     * VariableProperty variableProperty = VariableProperty.builder()
     * .variableName("variableName")
     * // the properties below are optional
     * .datasetContentVersionValue(DatasetContentVersionValueProperty.builder()
     * .datasetName("datasetName")
     * .build())
     * .doubleValue(123)
     * .outputFileUriValue(OutputFileUriValueProperty.builder()
     * .fileName("fileName")
     * .build())
     * .stringValue("stringValue")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotanalytics-dataset-variable.html)
     */
    public inline fun cfnDatasetVariableProperty(
        block: CfnDatasetVariablePropertyDsl.() -> Unit = {}
    ): CfnDataset.VariableProperty {
        val builder = CfnDatasetVariablePropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Information about the versioning of dataset contents.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.iotanalytics.*;
     * VersioningConfigurationProperty versioningConfigurationProperty =
     * VersioningConfigurationProperty.builder()
     * .maxVersions(123)
     * .unlimited(false)
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotanalytics-dataset-versioningconfiguration.html)
     */
    public inline fun cfnDatasetVersioningConfigurationProperty(
        block: CfnDatasetVersioningConfigurationPropertyDsl.() -> Unit = {}
    ): CfnDataset.VersioningConfigurationProperty {
        val builder = CfnDatasetVersioningConfigurationPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * AWS::IoTAnalytics::Datastore resource is a repository for messages.
     *
     * For more information, see
     * [How to Use AWS IoT Analytics](https://docs.aws.amazon.com/iotanalytics/latest/userguide/welcome.html#aws-iot-analytics-how)
     * in the *AWS IoT Analytics User Guide* .
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.iotanalytics.*;
     * Object jsonConfiguration;
     * Object serviceManagedS3;
     * CfnDatastore cfnDatastore = CfnDatastore.Builder.create(this, "MyCfnDatastore")
     * .datastoreName("datastoreName")
     * .datastorePartitions(DatastorePartitionsProperty.builder()
     * .partitions(List.of(DatastorePartitionProperty.builder()
     * .partition(PartitionProperty.builder()
     * .attributeName("attributeName")
     * .build())
     * .timestampPartition(TimestampPartitionProperty.builder()
     * .attributeName("attributeName")
     * // the properties below are optional
     * .timestampFormat("timestampFormat")
     * .build())
     * .build()))
     * .build())
     * .datastoreStorage(DatastoreStorageProperty.builder()
     * .customerManagedS3(CustomerManagedS3Property.builder()
     * .bucket("bucket")
     * .roleArn("roleArn")
     * // the properties below are optional
     * .keyPrefix("keyPrefix")
     * .build())
     * .iotSiteWiseMultiLayerStorage(IotSiteWiseMultiLayerStorageProperty.builder()
     * .customerManagedS3Storage(CustomerManagedS3StorageProperty.builder()
     * .bucket("bucket")
     * // the properties below are optional
     * .keyPrefix("keyPrefix")
     * .build())
     * .build())
     * .serviceManagedS3(serviceManagedS3)
     * .build())
     * .fileFormatConfiguration(FileFormatConfigurationProperty.builder()
     * .jsonConfiguration(jsonConfiguration)
     * .parquetConfiguration(ParquetConfigurationProperty.builder()
     * .schemaDefinition(SchemaDefinitionProperty.builder()
     * .columns(List.of(ColumnProperty.builder()
     * .name("name")
     * .type("type")
     * .build()))
     * .build())
     * .build())
     * .build())
     * .retentionPeriod(RetentionPeriodProperty.builder()
     * .numberOfDays(123)
     * .unlimited(false)
     * .build())
     * .tags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotanalytics-datastore.html)
     */
    public inline fun cfnDatastore(
        scope: Construct,
        id: String,
        block: CfnDatastoreDsl.() -> Unit = {},
    ): CfnDatastore {
        val builder = CfnDatastoreDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Contains information about a column that stores your data.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.iotanalytics.*;
     * ColumnProperty columnProperty = ColumnProperty.builder()
     * .name("name")
     * .type("type")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotanalytics-datastore-column.html)
     */
    public inline fun cfnDatastoreColumnProperty(
        block: CfnDatastoreColumnPropertyDsl.() -> Unit = {}
    ): CfnDatastore.ColumnProperty {
        val builder = CfnDatastoreColumnPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * S3-customer-managed;
     *
     * When you choose customer-managed storage, the `retentionPeriod` parameter is ignored. You
     * can't change the choice of Amazon S3 storage after your data store is created.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.iotanalytics.*;
     * CustomerManagedS3Property customerManagedS3Property = CustomerManagedS3Property.builder()
     * .bucket("bucket")
     * .roleArn("roleArn")
     * // the properties below are optional
     * .keyPrefix("keyPrefix")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotanalytics-datastore-customermanageds3.html)
     */
    public inline fun cfnDatastoreCustomerManagedS3Property(
        block: CfnDatastoreCustomerManagedS3PropertyDsl.() -> Unit = {}
    ): CfnDatastore.CustomerManagedS3Property {
        val builder = CfnDatastoreCustomerManagedS3PropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Amazon S3 -customer-managed;
     *
     * When you choose customer-managed storage, the `retentionPeriod` parameter is ignored. You
     * can't change the choice of Amazon S3 storage after your data store is created.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.iotanalytics.*;
     * CustomerManagedS3StorageProperty customerManagedS3StorageProperty =
     * CustomerManagedS3StorageProperty.builder()
     * .bucket("bucket")
     * // the properties below are optional
     * .keyPrefix("keyPrefix")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotanalytics-datastore-customermanageds3storage.html)
     */
    public inline fun cfnDatastoreCustomerManagedS3StorageProperty(
        block: CfnDatastoreCustomerManagedS3StoragePropertyDsl.() -> Unit = {}
    ): CfnDatastore.CustomerManagedS3StorageProperty {
        val builder = CfnDatastoreCustomerManagedS3StoragePropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * A single dimension to partition a data store.
     *
     * The dimension must be an `AttributePartition` or a `TimestampPartition` .
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.iotanalytics.*;
     * DatastorePartitionProperty datastorePartitionProperty = DatastorePartitionProperty.builder()
     * .partition(PartitionProperty.builder()
     * .attributeName("attributeName")
     * .build())
     * .timestampPartition(TimestampPartitionProperty.builder()
     * .attributeName("attributeName")
     * // the properties below are optional
     * .timestampFormat("timestampFormat")
     * .build())
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotanalytics-datastore-datastorepartition.html)
     */
    public inline fun cfnDatastoreDatastorePartitionProperty(
        block: CfnDatastoreDatastorePartitionPropertyDsl.() -> Unit = {}
    ): CfnDatastore.DatastorePartitionProperty {
        val builder = CfnDatastoreDatastorePartitionPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Information about the partition dimensions in a data store.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.iotanalytics.*;
     * DatastorePartitionsProperty datastorePartitionsProperty = DatastorePartitionsProperty.builder()
     * .partitions(List.of(DatastorePartitionProperty.builder()
     * .partition(PartitionProperty.builder()
     * .attributeName("attributeName")
     * .build())
     * .timestampPartition(TimestampPartitionProperty.builder()
     * .attributeName("attributeName")
     * // the properties below are optional
     * .timestampFormat("timestampFormat")
     * .build())
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotanalytics-datastore-datastorepartitions.html)
     */
    public inline fun cfnDatastoreDatastorePartitionsProperty(
        block: CfnDatastoreDatastorePartitionsPropertyDsl.() -> Unit = {}
    ): CfnDatastore.DatastorePartitionsProperty {
        val builder = CfnDatastoreDatastorePartitionsPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Where data store data is stored.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.iotanalytics.*;
     * Object serviceManagedS3;
     * DatastoreStorageProperty datastoreStorageProperty = DatastoreStorageProperty.builder()
     * .customerManagedS3(CustomerManagedS3Property.builder()
     * .bucket("bucket")
     * .roleArn("roleArn")
     * // the properties below are optional
     * .keyPrefix("keyPrefix")
     * .build())
     * .iotSiteWiseMultiLayerStorage(IotSiteWiseMultiLayerStorageProperty.builder()
     * .customerManagedS3Storage(CustomerManagedS3StorageProperty.builder()
     * .bucket("bucket")
     * // the properties below are optional
     * .keyPrefix("keyPrefix")
     * .build())
     * .build())
     * .serviceManagedS3(serviceManagedS3)
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotanalytics-datastore-datastorestorage.html)
     */
    public inline fun cfnDatastoreDatastoreStorageProperty(
        block: CfnDatastoreDatastoreStoragePropertyDsl.() -> Unit = {}
    ): CfnDatastore.DatastoreStorageProperty {
        val builder = CfnDatastoreDatastoreStoragePropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Contains the configuration information of file formats. AWS IoT Analytics data stores support
     * JSON and [Parquet](https://docs.aws.amazon.com/https://parquet.apache.org/) .
     *
     * The default file format is JSON. You can specify only one format.
     *
     * You can't change the file format after you create the data store.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.iotanalytics.*;
     * Object jsonConfiguration;
     * FileFormatConfigurationProperty fileFormatConfigurationProperty =
     * FileFormatConfigurationProperty.builder()
     * .jsonConfiguration(jsonConfiguration)
     * .parquetConfiguration(ParquetConfigurationProperty.builder()
     * .schemaDefinition(SchemaDefinitionProperty.builder()
     * .columns(List.of(ColumnProperty.builder()
     * .name("name")
     * .type("type")
     * .build()))
     * .build())
     * .build())
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotanalytics-datastore-fileformatconfiguration.html)
     */
    public inline fun cfnDatastoreFileFormatConfigurationProperty(
        block: CfnDatastoreFileFormatConfigurationPropertyDsl.() -> Unit = {}
    ): CfnDatastore.FileFormatConfigurationProperty {
        val builder = CfnDatastoreFileFormatConfigurationPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Stores data used by AWS IoT SiteWise in an Amazon S3 bucket that you manage.
     *
     * You can't change the choice of Amazon S3 storage after your data store is created.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.iotanalytics.*;
     * IotSiteWiseMultiLayerStorageProperty iotSiteWiseMultiLayerStorageProperty =
     * IotSiteWiseMultiLayerStorageProperty.builder()
     * .customerManagedS3Storage(CustomerManagedS3StorageProperty.builder()
     * .bucket("bucket")
     * // the properties below are optional
     * .keyPrefix("keyPrefix")
     * .build())
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotanalytics-datastore-iotsitewisemultilayerstorage.html)
     */
    public inline fun cfnDatastoreIotSiteWiseMultiLayerStorageProperty(
        block: CfnDatastoreIotSiteWiseMultiLayerStoragePropertyDsl.() -> Unit = {}
    ): CfnDatastore.IotSiteWiseMultiLayerStorageProperty {
        val builder = CfnDatastoreIotSiteWiseMultiLayerStoragePropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Contains the configuration information of the Parquet format.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.iotanalytics.*;
     * ParquetConfigurationProperty parquetConfigurationProperty =
     * ParquetConfigurationProperty.builder()
     * .schemaDefinition(SchemaDefinitionProperty.builder()
     * .columns(List.of(ColumnProperty.builder()
     * .name("name")
     * .type("type")
     * .build()))
     * .build())
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotanalytics-datastore-parquetconfiguration.html)
     */
    public inline fun cfnDatastoreParquetConfigurationProperty(
        block: CfnDatastoreParquetConfigurationPropertyDsl.() -> Unit = {}
    ): CfnDatastore.ParquetConfigurationProperty {
        val builder = CfnDatastoreParquetConfigurationPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * A single dimension to partition a data store.
     *
     * The dimension must be an `AttributePartition` or a `TimestampPartition` .
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.iotanalytics.*;
     * PartitionProperty partitionProperty = PartitionProperty.builder()
     * .attributeName("attributeName")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotanalytics-datastore-partition.html)
     */
    public inline fun cfnDatastorePartitionProperty(
        block: CfnDatastorePartitionPropertyDsl.() -> Unit = {}
    ): CfnDatastore.PartitionProperty {
        val builder = CfnDatastorePartitionPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnDatastore`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.iotanalytics.*;
     * Object jsonConfiguration;
     * Object serviceManagedS3;
     * CfnDatastoreProps cfnDatastoreProps = CfnDatastoreProps.builder()
     * .datastoreName("datastoreName")
     * .datastorePartitions(DatastorePartitionsProperty.builder()
     * .partitions(List.of(DatastorePartitionProperty.builder()
     * .partition(PartitionProperty.builder()
     * .attributeName("attributeName")
     * .build())
     * .timestampPartition(TimestampPartitionProperty.builder()
     * .attributeName("attributeName")
     * // the properties below are optional
     * .timestampFormat("timestampFormat")
     * .build())
     * .build()))
     * .build())
     * .datastoreStorage(DatastoreStorageProperty.builder()
     * .customerManagedS3(CustomerManagedS3Property.builder()
     * .bucket("bucket")
     * .roleArn("roleArn")
     * // the properties below are optional
     * .keyPrefix("keyPrefix")
     * .build())
     * .iotSiteWiseMultiLayerStorage(IotSiteWiseMultiLayerStorageProperty.builder()
     * .customerManagedS3Storage(CustomerManagedS3StorageProperty.builder()
     * .bucket("bucket")
     * // the properties below are optional
     * .keyPrefix("keyPrefix")
     * .build())
     * .build())
     * .serviceManagedS3(serviceManagedS3)
     * .build())
     * .fileFormatConfiguration(FileFormatConfigurationProperty.builder()
     * .jsonConfiguration(jsonConfiguration)
     * .parquetConfiguration(ParquetConfigurationProperty.builder()
     * .schemaDefinition(SchemaDefinitionProperty.builder()
     * .columns(List.of(ColumnProperty.builder()
     * .name("name")
     * .type("type")
     * .build()))
     * .build())
     * .build())
     * .build())
     * .retentionPeriod(RetentionPeriodProperty.builder()
     * .numberOfDays(123)
     * .unlimited(false)
     * .build())
     * .tags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotanalytics-datastore.html)
     */
    public inline fun cfnDatastoreProps(
        block: CfnDatastorePropsDsl.() -> Unit = {}
    ): CfnDatastoreProps {
        val builder = CfnDatastorePropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * How long, in days, message data is kept.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.iotanalytics.*;
     * RetentionPeriodProperty retentionPeriodProperty = RetentionPeriodProperty.builder()
     * .numberOfDays(123)
     * .unlimited(false)
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotanalytics-datastore-retentionperiod.html)
     */
    public inline fun cfnDatastoreRetentionPeriodProperty(
        block: CfnDatastoreRetentionPeriodPropertyDsl.() -> Unit = {}
    ): CfnDatastore.RetentionPeriodProperty {
        val builder = CfnDatastoreRetentionPeriodPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Information needed to define a schema.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.iotanalytics.*;
     * SchemaDefinitionProperty schemaDefinitionProperty = SchemaDefinitionProperty.builder()
     * .columns(List.of(ColumnProperty.builder()
     * .name("name")
     * .type("type")
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotanalytics-datastore-schemadefinition.html)
     */
    public inline fun cfnDatastoreSchemaDefinitionProperty(
        block: CfnDatastoreSchemaDefinitionPropertyDsl.() -> Unit = {}
    ): CfnDatastore.SchemaDefinitionProperty {
        val builder = CfnDatastoreSchemaDefinitionPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * A partition dimension defined by a timestamp attribute.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.iotanalytics.*;
     * TimestampPartitionProperty timestampPartitionProperty = TimestampPartitionProperty.builder()
     * .attributeName("attributeName")
     * // the properties below are optional
     * .timestampFormat("timestampFormat")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotanalytics-datastore-timestamppartition.html)
     */
    public inline fun cfnDatastoreTimestampPartitionProperty(
        block: CfnDatastoreTimestampPartitionPropertyDsl.() -> Unit = {}
    ): CfnDatastore.TimestampPartitionProperty {
        val builder = CfnDatastoreTimestampPartitionPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The AWS::IoTAnalytics::Pipeline resource consumes messages from one or more channels and
     * allows you to process the messages before storing them in a data store.
     *
     * You must specify both a `channel` and a `datastore` activity and, optionally, as many as 23
     * additional activities in the `pipelineActivities` array. For more information, see
     * [How to Use AWS IoT Analytics](https://docs.aws.amazon.com/iotanalytics/latest/userguide/welcome.html#aws-iot-analytics-how)
     * in the *AWS IoT Analytics User Guide* .
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.iotanalytics.*;
     * CfnPipeline cfnPipeline = CfnPipeline.Builder.create(this, "MyCfnPipeline")
     * .pipelineActivities(List.of(ActivityProperty.builder()
     * .addAttributes(AddAttributesProperty.builder()
     * .attributes(Map.of(
     * "attributesKey", "attributes"))
     * .name("name")
     * // the properties below are optional
     * .next("next")
     * .build())
     * .channel(ChannelProperty.builder()
     * .channelName("channelName")
     * .name("name")
     * // the properties below are optional
     * .next("next")
     * .build())
     * .datastore(DatastoreProperty.builder()
     * .datastoreName("datastoreName")
     * .name("name")
     * .build())
     * .deviceRegistryEnrich(DeviceRegistryEnrichProperty.builder()
     * .attribute("attribute")
     * .name("name")
     * .roleArn("roleArn")
     * .thingName("thingName")
     * // the properties below are optional
     * .next("next")
     * .build())
     * .deviceShadowEnrich(DeviceShadowEnrichProperty.builder()
     * .attribute("attribute")
     * .name("name")
     * .roleArn("roleArn")
     * .thingName("thingName")
     * // the properties below are optional
     * .next("next")
     * .build())
     * .filter(FilterProperty.builder()
     * .filter("filter")
     * .name("name")
     * // the properties below are optional
     * .next("next")
     * .build())
     * .lambda(LambdaProperty.builder()
     * .batchSize(123)
     * .lambdaName("lambdaName")
     * .name("name")
     * // the properties below are optional
     * .next("next")
     * .build())
     * .math(MathProperty.builder()
     * .attribute("attribute")
     * .math("math")
     * .name("name")
     * // the properties below are optional
     * .next("next")
     * .build())
     * .removeAttributes(RemoveAttributesProperty.builder()
     * .attributes(List.of("attributes"))
     * .name("name")
     * // the properties below are optional
     * .next("next")
     * .build())
     * .selectAttributes(SelectAttributesProperty.builder()
     * .attributes(List.of("attributes"))
     * .name("name")
     * // the properties below are optional
     * .next("next")
     * .build())
     * .build()))
     * // the properties below are optional
     * .pipelineName("pipelineName")
     * .tags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotanalytics-pipeline.html)
     */
    public inline fun cfnPipeline(
        scope: Construct,
        id: String,
        block: CfnPipelineDsl.() -> Unit = {},
    ): CfnPipeline {
        val builder = CfnPipelineDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * An activity that performs a transformation on a message.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.iotanalytics.*;
     * ActivityProperty activityProperty = ActivityProperty.builder()
     * .addAttributes(AddAttributesProperty.builder()
     * .attributes(Map.of(
     * "attributesKey", "attributes"))
     * .name("name")
     * // the properties below are optional
     * .next("next")
     * .build())
     * .channel(ChannelProperty.builder()
     * .channelName("channelName")
     * .name("name")
     * // the properties below are optional
     * .next("next")
     * .build())
     * .datastore(DatastoreProperty.builder()
     * .datastoreName("datastoreName")
     * .name("name")
     * .build())
     * .deviceRegistryEnrich(DeviceRegistryEnrichProperty.builder()
     * .attribute("attribute")
     * .name("name")
     * .roleArn("roleArn")
     * .thingName("thingName")
     * // the properties below are optional
     * .next("next")
     * .build())
     * .deviceShadowEnrich(DeviceShadowEnrichProperty.builder()
     * .attribute("attribute")
     * .name("name")
     * .roleArn("roleArn")
     * .thingName("thingName")
     * // the properties below are optional
     * .next("next")
     * .build())
     * .filter(FilterProperty.builder()
     * .filter("filter")
     * .name("name")
     * // the properties below are optional
     * .next("next")
     * .build())
     * .lambda(LambdaProperty.builder()
     * .batchSize(123)
     * .lambdaName("lambdaName")
     * .name("name")
     * // the properties below are optional
     * .next("next")
     * .build())
     * .math(MathProperty.builder()
     * .attribute("attribute")
     * .math("math")
     * .name("name")
     * // the properties below are optional
     * .next("next")
     * .build())
     * .removeAttributes(RemoveAttributesProperty.builder()
     * .attributes(List.of("attributes"))
     * .name("name")
     * // the properties below are optional
     * .next("next")
     * .build())
     * .selectAttributes(SelectAttributesProperty.builder()
     * .attributes(List.of("attributes"))
     * .name("name")
     * // the properties below are optional
     * .next("next")
     * .build())
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotanalytics-pipeline-activity.html)
     */
    public inline fun cfnPipelineActivityProperty(
        block: CfnPipelineActivityPropertyDsl.() -> Unit = {}
    ): CfnPipeline.ActivityProperty {
        val builder = CfnPipelineActivityPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * An activity that adds other attributes based on existing attributes in the message.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.iotanalytics.*;
     * AddAttributesProperty addAttributesProperty = AddAttributesProperty.builder()
     * .attributes(Map.of(
     * "attributesKey", "attributes"))
     * .name("name")
     * // the properties below are optional
     * .next("next")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotanalytics-pipeline-addattributes.html)
     */
    public inline fun cfnPipelineAddAttributesProperty(
        block: CfnPipelineAddAttributesPropertyDsl.() -> Unit = {}
    ): CfnPipeline.AddAttributesProperty {
        val builder = CfnPipelineAddAttributesPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Determines the source of the messages to be processed.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.iotanalytics.*;
     * ChannelProperty channelProperty = ChannelProperty.builder()
     * .channelName("channelName")
     * .name("name")
     * // the properties below are optional
     * .next("next")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotanalytics-pipeline-channel.html)
     */
    public inline fun cfnPipelineChannelProperty(
        block: CfnPipelineChannelPropertyDsl.() -> Unit = {}
    ): CfnPipeline.ChannelProperty {
        val builder = CfnPipelineChannelPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The datastore activity that specifies where to store the processed data.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.iotanalytics.*;
     * DatastoreProperty datastoreProperty = DatastoreProperty.builder()
     * .datastoreName("datastoreName")
     * .name("name")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotanalytics-pipeline-datastore.html)
     */
    public inline fun cfnPipelineDatastoreProperty(
        block: CfnPipelineDatastorePropertyDsl.() -> Unit = {}
    ): CfnPipeline.DatastoreProperty {
        val builder = CfnPipelineDatastorePropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * An activity that adds data from the AWS IoT device registry to your message.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.iotanalytics.*;
     * DeviceRegistryEnrichProperty deviceRegistryEnrichProperty =
     * DeviceRegistryEnrichProperty.builder()
     * .attribute("attribute")
     * .name("name")
     * .roleArn("roleArn")
     * .thingName("thingName")
     * // the properties below are optional
     * .next("next")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotanalytics-pipeline-deviceregistryenrich.html)
     */
    public inline fun cfnPipelineDeviceRegistryEnrichProperty(
        block: CfnPipelineDeviceRegistryEnrichPropertyDsl.() -> Unit = {}
    ): CfnPipeline.DeviceRegistryEnrichProperty {
        val builder = CfnPipelineDeviceRegistryEnrichPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * An activity that adds information from the AWS IoT Device Shadows service to a message.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.iotanalytics.*;
     * DeviceShadowEnrichProperty deviceShadowEnrichProperty = DeviceShadowEnrichProperty.builder()
     * .attribute("attribute")
     * .name("name")
     * .roleArn("roleArn")
     * .thingName("thingName")
     * // the properties below are optional
     * .next("next")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotanalytics-pipeline-deviceshadowenrich.html)
     */
    public inline fun cfnPipelineDeviceShadowEnrichProperty(
        block: CfnPipelineDeviceShadowEnrichPropertyDsl.() -> Unit = {}
    ): CfnPipeline.DeviceShadowEnrichProperty {
        val builder = CfnPipelineDeviceShadowEnrichPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * An activity that filters a message based on its attributes.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.iotanalytics.*;
     * FilterProperty filterProperty = FilterProperty.builder()
     * .filter("filter")
     * .name("name")
     * // the properties below are optional
     * .next("next")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotanalytics-pipeline-filter.html)
     */
    public inline fun cfnPipelineFilterProperty(
        block: CfnPipelineFilterPropertyDsl.() -> Unit = {}
    ): CfnPipeline.FilterProperty {
        val builder = CfnPipelineFilterPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * An activity that runs a Lambda function to modify the message.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.iotanalytics.*;
     * LambdaProperty lambdaProperty = LambdaProperty.builder()
     * .batchSize(123)
     * .lambdaName("lambdaName")
     * .name("name")
     * // the properties below are optional
     * .next("next")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotanalytics-pipeline-lambda.html)
     */
    public inline fun cfnPipelineLambdaProperty(
        block: CfnPipelineLambdaPropertyDsl.() -> Unit = {}
    ): CfnPipeline.LambdaProperty {
        val builder = CfnPipelineLambdaPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * An activity that computes an arithmetic expression using the message's attributes.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.iotanalytics.*;
     * MathProperty mathProperty = MathProperty.builder()
     * .attribute("attribute")
     * .math("math")
     * .name("name")
     * // the properties below are optional
     * .next("next")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotanalytics-pipeline-math.html)
     */
    public inline fun cfnPipelineMathProperty(
        block: CfnPipelineMathPropertyDsl.() -> Unit = {}
    ): CfnPipeline.MathProperty {
        val builder = CfnPipelineMathPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnPipeline`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.iotanalytics.*;
     * CfnPipelineProps cfnPipelineProps = CfnPipelineProps.builder()
     * .pipelineActivities(List.of(ActivityProperty.builder()
     * .addAttributes(AddAttributesProperty.builder()
     * .attributes(Map.of(
     * "attributesKey", "attributes"))
     * .name("name")
     * // the properties below are optional
     * .next("next")
     * .build())
     * .channel(ChannelProperty.builder()
     * .channelName("channelName")
     * .name("name")
     * // the properties below are optional
     * .next("next")
     * .build())
     * .datastore(DatastoreProperty.builder()
     * .datastoreName("datastoreName")
     * .name("name")
     * .build())
     * .deviceRegistryEnrich(DeviceRegistryEnrichProperty.builder()
     * .attribute("attribute")
     * .name("name")
     * .roleArn("roleArn")
     * .thingName("thingName")
     * // the properties below are optional
     * .next("next")
     * .build())
     * .deviceShadowEnrich(DeviceShadowEnrichProperty.builder()
     * .attribute("attribute")
     * .name("name")
     * .roleArn("roleArn")
     * .thingName("thingName")
     * // the properties below are optional
     * .next("next")
     * .build())
     * .filter(FilterProperty.builder()
     * .filter("filter")
     * .name("name")
     * // the properties below are optional
     * .next("next")
     * .build())
     * .lambda(LambdaProperty.builder()
     * .batchSize(123)
     * .lambdaName("lambdaName")
     * .name("name")
     * // the properties below are optional
     * .next("next")
     * .build())
     * .math(MathProperty.builder()
     * .attribute("attribute")
     * .math("math")
     * .name("name")
     * // the properties below are optional
     * .next("next")
     * .build())
     * .removeAttributes(RemoveAttributesProperty.builder()
     * .attributes(List.of("attributes"))
     * .name("name")
     * // the properties below are optional
     * .next("next")
     * .build())
     * .selectAttributes(SelectAttributesProperty.builder()
     * .attributes(List.of("attributes"))
     * .name("name")
     * // the properties below are optional
     * .next("next")
     * .build())
     * .build()))
     * // the properties below are optional
     * .pipelineName("pipelineName")
     * .tags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotanalytics-pipeline.html)
     */
    public inline fun cfnPipelineProps(
        block: CfnPipelinePropsDsl.() -> Unit = {}
    ): CfnPipelineProps {
        val builder = CfnPipelinePropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * An activity that removes attributes from a message.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.iotanalytics.*;
     * RemoveAttributesProperty removeAttributesProperty = RemoveAttributesProperty.builder()
     * .attributes(List.of("attributes"))
     * .name("name")
     * // the properties below are optional
     * .next("next")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotanalytics-pipeline-removeattributes.html)
     */
    public inline fun cfnPipelineRemoveAttributesProperty(
        block: CfnPipelineRemoveAttributesPropertyDsl.() -> Unit = {}
    ): CfnPipeline.RemoveAttributesProperty {
        val builder = CfnPipelineRemoveAttributesPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Creates a new message using only the specified attributes from the original message.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.iotanalytics.*;
     * SelectAttributesProperty selectAttributesProperty = SelectAttributesProperty.builder()
     * .attributes(List.of("attributes"))
     * .name("name")
     * // the properties below are optional
     * .next("next")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotanalytics-pipeline-selectattributes.html)
     */
    public inline fun cfnPipelineSelectAttributesProperty(
        block: CfnPipelineSelectAttributesPropertyDsl.() -> Unit = {}
    ): CfnPipeline.SelectAttributesProperty {
        val builder = CfnPipelineSelectAttributesPropertyDsl()
        builder.apply(block)
        return builder.build()
    }
}
