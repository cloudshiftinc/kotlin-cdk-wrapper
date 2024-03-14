package io.cloudshiftdev.awscdk.services.dynamodb

import kotlin.String
import kotlin.Unit
import kotlin.collections.List

public interface CsvOptions {
  public fun delimiter(): String? = unwrap(this).getDelimiter()

  public fun headerList(): List<String> = unwrap(this).getHeaderList() ?: emptyList()

  public interface Builder {
    public fun delimiter(delimiter: String)

    public fun headerList(headerList: List<String>)

    public fun headerList(vararg headerList: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.dynamodb.CsvOptions.Builder =
        software.amazon.awscdk.services.dynamodb.CsvOptions.builder()

    override fun delimiter(delimiter: String) {
      cdkBuilder.delimiter(delimiter)
    }

    override fun headerList(headerList: List<String>) {
      cdkBuilder.headerList(headerList)
    }

    override fun headerList(vararg headerList: String): Unit = headerList(headerList.toList())

    public fun build(): software.amazon.awscdk.services.dynamodb.CsvOptions = cdkBuilder.build()
  }

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.dynamodb.CsvOptions,
  ) : CsvOptions {
    override fun delimiter(): String? = unwrap(this).getDelimiter()

    override fun headerList(): List<String> = unwrap(this).getHeaderList() ?: emptyList()
  }

  public companion object {
    init {

    }

    public operator fun invoke(block: Builder.() -> Unit = {}): CsvOptions {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.dynamodb.CsvOptions): CsvOptions =
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: CsvOptions): software.amazon.awscdk.services.dynamodb.CsvOptions =
        (wrapped as Wrapper).cdkObject
  }
}
