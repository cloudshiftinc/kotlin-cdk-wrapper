@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.appsync

import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmName

/**
 * AppSync definition.
 *
 * Specify how you want to define your AppSync API.
 *
 * Example:
 *
 * ```
 * GraphqlApi sourceApi = GraphqlApi.Builder.create(this, "FirstSourceAPI")
 * .name("FirstSourceAPI")
 * .definition(Definition.fromFile(join(__dirname, "appsync.merged-api-1.graphql")))
 * .build();
 * IGraphqlApi importedMergedApi = GraphqlApi.fromGraphqlApiAttributes(this, "ImportedMergedApi",
 * GraphqlApiAttributes.builder()
 * .graphqlApiId("MyApiId")
 * .graphqlApiArn("MyApiArn")
 * .build());
 * IRole importedExecutionRole = Role.fromRoleArn(this, "ExecutionRole",
 * "arn:aws:iam::ACCOUNT:role/MyExistingRole");
 * SourceApiAssociation.Builder.create(this, "SourceApiAssociation2")
 * .sourceApi(sourceApi)
 * .mergedApi(importedMergedApi)
 * .mergeType(MergeType.MANUAL_MERGE)
 * .mergedApiExecutionRole(importedExecutionRole)
 * .build();
 * ```
 */
public abstract class Definition internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.appsync.Definition,
) : CdkObject(cdkObject) {
  /**
   * Schema, when AppSync API is created from schema file.
   */
  public open fun schema(): ISchema? = unwrap(this).getSchema()?.let(ISchema::wrap)

  /**
   * Source APIs for Merged API.
   */
  public open fun sourceApiOptions(): SourceApiOptions? =
      unwrap(this).getSourceApiOptions()?.let(SourceApiOptions::wrap)

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.appsync.Definition,
  ) : Definition(cdkObject)

  public companion object {
    public fun fromFile(filePath: String): Definition =
        software.amazon.awscdk.services.appsync.Definition.fromFile(filePath).let(Definition::wrap)

    public fun fromSchema(schema: ISchema): Definition =
        software.amazon.awscdk.services.appsync.Definition.fromSchema(schema.let(ISchema::unwrap)).let(Definition::wrap)

    public fun fromSourceApis(sourceApiOptions: SourceApiOptions): Definition =
        software.amazon.awscdk.services.appsync.Definition.fromSourceApis(sourceApiOptions.let(SourceApiOptions::unwrap)).let(Definition::wrap)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("aae93d17b87ff21ca3a374a60527cb8f6be9ab31106f23892d60fec15b2534c1")
    public fun fromSourceApis(sourceApiOptions: SourceApiOptions.Builder.() -> Unit): Definition =
        fromSourceApis(SourceApiOptions(sourceApiOptions))

    internal fun wrap(cdkObject: software.amazon.awscdk.services.appsync.Definition): Definition =
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: Definition): software.amazon.awscdk.services.appsync.Definition =
        (wrapped as CdkObject).cdkObject as software.amazon.awscdk.services.appsync.Definition
  }
}
