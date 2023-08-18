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

package io.cloudshiftdev.awscdkdsl.services.iotanalytics

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.iotanalytics.CfnDataset

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
@CdkDslMarker
public class CfnDatasetDatasetContentDeliveryRuleDestinationPropertyDsl {
    private val cdkBuilder: CfnDataset.DatasetContentDeliveryRuleDestinationProperty.Builder =
        CfnDataset.DatasetContentDeliveryRuleDestinationProperty.builder()

    /**
     * @param iotEventsDestinationConfiguration Configuration information for delivery of dataset
     *   contents to AWS IoT Events .
     */
    public fun iotEventsDestinationConfiguration(iotEventsDestinationConfiguration: IResolvable) {
        cdkBuilder.iotEventsDestinationConfiguration(iotEventsDestinationConfiguration)
    }

    /**
     * @param iotEventsDestinationConfiguration Configuration information for delivery of dataset
     *   contents to AWS IoT Events .
     */
    public fun iotEventsDestinationConfiguration(
        iotEventsDestinationConfiguration: CfnDataset.IotEventsDestinationConfigurationProperty
    ) {
        cdkBuilder.iotEventsDestinationConfiguration(iotEventsDestinationConfiguration)
    }

    /**
     * @param s3DestinationConfiguration Configuration information for delivery of dataset contents
     *   to Amazon S3.
     */
    public fun s3DestinationConfiguration(s3DestinationConfiguration: IResolvable) {
        cdkBuilder.s3DestinationConfiguration(s3DestinationConfiguration)
    }

    /**
     * @param s3DestinationConfiguration Configuration information for delivery of dataset contents
     *   to Amazon S3.
     */
    public fun s3DestinationConfiguration(
        s3DestinationConfiguration: CfnDataset.S3DestinationConfigurationProperty
    ) {
        cdkBuilder.s3DestinationConfiguration(s3DestinationConfiguration)
    }

    public fun build(): CfnDataset.DatasetContentDeliveryRuleDestinationProperty =
        cdkBuilder.build()
}
