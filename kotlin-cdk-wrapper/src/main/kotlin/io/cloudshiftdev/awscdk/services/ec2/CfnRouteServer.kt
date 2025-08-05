@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ec2

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.ITaggableV2
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * Specifies a route server to manage dynamic routing in a VPC.
 *
 * Amazon VPC Route Server simplifies routing for traffic between workloads that are deployed within
 * a VPC and its internet gateways. With this feature, VPC Route Server dynamically updates VPC and
 * internet gateway route tables with your preferred routes to achieve routing fault tolerance for
 * those workloads. This enables you to automatically reroute traffic within a VPC, which increases the
 * manageability of VPC routing and interoperability with third-party workloads.
 *
 * For more information see [Dynamic routing in your VPC with VPC Route
 * Server](https://docs.aws.amazon.com/vpc/latest/userguide/dynamic-routing-route-server.html) in the
 * *Amazon VPC User Guide* .
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.ec2.*;
 * CfnRouteServer cfnRouteServer = CfnRouteServer.Builder.create(this, "MyCfnRouteServer")
 * .amazonSideAsn(123)
 * // the properties below are optional
 * .persistRoutes("persistRoutes")
 * .persistRoutesDuration(123)
 * .snsNotificationsEnabled(false)
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-routeserver.html)
 */
