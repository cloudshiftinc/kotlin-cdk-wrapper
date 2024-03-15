@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.appsync

import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.String
import kotlin.collections.List

/**
 * Specifies the attribute value assignments.
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
public open class AttributeValues internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.appsync.AttributeValues,
) : CdkObject(cdkObject) {
  public constructor(container: String) :
      this(software.amazon.awscdk.services.appsync.AttributeValues(container)
  )

  public constructor(container: String, assignments: List<Assign>) :
      this(software.amazon.awscdk.services.appsync.AttributeValues(container,
      assignments.map(Assign::unwrap))
  )

  /**
   * Allows assigning a value to the specified attribute.
   *
   * @param attr 
   */
  public open fun attribute(attr: String): AttributeValuesStep =
      unwrap(this).attribute(attr).let(AttributeValuesStep::wrap)

  /**
   * Renders the attribute value assingments to a VTL string.
   */
  public open fun renderTemplate(): String = unwrap(this).renderTemplate()

  /**
   * Renders the variables required for `renderTemplate`.
   */
  public open fun renderVariables(): String = unwrap(this).renderVariables()

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.appsync.AttributeValues):
        AttributeValues = AttributeValues(cdkObject)

    internal fun unwrap(wrapped: AttributeValues):
        software.amazon.awscdk.services.appsync.AttributeValues = wrapped.cdkObject
  }
}
