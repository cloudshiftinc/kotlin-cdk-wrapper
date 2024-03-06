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
import kotlin.String
import software.amazon.awscdk.services.cloudfront.CfnFunction

/**
 * The key value store association.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.cloudfront.*;
 * KeyValueStoreAssociationProperty keyValueStoreAssociationProperty =
 * KeyValueStoreAssociationProperty.builder()
 * .keyValueStoreArn("keyValueStoreArn")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-function-keyvaluestoreassociation.html)
 */
@CdkDslMarker
public class CfnFunctionKeyValueStoreAssociationPropertyDsl {
    private val cdkBuilder: CfnFunction.KeyValueStoreAssociationProperty.Builder =
        CfnFunction.KeyValueStoreAssociationProperty.builder()

    /**
     * @param keyValueStoreArn The Amazon Resource Name (ARN) of the key value store association.
     */
    public fun keyValueStoreArn(keyValueStoreArn: String) {
        cdkBuilder.keyValueStoreArn(keyValueStoreArn)
    }

    public fun build(): CfnFunction.KeyValueStoreAssociationProperty = cdkBuilder.build()
}
