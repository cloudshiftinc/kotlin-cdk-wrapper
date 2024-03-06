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

import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.healthimaging.CfnDatastore
import software.amazon.awscdk.services.healthimaging.CfnDatastoreProps
import software.constructs.Construct

public object healthimaging {
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
    public inline fun cfnDatastore(
        scope: Construct,
        id: String,
        block: CfnDatastoreDsl.() -> Unit = {},
    ): CfnDatastore {
        val builder = CfnDatastoreDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

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
    public inline fun cfnDatastoreProps(
        block: CfnDatastorePropsDsl.() -> Unit = {}
    ): CfnDatastoreProps {
        val builder = CfnDatastorePropsDsl()
        builder.apply(block)
        return builder.build()
    }
}
