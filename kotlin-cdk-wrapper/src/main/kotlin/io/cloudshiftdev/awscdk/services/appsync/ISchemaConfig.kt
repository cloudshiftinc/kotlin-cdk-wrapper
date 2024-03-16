@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.appsync

import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.String

/**
 * Configuration for bound graphql schema.
 *
 * Returned from ISchema.bind allowing late binding of schemas to graphqlapi-base
 */
public interface ISchemaConfig {
  /**
   * The ID of the api the schema is bound to.
   */
  public fun apiId(): String

  /**
   * The ID of the api the schema is bound to.
   */
  public fun apiId(`value`: String)

  /**
   * The schema definition string.
   */
  public fun definition(): String

  /**
   * The schema definition string.
   */
  public fun definition(`value`: String)

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.appsync.ISchemaConfig):
        ISchemaConfig = CdkObjectWrappers.wrap(cdkObject) as ISchemaConfig

    internal fun unwrap(wrapped: ISchemaConfig):
        software.amazon.awscdk.services.appsync.ISchemaConfig = (wrapped as CdkObject).cdkObject as
        software.amazon.awscdk.services.appsync.ISchemaConfig
  }
}
