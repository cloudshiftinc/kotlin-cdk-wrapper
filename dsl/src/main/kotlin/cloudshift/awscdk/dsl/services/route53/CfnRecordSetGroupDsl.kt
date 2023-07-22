@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.route53

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.route53.CfnRecordSetGroup
import software.constructs.Construct

/**
 * A complex type that contains an optional comment, the name and ID of the hosted zone that you
 * want to make changes in, and values for the records that you want to create.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.route53.*;
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
@CdkDslMarker
public class CfnRecordSetGroupDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: CfnRecordSetGroup.Builder = CfnRecordSetGroup.Builder.create(scope, id)

  private val _recordSets: MutableList<Any> = mutableListOf()

  /**
   * *Optional:* Any comments you want to include about a change batch request.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-route53-recordsetgroup.html#cfn-route53-recordsetgroup-comment)
   * @param comment *Optional:* Any comments you want to include about a change batch request. 
   */
  public fun comment(comment: String) {
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
  public fun hostedZoneId(hostedZoneId: String) {
    cdkBuilder.hostedZoneId(hostedZoneId)
  }

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
   * @param hostedZoneName The name of the hosted zone that you want to create records in. 
   */
  public fun hostedZoneName(hostedZoneName: String) {
    cdkBuilder.hostedZoneName(hostedZoneName)
  }

  /**
   * A complex type that contains one `RecordSet` element for each record that you want to create.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-route53-recordsetgroup.html#cfn-route53-recordsetgroup-recordsets)
   * @param recordSets A complex type that contains one `RecordSet` element for each record that you
   * want to create. 
   */
  public fun recordSets(vararg recordSets: Any) {
    _recordSets.addAll(listOf(*recordSets))
  }

  /**
   * A complex type that contains one `RecordSet` element for each record that you want to create.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-route53-recordsetgroup.html#cfn-route53-recordsetgroup-recordsets)
   * @param recordSets A complex type that contains one `RecordSet` element for each record that you
   * want to create. 
   */
  public fun recordSets(recordSets: Collection<Any>) {
    _recordSets.addAll(recordSets)
  }

  /**
   * A complex type that contains one `RecordSet` element for each record that you want to create.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-route53-recordsetgroup.html#cfn-route53-recordsetgroup-recordsets)
   * @param recordSets A complex type that contains one `RecordSet` element for each record that you
   * want to create. 
   */
  public fun recordSets(recordSets: IResolvable) {
    cdkBuilder.recordSets(recordSets)
  }

  public fun build(): CfnRecordSetGroup {
    if(_recordSets.isNotEmpty()) cdkBuilder.recordSets(_recordSets)
    return cdkBuilder.build()
  }
}
