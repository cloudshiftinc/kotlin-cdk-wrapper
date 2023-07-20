@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.kinesisanalytics

import kotlin.Unit
import software.amazon.awscdk.services.kinesisanalytics.CfnApplicationCloudWatchLoggingOptionV2
import software.amazon.awscdk.services.kinesisanalytics.CfnApplicationOutput
import software.amazon.awscdk.services.kinesisanalytics.CfnApplicationOutputV2
import software.amazon.awscdk.services.kinesisanalytics.CfnApplicationReferenceDataSource
import software.amazon.awscdk.services.kinesisanalytics.CfnApplicationReferenceDataSourceV2
import software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2

public inline
    fun CfnApplicationReferenceDataSource.setReferenceDataSource(block: CfnApplicationReferenceDataSourceReferenceDataSourcePropertyDsl.() -> Unit
    = {}) {
  val builder = CfnApplicationReferenceDataSourceReferenceDataSourcePropertyDsl()
  builder.apply(block)
  return setReferenceDataSource(builder.build())
}

public inline
    fun CfnApplicationCloudWatchLoggingOptionV2.setCloudWatchLoggingOption(block: CfnApplicationCloudWatchLoggingOptionV2CloudWatchLoggingOptionPropertyDsl.() -> Unit
    = {}) {
  val builder = CfnApplicationCloudWatchLoggingOptionV2CloudWatchLoggingOptionPropertyDsl()
  builder.apply(block)
  return setCloudWatchLoggingOption(builder.build())
}

public inline
    fun CfnApplicationV2.setApplicationConfiguration(block: CfnApplicationV2ApplicationConfigurationPropertyDsl.() -> Unit
    = {}) {
  val builder = CfnApplicationV2ApplicationConfigurationPropertyDsl()
  builder.apply(block)
  return setApplicationConfiguration(builder.build())
}

public inline
    fun CfnApplicationV2.setApplicationMaintenanceConfiguration(block: CfnApplicationV2ApplicationMaintenanceConfigurationPropertyDsl.() -> Unit
    = {}) {
  val builder = CfnApplicationV2ApplicationMaintenanceConfigurationPropertyDsl()
  builder.apply(block)
  return setApplicationMaintenanceConfiguration(builder.build())
}

public inline
    fun CfnApplicationV2.setRunConfiguration(block: CfnApplicationV2RunConfigurationPropertyDsl.() -> Unit
    = {}) {
  val builder = CfnApplicationV2RunConfigurationPropertyDsl()
  builder.apply(block)
  return setRunConfiguration(builder.build())
}

public inline
    fun CfnApplicationOutput.setOutput(block: CfnApplicationOutputOutputPropertyDsl.() -> Unit =
    {}) {
  val builder = CfnApplicationOutputOutputPropertyDsl()
  builder.apply(block)
  return setOutput(builder.build())
}

public inline
    fun CfnApplicationReferenceDataSourceV2.setReferenceDataSource(block: CfnApplicationReferenceDataSourceV2ReferenceDataSourcePropertyDsl.() -> Unit
    = {}) {
  val builder = CfnApplicationReferenceDataSourceV2ReferenceDataSourcePropertyDsl()
  builder.apply(block)
  return setReferenceDataSource(builder.build())
}

public inline
    fun CfnApplicationOutputV2.setOutput(block: CfnApplicationOutputV2OutputPropertyDsl.() -> Unit =
    {}) {
  val builder = CfnApplicationOutputV2OutputPropertyDsl()
  builder.apply(block)
  return setOutput(builder.build())
}
