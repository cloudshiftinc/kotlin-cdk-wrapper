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

import kotlin.Unit
import software.amazon.awscdk.services.iotanalytics.CfnChannel
import software.amazon.awscdk.services.iotanalytics.CfnDataset
import software.amazon.awscdk.services.iotanalytics.CfnDatastore

/** Optional. */
public inline fun CfnDataset.setRetentionPeriod(
    block: CfnDatasetRetentionPeriodPropertyDsl.() -> Unit = {}
) {
    val builder = CfnDatasetRetentionPeriodPropertyDsl()
    builder.apply(block)
    return setRetentionPeriod(builder.build())
}

/** Optional. */
public inline fun CfnDataset.setVersioningConfiguration(
    block: CfnDatasetVersioningConfigurationPropertyDsl.() -> Unit = {}
) {
    val builder = CfnDatasetVersioningConfigurationPropertyDsl()
    builder.apply(block)
    return setVersioningConfiguration(builder.build())
}

/** Information about the partition dimensions in a data store. */
public inline fun CfnDatastore.setDatastorePartitions(
    block: CfnDatastoreDatastorePartitionsPropertyDsl.() -> Unit = {}
) {
    val builder = CfnDatastoreDatastorePartitionsPropertyDsl()
    builder.apply(block)
    return setDatastorePartitions(builder.build())
}

/** Where data store data is stored. */
public inline fun CfnDatastore.setDatastoreStorage(
    block: CfnDatastoreDatastoreStoragePropertyDsl.() -> Unit = {}
) {
    val builder = CfnDatastoreDatastoreStoragePropertyDsl()
    builder.apply(block)
    return setDatastoreStorage(builder.build())
}

/**
 * Contains the configuration information of file formats.
 *
 * AWS IoT Analytics data stores support JSON and
 * [Parquet](https://docs.aws.amazon.com/https://parquet.apache.org/) .
 */
public inline fun CfnDatastore.setFileFormatConfiguration(
    block: CfnDatastoreFileFormatConfigurationPropertyDsl.() -> Unit = {}
) {
    val builder = CfnDatastoreFileFormatConfigurationPropertyDsl()
    builder.apply(block)
    return setFileFormatConfiguration(builder.build())
}

/** How long, in days, message data is kept for the data store. */
public inline fun CfnDatastore.setRetentionPeriod(
    block: CfnDatastoreRetentionPeriodPropertyDsl.() -> Unit = {}
) {
    val builder = CfnDatastoreRetentionPeriodPropertyDsl()
    builder.apply(block)
    return setRetentionPeriod(builder.build())
}

/** Where channel data is stored. */
public inline fun CfnChannel.setChannelStorage(
    block: CfnChannelChannelStoragePropertyDsl.() -> Unit = {}
) {
    val builder = CfnChannelChannelStoragePropertyDsl()
    builder.apply(block)
    return setChannelStorage(builder.build())
}

/** How long, in days, message data is kept for the channel. */
public inline fun CfnChannel.setRetentionPeriod(
    block: CfnChannelRetentionPeriodPropertyDsl.() -> Unit = {}
) {
    val builder = CfnChannelRetentionPeriodPropertyDsl()
    builder.apply(block)
    return setRetentionPeriod(builder.build())
}
