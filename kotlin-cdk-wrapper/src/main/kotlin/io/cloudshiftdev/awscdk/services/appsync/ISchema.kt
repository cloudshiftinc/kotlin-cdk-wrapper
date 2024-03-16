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

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.appsync.ISchema): ISchema =
        CdkObjectWrappers.wrap(cdkObject) as ISchema

    internal fun unwrap(wrapped: ISchema): software.amazon.awscdk.services.appsync.ISchema =
        (wrapped as CdkObject).cdkObject as software.amazon.awscdk.services.appsync.ISchema
  }
}
