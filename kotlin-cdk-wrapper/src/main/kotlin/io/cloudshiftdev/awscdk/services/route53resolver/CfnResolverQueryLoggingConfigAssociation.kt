@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.route53resolver

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.Unit
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnResolverQueryLoggingConfigAssociation internal constructor(
  internal override val cdkObject:
      software.amazon.awscdk.services.route53resolver.CfnResolverQueryLoggingConfigAssociation,
) : CfnResource(cdkObject), IInspectable {
  public open fun attrCreationTime(): String = unwrap(this).getAttrCreationTime()

  public open fun attrError(): String = unwrap(this).getAttrError()

  public open fun attrErrorMessage(): String = unwrap(this).getAttrErrorMessage()

  public open fun attrId(): String = unwrap(this).getAttrId()

  public open fun attrStatus(): String = unwrap(this).getAttrStatus()

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun resolverQueryLogConfigId(): String? = unwrap(this).getResolverQueryLogConfigId()

  public open fun resolverQueryLogConfigId(`value`: String) {
    unwrap(this).setResolverQueryLogConfigId(`value`)
  }

  public open fun resourceId(): String? = unwrap(this).getResourceId()

  public open fun resourceId(`value`: String) {
    unwrap(this).setResourceId(`value`)
  }

  @CdkDslMarker
  public interface Builder {
    public fun resolverQueryLogConfigId(resolverQueryLogConfigId: String)

    public fun resourceId(resourceId: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.route53resolver.CfnResolverQueryLoggingConfigAssociation.Builder
        =
        software.amazon.awscdk.services.route53resolver.CfnResolverQueryLoggingConfigAssociation.Builder.create(scope,
        id)

    override fun resolverQueryLogConfigId(resolverQueryLogConfigId: String) {
      cdkBuilder.resolverQueryLogConfigId(resolverQueryLogConfigId)
    }

    override fun resourceId(resourceId: String) {
      cdkBuilder.resourceId(resourceId)
    }

    public fun build():
        software.amazon.awscdk.services.route53resolver.CfnResolverQueryLoggingConfigAssociation =
        cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.route53resolver.CfnResolverQueryLoggingConfigAssociation.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnResolverQueryLoggingConfigAssociation {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnResolverQueryLoggingConfigAssociation(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.route53resolver.CfnResolverQueryLoggingConfigAssociation):
        CfnResolverQueryLoggingConfigAssociation =
        CfnResolverQueryLoggingConfigAssociation(cdkObject)

    internal fun unwrap(wrapped: CfnResolverQueryLoggingConfigAssociation):
        software.amazon.awscdk.services.route53resolver.CfnResolverQueryLoggingConfigAssociation =
        wrapped.cdkObject
  }
}
