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

package cloudshift.awscdk.dsl.services.nimblestudio

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.nimblestudio.CfnStudioComponent

/**
 * A parameter for a studio component script, in the form of a key-value pair.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.nimblestudio.*;
 * ScriptParameterKeyValueProperty scriptParameterKeyValueProperty =
 * ScriptParameterKeyValueProperty.builder()
 * .key("key")
 * .value("value")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-nimblestudio-studiocomponent-scriptparameterkeyvalue.html)
 */
@CdkDslMarker
public class CfnStudioComponentScriptParameterKeyValuePropertyDsl {
    private val cdkBuilder: CfnStudioComponent.ScriptParameterKeyValueProperty.Builder =
        CfnStudioComponent.ScriptParameterKeyValueProperty.builder()

    /** @param key A script parameter key. */
    public fun key(key: String) {
        cdkBuilder.key(key)
    }

    /** @param value A script parameter value. */
    public fun `value`(`value`: String) {
        cdkBuilder.`value`(`value`)
    }

    public fun build(): CfnStudioComponent.ScriptParameterKeyValueProperty = cdkBuilder.build()
}
