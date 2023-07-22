@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.medialive

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.common.MapBuilder
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.medialive.CfnInputSecurityGroup
import software.constructs.Construct

@CdkDslMarker
public class CfnInputSecurityGroupDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: CfnInputSecurityGroup.Builder =
      CfnInputSecurityGroup.Builder.create(scope, id)

  private val _whitelistRules: MutableList<Any> = mutableListOf()

  /**
   * A collection of tags for this input security group.
   *
   * Each tag is a key-value pair.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-medialive-inputsecuritygroup.html#cfn-medialive-inputsecuritygroup-tags)
   * @param tags A collection of tags for this input security group. 
   */
  public fun tags(tags: MapBuilder.() -> Unit = {}) {
    val builder = MapBuilder()
    builder.apply(tags)
    cdkBuilder.tags(builder.map)
  }

  /**
   * A collection of tags for this input security group.
   *
   * Each tag is a key-value pair.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-medialive-inputsecuritygroup.html#cfn-medialive-inputsecuritygroup-tags)
   * @param tags A collection of tags for this input security group. 
   */
  public fun tags(tags: Any) {
    cdkBuilder.tags(tags)
  }

  /**
   * The list of IPv4 CIDR addresses to include in the input security group as "allowed" addresses.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-medialive-inputsecuritygroup.html#cfn-medialive-inputsecuritygroup-whitelistrules)
   * @param whitelistRules The list of IPv4 CIDR addresses to include in the input security group as
   * "allowed" addresses. 
   */
  public fun whitelistRules(vararg whitelistRules: Any) {
    _whitelistRules.addAll(listOf(*whitelistRules))
  }

  /**
   * The list of IPv4 CIDR addresses to include in the input security group as "allowed" addresses.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-medialive-inputsecuritygroup.html#cfn-medialive-inputsecuritygroup-whitelistrules)
   * @param whitelistRules The list of IPv4 CIDR addresses to include in the input security group as
   * "allowed" addresses. 
   */
  public fun whitelistRules(whitelistRules: Collection<Any>) {
    _whitelistRules.addAll(whitelistRules)
  }

  /**
   * The list of IPv4 CIDR addresses to include in the input security group as "allowed" addresses.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-medialive-inputsecuritygroup.html#cfn-medialive-inputsecuritygroup-whitelistrules)
   * @param whitelistRules The list of IPv4 CIDR addresses to include in the input security group as
   * "allowed" addresses. 
   */
  public fun whitelistRules(whitelistRules: IResolvable) {
    cdkBuilder.whitelistRules(whitelistRules)
  }

  public fun build(): CfnInputSecurityGroup {
    if(_whitelistRules.isNotEmpty()) cdkBuilder.whitelistRules(_whitelistRules)
    return cdkBuilder.build()
  }
}
