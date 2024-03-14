package io.cloudshiftdev.awscdk.services.appsync

import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName

public abstract class Definition internal constructor(
  private val cdkObject: software.amazon.awscdk.services.appsync.Definition,
) {
  public open fun schema(): ISchema? = unwrap(this).getSchema()?.let(ISchema::wrap)

  public open fun sourceApiOptions(): SourceApiOptions? =
      unwrap(this).getSourceApiOptions()?.let(SourceApiOptions::wrap)

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.appsync.Definition,
  ) : Definition(cdkObject)

  public companion object {
    public open fun fromFile(filePath: String): Definition =
        software.amazon.awscdk.services.appsync.Definition.fromFile(filePath).let(Definition::wrap)

    public open fun fromSchema(schema: ISchema): Definition =
        software.amazon.awscdk.services.appsync.Definition.fromSchema(schema.let(ISchema::unwrap)).let(Definition::wrap)

    public open fun fromSourceApis(sourceApiOptions: SourceApiOptions): Definition =
        software.amazon.awscdk.services.appsync.Definition.fromSourceApis(sourceApiOptions.let(SourceApiOptions::unwrap)).let(Definition::wrap)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("aae93d17b87ff21ca3a374a60527cb8f6be9ab31106f23892d60fec15b2534c1")
    public open fun fromSourceApis(sourceApiOptions: SourceApiOptions.Builder.() -> Unit):
        Definition = fromSourceApis(SourceApiOptions(sourceApiOptions))

    internal fun wrap(cdkObject: software.amazon.awscdk.services.appsync.Definition): Definition =
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: Definition): software.amazon.awscdk.services.appsync.Definition =
        (wrapped as Wrapper).cdkObject
  }
}
