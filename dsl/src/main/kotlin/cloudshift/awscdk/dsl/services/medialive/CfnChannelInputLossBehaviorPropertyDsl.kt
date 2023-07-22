@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.medialive

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.medialive.CfnChannel

/**
 * The configuration of channel behavior when the input is lost.
 *
 * The parent of this entity is GlobalConfiguration.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.medialive.*;
 * InputLossBehaviorProperty inputLossBehaviorProperty = InputLossBehaviorProperty.builder()
 * .blackFrameMsec(123)
 * .inputLossImageColor("inputLossImageColor")
 * .inputLossImageSlate(InputLocationProperty.builder()
 * .passwordParam("passwordParam")
 * .uri("uri")
 * .username("username")
 * .build())
 * .inputLossImageType("inputLossImageType")
 * .repeatFrameMsec(123)
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-medialive-channel-inputlossbehavior.html)
 */
@CdkDslMarker
public class CfnChannelInputLossBehaviorPropertyDsl {
  private val cdkBuilder: CfnChannel.InputLossBehaviorProperty.Builder =
      CfnChannel.InputLossBehaviorProperty.builder()

  /**
   * @param blackFrameMsec On input loss, the number of milliseconds to substitute black into the
   * output before switching to the frame specified by inputLossImageType.
   * A value x, where 0 &lt;= x &lt;= 1,000,000 and a value of 1,000,000, is interpreted as
   * infinite.
   */
  public fun blackFrameMsec(blackFrameMsec: Number) {
    cdkBuilder.blackFrameMsec(blackFrameMsec)
  }

  /**
   * @param inputLossImageColor When the input loss image type is "color," this field specifies the
   * color to use.
   * Value: 6 hex characters that represent the values of RGB.
   */
  public fun inputLossImageColor(inputLossImageColor: String) {
    cdkBuilder.inputLossImageColor(inputLossImageColor)
  }

  /**
   * @param inputLossImageSlate When the input loss image type is "slate," these fields specify the
   * parameters for accessing the slate.
   */
  public fun inputLossImageSlate(inputLossImageSlate: IResolvable) {
    cdkBuilder.inputLossImageSlate(inputLossImageSlate)
  }

  /**
   * @param inputLossImageSlate When the input loss image type is "slate," these fields specify the
   * parameters for accessing the slate.
   */
  public fun inputLossImageSlate(inputLossImageSlate: CfnChannel.InputLocationProperty) {
    cdkBuilder.inputLossImageSlate(inputLossImageSlate)
  }

  /**
   * @param inputLossImageType Indicates whether to substitute a solid color or a slate into the
   * output after the input loss exceeds blackFrameMsec.
   */
  public fun inputLossImageType(inputLossImageType: String) {
    cdkBuilder.inputLossImageType(inputLossImageType)
  }

  /**
   * @param repeatFrameMsec On input loss, the number of milliseconds to repeat the previous picture
   * before substituting black into the output.
   * A value x, where 0 &lt;= x &lt;= 1,000,000 and a value of 1,000,000, is interpreted as
   * infinite.
   */
  public fun repeatFrameMsec(repeatFrameMsec: Number) {
    cdkBuilder.repeatFrameMsec(repeatFrameMsec)
  }

  public fun build(): CfnChannel.InputLossBehaviorProperty = cdkBuilder.build()
}
