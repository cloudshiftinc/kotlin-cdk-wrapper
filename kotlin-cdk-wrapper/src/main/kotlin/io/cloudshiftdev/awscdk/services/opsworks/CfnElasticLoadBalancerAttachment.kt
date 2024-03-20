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

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-elbattachment.html.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.opsworks.*;
 * CfnElasticLoadBalancerAttachment cfnElasticLoadBalancerAttachment =
 * CfnElasticLoadBalancerAttachment.Builder.create(this, "MyCfnElasticLoadBalancerAttachment")
 * .elasticLoadBalancerName("elasticLoadBalancerName")
 * .layerId("layerId")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-elasticloadbalancerattachment.html)
 */
public open class CfnElasticLoadBalancerAttachment internal constructor(
  internal override val cdkObject:
      software.amazon.awscdk.services.opsworks.CfnElasticLoadBalancerAttachment,
) : CfnResource(cdkObject), IInspectable {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnElasticLoadBalancerAttachmentProps,
  ) :
      this(software.amazon.awscdk.services.opsworks.CfnElasticLoadBalancerAttachment(scope.let(CloudshiftdevConstructsConstruct::unwrap),
      id, props.let(CfnElasticLoadBalancerAttachmentProps::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnElasticLoadBalancerAttachmentProps.Builder.() -> Unit,
  ) : this(scope, id, CfnElasticLoadBalancerAttachmentProps(props)
  )

  /**
   *
   */
  public open fun attrId(): String = unwrap(this).getAttrId()

  /**
   * The Elastic Load Balancing instance name.
   */
  public open fun elasticLoadBalancerName(): String = unwrap(this).getElasticLoadBalancerName()

  /**
   * The Elastic Load Balancing instance name.
   */
  public open fun elasticLoadBalancerName(`value`: String) {
    unwrap(this).setElasticLoadBalancerName(`value`)
  }

  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  /**
   * The AWS OpsWorks layer ID to which the Elastic Load Balancing load balancer is attached.
   */
  public open fun layerId(): String = unwrap(this).getLayerId()

  /**
   * The AWS OpsWorks layer ID to which the Elastic Load Balancing load balancer is attached.
   */
  public open fun layerId(`value`: String) {
    unwrap(this).setLayerId(`value`)
  }

  /**
   * A fluent builder for
   * [io.cloudshiftdev.awscdk.services.opsworks.CfnElasticLoadBalancerAttachment].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The Elastic Load Balancing instance name.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-elasticloadbalancerattachment.html#cfn-opsworks-elasticloadbalancerattachment-elasticloadbalancername)
     * @param elasticLoadBalancerName The Elastic Load Balancing instance name. 
     */
    public fun elasticLoadBalancerName(elasticLoadBalancerName: String)

    /**
     * The AWS OpsWorks layer ID to which the Elastic Load Balancing load balancer is attached.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-elasticloadbalancerattachment.html#cfn-opsworks-elasticloadbalancerattachment-layerid)
     * @param layerId The AWS OpsWorks layer ID to which the Elastic Load Balancing load balancer is
     * attached. 
     */
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

    /**
     * The Elastic Load Balancing instance name.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-elasticloadbalancerattachment.html#cfn-opsworks-elasticloadbalancerattachment-elasticloadbalancername)
     * @param elasticLoadBalancerName The Elastic Load Balancing instance name. 
     */
    override fun elasticLoadBalancerName(elasticLoadBalancerName: String) {
      cdkBuilder.elasticLoadBalancerName(elasticLoadBalancerName)
    }

    /**
     * The AWS OpsWorks layer ID to which the Elastic Load Balancing load balancer is attached.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-elasticloadbalancerattachment.html#cfn-opsworks-elasticloadbalancerattachment-layerid)
     * @param layerId The AWS OpsWorks layer ID to which the Elastic Load Balancing load balancer is
     * attached. 
     */
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
