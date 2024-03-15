@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.appsync

import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.String

/**
 * Factory class for attribute value assignments.
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
public open class Values internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.appsync.Values,
) : CdkObject(cdkObject) {
  public constructor() : this(software.amazon.awscdk.services.appsync.Values()
  )

  public companion object {
    public fun attribute(attr: String): AttributeValuesStep =
        software.amazon.awscdk.services.appsync.Values.attribute(attr).let(AttributeValuesStep::wrap)

    public fun projecting(): AttributeValues =
        software.amazon.awscdk.services.appsync.Values.projecting().let(AttributeValues::wrap)

    public fun projecting(arg: String): AttributeValues =
        software.amazon.awscdk.services.appsync.Values.projecting(arg).let(AttributeValues::wrap)

    internal fun wrap(cdkObject: software.amazon.awscdk.services.appsync.Values): Values =
        Values(cdkObject)

    internal fun unwrap(wrapped: Values): software.amazon.awscdk.services.appsync.Values =
        wrapped.cdkObject
  }
}
