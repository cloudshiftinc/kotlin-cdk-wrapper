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

package cloudshift.awscdk.dsl.services.lightsail

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import software.amazon.awscdk.services.lightsail.CfnInstance

/**
 * `State` is a property of the
 * [AWS::Lightsail::Instance](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lightsail-instance.html)
 * resource. It describes the status code and the state (for example, `running` ) of an instance.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.lightsail.*;
 * StateProperty stateProperty = StateProperty.builder()
 * .code(123)
 * .name("name")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lightsail-instance-state.html)
 */
@CdkDslMarker
public class CfnInstanceStatePropertyDsl {
    private val cdkBuilder: CfnInstance.StateProperty.Builder = CfnInstance.StateProperty.builder()

    /** @param code The status code of the instance. */
    public fun code(code: Number) {
        cdkBuilder.code(code)
    }

    /** @param name The state of the instance (for example, `running` or `pending` ). */
    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    public fun build(): CfnInstance.StateProperty = cdkBuilder.build()
}
