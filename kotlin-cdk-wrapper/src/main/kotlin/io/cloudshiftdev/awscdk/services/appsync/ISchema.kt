@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.appsync

import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Unit
import kotlin.jvm.JvmName

public interface ISchema {
  public fun bind(arg0: IGraphqlApi): ISchemaConfig

  public fun bind(arg0: IGraphqlApi, arg1: SchemaBindOptions): ISchemaConfig

  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("3253a33994cbabdedb099d3bff4a9072399bc8fd0da1ebf43f0cb17424e01216")
  public fun bind(arg0: IGraphqlApi, arg1: SchemaBindOptions.Builder.() -> Unit): ISchemaConfig

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.appsync.ISchema,
  ) : CdkObject(cdkObject), ISchema {
    override fun bind(arg0: IGraphqlApi): ISchemaConfig =
        unwrap(this).bind(arg0.let(IGraphqlApi::unwrap)).let(ISchemaConfig::wrap)

    override fun bind(arg0: IGraphqlApi, arg1: SchemaBindOptions): ISchemaConfig =
        unwrap(this).bind(arg0.let(IGraphqlApi::unwrap),
        arg1.let(SchemaBindOptions::unwrap)).let(ISchemaConfig::wrap)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("3253a33994cbabdedb099d3bff4a9072399bc8fd0da1ebf43f0cb17424e01216")
    override fun bind(arg0: IGraphqlApi, arg1: SchemaBindOptions.Builder.() -> Unit): ISchemaConfig
        = bind(arg0, SchemaBindOptions(arg1))
  }

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.appsync.ISchema): ISchema =
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: ISchema): software.amazon.awscdk.services.appsync.ISchema =
        (wrapped as CdkObject).cdkObject as software.amazon.awscdk.services.appsync.ISchema
  }
}
