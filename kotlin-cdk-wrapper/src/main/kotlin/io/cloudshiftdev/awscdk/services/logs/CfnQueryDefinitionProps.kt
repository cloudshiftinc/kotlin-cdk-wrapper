@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.logs

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

public interface CfnQueryDefinitionProps {
  public fun logGroupNames(): List<String> = unwrap(this).getLogGroupNames() ?: emptyList()

  public fun name(): String

  public fun queryString(): String

  @CdkDslMarker
  public interface Builder {
    public fun logGroupNames(logGroupNames: List<String>)

    public fun logGroupNames(vararg logGroupNames: String)

    public fun name(name: String)

    public fun queryString(queryString: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.logs.CfnQueryDefinitionProps.Builder =
        software.amazon.awscdk.services.logs.CfnQueryDefinitionProps.builder()

    override fun logGroupNames(logGroupNames: List<String>) {
      cdkBuilder.logGroupNames(logGroupNames)
    }

    override fun logGroupNames(vararg logGroupNames: String): Unit =
        logGroupNames(logGroupNames.toList())

    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    override fun queryString(queryString: String) {
      cdkBuilder.queryString(queryString)
    }

    public fun build(): software.amazon.awscdk.services.logs.CfnQueryDefinitionProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.logs.CfnQueryDefinitionProps,
  ) : CdkObject(cdkObject), CfnQueryDefinitionProps {
    override fun logGroupNames(): List<String> = unwrap(this).getLogGroupNames() ?: emptyList()

    override fun name(): String = unwrap(this).getName()

    override fun queryString(): String = unwrap(this).getQueryString()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnQueryDefinitionProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.logs.CfnQueryDefinitionProps):
        CfnQueryDefinitionProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnQueryDefinitionProps):
        software.amazon.awscdk.services.logs.CfnQueryDefinitionProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.logs.CfnQueryDefinitionProps
  }
}
