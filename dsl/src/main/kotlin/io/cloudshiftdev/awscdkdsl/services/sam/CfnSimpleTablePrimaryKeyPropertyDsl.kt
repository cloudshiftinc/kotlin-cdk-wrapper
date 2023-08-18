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

package io.cloudshiftdev.awscdkdsl.services.sam

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.sam.CfnSimpleTable

/**
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.sam.*;
 * PrimaryKeyProperty primaryKeyProperty = PrimaryKeyProperty.builder()
 * .type("type")
 * // the properties below are optional
 * .name("name")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-serverless-simpletable-primarykey.html)
 */
@CdkDslMarker
public class CfnSimpleTablePrimaryKeyPropertyDsl {
    private val cdkBuilder: CfnSimpleTable.PrimaryKeyProperty.Builder =
        CfnSimpleTable.PrimaryKeyProperty.builder()

    /** @param name the value to be set. */
    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    /** @param type the value to be set. */
    public fun type(type: String) {
        cdkBuilder.type(type)
    }

    public fun build(): CfnSimpleTable.PrimaryKeyProperty = cdkBuilder.build()
}
