@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.appsync

import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.String

/**
 * Specifies the assignment to the primary key.
 *
 * It either
 * contains the full primary key or only the partition key.
 *
 * Example:
 *
 * ```
 * GraphqlApi api = GraphqlApi.Builder.create(this, "Api")
 * .name("demo")
 * .definition(Definition.fromFile(join(__dirname, "schema.graphql")))
 * .authorizationConfig(AuthorizationConfig.builder()
 * .defaultAuthorization(AuthorizationMode.builder()
 * .authorizationType(AuthorizationType.IAM)
 * .build())
 * .build())
 * .xrayEnabled(true)
 * .build();
 * Table demoTable = Table.Builder.create(this, "DemoTable")
 * .partitionKey(Attribute.builder()
 * .name("id")
 * .type(AttributeType.STRING)
 * .build())
 * .build();
 * DynamoDbDataSource demoDS = api.addDynamoDbDataSource("demoDataSource", demoTable);
 * // Resolver for the Query "getDemos" that scans the DynamoDb table and returns the entire list.
 * // Resolver Mapping Template Reference:
 * //
 * https://docs.aws.amazon.com/appsync/latest/devguide/resolver-mapping-template-reference-dynamodb.html
 * demoDS.createResolver("QueryGetDemosResolver", BaseResolverProps.builder()
 * .typeName("Query")
 * .fieldName("getDemos")
 * .requestMappingTemplate(MappingTemplate.dynamoDbScanTable())
 * .responseMappingTemplate(MappingTemplate.dynamoDbResultList())
 * .build());
 * // Resolver for the Mutation "addDemo" that puts the item into the DynamoDb table.
 * demoDS.createResolver("MutationAddDemoResolver", BaseResolverProps.builder()
 * .typeName("Mutation")
 * .fieldName("addDemo")
 * .requestMappingTemplate(MappingTemplate.dynamoDbPutItem(PrimaryKey.partition("id").auto(),
 * Values.projecting("input")))
 * .responseMappingTemplate(MappingTemplate.dynamoDbResultItem())
 * .build());
 * //To enable DynamoDB read consistency with the `MappingTemplate`:
 * demoDS.createResolver("QueryGetDemosConsistentResolver", BaseResolverProps.builder()
 * .typeName("Query")
 * .fieldName("getDemosConsistent")
 * .requestMappingTemplate(MappingTemplate.dynamoDbScanTable(true))
 * .responseMappingTemplate(MappingTemplate.dynamoDbResultList())
 * .build());
 * ```
 */
public open class PrimaryKey(
  cdkObject: software.amazon.awscdk.services.appsync.PrimaryKey,
) : CdkObject(cdkObject) {
  public constructor(pkey: Assign) :
      this(software.amazon.awscdk.services.appsync.PrimaryKey(pkey.let(Assign::unwrap))
  )

  public constructor(pkey: Assign, skey: Assign) :
      this(software.amazon.awscdk.services.appsync.PrimaryKey(pkey.let(Assign::unwrap),
      skey.let(Assign::unwrap))
  )

  /**
   * Renders the key assignment to a VTL string.
   */
  public open fun renderTemplate(): String = unwrap(this).renderTemplate()

  public companion object {
    public fun partition(key: String): PartitionKeyStep =
        software.amazon.awscdk.services.appsync.PrimaryKey.partition(key).let(PartitionKeyStep::wrap)

    internal fun wrap(cdkObject: software.amazon.awscdk.services.appsync.PrimaryKey): PrimaryKey =
        PrimaryKey(cdkObject)

    internal fun unwrap(wrapped: PrimaryKey): software.amazon.awscdk.services.appsync.PrimaryKey =
        wrapped.cdkObject as software.amazon.awscdk.services.appsync.PrimaryKey
  }
}
