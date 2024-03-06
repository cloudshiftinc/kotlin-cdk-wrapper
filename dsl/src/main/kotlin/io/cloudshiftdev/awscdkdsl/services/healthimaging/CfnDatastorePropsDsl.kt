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

package io.cloudshiftdev.awscdkdsl.services.healthimaging

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import kotlin.collections.Map
import software.amazon.awscdk.services.healthimaging.CfnDatastoreProps

/**
 * Properties for defining a `CfnDatastore`.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.healthimaging.*;
 * CfnDatastoreProps cfnDatastoreProps = CfnDatastoreProps.builder()
 * .datastoreName("datastoreName")
 * .kmsKeyArn("kmsKeyArn")
 * .tags(Map.of(
 * "tagsKey", "tags"))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-healthimaging-datastore.html)
 */
@CdkDslMarker
public class CfnDatastorePropsDsl {
    private val cdkBuilder: CfnDatastoreProps.Builder = CfnDatastoreProps.builder()

    /** @param datastoreName The data store name. */
    public fun datastoreName(datastoreName: String) {
        cdkBuilder.datastoreName(datastoreName)
    }

    /**
     * @param kmsKeyArn The Amazon Resource Name (ARN) assigned to the Key Management Service (KMS)
     *   key for accessing encrypted data.
     */
    public fun kmsKeyArn(kmsKeyArn: String) {
        cdkBuilder.kmsKeyArn(kmsKeyArn)
    }

    /** @param tags The tags provided when creating a data store. */
    public fun tags(tags: Map<String, String>) {
        cdkBuilder.tags(tags)
    }

    public fun build(): CfnDatastoreProps = cdkBuilder.build()
}
