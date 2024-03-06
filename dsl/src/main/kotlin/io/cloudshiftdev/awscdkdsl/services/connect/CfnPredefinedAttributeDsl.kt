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
import software.constructs.Construct

/**
 * Textual or numeric value that describes an attribute.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.connect.*;
 * CfnPredefinedAttribute cfnPredefinedAttribute = CfnPredefinedAttribute.Builder.create(this,
 * "MyCfnPredefinedAttribute")
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
public class CfnPredefinedAttributeDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnPredefinedAttribute.Builder =
        CfnPredefinedAttribute.Builder.create(scope, id)

    /**
     * The Amazon Resource Name (ARN) of the instance.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-predefinedattribute.html#cfn-connect-predefinedattribute-instancearn)
     *
     * @param instanceArn The Amazon Resource Name (ARN) of the instance.
     */
    public fun instanceArn(instanceArn: String) {
        cdkBuilder.instanceArn(instanceArn)
    }

    /**
     * The name of the predefined attribute.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-predefinedattribute.html#cfn-connect-predefinedattribute-name)
     *
     * @param name The name of the predefined attribute.
     */
    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    /**
     * The values of a predefined attribute.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-predefinedattribute.html#cfn-connect-predefinedattribute-values)
     *
     * @param values The values of a predefined attribute.
     */
    public fun values(values: IResolvable) {
        cdkBuilder.values(values)
    }

    /**
     * The values of a predefined attribute.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-predefinedattribute.html#cfn-connect-predefinedattribute-values)
     *
     * @param values The values of a predefined attribute.
     */
    public fun values(values: CfnPredefinedAttribute.ValuesProperty) {
        cdkBuilder.values(values)
    }

    public fun build(): CfnPredefinedAttribute = cdkBuilder.build()
}
