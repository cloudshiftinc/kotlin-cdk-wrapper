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

package io.cloudshiftdev.awscdkdsl.services.cloudfront

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.cloudfront.CfnKeyGroup
import software.amazon.awscdk.services.cloudfront.CfnKeyGroupProps

/**
 * Properties for defining a `CfnKeyGroup`.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.cloudfront.*;
 * CfnKeyGroupProps cfnKeyGroupProps = CfnKeyGroupProps.builder()
 * .keyGroupConfig(KeyGroupConfigProperty.builder()
 * .items(List.of("items"))
 * .name("name")
 * // the properties below are optional
 * .comment("comment")
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudfront-keygroup.html)
 */
@CdkDslMarker
public class CfnKeyGroupPropsDsl {
    private val cdkBuilder: CfnKeyGroupProps.Builder = CfnKeyGroupProps.builder()

    /** @param keyGroupConfig The key group configuration. */
    public fun keyGroupConfig(keyGroupConfig: IResolvable) {
        cdkBuilder.keyGroupConfig(keyGroupConfig)
    }

    /** @param keyGroupConfig The key group configuration. */
    public fun keyGroupConfig(keyGroupConfig: CfnKeyGroup.KeyGroupConfigProperty) {
        cdkBuilder.keyGroupConfig(keyGroupConfig)
    }

    public fun build(): CfnKeyGroupProps = cdkBuilder.build()
}
