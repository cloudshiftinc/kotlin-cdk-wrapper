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
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.cloudfront.CfnKeyValueStore
import software.amazon.awscdk.services.cloudfront.CfnKeyValueStoreProps

/**
 * Properties for defining a `CfnKeyValueStore`.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.cloudfront.*;
 * CfnKeyValueStoreProps cfnKeyValueStoreProps = CfnKeyValueStoreProps.builder()
 * .name("name")
 * // the properties below are optional
 * .comment("comment")
 * .importSource(ImportSourceProperty.builder()
 * .sourceArn("sourceArn")
 * .sourceType("sourceType")
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudfront-keyvaluestore.html)
 */
@CdkDslMarker
public class CfnKeyValueStorePropsDsl {
    private val cdkBuilder: CfnKeyValueStoreProps.Builder = CfnKeyValueStoreProps.builder()

    /** @param comment A comment for the key value store. */
    public fun comment(comment: String) {
        cdkBuilder.comment(comment)
    }

    /** @param importSource The import source for the key value store. */
    public fun importSource(importSource: IResolvable) {
        cdkBuilder.importSource(importSource)
    }

    /** @param importSource The import source for the key value store. */
    public fun importSource(importSource: CfnKeyValueStore.ImportSourceProperty) {
        cdkBuilder.importSource(importSource)
    }

    /** @param name The name of the key value store. */
    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    public fun build(): CfnKeyValueStoreProps = cdkBuilder.build()
}
