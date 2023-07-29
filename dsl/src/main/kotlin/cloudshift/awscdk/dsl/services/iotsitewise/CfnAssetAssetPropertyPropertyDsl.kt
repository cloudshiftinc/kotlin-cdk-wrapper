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

package cloudshift.awscdk.dsl.services.iotsitewise

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.iotsitewise.CfnAsset

/**
 * Contains asset property information.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.iotsitewise.*;
 * AssetPropertyProperty assetPropertyProperty = AssetPropertyProperty.builder()
 * .logicalId("logicalId")
 * // the properties below are optional
 * .alias("alias")
 * .notificationState("notificationState")
 * .unit("unit")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotsitewise-asset-assetproperty.html)
 */
@CdkDslMarker
public class CfnAssetAssetPropertyPropertyDsl {
    private val cdkBuilder: CfnAsset.AssetPropertyProperty.Builder =
        CfnAsset.AssetPropertyProperty.builder()

    /**
     * @param alias The property alias that identifies the property, such as an OPC-UA server data
     *   stream path (for example, `/company/windfarm/3/turbine/7/temperature` ). For more
     *   information, see
     *   [Mapping industrial data streams to asset properties](https://docs.aws.amazon.com/iot-sitewise/latest/userguide/connect-data-streams.html)
     *   in the *AWS IoT SiteWise User Guide* .
     *
     * The property alias must have 1-1000 characters.
     */
    public fun alias(alias: String) {
        cdkBuilder.alias(alias)
    }

    /**
     * @param logicalId The `LogicalID` of the asset property. The maximum length is 256 characters,
     *   with the pattern `[^\u0000-\u001F\u007F]+` .
     */
    public fun logicalId(logicalId: String) {
        cdkBuilder.logicalId(logicalId)
    }

    /**
     * @param notificationState The MQTT notification state ( `ENABLED` or `DISABLED` ) for this
     *   asset property. When the notification state is `ENABLED` , AWS IoT SiteWise publishes
     *   property value updates to a unique MQTT topic. For more information, see
     *   [Interacting with other services](https://docs.aws.amazon.com/iot-sitewise/latest/userguide/interact-with-other-services.html)
     *   in the *AWS IoT SiteWise User Guide* .
     *
     * If you omit this parameter, the notification state is set to `DISABLED` .
     *
     * You must use all caps for the NotificationState parameter. If you use lower case letters, you
     * will receive a schema validation error.
     */
    public fun notificationState(notificationState: String) {
        cdkBuilder.notificationState(notificationState)
    }

    /** @param unit The unit (such as `Newtons` or `RPM` ) of the asset property. */
    public fun unit(unit: String) {
        cdkBuilder.unit(unit)
    }

    public fun build(): CfnAsset.AssetPropertyProperty = cdkBuilder.build()
}
