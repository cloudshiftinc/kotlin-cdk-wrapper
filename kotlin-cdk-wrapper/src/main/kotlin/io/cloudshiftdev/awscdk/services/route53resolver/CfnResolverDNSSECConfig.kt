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

/**
 * The `AWS::Route53Resolver::ResolverDNSSECConfig` resource is a complex type that contains
 * information about a configuration for DNSSEC validation.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.route53resolver.*;
 * CfnResolverDNSSECConfig cfnResolverDNSSECConfig = CfnResolverDNSSECConfig.Builder.create(this,
 * "MyCfnResolverDNSSECConfig")
 * .resourceId("resourceId")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-route53resolver-resolverdnssecconfig.html)
 */
public open class CfnResolverDNSSECConfig(
  cdkObject: software.amazon.awscdk.services.route53resolver.CfnResolverDNSSECConfig,
) : CfnResource(cdkObject),
    IInspectable {
  public constructor(scope: CloudshiftdevConstructsConstruct, id: String) :
      this(software.amazon.awscdk.services.route53resolver.CfnResolverDNSSECConfig(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id)
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnResolverDNSSECConfigProps,
  ) :
      this(software.amazon.awscdk.services.route53resolver.CfnResolverDNSSECConfig(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id, props.let(CfnResolverDNSSECConfigProps.Companion::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnResolverDNSSECConfigProps.Builder.() -> Unit,
  ) : this(scope, id, CfnResolverDNSSECConfigProps(props)
  )

  /**
   * The primary identifier of this `ResolverDNSSECConfig` resource.
   *
   * For example: `rdsc-689d45d1ae623bf3` .
   */
  public open fun attrId(): String = unwrap(this).getAttrId()

  /**
   * The AWS account of the owner.
   *
   * For example: `111122223333` .
   */
  public open fun attrOwnerId(): String = unwrap(this).getAttrOwnerId()

  /**
   * The current status of this `ResolverDNSSECConfig` resource.
   *
   * For example: `Enabled` .
   */
  public open fun attrValidationStatus(): String = unwrap(this).getAttrValidationStatus()

  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector.Companion::unwrap))
  }

  /**
   * The ID of the virtual private cloud (VPC) that you're configuring the DNSSEC validation status
   * for.
   */
  public open fun resourceId(): String? = unwrap(this).getResourceId()

  /**
   * The ID of the virtual private cloud (VPC) that you're configuring the DNSSEC validation status
   * for.
   */
  public open fun resourceId(`value`: String) {
    unwrap(this).setResourceId(`value`)
  }

  /**
   * A fluent builder for
   * [io.cloudshiftdev.awscdk.services.route53resolver.CfnResolverDNSSECConfig].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The ID of the virtual private cloud (VPC) that you're configuring the DNSSEC validation
     * status for.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-route53resolver-resolverdnssecconfig.html#cfn-route53resolver-resolverdnssecconfig-resourceid)
     * @param resourceId The ID of the virtual private cloud (VPC) that you're configuring the
     * DNSSEC validation status for. 
     */
    public fun resourceId(resourceId: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.route53resolver.CfnResolverDNSSECConfig.Builder =
        software.amazon.awscdk.services.route53resolver.CfnResolverDNSSECConfig.Builder.create(scope,
        id)

    /**
     * The ID of the virtual private cloud (VPC) that you're configuring the DNSSEC validation
     * status for.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-route53resolver-resolverdnssecconfig.html#cfn-route53resolver-resolverdnssecconfig-resourceid)
     * @param resourceId The ID of the virtual private cloud (VPC) that you're configuring the
     * DNSSEC validation status for. 
     */
    override fun resourceId(resourceId: String) {
      cdkBuilder.resourceId(resourceId)
    }

    public fun build(): software.amazon.awscdk.services.route53resolver.CfnResolverDNSSECConfig =
        cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.route53resolver.CfnResolverDNSSECConfig.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnResolverDNSSECConfig {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnResolverDNSSECConfig(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.route53resolver.CfnResolverDNSSECConfig):
        CfnResolverDNSSECConfig = CfnResolverDNSSECConfig(cdkObject)

    internal fun unwrap(wrapped: CfnResolverDNSSECConfig):
        software.amazon.awscdk.services.route53resolver.CfnResolverDNSSECConfig = wrapped.cdkObject
        as software.amazon.awscdk.services.route53resolver.CfnResolverDNSSECConfig
  }
}
