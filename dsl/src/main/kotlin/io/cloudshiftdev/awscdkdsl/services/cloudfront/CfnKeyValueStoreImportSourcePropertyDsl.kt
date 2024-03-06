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
import software.amazon.awscdk.services.cloudfront.CfnKeyValueStore

/**
 * The import source for the key value store.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.cloudfront.*;
 * ImportSourceProperty importSourceProperty = ImportSourceProperty.builder()
 * .sourceArn("sourceArn")
 * .sourceType("sourceType")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-keyvaluestore-importsource.html)
 */
@CdkDslMarker
public class CfnKeyValueStoreImportSourcePropertyDsl {
    private val cdkBuilder: CfnKeyValueStore.ImportSourceProperty.Builder =
        CfnKeyValueStore.ImportSourceProperty.builder()

    /**
     * @param sourceArn The Amazon Resource Name (ARN) of the import source for the key value store.
     */
    public fun sourceArn(sourceArn: String) {
        cdkBuilder.sourceArn(sourceArn)
    }

    /** @param sourceType The source type of the import source for the key value store. */
    public fun sourceType(sourceType: String) {
        cdkBuilder.sourceType(sourceType)
    }

    public fun build(): CfnKeyValueStore.ImportSourceProperty = cdkBuilder.build()
}
