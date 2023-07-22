@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.securityhub

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.securityhub.CfnStandardProps

/**
 * Properties for defining a `CfnStandard`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.securityhub.*;
 * CfnStandardProps cfnStandardProps = CfnStandardProps.builder()
 * .standardsArn("standardsArn")
 * // the properties below are optional
 * .disabledStandardsControls(List.of(StandardsControlProperty.builder()
 * .standardsControlArn("standardsControlArn")
 * // the properties below are optional
 * .reason("reason")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-securityhub-standard.html)
 */
@CdkDslMarker
public class CfnStandardPropsDsl {
  private val cdkBuilder: CfnStandardProps.Builder = CfnStandardProps.builder()

  private val _disabledStandardsControls: MutableList<Any> = mutableListOf()

  /**
   * @param disabledStandardsControls Specifies which controls are to be disabled in a standard.
   */
  public fun disabledStandardsControls(vararg disabledStandardsControls: Any) {
    _disabledStandardsControls.addAll(listOf(*disabledStandardsControls))
  }

  /**
   * @param disabledStandardsControls Specifies which controls are to be disabled in a standard.
   */
  public fun disabledStandardsControls(disabledStandardsControls: Collection<Any>) {
    _disabledStandardsControls.addAll(disabledStandardsControls)
  }

  /**
   * @param disabledStandardsControls Specifies which controls are to be disabled in a standard.
   */
  public fun disabledStandardsControls(disabledStandardsControls: IResolvable) {
    cdkBuilder.disabledStandardsControls(disabledStandardsControls)
  }

  /**
   * @param standardsArn The ARN of the standard that you want to enable. 
   * To view a list of available Security Hub standards and their ARNs, use the
   * [`DescribeStandards`](https://docs.aws.amazon.com/securityhub/1.0/APIReference/API_DescribeStandards.html)
   * API operation.
   */
  public fun standardsArn(standardsArn: String) {
    cdkBuilder.standardsArn(standardsArn)
  }

  public fun build(): CfnStandardProps {
    if(_disabledStandardsControls.isNotEmpty())
        cdkBuilder.disabledStandardsControls(_disabledStandardsControls)
    return cdkBuilder.build()
  }
}
