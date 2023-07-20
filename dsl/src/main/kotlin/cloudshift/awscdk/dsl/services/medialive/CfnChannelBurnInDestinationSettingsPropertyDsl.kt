@file:Suppress(
    "RedundantVisibilityModifier",
    "RedundantUnitReturnType",
    "RemoveRedundantQualifierName",
    "unused",
    "UnusedImport",
    "ClassName",
    "REDUNDANT_PROJECTION",
    "DEPRECATION",
)

package cloudshift.awscdk.dsl.services.medialive

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.medialive.CfnChannel
import kotlin.Number
import kotlin.String

@CdkDslMarker
public class CfnChannelBurnInDestinationSettingsPropertyDsl {
    private val cdkBuilder: CfnChannel.BurnInDestinationSettingsProperty.Builder =
        CfnChannel.BurnInDestinationSettingsProperty.builder()

    public fun alignment(alignment: String) {
        cdkBuilder.alignment(alignment)
    }

    public fun backgroundColor(backgroundColor: String) {
        cdkBuilder.backgroundColor(backgroundColor)
    }

    public fun backgroundOpacity(backgroundOpacity: Number) {
        cdkBuilder.backgroundOpacity(backgroundOpacity)
    }

    public fun font(font: IResolvable) {
        cdkBuilder.font(font)
    }

    public fun font(font: CfnChannel.InputLocationProperty) {
        cdkBuilder.font(font)
    }

    public fun fontColor(fontColor: String) {
        cdkBuilder.fontColor(fontColor)
    }

    public fun fontOpacity(fontOpacity: Number) {
        cdkBuilder.fontOpacity(fontOpacity)
    }

    public fun fontResolution(fontResolution: Number) {
        cdkBuilder.fontResolution(fontResolution)
    }

    public fun fontSize(fontSize: String) {
        cdkBuilder.fontSize(fontSize)
    }

    public fun outlineColor(outlineColor: String) {
        cdkBuilder.outlineColor(outlineColor)
    }

    public fun outlineSize(outlineSize: Number) {
        cdkBuilder.outlineSize(outlineSize)
    }

    public fun shadowColor(shadowColor: String) {
        cdkBuilder.shadowColor(shadowColor)
    }

    public fun shadowOpacity(shadowOpacity: Number) {
        cdkBuilder.shadowOpacity(shadowOpacity)
    }

    public fun shadowXOffset(shadowXOffset: Number) {
        cdkBuilder.shadowXOffset(shadowXOffset)
    }

    public fun shadowYOffset(shadowYOffset: Number) {
        cdkBuilder.shadowYOffset(shadowYOffset)
    }

    public fun teletextGridControl(teletextGridControl: String) {
        cdkBuilder.teletextGridControl(teletextGridControl)
    }

    public fun xPosition(xPosition: Number) {
        cdkBuilder.xPosition(xPosition)
    }

    public fun yPosition(yPosition: Number) {
        cdkBuilder.yPosition(yPosition)
    }

    public fun build(): CfnChannel.BurnInDestinationSettingsProperty = cdkBuilder.build()
}
