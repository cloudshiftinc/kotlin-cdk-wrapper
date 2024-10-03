@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.route53

import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

/**
 * Properties for defining a `CfnRecordSetGroup`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.route53.*;
 * CfnRecordSetGroupProps cfnRecordSetGroupProps = CfnRecordSetGroupProps.builder()
 * .comment("comment")
 * .hostedZoneId("hostedZoneId")
 * .hostedZoneName("hostedZoneName")
 * .recordSets(List.of(RecordSetProperty.builder()
 * .name("name")
 * .type("type")
 * // the properties below are optional
 * .aliasTarget(AliasTargetProperty.builder()
 * .dnsName("dnsName")
 * .hostedZoneId("hostedZoneId")
 * // the properties below are optional
 * .evaluateTargetHealth(false)
 * .build())
 * .cidrRoutingConfig(CidrRoutingConfigProperty.builder()
 * .collectionId("collectionId")
 * .locationName("locationName")
 * .build())
 * .failover("failover")
 * .geoLocation(GeoLocationProperty.builder()
 * .continentCode("continentCode")
 * .countryCode("countryCode")
 * .subdivisionCode("subdivisionCode")
 * .build())
 * .geoProximityLocation(GeoProximityLocationProperty.builder()
 * .awsRegion("awsRegion")
 * .bias(123)
 * .coordinates(CoordinatesProperty.builder()
 * .latitude("latitude")
 * .longitude("longitude")
 * .build())
 * .localZoneGroup("localZoneGroup")
 * .build())
 * .healthCheckId("healthCheckId")
 * .hostedZoneId("hostedZoneId")
 * .hostedZoneName("hostedZoneName")
 * .multiValueAnswer(false)
 * .region("region")
 * .resourceRecords(List.of("resourceRecords"))
 * .setIdentifier("setIdentifier")
 * .ttl("ttl")
 * .weight(123)
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-route53-recordsetgroup.html)
 */
public interface CfnRecordSetGroupProps {
  /**
   * *Optional:* Any comments you want to include about a change batch request.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-route53-recordsetgroup.html#cfn-route53-recordsetgroup-comment)
   */
  public fun comment(): String? = unwrap(this).getComment()

  /**
   * The ID of the hosted zone that you want to create records in.
   *
   * Specify either `HostedZoneName` or `HostedZoneId` , but not both. If you have multiple hosted
   * zones with the same domain name, you must specify the hosted zone using `HostedZoneId` .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-route53-recordsetgroup.html#cfn-route53-recordsetgroup-hostedzoneid)
   */
  public fun hostedZoneId(): String? = unwrap(this).getHostedZoneId()

  /**
   * The name of the hosted zone that you want to create records in.
   *
   * You must include a trailing dot (for example, `www.example.com.` ) as part of the
   * `HostedZoneName` .
   *
   * When you create a stack using an `AWS::Route53::RecordSet` that specifies `HostedZoneName` ,
   * AWS CloudFormation attempts to find a hosted zone whose name matches the `HostedZoneName` . If AWS
   * CloudFormation can't find a hosted zone with a matching domain name, or if there is more than one
   * hosted zone with the specified domain name, AWS CloudFormation will not create the stack.
   *
   * Specify either `HostedZoneName` or `HostedZoneId` , but not both. If you have multiple hosted
   * zones with the same domain name, you must specify the hosted zone using `HostedZoneId` .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-route53-recordsetgroup.html#cfn-route53-recordsetgroup-hostedzonename)
   */
  public fun hostedZoneName(): String? = unwrap(this).getHostedZoneName()

  /**
   * A complex type that contains one `RecordSet` element for each record that you want to create.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-route53-recordsetgroup.html#cfn-route53-recordsetgroup-recordsets)
   */
  public fun recordSets(): Any? = unwrap(this).getRecordSets()

  /**
   * A builder for [CfnRecordSetGroupProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param comment *Optional:* Any comments you want to include about a change batch request.
     */
    public fun comment(comment: String)

    /**
     * @param hostedZoneId The ID of the hosted zone that you want to create records in.
     * Specify either `HostedZoneName` or `HostedZoneId` , but not both. If you have multiple hosted
     * zones with the same domain name, you must specify the hosted zone using `HostedZoneId` .
     */
    public fun hostedZoneId(hostedZoneId: String)

    /**
     * @param hostedZoneName The name of the hosted zone that you want to create records in.
     * You must include a trailing dot (for example, `www.example.com.` ) as part of the
     * `HostedZoneName` .
     *
     * When you create a stack using an `AWS::Route53::RecordSet` that specifies `HostedZoneName` ,
     * AWS CloudFormation attempts to find a hosted zone whose name matches the `HostedZoneName` . If
     * AWS CloudFormation can't find a hosted zone with a matching domain name, or if there is more
     * than one hosted zone with the specified domain name, AWS CloudFormation will not create the
     * stack.
     *
     * Specify either `HostedZoneName` or `HostedZoneId` , but not both. If you have multiple hosted
     * zones with the same domain name, you must specify the hosted zone using `HostedZoneId` .
     */
    public fun hostedZoneName(hostedZoneName: String)

