@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.waf

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.waf.CfnSizeConstraintSet
import software.constructs.Construct

@CdkDslMarker
public class CfnSizeConstraintSetDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: CfnSizeConstraintSet.Builder = CfnSizeConstraintSet.Builder.create(scope,
      id)

  private val _sizeConstraints: MutableList<Any> = mutableListOf()

  /**
   * The name, if any, of the `SizeConstraintSet` .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-waf-sizeconstraintset.html#cfn-waf-sizeconstraintset-name)
   * @param name The name, if any, of the `SizeConstraintSet` . 
   */
  public fun name(name: String) {
    cdkBuilder.name(name)
  }

  /**
   * The size constraint and the part of the web request to check.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-waf-sizeconstraintset.html#cfn-waf-sizeconstraintset-sizeconstraints)
   * @param sizeConstraints The size constraint and the part of the web request to check. 
   */
  public fun sizeConstraints(vararg sizeConstraints: Any) {
    _sizeConstraints.addAll(listOf(*sizeConstraints))
  }

  /**
   * The size constraint and the part of the web request to check.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-waf-sizeconstraintset.html#cfn-waf-sizeconstraintset-sizeconstraints)
   * @param sizeConstraints The size constraint and the part of the web request to check. 
   */
  public fun sizeConstraints(sizeConstraints: Collection<Any>) {
    _sizeConstraints.addAll(sizeConstraints)
  }

  /**
   * The size constraint and the part of the web request to check.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-waf-sizeconstraintset.html#cfn-waf-sizeconstraintset-sizeconstraints)
   * @param sizeConstraints The size constraint and the part of the web request to check. 
   */
  public fun sizeConstraints(sizeConstraints: IResolvable) {
    cdkBuilder.sizeConstraints(sizeConstraints)
  }

  public fun build(): CfnSizeConstraintSet {
    if(_sizeConstraints.isNotEmpty()) cdkBuilder.sizeConstraints(_sizeConstraints)
    return cdkBuilder.build()
  }
}
