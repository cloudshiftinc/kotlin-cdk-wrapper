@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.opsworks

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.String
import kotlin.Unit

public interface CfnElasticLoadBalancerAttachmentProps {
  public fun elasticLoadBalancerName(): String

  public fun layerId(): String

  @CdkDslMarker
  public interface Builder {
    public fun elasticLoadBalancerName(elasticLoadBalancerName: String)

    public fun layerId(layerId: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.opsworks.CfnElasticLoadBalancerAttachmentProps.Builder =
        software.amazon.awscdk.services.opsworks.CfnElasticLoadBalancerAttachmentProps.builder()

    override fun elasticLoadBalancerName(elasticLoadBalancerName: String) {
      cdkBuilder.elasticLoadBalancerName(elasticLoadBalancerName)
    }

    override fun layerId(layerId: String) {
      cdkBuilder.layerId(layerId)
    }

    public fun build():
        software.amazon.awscdk.services.opsworks.CfnElasticLoadBalancerAttachmentProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject:
        software.amazon.awscdk.services.opsworks.CfnElasticLoadBalancerAttachmentProps,
  ) : CdkObject(cdkObject), CfnElasticLoadBalancerAttachmentProps {
    override fun elasticLoadBalancerName(): String = unwrap(this).getElasticLoadBalancerName()

    override fun layerId(): String = unwrap(this).getLayerId()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}):
        CfnElasticLoadBalancerAttachmentProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.opsworks.CfnElasticLoadBalancerAttachmentProps):
        CfnElasticLoadBalancerAttachmentProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnElasticLoadBalancerAttachmentProps):
        software.amazon.awscdk.services.opsworks.CfnElasticLoadBalancerAttachmentProps = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.opsworks.CfnElasticLoadBalancerAttachmentProps
  }
}
