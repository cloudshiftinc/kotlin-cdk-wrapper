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
import software.amazon.awscdk.services.healthimaging.CfnDatastore
import software.constructs.Construct

/**
 * Create a data store.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.healthimaging.*;
 * CfnDatastore cfnDatastore = CfnDatastore.Builder.create(this, "MyCfnDatastore")
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
public class CfnDatastoreDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnDatastore.Builder = CfnDatastore.Builder.create(scope, id)

    /**
     * The data store name.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-healthimaging-datastore.html#cfn-healthimaging-datastore-datastorename)
     *
     * @param datastoreName The data store name.
     */
    public fun datastoreName(datastoreName: String) {
        cdkBuilder.datastoreName(datastoreName)
    }

    /**
     * The Amazon Resource Name (ARN) assigned to the Key Management Service (KMS) key for accessing
     * encrypted data.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-healthimaging-datastore.html#cfn-healthimaging-datastore-kmskeyarn)
     *
     * @param kmsKeyArn The Amazon Resource Name (ARN) assigned to the Key Management Service (KMS)
     *   key for accessing encrypted data.
     */
    public fun kmsKeyArn(kmsKeyArn: String) {
        cdkBuilder.kmsKeyArn(kmsKeyArn)
    }

    /**
     * The tags provided when creating a data store.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-healthimaging-datastore.html#cfn-healthimaging-datastore-tags)
     *
     * @param tags The tags provided when creating a data store.
     */
    public fun tags(tags: Map<String, String>) {
        cdkBuilder.tags(tags)
    }

    public fun build(): CfnDatastore = cdkBuilder.build()
}
