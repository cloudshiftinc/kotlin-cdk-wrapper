@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.vpclattice

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.dsl.CfnTagDsl
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.services.vpclattice.CfnAccessLogSubscriptionProps

@CdkDslMarker
public class CfnAccessLogSubscriptionPropsDsl {
  private val cdkBuilder: CfnAccessLogSubscriptionProps.Builder =
      CfnAccessLogSubscriptionProps.builder()

  private val _tags: MutableList<CfnTag> = mutableListOf()

  /**
   * @param destinationArn The Amazon Resource Name (ARN) of the destination. 
   * The supported destination types are CloudWatch Log groups, Kinesis Data Firehose delivery
   * streams, and Amazon S3 buckets.
   */
  public fun destinationArn(destinationArn: String) {
    cdkBuilder.destinationArn(destinationArn)
  }

  /**
   * @param resourceIdentifier The ID or Amazon Resource Name (ARN) of the service network or
   * service.
   */
  public fun resourceIdentifier(resourceIdentifier: String) {
    cdkBuilder.resourceIdentifier(resourceIdentifier)
  }

  /**
   * @param tags The tags for the access log subscription.
   */
  public fun tags(tags: CfnTagDsl.() -> Unit) {
    _tags.add(CfnTagDsl().apply(tags).build())
  }

  /**
   * @param tags The tags for the access log subscription.
   */
  public fun tags(tags: Collection<CfnTag>) {
    _tags.addAll(tags)
  }

  public fun build(): CfnAccessLogSubscriptionProps {
    if(_tags.isNotEmpty()) cdkBuilder.tags(_tags)
    return cdkBuilder.build()
  }
}
