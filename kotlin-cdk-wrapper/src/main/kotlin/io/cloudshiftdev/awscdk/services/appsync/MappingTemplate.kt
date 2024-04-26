@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.appsync

import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Boolean
import kotlin.String

/**
 * MappingTemplates for AppSync resolvers.
 *
 * Example:
 *
 * ```
 * // Build a data source for AppSync to access the database.
 * GraphqlApi api;
 * // Create username and password secret for DB Cluster
 * DatabaseSecret secret = DatabaseSecret.Builder.create(this, "AuroraSecret")
 * .username("clusteradmin")
 * .build();
 * // The VPC to place the cluster in
 * Vpc vpc = new Vpc(this, "AuroraVpc");
 * // Create the serverless cluster, provide all values needed to customise the database.
 * ServerlessCluster cluster = ServerlessCluster.Builder.create(this, "AuroraCluster")
 * .engine(DatabaseClusterEngine.AURORA_MYSQL)
 * .vpc(vpc)
 * .credentials(Map.of("username", "clusteradmin"))
 * .clusterIdentifier("db-endpoint-test")
 * .defaultDatabaseName("demos")
 * .build();
 * RdsDataSource rdsDS = api.addRdsDataSource("rds", cluster, secret, "demos");
 * // Set up a resolver for an RDS query.
 * rdsDS.createResolver("QueryGetDemosRdsResolver", BaseResolverProps.builder()
 * .typeName("Query")
 * .fieldName("getDemosRds")
 * .requestMappingTemplate(MappingTemplate.fromString("\n  {\n    \"version\": \"2018-05-29\",\n   
 * \"statements\": [\n      \"SELECT * FROM demos\"\n    ]\n  }\n  "))
 * .responseMappingTemplate(MappingTemplate.fromString("\n   
 * $utils.toJson($utils.rds.toJsonObject($ctx.result)[0])\n  "))
 * .build());
 * // Set up a resolver for an RDS mutation.
 * rdsDS.createResolver("MutationAddDemoRdsResolver", BaseResolverProps.builder()
 * .typeName("Mutation")
 * .fieldName("addDemoRds")
 * .requestMappingTemplate(MappingTemplate.fromString("\n  {\n    \"version\": \"2018-05-29\",\n   
 * \"statements\": [\n      \"INSERT INTO demos VALUES (:id, :version)\",\n      \"SELECT * WHERE id =
 * :id\"\n    ],\n    \"variableMap\": {\n      \":id\": $util.toJson($util.autoId()),\n     
 * \":version\": $util.toJson($ctx.args.version)\n    }\n  }\n  "))
 * .responseMappingTemplate(MappingTemplate.fromString("\n   
 * $utils.toJson($utils.rds.toJsonObject($ctx.result)[1][0])\n  "))
 * .build());
 * ```
 */
public abstract class MappingTemplate(
  cdkObject: software.amazon.awscdk.services.appsync.MappingTemplate,
) : CdkObject(cdkObject) {
  /**
   * this is called to render the mapping template to a VTL string.
   */
  public open fun renderTemplate(): String = unwrap(this).renderTemplate()

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.appsync.MappingTemplate,
  ) : MappingTemplate(cdkObject)

  public companion object {
    public fun dynamoDbDeleteItem(keyName: String, idArg: String): MappingTemplate =
        software.amazon.awscdk.services.appsync.MappingTemplate.dynamoDbDeleteItem(keyName,
        idArg).let(MappingTemplate::wrap)

    public fun dynamoDbGetItem(keyName: String, idArg: String): MappingTemplate =
        software.amazon.awscdk.services.appsync.MappingTemplate.dynamoDbGetItem(keyName,
        idArg).let(MappingTemplate::wrap)

    public fun dynamoDbGetItem(
      keyName: String,
      idArg: String,
      consistentRead: Boolean,
    ): MappingTemplate =
        software.amazon.awscdk.services.appsync.MappingTemplate.dynamoDbGetItem(keyName, idArg,
        consistentRead).let(MappingTemplate::wrap)

    public fun dynamoDbPutItem(key: PrimaryKey, values: AttributeValues): MappingTemplate =
        software.amazon.awscdk.services.appsync.MappingTemplate.dynamoDbPutItem(key.let(PrimaryKey::unwrap),
        values.let(AttributeValues::unwrap)).let(MappingTemplate::wrap)

    public fun dynamoDbQuery(cond: KeyCondition): MappingTemplate =
        software.amazon.awscdk.services.appsync.MappingTemplate.dynamoDbQuery(cond.let(KeyCondition::unwrap)).let(MappingTemplate::wrap)

    public fun dynamoDbQuery(cond: KeyCondition, indexName: String): MappingTemplate =
        software.amazon.awscdk.services.appsync.MappingTemplate.dynamoDbQuery(cond.let(KeyCondition::unwrap),
        indexName).let(MappingTemplate::wrap)

    public fun dynamoDbQuery(
      cond: KeyCondition,
      indexName: String,
      consistentRead: Boolean,
    ): MappingTemplate =
        software.amazon.awscdk.services.appsync.MappingTemplate.dynamoDbQuery(cond.let(KeyCondition::unwrap),
        indexName, consistentRead).let(MappingTemplate::wrap)

    public fun dynamoDbResultItem(): MappingTemplate =
        software.amazon.awscdk.services.appsync.MappingTemplate.dynamoDbResultItem().let(MappingTemplate::wrap)

    public fun dynamoDbResultList(): MappingTemplate =
        software.amazon.awscdk.services.appsync.MappingTemplate.dynamoDbResultList().let(MappingTemplate::wrap)

    public fun dynamoDbScanTable(): MappingTemplate =
        software.amazon.awscdk.services.appsync.MappingTemplate.dynamoDbScanTable().let(MappingTemplate::wrap)

    public fun dynamoDbScanTable(consistentRead: Boolean): MappingTemplate =
        software.amazon.awscdk.services.appsync.MappingTemplate.dynamoDbScanTable(consistentRead).let(MappingTemplate::wrap)

    public fun fromFile(fileName: String): MappingTemplate =
        software.amazon.awscdk.services.appsync.MappingTemplate.fromFile(fileName).let(MappingTemplate::wrap)

    public fun fromString(template: String): MappingTemplate =
        software.amazon.awscdk.services.appsync.MappingTemplate.fromString(template).let(MappingTemplate::wrap)

    public fun lambdaRequest(): MappingTemplate =
        software.amazon.awscdk.services.appsync.MappingTemplate.lambdaRequest().let(MappingTemplate::wrap)

    public fun lambdaRequest(payload: String): MappingTemplate =
        software.amazon.awscdk.services.appsync.MappingTemplate.lambdaRequest(payload).let(MappingTemplate::wrap)

    public fun lambdaRequest(payload: String, operation: String): MappingTemplate =
        software.amazon.awscdk.services.appsync.MappingTemplate.lambdaRequest(payload,
        operation).let(MappingTemplate::wrap)

    public fun lambdaResult(): MappingTemplate =
        software.amazon.awscdk.services.appsync.MappingTemplate.lambdaResult().let(MappingTemplate::wrap)

    internal fun wrap(cdkObject: software.amazon.awscdk.services.appsync.MappingTemplate):
        MappingTemplate = CdkObjectWrappers.wrap(cdkObject) as? MappingTemplate ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: MappingTemplate):
        software.amazon.awscdk.services.appsync.MappingTemplate = (wrapped as CdkObject).cdkObject
        as software.amazon.awscdk.services.appsync.MappingTemplate
  }
}
