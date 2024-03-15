@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.athena

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.Unit
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnPreparedStatement internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.athena.CfnPreparedStatement,
) : CfnResource(cdkObject), IInspectable {
  public open fun description(): String? = unwrap(this).getDescription()

  public open fun description(`value`: String) {
    unwrap(this).setDescription(`value`)
  }

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun queryStatement(): String = unwrap(this).getQueryStatement()

  public open fun queryStatement(`value`: String) {
    unwrap(this).setQueryStatement(`value`)
  }

  public open fun statementName(): String = unwrap(this).getStatementName()

  public open fun statementName(`value`: String) {
    unwrap(this).setStatementName(`value`)
  }

  public open fun workGroup(): String = unwrap(this).getWorkGroup()

  public open fun workGroup(`value`: String) {
    unwrap(this).setWorkGroup(`value`)
  }

  @CdkDslMarker
  public interface Builder {
    public fun description(description: String)

    public fun queryStatement(queryStatement: String)

    public fun statementName(statementName: String)

    public fun workGroup(workGroup: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.athena.CfnPreparedStatement.Builder =
        software.amazon.awscdk.services.athena.CfnPreparedStatement.Builder.create(scope, id)

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

    public fun build(): software.amazon.awscdk.services.athena.CfnPreparedStatement =
        cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.athena.CfnPreparedStatement.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnPreparedStatement {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnPreparedStatement(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.athena.CfnPreparedStatement):
        CfnPreparedStatement = CfnPreparedStatement(cdkObject)

    internal fun unwrap(wrapped: CfnPreparedStatement):
        software.amazon.awscdk.services.athena.CfnPreparedStatement = wrapped.cdkObject
  }
}
