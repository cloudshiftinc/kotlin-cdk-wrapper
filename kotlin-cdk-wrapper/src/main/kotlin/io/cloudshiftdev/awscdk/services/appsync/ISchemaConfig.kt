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

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.appsync.ISchemaConfig,
  ) : CdkObject(cdkObject), ISchemaConfig {
    /**
     * The ID of the api the schema is bound to.
     */
    override fun apiId(): String = unwrap(this).getApiId()

    /**
     * The ID of the api the schema is bound to.
     */
    override fun apiId(`value`: String) {
      unwrap(this).setApiId(`value`)
    }

    /**
     * The schema definition string.
     */
    override fun definition(): String = unwrap(this).getDefinition()

    /**
     * The schema definition string.
     */
    override fun definition(`value`: String) {
      unwrap(this).setDefinition(`value`)
    }
  }

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.appsync.ISchemaConfig):
        ISchemaConfig = CdkObjectWrappers.wrap(cdkObject) as? ISchemaConfig ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: ISchemaConfig):
        software.amazon.awscdk.services.appsync.ISchemaConfig = (wrapped as CdkObject).cdkObject as
        software.amazon.awscdk.services.appsync.ISchemaConfig
  }
}
