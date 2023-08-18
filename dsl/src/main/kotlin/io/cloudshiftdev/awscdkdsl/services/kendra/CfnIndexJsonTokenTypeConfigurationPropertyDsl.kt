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

package io.cloudshiftdev.awscdkdsl.services.kendra

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.kendra.CfnIndex

/**
 * Provides the configuration information for the JSON token type.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.kendra.*;
 * JsonTokenTypeConfigurationProperty jsonTokenTypeConfigurationProperty =
 * JsonTokenTypeConfigurationProperty.builder()
 * .groupAttributeField("groupAttributeField")
 * .userNameAttributeField("userNameAttributeField")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kendra-index-jsontokentypeconfiguration.html)
 */
@CdkDslMarker
public class CfnIndexJsonTokenTypeConfigurationPropertyDsl {
    private val cdkBuilder: CfnIndex.JsonTokenTypeConfigurationProperty.Builder =
        CfnIndex.JsonTokenTypeConfigurationProperty.builder()

    /** @param groupAttributeField The group attribute field. */
    public fun groupAttributeField(groupAttributeField: String) {
        cdkBuilder.groupAttributeField(groupAttributeField)
    }

    /** @param userNameAttributeField The user name attribute field. */
    public fun userNameAttributeField(userNameAttributeField: String) {
        cdkBuilder.userNameAttributeField(userNameAttributeField)
    }

    public fun build(): CfnIndex.JsonTokenTypeConfigurationProperty = cdkBuilder.build()
}
