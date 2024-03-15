@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.supportapp

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.Unit
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnAccountAlias internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.supportapp.CfnAccountAlias,
) : CfnResource(cdkObject), IInspectable {
  public open fun accountAlias(): String = unwrap(this).getAccountAlias()

  public open fun accountAlias(`value`: String) {
    unwrap(this).setAccountAlias(`value`)
  }

  public open fun attrAccountAliasResourceId(): String =
      unwrap(this).getAttrAccountAliasResourceId()

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  @CdkDslMarker
  public interface Builder {
    public fun accountAlias(accountAlias: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.supportapp.CfnAccountAlias.Builder =
        software.amazon.awscdk.services.supportapp.CfnAccountAlias.Builder.create(scope, id)

    override fun accountAlias(accountAlias: String) {
      cdkBuilder.accountAlias(accountAlias)
    }

    public fun build(): software.amazon.awscdk.services.supportapp.CfnAccountAlias =
        cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.supportapp.CfnAccountAlias.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnAccountAlias {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnAccountAlias(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.supportapp.CfnAccountAlias):
        CfnAccountAlias = CfnAccountAlias(cdkObject)

    internal fun unwrap(wrapped: CfnAccountAlias):
        software.amazon.awscdk.services.supportapp.CfnAccountAlias = wrapped.cdkObject
  }
}
