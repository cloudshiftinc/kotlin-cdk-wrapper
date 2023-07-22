@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.route53

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.route53.CfnCidrCollectionProps

/**
 * Properties for defining a `CfnCidrCollection`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.route53.*;
 * CfnCidrCollectionProps cfnCidrCollectionProps = CfnCidrCollectionProps.builder()
 * .name("name")
 * // the properties below are optional
 * .locations(List.of(LocationProperty.builder()
 * .cidrList(List.of("cidrList"))
 * .locationName("locationName")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-route53-cidrcollection.html)
 */
@CdkDslMarker
public class CfnCidrCollectionPropsDsl {
  private val cdkBuilder: CfnCidrCollectionProps.Builder = CfnCidrCollectionProps.builder()

  private val _locations: MutableList<Any> = mutableListOf()

  /**
   * @param locations A complex type that contains information about the list of CIDR locations.
   */
  public fun locations(vararg locations: Any) {
    _locations.addAll(listOf(*locations))
  }

  /**
   * @param locations A complex type that contains information about the list of CIDR locations.
   */
  public fun locations(locations: Collection<Any>) {
    _locations.addAll(locations)
  }

  /**
   * @param locations A complex type that contains information about the list of CIDR locations.
   */
  public fun locations(locations: IResolvable) {
    cdkBuilder.locations(locations)
  }

  /**
   * @param name The name of a CIDR collection. 
   */
  public fun name(name: String) {
    cdkBuilder.name(name)
  }

  public fun build(): CfnCidrCollectionProps {
    if(_locations.isNotEmpty()) cdkBuilder.locations(_locations)
    return cdkBuilder.build()
  }
}
