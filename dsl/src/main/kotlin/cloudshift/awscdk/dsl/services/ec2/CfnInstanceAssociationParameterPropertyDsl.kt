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

package cloudshift.awscdk.dsl.services.ec2

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.services.ec2.CfnInstance

/**
 * Specifies input parameter values for an SSM document in AWS Systems Manager .
 *
 * `AssociationParameter` is a property of the
 * [Amazon EC2 Instance SsmAssociation](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-instance-ssmassociations.html)
 * property.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.ec2.*;
 * AssociationParameterProperty associationParameterProperty =
 * AssociationParameterProperty.builder()
 * .key("key")
 * .value(List.of("value"))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-instance-associationparameter.html)
 */
@CdkDslMarker
public class CfnInstanceAssociationParameterPropertyDsl {
    private val cdkBuilder: CfnInstance.AssociationParameterProperty.Builder =
        CfnInstance.AssociationParameterProperty.builder()

    private val _value: MutableList<String> = mutableListOf()

    /** @param key The name of an input parameter that is in the associated SSM document. */
    public fun key(key: String) {
        cdkBuilder.key(key)
    }

    /** @param value The value of an input parameter. */
    public fun `value`(vararg `value`: String) {
        _value.addAll(listOf(*`value`))
    }

    /** @param value The value of an input parameter. */
    public fun `value`(`value`: Collection<String>) {
        _value.addAll(`value`)
    }

    public fun build(): CfnInstance.AssociationParameterProperty {
        if (_value.isNotEmpty()) cdkBuilder.`value`(_value)
        return cdkBuilder.build()
    }
}
