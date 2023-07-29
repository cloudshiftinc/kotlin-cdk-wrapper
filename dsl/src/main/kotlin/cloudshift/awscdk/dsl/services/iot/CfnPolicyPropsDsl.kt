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

package cloudshift.awscdk.dsl.services.iot

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.common.MapBuilder
import kotlin.Any
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.iot.CfnPolicyProps

/**
 * Properties for defining a `CfnPolicy`.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.iot.*;
 * Object policyDocument;
 * CfnPolicyProps cfnPolicyProps = CfnPolicyProps.builder()
 * .policyDocument(policyDocument)
 * // the properties below are optional
 * .policyName("policyName")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-policy.html)
 */
@CdkDslMarker
public class CfnPolicyPropsDsl {
    private val cdkBuilder: CfnPolicyProps.Builder = CfnPolicyProps.builder()

    /** @param policyDocument The JSON document that describes the policy. */
    public fun policyDocument(policyDocument: MapBuilder.() -> Unit = {}) {
        val builder = MapBuilder()
        builder.apply(policyDocument)
        cdkBuilder.policyDocument(builder.map)
    }

    /** @param policyDocument The JSON document that describes the policy. */
    public fun policyDocument(policyDocument: Any) {
        cdkBuilder.policyDocument(policyDocument)
    }

    /** @param policyName The policy name. */
    public fun policyName(policyName: String) {
        cdkBuilder.policyName(policyName)
    }

    public fun build(): CfnPolicyProps = cdkBuilder.build()
}
