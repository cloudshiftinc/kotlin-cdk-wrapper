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
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.iotanalytics.CfnDataset

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
@CdkDslMarker
public class CfnDatasetDatasetContentDeliveryRulePropertyDsl {
    private val cdkBuilder: CfnDataset.DatasetContentDeliveryRuleProperty.Builder =
        CfnDataset.DatasetContentDeliveryRuleProperty.builder()

    /** @param destination The destination to which dataset contents are delivered. */
    public fun destination(destination: IResolvable) {
        cdkBuilder.destination(destination)
    }

    /** @param destination The destination to which dataset contents are delivered. */
    public fun destination(destination: CfnDataset.DatasetContentDeliveryRuleDestinationProperty) {
        cdkBuilder.destination(destination)
    }

    /** @param entryName The name of the dataset content delivery rules entry. */
    public fun entryName(entryName: String) {
        cdkBuilder.entryName(entryName)
    }

    public fun build(): CfnDataset.DatasetContentDeliveryRuleProperty = cdkBuilder.build()
}
