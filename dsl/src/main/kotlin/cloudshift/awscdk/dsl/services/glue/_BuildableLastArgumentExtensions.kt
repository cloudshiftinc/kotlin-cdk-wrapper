@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.glue

import kotlin.Unit
import software.amazon.awscdk.services.glue.CfnClassifier
import software.amazon.awscdk.services.glue.CfnConnection
import software.amazon.awscdk.services.glue.CfnCrawler
import software.amazon.awscdk.services.glue.CfnDataCatalogEncryptionSettings
import software.amazon.awscdk.services.glue.CfnDataQualityRuleset
import software.amazon.awscdk.services.glue.CfnDatabase
import software.amazon.awscdk.services.glue.CfnJob
import software.amazon.awscdk.services.glue.CfnMLTransform
import software.amazon.awscdk.services.glue.CfnPartition
import software.amazon.awscdk.services.glue.CfnSchema
import software.amazon.awscdk.services.glue.CfnSchemaVersion
import software.amazon.awscdk.services.glue.CfnSecurityConfiguration
import software.amazon.awscdk.services.glue.CfnTable
import software.amazon.awscdk.services.glue.CfnTrigger

public inline
    fun CfnSecurityConfiguration.setEncryptionConfiguration(block: CfnSecurityConfigurationEncryptionConfigurationPropertyDsl.() -> Unit
    = {}) {
  val builder = CfnSecurityConfigurationEncryptionConfigurationPropertyDsl()
  builder.apply(block)
  return setEncryptionConfiguration(builder.build())
}

public inline fun CfnCrawler.setTargets(block: CfnCrawlerTargetsPropertyDsl.() -> Unit = {}) {
  val builder = CfnCrawlerTargetsPropertyDsl()
  builder.apply(block)
  return setTargets(builder.build())
}

public inline fun CfnCrawler.setRecrawlPolicy(block: CfnCrawlerRecrawlPolicyPropertyDsl.() -> Unit =
    {}) {
  val builder = CfnCrawlerRecrawlPolicyPropertyDsl()
  builder.apply(block)
  return setRecrawlPolicy(builder.build())
}

public inline fun CfnCrawler.setSchedule(block: CfnCrawlerSchedulePropertyDsl.() -> Unit = {}) {
  val builder = CfnCrawlerSchedulePropertyDsl()
  builder.apply(block)
  return setSchedule(builder.build())
}

public inline
    fun CfnCrawler.setSchemaChangePolicy(block: CfnCrawlerSchemaChangePolicyPropertyDsl.() -> Unit =
    {}) {
  val builder = CfnCrawlerSchemaChangePolicyPropertyDsl()
  builder.apply(block)
  return setSchemaChangePolicy(builder.build())
}

public inline fun CfnSchemaVersion.setSchema(block: CfnSchemaVersionSchemaPropertyDsl.() -> Unit =
    {}) {
  val builder = CfnSchemaVersionSchemaPropertyDsl()
  builder.apply(block)
  return setSchema(builder.build())
}

public inline
    fun CfnDataQualityRuleset.setTargetTable(block: CfnDataQualityRulesetDataQualityTargetTablePropertyDsl.() -> Unit
    = {}) {
  val builder = CfnDataQualityRulesetDataQualityTargetTablePropertyDsl()
  builder.apply(block)
  return setTargetTable(builder.build())
}

public inline
    fun CfnConnection.setConnectionInput(block: CfnConnectionConnectionInputPropertyDsl.() -> Unit =
    {}) {
  val builder = CfnConnectionConnectionInputPropertyDsl()
  builder.apply(block)
  return setConnectionInput(builder.build())
}

public inline
    fun CfnTrigger.setEventBatchingCondition(block: CfnTriggerEventBatchingConditionPropertyDsl.() -> Unit
    = {}) {
  val builder = CfnTriggerEventBatchingConditionPropertyDsl()
  builder.apply(block)
  return setEventBatchingCondition(builder.build())
}

public inline fun CfnTrigger.setPredicate(block: CfnTriggerPredicatePropertyDsl.() -> Unit = {}) {
  val builder = CfnTriggerPredicatePropertyDsl()
  builder.apply(block)
  return setPredicate(builder.build())
}

public inline fun CfnTable.setTableInput(block: CfnTableTableInputPropertyDsl.() -> Unit = {}) {
  val builder = CfnTableTableInputPropertyDsl()
  builder.apply(block)
  return setTableInput(builder.build())
}

