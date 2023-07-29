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

/** Specify the `VersionNumber` or the `IsLatest` for setting the checkpoint for the schema. */
public inline fun CfnSchema.setCheckpointVersion(
    block: CfnSchemaSchemaVersionPropertyDsl.() -> Unit = {}
) {
    val builder = CfnSchemaSchemaVersionPropertyDsl()
    builder.apply(block)
    return setCheckpointVersion(builder.build())
}

/** The registry where a schema is stored. */
public inline fun CfnSchema.setRegistry(block: CfnSchemaRegistryPropertyDsl.() -> Unit = {}) {
    val builder = CfnSchemaRegistryPropertyDsl()
    builder.apply(block)
    return setRegistry(builder.build())
}

/** A collection of targets to crawl. */
public inline fun CfnCrawler.setTargets(block: CfnCrawlerTargetsPropertyDsl.() -> Unit = {}) {
    val builder = CfnCrawlerTargetsPropertyDsl()
    builder.apply(block)
    return setTargets(builder.build())
}

/**
 * A policy that specifies whether to crawl the entire dataset again, or to crawl only folders that
 * were added since the last crawler run.
 */
public inline fun CfnCrawler.setRecrawlPolicy(
    block: CfnCrawlerRecrawlPolicyPropertyDsl.() -> Unit = {}
) {
    val builder = CfnCrawlerRecrawlPolicyPropertyDsl()
    builder.apply(block)
    return setRecrawlPolicy(builder.build())
}

/** For scheduled crawlers, the schedule when the crawler runs. */
public inline fun CfnCrawler.setSchedule(block: CfnCrawlerSchedulePropertyDsl.() -> Unit = {}) {
    val builder = CfnCrawlerSchedulePropertyDsl()
    builder.apply(block)
    return setSchedule(builder.build())
}

/** The policy that specifies update and delete behaviors for the crawler. */
public inline fun CfnCrawler.setSchemaChangePolicy(
    block: CfnCrawlerSchemaChangePolicyPropertyDsl.() -> Unit = {}
) {
    val builder = CfnCrawlerSchemaChangePolicyPropertyDsl()
    builder.apply(block)
    return setSchemaChangePolicy(builder.build())
}

/**
 * Batch condition that must be met (specified number of events received or batch time window
 * expired) before EventBridge event trigger fires.
 */
public inline fun CfnTrigger.setEventBatchingCondition(
    block: CfnTriggerEventBatchingConditionPropertyDsl.() -> Unit = {}
) {
    val builder = CfnTriggerEventBatchingConditionPropertyDsl()
    builder.apply(block)
    return setEventBatchingCondition(builder.build())
}

/** The predicate of this trigger, which defines when it will fire. */
public inline fun CfnTrigger.setPredicate(block: CfnTriggerPredicatePropertyDsl.() -> Unit = {}) {
    val builder = CfnTriggerPredicatePropertyDsl()
    builder.apply(block)
    return setPredicate(builder.build())
}

/** The encryption configuration associated with this security configuration. */
public inline fun CfnSecurityConfiguration.setEncryptionConfiguration(
    block: CfnSecurityConfigurationEncryptionConfigurationPropertyDsl.() -> Unit = {}
) {
    val builder = CfnSecurityConfigurationEncryptionConfigurationPropertyDsl()
    builder.apply(block)
    return setEncryptionConfiguration(builder.build())
}

/** An object representing an AWS Glue table. */
public inline fun CfnDataQualityRuleset.setTargetTable(
    block: CfnDataQualityRulesetDataQualityTargetTablePropertyDsl.() -> Unit = {}
) {
    val builder = CfnDataQualityRulesetDataQualityTargetTablePropertyDsl()
    builder.apply(block)
    return setTargetTable(builder.build())
}

/** A classifier for comma-separated values (CSV). */
public inline fun CfnClassifier.setCsvClassifier(
    block: CfnClassifierCsvClassifierPropertyDsl.() -> Unit = {}
) {
    val builder = CfnClassifierCsvClassifierPropertyDsl()
    builder.apply(block)
    return setCsvClassifier(builder.build())
}

/** A classifier that uses `grok` . */
public inline fun CfnClassifier.setGrokClassifier(
    block: CfnClassifierGrokClassifierPropertyDsl.() -> Unit = {}
) {
    val builder = CfnClassifierGrokClassifierPropertyDsl()
    builder.apply(block)
    return setGrokClassifier(builder.build())
}

/** A classifier for JSON content. */
public inline fun CfnClassifier.setJsonClassifier(
    block: CfnClassifierJsonClassifierPropertyDsl.() -> Unit = {}
) {
    val builder = CfnClassifierJsonClassifierPropertyDsl()
    builder.apply(block)
    return setJsonClassifier(builder.build())
}

