@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.logs

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnQueryDefinition internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.logs.CfnQueryDefinition,
) : CfnResource(cdkObject), IInspectable {
  public open fun attrQueryDefinitionId(): String = unwrap(this).getAttrQueryDefinitionId()

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun logGroupNames(): List<String> = unwrap(this).getLogGroupNames() ?: emptyList()

  public open fun logGroupNames(`value`: List<String>) {
    unwrap(this).setLogGroupNames(`value`)
  }

  public open fun logGroupNames(vararg `value`: String): Unit = logGroupNames(`value`.toList())

  public open fun name(): String = unwrap(this).getName()

  public open fun name(`value`: String) {
    unwrap(this).setName(`value`)
  }

  public open fun queryString(): String = unwrap(this).getQueryString()

  public open fun queryString(`value`: String) {
    unwrap(this).setQueryString(`value`)
  }

  @CdkDslMarker
  public interface Builder {
    public fun logGroupNames(logGroupNames: List<String>)

    public fun logGroupNames(vararg logGroupNames: String)

    public fun name(name: String)

    public fun queryString(queryString: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.logs.CfnQueryDefinition.Builder =
        software.amazon.awscdk.services.logs.CfnQueryDefinition.Builder.create(scope, id)

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

    public fun build(): software.amazon.awscdk.services.logs.CfnQueryDefinition = cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.logs.CfnQueryDefinition.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnQueryDefinition {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnQueryDefinition(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.logs.CfnQueryDefinition):
        CfnQueryDefinition = CfnQueryDefinition(cdkObject)

    internal fun unwrap(wrapped: CfnQueryDefinition):
        software.amazon.awscdk.services.logs.CfnQueryDefinition = wrapped.cdkObject
  }
}
