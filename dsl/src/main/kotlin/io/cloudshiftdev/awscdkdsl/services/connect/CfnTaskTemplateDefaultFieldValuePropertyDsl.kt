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
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.connect.CfnTaskTemplate

/**
 * Describes a default field and its corresponding value.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.connect.*;
 * DefaultFieldValueProperty defaultFieldValueProperty = DefaultFieldValueProperty.builder()
 * .defaultValue("defaultValue")
 * .id(FieldIdentifierProperty.builder()
 * .name("name")
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-connect-tasktemplate-defaultfieldvalue.html)
 */
@CdkDslMarker
public class CfnTaskTemplateDefaultFieldValuePropertyDsl {
    private val cdkBuilder: CfnTaskTemplate.DefaultFieldValueProperty.Builder =
        CfnTaskTemplate.DefaultFieldValueProperty.builder()

    /** @param defaultValue Default value for the field. */
    public fun defaultValue(defaultValue: String) {
        cdkBuilder.defaultValue(defaultValue)
    }

    /** @param id Identifier of a field. */
    public fun id(id: IResolvable) {
        cdkBuilder.id(id)
    }

    /** @param id Identifier of a field. */
    public fun id(id: CfnTaskTemplate.FieldIdentifierProperty) {
        cdkBuilder.id(id)
    }

    public fun build(): CfnTaskTemplate.DefaultFieldValueProperty = cdkBuilder.build()
}
