@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnAnalysis

/**
 * The options that determine the presentation of the data labels.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.quicksight.*;
 * DataLabelOptionsProperty dataLabelOptionsProperty = DataLabelOptionsProperty.builder()
 * .categoryLabelVisibility("categoryLabelVisibility")
 * .dataLabelTypes(List.of(DataLabelTypeProperty.builder()
 * .dataPathLabelType(DataPathLabelTypeProperty.builder()
 * .fieldId("fieldId")
 * .fieldValue("fieldValue")
 * .visibility("visibility")
 * .build())
 * .fieldLabelType(FieldLabelTypeProperty.builder()
 * .fieldId("fieldId")
 * .visibility("visibility")
 * .build())
 * .maximumLabelType(MaximumLabelTypeProperty.builder()
 * .visibility("visibility")
 * .build())
 * .minimumLabelType(MinimumLabelTypeProperty.builder()
 * .visibility("visibility")
 * .build())
 * .rangeEndsLabelType(RangeEndsLabelTypeProperty.builder()
 * .visibility("visibility")
 * .build())
 * .build()))
 * .labelColor("labelColor")
 * .labelContent("labelContent")
 * .labelFontConfiguration(FontConfigurationProperty.builder()
 * .fontColor("fontColor")
 * .fontDecoration("fontDecoration")
 * .fontSize(FontSizeProperty.builder()
 * .relative("relative")
 * .build())
 * .fontStyle("fontStyle")
 * .fontWeight(FontWeightProperty.builder()
 * .name("name")
 * .build())
 * .build())
 * .measureLabelVisibility("measureLabelVisibility")
 * .overlap("overlap")
 * .position("position")
 * .totalsVisibility("totalsVisibility")
 * .visibility("visibility")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-analysis-datalabeloptions.html)
 */
@CdkDslMarker
public class CfnAnalysisDataLabelOptionsPropertyDsl {
  private val cdkBuilder: CfnAnalysis.DataLabelOptionsProperty.Builder =
      CfnAnalysis.DataLabelOptionsProperty.builder()

  private val _dataLabelTypes: MutableList<Any> = mutableListOf()

  /**
   * @param categoryLabelVisibility Determines the visibility of the category field labels.
   */
  public fun categoryLabelVisibility(categoryLabelVisibility: String) {
    cdkBuilder.categoryLabelVisibility(categoryLabelVisibility)
  }

  /**
   * @param dataLabelTypes The option that determines the data label type.
   */
  public fun dataLabelTypes(vararg dataLabelTypes: Any) {
    _dataLabelTypes.addAll(listOf(*dataLabelTypes))
  }

  /**
   * @param dataLabelTypes The option that determines the data label type.
   */
  public fun dataLabelTypes(dataLabelTypes: Collection<Any>) {
    _dataLabelTypes.addAll(dataLabelTypes)
  }

  /**
   * @param dataLabelTypes The option that determines the data label type.
   */
  public fun dataLabelTypes(dataLabelTypes: IResolvable) {
    cdkBuilder.dataLabelTypes(dataLabelTypes)
  }

  /**
   * @param labelColor Determines the color of the data labels.
   */
  public fun labelColor(labelColor: String) {
    cdkBuilder.labelColor(labelColor)
  }

  /**
   * @param labelContent Determines the content of the data labels.
   */
  public fun labelContent(labelContent: String) {
    cdkBuilder.labelContent(labelContent)
  }

  /**
   * @param labelFontConfiguration Determines the font configuration of the data labels.
   */
  public fun labelFontConfiguration(labelFontConfiguration: IResolvable) {
    cdkBuilder.labelFontConfiguration(labelFontConfiguration)
  }

  /**
   * @param labelFontConfiguration Determines the font configuration of the data labels.
   */
  public fun labelFontConfiguration(labelFontConfiguration: CfnAnalysis.FontConfigurationProperty) {
    cdkBuilder.labelFontConfiguration(labelFontConfiguration)
  }

  /**
   * @param measureLabelVisibility Determines the visibility of the measure field labels.
   */
  public fun measureLabelVisibility(measureLabelVisibility: String) {
    cdkBuilder.measureLabelVisibility(measureLabelVisibility)
  }

  /**
   * @param overlap Determines whether overlap is enabled or disabled for the data labels.
   */
  public fun overlap(overlap: String) {
    cdkBuilder.overlap(overlap)
  }

  /**
   * @param position Determines the position of the data labels.
   */
  public fun position(position: String) {
    cdkBuilder.position(position)
  }

  /**
   * @param totalsVisibility Determines the visibility of the total.
   */
  public fun totalsVisibility(totalsVisibility: String) {
    cdkBuilder.totalsVisibility(totalsVisibility)
  }

  /**
   * @param visibility Determines the visibility of the data labels.
   */
  public fun visibility(visibility: String) {
    cdkBuilder.visibility(visibility)
  }

  public fun build(): CfnAnalysis.DataLabelOptionsProperty {
    if(_dataLabelTypes.isNotEmpty()) cdkBuilder.dataLabelTypes(_dataLabelTypes)
    return cdkBuilder.build()
  }
}