    /**
     * @param recordSets A complex type that contains one `RecordSet` element for each record that
     * you want to create.
     */
    public fun recordSets(recordSets: IResolvable)

    /**
     * @param recordSets A complex type that contains one `RecordSet` element for each record that
     * you want to create.
     */
    public fun recordSets(recordSets: List<Any>)

    /**
     * @param recordSets A complex type that contains one `RecordSet` element for each record that
     * you want to create.
     */
    public fun recordSets(vararg recordSets: Any)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.route53.CfnRecordSetGroupProps.Builder =
        software.amazon.awscdk.services.route53.CfnRecordSetGroupProps.builder()

    /**
     * @param comment *Optional:* Any comments you want to include about a change batch request.
     */
    override fun comment(comment: String) {
      cdkBuilder.comment(comment)
    }

    /**
     * @param hostedZoneId The ID of the hosted zone that you want to create records in.
     * Specify either `HostedZoneName` or `HostedZoneId` , but not both. If you have multiple hosted
     * zones with the same domain name, you must specify the hosted zone using `HostedZoneId` .
     */
    override fun hostedZoneId(hostedZoneId: String) {
      cdkBuilder.hostedZoneId(hostedZoneId)
    }

    /**
     * @param hostedZoneName The name of the hosted zone that you want to create records in.
     * You must include a trailing dot (for example, `www.example.com.` ) as part of the
     * `HostedZoneName` .
     *
     * When you create a stack using an `AWS::Route53::RecordSet` that specifies `HostedZoneName` ,
     * AWS CloudFormation attempts to find a hosted zone whose name matches the `HostedZoneName` . If
     * AWS CloudFormation can't find a hosted zone with a matching domain name, or if there is more
     * than one hosted zone with the specified domain name, AWS CloudFormation will not create the
     * stack.
     *
     * Specify either `HostedZoneName` or `HostedZoneId` , but not both. If you have multiple hosted
     * zones with the same domain name, you must specify the hosted zone using `HostedZoneId` .
     */
    override fun hostedZoneName(hostedZoneName: String) {
      cdkBuilder.hostedZoneName(hostedZoneName)
    }

    /**
     * @param recordSets A complex type that contains one `RecordSet` element for each record that
     * you want to create.
     */
    override fun recordSets(recordSets: IResolvable) {
      cdkBuilder.recordSets(recordSets.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param recordSets A complex type that contains one `RecordSet` element for each record that
     * you want to create.
     */
    override fun recordSets(recordSets: List<Any>) {
      cdkBuilder.recordSets(recordSets.map{CdkObjectWrappers.unwrap(it)})
    }

    /**
     * @param recordSets A complex type that contains one `RecordSet` element for each record that
     * you want to create.
     */
    override fun recordSets(vararg recordSets: Any): Unit = recordSets(recordSets.toList())

    public fun build(): software.amazon.awscdk.services.route53.CfnRecordSetGroupProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.route53.CfnRecordSetGroupProps,
  ) : CdkObject(cdkObject),
      CfnRecordSetGroupProps {
    /**
     * *Optional:* Any comments you want to include about a change batch request.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-route53-recordsetgroup.html#cfn-route53-recordsetgroup-comment)
     */
    override fun comment(): String? = unwrap(this).getComment()

    /**
     * The ID of the hosted zone that you want to create records in.
     *
     * Specify either `HostedZoneName` or `HostedZoneId` , but not both. If you have multiple hosted
     * zones with the same domain name, you must specify the hosted zone using `HostedZoneId` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-route53-recordsetgroup.html#cfn-route53-recordsetgroup-hostedzoneid)
     */
    override fun hostedZoneId(): String? = unwrap(this).getHostedZoneId()

    /**
     * The name of the hosted zone that you want to create records in.
     *
     * You must include a trailing dot (for example, `www.example.com.` ) as part of the
     * `HostedZoneName` .
     *
     * When you create a stack using an `AWS::Route53::RecordSet` that specifies `HostedZoneName` ,
     * AWS CloudFormation attempts to find a hosted zone whose name matches the `HostedZoneName` . If
     * AWS CloudFormation can't find a hosted zone with a matching domain name, or if there is more
     * than one hosted zone with the specified domain name, AWS CloudFormation will not create the
     * stack.
     *
     * Specify either `HostedZoneName` or `HostedZoneId` , but not both. If you have multiple hosted
     * zones with the same domain name, you must specify the hosted zone using `HostedZoneId` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-route53-recordsetgroup.html#cfn-route53-recordsetgroup-hostedzonename)
     */
    override fun hostedZoneName(): String? = unwrap(this).getHostedZoneName()

    /**
     * A complex type that contains one `RecordSet` element for each record that you want to create.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-route53-recordsetgroup.html#cfn-route53-recordsetgroup-recordsets)
     */
    override fun recordSets(): Any? = unwrap(this).getRecordSets()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnRecordSetGroupProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.route53.CfnRecordSetGroupProps):
        CfnRecordSetGroupProps = CdkObjectWrappers.wrap(cdkObject) as? CfnRecordSetGroupProps ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnRecordSetGroupProps):
        software.amazon.awscdk.services.route53.CfnRecordSetGroupProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.route53.CfnRecordSetGroupProps
  }
}
