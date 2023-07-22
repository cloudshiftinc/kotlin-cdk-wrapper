@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.route53

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.route53.CfnRecordSetGroupProps

@CdkDslMarker
public class CfnRecordSetGroupPropsDsl {
  private val cdkBuilder: CfnRecordSetGroupProps.Builder = CfnRecordSetGroupProps.builder()

  private val _recordSets: MutableList<Any> = mutableListOf()

  /**
   * @param comment *Optional:* Any comments you want to include about a change batch request.
   */
  public fun comment(comment: String) {
    cdkBuilder.comment(comment)
  }

  /**
   * @param hostedZoneId The ID of the hosted zone that you want to create records in.
   * Specify either `HostedZoneName` or `HostedZoneId` , but not both. If you have multiple hosted
   * zones with the same domain name, you must specify the hosted zone using `HostedZoneId` .
   */
  public fun hostedZoneId(hostedZoneId: String) {
    cdkBuilder.hostedZoneId(hostedZoneId)
  }

  /**
   * @param hostedZoneName The name of the hosted zone that you want to create records in.
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
   */
  public fun hostedZoneName(hostedZoneName: String) {
    cdkBuilder.hostedZoneName(hostedZoneName)
  }

  /**
   * @param recordSets A complex type that contains one `RecordSet` element for each record that you
   * want to create.
   */
  public fun recordSets(vararg recordSets: Any) {
    _recordSets.addAll(listOf(*recordSets))
  }

  /**
   * @param recordSets A complex type that contains one `RecordSet` element for each record that you
   * want to create.
   */
  public fun recordSets(recordSets: Collection<Any>) {
    _recordSets.addAll(recordSets)
  }

  /**
   * @param recordSets A complex type that contains one `RecordSet` element for each record that you
   * want to create.
   */
  public fun recordSets(recordSets: IResolvable) {
    cdkBuilder.recordSets(recordSets)
  }

  public fun build(): CfnRecordSetGroupProps {
    if(_recordSets.isNotEmpty()) cdkBuilder.recordSets(_recordSets)
    return cdkBuilder.build()
  }
}
