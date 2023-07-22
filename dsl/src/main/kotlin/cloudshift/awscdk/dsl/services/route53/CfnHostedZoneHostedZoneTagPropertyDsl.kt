@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.route53

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.route53.CfnHostedZone

/**
 * A complex type that contains information about a tag that you want to add or edit for the
 * specified health check or hosted zone.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.route53.*;
 * HostedZoneTagProperty hostedZoneTagProperty = HostedZoneTagProperty.builder()
 * .key("key")
 * .value("value")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-route53-hostedzone-hostedzonetag.html)
 */
@CdkDslMarker
public class CfnHostedZoneHostedZoneTagPropertyDsl {
  private val cdkBuilder: CfnHostedZone.HostedZoneTagProperty.Builder =
      CfnHostedZone.HostedZoneTagProperty.builder()

  /**
   * @param key The value of `Key` depends on the operation that you want to perform:. 
   * * *Add a tag to a health check or hosted zone* : `Key` is the name that you want to give the
   * new tag.
   * * *Edit a tag* : `Key` is the name of the tag that you want to change the `Value` for.
   * * *Delete a key* : `Key` is the name of the tag you want to remove.
   * * *Give a name to a health check* : Edit the default `Name` tag. In the Amazon Route 53
   * console, the list of your health checks includes a *Name* column that lets you see the name that
   * you've given to each health check.
   */
  public fun key(key: String) {
    cdkBuilder.key(key)
  }

  /**
   * @param value The value of `Value` depends on the operation that you want to perform:. 
   * * *Add a tag to a health check or hosted zone* : `Value` is the value that you want to give the
   * new tag.
   * * *Edit a tag* : `Value` is the new value that you want to assign the tag.
   */
  public fun `value`(`value`: String) {
    cdkBuilder.`value`(`value`)
  }

  public fun build(): CfnHostedZone.HostedZoneTagProperty = cdkBuilder.build()
}
