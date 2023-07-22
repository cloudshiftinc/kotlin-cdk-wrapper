@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnTemplate

/**
 * The values that are displayed in a control can be configured to only show values that are valid
 * based on what's selected in other controls.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.quicksight.*;
 * CascadingControlConfigurationProperty cascadingControlConfigurationProperty =
 * CascadingControlConfigurationProperty.builder()
 * .sourceControls(List.of(CascadingControlSourceProperty.builder()
 * .columnToMatch(ColumnIdentifierProperty.builder()
 * .columnName("columnName")
 * .dataSetIdentifier("dataSetIdentifier")
 * .build())
 * .sourceSheetControlId("sourceSheetControlId")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-template-cascadingcontrolconfiguration.html)
 */
@CdkDslMarker
public class CfnTemplateCascadingControlConfigurationPropertyDsl {
  private val cdkBuilder: CfnTemplate.CascadingControlConfigurationProperty.Builder =
      CfnTemplate.CascadingControlConfigurationProperty.builder()

  private val _sourceControls: MutableList<Any> = mutableListOf()

  /**
   * @param sourceControls A list of source controls that determine the values that are used in the
   * current control.
   */
  public fun sourceControls(vararg sourceControls: Any) {
    _sourceControls.addAll(listOf(*sourceControls))
  }

  /**
   * @param sourceControls A list of source controls that determine the values that are used in the
   * current control.
   */
  public fun sourceControls(sourceControls: Collection<Any>) {
    _sourceControls.addAll(sourceControls)
  }

  /**
   * @param sourceControls A list of source controls that determine the values that are used in the
   * current control.
   */
  public fun sourceControls(sourceControls: IResolvable) {
    cdkBuilder.sourceControls(sourceControls)
  }

  public fun build(): CfnTemplate.CascadingControlConfigurationProperty {
    if(_sourceControls.isNotEmpty()) cdkBuilder.sourceControls(_sourceControls)
    return cdkBuilder.build()
  }
}