public open class CfnRouteServer(
  cdkObject: software.amazon.awscdk.services.ec2.CfnRouteServer,
) : CfnResource(cdkObject),
    IInspectable,
    ITaggableV2 {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnRouteServerProps,
  ) :
      this(software.amazon.awscdk.services.ec2.CfnRouteServer(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id, props.let(CfnRouteServerProps.Companion::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnRouteServerProps.Builder.() -> Unit,
  ) : this(scope, id, CfnRouteServerProps(props)
  )

  /**
   * The Border Gateway Protocol (BGP) Autonomous System Number (ASN) for the appliance.
   */
  public open fun amazonSideAsn(): Number = unwrap(this).getAmazonSideAsn()

  /**
   * The Border Gateway Protocol (BGP) Autonomous System Number (ASN) for the appliance.
   */
  public open fun amazonSideAsn(`value`: Number) {
    unwrap(this).setAmazonSideAsn(`value`)
  }

  /**
   * The ARN of the route server.
   */
  public open fun attrArn(): String = unwrap(this).getAttrArn()

  /**
   * The ID of the route server.
   */
  public open fun attrId(): String = unwrap(this).getAttrId()

  /**
   * Tag Manager which manages the tags for this resource.
   */
  public override fun cdkTagManager(): TagManager =
      unwrap(this).getCdkTagManager().let(TagManager::wrap)

  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector.Companion::unwrap))
  }

  /**
   * Indicates whether routes should be persisted after all BGP sessions are terminated.
   */
  public open fun persistRoutes(): String? = unwrap(this).getPersistRoutes()

  /**
   * Indicates whether routes should be persisted after all BGP sessions are terminated.
   */
  public open fun persistRoutes(`value`: String) {
    unwrap(this).setPersistRoutes(`value`)
  }

  /**
   * The number of minutes a route server will wait after BGP is re-established to unpersist the
   * routes in the FIB and RIB.
   */
  public open fun persistRoutesDuration(): Number? = unwrap(this).getPersistRoutesDuration()

  /**
   * The number of minutes a route server will wait after BGP is re-established to unpersist the
   * routes in the FIB and RIB.
   */
  public open fun persistRoutesDuration(`value`: Number) {
    unwrap(this).setPersistRoutesDuration(`value`)
  }

  /**
   * Indicates whether SNS notifications are enabled for the route server.
   */
  public open fun snsNotificationsEnabled(): Any? = unwrap(this).getSnsNotificationsEnabled()

  /**
   * Indicates whether SNS notifications are enabled for the route server.
   */
  public open fun snsNotificationsEnabled(`value`: Boolean) {
    unwrap(this).setSnsNotificationsEnabled(`value`)
  }

  /**
   * Indicates whether SNS notifications are enabled for the route server.
   */
  public open fun snsNotificationsEnabled(`value`: IResolvable) {
    unwrap(this).setSnsNotificationsEnabled(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   * Any tags assigned to the route server.
   */
  public open fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * Any tags assigned to the route server.
   */
  public open fun tags(`value`: List<CfnTag>) {
    unwrap(this).setTags(`value`.map(CfnTag.Companion::unwrap))
  }

  /**
   * Any tags assigned to the route server.
   */
  public open fun tags(vararg `value`: CfnTag): Unit = tags(`value`.toList())

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.ec2.CfnRouteServer].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The Border Gateway Protocol (BGP) Autonomous System Number (ASN) for the appliance.
     *
     * Valid values are from 1 to 4294967295. We recommend using a private ASN in the 64512–65534
     * (16-bit ASN) or 4200000000–4294967294 (32-bit ASN) range.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-routeserver.html#cfn-ec2-routeserver-amazonsideasn)
     * @param amazonSideAsn The Border Gateway Protocol (BGP) Autonomous System Number (ASN) for the
     * appliance. 
     */
    public fun amazonSideAsn(amazonSideAsn: Number)

    /**
     * Indicates whether routes should be persisted after all BGP sessions are terminated.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-routeserver.html#cfn-ec2-routeserver-persistroutes)
     * @param persistRoutes Indicates whether routes should be persisted after all BGP sessions are
     * terminated. 
     */
    public fun persistRoutes(persistRoutes: String)

    /**
     * The number of minutes a route server will wait after BGP is re-established to unpersist the
     * routes in the FIB and RIB.
     *
     * Value must be in the range of 1-5. The default value is 1. Only valid if `persistRoutesState`
     * is 'enabled'.
     *
     * If you set the duration to 1 minute, then when your network appliance re-establishes BGP with
     * route server, it has 1 minute to relearn it's adjacent network and advertise those routes to
     * route server before route server resumes normal functionality. In most cases, 1 minute is
     * probably sufficient. If, however, you have concerns that your BGP network may not be capable of
     * fully re-establishing and re-learning everything in 1 minute, you can increase the duration up
     * to 5 minutes.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-routeserver.html#cfn-ec2-routeserver-persistroutesduration)
     * @param persistRoutesDuration The number of minutes a route server will wait after BGP is
     * re-established to unpersist the routes in the FIB and RIB. 
     */
    public fun persistRoutesDuration(persistRoutesDuration: Number)

    /**
     * Indicates whether SNS notifications are enabled for the route server.
     *
     * Enabling SNS notifications persists BGP status changes to an SNS topic provisioned by AWS .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-routeserver.html#cfn-ec2-routeserver-snsnotificationsenabled)
     * @param snsNotificationsEnabled Indicates whether SNS notifications are enabled for the route
     * server. 
     */
    public fun snsNotificationsEnabled(snsNotificationsEnabled: Boolean)

    /**
     * Indicates whether SNS notifications are enabled for the route server.
     *
     * Enabling SNS notifications persists BGP status changes to an SNS topic provisioned by AWS .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-routeserver.html#cfn-ec2-routeserver-snsnotificationsenabled)
     * @param snsNotificationsEnabled Indicates whether SNS notifications are enabled for the route
     * server. 
     */
    public fun snsNotificationsEnabled(snsNotificationsEnabled: IResolvable)

    /**
     * Any tags assigned to the route server.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-routeserver.html#cfn-ec2-routeserver-tags)
     * @param tags Any tags assigned to the route server. 
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * Any tags assigned to the route server.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-routeserver.html#cfn-ec2-routeserver-tags)
     * @param tags Any tags assigned to the route server. 
     */
    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ec2.CfnRouteServer.Builder =
        software.amazon.awscdk.services.ec2.CfnRouteServer.Builder.create(scope, id)

    /**
     * The Border Gateway Protocol (BGP) Autonomous System Number (ASN) for the appliance.
     *
     * Valid values are from 1 to 4294967295. We recommend using a private ASN in the 64512–65534
     * (16-bit ASN) or 4200000000–4294967294 (32-bit ASN) range.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-routeserver.html#cfn-ec2-routeserver-amazonsideasn)
     * @param amazonSideAsn The Border Gateway Protocol (BGP) Autonomous System Number (ASN) for the
     * appliance. 
     */
    override fun amazonSideAsn(amazonSideAsn: Number) {
      cdkBuilder.amazonSideAsn(amazonSideAsn)
    }

    /**
     * Indicates whether routes should be persisted after all BGP sessions are terminated.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-routeserver.html#cfn-ec2-routeserver-persistroutes)
     * @param persistRoutes Indicates whether routes should be persisted after all BGP sessions are
     * terminated. 
     */
    override fun persistRoutes(persistRoutes: String) {
      cdkBuilder.persistRoutes(persistRoutes)
    }

    /**
     * The number of minutes a route server will wait after BGP is re-established to unpersist the
     * routes in the FIB and RIB.
     *
     * Value must be in the range of 1-5. The default value is 1. Only valid if `persistRoutesState`
     * is 'enabled'.
     *
     * If you set the duration to 1 minute, then when your network appliance re-establishes BGP with
     * route server, it has 1 minute to relearn it's adjacent network and advertise those routes to
     * route server before route server resumes normal functionality. In most cases, 1 minute is
     * probably sufficient. If, however, you have concerns that your BGP network may not be capable of
     * fully re-establishing and re-learning everything in 1 minute, you can increase the duration up
     * to 5 minutes.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-routeserver.html#cfn-ec2-routeserver-persistroutesduration)
     * @param persistRoutesDuration The number of minutes a route server will wait after BGP is
     * re-established to unpersist the routes in the FIB and RIB. 
     */
    override fun persistRoutesDuration(persistRoutesDuration: Number) {
      cdkBuilder.persistRoutesDuration(persistRoutesDuration)
    }

    /**
     * Indicates whether SNS notifications are enabled for the route server.
     *
     * Enabling SNS notifications persists BGP status changes to an SNS topic provisioned by AWS .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-routeserver.html#cfn-ec2-routeserver-snsnotificationsenabled)
     * @param snsNotificationsEnabled Indicates whether SNS notifications are enabled for the route
     * server. 
     */
    override fun snsNotificationsEnabled(snsNotificationsEnabled: Boolean) {
      cdkBuilder.snsNotificationsEnabled(snsNotificationsEnabled)
    }

    /**
     * Indicates whether SNS notifications are enabled for the route server.
     *
     * Enabling SNS notifications persists BGP status changes to an SNS topic provisioned by AWS .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-routeserver.html#cfn-ec2-routeserver-snsnotificationsenabled)
     * @param snsNotificationsEnabled Indicates whether SNS notifications are enabled for the route
     * server. 
     */
    override fun snsNotificationsEnabled(snsNotificationsEnabled: IResolvable) {
      cdkBuilder.snsNotificationsEnabled(snsNotificationsEnabled.let(IResolvable.Companion::unwrap))
    }

    /**
     * Any tags assigned to the route server.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-routeserver.html#cfn-ec2-routeserver-tags)
     * @param tags Any tags assigned to the route server. 
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag.Companion::unwrap))
    }

    /**
     * Any tags assigned to the route server.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-routeserver.html#cfn-ec2-routeserver-tags)
     * @param tags Any tags assigned to the route server. 
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.ec2.CfnRouteServer = cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.ec2.CfnRouteServer.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnRouteServer {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnRouteServer(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ec2.CfnRouteServer): CfnRouteServer
        = CfnRouteServer(cdkObject)

    internal fun unwrap(wrapped: CfnRouteServer): software.amazon.awscdk.services.ec2.CfnRouteServer
        = wrapped.cdkObject as software.amazon.awscdk.services.ec2.CfnRouteServer
  }
}
