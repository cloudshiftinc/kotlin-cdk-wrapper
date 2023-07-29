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

import kotlin.String
import kotlin.Unit
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

public object glue {
    /**
     * The `AWS::Glue::Classifier` resource creates an AWS Glue classifier that categorizes data
     * sources and specifies schemas.
     *
     * For more information, see
     * [Adding Classifiers to a Crawler](https://docs.aws.amazon.com/glue/latest/dg/add-classifier.html)
     * and
     * [Classifier Structure](https://docs.aws.amazon.com/glue/latest/dg/aws-glue-api-crawler-classifiers.html#aws-glue-api-crawler-classifiers-Classifier)
     * in the *AWS Glue Developer Guide* .
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.glue.*;
     * CfnClassifier cfnClassifier = CfnClassifier.Builder.create(this, "MyCfnClassifier")
     * .csvClassifier(CsvClassifierProperty.builder()
     * .allowSingleColumn(false)
     * .containsHeader("containsHeader")
     * .delimiter("delimiter")
     * .disableValueTrimming(false)
     * .header(List.of("header"))
     * .name("name")
     * .quoteSymbol("quoteSymbol")
     * .build())
     * .grokClassifier(GrokClassifierProperty.builder()
     * .classification("classification")
     * .grokPattern("grokPattern")
     * // the properties below are optional
     * .customPatterns("customPatterns")
     * .name("name")
     * .build())
     * .jsonClassifier(JsonClassifierProperty.builder()
     * .jsonPath("jsonPath")
     * // the properties below are optional
     * .name("name")
     * .build())
     * .xmlClassifier(XMLClassifierProperty.builder()
     * .classification("classification")
     * .rowTag("rowTag")
     * // the properties below are optional
     * .name("name")
     * .build())
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-classifier.html)
     */
    public inline fun cfnClassifier(
        scope: Construct,
        id: String,
        block: CfnClassifierDsl.() -> Unit = {},
    ): CfnClassifier {
        val builder = CfnClassifierDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * A classifier for custom `CSV` content.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.glue.*;
     * CsvClassifierProperty csvClassifierProperty = CsvClassifierProperty.builder()
     * .allowSingleColumn(false)
     * .containsHeader("containsHeader")
     * .delimiter("delimiter")
     * .disableValueTrimming(false)
     * .header(List.of("header"))
     * .name("name")
     * .quoteSymbol("quoteSymbol")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-classifier-csvclassifier.html)
     */
    public inline fun cfnClassifierCsvClassifierProperty(
        block: CfnClassifierCsvClassifierPropertyDsl.() -> Unit = {}
    ): CfnClassifier.CsvClassifierProperty {
        val builder = CfnClassifierCsvClassifierPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * A classifier that uses `grok` patterns.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.glue.*;
     * GrokClassifierProperty grokClassifierProperty = GrokClassifierProperty.builder()
     * .classification("classification")
     * .grokPattern("grokPattern")
     * // the properties below are optional
     * .customPatterns("customPatterns")
     * .name("name")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-classifier-grokclassifier.html)
     */
    public inline fun cfnClassifierGrokClassifierProperty(
        block: CfnClassifierGrokClassifierPropertyDsl.() -> Unit = {}
    ): CfnClassifier.GrokClassifierProperty {
        val builder = CfnClassifierGrokClassifierPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * A classifier for `JSON` content.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.glue.*;
     * JsonClassifierProperty jsonClassifierProperty = JsonClassifierProperty.builder()
     * .jsonPath("jsonPath")
     * // the properties below are optional
     * .name("name")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-classifier-jsonclassifier.html)
     */
    public inline fun cfnClassifierJsonClassifierProperty(
        block: CfnClassifierJsonClassifierPropertyDsl.() -> Unit = {}
    ): CfnClassifier.JsonClassifierProperty {
        val builder = CfnClassifierJsonClassifierPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnClassifier`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.glue.*;
     * CfnClassifierProps cfnClassifierProps = CfnClassifierProps.builder()
     * .csvClassifier(CsvClassifierProperty.builder()
     * .allowSingleColumn(false)
     * .containsHeader("containsHeader")
     * .delimiter("delimiter")
     * .disableValueTrimming(false)
     * .header(List.of("header"))
     * .name("name")
     * .quoteSymbol("quoteSymbol")
     * .build())
     * .grokClassifier(GrokClassifierProperty.builder()
     * .classification("classification")
     * .grokPattern("grokPattern")
     * // the properties below are optional
     * .customPatterns("customPatterns")
     * .name("name")
     * .build())
     * .jsonClassifier(JsonClassifierProperty.builder()
     * .jsonPath("jsonPath")
     * // the properties below are optional
     * .name("name")
     * .build())
     * .xmlClassifier(XMLClassifierProperty.builder()
     * .classification("classification")
     * .rowTag("rowTag")
     * // the properties below are optional
     * .name("name")
     * .build())
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-classifier.html)
     */
    public inline fun cfnClassifierProps(
        block: CfnClassifierPropsDsl.() -> Unit = {}
    ): CfnClassifierProps {
        val builder = CfnClassifierPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * A classifier for `XML` content.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.glue.*;
     * XMLClassifierProperty xMLClassifierProperty = XMLClassifierProperty.builder()
     * .classification("classification")
     * .rowTag("rowTag")
     * // the properties below are optional
     * .name("name")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-classifier-xmlclassifier.html)
     */
    public inline fun cfnClassifierXMLClassifierProperty(
        block: CfnClassifierXMLClassifierPropertyDsl.() -> Unit = {}
    ): CfnClassifier.XMLClassifierProperty {
        val builder = CfnClassifierXMLClassifierPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The `AWS::Glue::Connection` resource specifies an AWS Glue connection to a data source.
     *
     * For more information, see
     * [Adding a Connection to Your Data Store](https://docs.aws.amazon.com/glue/latest/dg/populate-add-connection.html)
     * and
     * [Connection Structure](https://docs.aws.amazon.com/glue/latest/dg/aws-glue-api-catalog-connections.html#aws-glue-api-catalog-connections-Connection)
     * in the *AWS Glue Developer Guide* .
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.glue.*;
     * Object connectionProperties;
     * CfnConnection cfnConnection = CfnConnection.Builder.create(this, "MyCfnConnection")
     * .catalogId("catalogId")
     * .connectionInput(ConnectionInputProperty.builder()
     * .connectionType("connectionType")
     * // the properties below are optional
     * .connectionProperties(connectionProperties)
     * .description("description")
     * .matchCriteria(List.of("matchCriteria"))
     * .name("name")
     * .physicalConnectionRequirements(PhysicalConnectionRequirementsProperty.builder()
     * .availabilityZone("availabilityZone")
     * .securityGroupIdList(List.of("securityGroupIdList"))
     * .subnetId("subnetId")
     * .build())
     * .build())
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-connection.html)
     */
    public inline fun cfnConnection(
        scope: Construct,
        id: String,
        block: CfnConnectionDsl.() -> Unit = {},
    ): CfnConnection {
        val builder = CfnConnectionDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * A structure that is used to specify a connection to create or update.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.glue.*;
     * Object connectionProperties;
     * ConnectionInputProperty connectionInputProperty = ConnectionInputProperty.builder()
     * .connectionType("connectionType")
     * // the properties below are optional
     * .connectionProperties(connectionProperties)
     * .description("description")
     * .matchCriteria(List.of("matchCriteria"))
     * .name("name")
     * .physicalConnectionRequirements(PhysicalConnectionRequirementsProperty.builder()
     * .availabilityZone("availabilityZone")
     * .securityGroupIdList(List.of("securityGroupIdList"))
     * .subnetId("subnetId")
     * .build())
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-connection-connectioninput.html)
     */
    public inline fun cfnConnectionConnectionInputProperty(
        block: CfnConnectionConnectionInputPropertyDsl.() -> Unit = {}
    ): CfnConnection.ConnectionInputProperty {
        val builder = CfnConnectionConnectionInputPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Specifies the physical requirements for a connection.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.glue.*;
     * PhysicalConnectionRequirementsProperty physicalConnectionRequirementsProperty =
     * PhysicalConnectionRequirementsProperty.builder()
     * .availabilityZone("availabilityZone")
     * .securityGroupIdList(List.of("securityGroupIdList"))
     * .subnetId("subnetId")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-connection-physicalconnectionrequirements.html)
     */
    public inline fun cfnConnectionPhysicalConnectionRequirementsProperty(
        block: CfnConnectionPhysicalConnectionRequirementsPropertyDsl.() -> Unit = {}
    ): CfnConnection.PhysicalConnectionRequirementsProperty {
        val builder = CfnConnectionPhysicalConnectionRequirementsPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnConnection`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.glue.*;
     * Object connectionProperties;
     * CfnConnectionProps cfnConnectionProps = CfnConnectionProps.builder()
     * .catalogId("catalogId")
     * .connectionInput(ConnectionInputProperty.builder()
     * .connectionType("connectionType")
     * // the properties below are optional
     * .connectionProperties(connectionProperties)
     * .description("description")
     * .matchCriteria(List.of("matchCriteria"))
     * .name("name")
     * .physicalConnectionRequirements(PhysicalConnectionRequirementsProperty.builder()
     * .availabilityZone("availabilityZone")
     * .securityGroupIdList(List.of("securityGroupIdList"))
     * .subnetId("subnetId")
     * .build())
     * .build())
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-connection.html)
     */
    public inline fun cfnConnectionProps(
        block: CfnConnectionPropsDsl.() -> Unit = {}
    ): CfnConnectionProps {
        val builder = CfnConnectionPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The `AWS::Glue::Crawler` resource specifies an AWS Glue crawler.
     *
     * For more information, see
     * [Cataloging Tables with a Crawler](https://docs.aws.amazon.com/glue/latest/dg/add-crawler.html)
     * and
     * [Crawler Structure](https://docs.aws.amazon.com/glue/latest/dg/aws-glue-api-crawler-crawling.html#aws-glue-api-crawler-crawling-Crawler)
     * in the *AWS Glue Developer Guide* .
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.glue.*;
     * Object tags;
     * CfnCrawler cfnCrawler = CfnCrawler.Builder.create(this, "MyCfnCrawler")
     * .role("role")
     * .targets(TargetsProperty.builder()
     * .catalogTargets(List.of(CatalogTargetProperty.builder()
     * .connectionName("connectionName")
     * .databaseName("databaseName")
     * .dlqEventQueueArn("dlqEventQueueArn")
     * .eventQueueArn("eventQueueArn")
     * .tables(List.of("tables"))
     * .build()))
     * .deltaTargets(List.of(DeltaTargetProperty.builder()
     * .connectionName("connectionName")
     * .createNativeDeltaTable(false)
     * .deltaTables(List.of("deltaTables"))
     * .writeManifest(false)
     * .build()))
     * .dynamoDbTargets(List.of(DynamoDBTargetProperty.builder()
     * .path("path")
     * .build()))
     * .jdbcTargets(List.of(JdbcTargetProperty.builder()
     * .connectionName("connectionName")
     * .exclusions(List.of("exclusions"))
     * .path("path")
     * .build()))
     * .mongoDbTargets(List.of(MongoDBTargetProperty.builder()
     * .connectionName("connectionName")
     * .path("path")
     * .build()))
     * .s3Targets(List.of(S3TargetProperty.builder()
     * .connectionName("connectionName")
     * .dlqEventQueueArn("dlqEventQueueArn")
     * .eventQueueArn("eventQueueArn")
     * .exclusions(List.of("exclusions"))
     * .path("path")
     * .sampleSize(123)
     * .build()))
     * .build())
     * // the properties below are optional
     * .classifiers(List.of("classifiers"))
     * .configuration("configuration")
     * .crawlerSecurityConfiguration("crawlerSecurityConfiguration")
     * .databaseName("databaseName")
     * .description("description")
     * .name("name")
     * .recrawlPolicy(RecrawlPolicyProperty.builder()
     * .recrawlBehavior("recrawlBehavior")
     * .build())
     * .schedule(ScheduleProperty.builder()
     * .scheduleExpression("scheduleExpression")
     * .build())
     * .schemaChangePolicy(SchemaChangePolicyProperty.builder()
     * .deleteBehavior("deleteBehavior")
     * .updateBehavior("updateBehavior")
     * .build())
     * .tablePrefix("tablePrefix")
     * .tags(tags)
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-crawler.html)
     */
    public inline fun cfnCrawler(
        scope: Construct,
        id: String,
        block: CfnCrawlerDsl.() -> Unit = {},
    ): CfnCrawler {
        val builder = CfnCrawlerDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Specifies an AWS Glue Data Catalog target.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.glue.*;
     * CatalogTargetProperty catalogTargetProperty = CatalogTargetProperty.builder()
     * .connectionName("connectionName")
     * .databaseName("databaseName")
     * .dlqEventQueueArn("dlqEventQueueArn")
     * .eventQueueArn("eventQueueArn")
     * .tables(List.of("tables"))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-crawler-catalogtarget.html)
     */
    public inline fun cfnCrawlerCatalogTargetProperty(
        block: CfnCrawlerCatalogTargetPropertyDsl.() -> Unit = {}
    ): CfnCrawler.CatalogTargetProperty {
        val builder = CfnCrawlerCatalogTargetPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Specifies a Delta data store to crawl one or more Delta tables.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.glue.*;
     * DeltaTargetProperty deltaTargetProperty = DeltaTargetProperty.builder()
     * .connectionName("connectionName")
     * .createNativeDeltaTable(false)
     * .deltaTables(List.of("deltaTables"))
     * .writeManifest(false)
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-crawler-deltatarget.html)
     */
    public inline fun cfnCrawlerDeltaTargetProperty(
        block: CfnCrawlerDeltaTargetPropertyDsl.() -> Unit = {}
    ): CfnCrawler.DeltaTargetProperty {
        val builder = CfnCrawlerDeltaTargetPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Specifies an Amazon DynamoDB table to crawl.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.glue.*;
     * DynamoDBTargetProperty dynamoDBTargetProperty = DynamoDBTargetProperty.builder()
     * .path("path")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-crawler-dynamodbtarget.html)
     */
    public inline fun cfnCrawlerDynamoDBTargetProperty(
        block: CfnCrawlerDynamoDBTargetPropertyDsl.() -> Unit = {}
    ): CfnCrawler.DynamoDBTargetProperty {
        val builder = CfnCrawlerDynamoDBTargetPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Specifies a JDBC data store to crawl.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.glue.*;
     * JdbcTargetProperty jdbcTargetProperty = JdbcTargetProperty.builder()
     * .connectionName("connectionName")
     * .exclusions(List.of("exclusions"))
     * .path("path")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-crawler-jdbctarget.html)
     */
    public inline fun cfnCrawlerJdbcTargetProperty(
        block: CfnCrawlerJdbcTargetPropertyDsl.() -> Unit = {}
    ): CfnCrawler.JdbcTargetProperty {
        val builder = CfnCrawlerJdbcTargetPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Specifies an Amazon DocumentDB or MongoDB data store to crawl.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.glue.*;
     * MongoDBTargetProperty mongoDBTargetProperty = MongoDBTargetProperty.builder()
     * .connectionName("connectionName")
     * .path("path")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-crawler-mongodbtarget.html)
     */
    public inline fun cfnCrawlerMongoDBTargetProperty(
        block: CfnCrawlerMongoDBTargetPropertyDsl.() -> Unit = {}
    ): CfnCrawler.MongoDBTargetProperty {
        val builder = CfnCrawlerMongoDBTargetPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnCrawler`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.glue.*;
     * Object tags;
     * CfnCrawlerProps cfnCrawlerProps = CfnCrawlerProps.builder()
     * .role("role")
     * .targets(TargetsProperty.builder()
     * .catalogTargets(List.of(CatalogTargetProperty.builder()
     * .connectionName("connectionName")
     * .databaseName("databaseName")
     * .dlqEventQueueArn("dlqEventQueueArn")
     * .eventQueueArn("eventQueueArn")
     * .tables(List.of("tables"))
     * .build()))
     * .deltaTargets(List.of(DeltaTargetProperty.builder()
     * .connectionName("connectionName")
     * .createNativeDeltaTable(false)
     * .deltaTables(List.of("deltaTables"))
     * .writeManifest(false)
     * .build()))
     * .dynamoDbTargets(List.of(DynamoDBTargetProperty.builder()
     * .path("path")
     * .build()))
     * .jdbcTargets(List.of(JdbcTargetProperty.builder()
     * .connectionName("connectionName")
     * .exclusions(List.of("exclusions"))
     * .path("path")
     * .build()))
     * .mongoDbTargets(List.of(MongoDBTargetProperty.builder()
     * .connectionName("connectionName")
     * .path("path")
     * .build()))
     * .s3Targets(List.of(S3TargetProperty.builder()
     * .connectionName("connectionName")
     * .dlqEventQueueArn("dlqEventQueueArn")
     * .eventQueueArn("eventQueueArn")
     * .exclusions(List.of("exclusions"))
     * .path("path")
     * .sampleSize(123)
     * .build()))
     * .build())
     * // the properties below are optional
     * .classifiers(List.of("classifiers"))
     * .configuration("configuration")
     * .crawlerSecurityConfiguration("crawlerSecurityConfiguration")
     * .databaseName("databaseName")
     * .description("description")
     * .name("name")
     * .recrawlPolicy(RecrawlPolicyProperty.builder()
     * .recrawlBehavior("recrawlBehavior")
     * .build())
     * .schedule(ScheduleProperty.builder()
     * .scheduleExpression("scheduleExpression")
     * .build())
     * .schemaChangePolicy(SchemaChangePolicyProperty.builder()
     * .deleteBehavior("deleteBehavior")
     * .updateBehavior("updateBehavior")
     * .build())
     * .tablePrefix("tablePrefix")
     * .tags(tags)
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-crawler.html)
     */
    public inline fun cfnCrawlerProps(block: CfnCrawlerPropsDsl.() -> Unit = {}): CfnCrawlerProps {
        val builder = CfnCrawlerPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * When crawling an Amazon S3 data source after the first crawl is complete, specifies whether
     * to crawl the entire dataset again or to crawl only folders that were added since the last
     * crawler run.
     *
     * For more information, see
     * [Incremental Crawls in AWS Glue](https://docs.aws.amazon.com/glue/latest/dg/incremental-crawls.html)
     * in the developer guide.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.glue.*;
     * RecrawlPolicyProperty recrawlPolicyProperty = RecrawlPolicyProperty.builder()
     * .recrawlBehavior("recrawlBehavior")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-crawler-recrawlpolicy.html)
     */
    public inline fun cfnCrawlerRecrawlPolicyProperty(
        block: CfnCrawlerRecrawlPolicyPropertyDsl.() -> Unit = {}
    ): CfnCrawler.RecrawlPolicyProperty {
        val builder = CfnCrawlerRecrawlPolicyPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Specifies a data store in Amazon Simple Storage Service (Amazon S3).
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.glue.*;
     * S3TargetProperty s3TargetProperty = S3TargetProperty.builder()
     * .connectionName("connectionName")
     * .dlqEventQueueArn("dlqEventQueueArn")
     * .eventQueueArn("eventQueueArn")
     * .exclusions(List.of("exclusions"))
     * .path("path")
     * .sampleSize(123)
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-crawler-s3target.html)
     */
    public inline fun cfnCrawlerS3TargetProperty(
        block: CfnCrawlerS3TargetPropertyDsl.() -> Unit = {}
    ): CfnCrawler.S3TargetProperty {
        val builder = CfnCrawlerS3TargetPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * A scheduling object using a `cron` statement to schedule an event.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.glue.*;
     * ScheduleProperty scheduleProperty = ScheduleProperty.builder()
     * .scheduleExpression("scheduleExpression")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-crawler-schedule.html)
     */
    public inline fun cfnCrawlerScheduleProperty(
        block: CfnCrawlerSchedulePropertyDsl.() -> Unit = {}
    ): CfnCrawler.ScheduleProperty {
        val builder = CfnCrawlerSchedulePropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The policy that specifies update and delete behaviors for the crawler.
     *
     * The policy tells the crawler what to do in the event that it detects a change in a table that
     * already exists in the customer's database at the time of the crawl. The `SchemaChangePolicy`
     * does not affect whether or how new tables and partitions are added. New tables and partitions
     * are always created regardless of the `SchemaChangePolicy` on a crawler.
     *
     * The SchemaChangePolicy consists of two components, `UpdateBehavior` and `DeleteBehavior` .
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.glue.*;
     * SchemaChangePolicyProperty schemaChangePolicyProperty = SchemaChangePolicyProperty.builder()
     * .deleteBehavior("deleteBehavior")
     * .updateBehavior("updateBehavior")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-crawler-schemachangepolicy.html)
     */
    public inline fun cfnCrawlerSchemaChangePolicyProperty(
        block: CfnCrawlerSchemaChangePolicyPropertyDsl.() -> Unit = {}
    ): CfnCrawler.SchemaChangePolicyProperty {
        val builder = CfnCrawlerSchemaChangePolicyPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Specifies data stores to crawl.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.glue.*;
     * TargetsProperty targetsProperty = TargetsProperty.builder()
     * .catalogTargets(List.of(CatalogTargetProperty.builder()
     * .connectionName("connectionName")
     * .databaseName("databaseName")
     * .dlqEventQueueArn("dlqEventQueueArn")
     * .eventQueueArn("eventQueueArn")
     * .tables(List.of("tables"))
     * .build()))
     * .deltaTargets(List.of(DeltaTargetProperty.builder()
     * .connectionName("connectionName")
     * .createNativeDeltaTable(false)
     * .deltaTables(List.of("deltaTables"))
     * .writeManifest(false)
     * .build()))
     * .dynamoDbTargets(List.of(DynamoDBTargetProperty.builder()
     * .path("path")
     * .build()))
     * .jdbcTargets(List.of(JdbcTargetProperty.builder()
     * .connectionName("connectionName")
     * .exclusions(List.of("exclusions"))
     * .path("path")
     * .build()))
     * .mongoDbTargets(List.of(MongoDBTargetProperty.builder()
     * .connectionName("connectionName")
     * .path("path")
     * .build()))
     * .s3Targets(List.of(S3TargetProperty.builder()
     * .connectionName("connectionName")
     * .dlqEventQueueArn("dlqEventQueueArn")
     * .eventQueueArn("eventQueueArn")
     * .exclusions(List.of("exclusions"))
     * .path("path")
     * .sampleSize(123)
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-crawler-targets.html)
     */
    public inline fun cfnCrawlerTargetsProperty(
        block: CfnCrawlerTargetsPropertyDsl.() -> Unit = {}
    ): CfnCrawler.TargetsProperty {
        val builder = CfnCrawlerTargetsPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Sets the security configuration for a specified catalog.
     *
     * After the configuration has been set, the specified encryption is applied to every catalog
     * write thereafter.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.glue.*;
     * CfnDataCatalogEncryptionSettings cfnDataCatalogEncryptionSettings =
     * CfnDataCatalogEncryptionSettings.Builder.create(this, "MyCfnDataCatalogEncryptionSettings")
     * .catalogId("catalogId")
     * .dataCatalogEncryptionSettings(DataCatalogEncryptionSettingsProperty.builder()
     * .connectionPasswordEncryption(ConnectionPasswordEncryptionProperty.builder()
     * .kmsKeyId("kmsKeyId")
     * .returnConnectionPasswordEncrypted(false)
     * .build())
     * .encryptionAtRest(EncryptionAtRestProperty.builder()
     * .catalogEncryptionMode("catalogEncryptionMode")
     * .sseAwsKmsKeyId("sseAwsKmsKeyId")
     * .build())
     * .build())
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-datacatalogencryptionsettings.html)
     */
    public inline fun cfnDataCatalogEncryptionSettings(
        scope: Construct,
        id: String,
        block: CfnDataCatalogEncryptionSettingsDsl.() -> Unit = {},
    ): CfnDataCatalogEncryptionSettings {
        val builder = CfnDataCatalogEncryptionSettingsDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * The data structure used by the Data Catalog to encrypt the password as part of
     * `CreateConnection` or `UpdateConnection` and store it in the `ENCRYPTED_PASSWORD` field in
     * the connection properties.
     *
     * You can enable catalog encryption or only password encryption.
     *
     * When a `CreationConnection` request arrives containing a password, the Data Catalog first
     * encrypts the password using your AWS KMS key. It then encrypts the whole connection object
     * again if catalog encryption is also enabled.
     *
     * This encryption requires that you set AWS KMS key permissions to enable or restrict access on
     * the password key according to your security requirements. For example, you might want only
     * administrators to have decrypt permission on the password key.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.glue.*;
     * ConnectionPasswordEncryptionProperty connectionPasswordEncryptionProperty =
     * ConnectionPasswordEncryptionProperty.builder()
     * .kmsKeyId("kmsKeyId")
     * .returnConnectionPasswordEncrypted(false)
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-datacatalogencryptionsettings-connectionpasswordencryption.html)
     */
    public inline fun cfnDataCatalogEncryptionSettingsConnectionPasswordEncryptionProperty(
        block: CfnDataCatalogEncryptionSettingsConnectionPasswordEncryptionPropertyDsl.() -> Unit =
            {}
    ): CfnDataCatalogEncryptionSettings.ConnectionPasswordEncryptionProperty {
        val builder = CfnDataCatalogEncryptionSettingsConnectionPasswordEncryptionPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Contains configuration information for maintaining Data Catalog security.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.glue.*;
     * DataCatalogEncryptionSettingsProperty dataCatalogEncryptionSettingsProperty =
     * DataCatalogEncryptionSettingsProperty.builder()
     * .connectionPasswordEncryption(ConnectionPasswordEncryptionProperty.builder()
     * .kmsKeyId("kmsKeyId")
     * .returnConnectionPasswordEncrypted(false)
     * .build())
     * .encryptionAtRest(EncryptionAtRestProperty.builder()
     * .catalogEncryptionMode("catalogEncryptionMode")
     * .sseAwsKmsKeyId("sseAwsKmsKeyId")
     * .build())
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-datacatalogencryptionsettings-datacatalogencryptionsettings.html)
     */
    public inline fun cfnDataCatalogEncryptionSettingsDataCatalogEncryptionSettingsProperty(
        block: CfnDataCatalogEncryptionSettingsDataCatalogEncryptionSettingsPropertyDsl.() -> Unit =
            {}
    ): CfnDataCatalogEncryptionSettings.DataCatalogEncryptionSettingsProperty {
        val builder = CfnDataCatalogEncryptionSettingsDataCatalogEncryptionSettingsPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Specifies the encryption-at-rest configuration for the Data Catalog.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.glue.*;
     * EncryptionAtRestProperty encryptionAtRestProperty = EncryptionAtRestProperty.builder()
     * .catalogEncryptionMode("catalogEncryptionMode")
     * .sseAwsKmsKeyId("sseAwsKmsKeyId")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-datacatalogencryptionsettings-encryptionatrest.html)
     */
    public inline fun cfnDataCatalogEncryptionSettingsEncryptionAtRestProperty(
        block: CfnDataCatalogEncryptionSettingsEncryptionAtRestPropertyDsl.() -> Unit = {}
    ): CfnDataCatalogEncryptionSettings.EncryptionAtRestProperty {
        val builder = CfnDataCatalogEncryptionSettingsEncryptionAtRestPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnDataCatalogEncryptionSettings`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.glue.*;
     * CfnDataCatalogEncryptionSettingsProps cfnDataCatalogEncryptionSettingsProps =
     * CfnDataCatalogEncryptionSettingsProps.builder()
     * .catalogId("catalogId")
     * .dataCatalogEncryptionSettings(DataCatalogEncryptionSettingsProperty.builder()
     * .connectionPasswordEncryption(ConnectionPasswordEncryptionProperty.builder()
     * .kmsKeyId("kmsKeyId")
     * .returnConnectionPasswordEncrypted(false)
     * .build())
     * .encryptionAtRest(EncryptionAtRestProperty.builder()
     * .catalogEncryptionMode("catalogEncryptionMode")
     * .sseAwsKmsKeyId("sseAwsKmsKeyId")
     * .build())
     * .build())
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-datacatalogencryptionsettings.html)
     */
    public inline fun cfnDataCatalogEncryptionSettingsProps(
        block: CfnDataCatalogEncryptionSettingsPropsDsl.() -> Unit = {}
    ): CfnDataCatalogEncryptionSettingsProps {
        val builder = CfnDataCatalogEncryptionSettingsPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The `AWS::Glue::DataQualityRuleset` resource specifies a data quality ruleset with DQDL rules
     * applied to a specified AWS Glue table.
     *
     * For more information, see AWS Glue Data Quality in the AWS Glue Developer Guide.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.glue.*;
     * Object tags;
     * CfnDataQualityRuleset cfnDataQualityRuleset = CfnDataQualityRuleset.Builder.create(this,
     * "MyCfnDataQualityRuleset")
     * .clientToken("clientToken")
     * .description("description")
     * .name("name")
     * .ruleset("ruleset")
     * .tags(tags)
     * .targetTable(DataQualityTargetTableProperty.builder()
     * .databaseName("databaseName")
     * .tableName("tableName")
     * .build())
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-dataqualityruleset.html)
     */
    public inline fun cfnDataQualityRuleset(
        scope: Construct,
        id: String,
        block: CfnDataQualityRulesetDsl.() -> Unit = {},
    ): CfnDataQualityRuleset {
        val builder = CfnDataQualityRulesetDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * An object representing an AWS Glue table.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.glue.*;
     * DataQualityTargetTableProperty dataQualityTargetTableProperty =
     * DataQualityTargetTableProperty.builder()
     * .databaseName("databaseName")
     * .tableName("tableName")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-dataqualityruleset-dataqualitytargettable.html)
     */
    public inline fun cfnDataQualityRulesetDataQualityTargetTableProperty(
        block: CfnDataQualityRulesetDataQualityTargetTablePropertyDsl.() -> Unit = {}
    ): CfnDataQualityRuleset.DataQualityTargetTableProperty {
        val builder = CfnDataQualityRulesetDataQualityTargetTablePropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnDataQualityRuleset`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.glue.*;
     * Object tags;
     * CfnDataQualityRulesetProps cfnDataQualityRulesetProps = CfnDataQualityRulesetProps.builder()
     * .clientToken("clientToken")
     * .description("description")
     * .name("name")
     * .ruleset("ruleset")
     * .tags(tags)
     * .targetTable(DataQualityTargetTableProperty.builder()
     * .databaseName("databaseName")
     * .tableName("tableName")
     * .build())
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-dataqualityruleset.html)
     */
    public inline fun cfnDataQualityRulesetProps(
        block: CfnDataQualityRulesetPropsDsl.() -> Unit = {}
    ): CfnDataQualityRulesetProps {
        val builder = CfnDataQualityRulesetPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The `AWS::Glue::Database` resource specifies a logical grouping of tables in AWS Glue .
     *
     * For more information, see
     * [Defining a Database in Your Data Catalog](https://docs.aws.amazon.com/glue/latest/dg/define-database.html)
     * and
     * [Database Structure](https://docs.aws.amazon.com/glue/latest/dg/aws-glue-api-catalog-databases.html#aws-glue-api-catalog-databases-Database)
     * in the *AWS Glue Developer Guide* .
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.glue.*;
     * Object parameters;
     * CfnDatabase cfnDatabase = CfnDatabase.Builder.create(this, "MyCfnDatabase")
     * .catalogId("catalogId")
     * .databaseInput(DatabaseInputProperty.builder()
     * .createTableDefaultPermissions(List.of(PrincipalPrivilegesProperty.builder()
     * .permissions(List.of("permissions"))
     * .principal(DataLakePrincipalProperty.builder()
     * .dataLakePrincipalIdentifier("dataLakePrincipalIdentifier")
     * .build())
     * .build()))
     * .description("description")
     * .federatedDatabase(FederatedDatabaseProperty.builder()
     * .connectionName("connectionName")
     * .identifier("identifier")
     * .build())
     * .locationUri("locationUri")
     * .name("name")
     * .parameters(parameters)
     * .targetDatabase(DatabaseIdentifierProperty.builder()
     * .catalogId("catalogId")
     * .databaseName("databaseName")
     * .build())
     * .build())
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-database.html)
     */
    public inline fun cfnDatabase(
        scope: Construct,
        id: String,
        block: CfnDatabaseDsl.() -> Unit = {},
    ): CfnDatabase {
        val builder = CfnDatabaseDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * The AWS Lake Formation principal.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.glue.*;
     * DataLakePrincipalProperty dataLakePrincipalProperty = DataLakePrincipalProperty.builder()
     * .dataLakePrincipalIdentifier("dataLakePrincipalIdentifier")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-database-datalakeprincipal.html)
     */
    public inline fun cfnDatabaseDataLakePrincipalProperty(
        block: CfnDatabaseDataLakePrincipalPropertyDsl.() -> Unit = {}
    ): CfnDatabase.DataLakePrincipalProperty {
        val builder = CfnDatabaseDataLakePrincipalPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * A structure that describes a target database for resource linking.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.glue.*;
     * DatabaseIdentifierProperty databaseIdentifierProperty = DatabaseIdentifierProperty.builder()
     * .catalogId("catalogId")
     * .databaseName("databaseName")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-database-databaseidentifier.html)
     */
    public inline fun cfnDatabaseDatabaseIdentifierProperty(
        block: CfnDatabaseDatabaseIdentifierPropertyDsl.() -> Unit = {}
    ): CfnDatabase.DatabaseIdentifierProperty {
        val builder = CfnDatabaseDatabaseIdentifierPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The structure used to create or update a database.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.glue.*;
     * Object parameters;
     * DatabaseInputProperty databaseInputProperty = DatabaseInputProperty.builder()
     * .createTableDefaultPermissions(List.of(PrincipalPrivilegesProperty.builder()
     * .permissions(List.of("permissions"))
     * .principal(DataLakePrincipalProperty.builder()
     * .dataLakePrincipalIdentifier("dataLakePrincipalIdentifier")
     * .build())
     * .build()))
     * .description("description")
     * .federatedDatabase(FederatedDatabaseProperty.builder()
     * .connectionName("connectionName")
     * .identifier("identifier")
     * .build())
     * .locationUri("locationUri")
     * .name("name")
     * .parameters(parameters)
     * .targetDatabase(DatabaseIdentifierProperty.builder()
     * .catalogId("catalogId")
     * .databaseName("databaseName")
     * .build())
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-database-databaseinput.html)
     */
    public inline fun cfnDatabaseDatabaseInputProperty(
        block: CfnDatabaseDatabaseInputPropertyDsl.() -> Unit = {}
    ): CfnDatabase.DatabaseInputProperty {
        val builder = CfnDatabaseDatabaseInputPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * A `FederatedDatabase` structure that references an entity outside the AWS Glue Data Catalog .
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.glue.*;
     * FederatedDatabaseProperty federatedDatabaseProperty = FederatedDatabaseProperty.builder()
     * .connectionName("connectionName")
     * .identifier("identifier")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-database-federateddatabase.html)
     */
    public inline fun cfnDatabaseFederatedDatabaseProperty(
        block: CfnDatabaseFederatedDatabasePropertyDsl.() -> Unit = {}
    ): CfnDatabase.FederatedDatabaseProperty {
        val builder = CfnDatabaseFederatedDatabasePropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * the permissions granted to a principal.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.glue.*;
     * PrincipalPrivilegesProperty principalPrivilegesProperty = PrincipalPrivilegesProperty.builder()
     * .permissions(List.of("permissions"))
     * .principal(DataLakePrincipalProperty.builder()
     * .dataLakePrincipalIdentifier("dataLakePrincipalIdentifier")
     * .build())
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-database-principalprivileges.html)
     */
    public inline fun cfnDatabasePrincipalPrivilegesProperty(
        block: CfnDatabasePrincipalPrivilegesPropertyDsl.() -> Unit = {}
    ): CfnDatabase.PrincipalPrivilegesProperty {
        val builder = CfnDatabasePrincipalPrivilegesPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnDatabase`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.glue.*;
     * Object parameters;
     * CfnDatabaseProps cfnDatabaseProps = CfnDatabaseProps.builder()
     * .catalogId("catalogId")
     * .databaseInput(DatabaseInputProperty.builder()
     * .createTableDefaultPermissions(List.of(PrincipalPrivilegesProperty.builder()
     * .permissions(List.of("permissions"))
     * .principal(DataLakePrincipalProperty.builder()
     * .dataLakePrincipalIdentifier("dataLakePrincipalIdentifier")
     * .build())
     * .build()))
     * .description("description")
     * .federatedDatabase(FederatedDatabaseProperty.builder()
     * .connectionName("connectionName")
     * .identifier("identifier")
     * .build())
     * .locationUri("locationUri")
     * .name("name")
     * .parameters(parameters)
     * .targetDatabase(DatabaseIdentifierProperty.builder()
     * .catalogId("catalogId")
     * .databaseName("databaseName")
     * .build())
     * .build())
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-database.html)
     */
    public inline fun cfnDatabaseProps(
        block: CfnDatabasePropsDsl.() -> Unit = {}
    ): CfnDatabaseProps {
        val builder = CfnDatabasePropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The `AWS::Glue::DevEndpoint` resource specifies a development endpoint where a developer can
     * remotely debug ETL scripts for AWS Glue .
     *
     * For more information, see
     * [DevEndpoint Structure](https://docs.aws.amazon.com/glue/latest/dg/aws-glue-api-jobs-dev-endpoint.html#aws-glue-api-jobs-dev-endpoint-DevEndpoint)
     * in the AWS Glue Developer Guide.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.glue.*;
     * Object arguments_;
     * Object tags;
     * CfnDevEndpoint cfnDevEndpoint = CfnDevEndpoint.Builder.create(this, "MyCfnDevEndpoint")
     * .roleArn("roleArn")
     * // the properties below are optional
     * .arguments(arguments_)
     * .endpointName("endpointName")
     * .extraJarsS3Path("extraJarsS3Path")
     * .extraPythonLibsS3Path("extraPythonLibsS3Path")
     * .glueVersion("glueVersion")
     * .numberOfNodes(123)
     * .numberOfWorkers(123)
     * .publicKey("publicKey")
     * .publicKeys(List.of("publicKeys"))
     * .securityConfiguration("securityConfiguration")
     * .securityGroupIds(List.of("securityGroupIds"))
     * .subnetId("subnetId")
     * .tags(tags)
     * .workerType("workerType")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-devendpoint.html)
     */
    public inline fun cfnDevEndpoint(
        scope: Construct,
        id: String,
        block: CfnDevEndpointDsl.() -> Unit = {},
    ): CfnDevEndpoint {
        val builder = CfnDevEndpointDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnDevEndpoint`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.glue.*;
     * Object arguments_;
     * Object tags;
     * CfnDevEndpointProps cfnDevEndpointProps = CfnDevEndpointProps.builder()
     * .roleArn("roleArn")
     * // the properties below are optional
     * .arguments(arguments_)
     * .endpointName("endpointName")
     * .extraJarsS3Path("extraJarsS3Path")
     * .extraPythonLibsS3Path("extraPythonLibsS3Path")
     * .glueVersion("glueVersion")
     * .numberOfNodes(123)
     * .numberOfWorkers(123)
     * .publicKey("publicKey")
     * .publicKeys(List.of("publicKeys"))
     * .securityConfiguration("securityConfiguration")
     * .securityGroupIds(List.of("securityGroupIds"))
     * .subnetId("subnetId")
     * .tags(tags)
     * .workerType("workerType")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-devendpoint.html)
     */
    public inline fun cfnDevEndpointProps(
        block: CfnDevEndpointPropsDsl.() -> Unit = {}
    ): CfnDevEndpointProps {
        val builder = CfnDevEndpointPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The `AWS::Glue::Job` resource specifies an AWS Glue job in the data catalog.
     *
     * For more information, see
     * [Adding Jobs in AWS Glue](https://docs.aws.amazon.com/glue/latest/dg/add-job.html) and
     * [Job Structure](https://docs.aws.amazon.com/glue/latest/dg/aws-glue-api-jobs-job.html#aws-glue-api-jobs-job-Job)
     * in the *AWS Glue Developer Guide.*
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.glue.*;
     * Object defaultArguments;
     * Object nonOverridableArguments;
     * Object tags;
     * CfnJob cfnJob = CfnJob.Builder.create(this, "MyCfnJob")
     * .command(JobCommandProperty.builder()
     * .name("name")
     * .pythonVersion("pythonVersion")
     * .runtime("runtime")
     * .scriptLocation("scriptLocation")
     * .build())
     * .role("role")
     * // the properties below are optional
     * .allocatedCapacity(123)
     * .connections(ConnectionsListProperty.builder()
     * .connections(List.of("connections"))
     * .build())
     * .defaultArguments(defaultArguments)
     * .description("description")
     * .executionClass("executionClass")
     * .executionProperty(ExecutionPropertyProperty.builder()
     * .maxConcurrentRuns(123)
     * .build())
     * .glueVersion("glueVersion")
     * .logUri("logUri")
     * .maxCapacity(123)
     * .maxRetries(123)
     * .name("name")
     * .nonOverridableArguments(nonOverridableArguments)
     * .notificationProperty(NotificationPropertyProperty.builder()
     * .notifyDelayAfter(123)
     * .build())
     * .numberOfWorkers(123)
     * .securityConfiguration("securityConfiguration")
     * .tags(tags)
     * .timeout(123)
     * .workerType("workerType")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-job.html)
     */
    public inline fun cfnJob(
        scope: Construct,
        id: String,
        block: CfnJobDsl.() -> Unit = {},
    ): CfnJob {
        val builder = CfnJobDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Specifies the connections used by a job.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.glue.*;
     * ConnectionsListProperty connectionsListProperty = ConnectionsListProperty.builder()
     * .connections(List.of("connections"))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-job-connectionslist.html)
     */
    public inline fun cfnJobConnectionsListProperty(
        block: CfnJobConnectionsListPropertyDsl.() -> Unit = {}
    ): CfnJob.ConnectionsListProperty {
        val builder = CfnJobConnectionsListPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * An execution property of a job.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.glue.*;
     * ExecutionPropertyProperty executionPropertyProperty = ExecutionPropertyProperty.builder()
     * .maxConcurrentRuns(123)
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-job-executionproperty.html)
     */
    public inline fun cfnJobExecutionPropertyProperty(
        block: CfnJobExecutionPropertyPropertyDsl.() -> Unit = {}
    ): CfnJob.ExecutionPropertyProperty {
        val builder = CfnJobExecutionPropertyPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Specifies code executed when a job is run.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.glue.*;
     * JobCommandProperty jobCommandProperty = JobCommandProperty.builder()
     * .name("name")
     * .pythonVersion("pythonVersion")
     * .runtime("runtime")
     * .scriptLocation("scriptLocation")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-job-jobcommand.html)
     */
    public inline fun cfnJobJobCommandProperty(
        block: CfnJobJobCommandPropertyDsl.() -> Unit = {}
    ): CfnJob.JobCommandProperty {
        val builder = CfnJobJobCommandPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Specifies configuration properties of a notification.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.glue.*;
     * NotificationPropertyProperty notificationPropertyProperty =
     * NotificationPropertyProperty.builder()
     * .notifyDelayAfter(123)
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-job-notificationproperty.html)
     */
    public inline fun cfnJobNotificationPropertyProperty(
        block: CfnJobNotificationPropertyPropertyDsl.() -> Unit = {}
    ): CfnJob.NotificationPropertyProperty {
        val builder = CfnJobNotificationPropertyPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnJob`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.glue.*;
     * Object defaultArguments;
     * Object nonOverridableArguments;
     * Object tags;
     * CfnJobProps cfnJobProps = CfnJobProps.builder()
     * .command(JobCommandProperty.builder()
     * .name("name")
     * .pythonVersion("pythonVersion")
     * .runtime("runtime")
     * .scriptLocation("scriptLocation")
     * .build())
     * .role("role")
     * // the properties below are optional
     * .allocatedCapacity(123)
     * .connections(ConnectionsListProperty.builder()
     * .connections(List.of("connections"))
     * .build())
     * .defaultArguments(defaultArguments)
     * .description("description")
     * .executionClass("executionClass")
     * .executionProperty(ExecutionPropertyProperty.builder()
     * .maxConcurrentRuns(123)
     * .build())
     * .glueVersion("glueVersion")
     * .logUri("logUri")
     * .maxCapacity(123)
     * .maxRetries(123)
     * .name("name")
     * .nonOverridableArguments(nonOverridableArguments)
     * .notificationProperty(NotificationPropertyProperty.builder()
     * .notifyDelayAfter(123)
     * .build())
     * .numberOfWorkers(123)
     * .securityConfiguration("securityConfiguration")
     * .tags(tags)
     * .timeout(123)
     * .workerType("workerType")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-job.html)
     */
    public inline fun cfnJobProps(block: CfnJobPropsDsl.() -> Unit = {}): CfnJobProps {
        val builder = CfnJobPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The AWS::Glue::MLTransform is an AWS Glue resource type that manages machine learning
     * transforms.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.glue.*;
     * Object tags;
     * CfnMLTransform cfnMLTransform = CfnMLTransform.Builder.create(this, "MyCfnMLTransform")
     * .inputRecordTables(InputRecordTablesProperty.builder()
     * .glueTables(List.of(GlueTablesProperty.builder()
     * .databaseName("databaseName")
     * .tableName("tableName")
     * // the properties below are optional
     * .catalogId("catalogId")
     * .connectionName("connectionName")
     * .build()))
     * .build())
     * .role("role")
     * .transformParameters(TransformParametersProperty.builder()
     * .transformType("transformType")
     * // the properties below are optional
     * .findMatchesParameters(FindMatchesParametersProperty.builder()
     * .primaryKeyColumnName("primaryKeyColumnName")
     * // the properties below are optional
     * .accuracyCostTradeoff(123)
     * .enforceProvidedLabels(false)
     * .precisionRecallTradeoff(123)
     * .build())
     * .build())
     * // the properties below are optional
     * .description("description")
     * .glueVersion("glueVersion")
     * .maxCapacity(123)
     * .maxRetries(123)
     * .name("name")
     * .numberOfWorkers(123)
     * .tags(tags)
     * .timeout(123)
     * .transformEncryption(TransformEncryptionProperty.builder()
     * .mlUserDataEncryption(MLUserDataEncryptionProperty.builder()
     * .mlUserDataEncryptionMode("mlUserDataEncryptionMode")
     * // the properties below are optional
     * .kmsKeyId("kmsKeyId")
     * .build())
     * .taskRunSecurityConfigurationName("taskRunSecurityConfigurationName")
     * .build())
     * .workerType("workerType")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-mltransform.html)
     */
    public inline fun cfnMLTransform(
        scope: Construct,
        id: String,
        block: CfnMLTransformDsl.() -> Unit = {},
    ): CfnMLTransform {
        val builder = CfnMLTransformDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * The parameters to configure the find matches transform.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.glue.*;
     * FindMatchesParametersProperty findMatchesParametersProperty =
     * FindMatchesParametersProperty.builder()
     * .primaryKeyColumnName("primaryKeyColumnName")
     * // the properties below are optional
     * .accuracyCostTradeoff(123)
     * .enforceProvidedLabels(false)
     * .precisionRecallTradeoff(123)
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-mltransform-findmatchesparameters.html)
     */
    public inline fun cfnMLTransformFindMatchesParametersProperty(
        block: CfnMLTransformFindMatchesParametersPropertyDsl.() -> Unit = {}
    ): CfnMLTransform.FindMatchesParametersProperty {
        val builder = CfnMLTransformFindMatchesParametersPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The database and table in the AWS Glue Data Catalog that is used for input or output data.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.glue.*;
     * GlueTablesProperty glueTablesProperty = GlueTablesProperty.builder()
     * .databaseName("databaseName")
     * .tableName("tableName")
     * // the properties below are optional
     * .catalogId("catalogId")
     * .connectionName("connectionName")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-mltransform-gluetables.html)
     */
    public inline fun cfnMLTransformGlueTablesProperty(
        block: CfnMLTransformGlueTablesPropertyDsl.() -> Unit = {}
    ): CfnMLTransform.GlueTablesProperty {
        val builder = CfnMLTransformGlueTablesPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * A list of AWS Glue table definitions used by the transform.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.glue.*;
     * InputRecordTablesProperty inputRecordTablesProperty = InputRecordTablesProperty.builder()
     * .glueTables(List.of(GlueTablesProperty.builder()
     * .databaseName("databaseName")
     * .tableName("tableName")
     * // the properties below are optional
     * .catalogId("catalogId")
     * .connectionName("connectionName")
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-mltransform-inputrecordtables.html)
     */
    public inline fun cfnMLTransformInputRecordTablesProperty(
        block: CfnMLTransformInputRecordTablesPropertyDsl.() -> Unit = {}
    ): CfnMLTransform.InputRecordTablesProperty {
        val builder = CfnMLTransformInputRecordTablesPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The encryption-at-rest settings of the transform that apply to accessing user data.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.glue.*;
     * MLUserDataEncryptionProperty mLUserDataEncryptionProperty =
     * MLUserDataEncryptionProperty.builder()
     * .mlUserDataEncryptionMode("mlUserDataEncryptionMode")
     * // the properties below are optional
     * .kmsKeyId("kmsKeyId")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-mltransform-mluserdataencryption.html)
     */
    public inline fun cfnMLTransformMLUserDataEncryptionProperty(
        block: CfnMLTransformMLUserDataEncryptionPropertyDsl.() -> Unit = {}
    ): CfnMLTransform.MLUserDataEncryptionProperty {
        val builder = CfnMLTransformMLUserDataEncryptionPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnMLTransform`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.glue.*;
     * Object tags;
     * CfnMLTransformProps cfnMLTransformProps = CfnMLTransformProps.builder()
     * .inputRecordTables(InputRecordTablesProperty.builder()
     * .glueTables(List.of(GlueTablesProperty.builder()
     * .databaseName("databaseName")
     * .tableName("tableName")
     * // the properties below are optional
     * .catalogId("catalogId")
     * .connectionName("connectionName")
     * .build()))
     * .build())
     * .role("role")
     * .transformParameters(TransformParametersProperty.builder()
     * .transformType("transformType")
     * // the properties below are optional
     * .findMatchesParameters(FindMatchesParametersProperty.builder()
     * .primaryKeyColumnName("primaryKeyColumnName")
     * // the properties below are optional
     * .accuracyCostTradeoff(123)
     * .enforceProvidedLabels(false)
     * .precisionRecallTradeoff(123)
     * .build())
     * .build())
     * // the properties below are optional
     * .description("description")
     * .glueVersion("glueVersion")
     * .maxCapacity(123)
     * .maxRetries(123)
     * .name("name")
     * .numberOfWorkers(123)
     * .tags(tags)
     * .timeout(123)
     * .transformEncryption(TransformEncryptionProperty.builder()
     * .mlUserDataEncryption(MLUserDataEncryptionProperty.builder()
     * .mlUserDataEncryptionMode("mlUserDataEncryptionMode")
     * // the properties below are optional
     * .kmsKeyId("kmsKeyId")
     * .build())
     * .taskRunSecurityConfigurationName("taskRunSecurityConfigurationName")
     * .build())
     * .workerType("workerType")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-mltransform.html)
     */
    public inline fun cfnMLTransformProps(
        block: CfnMLTransformPropsDsl.() -> Unit = {}
    ): CfnMLTransformProps {
        val builder = CfnMLTransformPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The encryption-at-rest settings of the transform that apply to accessing user data.
     *
     * Machine learning transforms can access user data encrypted in Amazon S3 using KMS.
     *
     * Additionally, imported labels and trained transforms can now be encrypted using a customer
     * provided KMS key.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.glue.*;
     * TransformEncryptionProperty transformEncryptionProperty = TransformEncryptionProperty.builder()
     * .mlUserDataEncryption(MLUserDataEncryptionProperty.builder()
     * .mlUserDataEncryptionMode("mlUserDataEncryptionMode")
     * // the properties below are optional
     * .kmsKeyId("kmsKeyId")
     * .build())
     * .taskRunSecurityConfigurationName("taskRunSecurityConfigurationName")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-mltransform-transformencryption.html)
     */
    public inline fun cfnMLTransformTransformEncryptionProperty(
        block: CfnMLTransformTransformEncryptionPropertyDsl.() -> Unit = {}
    ): CfnMLTransform.TransformEncryptionProperty {
        val builder = CfnMLTransformTransformEncryptionPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The algorithm-specific parameters that are associated with the machine learning transform.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.glue.*;
     * TransformParametersProperty transformParametersProperty = TransformParametersProperty.builder()
     * .transformType("transformType")
     * // the properties below are optional
     * .findMatchesParameters(FindMatchesParametersProperty.builder()
     * .primaryKeyColumnName("primaryKeyColumnName")
     * // the properties below are optional
     * .accuracyCostTradeoff(123)
     * .enforceProvidedLabels(false)
     * .precisionRecallTradeoff(123)
     * .build())
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-mltransform-transformparameters.html)
     */
    public inline fun cfnMLTransformTransformParametersProperty(
        block: CfnMLTransformTransformParametersPropertyDsl.() -> Unit = {}
    ): CfnMLTransform.TransformParametersProperty {
        val builder = CfnMLTransformTransformParametersPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The `AWS::Glue::Partition` resource creates an AWS Glue partition, which represents a slice
     * of table data.
     *
     * For more information, see
     * [CreatePartition Action](https://docs.aws.amazon.com/glue/latest/dg/aws-glue-api-catalog-partitions.html#aws-glue-api-catalog-partitions-CreatePartition)
     * and
     * [Partition Structure](https://docs.aws.amazon.com/glue/latest/dg/aws-glue-api-catalog-partitions.html#aws-glue-api-catalog-partitions-Partition)
     * in the *AWS Glue Developer Guide* .
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.glue.*;
     * Object parameters;
     * Object skewedColumnValueLocationMaps;
     * CfnPartition cfnPartition = CfnPartition.Builder.create(this, "MyCfnPartition")
     * .catalogId("catalogId")
     * .databaseName("databaseName")
     * .partitionInput(PartitionInputProperty.builder()
     * .values(List.of("values"))
     * // the properties below are optional
     * .parameters(parameters)
     * .storageDescriptor(StorageDescriptorProperty.builder()
     * .bucketColumns(List.of("bucketColumns"))
     * .columns(List.of(ColumnProperty.builder()
     * .name("name")
     * // the properties below are optional
     * .comment("comment")
     * .type("type")
     * .build()))
     * .compressed(false)
     * .inputFormat("inputFormat")
     * .location("location")
     * .numberOfBuckets(123)
     * .outputFormat("outputFormat")
     * .parameters(parameters)
     * .schemaReference(SchemaReferenceProperty.builder()
     * .schemaId(SchemaIdProperty.builder()
     * .registryName("registryName")
     * .schemaArn("schemaArn")
     * .schemaName("schemaName")
     * .build())
     * .schemaVersionId("schemaVersionId")
     * .schemaVersionNumber(123)
     * .build())
     * .serdeInfo(SerdeInfoProperty.builder()
     * .name("name")
     * .parameters(parameters)
     * .serializationLibrary("serializationLibrary")
     * .build())
     * .skewedInfo(SkewedInfoProperty.builder()
     * .skewedColumnNames(List.of("skewedColumnNames"))
     * .skewedColumnValueLocationMaps(skewedColumnValueLocationMaps)
     * .skewedColumnValues(List.of("skewedColumnValues"))
     * .build())
     * .sortColumns(List.of(OrderProperty.builder()
     * .column("column")
     * // the properties below are optional
     * .sortOrder(123)
     * .build()))
     * .storedAsSubDirectories(false)
     * .build())
     * .build())
     * .tableName("tableName")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-partition.html)
     */
    public inline fun cfnPartition(
        scope: Construct,
        id: String,
        block: CfnPartitionDsl.() -> Unit = {},
    ): CfnPartition {
        val builder = CfnPartitionDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * A column in a `Table` .
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.glue.*;
     * ColumnProperty columnProperty = ColumnProperty.builder()
     * .name("name")
     * // the properties below are optional
     * .comment("comment")
     * .type("type")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-partition-column.html)
     */
    public inline fun cfnPartitionColumnProperty(
        block: CfnPartitionColumnPropertyDsl.() -> Unit = {}
    ): CfnPartition.ColumnProperty {
        val builder = CfnPartitionColumnPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Specifies the sort order of a sorted column.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.glue.*;
     * OrderProperty orderProperty = OrderProperty.builder()
     * .column("column")
     * // the properties below are optional
     * .sortOrder(123)
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-partition-order.html)
     */
    public inline fun cfnPartitionOrderProperty(
        block: CfnPartitionOrderPropertyDsl.() -> Unit = {}
    ): CfnPartition.OrderProperty {
        val builder = CfnPartitionOrderPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The structure used to create and update a partition.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.glue.*;
     * Object parameters;
     * Object skewedColumnValueLocationMaps;
     * PartitionInputProperty partitionInputProperty = PartitionInputProperty.builder()
     * .values(List.of("values"))
     * // the properties below are optional
     * .parameters(parameters)
     * .storageDescriptor(StorageDescriptorProperty.builder()
     * .bucketColumns(List.of("bucketColumns"))
     * .columns(List.of(ColumnProperty.builder()
     * .name("name")
     * // the properties below are optional
     * .comment("comment")
     * .type("type")
     * .build()))
     * .compressed(false)
     * .inputFormat("inputFormat")
     * .location("location")
     * .numberOfBuckets(123)
     * .outputFormat("outputFormat")
     * .parameters(parameters)
     * .schemaReference(SchemaReferenceProperty.builder()
     * .schemaId(SchemaIdProperty.builder()
     * .registryName("registryName")
     * .schemaArn("schemaArn")
     * .schemaName("schemaName")
     * .build())
     * .schemaVersionId("schemaVersionId")
     * .schemaVersionNumber(123)
     * .build())
     * .serdeInfo(SerdeInfoProperty.builder()
     * .name("name")
     * .parameters(parameters)
     * .serializationLibrary("serializationLibrary")
     * .build())
     * .skewedInfo(SkewedInfoProperty.builder()
     * .skewedColumnNames(List.of("skewedColumnNames"))
     * .skewedColumnValueLocationMaps(skewedColumnValueLocationMaps)
     * .skewedColumnValues(List.of("skewedColumnValues"))
     * .build())
     * .sortColumns(List.of(OrderProperty.builder()
     * .column("column")
     * // the properties below are optional
     * .sortOrder(123)
     * .build()))
     * .storedAsSubDirectories(false)
     * .build())
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-partition-partitioninput.html)
     */
    public inline fun cfnPartitionPartitionInputProperty(
        block: CfnPartitionPartitionInputPropertyDsl.() -> Unit = {}
    ): CfnPartition.PartitionInputProperty {
        val builder = CfnPartitionPartitionInputPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnPartition`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.glue.*;
     * Object parameters;
     * Object skewedColumnValueLocationMaps;
     * CfnPartitionProps cfnPartitionProps = CfnPartitionProps.builder()
     * .catalogId("catalogId")
     * .databaseName("databaseName")
     * .partitionInput(PartitionInputProperty.builder()
     * .values(List.of("values"))
     * // the properties below are optional
     * .parameters(parameters)
     * .storageDescriptor(StorageDescriptorProperty.builder()
     * .bucketColumns(List.of("bucketColumns"))
     * .columns(List.of(ColumnProperty.builder()
     * .name("name")
     * // the properties below are optional
     * .comment("comment")
     * .type("type")
     * .build()))
     * .compressed(false)
     * .inputFormat("inputFormat")
     * .location("location")
     * .numberOfBuckets(123)
     * .outputFormat("outputFormat")
     * .parameters(parameters)
     * .schemaReference(SchemaReferenceProperty.builder()
     * .schemaId(SchemaIdProperty.builder()
     * .registryName("registryName")
     * .schemaArn("schemaArn")
     * .schemaName("schemaName")
     * .build())
     * .schemaVersionId("schemaVersionId")
     * .schemaVersionNumber(123)
     * .build())
     * .serdeInfo(SerdeInfoProperty.builder()
     * .name("name")
     * .parameters(parameters)
     * .serializationLibrary("serializationLibrary")
     * .build())
     * .skewedInfo(SkewedInfoProperty.builder()
     * .skewedColumnNames(List.of("skewedColumnNames"))
     * .skewedColumnValueLocationMaps(skewedColumnValueLocationMaps)
     * .skewedColumnValues(List.of("skewedColumnValues"))
     * .build())
     * .sortColumns(List.of(OrderProperty.builder()
     * .column("column")
     * // the properties below are optional
     * .sortOrder(123)
     * .build()))
     * .storedAsSubDirectories(false)
     * .build())
     * .build())
     * .tableName("tableName")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-partition.html)
     */
    public inline fun cfnPartitionProps(
        block: CfnPartitionPropsDsl.() -> Unit = {}
    ): CfnPartitionProps {
        val builder = CfnPartitionPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * A structure that contains schema identity fields.
     *
     * Either this or the `SchemaVersionId` has to be provided.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.glue.*;
     * SchemaIdProperty schemaIdProperty = SchemaIdProperty.builder()
     * .registryName("registryName")
     * .schemaArn("schemaArn")
     * .schemaName("schemaName")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-partition-schemaid.html)
     */
    public inline fun cfnPartitionSchemaIdProperty(
        block: CfnPartitionSchemaIdPropertyDsl.() -> Unit = {}
    ): CfnPartition.SchemaIdProperty {
        val builder = CfnPartitionSchemaIdPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * An object that references a schema stored in the AWS Glue Schema Registry.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.glue.*;
     * SchemaReferenceProperty schemaReferenceProperty = SchemaReferenceProperty.builder()
     * .schemaId(SchemaIdProperty.builder()
     * .registryName("registryName")
     * .schemaArn("schemaArn")
     * .schemaName("schemaName")
     * .build())
     * .schemaVersionId("schemaVersionId")
     * .schemaVersionNumber(123)
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-partition-schemareference.html)
     */
    public inline fun cfnPartitionSchemaReferenceProperty(
        block: CfnPartitionSchemaReferencePropertyDsl.() -> Unit = {}
    ): CfnPartition.SchemaReferenceProperty {
        val builder = CfnPartitionSchemaReferencePropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Information about a serialization/deserialization program (SerDe) that serves as an extractor
     * and loader.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.glue.*;
     * Object parameters;
     * SerdeInfoProperty serdeInfoProperty = SerdeInfoProperty.builder()
     * .name("name")
     * .parameters(parameters)
     * .serializationLibrary("serializationLibrary")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-partition-serdeinfo.html)
     */
    public inline fun cfnPartitionSerdeInfoProperty(
        block: CfnPartitionSerdeInfoPropertyDsl.() -> Unit = {}
    ): CfnPartition.SerdeInfoProperty {
        val builder = CfnPartitionSerdeInfoPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Specifies skewed values in a table.
     *
     * Skewed values are those that occur with very high frequency.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.glue.*;
     * Object skewedColumnValueLocationMaps;
     * SkewedInfoProperty skewedInfoProperty = SkewedInfoProperty.builder()
     * .skewedColumnNames(List.of("skewedColumnNames"))
     * .skewedColumnValueLocationMaps(skewedColumnValueLocationMaps)
     * .skewedColumnValues(List.of("skewedColumnValues"))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-partition-skewedinfo.html)
     */
    public inline fun cfnPartitionSkewedInfoProperty(
        block: CfnPartitionSkewedInfoPropertyDsl.() -> Unit = {}
    ): CfnPartition.SkewedInfoProperty {
        val builder = CfnPartitionSkewedInfoPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Describes the physical storage of table data.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.glue.*;
     * Object parameters;
     * Object skewedColumnValueLocationMaps;
     * StorageDescriptorProperty storageDescriptorProperty = StorageDescriptorProperty.builder()
     * .bucketColumns(List.of("bucketColumns"))
     * .columns(List.of(ColumnProperty.builder()
     * .name("name")
     * // the properties below are optional
     * .comment("comment")
     * .type("type")
     * .build()))
     * .compressed(false)
     * .inputFormat("inputFormat")
     * .location("location")
     * .numberOfBuckets(123)
     * .outputFormat("outputFormat")
     * .parameters(parameters)
     * .schemaReference(SchemaReferenceProperty.builder()
     * .schemaId(SchemaIdProperty.builder()
     * .registryName("registryName")
     * .schemaArn("schemaArn")
     * .schemaName("schemaName")
     * .build())
     * .schemaVersionId("schemaVersionId")
     * .schemaVersionNumber(123)
     * .build())
     * .serdeInfo(SerdeInfoProperty.builder()
     * .name("name")
     * .parameters(parameters)
     * .serializationLibrary("serializationLibrary")
     * .build())
     * .skewedInfo(SkewedInfoProperty.builder()
     * .skewedColumnNames(List.of("skewedColumnNames"))
     * .skewedColumnValueLocationMaps(skewedColumnValueLocationMaps)
     * .skewedColumnValues(List.of("skewedColumnValues"))
     * .build())
     * .sortColumns(List.of(OrderProperty.builder()
     * .column("column")
     * // the properties below are optional
     * .sortOrder(123)
     * .build()))
     * .storedAsSubDirectories(false)
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-partition-storagedescriptor.html)
     */
    public inline fun cfnPartitionStorageDescriptorProperty(
        block: CfnPartitionStorageDescriptorPropertyDsl.() -> Unit = {}
    ): CfnPartition.StorageDescriptorProperty {
        val builder = CfnPartitionStorageDescriptorPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The AWS::Glue::Registry is an AWS Glue resource type that manages registries of schemas in
     * the AWS Glue Schema Registry.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.glue.*;
     * CfnRegistry cfnRegistry = CfnRegistry.Builder.create(this, "MyCfnRegistry")
     * .name("name")
     * // the properties below are optional
     * .description("description")
     * .tags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-registry.html)
     */
    public inline fun cfnRegistry(
        scope: Construct,
        id: String,
        block: CfnRegistryDsl.() -> Unit = {},
    ): CfnRegistry {
        val builder = CfnRegistryDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnRegistry`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.glue.*;
     * CfnRegistryProps cfnRegistryProps = CfnRegistryProps.builder()
     * .name("name")
     * // the properties below are optional
     * .description("description")
     * .tags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-registry.html)
     */
    public inline fun cfnRegistryProps(
        block: CfnRegistryPropsDsl.() -> Unit = {}
    ): CfnRegistryProps {
        val builder = CfnRegistryPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The `AWS::Glue::Schema` is an AWS Glue resource type that manages schemas in the AWS Glue
     * Schema Registry.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.glue.*;
     * CfnSchema cfnSchema = CfnSchema.Builder.create(this, "MyCfnSchema")
     * .compatibility("compatibility")
     * .dataFormat("dataFormat")
     * .name("name")
     * .schemaDefinition("schemaDefinition")
     * // the properties below are optional
     * .checkpointVersion(SchemaVersionProperty.builder()
     * .isLatest(false)
     * .versionNumber(123)
     * .build())
     * .description("description")
     * .registry(RegistryProperty.builder()
     * .arn("arn")
     * .name("name")
     * .build())
     * .tags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-schema.html)
     */
    public inline fun cfnSchema(
        scope: Construct,
        id: String,
        block: CfnSchemaDsl.() -> Unit = {},
    ): CfnSchema {
        val builder = CfnSchemaDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnSchema`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.glue.*;
     * CfnSchemaProps cfnSchemaProps = CfnSchemaProps.builder()
     * .compatibility("compatibility")
     * .dataFormat("dataFormat")
     * .name("name")
     * .schemaDefinition("schemaDefinition")
     * // the properties below are optional
     * .checkpointVersion(SchemaVersionProperty.builder()
     * .isLatest(false)
     * .versionNumber(123)
     * .build())
     * .description("description")
     * .registry(RegistryProperty.builder()
     * .arn("arn")
     * .name("name")
     * .build())
     * .tags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-schema.html)
     */
    public inline fun cfnSchemaProps(block: CfnSchemaPropsDsl.() -> Unit = {}): CfnSchemaProps {
        val builder = CfnSchemaPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Specifies a registry in the AWS Glue Schema Registry.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.glue.*;
     * RegistryProperty registryProperty = RegistryProperty.builder()
     * .arn("arn")
     * .name("name")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-schema-registry.html)
     */
    public inline fun cfnSchemaRegistryProperty(
        block: CfnSchemaRegistryPropertyDsl.() -> Unit = {}
    ): CfnSchema.RegistryProperty {
        val builder = CfnSchemaRegistryPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Specifies the version of a schema.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.glue.*;
     * SchemaVersionProperty schemaVersionProperty = SchemaVersionProperty.builder()
     * .isLatest(false)
     * .versionNumber(123)
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-schema-schemaversion.html)
     */
    public inline fun cfnSchemaSchemaVersionProperty(
        block: CfnSchemaSchemaVersionPropertyDsl.() -> Unit = {}
    ): CfnSchema.SchemaVersionProperty {
        val builder = CfnSchemaSchemaVersionPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The `AWS::Glue::SchemaVersion` is an AWS Glue resource type that manages schema versions of
     * schemas in the AWS Glue Schema Registry.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.glue.*;
     * CfnSchemaVersion cfnSchemaVersion = CfnSchemaVersion.Builder.create(this, "MyCfnSchemaVersion")
     * .schema(SchemaProperty.builder()
     * .registryName("registryName")
     * .schemaArn("schemaArn")
     * .schemaName("schemaName")
     * .build())
     * .schemaDefinition("schemaDefinition")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-schemaversion.html)
     */
    public inline fun cfnSchemaVersion(
        scope: Construct,
        id: String,
        block: CfnSchemaVersionDsl.() -> Unit = {},
    ): CfnSchemaVersion {
        val builder = CfnSchemaVersionDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * The `AWS::Glue::SchemaVersionMetadata` is an AWS Glue resource type that defines the metadata
     * key-value pairs for a schema version in AWS Glue Schema Registry.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.glue.*;
     * CfnSchemaVersionMetadata cfnSchemaVersionMetadata =
     * CfnSchemaVersionMetadata.Builder.create(this, "MyCfnSchemaVersionMetadata")
     * .key("key")
     * .schemaVersionId("schemaVersionId")
     * .value("value")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-schemaversionmetadata.html)
     */
    public inline fun cfnSchemaVersionMetadata(
        scope: Construct,
        id: String,
        block: CfnSchemaVersionMetadataDsl.() -> Unit = {},
    ): CfnSchemaVersionMetadata {
        val builder = CfnSchemaVersionMetadataDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnSchemaVersionMetadata`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.glue.*;
     * CfnSchemaVersionMetadataProps cfnSchemaVersionMetadataProps =
     * CfnSchemaVersionMetadataProps.builder()
     * .key("key")
     * .schemaVersionId("schemaVersionId")
     * .value("value")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-schemaversionmetadata.html)
     */
    public inline fun cfnSchemaVersionMetadataProps(
        block: CfnSchemaVersionMetadataPropsDsl.() -> Unit = {}
    ): CfnSchemaVersionMetadataProps {
        val builder = CfnSchemaVersionMetadataPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnSchemaVersion`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.glue.*;
     * CfnSchemaVersionProps cfnSchemaVersionProps = CfnSchemaVersionProps.builder()
     * .schema(SchemaProperty.builder()
     * .registryName("registryName")
     * .schemaArn("schemaArn")
     * .schemaName("schemaName")
     * .build())
     * .schemaDefinition("schemaDefinition")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-schemaversion.html)
     */
    public inline fun cfnSchemaVersionProps(
        block: CfnSchemaVersionPropsDsl.() -> Unit = {}
    ): CfnSchemaVersionProps {
        val builder = CfnSchemaVersionPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * A wrapper structure to contain schema identity fields.
     *
     * Either `SchemaArn` , or `SchemaName` and `RegistryName` has to be provided.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.glue.*;
     * SchemaProperty schemaProperty = SchemaProperty.builder()
     * .registryName("registryName")
     * .schemaArn("schemaArn")
     * .schemaName("schemaName")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-schemaversion-schema.html)
     */
    public inline fun cfnSchemaVersionSchemaProperty(
        block: CfnSchemaVersionSchemaPropertyDsl.() -> Unit = {}
    ): CfnSchemaVersion.SchemaProperty {
        val builder = CfnSchemaVersionSchemaPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Creates a new security configuration.
     *
     * A security configuration is a set of security properties that can be used by AWS Glue . You
     * can use a security configuration to encrypt data at rest. For information about using
     * security configurations in AWS Glue , see
     * [Encrypting Data Written by Crawlers, Jobs, and Development Endpoints](https://docs.aws.amazon.com/glue/latest/dg/encryption-security-configuration.html)
     * .
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.glue.*;
     * CfnSecurityConfiguration cfnSecurityConfiguration =
     * CfnSecurityConfiguration.Builder.create(this, "MyCfnSecurityConfiguration")
     * .encryptionConfiguration(EncryptionConfigurationProperty.builder()
     * .cloudWatchEncryption(CloudWatchEncryptionProperty.builder()
     * .cloudWatchEncryptionMode("cloudWatchEncryptionMode")
     * .kmsKeyArn("kmsKeyArn")
     * .build())
     * .jobBookmarksEncryption(JobBookmarksEncryptionProperty.builder()
     * .jobBookmarksEncryptionMode("jobBookmarksEncryptionMode")
     * .kmsKeyArn("kmsKeyArn")
     * .build())
     * .s3Encryptions(List.of(S3EncryptionProperty.builder()
     * .kmsKeyArn("kmsKeyArn")
     * .s3EncryptionMode("s3EncryptionMode")
     * .build()))
     * .build())
     * .name("name")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-securityconfiguration.html)
     */
    public inline fun cfnSecurityConfiguration(
        scope: Construct,
        id: String,
        block: CfnSecurityConfigurationDsl.() -> Unit = {},
    ): CfnSecurityConfiguration {
        val builder = CfnSecurityConfigurationDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Specifies how Amazon CloudWatch data should be encrypted.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.glue.*;
     * CloudWatchEncryptionProperty cloudWatchEncryptionProperty =
     * CloudWatchEncryptionProperty.builder()
     * .cloudWatchEncryptionMode("cloudWatchEncryptionMode")
     * .kmsKeyArn("kmsKeyArn")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-securityconfiguration-cloudwatchencryption.html)
     */
    public inline fun cfnSecurityConfigurationCloudWatchEncryptionProperty(
        block: CfnSecurityConfigurationCloudWatchEncryptionPropertyDsl.() -> Unit = {}
    ): CfnSecurityConfiguration.CloudWatchEncryptionProperty {
        val builder = CfnSecurityConfigurationCloudWatchEncryptionPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Specifies an encryption configuration.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.glue.*;
     * EncryptionConfigurationProperty encryptionConfigurationProperty =
     * EncryptionConfigurationProperty.builder()
     * .cloudWatchEncryption(CloudWatchEncryptionProperty.builder()
     * .cloudWatchEncryptionMode("cloudWatchEncryptionMode")
     * .kmsKeyArn("kmsKeyArn")
     * .build())
     * .jobBookmarksEncryption(JobBookmarksEncryptionProperty.builder()
     * .jobBookmarksEncryptionMode("jobBookmarksEncryptionMode")
     * .kmsKeyArn("kmsKeyArn")
     * .build())
     * .s3Encryptions(List.of(S3EncryptionProperty.builder()
     * .kmsKeyArn("kmsKeyArn")
     * .s3EncryptionMode("s3EncryptionMode")
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-securityconfiguration-encryptionconfiguration.html)
     */
    public inline fun cfnSecurityConfigurationEncryptionConfigurationProperty(
        block: CfnSecurityConfigurationEncryptionConfigurationPropertyDsl.() -> Unit = {}
    ): CfnSecurityConfiguration.EncryptionConfigurationProperty {
        val builder = CfnSecurityConfigurationEncryptionConfigurationPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Specifies how job bookmark data should be encrypted.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.glue.*;
     * JobBookmarksEncryptionProperty jobBookmarksEncryptionProperty =
     * JobBookmarksEncryptionProperty.builder()
     * .jobBookmarksEncryptionMode("jobBookmarksEncryptionMode")
     * .kmsKeyArn("kmsKeyArn")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-securityconfiguration-jobbookmarksencryption.html)
     */
    public inline fun cfnSecurityConfigurationJobBookmarksEncryptionProperty(
        block: CfnSecurityConfigurationJobBookmarksEncryptionPropertyDsl.() -> Unit = {}
    ): CfnSecurityConfiguration.JobBookmarksEncryptionProperty {
        val builder = CfnSecurityConfigurationJobBookmarksEncryptionPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnSecurityConfiguration`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.glue.*;
     * CfnSecurityConfigurationProps cfnSecurityConfigurationProps =
     * CfnSecurityConfigurationProps.builder()
     * .encryptionConfiguration(EncryptionConfigurationProperty.builder()
     * .cloudWatchEncryption(CloudWatchEncryptionProperty.builder()
     * .cloudWatchEncryptionMode("cloudWatchEncryptionMode")
     * .kmsKeyArn("kmsKeyArn")
     * .build())
     * .jobBookmarksEncryption(JobBookmarksEncryptionProperty.builder()
     * .jobBookmarksEncryptionMode("jobBookmarksEncryptionMode")
     * .kmsKeyArn("kmsKeyArn")
     * .build())
     * .s3Encryptions(List.of(S3EncryptionProperty.builder()
     * .kmsKeyArn("kmsKeyArn")
     * .s3EncryptionMode("s3EncryptionMode")
     * .build()))
     * .build())
     * .name("name")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-securityconfiguration.html)
     */
    public inline fun cfnSecurityConfigurationProps(
        block: CfnSecurityConfigurationPropsDsl.() -> Unit = {}
    ): CfnSecurityConfigurationProps {
        val builder = CfnSecurityConfigurationPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Specifies how Amazon Simple Storage Service (Amazon S3) data should be encrypted.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.glue.*;
     * S3EncryptionProperty s3EncryptionProperty = S3EncryptionProperty.builder()
     * .kmsKeyArn("kmsKeyArn")
     * .s3EncryptionMode("s3EncryptionMode")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-securityconfiguration-s3encryption.html)
     */
    public inline fun cfnSecurityConfigurationS3EncryptionProperty(
        block: CfnSecurityConfigurationS3EncryptionPropertyDsl.() -> Unit = {}
    ): CfnSecurityConfiguration.S3EncryptionProperty {
        val builder = CfnSecurityConfigurationS3EncryptionPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The `AWS::Glue::Table` resource specifies tabular data in the AWS Glue data catalog.
     *
     * For more information, see
     * [Defining Tables in the AWS Glue Data Catalog](https://docs.aws.amazon.com/glue/latest/dg/tables-described.html)
     * and
     * [Table Structure](https://docs.aws.amazon.com/glue/latest/dg/aws-glue-api-catalog-tables.html#aws-glue-api-catalog-tables-Table)
     * in the *AWS Glue Developer Guide* .
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.glue.*;
     * Object parameters;
     * Object skewedColumnValueLocationMaps;
     * CfnTable cfnTable = CfnTable.Builder.create(this, "MyCfnTable")
     * .catalogId("catalogId")
     * .databaseName("databaseName")
     * .tableInput(TableInputProperty.builder()
     * .description("description")
     * .name("name")
     * .owner("owner")
     * .parameters(parameters)
     * .partitionKeys(List.of(ColumnProperty.builder()
     * .name("name")
     * // the properties below are optional
     * .comment("comment")
     * .type("type")
     * .build()))
     * .retention(123)
     * .storageDescriptor(StorageDescriptorProperty.builder()
     * .bucketColumns(List.of("bucketColumns"))
     * .columns(List.of(ColumnProperty.builder()
     * .name("name")
     * // the properties below are optional
     * .comment("comment")
     * .type("type")
     * .build()))
     * .compressed(false)
     * .inputFormat("inputFormat")
     * .location("location")
     * .numberOfBuckets(123)
     * .outputFormat("outputFormat")
     * .parameters(parameters)
     * .schemaReference(SchemaReferenceProperty.builder()
     * .schemaId(SchemaIdProperty.builder()
     * .registryName("registryName")
     * .schemaArn("schemaArn")
     * .schemaName("schemaName")
     * .build())
     * .schemaVersionId("schemaVersionId")
     * .schemaVersionNumber(123)
     * .build())
     * .serdeInfo(SerdeInfoProperty.builder()
     * .name("name")
     * .parameters(parameters)
     * .serializationLibrary("serializationLibrary")
     * .build())
     * .skewedInfo(SkewedInfoProperty.builder()
     * .skewedColumnNames(List.of("skewedColumnNames"))
     * .skewedColumnValueLocationMaps(skewedColumnValueLocationMaps)
     * .skewedColumnValues(List.of("skewedColumnValues"))
     * .build())
     * .sortColumns(List.of(OrderProperty.builder()
     * .column("column")
     * .sortOrder(123)
     * .build()))
     * .storedAsSubDirectories(false)
     * .build())
     * .tableType("tableType")
     * .targetTable(TableIdentifierProperty.builder()
     * .catalogId("catalogId")
     * .databaseName("databaseName")
     * .name("name")
     * .build())
     * .viewExpandedText("viewExpandedText")
     * .viewOriginalText("viewOriginalText")
     * .build())
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-table.html)
     */
    public inline fun cfnTable(
        scope: Construct,
        id: String,
        block: CfnTableDsl.() -> Unit = {},
    ): CfnTable {
        val builder = CfnTableDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * A column in a `Table` .
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.glue.*;
     * ColumnProperty columnProperty = ColumnProperty.builder()
     * .name("name")
     * // the properties below are optional
     * .comment("comment")
     * .type("type")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-table-column.html)
     */
    public inline fun cfnTableColumnProperty(
        block: CfnTableColumnPropertyDsl.() -> Unit = {}
    ): CfnTable.ColumnProperty {
        val builder = CfnTableColumnPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Specifies the sort order of a sorted column.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.glue.*;
     * OrderProperty orderProperty = OrderProperty.builder()
     * .column("column")
     * .sortOrder(123)
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-table-order.html)
     */
    public inline fun cfnTableOrderProperty(
        block: CfnTableOrderPropertyDsl.() -> Unit = {}
    ): CfnTable.OrderProperty {
        val builder = CfnTableOrderPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnTable`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.glue.*;
     * Object parameters;
     * Object skewedColumnValueLocationMaps;
     * CfnTableProps cfnTableProps = CfnTableProps.builder()
     * .catalogId("catalogId")
     * .databaseName("databaseName")
     * .tableInput(TableInputProperty.builder()
     * .description("description")
     * .name("name")
     * .owner("owner")
     * .parameters(parameters)
     * .partitionKeys(List.of(ColumnProperty.builder()
     * .name("name")
     * // the properties below are optional
     * .comment("comment")
     * .type("type")
     * .build()))
     * .retention(123)
     * .storageDescriptor(StorageDescriptorProperty.builder()
     * .bucketColumns(List.of("bucketColumns"))
     * .columns(List.of(ColumnProperty.builder()
     * .name("name")
     * // the properties below are optional
     * .comment("comment")
     * .type("type")
     * .build()))
     * .compressed(false)
     * .inputFormat("inputFormat")
     * .location("location")
     * .numberOfBuckets(123)
     * .outputFormat("outputFormat")
     * .parameters(parameters)
     * .schemaReference(SchemaReferenceProperty.builder()
     * .schemaId(SchemaIdProperty.builder()
     * .registryName("registryName")
     * .schemaArn("schemaArn")
     * .schemaName("schemaName")
     * .build())
     * .schemaVersionId("schemaVersionId")
     * .schemaVersionNumber(123)
     * .build())
     * .serdeInfo(SerdeInfoProperty.builder()
     * .name("name")
     * .parameters(parameters)
     * .serializationLibrary("serializationLibrary")
     * .build())
     * .skewedInfo(SkewedInfoProperty.builder()
     * .skewedColumnNames(List.of("skewedColumnNames"))
     * .skewedColumnValueLocationMaps(skewedColumnValueLocationMaps)
     * .skewedColumnValues(List.of("skewedColumnValues"))
     * .build())
     * .sortColumns(List.of(OrderProperty.builder()
     * .column("column")
     * .sortOrder(123)
     * .build()))
     * .storedAsSubDirectories(false)
     * .build())
     * .tableType("tableType")
     * .targetTable(TableIdentifierProperty.builder()
     * .catalogId("catalogId")
     * .databaseName("databaseName")
     * .name("name")
     * .build())
     * .viewExpandedText("viewExpandedText")
     * .viewOriginalText("viewOriginalText")
     * .build())
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-table.html)
     */
    public inline fun cfnTableProps(block: CfnTablePropsDsl.() -> Unit = {}): CfnTableProps {
        val builder = CfnTablePropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * A structure that contains schema identity fields.
     *
     * Either this or the `SchemaVersionId` has to be provided.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.glue.*;
     * SchemaIdProperty schemaIdProperty = SchemaIdProperty.builder()
     * .registryName("registryName")
     * .schemaArn("schemaArn")
     * .schemaName("schemaName")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-table-schemaid.html)
     */
    public inline fun cfnTableSchemaIdProperty(
        block: CfnTableSchemaIdPropertyDsl.() -> Unit = {}
    ): CfnTable.SchemaIdProperty {
        val builder = CfnTableSchemaIdPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * An object that references a schema stored in the AWS Glue Schema Registry.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.glue.*;
     * SchemaReferenceProperty schemaReferenceProperty = SchemaReferenceProperty.builder()
     * .schemaId(SchemaIdProperty.builder()
     * .registryName("registryName")
     * .schemaArn("schemaArn")
     * .schemaName("schemaName")
     * .build())
     * .schemaVersionId("schemaVersionId")
     * .schemaVersionNumber(123)
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-table-schemareference.html)
     */
    public inline fun cfnTableSchemaReferenceProperty(
        block: CfnTableSchemaReferencePropertyDsl.() -> Unit = {}
    ): CfnTable.SchemaReferenceProperty {
        val builder = CfnTableSchemaReferencePropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Information about a serialization/deserialization program (SerDe) that serves as an extractor
     * and loader.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.glue.*;
     * Object parameters;
     * SerdeInfoProperty serdeInfoProperty = SerdeInfoProperty.builder()
     * .name("name")
     * .parameters(parameters)
     * .serializationLibrary("serializationLibrary")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-table-serdeinfo.html)
     */
    public inline fun cfnTableSerdeInfoProperty(
        block: CfnTableSerdeInfoPropertyDsl.() -> Unit = {}
    ): CfnTable.SerdeInfoProperty {
        val builder = CfnTableSerdeInfoPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Specifies skewed values in a table.
     *
     * Skewed values are those that occur with very high frequency.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.glue.*;
     * Object skewedColumnValueLocationMaps;
     * SkewedInfoProperty skewedInfoProperty = SkewedInfoProperty.builder()
     * .skewedColumnNames(List.of("skewedColumnNames"))
     * .skewedColumnValueLocationMaps(skewedColumnValueLocationMaps)
     * .skewedColumnValues(List.of("skewedColumnValues"))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-table-skewedinfo.html)
     */
    public inline fun cfnTableSkewedInfoProperty(
        block: CfnTableSkewedInfoPropertyDsl.() -> Unit = {}
    ): CfnTable.SkewedInfoProperty {
        val builder = CfnTableSkewedInfoPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Describes the physical storage of table data.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.glue.*;
     * Object parameters;
     * Object skewedColumnValueLocationMaps;
     * StorageDescriptorProperty storageDescriptorProperty = StorageDescriptorProperty.builder()
     * .bucketColumns(List.of("bucketColumns"))
     * .columns(List.of(ColumnProperty.builder()
     * .name("name")
     * // the properties below are optional
     * .comment("comment")
     * .type("type")
     * .build()))
     * .compressed(false)
     * .inputFormat("inputFormat")
     * .location("location")
     * .numberOfBuckets(123)
     * .outputFormat("outputFormat")
     * .parameters(parameters)
     * .schemaReference(SchemaReferenceProperty.builder()
     * .schemaId(SchemaIdProperty.builder()
     * .registryName("registryName")
     * .schemaArn("schemaArn")
     * .schemaName("schemaName")
     * .build())
     * .schemaVersionId("schemaVersionId")
     * .schemaVersionNumber(123)
     * .build())
     * .serdeInfo(SerdeInfoProperty.builder()
     * .name("name")
     * .parameters(parameters)
     * .serializationLibrary("serializationLibrary")
     * .build())
     * .skewedInfo(SkewedInfoProperty.builder()
     * .skewedColumnNames(List.of("skewedColumnNames"))
     * .skewedColumnValueLocationMaps(skewedColumnValueLocationMaps)
     * .skewedColumnValues(List.of("skewedColumnValues"))
     * .build())
     * .sortColumns(List.of(OrderProperty.builder()
     * .column("column")
     * .sortOrder(123)
     * .build()))
     * .storedAsSubDirectories(false)
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-table-storagedescriptor.html)
     */
    public inline fun cfnTableStorageDescriptorProperty(
        block: CfnTableStorageDescriptorPropertyDsl.() -> Unit = {}
    ): CfnTable.StorageDescriptorProperty {
        val builder = CfnTableStorageDescriptorPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * A structure that describes a target table for resource linking.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.glue.*;
     * TableIdentifierProperty tableIdentifierProperty = TableIdentifierProperty.builder()
     * .catalogId("catalogId")
     * .databaseName("databaseName")
     * .name("name")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-table-tableidentifier.html)
     */
    public inline fun cfnTableTableIdentifierProperty(
        block: CfnTableTableIdentifierPropertyDsl.() -> Unit = {}
    ): CfnTable.TableIdentifierProperty {
        val builder = CfnTableTableIdentifierPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * A structure used to define a table.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.glue.*;
     * Object parameters;
     * Object skewedColumnValueLocationMaps;
     * TableInputProperty tableInputProperty = TableInputProperty.builder()
     * .description("description")
     * .name("name")
     * .owner("owner")
     * .parameters(parameters)
     * .partitionKeys(List.of(ColumnProperty.builder()
     * .name("name")
     * // the properties below are optional
     * .comment("comment")
     * .type("type")
     * .build()))
     * .retention(123)
     * .storageDescriptor(StorageDescriptorProperty.builder()
     * .bucketColumns(List.of("bucketColumns"))
     * .columns(List.of(ColumnProperty.builder()
     * .name("name")
     * // the properties below are optional
     * .comment("comment")
     * .type("type")
     * .build()))
     * .compressed(false)
     * .inputFormat("inputFormat")
     * .location("location")
     * .numberOfBuckets(123)
     * .outputFormat("outputFormat")
     * .parameters(parameters)
     * .schemaReference(SchemaReferenceProperty.builder()
     * .schemaId(SchemaIdProperty.builder()
     * .registryName("registryName")
     * .schemaArn("schemaArn")
     * .schemaName("schemaName")
     * .build())
     * .schemaVersionId("schemaVersionId")
     * .schemaVersionNumber(123)
     * .build())
     * .serdeInfo(SerdeInfoProperty.builder()
     * .name("name")
     * .parameters(parameters)
     * .serializationLibrary("serializationLibrary")
     * .build())
     * .skewedInfo(SkewedInfoProperty.builder()
     * .skewedColumnNames(List.of("skewedColumnNames"))
     * .skewedColumnValueLocationMaps(skewedColumnValueLocationMaps)
     * .skewedColumnValues(List.of("skewedColumnValues"))
     * .build())
     * .sortColumns(List.of(OrderProperty.builder()
     * .column("column")
     * .sortOrder(123)
     * .build()))
     * .storedAsSubDirectories(false)
     * .build())
     * .tableType("tableType")
     * .targetTable(TableIdentifierProperty.builder()
     * .catalogId("catalogId")
     * .databaseName("databaseName")
     * .name("name")
     * .build())
     * .viewExpandedText("viewExpandedText")
     * .viewOriginalText("viewOriginalText")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-table-tableinput.html)
     */
    public inline fun cfnTableTableInputProperty(
        block: CfnTableTableInputPropertyDsl.() -> Unit = {}
    ): CfnTable.TableInputProperty {
        val builder = CfnTableTableInputPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The `AWS::Glue::Trigger` resource specifies triggers that run AWS Glue jobs.
     *
     * For more information, see
     * [Triggering Jobs in AWS Glue](https://docs.aws.amazon.com/glue/latest/dg/trigger-job.html)
     * and
     * [Trigger Structure](https://docs.aws.amazon.com/glue/latest/dg/aws-glue-api-jobs-trigger.html#aws-glue-api-jobs-trigger-Trigger)
     * in the *AWS Glue Developer Guide* .
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.glue.*;
     * Object arguments_;
     * Object tags;
     * CfnTrigger cfnTrigger = CfnTrigger.Builder.create(this, "MyCfnTrigger")
     * .actions(List.of(ActionProperty.builder()
     * .arguments(arguments_)
     * .crawlerName("crawlerName")
     * .jobName("jobName")
     * .notificationProperty(NotificationPropertyProperty.builder()
     * .notifyDelayAfter(123)
     * .build())
     * .securityConfiguration("securityConfiguration")
     * .timeout(123)
     * .build()))
     * .type("type")
     * // the properties below are optional
     * .description("description")
     * .eventBatchingCondition(EventBatchingConditionProperty.builder()
     * .batchSize(123)
     * // the properties below are optional
     * .batchWindow(123)
     * .build())
     * .name("name")
     * .predicate(PredicateProperty.builder()
     * .conditions(List.of(ConditionProperty.builder()
     * .crawlerName("crawlerName")
     * .crawlState("crawlState")
     * .jobName("jobName")
     * .logicalOperator("logicalOperator")
     * .state("state")
     * .build()))
     * .logical("logical")
     * .build())
     * .schedule("schedule")
     * .startOnCreation(false)
     * .tags(tags)
     * .workflowName("workflowName")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-trigger.html)
     */
    public inline fun cfnTrigger(
        scope: Construct,
        id: String,
        block: CfnTriggerDsl.() -> Unit = {},
    ): CfnTrigger {
        val builder = CfnTriggerDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Defines an action to be initiated by a trigger.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.glue.*;
     * Object arguments_;
     * ActionProperty actionProperty = ActionProperty.builder()
     * .arguments(arguments_)
     * .crawlerName("crawlerName")
     * .jobName("jobName")
     * .notificationProperty(NotificationPropertyProperty.builder()
     * .notifyDelayAfter(123)
     * .build())
     * .securityConfiguration("securityConfiguration")
     * .timeout(123)
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-trigger-action.html)
     */
    public inline fun cfnTriggerActionProperty(
        block: CfnTriggerActionPropertyDsl.() -> Unit = {}
    ): CfnTrigger.ActionProperty {
        val builder = CfnTriggerActionPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Defines a condition under which a trigger fires.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.glue.*;
     * ConditionProperty conditionProperty = ConditionProperty.builder()
     * .crawlerName("crawlerName")
     * .crawlState("crawlState")
     * .jobName("jobName")
     * .logicalOperator("logicalOperator")
     * .state("state")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-trigger-condition.html)
     */
    public inline fun cfnTriggerConditionProperty(
        block: CfnTriggerConditionPropertyDsl.() -> Unit = {}
    ): CfnTrigger.ConditionProperty {
        val builder = CfnTriggerConditionPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Batch condition that must be met (specified number of events received or batch time window
     * expired) before EventBridge event trigger fires.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.glue.*;
     * EventBatchingConditionProperty eventBatchingConditionProperty =
     * EventBatchingConditionProperty.builder()
     * .batchSize(123)
     * // the properties below are optional
     * .batchWindow(123)
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-trigger-eventbatchingcondition.html)
     */
    public inline fun cfnTriggerEventBatchingConditionProperty(
        block: CfnTriggerEventBatchingConditionPropertyDsl.() -> Unit = {}
    ): CfnTrigger.EventBatchingConditionProperty {
        val builder = CfnTriggerEventBatchingConditionPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Specifies configuration properties of a job run notification.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.glue.*;
     * NotificationPropertyProperty notificationPropertyProperty =
     * NotificationPropertyProperty.builder()
     * .notifyDelayAfter(123)
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-trigger-notificationproperty.html)
     */
    public inline fun cfnTriggerNotificationPropertyProperty(
        block: CfnTriggerNotificationPropertyPropertyDsl.() -> Unit = {}
    ): CfnTrigger.NotificationPropertyProperty {
        val builder = CfnTriggerNotificationPropertyPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Defines the predicate of the trigger, which determines when it fires.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.glue.*;
     * PredicateProperty predicateProperty = PredicateProperty.builder()
     * .conditions(List.of(ConditionProperty.builder()
     * .crawlerName("crawlerName")
     * .crawlState("crawlState")
     * .jobName("jobName")
     * .logicalOperator("logicalOperator")
     * .state("state")
     * .build()))
     * .logical("logical")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-trigger-predicate.html)
     */
    public inline fun cfnTriggerPredicateProperty(
        block: CfnTriggerPredicatePropertyDsl.() -> Unit = {}
    ): CfnTrigger.PredicateProperty {
        val builder = CfnTriggerPredicatePropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnTrigger`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.glue.*;
     * Object arguments_;
     * Object tags;
     * CfnTriggerProps cfnTriggerProps = CfnTriggerProps.builder()
     * .actions(List.of(ActionProperty.builder()
     * .arguments(arguments_)
     * .crawlerName("crawlerName")
     * .jobName("jobName")
     * .notificationProperty(NotificationPropertyProperty.builder()
     * .notifyDelayAfter(123)
     * .build())
     * .securityConfiguration("securityConfiguration")
     * .timeout(123)
     * .build()))
     * .type("type")
     * // the properties below are optional
     * .description("description")
     * .eventBatchingCondition(EventBatchingConditionProperty.builder()
     * .batchSize(123)
     * // the properties below are optional
     * .batchWindow(123)
     * .build())
     * .name("name")
     * .predicate(PredicateProperty.builder()
     * .conditions(List.of(ConditionProperty.builder()
     * .crawlerName("crawlerName")
     * .crawlState("crawlState")
     * .jobName("jobName")
     * .logicalOperator("logicalOperator")
     * .state("state")
     * .build()))
     * .logical("logical")
     * .build())
     * .schedule("schedule")
     * .startOnCreation(false)
     * .tags(tags)
     * .workflowName("workflowName")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-trigger.html)
     */
    public inline fun cfnTriggerProps(block: CfnTriggerPropsDsl.() -> Unit = {}): CfnTriggerProps {
        val builder = CfnTriggerPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The `AWS::Glue::Workflow` is an AWS Glue resource type that manages AWS Glue workflows.
     *
     * A workflow is a container for a set of related jobs, crawlers, and triggers in AWS Glue .
     * Using a workflow, you can design a complex multi-job extract, transform, and load (ETL)
     * activity that AWS Glue can execute and track as single entity.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.glue.*;
     * Object defaultRunProperties;
     * Object tags;
     * CfnWorkflow cfnWorkflow = CfnWorkflow.Builder.create(this, "MyCfnWorkflow")
     * .defaultRunProperties(defaultRunProperties)
     * .description("description")
     * .maxConcurrentRuns(123)
     * .name("name")
     * .tags(tags)
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-workflow.html)
     */
    public inline fun cfnWorkflow(
        scope: Construct,
        id: String,
        block: CfnWorkflowDsl.() -> Unit = {},
    ): CfnWorkflow {
        val builder = CfnWorkflowDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnWorkflow`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.glue.*;
     * Object defaultRunProperties;
     * Object tags;
     * CfnWorkflowProps cfnWorkflowProps = CfnWorkflowProps.builder()
     * .defaultRunProperties(defaultRunProperties)
     * .description("description")
     * .maxConcurrentRuns(123)
     * .name("name")
     * .tags(tags)
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-workflow.html)
     */
    public inline fun cfnWorkflowProps(
        block: CfnWorkflowPropsDsl.() -> Unit = {}
    ): CfnWorkflowProps {
        val builder = CfnWorkflowPropsDsl()
        builder.apply(block)
        return builder.build()
    }
}