public inline
    fun CfnDataCatalogEncryptionSettings.setDataCatalogEncryptionSettings(block: CfnDataCatalogEncryptionSettingsDataCatalogEncryptionSettingsPropertyDsl.() -> Unit
    = {}) {
  val builder = CfnDataCatalogEncryptionSettingsDataCatalogEncryptionSettingsPropertyDsl()
  builder.apply(block)
  return setDataCatalogEncryptionSettings(builder.build())
}

public inline fun CfnDatabase.setDatabaseInput(block: CfnDatabaseDatabaseInputPropertyDsl.() -> Unit
    = {}) {
  val builder = CfnDatabaseDatabaseInputPropertyDsl()
  builder.apply(block)
  return setDatabaseInput(builder.build())
}

public inline fun CfnSchema.setCheckpointVersion(block: CfnSchemaSchemaVersionPropertyDsl.() -> Unit
    = {}) {
  val builder = CfnSchemaSchemaVersionPropertyDsl()
  builder.apply(block)
  return setCheckpointVersion(builder.build())
}

public inline fun CfnSchema.setRegistry(block: CfnSchemaRegistryPropertyDsl.() -> Unit = {}) {
  val builder = CfnSchemaRegistryPropertyDsl()
  builder.apply(block)
  return setRegistry(builder.build())
}

public inline
    fun CfnMLTransform.setInputRecordTables(block: CfnMLTransformInputRecordTablesPropertyDsl.() -> Unit
    = {}) {
  val builder = CfnMLTransformInputRecordTablesPropertyDsl()
  builder.apply(block)
  return setInputRecordTables(builder.build())
}

public inline
    fun CfnMLTransform.setTransformParameters(block: CfnMLTransformTransformParametersPropertyDsl.() -> Unit
    = {}) {
  val builder = CfnMLTransformTransformParametersPropertyDsl()
  builder.apply(block)
  return setTransformParameters(builder.build())
}

public inline
    fun CfnMLTransform.setTransformEncryption(block: CfnMLTransformTransformEncryptionPropertyDsl.() -> Unit
    = {}) {
  val builder = CfnMLTransformTransformEncryptionPropertyDsl()
  builder.apply(block)
  return setTransformEncryption(builder.build())
}

public inline fun CfnJob.setCommand(block: CfnJobJobCommandPropertyDsl.() -> Unit = {}) {
  val builder = CfnJobJobCommandPropertyDsl()
  builder.apply(block)
  return setCommand(builder.build())
}

public inline fun CfnJob.setConnections(block: CfnJobConnectionsListPropertyDsl.() -> Unit = {}) {
  val builder = CfnJobConnectionsListPropertyDsl()
  builder.apply(block)
  return setConnections(builder.build())
}

public inline fun CfnJob.setExecutionProperty(block: CfnJobExecutionPropertyPropertyDsl.() -> Unit =
    {}) {
  val builder = CfnJobExecutionPropertyPropertyDsl()
  builder.apply(block)
  return setExecutionProperty(builder.build())
}

public inline
    fun CfnJob.setNotificationProperty(block: CfnJobNotificationPropertyPropertyDsl.() -> Unit =
    {}) {
  val builder = CfnJobNotificationPropertyPropertyDsl()
  builder.apply(block)
  return setNotificationProperty(builder.build())
}

public inline
    fun CfnPartition.setPartitionInput(block: CfnPartitionPartitionInputPropertyDsl.() -> Unit =
    {}) {
  val builder = CfnPartitionPartitionInputPropertyDsl()
  builder.apply(block)
  return setPartitionInput(builder.build())
}

public inline
    fun CfnClassifier.setCsvClassifier(block: CfnClassifierCsvClassifierPropertyDsl.() -> Unit =
    {}) {
  val builder = CfnClassifierCsvClassifierPropertyDsl()
  builder.apply(block)
  return setCsvClassifier(builder.build())
}

public inline
    fun CfnClassifier.setGrokClassifier(block: CfnClassifierGrokClassifierPropertyDsl.() -> Unit =
    {}) {
  val builder = CfnClassifierGrokClassifierPropertyDsl()
  builder.apply(block)
  return setGrokClassifier(builder.build())
}

public inline
    fun CfnClassifier.setJsonClassifier(block: CfnClassifierJsonClassifierPropertyDsl.() -> Unit =
    {}) {
  val builder = CfnClassifierJsonClassifierPropertyDsl()
  builder.apply(block)
  return setJsonClassifier(builder.build())
}

public inline
    fun CfnClassifier.setXmlClassifier(block: CfnClassifierXMLClassifierPropertyDsl.() -> Unit =
    {}) {
  val builder = CfnClassifierXMLClassifierPropertyDsl()
  builder.apply(block)
  return setXmlClassifier(builder.build())
}
