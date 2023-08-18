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

package io.cloudshiftdev.awscdkdsl.services.connect

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.connect.CfnTaskTemplate

/**
 * Information about a required field.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.connect.*;
 * RequiredFieldInfoProperty requiredFieldInfoProperty = RequiredFieldInfoProperty.builder()
 * .id(FieldIdentifierProperty.builder()
 * .name("name")
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-connect-tasktemplate-requiredfieldinfo.html)
 */
@CdkDslMarker
public class CfnTaskTemplateRequiredFieldInfoPropertyDsl {
    private val cdkBuilder: CfnTaskTemplate.RequiredFieldInfoProperty.Builder =
        CfnTaskTemplate.RequiredFieldInfoProperty.builder()

    /** @param id The unique identifier for the field. */
    public fun id(id: IResolvable) {
        cdkBuilder.id(id)
    }

    /** @param id The unique identifier for the field. */
    public fun id(id: CfnTaskTemplate.FieldIdentifierProperty) {
        cdkBuilder.id(id)
    }

    public fun build(): CfnTaskTemplate.RequiredFieldInfoProperty = cdkBuilder.build()
}
