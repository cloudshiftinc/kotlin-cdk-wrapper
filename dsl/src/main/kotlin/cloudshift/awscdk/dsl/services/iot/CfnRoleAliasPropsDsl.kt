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
import cloudshift.awscdk.dsl.CfnTagDsl
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.services.iot.CfnRoleAliasProps

/**
 * Properties for defining a `CfnRoleAlias`.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.iot.*;
 * CfnRoleAliasProps cfnRoleAliasProps = CfnRoleAliasProps.builder()
 * .roleArn("roleArn")
 * // the properties below are optional
 * .credentialDurationSeconds(123)
 * .roleAlias("roleAlias")
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-rolealias.html)
 */
@CdkDslMarker
public class CfnRoleAliasPropsDsl {
    private val cdkBuilder: CfnRoleAliasProps.Builder = CfnRoleAliasProps.builder()

    private val _tags: MutableList<CfnTag> = mutableListOf()

    /** @param credentialDurationSeconds The number of seconds for which the credential is valid. */
    public fun credentialDurationSeconds(credentialDurationSeconds: Number) {
        cdkBuilder.credentialDurationSeconds(credentialDurationSeconds)
    }

    /** @param roleAlias The role alias. */
    public fun roleAlias(roleAlias: String) {
        cdkBuilder.roleAlias(roleAlias)
    }

    /** @param roleArn The role ARN. */
    public fun roleArn(roleArn: String) {
        cdkBuilder.roleArn(roleArn)
    }

    /**
     * @param tags An array of key-value pairs to apply to this resource. For more information, see
     *   [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     *   .
     */
    public fun tags(tags: CfnTagDsl.() -> Unit) {
        _tags.add(CfnTagDsl().apply(tags).build())
    }

    /**
     * @param tags An array of key-value pairs to apply to this resource. For more information, see
     *   [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     *   .
     */
    public fun tags(tags: Collection<CfnTag>) {
        _tags.addAll(tags)
    }

    public fun build(): CfnRoleAliasProps {
        if (_tags.isNotEmpty()) cdkBuilder.tags(_tags)
        return cdkBuilder.build()
    }
}