/** A classifier for XML content. */
public inline fun CfnClassifier.setXmlClassifier(
    block: CfnClassifierXMLClassifierPropertyDsl.() -> Unit = {}
) {
    val builder = CfnClassifierXMLClassifierPropertyDsl()
    builder.apply(block)
    return setXmlClassifier(builder.build())
}

/** The metadata for the database. */
public inline fun CfnDatabase.setDatabaseInput(
    block: CfnDatabaseDatabaseInputPropertyDsl.() -> Unit = {}
) {
    val builder = CfnDatabaseDatabaseInputPropertyDsl()
    builder.apply(block)
    return setDatabaseInput(builder.build())
}

/** The structure used to create and update a partition. */
public inline fun CfnPartition.setPartitionInput(
    block: CfnPartitionPartitionInputPropertyDsl.() -> Unit = {}
) {
    val builder = CfnPartitionPartitionInputPropertyDsl()
    builder.apply(block)
    return setPartitionInput(builder.build())
}

/** Contains configuration information for maintaining Data Catalog security. */
public inline fun CfnDataCatalogEncryptionSettings.setDataCatalogEncryptionSettings(
    block: CfnDataCatalogEncryptionSettingsDataCatalogEncryptionSettingsPropertyDsl.() -> Unit = {}
) {
    val builder = CfnDataCatalogEncryptionSettingsDataCatalogEncryptionSettingsPropertyDsl()
    builder.apply(block)
    return setDataCatalogEncryptionSettings(builder.build())
}

/** The schema that includes the schema version. */
public inline fun CfnSchemaVersion.setSchema(
    block: CfnSchemaVersionSchemaPropertyDsl.() -> Unit = {}
) {
    val builder = CfnSchemaVersionSchemaPropertyDsl()
    builder.apply(block)
    return setSchema(builder.build())
}

/** The code that executes a job. */
public inline fun CfnJob.setCommand(block: CfnJobJobCommandPropertyDsl.() -> Unit = {}) {
    val builder = CfnJobJobCommandPropertyDsl()
    builder.apply(block)
    return setCommand(builder.build())
}

/** The connections used for this job. */
public inline fun CfnJob.setConnections(block: CfnJobConnectionsListPropertyDsl.() -> Unit = {}) {
    val builder = CfnJobConnectionsListPropertyDsl()
    builder.apply(block)
    return setConnections(builder.build())
}

/** The maximum number of concurrent runs that are allowed for this job. */
public inline fun CfnJob.setExecutionProperty(
    block: CfnJobExecutionPropertyPropertyDsl.() -> Unit = {}
) {
    val builder = CfnJobExecutionPropertyPropertyDsl()
    builder.apply(block)
    return setExecutionProperty(builder.build())
}

/** Specifies configuration properties of a notification. */
public inline fun CfnJob.setNotificationProperty(
    block: CfnJobNotificationPropertyPropertyDsl.() -> Unit = {}
) {
    val builder = CfnJobNotificationPropertyPropertyDsl()
    builder.apply(block)
    return setNotificationProperty(builder.build())
}

/** A structure used to define a table. */
public inline fun CfnTable.setTableInput(block: CfnTableTableInputPropertyDsl.() -> Unit = {}) {
    val builder = CfnTableTableInputPropertyDsl()
    builder.apply(block)
    return setTableInput(builder.build())
}

/** The connection that you want to create. */
public inline fun CfnConnection.setConnectionInput(
    block: CfnConnectionConnectionInputPropertyDsl.() -> Unit = {}
) {
    val builder = CfnConnectionConnectionInputPropertyDsl()
    builder.apply(block)
    return setConnectionInput(builder.build())
}

/** A list of AWS Glue table definitions used by the transform. */
public inline fun CfnMLTransform.setInputRecordTables(
    block: CfnMLTransformInputRecordTablesPropertyDsl.() -> Unit = {}
) {
    val builder = CfnMLTransformInputRecordTablesPropertyDsl()
    builder.apply(block)
    return setInputRecordTables(builder.build())
}

/** The algorithm-specific parameters that are associated with the machine learning transform. */
public inline fun CfnMLTransform.setTransformParameters(
    block: CfnMLTransformTransformParametersPropertyDsl.() -> Unit = {}
) {
    val builder = CfnMLTransformTransformParametersPropertyDsl()
    builder.apply(block)
    return setTransformParameters(builder.build())
}

/** The encryption-at-rest settings of the transform that apply to accessing user data. */
public inline fun CfnMLTransform.setTransformEncryption(
    block: CfnMLTransformTransformEncryptionPropertyDsl.() -> Unit = {}
) {
    val builder = CfnMLTransformTransformEncryptionPropertyDsl()
    builder.apply(block)
    return setTransformEncryption(builder.build())
}
