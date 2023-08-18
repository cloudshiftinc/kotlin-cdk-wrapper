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

package io.cloudshiftdev.awscdkdsl.services.ssm

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.services.ssm.CfnAssociation

/**
 * `Target` is a property of the
 * [AWS::SSM::Association](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-association.html)
 * resource that specifies the targets for an SSM document in Systems Manager . You can target all
 * instances in an AWS account by specifying the `InstanceIds` key with a value of `*` . To view a
 * JSON and a YAML example that targets all instances, see "Create an association for all managed
 * instances in an AWS account " on the Examples page.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.ssm.*;
 * TargetProperty targetProperty = TargetProperty.builder()
 * .key("key")
 * .values(List.of("values"))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssm-association-target.html)
 */
@CdkDslMarker
public class CfnAssociationTargetPropertyDsl {
    private val cdkBuilder: CfnAssociation.TargetProperty.Builder =
        CfnAssociation.TargetProperty.builder()

    private val _values: MutableList<String> = mutableListOf()

    /**
     * @param key User-defined criteria for sending commands that target managed nodes that meet the
     *   criteria.
     */
    public fun key(key: String) {
        cdkBuilder.key(key)
    }

    /**
     * @param values User-defined criteria that maps to `Key` . For example, if you specified
     *   `tag:ServerRole` , you could specify `value:WebServer` to run a command on instances that
     *   include EC2 tags of `ServerRole,WebServer` .
     *
     * Depending on the type of target, the maximum number of values for a key might be lower than
     * the global maximum of 50.
     */
    public fun values(vararg values: String) {
        _values.addAll(listOf(*values))
    }

    /**
     * @param values User-defined criteria that maps to `Key` . For example, if you specified
     *   `tag:ServerRole` , you could specify `value:WebServer` to run a command on instances that
     *   include EC2 tags of `ServerRole,WebServer` .
     *
     * Depending on the type of target, the maximum number of values for a key might be lower than
     * the global maximum of 50.
     */
    public fun values(values: Collection<String>) {
        _values.addAll(values)
    }

    public fun build(): CfnAssociation.TargetProperty {
        if (_values.isNotEmpty()) cdkBuilder.values(_values)
        return cdkBuilder.build()
    }
}
