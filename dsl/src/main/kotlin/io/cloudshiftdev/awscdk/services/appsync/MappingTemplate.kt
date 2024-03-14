package io.cloudshiftdev.awscdk.services.appsync

import kotlin.Boolean
import kotlin.String

public abstract class MappingTemplate internal constructor(
  private val cdkObject: software.amazon.awscdk.services.appsync.MappingTemplate,
) {
  public open fun renderTemplate(): String = unwrap(this).renderTemplate()

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.appsync.MappingTemplate,
  ) : MappingTemplate(cdkObject)

  public companion object {
    public open fun dynamoDbDeleteItem(keyName: String, idArg: String): MappingTemplate =
        software.amazon.awscdk.services.appsync.MappingTemplate.dynamoDbDeleteItem(keyName,
        idArg).let(MappingTemplate::wrap)

    public open fun dynamoDbGetItem(keyName: String, idArg: String): MappingTemplate =
        software.amazon.awscdk.services.appsync.MappingTemplate.dynamoDbGetItem(keyName,
        idArg).let(MappingTemplate::wrap)

    public open fun dynamoDbGetItem(
      keyName: String,
      idArg: String,
      consistentRead: Boolean,
    ): MappingTemplate =
        software.amazon.awscdk.services.appsync.MappingTemplate.dynamoDbGetItem(keyName, idArg,
        consistentRead).let(MappingTemplate::wrap)

    public open fun dynamoDbPutItem(key: PrimaryKey, values: AttributeValues): MappingTemplate =
        software.amazon.awscdk.services.appsync.MappingTemplate.dynamoDbPutItem(key.let(PrimaryKey::unwrap),
        values.let(AttributeValues::unwrap)).let(MappingTemplate::wrap)

    public open fun dynamoDbQuery(cond: KeyCondition): MappingTemplate =
        software.amazon.awscdk.services.appsync.MappingTemplate.dynamoDbQuery(cond.let(KeyCondition::unwrap)).let(MappingTemplate::wrap)

    public open fun dynamoDbQuery(cond: KeyCondition, indexName: String): MappingTemplate =
        software.amazon.awscdk.services.appsync.MappingTemplate.dynamoDbQuery(cond.let(KeyCondition::unwrap),
        indexName).let(MappingTemplate::wrap)

    public open fun dynamoDbQuery(
      cond: KeyCondition,
      indexName: String,
      consistentRead: Boolean,
    ): MappingTemplate =
        software.amazon.awscdk.services.appsync.MappingTemplate.dynamoDbQuery(cond.let(KeyCondition::unwrap),
        indexName, consistentRead).let(MappingTemplate::wrap)

    public open fun dynamoDbResultItem(): MappingTemplate =
        software.amazon.awscdk.services.appsync.MappingTemplate.dynamoDbResultItem().let(MappingTemplate::wrap)

    public open fun dynamoDbResultList(): MappingTemplate =
        software.amazon.awscdk.services.appsync.MappingTemplate.dynamoDbResultList().let(MappingTemplate::wrap)

    public open fun dynamoDbScanTable(): MappingTemplate =
        software.amazon.awscdk.services.appsync.MappingTemplate.dynamoDbScanTable().let(MappingTemplate::wrap)

    public open fun dynamoDbScanTable(consistentRead: Boolean): MappingTemplate =
        software.amazon.awscdk.services.appsync.MappingTemplate.dynamoDbScanTable(consistentRead).let(MappingTemplate::wrap)

    public open fun fromFile(fileName: String): MappingTemplate =
        software.amazon.awscdk.services.appsync.MappingTemplate.fromFile(fileName).let(MappingTemplate::wrap)

    public open fun fromString(template: String): MappingTemplate =
        software.amazon.awscdk.services.appsync.MappingTemplate.fromString(template).let(MappingTemplate::wrap)

    public open fun lambdaRequest(): MappingTemplate =
        software.amazon.awscdk.services.appsync.MappingTemplate.lambdaRequest().let(MappingTemplate::wrap)

    public open fun lambdaRequest(payload: String): MappingTemplate =
        software.amazon.awscdk.services.appsync.MappingTemplate.lambdaRequest(payload).let(MappingTemplate::wrap)

    public open fun lambdaRequest(payload: String, operation: String): MappingTemplate =
        software.amazon.awscdk.services.appsync.MappingTemplate.lambdaRequest(payload,
        operation).let(MappingTemplate::wrap)

    public open fun lambdaResult(): MappingTemplate =
        software.amazon.awscdk.services.appsync.MappingTemplate.lambdaResult().let(MappingTemplate::wrap)

    internal fun wrap(cdkObject: software.amazon.awscdk.services.appsync.MappingTemplate):
        MappingTemplate = Wrapper(cdkObject)

    internal fun unwrap(wrapped: MappingTemplate):
        software.amazon.awscdk.services.appsync.MappingTemplate = (wrapped as Wrapper).cdkObject
  }
}
