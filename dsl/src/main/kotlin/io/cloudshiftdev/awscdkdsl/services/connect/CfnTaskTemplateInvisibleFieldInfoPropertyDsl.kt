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
 * A field that is invisible to an agent.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.connect.*;
 * InvisibleFieldInfoProperty invisibleFieldInfoProperty = InvisibleFieldInfoProperty.builder()
 * .id(FieldIdentifierProperty.builder()
 * .name("name")
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-connect-tasktemplate-invisiblefieldinfo.html)
 */
@CdkDslMarker
public class CfnTaskTemplateInvisibleFieldInfoPropertyDsl {
    private val cdkBuilder: CfnTaskTemplate.InvisibleFieldInfoProperty.Builder =
        CfnTaskTemplate.InvisibleFieldInfoProperty.builder()

    /** @param id Identifier of the invisible field. */
    public fun id(id: IResolvable) {
        cdkBuilder.id(id)
    }

    /** @param id Identifier of the invisible field. */
    public fun id(id: CfnTaskTemplate.FieldIdentifierProperty) {
        cdkBuilder.id(id)
    }

    public fun build(): CfnTaskTemplate.InvisibleFieldInfoProperty = cdkBuilder.build()
}
