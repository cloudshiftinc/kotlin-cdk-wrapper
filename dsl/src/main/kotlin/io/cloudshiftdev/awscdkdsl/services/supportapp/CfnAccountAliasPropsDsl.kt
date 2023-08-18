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

package io.cloudshiftdev.awscdkdsl.services.supportapp

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.supportapp.CfnAccountAliasProps

/**
 * Properties for defining a `CfnAccountAlias`.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.supportapp.*;
 * CfnAccountAliasProps cfnAccountAliasProps = CfnAccountAliasProps.builder()
 * .accountAlias("accountAlias")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-supportapp-accountalias.html)
 */
@CdkDslMarker
public class CfnAccountAliasPropsDsl {
    private val cdkBuilder: CfnAccountAliasProps.Builder = CfnAccountAliasProps.builder()

    /** @param accountAlias An alias or short name for an AWS account . */
    public fun accountAlias(accountAlias: String) {
        cdkBuilder.accountAlias(accountAlias)
    }

    public fun build(): CfnAccountAliasProps = cdkBuilder.build()
}
