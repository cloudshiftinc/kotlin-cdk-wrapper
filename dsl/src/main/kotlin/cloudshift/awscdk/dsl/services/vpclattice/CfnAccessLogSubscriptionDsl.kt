@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.vpclattice

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.dsl.CfnTagDsl
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.services.vpclattice.CfnAccessLogSubscription
import software.constructs.Construct

/**
 * Enables access logs to be sent to Amazon CloudWatch, Amazon S3, and Amazon Kinesis Data Firehose.
 *
 * The service network owner can use the access logs to audit the services in the network. The
 * service network owner will only see access logs from clients and services that are associated with
 * their service network. Access log entries represent traffic originated from VPCs associated with
 * that network. For more information, see [Access
 * logs](https://docs.aws.amazon.com/vpc-lattice/latest/ug/monitoring-access-logs.html) in the *Amazon
 * VPC Lattice User Guide* .
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.vpclattice.*;
 * CfnAccessLogSubscription cfnAccessLogSubscription = CfnAccessLogSubscription.Builder.create(this,
 * "MyCfnAccessLogSubscription")
 * .destinationArn("destinationArn")
 * // the properties below are optional
 * .resourceIdentifier("resourceIdentifier")
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-vpclattice-accesslogsubscription.html)
 */
@CdkDslMarker
public class CfnAccessLogSubscriptionDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: CfnAccessLogSubscription.Builder =
      CfnAccessLogSubscription.Builder.create(scope, id)

  private val _tags: MutableList<CfnTag> = mutableListOf()

  /**
   * The Amazon Resource Name (ARN) of the destination.
   *
   * The supported destination types are CloudWatch Log groups, Kinesis Data Firehose delivery
   * streams, and Amazon S3 buckets.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-vpclattice-accesslogsubscription.html#cfn-vpclattice-accesslogsubscription-destinationarn)
   * @param destinationArn The Amazon Resource Name (ARN) of the destination. 
   */
  public fun destinationArn(destinationArn: String) {
    cdkBuilder.destinationArn(destinationArn)
  }

  /**
   * The ID or Amazon Resource Name (ARN) of the service network or service.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-vpclattice-accesslogsubscription.html#cfn-vpclattice-accesslogsubscription-resourceidentifier)
   * @param resourceIdentifier The ID or Amazon Resource Name (ARN) of the service network or
   * service. 
   */
  public fun resourceIdentifier(resourceIdentifier: String) {
    cdkBuilder.resourceIdentifier(resourceIdentifier)
  }

  /**
   * The tags for the access log subscription.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-vpclattice-accesslogsubscription.html#cfn-vpclattice-accesslogsubscription-tags)
   * @param tags The tags for the access log subscription. 
   */
  public fun tags(tags: CfnTagDsl.() -> Unit) {
    _tags.add(CfnTagDsl().apply(tags).build())
  }

  /**
   * The tags for the access log subscription.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-vpclattice-accesslogsubscription.html#cfn-vpclattice-accesslogsubscription-tags)
   * @param tags The tags for the access log subscription. 
   */
  public fun tags(tags: Collection<CfnTag>) {
    _tags.addAll(tags)
  }

  public fun build(): CfnAccessLogSubscription {
    if(_tags.isNotEmpty()) cdkBuilder.tags(_tags)
    return cdkBuilder.build()
  }
}
