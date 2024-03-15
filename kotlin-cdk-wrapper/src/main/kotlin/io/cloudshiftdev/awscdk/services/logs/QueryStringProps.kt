@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.logs

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Deprecated
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

public interface QueryStringProps {
  public fun display(): String? = unwrap(this).getDisplay()

  public fun fields(): List<String> = unwrap(this).getFields() ?: emptyList()

  @Deprecated(message = "deprecated in CDK")
  public fun filter(): String? = unwrap(this).getFilter()

  public fun filterStatements(): List<String> = unwrap(this).getFilterStatements() ?: emptyList()

  public fun limit(): Number? = unwrap(this).getLimit()

  @Deprecated(message = "deprecated in CDK")
  public fun parse(): String? = unwrap(this).getParse()

  public fun parseStatements(): List<String> = unwrap(this).getParseStatements() ?: emptyList()

  public fun sort(): String? = unwrap(this).getSort()

  public fun stats(): String? = unwrap(this).getStats()

  @CdkDslMarker
  public interface Builder {
    public fun display(display: String)

    public fun fields(fields: List<String>)

    public fun fields(vararg fields: String)

    @Deprecated(message = "deprecated in CDK")
    public fun filter(filter: String)

    public fun filterStatements(filterStatements: List<String>)

    public fun filterStatements(vararg filterStatements: String)

    public fun limit(limit: Number)

    @Deprecated(message = "deprecated in CDK")
    public fun parse(parse: String)

    public fun parseStatements(parseStatements: List<String>)

    public fun parseStatements(vararg parseStatements: String)

    public fun sort(sort: String)

    public fun stats(stats: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.logs.QueryStringProps.Builder =
        software.amazon.awscdk.services.logs.QueryStringProps.builder()

    override fun display(display: String) {
      cdkBuilder.display(display)
    }

    override fun fields(fields: List<String>) {
      cdkBuilder.fields(fields)
    }

    override fun fields(vararg fields: String): Unit = fields(fields.toList())

    @Deprecated(message = "deprecated in CDK")
    override fun filter(filter: String) {
      cdkBuilder.filter(filter)
    }

    override fun filterStatements(filterStatements: List<String>) {
      cdkBuilder.filterStatements(filterStatements)
    }

    override fun filterStatements(vararg filterStatements: String): Unit =
        filterStatements(filterStatements.toList())

    override fun limit(limit: Number) {
      cdkBuilder.limit(limit)
    }

    @Deprecated(message = "deprecated in CDK")
    override fun parse(parse: String) {
      cdkBuilder.parse(parse)
    }

    override fun parseStatements(parseStatements: List<String>) {
      cdkBuilder.parseStatements(parseStatements)
    }

    override fun parseStatements(vararg parseStatements: String): Unit =
        parseStatements(parseStatements.toList())

    override fun sort(sort: String) {
      cdkBuilder.sort(sort)
    }

    override fun stats(stats: String) {
      cdkBuilder.stats(stats)
    }

    public fun build(): software.amazon.awscdk.services.logs.QueryStringProps = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.logs.QueryStringProps,
  ) : CdkObject(cdkObject), QueryStringProps {
    override fun display(): String? = unwrap(this).getDisplay()

    override fun fields(): List<String> = unwrap(this).getFields() ?: emptyList()

    @Deprecated(message = "deprecated in CDK")
    override fun filter(): String? = unwrap(this).getFilter()

    override fun filterStatements(): List<String> = unwrap(this).getFilterStatements() ?:
        emptyList()

    override fun limit(): Number? = unwrap(this).getLimit()

    @Deprecated(message = "deprecated in CDK")
    override fun parse(): String? = unwrap(this).getParse()

    override fun parseStatements(): List<String> = unwrap(this).getParseStatements() ?: emptyList()

    override fun sort(): String? = unwrap(this).getSort()

    override fun stats(): String? = unwrap(this).getStats()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): QueryStringProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.logs.QueryStringProps):
        QueryStringProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: QueryStringProps):
        software.amazon.awscdk.services.logs.QueryStringProps = (wrapped as CdkObject).cdkObject as
        software.amazon.awscdk.services.logs.QueryStringProps
  }
}
