@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.iotanalytics

import kotlin.Unit
import software.amazon.awscdk.services.iotanalytics.CfnChannel
import software.amazon.awscdk.services.iotanalytics.CfnDataset
import software.amazon.awscdk.services.iotanalytics.CfnDatastore

public inline fun CfnChannel.setChannelStorage(block: CfnChannelChannelStoragePropertyDsl.() -> Unit
    = {}) {
  val builder = CfnChannelChannelStoragePropertyDsl()
  builder.apply(block)
  return setChannelStorage(builder.build())
}

public inline
    fun CfnChannel.setRetentionPeriod(block: CfnChannelRetentionPeriodPropertyDsl.() -> Unit = {}) {
  val builder = CfnChannelRetentionPeriodPropertyDsl()
  builder.apply(block)
  return setRetentionPeriod(builder.build())
}

public inline
    fun CfnDataset.setRetentionPeriod(block: CfnDatasetRetentionPeriodPropertyDsl.() -> Unit = {}) {
  val builder = CfnDatasetRetentionPeriodPropertyDsl()
  builder.apply(block)
  return setRetentionPeriod(builder.build())
}

public inline
    fun CfnDataset.setVersioningConfiguration(block: CfnDatasetVersioningConfigurationPropertyDsl.() -> Unit
    = {}) {
  val builder = CfnDatasetVersioningConfigurationPropertyDsl()
  builder.apply(block)
  return setVersioningConfiguration(builder.build())
}

public inline
    fun CfnDatastore.setDatastorePartitions(block: CfnDatastoreDatastorePartitionsPropertyDsl.() -> Unit
    = {}) {
  val builder = CfnDatastoreDatastorePartitionsPropertyDsl()
  builder.apply(block)
  return setDatastorePartitions(builder.build())
}

public inline
    fun CfnDatastore.setDatastoreStorage(block: CfnDatastoreDatastoreStoragePropertyDsl.() -> Unit =
    {}) {
  val builder = CfnDatastoreDatastoreStoragePropertyDsl()
  builder.apply(block)
  return setDatastoreStorage(builder.build())
}

public inline
    fun CfnDatastore.setFileFormatConfiguration(block: CfnDatastoreFileFormatConfigurationPropertyDsl.() -> Unit
    = {}) {
  val builder = CfnDatastoreFileFormatConfigurationPropertyDsl()
  builder.apply(block)
  return setFileFormatConfiguration(builder.build())
}

public inline
    fun CfnDatastore.setRetentionPeriod(block: CfnDatastoreRetentionPeriodPropertyDsl.() -> Unit =
    {}) {
  val builder = CfnDatastoreRetentionPeriodPropertyDsl()
  builder.apply(block)
  return setRetentionPeriod(builder.build())
}
