@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.route53

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * A complex type that contains an optional comment, the name and ID of the hosted zone that you
 * want to make changes in, and values for the records that you want to create.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.route53.*;
 * CfnRecordSetGroup cfnRecordSetGroup = CfnRecordSetGroup.Builder.create(this,
 * "MyCfnRecordSetGroup")
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
public open class CfnRecordSetGroup internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.route53.CfnRecordSetGroup,
) : CfnResource(cdkObject), IInspectable {
  /**
   * Specifies a coordinate of the east–west position of a geographic point on the surface of the
   * Earth.
   */
  public open fun attrId(): String = unwrap(this).getAttrId()

  /**
   * *Optional:* Any comments you want to include about a change batch request.
   */
  public open fun comment(): String? = unwrap(this).getComment()

  /**
   * *Optional:* Any comments you want to include about a change batch request.
   */
  public open fun comment(`value`: String) {
    unwrap(this).setComment(`value`)
  }

  /**
   * The ID of the hosted zone that you want to create records in.
   */
  public open fun hostedZoneId(): String? = unwrap(this).getHostedZoneId()

  /**
   * The ID of the hosted zone that you want to create records in.
   */
  public open fun hostedZoneId(`value`: String) {
    unwrap(this).setHostedZoneId(`value`)
  }

  /**
   * The name of the hosted zone that you want to create records in.
   */
  public open fun hostedZoneName(): String? = unwrap(this).getHostedZoneName()

  /**
   * The name of the hosted zone that you want to create records in.
   */
  public open fun hostedZoneName(`value`: String) {
    unwrap(this).setHostedZoneName(`value`)
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
   * A complex type that contains one `RecordSet` element for each record that you want to create.
   */
  public open fun recordSets(): Any? = unwrap(this).getRecordSets()

  /**
   * A complex type that contains one `RecordSet` element for each record that you want to create.
   */
  public open fun recordSets(`value`: IResolvable) {
    unwrap(this).setRecordSets(`value`.let(IResolvable::unwrap))
  }

  /**
   * A complex type that contains one `RecordSet` element for each record that you want to create.
   */
  public open fun recordSets(__idx_ac66f0: List<Any>) {
    unwrap(this).setRecordSets(__idx_ac66f0)
  }

  /**
   * A complex type that contains one `RecordSet` element for each record that you want to create.
   */
  public open fun recordSets(vararg __idx_ac66f0: Any): Unit = recordSets(__idx_ac66f0.toList())

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.route53.CfnRecordSetGroup].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * *Optional:* Any comments you want to include about a change batch request.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-route53-recordsetgroup.html#cfn-route53-recordsetgroup-comment)
     * @param comment *Optional:* Any comments you want to include about a change batch request. 
     */
    public fun comment(comment: String)

    /**
     * The ID of the hosted zone that you want to create records in.
     *
     * Specify either `HostedZoneName` or `HostedZoneId` , but not both. If you have multiple hosted
     * zones with the same domain name, you must specify the hosted zone using `HostedZoneId` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-route53-recordsetgroup.html#cfn-route53-recordsetgroup-hostedzoneid)
     * @param hostedZoneId The ID of the hosted zone that you want to create records in. 
     */
    public fun hostedZoneId(hostedZoneId: String)

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
     * @param hostedZoneName The name of the hosted zone that you want to create records in. 
     */
    public fun hostedZoneName(hostedZoneName: String)

    /**
     * A complex type that contains one `RecordSet` element for each record that you want to create.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-route53-recordsetgroup.html#cfn-route53-recordsetgroup-recordsets)
     * @param recordSets A complex type that contains one `RecordSet` element for each record that
     * you want to create. 
     */
    public fun recordSets(recordSets: IResolvable)

    /**
     * A complex type that contains one `RecordSet` element for each record that you want to create.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-route53-recordsetgroup.html#cfn-route53-recordsetgroup-recordsets)
     * @param recordSets A complex type that contains one `RecordSet` element for each record that
     * you want to create. 
     */
    public fun recordSets(recordSets: List<Any>)

    /**
     * A complex type that contains one `RecordSet` element for each record that you want to create.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-route53-recordsetgroup.html#cfn-route53-recordsetgroup-recordsets)
     * @param recordSets A complex type that contains one `RecordSet` element for each record that
     * you want to create. 
     */
    public fun recordSets(vararg recordSets: Any)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.route53.CfnRecordSetGroup.Builder =
        software.amazon.awscdk.services.route53.CfnRecordSetGroup.Builder.create(scope, id)

    /**
     * *Optional:* Any comments you want to include about a change batch request.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-route53-recordsetgroup.html#cfn-route53-recordsetgroup-comment)
     * @param comment *Optional:* Any comments you want to include about a change batch request. 
     */
    override fun comment(comment: String) {
      cdkBuilder.comment(comment)
    }

    /**
     * The ID of the hosted zone that you want to create records in.
     *
     * Specify either `HostedZoneName` or `HostedZoneId` , but not both. If you have multiple hosted
     * zones with the same domain name, you must specify the hosted zone using `HostedZoneId` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-route53-recordsetgroup.html#cfn-route53-recordsetgroup-hostedzoneid)
     * @param hostedZoneId The ID of the hosted zone that you want to create records in. 
     */
    override fun hostedZoneId(hostedZoneId: String) {
      cdkBuilder.hostedZoneId(hostedZoneId)
    }

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
     * @param hostedZoneName The name of the hosted zone that you want to create records in. 
     */
    override fun hostedZoneName(hostedZoneName: String) {
      cdkBuilder.hostedZoneName(hostedZoneName)
    }

    /**
     * A complex type that contains one `RecordSet` element for each record that you want to create.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-route53-recordsetgroup.html#cfn-route53-recordsetgroup-recordsets)
     * @param recordSets A complex type that contains one `RecordSet` element for each record that
     * you want to create. 
     */
    override fun recordSets(recordSets: IResolvable) {
      cdkBuilder.recordSets(recordSets.let(IResolvable::unwrap))
    }

    /**
     * A complex type that contains one `RecordSet` element for each record that you want to create.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-route53-recordsetgroup.html#cfn-route53-recordsetgroup-recordsets)
     * @param recordSets A complex type that contains one `RecordSet` element for each record that
     * you want to create. 
     */
    override fun recordSets(recordSets: List<Any>) {
      cdkBuilder.recordSets(recordSets)
    }

    /**
     * A complex type that contains one `RecordSet` element for each record that you want to create.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-route53-recordsetgroup.html#cfn-route53-recordsetgroup-recordsets)
     * @param recordSets A complex type that contains one `RecordSet` element for each record that
     * you want to create. 
     */
    override fun recordSets(vararg recordSets: Any): Unit = recordSets(recordSets.toList())

    public fun build(): software.amazon.awscdk.services.route53.CfnRecordSetGroup =
        cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.route53.CfnRecordSetGroup.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnRecordSetGroup {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnRecordSetGroup(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.route53.CfnRecordSetGroup):
        CfnRecordSetGroup = CfnRecordSetGroup(cdkObject)

    internal fun unwrap(wrapped: CfnRecordSetGroup):
        software.amazon.awscdk.services.route53.CfnRecordSetGroup = wrapped.cdkObject
  }

  /**
   * A complex type that lists the coordinates for a geoproximity resource record.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.route53.*;
   * CoordinatesProperty coordinatesProperty = CoordinatesProperty.builder()
   * .latitude("latitude")
   * .longitude("longitude")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-route53-recordsetgroup-coordinates.html)
   */
  public interface CoordinatesProperty {
    /**
     * Specifies a coordinate of the north–south position of a geographic point on the surface of
     * the Earth (-90 - 90).
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-route53-recordsetgroup-coordinates.html#cfn-route53-recordsetgroup-coordinates-latitude)
     */
    public fun latitude(): String

    /**
     * Specifies a coordinate of the east–west position of a geographic point on the surface of the
     * Earth (-180 - 180).
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-route53-recordsetgroup-coordinates.html#cfn-route53-recordsetgroup-coordinates-longitude)
     */
    public fun longitude(): String

    /**
     * A builder for [CoordinatesProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param latitude Specifies a coordinate of the north–south position of a geographic point on
       * the surface of the Earth (-90 - 90). 
       */
      public fun latitude(latitude: String)

      /**
       * @param longitude Specifies a coordinate of the east–west position of a geographic point on
       * the surface of the Earth (-180 - 180). 
       */
      public fun longitude(longitude: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.route53.CfnRecordSetGroup.CoordinatesProperty.Builder =
          software.amazon.awscdk.services.route53.CfnRecordSetGroup.CoordinatesProperty.builder()

      /**
       * @param latitude Specifies a coordinate of the north–south position of a geographic point on
       * the surface of the Earth (-90 - 90). 
       */
      override fun latitude(latitude: String) {
        cdkBuilder.latitude(latitude)
      }

      /**
       * @param longitude Specifies a coordinate of the east–west position of a geographic point on
       * the surface of the Earth (-180 - 180). 
       */
      override fun longitude(longitude: String) {
        cdkBuilder.longitude(longitude)
      }

      public fun build():
          software.amazon.awscdk.services.route53.CfnRecordSetGroup.CoordinatesProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.route53.CfnRecordSetGroup.CoordinatesProperty,
    ) : CdkObject(cdkObject), CoordinatesProperty {
      /**
       * Specifies a coordinate of the north–south position of a geographic point on the surface of
       * the Earth (-90 - 90).
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-route53-recordsetgroup-coordinates.html#cfn-route53-recordsetgroup-coordinates-latitude)
       */
      override fun latitude(): String = unwrap(this).getLatitude()

      /**
       * Specifies a coordinate of the east–west position of a geographic point on the surface of
       * the Earth (-180 - 180).
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-route53-recordsetgroup-coordinates.html#cfn-route53-recordsetgroup-coordinates-longitude)
       */
      override fun longitude(): String = unwrap(this).getLongitude()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): CoordinatesProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.route53.CfnRecordSetGroup.CoordinatesProperty):
          CoordinatesProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: CoordinatesProperty):
          software.amazon.awscdk.services.route53.CfnRecordSetGroup.CoordinatesProperty = (wrapped
          as CdkObject).cdkObject as
          software.amazon.awscdk.services.route53.CfnRecordSetGroup.CoordinatesProperty
    }
  }

  /**
   * (Resource record sets only): A complex type that lets you specify where your resources are
   * located.
   *
   * Only one of `LocalZoneGroup` , `Coordinates` , or `AWS Region` is allowed per request at a
   * time.
   *
   * For more information about geoproximity routing, see [Geoproximity
   * routing](https://docs.aws.amazon.com/Route53/latest/DeveloperGuide/routing-policy-geoproximity.html)
   * in the *Amazon Route 53 Developer Guide* .
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.route53.*;
   * GeoProximityLocationProperty geoProximityLocationProperty =
   * GeoProximityLocationProperty.builder()
   * .awsRegion("awsRegion")
   * .bias(123)
   * .coordinates(CoordinatesProperty.builder()
   * .latitude("latitude")
   * .longitude("longitude")
   * .build())
   * .localZoneGroup("localZoneGroup")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-route53-recordsetgroup-geoproximitylocation.html)
   */
  public interface GeoProximityLocationProperty {
    /**
     * The AWS Region the resource you are directing DNS traffic to, is in.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-route53-recordsetgroup-geoproximitylocation.html#cfn-route53-recordsetgroup-geoproximitylocation-awsregion)
     */
    public fun awsRegion(): String? = unwrap(this).getAwsRegion()

    /**
     * The bias increases or decreases the size of the geographic region from which Route 53 routes
     * traffic to a resource.
     *
     * To use `Bias` to change the size of the geographic region, specify the applicable value for
     * the bias:
     *
     * * To expand the size of the geographic region from which Route 53 routes traffic to a
     * resource, specify a positive integer from 1 to 99 for the bias. Route 53 shrinks the size of
     * adjacent regions.
     * * To shrink the size of the geographic region from which Route 53 routes traffic to a
     * resource, specify a negative bias of -1 to -99. Route 53 expands the size of adjacent regions.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-route53-recordsetgroup-geoproximitylocation.html#cfn-route53-recordsetgroup-geoproximitylocation-bias)
     */
    public fun bias(): Number? = unwrap(this).getBias()

    /**
     * Contains the longitude and latitude for a geographic region.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-route53-recordsetgroup-geoproximitylocation.html#cfn-route53-recordsetgroup-geoproximitylocation-coordinates)
     */
    public fun coordinates(): Any? = unwrap(this).getCoordinates()

    /**
     * Specifies an AWS Local Zone Group.
     *
     * A local Zone Group is usually the Local Zone code without the ending character. For example,
     * if the Local Zone is `us-east-1-bue-1a` the Local Zone Group is `us-east-1-bue-1` .
     *
     * You can identify the Local Zones Group for a specific Local Zone by using the
     * [describe-availability-zones](https://docs.aws.amazon.com/cli/latest/reference/ec2/describe-availability-zones.html)
     * CLI command:
     *
     * This command returns: `"GroupName": "us-west-2-den-1"` , specifying that the Local Zone
     * `us-west-2-den-1a` belongs to the Local Zone Group `us-west-2-den-1` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-route53-recordsetgroup-geoproximitylocation.html#cfn-route53-recordsetgroup-geoproximitylocation-localzonegroup)
     */
    public fun localZoneGroup(): String? = unwrap(this).getLocalZoneGroup()

    /**
     * A builder for [GeoProximityLocationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param awsRegion The AWS Region the resource you are directing DNS traffic to, is in.
       */
      public fun awsRegion(awsRegion: String)

      /**
       * @param bias The bias increases or decreases the size of the geographic region from which
       * Route 53 routes traffic to a resource.
       * To use `Bias` to change the size of the geographic region, specify the applicable value for
       * the bias:
       *
       * * To expand the size of the geographic region from which Route 53 routes traffic to a
       * resource, specify a positive integer from 1 to 99 for the bias. Route 53 shrinks the size of
       * adjacent regions.
       * * To shrink the size of the geographic region from which Route 53 routes traffic to a
       * resource, specify a negative bias of -1 to -99. Route 53 expands the size of adjacent regions.
       */
      public fun bias(bias: Number)

      /**
       * @param coordinates Contains the longitude and latitude for a geographic region.
       */
      public fun coordinates(coordinates: IResolvable)

      /**
       * @param coordinates Contains the longitude and latitude for a geographic region.
       */
      public fun coordinates(coordinates: CoordinatesProperty)

      /**
       * @param coordinates Contains the longitude and latitude for a geographic region.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("403c1cd48607f49f91e0e983b38dbdc5005b4fddb480ba24dc6ac49f3e4e1609")
      public fun coordinates(coordinates: CoordinatesProperty.Builder.() -> Unit)

      /**
       * @param localZoneGroup Specifies an AWS Local Zone Group.
       * A local Zone Group is usually the Local Zone code without the ending character. For
       * example, if the Local Zone is `us-east-1-bue-1a` the Local Zone Group is `us-east-1-bue-1` .
       *
       * You can identify the Local Zones Group for a specific Local Zone by using the
       * [describe-availability-zones](https://docs.aws.amazon.com/cli/latest/reference/ec2/describe-availability-zones.html)
       * CLI command:
       *
       * This command returns: `"GroupName": "us-west-2-den-1"` , specifying that the Local Zone
       * `us-west-2-den-1a` belongs to the Local Zone Group `us-west-2-den-1` .
       */
      public fun localZoneGroup(localZoneGroup: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.route53.CfnRecordSetGroup.GeoProximityLocationProperty.Builder
          =
          software.amazon.awscdk.services.route53.CfnRecordSetGroup.GeoProximityLocationProperty.builder()

      /**
       * @param awsRegion The AWS Region the resource you are directing DNS traffic to, is in.
       */
      override fun awsRegion(awsRegion: String) {
        cdkBuilder.awsRegion(awsRegion)
      }

      /**
       * @param bias The bias increases or decreases the size of the geographic region from which
       * Route 53 routes traffic to a resource.
       * To use `Bias` to change the size of the geographic region, specify the applicable value for
       * the bias:
       *
       * * To expand the size of the geographic region from which Route 53 routes traffic to a
       * resource, specify a positive integer from 1 to 99 for the bias. Route 53 shrinks the size of
       * adjacent regions.
       * * To shrink the size of the geographic region from which Route 53 routes traffic to a
       * resource, specify a negative bias of -1 to -99. Route 53 expands the size of adjacent regions.
       */
      override fun bias(bias: Number) {
        cdkBuilder.bias(bias)
      }

      /**
       * @param coordinates Contains the longitude and latitude for a geographic region.
       */
      override fun coordinates(coordinates: IResolvable) {
        cdkBuilder.coordinates(coordinates.let(IResolvable::unwrap))
      }

      /**
       * @param coordinates Contains the longitude and latitude for a geographic region.
       */
      override fun coordinates(coordinates: CoordinatesProperty) {
        cdkBuilder.coordinates(coordinates.let(CoordinatesProperty::unwrap))
      }

      /**
       * @param coordinates Contains the longitude and latitude for a geographic region.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("403c1cd48607f49f91e0e983b38dbdc5005b4fddb480ba24dc6ac49f3e4e1609")
      override fun coordinates(coordinates: CoordinatesProperty.Builder.() -> Unit): Unit =
          coordinates(CoordinatesProperty(coordinates))

      /**
       * @param localZoneGroup Specifies an AWS Local Zone Group.
       * A local Zone Group is usually the Local Zone code without the ending character. For
       * example, if the Local Zone is `us-east-1-bue-1a` the Local Zone Group is `us-east-1-bue-1` .
       *
       * You can identify the Local Zones Group for a specific Local Zone by using the
       * [describe-availability-zones](https://docs.aws.amazon.com/cli/latest/reference/ec2/describe-availability-zones.html)
       * CLI command:
       *
       * This command returns: `"GroupName": "us-west-2-den-1"` , specifying that the Local Zone
       * `us-west-2-den-1a` belongs to the Local Zone Group `us-west-2-den-1` .
       */
      override fun localZoneGroup(localZoneGroup: String) {
        cdkBuilder.localZoneGroup(localZoneGroup)
      }

      public fun build():
          software.amazon.awscdk.services.route53.CfnRecordSetGroup.GeoProximityLocationProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.route53.CfnRecordSetGroup.GeoProximityLocationProperty,
    ) : CdkObject(cdkObject), GeoProximityLocationProperty {
      /**
       * The AWS Region the resource you are directing DNS traffic to, is in.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-route53-recordsetgroup-geoproximitylocation.html#cfn-route53-recordsetgroup-geoproximitylocation-awsregion)
       */
      override fun awsRegion(): String? = unwrap(this).getAwsRegion()

      /**
       * The bias increases or decreases the size of the geographic region from which Route 53
       * routes traffic to a resource.
       *
       * To use `Bias` to change the size of the geographic region, specify the applicable value for
       * the bias:
       *
       * * To expand the size of the geographic region from which Route 53 routes traffic to a
       * resource, specify a positive integer from 1 to 99 for the bias. Route 53 shrinks the size of
       * adjacent regions.
       * * To shrink the size of the geographic region from which Route 53 routes traffic to a
       * resource, specify a negative bias of -1 to -99. Route 53 expands the size of adjacent regions.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-route53-recordsetgroup-geoproximitylocation.html#cfn-route53-recordsetgroup-geoproximitylocation-bias)
       */
      override fun bias(): Number? = unwrap(this).getBias()

      /**
       * Contains the longitude and latitude for a geographic region.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-route53-recordsetgroup-geoproximitylocation.html#cfn-route53-recordsetgroup-geoproximitylocation-coordinates)
       */
      override fun coordinates(): Any? = unwrap(this).getCoordinates()

      /**
       * Specifies an AWS Local Zone Group.
       *
       * A local Zone Group is usually the Local Zone code without the ending character. For
       * example, if the Local Zone is `us-east-1-bue-1a` the Local Zone Group is `us-east-1-bue-1` .
       *
       * You can identify the Local Zones Group for a specific Local Zone by using the
       * [describe-availability-zones](https://docs.aws.amazon.com/cli/latest/reference/ec2/describe-availability-zones.html)
       * CLI command:
       *
       * This command returns: `"GroupName": "us-west-2-den-1"` , specifying that the Local Zone
       * `us-west-2-den-1a` belongs to the Local Zone Group `us-west-2-den-1` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-route53-recordsetgroup-geoproximitylocation.html#cfn-route53-recordsetgroup-geoproximitylocation-localzonegroup)
       */
      override fun localZoneGroup(): String? = unwrap(this).getLocalZoneGroup()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): GeoProximityLocationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.route53.CfnRecordSetGroup.GeoProximityLocationProperty):
          GeoProximityLocationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: GeoProximityLocationProperty):
          software.amazon.awscdk.services.route53.CfnRecordSetGroup.GeoProximityLocationProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.route53.CfnRecordSetGroup.GeoProximityLocationProperty
    }
  }

  /**
   * The object that is specified in resource record set object when you are linking a resource
   * record set to a CIDR location.
   *
   * A `LocationName` with an asterisk “*” can be used to create a default CIDR record.
   * `CollectionId` is still required for default record.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.route53.*;
   * CidrRoutingConfigProperty cidrRoutingConfigProperty = CidrRoutingConfigProperty.builder()
   * .collectionId("collectionId")
   * .locationName("locationName")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-route53-recordsetgroup-cidrroutingconfig.html)
   */
  public interface CidrRoutingConfigProperty {
    /**
     * The CIDR collection ID.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-route53-recordsetgroup-cidrroutingconfig.html#cfn-route53-recordsetgroup-cidrroutingconfig-collectionid)
     */
    public fun collectionId(): String

    /**
     * The CIDR collection location name.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-route53-recordsetgroup-cidrroutingconfig.html#cfn-route53-recordsetgroup-cidrroutingconfig-locationname)
     */
    public fun locationName(): String

    /**
     * A builder for [CidrRoutingConfigProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param collectionId The CIDR collection ID. 
       */
      public fun collectionId(collectionId: String)

      /**
       * @param locationName The CIDR collection location name. 
       */
      public fun locationName(locationName: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.route53.CfnRecordSetGroup.CidrRoutingConfigProperty.Builder
          =
          software.amazon.awscdk.services.route53.CfnRecordSetGroup.CidrRoutingConfigProperty.builder()

      /**
       * @param collectionId The CIDR collection ID. 
       */
      override fun collectionId(collectionId: String) {
        cdkBuilder.collectionId(collectionId)
      }

      /**
       * @param locationName The CIDR collection location name. 
       */
      override fun locationName(locationName: String) {
        cdkBuilder.locationName(locationName)
      }

      public fun build():
          software.amazon.awscdk.services.route53.CfnRecordSetGroup.CidrRoutingConfigProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.route53.CfnRecordSetGroup.CidrRoutingConfigProperty,
    ) : CdkObject(cdkObject), CidrRoutingConfigProperty {
      /**
       * The CIDR collection ID.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-route53-recordsetgroup-cidrroutingconfig.html#cfn-route53-recordsetgroup-cidrroutingconfig-collectionid)
       */
      override fun collectionId(): String = unwrap(this).getCollectionId()

      /**
       * The CIDR collection location name.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-route53-recordsetgroup-cidrroutingconfig.html#cfn-route53-recordsetgroup-cidrroutingconfig-locationname)
       */
      override fun locationName(): String = unwrap(this).getLocationName()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): CidrRoutingConfigProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.route53.CfnRecordSetGroup.CidrRoutingConfigProperty):
          CidrRoutingConfigProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: CidrRoutingConfigProperty):
          software.amazon.awscdk.services.route53.CfnRecordSetGroup.CidrRoutingConfigProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.route53.CfnRecordSetGroup.CidrRoutingConfigProperty
    }
  }

  /**
   * A complex type that contains information about a geographic location.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.route53.*;
   * GeoLocationProperty geoLocationProperty = GeoLocationProperty.builder()
   * .continentCode("continentCode")
   * .countryCode("countryCode")
   * .subdivisionCode("subdivisionCode")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-route53-recordsetgroup-geolocation.html)
   */
  public interface GeoLocationProperty {
    /**
     * For geolocation resource record sets, a two-letter abbreviation that identifies a continent.
     * Route 53 supports the following continent codes:.
     *
     * * *AF* : Africa
     * * *AN* : Antarctica
     * * *AS* : Asia
     * * *EU* : Europe
     * * *OC* : Oceania
     * * *NA* : North America
     * * *SA* : South America
     *
     * Constraint: Specifying `ContinentCode` with either `CountryCode` or `SubdivisionCode` returns
     * an `InvalidInput` error.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-route53-recordsetgroup-geolocation.html#cfn-route53-recordsetgroup-geolocation-continentcode)
     */
    public fun continentCode(): String? = unwrap(this).getContinentCode()

    /**
     * For geolocation resource record sets, the two-letter code for a country.
     *
     * Route 53 uses the two-letter country codes that are specified in [ISO standard 3166-1
     * alpha-2](https://docs.aws.amazon.com/https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2) .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-route53-recordsetgroup-geolocation.html#cfn-route53-recordsetgroup-geolocation-countrycode)
     */
    public fun countryCode(): String? = unwrap(this).getCountryCode()

    /**
     * For geolocation resource record sets, the two-letter code for a state of the United States.
     *
     * Route 53 doesn't support any other values for `SubdivisionCode` . For a list of state
     * abbreviations, see [Appendix B: Two–Letter State and Possession
     * Abbreviations](https://docs.aws.amazon.com/https://pe.usps.com/text/pub28/28apb.htm) on the
     * United States Postal Service website.
     *
     * If you specify `subdivisioncode` , you must also specify `US` for `CountryCode` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-route53-recordsetgroup-geolocation.html#cfn-route53-recordsetgroup-geolocation-subdivisioncode)
     */
    public fun subdivisionCode(): String? = unwrap(this).getSubdivisionCode()

    /**
     * A builder for [GeoLocationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param continentCode For geolocation resource record sets, a two-letter abbreviation that
       * identifies a continent. Route 53 supports the following continent codes:.
       * * *AF* : Africa
       * * *AN* : Antarctica
       * * *AS* : Asia
       * * *EU* : Europe
       * * *OC* : Oceania
       * * *NA* : North America
       * * *SA* : South America
       *
       * Constraint: Specifying `ContinentCode` with either `CountryCode` or `SubdivisionCode`
       * returns an `InvalidInput` error.
       */
      public fun continentCode(continentCode: String)

      /**
       * @param countryCode For geolocation resource record sets, the two-letter code for a country.
       * Route 53 uses the two-letter country codes that are specified in [ISO standard 3166-1
       * alpha-2](https://docs.aws.amazon.com/https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2) .
       */
      public fun countryCode(countryCode: String)

      /**
       * @param subdivisionCode For geolocation resource record sets, the two-letter code for a
       * state of the United States.
       * Route 53 doesn't support any other values for `SubdivisionCode` . For a list of state
       * abbreviations, see [Appendix B: Two–Letter State and Possession
       * Abbreviations](https://docs.aws.amazon.com/https://pe.usps.com/text/pub28/28apb.htm) on the
       * United States Postal Service website.
       *
       * If you specify `subdivisioncode` , you must also specify `US` for `CountryCode` .
       */
      public fun subdivisionCode(subdivisionCode: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.route53.CfnRecordSetGroup.GeoLocationProperty.Builder =
          software.amazon.awscdk.services.route53.CfnRecordSetGroup.GeoLocationProperty.builder()

      /**
       * @param continentCode For geolocation resource record sets, a two-letter abbreviation that
       * identifies a continent. Route 53 supports the following continent codes:.
       * * *AF* : Africa
       * * *AN* : Antarctica
       * * *AS* : Asia
       * * *EU* : Europe
       * * *OC* : Oceania
       * * *NA* : North America
       * * *SA* : South America
       *
       * Constraint: Specifying `ContinentCode` with either `CountryCode` or `SubdivisionCode`
       * returns an `InvalidInput` error.
       */
      override fun continentCode(continentCode: String) {
        cdkBuilder.continentCode(continentCode)
      }

      /**
       * @param countryCode For geolocation resource record sets, the two-letter code for a country.
       * Route 53 uses the two-letter country codes that are specified in [ISO standard 3166-1
       * alpha-2](https://docs.aws.amazon.com/https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2) .
       */
      override fun countryCode(countryCode: String) {
        cdkBuilder.countryCode(countryCode)
      }

      /**
       * @param subdivisionCode For geolocation resource record sets, the two-letter code for a
       * state of the United States.
       * Route 53 doesn't support any other values for `SubdivisionCode` . For a list of state
       * abbreviations, see [Appendix B: Two–Letter State and Possession
       * Abbreviations](https://docs.aws.amazon.com/https://pe.usps.com/text/pub28/28apb.htm) on the
       * United States Postal Service website.
       *
       * If you specify `subdivisioncode` , you must also specify `US` for `CountryCode` .
       */
      override fun subdivisionCode(subdivisionCode: String) {
        cdkBuilder.subdivisionCode(subdivisionCode)
      }

      public fun build():
          software.amazon.awscdk.services.route53.CfnRecordSetGroup.GeoLocationProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.route53.CfnRecordSetGroup.GeoLocationProperty,
    ) : CdkObject(cdkObject), GeoLocationProperty {
      /**
       * For geolocation resource record sets, a two-letter abbreviation that identifies a
       * continent. Route 53 supports the following continent codes:.
       *
       * * *AF* : Africa
       * * *AN* : Antarctica
       * * *AS* : Asia
       * * *EU* : Europe
       * * *OC* : Oceania
       * * *NA* : North America
       * * *SA* : South America
       *
       * Constraint: Specifying `ContinentCode` with either `CountryCode` or `SubdivisionCode`
       * returns an `InvalidInput` error.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-route53-recordsetgroup-geolocation.html#cfn-route53-recordsetgroup-geolocation-continentcode)
       */
      override fun continentCode(): String? = unwrap(this).getContinentCode()

      /**
       * For geolocation resource record sets, the two-letter code for a country.
       *
       * Route 53 uses the two-letter country codes that are specified in [ISO standard 3166-1
       * alpha-2](https://docs.aws.amazon.com/https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2) .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-route53-recordsetgroup-geolocation.html#cfn-route53-recordsetgroup-geolocation-countrycode)
       */
      override fun countryCode(): String? = unwrap(this).getCountryCode()

      /**
       * For geolocation resource record sets, the two-letter code for a state of the United States.
       *
       * Route 53 doesn't support any other values for `SubdivisionCode` . For a list of state
       * abbreviations, see [Appendix B: Two–Letter State and Possession
       * Abbreviations](https://docs.aws.amazon.com/https://pe.usps.com/text/pub28/28apb.htm) on the
       * United States Postal Service website.
       *
       * If you specify `subdivisioncode` , you must also specify `US` for `CountryCode` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-route53-recordsetgroup-geolocation.html#cfn-route53-recordsetgroup-geolocation-subdivisioncode)
       */
      override fun subdivisionCode(): String? = unwrap(this).getSubdivisionCode()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): GeoLocationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.route53.CfnRecordSetGroup.GeoLocationProperty):
          GeoLocationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: GeoLocationProperty):
          software.amazon.awscdk.services.route53.CfnRecordSetGroup.GeoLocationProperty = (wrapped
          as CdkObject).cdkObject as
          software.amazon.awscdk.services.route53.CfnRecordSetGroup.GeoLocationProperty
    }
  }

  /**
   * *Alias records only:* Information about the AWS resource, such as a CloudFront distribution or
   * an Amazon S3 bucket, that you want to route traffic to.
   *
   * When creating records for a private hosted zone, note the following:
   *
   * * Creating geolocation alias and latency alias records in a private hosted zone is allowed but
   * not supported.
   * * For information about creating failover records in a private hosted zone, see [Configuring
   * Failover in a Private Hosted
   * Zone](https://docs.aws.amazon.com/Route53/latest/DeveloperGuide/dns-failover-private-hosted-zones.html)
   * .
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.route53.*;
   * AliasTargetProperty aliasTargetProperty = AliasTargetProperty.builder()
   * .dnsName("dnsName")
   * .hostedZoneId("hostedZoneId")
   * // the properties below are optional
   * .evaluateTargetHealth(false)
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-route53-recordsetgroup-aliastarget.html)
   */
  public interface AliasTargetProperty {
    /**
     * *Alias records only:* The value that you specify depends on where you want to route queries:.
     *
     * * **Amazon API Gateway custom regional APIs and edge-optimized APIs** - Specify the
     * applicable domain name for your API. You can get the applicable value using the AWS CLI command
     * [get-domain-names](https://docs.aws.amazon.com/cli/latest/reference/apigateway/get-domain-names.html)
     * :
     * * For regional APIs, specify the value of `regionalDomainName` .
     * * For edge-optimized APIs, specify the value of `distributionDomainName` . This is the name
     * of the associated CloudFront distribution, such as `da1b2c3d4e5.cloudfront.net` .
     *
     *
     * The name of the record that you're creating must match a custom domain name for your API,
     * such as `api.example.com` .
     *
     *
     * * **Amazon Virtual Private Cloud interface VPC endpoint** - Enter the API endpoint for the
     * interface endpoint, such as
     * `vpce-123456789abcdef01-example-us-east-1a.elasticloadbalancing.us-east-1.vpce.amazonaws.com` .
     * For edge-optimized APIs, this is the domain name for the corresponding CloudFront distribution.
     * You can get the value of `DnsName` using the AWS CLI command
     * [describe-vpc-endpoints](https://docs.aws.amazon.com/cli/latest/reference/ec2/describe-vpc-endpoints.html)
     * .
     * * **CloudFront distribution** - Specify the domain name that CloudFront assigned when you
     * created your distribution.
     *
     * Your CloudFront distribution must include an alternate domain name that matches the name of
     * the record. For example, if the name of the record is *acme.example.com* , your CloudFront
     * distribution must include *acme.example.com* as one of the alternate domain names. For more
     * information, see [Using Alternate Domain Names
     * (CNAMEs)](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/CNAMEs.html) in the
     * *Amazon CloudFront Developer Guide* .
     *
     * You can't create a record in a private hosted zone to route traffic to a CloudFront
     * distribution.
     *
     *
     * For failover alias records, you can't specify a CloudFront distribution for both the primary
     * and secondary records. A distribution must include an alternate domain name that matches the
     * name of the record. However, the primary and secondary records have the same name, and you can't
     * include the same alternate domain name in more than one distribution.
     *
     *
     * * **Elastic Beanstalk environment** - If the domain name for your Elastic Beanstalk
     * environment includes the region that you deployed the environment in, you can create an alias
     * record that routes traffic to the environment. For example, the domain name `my-environment.
     * *us-west-2* .elasticbeanstalk.com` is a regionalized domain name.
     *
     *
     * For environments that were created before early 2016, the domain name doesn't include the
     * region. To route traffic to these environments, you must create a CNAME record instead of an
     * alias record. Note that you can't create a CNAME record for the root domain name. For example,
     * if your domain name is example.com, you can create a record that routes traffic for
     * acme.example.com to your Elastic Beanstalk environment, but you can't create a record that
     * routes traffic for example.com to your Elastic Beanstalk environment.
     *
     *
     * For Elastic Beanstalk environments that have regionalized subdomains, specify the `CNAME`
     * attribute for the environment. You can use the following methods to get the value of the CNAME
     * attribute:
     *
     * * *AWS Management Console* : For information about how to get the value by using the console,
     * see [Using Custom Domains with AWS Elastic
     * Beanstalk](https://docs.aws.amazon.com/elasticbeanstalk/latest/dg/customdomains.html) in the
     * *AWS Elastic Beanstalk Developer Guide* .
     * * *Elastic Beanstalk API* : Use the `DescribeEnvironments` action to get the value of the
     * `CNAME` attribute. For more information, see
     * [DescribeEnvironments](https://docs.aws.amazon.com/elasticbeanstalk/latest/api/API_DescribeEnvironments.html)
     * in the *AWS Elastic Beanstalk API Reference* .
     * * *AWS CLI* : Use the `describe-environments` command to get the value of the `CNAME`
     * attribute. For more information, see
     * [describe-environments](https://docs.aws.amazon.com/cli/latest/reference/elasticbeanstalk/describe-environments.html)
     * in the *AWS CLI* .
     * * **ELB load balancer** - Specify the DNS name that is associated with the load balancer. Get
     * the DNS name by using the AWS Management Console , the ELB API, or the AWS CLI .
     * * *AWS Management Console* : Go to the EC2 page, choose *Load Balancers* in the navigation
     * pane, choose the load balancer, choose the *Description* tab, and get the value of the *DNS
     * name* field.
     *
     * If you're routing traffic to a Classic Load Balancer, get the value that begins with
     * *dualstack* . If you're routing traffic to another type of load balancer, get the value that
     * applies to the record type, A or AAAA.
     *
     * * *Elastic Load Balancing API* : Use `DescribeLoadBalancers` to get the value of `DNSName` .
     * For more information, see the applicable guide:
     * * Classic Load Balancers:
     * [DescribeLoadBalancers](https://docs.aws.amazon.com/elasticloadbalancing/2012-06-01/APIReference/API_DescribeLoadBalancers.html)
     * * Application and Network Load Balancers:
     * [DescribeLoadBalancers](https://docs.aws.amazon.com/elasticloadbalancing/latest/APIReference/API_DescribeLoadBalancers.html)
     * * *CloudFormation Fn::GetAtt intrinsic function* : Use the
     * [Fn::GetAtt](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/intrinsic-function-reference-getatt.html)
     * intrinsic function to get the value of `DNSName` :
     * * [Classic Load
     * Balancers](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-elb.html#aws-properties-ec2-elb-return-values)
     * .
     * * [Application and Network Load
     * Balancers](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticloadbalancingv2-loadbalancer.html#aws-resource-elasticloadbalancingv2-loadbalancer-return-values)
     * .
     * * *AWS CLI* : Use `describe-load-balancers` to get the value of `DNSName` . For more
     * information, see the applicable guide:
     * * Classic Load Balancers:
     * [describe-load-balancers](https://docs.aws.amazon.com/cli/latest/reference/elb/describe-load-balancers.html)
     * * Application and Network Load Balancers:
     * [describe-load-balancers](https://docs.aws.amazon.com/cli/latest/reference/elbv2/describe-load-balancers.html)
     * * **Global Accelerator accelerator** - Specify the DNS name for your accelerator:
     * * *Global Accelerator API* : To get the DNS name, use
     * [DescribeAccelerator](https://docs.aws.amazon.com/global-accelerator/latest/api/API_DescribeAccelerator.html)
     * .
     * * *AWS CLI* : To get the DNS name, use
     * [describe-accelerator](https://docs.aws.amazon.com/cli/latest/reference/globalaccelerator/describe-accelerator.html)
     * .
     * * **Amazon S3 bucket that is configured as a static website** - Specify the domain name of
     * the Amazon S3 website endpoint that you created the bucket in, for example,
     * `s3-website.us-east-2.amazonaws.com` . For more information about valid values, see the table
     * [Amazon S3 Website
     * Endpoints](https://docs.aws.amazon.com/general/latest/gr/s3.html#s3_website_region_endpoints) in
     * the *Amazon Web Services General Reference* . For more information about using S3 buckets for
     * websites, see [Getting Started with Amazon Route
     * 53](https://docs.aws.amazon.com/Route53/latest/DeveloperGuide/getting-started.html) in the
     * *Amazon Route 53 Developer Guide.*
     * * **Another Route 53 record** - Specify the value of the `Name` element for a record in the
     * current hosted zone.
     *
     *
     * If you're creating an alias record that has the same name as the hosted zone (known as the
     * zone apex), you can't specify the domain name for a record for which the value of `Type` is
     * `CNAME` . This is because the alias record must have the same type as the record that you're
     * routing traffic to, and creating a CNAME record for the zone apex isn't supported even for an
     * alias record.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-route53-recordsetgroup-aliastarget.html#cfn-route53-recordsetgroup-aliastarget-dnsname)
     */
    public fun dnsName(): String

    /**
     * *Applies only to alias records with any routing policy:* When `EvaluateTargetHealth` is
     * `true` , an alias record inherits the health of the referenced AWS resource, such as an ELB load
     * balancer or another record in the hosted zone.
     *
     * Note the following:
     *
     * * **CloudFront distributions** - You can't set `EvaluateTargetHealth` to `true` when the
     * alias target is a CloudFront distribution.
     * * **Elastic Beanstalk environments that have regionalized subdomains** - If you specify an
     * Elastic Beanstalk environment in `DNSName` and the environment contains an ELB load balancer,
     * Elastic Load Balancing routes queries only to the healthy Amazon EC2 instances that are
     * registered with the load balancer. (An environment automatically contains an ELB load balancer
     * if it includes more than one Amazon EC2 instance.) If you set `EvaluateTargetHealth` to `true`
     * and either no Amazon EC2 instances are healthy or the load balancer itself is unhealthy, Route
     * 53 routes queries to other available resources that are healthy, if any.
     *
     * If the environment contains a single Amazon EC2 instance, there are no special requirements.
     *
     * * **ELB load balancers** - Health checking behavior depends on the type of load balancer:
     * * *Classic Load Balancers* : If you specify an ELB Classic Load Balancer in `DNSName` ,
     * Elastic Load Balancing routes queries only to the healthy Amazon EC2 instances that are
     * registered with the load balancer. If you set `EvaluateTargetHealth` to `true` and either no EC2
     * instances are healthy or the load balancer itself is unhealthy, Route 53 routes queries to other
     * resources.
     * * *Application and Network Load Balancers* : If you specify an ELB Application or Network
     * Load Balancer and you set `EvaluateTargetHealth` to `true` , Route 53 routes queries to the load
     * balancer based on the health of the target groups that are associated with the load balancer:
     * * For an Application or Network Load Balancer to be considered healthy, every target group
     * that contains targets must contain at least one healthy target. If any target group contains
     * only unhealthy targets, the load balancer is considered unhealthy, and Route 53 routes queries
     * to other resources.
     * * A target group that has no registered targets is considered unhealthy.
     *
     *
     * When you create a load balancer, you configure settings for Elastic Load Balancing health
     * checks; they're not Route 53 health checks, but they perform a similar function. Do not create
     * Route 53 health checks for the EC2 instances that you register with an ELB load balancer.
     *
     *
     * * **S3 buckets** - There are no special requirements for setting `EvaluateTargetHealth` to
     * `true` when the alias target is an S3 bucket.
     * * **Other records in the same hosted zone** - If the AWS resource that you specify in
     * `DNSName` is a record or a group of records (for example, a group of weighted records) but is
     * not another alias record, we recommend that you associate a health check with all of the records
     * in the alias target. For more information, see [What Happens When You Omit Health
     * Checks?](https://docs.aws.amazon.com/Route53/latest/DeveloperGuide/dns-failover-complex-configs.html#dns-failover-complex-configs-hc-omitting)
     * in the *Amazon Route 53 Developer Guide* .
     *
     * For more information and examples, see [Amazon Route 53 Health Checks and DNS
     * Failover](https://docs.aws.amazon.com/Route53/latest/DeveloperGuide/dns-failover.html) in the
     * *Amazon Route 53 Developer Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-route53-recordsetgroup-aliastarget.html#cfn-route53-recordsetgroup-aliastarget-evaluatetargethealth)
     */
    public fun evaluateTargetHealth(): Any? = unwrap(this).getEvaluateTargetHealth()

    /**
     * *Alias resource records sets only* : The value used depends on where you want to route
     * traffic:.
     *
     * * **Amazon API Gateway custom regional APIs and edge-optimized APIs** - Specify the hosted
     * zone ID for your API. You can get the applicable value using the AWS CLI command
     * [get-domain-names](https://docs.aws.amazon.com/cli/latest/reference/apigateway/get-domain-names.html)
     * :
     * * For regional APIs, specify the value of `regionalHostedZoneId` .
     * * For edge-optimized APIs, specify the value of `distributionHostedZoneId` .
     * * **Amazon Virtual Private Cloud interface VPC endpoint** - Specify the hosted zone ID for
     * your interface endpoint. You can get the value of `HostedZoneId` using the AWS CLI command
     * [describe-vpc-endpoints](https://docs.aws.amazon.com/cli/latest/reference/ec2/describe-vpc-endpoints.html)
     * .
     * * **CloudFront distribution** - Specify `Z2FDTNDATAQYW2` . This is always the hosted zone ID
     * when you create an alias record that routes traffic to a CloudFront distribution.
     *
     *
     * Alias records for CloudFront can't be created in a private zone.
     *
     *
     * * **Elastic Beanstalk environment** - Specify the hosted zone ID for the region that you
     * created the environment in. The environment must have a regionalized subdomain. For a list of
     * regions and the corresponding hosted zone IDs, see [AWS Elastic Beanstalk endpoints and
     * quotas](https://docs.aws.amazon.com/general/latest/gr/elasticbeanstalk.html) in the *Amazon Web
     * Services General Reference* .
     * * **ELB load balancer** - Specify the value of the hosted zone ID for the load balancer. Use
     * the following methods to get the hosted zone ID:
     * * [Service Endpoints](https://docs.aws.amazon.com/general/latest/gr/elb.html) table in the
     * "Elastic Load Balancing endpoints and quotas" topic in the *Amazon Web Services General
     * Reference* : Use the value that corresponds with the region that you created your load balancer
     * in. Note that there are separate columns for Application and Classic Load Balancers and for
     * Network Load Balancers.
     * * *AWS Management Console* : Go to the Amazon EC2 page, choose *Load Balancers* in the
     * navigation pane, select the load balancer, and get the value of the *Hosted zone* field on the
     * *Description* tab.
     * * *Elastic Load Balancing API* : Use `DescribeLoadBalancers` to get the applicable value. For
     * more information, see the applicable guide:
     * * Classic Load Balancers: Use
     * [DescribeLoadBalancers](https://docs.aws.amazon.com/elasticloadbalancing/2012-06-01/APIReference/API_DescribeLoadBalancers.html)
     * to get the value of `CanonicalHostedZoneNameID` .
     * * Application and Network Load Balancers: Use
     * [DescribeLoadBalancers](https://docs.aws.amazon.com/elasticloadbalancing/latest/APIReference/API_DescribeLoadBalancers.html)
     * to get the value of `CanonicalHostedZoneID` .
     * * *CloudFormation Fn::GetAtt intrinsic function* : Use the
     * [Fn::GetAtt](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/intrinsic-function-reference-getatt.html)
     * intrinsic function to get the applicable value:
     * * Classic Load Balancers: Get
     * [CanonicalHostedZoneNameID](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-elb.html#aws-properties-ec2-elb-return-values)
     * .
     * * Application and Network Load Balancers: Get
     * [CanonicalHostedZoneID](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticloadbalancingv2-loadbalancer.html#aws-resource-elasticloadbalancingv2-loadbalancer-return-values)
     * .
     * * *AWS CLI* : Use `describe-load-balancers` to get the applicable value. For more
     * information, see the applicable guide:
     * * Classic Load Balancers: Use
     * [describe-load-balancers](https://docs.aws.amazon.com/cli/latest/reference/elb/describe-load-balancers.html)
     * to get the value of `CanonicalHostedZoneNameID` .
     * * Application and Network Load Balancers: Use
     * [describe-load-balancers](https://docs.aws.amazon.com/cli/latest/reference/elbv2/describe-load-balancers.html)
     * to get the value of `CanonicalHostedZoneID` .
     * * **Global Accelerator accelerator** - Specify `Z2BJ6XQ5FK7U4H` .
     * * **An Amazon S3 bucket configured as a static website** - Specify the hosted zone ID for the
     * region that you created the bucket in. For more information about valid values, see the table
     * [Amazon S3 Website
     * Endpoints](https://docs.aws.amazon.com/general/latest/gr/s3.html#s3_website_region_endpoints) in
     * the *Amazon Web Services General Reference* .
     * * **Another Route 53 record in your hosted zone** - Specify the hosted zone ID of your hosted
     * zone. (An alias record can't reference a record in a different hosted zone.)
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-route53-recordsetgroup-aliastarget.html#cfn-route53-recordsetgroup-aliastarget-hostedzoneid)
     */
    public fun hostedZoneId(): String

    /**
     * A builder for [AliasTargetProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param dnsName *Alias records only:* The value that you specify depends on where you want
       * to route queries:. 
       * * **Amazon API Gateway custom regional APIs and edge-optimized APIs** - Specify the
       * applicable domain name for your API. You can get the applicable value using the AWS CLI
       * command
       * [get-domain-names](https://docs.aws.amazon.com/cli/latest/reference/apigateway/get-domain-names.html)
       * :
       * * For regional APIs, specify the value of `regionalDomainName` .
       * * For edge-optimized APIs, specify the value of `distributionDomainName` . This is the name
       * of the associated CloudFront distribution, such as `da1b2c3d4e5.cloudfront.net` .
       *
       *
       * The name of the record that you're creating must match a custom domain name for your API,
       * such as `api.example.com` .
       *
       *
       * * **Amazon Virtual Private Cloud interface VPC endpoint** - Enter the API endpoint for the
       * interface endpoint, such as
       * `vpce-123456789abcdef01-example-us-east-1a.elasticloadbalancing.us-east-1.vpce.amazonaws.com`
       * . For edge-optimized APIs, this is the domain name for the corresponding CloudFront
       * distribution. You can get the value of `DnsName` using the AWS CLI command
       * [describe-vpc-endpoints](https://docs.aws.amazon.com/cli/latest/reference/ec2/describe-vpc-endpoints.html)
       * .
       * * **CloudFront distribution** - Specify the domain name that CloudFront assigned when you
       * created your distribution.
       *
       * Your CloudFront distribution must include an alternate domain name that matches the name of
       * the record. For example, if the name of the record is *acme.example.com* , your CloudFront
       * distribution must include *acme.example.com* as one of the alternate domain names. For more
       * information, see [Using Alternate Domain Names
       * (CNAMEs)](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/CNAMEs.html) in
       * the *Amazon CloudFront Developer Guide* .
       *
       * You can't create a record in a private hosted zone to route traffic to a CloudFront
       * distribution.
       *
       *
       * For failover alias records, you can't specify a CloudFront distribution for both the
       * primary and secondary records. A distribution must include an alternate domain name that
       * matches the name of the record. However, the primary and secondary records have the same name,
       * and you can't include the same alternate domain name in more than one distribution.
       *
       *
       * * **Elastic Beanstalk environment** - If the domain name for your Elastic Beanstalk
       * environment includes the region that you deployed the environment in, you can create an alias
       * record that routes traffic to the environment. For example, the domain name `my-environment.
       * *us-west-2* .elasticbeanstalk.com` is a regionalized domain name.
       *
       *
       * For environments that were created before early 2016, the domain name doesn't include the
       * region. To route traffic to these environments, you must create a CNAME record instead of an
       * alias record. Note that you can't create a CNAME record for the root domain name. For example,
       * if your domain name is example.com, you can create a record that routes traffic for
       * acme.example.com to your Elastic Beanstalk environment, but you can't create a record that
       * routes traffic for example.com to your Elastic Beanstalk environment.
       *
       *
       * For Elastic Beanstalk environments that have regionalized subdomains, specify the `CNAME`
       * attribute for the environment. You can use the following methods to get the value of the CNAME
       * attribute:
       *
       * * *AWS Management Console* : For information about how to get the value by using the
       * console, see [Using Custom Domains with AWS Elastic
       * Beanstalk](https://docs.aws.amazon.com/elasticbeanstalk/latest/dg/customdomains.html) in the
       * *AWS Elastic Beanstalk Developer Guide* .
       * * *Elastic Beanstalk API* : Use the `DescribeEnvironments` action to get the value of the
       * `CNAME` attribute. For more information, see
       * [DescribeEnvironments](https://docs.aws.amazon.com/elasticbeanstalk/latest/api/API_DescribeEnvironments.html)
       * in the *AWS Elastic Beanstalk API Reference* .
       * * *AWS CLI* : Use the `describe-environments` command to get the value of the `CNAME`
       * attribute. For more information, see
       * [describe-environments](https://docs.aws.amazon.com/cli/latest/reference/elasticbeanstalk/describe-environments.html)
       * in the *AWS CLI* .
       * * **ELB load balancer** - Specify the DNS name that is associated with the load balancer.
       * Get the DNS name by using the AWS Management Console , the ELB API, or the AWS CLI .
       * * *AWS Management Console* : Go to the EC2 page, choose *Load Balancers* in the navigation
       * pane, choose the load balancer, choose the *Description* tab, and get the value of the *DNS
       * name* field.
       *
       * If you're routing traffic to a Classic Load Balancer, get the value that begins with
       * *dualstack* . If you're routing traffic to another type of load balancer, get the value that
       * applies to the record type, A or AAAA.
       *
       * * *Elastic Load Balancing API* : Use `DescribeLoadBalancers` to get the value of `DNSName`
       * . For more information, see the applicable guide:
       * * Classic Load Balancers:
       * [DescribeLoadBalancers](https://docs.aws.amazon.com/elasticloadbalancing/2012-06-01/APIReference/API_DescribeLoadBalancers.html)
       * * Application and Network Load Balancers:
       * [DescribeLoadBalancers](https://docs.aws.amazon.com/elasticloadbalancing/latest/APIReference/API_DescribeLoadBalancers.html)
       * * *CloudFormation Fn::GetAtt intrinsic function* : Use the
       * [Fn::GetAtt](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/intrinsic-function-reference-getatt.html)
       * intrinsic function to get the value of `DNSName` :
       * * [Classic Load
       * Balancers](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-elb.html#aws-properties-ec2-elb-return-values)
       * .
       * * [Application and Network Load
       * Balancers](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticloadbalancingv2-loadbalancer.html#aws-resource-elasticloadbalancingv2-loadbalancer-return-values)
       * .
       * * *AWS CLI* : Use `describe-load-balancers` to get the value of `DNSName` . For more
       * information, see the applicable guide:
       * * Classic Load Balancers:
       * [describe-load-balancers](https://docs.aws.amazon.com/cli/latest/reference/elb/describe-load-balancers.html)
       * * Application and Network Load Balancers:
       * [describe-load-balancers](https://docs.aws.amazon.com/cli/latest/reference/elbv2/describe-load-balancers.html)
       * * **Global Accelerator accelerator** - Specify the DNS name for your accelerator:
       * * *Global Accelerator API* : To get the DNS name, use
       * [DescribeAccelerator](https://docs.aws.amazon.com/global-accelerator/latest/api/API_DescribeAccelerator.html)
       * .
       * * *AWS CLI* : To get the DNS name, use
       * [describe-accelerator](https://docs.aws.amazon.com/cli/latest/reference/globalaccelerator/describe-accelerator.html)
       * .
       * * **Amazon S3 bucket that is configured as a static website** - Specify the domain name of
       * the Amazon S3 website endpoint that you created the bucket in, for example,
       * `s3-website.us-east-2.amazonaws.com` . For more information about valid values, see the table
       * [Amazon S3 Website
       * Endpoints](https://docs.aws.amazon.com/general/latest/gr/s3.html#s3_website_region_endpoints)
       * in the *Amazon Web Services General Reference* . For more information about using S3 buckets
       * for websites, see [Getting Started with Amazon Route
       * 53](https://docs.aws.amazon.com/Route53/latest/DeveloperGuide/getting-started.html) in the
       * *Amazon Route 53 Developer Guide.*
       * * **Another Route 53 record** - Specify the value of the `Name` element for a record in the
       * current hosted zone.
       *
       *
       * If you're creating an alias record that has the same name as the hosted zone (known as the
       * zone apex), you can't specify the domain name for a record for which the value of `Type` is
       * `CNAME` . This is because the alias record must have the same type as the record that you're
       * routing traffic to, and creating a CNAME record for the zone apex isn't supported even for an
       * alias record.
       */
      public fun dnsName(dnsName: String)

      /**
       * @param evaluateTargetHealth *Applies only to alias records with any routing policy:* When
       * `EvaluateTargetHealth` is `true` , an alias record inherits the health of the referenced AWS
       * resource, such as an ELB load balancer or another record in the hosted zone.
       * Note the following:
       *
       * * **CloudFront distributions** - You can't set `EvaluateTargetHealth` to `true` when the
       * alias target is a CloudFront distribution.
       * * **Elastic Beanstalk environments that have regionalized subdomains** - If you specify an
       * Elastic Beanstalk environment in `DNSName` and the environment contains an ELB load balancer,
       * Elastic Load Balancing routes queries only to the healthy Amazon EC2 instances that are
       * registered with the load balancer. (An environment automatically contains an ELB load balancer
       * if it includes more than one Amazon EC2 instance.) If you set `EvaluateTargetHealth` to `true`
       * and either no Amazon EC2 instances are healthy or the load balancer itself is unhealthy, Route
       * 53 routes queries to other available resources that are healthy, if any.
       *
       * If the environment contains a single Amazon EC2 instance, there are no special
       * requirements.
       *
       * * **ELB load balancers** - Health checking behavior depends on the type of load balancer:
       * * *Classic Load Balancers* : If you specify an ELB Classic Load Balancer in `DNSName` ,
       * Elastic Load Balancing routes queries only to the healthy Amazon EC2 instances that are
       * registered with the load balancer. If you set `EvaluateTargetHealth` to `true` and either no
       * EC2 instances are healthy or the load balancer itself is unhealthy, Route 53 routes queries to
       * other resources.
       * * *Application and Network Load Balancers* : If you specify an ELB Application or Network
       * Load Balancer and you set `EvaluateTargetHealth` to `true` , Route 53 routes queries to the
       * load balancer based on the health of the target groups that are associated with the load
       * balancer:
       * * For an Application or Network Load Balancer to be considered healthy, every target group
       * that contains targets must contain at least one healthy target. If any target group contains
       * only unhealthy targets, the load balancer is considered unhealthy, and Route 53 routes queries
       * to other resources.
       * * A target group that has no registered targets is considered unhealthy.
       *
       *
       * When you create a load balancer, you configure settings for Elastic Load Balancing health
       * checks; they're not Route 53 health checks, but they perform a similar function. Do not create
       * Route 53 health checks for the EC2 instances that you register with an ELB load balancer.
       *
       *
       * * **S3 buckets** - There are no special requirements for setting `EvaluateTargetHealth` to
       * `true` when the alias target is an S3 bucket.
       * * **Other records in the same hosted zone** - If the AWS resource that you specify in
       * `DNSName` is a record or a group of records (for example, a group of weighted records) but is
       * not another alias record, we recommend that you associate a health check with all of the
       * records in the alias target. For more information, see [What Happens When You Omit Health
       * Checks?](https://docs.aws.amazon.com/Route53/latest/DeveloperGuide/dns-failover-complex-configs.html#dns-failover-complex-configs-hc-omitting)
       * in the *Amazon Route 53 Developer Guide* .
       *
       * For more information and examples, see [Amazon Route 53 Health Checks and DNS
       * Failover](https://docs.aws.amazon.com/Route53/latest/DeveloperGuide/dns-failover.html) in the
       * *Amazon Route 53 Developer Guide* .
       */
      public fun evaluateTargetHealth(evaluateTargetHealth: Boolean)

      /**
       * @param evaluateTargetHealth *Applies only to alias records with any routing policy:* When
       * `EvaluateTargetHealth` is `true` , an alias record inherits the health of the referenced AWS
       * resource, such as an ELB load balancer or another record in the hosted zone.
       * Note the following:
       *
       * * **CloudFront distributions** - You can't set `EvaluateTargetHealth` to `true` when the
       * alias target is a CloudFront distribution.
       * * **Elastic Beanstalk environments that have regionalized subdomains** - If you specify an
       * Elastic Beanstalk environment in `DNSName` and the environment contains an ELB load balancer,
       * Elastic Load Balancing routes queries only to the healthy Amazon EC2 instances that are
       * registered with the load balancer. (An environment automatically contains an ELB load balancer
       * if it includes more than one Amazon EC2 instance.) If you set `EvaluateTargetHealth` to `true`
       * and either no Amazon EC2 instances are healthy or the load balancer itself is unhealthy, Route
       * 53 routes queries to other available resources that are healthy, if any.
       *
       * If the environment contains a single Amazon EC2 instance, there are no special
       * requirements.
       *
       * * **ELB load balancers** - Health checking behavior depends on the type of load balancer:
       * * *Classic Load Balancers* : If you specify an ELB Classic Load Balancer in `DNSName` ,
       * Elastic Load Balancing routes queries only to the healthy Amazon EC2 instances that are
       * registered with the load balancer. If you set `EvaluateTargetHealth` to `true` and either no
       * EC2 instances are healthy or the load balancer itself is unhealthy, Route 53 routes queries to
       * other resources.
       * * *Application and Network Load Balancers* : If you specify an ELB Application or Network
       * Load Balancer and you set `EvaluateTargetHealth` to `true` , Route 53 routes queries to the
       * load balancer based on the health of the target groups that are associated with the load
       * balancer:
       * * For an Application or Network Load Balancer to be considered healthy, every target group
       * that contains targets must contain at least one healthy target. If any target group contains
       * only unhealthy targets, the load balancer is considered unhealthy, and Route 53 routes queries
       * to other resources.
       * * A target group that has no registered targets is considered unhealthy.
       *
       *
       * When you create a load balancer, you configure settings for Elastic Load Balancing health
       * checks; they're not Route 53 health checks, but they perform a similar function. Do not create
       * Route 53 health checks for the EC2 instances that you register with an ELB load balancer.
       *
       *
       * * **S3 buckets** - There are no special requirements for setting `EvaluateTargetHealth` to
       * `true` when the alias target is an S3 bucket.
       * * **Other records in the same hosted zone** - If the AWS resource that you specify in
       * `DNSName` is a record or a group of records (for example, a group of weighted records) but is
       * not another alias record, we recommend that you associate a health check with all of the
       * records in the alias target. For more information, see [What Happens When You Omit Health
       * Checks?](https://docs.aws.amazon.com/Route53/latest/DeveloperGuide/dns-failover-complex-configs.html#dns-failover-complex-configs-hc-omitting)
       * in the *Amazon Route 53 Developer Guide* .
       *
       * For more information and examples, see [Amazon Route 53 Health Checks and DNS
       * Failover](https://docs.aws.amazon.com/Route53/latest/DeveloperGuide/dns-failover.html) in the
       * *Amazon Route 53 Developer Guide* .
       */
      public fun evaluateTargetHealth(evaluateTargetHealth: IResolvable)

      /**
       * @param hostedZoneId *Alias resource records sets only* : The value used depends on where
       * you want to route traffic:. 
       * * **Amazon API Gateway custom regional APIs and edge-optimized APIs** - Specify the hosted
       * zone ID for your API. You can get the applicable value using the AWS CLI command
       * [get-domain-names](https://docs.aws.amazon.com/cli/latest/reference/apigateway/get-domain-names.html)
       * :
       * * For regional APIs, specify the value of `regionalHostedZoneId` .
       * * For edge-optimized APIs, specify the value of `distributionHostedZoneId` .
       * * **Amazon Virtual Private Cloud interface VPC endpoint** - Specify the hosted zone ID for
       * your interface endpoint. You can get the value of `HostedZoneId` using the AWS CLI command
       * [describe-vpc-endpoints](https://docs.aws.amazon.com/cli/latest/reference/ec2/describe-vpc-endpoints.html)
       * .
       * * **CloudFront distribution** - Specify `Z2FDTNDATAQYW2` . This is always the hosted zone
       * ID when you create an alias record that routes traffic to a CloudFront distribution.
       *
       *
       * Alias records for CloudFront can't be created in a private zone.
       *
       *
       * * **Elastic Beanstalk environment** - Specify the hosted zone ID for the region that you
       * created the environment in. The environment must have a regionalized subdomain. For a list of
       * regions and the corresponding hosted zone IDs, see [AWS Elastic Beanstalk endpoints and
       * quotas](https://docs.aws.amazon.com/general/latest/gr/elasticbeanstalk.html) in the *Amazon
       * Web Services General Reference* .
       * * **ELB load balancer** - Specify the value of the hosted zone ID for the load balancer.
       * Use the following methods to get the hosted zone ID:
       * * [Service Endpoints](https://docs.aws.amazon.com/general/latest/gr/elb.html) table in the
       * "Elastic Load Balancing endpoints and quotas" topic in the *Amazon Web Services General
       * Reference* : Use the value that corresponds with the region that you created your load
       * balancer in. Note that there are separate columns for Application and Classic Load Balancers
       * and for Network Load Balancers.
       * * *AWS Management Console* : Go to the Amazon EC2 page, choose *Load Balancers* in the
       * navigation pane, select the load balancer, and get the value of the *Hosted zone* field on the
       * *Description* tab.
       * * *Elastic Load Balancing API* : Use `DescribeLoadBalancers` to get the applicable value.
       * For more information, see the applicable guide:
       * * Classic Load Balancers: Use
       * [DescribeLoadBalancers](https://docs.aws.amazon.com/elasticloadbalancing/2012-06-01/APIReference/API_DescribeLoadBalancers.html)
       * to get the value of `CanonicalHostedZoneNameID` .
       * * Application and Network Load Balancers: Use
       * [DescribeLoadBalancers](https://docs.aws.amazon.com/elasticloadbalancing/latest/APIReference/API_DescribeLoadBalancers.html)
       * to get the value of `CanonicalHostedZoneID` .
       * * *CloudFormation Fn::GetAtt intrinsic function* : Use the
       * [Fn::GetAtt](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/intrinsic-function-reference-getatt.html)
       * intrinsic function to get the applicable value:
       * * Classic Load Balancers: Get
       * [CanonicalHostedZoneNameID](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-elb.html#aws-properties-ec2-elb-return-values)
       * .
       * * Application and Network Load Balancers: Get
       * [CanonicalHostedZoneID](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticloadbalancingv2-loadbalancer.html#aws-resource-elasticloadbalancingv2-loadbalancer-return-values)
       * .
       * * *AWS CLI* : Use `describe-load-balancers` to get the applicable value. For more
       * information, see the applicable guide:
       * * Classic Load Balancers: Use
       * [describe-load-balancers](https://docs.aws.amazon.com/cli/latest/reference/elb/describe-load-balancers.html)
       * to get the value of `CanonicalHostedZoneNameID` .
       * * Application and Network Load Balancers: Use
       * [describe-load-balancers](https://docs.aws.amazon.com/cli/latest/reference/elbv2/describe-load-balancers.html)
       * to get the value of `CanonicalHostedZoneID` .
       * * **Global Accelerator accelerator** - Specify `Z2BJ6XQ5FK7U4H` .
       * * **An Amazon S3 bucket configured as a static website** - Specify the hosted zone ID for
       * the region that you created the bucket in. For more information about valid values, see the
       * table [Amazon S3 Website
       * Endpoints](https://docs.aws.amazon.com/general/latest/gr/s3.html#s3_website_region_endpoints)
       * in the *Amazon Web Services General Reference* .
       * * **Another Route 53 record in your hosted zone** - Specify the hosted zone ID of your
       * hosted zone. (An alias record can't reference a record in a different hosted zone.)
       */
      public fun hostedZoneId(hostedZoneId: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.route53.CfnRecordSetGroup.AliasTargetProperty.Builder =
          software.amazon.awscdk.services.route53.CfnRecordSetGroup.AliasTargetProperty.builder()

      /**
       * @param dnsName *Alias records only:* The value that you specify depends on where you want
       * to route queries:. 
       * * **Amazon API Gateway custom regional APIs and edge-optimized APIs** - Specify the
       * applicable domain name for your API. You can get the applicable value using the AWS CLI
       * command
       * [get-domain-names](https://docs.aws.amazon.com/cli/latest/reference/apigateway/get-domain-names.html)
       * :
       * * For regional APIs, specify the value of `regionalDomainName` .
       * * For edge-optimized APIs, specify the value of `distributionDomainName` . This is the name
       * of the associated CloudFront distribution, such as `da1b2c3d4e5.cloudfront.net` .
       *
       *
       * The name of the record that you're creating must match a custom domain name for your API,
       * such as `api.example.com` .
       *
       *
       * * **Amazon Virtual Private Cloud interface VPC endpoint** - Enter the API endpoint for the
       * interface endpoint, such as
       * `vpce-123456789abcdef01-example-us-east-1a.elasticloadbalancing.us-east-1.vpce.amazonaws.com`
       * . For edge-optimized APIs, this is the domain name for the corresponding CloudFront
       * distribution. You can get the value of `DnsName` using the AWS CLI command
       * [describe-vpc-endpoints](https://docs.aws.amazon.com/cli/latest/reference/ec2/describe-vpc-endpoints.html)
       * .
       * * **CloudFront distribution** - Specify the domain name that CloudFront assigned when you
       * created your distribution.
       *
       * Your CloudFront distribution must include an alternate domain name that matches the name of
       * the record. For example, if the name of the record is *acme.example.com* , your CloudFront
       * distribution must include *acme.example.com* as one of the alternate domain names. For more
       * information, see [Using Alternate Domain Names
       * (CNAMEs)](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/CNAMEs.html) in
       * the *Amazon CloudFront Developer Guide* .
       *
       * You can't create a record in a private hosted zone to route traffic to a CloudFront
       * distribution.
       *
       *
       * For failover alias records, you can't specify a CloudFront distribution for both the
       * primary and secondary records. A distribution must include an alternate domain name that
       * matches the name of the record. However, the primary and secondary records have the same name,
       * and you can't include the same alternate domain name in more than one distribution.
       *
       *
       * * **Elastic Beanstalk environment** - If the domain name for your Elastic Beanstalk
       * environment includes the region that you deployed the environment in, you can create an alias
       * record that routes traffic to the environment. For example, the domain name `my-environment.
       * *us-west-2* .elasticbeanstalk.com` is a regionalized domain name.
       *
       *
       * For environments that were created before early 2016, the domain name doesn't include the
       * region. To route traffic to these environments, you must create a CNAME record instead of an
       * alias record. Note that you can't create a CNAME record for the root domain name. For example,
       * if your domain name is example.com, you can create a record that routes traffic for
       * acme.example.com to your Elastic Beanstalk environment, but you can't create a record that
       * routes traffic for example.com to your Elastic Beanstalk environment.
       *
       *
       * For Elastic Beanstalk environments that have regionalized subdomains, specify the `CNAME`
       * attribute for the environment. You can use the following methods to get the value of the CNAME
       * attribute:
       *
       * * *AWS Management Console* : For information about how to get the value by using the
       * console, see [Using Custom Domains with AWS Elastic
       * Beanstalk](https://docs.aws.amazon.com/elasticbeanstalk/latest/dg/customdomains.html) in the
       * *AWS Elastic Beanstalk Developer Guide* .
       * * *Elastic Beanstalk API* : Use the `DescribeEnvironments` action to get the value of the
       * `CNAME` attribute. For more information, see
       * [DescribeEnvironments](https://docs.aws.amazon.com/elasticbeanstalk/latest/api/API_DescribeEnvironments.html)
       * in the *AWS Elastic Beanstalk API Reference* .
       * * *AWS CLI* : Use the `describe-environments` command to get the value of the `CNAME`
       * attribute. For more information, see
       * [describe-environments](https://docs.aws.amazon.com/cli/latest/reference/elasticbeanstalk/describe-environments.html)
       * in the *AWS CLI* .
       * * **ELB load balancer** - Specify the DNS name that is associated with the load balancer.
       * Get the DNS name by using the AWS Management Console , the ELB API, or the AWS CLI .
       * * *AWS Management Console* : Go to the EC2 page, choose *Load Balancers* in the navigation
       * pane, choose the load balancer, choose the *Description* tab, and get the value of the *DNS
       * name* field.
       *
       * If you're routing traffic to a Classic Load Balancer, get the value that begins with
       * *dualstack* . If you're routing traffic to another type of load balancer, get the value that
       * applies to the record type, A or AAAA.
       *
       * * *Elastic Load Balancing API* : Use `DescribeLoadBalancers` to get the value of `DNSName`
       * . For more information, see the applicable guide:
       * * Classic Load Balancers:
       * [DescribeLoadBalancers](https://docs.aws.amazon.com/elasticloadbalancing/2012-06-01/APIReference/API_DescribeLoadBalancers.html)
       * * Application and Network Load Balancers:
       * [DescribeLoadBalancers](https://docs.aws.amazon.com/elasticloadbalancing/latest/APIReference/API_DescribeLoadBalancers.html)
       * * *CloudFormation Fn::GetAtt intrinsic function* : Use the
       * [Fn::GetAtt](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/intrinsic-function-reference-getatt.html)
       * intrinsic function to get the value of `DNSName` :
       * * [Classic Load
       * Balancers](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-elb.html#aws-properties-ec2-elb-return-values)
       * .
       * * [Application and Network Load
       * Balancers](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticloadbalancingv2-loadbalancer.html#aws-resource-elasticloadbalancingv2-loadbalancer-return-values)
       * .
       * * *AWS CLI* : Use `describe-load-balancers` to get the value of `DNSName` . For more
       * information, see the applicable guide:
       * * Classic Load Balancers:
       * [describe-load-balancers](https://docs.aws.amazon.com/cli/latest/reference/elb/describe-load-balancers.html)
       * * Application and Network Load Balancers:
       * [describe-load-balancers](https://docs.aws.amazon.com/cli/latest/reference/elbv2/describe-load-balancers.html)
       * * **Global Accelerator accelerator** - Specify the DNS name for your accelerator:
       * * *Global Accelerator API* : To get the DNS name, use
       * [DescribeAccelerator](https://docs.aws.amazon.com/global-accelerator/latest/api/API_DescribeAccelerator.html)
       * .
       * * *AWS CLI* : To get the DNS name, use
       * [describe-accelerator](https://docs.aws.amazon.com/cli/latest/reference/globalaccelerator/describe-accelerator.html)
       * .
       * * **Amazon S3 bucket that is configured as a static website** - Specify the domain name of
       * the Amazon S3 website endpoint that you created the bucket in, for example,
       * `s3-website.us-east-2.amazonaws.com` . For more information about valid values, see the table
       * [Amazon S3 Website
       * Endpoints](https://docs.aws.amazon.com/general/latest/gr/s3.html#s3_website_region_endpoints)
       * in the *Amazon Web Services General Reference* . For more information about using S3 buckets
       * for websites, see [Getting Started with Amazon Route
       * 53](https://docs.aws.amazon.com/Route53/latest/DeveloperGuide/getting-started.html) in the
       * *Amazon Route 53 Developer Guide.*
       * * **Another Route 53 record** - Specify the value of the `Name` element for a record in the
       * current hosted zone.
       *
       *
       * If you're creating an alias record that has the same name as the hosted zone (known as the
       * zone apex), you can't specify the domain name for a record for which the value of `Type` is
       * `CNAME` . This is because the alias record must have the same type as the record that you're
       * routing traffic to, and creating a CNAME record for the zone apex isn't supported even for an
       * alias record.
       */
      override fun dnsName(dnsName: String) {
        cdkBuilder.dnsName(dnsName)
      }

      /**
       * @param evaluateTargetHealth *Applies only to alias records with any routing policy:* When
       * `EvaluateTargetHealth` is `true` , an alias record inherits the health of the referenced AWS
       * resource, such as an ELB load balancer or another record in the hosted zone.
       * Note the following:
       *
       * * **CloudFront distributions** - You can't set `EvaluateTargetHealth` to `true` when the
       * alias target is a CloudFront distribution.
       * * **Elastic Beanstalk environments that have regionalized subdomains** - If you specify an
       * Elastic Beanstalk environment in `DNSName` and the environment contains an ELB load balancer,
       * Elastic Load Balancing routes queries only to the healthy Amazon EC2 instances that are
       * registered with the load balancer. (An environment automatically contains an ELB load balancer
       * if it includes more than one Amazon EC2 instance.) If you set `EvaluateTargetHealth` to `true`
       * and either no Amazon EC2 instances are healthy or the load balancer itself is unhealthy, Route
       * 53 routes queries to other available resources that are healthy, if any.
       *
       * If the environment contains a single Amazon EC2 instance, there are no special
       * requirements.
       *
       * * **ELB load balancers** - Health checking behavior depends on the type of load balancer:
       * * *Classic Load Balancers* : If you specify an ELB Classic Load Balancer in `DNSName` ,
       * Elastic Load Balancing routes queries only to the healthy Amazon EC2 instances that are
       * registered with the load balancer. If you set `EvaluateTargetHealth` to `true` and either no
       * EC2 instances are healthy or the load balancer itself is unhealthy, Route 53 routes queries to
       * other resources.
       * * *Application and Network Load Balancers* : If you specify an ELB Application or Network
       * Load Balancer and you set `EvaluateTargetHealth` to `true` , Route 53 routes queries to the
       * load balancer based on the health of the target groups that are associated with the load
       * balancer:
       * * For an Application or Network Load Balancer to be considered healthy, every target group
       * that contains targets must contain at least one healthy target. If any target group contains
       * only unhealthy targets, the load balancer is considered unhealthy, and Route 53 routes queries
       * to other resources.
       * * A target group that has no registered targets is considered unhealthy.
       *
       *
       * When you create a load balancer, you configure settings for Elastic Load Balancing health
       * checks; they're not Route 53 health checks, but they perform a similar function. Do not create
       * Route 53 health checks for the EC2 instances that you register with an ELB load balancer.
       *
       *
       * * **S3 buckets** - There are no special requirements for setting `EvaluateTargetHealth` to
       * `true` when the alias target is an S3 bucket.
       * * **Other records in the same hosted zone** - If the AWS resource that you specify in
       * `DNSName` is a record or a group of records (for example, a group of weighted records) but is
       * not another alias record, we recommend that you associate a health check with all of the
       * records in the alias target. For more information, see [What Happens When You Omit Health
       * Checks?](https://docs.aws.amazon.com/Route53/latest/DeveloperGuide/dns-failover-complex-configs.html#dns-failover-complex-configs-hc-omitting)
       * in the *Amazon Route 53 Developer Guide* .
       *
       * For more information and examples, see [Amazon Route 53 Health Checks and DNS
       * Failover](https://docs.aws.amazon.com/Route53/latest/DeveloperGuide/dns-failover.html) in the
       * *Amazon Route 53 Developer Guide* .
       */
      override fun evaluateTargetHealth(evaluateTargetHealth: Boolean) {
        cdkBuilder.evaluateTargetHealth(evaluateTargetHealth)
      }

      /**
       * @param evaluateTargetHealth *Applies only to alias records with any routing policy:* When
       * `EvaluateTargetHealth` is `true` , an alias record inherits the health of the referenced AWS
       * resource, such as an ELB load balancer or another record in the hosted zone.
       * Note the following:
       *
       * * **CloudFront distributions** - You can't set `EvaluateTargetHealth` to `true` when the
       * alias target is a CloudFront distribution.
       * * **Elastic Beanstalk environments that have regionalized subdomains** - If you specify an
       * Elastic Beanstalk environment in `DNSName` and the environment contains an ELB load balancer,
       * Elastic Load Balancing routes queries only to the healthy Amazon EC2 instances that are
       * registered with the load balancer. (An environment automatically contains an ELB load balancer
       * if it includes more than one Amazon EC2 instance.) If you set `EvaluateTargetHealth` to `true`
       * and either no Amazon EC2 instances are healthy or the load balancer itself is unhealthy, Route
       * 53 routes queries to other available resources that are healthy, if any.
       *
       * If the environment contains a single Amazon EC2 instance, there are no special
       * requirements.
       *
       * * **ELB load balancers** - Health checking behavior depends on the type of load balancer:
       * * *Classic Load Balancers* : If you specify an ELB Classic Load Balancer in `DNSName` ,
       * Elastic Load Balancing routes queries only to the healthy Amazon EC2 instances that are
       * registered with the load balancer. If you set `EvaluateTargetHealth` to `true` and either no
       * EC2 instances are healthy or the load balancer itself is unhealthy, Route 53 routes queries to
       * other resources.
       * * *Application and Network Load Balancers* : If you specify an ELB Application or Network
       * Load Balancer and you set `EvaluateTargetHealth` to `true` , Route 53 routes queries to the
       * load balancer based on the health of the target groups that are associated with the load
       * balancer:
       * * For an Application or Network Load Balancer to be considered healthy, every target group
       * that contains targets must contain at least one healthy target. If any target group contains
       * only unhealthy targets, the load balancer is considered unhealthy, and Route 53 routes queries
       * to other resources.
       * * A target group that has no registered targets is considered unhealthy.
       *
       *
       * When you create a load balancer, you configure settings for Elastic Load Balancing health
       * checks; they're not Route 53 health checks, but they perform a similar function. Do not create
       * Route 53 health checks for the EC2 instances that you register with an ELB load balancer.
       *
       *
       * * **S3 buckets** - There are no special requirements for setting `EvaluateTargetHealth` to
       * `true` when the alias target is an S3 bucket.
       * * **Other records in the same hosted zone** - If the AWS resource that you specify in
       * `DNSName` is a record or a group of records (for example, a group of weighted records) but is
       * not another alias record, we recommend that you associate a health check with all of the
       * records in the alias target. For more information, see [What Happens When You Omit Health
       * Checks?](https://docs.aws.amazon.com/Route53/latest/DeveloperGuide/dns-failover-complex-configs.html#dns-failover-complex-configs-hc-omitting)
       * in the *Amazon Route 53 Developer Guide* .
       *
       * For more information and examples, see [Amazon Route 53 Health Checks and DNS
       * Failover](https://docs.aws.amazon.com/Route53/latest/DeveloperGuide/dns-failover.html) in the
       * *Amazon Route 53 Developer Guide* .
       */
      override fun evaluateTargetHealth(evaluateTargetHealth: IResolvable) {
        cdkBuilder.evaluateTargetHealth(evaluateTargetHealth.let(IResolvable::unwrap))
      }

      /**
       * @param hostedZoneId *Alias resource records sets only* : The value used depends on where
       * you want to route traffic:. 
       * * **Amazon API Gateway custom regional APIs and edge-optimized APIs** - Specify the hosted
       * zone ID for your API. You can get the applicable value using the AWS CLI command
       * [get-domain-names](https://docs.aws.amazon.com/cli/latest/reference/apigateway/get-domain-names.html)
       * :
       * * For regional APIs, specify the value of `regionalHostedZoneId` .
       * * For edge-optimized APIs, specify the value of `distributionHostedZoneId` .
       * * **Amazon Virtual Private Cloud interface VPC endpoint** - Specify the hosted zone ID for
       * your interface endpoint. You can get the value of `HostedZoneId` using the AWS CLI command
       * [describe-vpc-endpoints](https://docs.aws.amazon.com/cli/latest/reference/ec2/describe-vpc-endpoints.html)
       * .
       * * **CloudFront distribution** - Specify `Z2FDTNDATAQYW2` . This is always the hosted zone
       * ID when you create an alias record that routes traffic to a CloudFront distribution.
       *
       *
       * Alias records for CloudFront can't be created in a private zone.
       *
       *
       * * **Elastic Beanstalk environment** - Specify the hosted zone ID for the region that you
       * created the environment in. The environment must have a regionalized subdomain. For a list of
       * regions and the corresponding hosted zone IDs, see [AWS Elastic Beanstalk endpoints and
       * quotas](https://docs.aws.amazon.com/general/latest/gr/elasticbeanstalk.html) in the *Amazon
       * Web Services General Reference* .
       * * **ELB load balancer** - Specify the value of the hosted zone ID for the load balancer.
       * Use the following methods to get the hosted zone ID:
       * * [Service Endpoints](https://docs.aws.amazon.com/general/latest/gr/elb.html) table in the
       * "Elastic Load Balancing endpoints and quotas" topic in the *Amazon Web Services General
       * Reference* : Use the value that corresponds with the region that you created your load
       * balancer in. Note that there are separate columns for Application and Classic Load Balancers
       * and for Network Load Balancers.
       * * *AWS Management Console* : Go to the Amazon EC2 page, choose *Load Balancers* in the
       * navigation pane, select the load balancer, and get the value of the *Hosted zone* field on the
       * *Description* tab.
       * * *Elastic Load Balancing API* : Use `DescribeLoadBalancers` to get the applicable value.
       * For more information, see the applicable guide:
       * * Classic Load Balancers: Use
       * [DescribeLoadBalancers](https://docs.aws.amazon.com/elasticloadbalancing/2012-06-01/APIReference/API_DescribeLoadBalancers.html)
       * to get the value of `CanonicalHostedZoneNameID` .
       * * Application and Network Load Balancers: Use
       * [DescribeLoadBalancers](https://docs.aws.amazon.com/elasticloadbalancing/latest/APIReference/API_DescribeLoadBalancers.html)
       * to get the value of `CanonicalHostedZoneID` .
       * * *CloudFormation Fn::GetAtt intrinsic function* : Use the
       * [Fn::GetAtt](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/intrinsic-function-reference-getatt.html)
       * intrinsic function to get the applicable value:
       * * Classic Load Balancers: Get
       * [CanonicalHostedZoneNameID](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-elb.html#aws-properties-ec2-elb-return-values)
       * .
       * * Application and Network Load Balancers: Get
       * [CanonicalHostedZoneID](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticloadbalancingv2-loadbalancer.html#aws-resource-elasticloadbalancingv2-loadbalancer-return-values)
       * .
       * * *AWS CLI* : Use `describe-load-balancers` to get the applicable value. For more
       * information, see the applicable guide:
       * * Classic Load Balancers: Use
       * [describe-load-balancers](https://docs.aws.amazon.com/cli/latest/reference/elb/describe-load-balancers.html)
       * to get the value of `CanonicalHostedZoneNameID` .
       * * Application and Network Load Balancers: Use
       * [describe-load-balancers](https://docs.aws.amazon.com/cli/latest/reference/elbv2/describe-load-balancers.html)
       * to get the value of `CanonicalHostedZoneID` .
       * * **Global Accelerator accelerator** - Specify `Z2BJ6XQ5FK7U4H` .
       * * **An Amazon S3 bucket configured as a static website** - Specify the hosted zone ID for
       * the region that you created the bucket in. For more information about valid values, see the
       * table [Amazon S3 Website
       * Endpoints](https://docs.aws.amazon.com/general/latest/gr/s3.html#s3_website_region_endpoints)
       * in the *Amazon Web Services General Reference* .
       * * **Another Route 53 record in your hosted zone** - Specify the hosted zone ID of your
       * hosted zone. (An alias record can't reference a record in a different hosted zone.)
       */
      override fun hostedZoneId(hostedZoneId: String) {
        cdkBuilder.hostedZoneId(hostedZoneId)
      }

      public fun build():
          software.amazon.awscdk.services.route53.CfnRecordSetGroup.AliasTargetProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.route53.CfnRecordSetGroup.AliasTargetProperty,
    ) : CdkObject(cdkObject), AliasTargetProperty {
      /**
       * *Alias records only:* The value that you specify depends on where you want to route
       * queries:.
       *
       * * **Amazon API Gateway custom regional APIs and edge-optimized APIs** - Specify the
       * applicable domain name for your API. You can get the applicable value using the AWS CLI
       * command
       * [get-domain-names](https://docs.aws.amazon.com/cli/latest/reference/apigateway/get-domain-names.html)
       * :
       * * For regional APIs, specify the value of `regionalDomainName` .
       * * For edge-optimized APIs, specify the value of `distributionDomainName` . This is the name
       * of the associated CloudFront distribution, such as `da1b2c3d4e5.cloudfront.net` .
       *
       *
       * The name of the record that you're creating must match a custom domain name for your API,
       * such as `api.example.com` .
       *
       *
       * * **Amazon Virtual Private Cloud interface VPC endpoint** - Enter the API endpoint for the
       * interface endpoint, such as
       * `vpce-123456789abcdef01-example-us-east-1a.elasticloadbalancing.us-east-1.vpce.amazonaws.com`
       * . For edge-optimized APIs, this is the domain name for the corresponding CloudFront
       * distribution. You can get the value of `DnsName` using the AWS CLI command
       * [describe-vpc-endpoints](https://docs.aws.amazon.com/cli/latest/reference/ec2/describe-vpc-endpoints.html)
       * .
       * * **CloudFront distribution** - Specify the domain name that CloudFront assigned when you
       * created your distribution.
       *
       * Your CloudFront distribution must include an alternate domain name that matches the name of
       * the record. For example, if the name of the record is *acme.example.com* , your CloudFront
       * distribution must include *acme.example.com* as one of the alternate domain names. For more
       * information, see [Using Alternate Domain Names
       * (CNAMEs)](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/CNAMEs.html) in
       * the *Amazon CloudFront Developer Guide* .
       *
       * You can't create a record in a private hosted zone to route traffic to a CloudFront
       * distribution.
       *
       *
       * For failover alias records, you can't specify a CloudFront distribution for both the
       * primary and secondary records. A distribution must include an alternate domain name that
       * matches the name of the record. However, the primary and secondary records have the same name,
       * and you can't include the same alternate domain name in more than one distribution.
       *
       *
       * * **Elastic Beanstalk environment** - If the domain name for your Elastic Beanstalk
       * environment includes the region that you deployed the environment in, you can create an alias
       * record that routes traffic to the environment. For example, the domain name `my-environment.
       * *us-west-2* .elasticbeanstalk.com` is a regionalized domain name.
       *
       *
       * For environments that were created before early 2016, the domain name doesn't include the
       * region. To route traffic to these environments, you must create a CNAME record instead of an
       * alias record. Note that you can't create a CNAME record for the root domain name. For example,
       * if your domain name is example.com, you can create a record that routes traffic for
       * acme.example.com to your Elastic Beanstalk environment, but you can't create a record that
       * routes traffic for example.com to your Elastic Beanstalk environment.
       *
       *
       * For Elastic Beanstalk environments that have regionalized subdomains, specify the `CNAME`
       * attribute for the environment. You can use the following methods to get the value of the CNAME
       * attribute:
       *
       * * *AWS Management Console* : For information about how to get the value by using the
       * console, see [Using Custom Domains with AWS Elastic
       * Beanstalk](https://docs.aws.amazon.com/elasticbeanstalk/latest/dg/customdomains.html) in the
       * *AWS Elastic Beanstalk Developer Guide* .
       * * *Elastic Beanstalk API* : Use the `DescribeEnvironments` action to get the value of the
       * `CNAME` attribute. For more information, see
       * [DescribeEnvironments](https://docs.aws.amazon.com/elasticbeanstalk/latest/api/API_DescribeEnvironments.html)
       * in the *AWS Elastic Beanstalk API Reference* .
       * * *AWS CLI* : Use the `describe-environments` command to get the value of the `CNAME`
       * attribute. For more information, see
       * [describe-environments](https://docs.aws.amazon.com/cli/latest/reference/elasticbeanstalk/describe-environments.html)
       * in the *AWS CLI* .
       * * **ELB load balancer** - Specify the DNS name that is associated with the load balancer.
       * Get the DNS name by using the AWS Management Console , the ELB API, or the AWS CLI .
       * * *AWS Management Console* : Go to the EC2 page, choose *Load Balancers* in the navigation
       * pane, choose the load balancer, choose the *Description* tab, and get the value of the *DNS
       * name* field.
       *
       * If you're routing traffic to a Classic Load Balancer, get the value that begins with
       * *dualstack* . If you're routing traffic to another type of load balancer, get the value that
       * applies to the record type, A or AAAA.
       *
       * * *Elastic Load Balancing API* : Use `DescribeLoadBalancers` to get the value of `DNSName`
       * . For more information, see the applicable guide:
       * * Classic Load Balancers:
       * [DescribeLoadBalancers](https://docs.aws.amazon.com/elasticloadbalancing/2012-06-01/APIReference/API_DescribeLoadBalancers.html)
       * * Application and Network Load Balancers:
       * [DescribeLoadBalancers](https://docs.aws.amazon.com/elasticloadbalancing/latest/APIReference/API_DescribeLoadBalancers.html)
       * * *CloudFormation Fn::GetAtt intrinsic function* : Use the
       * [Fn::GetAtt](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/intrinsic-function-reference-getatt.html)
       * intrinsic function to get the value of `DNSName` :
       * * [Classic Load
       * Balancers](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-elb.html#aws-properties-ec2-elb-return-values)
       * .
       * * [Application and Network Load
       * Balancers](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticloadbalancingv2-loadbalancer.html#aws-resource-elasticloadbalancingv2-loadbalancer-return-values)
       * .
       * * *AWS CLI* : Use `describe-load-balancers` to get the value of `DNSName` . For more
       * information, see the applicable guide:
       * * Classic Load Balancers:
       * [describe-load-balancers](https://docs.aws.amazon.com/cli/latest/reference/elb/describe-load-balancers.html)
       * * Application and Network Load Balancers:
       * [describe-load-balancers](https://docs.aws.amazon.com/cli/latest/reference/elbv2/describe-load-balancers.html)
       * * **Global Accelerator accelerator** - Specify the DNS name for your accelerator:
       * * *Global Accelerator API* : To get the DNS name, use
       * [DescribeAccelerator](https://docs.aws.amazon.com/global-accelerator/latest/api/API_DescribeAccelerator.html)
       * .
       * * *AWS CLI* : To get the DNS name, use
       * [describe-accelerator](https://docs.aws.amazon.com/cli/latest/reference/globalaccelerator/describe-accelerator.html)
       * .
       * * **Amazon S3 bucket that is configured as a static website** - Specify the domain name of
       * the Amazon S3 website endpoint that you created the bucket in, for example,
       * `s3-website.us-east-2.amazonaws.com` . For more information about valid values, see the table
       * [Amazon S3 Website
       * Endpoints](https://docs.aws.amazon.com/general/latest/gr/s3.html#s3_website_region_endpoints)
       * in the *Amazon Web Services General Reference* . For more information about using S3 buckets
       * for websites, see [Getting Started with Amazon Route
       * 53](https://docs.aws.amazon.com/Route53/latest/DeveloperGuide/getting-started.html) in the
       * *Amazon Route 53 Developer Guide.*
       * * **Another Route 53 record** - Specify the value of the `Name` element for a record in the
       * current hosted zone.
       *
       *
       * If you're creating an alias record that has the same name as the hosted zone (known as the
       * zone apex), you can't specify the domain name for a record for which the value of `Type` is
       * `CNAME` . This is because the alias record must have the same type as the record that you're
       * routing traffic to, and creating a CNAME record for the zone apex isn't supported even for an
       * alias record.
       *
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-route53-recordsetgroup-aliastarget.html#cfn-route53-recordsetgroup-aliastarget-dnsname)
       */
      override fun dnsName(): String = unwrap(this).getDnsName()

      /**
       * *Applies only to alias records with any routing policy:* When `EvaluateTargetHealth` is
       * `true` , an alias record inherits the health of the referenced AWS resource, such as an ELB
       * load balancer or another record in the hosted zone.
       *
       * Note the following:
       *
       * * **CloudFront distributions** - You can't set `EvaluateTargetHealth` to `true` when the
       * alias target is a CloudFront distribution.
       * * **Elastic Beanstalk environments that have regionalized subdomains** - If you specify an
       * Elastic Beanstalk environment in `DNSName` and the environment contains an ELB load balancer,
       * Elastic Load Balancing routes queries only to the healthy Amazon EC2 instances that are
       * registered with the load balancer. (An environment automatically contains an ELB load balancer
       * if it includes more than one Amazon EC2 instance.) If you set `EvaluateTargetHealth` to `true`
       * and either no Amazon EC2 instances are healthy or the load balancer itself is unhealthy, Route
       * 53 routes queries to other available resources that are healthy, if any.
       *
       * If the environment contains a single Amazon EC2 instance, there are no special
       * requirements.
       *
       * * **ELB load balancers** - Health checking behavior depends on the type of load balancer:
       * * *Classic Load Balancers* : If you specify an ELB Classic Load Balancer in `DNSName` ,
       * Elastic Load Balancing routes queries only to the healthy Amazon EC2 instances that are
       * registered with the load balancer. If you set `EvaluateTargetHealth` to `true` and either no
       * EC2 instances are healthy or the load balancer itself is unhealthy, Route 53 routes queries to
       * other resources.
       * * *Application and Network Load Balancers* : If you specify an ELB Application or Network
       * Load Balancer and you set `EvaluateTargetHealth` to `true` , Route 53 routes queries to the
       * load balancer based on the health of the target groups that are associated with the load
       * balancer:
       * * For an Application or Network Load Balancer to be considered healthy, every target group
       * that contains targets must contain at least one healthy target. If any target group contains
       * only unhealthy targets, the load balancer is considered unhealthy, and Route 53 routes queries
       * to other resources.
       * * A target group that has no registered targets is considered unhealthy.
       *
       *
       * When you create a load balancer, you configure settings for Elastic Load Balancing health
       * checks; they're not Route 53 health checks, but they perform a similar function. Do not create
       * Route 53 health checks for the EC2 instances that you register with an ELB load balancer.
       *
       *
       * * **S3 buckets** - There are no special requirements for setting `EvaluateTargetHealth` to
       * `true` when the alias target is an S3 bucket.
       * * **Other records in the same hosted zone** - If the AWS resource that you specify in
       * `DNSName` is a record or a group of records (for example, a group of weighted records) but is
       * not another alias record, we recommend that you associate a health check with all of the
       * records in the alias target. For more information, see [What Happens When You Omit Health
       * Checks?](https://docs.aws.amazon.com/Route53/latest/DeveloperGuide/dns-failover-complex-configs.html#dns-failover-complex-configs-hc-omitting)
       * in the *Amazon Route 53 Developer Guide* .
       *
       * For more information and examples, see [Amazon Route 53 Health Checks and DNS
       * Failover](https://docs.aws.amazon.com/Route53/latest/DeveloperGuide/dns-failover.html) in the
       * *Amazon Route 53 Developer Guide* .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-route53-recordsetgroup-aliastarget.html#cfn-route53-recordsetgroup-aliastarget-evaluatetargethealth)
       */
      override fun evaluateTargetHealth(): Any? = unwrap(this).getEvaluateTargetHealth()

      /**
       * *Alias resource records sets only* : The value used depends on where you want to route
       * traffic:.
       *
       * * **Amazon API Gateway custom regional APIs and edge-optimized APIs** - Specify the hosted
       * zone ID for your API. You can get the applicable value using the AWS CLI command
       * [get-domain-names](https://docs.aws.amazon.com/cli/latest/reference/apigateway/get-domain-names.html)
       * :
       * * For regional APIs, specify the value of `regionalHostedZoneId` .
       * * For edge-optimized APIs, specify the value of `distributionHostedZoneId` .
       * * **Amazon Virtual Private Cloud interface VPC endpoint** - Specify the hosted zone ID for
       * your interface endpoint. You can get the value of `HostedZoneId` using the AWS CLI command
       * [describe-vpc-endpoints](https://docs.aws.amazon.com/cli/latest/reference/ec2/describe-vpc-endpoints.html)
       * .
       * * **CloudFront distribution** - Specify `Z2FDTNDATAQYW2` . This is always the hosted zone
       * ID when you create an alias record that routes traffic to a CloudFront distribution.
       *
       *
       * Alias records for CloudFront can't be created in a private zone.
       *
       *
       * * **Elastic Beanstalk environment** - Specify the hosted zone ID for the region that you
       * created the environment in. The environment must have a regionalized subdomain. For a list of
       * regions and the corresponding hosted zone IDs, see [AWS Elastic Beanstalk endpoints and
       * quotas](https://docs.aws.amazon.com/general/latest/gr/elasticbeanstalk.html) in the *Amazon
       * Web Services General Reference* .
       * * **ELB load balancer** - Specify the value of the hosted zone ID for the load balancer.
       * Use the following methods to get the hosted zone ID:
       * * [Service Endpoints](https://docs.aws.amazon.com/general/latest/gr/elb.html) table in the
       * "Elastic Load Balancing endpoints and quotas" topic in the *Amazon Web Services General
       * Reference* : Use the value that corresponds with the region that you created your load
       * balancer in. Note that there are separate columns for Application and Classic Load Balancers
       * and for Network Load Balancers.
       * * *AWS Management Console* : Go to the Amazon EC2 page, choose *Load Balancers* in the
       * navigation pane, select the load balancer, and get the value of the *Hosted zone* field on the
       * *Description* tab.
       * * *Elastic Load Balancing API* : Use `DescribeLoadBalancers` to get the applicable value.
       * For more information, see the applicable guide:
       * * Classic Load Balancers: Use
       * [DescribeLoadBalancers](https://docs.aws.amazon.com/elasticloadbalancing/2012-06-01/APIReference/API_DescribeLoadBalancers.html)
       * to get the value of `CanonicalHostedZoneNameID` .
       * * Application and Network Load Balancers: Use
       * [DescribeLoadBalancers](https://docs.aws.amazon.com/elasticloadbalancing/latest/APIReference/API_DescribeLoadBalancers.html)
       * to get the value of `CanonicalHostedZoneID` .
       * * *CloudFormation Fn::GetAtt intrinsic function* : Use the
       * [Fn::GetAtt](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/intrinsic-function-reference-getatt.html)
       * intrinsic function to get the applicable value:
       * * Classic Load Balancers: Get
       * [CanonicalHostedZoneNameID](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-elb.html#aws-properties-ec2-elb-return-values)
       * .
       * * Application and Network Load Balancers: Get
       * [CanonicalHostedZoneID](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticloadbalancingv2-loadbalancer.html#aws-resource-elasticloadbalancingv2-loadbalancer-return-values)
       * .
       * * *AWS CLI* : Use `describe-load-balancers` to get the applicable value. For more
       * information, see the applicable guide:
       * * Classic Load Balancers: Use
       * [describe-load-balancers](https://docs.aws.amazon.com/cli/latest/reference/elb/describe-load-balancers.html)
       * to get the value of `CanonicalHostedZoneNameID` .
       * * Application and Network Load Balancers: Use
       * [describe-load-balancers](https://docs.aws.amazon.com/cli/latest/reference/elbv2/describe-load-balancers.html)
       * to get the value of `CanonicalHostedZoneID` .
       * * **Global Accelerator accelerator** - Specify `Z2BJ6XQ5FK7U4H` .
       * * **An Amazon S3 bucket configured as a static website** - Specify the hosted zone ID for
       * the region that you created the bucket in. For more information about valid values, see the
       * table [Amazon S3 Website
       * Endpoints](https://docs.aws.amazon.com/general/latest/gr/s3.html#s3_website_region_endpoints)
       * in the *Amazon Web Services General Reference* .
       * * **Another Route 53 record in your hosted zone** - Specify the hosted zone ID of your
       * hosted zone. (An alias record can't reference a record in a different hosted zone.)
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-route53-recordsetgroup-aliastarget.html#cfn-route53-recordsetgroup-aliastarget-hostedzoneid)
       */
      override fun hostedZoneId(): String = unwrap(this).getHostedZoneId()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): AliasTargetProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.route53.CfnRecordSetGroup.AliasTargetProperty):
          AliasTargetProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: AliasTargetProperty):
          software.amazon.awscdk.services.route53.CfnRecordSetGroup.AliasTargetProperty = (wrapped
          as CdkObject).cdkObject as
          software.amazon.awscdk.services.route53.CfnRecordSetGroup.AliasTargetProperty
    }
  }

  /**
   * Information about one record that you want to create.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.route53.*;
   * RecordSetProperty recordSetProperty = RecordSetProperty.builder()
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
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-route53-recordsetgroup-recordset.html)
   */
  public interface RecordSetProperty {
    /**
     * *Alias resource record sets only:* Information about the AWS resource, such as a CloudFront
     * distribution or an Amazon S3 bucket, that you want to route traffic to.
     *
     * If you're creating resource records sets for a private hosted zone, note the following:
     *
     * * You can't create an alias resource record set in a private hosted zone to route traffic to
     * a CloudFront distribution.
     * * For information about creating failover resource record sets in a private hosted zone, see
     * [Configuring Failover in a Private Hosted
     * Zone](https://docs.aws.amazon.com/Route53/latest/DeveloperGuide/dns-failover-private-hosted-zones.html)
     * in the *Amazon Route 53 Developer Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-route53-recordsetgroup-recordset.html#cfn-route53-recordsetgroup-recordset-aliastarget)
     */
    public fun aliasTarget(): Any? = unwrap(this).getAliasTarget()

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-route53-recordsetgroup-recordset.html#cfn-route53-recordsetgroup-recordset-cidrroutingconfig)
     */
    public fun cidrRoutingConfig(): Any? = unwrap(this).getCidrRoutingConfig()

    /**
     * *Failover resource record sets only:* To configure failover, you add the `Failover` element
     * to two resource record sets.
     *
     * For one resource record set, you specify `PRIMARY` as the value for `Failover` ; for the
     * other resource record set, you specify `SECONDARY` . In addition, you include the
     * `HealthCheckId` element and specify the health check that you want Amazon Route 53 to perform
     * for each resource record set.
     *
     * Except where noted, the following failover behaviors assume that you have included the
     * `HealthCheckId` element in both resource record sets:
     *
     * * When the primary resource record set is healthy, Route 53 responds to DNS queries with the
     * applicable value from the primary resource record set regardless of the health of the secondary
     * resource record set.
     * * When the primary resource record set is unhealthy and the secondary resource record set is
     * healthy, Route 53 responds to DNS queries with the applicable value from the secondary resource
     * record set.
     * * When the secondary resource record set is unhealthy, Route 53 responds to DNS queries with
     * the applicable value from the primary resource record set regardless of the health of the
     * primary resource record set.
     * * If you omit the `HealthCheckId` element for the secondary resource record set, and if the
     * primary resource record set is unhealthy, Route 53 always responds to DNS queries with the
     * applicable value from the secondary resource record set. This is true regardless of the health
     * of the associated endpoint.
     *
     * You can't create non-failover resource record sets that have the same values for the `Name`
     * and `Type` elements as failover resource record sets.
     *
     * For failover alias resource record sets, you must also include the `EvaluateTargetHealth`
     * element and set the value to true.
     *
     * For more information about configuring failover for Route 53, see the following topics in the
     * *Amazon Route 53 Developer Guide* :
     *
     * * [Route 53 Health Checks and DNS
     * Failover](https://docs.aws.amazon.com/Route53/latest/DeveloperGuide/dns-failover.html)
     * * [Configuring Failover in a Private Hosted
     * Zone](https://docs.aws.amazon.com/Route53/latest/DeveloperGuide/dns-failover-private-hosted-zones.html)
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-route53-recordsetgroup-recordset.html#cfn-route53-recordsetgroup-recordset-failover)
     */
    public fun failover(): String? = unwrap(this).getFailover()

    /**
     * *Geolocation resource record sets only:* A complex type that lets you control how Amazon
     * Route 53 responds to DNS queries based on the geographic origin of the query.
     *
     * For example, if you want all queries from Africa to be routed to a web server with an IP
     * address of `192.0.2.111` , create a resource record set with a `Type` of `A` and a
     * `ContinentCode` of `AF` .
     *
     * If you create separate resource record sets for overlapping geographic regions (for example,
     * one resource record set for a continent and one for a country on the same continent), priority
     * goes to the smallest geographic region. This allows you to route most queries for a continent to
     * one resource and to route queries for a country on that continent to a different resource.
     *
     * You can't create two geolocation resource record sets that specify the same geographic
     * location.
     *
     * The value `*` in the `CountryCode` element matches all geographic locations that aren't
     * specified in other geolocation resource record sets that have the same values for the `Name` and
     * `Type` elements.
     *
     *
     * Geolocation works by mapping IP addresses to locations. However, some IP addresses aren't
     * mapped to geographic locations, so even if you create geolocation resource record sets that
     * cover all seven continents, Route 53 will receive some DNS queries from locations that it can't
     * identify. We recommend that you create a resource record set for which the value of
     * `CountryCode` is `*` . Two groups of queries are routed to the resource that you specify in this
     * record: queries that come from locations for which you haven't created geolocation resource
     * record sets and queries from IP addresses that aren't mapped to a location. If you don't create
     * a `*` resource record set, Route 53 returns a "no answer" response for queries from those
     * locations.
     *
     *
     * You can't create non-geolocation resource record sets that have the same values for the
     * `Name` and `Type` elements as geolocation resource record sets.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-route53-recordsetgroup-recordset.html#cfn-route53-recordsetgroup-recordset-geolocation)
     */
    public fun geoLocation(): Any? = unwrap(this).getGeoLocation()

    /**
     * A complex type that contains information about a geographic location.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-route53-recordsetgroup-recordset.html#cfn-route53-recordsetgroup-recordset-geoproximitylocation)
     */
    public fun geoProximityLocation(): Any? = unwrap(this).getGeoProximityLocation()

    /**
     * If you want Amazon Route 53 to return this resource record set in response to a DNS query
     * only when the status of a health check is healthy, include the `HealthCheckId` element and
     * specify the ID of the applicable health check.
     *
     * Route 53 determines whether a resource record set is healthy based on one of the following:
     *
     * * By periodically sending a request to the endpoint that is specified in the health check
     * * By aggregating the status of a specified group of health checks (calculated health checks)
     * * By determining the current state of a CloudWatch alarm (CloudWatch metric health checks)
     *
     *
     * Route 53 doesn't check the health of the endpoint that is specified in the resource record
     * set, for example, the endpoint specified by the IP address in the `Value` element. When you add
     * a `HealthCheckId` element to a resource record set, Route 53 checks the health of the endpoint
     * that you specified in the health check.
     *
     *
     * For more information, see the following topics in the *Amazon Route 53 Developer Guide* :
     *
     * * [How Amazon Route 53 Determines Whether an Endpoint Is
     * Healthy](https://docs.aws.amazon.com/Route53/latest/DeveloperGuide/dns-failover-determining-health-of-endpoints.html)
     * * [Route 53 Health Checks and DNS
     * Failover](https://docs.aws.amazon.com/Route53/latest/DeveloperGuide/dns-failover.html)
     * * [Configuring Failover in a Private Hosted
     * Zone](https://docs.aws.amazon.com/Route53/latest/DeveloperGuide/dns-failover-private-hosted-zones.html)
     *
     * *When to Specify HealthCheckId*
     *
     * Specifying a value for `HealthCheckId` is useful only when Route 53 is choosing between two
     * or more resource record sets to respond to a DNS query, and you want Route 53 to base the choice
     * in part on the status of a health check. Configuring health checks makes sense only in the
     * following configurations:
     *
     * * *Non-alias resource record sets* : You're checking the health of a group of non-alias
     * resource record sets that have the same routing policy, name, and type (such as multiple
     * weighted records named www.example.com with a type of A) and you specify health check IDs for
     * all the resource record sets.
     *
     * If the health check status for a resource record set is healthy, Route 53 includes the record
     * among the records that it responds to DNS queries with.
     *
     * If the health check status for a resource record set is unhealthy, Route 53 stops responding
     * to DNS queries using the value for that resource record set.
     *
     * If the health check status for all resource record sets in the group is unhealthy, Route 53
     * considers all resource record sets in the group healthy and responds to DNS queries accordingly.
     *
     * * *Alias resource record sets* : You specify the following settings:
     * * You set `EvaluateTargetHealth` to true for an alias resource record set in a group of
     * resource record sets that have the same routing policy, name, and type (such as multiple
     * weighted records named www.example.com with a type of A).
     * * You configure the alias resource record set to route traffic to a non-alias resource record
     * set in the same hosted zone.
     * * You specify a health check ID for the non-alias resource record set.
     *
     * If the health check status is healthy, Route 53 considers the alias resource record set to be
     * healthy and includes the alias record among the records that it responds to DNS queries with.
     *
     * If the health check status is unhealthy, Route 53 stops responding to DNS queries using the
     * alias resource record set.
     *
     *
     * The alias resource record set can also route traffic to a *group* of non-alias resource
     * record sets that have the same routing policy, name, and type. In that configuration, associate
     * health checks with all of the resource record sets in the group of non-alias resource record
     * sets.
     *
     *
     * *Geolocation Routing*
     *
     * For geolocation resource record sets, if an endpoint is unhealthy, Route 53 looks for a
     * resource record set for the larger, associated geographic region. For example, suppose you have
     * resource record sets for a state in the United States, for the entire United States, for North
     * America, and a resource record set that has `*` for `CountryCode` is `*` , which applies to all
     * locations. If the endpoint for the state resource record set is unhealthy, Route 53 checks for
     * healthy resource record sets in the following order until it finds a resource record set for
     * which the endpoint is healthy:
     *
     * * The United States
     * * North America
     * * The default resource record set
     *
     * *Specifying the Health Check Endpoint by Domain Name*
     *
     * If your health checks specify the endpoint only by domain name, we recommend that you create
     * a separate health check for each endpoint. For example, create a health check for each `HTTP`
     * server that is serving content for `www.example.com` . For the value of
     * `FullyQualifiedDomainName` , specify the domain name of the server (such as
     * `us-east-2-www.example.com` ), not the name of the resource record sets ( `www.example.com` ).
     *
     *
     * Health check results will be unpredictable if you do the following:
     *
     * * Create a health check that has the same value for `FullyQualifiedDomainName` as the name of
     * a resource record set.
     * * Associate that health check with the resource record set.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-route53-recordsetgroup-recordset.html#cfn-route53-recordsetgroup-recordset-healthcheckid)
     */
    public fun healthCheckId(): String? = unwrap(this).getHealthCheckId()

    /**
     * The ID of the hosted zone that you want to create records in.
     *
     * Specify either `HostedZoneName` or `HostedZoneId` , but not both. If you have multiple hosted
     * zones with the same domain name, you must specify the hosted zone using `HostedZoneId` .
     *
     * Do not provide the `HostedZoneId` if it is already defined in `AWS::Route53::RecordSetGroup`
     * . The creation fails if `HostedZoneId` is defined in both.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-route53-recordsetgroup-recordset.html#cfn-route53-recordsetgroup-recordset-hostedzoneid)
     */
    public fun hostedZoneId(): String? = unwrap(this).getHostedZoneId()

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
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-route53-recordsetgroup-recordset.html#cfn-route53-recordsetgroup-recordset-hostedzonename)
     */
    public fun hostedZoneName(): String? = unwrap(this).getHostedZoneName()

    /**
     * *Multivalue answer resource record sets only* : To route traffic approximately randomly to
     * multiple resources, such as web servers, create one multivalue answer record for each resource
     * and specify `true` for `MultiValueAnswer` .
     *
     * Note the following:
     *
     * * If you associate a health check with a multivalue answer resource record set, Amazon Route
     * 53 responds to DNS queries with the corresponding IP address only when the health check is
     * healthy.
     * * If you don't associate a health check with a multivalue answer record, Route 53 always
     * considers the record to be healthy.
     * * Route 53 responds to DNS queries with up to eight healthy records; if you have eight or
     * fewer healthy records, Route 53 responds to all DNS queries with all the healthy records.
     * * If you have more than eight healthy records, Route 53 responds to different DNS resolvers
     * with different combinations of healthy records.
     * * When all records are unhealthy, Route 53 responds to DNS queries with up to eight unhealthy
     * records.
     * * If a resource becomes unavailable after a resolver caches a response, client software
     * typically tries another of the IP addresses in the response.
     *
     * You can't create multivalue answer alias records.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-route53-recordsetgroup-recordset.html#cfn-route53-recordsetgroup-recordset-multivalueanswer)
     */
    public fun multiValueAnswer(): Any? = unwrap(this).getMultiValueAnswer()

    /**
     * For `ChangeResourceRecordSets` requests, the name of the record that you want to create,
     * update, or delete.
     *
     * For `ListResourceRecordSets` responses, the name of a record in the specified hosted zone.
     *
     * *ChangeResourceRecordSets Only*
     *
     * Enter a fully qualified domain name, for example, `www.example.com` . You can optionally
     * include a trailing dot. If you omit the trailing dot, Amazon Route 53 assumes that the domain
     * name that you specify is fully qualified. This means that Route 53 treats `www.example.com`
     * (without a trailing dot) and `www.example.com.` (with a trailing dot) as identical.
     *
     * For information about how to specify characters other than `a-z` , `0-9` , and `-` (hyphen)
     * and how to specify internationalized domain names, see [DNS Domain Name
     * Format](https://docs.aws.amazon.com/Route53/latest/DeveloperGuide/DomainNameFormat.html) in the
     * *Amazon Route 53 Developer Guide* .
     *
     * You can use the asterisk (*) wildcard to replace the leftmost label in a domain name, for
     * example, `*.example.com` . Note the following:
     *
     * * The * must replace the entire label. For example, you can't specify `*prod.example.com` or
     * `prod*.example.com` .
     * * The * can't replace any of the middle labels, for example, marketing.*.example.com.
     * * If you include * in any position other than the leftmost label in a domain name, DNS treats
     * it as an * character (ASCII 42), not as a wildcard.
     *
     *
     * You can't use the * wildcard for resource records sets that have a type of NS.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-route53-recordsetgroup-recordset.html#cfn-route53-recordsetgroup-recordset-name)
     */
    public fun name(): String

    /**
     * *Latency-based resource record sets only:* The Amazon EC2 Region where you created the
     * resource that this resource record set refers to.
     *
     * The resource typically is an AWS resource, such as an EC2 instance or an ELB load balancer,
     * and is referred to by an IP address or a DNS domain name, depending on the record type.
     *
     * When Amazon Route 53 receives a DNS query for a domain name and type for which you have
     * created latency resource record sets, Route 53 selects the latency resource record set that has
     * the lowest latency between the end user and the associated Amazon EC2 Region. Route 53 then
     * returns the value that is associated with the selected resource record set.
     *
     * Note the following:
     *
     * * You can only specify one `ResourceRecord` per latency resource record set.
     * * You can only create one latency resource record set for each Amazon EC2 Region.
     * * You aren't required to create latency resource record sets for all Amazon EC2 Regions.
     * Route 53 will choose the region with the best latency from among the regions that you create
     * latency resource record sets for.
     * * You can't create non-latency resource record sets that have the same values for the `Name`
     * and `Type` elements as latency resource record sets.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-route53-recordsetgroup-recordset.html#cfn-route53-recordsetgroup-recordset-region)
     */
    public fun region(): String? = unwrap(this).getRegion()

    /**
     * Information about the records that you want to create.
     *
     * Each record should be in the format appropriate for the record type specified by the `Type`
     * property. For information about different record types and their record formats, see [Values
     * That You Specify When You Create or Edit Amazon Route 53
     * Records](https://docs.aws.amazon.com/Route53/latest/DeveloperGuide/resource-record-sets-values.html)
     * in the *Amazon Route 53 Developer Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-route53-recordsetgroup-recordset.html#cfn-route53-recordsetgroup-recordset-resourcerecords)
     */
    public fun resourceRecords(): List<String> = unwrap(this).getResourceRecords() ?: emptyList()

    /**
     * *Resource record sets that have a routing policy other than simple:* An identifier that
     * differentiates among multiple resource record sets that have the same combination of name and
     * type, such as multiple weighted resource record sets named acme.example.com that have a type of
     * A. In a group of resource record sets that have the same name and type, the value of
     * `SetIdentifier` must be unique for each resource record set.
     *
     * For information about routing policies, see [Choosing a Routing
     * Policy](https://docs.aws.amazon.com/Route53/latest/DeveloperGuide/routing-policy.html) in the
     * *Amazon Route 53 Developer Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-route53-recordsetgroup-recordset.html#cfn-route53-recordsetgroup-recordset-setidentifier)
     */
    public fun setIdentifier(): String? = unwrap(this).getSetIdentifier()

    /**
     * The resource record cache time to live (TTL), in seconds. Note the following:.
     *
     * * If you're creating or updating an alias resource record set, omit `TTL` . Amazon Route 53
     * uses the value of `TTL` for the alias target.
     * * If you're associating this resource record set with a health check (if you're adding a
     * `HealthCheckId` element), we recommend that you specify a `TTL` of 60 seconds or less so clients
     * respond quickly to changes in health status.
     * * All of the resource record sets in a group of weighted resource record sets must have the
     * same value for `TTL` .
     * * If a group of weighted resource record sets includes one or more weighted alias resource
     * record sets for which the alias target is an ELB load balancer, we recommend that you specify a
     * `TTL` of 60 seconds for all of the non-alias weighted resource record sets that have the same
     * name and type. Values other than 60 seconds (the TTL for load balancers) will change the effect
     * of the values that you specify for `Weight` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-route53-recordsetgroup-recordset.html#cfn-route53-recordsetgroup-recordset-ttl)
     */
    public fun ttl(): String? = unwrap(this).getTtl()

    /**
     * The DNS record type.
     *
     * For information about different record types and how data is encoded for them, see [Supported
     * DNS Resource Record
     * Types](https://docs.aws.amazon.com/Route53/latest/DeveloperGuide/ResourceRecordTypes.html) in
     * the *Amazon Route 53 Developer Guide* .
     *
     * Valid values for basic resource record sets: `A` | `AAAA` | `CAA` | `CNAME` | `DS` | `MX` |
     * `NAPTR` | `NS` | `PTR` | `SOA` | `SPF` | `SRV` | `TXT`
     *
     * Values for weighted, latency, geolocation, and failover resource record sets: `A` | `AAAA` |
     * `CAA` | `CNAME` | `MX` | `NAPTR` | `PTR` | `SPF` | `SRV` | `TXT` . When creating a group of
     * weighted, latency, geolocation, or failover resource record sets, specify the same value for all
     * of the resource record sets in the group.
     *
     * Valid values for multivalue answer resource record sets: `A` | `AAAA` | `MX` | `NAPTR` |
     * `PTR` | `SPF` | `SRV` | `TXT`
     *
     *
     * SPF records were formerly used to verify the identity of the sender of email messages.
     * However, we no longer recommend that you create resource record sets for which the value of
     * `Type` is `SPF` . RFC 7208, *Sender Policy Framework (SPF) for Authorizing Use of Domains in
     * Email, Version 1* , has been updated to say, "...[I]ts existence and mechanism defined in
     * [RFC4408] have led to some interoperability issues. Accordingly, its use is no longer
     * appropriate for SPF version 1; implementations are not to use it." In RFC 7208, see section
     * 14.1, [The SPF DNS Record
     * Type](https://docs.aws.amazon.com/http://tools.ietf.org/html/rfc7208#section-14.1) .
     *
     *
     * Values for alias resource record sets:
     *
     * * *Amazon API Gateway custom regional APIs and edge-optimized APIs:* `A`
     * * *CloudFront distributions:* `A`
     *
     * If IPv6 is enabled for the distribution, create two resource record sets to route traffic to
     * your distribution, one with a value of `A` and one with a value of `AAAA` .
     *
     * * *Amazon API Gateway environment that has a regionalized subdomain* : `A`
     * * *ELB load balancers:* `A` | `AAAA`
     * * *Amazon S3 buckets:* `A`
     * * *Amazon Virtual Private Cloud interface VPC endpoints* `A`
     * * *Another resource record set in this hosted zone:* Specify the type of the resource record
     * set that you're creating the alias for. All values are supported except `NS` and `SOA` .
     *
     *
     * If you're creating an alias record that has the same name as the hosted zone (known as the
     * zone apex), you can't route traffic to a record for which the value of `Type` is `CNAME` . This
     * is because the alias record must have the same type as the record you're routing traffic to, and
     * creating a CNAME record for the zone apex isn't supported even for an alias record.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-route53-recordsetgroup-recordset.html#cfn-route53-recordsetgroup-recordset-type)
     */
    public fun type(): String

    /**
     * *Weighted resource record sets only:* Among resource record sets that have the same
     * combination of DNS name and type, a value that determines the proportion of DNS queries that
     * Amazon Route 53 responds to using the current resource record set.
     *
     * Route 53 calculates the sum of the weights for the resource record sets that have the same
     * combination of DNS name and type. Route 53 then responds to queries based on the ratio of a
     * resource's weight to the total. Note the following:
     *
     * * You must specify a value for the `Weight` element for every weighted resource record set.
     * * You can only specify one `ResourceRecord` per weighted resource record set.
     * * You can't create latency, failover, or geolocation resource record sets that have the same
     * values for the `Name` and `Type` elements as weighted resource record sets.
     * * You can create a maximum of 100 weighted resource record sets that have the same values for
     * the `Name` and `Type` elements.
     * * For weighted (but not weighted alias) resource record sets, if you set `Weight` to `0` for
     * a resource record set, Route 53 never responds to queries with the applicable value for that
     * resource record set. However, if you set `Weight` to `0` for all resource record sets that have
     * the same combination of DNS name and type, traffic is routed to all resources with equal
     * probability.
     *
     * The effect of setting `Weight` to `0` is different when you associate health checks with
     * weighted resource record sets. For more information, see [Options for Configuring Route 53
     * Active-Active and Active-Passive
     * Failover](https://docs.aws.amazon.com/Route53/latest/DeveloperGuide/dns-failover-configuring-options.html)
     * in the *Amazon Route 53 Developer Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-route53-recordsetgroup-recordset.html#cfn-route53-recordsetgroup-recordset-weight)
     */
    public fun weight(): Number? = unwrap(this).getWeight()

    /**
     * A builder for [RecordSetProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param aliasTarget *Alias resource record sets only:* Information about the AWS resource,
       * such as a CloudFront distribution or an Amazon S3 bucket, that you want to route traffic to.
       * If you're creating resource records sets for a private hosted zone, note the following:
       *
       * * You can't create an alias resource record set in a private hosted zone to route traffic
       * to a CloudFront distribution.
       * * For information about creating failover resource record sets in a private hosted zone,
       * see [Configuring Failover in a Private Hosted
       * Zone](https://docs.aws.amazon.com/Route53/latest/DeveloperGuide/dns-failover-private-hosted-zones.html)
       * in the *Amazon Route 53 Developer Guide* .
       */
      public fun aliasTarget(aliasTarget: IResolvable)

      /**
       * @param aliasTarget *Alias resource record sets only:* Information about the AWS resource,
       * such as a CloudFront distribution or an Amazon S3 bucket, that you want to route traffic to.
       * If you're creating resource records sets for a private hosted zone, note the following:
       *
       * * You can't create an alias resource record set in a private hosted zone to route traffic
       * to a CloudFront distribution.
       * * For information about creating failover resource record sets in a private hosted zone,
       * see [Configuring Failover in a Private Hosted
       * Zone](https://docs.aws.amazon.com/Route53/latest/DeveloperGuide/dns-failover-private-hosted-zones.html)
       * in the *Amazon Route 53 Developer Guide* .
       */
      public fun aliasTarget(aliasTarget: AliasTargetProperty)

      /**
       * @param aliasTarget *Alias resource record sets only:* Information about the AWS resource,
       * such as a CloudFront distribution or an Amazon S3 bucket, that you want to route traffic to.
       * If you're creating resource records sets for a private hosted zone, note the following:
       *
       * * You can't create an alias resource record set in a private hosted zone to route traffic
       * to a CloudFront distribution.
       * * For information about creating failover resource record sets in a private hosted zone,
       * see [Configuring Failover in a Private Hosted
       * Zone](https://docs.aws.amazon.com/Route53/latest/DeveloperGuide/dns-failover-private-hosted-zones.html)
       * in the *Amazon Route 53 Developer Guide* .
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("efc3fca356b21acf6b38aa9cf75411c4f33ab2f2525b7e5f768c4291bc300ab9")
      public fun aliasTarget(aliasTarget: AliasTargetProperty.Builder.() -> Unit)

      /**
       * @param cidrRoutingConfig the value to be set.
       */
      public fun cidrRoutingConfig(cidrRoutingConfig: IResolvable)

      /**
       * @param cidrRoutingConfig the value to be set.
       */
      public fun cidrRoutingConfig(cidrRoutingConfig: CidrRoutingConfigProperty)

      /**
       * @param cidrRoutingConfig the value to be set.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("4f994abe22d3e39e024a475c2fe39bae7e3c8393f2519714f52cd2abb0591254")
      public fun cidrRoutingConfig(cidrRoutingConfig: CidrRoutingConfigProperty.Builder.() -> Unit)

      /**
       * @param failover *Failover resource record sets only:* To configure failover, you add the
       * `Failover` element to two resource record sets.
       * For one resource record set, you specify `PRIMARY` as the value for `Failover` ; for the
       * other resource record set, you specify `SECONDARY` . In addition, you include the
       * `HealthCheckId` element and specify the health check that you want Amazon Route 53 to perform
       * for each resource record set.
       *
       * Except where noted, the following failover behaviors assume that you have included the
       * `HealthCheckId` element in both resource record sets:
       *
       * * When the primary resource record set is healthy, Route 53 responds to DNS queries with
       * the applicable value from the primary resource record set regardless of the health of the
       * secondary resource record set.
       * * When the primary resource record set is unhealthy and the secondary resource record set
       * is healthy, Route 53 responds to DNS queries with the applicable value from the secondary
       * resource record set.
       * * When the secondary resource record set is unhealthy, Route 53 responds to DNS queries
       * with the applicable value from the primary resource record set regardless of the health of the
       * primary resource record set.
       * * If you omit the `HealthCheckId` element for the secondary resource record set, and if the
       * primary resource record set is unhealthy, Route 53 always responds to DNS queries with the
       * applicable value from the secondary resource record set. This is true regardless of the health
       * of the associated endpoint.
       *
       * You can't create non-failover resource record sets that have the same values for the `Name`
       * and `Type` elements as failover resource record sets.
       *
       * For failover alias resource record sets, you must also include the `EvaluateTargetHealth`
       * element and set the value to true.
       *
       * For more information about configuring failover for Route 53, see the following topics in
       * the *Amazon Route 53 Developer Guide* :
       *
       * * [Route 53 Health Checks and DNS
       * Failover](https://docs.aws.amazon.com/Route53/latest/DeveloperGuide/dns-failover.html)
       * * [Configuring Failover in a Private Hosted
       * Zone](https://docs.aws.amazon.com/Route53/latest/DeveloperGuide/dns-failover-private-hosted-zones.html)
       */
      public fun failover(failover: String)

      /**
       * @param geoLocation *Geolocation resource record sets only:* A complex type that lets you
       * control how Amazon Route 53 responds to DNS queries based on the geographic origin of the
       * query.
       * For example, if you want all queries from Africa to be routed to a web server with an IP
       * address of `192.0.2.111` , create a resource record set with a `Type` of `A` and a
       * `ContinentCode` of `AF` .
       *
       * If you create separate resource record sets for overlapping geographic regions (for
       * example, one resource record set for a continent and one for a country on the same continent),
       * priority goes to the smallest geographic region. This allows you to route most queries for a
       * continent to one resource and to route queries for a country on that continent to a different
       * resource.
       *
       * You can't create two geolocation resource record sets that specify the same geographic
       * location.
       *
       * The value `*` in the `CountryCode` element matches all geographic locations that aren't
       * specified in other geolocation resource record sets that have the same values for the `Name`
       * and `Type` elements.
       *
       *
       * Geolocation works by mapping IP addresses to locations. However, some IP addresses aren't
       * mapped to geographic locations, so even if you create geolocation resource record sets that
       * cover all seven continents, Route 53 will receive some DNS queries from locations that it
       * can't identify. We recommend that you create a resource record set for which the value of
       * `CountryCode` is `*` . Two groups of queries are routed to the resource that you specify in
       * this record: queries that come from locations for which you haven't created geolocation
       * resource record sets and queries from IP addresses that aren't mapped to a location. If you
       * don't create a `*` resource record set, Route 53 returns a "no answer" response for queries
       * from those locations.
       *
       *
       * You can't create non-geolocation resource record sets that have the same values for the
       * `Name` and `Type` elements as geolocation resource record sets.
       */
      public fun geoLocation(geoLocation: IResolvable)

      /**
       * @param geoLocation *Geolocation resource record sets only:* A complex type that lets you
       * control how Amazon Route 53 responds to DNS queries based on the geographic origin of the
       * query.
       * For example, if you want all queries from Africa to be routed to a web server with an IP
       * address of `192.0.2.111` , create a resource record set with a `Type` of `A` and a
       * `ContinentCode` of `AF` .
       *
       * If you create separate resource record sets for overlapping geographic regions (for
       * example, one resource record set for a continent and one for a country on the same continent),
       * priority goes to the smallest geographic region. This allows you to route most queries for a
       * continent to one resource and to route queries for a country on that continent to a different
       * resource.
       *
       * You can't create two geolocation resource record sets that specify the same geographic
       * location.
       *
       * The value `*` in the `CountryCode` element matches all geographic locations that aren't
       * specified in other geolocation resource record sets that have the same values for the `Name`
       * and `Type` elements.
       *
       *
       * Geolocation works by mapping IP addresses to locations. However, some IP addresses aren't
       * mapped to geographic locations, so even if you create geolocation resource record sets that
       * cover all seven continents, Route 53 will receive some DNS queries from locations that it
       * can't identify. We recommend that you create a resource record set for which the value of
       * `CountryCode` is `*` . Two groups of queries are routed to the resource that you specify in
       * this record: queries that come from locations for which you haven't created geolocation
       * resource record sets and queries from IP addresses that aren't mapped to a location. If you
       * don't create a `*` resource record set, Route 53 returns a "no answer" response for queries
       * from those locations.
       *
       *
       * You can't create non-geolocation resource record sets that have the same values for the
       * `Name` and `Type` elements as geolocation resource record sets.
       */
      public fun geoLocation(geoLocation: GeoLocationProperty)

      /**
       * @param geoLocation *Geolocation resource record sets only:* A complex type that lets you
       * control how Amazon Route 53 responds to DNS queries based on the geographic origin of the
       * query.
       * For example, if you want all queries from Africa to be routed to a web server with an IP
       * address of `192.0.2.111` , create a resource record set with a `Type` of `A` and a
       * `ContinentCode` of `AF` .
       *
       * If you create separate resource record sets for overlapping geographic regions (for
       * example, one resource record set for a continent and one for a country on the same continent),
       * priority goes to the smallest geographic region. This allows you to route most queries for a
       * continent to one resource and to route queries for a country on that continent to a different
       * resource.
       *
       * You can't create two geolocation resource record sets that specify the same geographic
       * location.
       *
       * The value `*` in the `CountryCode` element matches all geographic locations that aren't
       * specified in other geolocation resource record sets that have the same values for the `Name`
       * and `Type` elements.
       *
       *
       * Geolocation works by mapping IP addresses to locations. However, some IP addresses aren't
       * mapped to geographic locations, so even if you create geolocation resource record sets that
       * cover all seven continents, Route 53 will receive some DNS queries from locations that it
       * can't identify. We recommend that you create a resource record set for which the value of
       * `CountryCode` is `*` . Two groups of queries are routed to the resource that you specify in
       * this record: queries that come from locations for which you haven't created geolocation
       * resource record sets and queries from IP addresses that aren't mapped to a location. If you
       * don't create a `*` resource record set, Route 53 returns a "no answer" response for queries
       * from those locations.
       *
       *
       * You can't create non-geolocation resource record sets that have the same values for the
       * `Name` and `Type` elements as geolocation resource record sets.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("50ec19885adc4a116a32544c092c0acd0fd3577beaf34dacff846f2b171c6006")
      public fun geoLocation(geoLocation: GeoLocationProperty.Builder.() -> Unit)

      /**
       * @param geoProximityLocation A complex type that contains information about a geographic
       * location.
       */
      public fun geoProximityLocation(geoProximityLocation: IResolvable)

      /**
       * @param geoProximityLocation A complex type that contains information about a geographic
       * location.
       */
      public fun geoProximityLocation(geoProximityLocation: GeoProximityLocationProperty)

      /**
       * @param geoProximityLocation A complex type that contains information about a geographic
       * location.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("cb7bba9ec85e663409ea69ea66ef74ac4c0cde53214787b6a6c399a7c1946b37")
      public
          fun geoProximityLocation(geoProximityLocation: GeoProximityLocationProperty.Builder.() -> Unit)

      /**
       * @param healthCheckId If you want Amazon Route 53 to return this resource record set in
       * response to a DNS query only when the status of a health check is healthy, include the
       * `HealthCheckId` element and specify the ID of the applicable health check.
       * Route 53 determines whether a resource record set is healthy based on one of the following:
       *
       * * By periodically sending a request to the endpoint that is specified in the health check
       * * By aggregating the status of a specified group of health checks (calculated health
       * checks)
       * * By determining the current state of a CloudWatch alarm (CloudWatch metric health checks)
       *
       *
       * Route 53 doesn't check the health of the endpoint that is specified in the resource record
       * set, for example, the endpoint specified by the IP address in the `Value` element. When you
       * add a `HealthCheckId` element to a resource record set, Route 53 checks the health of the
       * endpoint that you specified in the health check.
       *
       *
       * For more information, see the following topics in the *Amazon Route 53 Developer Guide* :
       *
       * * [How Amazon Route 53 Determines Whether an Endpoint Is
       * Healthy](https://docs.aws.amazon.com/Route53/latest/DeveloperGuide/dns-failover-determining-health-of-endpoints.html)
       * * [Route 53 Health Checks and DNS
       * Failover](https://docs.aws.amazon.com/Route53/latest/DeveloperGuide/dns-failover.html)
       * * [Configuring Failover in a Private Hosted
       * Zone](https://docs.aws.amazon.com/Route53/latest/DeveloperGuide/dns-failover-private-hosted-zones.html)
       *
       * *When to Specify HealthCheckId*
       *
       * Specifying a value for `HealthCheckId` is useful only when Route 53 is choosing between two
       * or more resource record sets to respond to a DNS query, and you want Route 53 to base the
       * choice in part on the status of a health check. Configuring health checks makes sense only in
       * the following configurations:
       *
       * * *Non-alias resource record sets* : You're checking the health of a group of non-alias
       * resource record sets that have the same routing policy, name, and type (such as multiple
       * weighted records named www.example.com with a type of A) and you specify health check IDs for
       * all the resource record sets.
       *
       * If the health check status for a resource record set is healthy, Route 53 includes the
       * record among the records that it responds to DNS queries with.
       *
       * If the health check status for a resource record set is unhealthy, Route 53 stops
       * responding to DNS queries using the value for that resource record set.
       *
       * If the health check status for all resource record sets in the group is unhealthy, Route 53
       * considers all resource record sets in the group healthy and responds to DNS queries
       * accordingly.
       *
       * * *Alias resource record sets* : You specify the following settings:
       * * You set `EvaluateTargetHealth` to true for an alias resource record set in a group of
       * resource record sets that have the same routing policy, name, and type (such as multiple
       * weighted records named www.example.com with a type of A).
       * * You configure the alias resource record set to route traffic to a non-alias resource
       * record set in the same hosted zone.
       * * You specify a health check ID for the non-alias resource record set.
       *
       * If the health check status is healthy, Route 53 considers the alias resource record set to
       * be healthy and includes the alias record among the records that it responds to DNS queries
       * with.
       *
       * If the health check status is unhealthy, Route 53 stops responding to DNS queries using the
       * alias resource record set.
       *
       *
       * The alias resource record set can also route traffic to a *group* of non-alias resource
       * record sets that have the same routing policy, name, and type. In that configuration,
       * associate health checks with all of the resource record sets in the group of non-alias
       * resource record sets.
       *
       *
       * *Geolocation Routing*
       *
       * For geolocation resource record sets, if an endpoint is unhealthy, Route 53 looks for a
       * resource record set for the larger, associated geographic region. For example, suppose you
       * have resource record sets for a state in the United States, for the entire United States, for
       * North America, and a resource record set that has `*` for `CountryCode` is `*` , which applies
       * to all locations. If the endpoint for the state resource record set is unhealthy, Route 53
       * checks for healthy resource record sets in the following order until it finds a resource
       * record set for which the endpoint is healthy:
       *
       * * The United States
       * * North America
       * * The default resource record set
       *
       * *Specifying the Health Check Endpoint by Domain Name*
       *
       * If your health checks specify the endpoint only by domain name, we recommend that you
       * create a separate health check for each endpoint. For example, create a health check for each
       * `HTTP` server that is serving content for `www.example.com` . For the value of
       * `FullyQualifiedDomainName` , specify the domain name of the server (such as
       * `us-east-2-www.example.com` ), not the name of the resource record sets ( `www.example.com` ).
       *
       *
       * Health check results will be unpredictable if you do the following:
       *
       * * Create a health check that has the same value for `FullyQualifiedDomainName` as the name
       * of a resource record set.
       * * Associate that health check with the resource record set.
       */
      public fun healthCheckId(healthCheckId: String)

      /**
       * @param hostedZoneId The ID of the hosted zone that you want to create records in.
       * Specify either `HostedZoneName` or `HostedZoneId` , but not both. If you have multiple
       * hosted zones with the same domain name, you must specify the hosted zone using `HostedZoneId`
       * .
       *
       * Do not provide the `HostedZoneId` if it is already defined in
       * `AWS::Route53::RecordSetGroup` . The creation fails if `HostedZoneId` is defined in both.
       */
      public fun hostedZoneId(hostedZoneId: String)

      /**
       * @param hostedZoneName The name of the hosted zone that you want to create records in.
       * You must include a trailing dot (for example, `www.example.com.` ) as part of the
       * `HostedZoneName` .
       *
       * When you create a stack using an `AWS::Route53::RecordSet` that specifies `HostedZoneName`
       * , AWS CloudFormation attempts to find a hosted zone whose name matches the `HostedZoneName` .
       * If AWS CloudFormation can't find a hosted zone with a matching domain name, or if there is
       * more than one hosted zone with the specified domain name, AWS CloudFormation will not create
       * the stack.
       *
       * Specify either `HostedZoneName` or `HostedZoneId` , but not both. If you have multiple
       * hosted zones with the same domain name, you must specify the hosted zone using `HostedZoneId`
       * .
       */
      public fun hostedZoneName(hostedZoneName: String)

      /**
       * @param setIdentifier *Resource record sets that have a routing policy other than simple:*
       * An identifier that differentiates among multiple resource record sets that have the same
       * combination of name and type, such as multiple weighted resource record sets named
       * acme.example.com that have a type of A. In a group of resource record sets that have the same
       * name and type, the value of `SetIdentifier` must be unique for each resource record set.
       * For information about routing policies, see [Choosing a Routing
       * Policy](https://docs.aws.amazon.com/Route53/latest/DeveloperGuide/routing-policy.html) in the
       * *Amazon Route 53 Developer Guide* .
       */
      public fun identifier(setIdentifier: String)

      /**
       * @param multiValueAnswer *Multivalue answer resource record sets only* : To route traffic
       * approximately randomly to multiple resources, such as web servers, create one multivalue
       * answer record for each resource and specify `true` for `MultiValueAnswer` .
       * Note the following:
       *
       * * If you associate a health check with a multivalue answer resource record set, Amazon
       * Route 53 responds to DNS queries with the corresponding IP address only when the health check
       * is healthy.
       * * If you don't associate a health check with a multivalue answer record, Route 53 always
       * considers the record to be healthy.
       * * Route 53 responds to DNS queries with up to eight healthy records; if you have eight or
       * fewer healthy records, Route 53 responds to all DNS queries with all the healthy records.
       * * If you have more than eight healthy records, Route 53 responds to different DNS resolvers
       * with different combinations of healthy records.
       * * When all records are unhealthy, Route 53 responds to DNS queries with up to eight
       * unhealthy records.
       * * If a resource becomes unavailable after a resolver caches a response, client software
       * typically tries another of the IP addresses in the response.
       *
       * You can't create multivalue answer alias records.
       */
      public fun multiValueAnswer(multiValueAnswer: Boolean)

      /**
       * @param multiValueAnswer *Multivalue answer resource record sets only* : To route traffic
       * approximately randomly to multiple resources, such as web servers, create one multivalue
       * answer record for each resource and specify `true` for `MultiValueAnswer` .
       * Note the following:
       *
       * * If you associate a health check with a multivalue answer resource record set, Amazon
       * Route 53 responds to DNS queries with the corresponding IP address only when the health check
       * is healthy.
       * * If you don't associate a health check with a multivalue answer record, Route 53 always
       * considers the record to be healthy.
       * * Route 53 responds to DNS queries with up to eight healthy records; if you have eight or
       * fewer healthy records, Route 53 responds to all DNS queries with all the healthy records.
       * * If you have more than eight healthy records, Route 53 responds to different DNS resolvers
       * with different combinations of healthy records.
       * * When all records are unhealthy, Route 53 responds to DNS queries with up to eight
       * unhealthy records.
       * * If a resource becomes unavailable after a resolver caches a response, client software
       * typically tries another of the IP addresses in the response.
       *
       * You can't create multivalue answer alias records.
       */
      public fun multiValueAnswer(multiValueAnswer: IResolvable)

      /**
       * @param name For `ChangeResourceRecordSets` requests, the name of the record that you want
       * to create, update, or delete. 
       * For `ListResourceRecordSets` responses, the name of a record in the specified hosted zone.
       *
       * *ChangeResourceRecordSets Only*
       *
       * Enter a fully qualified domain name, for example, `www.example.com` . You can optionally
       * include a trailing dot. If you omit the trailing dot, Amazon Route 53 assumes that the domain
       * name that you specify is fully qualified. This means that Route 53 treats `www.example.com`
       * (without a trailing dot) and `www.example.com.` (with a trailing dot) as identical.
       *
       * For information about how to specify characters other than `a-z` , `0-9` , and `-` (hyphen)
       * and how to specify internationalized domain names, see [DNS Domain Name
       * Format](https://docs.aws.amazon.com/Route53/latest/DeveloperGuide/DomainNameFormat.html) in
       * the *Amazon Route 53 Developer Guide* .
       *
       * You can use the asterisk (*) wildcard to replace the leftmost label in a domain name, for
       * example, `*.example.com` . Note the following:
       *
       * * The * must replace the entire label. For example, you can't specify `*prod.example.com`
       * or `prod*.example.com` .
       * * The * can't replace any of the middle labels, for example, marketing.*.example.com.
       * * If you include * in any position other than the leftmost label in a domain name, DNS
       * treats it as an * character (ASCII 42), not as a wildcard.
       *
       *
       * You can't use the * wildcard for resource records sets that have a type of NS.
       */
      public fun name(name: String)

      /**
       * @param region *Latency-based resource record sets only:* The Amazon EC2 Region where you
       * created the resource that this resource record set refers to.
       * The resource typically is an AWS resource, such as an EC2 instance or an ELB load balancer,
       * and is referred to by an IP address or a DNS domain name, depending on the record type.
       *
       * When Amazon Route 53 receives a DNS query for a domain name and type for which you have
       * created latency resource record sets, Route 53 selects the latency resource record set that
       * has the lowest latency between the end user and the associated Amazon EC2 Region. Route 53
       * then returns the value that is associated with the selected resource record set.
       *
       * Note the following:
       *
       * * You can only specify one `ResourceRecord` per latency resource record set.
       * * You can only create one latency resource record set for each Amazon EC2 Region.
       * * You aren't required to create latency resource record sets for all Amazon EC2 Regions.
       * Route 53 will choose the region with the best latency from among the regions that you create
       * latency resource record sets for.
       * * You can't create non-latency resource record sets that have the same values for the
       * `Name` and `Type` elements as latency resource record sets.
       */
      public fun region(region: String)

      /**
       * @param resourceRecords Information about the records that you want to create.
       * Each record should be in the format appropriate for the record type specified by the `Type`
       * property. For information about different record types and their record formats, see [Values
       * That You Specify When You Create or Edit Amazon Route 53
       * Records](https://docs.aws.amazon.com/Route53/latest/DeveloperGuide/resource-record-sets-values.html)
       * in the *Amazon Route 53 Developer Guide* .
       */
      public fun resourceRecords(resourceRecords: List<String>)

      /**
       * @param resourceRecords Information about the records that you want to create.
       * Each record should be in the format appropriate for the record type specified by the `Type`
       * property. For information about different record types and their record formats, see [Values
       * That You Specify When You Create or Edit Amazon Route 53
       * Records](https://docs.aws.amazon.com/Route53/latest/DeveloperGuide/resource-record-sets-values.html)
       * in the *Amazon Route 53 Developer Guide* .
       */
      public fun resourceRecords(vararg resourceRecords: String)

      /**
       * @param ttl The resource record cache time to live (TTL), in seconds. Note the following:.
       * * If you're creating or updating an alias resource record set, omit `TTL` . Amazon Route 53
       * uses the value of `TTL` for the alias target.
       * * If you're associating this resource record set with a health check (if you're adding a
       * `HealthCheckId` element), we recommend that you specify a `TTL` of 60 seconds or less so
       * clients respond quickly to changes in health status.
       * * All of the resource record sets in a group of weighted resource record sets must have the
       * same value for `TTL` .
       * * If a group of weighted resource record sets includes one or more weighted alias resource
       * record sets for which the alias target is an ELB load balancer, we recommend that you specify
       * a `TTL` of 60 seconds for all of the non-alias weighted resource record sets that have the
       * same name and type. Values other than 60 seconds (the TTL for load balancers) will change the
       * effect of the values that you specify for `Weight` .
       */
      public fun ttl(ttl: String)

      /**
       * @param type The DNS record type. 
       * For information about different record types and how data is encoded for them, see
       * [Supported DNS Resource Record
       * Types](https://docs.aws.amazon.com/Route53/latest/DeveloperGuide/ResourceRecordTypes.html) in
       * the *Amazon Route 53 Developer Guide* .
       *
       * Valid values for basic resource record sets: `A` | `AAAA` | `CAA` | `CNAME` | `DS` | `MX` |
       * `NAPTR` | `NS` | `PTR` | `SOA` | `SPF` | `SRV` | `TXT`
       *
       * Values for weighted, latency, geolocation, and failover resource record sets: `A` | `AAAA`
       * | `CAA` | `CNAME` | `MX` | `NAPTR` | `PTR` | `SPF` | `SRV` | `TXT` . When creating a group of
       * weighted, latency, geolocation, or failover resource record sets, specify the same value for
       * all of the resource record sets in the group.
       *
       * Valid values for multivalue answer resource record sets: `A` | `AAAA` | `MX` | `NAPTR` |
       * `PTR` | `SPF` | `SRV` | `TXT`
       *
       *
       * SPF records were formerly used to verify the identity of the sender of email messages.
       * However, we no longer recommend that you create resource record sets for which the value of
       * `Type` is `SPF` . RFC 7208, *Sender Policy Framework (SPF) for Authorizing Use of Domains in
       * Email, Version 1* , has been updated to say, "...[I]ts existence and mechanism defined in
       * [RFC4408] have led to some interoperability issues. Accordingly, its use is no longer
       * appropriate for SPF version 1; implementations are not to use it." In RFC 7208, see section
       * 14.1, [The SPF DNS Record
       * Type](https://docs.aws.amazon.com/http://tools.ietf.org/html/rfc7208#section-14.1) .
       *
       *
       * Values for alias resource record sets:
       *
       * * *Amazon API Gateway custom regional APIs and edge-optimized APIs:* `A`
       * * *CloudFront distributions:* `A`
       *
       * If IPv6 is enabled for the distribution, create two resource record sets to route traffic
       * to your distribution, one with a value of `A` and one with a value of `AAAA` .
       *
       * * *Amazon API Gateway environment that has a regionalized subdomain* : `A`
       * * *ELB load balancers:* `A` | `AAAA`
       * * *Amazon S3 buckets:* `A`
       * * *Amazon Virtual Private Cloud interface VPC endpoints* `A`
       * * *Another resource record set in this hosted zone:* Specify the type of the resource
       * record set that you're creating the alias for. All values are supported except `NS` and `SOA`
       * .
       *
       *
       * If you're creating an alias record that has the same name as the hosted zone (known as the
       * zone apex), you can't route traffic to a record for which the value of `Type` is `CNAME` .
       * This is because the alias record must have the same type as the record you're routing traffic
       * to, and creating a CNAME record for the zone apex isn't supported even for an alias record.
       */
      public fun type(type: String)

      /**
       * @param weight *Weighted resource record sets only:* Among resource record sets that have
       * the same combination of DNS name and type, a value that determines the proportion of DNS
       * queries that Amazon Route 53 responds to using the current resource record set.
       * Route 53 calculates the sum of the weights for the resource record sets that have the same
       * combination of DNS name and type. Route 53 then responds to queries based on the ratio of a
       * resource's weight to the total. Note the following:
       *
       * * You must specify a value for the `Weight` element for every weighted resource record set.
       * * You can only specify one `ResourceRecord` per weighted resource record set.
       * * You can't create latency, failover, or geolocation resource record sets that have the
       * same values for the `Name` and `Type` elements as weighted resource record sets.
       * * You can create a maximum of 100 weighted resource record sets that have the same values
       * for the `Name` and `Type` elements.
       * * For weighted (but not weighted alias) resource record sets, if you set `Weight` to `0`
       * for a resource record set, Route 53 never responds to queries with the applicable value for
       * that resource record set. However, if you set `Weight` to `0` for all resource record sets
       * that have the same combination of DNS name and type, traffic is routed to all resources with
       * equal probability.
       *
       * The effect of setting `Weight` to `0` is different when you associate health checks with
       * weighted resource record sets. For more information, see [Options for Configuring Route 53
       * Active-Active and Active-Passive
       * Failover](https://docs.aws.amazon.com/Route53/latest/DeveloperGuide/dns-failover-configuring-options.html)
       * in the *Amazon Route 53 Developer Guide* .
       */
      public fun weight(weight: Number)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.route53.CfnRecordSetGroup.RecordSetProperty.Builder =
          software.amazon.awscdk.services.route53.CfnRecordSetGroup.RecordSetProperty.builder()

      /**
       * @param aliasTarget *Alias resource record sets only:* Information about the AWS resource,
       * such as a CloudFront distribution or an Amazon S3 bucket, that you want to route traffic to.
       * If you're creating resource records sets for a private hosted zone, note the following:
       *
       * * You can't create an alias resource record set in a private hosted zone to route traffic
       * to a CloudFront distribution.
       * * For information about creating failover resource record sets in a private hosted zone,
       * see [Configuring Failover in a Private Hosted
       * Zone](https://docs.aws.amazon.com/Route53/latest/DeveloperGuide/dns-failover-private-hosted-zones.html)
       * in the *Amazon Route 53 Developer Guide* .
       */
      override fun aliasTarget(aliasTarget: IResolvable) {
        cdkBuilder.aliasTarget(aliasTarget.let(IResolvable::unwrap))
      }

      /**
       * @param aliasTarget *Alias resource record sets only:* Information about the AWS resource,
       * such as a CloudFront distribution or an Amazon S3 bucket, that you want to route traffic to.
       * If you're creating resource records sets for a private hosted zone, note the following:
       *
       * * You can't create an alias resource record set in a private hosted zone to route traffic
       * to a CloudFront distribution.
       * * For information about creating failover resource record sets in a private hosted zone,
       * see [Configuring Failover in a Private Hosted
       * Zone](https://docs.aws.amazon.com/Route53/latest/DeveloperGuide/dns-failover-private-hosted-zones.html)
       * in the *Amazon Route 53 Developer Guide* .
       */
      override fun aliasTarget(aliasTarget: AliasTargetProperty) {
        cdkBuilder.aliasTarget(aliasTarget.let(AliasTargetProperty::unwrap))
      }

      /**
       * @param aliasTarget *Alias resource record sets only:* Information about the AWS resource,
       * such as a CloudFront distribution or an Amazon S3 bucket, that you want to route traffic to.
       * If you're creating resource records sets for a private hosted zone, note the following:
       *
       * * You can't create an alias resource record set in a private hosted zone to route traffic
       * to a CloudFront distribution.
       * * For information about creating failover resource record sets in a private hosted zone,
       * see [Configuring Failover in a Private Hosted
       * Zone](https://docs.aws.amazon.com/Route53/latest/DeveloperGuide/dns-failover-private-hosted-zones.html)
       * in the *Amazon Route 53 Developer Guide* .
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("efc3fca356b21acf6b38aa9cf75411c4f33ab2f2525b7e5f768c4291bc300ab9")
      override fun aliasTarget(aliasTarget: AliasTargetProperty.Builder.() -> Unit): Unit =
          aliasTarget(AliasTargetProperty(aliasTarget))

      /**
       * @param cidrRoutingConfig the value to be set.
       */
      override fun cidrRoutingConfig(cidrRoutingConfig: IResolvable) {
        cdkBuilder.cidrRoutingConfig(cidrRoutingConfig.let(IResolvable::unwrap))
      }

      /**
       * @param cidrRoutingConfig the value to be set.
       */
      override fun cidrRoutingConfig(cidrRoutingConfig: CidrRoutingConfigProperty) {
        cdkBuilder.cidrRoutingConfig(cidrRoutingConfig.let(CidrRoutingConfigProperty::unwrap))
      }

      /**
       * @param cidrRoutingConfig the value to be set.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("4f994abe22d3e39e024a475c2fe39bae7e3c8393f2519714f52cd2abb0591254")
      override
          fun cidrRoutingConfig(cidrRoutingConfig: CidrRoutingConfigProperty.Builder.() -> Unit):
          Unit = cidrRoutingConfig(CidrRoutingConfigProperty(cidrRoutingConfig))

      /**
       * @param failover *Failover resource record sets only:* To configure failover, you add the
       * `Failover` element to two resource record sets.
       * For one resource record set, you specify `PRIMARY` as the value for `Failover` ; for the
       * other resource record set, you specify `SECONDARY` . In addition, you include the
       * `HealthCheckId` element and specify the health check that you want Amazon Route 53 to perform
       * for each resource record set.
       *
       * Except where noted, the following failover behaviors assume that you have included the
       * `HealthCheckId` element in both resource record sets:
       *
       * * When the primary resource record set is healthy, Route 53 responds to DNS queries with
       * the applicable value from the primary resource record set regardless of the health of the
       * secondary resource record set.
       * * When the primary resource record set is unhealthy and the secondary resource record set
       * is healthy, Route 53 responds to DNS queries with the applicable value from the secondary
       * resource record set.
       * * When the secondary resource record set is unhealthy, Route 53 responds to DNS queries
       * with the applicable value from the primary resource record set regardless of the health of the
       * primary resource record set.
       * * If you omit the `HealthCheckId` element for the secondary resource record set, and if the
       * primary resource record set is unhealthy, Route 53 always responds to DNS queries with the
       * applicable value from the secondary resource record set. This is true regardless of the health
       * of the associated endpoint.
       *
       * You can't create non-failover resource record sets that have the same values for the `Name`
       * and `Type` elements as failover resource record sets.
       *
       * For failover alias resource record sets, you must also include the `EvaluateTargetHealth`
       * element and set the value to true.
       *
       * For more information about configuring failover for Route 53, see the following topics in
       * the *Amazon Route 53 Developer Guide* :
       *
       * * [Route 53 Health Checks and DNS
       * Failover](https://docs.aws.amazon.com/Route53/latest/DeveloperGuide/dns-failover.html)
       * * [Configuring Failover in a Private Hosted
       * Zone](https://docs.aws.amazon.com/Route53/latest/DeveloperGuide/dns-failover-private-hosted-zones.html)
       */
      override fun failover(failover: String) {
        cdkBuilder.failover(failover)
      }

      /**
       * @param geoLocation *Geolocation resource record sets only:* A complex type that lets you
       * control how Amazon Route 53 responds to DNS queries based on the geographic origin of the
       * query.
       * For example, if you want all queries from Africa to be routed to a web server with an IP
       * address of `192.0.2.111` , create a resource record set with a `Type` of `A` and a
       * `ContinentCode` of `AF` .
       *
       * If you create separate resource record sets for overlapping geographic regions (for
       * example, one resource record set for a continent and one for a country on the same continent),
       * priority goes to the smallest geographic region. This allows you to route most queries for a
       * continent to one resource and to route queries for a country on that continent to a different
       * resource.
       *
       * You can't create two geolocation resource record sets that specify the same geographic
       * location.
       *
       * The value `*` in the `CountryCode` element matches all geographic locations that aren't
       * specified in other geolocation resource record sets that have the same values for the `Name`
       * and `Type` elements.
       *
       *
       * Geolocation works by mapping IP addresses to locations. However, some IP addresses aren't
       * mapped to geographic locations, so even if you create geolocation resource record sets that
       * cover all seven continents, Route 53 will receive some DNS queries from locations that it
       * can't identify. We recommend that you create a resource record set for which the value of
       * `CountryCode` is `*` . Two groups of queries are routed to the resource that you specify in
       * this record: queries that come from locations for which you haven't created geolocation
       * resource record sets and queries from IP addresses that aren't mapped to a location. If you
       * don't create a `*` resource record set, Route 53 returns a "no answer" response for queries
       * from those locations.
       *
       *
       * You can't create non-geolocation resource record sets that have the same values for the
       * `Name` and `Type` elements as geolocation resource record sets.
       */
      override fun geoLocation(geoLocation: IResolvable) {
        cdkBuilder.geoLocation(geoLocation.let(IResolvable::unwrap))
      }

      /**
       * @param geoLocation *Geolocation resource record sets only:* A complex type that lets you
       * control how Amazon Route 53 responds to DNS queries based on the geographic origin of the
       * query.
       * For example, if you want all queries from Africa to be routed to a web server with an IP
       * address of `192.0.2.111` , create a resource record set with a `Type` of `A` and a
       * `ContinentCode` of `AF` .
       *
       * If you create separate resource record sets for overlapping geographic regions (for
       * example, one resource record set for a continent and one for a country on the same continent),
       * priority goes to the smallest geographic region. This allows you to route most queries for a
       * continent to one resource and to route queries for a country on that continent to a different
       * resource.
       *
       * You can't create two geolocation resource record sets that specify the same geographic
       * location.
       *
       * The value `*` in the `CountryCode` element matches all geographic locations that aren't
       * specified in other geolocation resource record sets that have the same values for the `Name`
       * and `Type` elements.
       *
       *
       * Geolocation works by mapping IP addresses to locations. However, some IP addresses aren't
       * mapped to geographic locations, so even if you create geolocation resource record sets that
       * cover all seven continents, Route 53 will receive some DNS queries from locations that it
       * can't identify. We recommend that you create a resource record set for which the value of
       * `CountryCode` is `*` . Two groups of queries are routed to the resource that you specify in
       * this record: queries that come from locations for which you haven't created geolocation
       * resource record sets and queries from IP addresses that aren't mapped to a location. If you
       * don't create a `*` resource record set, Route 53 returns a "no answer" response for queries
       * from those locations.
       *
       *
       * You can't create non-geolocation resource record sets that have the same values for the
       * `Name` and `Type` elements as geolocation resource record sets.
       */
      override fun geoLocation(geoLocation: GeoLocationProperty) {
        cdkBuilder.geoLocation(geoLocation.let(GeoLocationProperty::unwrap))
      }

      /**
       * @param geoLocation *Geolocation resource record sets only:* A complex type that lets you
       * control how Amazon Route 53 responds to DNS queries based on the geographic origin of the
       * query.
       * For example, if you want all queries from Africa to be routed to a web server with an IP
       * address of `192.0.2.111` , create a resource record set with a `Type` of `A` and a
       * `ContinentCode` of `AF` .
       *
       * If you create separate resource record sets for overlapping geographic regions (for
       * example, one resource record set for a continent and one for a country on the same continent),
       * priority goes to the smallest geographic region. This allows you to route most queries for a
       * continent to one resource and to route queries for a country on that continent to a different
       * resource.
       *
       * You can't create two geolocation resource record sets that specify the same geographic
       * location.
       *
       * The value `*` in the `CountryCode` element matches all geographic locations that aren't
       * specified in other geolocation resource record sets that have the same values for the `Name`
       * and `Type` elements.
       *
       *
       * Geolocation works by mapping IP addresses to locations. However, some IP addresses aren't
       * mapped to geographic locations, so even if you create geolocation resource record sets that
       * cover all seven continents, Route 53 will receive some DNS queries from locations that it
       * can't identify. We recommend that you create a resource record set for which the value of
       * `CountryCode` is `*` . Two groups of queries are routed to the resource that you specify in
       * this record: queries that come from locations for which you haven't created geolocation
       * resource record sets and queries from IP addresses that aren't mapped to a location. If you
       * don't create a `*` resource record set, Route 53 returns a "no answer" response for queries
       * from those locations.
       *
       *
       * You can't create non-geolocation resource record sets that have the same values for the
       * `Name` and `Type` elements as geolocation resource record sets.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("50ec19885adc4a116a32544c092c0acd0fd3577beaf34dacff846f2b171c6006")
      override fun geoLocation(geoLocation: GeoLocationProperty.Builder.() -> Unit): Unit =
          geoLocation(GeoLocationProperty(geoLocation))

      /**
       * @param geoProximityLocation A complex type that contains information about a geographic
       * location.
       */
      override fun geoProximityLocation(geoProximityLocation: IResolvable) {
        cdkBuilder.geoProximityLocation(geoProximityLocation.let(IResolvable::unwrap))
      }

      /**
       * @param geoProximityLocation A complex type that contains information about a geographic
       * location.
       */
      override fun geoProximityLocation(geoProximityLocation: GeoProximityLocationProperty) {
        cdkBuilder.geoProximityLocation(geoProximityLocation.let(GeoProximityLocationProperty::unwrap))
      }

      /**
       * @param geoProximityLocation A complex type that contains information about a geographic
       * location.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("cb7bba9ec85e663409ea69ea66ef74ac4c0cde53214787b6a6c399a7c1946b37")
      override
          fun geoProximityLocation(geoProximityLocation: GeoProximityLocationProperty.Builder.() -> Unit):
          Unit = geoProximityLocation(GeoProximityLocationProperty(geoProximityLocation))

      /**
       * @param healthCheckId If you want Amazon Route 53 to return this resource record set in
       * response to a DNS query only when the status of a health check is healthy, include the
       * `HealthCheckId` element and specify the ID of the applicable health check.
       * Route 53 determines whether a resource record set is healthy based on one of the following:
       *
       * * By periodically sending a request to the endpoint that is specified in the health check
       * * By aggregating the status of a specified group of health checks (calculated health
       * checks)
       * * By determining the current state of a CloudWatch alarm (CloudWatch metric health checks)
       *
       *
       * Route 53 doesn't check the health of the endpoint that is specified in the resource record
       * set, for example, the endpoint specified by the IP address in the `Value` element. When you
       * add a `HealthCheckId` element to a resource record set, Route 53 checks the health of the
       * endpoint that you specified in the health check.
       *
       *
       * For more information, see the following topics in the *Amazon Route 53 Developer Guide* :
       *
       * * [How Amazon Route 53 Determines Whether an Endpoint Is
       * Healthy](https://docs.aws.amazon.com/Route53/latest/DeveloperGuide/dns-failover-determining-health-of-endpoints.html)
       * * [Route 53 Health Checks and DNS
       * Failover](https://docs.aws.amazon.com/Route53/latest/DeveloperGuide/dns-failover.html)
       * * [Configuring Failover in a Private Hosted
       * Zone](https://docs.aws.amazon.com/Route53/latest/DeveloperGuide/dns-failover-private-hosted-zones.html)
       *
       * *When to Specify HealthCheckId*
       *
       * Specifying a value for `HealthCheckId` is useful only when Route 53 is choosing between two
       * or more resource record sets to respond to a DNS query, and you want Route 53 to base the
       * choice in part on the status of a health check. Configuring health checks makes sense only in
       * the following configurations:
       *
       * * *Non-alias resource record sets* : You're checking the health of a group of non-alias
       * resource record sets that have the same routing policy, name, and type (such as multiple
       * weighted records named www.example.com with a type of A) and you specify health check IDs for
       * all the resource record sets.
       *
       * If the health check status for a resource record set is healthy, Route 53 includes the
       * record among the records that it responds to DNS queries with.
       *
       * If the health check status for a resource record set is unhealthy, Route 53 stops
       * responding to DNS queries using the value for that resource record set.
       *
       * If the health check status for all resource record sets in the group is unhealthy, Route 53
       * considers all resource record sets in the group healthy and responds to DNS queries
       * accordingly.
       *
       * * *Alias resource record sets* : You specify the following settings:
       * * You set `EvaluateTargetHealth` to true for an alias resource record set in a group of
       * resource record sets that have the same routing policy, name, and type (such as multiple
       * weighted records named www.example.com with a type of A).
       * * You configure the alias resource record set to route traffic to a non-alias resource
       * record set in the same hosted zone.
       * * You specify a health check ID for the non-alias resource record set.
       *
       * If the health check status is healthy, Route 53 considers the alias resource record set to
       * be healthy and includes the alias record among the records that it responds to DNS queries
       * with.
       *
       * If the health check status is unhealthy, Route 53 stops responding to DNS queries using the
       * alias resource record set.
       *
       *
       * The alias resource record set can also route traffic to a *group* of non-alias resource
       * record sets that have the same routing policy, name, and type. In that configuration,
       * associate health checks with all of the resource record sets in the group of non-alias
       * resource record sets.
       *
       *
       * *Geolocation Routing*
       *
       * For geolocation resource record sets, if an endpoint is unhealthy, Route 53 looks for a
       * resource record set for the larger, associated geographic region. For example, suppose you
       * have resource record sets for a state in the United States, for the entire United States, for
       * North America, and a resource record set that has `*` for `CountryCode` is `*` , which applies
       * to all locations. If the endpoint for the state resource record set is unhealthy, Route 53
       * checks for healthy resource record sets in the following order until it finds a resource
       * record set for which the endpoint is healthy:
       *
       * * The United States
       * * North America
       * * The default resource record set
       *
       * *Specifying the Health Check Endpoint by Domain Name*
       *
       * If your health checks specify the endpoint only by domain name, we recommend that you
       * create a separate health check for each endpoint. For example, create a health check for each
       * `HTTP` server that is serving content for `www.example.com` . For the value of
       * `FullyQualifiedDomainName` , specify the domain name of the server (such as
       * `us-east-2-www.example.com` ), not the name of the resource record sets ( `www.example.com` ).
       *
       *
       * Health check results will be unpredictable if you do the following:
       *
       * * Create a health check that has the same value for `FullyQualifiedDomainName` as the name
       * of a resource record set.
       * * Associate that health check with the resource record set.
       */
      override fun healthCheckId(healthCheckId: String) {
        cdkBuilder.healthCheckId(healthCheckId)
      }

      /**
       * @param hostedZoneId The ID of the hosted zone that you want to create records in.
       * Specify either `HostedZoneName` or `HostedZoneId` , but not both. If you have multiple
       * hosted zones with the same domain name, you must specify the hosted zone using `HostedZoneId`
       * .
       *
       * Do not provide the `HostedZoneId` if it is already defined in
       * `AWS::Route53::RecordSetGroup` . The creation fails if `HostedZoneId` is defined in both.
       */
      override fun hostedZoneId(hostedZoneId: String) {
        cdkBuilder.hostedZoneId(hostedZoneId)
      }

      /**
       * @param hostedZoneName The name of the hosted zone that you want to create records in.
       * You must include a trailing dot (for example, `www.example.com.` ) as part of the
       * `HostedZoneName` .
       *
       * When you create a stack using an `AWS::Route53::RecordSet` that specifies `HostedZoneName`
       * , AWS CloudFormation attempts to find a hosted zone whose name matches the `HostedZoneName` .
       * If AWS CloudFormation can't find a hosted zone with a matching domain name, or if there is
       * more than one hosted zone with the specified domain name, AWS CloudFormation will not create
       * the stack.
       *
       * Specify either `HostedZoneName` or `HostedZoneId` , but not both. If you have multiple
       * hosted zones with the same domain name, you must specify the hosted zone using `HostedZoneId`
       * .
       */
      override fun hostedZoneName(hostedZoneName: String) {
        cdkBuilder.hostedZoneName(hostedZoneName)
      }

      /**
       * @param setIdentifier *Resource record sets that have a routing policy other than simple:*
       * An identifier that differentiates among multiple resource record sets that have the same
       * combination of name and type, such as multiple weighted resource record sets named
       * acme.example.com that have a type of A. In a group of resource record sets that have the same
       * name and type, the value of `SetIdentifier` must be unique for each resource record set.
       * For information about routing policies, see [Choosing a Routing
       * Policy](https://docs.aws.amazon.com/Route53/latest/DeveloperGuide/routing-policy.html) in the
       * *Amazon Route 53 Developer Guide* .
       */
      override fun identifier(setIdentifier: String) {
        cdkBuilder.setIdentifier(setIdentifier)
      }

      /**
       * @param multiValueAnswer *Multivalue answer resource record sets only* : To route traffic
       * approximately randomly to multiple resources, such as web servers, create one multivalue
       * answer record for each resource and specify `true` for `MultiValueAnswer` .
       * Note the following:
       *
       * * If you associate a health check with a multivalue answer resource record set, Amazon
       * Route 53 responds to DNS queries with the corresponding IP address only when the health check
       * is healthy.
       * * If you don't associate a health check with a multivalue answer record, Route 53 always
       * considers the record to be healthy.
       * * Route 53 responds to DNS queries with up to eight healthy records; if you have eight or
       * fewer healthy records, Route 53 responds to all DNS queries with all the healthy records.
       * * If you have more than eight healthy records, Route 53 responds to different DNS resolvers
       * with different combinations of healthy records.
       * * When all records are unhealthy, Route 53 responds to DNS queries with up to eight
       * unhealthy records.
       * * If a resource becomes unavailable after a resolver caches a response, client software
       * typically tries another of the IP addresses in the response.
       *
       * You can't create multivalue answer alias records.
       */
      override fun multiValueAnswer(multiValueAnswer: Boolean) {
        cdkBuilder.multiValueAnswer(multiValueAnswer)
      }

      /**
       * @param multiValueAnswer *Multivalue answer resource record sets only* : To route traffic
       * approximately randomly to multiple resources, such as web servers, create one multivalue
       * answer record for each resource and specify `true` for `MultiValueAnswer` .
       * Note the following:
       *
       * * If you associate a health check with a multivalue answer resource record set, Amazon
       * Route 53 responds to DNS queries with the corresponding IP address only when the health check
       * is healthy.
       * * If you don't associate a health check with a multivalue answer record, Route 53 always
       * considers the record to be healthy.
       * * Route 53 responds to DNS queries with up to eight healthy records; if you have eight or
       * fewer healthy records, Route 53 responds to all DNS queries with all the healthy records.
       * * If you have more than eight healthy records, Route 53 responds to different DNS resolvers
       * with different combinations of healthy records.
       * * When all records are unhealthy, Route 53 responds to DNS queries with up to eight
       * unhealthy records.
       * * If a resource becomes unavailable after a resolver caches a response, client software
       * typically tries another of the IP addresses in the response.
       *
       * You can't create multivalue answer alias records.
       */
      override fun multiValueAnswer(multiValueAnswer: IResolvable) {
        cdkBuilder.multiValueAnswer(multiValueAnswer.let(IResolvable::unwrap))
      }

      /**
       * @param name For `ChangeResourceRecordSets` requests, the name of the record that you want
       * to create, update, or delete. 
       * For `ListResourceRecordSets` responses, the name of a record in the specified hosted zone.
       *
       * *ChangeResourceRecordSets Only*
       *
       * Enter a fully qualified domain name, for example, `www.example.com` . You can optionally
       * include a trailing dot. If you omit the trailing dot, Amazon Route 53 assumes that the domain
       * name that you specify is fully qualified. This means that Route 53 treats `www.example.com`
       * (without a trailing dot) and `www.example.com.` (with a trailing dot) as identical.
       *
       * For information about how to specify characters other than `a-z` , `0-9` , and `-` (hyphen)
       * and how to specify internationalized domain names, see [DNS Domain Name
       * Format](https://docs.aws.amazon.com/Route53/latest/DeveloperGuide/DomainNameFormat.html) in
       * the *Amazon Route 53 Developer Guide* .
       *
       * You can use the asterisk (*) wildcard to replace the leftmost label in a domain name, for
       * example, `*.example.com` . Note the following:
       *
       * * The * must replace the entire label. For example, you can't specify `*prod.example.com`
       * or `prod*.example.com` .
       * * The * can't replace any of the middle labels, for example, marketing.*.example.com.
       * * If you include * in any position other than the leftmost label in a domain name, DNS
       * treats it as an * character (ASCII 42), not as a wildcard.
       *
       *
       * You can't use the * wildcard for resource records sets that have a type of NS.
       */
      override fun name(name: String) {
        cdkBuilder.name(name)
      }

      /**
       * @param region *Latency-based resource record sets only:* The Amazon EC2 Region where you
       * created the resource that this resource record set refers to.
       * The resource typically is an AWS resource, such as an EC2 instance or an ELB load balancer,
       * and is referred to by an IP address or a DNS domain name, depending on the record type.
       *
       * When Amazon Route 53 receives a DNS query for a domain name and type for which you have
       * created latency resource record sets, Route 53 selects the latency resource record set that
       * has the lowest latency between the end user and the associated Amazon EC2 Region. Route 53
       * then returns the value that is associated with the selected resource record set.
       *
       * Note the following:
       *
       * * You can only specify one `ResourceRecord` per latency resource record set.
       * * You can only create one latency resource record set for each Amazon EC2 Region.
       * * You aren't required to create latency resource record sets for all Amazon EC2 Regions.
       * Route 53 will choose the region with the best latency from among the regions that you create
       * latency resource record sets for.
       * * You can't create non-latency resource record sets that have the same values for the
       * `Name` and `Type` elements as latency resource record sets.
       */
      override fun region(region: String) {
        cdkBuilder.region(region)
      }

      /**
       * @param resourceRecords Information about the records that you want to create.
       * Each record should be in the format appropriate for the record type specified by the `Type`
       * property. For information about different record types and their record formats, see [Values
       * That You Specify When You Create or Edit Amazon Route 53
       * Records](https://docs.aws.amazon.com/Route53/latest/DeveloperGuide/resource-record-sets-values.html)
       * in the *Amazon Route 53 Developer Guide* .
       */
      override fun resourceRecords(resourceRecords: List<String>) {
        cdkBuilder.resourceRecords(resourceRecords)
      }

      /**
       * @param resourceRecords Information about the records that you want to create.
       * Each record should be in the format appropriate for the record type specified by the `Type`
       * property. For information about different record types and their record formats, see [Values
       * That You Specify When You Create or Edit Amazon Route 53
       * Records](https://docs.aws.amazon.com/Route53/latest/DeveloperGuide/resource-record-sets-values.html)
       * in the *Amazon Route 53 Developer Guide* .
       */
      override fun resourceRecords(vararg resourceRecords: String): Unit =
          resourceRecords(resourceRecords.toList())

      /**
       * @param ttl The resource record cache time to live (TTL), in seconds. Note the following:.
       * * If you're creating or updating an alias resource record set, omit `TTL` . Amazon Route 53
       * uses the value of `TTL` for the alias target.
       * * If you're associating this resource record set with a health check (if you're adding a
       * `HealthCheckId` element), we recommend that you specify a `TTL` of 60 seconds or less so
       * clients respond quickly to changes in health status.
       * * All of the resource record sets in a group of weighted resource record sets must have the
       * same value for `TTL` .
       * * If a group of weighted resource record sets includes one or more weighted alias resource
       * record sets for which the alias target is an ELB load balancer, we recommend that you specify
       * a `TTL` of 60 seconds for all of the non-alias weighted resource record sets that have the
       * same name and type. Values other than 60 seconds (the TTL for load balancers) will change the
       * effect of the values that you specify for `Weight` .
       */
      override fun ttl(ttl: String) {
        cdkBuilder.ttl(ttl)
      }

      /**
       * @param type The DNS record type. 
       * For information about different record types and how data is encoded for them, see
       * [Supported DNS Resource Record
       * Types](https://docs.aws.amazon.com/Route53/latest/DeveloperGuide/ResourceRecordTypes.html) in
       * the *Amazon Route 53 Developer Guide* .
       *
       * Valid values for basic resource record sets: `A` | `AAAA` | `CAA` | `CNAME` | `DS` | `MX` |
       * `NAPTR` | `NS` | `PTR` | `SOA` | `SPF` | `SRV` | `TXT`
       *
       * Values for weighted, latency, geolocation, and failover resource record sets: `A` | `AAAA`
       * | `CAA` | `CNAME` | `MX` | `NAPTR` | `PTR` | `SPF` | `SRV` | `TXT` . When creating a group of
       * weighted, latency, geolocation, or failover resource record sets, specify the same value for
       * all of the resource record sets in the group.
       *
       * Valid values for multivalue answer resource record sets: `A` | `AAAA` | `MX` | `NAPTR` |
       * `PTR` | `SPF` | `SRV` | `TXT`
       *
       *
       * SPF records were formerly used to verify the identity of the sender of email messages.
       * However, we no longer recommend that you create resource record sets for which the value of
       * `Type` is `SPF` . RFC 7208, *Sender Policy Framework (SPF) for Authorizing Use of Domains in
       * Email, Version 1* , has been updated to say, "...[I]ts existence and mechanism defined in
       * [RFC4408] have led to some interoperability issues. Accordingly, its use is no longer
       * appropriate for SPF version 1; implementations are not to use it." In RFC 7208, see section
       * 14.1, [The SPF DNS Record
       * Type](https://docs.aws.amazon.com/http://tools.ietf.org/html/rfc7208#section-14.1) .
       *
       *
       * Values for alias resource record sets:
       *
       * * *Amazon API Gateway custom regional APIs and edge-optimized APIs:* `A`
       * * *CloudFront distributions:* `A`
       *
       * If IPv6 is enabled for the distribution, create two resource record sets to route traffic
       * to your distribution, one with a value of `A` and one with a value of `AAAA` .
       *
       * * *Amazon API Gateway environment that has a regionalized subdomain* : `A`
       * * *ELB load balancers:* `A` | `AAAA`
       * * *Amazon S3 buckets:* `A`
       * * *Amazon Virtual Private Cloud interface VPC endpoints* `A`
       * * *Another resource record set in this hosted zone:* Specify the type of the resource
       * record set that you're creating the alias for. All values are supported except `NS` and `SOA`
       * .
       *
       *
       * If you're creating an alias record that has the same name as the hosted zone (known as the
       * zone apex), you can't route traffic to a record for which the value of `Type` is `CNAME` .
       * This is because the alias record must have the same type as the record you're routing traffic
       * to, and creating a CNAME record for the zone apex isn't supported even for an alias record.
       */
      override fun type(type: String) {
        cdkBuilder.type(type)
      }

      /**
       * @param weight *Weighted resource record sets only:* Among resource record sets that have
       * the same combination of DNS name and type, a value that determines the proportion of DNS
       * queries that Amazon Route 53 responds to using the current resource record set.
       * Route 53 calculates the sum of the weights for the resource record sets that have the same
       * combination of DNS name and type. Route 53 then responds to queries based on the ratio of a
       * resource's weight to the total. Note the following:
       *
       * * You must specify a value for the `Weight` element for every weighted resource record set.
       * * You can only specify one `ResourceRecord` per weighted resource record set.
       * * You can't create latency, failover, or geolocation resource record sets that have the
       * same values for the `Name` and `Type` elements as weighted resource record sets.
       * * You can create a maximum of 100 weighted resource record sets that have the same values
       * for the `Name` and `Type` elements.
       * * For weighted (but not weighted alias) resource record sets, if you set `Weight` to `0`
       * for a resource record set, Route 53 never responds to queries with the applicable value for
       * that resource record set. However, if you set `Weight` to `0` for all resource record sets
       * that have the same combination of DNS name and type, traffic is routed to all resources with
       * equal probability.
       *
       * The effect of setting `Weight` to `0` is different when you associate health checks with
       * weighted resource record sets. For more information, see [Options for Configuring Route 53
       * Active-Active and Active-Passive
       * Failover](https://docs.aws.amazon.com/Route53/latest/DeveloperGuide/dns-failover-configuring-options.html)
       * in the *Amazon Route 53 Developer Guide* .
       */
      override fun weight(weight: Number) {
        cdkBuilder.weight(weight)
      }

      public fun build():
          software.amazon.awscdk.services.route53.CfnRecordSetGroup.RecordSetProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.route53.CfnRecordSetGroup.RecordSetProperty,
    ) : CdkObject(cdkObject), RecordSetProperty {
      /**
       * *Alias resource record sets only:* Information about the AWS resource, such as a CloudFront
       * distribution or an Amazon S3 bucket, that you want to route traffic to.
       *
       * If you're creating resource records sets for a private hosted zone, note the following:
       *
       * * You can't create an alias resource record set in a private hosted zone to route traffic
       * to a CloudFront distribution.
       * * For information about creating failover resource record sets in a private hosted zone,
       * see [Configuring Failover in a Private Hosted
       * Zone](https://docs.aws.amazon.com/Route53/latest/DeveloperGuide/dns-failover-private-hosted-zones.html)
       * in the *Amazon Route 53 Developer Guide* .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-route53-recordsetgroup-recordset.html#cfn-route53-recordsetgroup-recordset-aliastarget)
       */
      override fun aliasTarget(): Any? = unwrap(this).getAliasTarget()

      /**
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-route53-recordsetgroup-recordset.html#cfn-route53-recordsetgroup-recordset-cidrroutingconfig)
       */
      override fun cidrRoutingConfig(): Any? = unwrap(this).getCidrRoutingConfig()

      /**
       * *Failover resource record sets only:* To configure failover, you add the `Failover` element
       * to two resource record sets.
       *
       * For one resource record set, you specify `PRIMARY` as the value for `Failover` ; for the
       * other resource record set, you specify `SECONDARY` . In addition, you include the
       * `HealthCheckId` element and specify the health check that you want Amazon Route 53 to perform
       * for each resource record set.
       *
       * Except where noted, the following failover behaviors assume that you have included the
       * `HealthCheckId` element in both resource record sets:
       *
       * * When the primary resource record set is healthy, Route 53 responds to DNS queries with
       * the applicable value from the primary resource record set regardless of the health of the
       * secondary resource record set.
       * * When the primary resource record set is unhealthy and the secondary resource record set
       * is healthy, Route 53 responds to DNS queries with the applicable value from the secondary
       * resource record set.
       * * When the secondary resource record set is unhealthy, Route 53 responds to DNS queries
       * with the applicable value from the primary resource record set regardless of the health of the
       * primary resource record set.
       * * If you omit the `HealthCheckId` element for the secondary resource record set, and if the
       * primary resource record set is unhealthy, Route 53 always responds to DNS queries with the
       * applicable value from the secondary resource record set. This is true regardless of the health
       * of the associated endpoint.
       *
       * You can't create non-failover resource record sets that have the same values for the `Name`
       * and `Type` elements as failover resource record sets.
       *
       * For failover alias resource record sets, you must also include the `EvaluateTargetHealth`
       * element and set the value to true.
       *
       * For more information about configuring failover for Route 53, see the following topics in
       * the *Amazon Route 53 Developer Guide* :
       *
       * * [Route 53 Health Checks and DNS
       * Failover](https://docs.aws.amazon.com/Route53/latest/DeveloperGuide/dns-failover.html)
       * * [Configuring Failover in a Private Hosted
       * Zone](https://docs.aws.amazon.com/Route53/latest/DeveloperGuide/dns-failover-private-hosted-zones.html)
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-route53-recordsetgroup-recordset.html#cfn-route53-recordsetgroup-recordset-failover)
       */
      override fun failover(): String? = unwrap(this).getFailover()

      /**
       * *Geolocation resource record sets only:* A complex type that lets you control how Amazon
       * Route 53 responds to DNS queries based on the geographic origin of the query.
       *
       * For example, if you want all queries from Africa to be routed to a web server with an IP
       * address of `192.0.2.111` , create a resource record set with a `Type` of `A` and a
       * `ContinentCode` of `AF` .
       *
       * If you create separate resource record sets for overlapping geographic regions (for
       * example, one resource record set for a continent and one for a country on the same continent),
       * priority goes to the smallest geographic region. This allows you to route most queries for a
       * continent to one resource and to route queries for a country on that continent to a different
       * resource.
       *
       * You can't create two geolocation resource record sets that specify the same geographic
       * location.
       *
       * The value `*` in the `CountryCode` element matches all geographic locations that aren't
       * specified in other geolocation resource record sets that have the same values for the `Name`
       * and `Type` elements.
       *
       *
       * Geolocation works by mapping IP addresses to locations. However, some IP addresses aren't
       * mapped to geographic locations, so even if you create geolocation resource record sets that
       * cover all seven continents, Route 53 will receive some DNS queries from locations that it
       * can't identify. We recommend that you create a resource record set for which the value of
       * `CountryCode` is `*` . Two groups of queries are routed to the resource that you specify in
       * this record: queries that come from locations for which you haven't created geolocation
       * resource record sets and queries from IP addresses that aren't mapped to a location. If you
       * don't create a `*` resource record set, Route 53 returns a "no answer" response for queries
       * from those locations.
       *
       *
       * You can't create non-geolocation resource record sets that have the same values for the
       * `Name` and `Type` elements as geolocation resource record sets.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-route53-recordsetgroup-recordset.html#cfn-route53-recordsetgroup-recordset-geolocation)
       */
      override fun geoLocation(): Any? = unwrap(this).getGeoLocation()

      /**
       * A complex type that contains information about a geographic location.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-route53-recordsetgroup-recordset.html#cfn-route53-recordsetgroup-recordset-geoproximitylocation)
       */
      override fun geoProximityLocation(): Any? = unwrap(this).getGeoProximityLocation()

      /**
       * If you want Amazon Route 53 to return this resource record set in response to a DNS query
       * only when the status of a health check is healthy, include the `HealthCheckId` element and
       * specify the ID of the applicable health check.
       *
       * Route 53 determines whether a resource record set is healthy based on one of the following:
       *
       * * By periodically sending a request to the endpoint that is specified in the health check
       * * By aggregating the status of a specified group of health checks (calculated health
       * checks)
       * * By determining the current state of a CloudWatch alarm (CloudWatch metric health checks)
       *
       *
       * Route 53 doesn't check the health of the endpoint that is specified in the resource record
       * set, for example, the endpoint specified by the IP address in the `Value` element. When you
       * add a `HealthCheckId` element to a resource record set, Route 53 checks the health of the
       * endpoint that you specified in the health check.
       *
       *
       * For more information, see the following topics in the *Amazon Route 53 Developer Guide* :
       *
       * * [How Amazon Route 53 Determines Whether an Endpoint Is
       * Healthy](https://docs.aws.amazon.com/Route53/latest/DeveloperGuide/dns-failover-determining-health-of-endpoints.html)
       * * [Route 53 Health Checks and DNS
       * Failover](https://docs.aws.amazon.com/Route53/latest/DeveloperGuide/dns-failover.html)
       * * [Configuring Failover in a Private Hosted
       * Zone](https://docs.aws.amazon.com/Route53/latest/DeveloperGuide/dns-failover-private-hosted-zones.html)
       *
       * *When to Specify HealthCheckId*
       *
       * Specifying a value for `HealthCheckId` is useful only when Route 53 is choosing between two
       * or more resource record sets to respond to a DNS query, and you want Route 53 to base the
       * choice in part on the status of a health check. Configuring health checks makes sense only in
       * the following configurations:
       *
       * * *Non-alias resource record sets* : You're checking the health of a group of non-alias
       * resource record sets that have the same routing policy, name, and type (such as multiple
       * weighted records named www.example.com with a type of A) and you specify health check IDs for
       * all the resource record sets.
       *
       * If the health check status for a resource record set is healthy, Route 53 includes the
       * record among the records that it responds to DNS queries with.
       *
       * If the health check status for a resource record set is unhealthy, Route 53 stops
       * responding to DNS queries using the value for that resource record set.
       *
       * If the health check status for all resource record sets in the group is unhealthy, Route 53
       * considers all resource record sets in the group healthy and responds to DNS queries
       * accordingly.
       *
       * * *Alias resource record sets* : You specify the following settings:
       * * You set `EvaluateTargetHealth` to true for an alias resource record set in a group of
       * resource record sets that have the same routing policy, name, and type (such as multiple
       * weighted records named www.example.com with a type of A).
       * * You configure the alias resource record set to route traffic to a non-alias resource
       * record set in the same hosted zone.
       * * You specify a health check ID for the non-alias resource record set.
       *
       * If the health check status is healthy, Route 53 considers the alias resource record set to
       * be healthy and includes the alias record among the records that it responds to DNS queries
       * with.
       *
       * If the health check status is unhealthy, Route 53 stops responding to DNS queries using the
       * alias resource record set.
       *
       *
       * The alias resource record set can also route traffic to a *group* of non-alias resource
       * record sets that have the same routing policy, name, and type. In that configuration,
       * associate health checks with all of the resource record sets in the group of non-alias
       * resource record sets.
       *
       *
       * *Geolocation Routing*
       *
       * For geolocation resource record sets, if an endpoint is unhealthy, Route 53 looks for a
       * resource record set for the larger, associated geographic region. For example, suppose you
       * have resource record sets for a state in the United States, for the entire United States, for
       * North America, and a resource record set that has `*` for `CountryCode` is `*` , which applies
       * to all locations. If the endpoint for the state resource record set is unhealthy, Route 53
       * checks for healthy resource record sets in the following order until it finds a resource
       * record set for which the endpoint is healthy:
       *
       * * The United States
       * * North America
       * * The default resource record set
       *
       * *Specifying the Health Check Endpoint by Domain Name*
       *
       * If your health checks specify the endpoint only by domain name, we recommend that you
       * create a separate health check for each endpoint. For example, create a health check for each
       * `HTTP` server that is serving content for `www.example.com` . For the value of
       * `FullyQualifiedDomainName` , specify the domain name of the server (such as
       * `us-east-2-www.example.com` ), not the name of the resource record sets ( `www.example.com` ).
       *
       *
       * Health check results will be unpredictable if you do the following:
       *
       * * Create a health check that has the same value for `FullyQualifiedDomainName` as the name
       * of a resource record set.
       * * Associate that health check with the resource record set.
       *
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-route53-recordsetgroup-recordset.html#cfn-route53-recordsetgroup-recordset-healthcheckid)
       */
      override fun healthCheckId(): String? = unwrap(this).getHealthCheckId()

      /**
       * The ID of the hosted zone that you want to create records in.
       *
       * Specify either `HostedZoneName` or `HostedZoneId` , but not both. If you have multiple
       * hosted zones with the same domain name, you must specify the hosted zone using `HostedZoneId`
       * .
       *
       * Do not provide the `HostedZoneId` if it is already defined in
       * `AWS::Route53::RecordSetGroup` . The creation fails if `HostedZoneId` is defined in both.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-route53-recordsetgroup-recordset.html#cfn-route53-recordsetgroup-recordset-hostedzoneid)
       */
      override fun hostedZoneId(): String? = unwrap(this).getHostedZoneId()

      /**
       * The name of the hosted zone that you want to create records in.
       *
       * You must include a trailing dot (for example, `www.example.com.` ) as part of the
       * `HostedZoneName` .
       *
       * When you create a stack using an `AWS::Route53::RecordSet` that specifies `HostedZoneName`
       * , AWS CloudFormation attempts to find a hosted zone whose name matches the `HostedZoneName` .
       * If AWS CloudFormation can't find a hosted zone with a matching domain name, or if there is
       * more than one hosted zone with the specified domain name, AWS CloudFormation will not create
       * the stack.
       *
       * Specify either `HostedZoneName` or `HostedZoneId` , but not both. If you have multiple
       * hosted zones with the same domain name, you must specify the hosted zone using `HostedZoneId`
       * .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-route53-recordsetgroup-recordset.html#cfn-route53-recordsetgroup-recordset-hostedzonename)
       */
      override fun hostedZoneName(): String? = unwrap(this).getHostedZoneName()

      /**
       * *Multivalue answer resource record sets only* : To route traffic approximately randomly to
       * multiple resources, such as web servers, create one multivalue answer record for each resource
       * and specify `true` for `MultiValueAnswer` .
       *
       * Note the following:
       *
       * * If you associate a health check with a multivalue answer resource record set, Amazon
       * Route 53 responds to DNS queries with the corresponding IP address only when the health check
       * is healthy.
       * * If you don't associate a health check with a multivalue answer record, Route 53 always
       * considers the record to be healthy.
       * * Route 53 responds to DNS queries with up to eight healthy records; if you have eight or
       * fewer healthy records, Route 53 responds to all DNS queries with all the healthy records.
       * * If you have more than eight healthy records, Route 53 responds to different DNS resolvers
       * with different combinations of healthy records.
       * * When all records are unhealthy, Route 53 responds to DNS queries with up to eight
       * unhealthy records.
       * * If a resource becomes unavailable after a resolver caches a response, client software
       * typically tries another of the IP addresses in the response.
       *
       * You can't create multivalue answer alias records.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-route53-recordsetgroup-recordset.html#cfn-route53-recordsetgroup-recordset-multivalueanswer)
       */
      override fun multiValueAnswer(): Any? = unwrap(this).getMultiValueAnswer()

      /**
       * For `ChangeResourceRecordSets` requests, the name of the record that you want to create,
       * update, or delete.
       *
       * For `ListResourceRecordSets` responses, the name of a record in the specified hosted zone.
       *
       * *ChangeResourceRecordSets Only*
       *
       * Enter a fully qualified domain name, for example, `www.example.com` . You can optionally
       * include a trailing dot. If you omit the trailing dot, Amazon Route 53 assumes that the domain
       * name that you specify is fully qualified. This means that Route 53 treats `www.example.com`
       * (without a trailing dot) and `www.example.com.` (with a trailing dot) as identical.
       *
       * For information about how to specify characters other than `a-z` , `0-9` , and `-` (hyphen)
       * and how to specify internationalized domain names, see [DNS Domain Name
       * Format](https://docs.aws.amazon.com/Route53/latest/DeveloperGuide/DomainNameFormat.html) in
       * the *Amazon Route 53 Developer Guide* .
       *
       * You can use the asterisk (*) wildcard to replace the leftmost label in a domain name, for
       * example, `*.example.com` . Note the following:
       *
       * * The * must replace the entire label. For example, you can't specify `*prod.example.com`
       * or `prod*.example.com` .
       * * The * can't replace any of the middle labels, for example, marketing.*.example.com.
       * * If you include * in any position other than the leftmost label in a domain name, DNS
       * treats it as an * character (ASCII 42), not as a wildcard.
       *
       *
       * You can't use the * wildcard for resource records sets that have a type of NS.
       *
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-route53-recordsetgroup-recordset.html#cfn-route53-recordsetgroup-recordset-name)
       */
      override fun name(): String = unwrap(this).getName()

      /**
       * *Latency-based resource record sets only:* The Amazon EC2 Region where you created the
       * resource that this resource record set refers to.
       *
       * The resource typically is an AWS resource, such as an EC2 instance or an ELB load balancer,
       * and is referred to by an IP address or a DNS domain name, depending on the record type.
       *
       * When Amazon Route 53 receives a DNS query for a domain name and type for which you have
       * created latency resource record sets, Route 53 selects the latency resource record set that
       * has the lowest latency between the end user and the associated Amazon EC2 Region. Route 53
       * then returns the value that is associated with the selected resource record set.
       *
       * Note the following:
       *
       * * You can only specify one `ResourceRecord` per latency resource record set.
       * * You can only create one latency resource record set for each Amazon EC2 Region.
       * * You aren't required to create latency resource record sets for all Amazon EC2 Regions.
       * Route 53 will choose the region with the best latency from among the regions that you create
       * latency resource record sets for.
       * * You can't create non-latency resource record sets that have the same values for the
       * `Name` and `Type` elements as latency resource record sets.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-route53-recordsetgroup-recordset.html#cfn-route53-recordsetgroup-recordset-region)
       */
      override fun region(): String? = unwrap(this).getRegion()

      /**
       * Information about the records that you want to create.
       *
       * Each record should be in the format appropriate for the record type specified by the `Type`
       * property. For information about different record types and their record formats, see [Values
       * That You Specify When You Create or Edit Amazon Route 53
       * Records](https://docs.aws.amazon.com/Route53/latest/DeveloperGuide/resource-record-sets-values.html)
       * in the *Amazon Route 53 Developer Guide* .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-route53-recordsetgroup-recordset.html#cfn-route53-recordsetgroup-recordset-resourcerecords)
       */
      override fun resourceRecords(): List<String> = unwrap(this).getResourceRecords() ?:
          emptyList()

      /**
       * *Resource record sets that have a routing policy other than simple:* An identifier that
       * differentiates among multiple resource record sets that have the same combination of name and
       * type, such as multiple weighted resource record sets named acme.example.com that have a type
       * of A. In a group of resource record sets that have the same name and type, the value of
       * `SetIdentifier` must be unique for each resource record set.
       *
       * For information about routing policies, see [Choosing a Routing
       * Policy](https://docs.aws.amazon.com/Route53/latest/DeveloperGuide/routing-policy.html) in the
       * *Amazon Route 53 Developer Guide* .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-route53-recordsetgroup-recordset.html#cfn-route53-recordsetgroup-recordset-setidentifier)
       */
      override fun setIdentifier(): String? = unwrap(this).getSetIdentifier()

      /**
       * The resource record cache time to live (TTL), in seconds. Note the following:.
       *
       * * If you're creating or updating an alias resource record set, omit `TTL` . Amazon Route 53
       * uses the value of `TTL` for the alias target.
       * * If you're associating this resource record set with a health check (if you're adding a
       * `HealthCheckId` element), we recommend that you specify a `TTL` of 60 seconds or less so
       * clients respond quickly to changes in health status.
       * * All of the resource record sets in a group of weighted resource record sets must have the
       * same value for `TTL` .
       * * If a group of weighted resource record sets includes one or more weighted alias resource
       * record sets for which the alias target is an ELB load balancer, we recommend that you specify
       * a `TTL` of 60 seconds for all of the non-alias weighted resource record sets that have the
       * same name and type. Values other than 60 seconds (the TTL for load balancers) will change the
       * effect of the values that you specify for `Weight` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-route53-recordsetgroup-recordset.html#cfn-route53-recordsetgroup-recordset-ttl)
       */
      override fun ttl(): String? = unwrap(this).getTtl()

      /**
       * The DNS record type.
       *
       * For information about different record types and how data is encoded for them, see
       * [Supported DNS Resource Record
       * Types](https://docs.aws.amazon.com/Route53/latest/DeveloperGuide/ResourceRecordTypes.html) in
       * the *Amazon Route 53 Developer Guide* .
       *
       * Valid values for basic resource record sets: `A` | `AAAA` | `CAA` | `CNAME` | `DS` | `MX` |
       * `NAPTR` | `NS` | `PTR` | `SOA` | `SPF` | `SRV` | `TXT`
       *
       * Values for weighted, latency, geolocation, and failover resource record sets: `A` | `AAAA`
       * | `CAA` | `CNAME` | `MX` | `NAPTR` | `PTR` | `SPF` | `SRV` | `TXT` . When creating a group of
       * weighted, latency, geolocation, or failover resource record sets, specify the same value for
       * all of the resource record sets in the group.
       *
       * Valid values for multivalue answer resource record sets: `A` | `AAAA` | `MX` | `NAPTR` |
       * `PTR` | `SPF` | `SRV` | `TXT`
       *
       *
       * SPF records were formerly used to verify the identity of the sender of email messages.
       * However, we no longer recommend that you create resource record sets for which the value of
       * `Type` is `SPF` . RFC 7208, *Sender Policy Framework (SPF) for Authorizing Use of Domains in
       * Email, Version 1* , has been updated to say, "...[I]ts existence and mechanism defined in
       * [RFC4408] have led to some interoperability issues. Accordingly, its use is no longer
       * appropriate for SPF version 1; implementations are not to use it." In RFC 7208, see section
       * 14.1, [The SPF DNS Record
       * Type](https://docs.aws.amazon.com/http://tools.ietf.org/html/rfc7208#section-14.1) .
       *
       *
       * Values for alias resource record sets:
       *
       * * *Amazon API Gateway custom regional APIs and edge-optimized APIs:* `A`
       * * *CloudFront distributions:* `A`
       *
       * If IPv6 is enabled for the distribution, create two resource record sets to route traffic
       * to your distribution, one with a value of `A` and one with a value of `AAAA` .
       *
       * * *Amazon API Gateway environment that has a regionalized subdomain* : `A`
       * * *ELB load balancers:* `A` | `AAAA`
       * * *Amazon S3 buckets:* `A`
       * * *Amazon Virtual Private Cloud interface VPC endpoints* `A`
       * * *Another resource record set in this hosted zone:* Specify the type of the resource
       * record set that you're creating the alias for. All values are supported except `NS` and `SOA`
       * .
       *
       *
       * If you're creating an alias record that has the same name as the hosted zone (known as the
       * zone apex), you can't route traffic to a record for which the value of `Type` is `CNAME` .
       * This is because the alias record must have the same type as the record you're routing traffic
       * to, and creating a CNAME record for the zone apex isn't supported even for an alias record.
       *
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-route53-recordsetgroup-recordset.html#cfn-route53-recordsetgroup-recordset-type)
       */
      override fun type(): String = unwrap(this).getType()

      /**
       * *Weighted resource record sets only:* Among resource record sets that have the same
       * combination of DNS name and type, a value that determines the proportion of DNS queries that
       * Amazon Route 53 responds to using the current resource record set.
       *
       * Route 53 calculates the sum of the weights for the resource record sets that have the same
       * combination of DNS name and type. Route 53 then responds to queries based on the ratio of a
       * resource's weight to the total. Note the following:
       *
       * * You must specify a value for the `Weight` element for every weighted resource record set.
       * * You can only specify one `ResourceRecord` per weighted resource record set.
       * * You can't create latency, failover, or geolocation resource record sets that have the
       * same values for the `Name` and `Type` elements as weighted resource record sets.
       * * You can create a maximum of 100 weighted resource record sets that have the same values
       * for the `Name` and `Type` elements.
       * * For weighted (but not weighted alias) resource record sets, if you set `Weight` to `0`
       * for a resource record set, Route 53 never responds to queries with the applicable value for
       * that resource record set. However, if you set `Weight` to `0` for all resource record sets
       * that have the same combination of DNS name and type, traffic is routed to all resources with
       * equal probability.
       *
       * The effect of setting `Weight` to `0` is different when you associate health checks with
       * weighted resource record sets. For more information, see [Options for Configuring Route 53
       * Active-Active and Active-Passive
       * Failover](https://docs.aws.amazon.com/Route53/latest/DeveloperGuide/dns-failover-configuring-options.html)
       * in the *Amazon Route 53 Developer Guide* .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-route53-recordsetgroup-recordset.html#cfn-route53-recordsetgroup-recordset-weight)
       */
      override fun weight(): Number? = unwrap(this).getWeight()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): RecordSetProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.route53.CfnRecordSetGroup.RecordSetProperty):
          RecordSetProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: RecordSetProperty):
          software.amazon.awscdk.services.route53.CfnRecordSetGroup.RecordSetProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.route53.CfnRecordSetGroup.RecordSetProperty
    }
  }
}
