@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.appsync

import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Unit
import kotlin.jvm.JvmName

/**
 * Interface for implementing your own schema.
 *
 * Useful for providing schema's from sources other than assets
 */
public interface ISchema {
  /**
   * Binds a schema string to a GraphQlApi.
   *
   * @return ISchemaConfig with apiId and schema definition string
   * @param api the api to bind the schema to. 
   * @param options configuration for bind behavior.
   */
  public fun bind(api: IGraphqlApi): ISchemaConfig

  /**
   * Binds a schema string to a GraphQlApi.
   *
   * @return ISchemaConfig with apiId and schema definition string
   * @param api the api to bind the schema to. 
   * @param options configuration for bind behavior.
   */
  public fun bind(api: IGraphqlApi, options: SchemaBindOptions): ISchemaConfig

  /**
   * Binds a schema string to a GraphQlApi.
   *
   * @return ISchemaConfig with apiId and schema definition string
   * @param api the api to bind the schema to. 
   * @param options configuration for bind behavior.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("3253a33994cbabdedb099d3bff4a9072399bc8fd0da1ebf43f0cb17424e01216")
  public fun bind(api: IGraphqlApi, options: SchemaBindOptions.Builder.() -> Unit): ISchemaConfig

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.appsync.ISchema,
  ) : CdkObject(cdkObject),
      ISchema {
    /**
     * Binds a schema string to a GraphQlApi.
     *
     * @return ISchemaConfig with apiId and schema definition string
     * @param api the api to bind the schema to. 
     * @param options configuration for bind behavior.
     */
    override fun bind(api: IGraphqlApi): ISchemaConfig =
        unwrap(this).bind(api.let(IGraphqlApi.Companion::unwrap)).let(ISchemaConfig::wrap)

    /**
     * Binds a schema string to a GraphQlApi.
     *
     * @return ISchemaConfig with apiId and schema definition string
     * @param api the api to bind the schema to. 
     * @param options configuration for bind behavior.
     */
    override fun bind(api: IGraphqlApi, options: SchemaBindOptions): ISchemaConfig =
        unwrap(this).bind(api.let(IGraphqlApi.Companion::unwrap),
        options.let(SchemaBindOptions.Companion::unwrap)).let(ISchemaConfig::wrap)

    /**
     * Binds a schema string to a GraphQlApi.
     *
     * @return ISchemaConfig with apiId and schema definition string
     * @param api the api to bind the schema to. 
     * @param options configuration for bind behavior.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("3253a33994cbabdedb099d3bff4a9072399bc8fd0da1ebf43f0cb17424e01216")
    override fun bind(api: IGraphqlApi, options: SchemaBindOptions.Builder.() -> Unit):
        ISchemaConfig = bind(api, SchemaBindOptions(options))
  }

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.appsync.ISchema): ISchema =
        CdkObjectWrappers.wrap(cdkObject) as? ISchema ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: ISchema): software.amazon.awscdk.services.appsync.ISchema =
        (wrapped as CdkObject).cdkObject as software.amazon.awscdk.services.appsync.ISchema
  }
}
