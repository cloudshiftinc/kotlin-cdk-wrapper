package io.cloudshiftdev.awscdk.services.appsync

import io.cloudshiftdev.awscdk.CdkObject
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName

public open class SchemaFile internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.appsync.SchemaFile,
) : CdkObject(cdkObject), ISchema {
  /**
   * Called when the GraphQL Api is initialized to allow this object to bind to the stack.
   *
   * @param api The binding GraphQL Api. 
   * @param _options
   */
  public override fun bind(api: IGraphqlApi): ISchemaConfig =
      unwrap(this).bind(api.let(IGraphqlApi::unwrap)).let(ISchemaConfig::wrap)

  /**
   * Called when the GraphQL Api is initialized to allow this object to bind to the stack.
   *
   * @param api The binding GraphQL Api. 
   * @param _options
   */
  public override fun bind(api: IGraphqlApi, _options: SchemaBindOptions): ISchemaConfig =
      unwrap(this).bind(api.let(IGraphqlApi::unwrap),
      _options.let(SchemaBindOptions::unwrap)).let(ISchemaConfig::wrap)

  /**
   * Called when the GraphQL Api is initialized to allow this object to bind to the stack.
   *
   * @param api The binding GraphQL Api. 
   * @param _options
   */
  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("3253a33994cbabdedb099d3bff4a9072399bc8fd0da1ebf43f0cb17424e01216")
  public override fun bind(api: IGraphqlApi, _options: SchemaBindOptions.Builder.() -> Unit):
      ISchemaConfig = bind(api, SchemaBindOptions(_options))

  /**
   * The definition for this schema.
   */
  public open fun definition(): String = unwrap(this).getDefinition()

  /**
   * The definition for this schema.
   */
  public open fun definition(`value`: String) {
    unwrap(this).setDefinition(`value`)
  }

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.appsync.SchemaFile].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The file path for the schema.
     *
     * When this option is
     * configured, then the schema will be generated from an
     * existing file from disk.
     *
     * @param filePath The file path for the schema. 
     */
    public fun filePath(filePath: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.appsync.SchemaFile.Builder =
        software.amazon.awscdk.services.appsync.SchemaFile.Builder.create()

    /**
     * The file path for the schema.
     *
     * When this option is
     * configured, then the schema will be generated from an
     * existing file from disk.
     *
     * @param filePath The file path for the schema. 
     */
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
