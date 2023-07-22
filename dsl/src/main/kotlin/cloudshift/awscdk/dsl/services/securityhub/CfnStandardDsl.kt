@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.securityhub

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.securityhub.CfnStandard
import software.constructs.Construct

@CdkDslMarker
public class CfnStandardDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: CfnStandard.Builder = CfnStandard.Builder.create(scope, id)

  private val _disabledStandardsControls: MutableList<Any> = mutableListOf()

  /**
   * Specifies which controls are to be disabled in a standard.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-securityhub-standard.html#cfn-securityhub-standard-disabledstandardscontrols)
   * @param disabledStandardsControls Specifies which controls are to be disabled in a standard. 
   */
  public fun disabledStandardsControls(vararg disabledStandardsControls: Any) {
    _disabledStandardsControls.addAll(listOf(*disabledStandardsControls))
  }

  /**
   * Specifies which controls are to be disabled in a standard.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-securityhub-standard.html#cfn-securityhub-standard-disabledstandardscontrols)
   * @param disabledStandardsControls Specifies which controls are to be disabled in a standard. 
   */
  public fun disabledStandardsControls(disabledStandardsControls: Collection<Any>) {
    _disabledStandardsControls.addAll(disabledStandardsControls)
  }

  /**
   * Specifies which controls are to be disabled in a standard.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-securityhub-standard.html#cfn-securityhub-standard-disabledstandardscontrols)
   * @param disabledStandardsControls Specifies which controls are to be disabled in a standard. 
   */
  public fun disabledStandardsControls(disabledStandardsControls: IResolvable) {
    cdkBuilder.disabledStandardsControls(disabledStandardsControls)
  }

  /**
   * The ARN of the standard that you want to enable.
   *
   * To view a list of available Security Hub standards and their ARNs, use the
   * [`DescribeStandards`](https://docs.aws.amazon.com/securityhub/1.0/APIReference/API_DescribeStandards.html)
   * API operation.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-securityhub-standard.html#cfn-securityhub-standard-standardsarn)
   * @param standardsArn The ARN of the standard that you want to enable. 
   */
  public fun standardsArn(standardsArn: String) {
    cdkBuilder.standardsArn(standardsArn)
  }

  public fun build(): CfnStandard {
    if(_disabledStandardsControls.isNotEmpty())
        cdkBuilder.disabledStandardsControls(_disabledStandardsControls)
    return cdkBuilder.build()
  }
}
