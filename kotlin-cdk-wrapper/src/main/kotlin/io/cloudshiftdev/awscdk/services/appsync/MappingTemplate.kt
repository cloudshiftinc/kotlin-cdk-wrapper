@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.appsync

import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Boolean
import kotlin.String

/**
 * MappingTemplates for AppSync resolvers.
 *
 * Example:
 *
 * ```
 * import io.cloudshiftdev.awscdk.services.events.*;
 * GraphqlApi api = GraphqlApi.Builder.create(this, "EventBridgeApi")
 * .name("EventBridgeApi")
 * .definition(Definition.fromFile(join(__dirname, "appsync.eventbridge.graphql")))
 * .build();
 * EventBus bus = EventBus.Builder.create(this, "DestinationEventBus").build();
 * EventBridgeDataSource dataSource = api.addEventBridgeDataSource("NoneDS", bus);
 * dataSource.createResolver("EventResolver", BaseResolverProps.builder()
 * .typeName("Mutation")
 * .fieldName("emitEvent")
 * .requestMappingTemplate(MappingTemplate.fromFile("request.vtl"))
 * .responseMappingTemplate(MappingTemplate.fromFile("response.vtl"))
 * .build());
 * ```
 */
public abstract class MappingTemplate internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.appsync.MappingTemplate,
) : CdkObject(cdkObject) {
  /**
   * this is called to render the mapping template to a VTL string.
   */
  public open fun renderTemplate(): String = unwrap(this).renderTemplate()

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.appsync.MappingTemplate,
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
        MappingTemplate = Wrapper(cdkObject)

    internal fun unwrap(wrapped: MappingTemplate):
        software.amazon.awscdk.services.appsync.MappingTemplate = (wrapped as CdkObject).cdkObject
        as software.amazon.awscdk.services.appsync.MappingTemplate
  }
}
