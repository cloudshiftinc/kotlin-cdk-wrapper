@file:Suppress(
    "RedundantVisibilityModifier",
    "RedundantUnitReturnType",
    "RemoveRedundantQualifierName",
    "unused",
    "UnusedImport",
    "ClassName",
    "REDUNDANT_PROJECTION",
    "DEPRECATION",
)

package cloudshift.awscdk.dsl.services.glue

import software.amazon.awscdk.services.glue.CfnClassifier
import software.amazon.awscdk.services.glue.CfnClassifierProps
import software.amazon.awscdk.services.glue.CfnConnection
import software.amazon.awscdk.services.glue.CfnConnectionProps
import software.amazon.awscdk.services.glue.CfnCrawler
import software.amazon.awscdk.services.glue.CfnCrawlerProps
import software.amazon.awscdk.services.glue.CfnDataCatalogEncryptionSettings
import software.amazon.awscdk.services.glue.CfnDataCatalogEncryptionSettingsProps
import software.amazon.awscdk.services.glue.CfnDataQualityRuleset
import software.amazon.awscdk.services.glue.CfnDataQualityRulesetProps
import software.amazon.awscdk.services.glue.CfnDatabase
import software.amazon.awscdk.services.glue.CfnDatabaseProps
import software.amazon.awscdk.services.glue.CfnDevEndpoint
import software.amazon.awscdk.services.glue.CfnDevEndpointProps
import software.amazon.awscdk.services.glue.CfnJob
import software.amazon.awscdk.services.glue.CfnJobProps
import software.amazon.awscdk.services.glue.CfnMLTransform
import software.amazon.awscdk.services.glue.CfnMLTransformProps
import software.amazon.awscdk.services.glue.CfnPartition
import software.amazon.awscdk.services.glue.CfnPartitionProps
import software.amazon.awscdk.services.glue.CfnRegistry
import software.amazon.awscdk.services.glue.CfnRegistryProps
import software.amazon.awscdk.services.glue.CfnSchema
import software.amazon.awscdk.services.glue.CfnSchemaProps
import software.amazon.awscdk.services.glue.CfnSchemaVersion
import software.amazon.awscdk.services.glue.CfnSchemaVersionMetadata
import software.amazon.awscdk.services.glue.CfnSchemaVersionMetadataProps
import software.amazon.awscdk.services.glue.CfnSchemaVersionProps
import software.amazon.awscdk.services.glue.CfnSecurityConfiguration
import software.amazon.awscdk.services.glue.CfnSecurityConfigurationProps
import software.amazon.awscdk.services.glue.CfnTable
import software.amazon.awscdk.services.glue.CfnTableProps
import software.amazon.awscdk.services.glue.CfnTrigger
import software.amazon.awscdk.services.glue.CfnTriggerProps
import software.amazon.awscdk.services.glue.CfnWorkflow
import software.amazon.awscdk.services.glue.CfnWorkflowProps
import software.constructs.Construct
import kotlin.String
import kotlin.Unit

