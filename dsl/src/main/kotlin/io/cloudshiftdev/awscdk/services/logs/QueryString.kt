package io.cloudshiftdev.awscdk.services.logs

import kotlin.Deprecated
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

public open class QueryString internal constructor(
  private val cdkObject: software.amazon.awscdk.services.logs.QueryString,
) {
  public interface Builder {
    public fun display(display: String) {
    }

    public fun fields(fields: List<String>) {
    }

    @Deprecated(message = "deprecated in CDK")
    public fun filter(filter: String) {
    }

    public fun filterStatements(filterStatements: List<String>) {
    }

    public fun limit(limit: Number) {
    }

    @Deprecated(message = "deprecated in CDK")
    public fun parse(parse: String) {
    }

    public fun parseStatements(parseStatements: List<String>) {
    }

    public fun sort(sort: String) {
    }

    public fun stats(stats: String) {
    }
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.logs.QueryString.Builder =
        software.amazon.awscdk.services.logs.QueryString.Builder.create()

    public override fun display(display: String) {
      cdkBuilder.display(display)
    }

    public override fun fields(fields: List<String>) {
      cdkBuilder.fields(fields)
    }

    @Deprecated(message = "deprecated in CDK")
    public override fun filter(filter: String) {
      cdkBuilder.filter(filter)
    }

    public override fun filterStatements(filterStatements: List<String>) {
      cdkBuilder.filterStatements(filterStatements)
    }

    public override fun limit(limit: Number) {
      cdkBuilder.limit(limit)
    }

    @Deprecated(message = "deprecated in CDK")
    public override fun parse(parse: String) {
      cdkBuilder.parse(parse)
    }

    public override fun parseStatements(parseStatements: List<String>) {
      cdkBuilder.parseStatements(parseStatements)
    }

    public override fun sort(sort: String) {
      cdkBuilder.sort(sort)
    }

    public override fun stats(stats: String) {
      cdkBuilder.stats(stats)
    }

    public fun build(): software.amazon.awscdk.services.logs.QueryString = cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(block: Builder.() -> Unit = {}): QueryString {
      val builderImpl = BuilderImpl()
      return QueryString(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.logs.QueryString): QueryString =
        QueryString(cdkObject)

    internal fun unwrap(wrapped: QueryString): software.amazon.awscdk.services.logs.QueryString =
        wrapped.cdkObject
  }
}
