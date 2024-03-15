@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.lakeformation

import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnResource internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.lakeformation.CfnResource,
) : io.cloudshiftdev.awscdk.CfnResource(cdkObject), IInspectable {
  public open fun attrId(): String = unwrap(this).getAttrId()

  public open fun hybridAccessEnabled(): Any? = unwrap(this).getHybridAccessEnabled()

  public open fun hybridAccessEnabled(`value`: Boolean) {
    unwrap(this).setHybridAccessEnabled(`value`)
  }

  public open fun hybridAccessEnabled(`value`: IResolvable) {
    unwrap(this).setHybridAccessEnabled(`value`.let(IResolvable::unwrap))
  }

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun resourceArn(): String = unwrap(this).getResourceArn()

  public open fun resourceArn(`value`: String) {
    unwrap(this).setResourceArn(`value`)
  }

  public open fun roleArn(): String? = unwrap(this).getRoleArn()

  public open fun roleArn(`value`: String) {
    unwrap(this).setRoleArn(`value`)
  }

  public open fun useServiceLinkedRole(): Any = unwrap(this).getUseServiceLinkedRole()

  public open fun useServiceLinkedRole(`value`: Boolean) {
    unwrap(this).setUseServiceLinkedRole(`value`)
  }

  public open fun useServiceLinkedRole(`value`: IResolvable) {
    unwrap(this).setUseServiceLinkedRole(`value`.let(IResolvable::unwrap))
  }

  public open fun withFederation(): Any? = unwrap(this).getWithFederation()

  public open fun withFederation(`value`: Boolean) {
    unwrap(this).setWithFederation(`value`)
  }

  public open fun withFederation(`value`: IResolvable) {
    unwrap(this).setWithFederation(`value`.let(IResolvable::unwrap))
  }

  @CdkDslMarker
  public interface Builder {
    public fun hybridAccessEnabled(hybridAccessEnabled: Boolean)

    public fun hybridAccessEnabled(hybridAccessEnabled: IResolvable)

    public fun resourceArn(resourceArn: String)

    public fun roleArn(roleArn: String)

    public fun useServiceLinkedRole(useServiceLinkedRole: Boolean)

    public fun useServiceLinkedRole(useServiceLinkedRole: IResolvable)

    public fun withFederation(withFederation: Boolean)

    public fun withFederation(withFederation: IResolvable)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.lakeformation.CfnResource.Builder =
        software.amazon.awscdk.services.lakeformation.CfnResource.Builder.create(scope, id)

    override fun hybridAccessEnabled(hybridAccessEnabled: Boolean) {
      cdkBuilder.hybridAccessEnabled(hybridAccessEnabled)
    }

    override fun hybridAccessEnabled(hybridAccessEnabled: IResolvable) {
      cdkBuilder.hybridAccessEnabled(hybridAccessEnabled.let(IResolvable::unwrap))
    }

    override fun resourceArn(resourceArn: String) {
      cdkBuilder.resourceArn(resourceArn)
    }

    override fun roleArn(roleArn: String) {
      cdkBuilder.roleArn(roleArn)
    }

    override fun useServiceLinkedRole(useServiceLinkedRole: Boolean) {
      cdkBuilder.useServiceLinkedRole(useServiceLinkedRole)
    }

    override fun useServiceLinkedRole(useServiceLinkedRole: IResolvable) {
      cdkBuilder.useServiceLinkedRole(useServiceLinkedRole.let(IResolvable::unwrap))
    }

    override fun withFederation(withFederation: Boolean) {
      cdkBuilder.withFederation(withFederation)
    }

    override fun withFederation(withFederation: IResolvable) {
      cdkBuilder.withFederation(withFederation.let(IResolvable::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.lakeformation.CfnResource =
        cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.lakeformation.CfnResource.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnResource {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnResource(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.lakeformation.CfnResource):
        CfnResource = CfnResource(cdkObject)

    internal fun unwrap(wrapped: CfnResource):
        software.amazon.awscdk.services.lakeformation.CfnResource = wrapped.cdkObject
  }
}