public object glue {
    public inline fun cfnClassifier(
        scope: Construct,
        id: String,
        block: CfnClassifierDsl.() -> Unit = {},
    ): CfnClassifier {
        val builder = CfnClassifierDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnClassifierCsvClassifierProperty(
        block: CfnClassifierCsvClassifierPropertyDsl.() -> Unit =
            {},
    ): CfnClassifier.CsvClassifierProperty {
        val builder = CfnClassifierCsvClassifierPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnClassifierGrokClassifierProperty(
        block: CfnClassifierGrokClassifierPropertyDsl.() -> Unit =
            {},
    ): CfnClassifier.GrokClassifierProperty {
        val builder = CfnClassifierGrokClassifierPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnClassifierJsonClassifierProperty(
        block: CfnClassifierJsonClassifierPropertyDsl.() -> Unit =
            {},
    ): CfnClassifier.JsonClassifierProperty {
        val builder = CfnClassifierJsonClassifierPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnClassifierProps(block: CfnClassifierPropsDsl.() -> Unit = {}): CfnClassifierProps {
        val builder = CfnClassifierPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnClassifierXMLClassifierProperty(
        block: CfnClassifierXMLClassifierPropertyDsl.() -> Unit =
            {},
    ): CfnClassifier.XMLClassifierProperty {
        val builder = CfnClassifierXMLClassifierPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnConnection(
        scope: Construct,
        id: String,
        block: CfnConnectionDsl.() -> Unit = {},
    ): CfnConnection {
        val builder = CfnConnectionDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnConnectionConnectionInputProperty(
        block: CfnConnectionConnectionInputPropertyDsl.() -> Unit =
            {},
    ): CfnConnection.ConnectionInputProperty {
        val builder = CfnConnectionConnectionInputPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnConnectionPhysicalConnectionRequirementsProperty(
        block: CfnConnectionPhysicalConnectionRequirementsPropertyDsl.() -> Unit =
            {},
    ): CfnConnection.PhysicalConnectionRequirementsProperty {
        val builder = CfnConnectionPhysicalConnectionRequirementsPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnConnectionProps(block: CfnConnectionPropsDsl.() -> Unit = {}): CfnConnectionProps {
        val builder = CfnConnectionPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnCrawler(
        scope: Construct,
        id: String,
        block: CfnCrawlerDsl.() -> Unit = {},
    ): CfnCrawler {
        val builder = CfnCrawlerDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnCrawlerCatalogTargetProperty(
        block: CfnCrawlerCatalogTargetPropertyDsl.() -> Unit =
            {},
    ): CfnCrawler.CatalogTargetProperty {
        val builder = CfnCrawlerCatalogTargetPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnCrawlerDeltaTargetProperty(
        block: CfnCrawlerDeltaTargetPropertyDsl.() -> Unit =
            {},
    ): CfnCrawler.DeltaTargetProperty {
        val builder = CfnCrawlerDeltaTargetPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnCrawlerDynamoDBTargetProperty(
        block: CfnCrawlerDynamoDBTargetPropertyDsl.() -> Unit =
            {},
    ): CfnCrawler.DynamoDBTargetProperty {
        val builder = CfnCrawlerDynamoDBTargetPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnCrawlerJdbcTargetProperty(
        block: CfnCrawlerJdbcTargetPropertyDsl.() -> Unit =
            {},
    ): CfnCrawler.JdbcTargetProperty {
        val builder = CfnCrawlerJdbcTargetPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnCrawlerMongoDBTargetProperty(
        block: CfnCrawlerMongoDBTargetPropertyDsl.() -> Unit =
            {},
    ): CfnCrawler.MongoDBTargetProperty {
        val builder = CfnCrawlerMongoDBTargetPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnCrawlerProps(block: CfnCrawlerPropsDsl.() -> Unit = {}): CfnCrawlerProps {
        val builder = CfnCrawlerPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnCrawlerRecrawlPolicyProperty(
        block: CfnCrawlerRecrawlPolicyPropertyDsl.() -> Unit =
            {},
    ): CfnCrawler.RecrawlPolicyProperty {
        val builder = CfnCrawlerRecrawlPolicyPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnCrawlerS3TargetProperty(
        block: CfnCrawlerS3TargetPropertyDsl.() -> Unit =
            {},
    ): CfnCrawler.S3TargetProperty {
        val builder = CfnCrawlerS3TargetPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnCrawlerScheduleProperty(
        block: CfnCrawlerSchedulePropertyDsl.() -> Unit =
            {},
    ): CfnCrawler.ScheduleProperty {
        val builder = CfnCrawlerSchedulePropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnCrawlerSchemaChangePolicyProperty(
        block: CfnCrawlerSchemaChangePolicyPropertyDsl.() -> Unit =
            {},
    ): CfnCrawler.SchemaChangePolicyProperty {
        val builder = CfnCrawlerSchemaChangePolicyPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnCrawlerTargetsProperty(block: CfnCrawlerTargetsPropertyDsl.() -> Unit = {}): CfnCrawler.TargetsProperty {
        val builder = CfnCrawlerTargetsPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnDataCatalogEncryptionSettings(
        scope: Construct,
        id: String,
        block: CfnDataCatalogEncryptionSettingsDsl.() -> Unit = {},
    ): CfnDataCatalogEncryptionSettings {
        val builder = CfnDataCatalogEncryptionSettingsDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnDataCatalogEncryptionSettingsConnectionPasswordEncryptionProperty(
        block: CfnDataCatalogEncryptionSettingsConnectionPasswordEncryptionPropertyDsl.() -> Unit =
            {},
    ): CfnDataCatalogEncryptionSettings.ConnectionPasswordEncryptionProperty {
        val builder = CfnDataCatalogEncryptionSettingsConnectionPasswordEncryptionPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnDataCatalogEncryptionSettingsDataCatalogEncryptionSettingsProperty(
        block: CfnDataCatalogEncryptionSettingsDataCatalogEncryptionSettingsPropertyDsl.() -> Unit =
            {},
    ): CfnDataCatalogEncryptionSettings.DataCatalogEncryptionSettingsProperty {
        val builder = CfnDataCatalogEncryptionSettingsDataCatalogEncryptionSettingsPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnDataCatalogEncryptionSettingsEncryptionAtRestProperty(
        block: CfnDataCatalogEncryptionSettingsEncryptionAtRestPropertyDsl.() -> Unit =
            {},
    ): CfnDataCatalogEncryptionSettings.EncryptionAtRestProperty {
        val builder = CfnDataCatalogEncryptionSettingsEncryptionAtRestPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnDataCatalogEncryptionSettingsProps(
        block: CfnDataCatalogEncryptionSettingsPropsDsl.() -> Unit =
            {},
    ): CfnDataCatalogEncryptionSettingsProps {
        val builder = CfnDataCatalogEncryptionSettingsPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnDataQualityRuleset(
        scope: Construct,
        id: String,
        block: CfnDataQualityRulesetDsl.() -> Unit = {},
    ): CfnDataQualityRuleset {
        val builder = CfnDataQualityRulesetDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnDataQualityRulesetDataQualityTargetTableProperty(
        block: CfnDataQualityRulesetDataQualityTargetTablePropertyDsl.() -> Unit =
            {},
    ): CfnDataQualityRuleset.DataQualityTargetTableProperty {
        val builder = CfnDataQualityRulesetDataQualityTargetTablePropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnDataQualityRulesetProps(
        block: CfnDataQualityRulesetPropsDsl.() -> Unit =
            {},
    ): CfnDataQualityRulesetProps {
        val builder = CfnDataQualityRulesetPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnDatabase(
        scope: Construct,
        id: String,
        block: CfnDatabaseDsl.() -> Unit = {},
    ): CfnDatabase {
        val builder = CfnDatabaseDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnDatabaseDataLakePrincipalProperty(
        block: CfnDatabaseDataLakePrincipalPropertyDsl.() -> Unit =
            {},
    ): CfnDatabase.DataLakePrincipalProperty {
        val builder = CfnDatabaseDataLakePrincipalPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnDatabaseDatabaseIdentifierProperty(
        block: CfnDatabaseDatabaseIdentifierPropertyDsl.() -> Unit =
            {},
    ): CfnDatabase.DatabaseIdentifierProperty {
        val builder = CfnDatabaseDatabaseIdentifierPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnDatabaseDatabaseInputProperty(
        block: CfnDatabaseDatabaseInputPropertyDsl.() -> Unit =
            {},
    ): CfnDatabase.DatabaseInputProperty {
        val builder = CfnDatabaseDatabaseInputPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnDatabaseFederatedDatabaseProperty(
        block: CfnDatabaseFederatedDatabasePropertyDsl.() -> Unit =
            {},
    ): CfnDatabase.FederatedDatabaseProperty {
        val builder = CfnDatabaseFederatedDatabasePropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnDatabasePrincipalPrivilegesProperty(
        block: CfnDatabasePrincipalPrivilegesPropertyDsl.() -> Unit =
            {},
    ): CfnDatabase.PrincipalPrivilegesProperty {
        val builder = CfnDatabasePrincipalPrivilegesPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnDatabaseProps(block: CfnDatabasePropsDsl.() -> Unit = {}): CfnDatabaseProps {
        val builder = CfnDatabasePropsDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnDevEndpoint(
        scope: Construct,
        id: String,
        block: CfnDevEndpointDsl.() -> Unit = {},
    ): CfnDevEndpoint {
        val builder = CfnDevEndpointDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnDevEndpointProps(block: CfnDevEndpointPropsDsl.() -> Unit = {}): CfnDevEndpointProps {
        val builder = CfnDevEndpointPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnJob(
        scope: Construct,
        id: String,
        block: CfnJobDsl.() -> Unit = {},
    ): CfnJob {
        val builder = CfnJobDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnJobConnectionsListProperty(
        block: CfnJobConnectionsListPropertyDsl.() -> Unit =
            {},
    ): CfnJob.ConnectionsListProperty {
        val builder = CfnJobConnectionsListPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnJobExecutionPropertyProperty(
        block: CfnJobExecutionPropertyPropertyDsl.() -> Unit =
            {},
    ): CfnJob.ExecutionPropertyProperty {
        val builder = CfnJobExecutionPropertyPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnJobJobCommandProperty(block: CfnJobJobCommandPropertyDsl.() -> Unit = {}): CfnJob.JobCommandProperty {
        val builder = CfnJobJobCommandPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnJobNotificationPropertyProperty(
        block: CfnJobNotificationPropertyPropertyDsl.() -> Unit =
            {},
    ): CfnJob.NotificationPropertyProperty {
        val builder = CfnJobNotificationPropertyPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnJobProps(block: CfnJobPropsDsl.() -> Unit = {}): CfnJobProps {
        val builder = CfnJobPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnMLTransform(
        scope: Construct,
        id: String,
        block: CfnMLTransformDsl.() -> Unit = {},
    ): CfnMLTransform {
        val builder = CfnMLTransformDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnMLTransformFindMatchesParametersProperty(
        block: CfnMLTransformFindMatchesParametersPropertyDsl.() -> Unit =
            {},
    ): CfnMLTransform.FindMatchesParametersProperty {
        val builder = CfnMLTransformFindMatchesParametersPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnMLTransformGlueTablesProperty(
        block: CfnMLTransformGlueTablesPropertyDsl.() -> Unit =
            {},
    ): CfnMLTransform.GlueTablesProperty {
        val builder = CfnMLTransformGlueTablesPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnMLTransformInputRecordTablesProperty(
        block: CfnMLTransformInputRecordTablesPropertyDsl.() -> Unit =
            {},
    ): CfnMLTransform.InputRecordTablesProperty {
        val builder = CfnMLTransformInputRecordTablesPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnMLTransformMLUserDataEncryptionProperty(
        block: CfnMLTransformMLUserDataEncryptionPropertyDsl.() -> Unit =
            {},
    ): CfnMLTransform.MLUserDataEncryptionProperty {
        val builder = CfnMLTransformMLUserDataEncryptionPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnMLTransformProps(block: CfnMLTransformPropsDsl.() -> Unit = {}): CfnMLTransformProps {
        val builder = CfnMLTransformPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnMLTransformTransformEncryptionProperty(
        block: CfnMLTransformTransformEncryptionPropertyDsl.() -> Unit =
            {},
    ): CfnMLTransform.TransformEncryptionProperty {
        val builder = CfnMLTransformTransformEncryptionPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnMLTransformTransformParametersProperty(
        block: CfnMLTransformTransformParametersPropertyDsl.() -> Unit =
            {},
    ): CfnMLTransform.TransformParametersProperty {
        val builder = CfnMLTransformTransformParametersPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnPartition(
        scope: Construct,
        id: String,
        block: CfnPartitionDsl.() -> Unit = {},
    ): CfnPartition {
        val builder = CfnPartitionDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnPartitionColumnProperty(
        block: CfnPartitionColumnPropertyDsl.() -> Unit =
            {},
    ): CfnPartition.ColumnProperty {
        val builder = CfnPartitionColumnPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnPartitionOrderProperty(block: CfnPartitionOrderPropertyDsl.() -> Unit = {}): CfnPartition.OrderProperty {
        val builder = CfnPartitionOrderPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnPartitionPartitionInputProperty(
        block: CfnPartitionPartitionInputPropertyDsl.() -> Unit =
            {},
    ): CfnPartition.PartitionInputProperty {
        val builder = CfnPartitionPartitionInputPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnPartitionProps(block: CfnPartitionPropsDsl.() -> Unit = {}): CfnPartitionProps {
        val builder = CfnPartitionPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnPartitionSchemaIdProperty(
        block: CfnPartitionSchemaIdPropertyDsl.() -> Unit =
            {},
    ): CfnPartition.SchemaIdProperty {
        val builder = CfnPartitionSchemaIdPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnPartitionSchemaReferenceProperty(
        block: CfnPartitionSchemaReferencePropertyDsl.() -> Unit =
            {},
    ): CfnPartition.SchemaReferenceProperty {
        val builder = CfnPartitionSchemaReferencePropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnPartitionSerdeInfoProperty(
        block: CfnPartitionSerdeInfoPropertyDsl.() -> Unit =
            {},
    ): CfnPartition.SerdeInfoProperty {
        val builder = CfnPartitionSerdeInfoPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnPartitionSkewedInfoProperty(
        block: CfnPartitionSkewedInfoPropertyDsl.() -> Unit = {
        },
    ): CfnPartition.SkewedInfoProperty {
        val builder = CfnPartitionSkewedInfoPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnPartitionStorageDescriptorProperty(
        block: CfnPartitionStorageDescriptorPropertyDsl.() -> Unit =
            {},
    ): CfnPartition.StorageDescriptorProperty {
        val builder = CfnPartitionStorageDescriptorPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnRegistry(
        scope: Construct,
        id: String,
        block: CfnRegistryDsl.() -> Unit = {},
    ): CfnRegistry {
        val builder = CfnRegistryDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnRegistryProps(block: CfnRegistryPropsDsl.() -> Unit = {}): CfnRegistryProps {
        val builder = CfnRegistryPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnSchema(
        scope: Construct,
        id: String,
        block: CfnSchemaDsl.() -> Unit = {},
    ): CfnSchema {
        val builder = CfnSchemaDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnSchemaProps(block: CfnSchemaPropsDsl.() -> Unit = {}): CfnSchemaProps {
        val builder = CfnSchemaPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnSchemaRegistryProperty(block: CfnSchemaRegistryPropertyDsl.() -> Unit = {}): CfnSchema.RegistryProperty {
        val builder = CfnSchemaRegistryPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnSchemaSchemaVersionProperty(
        block: CfnSchemaSchemaVersionPropertyDsl.() -> Unit = {
        },
    ): CfnSchema.SchemaVersionProperty {
        val builder = CfnSchemaSchemaVersionPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnSchemaVersion(
        scope: Construct,
        id: String,
        block: CfnSchemaVersionDsl.() -> Unit = {},
    ): CfnSchemaVersion {
        val builder = CfnSchemaVersionDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnSchemaVersionMetadata(
        scope: Construct,
        id: String,
        block: CfnSchemaVersionMetadataDsl.() -> Unit = {},
    ): CfnSchemaVersionMetadata {
        val builder = CfnSchemaVersionMetadataDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnSchemaVersionMetadataProps(
        block: CfnSchemaVersionMetadataPropsDsl.() -> Unit =
            {},
    ): CfnSchemaVersionMetadataProps {
        val builder = CfnSchemaVersionMetadataPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnSchemaVersionProps(block: CfnSchemaVersionPropsDsl.() -> Unit = {}): CfnSchemaVersionProps {
        val builder = CfnSchemaVersionPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnSchemaVersionSchemaProperty(
        block: CfnSchemaVersionSchemaPropertyDsl.() -> Unit = {
        },
    ): CfnSchemaVersion.SchemaProperty {
        val builder = CfnSchemaVersionSchemaPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnSecurityConfiguration(
        scope: Construct,
        id: String,
        block: CfnSecurityConfigurationDsl.() -> Unit = {},
    ): CfnSecurityConfiguration {
        val builder = CfnSecurityConfigurationDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnSecurityConfigurationCloudWatchEncryptionProperty(
        block: CfnSecurityConfigurationCloudWatchEncryptionPropertyDsl.() -> Unit =
            {},
    ): CfnSecurityConfiguration.CloudWatchEncryptionProperty {
        val builder = CfnSecurityConfigurationCloudWatchEncryptionPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnSecurityConfigurationEncryptionConfigurationProperty(
        block: CfnSecurityConfigurationEncryptionConfigurationPropertyDsl.() -> Unit =
            {},
    ): CfnSecurityConfiguration.EncryptionConfigurationProperty {
        val builder = CfnSecurityConfigurationEncryptionConfigurationPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnSecurityConfigurationJobBookmarksEncryptionProperty(
        block: CfnSecurityConfigurationJobBookmarksEncryptionPropertyDsl.() -> Unit =
            {},
    ): CfnSecurityConfiguration.JobBookmarksEncryptionProperty {
        val builder = CfnSecurityConfigurationJobBookmarksEncryptionPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnSecurityConfigurationProps(
        block: CfnSecurityConfigurationPropsDsl.() -> Unit =
            {},
    ): CfnSecurityConfigurationProps {
        val builder = CfnSecurityConfigurationPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnSecurityConfigurationS3EncryptionProperty(
        block: CfnSecurityConfigurationS3EncryptionPropertyDsl.() -> Unit =
            {},
    ): CfnSecurityConfiguration.S3EncryptionProperty {
        val builder = CfnSecurityConfigurationS3EncryptionPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnTable(
        scope: Construct,
        id: String,
        block: CfnTableDsl.() -> Unit = {},
    ): CfnTable {
        val builder = CfnTableDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnTableColumnProperty(block: CfnTableColumnPropertyDsl.() -> Unit = {}): CfnTable.ColumnProperty {
        val builder = CfnTableColumnPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnTableOrderProperty(block: CfnTableOrderPropertyDsl.() -> Unit = {}): CfnTable.OrderProperty {
        val builder = CfnTableOrderPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnTableProps(block: CfnTablePropsDsl.() -> Unit = {}): CfnTableProps {
        val builder = CfnTablePropsDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnTableSchemaIdProperty(block: CfnTableSchemaIdPropertyDsl.() -> Unit = {}): CfnTable.SchemaIdProperty {
        val builder = CfnTableSchemaIdPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnTableSchemaReferenceProperty(
        block: CfnTableSchemaReferencePropertyDsl.() -> Unit =
            {},
    ): CfnTable.SchemaReferenceProperty {
        val builder = CfnTableSchemaReferencePropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnTableSerdeInfoProperty(block: CfnTableSerdeInfoPropertyDsl.() -> Unit = {}): CfnTable.SerdeInfoProperty {
        val builder = CfnTableSerdeInfoPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnTableSkewedInfoProperty(
        block: CfnTableSkewedInfoPropertyDsl.() -> Unit =
            {},
    ): CfnTable.SkewedInfoProperty {
        val builder = CfnTableSkewedInfoPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnTableStorageDescriptorProperty(
        block: CfnTableStorageDescriptorPropertyDsl.() -> Unit =
            {},
    ): CfnTable.StorageDescriptorProperty {
        val builder = CfnTableStorageDescriptorPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnTableTableIdentifierProperty(
        block: CfnTableTableIdentifierPropertyDsl.() -> Unit =
            {},
    ): CfnTable.TableIdentifierProperty {
        val builder = CfnTableTableIdentifierPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnTableTableInputProperty(
        block: CfnTableTableInputPropertyDsl.() -> Unit =
            {},
    ): CfnTable.TableInputProperty {
        val builder = CfnTableTableInputPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnTrigger(
        scope: Construct,
        id: String,
        block: CfnTriggerDsl.() -> Unit = {},
    ): CfnTrigger {
        val builder = CfnTriggerDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnTriggerActionProperty(block: CfnTriggerActionPropertyDsl.() -> Unit = {}): CfnTrigger.ActionProperty {
        val builder = CfnTriggerActionPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnTriggerConditionProperty(
        block: CfnTriggerConditionPropertyDsl.() -> Unit =
            {},
    ): CfnTrigger.ConditionProperty {
        val builder = CfnTriggerConditionPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnTriggerEventBatchingConditionProperty(
        block: CfnTriggerEventBatchingConditionPropertyDsl.() -> Unit =
            {},
    ): CfnTrigger.EventBatchingConditionProperty {
        val builder = CfnTriggerEventBatchingConditionPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnTriggerNotificationPropertyProperty(
        block: CfnTriggerNotificationPropertyPropertyDsl.() -> Unit =
            {},
    ): CfnTrigger.NotificationPropertyProperty {
        val builder = CfnTriggerNotificationPropertyPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnTriggerPredicateProperty(
        block: CfnTriggerPredicatePropertyDsl.() -> Unit =
            {},
    ): CfnTrigger.PredicateProperty {
        val builder = CfnTriggerPredicatePropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnTriggerProps(block: CfnTriggerPropsDsl.() -> Unit = {}): CfnTriggerProps {
        val builder = CfnTriggerPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnWorkflow(
        scope: Construct,
        id: String,
        block: CfnWorkflowDsl.() -> Unit = {},
    ): CfnWorkflow {
        val builder = CfnWorkflowDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnWorkflowProps(block: CfnWorkflowPropsDsl.() -> Unit = {}): CfnWorkflowProps {
        val builder = CfnWorkflowPropsDsl()
        builder.apply(block)
        return builder.build()
    }
}
