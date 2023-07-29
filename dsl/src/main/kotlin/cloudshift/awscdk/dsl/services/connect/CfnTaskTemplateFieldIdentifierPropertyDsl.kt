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

package cloudshift.awscdk.dsl.services.connect

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.connect.CfnTaskTemplate

/**
 * The identifier of the task template field.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.connect.*;
 * FieldIdentifierProperty fieldIdentifierProperty = FieldIdentifierProperty.builder()
 * .name("name")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-connect-tasktemplate-fieldidentifier.html)
 */
@CdkDslMarker
public class CfnTaskTemplateFieldIdentifierPropertyDsl {
    private val cdkBuilder: CfnTaskTemplate.FieldIdentifierProperty.Builder =
        CfnTaskTemplate.FieldIdentifierProperty.builder()

    /** @param name The name of the task template field. */
    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    public fun build(): CfnTaskTemplate.FieldIdentifierProperty = cdkBuilder.build()
}
