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
import software.amazon.awscdk.services.connect.CfnPredefinedAttribute
import software.amazon.awscdk.services.connect.CfnPredefinedAttributeProps

/**
 * Properties for defining a `CfnPredefinedAttribute`.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.connect.*;
 * CfnPredefinedAttributeProps cfnPredefinedAttributeProps = CfnPredefinedAttributeProps.builder()
 * .instanceArn("instanceArn")
 * .name("name")
 * .values(ValuesProperty.builder()
 * .stringList(List.of("stringList"))
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-predefinedattribute.html)
 */
@CdkDslMarker
public class CfnPredefinedAttributePropsDsl {
    private val cdkBuilder: CfnPredefinedAttributeProps.Builder =
        CfnPredefinedAttributeProps.builder()

    /** @param instanceArn The Amazon Resource Name (ARN) of the instance. */
    public fun instanceArn(instanceArn: String) {
        cdkBuilder.instanceArn(instanceArn)
    }

    /** @param name The name of the predefined attribute. */
    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    /** @param values The values of a predefined attribute. */
    public fun values(values: IResolvable) {
        cdkBuilder.values(values)
    }

    /** @param values The values of a predefined attribute. */
    public fun values(values: CfnPredefinedAttribute.ValuesProperty) {
        cdkBuilder.values(values)
    }

    public fun build(): CfnPredefinedAttributeProps = cdkBuilder.build()
}
