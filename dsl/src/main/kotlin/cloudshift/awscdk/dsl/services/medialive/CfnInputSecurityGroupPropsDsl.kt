@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.medialive

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.common.MapBuilder
import kotlin.Any
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.medialive.CfnInputSecurityGroupProps

@CdkDslMarker
public class CfnInputSecurityGroupPropsDsl {
  private val cdkBuilder: CfnInputSecurityGroupProps.Builder = CfnInputSecurityGroupProps.builder()

  private val _whitelistRules: MutableList<Any> = mutableListOf()

  /**
   * @param tags A collection of tags for this input security group.
   * Each tag is a key-value pair.
   */
  public fun tags(tags: MapBuilder.() -> Unit = {}) {
    val builder = MapBuilder()
    builder.apply(tags)
    cdkBuilder.tags(builder.map)
  }

  /**
   * @param tags A collection of tags for this input security group.
   * Each tag is a key-value pair.
   */
  public fun tags(tags: Any) {
    cdkBuilder.tags(tags)
  }

  /**
   * @param whitelistRules The list of IPv4 CIDR addresses to include in the input security group as
   * "allowed" addresses.
   */
  public fun whitelistRules(vararg whitelistRules: Any) {
    _whitelistRules.addAll(listOf(*whitelistRules))
  }

  /**
   * @param whitelistRules The list of IPv4 CIDR addresses to include in the input security group as
   * "allowed" addresses.
   */
  public fun whitelistRules(whitelistRules: Collection<Any>) {
    _whitelistRules.addAll(whitelistRules)
  }

  /**
   * @param whitelistRules The list of IPv4 CIDR addresses to include in the input security group as
   * "allowed" addresses.
   */
  public fun whitelistRules(whitelistRules: IResolvable) {
    cdkBuilder.whitelistRules(whitelistRules)
  }

  public fun build(): CfnInputSecurityGroupProps {
    if(_whitelistRules.isNotEmpty()) cdkBuilder.whitelistRules(_whitelistRules)
    return cdkBuilder.build()
  }
}
