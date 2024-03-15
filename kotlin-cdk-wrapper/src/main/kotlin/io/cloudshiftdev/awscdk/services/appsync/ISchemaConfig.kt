@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.appsync

import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.String

public interface ISchemaConfig {
  public fun apiId(): String

  public fun apiId(arg0: String)

  public fun definition(): String

  public fun definition(arg0: String)

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.appsync.ISchemaConfig,
  ) : CdkObject(cdkObject), ISchemaConfig {
    override fun apiId(): String = unwrap(this).getApiId()

    override fun apiId(arg0: String) {
      unwrap(this).setApiId(arg0)
    }

    override fun definition(): String = unwrap(this).getDefinition()

    override fun definition(arg0: String) {
      unwrap(this).setDefinition(arg0)
    }
  }

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.appsync.ISchemaConfig):
        ISchemaConfig = Wrapper(cdkObject)

    internal fun unwrap(wrapped: ISchemaConfig):
        software.amazon.awscdk.services.appsync.ISchemaConfig = (wrapped as CdkObject).cdkObject as
        software.amazon.awscdk.services.appsync.ISchemaConfig
  }
}
