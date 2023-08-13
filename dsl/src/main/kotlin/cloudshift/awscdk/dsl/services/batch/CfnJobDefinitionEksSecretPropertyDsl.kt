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

package cloudshift.awscdk.dsl.services.batch

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.batch.CfnJobDefinition

/**
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.batch.*;
 * EksSecretProperty eksSecretProperty = EksSecretProperty.builder()
 * .secretName("secretName")
 * // the properties below are optional
 * .optional(false)
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-jobdefinition-ekssecret.html)
 */
@CdkDslMarker
public class CfnJobDefinitionEksSecretPropertyDsl {
    private val cdkBuilder: CfnJobDefinition.EksSecretProperty.Builder =
        CfnJobDefinition.EksSecretProperty.builder()

    /** @param optional the value to be set. */
    public fun optional(optional: Boolean) {
        cdkBuilder.optional(optional)
    }

    /** @param optional the value to be set. */
    public fun optional(optional: IResolvable) {
        cdkBuilder.optional(optional)
    }

    /** @param secretName the value to be set. */
    public fun secretName(secretName: String) {
        cdkBuilder.secretName(secretName)
    }

    public fun build(): CfnJobDefinition.EksSecretProperty = cdkBuilder.build()
}
