@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ec2

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

/**
 * Properties for defining a `CfnRouteServer`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.ec2.*;
 * CfnRouteServerProps cfnRouteServerProps = CfnRouteServerProps.builder()
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
public interface CfnRouteServerProps {
  /**
   * The Border Gateway Protocol (BGP) Autonomous System Number (ASN) for the appliance.
   *
   * Valid values are from 1 to 4294967295. We recommend using a private ASN in the 64512–65534
   * (16-bit ASN) or 4200000000–4294967294 (32-bit ASN) range.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-routeserver.html#cfn-ec2-routeserver-amazonsideasn)
   */
  public fun amazonSideAsn(): Number

  /**
   * Indicates whether routes should be persisted after all BGP sessions are terminated.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-routeserver.html#cfn-ec2-routeserver-persistroutes)
   */
  public fun persistRoutes(): String? = unwrap(this).getPersistRoutes()

  /**
   * The number of minutes a route server will wait after BGP is re-established to unpersist the
   * routes in the FIB and RIB.
   *
   * Value must be in the range of 1-5. The default value is 1. Only valid if `persistRoutesState`
   * is 'enabled'.
   *
   * If you set the duration to 1 minute, then when your network appliance re-establishes BGP with
   * route server, it has 1 minute to relearn it's adjacent network and advertise those routes to route
   * server before route server resumes normal functionality. In most cases, 1 minute is probably
   * sufficient. If, however, you have concerns that your BGP network may not be capable of fully
   * re-establishing and re-learning everything in 1 minute, you can increase the duration up to 5
   * minutes.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-routeserver.html#cfn-ec2-routeserver-persistroutesduration)
   */
  public fun persistRoutesDuration(): Number? = unwrap(this).getPersistRoutesDuration()

  /**
   * Indicates whether SNS notifications are enabled for the route server.
   *
   * Enabling SNS notifications persists BGP status changes to an SNS topic provisioned by AWS .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-routeserver.html#cfn-ec2-routeserver-snsnotificationsenabled)
   */
  public fun snsNotificationsEnabled(): Any? = unwrap(this).getSnsNotificationsEnabled()

  /**
   * Any tags assigned to the route server.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-routeserver.html#cfn-ec2-routeserver-tags)
   */
  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * A builder for [CfnRouteServerProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param amazonSideAsn The Border Gateway Protocol (BGP) Autonomous System Number (ASN) for the
     * appliance. 
     * Valid values are from 1 to 4294967295. We recommend using a private ASN in the 64512–65534
     * (16-bit ASN) or 4200000000–4294967294 (32-bit ASN) range.
     */
    public fun amazonSideAsn(amazonSideAsn: Number)

    /**
     * @param persistRoutes Indicates whether routes should be persisted after all BGP sessions are
     * terminated.
     */
    public fun persistRoutes(persistRoutes: String)

    /**
     * @param persistRoutesDuration The number of minutes a route server will wait after BGP is
     * re-established to unpersist the routes in the FIB and RIB.
     * Value must be in the range of 1-5. The default value is 1. Only valid if `persistRoutesState`
     * is 'enabled'.
     *
     * If you set the duration to 1 minute, then when your network appliance re-establishes BGP with
     * route server, it has 1 minute to relearn it's adjacent network and advertise those routes to
     * route server before route server resumes normal functionality. In most cases, 1 minute is
     * probably sufficient. If, however, you have concerns that your BGP network may not be capable of
     * fully re-establishing and re-learning everything in 1 minute, you can increase the duration up
     * to 5 minutes.
     */
    public fun persistRoutesDuration(persistRoutesDuration: Number)

    /**
     * @param snsNotificationsEnabled Indicates whether SNS notifications are enabled for the route
     * server.
     * Enabling SNS notifications persists BGP status changes to an SNS topic provisioned by AWS .
     */
    public fun snsNotificationsEnabled(snsNotificationsEnabled: Boolean)

    /**
     * @param snsNotificationsEnabled Indicates whether SNS notifications are enabled for the route
     * server.
     * Enabling SNS notifications persists BGP status changes to an SNS topic provisioned by AWS .
     */
    public fun snsNotificationsEnabled(snsNotificationsEnabled: IResolvable)

    /**
     * @param tags Any tags assigned to the route server.
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * @param tags Any tags assigned to the route server.
     */
    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ec2.CfnRouteServerProps.Builder =
        software.amazon.awscdk.services.ec2.CfnRouteServerProps.builder()

    /**
     * @param amazonSideAsn The Border Gateway Protocol (BGP) Autonomous System Number (ASN) for the
     * appliance. 
     * Valid values are from 1 to 4294967295. We recommend using a private ASN in the 64512–65534
     * (16-bit ASN) or 4200000000–4294967294 (32-bit ASN) range.
     */
    override fun amazonSideAsn(amazonSideAsn: Number) {
      cdkBuilder.amazonSideAsn(amazonSideAsn)
    }

    /**
     * @param persistRoutes Indicates whether routes should be persisted after all BGP sessions are
     * terminated.
     */
    override fun persistRoutes(persistRoutes: String) {
      cdkBuilder.persistRoutes(persistRoutes)
    }

    /**
     * @param persistRoutesDuration The number of minutes a route server will wait after BGP is
     * re-established to unpersist the routes in the FIB and RIB.
     * Value must be in the range of 1-5. The default value is 1. Only valid if `persistRoutesState`
     * is 'enabled'.
     *
     * If you set the duration to 1 minute, then when your network appliance re-establishes BGP with
     * route server, it has 1 minute to relearn it's adjacent network and advertise those routes to
     * route server before route server resumes normal functionality. In most cases, 1 minute is
     * probably sufficient. If, however, you have concerns that your BGP network may not be capable of
     * fully re-establishing and re-learning everything in 1 minute, you can increase the duration up
     * to 5 minutes.
     */
    override fun persistRoutesDuration(persistRoutesDuration: Number) {
      cdkBuilder.persistRoutesDuration(persistRoutesDuration)
    }

    /**
     * @param snsNotificationsEnabled Indicates whether SNS notifications are enabled for the route
     * server.
     * Enabling SNS notifications persists BGP status changes to an SNS topic provisioned by AWS .
     */
    override fun snsNotificationsEnabled(snsNotificationsEnabled: Boolean) {
      cdkBuilder.snsNotificationsEnabled(snsNotificationsEnabled)
    }

    /**
     * @param snsNotificationsEnabled Indicates whether SNS notifications are enabled for the route
     * server.
     * Enabling SNS notifications persists BGP status changes to an SNS topic provisioned by AWS .
     */
    override fun snsNotificationsEnabled(snsNotificationsEnabled: IResolvable) {
      cdkBuilder.snsNotificationsEnabled(snsNotificationsEnabled.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param tags Any tags assigned to the route server.
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag.Companion::unwrap))
    }

    /**
     * @param tags Any tags assigned to the route server.
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.ec2.CfnRouteServerProps = cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.ec2.CfnRouteServerProps,
  ) : CdkObject(cdkObject),
      CfnRouteServerProps {
    /**
     * The Border Gateway Protocol (BGP) Autonomous System Number (ASN) for the appliance.
     *
     * Valid values are from 1 to 4294967295. We recommend using a private ASN in the 64512–65534
     * (16-bit ASN) or 4200000000–4294967294 (32-bit ASN) range.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-routeserver.html#cfn-ec2-routeserver-amazonsideasn)
     */
    override fun amazonSideAsn(): Number = unwrap(this).getAmazonSideAsn()

    /**
     * Indicates whether routes should be persisted after all BGP sessions are terminated.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-routeserver.html#cfn-ec2-routeserver-persistroutes)
     */
    override fun persistRoutes(): String? = unwrap(this).getPersistRoutes()

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
     */
    override fun persistRoutesDuration(): Number? = unwrap(this).getPersistRoutesDuration()

    /**
     * Indicates whether SNS notifications are enabled for the route server.
     *
     * Enabling SNS notifications persists BGP status changes to an SNS topic provisioned by AWS .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-routeserver.html#cfn-ec2-routeserver-snsnotificationsenabled)
     */
    override fun snsNotificationsEnabled(): Any? = unwrap(this).getSnsNotificationsEnabled()

    /**
     * Any tags assigned to the route server.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-routeserver.html#cfn-ec2-routeserver-tags)
     */
    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnRouteServerProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ec2.CfnRouteServerProps):
        CfnRouteServerProps = CdkObjectWrappers.wrap(cdkObject) as? CfnRouteServerProps ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnRouteServerProps):
        software.amazon.awscdk.services.ec2.CfnRouteServerProps = (wrapped as CdkObject).cdkObject
        as software.amazon.awscdk.services.ec2.CfnRouteServerProps
  }
}
