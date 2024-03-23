@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.opsworks

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.String
import kotlin.Unit

/**
 * Properties for defining a `CfnElasticLoadBalancerAttachment`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.opsworks.*;
 * CfnElasticLoadBalancerAttachmentProps cfnElasticLoadBalancerAttachmentProps =
 * CfnElasticLoadBalancerAttachmentProps.builder()
 * .elasticLoadBalancerName("elasticLoadBalancerName")
 * .layerId("layerId")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-elasticloadbalancerattachment.html)
 */
public interface CfnElasticLoadBalancerAttachmentProps {
  /**
   * The Elastic Load Balancing instance name.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-elasticloadbalancerattachment.html#cfn-opsworks-elasticloadbalancerattachment-elasticloadbalancername)
   */
  public fun elasticLoadBalancerName(): String

  /**
   * The AWS OpsWorks layer ID to which the Elastic Load Balancing load balancer is attached.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-elasticloadbalancerattachment.html#cfn-opsworks-elasticloadbalancerattachment-layerid)
   */
  public fun layerId(): String

  /**
   * A builder for [CfnElasticLoadBalancerAttachmentProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param elasticLoadBalancerName The Elastic Load Balancing instance name. 
     */
    public fun elasticLoadBalancerName(elasticLoadBalancerName: String)

    /**
     * @param layerId The AWS OpsWorks layer ID to which the Elastic Load Balancing load balancer is
     * attached. 
     */
    public fun layerId(layerId: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.opsworks.CfnElasticLoadBalancerAttachmentProps.Builder =
        software.amazon.awscdk.services.opsworks.CfnElasticLoadBalancerAttachmentProps.builder()

    /**
     * @param elasticLoadBalancerName The Elastic Load Balancing instance name. 
     */
    override fun elasticLoadBalancerName(elasticLoadBalancerName: String) {
      cdkBuilder.elasticLoadBalancerName(elasticLoadBalancerName)
    }

    /**
     * @param layerId The AWS OpsWorks layer ID to which the Elastic Load Balancing load balancer is
     * attached. 
     */
    override fun layerId(layerId: String) {
      cdkBuilder.layerId(layerId)
    }

    public fun build():
        software.amazon.awscdk.services.opsworks.CfnElasticLoadBalancerAttachmentProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.opsworks.CfnElasticLoadBalancerAttachmentProps,
  ) : CdkObject(cdkObject), CfnElasticLoadBalancerAttachmentProps {
    /**
     * The Elastic Load Balancing instance name.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-elasticloadbalancerattachment.html#cfn-opsworks-elasticloadbalancerattachment-elasticloadbalancername)
     */
    override fun elasticLoadBalancerName(): String = unwrap(this).getElasticLoadBalancerName()

    /**
     * The AWS OpsWorks layer ID to which the Elastic Load Balancing load balancer is attached.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-elasticloadbalancerattachment.html#cfn-opsworks-elasticloadbalancerattachment-layerid)
     */
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
        CfnElasticLoadBalancerAttachmentProps = CdkObjectWrappers.wrap(cdkObject) as?
        CfnElasticLoadBalancerAttachmentProps ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnElasticLoadBalancerAttachmentProps):
        software.amazon.awscdk.services.opsworks.CfnElasticLoadBalancerAttachmentProps = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.opsworks.CfnElasticLoadBalancerAttachmentProps
  }
}
