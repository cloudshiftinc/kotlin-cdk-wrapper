@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.waf.regional

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.waf.regional.CfnGeoMatchSet
import software.constructs.Construct

@CdkDslMarker
public class CfnGeoMatchSetDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: CfnGeoMatchSet.Builder = CfnGeoMatchSet.Builder.create(scope, id)

  private val _geoMatchConstraints: MutableList<Any> = mutableListOf()

  /**
   * An array of `GeoMatchConstraint` objects, which contain the country that you want AWS WAF to
   * search for.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wafregional-geomatchset.html#cfn-wafregional-geomatchset-geomatchconstraints)
   * @param geoMatchConstraints An array of `GeoMatchConstraint` objects, which contain the country
   * that you want AWS WAF to search for. 
   */
  public fun geoMatchConstraints(vararg geoMatchConstraints: Any) {
    _geoMatchConstraints.addAll(listOf(*geoMatchConstraints))
  }

  /**
   * An array of `GeoMatchConstraint` objects, which contain the country that you want AWS WAF to
   * search for.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wafregional-geomatchset.html#cfn-wafregional-geomatchset-geomatchconstraints)
   * @param geoMatchConstraints An array of `GeoMatchConstraint` objects, which contain the country
   * that you want AWS WAF to search for. 
   */
  public fun geoMatchConstraints(geoMatchConstraints: Collection<Any>) {
    _geoMatchConstraints.addAll(geoMatchConstraints)
  }

  /**
   * An array of `GeoMatchConstraint` objects, which contain the country that you want AWS WAF to
   * search for.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wafregional-geomatchset.html#cfn-wafregional-geomatchset-geomatchconstraints)
   * @param geoMatchConstraints An array of `GeoMatchConstraint` objects, which contain the country
   * that you want AWS WAF to search for. 
   */
  public fun geoMatchConstraints(geoMatchConstraints: IResolvable) {
    cdkBuilder.geoMatchConstraints(geoMatchConstraints)
  }

  /**
   * A friendly name or description of the `GeoMatchSet` .
   *
   * You can't change the name of an `GeoMatchSet` after you create it.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wafregional-geomatchset.html#cfn-wafregional-geomatchset-name)
   * @param name A friendly name or description of the `GeoMatchSet` . 
   */
  public fun name(name: String) {
    cdkBuilder.name(name)
  }

  public fun build(): CfnGeoMatchSet {
    if(_geoMatchConstraints.isNotEmpty()) cdkBuilder.geoMatchConstraints(_geoMatchConstraints)
    return cdkBuilder.build()
  }
}
