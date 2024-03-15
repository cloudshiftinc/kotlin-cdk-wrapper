@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.appsync

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmName

public open class SchemaFile internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.appsync.SchemaFile,
) : CdkObject(cdkObject), ISchema {
  public override fun bind(api: IGraphqlApi): ISchemaConfig =
      unwrap(this).bind(api.let(IGraphqlApi::unwrap)).let(ISchemaConfig::wrap)

  public override fun bind(api: IGraphqlApi, _options: SchemaBindOptions): ISchemaConfig =
      unwrap(this).bind(api.let(IGraphqlApi::unwrap),
      _options.let(SchemaBindOptions::unwrap)).let(ISchemaConfig::wrap)

  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("3253a33994cbabdedb099d3bff4a9072399bc8fd0da1ebf43f0cb17424e01216")
  public override fun bind(api: IGraphqlApi, _options: SchemaBindOptions.Builder.() -> Unit):
      ISchemaConfig = bind(api, SchemaBindOptions(_options))

  public open fun definition(): String = unwrap(this).getDefinition()

  public open fun definition(`value`: String) {
    unwrap(this).setDefinition(`value`)
  }

  @CdkDslMarker
  public interface Builder {
    public fun filePath(filePath: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.appsync.SchemaFile.Builder =
        software.amazon.awscdk.services.appsync.SchemaFile.Builder.create()

    override fun filePath(filePath: String) {
      cdkBuilder.filePath(filePath)
    }

    public fun build(): software.amazon.awscdk.services.appsync.SchemaFile = cdkBuilder.build()
  }

  public companion object {
    public fun fromAsset(filePath: String): SchemaFile =
        software.amazon.awscdk.services.appsync.SchemaFile.fromAsset(filePath).let(SchemaFile::wrap)

    public operator fun invoke(block: Builder.() -> Unit = {}): SchemaFile {
      val builderImpl = BuilderImpl()
      return SchemaFile(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.appsync.SchemaFile): SchemaFile =
        SchemaFile(cdkObject)

    internal fun unwrap(wrapped: SchemaFile): software.amazon.awscdk.services.appsync.SchemaFile =
        wrapped.cdkObject
  }
}
