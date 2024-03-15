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

public open class CfnNamedQuery internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.athena.CfnNamedQuery,
) : CfnResource(cdkObject), IInspectable {
  public open fun attrNamedQueryId(): String = unwrap(this).getAttrNamedQueryId()

  public open fun database(): String = unwrap(this).getDatabase()

  public open fun database(`value`: String) {
    unwrap(this).setDatabase(`value`)
  }

  public open fun description(): String? = unwrap(this).getDescription()

  public open fun description(`value`: String) {
    unwrap(this).setDescription(`value`)
  }

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun name(): String? = unwrap(this).getName()

  public open fun name(`value`: String) {
    unwrap(this).setName(`value`)
  }

  public open fun queryString(): String = unwrap(this).getQueryString()

  public open fun queryString(`value`: String) {
    unwrap(this).setQueryString(`value`)
  }

  public open fun workGroup(): String? = unwrap(this).getWorkGroup()

  public open fun workGroup(`value`: String) {
    unwrap(this).setWorkGroup(`value`)
  }

  @CdkDslMarker
  public interface Builder {
    public fun database(database: String)

    public fun description(description: String)

    public fun name(name: String)

    public fun queryString(queryString: String)

    public fun workGroup(workGroup: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.athena.CfnNamedQuery.Builder =
        software.amazon.awscdk.services.athena.CfnNamedQuery.Builder.create(scope, id)

    override fun database(database: String) {
      cdkBuilder.database(database)
    }

    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    override fun queryString(queryString: String) {
      cdkBuilder.queryString(queryString)
    }

    override fun workGroup(workGroup: String) {
      cdkBuilder.workGroup(workGroup)
    }

    public fun build(): software.amazon.awscdk.services.athena.CfnNamedQuery = cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.athena.CfnNamedQuery.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnNamedQuery {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnNamedQuery(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.athena.CfnNamedQuery):
        CfnNamedQuery = CfnNamedQuery(cdkObject)

    internal fun unwrap(wrapped: CfnNamedQuery):
        software.amazon.awscdk.services.athena.CfnNamedQuery = wrapped.cdkObject
  }
}
