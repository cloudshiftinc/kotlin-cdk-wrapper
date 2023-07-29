@file:Suppress(
    "RedundantVisibilityModifier",
    "RedundantUnitReturnType",
    "RemoveRedundantQualifierName",
    "unused",
    "UnusedImport",
    "ClassName",
    "REDUNDANT_PROJECTION",
    "DEPRECATION"
)

package cloudshift.awscdk.dsl.services.medialive

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import software.amazon.awscdk.services.medialive.CfnChannel

/**
 * Settings to configure the caption rectangle for an output captions that will be created using
 * this Teletext source captions.
 *
 * The parent of this entity is TeletextSourceSettings.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.medialive.*;
 * CaptionRectangleProperty captionRectangleProperty = CaptionRectangleProperty.builder()
 * .height(123)
 * .leftOffset(123)
 * .topOffset(123)
 * .width(123)
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-medialive-channel-captionrectangle.html)
 */
@CdkDslMarker
public class CfnChannelCaptionRectanglePropertyDsl {
    private val cdkBuilder: CfnChannel.CaptionRectangleProperty.Builder =
        CfnChannel.CaptionRectangleProperty.builder()

    /**
     * @param height See the description in leftOffset. For height, specify the entire height of the
     *   rectangle as a percentage of the underlying frame height. For example, "80" means the
     *   rectangle height is 80% of the underlying frame height. The topOffset and rectangleHeight
     *   must add up to 100% or less. This field corresponds to tts:extent - Y in the TTML standard.
     */
    public fun height(height: Number) {
        cdkBuilder.height(height)
    }

    /**
     * @param leftOffset Applies only if you plan to convert these source captions to EBU-TT-D or
     *   TTML in an output. (Make sure to leave the default if you don't have either of these
     *   formats in the output.) You can define a display rectangle for the captions that is smaller
     *   than the underlying video frame. You define the rectangle by specifying the position of the
     *   left edge, top edge, bottom edge, and right edge of the rectangle, all within the
     *   underlying video frame. The units for the measurements are percentages. If you specify a
     *   value for one of these fields, you must specify a value for all of them.
     *
     * For leftOffset, specify the position of the left edge of the rectangle, as a percentage of
     * the underlying frame width, and relative to the left edge of the frame. For example, "10"
     * means the measurement is 10% of the underlying frame width. The rectangle left edge starts at
     * that position from the left edge of the frame. This field corresponds to tts:origin - X in
     * the TTML standard.
     */
    public fun leftOffset(leftOffset: Number) {
        cdkBuilder.leftOffset(leftOffset)
    }

    /**
     * @param topOffset See the description in leftOffset. For topOffset, specify the position of
     *   the top edge of the rectangle, as a percentage of the underlying frame height, and relative
     *   to the top edge of the frame. For example, "10" means the measurement is 10% of the
     *   underlying frame height. The rectangle top edge starts at that position from the top edge
     *   of the frame. This field corresponds to tts:origin - Y in the TTML standard.
     */
    public fun topOffset(topOffset: Number) {
        cdkBuilder.topOffset(topOffset)
    }

    /**
     * @param width See the description in leftOffset. For width, specify the entire width of the
     *   rectangle as a percentage of the underlying frame width. For example, "80" means the
     *   rectangle width is 80% of the underlying frame width. The leftOffset and rectangleWidth
     *   must add up to 100% or less. This field corresponds to tts:extent - X in the TTML standard.
     */
    public fun width(width: Number) {
        cdkBuilder.width(width)
    }

    public fun build(): CfnChannel.CaptionRectangleProperty = cdkBuilder.build()
}
