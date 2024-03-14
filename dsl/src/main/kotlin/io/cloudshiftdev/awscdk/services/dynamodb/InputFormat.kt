package io.cloudshiftdev.awscdk.services.dynamodb

import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName

public abstract class InputFormat internal constructor(
  private val cdkObject: software.amazon.awscdk.services.dynamodb.InputFormat,
) {
  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.dynamodb.InputFormat,
  ) : InputFormat(cdkObject)

  public companion object {
    public open fun csv(): InputFormat =
        software.amazon.awscdk.services.dynamodb.InputFormat.csv().let(InputFormat::wrap)

    public open fun csv(options: CsvOptions): InputFormat =
        software.amazon.awscdk.services.dynamodb.InputFormat.csv(options.let(CsvOptions::unwrap)).let(InputFormat::wrap)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("2755f0fdb57e36185ffda293270efaf3fa63ca1727275d2fcf5c04e945bdd9ba")
    public open fun csv(options: CsvOptions.Builder.() -> Unit): InputFormat =
        csv(CsvOptions(options))

    public open fun dynamoDbJson(): InputFormat =
        software.amazon.awscdk.services.dynamodb.InputFormat.dynamoDBJson().let(InputFormat::wrap)

    public open fun ion(): InputFormat =
        software.amazon.awscdk.services.dynamodb.InputFormat.ion().let(InputFormat::wrap)

    internal fun wrap(cdkObject: software.amazon.awscdk.services.dynamodb.InputFormat): InputFormat
        = Wrapper(cdkObject)

    internal fun unwrap(wrapped: InputFormat): software.amazon.awscdk.services.dynamodb.InputFormat
        = (wrapped as Wrapper).cdkObject
  }
}
