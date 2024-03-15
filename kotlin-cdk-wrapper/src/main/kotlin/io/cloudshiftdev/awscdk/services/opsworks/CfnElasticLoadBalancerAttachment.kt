@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.opsworks

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.Unit
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnElasticLoadBalancerAttachment internal constructor(
  internal override val cdkObject:
      software.amazon.awscdk.services.opsworks.CfnElasticLoadBalancerAttachment,
) : CfnResource(cdkObject), IInspectable {
  public open fun attrId(): String = unwrap(this).getAttrId()

  public open fun elasticLoadBalancerName(): String = unwrap(this).getElasticLoadBalancerName()

  public open fun elasticLoadBalancerName(`value`: String) {
    unwrap(this).setElasticLoadBalancerName(`value`)
  }

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun layerId(): String = unwrap(this).getLayerId()

  public open fun layerId(`value`: String) {
    unwrap(this).setLayerId(`value`)
  }

  @CdkDslMarker
  public interface Builder {
    public fun elasticLoadBalancerName(elasticLoadBalancerName: String)

    public fun layerId(layerId: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.opsworks.CfnElasticLoadBalancerAttachment.Builder =
        software.amazon.awscdk.services.opsworks.CfnElasticLoadBalancerAttachment.Builder.create(scope,
        id)

    override fun elasticLoadBalancerName(elasticLoadBalancerName: String) {
      cdkBuilder.elasticLoadBalancerName(elasticLoadBalancerName)
    }

    override fun layerId(layerId: String) {
      cdkBuilder.layerId(layerId)
    }

    public fun build(): software.amazon.awscdk.services.opsworks.CfnElasticLoadBalancerAttachment =
        cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.opsworks.CfnElasticLoadBalancerAttachment.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnElasticLoadBalancerAttachment {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnElasticLoadBalancerAttachment(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.opsworks.CfnElasticLoadBalancerAttachment):
        CfnElasticLoadBalancerAttachment = CfnElasticLoadBalancerAttachment(cdkObject)

    internal fun unwrap(wrapped: CfnElasticLoadBalancerAttachment):
        software.amazon.awscdk.services.opsworks.CfnElasticLoadBalancerAttachment =
        wrapped.cdkObject
  }
}
