@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.athena

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.String
import kotlin.Unit

public interface CfnPreparedStatementProps {
  public fun description(): String? = unwrap(this).getDescription()

  public fun queryStatement(): String

  public fun statementName(): String

  public fun workGroup(): String

  @CdkDslMarker
  public interface Builder {
    public fun description(description: String)

    public fun queryStatement(queryStatement: String)

    public fun statementName(statementName: String)

    public fun workGroup(workGroup: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.athena.CfnPreparedStatementProps.Builder
        = software.amazon.awscdk.services.athena.CfnPreparedStatementProps.builder()

    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    override fun queryStatement(queryStatement: String) {
      cdkBuilder.queryStatement(queryStatement)
    }

    override fun statementName(statementName: String) {
      cdkBuilder.statementName(statementName)
    }

    override fun workGroup(workGroup: String) {
      cdkBuilder.workGroup(workGroup)
    }

    public fun build(): software.amazon.awscdk.services.athena.CfnPreparedStatementProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.athena.CfnPreparedStatementProps,
  ) : CdkObject(cdkObject), CfnPreparedStatementProps {
    override fun description(): String? = unwrap(this).getDescription()

    override fun queryStatement(): String = unwrap(this).getQueryStatement()

    override fun statementName(): String = unwrap(this).getStatementName()

    override fun workGroup(): String = unwrap(this).getWorkGroup()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnPreparedStatementProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.athena.CfnPreparedStatementProps):
        CfnPreparedStatementProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnPreparedStatementProps):
        software.amazon.awscdk.services.athena.CfnPreparedStatementProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.athena.CfnPreparedStatementProps
  }
}
